package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2240r4;
import com.google.android.gms.internal.measurement.C2189l2;
import j$.util.DesugarCollections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2171j2 extends AbstractC2240r4 implements InterfaceC2093a5 {
    private static final C2171j2 zzc;
    private static volatile InterfaceC2138f5 zzd;
    private int zze;
    private B4 zzf = AbstractC2240r4.C();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    /* renamed from: com.google.android.gms.internal.measurement.j2$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2240r4.b implements InterfaceC2093a5 {
        public final a A(Iterable iterable) {
            n();
            C2171j2.M((C2171j2) this.f16958b, iterable);
            return this;
        }

        public final a B(String str) {
            n();
            C2171j2.N((C2171j2) this.f16958b, str);
            return this;
        }

        public final long C() {
            return ((C2171j2) this.f16958b).Q();
        }

        public final a D(long j8) {
            n();
            C2171j2.P((C2171j2) this.f16958b, j8);
            return this;
        }

        public final C2189l2 E(int i8) {
            return ((C2171j2) this.f16958b).G(i8);
        }

        public final long F() {
            return ((C2171j2) this.f16958b).R();
        }

        public final a G() {
            n();
            C2171j2.H((C2171j2) this.f16958b);
            return this;
        }

        public final String H() {
            return ((C2171j2) this.f16958b).U();
        }

        public final List I() {
            return DesugarCollections.unmodifiableList(((C2171j2) this.f16958b).V());
        }

        public final boolean J() {
            return ((C2171j2) this.f16958b).Y();
        }

        public final int q() {
            return ((C2171j2) this.f16958b).O();
        }

        public final a r(int i8) {
            n();
            C2171j2.I((C2171j2) this.f16958b, i8);
            return this;
        }

        public final a s(int i8, C2189l2.a aVar) {
            n();
            C2171j2.J((C2171j2) this.f16958b, i8, (C2189l2) ((AbstractC2240r4) aVar.m()));
            return this;
        }

        public final a t(int i8, C2189l2 c2189l2) {
            n();
            C2171j2.J((C2171j2) this.f16958b, i8, c2189l2);
            return this;
        }

        public final a w(long j8) {
            n();
            C2171j2.K((C2171j2) this.f16958b, j8);
            return this;
        }

        public final a x(C2189l2.a aVar) {
            n();
            C2171j2.L((C2171j2) this.f16958b, (C2189l2) ((AbstractC2240r4) aVar.m()));
            return this;
        }

        public final a y(C2189l2 c2189l2) {
            n();
            C2171j2.L((C2171j2) this.f16958b, c2189l2);
            return this;
        }

        private a() {
            super(C2171j2.zzc);
        }
    }

    static {
        C2171j2 c2171j2 = new C2171j2();
        zzc = c2171j2;
        AbstractC2240r4.r(C2171j2.class, c2171j2);
    }

    private C2171j2() {
    }

    static /* synthetic */ void H(C2171j2 c2171j2) {
        c2171j2.zzf = AbstractC2240r4.C();
    }

    static /* synthetic */ void I(C2171j2 c2171j2, int i8) {
        c2171j2.Z();
        c2171j2.zzf.remove(i8);
    }

    static /* synthetic */ void J(C2171j2 c2171j2, int i8, C2189l2 c2189l2) {
        c2189l2.getClass();
        c2171j2.Z();
        c2171j2.zzf.set(i8, c2189l2);
    }

    static /* synthetic */ void K(C2171j2 c2171j2, long j8) {
        c2171j2.zze |= 4;
        c2171j2.zzi = j8;
    }

    static /* synthetic */ void L(C2171j2 c2171j2, C2189l2 c2189l2) {
        c2189l2.getClass();
        c2171j2.Z();
        c2171j2.zzf.add(c2189l2);
    }

    static /* synthetic */ void M(C2171j2 c2171j2, Iterable iterable) {
        c2171j2.Z();
        B3.f(iterable, c2171j2.zzf);
    }

    static /* synthetic */ void N(C2171j2 c2171j2, String str) {
        str.getClass();
        c2171j2.zze |= 1;
        c2171j2.zzg = str;
    }

    static /* synthetic */ void P(C2171j2 c2171j2, long j8) {
        c2171j2.zze |= 2;
        c2171j2.zzh = j8;
    }

    public static a S() {
        return (a) zzc.w();
    }

    private final void Z() {
        B4 b42 = this.zzf;
        if (!b42.b()) {
            this.zzf = AbstractC2240r4.n(b42);
        }
    }

    public final C2189l2 G(int i8) {
        return (C2189l2) this.zzf.get(i8);
    }

    public final int O() {
        return this.zzf.size();
    }

    public final long Q() {
        return this.zzi;
    }

    public final long R() {
        return this.zzh;
    }

    public final String U() {
        return this.zzg;
    }

    public final List V() {
        return this.zzf;
    }

    public final boolean W() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean X() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Y() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.zzj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2240r4
    public final Object o(int i8, Object obj, Object obj2) {
        switch (AbstractC2117d2.f16684a[i8 - 1]) {
            case 1:
                return new C2171j2();
            case 2:
                return new a();
            case 3:
                return AbstractC2240r4.p(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C2189l2.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC2138f5 interfaceC2138f5 = zzd;
                if (interfaceC2138f5 == null) {
                    synchronized (C2171j2.class) {
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
