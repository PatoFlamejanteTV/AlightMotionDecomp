package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;

/* renamed from: com.google.android.gms.internal.measurement.s2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2246s2 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final C2246s2 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    /* renamed from: com.google.android.gms.internal.measurement.s2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        public final a A() {
            n();
            C2246s2.Q((C2246s2) this.f16958b);
            return this;
        }

        public final a q() {
            n();
            C2246s2.H((C2246s2) this.f16958b);
            return this;
        }

        public final a r(double d8) {
            n();
            C2246s2.I((C2246s2) this.f16958b, d8);
            return this;
        }

        public final a s(long j8) {
            n();
            C2246s2.J((C2246s2) this.f16958b, j8);
            return this;
        }

        public final a t(String str) {
            n();
            C2246s2.K((C2246s2) this.f16958b, str);
            return this;
        }

        public final a w() {
            n();
            C2246s2.M((C2246s2) this.f16958b);
            return this;
        }

        public final a x(long j8) {
            n();
            C2246s2.N((C2246s2) this.f16958b, j8);
            return this;
        }

        public final a y(String str) {
            n();
            C2246s2.O((C2246s2) this.f16958b, str);
            return this;
        }

        private a() {
            super(C2246s2.zzc);
        }
    }

    static {
        C2246s2 c2246s2 = new C2246s2();
        zzc = c2246s2;
        AbstractC2240r4.r(C2246s2.class, c2246s2);
    }

    private C2246s2() {
    }

    static /* synthetic */ void H(C2246s2 c2246s2) {
        c2246s2.zze &= -33;
        c2246s2.zzk = 0.0d;
    }

    static /* synthetic */ void I(C2246s2 c2246s2, double d8) {
        c2246s2.zze |= 32;
        c2246s2.zzk = d8;
    }

    static /* synthetic */ void J(C2246s2 c2246s2, long j8) {
        c2246s2.zze |= 8;
        c2246s2.zzi = j8;
    }

    static /* synthetic */ void K(C2246s2 c2246s2, String str) {
        str.getClass();
        c2246s2.zze |= 2;
        c2246s2.zzg = str;
    }

    static /* synthetic */ void M(C2246s2 c2246s2) {
        c2246s2.zze &= -9;
        c2246s2.zzi = 0L;
    }

    static /* synthetic */ void N(C2246s2 c2246s2, long j8) {
        c2246s2.zze |= 1;
        c2246s2.zzf = j8;
    }

    static /* synthetic */ void O(C2246s2 c2246s2, String str) {
        str.getClass();
        c2246s2.zze |= 4;
        c2246s2.zzh = str;
    }

    static /* synthetic */ void Q(C2246s2 c2246s2) {
        c2246s2.zze &= -5;
        c2246s2.zzh = zzc.zzh;
    }

    public static a S() {
        return (a) zzc.w();
    }

    public final double G() {
        return this.zzk;
    }

    public final float L() {
        return this.zzj;
    }

    public final long P() {
        return this.zzi;
    }

    public final long R() {
        return this.zzf;
    }

    public final String U() {
        return this.zzg;
    }

    public final String V() {
        return this.zzh;
    }

    public final boolean W() {
        if ((this.zze & 32) != 0) {
            return true;
        }
        return false;
    }

    public final boolean X() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Y() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Z() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean a0() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2117d2.f16684a[i8 - 1]) {
            case 1:
                return new C2246s2();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (C2246s2.class) {
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
