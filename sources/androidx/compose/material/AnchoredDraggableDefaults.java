package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.M;

@Stable
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class AnchoredDraggableDefaults {
    public static final AnchoredDraggableDefaults INSTANCE = new AnchoredDraggableDefaults();
    private static final SpringSpec<Float> AnimationSpec = new SpringSpec<>(0.0f, 0.0f, null, 7, null);

    private AnchoredDraggableDefaults() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getAnimationSpec$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getPositionalThreshold$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getVelocityThreshold$annotations() {
    }

    @ExperimentalMaterialApi
    public final <T> AnchoredDraggableState.AnchorChangedCallback<T> ReconcileAnimationOnAnchorChangedCallback$material_release(final AnchoredDraggableState<T> state, final M scope) {
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(scope, "scope");
        return new AnchoredDraggableState.AnchorChangedCallback<T>() { // from class: androidx.compose.material.AnchoredDraggableDefaults$ReconcileAnimationOnAnchorChangedCallback$1
            @Override // androidx.compose.material.AnchoredDraggableState.AnchorChangedCallback
            public final void onAnchorsChanged(T t8, Map<T, Float> previousAnchors, Map<T, Float> newAnchors) {
                AbstractC3292y.i(previousAnchors, "previousAnchors");
                AbstractC3292y.i(newAnchors, "newAnchors");
                Float f8 = previousAnchors.get(t8);
                Float f9 = newAnchors.get(t8);
                if (!AbstractC3292y.c(f8, f9)) {
                    if (f9 != null) {
                        AbstractC3462k.d(M.this, null, null, new AnchoredDraggableDefaults$ReconcileAnimationOnAnchorChangedCallback$1$onAnchorsChanged$1(state, t8, null), 3, null);
                    } else {
                        AbstractC3462k.d(M.this, null, null, new AnchoredDraggableDefaults$ReconcileAnimationOnAnchorChangedCallback$1$onAnchorsChanged$2(state, newAnchors, null), 3, null);
                    }
                }
            }
        };
    }

    @ExperimentalMaterialApi
    public final SpringSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    @Composable
    @ExperimentalMaterialApi
    public final Function1 getPositionalThreshold(Composer composer, int i8) {
        composer.startReplaceableGroup(82866976);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(82866976, i8, -1, "androidx.compose.material.AnchoredDraggableDefaults.<get-positionalThreshold> (AnchoredDraggable.kt:663)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(density);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new AnchoredDraggableDefaults$positionalThreshold$1$1$1(density);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function1 function1 = (Function1) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function1;
    }

    @Composable
    @ExperimentalMaterialApi
    public final Function0 getVelocityThreshold(Composer composer, int i8) {
        composer.startReplaceableGroup(2030704141);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2030704141, i8, -1, "androidx.compose.material.AnchoredDraggableDefaults.<get-velocityThreshold> (AnchoredDraggable.kt:654)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(density);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new AnchoredDraggableDefaults$velocityThreshold$1$1$1(density);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function0 function0 = (Function0) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function0;
    }
}
