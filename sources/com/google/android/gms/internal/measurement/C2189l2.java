package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2189l2 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final C2189l2 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private B4 zzk = AbstractC2240r4.C();

    /* renamed from: com.google.android.gms.internal.measurement.l2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        public final a A(String str) {
            n();
            C2189l2.P((C2189l2) this.f16958b, str);
            return this;
        }

        public final a B() {
            n();
            C2189l2.O((C2189l2) this.f16958b);
            return this;
        }

        public final a C() {
            n();
            C2189l2.R((C2189l2) this.f16958b);
            return this;
        }

        public final a D() {
            n();
            C2189l2.T((C2189l2) this.f16958b);
            return this;
        }

        public final String E() {
            return ((C2189l2) this.f16958b).W();
        }

        public final String F() {
            return ((C2189l2) this.f16958b).X();
        }

        public final int q() {
            return ((C2189l2) this.f16958b).Q();
        }

        public final a r(double d8) {
            n();
            C2189l2.I((C2189l2) this.f16958b, d8);
            return this;
        }

        public final a s(long j8) {
            n();
            C2189l2.J((C2189l2) this.f16958b, j8);
            return this;
        }

        public final a t(a aVar) {
            n();
            C2189l2.K((C2189l2) this.f16958b, (C2189l2) ((AbstractC2240r4) aVar.m()));
            return this;
        }

        public final a w(Iterable iterable) {
            n();
            C2189l2.L((C2189l2) this.f16958b, iterable);
            return this;
        }

        public final a x(String str) {
            n();
            C2189l2.M((C2189l2) this.f16958b, str);
            return this;
        }

        public final a y() {
            n();
            C2189l2.H((C2189l2) this.f16958b);
            return this;
        }

        private a() {
            super(C2189l2.zzc);
        }
    }

    static {
        C2189l2 c2189l2 = new C2189l2();
        zzc = c2189l2;
        AbstractC2240r4.r(C2189l2.class, c2189l2);
    }

    private C2189l2() {
    }

    static /* synthetic */ void H(C2189l2 c2189l2) {
        c2189l2.zze &= -17;
        c2189l2.zzj = 0.0d;
    }

    static /* synthetic */ void I(C2189l2 c2189l2, double d8) {
        c2189l2.zze |= 16;
        c2189l2.zzj = d8;
    }

    static /* synthetic */ void J(C2189l2 c2189l2, long j8) {
        c2189l2.zze |= 4;
        c2189l2.zzh = j8;
    }

    static /* synthetic */ void K(C2189l2 c2189l2, C2189l2 c2189l22) {
        c2189l22.getClass();
        c2189l2.e0();
        c2189l2.zzk.add(c2189l22);
    }

    static /* synthetic */ void L(C2189l2 c2189l2, Iterable iterable) {
        c2189l2.e0();
        B3.f(iterable, c2189l2.zzk);
    }

    static /* synthetic */ void M(C2189l2 c2189l2, String str) {
        str.getClass();
        c2189l2.zze |= 1;
        c2189l2.zzf = str;
    }

    static /* synthetic */ void O(C2189l2 c2189l2) {
        c2189l2.zze &= -5;
        c2189l2.zzh = 0L;
    }

    static /* synthetic */ void P(C2189l2 c2189l2, String str) {
        str.getClass();
        c2189l2.zze |= 2;
        c2189l2.zzg = str;
    }

    static /* synthetic */ void R(C2189l2 c2189l2) {
        c2189l2.zzk = AbstractC2240r4.C();
    }

    static /* synthetic */ void T(C2189l2 c2189l2) {
        c2189l2.zze &= -3;
        c2189l2.zzg = zzc.zzg;
    }

    public static a U() {
        return (a) zzc.w();
    }

    private final void e0() {
        B4 b42 = this.zzk;
        if (!b42.b()) {
            this.zzk = AbstractC2240r4.n(b42);
        }
    }

    public final double G() {
        return this.zzj;
    }

    public final float N() {
        return this.zzi;
    }

    public final int Q() {
        return this.zzk.size();
    }

    public final long S() {
        return this.zzh;
    }

    public final String W() {
        return this.zzf;
    }

    public final String X() {
        return this.zzg;
    }

    public final List Y() {
        return this.zzk;
    }

    public final boolean Z() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean a0() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean b0() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean c0() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean d0() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2117d2.f16684a[i8 - 1]) {
            case 1:
                return new C2189l2();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C2189l2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (C2189l2.class) {
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
