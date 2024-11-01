package androidx.compose.material;

import Q5.p;
import Q5.r;
import Q5.x;
import R5.Q;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
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
import i6.m;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.M;

/* loaded from: classes.dex */
public final class DrawerKt {
    private static final float BottomDrawerOpenFraction = 0.5f;
    private static final float DrawerPositionalThreshold;
    private static final float EndDrawerPadding;
    private static final float DrawerVelocityThreshold = Dp.m5155constructorimpl(400);
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec<>(256, 0, null, 6, null);

    static {
        float f8 = 56;
        EndDrawerPadding = Dp.m5155constructorimpl(f8);
        DrawerPositionalThreshold = Dp.m5155constructorimpl(f8);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02cc  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomDrawer-Gs3lGvM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1196BottomDrawerGs3lGvM(c6.InterfaceC2073o r32, androidx.compose.ui.Modifier r33, androidx.compose.material.BottomDrawerState r34, boolean r35, androidx.compose.ui.graphics.Shape r36, float r37, long r38, long r40, long r42, c6.InterfaceC2072n r44, androidx.compose.runtime.Composer r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.m1196BottomDrawerGs3lGvM(c6.o, androidx.compose.ui.Modifier, androidx.compose.material.BottomDrawerState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final AnchoredDraggableState.AnchorChangedCallback<BottomDrawerValue> BottomDrawerAnchorChangeCallback(final BottomDrawerState bottomDrawerState, final M m8) {
        return new AnchoredDraggableState.AnchorChangedCallback<BottomDrawerValue>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerAnchorChangeCallback$1

            /* loaded from: classes.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[BottomDrawerValue.values().length];
                    try {
                        iArr[BottomDrawerValue.Closed.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[BottomDrawerValue.Open.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[BottomDrawerValue.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.compose.material.AnchoredDraggableState.AnchorChangedCallback
            public final void onAnchorsChanged(BottomDrawerValue previousTarget, Map<BottomDrawerValue, Float> previousAnchors, Map<BottomDrawerValue, Float> newAnchors) {
                BottomDrawerValue bottomDrawerValue;
                AbstractC3292y.i(previousTarget, "previousTarget");
                AbstractC3292y.i(previousAnchors, "previousAnchors");
                AbstractC3292y.i(newAnchors, "newAnchors");
                Float f8 = previousAnchors.get(previousTarget);
                int i8 = WhenMappings.$EnumSwitchMapping$0[previousTarget.ordinal()];
                if (i8 == 1) {
                    bottomDrawerValue = BottomDrawerValue.Closed;
                } else {
                    if (i8 != 2 && i8 != 3) {
                        throw new p();
                    }
                    bottomDrawerValue = BottomDrawerValue.Open;
                    if (!newAnchors.containsKey(bottomDrawerValue)) {
                        bottomDrawerValue = BottomDrawerValue.Expanded;
                        if (!newAnchors.containsKey(bottomDrawerValue)) {
                            bottomDrawerValue = BottomDrawerValue.Closed;
                        }
                    }
                }
                if (AbstractC3292y.a(((Number) Q.i(newAnchors, bottomDrawerValue)).floatValue(), f8)) {
                    return;
                }
                if (BottomDrawerState.this.isAnimationRunning$material_release()) {
                    AbstractC3462k.d(m8, null, null, new DrawerKt$BottomDrawerAnchorChangeCallback$1$onAnchorsChanged$1(BottomDrawerState.this, bottomDrawerValue, null), 3, null);
                } else {
                    if (BottomDrawerState.this.trySnapTo$material_release(bottomDrawerValue)) {
                        return;
                    }
                    AbstractC3462k.d(m8, null, null, new DrawerKt$BottomDrawerAnchorChangeCallback$1$onAnchorsChanged$2(BottomDrawerState.this, bottomDrawerValue, null), 3, null);
                }
            }
        };
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: BottomDrawerScrim-3J-VO9M */
    public static final void m1197BottomDrawerScrim3JVO9M(long j8, Function0 function0, boolean z8, Composer composer, int i8) {
        int i9;
        float f8;
        Modifier modifier;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-513067266);
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
                ComposerKt.traceEventStart(-513067266, i9, -1, "androidx.compose.material.BottomDrawerScrim (Drawer.kt:799)");
            }
            if (j8 != Color.Companion.m2984getUnspecified0d7_KjU()) {
                if (z8) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f8, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
                String m1328getString4foXLRw = Strings_androidKt.m1328getString4foXLRw(Strings.Companion.m1321getCloseDrawerUdPEhr4(), startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1298942364);
                if (z8) {
                    Modifier.Companion companion = Modifier.Companion;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    boolean changed = startRestartGroup.changed(function0);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new DrawerKt$BottomDrawerScrim$dismissModifier$1$1(function0, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, function0, (InterfaceC2072n) rememberedValue);
                    startRestartGroup.startReplaceableGroup(511388516);
                    boolean changed2 = startRestartGroup.changed(m1328getString4foXLRw) | startRestartGroup.changed(function0);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new DrawerKt$BottomDrawerScrim$dismissModifier$2$1(m1328getString4foXLRw, function0);
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
                    rememberedValue3 = new DrawerKt$BottomDrawerScrim$1$1(j8, animateFloatAsState);
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
            endRestartGroup.updateScope(new DrawerKt$BottomDrawerScrim$2(j8, function0, z8, i8));
        }
    }

    public static final float BottomDrawerScrim_3J_VO9M$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    @ExperimentalMaterialApi
    public static final BottomDrawerState BottomDrawerState(BottomDrawerValue initialValue, Density density, Function1 confirmStateChange) {
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(density, "density");
        AbstractC3292y.i(confirmStateChange, "confirmStateChange");
        BottomDrawerState bottomDrawerState = new BottomDrawerState(initialValue, confirmStateChange);
        bottomDrawerState.setDensity$material_release(density);
        return bottomDrawerState;
    }

    public static /* synthetic */ BottomDrawerState BottomDrawerState$default(BottomDrawerValue bottomDrawerValue, Density density, Function1 function1, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            function1 = DrawerKt$BottomDrawerState$1.INSTANCE;
        }
        return BottomDrawerState(bottomDrawerValue, density, function1);
    }

    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState) {
        return new DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02c4  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ModalDrawer-Gs3lGvM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1198ModalDrawerGs3lGvM(c6.InterfaceC2073o r33, androidx.compose.ui.Modifier r34, androidx.compose.material.DrawerState r35, boolean r36, androidx.compose.ui.graphics.Shape r37, float r38, long r39, long r41, long r43, c6.InterfaceC2072n r45, androidx.compose.runtime.Composer r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.m1198ModalDrawerGs3lGvM(c6.o, androidx.compose.ui.Modifier, androidx.compose.material.DrawerState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Scrim-Bx497Mc */
    public static final void m1199ScrimBx497Mc(boolean z8, Function0 function0, Function0 function02, long j8, Composer composer, int i8) {
        int i9;
        Modifier modifier;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1983403750);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changedInstance(function02)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(j8)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i9 |= i10;
        }
        if ((i9 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1983403750, i9, -1, "androidx.compose.material.Scrim (Drawer.kt:834)");
            }
            String m1328getString4foXLRw = Strings_androidKt.m1328getString4foXLRw(Strings.Companion.m1321getCloseDrawerUdPEhr4(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(1010561092);
            if (z8) {
                Modifier.Companion companion = Modifier.Companion;
                startRestartGroup.startReplaceableGroup(1157296644);
                boolean changed = startRestartGroup.changed(function0);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new DrawerKt$Scrim$dismissDrawer$1$1(function0, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, function0, (InterfaceC2072n) rememberedValue);
                startRestartGroup.startReplaceableGroup(511388516);
                boolean changed2 = startRestartGroup.changed(m1328getString4foXLRw) | startRestartGroup.changed(function0);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new DrawerKt$Scrim$dismissDrawer$2$1(m1328getString4foXLRw, function0);
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
            boolean changed3 = startRestartGroup.changed(m2938boximpl) | startRestartGroup.changed(function02);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new DrawerKt$Scrim$1$1(j8, function02);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(then, (Function1) rememberedValue3, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DrawerKt$Scrim$2(z8, function0, function02, j8, i8));
        }
    }

    private static final Map<BottomDrawerValue, Float> calculateAnchors(float f8, float f9, boolean z8) {
        float f10 = 0.5f * f8;
        float max = Math.max(0.0f, f8 - f9);
        Float f11 = null;
        if (f9 >= f10 && !z8) {
            r a9 = x.a(BottomDrawerValue.Closed, Float.valueOf(f8));
            r a10 = x.a(BottomDrawerValue.Open, Float.valueOf(f10));
            BottomDrawerValue bottomDrawerValue = BottomDrawerValue.Expanded;
            if (f9 != 0.0f) {
                f11 = Float.valueOf(max);
            }
            return Q.k(a9, a10, x.a(bottomDrawerValue, f11));
        }
        r a11 = x.a(BottomDrawerValue.Closed, Float.valueOf(f8));
        BottomDrawerValue bottomDrawerValue2 = BottomDrawerValue.Expanded;
        if (f9 != 0.0f) {
            f11 = Float.valueOf(max);
        }
        return Q.k(a11, x.a(bottomDrawerValue2, f11));
    }

    public static final float calculateFraction(float f8, float f9, float f10) {
        return m.j((f10 - f8) / (f9 - f8), 0.0f, 1.0f);
    }

    @Composable
    @ExperimentalMaterialApi
    public static final BottomDrawerState rememberBottomDrawerState(BottomDrawerValue initialValue, Function1 function1, Composer composer, int i8, int i9) {
        AbstractC3292y.i(initialValue, "initialValue");
        composer.startReplaceableGroup(-598115156);
        if ((i9 & 2) != 0) {
            function1 = DrawerKt$rememberBottomDrawerState$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-598115156, i8, -1, "androidx.compose.material.rememberBottomDrawerState (Drawer.kt:468)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = {density};
        Saver<BottomDrawerState, BottomDrawerValue> Saver = BottomDrawerState.Companion.Saver(density, function1);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(initialValue) | composer.changed(density) | composer.changed(function1);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DrawerKt$rememberBottomDrawerState$2$1(initialValue, density, function1);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        BottomDrawerState bottomDrawerState = (BottomDrawerState) RememberSaveableKt.m2560rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomDrawerState;
    }

    @Composable
    public static final DrawerState rememberDrawerState(DrawerValue initialValue, Function1 function1, Composer composer, int i8, int i9) {
        AbstractC3292y.i(initialValue, "initialValue");
        composer.startReplaceableGroup(-1435874229);
        if ((i9 & 2) != 0) {
            function1 = DrawerKt$rememberDrawerState$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1435874229, i8, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:451)");
        }
        Object[] objArr = new Object[0];
        Saver<DrawerState, DrawerValue> Saver = DrawerState.Companion.Saver(function1);
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(initialValue) | composer.changed(function1);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DrawerKt$rememberDrawerState$2$1(initialValue, function1);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m2560rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return drawerState;
    }
}
