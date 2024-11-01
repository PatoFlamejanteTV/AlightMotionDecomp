package androidx.compose.material;

import Q5.I;
import U5.d;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AnchoredDraggableKt {
    @ExperimentalMaterialApi
    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> state, Orientation orientation, boolean z8, boolean z9, MutableInteractionSource mutableInteractionSource) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(orientation, "orientation");
        return DraggableKt.draggable$default(modifier, state.getDraggableState$material_release(), orientation, z8, mutableInteractionSource, state.isAnimationRunning(), null, new AnchoredDraggableKt$anchoredDraggable$1(state, null), z9, 32, null);
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z8, boolean z9, MutableInteractionSource mutableInteractionSource, int i8, Object obj) {
        boolean z10;
        boolean z11;
        if ((i8 & 4) != 0) {
            z10 = true;
        } else {
            z10 = z8;
        }
        if ((i8 & 8) != 0) {
            z11 = false;
        } else {
            z11 = z9;
        }
        if ((i8 & 16) != 0) {
            mutableInteractionSource = null;
        }
        return anchoredDraggable(modifier, anchoredDraggableState, orientation, z10, z11, mutableInteractionSource);
    }

    @ExperimentalMaterialApi
    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, T t8, float f8, d dVar) {
        Object anchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t8, null, new AnchoredDraggableKt$animateTo$2(t8, anchoredDraggableState, f8, null), dVar, 2, null);
        if (anchoredDrag$default == V5.b.e()) {
            return anchoredDrag$default;
        }
        return I.f8786a;
    }

    public static /* synthetic */ Object animateTo$default(AnchoredDraggableState anchoredDraggableState, Object obj, float f8, d dVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            f8 = anchoredDraggableState.getLastVelocity();
        }
        return animateTo(anchoredDraggableState, obj, f8, dVar);
    }

    public static final <T> T closestAnchor(Map<T, Float> map, float f8, boolean z8) {
        float f9;
        float f10;
        if (!map.isEmpty()) {
            Iterator<T> it = map.entrySet().iterator();
            if (it.hasNext()) {
                T next = it.next();
                if (it.hasNext()) {
                    float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                    if (z8) {
                        f9 = floatValue - f8;
                    } else {
                        f9 = f8 - floatValue;
                    }
                    if (f9 < 0.0f) {
                        f9 = Float.POSITIVE_INFINITY;
                    }
                    do {
                        T next2 = it.next();
                        float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                        if (z8) {
                            f10 = floatValue2 - f8;
                        } else {
                            f10 = f8 - floatValue2;
                        }
                        if (f10 < 0.0f) {
                            f10 = Float.POSITIVE_INFINITY;
                        }
                        if (Float.compare(f9, f10) > 0) {
                            next = next2;
                            f9 = f10;
                        }
                    } while (it.hasNext());
                }
                return (T) ((Map.Entry) next).getKey();
            }
            throw new NoSuchElementException();
        }
        throw new IllegalArgumentException("The anchors were empty when trying to find the closest anchor".toString());
    }

    public static /* synthetic */ Object closestAnchor$default(Map map, float f8, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 0.0f;
        }
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return closestAnchor(map, f8, z8);
    }

    public static final <T> Float maxOrNull(Map<T, Float> map) {
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final <T> Float minOrNull(Map<T, Float> map) {
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @Composable
    @ExperimentalMaterialApi
    public static final <T> AnchoredDraggableState<T> rememberAnchoredDraggableState(T initialValue, AnimationSpec<Float> animationSpec, Function1 function1, Composer composer, int i8, int i9) {
        AnimationSpec<Float> animationSpec2;
        Function1 function12;
        AbstractC3292y.i(initialValue, "initialValue");
        composer.startReplaceableGroup(-1812391462);
        if ((i9 & 2) != 0) {
            animationSpec2 = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        } else {
            animationSpec2 = animationSpec;
        }
        if ((i9 & 4) != 0) {
            function12 = AnchoredDraggableKt$rememberAnchoredDraggableState$1.INSTANCE;
        } else {
            function12 = function1;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1812391462, i8, -1, "androidx.compose.material.rememberAnchoredDraggableState (AnchoredDraggable.kt:606)");
        }
        AnchoredDraggableDefaults anchoredDraggableDefaults = AnchoredDraggableDefaults.INSTANCE;
        Function1 positionalThreshold = anchoredDraggableDefaults.getPositionalThreshold(composer, 6);
        Function0 velocityThreshold = anchoredDraggableDefaults.getVelocityThreshold(composer, 6);
        AnchoredDraggableState<T> anchoredDraggableState = (AnchoredDraggableState) RememberSaveableKt.m2560rememberSaveable(new Object[]{initialValue, animationSpec2, function12, positionalThreshold, velocityThreshold}, (Saver) AnchoredDraggableState.Companion.Saver(animationSpec2, function12, positionalThreshold, velocityThreshold), (String) null, (Function0) new AnchoredDraggableKt$rememberAnchoredDraggableState$2(initialValue, positionalThreshold, velocityThreshold, animationSpec2, function12), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return anchoredDraggableState;
    }

    @ExperimentalMaterialApi
    public static final <T> Object snapTo(AnchoredDraggableState<T> anchoredDraggableState, T t8, d dVar) {
        Object anchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t8, null, new AnchoredDraggableKt$snapTo$2(t8, null), dVar, 2, null);
        if (anchoredDrag$default == V5.b.e()) {
            return anchoredDrag$default;
        }
        return I.f8786a;
    }
}
