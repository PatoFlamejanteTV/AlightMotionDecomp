package androidx.compose.material;

import Q5.p;
import R5.Q;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.M;

/* loaded from: classes.dex */
public final class ModalBottomSheetKt {
    private static final float ModalBottomSheetPositionalThreshold = Dp.m5155constructorimpl(56);
    private static final float ModalBottomSheetVelocityThreshold = Dp.m5155constructorimpl(125);
    private static final float MaxModalBottomSheetWidth = Dp.m5155constructorimpl(640);

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        return new ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState, orientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue> ModalBottomSheetAnchorChangeCallback(final ModalBottomSheetState modalBottomSheetState, final M m8) {
        return new AnchoredDraggableState.AnchorChangedCallback<ModalBottomSheetValue>() { // from class: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetAnchorChangeCallback$1

            /* loaded from: classes.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ModalBottomSheetValue.values().length];
                    try {
                        iArr[ModalBottomSheetValue.Hidden.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ModalBottomSheetValue.HalfExpanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ModalBottomSheetValue.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.compose.material.AnchoredDraggableState.AnchorChangedCallback
            public final void onAnchorsChanged(ModalBottomSheetValue prevTarget, Map<ModalBottomSheetValue, Float> prevAnchors, Map<ModalBottomSheetValue, Float> newAnchors) {
                ModalBottomSheetValue modalBottomSheetValue;
                AbstractC3292y.i(prevTarget, "prevTarget");
                AbstractC3292y.i(prevAnchors, "prevAnchors");
                AbstractC3292y.i(newAnchors, "newAnchors");
                Float f8 = prevAnchors.get(prevTarget);
                int i8 = WhenMappings.$EnumSwitchMapping$0[prevTarget.ordinal()];
                if (i8 == 1) {
                    modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                } else {
                    if (i8 != 2 && i8 != 3) {
                        throw new p();
                    }
                    modalBottomSheetValue = ModalBottomSheetValue.HalfExpanded;
                    if (!newAnchors.containsKey(modalBottomSheetValue)) {
                        modalBottomSheetValue = ModalBottomSheetValue.Expanded;
                        if (!newAnchors.containsKey(modalBottomSheetValue)) {
                            modalBottomSheetValue = ModalBottomSheetValue.Hidden;
                        }
                    }
                }
                if (AbstractC3292y.a(((Number) Q.i(newAnchors, modalBottomSheetValue)).floatValue(), f8)) {
                    return;
                }
                if (ModalBottomSheetState.this.isAnimationRunning$material_release()) {
                    AbstractC3462k.d(m8, null, null, new ModalBottomSheetKt$ModalBottomSheetAnchorChangeCallback$1$onAnchorsChanged$1(ModalBottomSheetState.this, modalBottomSheetValue, null), 3, null);
                } else {
                    if (ModalBottomSheetState.this.trySnapTo$material_release(modalBottomSheetValue)) {
                        return;
                    }
                    AbstractC3462k.d(m8, null, null, new ModalBottomSheetKt$ModalBottomSheetAnchorChangeCallback$1$onAnchorsChanged$2(ModalBottomSheetState.this, modalBottomSheetValue, null), 3, null);
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0296  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ModalBottomSheetLayout-Gs3lGvM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1254ModalBottomSheetLayoutGs3lGvM(c6.InterfaceC2073o r33, androidx.compose.ui.Modifier r34, androidx.compose.material.ModalBottomSheetState r35, boolean r36, androidx.compose.ui.graphics.Shape r37, float r38, long r39, long r41, long r43, c6.InterfaceC2072n r45, androidx.compose.runtime.Composer r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt.m1254ModalBottomSheetLayoutGs3lGvM(c6.o, androidx.compose.ui.Modifier, androidx.compose.material.ModalBottomSheetState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    @ExperimentalMaterialApi
    public static final ModalBottomSheetState ModalBottomSheetState(ModalBottomSheetValue initialValue, Density density, AnimationSpec<Float> animationSpec, Function1 confirmValueChange, boolean z8) {
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(density, "density");
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(confirmValueChange, "confirmValueChange");
        ModalBottomSheetState modalBottomSheetState = new ModalBottomSheetState(initialValue, animationSpec, z8, confirmValueChange);
        modalBottomSheetState.setDensity$material_release(density);
        return modalBottomSheetState;
    }

    public static /* synthetic */ ModalBottomSheetState ModalBottomSheetState$default(ModalBottomSheetValue modalBottomSheetValue, Density density, AnimationSpec animationSpec, Function1 function1, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i8 & 8) != 0) {
            function1 = ModalBottomSheetKt$ModalBottomSheetState$1.INSTANCE;
        }
        if ((i8 & 16) != 0) {
            z8 = false;
        }
        return ModalBottomSheetState(modalBottomSheetValue, density, animationSpec, function1, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m1255Scrim3JVO9M(long j8, Function0 function0, boolean z8, Composer composer, int i8) {
        int i9;
        float f8;
        Modifier modifier;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-526532668);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(j8)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i9 = i12 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i9 |= i11;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(z8)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i9 |= i10;
        }
        if ((i9 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-526532668, i9, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:694)");
            }
            if (j8 != Color.Companion.m2984getUnspecified0d7_KjU()) {
                if (z8) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f8, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
                String m1328getString4foXLRw = Strings_androidKt.m1328getString4foXLRw(Strings.Companion.m1322getCloseSheetUdPEhr4(), startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(1010559499);
                if (z8) {
                    Modifier.Companion companion = Modifier.Companion;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    boolean changed = startRestartGroup.changed(function0);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(function0, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, function0, (InterfaceC2072n) rememberedValue);
                    startRestartGroup.startReplaceableGroup(511388516);
                    boolean changed2 = startRestartGroup.changed(m1328getString4foXLRw) | startRestartGroup.changed(function0);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new ModalBottomSheetKt$Scrim$dismissModifier$2$1(m1328getString4foXLRw, function0);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceableGroup();
                    modifier = SemanticsModifierKt.semantics(pointerInput, true, (Function1) rememberedValue2);
                } else {
                    modifier = Modifier.Companion;
                }
                startRestartGroup.endReplaceableGroup();
                Modifier then = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifier);
                Color m2938boximpl = Color.m2938boximpl(j8);
                startRestartGroup.startReplaceableGroup(511388516);
                boolean changed3 = startRestartGroup.changed(m2938boximpl) | startRestartGroup.changed(animateFloatAsState);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new ModalBottomSheetKt$Scrim$1$1(j8, animateFloatAsState);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(then, (Function1) rememberedValue3, startRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ModalBottomSheetKt$Scrim$2(j8, function0, z8, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Composable
    @ExperimentalMaterialApi
    public static final ModalBottomSheetState rememberModalBottomSheetState(ModalBottomSheetValue initialValue, AnimationSpec<Float> animationSpec, Function1 function1, boolean z8, Composer composer, int i8, int i9) {
        AbstractC3292y.i(initialValue, "initialValue");
        composer.startReplaceableGroup(-126412120);
        AnimationSpec<Float> animationSpec2 = (i9 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec;
        Function1 function12 = (i9 & 4) != 0 ? ModalBottomSheetKt$rememberModalBottomSheetState$1.INSTANCE : function1;
        boolean z9 = (i9 & 8) != 0 ? false : z8;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-126412120, i8, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:436)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startMovableGroup(170051607, initialValue);
        ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) RememberSaveableKt.m2560rememberSaveable(new Object[]{initialValue, animationSpec2, Boolean.valueOf(z9), function12, density}, (Saver) ModalBottomSheetState.Companion.Saver(animationSpec2, function12, z9, density), (String) null, (Function0) new ModalBottomSheetKt$rememberModalBottomSheetState$2(initialValue, density, animationSpec2, function12, z9), composer, 72, 4);
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modalBottomSheetState;
    }

    @ExperimentalMaterialApi
    public static final ModalBottomSheetState ModalBottomSheetState(ModalBottomSheetValue initialValue, AnimationSpec<Float> animationSpec, Function1 confirmValueChange, boolean z8) {
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(confirmValueChange, "confirmValueChange");
        return new ModalBottomSheetState(initialValue, animationSpec, z8, confirmValueChange);
    }

    public static /* synthetic */ ModalBottomSheetState ModalBottomSheetState$default(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec animationSpec, Function1 function1, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i8 & 4) != 0) {
            function1 = ModalBottomSheetKt$ModalBottomSheetState$3.INSTANCE;
        }
        if ((i8 & 8) != 0) {
            z8 = false;
        }
        return ModalBottomSheetState(modalBottomSheetValue, animationSpec, function1, z8);
    }

    @Composable
    @ExperimentalMaterialApi
    public static final ModalBottomSheetState rememberModalBottomSheetState(ModalBottomSheetValue initialValue, AnimationSpec<Float> animationSpec, boolean z8, Function1 confirmStateChange, Composer composer, int i8, int i9) {
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(confirmStateChange, "confirmStateChange");
        composer.startReplaceableGroup(-409288536);
        if ((i9 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-409288536, i8, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:490)");
        }
        ModalBottomSheetState rememberModalBottomSheetState = rememberModalBottomSheetState(initialValue, animationSpec2, confirmStateChange, z8, composer, (i8 & 14) | 64 | ((i8 >> 3) & 896) | ((i8 << 3) & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberModalBottomSheetState;
    }

    @Composable
    @ExperimentalMaterialApi
    public static final ModalBottomSheetState rememberModalBottomSheetState(ModalBottomSheetValue initialValue, AnimationSpec<Float> animationSpec, Function1 confirmStateChange, Composer composer, int i8, int i9) {
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(confirmStateChange, "confirmStateChange");
        composer.startReplaceableGroup(-1928569212);
        if ((i9 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1928569212, i8, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:519)");
        }
        ModalBottomSheetState rememberModalBottomSheetState = rememberModalBottomSheetState(initialValue, animationSpec2, confirmStateChange, false, composer, (i8 & 14) | 3136 | (i8 & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberModalBottomSheetState;
    }
}
