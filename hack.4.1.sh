charles=/Applications/Charles.app/Contents/Java/charles.jar
dir=charleshack

mkdir $dir
cd $dir
cat >> GFjZ.java <<EOF
package com.xk72.charles;
public final class GFjZ {
	public static boolean VxNA() { return true; }
	public static String eSXN() { return "http://www.gfzj.us"; }
	public static String VxNA(String name, String key) { return null; }
}
EOF
javac -encoding UTF-8 GFjZ.java -d .&& jar -uvf $charles com/xk72/charles/GFjZ.class
cd .. && rm -rf $dir