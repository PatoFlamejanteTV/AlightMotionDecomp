package androidx.compose.material;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1 INSTANCE = new OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1();

    OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
    }

    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i8) {
        AbstractC3292y.i(intrinsicMeasurable, "intrinsicMeasurable");
        return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i8));
    }
}
