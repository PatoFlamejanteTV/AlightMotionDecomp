package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.r2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2238r2 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final C2238r2 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private int zzf;
    private InterfaceC2288x4 zzg = AbstractC2240r4.B();

    /* renamed from: com.google.android.gms.internal.measurement.r2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        public final a q(int i8) {
            n();
            C2238r2.H((C2238r2) this.f16958b, i8);
            return this;
        }

        public final a r(Iterable iterable) {
            n();
            C2238r2.I((C2238r2) this.f16958b, iterable);
            return this;
        }

        private a() {
            super(C2238r2.zzc);
        }
    }

    static {
        C2238r2 c2238r2 = new C2238r2();
        zzc = c2238r2;
        AbstractC2240r4.r(C2238r2.class, c2238r2);
    }

    private C2238r2() {
    }

    static /* synthetic */ void H(C2238r2 c2238r2, int i8) {
        c2238r2.zze |= 1;
        c2238r2.zzf = i8;
    }

    static /* synthetic */ void I(C2238r2 c2238r2, Iterable iterable) {
        InterfaceC2288x4 interfaceC2288x4 = c2238r2.zzg;
        if (!interfaceC2288x4.b()) {
            c2238r2.zzg = AbstractC2240r4.m(interfaceC2288x4);
        }
        B3.f(iterable, c2238r2.zzg);
    }

    public static a K() {
        return (a) zzc.w();
    }

    public final long G(int i8) {
        return this.zzg.f(i8);
    }

    public final int J() {
        return this.zzf;
    }

    public final List M() {
        return this.zzg;
    }

    public final boolean N() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.zzg.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2117d2.f16684a[i8 - 1]) {
            case 1:
                return new C2238r2();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (C2238r2.class) {
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
