package androidx.compose.ui.window;

import Q5.I;
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
import androidx.compose.runtime.State;
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
import androidx.compose.ui.unit.Constraints;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class AndroidDialog_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0048  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Dialog(kotlin.jvm.functions.Function0 r19, androidx.compose.ui.window.DialogProperties r20, c6.InterfaceC2072n r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidDialog_androidKt.Dialog(kotlin.jvm.functions.Function0, androidx.compose.ui.window.DialogProperties, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2072n Dialog$lambda$0(State<? extends InterfaceC2072n> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DialogLayout(Modifier modifier, InterfaceC2072n interfaceC2072n, Composer composer, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1177876616);
        int i13 = i9 & 1;
        if (i13 != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i10 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1177876616, i10, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:452)");
            }
            AndroidDialog_androidKt$DialogLayout$1 androidDialog_androidKt$DialogLayout$1 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1

                /* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$1, reason: invalid class name */
                /* loaded from: classes.dex */
                static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
                    final /* synthetic */ List<Placeable> $placeables;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(List<? extends Placeable> list) {
                        super(1);
                        this.$placeables = list;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return I.f8786a;
                    }

                    public final void invoke(Placeable.PlacementScope placementScope) {
                        List<Placeable> list = this.$placeables;
                        int size = list.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i8), 0, 0, 0.0f, 4, null);
                        }
                    }
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i14) {
                    return g.a(this, intrinsicMeasureScope, list, i14);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i14) {
                    return g.b(this, intrinsicMeasureScope, list, i14);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r13v15 */
                /* JADX WARN: Type inference failed for: r13v17 */
                /* JADX WARN: Type inference failed for: r13v18 */
                /* JADX WARN: Type inference failed for: r13v23 */
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo109measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j8) {
                    Object obj;
                    int m5125getMinWidthimpl;
                    int m5124getMinHeightimpl;
                    ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        arrayList.add(list.get(i14).mo4108measureBRTryo0(j8));
                    }
                    Placeable placeable = null;
                    int i15 = 1;
                    if (arrayList.isEmpty()) {
                        obj = null;
                    } else {
                        obj = arrayList.get(0);
                        int width = ((Placeable) obj).getWidth();
                        int o8 = AbstractC1435t.o(arrayList);
                        if (1 <= o8) {
                            int i16 = 1;
                            while (true) {
                                Object obj2 = arrayList.get(i16);
                                int width2 = ((Placeable) obj2).getWidth();
                                if (width < width2) {
                                    obj = obj2;
                                    width = width2;
                                }
                                if (i16 == o8) {
                                    break;
                                }
                                i16++;
                            }
                        }
                    }
                    Placeable placeable2 = (Placeable) obj;
                    if (placeable2 != null) {
                        m5125getMinWidthimpl = placeable2.getWidth();
                    } else {
                        m5125getMinWidthimpl = Constraints.m5125getMinWidthimpl(j8);
                    }
                    int i17 = m5125getMinWidthimpl;
                    if (!arrayList.isEmpty()) {
                        ?? r13 = arrayList.get(0);
                        int height = ((Placeable) r13).getHeight();
                        int o9 = AbstractC1435t.o(arrayList);
                        boolean z8 = r13;
                        if (1 <= o9) {
                            while (true) {
                                Object obj3 = arrayList.get(i15);
                                int height2 = ((Placeable) obj3).getHeight();
                                r13 = z8;
                                if (height < height2) {
                                    r13 = obj3;
                                    height = height2;
                                }
                                if (i15 == o9) {
                                    break;
                                }
                                i15++;
                                z8 = r13;
                            }
                        }
                        placeable = r13;
                    }
                    Placeable placeable3 = placeable;
                    if (placeable3 != null) {
                        m5124getMinHeightimpl = placeable3.getHeight();
                    } else {
                        m5124getMinHeightimpl = Constraints.m5124getMinHeightimpl(j8);
                    }
                    return MeasureScope.CC.q(measureScope, i17, m5124getMinHeightimpl, null, new AnonymousClass1(arrayList), 4, null);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i14) {
                    return g.c(this, intrinsicMeasureScope, list, i14);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i14) {
                    return g.d(this, intrinsicMeasureScope, list, i14);
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            int i14 = ((((((i10 >> 3) & 14) | 384) | ((i10 << 3) & 112)) << 9) & 7168) | 6;
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
            Updater.m2480setimpl(m2473constructorimpl, androidDialog_androidKt$DialogLayout$1, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            interfaceC2072n.invoke(startRestartGroup, Integer.valueOf((i14 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidDialog_androidKt$DialogLayout$2(modifier, interfaceC2072n, i8, i9));
        }
    }
}
