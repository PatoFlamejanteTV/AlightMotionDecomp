package androidx.compose.ui.input.pointer;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class PointerInteropFilter_androidKt {
    @ExperimentalComposeUiApi
    public static final Modifier motionEventSpy(Modifier modifier, Function1 function1) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, function1, new PointerInteropFilter_androidKt$motionEventSpy$1(function1, null));
    }

    @ExperimentalComposeUiApi
    public static final Modifier pointerInteropFilter(Modifier modifier, AndroidViewHolder androidViewHolder) {
        PointerInteropFilter pointerInteropFilter = new PointerInteropFilter();
        pointerInteropFilter.setOnTouchEvent(new PointerInteropFilter_androidKt$pointerInteropFilter$3(androidViewHolder));
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent = new RequestDisallowInterceptTouchEvent();
        pointerInteropFilter.setRequestDisallowInterceptTouchEvent(requestDisallowInterceptTouchEvent);
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui_release(requestDisallowInterceptTouchEvent);
        return modifier.then(pointerInteropFilter);
    }

    public static /* synthetic */ Modifier pointerInteropFilter$default(Modifier modifier, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            requestDisallowInterceptTouchEvent = null;
        }
        return pointerInteropFilter(modifier, requestDisallowInterceptTouchEvent, function1);
    }

    @ExperimentalComposeUiApi
    public static final Modifier pointerInteropFilter(Modifier modifier, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, Function1 function1) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new PointerInteropFilter_androidKt$pointerInteropFilter$$inlined$debugInspectorInfo$1(requestDisallowInterceptTouchEvent, function1) : InspectableValueKt.getNoInspectorInfo(), new PointerInteropFilter_androidKt$pointerInteropFilter$2(function1, requestDisallowInterceptTouchEvent));
    }
}
