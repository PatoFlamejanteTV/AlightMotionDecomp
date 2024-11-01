package androidx.compose.material;

import R5.AbstractC1435t;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
@Stable
/* loaded from: classes.dex */
public final class DefaultButtonElevation implements ButtonElevation {
    private final float defaultElevation;
    private final float disabledElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    public /* synthetic */ DefaultButtonElevation(float f8, float f9, float f10, float f11, float f12, AbstractC3284p abstractC3284p) {
        this(f8, f9, f10, f11, f12);
    }

    @Override // androidx.compose.material.ButtonElevation
    @Composable
    public State<Dp> elevation(boolean z8, InteractionSource interactionSource, Composer composer, int i8) {
        float f8;
        AbstractC3292y.i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-1588756907);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1588756907, i8, -1, "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:505)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
        int i9 = (i8 >> 3) & 14;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(interactionSource) | composer.changed(snapshotStateList);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new DefaultButtonElevation$elevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(interactionSource, (InterfaceC2072n) rememberedValue2, composer, i9 | 64);
        Interaction interaction = (Interaction) AbstractC1435t.z0(snapshotStateList);
        if (!z8) {
            f8 = this.disabledElevation;
        } else if (interaction instanceof PressInteraction.Press) {
            f8 = this.pressedElevation;
        } else if (interaction instanceof HoverInteraction.Enter) {
            f8 = this.hoveredElevation;
        } else if (interaction instanceof FocusInteraction.Focus) {
            f8 = this.focusedElevation;
        } else {
            f8 = this.defaultElevation;
        }
        float f9 = f8;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new Animatable(Dp.m5153boximpl(f9), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue3;
        if (!z8) {
            composer.startReplaceableGroup(-1598807317);
            EffectsKt.LaunchedEffect(Dp.m5153boximpl(f9), new DefaultButtonElevation$elevation$2(animatable, f9, null), composer, 64);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1598807146);
            EffectsKt.LaunchedEffect(Dp.m5153boximpl(f9), new DefaultButtonElevation$elevation$3(animatable, this, f9, interaction, null), composer, 64);
            composer.endReplaceableGroup();
        }
        State<Dp> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }

    private DefaultButtonElevation(float f8, float f9, float f10, float f11, float f12) {
        this.defaultElevation = f8;
        this.pressedElevation = f9;
        this.disabledElevation = f10;
        this.hoveredElevation = f11;
        this.focusedElevation = f12;
    }
}
