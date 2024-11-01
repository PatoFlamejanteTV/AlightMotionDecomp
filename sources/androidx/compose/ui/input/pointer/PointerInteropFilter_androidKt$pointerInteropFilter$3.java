package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PointerInteropFilter_androidKt$pointerInteropFilter$3 extends AbstractC3293z implements Function1 {
    final /* synthetic */ AndroidViewHolder $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter_androidKt$pointerInteropFilter$3(AndroidViewHolder androidViewHolder) {
        super(1);
        this.$view = androidViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(MotionEvent motionEvent) {
        boolean dispatchTouchEvent;
        switch (motionEvent.getActionMasked()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                dispatchTouchEvent = this.$view.dispatchTouchEvent(motionEvent);
                break;
            default:
                dispatchTouchEvent = this.$view.dispatchGenericMotionEvent(motionEvent);
                break;
        }
        return Boolean.valueOf(dispatchTouchEvent);
    }
}
