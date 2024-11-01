package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyLayoutKt$LazyLayout$3$2$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ LazyLayoutItemContentFactory $itemContentFactory;
    final /* synthetic */ InterfaceC2072n $measurePolicy;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$3$2$1(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, InterfaceC2072n interfaceC2072n) {
        super(2);
        this.$itemContentFactory = lazyLayoutItemContentFactory;
        this.$measurePolicy = interfaceC2072n;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m732invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m5129unboximpl());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final MeasureResult m732invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j8) {
        AbstractC3292y.i(subcomposeMeasureScope, "$this$null");
        return (MeasureResult) this.$measurePolicy.invoke(new LazyLayoutMeasureScopeImpl(this.$itemContentFactory, subcomposeMeasureScope), Constraints.m5111boximpl(j8));
    }
}
