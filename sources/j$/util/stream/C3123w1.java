package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.w1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3123w1 extends AbstractC3127x1 {

    /* renamed from: h, reason: collision with root package name */
    private final Object[] f33604h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3123w1(Spliterator spliterator, AbstractC3018b abstractC3018b, Object[] objArr) {
        super(spliterator, abstractC3018b, objArr.length);
        this.f33604h = objArr;
    }

    C3123w1(C3123w1 c3123w1, Spliterator spliterator, long j8, long j9) {
        super(c3123w1, spliterator, j8, j9, c3123w1.f33604h.length);
        this.f33604h = c3123w1.f33604h;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i8 = this.f33615f;
        if (i8 >= this.f33616g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f33615f));
        }
        Object[] objArr = this.f33604h;
        this.f33615f = i8 + 1;
        objArr[i8] = obj;
    }

    @Override // j$.util.stream.AbstractC3127x1
    final AbstractC3127x1 b(Spliterator spliterator, long j8, long j9) {
        return new C3123w1(this, spliterator, j8, j9);
    }
}
