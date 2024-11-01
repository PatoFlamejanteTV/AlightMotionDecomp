package androidx.compose.material3;

import R5.AbstractC1435t;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Q;

/* loaded from: classes.dex */
public final class AlertDialogKt {
    private static final PaddingValues DialogPadding;
    private static final PaddingValues IconPadding;
    private static final PaddingValues TextPadding;
    private static final PaddingValues TitlePadding;
    private static final float MinWidth = Dp.m5155constructorimpl(280);
    private static final float MaxWidth = Dp.m5155constructorimpl(560);

    static {
        float f8 = 24;
        DialogPadding = PaddingKt.m570PaddingValues0680j_4(Dp.m5155constructorimpl(f8));
        float f9 = 16;
        IconPadding = PaddingKt.m574PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m5155constructorimpl(f9), 7, null);
        TitlePadding = PaddingKt.m574PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m5155constructorimpl(f9), 7, null);
        TextPadding = PaddingKt.m574PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m5155constructorimpl(f8), 7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ef  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: AlertDialogContent-4hvqGtA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1428AlertDialogContent4hvqGtA(c6.InterfaceC2072n r23, androidx.compose.ui.Modifier r24, c6.InterfaceC2072n r25, c6.InterfaceC2072n r26, c6.InterfaceC2072n r27, androidx.compose.ui.graphics.Shape r28, long r29, float r31, long r32, long r34, long r36, long r38, androidx.compose.runtime.Composer r40, int r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AlertDialogKt.m1428AlertDialogContent4hvqGtA(c6.n, androidx.compose.ui.Modifier, c6.n, c6.n, c6.n, androidx.compose.ui.graphics.Shape, long, float, long, long, long, long, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m1429AlertDialogFlowRowixp7dh8(final float f8, final float f9, InterfaceC2072n content, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        AbstractC3292y.i(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(586821353);
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
            if (startRestartGroup.changed(content)) {
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
                ComposerKt.traceEventStart(586821353, i9, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:127)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1
                private static final boolean measure_3p2s80s$canAddToCurrentSequence(List<Placeable> list, Q q8, MeasureScope measureScope, float f10, long j8, Placeable placeable) {
                    if (!list.isEmpty() && q8.f34571a + measureScope.mo419roundToPx0680j_4(f10) + placeable.getWidth() > Constraints.m5123getMaxWidthimpl(j8)) {
                        return false;
                    }
                    return true;
                }

                private static final void measure_3p2s80s$startNewSequence(List<List<Placeable>> list, Q q8, MeasureScope measureScope, float f10, List<Placeable> list2, List<Integer> list3, Q q9, List<Integer> list4, Q q10, Q q11) {
                    List<List<Placeable>> list5 = list;
                    if (!list5.isEmpty()) {
                        q8.f34571a += measureScope.mo419roundToPx0680j_4(f10);
                    }
                    list5.add(AbstractC1435t.W0(list2));
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
                    Iterator<? extends Measurable> it = measurables.iterator();
                    while (it.hasNext()) {
                        Placeable mo4108measureBRTryo0 = it.next().mo4108measureBRTryo0(j8);
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
                        q11 = q9;
                    }
                    ArrayList arrayList7 = arrayList5;
                    Q q16 = q11;
                    Q q17 = q12;
                    if (!arrayList7.isEmpty()) {
                        measure_3p2s80s$startNewSequence(arrayList2, q16, Layout, f9, arrayList7, arrayList3, q13, arrayList4, q10, q17);
                    }
                    int max = Math.max(q10.f34571a, Constraints.m5125getMinWidthimpl(j8));
                    return MeasureScope.CC.q(Layout, max, Math.max(q16.f34571a, Constraints.m5124getMinHeightimpl(j8)), null, new AlertDialogKt$AlertDialogFlowRow$1$measure$1(arrayList2, Layout, f8, max, arrayList4), 4, null);
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
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            InterfaceC2073o materializerOf = LayoutKt.materializerOf(companion);
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
            startRestartGroup.disableReusing();
            Composer m2473constructorimpl = Updater.m2473constructorimpl(startRestartGroup);
            Updater.m2480setimpl(m2473constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, density, companion2.getSetDensity());
            Updater.m2480setimpl(m2473constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m2480setimpl(m2473constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
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
