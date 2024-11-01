package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnchoredDraggableState$closestValue$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$closestValue$2(AnchoredDraggableState<T> anchoredDraggableState) {
        super(0);
        this.this$0 = anchoredDraggableState;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        ?? animationTarget;
        ?? computeTargetWithoutThresholds;
        animationTarget = this.this$0.getAnimationTarget();
        if (animationTarget == 0) {
            AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
            float offset = anchoredDraggableState.getOffset();
            if (!Float.isNaN(offset)) {
                computeTargetWithoutThresholds = anchoredDraggableState.computeTargetWithoutThresholds(offset, anchoredDraggableState.getCurrentValue());
                return computeTargetWithoutThresholds;
            }
            return anchoredDraggableState.getCurrentValue();
        }
        return animationTarget;
    }
}
