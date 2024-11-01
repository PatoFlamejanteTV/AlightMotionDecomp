package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;

/* renamed from: com.google.android.gms.internal.measurement.e2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2126e2 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final C2126e2 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private long zzi;
    private long zzm;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    /* renamed from: com.google.android.gms.internal.measurement.e2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        public final a A(String str) {
            n();
            C2126e2.Q((C2126e2) this.f16958b, str);
            return this;
        }

        public final a B() {
            n();
            C2126e2.L((C2126e2) this.f16958b);
            return this;
        }

        public final a C(String str) {
            n();
            C2126e2.T((C2126e2) this.f16958b, str);
            return this;
        }

        public final a D() {
            n();
            C2126e2.P((C2126e2) this.f16958b);
            return this;
        }

        public final a E(String str) {
            n();
            C2126e2.W((C2126e2) this.f16958b, str);
            return this;
        }

        public final a F() {
            n();
            C2126e2.S((C2126e2) this.f16958b);
            return this;
        }

        public final a G(String str) {
            n();
            C2126e2.Z((C2126e2) this.f16958b, str);
            return this;
        }

        public final a H() {
            n();
            C2126e2.V((C2126e2) this.f16958b);
            return this;
        }

        public final a I() {
            n();
            C2126e2.Y((C2126e2) this.f16958b);
            return this;
        }

        public final long q() {
            return ((C2126e2) this.f16958b).G();
        }

        public final a r(long j8) {
            n();
            C2126e2.I((C2126e2) this.f16958b, j8);
            return this;
        }

        public final a s(String str) {
            n();
            C2126e2.J((C2126e2) this.f16958b, str);
            return this;
        }

        public final long t() {
            return ((C2126e2) this.f16958b).K();
        }

        public final a w(long j8) {
            n();
            C2126e2.M((C2126e2) this.f16958b, j8);
            return this;
        }

        public final a x(String str) {
            n();
            C2126e2.N((C2126e2) this.f16958b, str);
            return this;
        }

        public final a y() {
            n();
            C2126e2.H((C2126e2) this.f16958b);
            return this;
        }

        private a() {
            super(C2126e2.zzc);
        }
    }

    static {
        C2126e2 c2126e2 = new C2126e2();
        zzc = c2126e2;
        AbstractC2240r4.r(C2126e2.class, c2126e2);
    }

    private C2126e2() {
    }

    static /* synthetic */ void H(C2126e2 c2126e2) {
        c2126e2.zze &= -5;
        c2126e2.zzh = zzc.zzh;
    }

    static /* synthetic */ void I(C2126e2 c2126e2, long j8) {
        c2126e2.zze |= 8;
        c2126e2.zzi = j8;
    }

    static /* synthetic */ void J(C2126e2 c2126e2, String str) {
        str.getClass();
        c2126e2.zze |= 4;
        c2126e2.zzh = str;
    }

    static /* synthetic */ void L(C2126e2 c2126e2) {
        c2126e2.zze &= -3;
        c2126e2.zzg = zzc.zzg;
    }

    static /* synthetic */ void M(C2126e2 c2126e2, long j8) {
        c2126e2.zze |= 128;
        c2126e2.zzm = j8;
    }

    static /* synthetic */ void N(C2126e2 c2126e2, String str) {
        str.getClass();
        c2126e2.zze |= 2;
        c2126e2.zzg = str;
    }

    public static a O() {
        return (a) zzc.w();
    }

    static /* synthetic */ void P(C2126e2 c2126e2) {
        c2126e2.zze &= -2;
        c2126e2.zzf = zzc.zzf;
    }

    static /* synthetic */ void Q(C2126e2 c2126e2, String str) {
        str.getClass();
        c2126e2.zze |= 1;
        c2126e2.zzf = str;
    }

    static /* synthetic */ void S(C2126e2 c2126e2) {
        c2126e2.zze &= -65;
        c2126e2.zzl = zzc.zzl;
    }

    static /* synthetic */ void T(C2126e2 c2126e2, String str) {
        str.getClass();
        c2126e2.zze |= 64;
        c2126e2.zzl = str;
    }

    public static C2126e2 U() {
        return zzc;
    }

    static /* synthetic */ void V(C2126e2 c2126e2) {
        c2126e2.zze &= -33;
        c2126e2.zzk = zzc.zzk;
    }

    static /* synthetic */ void W(C2126e2 c2126e2, String str) {
        str.getClass();
        c2126e2.zze |= 32;
        c2126e2.zzk = str;
    }

    static /* synthetic */ void Y(C2126e2 c2126e2) {
        c2126e2.zze &= -17;
        c2126e2.zzj = zzc.zzj;
    }

    static /* synthetic */ void Z(C2126e2 c2126e2, String str) {
        str.getClass();
        c2126e2.zze |= 16;
        c2126e2.zzj = str;
    }

    public final long G() {
        return this.zzi;
    }

    public final long K() {
        return this.zzm;
    }

    public final String X() {
        return this.zzh;
    }

    public final String a0() {
        return this.zzg;
    }

    public final String b0() {
        return this.zzf;
    }

    public final String c0() {
        return this.zzl;
    }

    public final String d0() {
        return this.zzk;
    }

    public final String e0() {
        return this.zzj;
    }

    public final boolean f0() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean g0() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h0() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i0() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean j0() {
        if ((this.zze & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k0() {
        if ((this.zze & 64) != 0) {
            return true;
        }
        return false;
    }

    public final boolean l0() {
        if ((this.zze & 32) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m0() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2117d2.f16684a[i8 - 1]) {
            case 1:
                return new C2126e2();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (C2126e2.class) {
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
