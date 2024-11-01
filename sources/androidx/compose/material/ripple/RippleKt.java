package androidx.compose.material.ripple;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class RippleKt {
    private static final TweenSpec<Float> DefaultTweenSpec = new TweenSpec<>(15, 0, EasingKt.getLinearEasing(), 2, null);

    public static final AnimationSpec<Float> incomingStateLayerAnimationSpecFor(Interaction interaction) {
        if (interaction instanceof HoverInteraction.Enter) {
            return DefaultTweenSpec;
        }
        if (interaction instanceof FocusInteraction.Focus) {
            return new TweenSpec(45, 0, EasingKt.getLinearEasing(), 2, null);
        }
        if (interaction instanceof DragInteraction.Start) {
            return new TweenSpec(45, 0, EasingKt.getLinearEasing(), 2, null);
        }
        return DefaultTweenSpec;
    }

    public static final AnimationSpec<Float> outgoingStateLayerAnimationSpecFor(Interaction interaction) {
        if (interaction instanceof HoverInteraction.Enter) {
            return DefaultTweenSpec;
        }
        if (interaction instanceof FocusInteraction.Focus) {
            return DefaultTweenSpec;
        }
        if (interaction instanceof DragInteraction.Start) {
            return new TweenSpec(150, 0, EasingKt.getLinearEasing(), 2, null);
        }
        return DefaultTweenSpec;
    }

    @Composable
    /* renamed from: rememberRipple-9IZ8Weo */
    public static final Indication m1421rememberRipple9IZ8Weo(boolean z8, float f8, long j8, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(1635163520);
        if ((i9 & 1) != 0) {
            z8 = true;
        }
        if ((i9 & 2) != 0) {
            f8 = Dp.Companion.m5175getUnspecifiedD9Ej5fM();
        }
        if ((i9 & 4) != 0) {
            j8 = Color.Companion.m2984getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1635163520, i8, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:76)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2938boximpl(j8), composer, (i8 >> 6) & 14);
        Boolean valueOf = Boolean.valueOf(z8);
        Dp m5153boximpl = Dp.m5153boximpl(f8);
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(valueOf) | composer.changed(m5153boximpl);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PlatformRipple(z8, f8, rememberUpdatedState, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        PlatformRipple platformRipple = (PlatformRipple) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return platformRipple;
    }
}
