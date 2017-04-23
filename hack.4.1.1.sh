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