package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.content.SharedPreferences;
import android.util.Pair;

/* loaded from: classes3.dex */
public final class D2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17171a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17172b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17173c;

    /* renamed from: d, reason: collision with root package name */
    private final long f17174d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2484z2 f17175e;

    private final long c() {
        return this.f17175e.J().getLong(this.f17171a, 0L);
    }

    private final void d() {
        this.f17175e.k();
        long currentTimeMillis = this.f17175e.x().currentTimeMillis();
        SharedPreferences.Editor edit = this.f17175e.J().edit();
        edit.remove(this.f17172b);
        edit.remove(this.f17173c);
        edit.putLong(this.f17171a, currentTimeMillis);
        edit.apply();
    }

    public final Pair a() {
        long abs;
        this.f17175e.k();
        this.f17175e.k();
        long c8 = c();
        if (c8 == 0) {
            d();
            abs = 0;
        } else {
            abs = Math.abs(c8 - this.f17175e.x().currentTimeMillis());
        }
        long j8 = this.f17174d;
        if (abs < j8) {
            return null;
        }
        if (abs > (j8 << 1)) {
            d();
            return null;
        }
        String string = this.f17175e.J().getString(this.f17173c, null);
        long j9 = this.f17175e.J().getLong(this.f17172b, 0L);
        d();
        if (string != null && j9 > 0) {
            return new Pair(string, Long.valueOf(j9));
        }
        return C2484z2.f18142B;
    }

    public final void b(String str, long j8) {
        boolean z8;
        this.f17175e.k();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j9 = this.f17175e.J().getLong(this.f17172b, 0L);
        if (j9 <= 0) {
            SharedPreferences.Editor edit = this.f17175e.J().edit();
            edit.putString(this.f17173c, str);
            edit.putLong(this.f17172b, 1L);
            edit.apply();
            return;
        }
        long j10 = j9 + 1;
        if ((this.f17175e.g().W0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j10) {
            z8 = true;
        } else {
            z8 = false;
        }
        SharedPreferences.Editor edit2 = this.f17175e.J().edit();
        if (z8) {
            edit2.putString(this.f17173c, str);
        }
        edit2.putLong(this.f17172b, j10);
        edit2.apply();
    }

    private D2(C2484z2 c2484z2, String str, long j8) {
        this.f17175e = c2484z2;
        AbstractC1396p.f(str);
        AbstractC1396p.a(j8 > 0);
        this.f17171a = str + ":start";
        this.f17172b = str + ":count";
        this.f17173c = str + ":value";
        this.f17174d = j8;
    }
}
