# Usage

- Download [charles.jar](charles.jar), replace the official `charles.jar`.
- **Or**
- Hack with the below script by yourself.

# Hack Script

```
export JAVA_HOME=`/usr/libexec/java_home -v 1.8`
charles=/Applications/Charles.app/Contents/Java/charles.jar
dir=charleshack

mkdir $dir
cd $dir
cat >> kKPk.java <<EOF
package com.xk72.charles;
public final class kKPk {
public static boolean lcJx() { return true; }
	public static boolean yNVB() { return true; }
	public static String dGDk() { return "Administrator"; }
	public static String JZlU() { return "Administrator"; }
	public static String lcJx(String name, String key) { return null; }
}
EOF
javac -encoding UTF-8 kKPk.java -d .&& jar -uvf $charles com/xk72/charles/kKPk.class
cd .. && rm -rf $dir
```

# Official Download Link

- [Windows 64 bit](https://www.charlesproxy.com/assets/release/4.2.7/charles-proxy-4.2.7-win64.msi)
- [Windows 32 bit](https://www.charlesproxy.com/assets/release/4.2.7/charles-proxy-4.2.7-win32.msi)
- [macOS](https://www.charlesproxy.com/assets/release/4.2.7/charles-proxy-4.2.7.dmg)
- [Linux 64/32 bit](https://www.charlesproxy.com/assets/release/4.2.7/charles-proxy-4.2.7.tar.gz)

Credit: 

<a href="https://github.com/Heip">
<img border="0" alt="Help" src="https://avatars3.githubusercontent.com/u/31706214?s=460&v=4" width="100" height="100">

