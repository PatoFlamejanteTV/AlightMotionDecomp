package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FocusableInNonTouchMode extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusPropertiesModifierNode {
    private final InputModeManager getInputModeManager() {
        return (InputModeManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalInputModeManager());
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        AbstractC3292y.i(focusProperties, "focusProperties");
        focusProperties.setCanFocus(!InputMode.m3554equalsimpl0(getInputModeManager().mo3560getInputModeaOaMEAU(), InputMode.Companion.m3559getTouchaOaMEAU()));
    }
}
