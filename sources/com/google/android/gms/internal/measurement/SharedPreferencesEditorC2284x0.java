package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class SharedPreferencesEditorC2284x0 implements SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    private boolean f17069a;

    /* renamed from: b, reason: collision with root package name */
    private Set f17070b;

    /* renamed from: c, reason: collision with root package name */
    private Map f17071c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ SharedPreferencesC2260u0 f17072d;

    private final void a(String str, Object obj) {
        if (obj != null) {
            this.f17071c.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f17069a = true;
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        Map map;
        Set<SharedPreferences.OnSharedPreferenceChangeListener> set;
        Map map2;
        Map map3;
        if (this.f17069a) {
            map3 = this.f17072d.f17016a;
            map3.clear();
        }
        map = this.f17072d.f17016a;
        map.keySet().removeAll(this.f17070b);
        for (Map.Entry entry : this.f17071c.entrySet()) {
            map2 = this.f17072d.f17016a;
            map2.put((String) entry.getKey(), entry.getValue());
        }
        set = this.f17072d.f17017b;
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : set) {
            x0.S it = x0.M.c(this.f17070b, this.f17071c.keySet()).iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f17072d, (String) it.next());
            }
        }
        if (!this.f17069a && this.f17070b.isEmpty() && this.f17071c.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z8) {
        a(str, Boolean.valueOf(z8));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f8) {
        a(str, Float.valueOf(f8));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i8) {
        a(str, Integer.valueOf(i8));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j8) {
        a(str, Long.valueOf(j8));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f17070b.add(str);
        return this;
    }

    private SharedPreferencesEditorC2284x0(SharedPreferencesC2260u0 sharedPreferencesC2260u0) {
        this.f17072d = sharedPreferencesC2260u0;
        this.f17069a = false;
        this.f17070b = new HashSet();
        this.f17071c = new HashMap();
    }
}
