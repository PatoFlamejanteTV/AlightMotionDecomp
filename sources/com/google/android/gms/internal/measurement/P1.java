package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;
import java.util.List;

/* loaded from: classes3.dex */
public final class P1 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final P1 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private boolean zzi;
    private B4 zzf = AbstractC2240r4.C();
    private B4 zzg = AbstractC2240r4.C();
    private B4 zzh = AbstractC2240r4.C();
    private B4 zzj = AbstractC2240r4.C();

    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4 implements InterfaceC2093a5 {
        private static final a zzc;
        private static volatile InterfaceC2138f5 zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* renamed from: com.google.android.gms.internal.measurement.P1$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0378a extends AbstractC2240r4.b implements InterfaceC2093a5 {
            private C0378a() {
                super(a.zzc);
            }
        }

        static {
            a aVar = new a();
            zzc = aVar;
            AbstractC2240r4.r(a.class, aVar);
        }

        private a() {
        }

        public final d H() {
            d a9 = d.a(this.zzg);
            if (a9 == null) {
                return d.CONSENT_STATUS_UNSPECIFIED;
            }
            return a9;
        }

        public final e I() {
            e a9 = e.a(this.zzf);
            if (a9 == null) {
                return e.CONSENT_TYPE_UNSPECIFIED;
            }
            return a9;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
        public final Object o(int i8, Object obj, Object obj2) {
            switch (Z1.f16565a[i8 - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0378a();
                case 3:
                    return AbstractC2240r4.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.b(), "zzg", d.b()});
                case 4:
                    return zzc;
                case 5:
                    InterfaceC2138f5 interfaceC2138f5 = zzd;
                    if (interfaceC2138f5 == null) {
                        synchronized (a.class) {
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

    /* loaded from: classes3.dex */
    public static final class b extends AbstractC2240r4.b implements InterfaceC2093a5 {
        private b() {
            super(P1.zzc);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends AbstractC2240r4 implements InterfaceC2093a5 {
        private static final c zzc;
        private static volatile InterfaceC2138f5 zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* loaded from: classes3.dex */
        public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
            private a() {
                super(c.zzc);
            }
        }

        static {
            c cVar = new c();
            zzc = cVar;
            AbstractC2240r4.r(c.class, cVar);
        }

        private c() {
        }

        public final e H() {
            e a9 = e.a(this.zzg);
            if (a9 == null) {
                return e.CONSENT_TYPE_UNSPECIFIED;
            }
            return a9;
        }

        public final e I() {
            e a9 = e.a(this.zzf);
            if (a9 == null) {
                return e.CONSENT_TYPE_UNSPECIFIED;
            }
            return a9;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
        public final Object o(int i8, Object obj, Object obj2) {
            switch (Z1.f16565a[i8 - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a();
                case 3:
                    return AbstractC2240r4.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.b(), "zzg", e.b()});
                case 4:
                    return zzc;
                case 5:
                    InterfaceC2138f5 interfaceC2138f5 = zzd;
                    if (interfaceC2138f5 == null) {
                        synchronized (c.class) {
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

    /* loaded from: classes3.dex */
    public enum d implements InterfaceC2280w4 {
        CONSENT_STATUS_UNSPECIFIED(0),
        GRANTED(1),
        DENIED(2);


        /* renamed from: a, reason: collision with root package name */
        private final int f16416a;

        d(int i8) {
            this.f16416a = i8;
        }

        public static d a(int i8) {
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        return null;
                    }
                    return DENIED;
                }
                return GRANTED;
            }
            return CONSENT_STATUS_UNSPECIFIED;
        }

        public static InterfaceC2272v4 b() {
            return C2090a2.f16572a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f16416a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2280w4
        public final int w() {
            return this.f16416a;
        }
    }

    /* loaded from: classes3.dex */
    public enum e implements InterfaceC2280w4 {
        CONSENT_TYPE_UNSPECIFIED(0),
        AD_STORAGE(1),
        ANALYTICS_STORAGE(2),
        AD_USER_DATA(3),
        AD_PERSONALIZATION(4);


        /* renamed from: a, reason: collision with root package name */
        private final int f16423a;

        e(int i8) {
            this.f16423a = i8;
        }

        public static e a(int i8) {
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                return null;
                            }
                            return AD_PERSONALIZATION;
                        }
                        return AD_USER_DATA;
                    }
                    return ANALYTICS_STORAGE;
                }
                return AD_STORAGE;
            }
            return CONSENT_TYPE_UNSPECIFIED;
        }

        public static InterfaceC2272v4 b() {
            return C2099b2.f16584a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f16423a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2280w4
        public final int w() {
            return this.f16423a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class f extends AbstractC2240r4 implements InterfaceC2093a5 {
        private static final f zzc;
        private static volatile InterfaceC2138f5 zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        /* loaded from: classes3.dex */
        public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
            private a() {
                super(f.zzc);
            }
        }

        static {
            f fVar = new f();
            zzc = fVar;
            AbstractC2240r4.r(f.class, fVar);
        }

        private f() {
        }

        public final String H() {
            return this.zzf;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
        public final Object o(int i8, Object obj, Object obj2) {
            switch (Z1.f16565a[i8 - 1]) {
                case 1:
                    return new f();
                case 2:
                    return new a();
                case 3:
                    return AbstractC2240r4.p(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    InterfaceC2138f5 interfaceC2138f5 = zzd;
                    if (interfaceC2138f5 == null) {
                        synchronized (f.class) {
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

    static {
        P1 p12 = new P1();
        zzc = p12;
        AbstractC2240r4.r(P1.class, p12);
    }

    private P1() {
    }

    public static P1 H() {
        return zzc;
    }

    public final List I() {
        return this.zzh;
    }

    public final List J() {
        return this.zzf;
    }

    public final List K() {
        return this.zzg;
    }

    public final List L() {
        return this.zzj;
    }

    public final boolean M() {
        return this.zzi;
    }

    public final boolean N() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (Z1.f16565a[i8 - 1]) {
            case 1:
                return new P1();
            case 2:
                return new b();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", a.class, "zzg", c.class, "zzh", f.class, "zzi", "zzj", a.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (P1.class) {
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
