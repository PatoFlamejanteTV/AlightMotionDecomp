package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.C3291x;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class TransitionKt {
    public static final int AnimationDebugDurationScale = 1;

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Dp> animateDp(Transition<S> transition, InterfaceC2073o interfaceC2073o, String str, InterfaceC2073o targetValueByState, Composer composer, int i8, int i9) {
        AbstractC3292y.i(transition, "<this>");
        AbstractC3292y.i(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(184732935);
        if ((i9 & 1) != 0) {
            interfaceC2073o = TransitionKt$animateDp$1.INSTANCE;
        }
        if ((i9 & 2) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        TwoWayConverter<Dp, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(Dp.Companion);
        int i10 = i8 & 14;
        int i11 = i8 << 3;
        int i12 = i10 | (i11 & 896) | (i11 & 7168) | (i11 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i13 = (i12 >> 9) & 112;
        State<Dp> createTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(transition.getCurrentState(), composer, Integer.valueOf(i13)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i13)), (FiniteAnimationSpec) interfaceC2073o.invoke(transition.getSegment(), composer, Integer.valueOf((i12 >> 3) & 112)), vectorConverter, str2, composer, (i12 & 14) | ((i12 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Float> animateFloat(Transition<S> transition, InterfaceC2073o interfaceC2073o, String str, InterfaceC2073o targetValueByState, Composer composer, int i8, int i9) {
        AbstractC3292y.i(transition, "<this>");
        AbstractC3292y.i(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(-1338768149);
        if ((i9 & 1) != 0) {
            interfaceC2073o = TransitionKt$animateFloat$1.INSTANCE;
        }
        if ((i9 & 2) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(r.f34602a);
        int i10 = i8 & 14;
        int i11 = i8 << 3;
        int i12 = i10 | (i11 & 896) | (i11 & 7168) | (i11 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i13 = (i12 >> 9) & 112;
        State<Float> createTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(transition.getCurrentState(), composer, Integer.valueOf(i13)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i13)), (FiniteAnimationSpec) interfaceC2073o.invoke(transition.getSegment(), composer, Integer.valueOf((i12 >> 3) & 112)), vectorConverter, str2, composer, (i12 & 14) | ((i12 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Integer> animateInt(Transition<S> transition, InterfaceC2073o interfaceC2073o, String str, InterfaceC2073o targetValueByState, Composer composer, int i8, int i9) {
        AbstractC3292y.i(transition, "<this>");
        AbstractC3292y.i(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(1318902782);
        if ((i9 & 1) != 0) {
            interfaceC2073o = TransitionKt$animateInt$1.INSTANCE;
        }
        if ((i9 & 2) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(C3291x.f34603a);
        int i10 = i8 & 14;
        int i11 = i8 << 3;
        int i12 = i10 | (i11 & 896) | (i11 & 7168) | (i11 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i13 = (i12 >> 9) & 112;
        State<Integer> createTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(transition.getCurrentState(), composer, Integer.valueOf(i13)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i13)), (FiniteAnimationSpec) interfaceC2073o.invoke(transition.getSegment(), composer, Integer.valueOf((i12 >> 3) & 112)), vectorConverter, str2, composer, (i12 & 14) | ((i12 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<IntOffset> animateIntOffset(Transition<S> transition, InterfaceC2073o interfaceC2073o, String str, InterfaceC2073o targetValueByState, Composer composer, int i8, int i9) {
        AbstractC3292y.i(transition, "<this>");
        AbstractC3292y.i(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(776131825);
        if ((i9 & 1) != 0) {
            interfaceC2073o = TransitionKt$animateIntOffset$1.INSTANCE;
        }
        if ((i9 & 2) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
        int i10 = i8 & 14;
        int i11 = i8 << 3;
        int i12 = i10 | (i11 & 896) | (i11 & 7168) | (i11 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i13 = (i12 >> 9) & 112;
        State<IntOffset> createTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(transition.getCurrentState(), composer, Integer.valueOf(i13)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i13)), (FiniteAnimationSpec) interfaceC2073o.invoke(transition.getSegment(), composer, Integer.valueOf((i12 >> 3) & 112)), vectorConverter, str2, composer, (i12 & 14) | ((i12 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<IntSize> animateIntSize(Transition<S> transition, InterfaceC2073o interfaceC2073o, String str, InterfaceC2073o targetValueByState, Composer composer, int i8, int i9) {
        AbstractC3292y.i(transition, "<this>");
        AbstractC3292y.i(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(-2104123233);
        if ((i9 & 1) != 0) {
            interfaceC2073o = TransitionKt$animateIntSize$1.INSTANCE;
        }
        if ((i9 & 2) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        TwoWayConverter<IntSize, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntSize.Companion);
        int i10 = i8 & 14;
        int i11 = i8 << 3;
        int i12 = i10 | (i11 & 896) | (i11 & 7168) | (i11 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i13 = (i12 >> 9) & 112;
        State<IntSize> createTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(transition.getCurrentState(), composer, Integer.valueOf(i13)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i13)), (FiniteAnimationSpec) interfaceC2073o.invoke(transition.getSegment(), composer, Integer.valueOf((i12 >> 3) & 112)), vectorConverter, str2, composer, (i12 & 14) | ((i12 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Offset> animateOffset(Transition<S> transition, InterfaceC2073o interfaceC2073o, String str, InterfaceC2073o targetValueByState, Composer composer, int i8, int i9) {
        AbstractC3292y.i(transition, "<this>");
        AbstractC3292y.i(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(2078477582);
        if ((i9 & 1) != 0) {
            interfaceC2073o = TransitionKt$animateOffset$1.INSTANCE;
        }
        if ((i9 & 2) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        TwoWayConverter<Offset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Offset.Companion);
        int i10 = i8 & 14;
        int i11 = i8 << 3;
        int i12 = i10 | (i11 & 896) | (i11 & 7168) | (i11 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i13 = (i12 >> 9) & 112;
        State<Offset> createTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(transition.getCurrentState(), composer, Integer.valueOf(i13)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i13)), (FiniteAnimationSpec) interfaceC2073o.invoke(transition.getSegment(), composer, Integer.valueOf((i12 >> 3) & 112)), vectorConverter, str2, composer, (i12 & 14) | ((i12 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Rect> animateRect(Transition<S> transition, InterfaceC2073o interfaceC2073o, String str, InterfaceC2073o targetValueByState, Composer composer, int i8, int i9) {
        AbstractC3292y.i(transition, "<this>");
        AbstractC3292y.i(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(1496278239);
        if ((i9 & 1) != 0) {
            interfaceC2073o = TransitionKt$animateRect$1.INSTANCE;
        }
        if ((i9 & 2) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        TwoWayConverter<Rect, AnimationVector4D> vectorConverter = VectorConvertersKt.getVectorConverter(Rect.Companion);
        int i10 = i8 & 14;
        int i11 = i8 << 3;
        int i12 = i10 | (i11 & 896) | (i11 & 7168) | (i11 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i13 = (i12 >> 9) & 112;
        State<Rect> createTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(transition.getCurrentState(), composer, Integer.valueOf(i13)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i13)), (FiniteAnimationSpec) interfaceC2073o.invoke(transition.getSegment(), composer, Integer.valueOf((i12 >> 3) & 112)), vectorConverter, str2, composer, (i12 & 14) | ((i12 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Size> animateSize(Transition<S> transition, InterfaceC2073o interfaceC2073o, String str, InterfaceC2073o targetValueByState, Composer composer, int i8, int i9) {
        AbstractC3292y.i(transition, "<this>");
        AbstractC3292y.i(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(-802210820);
        if ((i9 & 1) != 0) {
            interfaceC2073o = TransitionKt$animateSize$1.INSTANCE;
        }
        if ((i9 & 2) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        TwoWayConverter<Size, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Size.Companion);
        int i10 = i8 & 14;
        int i11 = i8 << 3;
        int i12 = i10 | (i11 & 896) | (i11 & 7168) | (i11 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i13 = (i12 >> 9) & 112;
        State<Size> createTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(transition.getCurrentState(), composer, Integer.valueOf(i13)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i13)), (FiniteAnimationSpec) interfaceC2073o.invoke(transition.getSegment(), composer, Integer.valueOf((i12 >> 3) & 112)), vectorConverter, str2, composer, (i12 & 14) | ((i12 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S, T, V extends AnimationVector> State<T> animateValue(Transition<S> transition, TwoWayConverter<T, V> typeConverter, InterfaceC2073o interfaceC2073o, String str, InterfaceC2073o targetValueByState, Composer composer, int i8, int i9) {
        AbstractC3292y.i(transition, "<this>");
        AbstractC3292y.i(typeConverter, "typeConverter");
        AbstractC3292y.i(targetValueByState, "targetValueByState");
        composer.startReplaceableGroup(-142660079);
        if ((i9 & 2) != 0) {
            interfaceC2073o = TransitionKt$animateValue$1.INSTANCE;
        }
        if ((i9 & 4) != 0) {
            str = "ValueAnimation";
        }
        int i10 = (i8 >> 9) & 112;
        State<T> createTransitionAnimation = createTransitionAnimation(transition, targetValueByState.invoke(transition.getCurrentState(), composer, Integer.valueOf(i10)), targetValueByState.invoke(transition.getTargetState(), composer, Integer.valueOf(i10)), (FiniteAnimationSpec) interfaceC2073o.invoke(transition.getSegment(), composer, Integer.valueOf((i8 >> 3) & 112)), typeConverter, str, composer, (i8 & 14) | (57344 & (i8 << 9)) | ((i8 << 6) & 458752));
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @ExperimentalTransitionApi
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <S, T> Transition<T> createChildTransition(Transition<S> transition, String str, InterfaceC2073o transformToChildState, Composer composer, int i8, int i9) {
        AbstractC3292y.i(transition, "<this>");
        AbstractC3292y.i(transformToChildState, "transformToChildState");
        composer.startReplaceableGroup(1215497572);
        if ((i9 & 1) != 0) {
            str = "ChildTransition";
        }
        String str2 = str;
        int i10 = i8 & 14;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = transition.getCurrentState();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        if (transition.isSeeking()) {
            rememberedValue = transition.getCurrentState();
        }
        int i11 = (i8 >> 3) & 112;
        Transition<T> createChildTransitionInternal = createChildTransitionInternal(transition, transformToChildState.invoke(rememberedValue, composer, Integer.valueOf(i11)), transformToChildState.invoke(transition.getTargetState(), composer, Integer.valueOf(i11)), str2, composer, i10 | ((i8 << 6) & 7168));
        composer.endReplaceableGroup();
        return createChildTransitionInternal;
    }

    @Composable
    public static final <S, T> Transition<T> createChildTransitionInternal(Transition<S> transition, T t8, T t9, String childLabel, Composer composer, int i8) {
        AbstractC3292y.i(transition, "<this>");
        AbstractC3292y.i(childLabel, "childLabel");
        composer.startReplaceableGroup(-198307638);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-198307638, i8, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:794)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Transition(new MutableTransitionState(t8), transition.getLabel() + " > " + childLabel);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Transition<T> transition2 = (Transition) rememberedValue;
        composer.startReplaceableGroup(511388516);
        boolean changed2 = composer.changed(transition) | composer.changed(transition2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new TransitionKt$createChildTransitionInternal$1$1(transition, transition2);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transition2, (Function1) rememberedValue2, composer, 0);
        if (transition.isSeeking()) {
            transition2.seek(t8, t9, transition.getLastSeekedTimeNanos$animation_core_release());
        } else {
            transition2.updateTarget$animation_core_release(t9, composer, ((i8 >> 3) & 8) | ((i8 >> 6) & 14));
            transition2.setSeeking$animation_core_release(false);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transition2;
    }

    @Composable
    @InternalAnimationApi
    public static final <S, T, V extends AnimationVector> Transition<S>.DeferredAnimation<T, V> createDeferredAnimation(Transition<S> transition, TwoWayConverter<T, V> typeConverter, String str, Composer composer, int i8, int i9) {
        AbstractC3292y.i(transition, "<this>");
        AbstractC3292y.i(typeConverter, "typeConverter");
        composer.startReplaceableGroup(-1714122528);
        if ((i9 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1714122528, i8, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:749)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Transition.DeferredAnimation(transition, typeConverter, str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Transition<S>.DeferredAnimation<T, V> deferredAnimation = (Transition.DeferredAnimation) rememberedValue;
        EffectsKt.DisposableEffect(deferredAnimation, new TransitionKt$createDeferredAnimation$1(transition, deferredAnimation), composer, 0);
        if (transition.isSeeking()) {
            deferredAnimation.setupSeeking$animation_core_release();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return deferredAnimation;
    }

    @Composable
    public static final <S, T, V extends AnimationVector> State<T> createTransitionAnimation(Transition<S> transition, T t8, T t9, FiniteAnimationSpec<T> animationSpec, TwoWayConverter<T, V> typeConverter, String label, Composer composer, int i8) {
        AbstractC3292y.i(transition, "<this>");
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(typeConverter, "typeConverter");
        AbstractC3292y.i(label, "label");
        composer.startReplaceableGroup(-304821198);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304821198, i8, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:866)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Transition.TransitionAnimationState(transition, t8, AnimationStateKt.createZeroVectorFrom(typeConverter, t9), typeConverter, label);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Transition.TransitionAnimationState transitionAnimationState = (Transition.TransitionAnimationState) rememberedValue;
        if (transition.isSeeking()) {
            transitionAnimationState.updateInitialAndTargetValue$animation_core_release(t8, t9, animationSpec);
        } else {
            transitionAnimationState.updateTargetValue$animation_core_release(t9, animationSpec);
        }
        composer.startReplaceableGroup(511388516);
        boolean changed2 = composer.changed(transition) | composer.changed(transitionAnimationState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new TransitionKt$createTransitionAnimation$1$1(transition, transitionAnimationState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transitionAnimationState, (Function1) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transitionAnimationState;
    }

    @Composable
    public static final <T> Transition<T> updateTransition(T t8, String str, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(2029166765);
        if ((i9 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2029166765, i8, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:67)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new Transition(t8, str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Transition<T> transition = (Transition) rememberedValue;
        transition.animateTo$animation_core_release(t8, composer, (i8 & 8) | 48 | (i8 & 14));
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transition);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new TransitionKt$updateTransition$1$1(transition);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transition, (Function1) rememberedValue2, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transition;
    }

    @Composable
    public static final <T> Transition<T> updateTransition(MutableTransitionState<T> transitionState, String str, Composer composer, int i8, int i9) {
        AbstractC3292y.i(transitionState, "transitionState");
        composer.startReplaceableGroup(882913843);
        if ((i9 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(882913843, i8, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:150)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(transitionState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Transition((MutableTransitionState) transitionState, str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Transition<T> transition = (Transition) rememberedValue;
        transition.animateTo$animation_core_release(transitionState.getTargetState(), composer, 0);
        composer.startReplaceableGroup(1157296644);
        boolean changed2 = composer.changed(transition);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new TransitionKt$updateTransition$2$1(transition);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transition, (Function1) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transition;
    }
}
