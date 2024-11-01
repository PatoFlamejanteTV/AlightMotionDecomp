package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;
import com.google.android.gms.internal.measurement.R1;
import j$.util.DesugarCollections;
import java.util.List;

/* loaded from: classes3.dex */
public final class S1 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final S1 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private P1 zzr;
    private U1 zzs;
    private X1 zzt;
    private V1 zzu;
    private T1 zzv;
    private String zzg = "";
    private B4 zzi = AbstractC2240r4.C();
    private B4 zzj = AbstractC2240r4.C();
    private B4 zzk = AbstractC2240r4.C();
    private String zzl = "";
    private B4 zzn = AbstractC2240r4.C();
    private B4 zzo = AbstractC2240r4.C();
    private String zzp = "";
    private String zzq = "";

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        public final int q() {
            return ((S1) this.f16958b).J();
        }

        public final R1 r(int i8) {
            return ((S1) this.f16958b).G(i8);
        }

        public final a s(int i8, R1.a aVar) {
            n();
            S1.I((S1) this.f16958b, i8, (R1) ((AbstractC2240r4) aVar.m()));
            return this;
        }

        public final a t() {
            n();
            S1.H((S1) this.f16958b);
            return this;
        }

        public final String w() {
            return ((S1) this.f16958b).R();
        }

        public final List x() {
            return DesugarCollections.unmodifiableList(((S1) this.f16958b).S());
        }

        public final List y() {
            return DesugarCollections.unmodifiableList(((S1) this.f16958b).T());
        }

        private a() {
            super(S1.zzc);
        }
    }

    static {
        S1 s12 = new S1();
        zzc = s12;
        AbstractC2240r4.r(S1.class, s12);
    }

    private S1() {
    }

    static /* synthetic */ void H(S1 s12) {
        s12.zzk = AbstractC2240r4.C();
    }

    static /* synthetic */ void I(S1 s12, int i8, R1 r12) {
        r12.getClass();
        B4 b42 = s12.zzj;
        if (!b42.b()) {
            s12.zzj = AbstractC2240r4.n(b42);
        }
        s12.zzj.set(i8, r12);
    }

    public static a M() {
        return (a) zzc.w();
    }

    public static S1 O() {
        return zzc;
    }

    public final R1 G(int i8) {
        return (R1) this.zzj.get(i8);
    }

    public final int J() {
        return this.zzj.size();
    }

    public final long K() {
        return this.zzf;
    }

    public final P1 L() {
        P1 p12 = this.zzr;
        if (p12 == null) {
            return P1.H();
        }
        return p12;
    }

    public final X1 P() {
        X1 x12 = this.zzt;
        if (x12 == null) {
            return X1.H();
        }
        return x12;
    }

    public final String Q() {
        return this.zzg;
    }

    public final String R() {
        return this.zzp;
    }

    public final List S() {
        return this.zzk;
    }

    public final List T() {
        return this.zzo;
    }

    public final List U() {
        return this.zzn;
    }

    public final List V() {
        return this.zzi;
    }

    public final boolean W() {
        if ((this.zze & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean X() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Y() {
        if ((this.zze & 512) != 0) {
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

    public final int j() {
        return this.zzn.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (Z1.f16565a[i8 - 1]) {
            case 1:
                return new S1();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", W1.class, "zzj", R1.class, "zzk", H1.class, "zzl", "zzm", "zzn", A2.class, "zzo", Q1.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (S1.class) {
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
