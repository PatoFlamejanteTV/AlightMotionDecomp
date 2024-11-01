package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;
import java.util.List;

/* loaded from: classes3.dex */
public final class I1 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final I1 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private B4 zzh = AbstractC2240r4.C();
    private boolean zzi;
    private K1 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        public final int q() {
            return ((I1) this.f16958b).j();
        }

        public final a r(int i8, J1 j12) {
            n();
            I1.H((I1) this.f16958b, i8, j12);
            return this;
        }

        public final a s(String str) {
            n();
            I1.I((I1) this.f16958b, str);
            return this;
        }

        public final J1 t(int i8) {
            return ((I1) this.f16958b).G(i8);
        }

        public final String w() {
            return ((I1) this.f16958b).N();
        }

        private a() {
            super(I1.zzc);
        }
    }

    static {
        I1 i12 = new I1();
        zzc = i12;
        AbstractC2240r4.r(I1.class, i12);
    }

    private I1() {
    }

    static /* synthetic */ void H(I1 i12, int i8, J1 j12) {
        j12.getClass();
        B4 b42 = i12.zzh;
        if (!b42.b()) {
            i12.zzh = AbstractC2240r4.n(b42);
        }
        i12.zzh.set(i8, j12);
    }

    static /* synthetic */ void I(I1 i12, String str) {
        str.getClass();
        i12.zze |= 2;
        i12.zzg = str;
    }

    public static a K() {
        return (a) zzc.w();
    }

    public final J1 G(int i8) {
        return (J1) this.zzh.get(i8);
    }

    public final int J() {
        return this.zzf;
    }

    public final K1 M() {
        K1 k12 = this.zzj;
        if (k12 == null) {
            return K1.I();
        }
        return k12;
    }

    public final String N() {
        return this.zzg;
    }

    public final List O() {
        return this.zzh;
    }

    public final boolean P() {
        return this.zzk;
    }

    public final boolean Q() {
        return this.zzl;
    }

    public final boolean R() {
        return this.zzm;
    }

    public final boolean S() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean U() {
        if ((this.zze & 64) != 0) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.zzh.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (G1.f16307a[i8 - 1]) {
            case 1:
                return new I1();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", J1.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (I1.class) {
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
