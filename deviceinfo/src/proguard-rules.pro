# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.mh.easydeviceinfo.deviceinfo.Deviceinfo {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/mh/easydeviceinfo/deviceinfo/repack'
-flattenpackagehierarchy
-dontpreverify
