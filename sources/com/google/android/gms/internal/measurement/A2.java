package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;
import java.util.List;

/* loaded from: classes3.dex */
public final class A2 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final A2 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private B4 zzf = AbstractC2240r4.C();
    private C2294y2 zzg;

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        private a() {
            super(A2.zzc);
        }
    }

    static {
        A2 a22 = new A2();
        zzc = a22;
        AbstractC2240r4.r(A2.class, a22);
    }

    private A2() {
    }

    public final C2294y2 G() {
        C2294y2 c2294y2 = this.zzg;
        if (c2294y2 == null) {
            return C2294y2.H();
        }
        return c2294y2;
    }

    public final List I() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (D2.f16271a[i8 - 1]) {
            case 1:
                return new A2();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", B2.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (A2.class) {
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
