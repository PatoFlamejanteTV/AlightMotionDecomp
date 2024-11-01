package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.e;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2072n;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl<S> implements AnimatedContentTransitionScope<S> {
    private State<IntSize> animatedSize;
    private Alignment contentAlignment;
    private LayoutDirection layoutDirection;
    private final MutableState measuredSize$delegate;
    private final Map<S, State<IntSize>> targetSizeMap;
    private final Transition<S> transition;

    /* loaded from: classes.dex */
    public static final class ChildData implements ParentDataModifier {
        private boolean isTarget;

        public ChildData(boolean z8) {
            this.isTarget = z8;
        }

        public static /* synthetic */ ChildData copy$default(ChildData childData, boolean z8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                z8 = childData.isTarget;
            }
            return childData.copy(z8);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public /* synthetic */ boolean all(Function1 function1) {
            return b.a(this, function1);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public /* synthetic */ boolean any(Function1 function1) {
            return b.b(this, function1);
        }

        public final boolean component1() {
            return this.isTarget;
        }

        public final ChildData copy(boolean z8) {
            return new ChildData(z8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChildData) && this.isTarget == ((ChildData) obj).isTarget;
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public /* synthetic */ Object foldIn(Object obj, InterfaceC2072n interfaceC2072n) {
            return b.c(this, obj, interfaceC2072n);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public /* synthetic */ Object foldOut(Object obj, InterfaceC2072n interfaceC2072n) {
            return b.d(this, obj, interfaceC2072n);
        }

        public int hashCode() {
            boolean z8 = this.isTarget;
            if (z8) {
                return 1;
            }
            return z8 ? 1 : 0;
        }

        public final boolean isTarget() {
            return this.isTarget;
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public Object modifyParentData(Density density, Object obj) {
            AbstractC3292y.i(density, "<this>");
            return this;
        }

        public final void setTarget(boolean z8) {
            this.isTarget = z8;
        }

        @Override // androidx.compose.ui.Modifier
        public /* synthetic */ Modifier then(Modifier modifier) {
            return a.a(this, modifier);
        }

        public String toString() {
            return "ChildData(isTarget=" + this.isTarget + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class SizeModifier extends LayoutModifierWithPassThroughIntrinsics {
        private final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
        private final State<SizeTransform> sizeTransform;
        final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public SizeModifier(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation, State<? extends SizeTransform> sizeTransform) {
            AbstractC3292y.i(sizeAnimation, "sizeAnimation");
            AbstractC3292y.i(sizeTransform, "sizeTransform");
            this.this$0 = animatedContentTransitionScopeImpl;
            this.sizeAnimation = sizeAnimation;
            this.sizeTransform = sizeTransform;
        }

        public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
            return this.sizeAnimation;
        }

        public final State<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        @Override // androidx.compose.ui.layout.LayoutModifier
        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public MeasureResult mo133measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
            AbstractC3292y.i(measure, "$this$measure");
            AbstractC3292y.i(measurable, "measurable");
            Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(j8);
            State<IntSize> animate = this.sizeAnimation.animate(new AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$1(this.this$0, this), new AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$2(this.this$0));
            this.this$0.setAnimatedSize$animation_release(animate);
            return MeasureScope.CC.q(measure, IntSize.m5321getWidthimpl(animate.getValue().m5325unboximpl()), IntSize.m5320getHeightimpl(animate.getValue().m5325unboximpl()), null, new AnimatedContentTransitionScopeImpl$SizeModifier$measure$1(mo4108measureBRTryo0, this.this$0.getContentAlignment$animation_release().mo2585alignKFBX0sM(IntSizeKt.IntSize(mo4108measureBRTryo0.getWidth(), mo4108measureBRTryo0.getHeight()), animate.getValue().m5325unboximpl(), LayoutDirection.Ltr)), 4, null);
        }
    }

    public AnimatedContentTransitionScopeImpl(Transition<S> transition, Alignment contentAlignment, LayoutDirection layoutDirection) {
        MutableState mutableStateOf$default;
        AbstractC3292y.i(transition, "transition");
        AbstractC3292y.i(contentAlignment, "contentAlignment");
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        this.transition = transition;
        this.contentAlignment = contentAlignment;
        this.layoutDirection = layoutDirection;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m5313boximpl(IntSize.Companion.m5326getZeroYbymL2g()), null, 2, null);
        this.measuredSize$delegate = mutableStateOf$default;
        this.targetSizeMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateOffset-emnUabE, reason: not valid java name */
    public final long m127calculateOffsetemnUabE(long j8, long j9) {
        return this.contentAlignment.mo2585alignKFBX0sM(j8, j9, LayoutDirection.Ltr);
    }

    private static final boolean createSizeAnimationModifier$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void createSizeAnimationModifier$lambda$3(MutableState<Boolean> mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCurrentSize-YbymL2g, reason: not valid java name */
    public final long m128getCurrentSizeYbymL2g() {
        State<IntSize> state = this.animatedSize;
        if (state != null) {
            return state.getValue().m5325unboximpl();
        }
        return m131getMeasuredSizeYbymL2g$animation_release();
    }

    /* renamed from: isLeft-gWo6LJ4, reason: not valid java name */
    private final boolean m129isLeftgWo6LJ4(int i8) {
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        if (!AnimatedContentTransitionScope.SlideDirection.m115equalsimpl0(i8, companion.m121getLeftDKzdypw()) && ((!AnimatedContentTransitionScope.SlideDirection.m115equalsimpl0(i8, companion.m123getStartDKzdypw()) || this.layoutDirection != LayoutDirection.Ltr) && (!AnimatedContentTransitionScope.SlideDirection.m115equalsimpl0(i8, companion.m120getEndDKzdypw()) || this.layoutDirection != LayoutDirection.Rtl))) {
            return false;
        }
        return true;
    }

    /* renamed from: isRight-gWo6LJ4, reason: not valid java name */
    private final boolean m130isRightgWo6LJ4(int i8) {
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        if (!AnimatedContentTransitionScope.SlideDirection.m115equalsimpl0(i8, companion.m122getRightDKzdypw()) && ((!AnimatedContentTransitionScope.SlideDirection.m115equalsimpl0(i8, companion.m123getStartDKzdypw()) || this.layoutDirection != LayoutDirection.Rtl) && (!AnimatedContentTransitionScope.SlideDirection.m115equalsimpl0(i8, companion.m120getEndDKzdypw()) || this.layoutDirection != LayoutDirection.Ltr))) {
            return false;
        }
        return true;
    }

    @Composable
    public final Modifier createSizeAnimationModifier$animation_release(ContentTransform contentTransform, Composer composer, int i8) {
        Modifier modifier;
        Modifier clipToBounds;
        AbstractC3292y.i(contentTransform, "contentTransform");
        composer.startReplaceableGroup(93755870);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(93755870, i8, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:554)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(this);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(contentTransform.getSizeTransform(), composer, 0);
        if (AbstractC3292y.d(this.transition.getCurrentState(), this.transition.getTargetState())) {
            createSizeAnimationModifier$lambda$3(mutableState, false);
        } else if (rememberUpdatedState.getValue() != null) {
            createSizeAnimationModifier$lambda$3(mutableState, true);
        }
        if (createSizeAnimationModifier$lambda$2(mutableState)) {
            Transition.DeferredAnimation createDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(this.transition, VectorConvertersKt.getVectorConverter(IntSize.Companion), null, composer, 64, 2);
            composer.startReplaceableGroup(1157296644);
            boolean changed2 = composer.changed(createDeferredAnimation);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                SizeTransform sizeTransform = (SizeTransform) rememberUpdatedState.getValue();
                if (sizeTransform != null && !sizeTransform.getClip()) {
                    clipToBounds = Modifier.Companion;
                } else {
                    clipToBounds = ClipKt.clipToBounds(Modifier.Companion);
                }
                rememberedValue2 = clipToBounds.then(new SizeModifier(this, createDeferredAnimation, rememberUpdatedState));
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            modifier = (Modifier) rememberedValue2;
        } else {
            this.animatedSize = null;
            modifier = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifier;
    }

    public final State<IntSize> getAnimatedSize$animation_release() {
        return this.animatedSize;
    }

    public final Alignment getContentAlignment$animation_release() {
        return this.contentAlignment;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getInitialState() {
        return this.transition.getSegment().getInitialState();
    }

    public final LayoutDirection getLayoutDirection$animation_release() {
        return this.layoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMeasuredSize-YbymL2g$animation_release, reason: not valid java name */
    public final long m131getMeasuredSizeYbymL2g$animation_release() {
        return ((IntSize) this.measuredSize$delegate.getValue()).m5325unboximpl();
    }

    public final Map<S, State<IntSize>> getTargetSizeMap$animation_release() {
        return this.targetSizeMap;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getTargetState() {
        return this.transition.getSegment().getTargetState();
    }

    public final Transition<S> getTransition$animation_release() {
        return this.transition;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public /* synthetic */ boolean isTransitioningTo(Object obj, Object obj2) {
        return e.a(this, obj, obj2);
    }

    public final void setAnimatedSize$animation_release(State<IntSize> state) {
        this.animatedSize = state;
    }

    public final void setContentAlignment$animation_release(Alignment alignment) {
        AbstractC3292y.i(alignment, "<set-?>");
        this.contentAlignment = alignment;
    }

    public final void setLayoutDirection$animation_release(LayoutDirection layoutDirection) {
        AbstractC3292y.i(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    /* renamed from: setMeasuredSize-ozmzZPI$animation_release, reason: not valid java name */
    public final void m132setMeasuredSizeozmzZPI$animation_release(long j8) {
        this.measuredSize$delegate.setValue(IntSize.m5313boximpl(j8));
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    /* renamed from: slideIntoContainer-mOhB8PU */
    public EnterTransition mo110slideIntoContainermOhB8PU(int i8, FiniteAnimationSpec<IntOffset> animationSpec, Function1 initialOffset) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(initialOffset, "initialOffset");
        if (m129isLeftgWo6LJ4(i8)) {
            return EnterExitTransitionKt.slideInHorizontally(animationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$1(initialOffset, this));
        }
        if (m130isRightgWo6LJ4(i8)) {
            return EnterExitTransitionKt.slideInHorizontally(animationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$2(initialOffset, this));
        }
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        if (AnimatedContentTransitionScope.SlideDirection.m115equalsimpl0(i8, companion.m124getUpDKzdypw())) {
            return EnterExitTransitionKt.slideInVertically(animationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$3(initialOffset, this));
        }
        if (AnimatedContentTransitionScope.SlideDirection.m115equalsimpl0(i8, companion.m119getDownDKzdypw())) {
            return EnterExitTransitionKt.slideInVertically(animationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$4(initialOffset, this));
        }
        return EnterTransition.Companion.getNone();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    /* renamed from: slideOutOfContainer-mOhB8PU */
    public ExitTransition mo111slideOutOfContainermOhB8PU(int i8, FiniteAnimationSpec<IntOffset> animationSpec, Function1 targetOffset) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(targetOffset, "targetOffset");
        if (m129isLeftgWo6LJ4(i8)) {
            return EnterExitTransitionKt.slideOutHorizontally(animationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$1(this, targetOffset));
        }
        if (m130isRightgWo6LJ4(i8)) {
            return EnterExitTransitionKt.slideOutHorizontally(animationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$2(this, targetOffset));
        }
        AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.Companion;
        if (AnimatedContentTransitionScope.SlideDirection.m115equalsimpl0(i8, companion.m124getUpDKzdypw())) {
            return EnterExitTransitionKt.slideOutVertically(animationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$3(this, targetOffset));
        }
        if (AnimatedContentTransitionScope.SlideDirection.m115equalsimpl0(i8, companion.m119getDownDKzdypw())) {
            return EnterExitTransitionKt.slideOutVertically(animationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$4(this, targetOffset));
        }
        return ExitTransition.Companion.getNone();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public ContentTransform using(ContentTransform contentTransform, SizeTransform sizeTransform) {
        AbstractC3292y.i(contentTransform, "<this>");
        contentTransform.setSizeTransform$animation_release(sizeTransform);
        return contentTransform;
    }
}
