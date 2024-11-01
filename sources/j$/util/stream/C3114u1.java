package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3114u1 extends AbstractC3127x1 implements InterfaceC3086o2 {

    /* renamed from: h, reason: collision with root package name */
    private final int[] f33588h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3114u1(Spliterator spliterator, AbstractC3018b abstractC3018b, int[] iArr) {
        super(spliterator, abstractC3018b, iArr.length);
        this.f33588h = iArr;
    }

    C3114u1(C3114u1 c3114u1, Spliterator spliterator, long j8, long j9) {
        super(c3114u1, spliterator, j8, j9, c3114u1.f33588h.length);
        this.f33588h = c3114u1.f33588h;
    }

    @Override // j$.util.stream.AbstractC3127x1, j$.util.stream.InterfaceC3096q2
    public final void accept(int i8) {
        int i9 = this.f33615f;
        if (i9 >= this.f33616g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f33615f));
        }
        int[] iArr = this.f33588h;
        this.f33615f = i9 + 1;
        iArr[i9] = i8;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        l((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.AbstractC3127x1
    final AbstractC3127x1 b(Spliterator spliterator, long j8, long j9) {
        return new C3114u1(this, spliterator, j8, j9);
    }

    @Override // j$.util.stream.InterfaceC3086o2
    public final /* synthetic */ void l(Integer num) {
        AbstractC3134z0.g(this, num);
    }
}
