package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class FlowLayoutKt$intrinsicCrossAxisSize$2 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ int[] $crossAxisSizes;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$intrinsicCrossAxisSize$2(int[] iArr) {
        super(3);
        this.$crossAxisSizes = iArr;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }

    public final Integer invoke(IntrinsicMeasurable intrinsicCrossAxisSize, int i8, int i9) {
        AbstractC3292y.i(intrinsicCrossAxisSize, "$this$intrinsicCrossAxisSize");
        return Integer.valueOf(this.$crossAxisSizes[i8]);
    }
}
