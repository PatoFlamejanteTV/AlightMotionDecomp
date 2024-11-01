package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;

/* renamed from: com.google.android.gms.internal.measurement.i2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2162i2 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final C2162i2 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private int zzf;
    private long zzg;

    /* renamed from: com.google.android.gms.internal.measurement.i2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        public final a q(int i8) {
            n();
            C2162i2.G((C2162i2) this.f16958b, i8);
            return this;
        }

        public final a r(long j8) {
            n();
            C2162i2.H((C2162i2) this.f16958b, j8);
            return this;
        }

        private a() {
            super(C2162i2.zzc);
        }
    }

    static {
        C2162i2 c2162i2 = new C2162i2();
        zzc = c2162i2;
        AbstractC2240r4.r(C2162i2.class, c2162i2);
    }

    private C2162i2() {
    }

    static /* synthetic */ void G(C2162i2 c2162i2, int i8) {
        c2162i2.zze |= 1;
        c2162i2.zzf = i8;
    }

    static /* synthetic */ void H(C2162i2 c2162i2, long j8) {
        c2162i2.zze |= 2;
        c2162i2.zzg = j8;
    }

    public static a J() {
        return (a) zzc.w();
    }

    public final long I() {
        return this.zzg;
    }

    public final boolean L() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean M() {
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
        switch (AbstractC2117d2.f16684a[i8 - 1]) {
            case 1:
                return new C2162i2();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (C2162i2.class) {
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
