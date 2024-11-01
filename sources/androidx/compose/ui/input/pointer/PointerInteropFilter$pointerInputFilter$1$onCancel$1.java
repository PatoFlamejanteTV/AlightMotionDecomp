package androidx.compose.ui.input.pointer;

import Q5.I;
import android.view.MotionEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class PointerInteropFilter$pointerInputFilter$1$onCancel$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ PointerInteropFilter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter$pointerInputFilter$1$onCancel$1(PointerInteropFilter pointerInteropFilter) {
        super(1);
        this.this$0 = pointerInteropFilter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MotionEvent) obj);
        return I.f8786a;
    }

    public final void invoke(MotionEvent motionEvent) {
        this.this$0.getOnTouchEvent().invoke(motionEvent);
    }
}
