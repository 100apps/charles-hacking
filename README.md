Hacking Charles Web Debugging Proxy

<http://www.gfzj.us/tech/2015/06/24/charles-hacking.html>

# WARNING

This version is only for charles v4.0. you can download it from: <https://www.charlesproxy.com/download/>, install as usual and replace *charles.jar* with the one in this repository.

# MORE

If you're using other version, like v4.0.1 or above, you can hack it by yourself:

```bash

charles=/Applications/Charles.app/Contents/Java/charles.jar
dir=charleshack

mkdir $dir
cd $dir
cat >> License.java <<EOF
package com.xk72.charles;
public final class License {
	public static boolean a() { return true; }
	public static String b() { return "http://www.gfzj.us"; }
	public static String a(String name, String key) { return null; }
}
EOF
javac -encoding UTF-8 License.java -d .&& jar -uvf $charles com/xk72/charles/License.class
cd .. && rm -rf $dir

```

### for v4.x
replace *charles.jar* with *charles.4.x.jar*, remember to rename the file.
OR
run `sh hack.4.x.sh`