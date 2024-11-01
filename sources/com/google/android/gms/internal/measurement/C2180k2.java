package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;

/* renamed from: com.google.android.gms.internal.measurement.k2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2180k2 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final C2180k2 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    /* renamed from: com.google.android.gms.internal.measurement.k2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        public final a q(long j8) {
            n();
            C2180k2.H((C2180k2) this.f16958b, j8);
            return this;
        }

        public final a r(String str) {
            n();
            C2180k2.I((C2180k2) this.f16958b, str);
            return this;
        }

        private a() {
            super(C2180k2.zzc);
        }
    }

    static {
        C2180k2 c2180k2 = new C2180k2();
        zzc = c2180k2;
        AbstractC2240r4.r(C2180k2.class, c2180k2);
    }

    private C2180k2() {
    }

    public static a G() {
        return (a) zzc.w();
    }

    static /* synthetic */ void H(C2180k2 c2180k2, long j8) {
        c2180k2.zze |= 2;
        c2180k2.zzg = j8;
    }

    static /* synthetic */ void I(C2180k2 c2180k2, String str) {
        str.getClass();
        c2180k2.zze |= 1;
        c2180k2.zzf = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2117d2.f16684a[i8 - 1]) {
            case 1:
                return new C2180k2();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (C2180k2.class) {
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
