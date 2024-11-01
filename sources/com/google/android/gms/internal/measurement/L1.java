package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;

/* loaded from: classes3.dex */
public final class L1 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final L1 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private J1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        public final a q(String str) {
            n();
            L1.G((L1) this.f16958b, str);
            return this;
        }

        private a() {
            super(L1.zzc);
        }
    }

    static {
        L1 l12 = new L1();
        zzc = l12;
        AbstractC2240r4.r(L1.class, l12);
    }

    private L1() {
    }

    static /* synthetic */ void G(L1 l12, String str) {
        str.getClass();
        l12.zze |= 2;
        l12.zzg = str;
    }

    public static a I() {
        return (a) zzc.w();
    }

    public final J1 H() {
        J1 j12 = this.zzh;
        if (j12 == null) {
            return J1.I();
        }
        return j12;
    }

    public final String K() {
        return this.zzg;
    }

    public final boolean L() {
        return this.zzi;
    }

    public final boolean M() {
        return this.zzj;
    }

    public final boolean N() {
        return this.zzk;
    }

    public final boolean O() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        if ((this.zze & 32) != 0) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (G1.f16307a[i8 - 1]) {
            case 1:
                return new L1();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (L1.class) {
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
