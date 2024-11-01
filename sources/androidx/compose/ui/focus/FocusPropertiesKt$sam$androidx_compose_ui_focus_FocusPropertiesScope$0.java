package androidx.compose.ui.focus;

import Q5.InterfaceC1412g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.InterfaceC3286s;

/* loaded from: classes.dex */
final class FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0 implements FocusPropertiesScope, InterfaceC3286s {
    private final /* synthetic */ Function1 function;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0(Function1 function1) {
        this.function = function1;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesScope
    public final /* synthetic */ void apply(FocusProperties focusProperties) {
        this.function.invoke(focusProperties);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof FocusPropertiesScope) && (obj instanceof InterfaceC3286s)) {
            return AbstractC3292y.d(getFunctionDelegate(), ((InterfaceC3286s) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC3286s
    public final InterfaceC1412g getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
