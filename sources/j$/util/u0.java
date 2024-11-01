package j$.util;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Spliterator f33648a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Z f33649b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final c0 f33650c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final W f33651d = new Object();

    private static void a(int i8, int i9, int i10) {
        if (i9 <= i10) {
            if (i9 < 0) {
                throw new ArrayIndexOutOfBoundsException(i9);
            }
            if (i10 > i8) {
                throw new ArrayIndexOutOfBoundsException(i10);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i9 + ") > fence(" + i10 + ")");
    }

    public static W b() {
        return f33651d;
    }

    public static Z c() {
        return f33649b;
    }

    public static c0 d() {
        return f33650c;
    }

    public static Spliterator e() {
        return f33648a;
    }

    public static I f(W w8) {
        Objects.requireNonNull(w8);
        return new k0(w8);
    }

    public static M g(Z z8) {
        Objects.requireNonNull(z8);
        return new i0(z8);
    }

    public static Q h(c0 c0Var) {
        Objects.requireNonNull(c0Var);
        return new j0(c0Var);
    }

    public static Iterator i(Spliterator spliterator) {
        Objects.requireNonNull(spliterator);
        return new h0(spliterator);
    }

    public static W j(double[] dArr, int i8, int i9) {
        a(((double[]) Objects.requireNonNull(dArr)).length, i8, i9);
        return new m0(dArr, i8, i9, 1040);
    }

    public static Z k(int[] iArr, int i8, int i9) {
        a(((int[]) Objects.requireNonNull(iArr)).length, i8, i9);
        return new r0(iArr, i8, i9, 1040);
    }

    public static c0 l(long[] jArr, int i8, int i9) {
        a(((long[]) Objects.requireNonNull(jArr)).length, i8, i9);
        return new t0(jArr, i8, i9, 1040);
    }

    public static Spliterator m(Object[] objArr, int i8, int i9) {
        a(((Object[]) Objects.requireNonNull(objArr)).length, i8, i9);
        return new l0(objArr, i8, i9, 1040);
    }
}
