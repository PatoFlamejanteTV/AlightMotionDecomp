package androidx.compose.material;

import Q5.I;
import R5.Q;
import U5.d;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import c6.InterfaceC2073o;
import i6.m;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.N;

@Stable
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class AnchoredDraggableState<T> {
    public static final Companion Companion = new Companion(null);
    private final AnchoredDragScope anchoredDragScope;
    private final MutableState anchors$delegate;
    private final AnimationSpec<Float> animationSpec;
    private final MutableState animationTarget$delegate;
    private final State closestValue$delegate;
    private final Function1 confirmValueChange;
    private final MutableState currentValue$delegate;
    private final InternalMutatorMutex dragMutex;
    private final DraggableState draggableState;
    private final MutableFloatState lastVelocity$delegate;
    private final State maxOffset$delegate;
    private final State minOffset$delegate;
    private final MutableState offset$delegate;
    private final Function1 positionalThreshold;
    private final State progress$delegate;
    private final State targetValue$delegate;
    private final Function0 velocityThreshold;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.AnchoredDraggableState$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(T t8) {
            return Boolean.TRUE;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke((AnonymousClass1) obj);
        }
    }

    @ExperimentalMaterialApi
    /* loaded from: classes.dex */
    public interface AnchorChangedCallback<T> {
        void onAnchorsChanged(T t8, Map<T, Float> map, Map<T, Float> map2);
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @ExperimentalMaterialApi
        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(AnimationSpec<Float> animationSpec, Function1 confirmValueChange, Function1 positionalThreshold, Function0 velocityThreshold) {
            AbstractC3292y.i(animationSpec, "animationSpec");
            AbstractC3292y.i(confirmValueChange, "confirmValueChange");
            AbstractC3292y.i(positionalThreshold, "positionalThreshold");
            AbstractC3292y.i(velocityThreshold, "velocityThreshold");
            return SaverKt.Saver(AnchoredDraggableState$Companion$Saver$1.INSTANCE, new AnchoredDraggableState$Companion$Saver$2(positionalThreshold, velocityThreshold, animationSpec, confirmValueChange));
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public AnchoredDraggableState(T t8, Function1 positionalThreshold, Function0 velocityThreshold, AnimationSpec<Float> animationSpec, Function1 confirmValueChange) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        AbstractC3292y.i(positionalThreshold, "positionalThreshold");
        AbstractC3292y.i(velocityThreshold, "velocityThreshold");
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(confirmValueChange, "confirmValueChange");
        this.positionalThreshold = positionalThreshold;
        this.velocityThreshold = velocityThreshold;
        this.animationSpec = animationSpec;
        this.confirmValueChange = confirmValueChange;
        this.dragMutex = new InternalMutatorMutex();
        this.draggableState = new AnchoredDraggableState$draggableState$1(this);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t8, null, 2, null);
        this.currentValue$delegate = mutableStateOf$default;
        this.targetValue$delegate = SnapshotStateKt.derivedStateOf(new AnchoredDraggableState$targetValue$2(this));
        this.closestValue$delegate = SnapshotStateKt.derivedStateOf(new AnchoredDraggableState$closestValue$2(this));
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(Float.NaN), null, 2, null);
        this.offset$delegate = mutableStateOf$default2;
        this.progress$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new AnchoredDraggableState$progress$2(this));
        this.lastVelocity$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.minOffset$delegate = SnapshotStateKt.derivedStateOf(new AnchoredDraggableState$minOffset$2(this));
        this.maxOffset$delegate = SnapshotStateKt.derivedStateOf(new AnchoredDraggableState$maxOffset$2(this));
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.animationTarget$delegate = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Q.h(), null, 2, null);
        this.anchors$delegate = mutableStateOf$default4;
        this.anchoredDragScope = new AnchoredDragScope(this) { // from class: androidx.compose.material.AnchoredDraggableState$anchoredDragScope$1
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.this$0 = this;
            }

            @Override // androidx.compose.material.AnchoredDragScope
            public void dragTo(float f8, float f9) {
                this.this$0.setOffset(f8);
                this.this$0.setLastVelocity(f9);
            }
        };
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, InterfaceC2073o interfaceC2073o, d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, interfaceC2073o, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T computeTarget(float f8, T t8, float f9) {
        Object access$closestAnchor;
        Map<T, Float> anchors$material_release = getAnchors$material_release();
        Float f10 = anchors$material_release.get(t8);
        float floatValue = ((Number) this.velocityThreshold.invoke()).floatValue();
        if (!AbstractC3292y.b(f10, f8) && f10 != null) {
            if (f10.floatValue() < f8) {
                if (f9 >= floatValue) {
                    return (T) AnchoredDraggableKt.access$closestAnchor(anchors$material_release, f8, true);
                }
                access$closestAnchor = AnchoredDraggableKt.access$closestAnchor(anchors$material_release, f8, true);
                if (f8 < Math.abs(f10.floatValue() + Math.abs(((Number) this.positionalThreshold.invoke(Float.valueOf(Math.abs(((Number) Q.i(anchors$material_release, access$closestAnchor)).floatValue() - f10.floatValue())))).floatValue()))) {
                    return t8;
                }
            } else {
                if (f9 <= (-floatValue)) {
                    return (T) AnchoredDraggableKt.access$closestAnchor(anchors$material_release, f8, false);
                }
                access$closestAnchor = AnchoredDraggableKt.access$closestAnchor(anchors$material_release, f8, false);
                float abs = Math.abs(f10.floatValue() - Math.abs(((Number) this.positionalThreshold.invoke(Float.valueOf(Math.abs(f10.floatValue() - ((Number) Q.i(anchors$material_release, access$closestAnchor)).floatValue())))).floatValue()));
                if (f8 < 0.0f) {
                    if (Math.abs(f8) < abs) {
                        return t8;
                    }
                } else if (f8 > abs) {
                    return t8;
                }
            }
            return (T) access$closestAnchor;
        }
        return t8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T computeTargetWithoutThresholds(float f8, T t8) {
        Map<T, Float> anchors$material_release = getAnchors$material_release();
        Float f9 = anchors$material_release.get(t8);
        if (!AbstractC3292y.b(f9, f8) && f9 != null) {
            if (f9.floatValue() < f8) {
                return (T) AnchoredDraggableKt.access$closestAnchor(anchors$material_release, f8, true);
            }
            return (T) AnchoredDraggableKt.access$closestAnchor(anchors$material_release, f8, false);
        }
        return t8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object doAnchoredDrag(T t8, MutatePriority mutatePriority, InterfaceC2073o interfaceC2073o, d dVar) {
        Object e8 = N.e(new AnchoredDraggableState$doAnchoredDrag$2(t8, this, mutatePriority, interfaceC2073o, null), dVar);
        if (e8 == V5.b.e()) {
            return e8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T getAnimationTarget() {
        return this.animationTarget$delegate.getValue();
    }

    public static /* synthetic */ void getOffset$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationTarget(T t8) {
        this.animationTarget$delegate.setValue(t8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t8) {
        this.currentValue$delegate.setValue(t8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLastVelocity(float f8) {
        this.lastVelocity$delegate.setFloatValue(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOffset(float f8) {
        this.offset$delegate.setValue(Float.valueOf(f8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAnchors$material_release$default(AnchoredDraggableState anchoredDraggableState, Map map, AnchorChangedCallback anchorChangedCallback, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            anchorChangedCallback = null;
        }
        anchoredDraggableState.updateAnchors$material_release(map, anchorChangedCallback);
    }

    public final Object anchoredDrag(MutatePriority mutatePriority, InterfaceC2073o interfaceC2073o, d dVar) {
        Object doAnchoredDrag = doAnchoredDrag(null, mutatePriority, interfaceC2073o, dVar);
        return doAnchoredDrag == V5.b.e() ? doAnchoredDrag : I.f8786a;
    }

    public final float dispatchRawDelta(float f8) {
        float offset;
        float newOffsetForDelta$material_release = newOffsetForDelta$material_release(f8);
        if (Float.isNaN(getOffset())) {
            offset = 0.0f;
        } else {
            offset = getOffset();
        }
        setOffset(newOffsetForDelta$material_release);
        return newOffsetForDelta$material_release - offset;
    }

    public final Map<T, Float> getAnchors$material_release() {
        return (Map) this.anchors$delegate.getValue();
    }

    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final T getClosestValue$material_release() {
        return (T) this.closestValue$delegate.getValue();
    }

    public final Function1 getConfirmValueChange$material_release() {
        return this.confirmValueChange;
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    public final DraggableState getDraggableState$material_release() {
        return this.draggableState;
    }

    public final float getLastVelocity() {
        return this.lastVelocity$delegate.getFloatValue();
    }

    public final float getMaxOffset() {
        return ((Number) this.maxOffset$delegate.getValue()).floatValue();
    }

    public final float getMinOffset() {
        return ((Number) this.minOffset$delegate.getValue()).floatValue();
    }

    public final float getOffset() {
        return ((Number) this.offset$delegate.getValue()).floatValue();
    }

    public final Function1 getPositionalThreshold$material_release() {
        return this.positionalThreshold;
    }

    public final float getProgress() {
        return ((Number) this.progress$delegate.getValue()).floatValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue$delegate.getValue();
    }

    public final Function0 getVelocityThreshold$material_release() {
        return this.velocityThreshold;
    }

    public final boolean hasAnchorForValue(T t8) {
        return getAnchors$material_release().containsKey(t8);
    }

    public final boolean isAnimationRunning() {
        if (getAnimationTarget() != null) {
            return true;
        }
        return false;
    }

    public final float newOffsetForDelta$material_release(float f8) {
        float offset;
        if (Float.isNaN(getOffset())) {
            offset = 0.0f;
        } else {
            offset = getOffset();
        }
        return m.j(offset + f8, getMinOffset(), getMaxOffset());
    }

    public final float requireOffset() {
        if (!Float.isNaN(getOffset())) {
            return getOffset();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
    }

    public final void setAnchors$material_release(Map<T, Float> map) {
        AbstractC3292y.i(map, "<set-?>");
        this.anchors$delegate.setValue(map);
    }

    public final Object settle(float f8, d dVar) {
        T currentValue = getCurrentValue();
        T computeTarget = computeTarget(requireOffset(), currentValue, f8);
        if (((Boolean) this.confirmValueChange.invoke(computeTarget)).booleanValue()) {
            Object animateTo = AnchoredDraggableKt.animateTo(this, computeTarget, f8, dVar);
            if (animateTo == V5.b.e()) {
                return animateTo;
            }
            return I.f8786a;
        }
        Object animateTo2 = AnchoredDraggableKt.animateTo(this, currentValue, f8, dVar);
        if (animateTo2 == V5.b.e()) {
            return animateTo2;
        }
        return I.f8786a;
    }

    public final boolean trySnapTo$material_release(T t8) {
        return this.dragMutex.tryMutate(new AnchoredDraggableState$trySnapTo$1(this, t8));
    }

    public final void updateAnchors$material_release(Map<T, Float> newAnchors, AnchorChangedCallback<T> anchorChangedCallback) {
        boolean z8;
        AbstractC3292y.i(newAnchors, "newAnchors");
        if (!AbstractC3292y.d(getAnchors$material_release(), newAnchors)) {
            Map<T, Float> anchors$material_release = getAnchors$material_release();
            T targetValue = getTargetValue();
            boolean isEmpty = getAnchors$material_release().isEmpty();
            setAnchors$material_release(newAnchors);
            if (getAnchors$material_release().get(getCurrentValue()) != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (isEmpty && z8) {
                trySnapTo$material_release(getCurrentValue());
            } else if (anchorChangedCallback != null) {
                anchorChangedCallback.onAnchorsChanged(targetValue, anchors$material_release, newAnchors);
            }
        }
    }

    public final Object anchoredDrag(T t8, MutatePriority mutatePriority, InterfaceC2073o interfaceC2073o, d dVar) {
        Object doAnchoredDrag = doAnchoredDrag(t8, mutatePriority, interfaceC2073o, dVar);
        return doAnchoredDrag == V5.b.e() ? doAnchoredDrag : I.f8786a;
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, InterfaceC2073o interfaceC2073o, d dVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, interfaceC2073o, dVar);
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, Function1 function1, Function0 function0, AnimationSpec animationSpec, Function1 function12, int i8, AbstractC3284p abstractC3284p) {
        this(obj, function1, function0, (i8 & 8) != 0 ? AnchoredDraggableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i8 & 16) != 0 ? AnonymousClass1.INSTANCE : function12);
    }
}
