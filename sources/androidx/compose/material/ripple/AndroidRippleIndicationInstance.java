package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import e6.AbstractC2829a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.M;

/* loaded from: classes.dex */
public final class AndroidRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {
    private final boolean bounded;
    private final State<Color> color;
    private final MutableState invalidateTick$delegate;
    private final Function0 onInvalidateRipple;
    private final float radius;
    private final State<RippleAlpha> rippleAlpha;
    private final RippleContainer rippleContainer;
    private final MutableState rippleHostView$delegate;
    private int rippleRadius;
    private long rippleSize;

    public /* synthetic */ AndroidRippleIndicationInstance(boolean z8, float f8, State state, State state2, RippleContainer rippleContainer, AbstractC3284p abstractC3284p) {
        this(z8, f8, state, state2, rippleContainer);
    }

    private final void dispose() {
        this.rippleContainer.disposeRippleIfNeeded(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getInvalidateTick() {
        return ((Boolean) this.invalidateTick$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final RippleHostView getRippleHostView() {
        return (RippleHostView) this.rippleHostView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInvalidateTick(boolean z8) {
        this.invalidateTick$delegate.setValue(Boolean.valueOf(z8));
    }

    private final void setRippleHostView(RippleHostView rippleHostView) {
        this.rippleHostView$delegate.setValue(rippleHostView);
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void addRipple(PressInteraction.Press interaction, M scope) {
        AbstractC3292y.i(interaction, "interaction");
        AbstractC3292y.i(scope, "scope");
        RippleHostView rippleHostView = this.rippleContainer.getRippleHostView(this);
        rippleHostView.m1418addRippleKOepWvA(interaction, this.bounded, this.rippleSize, this.rippleRadius, this.color.getValue().m2958unboximpl(), this.rippleAlpha.getValue().getPressedAlpha(), this.onInvalidateRipple);
        setRippleHostView(rippleHostView);
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(ContentDrawScope contentDrawScope) {
        int mo419roundToPx0680j_4;
        AbstractC3292y.i(contentDrawScope, "<this>");
        this.rippleSize = contentDrawScope.mo3391getSizeNHjbRc();
        if (Float.isNaN(this.radius)) {
            mo419roundToPx0680j_4 = AbstractC2829a.d(RippleAnimationKt.m1416getRippleEndRadiuscSwnlzA(contentDrawScope, this.bounded, contentDrawScope.mo3391getSizeNHjbRc()));
        } else {
            mo419roundToPx0680j_4 = contentDrawScope.mo419roundToPx0680j_4(this.radius);
        }
        this.rippleRadius = mo419roundToPx0680j_4;
        long m2958unboximpl = this.color.getValue().m2958unboximpl();
        float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
        contentDrawScope.drawContent();
        m1420drawStateLayerH2RKhps(contentDrawScope, this.radius, m2958unboximpl);
        Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
        getInvalidateTick();
        RippleHostView rippleHostView = getRippleHostView();
        if (rippleHostView != null) {
            rippleHostView.m1419updateRipplePropertiesbiQXAtU(contentDrawScope.mo3391getSizeNHjbRc(), this.rippleRadius, m2958unboximpl, pressedAlpha);
            rippleHostView.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        dispose();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        dispose();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void removeRipple(PressInteraction.Press interaction) {
        AbstractC3292y.i(interaction, "interaction");
        RippleHostView rippleHostView = getRippleHostView();
        if (rippleHostView != null) {
            rippleHostView.removeRipple();
        }
    }

    public final void resetHostView() {
        setRippleHostView(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AndroidRippleIndicationInstance(boolean z8, float f8, State<Color> color, State<RippleAlpha> rippleAlpha, RippleContainer rippleContainer) {
        super(z8, rippleAlpha);
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        AbstractC3292y.i(color, "color");
        AbstractC3292y.i(rippleAlpha, "rippleAlpha");
        AbstractC3292y.i(rippleContainer, "rippleContainer");
        this.bounded = z8;
        this.radius = f8;
        this.color = color;
        this.rippleAlpha = rippleAlpha;
        this.rippleContainer = rippleContainer;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.rippleHostView$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.invalidateTick$delegate = mutableStateOf$default2;
        this.rippleSize = Size.Companion.m2790getZeroNHjbRc();
        this.rippleRadius = -1;
        this.onInvalidateRipple = new AndroidRippleIndicationInstance$onInvalidateRipple$1(this);
    }
}
