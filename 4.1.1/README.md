# Usage

- Download [charles.jar](charles.jar), replase the official `charles.jar`.
- **Or**
- Hack with the below script by yourself.

# Hack Script

by [#7](https://github.com/100apps/charles-hacking/pull/7), thanks to [@ltjin](https://github.com/ltjin).

```
charles=/Applications/Charles.app/Contents/Java/charles.jar
dir=charleshack

mkdir $dir
cd $dir
cat >> slZe.java <<EOF
package com.xk72.charles;
public final class slZe {
	public static boolean RrCt() { return true; }
	public static String Vvni() { return "http://www.gfzj.us"; }
	public static String RrCt(String name, String key) { return null; }
}
EOF
javac -encoding UTF-8 slZe.java -d .&& jar -uvf $charles com/xk72/charles/slZe.class
cd .. && rm -rf $dir

```

# Official Download Link

- [Windows 64 bit](https://www.charlesproxy.com/assets/release/4.1.1/charles-proxy-4.1.1-win64.msi)
- [Windows 32 bit](https://www.charlesproxy.com/assets/release/4.1.1/charles-proxy-4.1.1-win32.msi)
- [macOS](https://www.charlesproxy.com/assets/release/4.1.1/charles-proxy-4.1.1.dmg)
- [Linux 64/32 bit](https://www.charlesproxy.com/assets/release/4.1.1/charles-proxy-4.1.1.tar.gz)

