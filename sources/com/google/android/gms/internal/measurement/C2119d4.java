package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.d4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2119d4 implements V5 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2092a4 f16685a;

    private C2119d4(AbstractC2092a4 abstractC2092a4) {
        AbstractC2092a4 abstractC2092a42 = (AbstractC2092a4) AbstractC2256t4.f(abstractC2092a4, "output");
        this.f16685a = abstractC2092a42;
        abstractC2092a42.f16575a = this;
    }

    public static C2119d4 P(AbstractC2092a4 abstractC2092a4) {
        C2119d4 c2119d4 = abstractC2092a4.f16575a;
        if (c2119d4 != null) {
            return c2119d4;
        }
        return new C2119d4(abstractC2092a4);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void A(int i8, List list, boolean z8) {
        int i9 = 0;
        if (list instanceof I4) {
            I4 i42 = (I4) list;
            if (z8) {
                this.f16685a.V(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < i42.size(); i11++) {
                    i10 += AbstractC2092a4.S(i42.f(i11));
                }
                this.f16685a.U(i10);
                while (i9 < i42.size()) {
                    this.f16685a.s(i42.f(i9));
                    i9++;
                }
                return;
            }
            while (i9 < i42.size()) {
                this.f16685a.m(i8, i42.f(i9));
                i9++;
            }
            return;
        }
        if (z8) {
            this.f16685a.V(i8, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC2092a4.S(((Long) list.get(i13)).longValue());
            }
            this.f16685a.U(i12);
            while (i9 < list.size()) {
                this.f16685a.s(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16685a.m(i8, ((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void B(int i8, int i9) {
        this.f16685a.b0(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void C(int i8, List list, boolean z8) {
        int i9 = 0;
        if (list instanceof I4) {
            I4 i42 = (I4) list;
            if (z8) {
                this.f16685a.V(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < i42.size(); i11++) {
                    i10 += AbstractC2092a4.n0(i42.f(i11));
                }
                this.f16685a.U(i10);
                while (i9 < i42.size()) {
                    this.f16685a.N(i42.f(i9));
                    i9++;
                }
                return;
            }
            while (i9 < i42.size()) {
                this.f16685a.L(i8, i42.f(i9));
                i9++;
            }
            return;
        }
        if (z8) {
            this.f16685a.V(i8, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC2092a4.n0(((Long) list.get(i13)).longValue());
            }
            this.f16685a.U(i12);
            while (i9 < list.size()) {
                this.f16685a.N(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16685a.L(i8, ((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void D(int i8, Object obj, InterfaceC2210n5 interfaceC2210n5) {
        AbstractC2092a4 abstractC2092a4 = this.f16685a;
        abstractC2092a4.V(i8, 3);
        interfaceC2210n5.f((Y4) obj, abstractC2092a4.f16575a);
        abstractC2092a4.V(i8, 4);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void E(int i8, List list, boolean z8) {
        int i9 = 0;
        if (list instanceof C2264u4) {
            C2264u4 c2264u4 = (C2264u4) list;
            if (z8) {
                this.f16685a.V(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < c2264u4.size(); i11++) {
                    i10 += AbstractC2092a4.c0(c2264u4.d(i11));
                }
                this.f16685a.U(i10);
                while (i9 < c2264u4.size()) {
                    this.f16685a.k(c2264u4.d(i9));
                    i9++;
                }
                return;
            }
            while (i9 < c2264u4.size()) {
                this.f16685a.l(i8, c2264u4.d(i9));
                i9++;
            }
            return;
        }
        if (z8) {
            this.f16685a.V(i8, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC2092a4.c0(((Integer) list.get(i13)).intValue());
            }
            this.f16685a.U(i12);
            while (i9 < list.size()) {
                this.f16685a.k(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16685a.l(i8, ((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void F(int i8, Object obj, InterfaceC2210n5 interfaceC2210n5) {
        this.f16685a.p(i8, (Y4) obj, interfaceC2210n5);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void G(int i8, List list, boolean z8) {
        int i9 = 0;
        if (list instanceof C2264u4) {
            C2264u4 c2264u4 = (C2264u4) list;
            if (z8) {
                this.f16685a.V(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < c2264u4.size(); i11++) {
                    i10 += AbstractC2092a4.v0(c2264u4.d(i11));
                }
                this.f16685a.U(i10);
                while (i9 < c2264u4.size()) {
                    this.f16685a.U(c2264u4.d(i9));
                    i9++;
                }
                return;
            }
            while (i9 < c2264u4.size()) {
                this.f16685a.b0(i8, c2264u4.d(i9));
                i9++;
            }
            return;
        }
        if (z8) {
            this.f16685a.V(i8, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC2092a4.v0(((Integer) list.get(i13)).intValue());
            }
            this.f16685a.U(i12);
            while (i9 < list.size()) {
                this.f16685a.U(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16685a.b0(i8, ((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void H(int i8, List list, boolean z8) {
        int i9 = 0;
        if (list instanceof C2264u4) {
            C2264u4 c2264u4 = (C2264u4) list;
            if (z8) {
                this.f16685a.V(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < c2264u4.size(); i11++) {
                    i10 += AbstractC2092a4.g0(c2264u4.d(i11));
                }
                this.f16685a.U(i10);
                while (i9 < c2264u4.size()) {
                    this.f16685a.H(c2264u4.d(i9));
                    i9++;
                }
                return;
            }
            while (i9 < c2264u4.size()) {
                this.f16685a.K(i8, c2264u4.d(i9));
                i9++;
            }
            return;
        }
        if (z8) {
            this.f16685a.V(i8, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC2092a4.g0(((Integer) list.get(i13)).intValue());
            }
            this.f16685a.U(i12);
            while (i9 < list.size()) {
                this.f16685a.H(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16685a.K(i8, ((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void I(int i8, List list) {
        int i9 = 0;
        if (list instanceof F4) {
            F4 f42 = (F4) list;
            while (i9 < list.size()) {
                Object a9 = f42.a(i9);
                if (a9 instanceof String) {
                    this.f16685a.q(i8, (String) a9);
                } else {
                    this.f16685a.n(i8, (J3) a9);
                }
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16685a.q(i8, (String) list.get(i9));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void J(int i8, int i9) {
        this.f16685a.l(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void K(int i8, long j8) {
        this.f16685a.q0(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void L(int i8, List list, boolean z8) {
        if (list instanceof AbstractC2233q4) {
            android.support.v4.media.a.a(list);
            if (z8) {
                this.f16685a.V(i8, 2);
                throw null;
            }
            throw null;
        }
        int i9 = 0;
        if (z8) {
            this.f16685a.V(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += AbstractC2092a4.d(((Float) list.get(i11)).floatValue());
            }
            this.f16685a.U(i10);
            while (i9 < list.size()) {
                this.f16685a.G(((Float) list.get(i9)).floatValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16685a.J(i8, ((Float) list.get(i9)).floatValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void M(int i8, int i9) {
        this.f16685a.y0(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void N(int i8, long j8) {
        this.f16685a.L(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void O(int i8, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.f16685a.n(i8, (J3) list.get(i9));
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void a(int i8) {
        this.f16685a.V(i8, 4);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void b(int i8, boolean z8) {
        this.f16685a.r(i8, z8);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void c(int i8, List list, boolean z8) {
        int i9 = 0;
        if (list instanceof C2264u4) {
            C2264u4 c2264u4 = (C2264u4) list;
            if (z8) {
                this.f16685a.V(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < c2264u4.size(); i11++) {
                    i10 += AbstractC2092a4.k0(c2264u4.d(i11));
                }
                this.f16685a.U(i10);
                while (i9 < c2264u4.size()) {
                    this.f16685a.k(c2264u4.d(i9));
                    i9++;
                }
                return;
            }
            while (i9 < c2264u4.size()) {
                this.f16685a.l(i8, c2264u4.d(i9));
                i9++;
            }
            return;
        }
        if (z8) {
            this.f16685a.V(i8, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC2092a4.k0(((Integer) list.get(i13)).intValue());
            }
            this.f16685a.U(i12);
            while (i9 < list.size()) {
                this.f16685a.k(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16685a.l(i8, ((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void d(int i8, List list, InterfaceC2210n5 interfaceC2210n5) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            F(i8, list.get(i9), interfaceC2210n5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void e(int i8, long j8) {
        this.f16685a.L(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void f(int i8) {
        this.f16685a.V(i8, 3);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void g(int i8, O4 o42, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f16685a.V(i8, 2);
            this.f16685a.U(P4.a(o42, entry.getKey(), entry.getValue()));
            P4.b(this.f16685a, o42, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void h(int i8, int i9) {
        this.f16685a.l(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void i(int i8, List list, boolean z8) {
        if (list instanceof H3) {
            android.support.v4.media.a.a(list);
            if (z8) {
                this.f16685a.V(i8, 2);
                throw null;
            }
            throw null;
        }
        int i9 = 0;
        if (z8) {
            this.f16685a.V(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += AbstractC2092a4.h(((Boolean) list.get(i11)).booleanValue());
            }
            this.f16685a.U(i10);
            while (i9 < list.size()) {
                this.f16685a.O(((Boolean) list.get(i9)).booleanValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16685a.r(i8, ((Boolean) list.get(i9)).booleanValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void j(int i8, J3 j32) {
        this.f16685a.n(i8, j32);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void k(int i8, List list, boolean z8) {
        int i9 = 0;
        if (list instanceof I4) {
            I4 i42 = (I4) list;
            if (z8) {
                this.f16685a.V(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < i42.size(); i11++) {
                    i10 += AbstractC2092a4.a0(i42.f(i11));
                }
                this.f16685a.U(i10);
                while (i9 < i42.size()) {
                    this.f16685a.N(i42.f(i9));
                    i9++;
                }
                return;
            }
            while (i9 < i42.size()) {
                this.f16685a.L(i8, i42.f(i9));
                i9++;
            }
            return;
        }
        if (z8) {
            this.f16685a.V(i8, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC2092a4.a0(((Long) list.get(i13)).longValue());
            }
            this.f16685a.U(i12);
            while (i9 < list.size()) {
                this.f16685a.N(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16685a.L(i8, ((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void l(int i8, List list, InterfaceC2210n5 interfaceC2210n5) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            D(i8, list.get(i9), interfaceC2210n5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void m(int i8, int i9) {
        this.f16685a.K(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void n(int i8, long j8) {
        this.f16685a.m(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void o(int i8, Object obj) {
        if (obj instanceof J3) {
            this.f16685a.M(i8, (J3) obj);
        } else {
            this.f16685a.o(i8, (Y4) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void p(int i8, List list, boolean z8) {
        int i9 = 0;
        if (list instanceof C2264u4) {
            C2264u4 c2264u4 = (C2264u4) list;
            if (z8) {
                this.f16685a.V(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < c2264u4.size(); i11++) {
                    i10 += AbstractC2092a4.X(c2264u4.d(i11));
                }
                this.f16685a.U(i10);
                while (i9 < c2264u4.size()) {
                    this.f16685a.H(c2264u4.d(i9));
                    i9++;
                }
                return;
            }
            while (i9 < c2264u4.size()) {
                this.f16685a.K(i8, c2264u4.d(i9));
                i9++;
            }
            return;
        }
        if (z8) {
            this.f16685a.V(i8, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC2092a4.X(((Integer) list.get(i13)).intValue());
            }
            this.f16685a.U(i12);
            while (i9 < list.size()) {
                this.f16685a.H(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16685a.K(i8, ((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void q(int i8, List list, boolean z8) {
        int i9 = 0;
        if (list instanceof I4) {
            I4 i42 = (I4) list;
            if (z8) {
                this.f16685a.V(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < i42.size(); i11++) {
                    i10 += AbstractC2092a4.j0(i42.f(i11));
                }
                this.f16685a.U(i10);
                while (i9 < i42.size()) {
                    this.f16685a.r0(i42.f(i9));
                    i9++;
                }
                return;
            }
            while (i9 < i42.size()) {
                this.f16685a.q0(i8, i42.f(i9));
                i9++;
            }
            return;
        }
        if (z8) {
            this.f16685a.V(i8, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC2092a4.j0(((Long) list.get(i13)).longValue());
            }
            this.f16685a.U(i12);
            while (i9 < list.size()) {
                this.f16685a.r0(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16685a.q0(i8, ((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void r(int i8, List list, boolean z8) {
        if (list instanceof AbstractC2110c4) {
            android.support.v4.media.a.a(list);
            if (z8) {
                this.f16685a.V(i8, 2);
                throw null;
            }
            throw null;
        }
        int i9 = 0;
        if (z8) {
            this.f16685a.V(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += AbstractC2092a4.c(((Double) list.get(i11)).doubleValue());
            }
            this.f16685a.U(i10);
            while (i9 < list.size()) {
                this.f16685a.F(((Double) list.get(i9)).doubleValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16685a.I(i8, ((Double) list.get(i9)).doubleValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void s(int i8, String str) {
        this.f16685a.q(i8, str);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void t(int i8, List list, boolean z8) {
        int i9 = 0;
        if (list instanceof I4) {
            I4 i42 = (I4) list;
            if (z8) {
                this.f16685a.V(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < i42.size(); i11++) {
                    i10 += AbstractC2092a4.f0(i42.f(i11));
                }
                this.f16685a.U(i10);
                while (i9 < i42.size()) {
                    this.f16685a.s(i42.f(i9));
                    i9++;
                }
                return;
            }
            while (i9 < i42.size()) {
                this.f16685a.m(i8, i42.f(i9));
                i9++;
            }
            return;
        }
        if (z8) {
            this.f16685a.V(i8, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC2092a4.f0(((Long) list.get(i13)).longValue());
            }
            this.f16685a.U(i12);
            while (i9 < list.size()) {
                this.f16685a.s(((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16685a.m(i8, ((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void u(int i8, List list, boolean z8) {
        int i9 = 0;
        if (list instanceof C2264u4) {
            C2264u4 c2264u4 = (C2264u4) list;
            if (z8) {
                this.f16685a.V(i8, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < c2264u4.size(); i11++) {
                    i10 += AbstractC2092a4.o0(c2264u4.d(i11));
                }
                this.f16685a.U(i10);
                while (i9 < c2264u4.size()) {
                    this.f16685a.x0(c2264u4.d(i9));
                    i9++;
                }
                return;
            }
            while (i9 < c2264u4.size()) {
                this.f16685a.y0(i8, c2264u4.d(i9));
                i9++;
            }
            return;
        }
        if (z8) {
            this.f16685a.V(i8, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC2092a4.o0(((Integer) list.get(i13)).intValue());
            }
            this.f16685a.U(i12);
            while (i9 < list.size()) {
                this.f16685a.x0(((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.f16685a.y0(i8, ((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void v(int i8, int i9) {
        this.f16685a.K(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final int w() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void x(int i8, long j8) {
        this.f16685a.m(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void y(int i8, double d8) {
        this.f16685a.I(i8, d8);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void z(int i8, float f8) {
        this.f16685a.J(i8, f8);
    }
}
