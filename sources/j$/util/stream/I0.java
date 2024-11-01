package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class I0 implements LongConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33286a;

    public /* synthetic */ I0(int i8) {
        this.f33286a = i8;
    }

    private final void accept$j$$util$stream$Node$OfLong$$ExternalSyntheticLambda0(long j8) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfLong$$ExternalSyntheticLambda0(long j8) {
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j8) {
        int i8 = this.f33286a;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f33286a) {
            case 0:
                return j$.com.android.tools.r8.a.e(this, longConsumer);
            default:
                return j$.com.android.tools.r8.a.e(this, longConsumer);
        }
    }
}
