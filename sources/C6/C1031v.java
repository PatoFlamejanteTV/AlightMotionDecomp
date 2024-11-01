package C6;

import R5.AbstractC1428l;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: C6.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1031v {

    /* renamed from: e, reason: collision with root package name */
    private static final a f1110e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final long[] f1111f = new long[0];

    /* renamed from: a, reason: collision with root package name */
    private final A6.f f1112a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2072n f1113b;

    /* renamed from: c, reason: collision with root package name */
    private long f1114c;

    /* renamed from: d, reason: collision with root package name */
    private final long[] f1115d;

    /* renamed from: C6.v$a */
    /* loaded from: classes5.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C1031v(A6.f descriptor, InterfaceC2072n readIfAbsent) {
        AbstractC3292y.i(descriptor, "descriptor");
        AbstractC3292y.i(readIfAbsent, "readIfAbsent");
        this.f1112a = descriptor;
        this.f1113b = readIfAbsent;
        int e8 = descriptor.e();
        if (e8 <= 64) {
            this.f1114c = e8 != 64 ? (-1) << e8 : 0L;
            this.f1115d = f1111f;
        } else {
            this.f1114c = 0L;
            this.f1115d = e(e8);
        }
    }

    private final void b(int i8) {
        int i9 = (i8 >>> 6) - 1;
        long[] jArr = this.f1115d;
        jArr[i9] = jArr[i9] | (1 << (i8 & 63));
    }

    private final int c() {
        int length = this.f1115d.length;
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 + 1;
            int i10 = i9 * 64;
            long j8 = this.f1115d[i8];
            while (j8 != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j8);
                j8 |= 1 << numberOfTrailingZeros;
                int i11 = numberOfTrailingZeros + i10;
                if (((Boolean) this.f1113b.invoke(this.f1112a, Integer.valueOf(i11))).booleanValue()) {
                    this.f1115d[i8] = j8;
                    return i11;
                }
            }
            this.f1115d[i8] = j8;
            i8 = i9;
        }
        return -1;
    }

    private final long[] e(int i8) {
        long[] jArr = new long[(i8 - 1) >>> 6];
        if ((i8 & 63) != 0) {
            jArr[AbstractC1428l.h0(jArr)] = (-1) << i8;
        }
        return jArr;
    }

    public final void a(int i8) {
        if (i8 < 64) {
            this.f1114c |= 1 << i8;
        } else {
            b(i8);
        }
    }

    public final int d() {
        int numberOfTrailingZeros;
        int e8 = this.f1112a.e();
        do {
            long j8 = this.f1114c;
            if (j8 != -1) {
                numberOfTrailingZeros = Long.numberOfTrailingZeros(~j8);
                this.f1114c |= 1 << numberOfTrailingZeros;
            } else {
                if (e8 > 64) {
                    return c();
                }
                return -1;
            }
        } while (!((Boolean) this.f1113b.invoke(this.f1112a, Integer.valueOf(numberOfTrailingZeros))).booleanValue());
        return numberOfTrailingZeros;
    }
}
