# Usage

- Download [charles.jar](charles.jar), replace the official `charles.jar`.
- **Or**
- Hack with the below script by yourself.

# Hack Script

by [#16](https://github.com/100apps/charles-hacking/pull/16), thanks to [@HeIp](https://github.com/HeIp)

```
charles=/Applications/Charles.app/Contents/Java/charles.jar
dir=charleshack

mkdir $dir
cd $dir
cat >> cksjPRXyaTFQ.java <<EOF
package com.xk72.charles;
public final class cksjPRXyaTFQ {
	public static boolean PRXy() { return true; }
	public static String aTFQ() { return "http://www.gfzj.us"; }
	public static String PRXy(String name, String key) { return null; }
}
EOF
javac -encoding UTF-8 cksjPRXyaTFQ.java -d .&& jar -uvf $charles com/xk72/charles/cksjPRXyaTFQ.class
cd .. && rm -rf $dir
```

# Official Download Link

- [Windows 64 bit](https://www.charlesproxy.com/assets/release/4.5/charles-proxy-4.5-win64.msi)
- [Windows 32 bit](https://www.charlesproxy.com/assets/release/4.5/charles-proxy-4.5-win32.msi)
- [macOS](https://www.charlesproxy.com/assets/release/4.5/charles-proxy-4.5.dmg)
- [Linux 64/32 bit](https://www.charlesproxy.com/assets/release/4.5/charles-proxy-4.5.tar.gz)

