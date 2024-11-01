package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.AbstractC2240r4;
import com.google.android.gms.internal.measurement.C2171j2;
import com.google.android.gms.internal.measurement.C2180k2;
import com.google.android.gms.internal.measurement.C2185k7;
import com.google.android.gms.internal.measurement.C2189l2;
import com.google.android.gms.internal.measurement.C2207n2;
import com.google.android.gms.internal.measurement.C2215o2;
import com.google.android.gms.internal.measurement.C2223p2;
import com.google.android.gms.internal.measurement.C2246s2;
import com.google.android.gms.internal.measurement.Q6;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.v4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2458v4 extends E5 {
    public C2458v4(H5 h52) {
        super(h52);
    }

    private static String h(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean u() {
        return false;
    }

    public final byte[] v(E e8, String str) {
        a6 a6Var;
        Bundle bundle;
        C2215o2.a aVar;
        C2207n2.a aVar2;
        C2324c2 c2324c2;
        byte[] bArr;
        long j8;
        A a9;
        k();
        this.f18099a.Q();
        AbstractC1396p.l(e8);
        AbstractC1396p.f(str);
        if (!b().F(str, G.f17319m0)) {
            a().F().b("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(e8.f17192a) && !"_iapx".equals(e8.f17192a)) {
            a().F().c("Generating a payload for this event is not available. package_name, event_name", str, e8.f17192a);
            return null;
        }
        C2207n2.a L8 = C2207n2.L();
        n().c1();
        try {
            C2324c2 M02 = n().M0(str);
            if (M02 == null) {
                a().F().b("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!M02.A()) {
                a().F().b("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            C2215o2.a S02 = C2215o2.u2().t0(1).S0("android");
            if (!TextUtils.isEmpty(M02.l())) {
                S02.R(M02.l());
            }
            if (!TextUtils.isEmpty(M02.n())) {
                S02.d0((String) AbstractC1396p.l(M02.n()));
            }
            if (!TextUtils.isEmpty(M02.o())) {
                S02.j0((String) AbstractC1396p.l(M02.o()));
            }
            if (M02.U() != -2147483648L) {
                S02.g0((int) M02.U());
            }
            S02.m0(M02.z0()).b0(M02.v0());
            String q8 = M02.q();
            String j9 = M02.j();
            if (!TextUtils.isEmpty(q8)) {
                S02.M0(q8);
            } else if (!TextUtils.isEmpty(j9)) {
                S02.G(j9);
            }
            S02.C0(M02.J0());
            A3 U8 = this.f17229b.U(str);
            S02.V(M02.t0());
            if (this.f18099a.m() && b().N(S02.Z0()) && U8.y() && !TextUtils.isEmpty(null)) {
                S02.D0(null);
            }
            S02.r0(U8.w());
            if (U8.y() && M02.z()) {
                Pair z8 = p().z(M02.l(), U8);
                if (M02.z() && z8 != null && !TextUtils.isEmpty((CharSequence) z8.first)) {
                    S02.U0(h((String) z8.first, Long.toString(e8.f17195d)));
                    Object obj = z8.second;
                    if (obj != null) {
                        S02.Y(((Boolean) obj).booleanValue());
                    }
                }
            }
            c().m();
            C2215o2.a z02 = S02.z0(Build.MODEL);
            c().m();
            z02.Q0(Build.VERSION.RELEASE).B0((int) c().r()).Y0(c().s());
            if (U8.z() && M02.m() != null) {
                S02.X(h((String) AbstractC1396p.l(M02.m()), Long.toString(e8.f17195d)));
            }
            if (!TextUtils.isEmpty(M02.p())) {
                S02.K0((String) AbstractC1396p.l(M02.p()));
            }
            String l8 = M02.l();
            List Y02 = n().Y0(l8);
            Iterator it = Y02.iterator();
            while (true) {
                if (it.hasNext()) {
                    a6Var = (a6) it.next();
                    if ("_lte".equals(a6Var.f17682c)) {
                        break;
                    }
                } else {
                    a6Var = null;
                    break;
                }
            }
            if (a6Var == null || a6Var.f17684e == null) {
                a6 a6Var2 = new a6(l8, "auto", "_lte", x().currentTimeMillis(), 0L);
                Y02.add(a6Var2);
                n().i0(a6Var2);
            }
            C2246s2[] c2246s2Arr = new C2246s2[Y02.size()];
            for (int i8 = 0; i8 < Y02.size(); i8++) {
                C2246s2.a x8 = C2246s2.S().t(((a6) Y02.get(i8)).f17682c).x(((a6) Y02.get(i8)).f17683d);
                l().V(x8, ((a6) Y02.get(i8)).f17684e);
                c2246s2Arr[i8] = (C2246s2) ((AbstractC2240r4) x8.m());
            }
            S02.i0(Arrays.asList(c2246s2Arr));
            this.f17229b.u(M02, S02);
            if (Q6.a() && b().q(G.f17273V0)) {
                this.f17229b.a0(M02, S02);
            }
            C2428r2 b9 = C2428r2.b(e8);
            g().N(b9.f18030d, n().K0(str));
            g().W(b9, b().s(str));
            Bundle bundle2 = b9.f18030d;
            bundle2.putLong("_c", 1L);
            a().F().a("Marking in-app purchase as real-time");
            bundle2.putLong("_r", 1L);
            bundle2.putString("_o", e8.f17194c);
            if (g().E0(S02.Z0(), M02.v())) {
                g().O(bundle2, "_dbg", 1L);
                g().O(bundle2, "_r", 1L);
            }
            A L02 = n().L0(str, e8.f17192a);
            if (L02 == null) {
                bundle = bundle2;
                aVar = S02;
                aVar2 = L8;
                c2324c2 = M02;
                bArr = null;
                a9 = new A(str, e8.f17192a, 0L, 0L, e8.f17195d, 0L, null, null, null, null);
                j8 = 0;
            } else {
                bundle = bundle2;
                aVar = S02;
                aVar2 = L8;
                c2324c2 = M02;
                bArr = null;
                j8 = L02.f17114f;
                a9 = L02.a(e8.f17195d);
            }
            n().U(a9);
            B b10 = new B(this.f18099a, e8.f17194c, str, e8.f17192a, e8.f17195d, j8, bundle);
            C2171j2.a w8 = C2171j2.S().D(b10.f17145d).B(b10.f17143b).w(b10.f17146e);
            Iterator it2 = b10.f17147f.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                C2189l2.a x9 = C2189l2.U().x(str2);
                Object I8 = b10.f17147f.I(str2);
                if (I8 != null) {
                    l().U(x9, I8);
                    w8.x(x9);
                }
            }
            C2215o2.a aVar3 = aVar;
            aVar3.B(w8).C(C2223p2.G().q(C2180k2.G().q(a9.f17111c).r(e8.f17192a)));
            aVar3.F(m().z(c2324c2.l(), Collections.emptyList(), aVar3.J(), Long.valueOf(w8.F()), Long.valueOf(w8.F())));
            if (w8.J()) {
                aVar3.y0(w8.F()).h0(w8.F());
            }
            long D02 = c2324c2.D0();
            if (D02 != 0) {
                aVar3.q0(D02);
            }
            long H02 = c2324c2.H0();
            if (H02 != 0) {
                aVar3.u0(H02);
            } else if (D02 != 0) {
                aVar3.u0(D02);
            }
            String u8 = c2324c2.u();
            if (C2185k7.a() && b().F(str, G.f17342x0) && u8 != null) {
                aVar3.W0(u8);
            }
            c2324c2.y();
            aVar3.l0((int) c2324c2.F0()).J0(106000L).F0(x().currentTimeMillis()).e0(true);
            this.f17229b.E(aVar3.Z0(), aVar3);
            C2207n2.a aVar4 = aVar2;
            aVar4.r(aVar3);
            C2324c2 c2324c22 = c2324c2;
            c2324c22.C0(aVar3.k0());
            c2324c22.y0(aVar3.f0());
            n().V(c2324c22, false, false);
            n().k1();
            try {
                return l().h0(((C2207n2) ((AbstractC2240r4) aVar4.m())).i());
            } catch (IOException e9) {
                a().G().c("Data loss. Failed to bundle and serialize. appId", C2401n2.s(str), e9);
                return bArr;
            }
        } catch (SecurityException e10) {
            a().F().b("Resettable device id encryption failed", e10.getMessage());
            return new byte[0];
        } catch (SecurityException e11) {
            a().F().b("app instance id encryption failed", e11.getMessage());
            return new byte[0];
        } finally {
            n().i1();
        }
    }
}
