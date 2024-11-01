package androidx.compose.foundation.gestures;

import Q5.I;
import androidx.compose.foundation.gestures.ContentInViewModifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BringIntoViewRequestPriorityQueue$enqueue$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ ContentInViewModifier.Request $request;
    final /* synthetic */ BringIntoViewRequestPriorityQueue this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequestPriorityQueue$enqueue$1(BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue, ContentInViewModifier.Request request) {
        super(1);
        this.this$0 = bringIntoViewRequestPriorityQueue;
        this.$request = request;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.f8786a;
    }

    public final void invoke(Throwable th) {
        this.this$0.requests.remove(this.$request);
    }
}
