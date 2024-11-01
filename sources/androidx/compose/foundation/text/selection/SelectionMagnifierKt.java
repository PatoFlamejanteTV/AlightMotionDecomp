package androidx.compose.foundation.text.selection;

import Q5.I;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SelectionMagnifierKt {
    private static final SpringSpec<Offset> MagnifierSpringSpec;
    private static final long OffsetDisplacementThreshold;
    private static final AnimationVector2D UnspecifiedAnimationVector2D = new AnimationVector2D(Float.NaN, Float.NaN);
    private static final TwoWayConverter<Offset, AnimationVector2D> UnspecifiedSafeOffsetVectorConverter = VectorConvertersKt.TwoWayConverter(SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1.INSTANCE, SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2.INSTANCE);

    static {
        long Offset = OffsetKt.Offset(0.01f, 0.01f);
        OffsetDisplacementThreshold = Offset;
        MagnifierSpringSpec = new SpringSpec<>(0.0f, 0.0f, Offset.m2701boximpl(Offset), 3, null);
    }

    public static final Modifier animatedSelectionMagnifier(Modifier modifier, Function0 magnifierCenter, Function1 platformMagnifier) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(magnifierCenter, "magnifierCenter");
        AbstractC3292y.i(platformMagnifier, "platformMagnifier");
        return ComposedModifierKt.composed$default(modifier, null, new SelectionMagnifierKt$animatedSelectionMagnifier$1(magnifierCenter, platformMagnifier), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final State<Offset> rememberAnimatedMagnifierPosition(Function0 function0, Composer composer, int i8) {
        composer.startReplaceableGroup(-1589795249);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589795249, i8, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:75)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(function0);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        State state = (State) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new Animatable(Offset.m2701boximpl(rememberAnimatedMagnifierPosition$lambda$1(state)), UnspecifiedSafeOffsetVectorConverter, Offset.m2701boximpl(OffsetDisplacementThreshold), null, 8, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue2;
        EffectsKt.LaunchedEffect(I.f8786a, new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(state, animatable, null), composer, 70);
        State<Offset> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rememberAnimatedMagnifierPosition$lambda$1(State<Offset> state) {
        return state.getValue().m2722unboximpl();
    }
}
