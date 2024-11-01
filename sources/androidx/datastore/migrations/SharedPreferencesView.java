package androidx.datastore.migrations;

import R5.AbstractC1435t;
import R5.Q;
import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class SharedPreferencesView {
    private final Set<String> keySet;
    private final SharedPreferences prefs;

    public SharedPreferencesView(SharedPreferences prefs, Set<String> set) {
        AbstractC3292y.i(prefs, "prefs");
        this.prefs = prefs;
        this.keySet = set;
    }

    private final String checkKey(String str) {
        Set<String> set = this.keySet;
        if (set != null && !set.contains(str)) {
            throw new IllegalStateException(("Can't access key outside migration: " + str).toString());
        }
        return str;
    }

    public static /* synthetic */ String getString$default(SharedPreferencesView sharedPreferencesView, String str, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = null;
        }
        return sharedPreferencesView.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set getStringSet$default(SharedPreferencesView sharedPreferencesView, String str, Set set, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            set = null;
        }
        return sharedPreferencesView.getStringSet(str, set);
    }

    public final boolean contains(String key) {
        AbstractC3292y.i(key, "key");
        return this.prefs.contains(checkKey(key));
    }

    public final Map<String, Object> getAll() {
        boolean z8;
        Map<String, ?> all = this.prefs.getAll();
        AbstractC3292y.h(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set<String> set = this.keySet;
            if (set != null) {
                z8 = set.contains(key);
            } else {
                z8 = true;
            }
            if (z8) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(Q.d(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = AbstractC1435t.b1((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final boolean getBoolean(String key, boolean z8) {
        AbstractC3292y.i(key, "key");
        return this.prefs.getBoolean(checkKey(key), z8);
    }

    public final float getFloat(String key, float f8) {
        AbstractC3292y.i(key, "key");
        return this.prefs.getFloat(checkKey(key), f8);
    }

    public final int getInt(String key, int i8) {
        AbstractC3292y.i(key, "key");
        return this.prefs.getInt(checkKey(key), i8);
    }

    public final long getLong(String key, long j8) {
        AbstractC3292y.i(key, "key");
        return this.prefs.getLong(checkKey(key), j8);
    }

    public final String getString(String key, String str) {
        AbstractC3292y.i(key, "key");
        return this.prefs.getString(checkKey(key), str);
    }

    public final Set<String> getStringSet(String key, Set<String> set) {
        AbstractC3292y.i(key, "key");
        Set<String> stringSet = this.prefs.getStringSet(checkKey(key), set);
        if (stringSet != null) {
            return AbstractC1435t.a1(stringSet);
        }
        return null;
    }
}
