package androidx.compose.foundation.lazy;

import Q5.I;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyListItemProviderImpl$Item$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $index;
    final /* synthetic */ LazyListItemProviderImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListItemProviderImpl$Item$1(LazyListItemProviderImpl lazyListItemProviderImpl, int i8) {
        super(2);
        this.this$0 = lazyListItemProviderImpl;
        this.$index = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        LazyListIntervalContent lazyListIntervalContent;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-824725566, i8, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:76)");
        }
        lazyListIntervalContent = this.this$0.intervalContent;
        int i9 = this.$index;
        LazyListItemProviderImpl lazyListItemProviderImpl = this.this$0;
        IntervalList.Interval<LazyListInterval> interval = lazyListIntervalContent.getIntervals().get(i9);
        interval.getValue().getItem().invoke(lazyListItemProviderImpl.getItemScope(), Integer.valueOf(i9 - interval.getStartIndex()), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
