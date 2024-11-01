package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SwitchKt$Switch$anchoredDraggableState$1$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ float $switchVelocityThresholdPx;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$anchoredDraggableState$1$2(float f8) {
        super(0);
        this.$switchVelocityThresholdPx = f8;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$switchVelocityThresholdPx);
    }
}
