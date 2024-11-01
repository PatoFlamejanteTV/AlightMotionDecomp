package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class EnterExitTransitionKt {
    private static final TwoWayConverter<TransformOrigin, AnimationVector2D> TransformOriginVectorConverter = VectorConvertersKt.TwoWayConverter(EnterExitTransitionKt$TransformOriginVectorConverter$1.INSTANCE, EnterExitTransitionKt$TransformOriginVectorConverter$2.INSTANCE);
    private static final MutableFloatState DefaultAlpha = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
    private static final SpringSpec<Float> DefaultAlphaAndScaleSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
    private static final SpringSpec<IntOffset> DefaultOffsetAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5270boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
    private static final SpringSpec<IntSize> DefaultSizeAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5313boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0412  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.Modifier createModifier(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r26, androidx.compose.animation.EnterTransition r27, androidx.compose.animation.ExitTransition r28, java.lang.String r29, androidx.compose.runtime.Composer r30, int r31) {
        /*
            Method dump skipped, instructions count: 1453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.createModifier(androidx.compose.animation.core.Transition, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }

    private static final boolean createModifier$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float createModifier$lambda$11(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long createModifier$lambda$13(State<TransformOrigin> state) {
        return state.getValue().m3315unboximpl();
    }

    private static final void createModifier$lambda$2(MutableState<Boolean> mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    private static final boolean createModifier$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void createModifier$lambda$5(MutableState<Boolean> mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float createModifier$lambda$8(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Stable
    public static final EnterTransition expandHorizontally(FiniteAnimationSpec<IntSize> animationSpec, Alignment.Horizontal expandFrom, boolean z8, Function1 initialWidth) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(expandFrom, "expandFrom");
        AbstractC3292y.i(initialWidth, "initialWidth");
        return expandIn(animationSpec, toAlignment(expandFrom), z8, new EnterExitTransitionKt$expandHorizontally$2(initialWidth));
    }

    public static /* synthetic */ EnterTransition expandHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z8, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5313boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i8 & 2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        if ((i8 & 4) != 0) {
            z8 = true;
        }
        if ((i8 & 8) != 0) {
            function1 = EnterExitTransitionKt$expandHorizontally$1.INSTANCE;
        }
        return expandHorizontally(finiteAnimationSpec, horizontal, z8, function1);
    }

    @Stable
    public static final EnterTransition expandIn(FiniteAnimationSpec<IntSize> animationSpec, Alignment expandFrom, boolean z8, Function1 initialSize) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(expandFrom, "expandFrom");
        AbstractC3292y.i(initialSize, "initialSize");
        return new EnterTransitionImpl(new TransitionData(null, null, new ChangeSize(expandFrom, initialSize, animationSpec, z8), null, 11, null));
    }

    public static /* synthetic */ EnterTransition expandIn$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z8, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5313boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i8 & 2) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        if ((i8 & 4) != 0) {
            z8 = true;
        }
        if ((i8 & 8) != 0) {
            function1 = EnterExitTransitionKt$expandIn$1.INSTANCE;
        }
        return expandIn(finiteAnimationSpec, alignment, z8, function1);
    }

    @Stable
    public static final EnterTransition expandVertically(FiniteAnimationSpec<IntSize> animationSpec, Alignment.Vertical expandFrom, boolean z8, Function1 initialHeight) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(expandFrom, "expandFrom");
        AbstractC3292y.i(initialHeight, "initialHeight");
        return expandIn(animationSpec, toAlignment(expandFrom), z8, new EnterExitTransitionKt$expandVertically$2(initialHeight));
    }

    public static /* synthetic */ EnterTransition expandVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z8, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5313boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i8 & 2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        if ((i8 & 4) != 0) {
            z8 = true;
        }
        if ((i8 & 8) != 0) {
            function1 = EnterExitTransitionKt$expandVertically$1.INSTANCE;
        }
        return expandVertically(finiteAnimationSpec, vertical, z8, function1);
    }

    @Stable
    public static final EnterTransition fadeIn(FiniteAnimationSpec<Float> animationSpec, float f8) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        return new EnterTransitionImpl(new TransitionData(new Fade(f8, animationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ EnterTransition fadeIn$default(FiniteAnimationSpec finiteAnimationSpec, float f8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i8 & 2) != 0) {
            f8 = 0.0f;
        }
        return fadeIn(finiteAnimationSpec, f8);
    }

    @Stable
    public static final ExitTransition fadeOut(FiniteAnimationSpec<Float> animationSpec, float f8) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        return new ExitTransitionImpl(new TransitionData(new Fade(f8, animationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ ExitTransition fadeOut$default(FiniteAnimationSpec finiteAnimationSpec, float f8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i8 & 2) != 0) {
            f8 = 0.0f;
        }
        return fadeOut(finiteAnimationSpec, f8);
    }

    @Stable
    /* renamed from: scaleIn-L8ZKh-E, reason: not valid java name */
    public static final EnterTransition m138scaleInL8ZKhE(FiniteAnimationSpec<Float> animationSpec, float f8, long j8) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        return new EnterTransitionImpl(new TransitionData(null, null, null, new Scale(f8, j8, animationSpec, null), 7, null));
    }

    /* renamed from: scaleIn-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ EnterTransition m139scaleInL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f8, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i8 & 2) != 0) {
            f8 = 0.0f;
        }
        if ((i8 & 4) != 0) {
            j8 = TransformOrigin.Companion.m3316getCenterSzJe1aQ();
        }
        return m138scaleInL8ZKhE(finiteAnimationSpec, f8, j8);
    }

    @Stable
    /* renamed from: scaleOut-L8ZKh-E, reason: not valid java name */
    public static final ExitTransition m140scaleOutL8ZKhE(FiniteAnimationSpec<Float> animationSpec, float f8, long j8) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        return new ExitTransitionImpl(new TransitionData(null, null, null, new Scale(f8, j8, animationSpec, null), 7, null));
    }

    /* renamed from: scaleOut-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ ExitTransition m141scaleOutL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f8, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i8 & 2) != 0) {
            f8 = 0.0f;
        }
        if ((i8 & 4) != 0) {
            j8 = TransformOrigin.Companion.m3316getCenterSzJe1aQ();
        }
        return m140scaleOutL8ZKhE(finiteAnimationSpec, f8, j8);
    }

    private static final Modifier shrinkExpand(Modifier modifier, Transition<EnterExitState> transition, State<ChangeSize> state, State<ChangeSize> state2, String str) {
        return ComposedModifierKt.composed$default(modifier, null, new EnterExitTransitionKt$shrinkExpand$1(transition, state, state2, str), 1, null);
    }

    @Stable
    public static final ExitTransition shrinkHorizontally(FiniteAnimationSpec<IntSize> animationSpec, Alignment.Horizontal shrinkTowards, boolean z8, Function1 targetWidth) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(shrinkTowards, "shrinkTowards");
        AbstractC3292y.i(targetWidth, "targetWidth");
        return shrinkOut(animationSpec, toAlignment(shrinkTowards), z8, new EnterExitTransitionKt$shrinkHorizontally$2(targetWidth));
    }

    public static /* synthetic */ ExitTransition shrinkHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z8, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5313boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i8 & 2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        if ((i8 & 4) != 0) {
            z8 = true;
        }
        if ((i8 & 8) != 0) {
            function1 = EnterExitTransitionKt$shrinkHorizontally$1.INSTANCE;
        }
        return shrinkHorizontally(finiteAnimationSpec, horizontal, z8, function1);
    }

    @Stable
    public static final ExitTransition shrinkOut(FiniteAnimationSpec<IntSize> animationSpec, Alignment shrinkTowards, boolean z8, Function1 targetSize) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(shrinkTowards, "shrinkTowards");
        AbstractC3292y.i(targetSize, "targetSize");
        return new ExitTransitionImpl(new TransitionData(null, null, new ChangeSize(shrinkTowards, targetSize, animationSpec, z8), null, 11, null));
    }

    public static /* synthetic */ ExitTransition shrinkOut$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z8, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5313boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i8 & 2) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        if ((i8 & 4) != 0) {
            z8 = true;
        }
        if ((i8 & 8) != 0) {
            function1 = EnterExitTransitionKt$shrinkOut$1.INSTANCE;
        }
        return shrinkOut(finiteAnimationSpec, alignment, z8, function1);
    }

    @Stable
    public static final ExitTransition shrinkVertically(FiniteAnimationSpec<IntSize> animationSpec, Alignment.Vertical shrinkTowards, boolean z8, Function1 targetHeight) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(shrinkTowards, "shrinkTowards");
        AbstractC3292y.i(targetHeight, "targetHeight");
        return shrinkOut(animationSpec, toAlignment(shrinkTowards), z8, new EnterExitTransitionKt$shrinkVertically$2(targetHeight));
    }

    public static /* synthetic */ ExitTransition shrinkVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z8, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5313boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i8 & 2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        if ((i8 & 4) != 0) {
            z8 = true;
        }
        if ((i8 & 8) != 0) {
            function1 = EnterExitTransitionKt$shrinkVertically$1.INSTANCE;
        }
        return shrinkVertically(finiteAnimationSpec, vertical, z8, function1);
    }

    @Stable
    public static final EnterTransition slideIn(FiniteAnimationSpec<IntOffset> animationSpec, Function1 initialOffset) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(initialOffset, "initialOffset");
        return new EnterTransitionImpl(new TransitionData(null, new Slide(initialOffset, animationSpec), null, null, 13, null));
    }

    public static /* synthetic */ EnterTransition slideIn$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5270boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        return slideIn(finiteAnimationSpec, function1);
    }

    @Stable
    public static final EnterTransition slideInHorizontally(FiniteAnimationSpec<IntOffset> animationSpec, Function1 initialOffsetX) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(initialOffsetX, "initialOffsetX");
        return slideIn(animationSpec, new EnterExitTransitionKt$slideInHorizontally$2(initialOffsetX));
    }

    public static /* synthetic */ EnterTransition slideInHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5270boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i8 & 2) != 0) {
            function1 = EnterExitTransitionKt$slideInHorizontally$1.INSTANCE;
        }
        return slideInHorizontally(finiteAnimationSpec, function1);
    }

    private static final Modifier slideInOut(Modifier modifier, Transition<EnterExitState> transition, State<Slide> state, State<Slide> state2, String str) {
        return ComposedModifierKt.composed$default(modifier, null, new EnterExitTransitionKt$slideInOut$1(transition, state, state2, str), 1, null);
    }

    @Stable
    public static final EnterTransition slideInVertically(FiniteAnimationSpec<IntOffset> animationSpec, Function1 initialOffsetY) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(initialOffsetY, "initialOffsetY");
        return slideIn(animationSpec, new EnterExitTransitionKt$slideInVertically$2(initialOffsetY));
    }

    public static /* synthetic */ EnterTransition slideInVertically$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5270boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i8 & 2) != 0) {
            function1 = EnterExitTransitionKt$slideInVertically$1.INSTANCE;
        }
        return slideInVertically(finiteAnimationSpec, function1);
    }

    @Stable
    public static final ExitTransition slideOut(FiniteAnimationSpec<IntOffset> animationSpec, Function1 targetOffset) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(targetOffset, "targetOffset");
        return new ExitTransitionImpl(new TransitionData(null, new Slide(targetOffset, animationSpec), null, null, 13, null));
    }

    public static /* synthetic */ ExitTransition slideOut$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5270boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        return slideOut(finiteAnimationSpec, function1);
    }

    @Stable
    public static final ExitTransition slideOutHorizontally(FiniteAnimationSpec<IntOffset> animationSpec, Function1 targetOffsetX) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(targetOffsetX, "targetOffsetX");
        return slideOut(animationSpec, new EnterExitTransitionKt$slideOutHorizontally$2(targetOffsetX));
    }

    public static /* synthetic */ ExitTransition slideOutHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5270boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i8 & 2) != 0) {
            function1 = EnterExitTransitionKt$slideOutHorizontally$1.INSTANCE;
        }
        return slideOutHorizontally(finiteAnimationSpec, function1);
    }

    @Stable
    public static final ExitTransition slideOutVertically(FiniteAnimationSpec<IntOffset> animationSpec, Function1 targetOffsetY) {
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(targetOffsetY, "targetOffsetY");
        return slideOut(animationSpec, new EnterExitTransitionKt$slideOutVertically$2(targetOffsetY));
    }

    public static /* synthetic */ ExitTransition slideOutVertically$default(FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5270boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i8 & 2) != 0) {
            function1 = EnterExitTransitionKt$slideOutVertically$1.INSTANCE;
        }
        return slideOutVertically(finiteAnimationSpec, function1);
    }

    private static final Alignment toAlignment(Alignment.Horizontal horizontal) {
        Alignment.Companion companion = Alignment.Companion;
        return AbstractC3292y.d(horizontal, companion.getStart()) ? companion.getCenterStart() : AbstractC3292y.d(horizontal, companion.getEnd()) ? companion.getCenterEnd() : companion.getCenter();
    }

    private static final Alignment toAlignment(Alignment.Vertical vertical) {
        Alignment.Companion companion = Alignment.Companion;
        return AbstractC3292y.d(vertical, companion.getTop()) ? companion.getTopCenter() : AbstractC3292y.d(vertical, companion.getBottom()) ? companion.getBottomCenter() : companion.getCenter();
    }
}
