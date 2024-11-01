package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import e6.AbstractC2829a;
import i6.m;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class BottomNavigationKt {
    private static final TweenSpec<Float> BottomNavigationAnimationSpec = new TweenSpec<>(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final float BottomNavigationHeight = Dp.m5155constructorimpl(56);
    private static final float BottomNavigationItemHorizontalPadding;
    private static final float CombinedItemTextBaseline;

    static {
        float f8 = 12;
        BottomNavigationItemHorizontalPadding = Dp.m5155constructorimpl(f8);
        CombinedItemTextBaseline = Dp.m5155constructorimpl(f8);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0088  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomNavigation-PEIptTM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1100BottomNavigationPEIptTM(androidx.compose.ui.Modifier r24, long r25, long r27, float r29, c6.InterfaceC2073o r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomNavigationKt.m1100BottomNavigationPEIptTM(androidx.compose.ui.Modifier, long, long, float, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomNavigationItem-jY6E1Zs, reason: not valid java name */
    public static final void m1101BottomNavigationItemjY6E1Zs(RowScope BottomNavigationItem, boolean z8, Function0 onClick, InterfaceC2072n icon, Modifier modifier, boolean z9, InterfaceC2072n interfaceC2072n, boolean z10, MutableInteractionSource mutableInteractionSource, long j8, long j9, Composer composer, int i8, int i9, int i10) {
        int i11;
        Modifier modifier2;
        InterfaceC2072n interfaceC2072n2;
        int i12;
        Modifier modifier3;
        boolean z11;
        boolean z12;
        MutableInteractionSource mutableInteractionSource2;
        long j10;
        long j11;
        MutableInteractionSource mutableInteractionSource3;
        boolean z13;
        long j12;
        InterfaceC2072n interfaceC2072n3;
        boolean z14;
        Modifier modifier4;
        AbstractC3292y.i(BottomNavigationItem, "$this$BottomNavigationItem");
        AbstractC3292y.i(onClick, "onClick");
        AbstractC3292y.i(icon, "icon");
        Composer startRestartGroup = composer.startRestartGroup(-1473735525);
        if ((Integer.MIN_VALUE & i10) != 0) {
            i11 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i11 = (startRestartGroup.changed(BottomNavigationItem) ? 4 : 2) | i8;
        } else {
            i11 = i8;
        }
        if ((i10 & 1) != 0) {
            i11 |= 48;
        } else if ((i8 & 112) == 0) {
            i11 |= startRestartGroup.changed(z8) ? 32 : 16;
        }
        if ((i10 & 2) != 0) {
            i11 |= 384;
        } else if ((i8 & 896) == 0) {
            i11 |= startRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if ((i10 & 4) != 0) {
            i11 |= 3072;
        } else if ((i8 & 7168) == 0) {
            i11 |= startRestartGroup.changedInstance(icon) ? 2048 : 1024;
        }
        int i13 = i10 & 8;
        if (i13 != 0) {
            i11 |= 24576;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i8 & 57344) == 0) {
                i11 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
        }
        int i14 = 16 & i10;
        if (i14 != 0) {
            i11 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i8 & 458752) == 0) {
            i11 |= startRestartGroup.changed(z9) ? 131072 : 65536;
        }
        int i15 = 32 & i10;
        if (i15 != 0) {
            i11 |= 1572864;
            interfaceC2072n2 = interfaceC2072n;
        } else {
            interfaceC2072n2 = interfaceC2072n;
            if ((i8 & 3670016) == 0) {
                i11 |= startRestartGroup.changedInstance(interfaceC2072n2) ? 1048576 : 524288;
            }
        }
        int i16 = i10 & 64;
        if (i16 != 0) {
            i11 |= 12582912;
        } else if ((i8 & 29360128) == 0) {
            i11 |= startRestartGroup.changed(z10) ? 8388608 : 4194304;
        }
        int i17 = 128 & i10;
        if (i17 != 0) {
            i11 |= 100663296;
        } else if ((i8 & 234881024) == 0) {
            i11 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i8 & 1879048192) == 0) {
            i11 |= ((i10 & 256) == 0 && startRestartGroup.changed(j8)) ? 536870912 : 268435456;
        }
        if ((i9 & 14) == 0) {
            i12 = i9 | (((i10 & 512) == 0 && startRestartGroup.changed(j9)) ? 4 : 2);
        } else {
            i12 = i9;
        }
        if ((1533916891 & i11) == 306783378 && (i12 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            z13 = z9;
            z14 = z10;
            mutableInteractionSource3 = mutableInteractionSource;
            j10 = j8;
            modifier4 = modifier2;
            interfaceC2072n3 = interfaceC2072n2;
            j12 = j9;
        } else {
            startRestartGroup.startDefaults();
            if ((i8 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((256 & i10) != 0) {
                    i11 &= -1879048193;
                }
                if ((i10 & 512) != 0) {
                    i12 &= -15;
                }
                z11 = z9;
                z12 = z10;
                mutableInteractionSource2 = mutableInteractionSource;
                j10 = j8;
                j11 = j9;
                modifier3 = modifier2;
            } else {
                modifier3 = i13 != 0 ? Modifier.Companion : modifier2;
                z11 = i14 != 0 ? true : z9;
                if (i15 != 0) {
                    interfaceC2072n2 = null;
                }
                z12 = i16 != 0 ? true : z10;
                if (i17 != 0) {
                    startRestartGroup.startReplaceableGroup(-492369756);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((256 & i10) != 0) {
                    j10 = ((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl();
                    i11 &= -1879048193;
                } else {
                    j10 = j8;
                }
                if ((i10 & 512) != 0) {
                    j11 = Color.m2947copywmQWz5c$default(j10, ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -15;
                } else {
                    j11 = j9;
                }
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1473735525, i11, i12, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:146)");
            }
            ComposableLambda composableLambda = interfaceC2072n2 != null ? ComposableLambdaKt.composableLambda(startRestartGroup, 1343298261, true, new BottomNavigationKt$BottomNavigationItem$styledLabel$1$1(interfaceC2072n2, i11)) : null;
            Modifier a9 = e.a(BottomNavigationItem, SelectableKt.m799selectableO2vRcR0(modifier3, z8, mutableInteractionSource2, RippleKt.m1421rememberRipple9IZ8Weo(false, 0.0f, j10, startRestartGroup, ((i11 >> 21) & 896) | 6, 2), z11, Role.m4493boximpl(Role.Companion.m4506getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
            Alignment center = Alignment.Companion.getCenter();
            MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
            startRestartGroup.startReplaceableGroup(733328855);
            boolean z15 = z11;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Modifier modifier5 = modifier3;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(a9);
            InterfaceC2072n interfaceC2072n4 = interfaceC2072n2;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2473constructorimpl = Updater.m2473constructorimpl(startRestartGroup);
            Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            m1102BottomNavigationTransitionKlgxPg(j10, j11, z8, ComposableLambdaKt.composableLambda(startRestartGroup, -1411872801, true, new BottomNavigationKt$BottomNavigationItem$2$1(z12, icon, composableLambda, i11)), startRestartGroup, ((i12 << 3) & 112) | ((i11 >> 27) & 14) | 3072 | ((i11 << 3) & 896));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource3 = mutableInteractionSource4;
            z13 = z15;
            j12 = j11;
            interfaceC2072n3 = interfaceC2072n4;
            z14 = z12;
            modifier4 = modifier5;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new BottomNavigationKt$BottomNavigationItem$3(BottomNavigationItem, z8, onClick, icon, modifier4, z13, interfaceC2072n3, z14, mutableInteractionSource3, j10, j12, i8, i9, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void BottomNavigationItemBaselineLayout(InterfaceC2072n interfaceC2072n, final InterfaceC2072n interfaceC2072n2, final float f8, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1162995092);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i9 = i12 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i9 |= i11;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(f8)) {
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
                ComposerKt.traceEventStart(-1162995092, i9, -1, "androidx.compose.material.BottomNavigationItemBaselineLayout (BottomNavigation.kt:253)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItemBaselineLayout$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i13) {
                    return g.a(this, intrinsicMeasureScope, list, i13);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i13) {
                    return g.b(this, intrinsicMeasureScope, list, i13);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo109measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j8) {
                    Placeable placeable;
                    MeasureResult m1107placeLabelAndIconDIyivk0;
                    MeasureResult m1106placeIcon3p2s80s;
                    AbstractC3292y.i(Layout, "$this$Layout");
                    AbstractC3292y.i(measurables, "measurables");
                    List<? extends Measurable> list = measurables;
                    for (Measurable measurable : list) {
                        if (AbstractC3292y.d(LayoutIdKt.getLayoutId(measurable), RewardPlus.ICON)) {
                            Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(j8);
                            if (InterfaceC2072n.this != null) {
                                for (Measurable measurable2 : list) {
                                    if (AbstractC3292y.d(LayoutIdKt.getLayoutId(measurable2), "label")) {
                                        placeable = measurable2.mo4108measureBRTryo0(Constraints.m5114copyZbe2FdA$default(j8, 0, 0, 0, 0, 11, null));
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            placeable = null;
                            if (InterfaceC2072n.this == null) {
                                m1106placeIcon3p2s80s = BottomNavigationKt.m1106placeIcon3p2s80s(Layout, mo4108measureBRTryo0, j8);
                                return m1106placeIcon3p2s80s;
                            }
                            AbstractC3292y.f(placeable);
                            m1107placeLabelAndIconDIyivk0 = BottomNavigationKt.m1107placeLabelAndIconDIyivk0(Layout, placeable, mo4108measureBRTryo0, j8, f8);
                            return m1107placeLabelAndIconDIyivk0;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i13) {
                    return g.c(this, intrinsicMeasureScope, list, i13);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i13) {
                    return g.d(this, intrinsicMeasureScope, list, i13);
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.Companion;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2473constructorimpl = Updater.m2473constructorimpl(startRestartGroup);
            Updater.m2480setimpl(m2473constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            Modifier layoutId = LayoutIdKt.layoutId(companion, RewardPlus.ICON);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0 constructor2 = companion2.getConstructor();
            InterfaceC2073o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(layoutId);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2473constructorimpl2 = Updater.m2473constructorimpl(startRestartGroup);
            Updater.m2480setimpl(m2473constructorimpl2, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m2473constructorimpl2.getInserting() || !AbstractC3292y.d(m2473constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2473constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2473constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            interfaceC2072n.invoke(startRestartGroup, Integer.valueOf(i9 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1198312436);
            if (interfaceC2072n2 != null) {
                Modifier m579paddingVpY3zN4$default = PaddingKt.m579paddingVpY3zN4$default(AlphaKt.alpha(LayoutIdKt.layoutId(companion, "label"), f8), BottomNavigationItemHorizontalPadding, 0.0f, 2, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0 constructor3 = companion2.getConstructor();
                InterfaceC2073o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m579paddingVpY3zN4$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m2473constructorimpl3 = Updater.m2473constructorimpl(startRestartGroup);
                Updater.m2480setimpl(m2473constructorimpl3, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                InterfaceC2072n setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (m2473constructorimpl3.getInserting() || !AbstractC3292y.d(m2473constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m2473constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m2473constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                interfaceC2072n2.invoke(startRestartGroup, Integer.valueOf((i9 >> 3) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BottomNavigationKt$BottomNavigationItemBaselineLayout$3(interfaceC2072n, interfaceC2072n2, f8, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: BottomNavigationTransition-Klgx-Pg, reason: not valid java name */
    public static final void m1102BottomNavigationTransitionKlgxPg(long j8, long j9, boolean z8, InterfaceC2073o interfaceC2073o, Composer composer, int i8) {
        int i9;
        float f8;
        Composer composer2;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-985175058);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(j8)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(j9)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(z8)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2073o)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i9 |= i10;
        }
        int i14 = i9;
        if ((i14 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-985175058, i14, -1, "androidx.compose.material.BottomNavigationTransition (BottomNavigation.kt:221)");
            }
            if (z8) {
                f8 = 1.0f;
            } else {
                f8 = 0.0f;
            }
            composer2 = startRestartGroup;
            State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f8, BottomNavigationAnimationSpec, 0.0f, null, null, startRestartGroup, 48, 28);
            long m2999lerpjxsXWHM = ColorKt.m2999lerpjxsXWHM(j9, j8, BottomNavigationTransition_Klgx_Pg$lambda$3(animateFloatAsState));
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(Color.m2947copywmQWz5c$default(m2999lerpjxsXWHM, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2950getAlphaimpl(m2999lerpjxsXWHM)))}, ComposableLambdaKt.composableLambda(composer2, -138092754, true, new BottomNavigationKt$BottomNavigationTransition$1(interfaceC2073o, i14, animateFloatAsState)), composer2, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BottomNavigationKt$BottomNavigationTransition$2(j8, j9, z8, interfaceC2073o, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BottomNavigationTransition_Klgx_Pg$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeIcon-3p2s80s, reason: not valid java name */
    public static final MeasureResult m1106placeIcon3p2s80s(MeasureScope measureScope, Placeable placeable, long j8) {
        int m5122getMaxHeightimpl = Constraints.m5122getMaxHeightimpl(j8);
        return MeasureScope.CC.q(measureScope, placeable.getWidth(), m5122getMaxHeightimpl, null, new BottomNavigationKt$placeIcon$1(placeable, (m5122getMaxHeightimpl - placeable.getHeight()) / 2), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeLabelAndIcon-DIyivk0, reason: not valid java name */
    public static final MeasureResult m1107placeLabelAndIconDIyivk0(MeasureScope measureScope, Placeable placeable, Placeable placeable2, long j8, float f8) {
        int m5122getMaxHeightimpl = Constraints.m5122getMaxHeightimpl(j8);
        int mo419roundToPx0680j_4 = measureScope.mo419roundToPx0680j_4(CombinedItemTextBaseline) - placeable.get(AlignmentLineKt.getFirstBaseline());
        int d8 = m.d((m5122getMaxHeightimpl - ((placeable2.getHeight() + placeable.getHeight()) + mo419roundToPx0680j_4)) / 2, 0);
        int height = (m5122getMaxHeightimpl - placeable2.getHeight()) / 2;
        int height2 = placeable2.getHeight() + d8 + mo419roundToPx0680j_4;
        int max = Math.max(placeable.getWidth(), placeable2.getWidth());
        return MeasureScope.CC.q(measureScope, max, m5122getMaxHeightimpl, null, new BottomNavigationKt$placeLabelAndIcon$1(f8, placeable, (max - placeable.getWidth()) / 2, height2, AbstractC2829a.d((height - d8) * (1 - f8)), placeable2, (max - placeable2.getWidth()) / 2, d8), 4, null);
    }
}
