package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;
import java.util.List;

/* loaded from: classes3.dex */
public final class B2 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final B2 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private int zzf;
    private B4 zzg = AbstractC2240r4.C();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    /* loaded from: classes3.dex */
    public enum a implements InterfaceC2280w4 {
        UNKNOWN(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        STATEMENT(4);


        /* renamed from: a, reason: collision with root package name */
        private final int f16238a;

        a(int i8) {
            this.f16238a = i8;
        }

        public static a a(int i8) {
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                return null;
                            }
                            return STATEMENT;
                        }
                        return BOOLEAN;
                    }
                    return NUMBER;
                }
                return STRING;
            }
            return UNKNOWN;
        }

        public static InterfaceC2272v4 b() {
            return F2.f16296a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f16238a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2280w4
        public final int w() {
            return this.f16238a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends AbstractC2240r4.b implements InterfaceC2093a5 {
        private b() {
            super(B2.zzc);
        }
    }

    static {
        B2 b22 = new B2();
        zzc = b22;
        AbstractC2240r4.r(B2.class, b22);
    }

    private B2() {
    }

    public final double G() {
        return this.zzk;
    }

    public final a H() {
        a a9 = a.a(this.zzf);
        if (a9 == null) {
            return a.UNKNOWN;
        }
        return a9;
    }

    public final String J() {
        return this.zzh;
    }

    public final String K() {
        return this.zzi;
    }

    public final List L() {
        return this.zzg;
    }

    public final boolean M() {
        return this.zzj;
    }

    public final boolean N() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean O() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (D2.f16271a[i8 - 1]) {
            case 1:
                return new B2();
            case 2:
                return new b();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", a.b(), "zzg", B2.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (B2.class) {
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
