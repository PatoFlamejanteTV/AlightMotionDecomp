package androidx.compose.foundation.text;

import Q5.I;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$5 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ TextDragObserver $observer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$5(TextDragObserver textDragObserver) {
        super(2);
        this.$observer = textDragObserver;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m867invokeUv8p0NA((PointerInputChange) obj, ((Offset) obj2).m2722unboximpl());
        return I.f8786a;
    }

    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
    public final void m867invokeUv8p0NA(PointerInputChange pointerInputChange, long j8) {
        AbstractC3292y.i(pointerInputChange, "<anonymous parameter 0>");
        this.$observer.mo903onDragk4lQ0M(j8);
    }
}
