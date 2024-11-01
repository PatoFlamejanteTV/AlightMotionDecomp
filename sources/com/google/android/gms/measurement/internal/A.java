package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;

/* loaded from: classes3.dex */
final class A {

    /* renamed from: a, reason: collision with root package name */
    final String f17109a;

    /* renamed from: b, reason: collision with root package name */
    final String f17110b;

    /* renamed from: c, reason: collision with root package name */
    final long f17111c;

    /* renamed from: d, reason: collision with root package name */
    final long f17112d;

    /* renamed from: e, reason: collision with root package name */
    final long f17113e;

    /* renamed from: f, reason: collision with root package name */
    final long f17114f;

    /* renamed from: g, reason: collision with root package name */
    final long f17115g;

    /* renamed from: h, reason: collision with root package name */
    final Long f17116h;

    /* renamed from: i, reason: collision with root package name */
    final Long f17117i;

    /* renamed from: j, reason: collision with root package name */
    final Long f17118j;

    /* renamed from: k, reason: collision with root package name */
    final Boolean f17119k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(String str, String str2, long j8, long j9, long j10, long j11, Long l8, Long l9, Long l10, Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j10, 0L, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final A a(long j8) {
        return new A(this.f17109a, this.f17110b, this.f17111c, this.f17112d, this.f17113e, j8, this.f17115g, this.f17116h, this.f17117i, this.f17118j, this.f17119k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final A b(long j8, long j9) {
        return new A(this.f17109a, this.f17110b, this.f17111c, this.f17112d, this.f17113e, this.f17114f, j8, Long.valueOf(j9), this.f17117i, this.f17118j, this.f17119k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final A c(Long l8, Long l9, Boolean bool) {
        Boolean bool2;
        if (bool != null && !bool.booleanValue()) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        return new A(this.f17109a, this.f17110b, this.f17111c, this.f17112d, this.f17113e, this.f17114f, this.f17115g, this.f17116h, l8, l9, bool2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(String str, String str2, long j8, long j9, long j10, long j11, long j12, Long l8, Long l9, Long l10, Boolean bool) {
        AbstractC1396p.f(str);
        AbstractC1396p.f(str2);
        AbstractC1396p.a(j8 >= 0);
        AbstractC1396p.a(j9 >= 0);
        AbstractC1396p.a(j10 >= 0);
        AbstractC1396p.a(j12 >= 0);
        this.f17109a = str;
        this.f17110b = str2;
        this.f17111c = j8;
        this.f17112d = j9;
        this.f17113e = j10;
        this.f17114f = j11;
        this.f17115g = j12;
        this.f17116h = l8;
        this.f17117i = l9;
        this.f17118j = l10;
        this.f17119k = bool;
    }
}
