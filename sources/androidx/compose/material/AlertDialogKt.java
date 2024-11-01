package androidx.compose.material;

import R5.AbstractC1435t;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
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
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Q;

/* loaded from: classes.dex */
public final class AlertDialogKt {
    private static final long TextBaselineDistanceFromTitle;
    private static final long TextBaselineDistanceFromTop;
    private static final Modifier TextPadding;
    private static final long TitleBaselineDistanceFromTop;
    private static final Modifier TitlePadding;

    static {
        Modifier.Companion companion = Modifier.Companion;
        float f8 = 24;
        TitlePadding = PaddingKt.m581paddingqDBjuR0$default(companion, Dp.m5155constructorimpl(f8), 0.0f, Dp.m5155constructorimpl(f8), 0.0f, 10, null);
        TextPadding = PaddingKt.m581paddingqDBjuR0$default(companion, Dp.m5155constructorimpl(f8), 0.0f, Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(28), 2, null);
        TitleBaselineDistanceFromTop = TextUnitKt.getSp(40);
        TextBaselineDistanceFromTitle = TextUnitKt.getSp(36);
        TextBaselineDistanceFromTop = TextUnitKt.getSp(38);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void AlertDialogBaselineLayout(ColumnScope columnScope, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        AbstractC3292y.i(columnScope, "<this>");
        Composer startRestartGroup = composer.startRestartGroup(-555573207);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(columnScope)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i9 = i12 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i9 |= i11;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n2)) {
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
                ComposerKt.traceEventStart(-555573207, i8, -1, "androidx.compose.material.AlertDialogBaselineLayout (AlertDialog.kt:92)");
            }
            Modifier weight = columnScope.weight(Modifier.Companion, 1.0f, false);
            AlertDialogKt$AlertDialogBaselineLayout$2 alertDialogKt$AlertDialogBaselineLayout$2 = new MeasurePolicy() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i13) {
                    return g.a(this, intrinsicMeasureScope, list, i13);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i13) {
                    return g.b(this, intrinsicMeasureScope, list, i13);
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0101  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x010a  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00f7  */
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final androidx.compose.ui.layout.MeasureResult mo109measure3p2s80s(androidx.compose.ui.layout.MeasureScope r12, java.util.List<? extends androidx.compose.ui.layout.Measurable> r13, long r14) {
                    /*
                        Method dump skipped, instructions count: 321
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2.mo109measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
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
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(weight);
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
            Updater.m2480setimpl(m2473constructorimpl, alertDialogKt$AlertDialogBaselineLayout$2, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-1160646206);
            if (interfaceC2072n != null) {
                Modifier layoutId = LayoutIdKt.layoutId(TitlePadding, CampaignEx.JSON_KEY_TITLE);
                Alignment.Companion companion2 = Alignment.Companion;
                Modifier align = columnScope.align(layoutId, companion2.getStart());
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0 constructor2 = companion.getConstructor();
                InterfaceC2073o modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(align);
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
                Updater.m2480setimpl(m2473constructorimpl2, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl2, currentCompositionLocalMap2, companion.getSetResolvedCompositionLocals());
                InterfaceC2072n setCompositeKeyHash2 = companion.getSetCompositeKeyHash();
                if (m2473constructorimpl2.getInserting() || !AbstractC3292y.d(m2473constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m2473constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m2473constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                interfaceC2072n.invoke(startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1735756597);
            if (interfaceC2072n2 != null) {
                Modifier layoutId2 = LayoutIdKt.layoutId(TextPadding, MimeTypes.BASE_TYPE_TEXT);
                Alignment.Companion companion3 = Alignment.Companion;
                Modifier align2 = columnScope.align(layoutId2, companion3.getStart());
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0 constructor3 = companion.getConstructor();
                InterfaceC2073o modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(align2);
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
                Updater.m2480setimpl(m2473constructorimpl3, rememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                Updater.m2480setimpl(m2473constructorimpl3, currentCompositionLocalMap3, companion.getSetResolvedCompositionLocals());
                InterfaceC2072n setCompositeKeyHash3 = companion.getSetCompositeKeyHash();
                if (m2473constructorimpl3.getInserting() || !AbstractC3292y.d(m2473constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m2473constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m2473constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                interfaceC2072n2.invoke(startRestartGroup, 0);
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
            endRestartGroup.updateScope(new AlertDialogKt$AlertDialogBaselineLayout$3(columnScope, interfaceC2072n, interfaceC2072n2, i8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b1  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: AlertDialogContent-WMdw5o4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1072AlertDialogContentWMdw5o4(c6.InterfaceC2072n r25, androidx.compose.ui.Modifier r26, c6.InterfaceC2072n r27, c6.InterfaceC2072n r28, androidx.compose.ui.graphics.Shape r29, long r30, long r32, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AlertDialogKt.m1072AlertDialogContentWMdw5o4(c6.n, androidx.compose.ui.Modifier, c6.n, c6.n, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m1073AlertDialogFlowRowixp7dh8(final float f8, final float f9, InterfaceC2072n content, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        AbstractC3292y.i(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(73434452);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(f8)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i9 = i12 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(f9)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i9 |= i11;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changedInstance(content)) {
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
                ComposerKt.traceEventStart(73434452, i9, -1, "androidx.compose.material.AlertDialogFlowRow (AlertDialog.kt:187)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1
                private static final boolean measure_3p2s80s$canAddToCurrentSequence(List<Placeable> list, Q q8, MeasureScope measureScope, float f10, long j8, Placeable placeable) {
                    if (!list.isEmpty() && q8.f34571a + measureScope.mo419roundToPx0680j_4(f10) + placeable.getWidth() > Constraints.m5123getMaxWidthimpl(j8)) {
                        return false;
                    }
                    return true;
                }

                private static final void measure_3p2s80s$startNewSequence(List<List<Placeable>> list, Q q8, MeasureScope measureScope, float f10, List<Placeable> list2, List<Integer> list3, Q q9, List<Integer> list4, Q q10, Q q11) {
                    if (!list.isEmpty()) {
                        q8.f34571a += measureScope.mo419roundToPx0680j_4(f10);
                    }
                    list.add(0, AbstractC1435t.W0(list2));
                    list3.add(Integer.valueOf(q9.f34571a));
                    list4.add(Integer.valueOf(q8.f34571a));
                    q8.f34571a += q9.f34571a;
                    q10.f34571a = Math.max(q10.f34571a, q11.f34571a);
                    list2.clear();
                    q11.f34571a = 0;
                    q9.f34571a = 0;
                }

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
                    int max;
                    Q q8;
                    ArrayList arrayList;
                    Q q9;
                    AbstractC3292y.i(Layout, "$this$Layout");
                    AbstractC3292y.i(measurables, "measurables");
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    Q q10 = new Q();
                    Q q11 = new Q();
                    ArrayList arrayList5 = new ArrayList();
                    Q q12 = new Q();
                    Q q13 = new Q();
                    long Constraints$default = ConstraintsKt.Constraints$default(0, Constraints.m5123getMaxWidthimpl(j8), 0, 0, 13, null);
                    Iterator<? extends Measurable> it = measurables.iterator();
                    while (it.hasNext()) {
                        Placeable mo4108measureBRTryo0 = it.next().mo4108measureBRTryo0(Constraints$default);
                        long j9 = Constraints$default;
                        Q q14 = q13;
                        if (!measure_3p2s80s$canAddToCurrentSequence(arrayList5, q12, Layout, f8, j8, mo4108measureBRTryo0)) {
                            q8 = q12;
                            arrayList = arrayList5;
                            q9 = q11;
                            measure_3p2s80s$startNewSequence(arrayList2, q11, Layout, f9, arrayList5, arrayList3, q14, arrayList4, q10, q8);
                        } else {
                            q8 = q12;
                            arrayList = arrayList5;
                            q9 = q11;
                        }
                        Q q15 = q8;
                        if (!arrayList.isEmpty()) {
                            q15.f34571a += Layout.mo419roundToPx0680j_4(f8);
                        }
                        ArrayList arrayList6 = arrayList;
                        arrayList6.add(mo4108measureBRTryo0);
                        q15.f34571a += mo4108measureBRTryo0.getWidth();
                        q13 = q14;
                        q13.f34571a = Math.max(q13.f34571a, mo4108measureBRTryo0.getHeight());
                        arrayList5 = arrayList6;
                        q12 = q15;
                        Constraints$default = j9;
                        q11 = q9;
                    }
                    ArrayList arrayList7 = arrayList5;
                    Q q16 = q11;
                    Q q17 = q12;
                    if (!arrayList7.isEmpty()) {
                        measure_3p2s80s$startNewSequence(arrayList2, q16, Layout, f9, arrayList7, arrayList3, q13, arrayList4, q10, q17);
                    }
                    if (Constraints.m5123getMaxWidthimpl(j8) != Integer.MAX_VALUE) {
                        max = Constraints.m5123getMaxWidthimpl(j8);
                    } else {
                        max = Math.max(q10.f34571a, Constraints.m5125getMinWidthimpl(j8));
                    }
                    int i13 = max;
                    return MeasureScope.CC.q(Layout, i13, Math.max(q16.f34571a, Constraints.m5124getMinHeightimpl(j8)), null, new AlertDialogKt$AlertDialogFlowRow$1$measure$1(arrayList2, Layout, f8, i13, arrayList4), 4, null);
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
            int i13 = ((((i9 >> 6) & 14) << 9) & 7168) | 6;
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
            content.invoke(startRestartGroup, Integer.valueOf((i13 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AlertDialogKt$AlertDialogFlowRow$2(f8, f9, content, i8));
        }
    }
}
