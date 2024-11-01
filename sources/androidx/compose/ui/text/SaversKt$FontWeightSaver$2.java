package androidx.compose.ui.text;

import androidx.compose.ui.text.font.FontWeight;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaversKt$FontWeightSaver$2 extends AbstractC3293z implements Function1 {
    public static final SaversKt$FontWeightSaver$2 INSTANCE = new SaversKt$FontWeightSaver$2();

    SaversKt$FontWeightSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FontWeight invoke(Object obj) {
        AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.Int");
        return new FontWeight(((Integer) obj).intValue());
    }
}
