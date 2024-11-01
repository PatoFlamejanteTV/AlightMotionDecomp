package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FocusRestorerNode extends Modifier.Node implements FocusPropertiesModifierNode, FocusRequesterModifierNode {
    public static final int $stable = 8;
    private Function0 onRestoreFailed;
    private final Function1 onExit = new FocusRestorerNode$onExit$1(this);
    private final Function1 onEnter = new FocusRestorerNode$onEnter$1(this);

    public FocusRestorerNode(Function0 function0) {
        this.onRestoreFailed = function0;
    }

    private static /* synthetic */ void getOnEnter$annotations() {
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        focusProperties.setEnter(this.onEnter);
        focusProperties.setExit(this.onExit);
    }

    public final Function0 getOnRestoreFailed() {
        return this.onRestoreFailed;
    }

    public final void setOnRestoreFailed(Function0 function0) {
        this.onRestoreFailed = function0;
    }
}
