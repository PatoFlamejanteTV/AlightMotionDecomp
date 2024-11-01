package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class SingleValueAnimationKt {
    private static final SpringSpec<Color> colorDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

    /* renamed from: Animatable-8_81llA */
    public static final Animatable<Color, AnimationVector4D> m162Animatable8_81llA(long j8) {
        return new Animatable<>(Color.m2938boximpl(j8), (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m2952getColorSpaceimpl(j8)), null, null, 12, null);
    }

    @Composable
    /* renamed from: animateColorAsState-KTwxG1Y */
    public static final /* synthetic */ State m163animateColorAsStateKTwxG1Y(long j8, AnimationSpec animationSpec, Function1 function1, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(-1942442407);
        if ((i9 & 2) != 0) {
            animationSpec = colorDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i9 & 4) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1942442407, i8, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:75)");
        }
        State<Color> m164animateColorAsStateeuL9pac = m164animateColorAsStateeuL9pac(j8, animationSpec2, null, function12, composer, (i8 & 14) | 64 | ((i8 << 3) & 7168), 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m164animateColorAsStateeuL9pac;
    }

    @Composable
    /* renamed from: animateColorAsState-euL9pac */
    public static final State<Color> m164animateColorAsStateeuL9pac(long j8, AnimationSpec<Color> animationSpec, String str, Function1 function1, Composer composer, int i8, int i9) {
        AnimationSpec<Color> animationSpec2;
        String str2;
        Function1 function12;
        composer.startReplaceableGroup(-451899108);
        if ((i9 & 2) != 0) {
            animationSpec2 = colorDefaultSpring;
        } else {
            animationSpec2 = animationSpec;
        }
        if ((i9 & 4) != 0) {
            str2 = "ColorAnimation";
        } else {
            str2 = str;
        }
        if ((i9 & 8) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-451899108, i8, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:56)");
        }
        ColorSpace m2952getColorSpaceimpl = Color.m2952getColorSpaceimpl(j8);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(m2952getColorSpaceimpl);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m2952getColorSpaceimpl(j8));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        int i10 = i8 << 6;
        State<Color> animateValueAsState = AnimateAsStateKt.animateValueAsState(Color.m2938boximpl(j8), (TwoWayConverter) rememberedValue, animationSpec2, null, str2, function12, composer, (i8 & 14) | 576 | (57344 & i10) | (i10 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }
}
