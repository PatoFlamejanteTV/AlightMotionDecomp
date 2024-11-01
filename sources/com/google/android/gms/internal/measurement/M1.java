package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;
import java.util.List;

/* loaded from: classes3.dex */
public final class M1 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final M1 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private B4 zzi = AbstractC2240r4.C();

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        private a() {
            super(M1.zzc);
        }
    }

    /* loaded from: classes3.dex */
    public enum b implements InterfaceC2280w4 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);


        /* renamed from: a, reason: collision with root package name */
        private final int f16394a;

        b(int i8) {
            this.f16394a = i8;
        }

        public static b a(int i8) {
            switch (i8) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        public static InterfaceC2272v4 b() {
            return O1.f16411a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f16394a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2280w4
        public final int w() {
            return this.f16394a;
        }
    }

    static {
        M1 m12 = new M1();
        zzc = m12;
        AbstractC2240r4.r(M1.class, m12);
    }

    private M1() {
    }

    public static M1 I() {
        return zzc;
    }

    public final b G() {
        b a9 = b.a(this.zzf);
        if (a9 == null) {
            return b.UNKNOWN_MATCH_TYPE;
        }
        return a9;
    }

    public final String J() {
        return this.zzg;
    }

    public final List K() {
        return this.zzi;
    }

    public final boolean L() {
        return this.zzh;
    }

    public final boolean M() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean N() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean O() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.zzi.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (G1.f16307a[i8 - 1]) {
            case 1:
                return new M1();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", b.b(), "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (M1.class) {
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
