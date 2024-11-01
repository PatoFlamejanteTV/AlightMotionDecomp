package j$.util.stream;

import j$.util.C3001g;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.stream.Collector;

/* renamed from: j$.util.stream.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3134z0 implements K3 {

    /* renamed from: a, reason: collision with root package name */
    private static final C3035e1 f33627a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final H0 f33628b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final J0 f33629c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final F0 f33630d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f33631e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    private static final long[] f33632f = new long[0];

    /* renamed from: g, reason: collision with root package name */
    private static final double[] f33633g = new double[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3134z0(EnumC3042f3 enumC3042f3) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long A(long j8, long j9, long j10) {
        if (j8 >= 0) {
            return Math.max(-1L, Math.min(j8 - j9, j10));
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long B(long j8, long j9) {
        long j10 = j9 >= 0 ? j8 + j9 : Long.MAX_VALUE;
        if (j10 >= 0) {
            return j10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Spliterator C(EnumC3042f3 enumC3042f3, Spliterator spliterator, long j8, long j9) {
        long j10 = j9 >= 0 ? j8 + j9 : Long.MAX_VALUE;
        long j11 = j10 >= 0 ? j10 : Long.MAX_VALUE;
        int i8 = AbstractC3136z2.f33634a[enumC3042f3.ordinal()];
        if (i8 == 1) {
            return new y3(spliterator, j8, j11);
        }
        if (i8 == 2) {
            return new x3((j$.util.Z) spliterator, j8, j11);
        }
        if (i8 == 3) {
            return new x3((j$.util.c0) spliterator, j8, j11);
        }
        if (i8 == 4) {
            return new x3((j$.util.W) spliterator, j8, j11);
        }
        throw new IllegalStateException("Unknown shape " + enumC3042f3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.stream.a3, j$.util.stream.D0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.O0, j$.util.stream.D0] */
    public static D0 D(long j8, IntFunction intFunction) {
        return (j8 < 0 || j8 >= 2147483639) ? new C3017a3() : new O0(j8, intFunction);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.function.LongFunction, j$.util.stream.R0, java.lang.Object] */
    public static L0 E(AbstractC3018b abstractC3018b, Spliterator spliterator, boolean z8, IntFunction intFunction) {
        long C8 = abstractC3018b.C(spliterator);
        if (C8 < 0 || !spliterator.hasCharacteristics(16384)) {
            ?? obj = new Object();
            obj.f33356a = intFunction;
            L0 l02 = (L0) new Q0(abstractC3018b, spliterator, obj, new C3068l(17), 3).invoke();
            return z8 ? N(l02, intFunction) : l02;
        }
        if (C8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) C8);
        new C3123w1(spliterator, abstractC3018b, objArr).invoke();
        return new O0(objArr);
    }

    public static F0 F(AbstractC3018b abstractC3018b, Spliterator spliterator, boolean z8) {
        long C8 = abstractC3018b.C(spliterator);
        if (C8 < 0 || !spliterator.hasCharacteristics(16384)) {
            F0 f02 = (F0) new Q0(abstractC3018b, spliterator, new C3068l(11), new C3068l(12), 0).invoke();
            return z8 ? O(f02) : f02;
        }
        if (C8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) C8];
        new C3109t1(spliterator, abstractC3018b, dArr).invoke();
        return new Y0(dArr);
    }

    public static H0 G(AbstractC3018b abstractC3018b, Spliterator spliterator, boolean z8) {
        long C8 = abstractC3018b.C(spliterator);
        if (C8 < 0 || !spliterator.hasCharacteristics(16384)) {
            H0 h02 = (H0) new Q0(abstractC3018b, spliterator, new C3068l(13), new C3068l(14), 1).invoke();
            return z8 ? P(h02) : h02;
        }
        if (C8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) C8];
        new C3114u1(spliterator, abstractC3018b, iArr).invoke();
        return new C3050h1(iArr);
    }

    public static J0 H(AbstractC3018b abstractC3018b, Spliterator spliterator, boolean z8) {
        long C8 = abstractC3018b.C(spliterator);
        if (C8 < 0 || !spliterator.hasCharacteristics(16384)) {
            J0 j02 = (J0) new Q0(abstractC3018b, spliterator, new C3068l(15), new C3068l(16), 2).invoke();
            return z8 ? Q(j02) : j02;
        }
        if (C8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) C8];
        new C3119v1(spliterator, abstractC3018b, jArr).invoke();
        return new C3095q1(jArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static N0 I(EnumC3042f3 enumC3042f3, L0 l02, L0 l03) {
        int i8 = M0.f33312a[enumC3042f3.ordinal()];
        if (i8 == 1) {
            return new N0(l02, l03);
        }
        if (i8 == 2) {
            return new N0((H0) l02, (H0) l03);
        }
        if (i8 == 3) {
            return new N0((J0) l02, (J0) l03);
        }
        if (i8 == 4) {
            return new N0((F0) l02, (F0) l03);
        }
        throw new IllegalStateException("Unknown shape " + enumC3042f3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.stream.Z2, j$.util.stream.A0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.Y0, j$.util.stream.A0] */
    public static A0 J(long j8) {
        return (j8 < 0 || j8 >= 2147483639) ? new Z2() : new Y0(j8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.G, j$.util.stream.b] */
    public static G K(j$.util.W w8) {
        return new AbstractC3018b(w8, EnumC3037e3.m(w8), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC3040f1 L(EnumC3042f3 enumC3042f3) {
        L0 l02;
        int i8 = M0.f33312a[enumC3042f3.ordinal()];
        if (i8 == 1) {
            return f33627a;
        }
        if (i8 == 2) {
            l02 = f33628b;
        } else if (i8 == 3) {
            l02 = f33629c;
        } else {
            if (i8 != 4) {
                throw new IllegalStateException("Unknown shape " + enumC3042f3);
            }
            l02 = f33630d;
        }
        return (AbstractC3040f1) l02;
    }

    private static int M(long j8) {
        return (j8 != -1 ? EnumC3037e3.f33490u : 0) | EnumC3037e3.f33489t;
    }

    public static L0 N(L0 l02, IntFunction intFunction) {
        if (l02.p() <= 0) {
            return l02;
        }
        long count = l02.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        new A1(l02, objArr, 1).invoke();
        return new O0(objArr);
    }

    public static F0 O(F0 f02) {
        if (f02.p() <= 0) {
            return f02;
        }
        long count = f02.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) count];
        new A1(f02, dArr, 0).invoke();
        return new Y0(dArr);
    }

    public static H0 P(H0 h02) {
        if (h02.p() <= 0) {
            return h02;
        }
        long count = h02.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) count];
        new A1(h02, iArr, 0).invoke();
        return new C3050h1(iArr);
    }

    public static J0 Q(J0 j02) {
        if (j02.p() <= 0) {
            return j02;
        }
        long count = j02.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) count];
        new A1(j02, jArr, 0).invoke();
        return new C3095q1(jArr);
    }

    public static Set R(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof EnumC3053i) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    EnumC3053i enumC3053i = (EnumC3053i) it.next();
                    hashSet.add(enumC3053i == null ? null : enumC3053i == EnumC3053i.CONCURRENT ? Collector.Characteristics.CONCURRENT : enumC3053i == EnumC3053i.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
                } catch (ClassCastException e8) {
                    C3001g.a("java.util.stream.Collector.Characteristics", e8);
                    throw null;
                }
            }
            return hashSet;
        }
        if (!(next instanceof Collector.Characteristics)) {
            C3001g.a("java.util.stream.Collector.Characteristics", next.getClass());
            throw null;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            try {
                Collector.Characteristics characteristics = (Collector.Characteristics) it2.next();
                hashSet.add(characteristics == null ? null : characteristics == Collector.Characteristics.CONCURRENT ? EnumC3053i.CONCURRENT : characteristics == Collector.Characteristics.UNORDERED ? EnumC3053i.UNORDERED : EnumC3053i.IDENTITY_FINISH);
            } catch (ClassCastException e9) {
                C3001g.a("java.util.stream.Collector.Characteristics", e9);
                throw null;
            }
        }
        return hashSet;
    }

    public static C3013a S(Function function) {
        C3013a c3013a = new C3013a(9);
        c3013a.f33434b = function;
        return c3013a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.stream.Z2, j$.util.stream.B0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.h1, j$.util.stream.B0] */
    public static B0 T(long j8) {
        return (j8 < 0 || j8 >= 2147483639) ? new Z2() : new C3050h1(j8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.IntStream, j$.util.stream.b] */
    public static IntStream U(j$.util.Z z8) {
        return new AbstractC3018b(z8, EnumC3037e3.m(z8), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.stream.Z2, j$.util.stream.C0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.q1, j$.util.stream.C0] */
    public static C0 V(long j8) {
        return (j8 < 0 || j8 >= 2147483639) ? new Z2() : new C3095q1(j8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.p0, j$.util.stream.b] */
    public static InterfaceC3089p0 W(j$.util.c0 c0Var) {
        return new AbstractC3018b(c0Var, EnumC3037e3.m(c0Var), false);
    }

    public static G X(AbstractC3018b abstractC3018b, long j8, long j9) {
        if (j8 >= 0) {
            return new C3132y2(abstractC3018b, M(j9), j8, j9);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j8);
    }

    public static C3126x0 Y(EnumC3122w0 enumC3122w0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC3122w0);
        return new C3126x0(EnumC3042f3.DOUBLE_VALUE, enumC3122w0, new C3094q0(enumC3122w0, 2));
    }

    public static IntStream Z(AbstractC3018b abstractC3018b, long j8, long j9) {
        if (j8 >= 0) {
            return new C3115u2(abstractC3018b, M(j9), j8, j9);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j8);
    }

    public static void a() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static C3126x0 a0(EnumC3122w0 enumC3122w0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC3122w0);
        return new C3126x0(EnumC3042f3.INT_VALUE, enumC3122w0, new C3094q0(enumC3122w0, 1));
    }

    public static InterfaceC3089p0 b0(AbstractC3018b abstractC3018b, long j8, long j9) {
        if (j8 >= 0) {
            return new C3124w2(abstractC3018b, M(j9), j8, j9);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j8);
    }

    public static C3126x0 c0(EnumC3122w0 enumC3122w0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC3122w0);
        return new C3126x0(EnumC3042f3.LONG_VALUE, enumC3122w0, new C3094q0(enumC3122w0, 0));
    }

    public static C3126x0 d0(EnumC3122w0 enumC3122w0, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(enumC3122w0);
        return new C3126x0(EnumC3042f3.REFERENCE, enumC3122w0, new C3073m(1, enumC3122w0, predicate));
    }

    public static void e(InterfaceC3081n2 interfaceC3081n2, Double d8) {
        if (N3.f33328a) {
            N3.a(interfaceC3081n2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC3081n2.accept(d8.doubleValue());
    }

    public static Stream e0(AbstractC3018b abstractC3018b, long j8, long j9) {
        if (j8 >= 0) {
            return new C3105s2(abstractC3018b, M(j9), j8, j9);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j8);
    }

    public static void g(InterfaceC3086o2 interfaceC3086o2, Integer num) {
        if (N3.f33328a) {
            N3.a(interfaceC3086o2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC3086o2.accept(num.intValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.Stream, j$.util.stream.b] */
    public static Stream g0(Spliterator spliterator, boolean z8) {
        Objects.requireNonNull(spliterator);
        return new AbstractC3018b(spliterator, EnumC3037e3.m(spliterator), z8);
    }

    public static void i(InterfaceC3091p2 interfaceC3091p2, Long l8) {
        if (N3.f33328a) {
            N3.a(interfaceC3091p2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC3091p2.accept(l8.longValue());
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Object[] m(K0 k02, IntFunction intFunction) {
        if (N3.f33328a) {
            N3.a(k02.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (k02.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) k02.count());
        k02.h(objArr, 0);
        return objArr;
    }

    public static void n(F0 f02, Double[] dArr, int i8) {
        if (N3.f33328a) {
            N3.a(f02.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) f02.d();
        for (int i9 = 0; i9 < dArr2.length; i9++) {
            dArr[i8 + i9] = Double.valueOf(dArr2[i9]);
        }
    }

    public static void o(H0 h02, Integer[] numArr, int i8) {
        if (N3.f33328a) {
            N3.a(h02.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) h02.d();
        for (int i9 = 0; i9 < iArr.length; i9++) {
            numArr[i8 + i9] = Integer.valueOf(iArr[i9]);
        }
    }

    public static void p(J0 j02, Long[] lArr, int i8) {
        if (N3.f33328a) {
            N3.a(j02.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) j02.d();
        for (int i9 = 0; i9 < jArr.length; i9++) {
            lArr[i8 + i9] = Long.valueOf(jArr[i9]);
        }
    }

    public static void q(F0 f02, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            f02.e((DoubleConsumer) consumer);
        } else {
            if (N3.f33328a) {
                N3.a(f02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.W) f02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void r(H0 h02, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            h02.e((IntConsumer) consumer);
        } else {
            if (N3.f33328a) {
                N3.a(h02.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.Z) h02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void s(J0 j02, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            j02.e((LongConsumer) consumer);
        } else {
            if (N3.f33328a) {
                N3.a(j02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.c0) j02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static F0 t(F0 f02, long j8, long j9) {
        if (j8 == 0 && j9 == f02.count()) {
            return f02;
        }
        long j10 = j9 - j8;
        j$.util.W w8 = (j$.util.W) f02.spliterator();
        A0 J8 = J(j10);
        J8.k(j10);
        for (int i8 = 0; i8 < j8 && w8.tryAdvance((DoubleConsumer) new E0(0)); i8++) {
        }
        if (j9 == f02.count()) {
            w8.forEachRemaining((DoubleConsumer) J8);
        } else {
            for (int i9 = 0; i9 < j10 && w8.tryAdvance((DoubleConsumer) J8); i9++) {
            }
        }
        J8.j();
        return J8.a();
    }

    public static H0 u(H0 h02, long j8, long j9) {
        if (j8 == 0 && j9 == h02.count()) {
            return h02;
        }
        long j10 = j9 - j8;
        j$.util.Z z8 = (j$.util.Z) h02.spliterator();
        B0 T8 = T(j10);
        T8.k(j10);
        for (int i8 = 0; i8 < j8 && z8.tryAdvance((IntConsumer) new G0(0)); i8++) {
        }
        if (j9 == h02.count()) {
            z8.forEachRemaining((IntConsumer) T8);
        } else {
            for (int i9 = 0; i9 < j10 && z8.tryAdvance((IntConsumer) T8); i9++) {
            }
        }
        T8.j();
        return T8.a();
    }

    public static J0 v(J0 j02, long j8, long j9) {
        if (j8 == 0 && j9 == j02.count()) {
            return j02;
        }
        long j10 = j9 - j8;
        j$.util.c0 c0Var = (j$.util.c0) j02.spliterator();
        C0 V8 = V(j10);
        V8.k(j10);
        for (int i8 = 0; i8 < j8 && c0Var.tryAdvance((LongConsumer) new I0(0)); i8++) {
        }
        if (j9 == j02.count()) {
            c0Var.forEachRemaining((LongConsumer) V8);
        } else {
            for (int i9 = 0; i9 < j10 && c0Var.tryAdvance((LongConsumer) V8); i9++) {
            }
        }
        V8.j();
        return V8.a();
    }

    public static L0 w(L0 l02, long j8, long j9, IntFunction intFunction) {
        if (j8 == 0 && j9 == l02.count()) {
            return l02;
        }
        Spliterator spliterator = l02.spliterator();
        long j10 = j9 - j8;
        D0 D8 = D(j10, intFunction);
        D8.k(j10);
        for (int i8 = 0; i8 < j8 && spliterator.tryAdvance(new C3039f0(7)); i8++) {
        }
        if (j9 == l02.count()) {
            spliterator.forEachRemaining(D8);
        } else {
            for (int i9 = 0; i9 < j10 && spliterator.tryAdvance(D8); i9++) {
            }
        }
        D8.j();
        return D8.a();
    }

    @Override // j$.util.stream.K3
    public Object b(AbstractC3018b abstractC3018b, Spliterator spliterator) {
        V1 f02 = f0();
        abstractC3018b.R(spliterator, f02);
        return f02.get();
    }

    @Override // j$.util.stream.K3
    public Object c(AbstractC3018b abstractC3018b, Spliterator spliterator) {
        return ((V1) new C3026c2(this, abstractC3018b, spliterator).invoke()).get();
    }

    @Override // j$.util.stream.K3
    public /* synthetic */ int d() {
        return 0;
    }

    public abstract V1 f0();
}
