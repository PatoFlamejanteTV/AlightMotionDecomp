package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;

/* loaded from: classes3.dex */
public final class R1 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final R1 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        public final boolean A() {
            return ((R1) this.f16958b).N();
        }

        public final int q() {
            return ((R1) this.f16958b).j();
        }

        public final a r(String str) {
            n();
            R1.G((R1) this.f16958b, str);
            return this;
        }

        public final String s() {
            return ((R1) this.f16958b).I();
        }

        public final boolean t() {
            return ((R1) this.f16958b).J();
        }

        public final boolean w() {
            return ((R1) this.f16958b).K();
        }

        public final boolean x() {
            return ((R1) this.f16958b).L();
        }

        public final boolean y() {
            return ((R1) this.f16958b).M();
        }

        private a() {
            super(R1.zzc);
        }
    }

    static {
        R1 r12 = new R1();
        zzc = r12;
        AbstractC2240r4.r(R1.class, r12);
    }

    private R1() {
    }

    static /* synthetic */ void G(R1 r12, String str) {
        str.getClass();
        r12.zze |= 1;
        r12.zzf = str;
    }

    public final String I() {
        return this.zzf;
    }

    public final boolean J() {
        return this.zzg;
    }

    public final boolean K() {
        return this.zzh;
    }

    public final boolean L() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean M() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean N() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.zzi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (Z1.f16565a[i8 - 1]) {
            case 1:
                return new R1();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (R1.class) {
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
