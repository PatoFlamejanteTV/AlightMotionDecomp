package androidx.compose.foundation.gestures;

import Q5.I;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.S;

/* loaded from: classes.dex */
final class DraggableKt$awaitDownAndSlop$postPointerSlop$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ S $initialDelta;
    final /* synthetic */ VelocityTracker $velocityTracker;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableKt$awaitDownAndSlop$postPointerSlop$1(VelocityTracker velocityTracker, S s8) {
        super(2);
        this.$velocityTracker = velocityTracker;
        this.$initialDelta = s8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m403invokeUv8p0NA((PointerInputChange) obj, ((Offset) obj2).m2722unboximpl());
        return I.f8786a;
    }

    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
    public final void m403invokeUv8p0NA(PointerInputChange event, long j8) {
        AbstractC3292y.i(event, "event");
        VelocityTrackerKt.addPointerInputChange(this.$velocityTracker, event);
        event.consume();
        this.$initialDelta.f34572a = j8;
    }
}
