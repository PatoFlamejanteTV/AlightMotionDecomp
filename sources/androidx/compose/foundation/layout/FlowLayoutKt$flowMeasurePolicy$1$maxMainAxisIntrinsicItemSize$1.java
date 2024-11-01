package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$1 extends AbstractC3293z implements InterfaceC2073o {
    public static final FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$1 INSTANCE = new FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$1();

    FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$1() {
        super(3);
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }

    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i8, int i9) {
        AbstractC3292y.i(intrinsicMeasurable, "$this$null");
        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i9));
    }
}
