package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ ScrollScope $$this$scroll;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1(ScrollingLogic scrollingLogic, ScrollScope scrollScope) {
        super(1);
        this.this$0 = scrollingLogic;
        this.$$this$scroll = scrollScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Offset.m2701boximpl(m448invokeMKHz9U(((Offset) obj).m2722unboximpl()));
    }

    /* renamed from: invoke-MK-Hz9U, reason: not valid java name */
    public final long m448invokeMKHz9U(long j8) {
        ScrollingLogic scrollingLogic = this.this$0;
        return scrollingLogic.m440reverseIfNeededMKHz9U(scrollingLogic.m436dispatchScroll3eAAhYA(this.$$this$scroll, scrollingLogic.m440reverseIfNeededMKHz9U(j8), NestedScrollSource.Companion.m3901getFlingWNlRxjI()));
    }
}
