package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2302z2 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final C2302z2 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private String zzf = "";
    private B4 zzg = AbstractC2240r4.C();

    /* renamed from: com.google.android.gms.internal.measurement.z2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        private a() {
            super(C2302z2.zzc);
        }
    }

    static {
        C2302z2 c2302z2 = new C2302z2();
        zzc = c2302z2;
        AbstractC2240r4.r(C2302z2.class, c2302z2);
    }

    private C2302z2() {
    }

    public final String H() {
        return this.zzf;
    }

    public final List I() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (D2.f16271a[i8 - 1]) {
            case 1:
                return new C2302z2();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", B2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (C2302z2.class) {
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
