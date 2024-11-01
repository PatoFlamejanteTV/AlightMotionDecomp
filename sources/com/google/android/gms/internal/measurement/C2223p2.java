package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;
import com.google.android.gms.internal.measurement.C2180k2;

/* renamed from: com.google.android.gms.internal.measurement.p2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2223p2 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final C2223p2 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private int zzf = 1;
    private B4 zzg = AbstractC2240r4.C();

    /* renamed from: com.google.android.gms.internal.measurement.p2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        public final a q(C2180k2.a aVar) {
            n();
            C2223p2.H((C2223p2) this.f16958b, (C2180k2) ((AbstractC2240r4) aVar.m()));
            return this;
        }

        private a() {
            super(C2223p2.zzc);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.p2$b */
    /* loaded from: classes3.dex */
    public enum b implements InterfaceC2280w4 {
        RADS(1),
        PROVISIONING(2);


        /* renamed from: a, reason: collision with root package name */
        private final int f16931a;

        b(int i8) {
            this.f16931a = i8;
        }

        public static b a(int i8) {
            if (i8 != 1) {
                if (i8 != 2) {
                    return null;
                }
                return PROVISIONING;
            }
            return RADS;
        }

        public static InterfaceC2272v4 b() {
            return C2286x2.f17075a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f16931a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2280w4
        public final int w() {
            return this.f16931a;
        }
    }

    static {
        C2223p2 c2223p2 = new C2223p2();
        zzc = c2223p2;
        AbstractC2240r4.r(C2223p2.class, c2223p2);
    }

    private C2223p2() {
    }

    public static a G() {
        return (a) zzc.w();
    }

    static /* synthetic */ void H(C2223p2 c2223p2, C2180k2 c2180k2) {
        c2180k2.getClass();
        B4 b42 = c2223p2.zzg;
        if (!b42.b()) {
            c2223p2.zzg = AbstractC2240r4.n(b42);
        }
        c2223p2.zzg.add(c2180k2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2117d2.f16684a[i8 - 1]) {
            case 1:
                return new C2223p2();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", b.b(), "zzg", C2180k2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (C2223p2.class) {
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
