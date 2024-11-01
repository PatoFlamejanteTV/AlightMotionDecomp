package androidx.compose.foundation.lazy;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.foundation.gestures.ScrollScope;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LazyListState$scrollToItem$2 extends l implements InterfaceC2072n {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    int label;
    final /* synthetic */ LazyListState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$scrollToItem$2(LazyListState lazyListState, int i8, int i9, d dVar) {
        super(2, dVar);
        this.this$0 = lazyListState;
        this.$index = i8;
        this.$scrollOffset = i9;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new LazyListState$scrollToItem$2(this.this$0, this.$index, this.$scrollOffset, dVar);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(ScrollScope scrollScope, d dVar) {
        return ((LazyListState$scrollToItem$2) create(scrollScope, dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        V5.b.e();
        if (this.label == 0) {
            t.b(obj);
            this.this$0.snapToItemIndexInternal$foundation_release(this.$index, this.$scrollOffset);
            return I.f8786a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
