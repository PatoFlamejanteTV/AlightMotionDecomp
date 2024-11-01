package androidx.compose.material;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
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
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TabKt {
    private static final int TabFadeInAnimationDelay = 100;
    private static final int TabFadeInAnimationDuration = 150;
    private static final int TabFadeOutAnimationDuration = 100;
    private static final float SmallTabHeight = Dp.m5155constructorimpl(48);
    private static final float LargeTabHeight = Dp.m5155constructorimpl(72);
    private static final float HorizontalTextPadding = Dp.m5155constructorimpl(16);
    private static final float SingleLineTextBaselineWithIcon = Dp.m5155constructorimpl(14);
    private static final float DoubleLineTextBaselineWithIcon = Dp.m5155constructorimpl(6);
    private static final long IconDistanceFromBaseline = TextUnitKt.getSp(20);
    private static final float TextDistanceFromLeadingIcon = Dp.m5155constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00a9  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: LeadingIconTab-0nD-MI0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1347LeadingIconTab0nDMI0(boolean r29, kotlin.jvm.functions.Function0 r30, c6.InterfaceC2072n r31, c6.InterfaceC2072n r32, androidx.compose.ui.Modifier r33, boolean r34, androidx.compose.foundation.interaction.MutableInteractionSource r35, long r36, long r38, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.m1347LeadingIconTab0nDMI0(boolean, kotlin.jvm.functions.Function0, c6.n, c6.n, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Tab-0nD-MI0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1348Tab0nDMI0(boolean r27, kotlin.jvm.functions.Function0 r28, androidx.compose.ui.Modifier r29, boolean r30, c6.InterfaceC2072n r31, c6.InterfaceC2072n r32, androidx.compose.foundation.interaction.MutableInteractionSource r33, long r34, long r36, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.m1348Tab0nDMI0(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, c6.n, c6.n, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x008c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Tab-EVJuX4I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1349TabEVJuX4I(boolean r29, kotlin.jvm.functions.Function0 r30, androidx.compose.ui.Modifier r31, boolean r32, androidx.compose.foundation.interaction.MutableInteractionSource r33, long r34, long r36, c6.InterfaceC2073o r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabKt.m1349TabEVJuX4I(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, long, long, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TabBaselineLayout(final InterfaceC2072n interfaceC2072n, final InterfaceC2072n interfaceC2072n2, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(1249848471);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n2)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1249848471, i9, -1, "androidx.compose.material.TabBaselineLayout (Tab.kt:300)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i12) {
                    return g.a(this, intrinsicMeasureScope, list, i12);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i12) {
                    return g.b(this, intrinsicMeasureScope, list, i12);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo109measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j8) {
                    Placeable placeable;
                    Placeable placeable2;
                    int i12;
                    Integer num;
                    Integer num2;
                    AbstractC3292y.i(Layout, "$this$Layout");
                    AbstractC3292y.i(measurables, "measurables");
                    if (InterfaceC2072n.this != null) {
                        for (Measurable measurable : measurables) {
                            if (AbstractC3292y.d(LayoutIdKt.getLayoutId(measurable), MimeTypes.BASE_TYPE_TEXT)) {
                                placeable = measurable.mo4108measureBRTryo0(Constraints.m5114copyZbe2FdA$default(j8, 0, 0, 0, 0, 11, null));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    placeable = null;
                    if (interfaceC2072n2 != null) {
                        for (Measurable measurable2 : measurables) {
                            if (AbstractC3292y.d(LayoutIdKt.getLayoutId(measurable2), RewardPlus.ICON)) {
                                placeable2 = measurable2.mo4108measureBRTryo0(j8);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    placeable2 = null;
                    int i13 = 0;
                    if (placeable != null) {
                        i12 = placeable.getWidth();
                    } else {
                        i12 = 0;
                    }
                    if (placeable2 != null) {
                        i13 = placeable2.getWidth();
                    }
                    int max = Math.max(i12, i13);
                    int mo419roundToPx0680j_4 = Layout.mo419roundToPx0680j_4((placeable == null || placeable2 == null) ? TabKt.SmallTabHeight : TabKt.LargeTabHeight);
                    if (placeable != null) {
                        num = Integer.valueOf(placeable.get(AlignmentLineKt.getFirstBaseline()));
                    } else {
                        num = null;
                    }
                    if (placeable != null) {
                        num2 = Integer.valueOf(placeable.get(AlignmentLineKt.getLastBaseline()));
                    } else {
                        num2 = null;
                    }
                    return MeasureScope.CC.q(Layout, max, mo419roundToPx0680j_4, null, new TabKt$TabBaselineLayout$2$measure$1(placeable, placeable2, Layout, max, mo419roundToPx0680j_4, num, num2), 4, null);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i12) {
                    return g.c(this, intrinsicMeasureScope, list, i12);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i12) {
                    return g.d(this, intrinsicMeasureScope, list, i12);
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
            startRestartGroup.startReplaceableGroup(-2141028452);
            if (interfaceC2072n != null) {
                Modifier m579paddingVpY3zN4$default = PaddingKt.m579paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, MimeTypes.BASE_TYPE_TEXT), HorizontalTextPadding, 0.0f, 2, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0 constructor2 = companion2.getConstructor();
                InterfaceC2073o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m579paddingVpY3zN4$default);
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
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(448373045);
            if (interfaceC2072n2 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(companion, RewardPlus.ICON);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0 constructor3 = companion2.getConstructor();
                InterfaceC2073o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(layoutId);
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
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
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
            endRestartGroup.updateScope(new TabKt$TabBaselineLayout$3(interfaceC2072n, interfaceC2072n2, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: TabTransition-Klgx-Pg, reason: not valid java name */
    public static final void m1350TabTransitionKlgxPg(long j8, long j9, boolean z8, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        int i9;
        long j10;
        long j11;
        long j12;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-405571117);
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
            if (startRestartGroup.changedInstance(interfaceC2072n)) {
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
                ComposerKt.traceEventStart(-405571117, i9, -1, "androidx.compose.material.TabTransition (Tab.kt:262)");
            }
            int i14 = i9 >> 6;
            Transition updateTransition = TransitionKt.updateTransition(Boolean.valueOf(z8), (String) null, startRestartGroup, i14 & 14, 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = TabKt$TabTransition$color$2.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1939694975);
            boolean booleanValue = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceableGroup(1445938070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:284)");
            }
            if (booleanValue) {
                j10 = j8;
            } else {
                j10 = j9;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceableGroup();
            ColorSpace m2952getColorSpaceimpl = Color.m2952getColorSpaceimpl(j10);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(m2952getColorSpaceimpl);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m2952getColorSpaceimpl);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
            startRestartGroup.startReplaceableGroup(-142660079);
            boolean booleanValue2 = ((Boolean) updateTransition.getCurrentState()).booleanValue();
            startRestartGroup.startReplaceableGroup(1445938070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:284)");
            }
            if (booleanValue2) {
                j11 = j8;
            } else {
                j11 = j9;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceableGroup();
            Color m2938boximpl = Color.m2938boximpl(j11);
            boolean booleanValue3 = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceableGroup(1445938070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:284)");
            }
            if (booleanValue3) {
                j12 = j8;
            } else {
                j12 = j9;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceableGroup();
            State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, m2938boximpl, Color.m2938boximpl(j12), (FiniteAnimationSpec) tabKt$TabTransition$color$2.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), twoWayConverter, "ColorAnimation", startRestartGroup, 32768);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(Color.m2947copywmQWz5c$default(TabTransition_Klgx_Pg$lambda$5(createTransitionAnimation), 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2950getAlphaimpl(TabTransition_Klgx_Pg$lambda$5(createTransitionAnimation))))}, interfaceC2072n, startRestartGroup, (i14 & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TabKt$TabTransition$1(j8, j9, z8, interfaceC2072n, i8));
        }
    }

    private static final long TabTransition_Klgx_Pg$lambda$5(State<Color> state) {
        return state.getValue().m2958unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextAndIcon(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i8, int i9, int i10, int i11) {
        float f8;
        if (i10 == i11) {
            f8 = SingleLineTextBaselineWithIcon;
        } else {
            f8 = DoubleLineTextBaselineWithIcon;
        }
        int mo419roundToPx0680j_4 = density.mo419roundToPx0680j_4(f8) + density.mo419roundToPx0680j_4(TabRowDefaults.INSTANCE.m1358getIndicatorHeightD9Ej5fM());
        int height = (placeable2.getHeight() + density.mo418roundToPxR2X_6o(IconDistanceFromBaseline)) - i10;
        int i12 = (i9 - i11) - mo419roundToPx0680j_4;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (i8 - placeable.getWidth()) / 2, i12, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, (i8 - placeable2.getWidth()) / 2, i12 - height, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextOrIcon(Placeable.PlacementScope placementScope, Placeable placeable, int i8) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i8 - placeable.getHeight()) / 2, 0.0f, 4, null);
    }
}
