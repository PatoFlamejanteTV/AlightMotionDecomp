package androidx.compose.ui.input.pointer;

import Q5.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
/* loaded from: classes.dex */
public final class RequestDisallowInterceptTouchEvent implements Function1 {
    public static final int $stable = 8;
    private PointerInteropFilter pointerInteropFilter;

    public final PointerInteropFilter getPointerInteropFilter$ui_release() {
        return this.pointerInteropFilter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return I.f8786a;
    }

    public final void setPointerInteropFilter$ui_release(PointerInteropFilter pointerInteropFilter) {
        this.pointerInteropFilter = pointerInteropFilter;
    }

    public void invoke(boolean z8) {
        PointerInteropFilter pointerInteropFilter = this.pointerInteropFilter;
        if (pointerInteropFilter == null) {
            return;
        }
        pointerInteropFilter.setDisallowIntercept$ui_release(z8);
    }
}
