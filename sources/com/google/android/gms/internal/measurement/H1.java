package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.L1;
import java.util.List;

/* loaded from: classes3.dex */
public final class H1 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final H1 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private int zzf;
    private B4 zzg = AbstractC2240r4.C();
    private B4 zzh = AbstractC2240r4.C();
    private boolean zzi;
    private boolean zzj;

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        public final int q() {
            return ((H1) this.f16958b).J();
        }

        public final a r(int i8, I1.a aVar) {
            n();
            H1.H((H1) this.f16958b, i8, (I1) ((AbstractC2240r4) aVar.m()));
            return this;
        }

        public final a s(int i8, L1.a aVar) {
            n();
            H1.I((H1) this.f16958b, i8, (L1) ((AbstractC2240r4) aVar.m()));
            return this;
        }

        public final I1 t(int i8) {
            return ((H1) this.f16958b).G(i8);
        }

        public final int w() {
            return ((H1) this.f16958b).L();
        }

        public final L1 x(int i8) {
            return ((H1) this.f16958b).K(i8);
        }

        private a() {
            super(H1.zzc);
        }
    }

    static {
        H1 h12 = new H1();
        zzc = h12;
        AbstractC2240r4.r(H1.class, h12);
    }

    private H1() {
    }

    static /* synthetic */ void H(H1 h12, int i8, I1 i12) {
        i12.getClass();
        B4 b42 = h12.zzh;
        if (!b42.b()) {
            h12.zzh = AbstractC2240r4.n(b42);
        }
        h12.zzh.set(i8, i12);
    }

    static /* synthetic */ void I(H1 h12, int i8, L1 l12) {
        l12.getClass();
        B4 b42 = h12.zzg;
        if (!b42.b()) {
            h12.zzg = AbstractC2240r4.n(b42);
        }
        h12.zzg.set(i8, l12);
    }

    public final I1 G(int i8) {
        return (I1) this.zzh.get(i8);
    }

    public final int J() {
        return this.zzh.size();
    }

    public final L1 K(int i8) {
        return (L1) this.zzg.get(i8);
    }

    public final int L() {
        return this.zzg.size();
    }

    public final List N() {
        return this.zzh;
    }

    public final List O() {
        return this.zzg;
    }

    public final boolean P() {
        if ((this.zze & 1) != 0) {
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
                return new H1();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", L1.class, "zzh", I1.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (H1.class) {
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
