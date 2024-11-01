package androidx.compose.foundation.gestures;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class DraggableKt$draggable$4 extends AbstractC3293z implements Function0 {
    final /* synthetic */ boolean $startDragImmediately;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableKt$draggable$4(boolean z8) {
        super(0);
        this.$startDragImmediately = z8;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.$startDragImmediately);
    }
}
