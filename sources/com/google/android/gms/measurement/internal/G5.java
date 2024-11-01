package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.q7;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import l0.EnumC3297C;

/* loaded from: classes3.dex */
public final class G5 extends F5 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public G5(H5 h52) {
        super(h52);
    }

    private final String t(String str) {
        String R8 = o().R(str);
        if (!TextUtils.isEmpty(R8)) {
            Uri parse = Uri.parse((String) G.f17329r.a(null));
            Uri.Builder buildUpon = parse.buildUpon();
            buildUpon.authority(R8 + "." + parse.getAuthority());
            return buildUpon.build().toString();
        }
        return (String) G.f17329r.a(null);
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

    public final I5 r(String str) {
        C2324c2 M02;
        String str2;
        if (q7.a() && b().q(G.f17344y0)) {
            g();
            if (d6.H0(str)) {
                a().K().a("sgtm feature flag enabled.");
                C2324c2 M03 = n().M0(str);
                if (M03 == null) {
                    return new I5(t(str), EnumC3297C.GOOGLE_ANALYTICS);
                }
                String m8 = M03.m();
                com.google.android.gms.internal.measurement.S1 L8 = o().L(str);
                if (L8 != null && (M02 = n().M0(str)) != null && ((L8.Y() && L8.P().j() == 100) || g().E0(str, M02.v()) || (!b().q(G.f17231A0) ? !(TextUtils.isEmpty(m8) || m8.hashCode() % 100 >= L8.P().j()) : !(TextUtils.isEmpty(m8) || Math.abs(m8.hashCode() % 100) >= L8.P().j())))) {
                    I5 i52 = null;
                    if (M03.C()) {
                        a().K().a("sgtm upload enabled in manifest.");
                        com.google.android.gms.internal.measurement.S1 L9 = o().L(M03.l());
                        if (L9 != null && L9.Y()) {
                            String J8 = L9.P().J();
                            if (!TextUtils.isEmpty(J8)) {
                                String I8 = L9.P().I();
                                C2415p2 K8 = a().K();
                                if (TextUtils.isEmpty(I8)) {
                                    str2 = "Y";
                                } else {
                                    str2 = "N";
                                }
                                K8.c("sgtm configured with upload_url, server_info", J8, str2);
                                if (TextUtils.isEmpty(I8)) {
                                    i52 = new I5(J8, EnumC3297C.SGTM);
                                } else {
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("x-sgtm-server-info", I8);
                                    if (!TextUtils.isEmpty(M03.v())) {
                                        hashMap.put("x-gtm-server-preview", M03.v());
                                    }
                                    i52 = new I5(J8, hashMap, EnumC3297C.SGTM);
                                }
                            }
                        }
                    }
                    if (i52 != null) {
                        return i52;
                    }
                } else {
                    return new I5(t(str), EnumC3297C.GOOGLE_ANALYTICS);
                }
            }
        }
        return new I5(t(str), EnumC3297C.GOOGLE_ANALYTICS);
    }

    public final String s(C2324c2 c2324c2) {
        Uri.Builder builder = new Uri.Builder();
        String q8 = c2324c2.q();
        if (TextUtils.isEmpty(q8)) {
            q8 = c2324c2.j();
        }
        builder.scheme((String) G.f17297f.a(null)).encodedAuthority((String) G.f17300g.a(null)).path("config/app/" + q8).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "106000").appendQueryParameter("runtime_version", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        return builder.build().toString();
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
}
