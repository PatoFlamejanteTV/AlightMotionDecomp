package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnchoredDraggableState$progress$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$progress$2(AnchoredDraggableState<T> anchoredDraggableState) {
        super(0);
        this.this$0 = anchoredDraggableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        Float f8 = (Float) this.this$0.getAnchors$material_release().get(this.this$0.getCurrentValue());
        float f9 = 0.0f;
        float floatValue = f8 != null ? f8.floatValue() : 0.0f;
        Float f10 = (Float) this.this$0.getAnchors$material_release().get(this.this$0.getClosestValue$material_release());
        float floatValue2 = (f10 != null ? f10.floatValue() : 0.0f) - floatValue;
        if (Math.abs(floatValue2) > 1.0E-6f) {
            float requireOffset = (this.this$0.requireOffset() - floatValue) / floatValue2;
            if (requireOffset >= 1.0E-6f) {
                if (requireOffset <= 0.999999f) {
                    f9 = requireOffset;
                }
            }
            return Float.valueOf(f9);
        }
        f9 = 1.0f;
        return Float.valueOf(f9);
    }
}
