package androidx.compose.ui.input.pointer;

import Q5.I;
import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PointerInteropFilter$pointerInputFilter$1$dispatchToView$3 extends AbstractC3293z implements Function1 {
    final /* synthetic */ PointerInteropFilter$pointerInputFilter$1 this$0;
    final /* synthetic */ PointerInteropFilter this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter$pointerInputFilter$1$dispatchToView$3(PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1, PointerInteropFilter pointerInteropFilter) {
        super(1);
        this.this$0 = pointerInteropFilter$pointerInputFilter$1;
        this.this$1 = pointerInteropFilter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MotionEvent) obj);
        return I.f8786a;
    }

    public final void invoke(MotionEvent motionEvent) {
        PointerInteropFilter.DispatchToViewState dispatchToViewState;
        if (motionEvent.getActionMasked() == 0) {
            PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1 = this.this$0;
            if (((Boolean) this.this$1.getOnTouchEvent().invoke(motionEvent)).booleanValue()) {
                dispatchToViewState = PointerInteropFilter.DispatchToViewState.Dispatching;
            } else {
                dispatchToViewState = PointerInteropFilter.DispatchToViewState.NotDispatching;
            }
            pointerInteropFilter$pointerInputFilter$1.state = dispatchToViewState;
            return;
        }
        this.this$1.getOnTouchEvent().invoke(motionEvent);
    }
}
