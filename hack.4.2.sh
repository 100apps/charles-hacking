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