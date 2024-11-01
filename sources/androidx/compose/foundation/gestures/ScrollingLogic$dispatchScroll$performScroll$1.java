package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollingLogic$dispatchScroll$performScroll$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ int $source;
    final /* synthetic */ ScrollScope $this_dispatchScroll;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$dispatchScroll$performScroll$1(ScrollingLogic scrollingLogic, int i8, ScrollScope scrollScope) {
        super(1);
        this.this$0 = scrollingLogic;
        this.$source = i8;
        this.$this_dispatchScroll = scrollScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Offset.m2701boximpl(m447invokeMKHz9U(((Offset) obj).m2722unboximpl()));
    }

    /* renamed from: invoke-MK-Hz9U, reason: not valid java name */
    public final long m447invokeMKHz9U(long j8) {
        NestedScrollDispatcher value = this.this$0.getNestedScrollDispatcher().getValue();
        long m3891dispatchPreScrollOzD1aCk = value.m3891dispatchPreScrollOzD1aCk(j8, this.$source);
        long m2716minusMKHz9U = Offset.m2716minusMKHz9U(j8, m3891dispatchPreScrollOzD1aCk);
        ScrollingLogic scrollingLogic = this.this$0;
        long m440reverseIfNeededMKHz9U = scrollingLogic.m440reverseIfNeededMKHz9U(scrollingLogic.m445toOffsettuRUvjQ(this.$this_dispatchScroll.scrollBy(scrollingLogic.m444toFloatk4lQ0M(scrollingLogic.m440reverseIfNeededMKHz9U(m2716minusMKHz9U)))));
        return Offset.m2717plusMKHz9U(Offset.m2717plusMKHz9U(m3891dispatchPreScrollOzD1aCk, m440reverseIfNeededMKHz9U), value.m3889dispatchPostScrollDzOQY0M(m440reverseIfNeededMKHz9U, Offset.m2716minusMKHz9U(m2716minusMKHz9U, m440reverseIfNeededMKHz9U), this.$source));
    }
}
