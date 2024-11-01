package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class SharedPreferencesKt {
    @SuppressLint({"ApplySharedPref"})
    public static final void edit(SharedPreferences sharedPreferences, boolean z8, Function1 function1) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        function1.invoke(edit);
        if (z8) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public static /* synthetic */ void edit$default(SharedPreferences sharedPreferences, boolean z8, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        function1.invoke(edit);
        if (z8) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
