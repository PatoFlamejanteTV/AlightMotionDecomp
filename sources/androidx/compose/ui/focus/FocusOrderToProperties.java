package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class FocusOrderToProperties implements FocusPropertiesScope {
    public static final int $stable = 0;
    private final Function1 focusOrderReceiver;

    public FocusOrderToProperties(Function1 function1) {
        this.focusOrderReceiver = function1;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesScope
    public void apply(FocusProperties focusProperties) {
        this.focusOrderReceiver.invoke(new FocusOrder(focusProperties));
    }

    public final Function1 getFocusOrderReceiver() {
        return this.focusOrderReceiver;
    }
}
