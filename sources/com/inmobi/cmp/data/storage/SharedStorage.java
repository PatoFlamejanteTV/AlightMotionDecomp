package com.inmobi.cmp.data.storage;

import J6.h;
import X7.a;
import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.inmobi.cmp.core.model.Vector;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public class SharedStorage {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f19084a;

    public SharedStorage(Application app) {
        AbstractC3292y.i(app, "app");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(app);
        AbstractC3292y.h(defaultSharedPreferences, "getDefaultSharedPreferences(app)");
        this.f19084a = defaultSharedPreferences;
    }

    public static void f(SharedStorage sharedStorage, int i8, h explicitNotice, h optOut, h coveredTransaction, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 1;
        }
        if ((i9 & 2) != 0) {
            explicitNotice = h.YES;
        }
        sharedStorage.getClass();
        AbstractC3292y.i(explicitNotice, "explicitNotice");
        AbstractC3292y.i(optOut, "optOut");
        AbstractC3292y.i(coveredTransaction, "coveredTransaction");
        String str = i8 + explicitNotice.f4508a + optOut.f4508a + coveredTransaction.f4508a;
        sharedStorage.e(a.PRIVACY_STRING, str);
        sharedStorage.e(a.SAVED_PRIVACY_STRING, str);
    }

    public final String a(int i8, int i9) {
        String j8 = j(a.SAVED_PRIVACY_STRING);
        if (j8.length() > 0) {
            String substring = j8.substring(i8, i9);
            AbstractC3292y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return "";
    }

    public final void b(a preferenceKey) {
        AbstractC3292y.i(preferenceKey, "preferenceKey");
        SharedPreferences.Editor editor = this.f19084a.edit();
        AbstractC3292y.h(editor, "editor");
        editor.remove(preferenceKey.f11735a);
        editor.apply();
    }

    public final void c(a preferenceKey, int i8) {
        AbstractC3292y.i(preferenceKey, "preferenceKey");
        SharedPreferences.Editor editor = this.f19084a.edit();
        AbstractC3292y.h(editor, "editor");
        editor.putInt(preferenceKey.f11735a, i8);
        editor.apply();
    }

    public final void d(a key, Vector list) {
        AbstractC3292y.i(key, "key");
        AbstractC3292y.i(list, "list");
        String json = new Gson().r(list);
        AbstractC3292y.h(json, "json");
        e(key, json);
    }

    public final void e(a preferenceKey, String value) {
        AbstractC3292y.i(preferenceKey, "preferenceKey");
        AbstractC3292y.i(value, "value");
        SharedPreferences.Editor editor = this.f19084a.edit();
        AbstractC3292y.h(editor, "editor");
        editor.putString(preferenceKey.f11735a, value);
        editor.apply();
    }

    public final void g(String preferenceKey, String value) {
        AbstractC3292y.i(preferenceKey, "preferenceKey");
        AbstractC3292y.i(value, "value");
        SharedPreferences.Editor editor = this.f19084a.edit();
        AbstractC3292y.h(editor, "editor");
        editor.putString(preferenceKey, value);
        editor.apply();
    }

    public final boolean h(a preferenceKey) {
        AbstractC3292y.i(preferenceKey, "preferenceKey");
        return this.f19084a.getBoolean(preferenceKey.f11735a, false);
    }

    public final int i(a preferenceKey) {
        AbstractC3292y.i(preferenceKey, "preferenceKey");
        return this.f19084a.getInt(preferenceKey.f11735a, 0);
    }

    public final String j(a preferenceKey) {
        AbstractC3292y.i(preferenceKey, "preferenceKey");
        String string = this.f19084a.getString(preferenceKey.f11735a, "");
        if (string == null) {
            return "";
        }
        return string;
    }

    public final Vector k(a key) {
        AbstractC3292y.i(key, "key");
        try {
            return (Vector) new Gson().i(j(key), new TypeToken<Vector>() { // from class: com.inmobi.cmp.data.storage.SharedStorage$getVectorPreference$type$1
            }.d());
        } catch (Exception unused) {
            return null;
        }
    }
}
