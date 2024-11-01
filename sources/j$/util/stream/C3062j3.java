package j$.util.stream;

import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.j3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3062j3 extends AbstractC3067k3 implements LongConsumer {

    /* renamed from: c, reason: collision with root package name */
    final long[] f33527c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3062j3(int i8) {
        this.f33527c = new long[i8];
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j8) {
        int i8 = this.f33530b;
        this.f33530b = i8 + 1;
        this.f33527c[i8] = j8;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.AbstractC3067k3
    public final void b(Object obj, long j8) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i8 = 0; i8 < j8; i8++) {
            longConsumer.accept(this.f33527c[i8]);
        }
    }
}
