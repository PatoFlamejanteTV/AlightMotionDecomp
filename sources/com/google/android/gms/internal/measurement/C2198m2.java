package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;

/* renamed from: com.google.android.gms.internal.measurement.m2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2198m2 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final C2198m2 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private C2135f2 zzh;

    /* renamed from: com.google.android.gms.internal.measurement.m2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        private a() {
            super(C2198m2.zzc);
        }
    }

    static {
        C2198m2 c2198m2 = new C2198m2();
        zzc = c2198m2;
        AbstractC2240r4.r(C2198m2.class, c2198m2);
    }

    private C2198m2() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2117d2.f16684a[i8 - 1]) {
            case 1:
                return new C2198m2();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (C2198m2.class) {
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
