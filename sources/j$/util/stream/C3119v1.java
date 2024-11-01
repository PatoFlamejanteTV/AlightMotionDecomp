package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.v1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3119v1 extends AbstractC3127x1 implements InterfaceC3091p2 {

    /* renamed from: h, reason: collision with root package name */
    private final long[] f33595h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3119v1(Spliterator spliterator, AbstractC3018b abstractC3018b, long[] jArr) {
        super(spliterator, abstractC3018b, jArr.length);
        this.f33595h = jArr;
    }

    C3119v1(C3119v1 c3119v1, Spliterator spliterator, long j8, long j9) {
        super(c3119v1, spliterator, j8, j9, c3119v1.f33595h.length);
        this.f33595h = c3119v1.f33595h;
    }

    @Override // j$.util.stream.AbstractC3127x1, j$.util.stream.InterfaceC3096q2, j$.util.stream.InterfaceC3091p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        int i8 = this.f33615f;
        if (i8 >= this.f33616g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f33615f));
        }
        long[] jArr = this.f33595h;
        this.f33615f = i8 + 1;
        jArr[i8] = j8;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        i((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.AbstractC3127x1
    final AbstractC3127x1 b(Spliterator spliterator, long j8, long j9) {
        return new C3119v1(this, spliterator, j8, j9);
    }

    @Override // j$.util.stream.InterfaceC3091p2
    public final /* synthetic */ void i(Long l8) {
        AbstractC3134z0.i(this, l8);
    }
}
