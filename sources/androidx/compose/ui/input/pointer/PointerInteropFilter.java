package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
@ExperimentalComposeUiApi
/* loaded from: classes.dex */
public final class PointerInteropFilter implements PointerInputModifier {
    public static final int $stable = 0;
    private boolean disallowIntercept;
    public Function1 onTouchEvent;
    private final PointerInputFilter pointerInputFilter = new PointerInteropFilter$pointerInputFilter$1(this);
    private RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum DispatchToViewState {
        Unknown,
        Dispatching,
        NotDispatching
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, InterfaceC2072n interfaceC2072n) {
        return androidx.compose.ui.b.c(this, obj, interfaceC2072n);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, InterfaceC2072n interfaceC2072n) {
        return androidx.compose.ui.b.d(this, obj, interfaceC2072n);
    }

    public final boolean getDisallowIntercept$ui_release() {
        return this.disallowIntercept;
    }

    public final Function1 getOnTouchEvent() {
        Function1 function1 = this.onTouchEvent;
        if (function1 != null) {
            return function1;
        }
        AbstractC3292y.y("onTouchEvent");
        return null;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputModifier
    public PointerInputFilter getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    public final RequestDisallowInterceptTouchEvent getRequestDisallowInterceptTouchEvent() {
        return this.requestDisallowInterceptTouchEvent;
    }

    public final void setDisallowIntercept$ui_release(boolean z8) {
        this.disallowIntercept = z8;
    }

    public final void setOnTouchEvent(Function1 function1) {
        this.onTouchEvent = function1;
    }

    public final void setRequestDisallowInterceptTouchEvent(RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent) {
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent2 = this.requestDisallowInterceptTouchEvent;
        if (requestDisallowInterceptTouchEvent2 != null) {
            requestDisallowInterceptTouchEvent2.setPointerInteropFilter$ui_release(null);
        }
        this.requestDisallowInterceptTouchEvent = requestDisallowInterceptTouchEvent;
        if (requestDisallowInterceptTouchEvent != null) {
            requestDisallowInterceptTouchEvent.setPointerInteropFilter$ui_release(this);
        }
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
