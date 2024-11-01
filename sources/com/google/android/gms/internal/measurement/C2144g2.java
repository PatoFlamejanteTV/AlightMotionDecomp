package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;

/* renamed from: com.google.android.gms.internal.measurement.g2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2144g2 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final C2144g2 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    /* renamed from: com.google.android.gms.internal.measurement.g2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        public final a q(boolean z8) {
            n();
            C2144g2.H((C2144g2) this.f16958b, z8);
            return this;
        }

        public final a r(boolean z8) {
            n();
            C2144g2.J((C2144g2) this.f16958b, z8);
            return this;
        }

        public final a s(boolean z8) {
            n();
            C2144g2.L((C2144g2) this.f16958b, z8);
            return this;
        }

        public final a t(boolean z8) {
            n();
            C2144g2.M((C2144g2) this.f16958b, z8);
            return this;
        }

        public final a w(boolean z8) {
            n();
            C2144g2.O((C2144g2) this.f16958b, z8);
            return this;
        }

        public final a x(boolean z8) {
            n();
            C2144g2.Q((C2144g2) this.f16958b, z8);
            return this;
        }

        public final a y(boolean z8) {
            n();
            C2144g2.S((C2144g2) this.f16958b, z8);
            return this;
        }

        private a() {
            super(C2144g2.zzc);
        }
    }

    static {
        C2144g2 c2144g2 = new C2144g2();
        zzc = c2144g2;
        AbstractC2240r4.r(C2144g2.class, c2144g2);
    }

    private C2144g2() {
    }

    public static a G() {
        return (a) zzc.w();
    }

    static /* synthetic */ void H(C2144g2 c2144g2, boolean z8) {
        c2144g2.zze |= 32;
        c2144g2.zzk = z8;
    }

    static /* synthetic */ void J(C2144g2 c2144g2, boolean z8) {
        c2144g2.zze |= 16;
        c2144g2.zzj = z8;
    }

    public static C2144g2 K() {
        return zzc;
    }

    static /* synthetic */ void L(C2144g2 c2144g2, boolean z8) {
        c2144g2.zze |= 1;
        c2144g2.zzf = z8;
    }

    static /* synthetic */ void M(C2144g2 c2144g2, boolean z8) {
        c2144g2.zze |= 64;
        c2144g2.zzl = z8;
    }

    static /* synthetic */ void O(C2144g2 c2144g2, boolean z8) {
        c2144g2.zze |= 2;
        c2144g2.zzg = z8;
    }

    static /* synthetic */ void Q(C2144g2 c2144g2, boolean z8) {
        c2144g2.zze |= 4;
        c2144g2.zzh = z8;
    }

    static /* synthetic */ void S(C2144g2 c2144g2, boolean z8) {
        c2144g2.zze |= 8;
        c2144g2.zzi = z8;
    }

    public final boolean N() {
        return this.zzk;
    }

    public final boolean P() {
        return this.zzj;
    }

    public final boolean R() {
        return this.zzf;
    }

    public final boolean T() {
        return this.zzl;
    }

    public final boolean U() {
        return this.zzg;
    }

    public final boolean V() {
        return this.zzh;
    }

    public final boolean W() {
        return this.zzi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2117d2.f16684a[i8 - 1]) {
            case 1:
                return new C2144g2();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (C2144g2.class) {
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
