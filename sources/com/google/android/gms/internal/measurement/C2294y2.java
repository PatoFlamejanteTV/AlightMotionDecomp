package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.y2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2294y2 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final C2294y2 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private B4 zze = AbstractC2240r4.C();

    /* renamed from: com.google.android.gms.internal.measurement.y2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        private a() {
            super(C2294y2.zzc);
        }
    }

    static {
        C2294y2 c2294y2 = new C2294y2();
        zzc = c2294y2;
        AbstractC2240r4.r(C2294y2.class, c2294y2);
    }

    private C2294y2() {
    }

    public static C2294y2 H() {
        return zzc;
    }

    public final List I() {
        return this.zze;
    }

    public final int j() {
        return this.zze.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (D2.f16271a[i8 - 1]) {
            case 1:
                return new C2294y2();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C2302z2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (C2294y2.class) {
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
