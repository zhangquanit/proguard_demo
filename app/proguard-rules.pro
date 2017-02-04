# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in D:\software\AndroidStudio\sdk/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}
# This is a configuration file for ProGuard.
# http://proguard.sourceforge.net/index.html#manual/usage.html
-keepattributes Signature
-keep class sun.misc.Unsafe { *; }
-keepclassmembers class * {
   public <init>(org.json.JSONObject);
}
# 只会保留Person类名和无参的构造函数
#-keep class com.proguard.demo.bean.Person

#保留Person及其members
-keep class  com.proguard.demo.bean.Person{
 *;
}

#保留内部类及其members
#-keep class  com.proguard.demo.bean.Person$InnerClass{
#*;
#}

#当存在指定member时，保留类及其members
#-keepclasseswithmembers  class *{
# public <init>(java.lang.String);
#}

#保留所有类中的setName(String)方法
#-keepclassmembers class **{
#   public void setName(java.lang.String);
#}

# 保留Person的所有子类及其members
#-keep class * extends com.proguard.demo.bean.Person{
# *;
#}

##########################################################################
-keepattributes *Annotation*
-keepclassmembers class ** {
    @com.proguard.demo.annotation.MyAnno <methods>;
}
#因为MyAnno中使用了枚举MyEnum，因此不能混淆枚举MyEnum
-keep enum com.proguard.demo.enums.MyEnum { *; }
