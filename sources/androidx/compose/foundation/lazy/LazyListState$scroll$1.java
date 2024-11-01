package androidx.compose.foundation.lazy;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {269, SubsamplingScaleImageView.ORIENTATION_270}, m = "scroll")
/* loaded from: classes.dex */
public final class LazyListState$scroll$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LazyListState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$scroll$1(LazyListState lazyListState, U5.d dVar) {
        super(dVar);
        this.this$0 = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.scroll(null, null, this);
    }
}
