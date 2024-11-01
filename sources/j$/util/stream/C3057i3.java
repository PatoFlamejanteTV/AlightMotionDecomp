package j$.util.stream;

import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.i3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3057i3 extends AbstractC3067k3 implements IntConsumer {

    /* renamed from: c, reason: collision with root package name */
    final int[] f33522c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3057i3(int i8) {
        this.f33522c = new int[i8];
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i8) {
        int i9 = this.f33530b;
        this.f33530b = i9 + 1;
        this.f33522c[i9] = i8;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.AbstractC3067k3
    public final void b(Object obj, long j8) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i8 = 0; i8 < j8; i8++) {
            intConsumer.accept(this.f33522c[i8]);
        }
    }
}
