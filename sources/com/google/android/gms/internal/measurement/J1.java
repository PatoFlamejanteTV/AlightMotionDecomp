package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;

/* loaded from: classes3.dex */
public final class J1 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final J1 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private M1 zzf;
    private K1 zzg;
    private boolean zzh;
    private String zzi = "";

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        public final a q(String str) {
            n();
            J1.H((J1) this.f16958b, str);
            return this;
        }

        private a() {
            super(J1.zzc);
        }
    }

    static {
        J1 j12 = new J1();
        zzc = j12;
        AbstractC2240r4.r(J1.class, j12);
    }

    private J1() {
    }

    static /* synthetic */ void H(J1 j12, String str) {
        str.getClass();
        j12.zze |= 8;
        j12.zzi = str;
    }

    public static J1 I() {
        return zzc;
    }

    public final K1 J() {
        K1 k12 = this.zzg;
        if (k12 == null) {
            return K1.I();
        }
        return k12;
    }

    public final M1 K() {
        M1 m12 = this.zzf;
        if (m12 == null) {
            return M1.I();
        }
        return m12;
    }

    public final String L() {
        return this.zzi;
    }

    public final boolean M() {
        return this.zzh;
    }

    public final boolean N() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean O() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Q() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (G1.f16307a[i8 - 1]) {
            case 1:
                return new J1();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (J1.class) {
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
