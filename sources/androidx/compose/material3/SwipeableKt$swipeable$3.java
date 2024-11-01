package androidx.compose.material3;

import Q5.I;
import Q5.t;
import R5.AbstractC1435t;
import R5.Q;
import U5.d;
import V5.b;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SwipeableKt$swipeable$3 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ Map<Float, T> $anchors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ ResistanceConfig $resistance;
    final /* synthetic */ boolean $reverseDirection;
    final /* synthetic */ SwipeableState<T> $state;
    final /* synthetic */ InterfaceC2072n $thresholds;
    final /* synthetic */ float $velocityThreshold;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material3.SwipeableKt$swipeable$3$3", f = "Swipeable.kt", l = {TypedValues.MotionType.TYPE_EASING}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SwipeableKt$swipeable$3$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends l implements InterfaceC2072n {
        final /* synthetic */ Map<Float, T> $anchors;
        final /* synthetic */ Density $density;
        final /* synthetic */ ResistanceConfig $resistance;
        final /* synthetic */ SwipeableState<T> $state;
        final /* synthetic */ InterfaceC2072n $thresholds;
        final /* synthetic */ float $velocityThreshold;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material3.SwipeableKt$swipeable$3$3$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
            final /* synthetic */ Map<Float, T> $anchors;
            final /* synthetic */ Density $density;
            final /* synthetic */ InterfaceC2072n $thresholds;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Map<Float, ? extends T> map, InterfaceC2072n interfaceC2072n, Density density) {
                super(2);
                this.$anchors = map;
                this.$thresholds = interfaceC2072n;
                this.$density = density;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
            }

            public final Float invoke(float f8, float f9) {
                return Float.valueOf(((ThresholdConfig) this.$thresholds.invoke(Q.i(this.$anchors, Float.valueOf(f8)), Q.i(this.$anchors, Float.valueOf(f9)))).computeThreshold(this.$density, f8, f9));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(SwipeableState<T> swipeableState, Map<Float, ? extends T> map, ResistanceConfig resistanceConfig, Density density, InterfaceC2072n interfaceC2072n, float f8, d dVar) {
            super(2, dVar);
            this.$state = swipeableState;
            this.$anchors = map;
            this.$resistance = resistanceConfig;
            this.$density = density;
            this.$thresholds = interfaceC2072n;
            this.$velocityThreshold = f8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass3(this.$state, this.$anchors, this.$resistance, this.$density, this.$thresholds, this.$velocityThreshold, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = b.e();
            int i8 = this.label;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                Map anchors$material3_release = this.$state.getAnchors$material3_release();
                this.$state.setAnchors$material3_release(this.$anchors);
                this.$state.setResistance$material3_release(this.$resistance);
                this.$state.setThresholds$material3_release(new AnonymousClass1(this.$anchors, this.$thresholds, this.$density));
                this.$state.setVelocityThreshold$material3_release(this.$density.mo425toPx0680j_4(this.$velocityThreshold));
                SwipeableState<T> swipeableState = this.$state;
                Object obj2 = this.$anchors;
                this.label = 1;
                if (swipeableState.processNewAnchors$material3_release(anchors$material3_release, obj2, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, d dVar) {
            return ((AnonymousClass3) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableKt$swipeable$3(Map<Float, ? extends T> map, SwipeableState<T> swipeableState, Orientation orientation, boolean z8, MutableInteractionSource mutableInteractionSource, boolean z9, ResistanceConfig resistanceConfig, InterfaceC2072n interfaceC2072n, float f8) {
        super(3);
        this.$anchors = map;
        this.$state = swipeableState;
        this.$orientation = orientation;
        this.$enabled = z8;
        this.$interactionSource = mutableInteractionSource;
        this.$reverseDirection = z9;
        this.$resistance = resistanceConfig;
        this.$thresholds = interfaceC2072n;
        this.$velocityThreshold = f8;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier composed, Composer composer, int i8) {
        AbstractC3292y.i(composed, "$this$composed");
        composer.startReplaceableGroup(1169892884);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1169892884, i8, -1, "androidx.compose.material3.swipeable.<anonymous> (Swipeable.kt:581)");
        }
        if (!this.$anchors.isEmpty()) {
            if (AbstractC1435t.e0(this.$anchors.values()).size() == this.$anchors.size()) {
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                this.$state.ensureInit$material3_release(this.$anchors);
                Map<Float, T> map = this.$anchors;
                SwipeableState<T> swipeableState = this.$state;
                EffectsKt.LaunchedEffect(map, swipeableState, new AnonymousClass3(swipeableState, map, this.$resistance, density, this.$thresholds, this.$velocityThreshold, null), composer, 520);
                Modifier.Companion companion = Modifier.Companion;
                boolean isAnimationRunning = this.$state.isAnimationRunning();
                DraggableState draggableState$material3_release = this.$state.getDraggableState$material3_release();
                Orientation orientation = this.$orientation;
                boolean z8 = this.$enabled;
                MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                SwipeableState<T> swipeableState2 = this.$state;
                composer.startReplaceableGroup(1157296644);
                boolean changed = composer.changed(swipeableState2);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new SwipeableKt$swipeable$3$4$1(swipeableState2, null);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier draggable$default = DraggableKt.draggable$default(companion, draggableState$material3_release, orientation, z8, mutableInteractionSource, isAnimationRunning, null, (InterfaceC2073o) rememberedValue, this.$reverseDirection, 32, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return draggable$default;
            }
            throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.".toString());
        }
        throw new IllegalArgumentException("You must have at least one anchor.".toString());
    }
}
