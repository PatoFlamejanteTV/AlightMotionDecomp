package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SwitchKt$Switch$5$1$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ AnchoredDraggableState<Boolean> $anchoredDraggableState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$5$1$1(AnchoredDraggableState<Boolean> anchoredDraggableState) {
        super(0);
        this.$anchoredDraggableState = anchoredDraggableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$anchoredDraggableState.requireOffset());
    }
}
