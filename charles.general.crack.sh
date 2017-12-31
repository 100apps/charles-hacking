#!/bin/bash

charles=${1:-/Applications/Charles.app/Contents/Java/charles.jar}
charles=$(find $charles -name charles.jar)
charles=$(realpath $charles)
dir=charleshack

mkdir $dir
cd $dir

unzip -o $charles 'com/*' 2>/dev/null || exit 1
jad -o -r -s java com/**/*.class 2>/dev/null || exit 1
package=com.xk72.charles
main=${package//.//}/Main.java
validate=$(grep -Eo 'protected boolean [a-zA-Z]+' $main | awk '{print $NF}')
call=$(grep 'Registered to: ' $main | grep -Eo '[a-zA-Z]+\.[a-zA-Z]+\(\)' | tr -d '()')
class=${call/.*/}
identify=${call/*./}
identification=https://www.charlesproxy.com


cat >> $class.java <<EOF
package $package;
public final class $class {
    public static boolean $validate() { return true; }
    public static String $identify() { return "$identification"; }
    public static String $validate(String name, String key) { return null; }
}
EOF
cat $class.java
echo javac -encoding UTF-8 $class.java -d . || exit 1
echo jar -uvf $charles ${package//.//}/$class.class || exit 1
cd .. && rm -rf $dir
