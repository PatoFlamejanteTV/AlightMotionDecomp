package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {488}, m = "doFlingAnimation-QWom1Mo")
/* loaded from: classes.dex */
public final class ScrollingLogic$doFlingAnimation$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$1(ScrollingLogic scrollingLogic, U5.d dVar) {
        super(dVar);
        this.this$0 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m437doFlingAnimationQWom1Mo(0L, this);
    }
}
