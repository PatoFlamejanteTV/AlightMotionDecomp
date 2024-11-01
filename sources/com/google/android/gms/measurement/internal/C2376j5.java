package com.google.android.gms.measurement.internal;

import G.a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import j$.util.Objects;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.j5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2376j5 extends E5 {

    /* renamed from: d, reason: collision with root package name */
    private final Map f17877d;

    /* renamed from: e, reason: collision with root package name */
    public final A2 f17878e;

    /* renamed from: f, reason: collision with root package name */
    public final A2 f17879f;

    /* renamed from: g, reason: collision with root package name */
    public final A2 f17880g;

    /* renamed from: h, reason: collision with root package name */
    public final A2 f17881h;

    /* renamed from: i, reason: collision with root package name */
    public final A2 f17882i;

    /* renamed from: j, reason: collision with root package name */
    public final A2 f17883j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2376j5(H5 h52) {
        super(h52);
        this.f17877d = new HashMap();
        C2484z2 e8 = e();
        Objects.requireNonNull(e8);
        this.f17878e = new A2(e8, "last_delete_stale", 0L);
        C2484z2 e9 = e();
        Objects.requireNonNull(e9);
        this.f17879f = new A2(e9, "last_delete_stale_batch", 0L);
        C2484z2 e10 = e();
        Objects.requireNonNull(e10);
        this.f17880g = new A2(e10, "backoff", 0L);
        C2484z2 e11 = e();
        Objects.requireNonNull(e11);
        this.f17881h = new A2(e11, "last_upload", 0L);
        C2484z2 e12 = e();
        Objects.requireNonNull(e12);
        this.f17882i = new A2(e12, "last_upload_attempt", 0L);
        C2484z2 e13 = e();
        Objects.requireNonNull(e13);
        this.f17883j = new A2(e13, "midnight_offset", 0L);
    }

    private final Pair v(String str) {
        C2369i5 c2369i5;
        a.C0040a c0040a;
        k();
        long elapsedRealtime = x().elapsedRealtime();
        C2369i5 c2369i52 = (C2369i5) this.f17877d.get(str);
        if (c2369i52 != null && elapsedRealtime < c2369i52.f17857c) {
            return new Pair(c2369i52.f17855a, Boolean.valueOf(c2369i52.f17856b));
        }
        G.a.b(true);
        long C8 = b().C(str) + elapsedRealtime;
        try {
            try {
                c0040a = G.a.a(w());
            } catch (PackageManager.NameNotFoundException unused) {
                if (c2369i52 != null && elapsedRealtime < c2369i52.f17857c + b().A(str, G.f17288c)) {
                    return new Pair(c2369i52.f17855a, Boolean.valueOf(c2369i52.f17856b));
                }
                c0040a = null;
            }
        } catch (Exception e8) {
            a().F().b("Unable to get advertising id", e8);
            c2369i5 = new C2369i5("", false, C8);
        }
        if (c0040a == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String a9 = c0040a.a();
        if (a9 != null) {
            c2369i5 = new C2369i5(a9, c0040a.b(), C8);
        } else {
            c2369i5 = new C2369i5("", c0040a.b(), C8);
        }
        this.f17877d.put(str, c2369i5);
        G.a.b(false);
        return new Pair(c2369i5.f17855a, Boolean.valueOf(c2369i5.f17856b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String A(String str, boolean z8) {
        String str2;
        k();
        if (z8) {
            str2 = (String) v(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest V02 = d6.V0();
        if (V02 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, V02.digest(str2.getBytes())));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ C2401n2 a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2349g b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2467x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2359h2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2484z2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ P2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ Z5 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ h6 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C2377k n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ I2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C2376j5 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ G5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean u() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ Context w() {
        return super.w();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ V.d x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ C2321c y() {
        return super.y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair z(String str, A3 a32) {
        if (a32.y()) {
            return v(str);
        }
        return new Pair("", Boolean.FALSE);
    }
}
