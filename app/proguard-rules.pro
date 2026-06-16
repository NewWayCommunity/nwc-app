-keepattributes *Annotation*,Signature
-keepclassmembers class * {
    @com.google.firebase.database.PropertyName <fields>;
    @com.google.firebase.database.PropertyName <methods>;
}

-keep class io.github.newwaycommunity.model.** { *; }

-keep class coil.** { *; }
-dontwarn coil.**
