package androidx.compose.foundation.lazy.grid;

import Q5.I;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyGridItemProviderImpl$Item$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $index;
    final /* synthetic */ LazyGridItemProviderImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridItemProviderImpl$Item$1(LazyGridItemProviderImpl lazyGridItemProviderImpl, int i8) {
        super(2);
        this.this$0 = lazyGridItemProviderImpl;
        this.$index = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        LazyGridIntervalContent lazyGridIntervalContent;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(726189336, i8, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.<anonymous> (LazyGridItemProvider.kt:75)");
        }
        lazyGridIntervalContent = this.this$0.intervalContent;
        int i9 = this.$index;
        IntervalList.Interval<LazyGridInterval> interval = lazyGridIntervalContent.getIntervals().get(i9);
        interval.getValue().getItem().invoke(LazyGridItemScopeImpl.INSTANCE, Integer.valueOf(i9 - interval.getStartIndex()), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
