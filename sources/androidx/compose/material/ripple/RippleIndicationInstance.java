package androidx.compose.material.ripple;

import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.internal.AbstractC3292y;
import n6.M;

/* loaded from: classes.dex */
public abstract class RippleIndicationInstance implements IndicationInstance {
    private final StateLayer stateLayer;

    public RippleIndicationInstance(boolean z8, State<RippleAlpha> rippleAlpha) {
        AbstractC3292y.i(rippleAlpha, "rippleAlpha");
        this.stateLayer = new StateLayer(z8, rippleAlpha);
    }

    public abstract void addRipple(PressInteraction.Press press, M m8);

    /* renamed from: drawStateLayer-H2RKhps, reason: not valid java name */
    public final void m1420drawStateLayerH2RKhps(DrawScope drawStateLayer, float f8, long j8) {
        AbstractC3292y.i(drawStateLayer, "$this$drawStateLayer");
        this.stateLayer.m1424drawStateLayerH2RKhps(drawStateLayer, f8, j8);
    }

    public abstract void removeRipple(PressInteraction.Press press);

    public final void updateStateLayer$material_ripple_release(Interaction interaction, M scope) {
        AbstractC3292y.i(interaction, "interaction");
        AbstractC3292y.i(scope, "scope");
        this.stateLayer.handleInteraction(interaction, scope);
    }
}
