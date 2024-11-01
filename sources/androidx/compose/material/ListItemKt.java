package androidx.compose.material;

import R5.AbstractC1435t;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ListItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void BaselinesOffsetColumn(final List<Dp> list, Modifier modifier, InterfaceC2072n interfaceC2072n, Composer composer, int i8, int i9) {
        Composer startRestartGroup = composer.startRestartGroup(1631148337);
        if ((i9 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        Modifier modifier2 = modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1631148337, i8, -1, "androidx.compose.material.BaselinesOffsetColumn (ListItem.kt:347)");
        }
        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list2, int i10) {
                return g.a(this, intrinsicMeasureScope, list2, i10);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list2, int i10) {
                return g.b(this, intrinsicMeasureScope, list2, i10);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo109measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j8) {
                int i10;
                AbstractC3292y.i(Layout, "$this$Layout");
                AbstractC3292y.i(measurables, "measurables");
                long m5114copyZbe2FdA$default = Constraints.m5114copyZbe2FdA$default(j8, 0, 0, 0, Integer.MAX_VALUE, 3, null);
                List<? extends Measurable> list2 = measurables;
                ArrayList arrayList = new ArrayList(AbstractC1435t.x(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Measurable) it.next()).mo4108measureBRTryo0(m5114copyZbe2FdA$default));
                }
                Iterator it2 = arrayList.iterator();
                int i11 = 0;
                while (it2.hasNext()) {
                    i11 = Math.max(i11, ((Placeable) it2.next()).getWidth());
                }
                int size = arrayList.size();
                Integer[] numArr = new Integer[size];
                for (int i12 = 0; i12 < size; i12++) {
                    numArr[i12] = 0;
                }
                List<Dp> list3 = list;
                int size2 = arrayList.size();
                int i13 = 0;
                for (int i14 = 0; i14 < size2; i14++) {
                    Placeable placeable = (Placeable) arrayList.get(i14);
                    if (i14 > 0) {
                        int i15 = i14 - 1;
                        i10 = ((Placeable) arrayList.get(i15)).getHeight() - ((Placeable) arrayList.get(i15)).get(AlignmentLineKt.getLastBaseline());
                    } else {
                        i10 = 0;
                    }
                    int max = Math.max(0, (Layout.mo419roundToPx0680j_4(list3.get(i14).m5169unboximpl()) - placeable.get(AlignmentLineKt.getFirstBaseline())) - i10);
                    numArr[i14] = Integer.valueOf(max + i13);
                    i13 += max + placeable.getHeight();
                }
                return MeasureScope.CC.q(Layout, i11, i13, null, new ListItemKt$BaselinesOffsetColumn$1$measure$2(arrayList, numArr), 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list2, int i10) {
                return g.c(this, intrinsicMeasureScope, list2, i10);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list2, int i10) {
                return g.d(this, intrinsicMeasureScope, list2, i10);
            }
        };
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
        int i10 = (((((i8 >> 6) & 14) | (i8 & 112)) << 9) & 7168) | 6;
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
        Updater.m2480setimpl(m2473constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        interfaceC2072n.invoke(startRestartGroup, Integer.valueOf((i10 >> 9) & 14));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ListItemKt$BaselinesOffsetColumn$2(list, modifier2, interfaceC2072n, i8, i9));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0054  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][_][_][_]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ListItem(androidx.compose.ui.Modifier r21, c6.InterfaceC2072n r22, c6.InterfaceC2072n r23, boolean r24, c6.InterfaceC2072n r25, c6.InterfaceC2072n r26, c6.InterfaceC2072n r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ListItemKt.ListItem(androidx.compose.ui.Modifier, c6.n, c6.n, boolean, c6.n, c6.n, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: OffsetToBaselineOrCenter-Kz89ssw, reason: not valid java name */
    public static final void m1246OffsetToBaselineOrCenterKz89ssw(final float f8, Modifier modifier, InterfaceC2072n interfaceC2072n, Composer composer, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-1062692685);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(f8)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            i10 = i8;
        }
        int i14 = i9 & 2;
        if (i14 != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i9 & 4) != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        if ((i10 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i14 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1062692685, i10, -1, "androidx.compose.material.OffsetToBaselineOrCenter (ListItem.kt:389)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i15) {
                    return g.a(this, intrinsicMeasureScope, list, i15);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i15) {
                    return g.b(this, intrinsicMeasureScope, list, i15);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo109measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j8) {
                    int max;
                    int m5280getYimpl;
                    AbstractC3292y.i(Layout, "$this$Layout");
                    AbstractC3292y.i(measurables, "measurables");
                    Placeable mo4108measureBRTryo0 = measurables.get(0).mo4108measureBRTryo0(Constraints.m5114copyZbe2FdA$default(j8, 0, 0, 0, 0, 11, null));
                    int i15 = mo4108measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
                    if (i15 != Integer.MIN_VALUE) {
                        m5280getYimpl = Layout.mo419roundToPx0680j_4(f8) - i15;
                        max = Math.max(Constraints.m5124getMinHeightimpl(j8), mo4108measureBRTryo0.getHeight() + m5280getYimpl);
                    } else {
                        max = Math.max(Constraints.m5124getMinHeightimpl(j8), mo4108measureBRTryo0.getHeight());
                        m5280getYimpl = IntOffset.m5280getYimpl(Alignment.Companion.getCenter().mo2585alignKFBX0sM(IntSize.Companion.m5326getZeroYbymL2g(), IntSizeKt.IntSize(0, max - mo4108measureBRTryo0.getHeight()), Layout.getLayoutDirection()));
                    }
                    return MeasureScope.CC.q(Layout, mo4108measureBRTryo0.getWidth(), max, null, new ListItemKt$OffsetToBaselineOrCenter$1$measure$1(mo4108measureBRTryo0, m5280getYimpl), 4, null);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i15) {
                    return g.c(this, intrinsicMeasureScope, list, i15);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i15) {
                    return g.d(this, intrinsicMeasureScope, list, i15);
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            int i15 = ((((i10 & 112) | ((i10 >> 6) & 14)) << 9) & 7168) | 6;
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
            Updater.m2480setimpl(m2473constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            interfaceC2072n.invoke(startRestartGroup, Integer.valueOf((i15 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ListItemKt$OffsetToBaselineOrCenter$2(f8, modifier2, interfaceC2072n, i8, i9));
        }
    }

    private static final InterfaceC2072n applyTextStyle(TextStyle textStyle, float f8, InterfaceC2072n interfaceC2072n) {
        if (interfaceC2072n == null) {
            return null;
        }
        return ComposableLambdaKt.composableLambdaInstance(-830176860, true, new ListItemKt$applyTextStyle$1(f8, textStyle, interfaceC2072n));
    }
}
