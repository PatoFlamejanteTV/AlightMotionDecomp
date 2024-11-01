package com.google.android.gms.internal.measurement;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.r4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2240r4 extends B3 {
    private static Map<Class<?>, AbstractC2240r4> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected C5 zzb = C5.k();

    /* renamed from: com.google.android.gms.internal.measurement.r4$a */
    /* loaded from: classes3.dex */
    protected static class a extends E3 {
        public a(AbstractC2240r4 abstractC2240r4) {
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.r4$b */
    /* loaded from: classes3.dex */
    public static abstract class b extends C3 {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC2240r4 f16957a;

        /* renamed from: b, reason: collision with root package name */
        protected AbstractC2240r4 f16958b;

        /* JADX INFO: Access modifiers changed from: protected */
        public b(AbstractC2240r4 abstractC2240r4) {
            this.f16957a = abstractC2240r4;
            if (!abstractC2240r4.F()) {
                this.f16958b = abstractC2240r4.y();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private static void j(Object obj, Object obj2) {
            C2183k5.a().c(obj).e(obj, obj2);
        }

        private final b p(byte[] bArr, int i8, int i9, C2128e4 c2128e4) {
            if (!this.f16958b.F()) {
                o();
            }
            try {
                C2183k5.a().c(this.f16958b).g(this.f16958b, bArr, 0, i9, new I3(c2128e4));
                return this;
            } catch (A4 e8) {
                throw e8;
            } catch (IOException e9) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e9);
            } catch (IndexOutOfBoundsException unused) {
                throw A4.g();
            }
        }

        @Override // com.google.android.gms.internal.measurement.C3
        public /* synthetic */ Object clone() {
            b bVar = (b) this.f16957a.o(c.f16963e, null, null);
            bVar.f16958b = (AbstractC2240r4) u();
            return bVar;
        }

        @Override // com.google.android.gms.internal.measurement.C3
        public final /* synthetic */ C3 e(byte[] bArr, int i8, int i9) {
            return p(bArr, 0, i9, C2128e4.f16711c);
        }

        @Override // com.google.android.gms.internal.measurement.C3
        public final /* synthetic */ C3 f(byte[] bArr, int i8, int i9, C2128e4 c2128e4) {
            return p(bArr, 0, i9, c2128e4);
        }

        public final b i(AbstractC2240r4 abstractC2240r4) {
            if (this.f16957a.equals(abstractC2240r4)) {
                return this;
            }
            if (!this.f16958b.F()) {
                o();
            }
            j(this.f16958b, abstractC2240r4);
            return this;
        }

        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public final AbstractC2240r4 m() {
            AbstractC2240r4 abstractC2240r4 = (AbstractC2240r4) u();
            if (AbstractC2240r4.s(abstractC2240r4, true)) {
                return abstractC2240r4;
            }
            throw new A5(abstractC2240r4);
        }

        @Override // com.google.android.gms.internal.measurement.X4
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public AbstractC2240r4 u() {
            if (!this.f16958b.F()) {
                return this.f16958b;
            }
            this.f16958b.D();
            return this.f16958b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void n() {
            if (!this.f16958b.F()) {
                o();
            }
        }

        protected void o() {
            AbstractC2240r4 y8 = this.f16957a.y();
            j(y8, this.f16958b);
            this.f16958b = y8;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.r4$c */
    /* loaded from: classes3.dex */
    public enum c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f16959a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f16960b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f16961c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f16962d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f16963e = 5;

        /* renamed from: f, reason: collision with root package name */
        public static final int f16964f = 6;

        /* renamed from: g, reason: collision with root package name */
        public static final int f16965g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ int[] f16966h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) f16966h.clone();
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.r4$d */
    /* loaded from: classes3.dex */
    public static class d extends AbstractC2137f4 {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static InterfaceC2304z4 A() {
        return C2264u4.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static InterfaceC2288x4 B() {
        return I4.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static B4 C() {
        return C2174j5.g();
    }

    private final int j() {
        return C2183k5.a().c(this).d(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC2240r4 l(Class cls) {
        AbstractC2240r4 abstractC2240r4 = zzc.get(cls);
        if (abstractC2240r4 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2240r4 = zzc.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (abstractC2240r4 == null) {
            abstractC2240r4 = (AbstractC2240r4) ((AbstractC2240r4) E5.b(cls)).o(c.f16964f, null, null);
            if (abstractC2240r4 != null) {
                zzc.put(cls, abstractC2240r4);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC2240r4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static InterfaceC2288x4 m(InterfaceC2288x4 interfaceC2288x4) {
        return interfaceC2288x4.a(interfaceC2288x4.size() << 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static B4 n(B4 b42) {
        return b42.a(b42.size() << 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object p(Y4 y42, String str, Object[] objArr) {
        return new C2192l5(y42, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object q(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e8);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void r(Class cls, AbstractC2240r4 abstractC2240r4) {
        abstractC2240r4.E();
        zzc.put(cls, abstractC2240r4);
    }

    protected static final boolean s(AbstractC2240r4 abstractC2240r4, boolean z8) {
        Object obj;
        byte byteValue = ((Byte) abstractC2240r4.o(c.f16959a, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b9 = C2183k5.a().c(abstractC2240r4).b(abstractC2240r4);
        if (z8) {
            int i8 = c.f16960b;
            if (b9) {
                obj = abstractC2240r4;
            } else {
                obj = null;
            }
            abstractC2240r4.o(i8, obj, null);
        }
        return b9;
    }

    private final int t(InterfaceC2210n5 interfaceC2210n5) {
        if (interfaceC2210n5 == null) {
            return C2183k5.a().c(this).a(this);
        }
        return interfaceC2210n5.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D() {
        C2183k5.a().c(this).c(this);
        E();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean F() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.Y4
    public final void a(AbstractC2092a4 abstractC2092a4) {
        C2183k5.a().c(this).f(this, C2119d4.P(abstractC2092a4));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2093a5
    public final /* synthetic */ Y4 b() {
        return (AbstractC2240r4) o(c.f16964f, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.Y4
    public final /* synthetic */ X4 c() {
        return (b) o(c.f16963e, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.Y4
    public final int d() {
        return e(null);
    }

    @Override // com.google.android.gms.internal.measurement.B3
    final int e(InterfaceC2210n5 interfaceC2210n5) {
        if (F()) {
            int t8 = t(interfaceC2210n5);
            if (t8 >= 0) {
                return t8;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + t8);
        }
        if (g() != Integer.MAX_VALUE) {
            return g();
        }
        int t9 = t(interfaceC2210n5);
        h(t9);
        return t9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C2183k5.a().c(this).h(this, (AbstractC2240r4) obj);
    }

    @Override // com.google.android.gms.internal.measurement.B3
    final int g() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.B3
    final void h(int i8) {
        if (i8 >= 0) {
            this.zzd = (i8 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i8);
        }
    }

    public int hashCode() {
        if (F()) {
            return j();
        }
        if (this.zza == 0) {
            this.zza = j();
        }
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b k(AbstractC2240r4 abstractC2240r4) {
        return w().i(abstractC2240r4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object o(int i8, Object obj, Object obj2);

    public String toString() {
        return Z4.a(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b w() {
        return (b) o(c.f16963e, null, null);
    }

    public final b x() {
        return ((b) o(c.f16963e, null, null)).i(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final AbstractC2240r4 y() {
        return (AbstractC2240r4) o(c.f16962d, null, null);
    }
}
