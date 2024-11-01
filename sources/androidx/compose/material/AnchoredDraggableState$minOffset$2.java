package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnchoredDraggableState$minOffset$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$minOffset$2(AnchoredDraggableState<T> anchoredDraggableState) {
        super(0);
        this.this$0 = anchoredDraggableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        Float minOrNull;
        minOrNull = AnchoredDraggableKt.minOrNull(this.this$0.getAnchors$material_release());
        return Float.valueOf(minOrNull != null ? minOrNull.floatValue() : Float.NEGATIVE_INFINITY);
    }
}
