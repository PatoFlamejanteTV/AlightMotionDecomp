package androidx.compose.animation;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AnimatedEnterExitMeasurePolicy$minIntrinsicWidth$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ int $height;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedEnterExitMeasurePolicy$minIntrinsicWidth$1(int i8) {
        super(1);
        this.$height = i8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(IntrinsicMeasurable it) {
        AbstractC3292y.i(it, "it");
        return Integer.valueOf(it.minIntrinsicWidth(this.$height));
    }
}
