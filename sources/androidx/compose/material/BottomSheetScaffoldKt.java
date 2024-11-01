package androidx.compose.material;

import Q5.p;
import R5.Q;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.M;

/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt {
    private static final float FabSpacing = Dp.m5155constructorimpl(16);
    private static final float BottomSheetScaffoldPositionalThreshold = Dp.m5155constructorimpl(56);
    private static final float BottomSheetScaffoldVelocityThreshold = Dp.m5155constructorimpl(125);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0065  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomSheet-0cLKjW4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1110BottomSheet0cLKjW4(androidx.compose.material.BottomSheetState r27, boolean r28, kotlin.jvm.functions.Function1 r29, androidx.compose.ui.graphics.Shape r30, float r31, long r32, long r34, androidx.compose.ui.Modifier r36, c6.InterfaceC2073o r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.m1110BottomSheet0cLKjW4(androidx.compose.material.BottomSheetState, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.graphics.Shape, float, long, long, androidx.compose.ui.Modifier, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0248  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_]]")
    /* renamed from: BottomSheetScaffold-bGncdBI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1111BottomSheetScaffoldbGncdBI(c6.InterfaceC2073o r41, androidx.compose.ui.Modifier r42, androidx.compose.material.BottomSheetScaffoldState r43, c6.InterfaceC2072n r44, c6.InterfaceC2073o r45, c6.InterfaceC2072n r46, int r47, boolean r48, androidx.compose.ui.graphics.Shape r49, float r50, long r51, long r53, float r55, c6.InterfaceC2073o r56, boolean r57, androidx.compose.ui.graphics.Shape r58, float r59, long r60, long r62, long r64, long r66, long r68, c6.InterfaceC2073o r70, androidx.compose.runtime.Composer r71, int r72, int r73, int r74, int r75) {
        /*
            Method dump skipped, instructions count: 1661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.m1111BottomSheetScaffoldbGncdBI(c6.o, androidx.compose.ui.Modifier, androidx.compose.material.BottomSheetScaffoldState, c6.n, c6.o, c6.n, int, boolean, androidx.compose.ui.graphics.Shape, float, long, long, float, c6.o, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, long, long, c6.o, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnchoredDraggableState.AnchorChangedCallback<BottomSheetValue> BottomSheetScaffoldAnchorChangeCallback(final BottomSheetState bottomSheetState, final M m8) {
        return new AnchoredDraggableState.AnchorChangedCallback<BottomSheetValue>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeCallback$1

            /* loaded from: classes.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[BottomSheetValue.values().length];
                    try {
                        iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[BottomSheetValue.Expanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.compose.material.AnchoredDraggableState.AnchorChangedCallback
            public final void onAnchorsChanged(BottomSheetValue prevTarget, Map<BottomSheetValue, Float> prevAnchors, Map<BottomSheetValue, Float> newAnchors) {
                BottomSheetValue bottomSheetValue;
                AbstractC3292y.i(prevTarget, "prevTarget");
                AbstractC3292y.i(prevAnchors, "prevAnchors");
                AbstractC3292y.i(newAnchors, "newAnchors");
                Float f8 = prevAnchors.get(prevTarget);
                int i8 = WhenMappings.$EnumSwitchMapping$0[prevTarget.ordinal()];
                if (i8 == 1) {
                    bottomSheetValue = BottomSheetValue.Collapsed;
                } else {
                    if (i8 != 2) {
                        throw new p();
                    }
                    bottomSheetValue = BottomSheetValue.Expanded;
                    if (!newAnchors.containsKey(bottomSheetValue)) {
                        bottomSheetValue = BottomSheetValue.Collapsed;
                    }
                }
                if (AbstractC3292y.a(((Number) Q.i(newAnchors, bottomSheetValue)).floatValue(), f8)) {
                    return;
                }
                if (BottomSheetState.this.isAnimationRunning$material_release()) {
                    AbstractC3462k.d(m8, null, null, new BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeCallback$1$onAnchorsChanged$1(BottomSheetState.this, bottomSheetValue, null), 3, null);
                } else {
                    if (BottomSheetState.this.trySnapTo$material_release(bottomSheetValue)) {
                        return;
                    }
                    AbstractC3462k.d(m8, null, null, new BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeCallback$1$onAnchorsChanged$2(BottomSheetState.this, bottomSheetValue, null), 3, null);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable][_]]")
    /* renamed from: BottomSheetScaffoldLayout-KCBPh4w, reason: not valid java name */
    public static final void m1112BottomSheetScaffoldLayoutKCBPh4w(InterfaceC2072n interfaceC2072n, InterfaceC2073o interfaceC2073o, InterfaceC2073o interfaceC2073o2, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, float f8, int i8, Function0 function0, BottomSheetState bottomSheetState, Composer composer, int i9) {
        int i10;
        Composer composer2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Composer startRestartGroup = composer.startRestartGroup(1621720523);
        if ((i9 & 14) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i10 = i20 | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 112) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2073o)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i10 |= i19;
        }
        if ((i9 & 896) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2073o2)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i10 |= i18;
        }
        if ((i9 & 7168) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n2)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i10 |= i17;
        }
        if ((57344 & i9) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n3)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i10 |= i16;
        }
        if ((458752 & i9) == 0) {
            if (startRestartGroup.changed(f8)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i10 |= i15;
        }
        if ((i9 & 3670016) == 0) {
            if (startRestartGroup.changed(i8)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i10 |= i14;
        }
        if ((i9 & 29360128) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i10 |= i13;
        }
        if ((i9 & 234881024) == 0) {
            if (startRestartGroup.changed(bottomSheetState)) {
                i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i12 = 33554432;
            }
            i10 |= i12;
        }
        if ((i10 & 191739611) == 38347922 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1621720523, i10, -1, "androidx.compose.material.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:601)");
            }
            Object[] objArr = {interfaceC2073o2, function0, interfaceC2072n, interfaceC2073o, Dp.m5153boximpl(f8), interfaceC2072n2, FabPosition.m1226boximpl(i8), interfaceC2072n3, bottomSheetState};
            startRestartGroup.startReplaceableGroup(-568225417);
            int i21 = 0;
            boolean z8 = false;
            for (int i22 = 9; i21 < i22; i22 = 9) {
                z8 |= startRestartGroup.changed(objArr[i21]);
                i21++;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (!z8 && rememberedValue != Composer.Companion.getEmpty()) {
                composer2 = startRestartGroup;
                i11 = 0;
            } else {
                composer2 = startRestartGroup;
                i11 = 0;
                BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(function0, interfaceC2072n, interfaceC2072n2, i8, f8, interfaceC2072n3, bottomSheetState, interfaceC2073o2, i10, interfaceC2073o);
                composer2.updateRememberedValue(bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1);
                rememberedValue = bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1;
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (InterfaceC2072n) rememberedValue, composer2, i11, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(interfaceC2072n, interfaceC2073o, interfaceC2073o2, interfaceC2072n2, interfaceC2072n3, f8, i8, function0, bottomSheetState, i9));
        }
    }

    @ExperimentalMaterialApi
    public static final BottomSheetState BottomSheetScaffoldState(BottomSheetValue initialValue, AnimationSpec<Float> animationSpec, Function1 confirmStateChange) {
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(confirmStateChange, "confirmStateChange");
        return new BottomSheetState(initialValue, animationSpec, confirmStateChange);
    }

    public static /* synthetic */ BottomSheetState BottomSheetScaffoldState$default(BottomSheetValue bottomSheetValue, AnimationSpec animationSpec, Function1 function1, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        return BottomSheetScaffoldState(bottomSheetValue, animationSpec, function1);
    }

    @Stable
    @ExperimentalMaterialApi
    public static final BottomSheetState BottomSheetState(BottomSheetValue initialValue, Density density, AnimationSpec<Float> animationSpec, Function1 confirmValueChange) {
        AbstractC3292y.i(initialValue, "initialValue");
        AbstractC3292y.i(density, "density");
        AbstractC3292y.i(animationSpec, "animationSpec");
        AbstractC3292y.i(confirmValueChange, "confirmValueChange");
        BottomSheetState bottomSheetState = new BottomSheetState(initialValue, animationSpec, confirmValueChange);
        bottomSheetState.setDensity$material_release(density);
        return bottomSheetState;
    }

    public static /* synthetic */ BottomSheetState BottomSheetState$default(BottomSheetValue bottomSheetValue, Density density, AnimationSpec animationSpec, Function1 function1, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i8 & 8) != 0) {
            function1 = BottomSheetScaffoldKt$BottomSheetState$1.INSTANCE;
        }
        return BottomSheetState(bottomSheetValue, density, animationSpec, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        return new BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState, orientation);
    }

    @Composable
    @ExperimentalMaterialApi
    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(DrawerState drawerState, BottomSheetState bottomSheetState, SnackbarHostState snackbarHostState, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(-1353009744);
        if ((i9 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i9 & 2) != 0) {
            bottomSheetState = rememberBottomSheetState(BottomSheetValue.Collapsed, null, null, composer, 6, 6);
        }
        if ((i9 & 4) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1353009744, i8, -1, "androidx.compose.material.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:350)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(drawerState) | composer.changed(bottomSheetState) | composer.changed(snackbarHostState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new BottomSheetScaffoldState(drawerState, bottomSheetState, snackbarHostState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomSheetScaffoldState;
    }

    @Composable
    @ExperimentalMaterialApi
    public static final BottomSheetState rememberBottomSheetState(BottomSheetValue initialValue, AnimationSpec<Float> animationSpec, Function1 function1, Composer composer, int i8, int i9) {
        AbstractC3292y.i(initialValue, "initialValue");
        composer.startReplaceableGroup(1808153344);
        if ((i9 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i9 & 4) != 0) {
            function1 = BottomSheetScaffoldKt$rememberBottomSheetState$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1808153344, i8, -1, "androidx.compose.material.rememberBottomSheetState (BottomSheetScaffold.kt:303)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        BottomSheetState bottomSheetState = (BottomSheetState) RememberSaveableKt.m2560rememberSaveable(new Object[]{animationSpec}, (Saver) BottomSheetState.Companion.Saver(animationSpec, function1, density), (String) null, (Function0) new BottomSheetScaffoldKt$rememberBottomSheetState$2(initialValue, density, animationSpec, function1), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomSheetState;
    }
}
