package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
/* loaded from: classes.dex */
public final class CommonRipple extends Ripple {
    public /* synthetic */ CommonRipple(boolean z8, float f8, State state, AbstractC3284p abstractC3284p) {
        this(z8, f8, state);
    }

    @Override // androidx.compose.material.ripple.Ripple
    @Composable
    /* renamed from: rememberUpdatedRippleInstance-942rkJo, reason: not valid java name */
    public RippleIndicationInstance mo1413rememberUpdatedRippleInstance942rkJo(InteractionSource interactionSource, boolean z8, float f8, State<Color> color, State<RippleAlpha> rippleAlpha, Composer composer, int i8) {
        AbstractC3292y.i(interactionSource, "interactionSource");
        AbstractC3292y.i(color, "color");
        AbstractC3292y.i(rippleAlpha, "rippleAlpha");
        composer.startReplaceableGroup(-1768051227);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1768051227, i8, -1, "androidx.compose.material.ripple.CommonRipple.rememberUpdatedRippleInstance (CommonRipple.kt:46)");
        }
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(interactionSource) | composer.changed(this);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new CommonRippleIndicationInstance(z8, f8, color, rippleAlpha, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        CommonRippleIndicationInstance commonRippleIndicationInstance = (CommonRippleIndicationInstance) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return commonRippleIndicationInstance;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private CommonRipple(boolean z8, float f8, State<Color> color) {
        super(z8, f8, color, null);
        AbstractC3292y.i(color, "color");
    }
}
