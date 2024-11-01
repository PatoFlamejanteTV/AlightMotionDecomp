package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;
import com.google.android.gms.internal.measurement.C2231q2;

/* renamed from: com.google.android.gms.internal.measurement.h2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2153h2 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final C2153h2 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private int zzf;
    private C2231q2 zzg;
    private C2231q2 zzh;
    private boolean zzi;

    /* renamed from: com.google.android.gms.internal.measurement.h2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        public final a q(int i8) {
            n();
            C2153h2.G((C2153h2) this.f16958b, i8);
            return this;
        }

        public final a r(C2231q2.a aVar) {
            n();
            C2153h2.H((C2153h2) this.f16958b, (C2231q2) ((AbstractC2240r4) aVar.m()));
            return this;
        }

        public final a s(C2231q2 c2231q2) {
            n();
            C2153h2.K((C2153h2) this.f16958b, c2231q2);
            return this;
        }

        public final a t(boolean z8) {
            n();
            C2153h2.I((C2153h2) this.f16958b, z8);
            return this;
        }

        private a() {
            super(C2153h2.zzc);
        }
    }

    static {
        C2153h2 c2153h2 = new C2153h2();
        zzc = c2153h2;
        AbstractC2240r4.r(C2153h2.class, c2153h2);
    }

    private C2153h2() {
    }

    static /* synthetic */ void G(C2153h2 c2153h2, int i8) {
        c2153h2.zze |= 1;
        c2153h2.zzf = i8;
    }

    static /* synthetic */ void H(C2153h2 c2153h2, C2231q2 c2231q2) {
        c2231q2.getClass();
        c2153h2.zzg = c2231q2;
        c2153h2.zze |= 2;
    }

    static /* synthetic */ void I(C2153h2 c2153h2, boolean z8) {
        c2153h2.zze |= 8;
        c2153h2.zzi = z8;
    }

    public static a J() {
        return (a) zzc.w();
    }

    static /* synthetic */ void K(C2153h2 c2153h2, C2231q2 c2231q2) {
        c2231q2.getClass();
        c2153h2.zzh = c2231q2;
        c2153h2.zze |= 4;
    }

    public final C2231q2 M() {
        C2231q2 c2231q2 = this.zzg;
        if (c2231q2 == null) {
            return C2231q2.T();
        }
        return c2231q2;
    }

    public final C2231q2 N() {
        C2231q2 c2231q2 = this.zzh;
        if (c2231q2 == null) {
            return C2231q2.T();
        }
        return c2231q2;
    }

    public final boolean O() {
        return this.zzi;
    }

    public final boolean P() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Q() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean R() {
        if ((this.zze & 4) != 0) {
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
                return new C2153h2();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (C2153h2.class) {
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
