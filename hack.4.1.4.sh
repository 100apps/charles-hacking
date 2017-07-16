charles=/Applications/Charles.app/Contents/Java/charles.jar
dir=charleshack

mkdir $dir
cd $dir
cat >> gIbD.java <<EOF
package com.xk72.charles;
public final class gIbD {
	public static boolean xUFT() { return true; }
	public static String PcqR() { return "Cracked"; }
	public static String xUFT(String name, String key) { return null; }
}
EOF
javac -encoding UTF-8 gIbD.java -d .&& jar -uvf $charles com/xk72/charles/gIbD.class
cd .. && rm -rf $dir