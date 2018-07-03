# Usage

- Download [charles.jar](charles.jar), replace the official `charles.jar`.
- **Or**
- Hack with the below script by yourself.

# Hack Script

```
charles=/Applications/Charles.app/Contents/Java/charles.jar
dir=charleshack

mkdir $dir
cd $dir
cat >> oFTR.java <<EOF
package com.xk72.charles;
public final class oFTR {
	public static boolean Yuaz() { return true; }
	public static String lktV() { return "Administrator"; }
	public static String Yuaz(String name, String key) { return null; }
}
EOF
javac -encoding UTF-8 oFTR.java -d .&& jar -uvf $charles com/xk72/charles/oFTR.class
cd .. && rm -rf $dir
```

# Official Download Link

- [Windows 64 bit](https://www.charlesproxy.com/assets/release/4.2.1/charles-proxy-4.2.1-win64.msi)
- [Windows 32 bit](https://www.charlesproxy.com/assets/release/4.2.1/charles-proxy-4.2.1-win32.msi)
- [macOS](https://www.charlesproxy.com/assets/release/4.2.1/charles-proxy-4.2.1.dmg)
- [Linux 64/32 bit](https://www.charlesproxy.com/assets/release/4.2.1/charles-proxy-4.2.1.tar.gz)

