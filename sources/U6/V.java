package U6;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public static final V f10175a = new V();

    /* renamed from: b, reason: collision with root package name */
    private static final int f10176b = 65536;

    /* renamed from: c, reason: collision with root package name */
    private static final U f10177c = new U(new byte[0], 0, 0, false, false);

    /* renamed from: d, reason: collision with root package name */
    private static final int f10178d;

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReference[] f10179e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f10178d = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i8 = 0; i8 < highestOneBit; i8++) {
            atomicReferenceArr[i8] = new AtomicReference();
        }
        f10179e = atomicReferenceArr;
    }

    private V() {
    }

    private final AtomicReference a() {
        return f10179e[(int) (Thread.currentThread().getId() & (f10178d - 1))];
    }

    public static final void b(U segment) {
        int i8;
        AbstractC3292y.i(segment, "segment");
        if (segment.f10173f == null && segment.f10174g == null) {
            if (segment.f10171d) {
                return;
            }
            AtomicReference a9 = f10175a.a();
            U u8 = f10177c;
            U u9 = (U) a9.getAndSet(u8);
            if (u9 == u8) {
                return;
            }
            if (u9 != null) {
                i8 = u9.f10170c;
            } else {
                i8 = 0;
            }
            if (i8 >= f10176b) {
                a9.set(u9);
                return;
            }
            segment.f10173f = u9;
            segment.f10169b = 0;
            segment.f10170c = i8 + 8192;
            a9.set(segment);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final U c() {
        AtomicReference a9 = f10175a.a();
        U u8 = f10177c;
        U u9 = (U) a9.getAndSet(u8);
        if (u9 == u8) {
            return new U();
        }
        if (u9 == null) {
            a9.set(null);
            return new U();
        }
        a9.set(u9.f10173f);
        u9.f10173f = null;
        u9.f10170c = 0;
        return u9;
    }
}
