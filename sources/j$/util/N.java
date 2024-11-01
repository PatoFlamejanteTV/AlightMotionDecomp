package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class N implements LongConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Consumer f33064a;

    public /* synthetic */ N(Consumer consumer) {
        this.f33064a = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f33064a.accept(Long.valueOf(j8));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }
}
