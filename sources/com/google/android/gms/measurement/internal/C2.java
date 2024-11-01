package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class C2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17163a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f17164b;

    /* renamed from: c, reason: collision with root package name */
    private String f17165c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C2484z2 f17166d;

    public C2(C2484z2 c2484z2, String str, String str2) {
        this.f17166d = c2484z2;
        AbstractC1396p.f(str);
        this.f17163a = str;
    }

    public final String a() {
        if (!this.f17164b) {
            this.f17164b = true;
            this.f17165c = this.f17166d.J().getString(this.f17163a, null);
        }
        return this.f17165c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f17166d.J().edit();
        edit.putString(this.f17163a, str);
        edit.apply();
        this.f17165c = str;
    }
}
