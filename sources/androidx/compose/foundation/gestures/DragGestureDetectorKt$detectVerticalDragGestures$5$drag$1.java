package androidx.compose.foundation.gestures;

import Q5.I;
import androidx.compose.ui.input.pointer.PointerInputChange;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.P;

/* loaded from: classes.dex */
final class DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ P $overSlop;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1(P p8) {
        super(2);
        this.$overSlop = p8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PointerInputChange) obj, ((Number) obj2).floatValue());
        return I.f8786a;
    }

    public final void invoke(PointerInputChange change, float f8) {
        AbstractC3292y.i(change, "change");
        change.consume();
        this.$overSlop.f34570a = f8;
    }
}
