package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;

/* loaded from: classes3.dex */
public final class Q1 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final Q1 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private String zzf = "";
    private B4 zzg = AbstractC2240r4.C();
    private boolean zzh;

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        private a() {
            super(Q1.zzc);
        }
    }

    static {
        Q1 q12 = new Q1();
        zzc = q12;
        AbstractC2240r4.r(Q1.class, q12);
    }

    private Q1() {
    }

    public final String H() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (Z1.f16565a[i8 - 1]) {
            case 1:
                return new Q1();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", V1.class, "zzh"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (Q1.class) {
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
