# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Purpose

This repository contains patches for [Charles Web Debugging Proxy](https://www.charlesproxy.com/) that bypass the license-check mechanism. Each versioned subdirectory (e.g. `4.2.7/`) contains:
- A `charles.jar` – the pre-patched drop-in replacement for Charles's own JAR
- A `README.md` – the manual hack script for that version

## How the Hack Works

Charles embeds a single obfuscated license-gate class (e.g. `GPSz`, `slZe`, `WNzU`, `oFTR`, `Dheu`) inside `charles.jar` under `com/xk72/charles/`. Each version uses a **different** class name and method signatures, but the interface is always the same:

| Return type | Purpose | Patched return value |
|-------------|---------|----------------------|
| `boolean`   | Is licensed / is trial expired? | `true` |
| `String`    | Registered name / organization | `"Administrator"` or a URL |
| `String(String name, String key)` | Validate a registration key | `null` (disables key checks) |

The patch replaces this class inside the official JAR using `javac` + `jar -uvf`.

## Adding Support for a New Charles Version

1. **Identify the license class name** for the target version by decompiling `charles.jar` (e.g. with `jadx` or `cfr`) and finding the class in `com.xk72.charles` that has the boolean/String method pattern above.

2. **Create the version directory** and write the hack script following the pattern in any existing `README.md`. Key variables to update: class name, method names, the version number in the download links.

3. **Compile and patch** (Java 1.8 required for 4.2.6+):
   ```bash
   export JAVA_HOME=`/usr/libexec/java_home -v 1.8`   # macOS; skip on Linux if java 8 is default
   charles=/Applications/Charles.app/Contents/Java/charles.jar
   dir=charleshack

   mkdir $dir && cd $dir
   # Write <ClassName>.java with the patched class (see README for template)
   javac -encoding UTF-8 <ClassName>.java -d .
   jar -uvf $charles com/xk72/charles/<ClassName>.class
   cd .. && rm -rf $dir
   ```

4. **Commit the patched JAR** to the new version directory. The `.gitignore` excludes `*.class` files, so only the final `.jar` should be committed.

## Repository Conventions

- **One directory per Charles version** – named exactly after the version string (e.g. `4.2.7`).
- Every version directory must contain both `charles.jar` and `README.md`.
- The root `README.md` lists supported versions; update it when adding a new one.
- Java `.class` files are gitignored; never commit them.
- 4.2.6 and later require the `JAVA_HOME` export to target Java 1.8 before running `javac`; earlier versions do not need this.
