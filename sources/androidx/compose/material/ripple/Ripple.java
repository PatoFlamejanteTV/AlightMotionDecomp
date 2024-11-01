package androidx.compose.material.ripple;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
/* loaded from: classes.dex */
public abstract class Ripple implements Indication {
    private final boolean bounded;
    private final State<Color> color;
    private final float radius;

    public /* synthetic */ Ripple(boolean z8, float f8, State state, AbstractC3284p abstractC3284p) {
        this(z8, f8, state);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ripple)) {
            return false;
        }
        Ripple ripple = (Ripple) obj;
        if (this.bounded == ripple.bounded && Dp.m5160equalsimpl0(this.radius, ripple.radius) && AbstractC3292y.d(this.color, ripple.color)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((androidx.compose.foundation.a.a(this.bounded) * 31) + Dp.m5161hashCodeimpl(this.radius)) * 31) + this.color.hashCode();
    }

    @Override // androidx.compose.foundation.Indication
    @Composable
    public final IndicationInstance rememberUpdatedInstance(InteractionSource interactionSource, Composer composer, int i8) {
        long mo43defaultColorWaAFU9c;
        AbstractC3292y.i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(988743187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(988743187, i8, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:113)");
        }
        RippleTheme rippleTheme = (RippleTheme) composer.consume(RippleThemeKt.getLocalRippleTheme());
        composer.startReplaceableGroup(-1524341038);
        if (this.color.getValue().m2958unboximpl() != Color.Companion.m2984getUnspecified0d7_KjU()) {
            mo43defaultColorWaAFU9c = this.color.getValue().m2958unboximpl();
        } else {
            mo43defaultColorWaAFU9c = rippleTheme.mo43defaultColorWaAFU9c(composer, 0);
        }
        composer.endReplaceableGroup();
        RippleIndicationInstance mo1413rememberUpdatedRippleInstance942rkJo = mo1413rememberUpdatedRippleInstance942rkJo(interactionSource, this.bounded, this.radius, SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(mo43defaultColorWaAFU9c), composer, 0), SnapshotStateKt.rememberUpdatedState(rippleTheme.rippleAlpha(composer, 0), composer, 0), composer, (i8 & 14) | ((i8 << 12) & 458752));
        EffectsKt.LaunchedEffect(mo1413rememberUpdatedRippleInstance942rkJo, interactionSource, new Ripple$rememberUpdatedInstance$1(interactionSource, mo1413rememberUpdatedRippleInstance942rkJo, null), composer, ((i8 << 3) & 112) | 520);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mo1413rememberUpdatedRippleInstance942rkJo;
    }

    @Composable
    /* renamed from: rememberUpdatedRippleInstance-942rkJo */
    public abstract RippleIndicationInstance mo1413rememberUpdatedRippleInstance942rkJo(InteractionSource interactionSource, boolean z8, float f8, State<Color> state, State<RippleAlpha> state2, Composer composer, int i8);

    private Ripple(boolean z8, float f8, State<Color> color) {
        AbstractC3292y.i(color, "color");
        this.bounded = z8;
        this.radius = f8;
        this.color = color;
    }
}
