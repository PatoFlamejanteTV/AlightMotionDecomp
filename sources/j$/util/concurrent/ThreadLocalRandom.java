package j$.util.concurrent;

import j$.util.stream.AbstractC3134z0;
import j$.util.stream.C3084o0;
import j$.util.stream.F;
import j$.util.stream.IntStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/* loaded from: classes2.dex */
public class ThreadLocalRandom extends Random {
    private static final long serialVersionUID = -5851777807851030925L;

    /* renamed from: a, reason: collision with root package name */
    long f33106a;

    /* renamed from: b, reason: collision with root package name */
    int f33107b;

    /* renamed from: c, reason: collision with root package name */
    boolean f33108c;
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f33102d = new ThreadLocal();

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicInteger f33103e = new AtomicInteger();

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal f33104f = new ThreadLocal();

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicLong f33105g = new AtomicLong(h(System.currentTimeMillis()) ^ h(System.nanoTime()));

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.security.PrivilegedAction] */
    static {
        if (((Boolean) AccessController.doPrivileged((PrivilegedAction) new Object())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j8 = seed[0] & 255;
            for (int i8 = 1; i8 < 8; i8++) {
                j8 = (j8 << 8) | (seed[i8] & 255);
            }
            f33105g.set(j8);
        }
    }

    private ThreadLocalRandom() {
        this.f33108c = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ThreadLocalRandom(int i8) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int a(int i8) {
        int i9 = i8 ^ (i8 << 13);
        int i10 = i9 ^ (i9 >>> 17);
        int i11 = i10 ^ (i10 << 5);
        ((ThreadLocalRandom) f33104f.get()).f33107b = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int b() {
        return ((ThreadLocalRandom) f33104f.get()).f33107b;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f33104f.get();
        if (threadLocalRandom.f33107b == 0) {
            f();
        }
        return threadLocalRandom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void f() {
        int addAndGet = f33103e.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long h8 = h(f33105g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f33104f.get();
        threadLocalRandom.f33106a = h8;
        threadLocalRandom.f33107b = addAndGet;
    }

    private static int g(long j8) {
        long j9 = (j8 ^ (j8 >>> 33)) * (-49064778989728563L);
        return (int) (((j9 ^ (j9 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    private static long h(long j8) {
        long j9 = (j8 ^ (j8 >>> 33)) * (-49064778989728563L);
        long j10 = (j9 ^ (j9 >>> 33)) * (-4265267296055464877L);
        return j10 ^ (j10 >>> 33);
    }

    private Object readResolve() {
        return current();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("rnd", this.f33106a);
        putFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final double c(double d8, double d9) {
        double nextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d8 >= d9) {
            return nextLong;
        }
        double d10 = ((d9 - d8) * nextLong) + d8;
        return d10 >= d9 ? Double.longBitsToDouble(Double.doubleToLongBits(d9) - 1) : d10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(int i8, int i9) {
        int i10;
        int g8 = g(i());
        if (i8 >= i9) {
            return g8;
        }
        int i11 = i9 - i8;
        int i12 = i11 - 1;
        if ((i11 & i12) == 0) {
            i10 = g8 & i12;
        } else if (i11 > 0) {
            int i13 = g8 >>> 1;
            while (true) {
                int i14 = i13 + i12;
                i10 = i13 % i11;
                if (i14 - i10 >= 0) {
                    break;
                }
                i13 = g(i()) >>> 1;
            }
        } else {
            while (true) {
                if (g8 >= i8 && g8 < i9) {
                    return g8;
                }
                g8 = g(i());
            }
        }
        return i10 + i8;
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        return F.w(AbstractC3134z0.K(new y(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d)));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d8, double d9) {
        if (d8 < d9) {
            return F.w(AbstractC3134z0.K(new y(0L, Long.MAX_VALUE, d8, d9)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j8) {
        if (j8 >= 0) {
            return F.w(AbstractC3134z0.K(new y(0L, j8, Double.MAX_VALUE, 0.0d)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j8, double d8, double d9) {
        if (j8 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (d8 < d9) {
            return F.w(AbstractC3134z0.K(new y(0L, j8, d8, d9)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long e(long j8, long j9) {
        long h8 = h(i());
        if (j8 >= j9) {
            return h8;
        }
        long j10 = j9 - j8;
        long j11 = j10 - 1;
        if ((j10 & j11) == 0) {
            return (h8 & j11) + j8;
        }
        if (j10 > 0) {
            while (true) {
                long j12 = h8 >>> 1;
                long j13 = j12 + j11;
                long j14 = j12 % j10;
                if (j13 - j14 >= 0) {
                    return j14 + j8;
                }
                h8 = h(i());
            }
        } else {
            while (true) {
                if (h8 >= j8 && h8 < j9) {
                    return h8;
                }
                h8 = h(i());
            }
        }
    }

    final long i() {
        long j8 = this.f33106a - 7046029254386353131L;
        this.f33106a = j8;
        return j8;
    }

    @Override // java.util.Random
    public final IntStream ints() {
        return IntStream.Wrapper.convert(AbstractC3134z0.U(new z(0L, Long.MAX_VALUE, Integer.MAX_VALUE, 0)));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(int i8, int i9) {
        if (i8 < i9) {
            return IntStream.Wrapper.convert(AbstractC3134z0.U(new z(0L, Long.MAX_VALUE, i8, i9)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j8) {
        if (j8 >= 0) {
            return IntStream.Wrapper.convert(AbstractC3134z0.U(new z(0L, j8, Integer.MAX_VALUE, 0)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j8, int i8, int i9) {
        if (j8 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (i8 < i9) {
            return IntStream.Wrapper.convert(AbstractC3134z0.U(new z(0L, j8, i8, i9)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final LongStream longs() {
        return C3084o0.w(AbstractC3134z0.W(new A(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L)));
    }

    @Override // java.util.Random
    public final LongStream longs(long j8) {
        if (j8 >= 0) {
            return C3084o0.w(AbstractC3134z0.W(new A(0L, j8, Long.MAX_VALUE, 0L)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final LongStream longs(long j8, long j9) {
        if (j8 < j9) {
            return C3084o0.w(AbstractC3134z0.W(new A(0L, Long.MAX_VALUE, j8, j9)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final LongStream longs(long j8, long j9, long j10) {
        if (j8 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (j9 < j10) {
            return C3084o0.w(AbstractC3134z0.W(new A(0L, j8, j9, j10)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    protected final int next(int i8) {
        return nextInt() >>> (32 - i8);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return g(i()) < 0;
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (h(i()) >>> 11) * 1.1102230246251565E-16d;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (g(i()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = f33102d;
        Double d8 = (Double) threadLocal.get();
        if (d8 != null) {
            threadLocal.set(null);
            return d8.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d9 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d9 < 1.0d && d9 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d9) * (-2.0d)) / d9);
                threadLocal.set(Double.valueOf(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    @Override // java.util.Random
    public final int nextInt() {
        return g(i());
    }

    @Override // java.util.Random
    public final int nextInt(int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int g8 = g(i());
        int i9 = i8 - 1;
        if ((i8 & i9) == 0) {
            return g8 & i9;
        }
        while (true) {
            int i10 = g8 >>> 1;
            int i11 = i10 + i9;
            int i12 = i10 % i8;
            if (i11 - i12 >= 0) {
                return i12;
            }
            g8 = g(i());
        }
    }

    @Override // java.util.Random
    public final long nextLong() {
        return h(i());
    }

    @Override // java.util.Random
    public final void setSeed(long j8) {
        if (this.f33108c) {
            throw new UnsupportedOperationException();
        }
    }
}
