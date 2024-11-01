package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class G0 implements IntConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33266a;

    public /* synthetic */ G0(int i8) {
        this.f33266a = i8;
    }

    private final void accept$j$$util$stream$Node$OfInt$$ExternalSyntheticLambda0(int i8) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfInt$$ExternalSyntheticLambda0(int i8) {
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i8) {
        int i9 = this.f33266a;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f33266a) {
            case 0:
                return j$.com.android.tools.r8.a.d(this, intConsumer);
            default:
                return j$.com.android.tools.r8.a.d(this, intConsumer);
        }
    }
}
