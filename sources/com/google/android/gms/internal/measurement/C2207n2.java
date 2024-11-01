package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;
import com.google.android.gms.internal.measurement.C2215o2;
import j$.util.DesugarCollections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.n2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2207n2 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final C2207n2 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private B4 zzf = AbstractC2240r4.C();
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    /* renamed from: com.google.android.gms.internal.measurement.n2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        public final String A() {
            return ((C2207n2) this.f16958b).P();
        }

        public final List B() {
            return DesugarCollections.unmodifiableList(((C2207n2) this.f16958b).R());
        }

        public final int q() {
            return ((C2207n2) this.f16958b).j();
        }

        public final a r(C2215o2.a aVar) {
            n();
            C2207n2.I((C2207n2) this.f16958b, (C2215o2) ((AbstractC2240r4) aVar.m()));
            return this;
        }

        public final a s(Iterable iterable) {
            n();
            C2207n2.J((C2207n2) this.f16958b, iterable);
            return this;
        }

        public final a t(String str) {
            n();
            C2207n2.K((C2207n2) this.f16958b, str);
            return this;
        }

        public final C2215o2 w(int i8) {
            return ((C2207n2) this.f16958b).H(0);
        }

        public final a x() {
            n();
            C2207n2.M((C2207n2) this.f16958b);
            return this;
        }

        public final a y(String str) {
            n();
            C2207n2.N((C2207n2) this.f16958b, str);
            return this;
        }

        private a() {
            super(C2207n2.zzc);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.n2$b */
    /* loaded from: classes3.dex */
    public enum b implements InterfaceC2280w4 {
        SDK(0),
        SGTM(1);


        /* renamed from: a, reason: collision with root package name */
        private final int f16894a;

        b(int i8) {
            this.f16894a = i8;
        }

        public static b a(int i8) {
            if (i8 != 0) {
                if (i8 != 1) {
                    return null;
                }
                return SGTM;
            }
            return SDK;
        }

        public static InterfaceC2272v4 b() {
            return C2278w2.f17062a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f16894a + " name=" + name() + '>';
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2280w4
        public final int w() {
            return this.f16894a;
        }
    }

    static {
        C2207n2 c2207n2 = new C2207n2();
        zzc = c2207n2;
        AbstractC2240r4.r(C2207n2.class, c2207n2);
    }

    private C2207n2() {
    }

    public static a G(C2207n2 c2207n2) {
        return (a) zzc.k(c2207n2);
    }

    static /* synthetic */ void I(C2207n2 c2207n2, C2215o2 c2215o2) {
        c2215o2.getClass();
        c2207n2.U();
        c2207n2.zzf.add(c2215o2);
    }

    static /* synthetic */ void J(C2207n2 c2207n2, Iterable iterable) {
        c2207n2.U();
        B3.f(iterable, c2207n2.zzf);
    }

    static /* synthetic */ void K(C2207n2 c2207n2, String str) {
        str.getClass();
        c2207n2.zze |= 1;
        c2207n2.zzg = str;
    }

    public static a L() {
        return (a) zzc.w();
    }

    static /* synthetic */ void M(C2207n2 c2207n2) {
        c2207n2.zzf = AbstractC2240r4.C();
    }

    static /* synthetic */ void N(C2207n2 c2207n2, String str) {
        str.getClass();
        c2207n2.zze |= 2;
        c2207n2.zzh = str;
    }

    private final void U() {
        B4 b42 = this.zzf;
        if (!b42.b()) {
            this.zzf = AbstractC2240r4.n(b42);
        }
    }

    public final C2215o2 H(int i8) {
        return (C2215o2) this.zzf.get(0);
    }

    public final String P() {
        return this.zzg;
    }

    public final String Q() {
        return this.zzh;
    }

    public final List R() {
        return this.zzf;
    }

    public final boolean S() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.zzf.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2117d2.f16684a[i8 - 1]) {
            case 1:
                return new C2207n2();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", C2215o2.class, "zzg", "zzh", "zzi", b.b()});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (C2207n2.class) {
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
