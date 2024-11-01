package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C2207n2;
import java.util.Map;
import l0.EnumC3297C;

/* loaded from: classes3.dex */
public final class V5 {

    /* renamed from: a, reason: collision with root package name */
    private long f17600a;

    /* renamed from: b, reason: collision with root package name */
    private C2207n2 f17601b;

    /* renamed from: c, reason: collision with root package name */
    private String f17602c;

    /* renamed from: d, reason: collision with root package name */
    private Map f17603d;

    /* renamed from: e, reason: collision with root package name */
    private EnumC3297C f17604e;

    public final long a() {
        return this.f17600a;
    }

    public final I5 b() {
        return new I5(this.f17602c, this.f17603d, this.f17604e);
    }

    public final C2207n2 c() {
        return this.f17601b;
    }

    public final String d() {
        return this.f17602c;
    }

    public final Map e() {
        return this.f17603d;
    }

    private V5(long j8, C2207n2 c2207n2, String str, Map map, EnumC3297C enumC3297C) {
        this.f17600a = j8;
        this.f17601b = c2207n2;
        this.f17602c = str;
        this.f17603d = map;
        this.f17604e = enumC3297C;
    }
}
