package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class E0 implements DoubleConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33252a;

    public /* synthetic */ E0(int i8) {
        this.f33252a = i8;
    }

    private final void accept$j$$util$stream$Node$OfDouble$$ExternalSyntheticLambda0(double d8) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfDouble$$ExternalSyntheticLambda0(double d8) {
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d8) {
        int i8 = this.f33252a;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f33252a) {
            case 0:
                return j$.com.android.tools.r8.a.c(this, doubleConsumer);
            default:
                return j$.com.android.tools.r8.a.c(this, doubleConsumer);
        }
    }
}
