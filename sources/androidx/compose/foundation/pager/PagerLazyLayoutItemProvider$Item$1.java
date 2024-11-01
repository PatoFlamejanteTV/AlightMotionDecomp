package androidx.compose.foundation.pager;

import Q5.I;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2074p;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PagerLazyLayoutItemProvider$Item$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $index;
    final /* synthetic */ PagerLazyLayoutItemProvider this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerLazyLayoutItemProvider$Item$1(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i8) {
        super(2);
        this.this$0 = pagerLazyLayoutItemProvider;
        this.$index = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        LazyLayoutIntervalContent lazyLayoutIntervalContent;
        PagerScopeImpl pagerScopeImpl;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1142237095, i8, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:188)");
        }
        lazyLayoutIntervalContent = this.this$0.intervalContent;
        int i9 = this.$index;
        PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider = this.this$0;
        IntervalList.Interval interval = lazyLayoutIntervalContent.getIntervals().get(i9);
        int startIndex = i9 - interval.getStartIndex();
        InterfaceC2074p item = ((PagerIntervalContent) interval.getValue()).getItem();
        pagerScopeImpl = pagerLazyLayoutItemProvider.pagerScopeImpl;
        item.invoke(pagerScopeImpl, Integer.valueOf(startIndex), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
