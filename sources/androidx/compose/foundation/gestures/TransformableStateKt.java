package androidx.compose.foundation.gestures;

import Q5.I;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.S;

/* loaded from: classes.dex */
public final class TransformableStateKt {
    public static final TransformableState TransformableState(InterfaceC2073o onTransformation) {
        AbstractC3292y.i(onTransformation, "onTransformation");
        return new DefaultTransformableState(onTransformation);
    }

    /* renamed from: animatePanBy-ubNVwUQ, reason: not valid java name */
    public static final Object m454animatePanByubNVwUQ(TransformableState transformableState, long j8, AnimationSpec<Offset> animationSpec, U5.d dVar) {
        S s8 = new S();
        s8.f34572a = Offset.Companion.m2728getZeroF1C5BW0();
        Object a9 = e.a(transformableState, null, new TransformableStateKt$animatePanBy$2(s8, j8, animationSpec, null), dVar, 1, null);
        if (a9 == V5.b.e()) {
            return a9;
        }
        return I.f8786a;
    }

    /* renamed from: animatePanBy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ Object m455animatePanByubNVwUQ$default(TransformableState transformableState, long j8, AnimationSpec animationSpec, U5.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return m454animatePanByubNVwUQ(transformableState, j8, animationSpec, dVar);
    }

    public static final Object animateRotateBy(TransformableState transformableState, float f8, AnimationSpec<Float> animationSpec, U5.d dVar) {
        Object a9 = e.a(transformableState, null, new TransformableStateKt$animateRotateBy$2(new P(), f8, animationSpec, null), dVar, 1, null);
        if (a9 == V5.b.e()) {
            return a9;
        }
        return I.f8786a;
    }

    public static /* synthetic */ Object animateRotateBy$default(TransformableState transformableState, float f8, AnimationSpec animationSpec, U5.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateRotateBy(transformableState, f8, animationSpec, dVar);
    }

    public static final Object animateZoomBy(TransformableState transformableState, float f8, AnimationSpec<Float> animationSpec, U5.d dVar) {
        if (f8 > 0.0f) {
            P p8 = new P();
            p8.f34570a = 1.0f;
            Object a9 = e.a(transformableState, null, new TransformableStateKt$animateZoomBy$3(p8, f8, animationSpec, null), dVar, 1, null);
            if (a9 == V5.b.e()) {
                return a9;
            }
            return I.f8786a;
        }
        throw new IllegalArgumentException("zoom value should be greater than 0".toString());
    }

    public static /* synthetic */ Object animateZoomBy$default(TransformableState transformableState, float f8, AnimationSpec animationSpec, U5.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateZoomBy(transformableState, f8, animationSpec, dVar);
    }

    /* renamed from: panBy-d-4ec7I, reason: not valid java name */
    public static final Object m456panByd4ec7I(TransformableState transformableState, long j8, U5.d dVar) {
        Object a9 = e.a(transformableState, null, new TransformableStateKt$panBy$2(j8, null), dVar, 1, null);
        if (a9 == V5.b.e()) {
            return a9;
        }
        return I.f8786a;
    }

    @Composable
    public static final TransformableState rememberTransformableState(InterfaceC2073o onTransformation, Composer composer, int i8) {
        AbstractC3292y.i(onTransformation, "onTransformation");
        composer.startReplaceableGroup(1681419281);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1681419281, i8, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:114)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onTransformation, composer, i8 & 14);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = TransformableState(new TransformableStateKt$rememberTransformableState$1$1(rememberUpdatedState));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TransformableState transformableState = (TransformableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transformableState;
    }

    public static final Object rotateBy(TransformableState transformableState, float f8, U5.d dVar) {
        Object a9 = e.a(transformableState, null, new TransformableStateKt$rotateBy$2(f8, null), dVar, 1, null);
        if (a9 == V5.b.e()) {
            return a9;
        }
        return I.f8786a;
    }

    public static final Object stopTransformation(TransformableState transformableState, MutatePriority mutatePriority, U5.d dVar) {
        Object transform = transformableState.transform(mutatePriority, new TransformableStateKt$stopTransformation$2(null), dVar);
        if (transform == V5.b.e()) {
            return transform;
        }
        return I.f8786a;
    }

    public static /* synthetic */ Object stopTransformation$default(TransformableState transformableState, MutatePriority mutatePriority, U5.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopTransformation(transformableState, mutatePriority, dVar);
    }

    public static final Object zoomBy(TransformableState transformableState, float f8, U5.d dVar) {
        Object a9 = e.a(transformableState, null, new TransformableStateKt$zoomBy$2(f8, null), dVar, 1, null);
        if (a9 == V5.b.e()) {
            return a9;
        }
        return I.f8786a;
    }
}
