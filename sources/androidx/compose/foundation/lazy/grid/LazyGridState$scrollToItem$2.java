package androidx.compose.foundation.lazy.grid;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.compose.foundation.gestures.ScrollScope;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LazyGridState$scrollToItem$2 extends l implements InterfaceC2072n {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    int label;
    final /* synthetic */ LazyGridState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridState$scrollToItem$2(LazyGridState lazyGridState, int i8, int i9, d dVar) {
        super(2, dVar);
        this.this$0 = lazyGridState;
        this.$index = i8;
        this.$scrollOffset = i9;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new LazyGridState$scrollToItem$2(this.this$0, this.$index, this.$scrollOffset, dVar);
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(ScrollScope scrollScope, d dVar) {
        return ((LazyGridState$scrollToItem$2) create(scrollScope, dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.e();
        if (this.label == 0) {
            t.b(obj);
            this.this$0.snapToItemIndexInternal$foundation_release(this.$index, this.$scrollOffset);
            return I.f8786a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
