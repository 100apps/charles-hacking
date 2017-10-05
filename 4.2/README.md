# Usage

- Download [charles.jar](charles.jar), replase the official `charles.jar`.
- **Or**
- Hack with the below script by yourself.

# Hack Script

by [#15](#15)

```
charles=/Applications/Charles.app/Contents/Java/charles.jar
dir=charleshack

mkdir $dir
cd $dir
cat >> WNzU.java <<EOF
package com.xk72.charles;
public final class WNzU {
	public static boolean OjEP() { return true; }
	public static String DZZn() { return "http://www.gfzj.us"; }
	public static String OjEP(String name, String key) { return null; }
}
EOF
javac -encoding UTF-8 WNzU.java -d .&& jar -uvf $charles com/xk72/charles/WNzU.class
cd .. && rm -rf $dir
```

# Official Download Link

- [Windows 64 bit](https://www.charlesproxy.com/assets/release/4.2/charles-proxy-4.2-win64.msi)
- [Windows 32 bit](https://www.charlesproxy.com/assets/release/4.2/charles-proxy-4.2-win32.msi)
- [macOS](https://www.charlesproxy.com/assets/release/4.2/charles-proxy-4.2.dmg)
- [Linux 64/32 bit](https://www.charlesproxy.com/assets/release/4.2/charles-proxy-4.2.tar.gz)

