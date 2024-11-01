package androidx.privacysandbox.ads.adservices.java.internal;

import Q5.I;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import n6.U;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class CoroutineAdapterKt$asListenableFuture$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ CallbackToFutureAdapter.Completer<T> $completer;
    final /* synthetic */ U $this_asListenableFuture;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineAdapterKt$asListenableFuture$1$1(CallbackToFutureAdapter.Completer<T> completer, U u8) {
        super(1);
        this.$completer = completer;
        this.$this_asListenableFuture = u8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.f8786a;
    }

    public final void invoke(Throwable th) {
        if (th != null) {
            if (th instanceof CancellationException) {
                this.$completer.setCancelled();
                return;
            } else {
                this.$completer.setException(th);
                return;
            }
        }
        this.$completer.set(this.$this_asListenableFuture.g());
    }
}
