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
cat >> YQUd.java <<EOF
package com.xk72.charles;
public final class YQUd {
    public static boolean tEdg() { return true; }
    public static boolean Rarr() { return true; }
    public static String NCuT() { return "Administrator"; }
    public static String RjRQ() { return "Administrator"; }
    public static String tEdg(String name, String key) { return null; }
}
EOF
javac -encoding UTF-8 YQUd.java -d .&& jar -uvf $charles com/xk72/charles/YQUd.class
cd .. && rm -rf $dir
```

# Official Download Link

- [Windows 64 bit](https://www.charlesproxy.com/assets/release/4.5.1/charles-proxy-4.5.1-win64.msi)
- [macOS](https://www.charlesproxy.com/assets/release/4.5.1/charles-proxy-4.5.1.dmg)
- [Linux 64 bit](https://www.charlesproxy.com/assets/release/4.5.1/charles-proxy-4.5.1_amd64.tar.gz)

