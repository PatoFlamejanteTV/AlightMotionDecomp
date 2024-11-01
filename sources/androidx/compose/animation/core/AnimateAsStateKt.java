package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.C3291x;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class AnimateAsStateKt {
    private static final SpringSpec<Float> defaultAnimation = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    private static final SpringSpec<Dp> dpDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m5153boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.Companion)), 3, null);
    private static final SpringSpec<Size> sizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m2769boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.Companion)), 3, null);
    private static final SpringSpec<Offset> offsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m2701boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion)), 3, null);
    private static final SpringSpec<Rect> rectDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);
    private static final SpringSpec<Integer> intDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Integer.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(C3291x.f34603a)), 3, null);
    private static final SpringSpec<IntOffset> intOffsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m5270boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
    private static final SpringSpec<IntSize> intSizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m5313boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 3, null);

    @Composable
    /* renamed from: animateDpAsState-AjpBEmI */
    public static final State<Dp> m176animateDpAsStateAjpBEmI(float f8, AnimationSpec<Dp> animationSpec, String str, Function1 function1, Composer composer, int i8, int i9) {
        AnimationSpec<Dp> animationSpec2;
        String str2;
        Function1 function12;
        composer.startReplaceableGroup(-1407150062);
        if ((i9 & 2) != 0) {
            animationSpec2 = dpDefaultSpring;
        } else {
            animationSpec2 = animationSpec;
        }
        if ((i9 & 4) != 0) {
            str2 = "DpAnimation";
        } else {
            str2 = str;
        }
        if ((i9 & 8) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1407150062, i8, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:108)");
        }
        int i10 = i8 << 6;
        State<Dp> animateValueAsState = animateValueAsState(Dp.m5153boximpl(f8), VectorConvertersKt.getVectorConverter(Dp.Companion), animationSpec2, null, str2, function12, composer, (i8 & 14) | ((i8 << 3) & 896) | (57344 & i10) | (i10 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    /* renamed from: animateDpAsState-Kz89ssw */
    public static final /* synthetic */ State m177animateDpAsStateKz89ssw(float f8, AnimationSpec animationSpec, Function1 function1, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(704104481);
        if ((i9 & 2) != 0) {
            animationSpec = dpDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i9 & 4) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(704104481, i8, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:458)");
        }
        State animateValueAsState = animateValueAsState(Dp.m5153boximpl(f8), VectorConvertersKt.getVectorConverter(Dp.Companion), animationSpec2, null, null, function12, composer, (i8 & 14) | ((i8 << 3) & 896) | ((i8 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    public static final State<Float> animateFloatAsState(float f8, AnimationSpec<Float> animationSpec, float f9, String str, Function1 function1, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(668842840);
        AnimationSpec<Float> animationSpec2 = (i9 & 2) != 0 ? defaultAnimation : animationSpec;
        float f10 = (i9 & 4) != 0 ? 0.01f : f9;
        String str2 = (i9 & 8) != 0 ? "FloatAnimation" : str;
        Function1 function12 = (i9 & 16) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(668842840, i8, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:62)");
        }
        composer.startReplaceableGroup(841393662);
        if (animationSpec2 == defaultAnimation) {
            Float valueOf = Float.valueOf(f10);
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(valueOf);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, Float.valueOf(f10), 3, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            animationSpec2 = (AnimationSpec) rememberedValue;
        }
        composer.endReplaceableGroup();
        int i10 = i8 << 3;
        State<Float> animateValueAsState = animateValueAsState(Float.valueOf(f8), VectorConvertersKt.getVectorConverter(r.f34602a), animationSpec2, Float.valueOf(f10), str2, function12, composer, (i10 & 7168) | (i8 & 14) | (57344 & i10) | (i10 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    public static final State<Integer> animateIntAsState(int i8, AnimationSpec<Integer> animationSpec, String str, Function1 function1, Composer composer, int i9, int i10) {
        composer.startReplaceableGroup(428074472);
        AnimationSpec<Integer> animationSpec2 = (i10 & 2) != 0 ? intDefaultSpring : animationSpec;
        String str2 = (i10 & 4) != 0 ? "IntAnimation" : str;
        Function1 function12 = (i10 & 8) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(428074472, i9, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:268)");
        }
        int i11 = i9 << 6;
        State<Integer> animateValueAsState = animateValueAsState(Integer.valueOf(i8), VectorConvertersKt.getVectorConverter(C3291x.f34603a), animationSpec2, null, str2, function12, composer, (i9 & 14) | ((i9 << 3) & 896) | (57344 & i11) | (i11 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    /* renamed from: animateIntOffsetAsState-8f6pmRE */
    public static final /* synthetic */ State m178animateIntOffsetAsState8f6pmRE(long j8, AnimationSpec animationSpec, Function1 function1, Composer composer, int i8, int i9) {
        AnimationSpec animationSpec2;
        Function1 function12;
        composer.startReplaceableGroup(1010307371);
        if ((i9 & 2) != 0) {
            animationSpec2 = intOffsetDefaultSpring;
        } else {
            animationSpec2 = animationSpec;
        }
        if ((i9 & 4) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1010307371, i8, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:539)");
        }
        State animateValueAsState = animateValueAsState(IntOffset.m5270boximpl(j8), VectorConvertersKt.getVectorConverter(IntOffset.Companion), animationSpec2, null, null, function12, composer, (i8 & 14) | ((i8 << 3) & 896) | ((i8 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    /* renamed from: animateIntOffsetAsState-HyPO7BM */
    public static final State<IntOffset> m179animateIntOffsetAsStateHyPO7BM(long j8, AnimationSpec<IntOffset> animationSpec, String str, Function1 function1, Composer composer, int i8, int i9) {
        AnimationSpec<IntOffset> animationSpec2;
        String str2;
        Function1 function12;
        composer.startReplaceableGroup(-696782904);
        if ((i9 & 2) != 0) {
            animationSpec2 = intOffsetDefaultSpring;
        } else {
            animationSpec2 = animationSpec;
        }
        if ((i9 & 4) != 0) {
            str2 = "IntOffsetAnimation";
        } else {
            str2 = str;
        }
        if ((i9 & 8) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-696782904, i8, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:308)");
        }
        int i10 = i8 << 6;
        State<IntOffset> animateValueAsState = animateValueAsState(IntOffset.m5270boximpl(j8), VectorConvertersKt.getVectorConverter(IntOffset.Companion), animationSpec2, null, str2, function12, composer, (i8 & 14) | ((i8 << 3) & 896) | (57344 & i10) | (i10 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    /* renamed from: animateIntSizeAsState-4goxYXU */
    public static final State<IntSize> m180animateIntSizeAsState4goxYXU(long j8, AnimationSpec<IntSize> animationSpec, String str, Function1 function1, Composer composer, int i8, int i9) {
        AnimationSpec<IntSize> animationSpec2;
        String str2;
        Function1 function12;
        composer.startReplaceableGroup(582576328);
        if ((i9 & 2) != 0) {
            animationSpec2 = intSizeDefaultSpring;
        } else {
            animationSpec2 = animationSpec;
        }
        if ((i9 & 4) != 0) {
            str2 = "IntSizeAnimation";
        } else {
            str2 = str;
        }
        if ((i9 & 8) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(582576328, i8, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:346)");
        }
        int i10 = i8 << 6;
        State<IntSize> animateValueAsState = animateValueAsState(IntSize.m5313boximpl(j8), VectorConvertersKt.getVectorConverter(IntSize.Companion), animationSpec2, null, str2, function12, composer, (i8 & 14) | ((i8 << 3) & 896) | (57344 & i10) | (i10 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    /* renamed from: animateIntSizeAsState-zTRF_AQ */
    public static final /* synthetic */ State m181animateIntSizeAsStatezTRF_AQ(long j8, AnimationSpec animationSpec, Function1 function1, Composer composer, int i8, int i9) {
        AnimationSpec animationSpec2;
        Function1 function12;
        composer.startReplaceableGroup(-1749239765);
        if ((i9 & 2) != 0) {
            animationSpec2 = intSizeDefaultSpring;
        } else {
            animationSpec2 = animationSpec;
        }
        if ((i9 & 4) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1749239765, i8, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:554)");
        }
        State animateValueAsState = animateValueAsState(IntSize.m5313boximpl(j8), VectorConvertersKt.getVectorConverter(IntSize.Companion), animationSpec2, null, null, function12, composer, (i8 & 14) | ((i8 << 3) & 896) | ((i8 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    /* renamed from: animateOffsetAsState-7362WCg */
    public static final State<Offset> m182animateOffsetAsState7362WCg(long j8, AnimationSpec<Offset> animationSpec, String str, Function1 function1, Composer composer, int i8, int i9) {
        AnimationSpec<Offset> animationSpec2;
        String str2;
        Function1 function12;
        composer.startReplaceableGroup(357896800);
        if ((i9 & 2) != 0) {
            animationSpec2 = offsetDefaultSpring;
        } else {
            animationSpec2 = animationSpec;
        }
        if ((i9 & 4) != 0) {
            str2 = "OffsetAnimation";
        } else {
            str2 = str;
        }
        if ((i9 & 8) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(357896800, i8, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:189)");
        }
        int i10 = i8 << 6;
        State<Offset> animateValueAsState = animateValueAsState(Offset.m2701boximpl(j8), VectorConvertersKt.getVectorConverter(Offset.Companion), animationSpec2, null, str2, function12, composer, (i8 & 14) | ((i8 << 3) & 896) | (57344 & i10) | (i10 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    /* renamed from: animateOffsetAsState-N6fFfp4 */
    public static final /* synthetic */ State m183animateOffsetAsStateN6fFfp4(long j8, AnimationSpec animationSpec, Function1 function1, Composer composer, int i8, int i9) {
        AnimationSpec animationSpec2;
        Function1 function12;
        composer.startReplaceableGroup(-456513133);
        if ((i9 & 2) != 0) {
            animationSpec2 = offsetDefaultSpring;
        } else {
            animationSpec2 = animationSpec;
        }
        if ((i9 & 4) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-456513133, i8, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:494)");
        }
        State animateValueAsState = animateValueAsState(Offset.m2701boximpl(j8), VectorConvertersKt.getVectorConverter(Offset.Companion), animationSpec2, null, null, function12, composer, (i8 & 14) | ((i8 << 3) & 896) | ((i8 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    public static final State<Rect> animateRectAsState(Rect targetValue, AnimationSpec<Rect> animationSpec, String str, Function1 function1, Composer composer, int i8, int i9) {
        AbstractC3292y.i(targetValue, "targetValue");
        composer.startReplaceableGroup(536062978);
        AnimationSpec<Rect> animationSpec2 = (i9 & 2) != 0 ? rectDefaultSpring : animationSpec;
        String str2 = (i9 & 4) != 0 ? "RectAnimation" : str;
        Function1 function12 = (i9 & 8) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(536062978, i8, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:230)");
        }
        int i10 = i8 << 6;
        State<Rect> animateValueAsState = animateValueAsState(targetValue, VectorConvertersKt.getVectorConverter(Rect.Companion), animationSpec2, null, str2, function12, composer, (i8 & 14) | ((i8 << 3) & 896) | (57344 & i10) | (i10 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    /* renamed from: animateSizeAsState-LjSzlW0 */
    public static final /* synthetic */ State m184animateSizeAsStateLjSzlW0(long j8, AnimationSpec animationSpec, Function1 function1, Composer composer, int i8, int i9) {
        AnimationSpec animationSpec2;
        Function1 function12;
        composer.startReplaceableGroup(875212471);
        if ((i9 & 2) != 0) {
            animationSpec2 = sizeDefaultSpring;
        } else {
            animationSpec2 = animationSpec;
        }
        if ((i9 & 4) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(875212471, i8, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:476)");
        }
        State animateValueAsState = animateValueAsState(Size.m2769boximpl(j8), VectorConvertersKt.getVectorConverter(Size.Companion), animationSpec2, null, null, function12, composer, (i8 & 14) | ((i8 << 3) & 896) | ((i8 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    /* renamed from: animateSizeAsState-YLp_XPw */
    public static final State<Size> m185animateSizeAsStateYLp_XPw(long j8, AnimationSpec<Size> animationSpec, String str, Function1 function1, Composer composer, int i8, int i9) {
        AnimationSpec<Size> animationSpec2;
        String str2;
        Function1 function12;
        composer.startReplaceableGroup(1374633148);
        if ((i9 & 2) != 0) {
            animationSpec2 = sizeDefaultSpring;
        } else {
            animationSpec2 = animationSpec;
        }
        if ((i9 & 4) != 0) {
            str2 = "SizeAnimation";
        } else {
            str2 = str;
        }
        if ((i9 & 8) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1374633148, i8, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:149)");
        }
        int i10 = i8 << 6;
        State<Size> animateValueAsState = animateValueAsState(Size.m2769boximpl(j8), VectorConvertersKt.getVectorConverter(Size.Companion), animationSpec2, null, str2, function12, composer, (i8 & 14) | ((i8 << 3) & 896) | (57344 & i10) | (i10 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    public static final <T, V extends AnimationVector> State<T> animateValueAsState(T t8, TwoWayConverter<T, V> typeConverter, AnimationSpec<T> animationSpec, T t9, String str, Function1 function1, Composer composer, int i8, int i9) {
        AnimationSpec<T> animationSpec2;
        AbstractC3292y.i(typeConverter, "typeConverter");
        composer.startReplaceableGroup(-1994373980);
        if ((i9 & 4) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            animationSpec2 = (AnimationSpec) rememberedValue;
        } else {
            animationSpec2 = animationSpec;
        }
        T t10 = (i9 & 8) != 0 ? null : t9;
        String str2 = (i9 & 16) != 0 ? "ValueAnimation" : str;
        Function1 function12 = (i9 & 32) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1994373980, i8, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:390)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue2;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new Animatable(t8, typeConverter, t10, str2);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue3;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function12, composer, (i8 >> 15) & 14);
        if (t10 != null && (animationSpec2 instanceof SpringSpec)) {
            SpringSpec springSpec = (SpringSpec) animationSpec2;
            if (!AbstractC3292y.d(springSpec.getVisibilityThreshold(), t10)) {
                animationSpec2 = AnimationSpecKt.spring(springSpec.getDampingRatio(), springSpec.getStiffness(), t10);
            }
        }
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(animationSpec2, composer, 0);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = p6.g.b(-1, null, null, 6, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        p6.d dVar = (p6.d) rememberedValue4;
        EffectsKt.SideEffect(new AnimateAsStateKt$animateValueAsState$2(dVar, t8), composer, 0);
        EffectsKt.LaunchedEffect(dVar, new AnimateAsStateKt$animateValueAsState$3(dVar, animatable, rememberUpdatedState2, rememberUpdatedState, null), composer, 72);
        State<T> state = (State) mutableState.getValue();
        if (state == null) {
            state = animatable.asState();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return state;
    }

    public static final <T> Function1 animateValueAsState$lambda$4(State<? extends Function1> state) {
        return state.getValue();
    }

    public static final <T> AnimationSpec<T> animateValueAsState$lambda$6(State<? extends AnimationSpec<T>> state) {
        return state.getValue();
    }

    @Composable
    public static final /* synthetic */ State animateRectAsState(Rect targetValue, AnimationSpec animationSpec, Function1 function1, Composer composer, int i8, int i9) {
        AbstractC3292y.i(targetValue, "targetValue");
        composer.startReplaceableGroup(-782613967);
        if ((i9 & 2) != 0) {
            animationSpec = rectDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i9 & 4) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-782613967, i8, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:509)");
        }
        State animateValueAsState = animateValueAsState(targetValue, VectorConvertersKt.getVectorConverter(Rect.Companion), animationSpec2, null, null, function12, composer, (i8 & 14) | ((i8 << 3) & 896) | ((i8 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    public static final /* synthetic */ State animateIntAsState(int i8, AnimationSpec animationSpec, Function1 function1, Composer composer, int i9, int i10) {
        composer.startReplaceableGroup(-842612981);
        if ((i10 & 2) != 0) {
            animationSpec = intDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i10 & 4) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-842612981, i9, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:524)");
        }
        State animateValueAsState = animateValueAsState(Integer.valueOf(i8), VectorConvertersKt.getVectorConverter(C3291x.f34603a), animationSpec2, null, null, function12, composer, (i9 & 14) | ((i9 << 3) & 896) | ((i9 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    @Composable
    public static final /* synthetic */ State animateFloatAsState(float f8, AnimationSpec animationSpec, float f9, Function1 function1, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(1091643291);
        if ((i9 & 2) != 0) {
            animationSpec = defaultAnimation;
        }
        AnimationSpec animationSpec2 = animationSpec;
        float f10 = (i9 & 4) != 0 ? 0.01f : f9;
        if ((i9 & 8) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1091643291, i8, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:441)");
        }
        State<Float> animateFloatAsState = animateFloatAsState(f8, animationSpec2, f10, null, function12, composer, (i8 & 1022) | ((i8 << 3) & 57344), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateFloatAsState;
    }

    @Composable
    public static final /* synthetic */ State animateValueAsState(Object obj, TwoWayConverter typeConverter, AnimationSpec animationSpec, Object obj2, Function1 function1, Composer composer, int i8, int i9) {
        AnimationSpec animationSpec2;
        AbstractC3292y.i(typeConverter, "typeConverter");
        composer.startReplaceableGroup(-846382129);
        if ((i9 & 4) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            animationSpec2 = (AnimationSpec) rememberedValue;
        } else {
            animationSpec2 = animationSpec;
        }
        Object obj3 = (i9 & 8) != 0 ? null : obj2;
        Function1 function12 = (i9 & 16) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-846382129, i8, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:569)");
        }
        int i10 = i8 & 8;
        State animateValueAsState = animateValueAsState(obj, typeConverter, animationSpec2, obj3, "ValueAnimation", function12, composer, (i10 << 9) | i10 | 24576 | (i8 & 14) | (i8 & 112) | (i8 & 896) | (i8 & 7168) | ((i8 << 3) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }
}
