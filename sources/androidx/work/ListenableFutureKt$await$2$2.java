package androidx.work;

import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import z0.InterfaceFutureC4260d;

/* loaded from: classes3.dex */
final class ListenableFutureKt$await$2$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ InterfaceFutureC4260d $this_await;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListenableFutureKt$await$2$2(InterfaceFutureC4260d interfaceFutureC4260d) {
        super(1);
        this.$this_await = interfaceFutureC4260d;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.f8786a;
    }

    public final void invoke(Throwable th) {
        this.$this_await.cancel(false);
    }
}
