package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.q2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2231q2 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final C2231q2 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private InterfaceC2288x4 zze = AbstractC2240r4.B();
    private InterfaceC2288x4 zzf = AbstractC2240r4.B();
    private B4 zzg = AbstractC2240r4.C();
    private B4 zzh = AbstractC2240r4.C();

    /* renamed from: com.google.android.gms.internal.measurement.q2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        public final a A(Iterable iterable) {
            n();
            C2231q2.Q((C2231q2) this.f16958b, iterable);
            return this;
        }

        public final a q() {
            n();
            C2231q2.G((C2231q2) this.f16958b);
            return this;
        }

        public final a r(Iterable iterable) {
            n();
            C2231q2.H((C2231q2) this.f16958b, iterable);
            return this;
        }

        public final a s() {
            n();
            C2231q2.J((C2231q2) this.f16958b);
            return this;
        }

        public final a t(Iterable iterable) {
            n();
            C2231q2.K((C2231q2) this.f16958b, iterable);
            return this;
        }

        public final a w() {
            n();
            C2231q2.M((C2231q2) this.f16958b);
            return this;
        }

        public final a x(Iterable iterable) {
            n();
            C2231q2.N((C2231q2) this.f16958b, iterable);
            return this;
        }

        public final a y() {
            n();
            C2231q2.P((C2231q2) this.f16958b);
            return this;
        }

        private a() {
            super(C2231q2.zzc);
        }
    }

    static {
        C2231q2 c2231q2 = new C2231q2();
        zzc = c2231q2;
        AbstractC2240r4.r(C2231q2.class, c2231q2);
    }

    private C2231q2() {
    }

    static /* synthetic */ void G(C2231q2 c2231q2) {
        c2231q2.zzg = AbstractC2240r4.C();
    }

    static /* synthetic */ void H(C2231q2 c2231q2, Iterable iterable) {
        B4 b42 = c2231q2.zzg;
        if (!b42.b()) {
            c2231q2.zzg = AbstractC2240r4.n(b42);
        }
        B3.f(iterable, c2231q2.zzg);
    }

    static /* synthetic */ void J(C2231q2 c2231q2) {
        c2231q2.zzf = AbstractC2240r4.B();
    }

    static /* synthetic */ void K(C2231q2 c2231q2, Iterable iterable) {
        InterfaceC2288x4 interfaceC2288x4 = c2231q2.zzf;
        if (!interfaceC2288x4.b()) {
            c2231q2.zzf = AbstractC2240r4.m(interfaceC2288x4);
        }
        B3.f(iterable, c2231q2.zzf);
    }

    static /* synthetic */ void M(C2231q2 c2231q2) {
        c2231q2.zzh = AbstractC2240r4.C();
    }

    static /* synthetic */ void N(C2231q2 c2231q2, Iterable iterable) {
        B4 b42 = c2231q2.zzh;
        if (!b42.b()) {
            c2231q2.zzh = AbstractC2240r4.n(b42);
        }
        B3.f(iterable, c2231q2.zzh);
    }

    static /* synthetic */ void P(C2231q2 c2231q2) {
        c2231q2.zze = AbstractC2240r4.B();
    }

    static /* synthetic */ void Q(C2231q2 c2231q2, Iterable iterable) {
        InterfaceC2288x4 interfaceC2288x4 = c2231q2.zze;
        if (!interfaceC2288x4.b()) {
            c2231q2.zze = AbstractC2240r4.m(interfaceC2288x4);
        }
        B3.f(iterable, c2231q2.zze);
    }

    public static a R() {
        return (a) zzc.w();
    }

    public static C2231q2 T() {
        return zzc;
    }

    public final int I() {
        return this.zzf.size();
    }

    public final int L() {
        return this.zzh.size();
    }

    public final int O() {
        return this.zze.size();
    }

    public final List U() {
        return this.zzg;
    }

    public final List V() {
        return this.zzf;
    }

    public final List W() {
        return this.zzh;
    }

    public final List X() {
        return this.zze;
    }

    public final int j() {
        return this.zzg.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2117d2.f16684a[i8 - 1]) {
            case 1:
                return new C2231q2();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C2162i2.class, "zzh", C2238r2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (C2231q2.class) {
                        try {
                            interfaceC2138f5 = zzd;
                            if (interfaceC2138f5 == null) {
                                interfaceC2138f5 = new AbstractC2240r4.a(zzc);
                                zzd = interfaceC2138f5;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC2138f5;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
