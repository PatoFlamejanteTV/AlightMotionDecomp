package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;

/* loaded from: classes3.dex */
public final class K1 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final K1 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        private a() {
            super(K1.zzc);
        }
    }

    /* loaded from: classes3.dex */
    public enum b implements InterfaceC2280w4 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);


        /* renamed from: a, reason: collision with root package name */
        private final int f16345a;

        b(int i8) {
            this.f16345a = i8;
        }

        public static b a(int i8) {
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                return null;
                            }
                            return BETWEEN;
                        }
                        return EQUAL;
                    }
                    return GREATER_THAN;
                }
                return LESS_THAN;
            }
            return UNKNOWN_COMPARISON_TYPE;
        }

        public static InterfaceC2272v4 b() {
            return N1.f16404a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f16345a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2280w4
        public final int w() {
            return this.f16345a;
        }
    }

    static {
        K1 k12 = new K1();
        zzc = k12;
        AbstractC2240r4.r(K1.class, k12);
    }

    private K1() {
    }

    public static K1 I() {
        return zzc;
    }

    public final b G() {
        b a9 = b.a(this.zzf);
        if (a9 == null) {
            return b.UNKNOWN_COMPARISON_TYPE;
        }
        return a9;
    }

    public final String J() {
        return this.zzh;
    }

    public final String K() {
        return this.zzj;
    }

    public final String L() {
        return this.zzi;
    }

    public final boolean M() {
        return this.zzg;
    }

    public final boolean N() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean O() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Q() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean R() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (G1.f16307a[i8 - 1]) {
            case 1:
                return new K1();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", b.b(), "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (K1.class) {
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
