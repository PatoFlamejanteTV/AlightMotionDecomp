package androidx.compose.material;

import Q5.I;
import Q5.r;
import Q5.x;
import R5.Q;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
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
import c6.InterfaceC2072n;
import i6.m;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

@Stable
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public class SwipeableState<T> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final MutableFloatState absoluteOffset;
    private final MutableState anchors$delegate;
    private final AnimationSpec<Float> animationSpec;
    private final MutableState<Float> animationTarget;
    private final Function1 confirmStateChange;
    private final MutableState currentValue$delegate;
    private final DraggableState draggableState;
    private final MutableState isAnimationRunning$delegate;
    private final InterfaceC3821f latestNonEmptyAnchorsFlow;
    private float maxBound;
    private float minBound;
    private final MutableFloatState offsetState;
    private final MutableFloatState overflowState;
    private final MutableState resistance$delegate;
    private final MutableState thresholds$delegate;
    private final MutableFloatState velocityThreshold$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.SwipeableState$1, reason: invalid class name */
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

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final <T> Saver<SwipeableState<T>, T> Saver(AnimationSpec<Float> animationSpec, Function1 confirmStateChange) {
            AbstractC3292y.i(animationSpec, "animationSpec");
            AbstractC3292y.i(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(SwipeableState$Companion$Saver$1.INSTANCE, new SwipeableState$Companion$Saver$2(animationSpec, confirmStateChange));
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public SwipeableState(T t8, AnimationSpec<Float> animationSpec, Function1 confirmStateChange) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState<Float> mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        MutableState mutableStateOf$default6;
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(confirmStateChange, "confirmStateChange");
        this.animationSpec = animationSpec;
        this.confirmStateChange = confirmStateChange;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t8, null, 2, null);
        this.currentValue$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isAnimationRunning$delegate = mutableStateOf$default2;
        this.offsetState = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.overflowState = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.absoluteOffset = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.animationTarget = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Q.h(), null, 2, null);
        this.anchors$delegate = mutableStateOf$default4;
        final InterfaceC3821f snapshotFlow = SnapshotStateKt.snapshotFlow(new SwipeableState$latestNonEmptyAnchorsFlow$1(this));
        this.latestNonEmptyAnchorsFlow = AbstractC3823h.K(new InterfaceC3821f() { // from class: androidx.compose.material.SwipeableState$special$$inlined$filter$1

            /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements InterfaceC3822g {
                final /* synthetic */ InterfaceC3822g $this_unsafeFlow;

                @f(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", l = {223}, m = "emit")
                /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(U5.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC3822g interfaceC3822g) {
                    this.$this_unsafeFlow = interfaceC3822g;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // q6.InterfaceC3822g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, U5.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = (androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = new androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = V5.b.e()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        Q5.t.b(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        Q5.t.b(r6)
                        q6.g r6 = r4.$this_unsafeFlow
                        r2 = r5
                        java.util.Map r2 = (java.util.Map) r2
                        boolean r2 = r2.isEmpty()
                        r2 = r2 ^ r3
                        if (r2 == 0) goto L49
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        Q5.I r5 = Q5.I.f8786a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, U5.d):java.lang.Object");
                }
            }

            @Override // q6.InterfaceC3821f
            public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
                Object collect = InterfaceC3821f.this.collect(new AnonymousClass2(interfaceC3822g), dVar);
                if (collect == V5.b.e()) {
                    return collect;
                }
                return I.f8786a;
            }
        }, 1);
        this.minBound = Float.NEGATIVE_INFINITY;
        this.maxBound = Float.POSITIVE_INFINITY;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SwipeableState$thresholds$2.INSTANCE, null, 2, null);
        this.thresholds$delegate = mutableStateOf$default5;
        this.velocityThreshold$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.resistance$delegate = mutableStateOf$default6;
        this.draggableState = DraggableKt.DraggableState(new SwipeableState$draggableState$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateInternalToOffset(float f8, AnimationSpec<Float> animationSpec, U5.d dVar) {
        Object a9 = androidx.compose.foundation.gestures.a.a(this.draggableState, null, new SwipeableState$animateInternalToOffset$2(this, f8, animationSpec, null), dVar, 1, null);
        if (a9 == V5.b.e()) {
            return a9;
        }
        return I.f8786a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(SwipeableState swipeableState, Object obj, AnimationSpec animationSpec, U5.d dVar, int i8, Object obj2) {
        if (obj2 == null) {
            if ((i8 & 2) != 0) {
                animationSpec = swipeableState.animationSpec;
            }
            return swipeableState.animateTo(obj, animationSpec, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getDirection$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getTargetValue$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationRunning(boolean z8) {
        this.isAnimationRunning$delegate.setValue(Boolean.valueOf(z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t8) {
        this.currentValue$delegate.setValue(t8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object snapInternalToOffset(float f8, U5.d dVar) {
        Object a9 = androidx.compose.foundation.gestures.a.a(this.draggableState, null, new SwipeableState$snapInternalToOffset$2(f8, this, null), dVar, 1, null);
        if (a9 == V5.b.e()) {
            return a9;
        }
        return I.f8786a;
    }

    @ExperimentalMaterialApi
    public final Object animateTo(T t8, AnimationSpec<Float> animationSpec, U5.d dVar) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new SwipeableState$animateTo$2(t8, this, animationSpec), dVar);
        if (collect == V5.b.e()) {
            return collect;
        }
        return I.f8786a;
    }

    public final void ensureInit$material_release(Map<Float, ? extends T> newAnchors) {
        Float offset;
        AbstractC3292y.i(newAnchors, "newAnchors");
        if (getAnchors$material_release().isEmpty()) {
            offset = SwipeableKt.getOffset(newAnchors, getCurrentValue());
            if (offset != null) {
                this.offsetState.setFloatValue(offset.floatValue());
                this.absoluteOffset.setFloatValue(offset.floatValue());
                return;
            }
            throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
        }
    }

    public final Map<Float, T> getAnchors$material_release() {
        return (Map) this.anchors$delegate.getValue();
    }

    public final AnimationSpec<Float> getAnimationSpec$material_release() {
        return this.animationSpec;
    }

    public final Function1 getConfirmStateChange$material_release() {
        return this.confirmStateChange;
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    public final float getDirection() {
        Float offset;
        offset = SwipeableKt.getOffset(getAnchors$material_release(), getCurrentValue());
        if (offset != null) {
            return Math.signum(getOffset().getValue().floatValue() - offset.floatValue());
        }
        return 0.0f;
    }

    public final DraggableState getDraggableState$material_release() {
        return this.draggableState;
    }

    public final float getMaxBound$material_release() {
        return this.maxBound;
    }

    public final float getMinBound$material_release() {
        return this.minBound;
    }

    public final State<Float> getOffset() {
        return this.offsetState;
    }

    public final State<Float> getOverflow() {
        return this.overflowState;
    }

    public final SwipeProgress<T> getProgress() {
        List findBounds;
        Object currentValue;
        Object obj;
        float f8;
        r a9;
        findBounds = SwipeableKt.findBounds(getOffset().getValue().floatValue(), getAnchors$material_release().keySet());
        int size = findBounds.size();
        if (size != 0) {
            if (size != 1) {
                if (getDirection() > 0.0f) {
                    a9 = x.a(findBounds.get(0), findBounds.get(1));
                } else {
                    a9 = x.a(findBounds.get(1), findBounds.get(0));
                }
                float floatValue = ((Number) a9.a()).floatValue();
                float floatValue2 = ((Number) a9.b()).floatValue();
                obj = Q.i(getAnchors$material_release(), Float.valueOf(floatValue));
                currentValue = Q.i(getAnchors$material_release(), Float.valueOf(floatValue2));
                f8 = (getOffset().getValue().floatValue() - floatValue) / (floatValue2 - floatValue);
                return new SwipeProgress<>(obj, currentValue, f8);
            }
            Object i8 = Q.i(getAnchors$material_release(), findBounds.get(0));
            currentValue = Q.i(getAnchors$material_release(), findBounds.get(0));
            obj = i8;
        } else {
            T currentValue2 = getCurrentValue();
            currentValue = getCurrentValue();
            obj = currentValue2;
        }
        f8 = 1.0f;
        return new SwipeProgress<>(obj, currentValue, f8);
    }

    public final ResistanceConfig getResistance$material_release() {
        return (ResistanceConfig) this.resistance$delegate.getValue();
    }

    public final T getTargetValue() {
        Float offset;
        float floatValue;
        float computeTarget;
        Float value = this.animationTarget.getValue();
        if (value != null) {
            computeTarget = value.floatValue();
        } else {
            float floatValue2 = getOffset().getValue().floatValue();
            offset = SwipeableKt.getOffset(getAnchors$material_release(), getCurrentValue());
            if (offset != null) {
                floatValue = offset.floatValue();
            } else {
                floatValue = getOffset().getValue().floatValue();
            }
            computeTarget = SwipeableKt.computeTarget(floatValue2, floatValue, getAnchors$material_release().keySet(), getThresholds$material_release(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t8 = getAnchors$material_release().get(Float.valueOf(computeTarget));
        if (t8 == null) {
            return getCurrentValue();
        }
        return t8;
    }

    public final InterfaceC2072n getThresholds$material_release() {
        return (InterfaceC2072n) this.thresholds$delegate.getValue();
    }

    public final float getVelocityThreshold$material_release() {
        return this.velocityThreshold$delegate.getFloatValue();
    }

    public final boolean isAnimationRunning() {
        return ((Boolean) this.isAnimationRunning$delegate.getValue()).booleanValue();
    }

    public final float performDrag(float f8) {
        float j8 = m.j(this.absoluteOffset.getFloatValue() + f8, this.minBound, this.maxBound) - this.absoluteOffset.getFloatValue();
        if (Math.abs(j8) > 0.0f) {
            this.draggableState.dispatchRawDelta(j8);
        }
        return j8;
    }

    public final Object performFling(final float f8, U5.d dVar) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new InterfaceC3822g(this) { // from class: androidx.compose.material.SwipeableState$performFling$2
            final /* synthetic */ SwipeableState<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.this$0 = this;
            }

            @Override // q6.InterfaceC3822g
            public final Object emit(Map<Float, ? extends T> map, U5.d dVar2) {
                Float offset;
                float computeTarget;
                Object animateInternalToOffset;
                offset = SwipeableKt.getOffset(map, this.this$0.getCurrentValue());
                AbstractC3292y.f(offset);
                float floatValue = offset.floatValue();
                computeTarget = SwipeableKt.computeTarget(this.this$0.getOffset().getValue().floatValue(), floatValue, map.keySet(), this.this$0.getThresholds$material_release(), f8, this.this$0.getVelocityThreshold$material_release());
                Object obj = map.get(kotlin.coroutines.jvm.internal.b.b(computeTarget));
                if (obj != null && ((Boolean) this.this$0.getConfirmStateChange$material_release().invoke(obj)).booleanValue()) {
                    Object animateTo$default = SwipeableState.animateTo$default(this.this$0, obj, null, dVar2, 2, null);
                    return animateTo$default == V5.b.e() ? animateTo$default : I.f8786a;
                }
                SwipeableState<T> swipeableState = this.this$0;
                animateInternalToOffset = swipeableState.animateInternalToOffset(floatValue, swipeableState.getAnimationSpec$material_release(), dVar2);
                return animateInternalToOffset == V5.b.e() ? animateInternalToOffset : I.f8786a;
            }
        }, dVar);
        if (collect == V5.b.e()) {
            return collect;
        }
        return I.f8786a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x021a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v21, types: [float] */
    /* JADX WARN: Type inference failed for: r10v76, types: [float] */
    /* JADX WARN: Type inference failed for: r10v78, types: [float] */
    /* JADX WARN: Type inference failed for: r10v89 */
    /* JADX WARN: Type inference failed for: r10v90 */
    /* JADX WARN: Type inference failed for: r10v91 */
    /* JADX WARN: Type inference failed for: r10v92 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object processNewAnchors$material_release(java.util.Map<java.lang.Float, ? extends T> r10, java.util.Map<java.lang.Float, ? extends T> r11, U5.d r12) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState.processNewAnchors$material_release(java.util.Map, java.util.Map, U5.d):java.lang.Object");
    }

    public final void setAnchors$material_release(Map<Float, ? extends T> map) {
        AbstractC3292y.i(map, "<set-?>");
        this.anchors$delegate.setValue(map);
    }

    public final void setMaxBound$material_release(float f8) {
        this.maxBound = f8;
    }

    public final void setMinBound$material_release(float f8) {
        this.minBound = f8;
    }

    public final void setResistance$material_release(ResistanceConfig resistanceConfig) {
        this.resistance$delegate.setValue(resistanceConfig);
    }

    public final void setThresholds$material_release(InterfaceC2072n interfaceC2072n) {
        AbstractC3292y.i(interfaceC2072n, "<set-?>");
        this.thresholds$delegate.setValue(interfaceC2072n);
    }

    public final void setVelocityThreshold$material_release(float f8) {
        this.velocityThreshold$delegate.setFloatValue(f8);
    }

    @ExperimentalMaterialApi
    public final Object snapTo(T t8, U5.d dVar) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new SwipeableState$snapTo$2(t8, this), dVar);
        if (collect == V5.b.e()) {
            return collect;
        }
        return I.f8786a;
    }

    public /* synthetic */ SwipeableState(Object obj, AnimationSpec animationSpec, Function1 function1, int i8, AbstractC3284p abstractC3284p) {
        this(obj, (i8 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i8 & 4) != 0 ? AnonymousClass1.INSTANCE : function1);
    }
}
