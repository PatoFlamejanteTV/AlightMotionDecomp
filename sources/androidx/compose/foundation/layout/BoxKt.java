package androidx.compose.foundation.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
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
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Q;

/* loaded from: classes.dex */
public final class BoxKt {
    private static final MeasurePolicy DefaultBoxMeasurePolicy = boxMeasurePolicy(Alignment.Companion.getTopStart(), false);
    private static final MeasurePolicy EmptyBoxMeasurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.BoxKt$EmptyBoxMeasurePolicy$1
        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
            return androidx.compose.ui.layout.g.a(this, intrinsicMeasureScope, list, i8);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
            return androidx.compose.ui.layout.g.b(this, intrinsicMeasureScope, list, i8);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo109measure3p2s80s(MeasureScope MeasurePolicy, List<? extends Measurable> list, long j8) {
            AbstractC3292y.i(MeasurePolicy, "$this$MeasurePolicy");
            AbstractC3292y.i(list, "<anonymous parameter 0>");
            return MeasureScope.CC.q(MeasurePolicy, Constraints.m5125getMinWidthimpl(j8), Constraints.m5124getMinHeightimpl(j8), null, BoxKt$EmptyBoxMeasurePolicy$1$measure$1.INSTANCE, 4, null);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
            return androidx.compose.ui.layout.g.c(this, intrinsicMeasureScope, list, i8);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
            return androidx.compose.ui.layout.g.d(this, intrinsicMeasureScope, list, i8);
        }
    };

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Box(Modifier modifier, Alignment alignment, boolean z8, InterfaceC2073o content, Composer composer, int i8, int i9) {
        AbstractC3292y.i(content, "content");
        composer.startReplaceableGroup(733328855);
        if ((i9 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i9 & 2) != 0) {
            alignment = Alignment.Companion.getTopStart();
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        MeasurePolicy rememberBoxMeasurePolicy = rememberBoxMeasurePolicy(alignment, z8, composer, (i8 >> 3) & 126);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m2473constructorimpl = Updater.m2473constructorimpl(composer);
        Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        content.invoke(BoxScopeInstance.INSTANCE, composer, Integer.valueOf(((i8 >> 6) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    public static final MeasurePolicy boxMeasurePolicy(final Alignment alignment, final boolean z8) {
        AbstractC3292y.i(alignment, "alignment");
        return new MeasurePolicy() { // from class: androidx.compose.foundation.layout.BoxKt$boxMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                return androidx.compose.ui.layout.g.a(this, intrinsicMeasureScope, list, i8);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                return androidx.compose.ui.layout.g.b(this, intrinsicMeasureScope, list, i8);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo109measure3p2s80s(MeasureScope MeasurePolicy, List<? extends Measurable> measurables, long j8) {
                long m5114copyZbe2FdA$default;
                int i8;
                int i9;
                boolean matchesParentSize;
                boolean matchesParentSize2;
                boolean matchesParentSize3;
                int m5125getMinWidthimpl;
                Placeable mo4108measureBRTryo0;
                int i10;
                AbstractC3292y.i(MeasurePolicy, "$this$MeasurePolicy");
                AbstractC3292y.i(measurables, "measurables");
                if (measurables.isEmpty()) {
                    return MeasureScope.CC.q(MeasurePolicy, Constraints.m5125getMinWidthimpl(j8), Constraints.m5124getMinHeightimpl(j8), null, BoxKt$boxMeasurePolicy$1$measure$1.INSTANCE, 4, null);
                }
                if (z8) {
                    m5114copyZbe2FdA$default = j8;
                } else {
                    m5114copyZbe2FdA$default = Constraints.m5114copyZbe2FdA$default(j8, 0, 0, 0, 0, 10, null);
                }
                if (measurables.size() == 1) {
                    Measurable measurable = measurables.get(0);
                    matchesParentSize3 = BoxKt.getMatchesParentSize(measurable);
                    if (!matchesParentSize3) {
                        Placeable mo4108measureBRTryo02 = measurable.mo4108measureBRTryo0(m5114copyZbe2FdA$default);
                        int max = Math.max(Constraints.m5125getMinWidthimpl(j8), mo4108measureBRTryo02.getWidth());
                        i10 = Math.max(Constraints.m5124getMinHeightimpl(j8), mo4108measureBRTryo02.getHeight());
                        mo4108measureBRTryo0 = mo4108measureBRTryo02;
                        m5125getMinWidthimpl = max;
                    } else {
                        m5125getMinWidthimpl = Constraints.m5125getMinWidthimpl(j8);
                        int m5124getMinHeightimpl = Constraints.m5124getMinHeightimpl(j8);
                        mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(Constraints.Companion.m5131fixedJhjzzOo(Constraints.m5125getMinWidthimpl(j8), Constraints.m5124getMinHeightimpl(j8)));
                        i10 = m5124getMinHeightimpl;
                    }
                    return MeasureScope.CC.q(MeasurePolicy, m5125getMinWidthimpl, i10, null, new BoxKt$boxMeasurePolicy$1$measure$2(mo4108measureBRTryo0, measurable, MeasurePolicy, m5125getMinWidthimpl, i10, alignment), 4, null);
                }
                Placeable[] placeableArr = new Placeable[measurables.size()];
                Q q8 = new Q();
                q8.f34571a = Constraints.m5125getMinWidthimpl(j8);
                Q q9 = new Q();
                q9.f34571a = Constraints.m5124getMinHeightimpl(j8);
                int size = measurables.size();
                boolean z9 = false;
                for (int i11 = 0; i11 < size; i11++) {
                    Measurable measurable2 = measurables.get(i11);
                    matchesParentSize2 = BoxKt.getMatchesParentSize(measurable2);
                    if (!matchesParentSize2) {
                        Placeable mo4108measureBRTryo03 = measurable2.mo4108measureBRTryo0(m5114copyZbe2FdA$default);
                        placeableArr[i11] = mo4108measureBRTryo03;
                        q8.f34571a = Math.max(q8.f34571a, mo4108measureBRTryo03.getWidth());
                        q9.f34571a = Math.max(q9.f34571a, mo4108measureBRTryo03.getHeight());
                    } else {
                        z9 = true;
                    }
                }
                if (z9) {
                    int i12 = q8.f34571a;
                    if (i12 != Integer.MAX_VALUE) {
                        i8 = i12;
                    } else {
                        i8 = 0;
                    }
                    int i13 = q9.f34571a;
                    if (i13 != Integer.MAX_VALUE) {
                        i9 = i13;
                    } else {
                        i9 = 0;
                    }
                    long Constraints = ConstraintsKt.Constraints(i8, i12, i9, i13);
                    int size2 = measurables.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        Measurable measurable3 = measurables.get(i14);
                        matchesParentSize = BoxKt.getMatchesParentSize(measurable3);
                        if (matchesParentSize) {
                            placeableArr[i14] = measurable3.mo4108measureBRTryo0(Constraints);
                        }
                    }
                }
                return MeasureScope.CC.q(MeasurePolicy, q8.f34571a, q9.f34571a, null, new BoxKt$boxMeasurePolicy$1$measure$5(placeableArr, measurables, MeasurePolicy, q8, q9, alignment), 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                return androidx.compose.ui.layout.g.c(this, intrinsicMeasureScope, list, i8);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                return androidx.compose.ui.layout.g.d(this, intrinsicMeasureScope, list, i8);
            }
        };
    }

    private static final BoxChildDataNode getBoxChildDataNode(Measurable measurable) {
        Object parentData = measurable.getParentData();
        if (parentData instanceof BoxChildDataNode) {
            return (BoxChildDataNode) parentData;
        }
        return null;
    }

    public static final MeasurePolicy getDefaultBoxMeasurePolicy() {
        return DefaultBoxMeasurePolicy;
    }

    public static final MeasurePolicy getEmptyBoxMeasurePolicy() {
        return EmptyBoxMeasurePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getMatchesParentSize(Measurable measurable) {
        BoxChildDataNode boxChildDataNode = getBoxChildDataNode(measurable);
        if (boxChildDataNode != null) {
            return boxChildDataNode.getMatchParentSize();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeInBox(Placeable.PlacementScope placementScope, Placeable placeable, Measurable measurable, LayoutDirection layoutDirection, int i8, int i9, Alignment alignment) {
        Alignment alignment2;
        Alignment alignment3;
        BoxChildDataNode boxChildDataNode = getBoxChildDataNode(measurable);
        if (boxChildDataNode != null && (alignment3 = boxChildDataNode.getAlignment()) != null) {
            alignment2 = alignment3;
        } else {
            alignment2 = alignment;
        }
        Placeable.PlacementScope.m4146place70tqf50$default(placementScope, placeable, alignment2.mo2585alignKFBX0sM(IntSizeKt.IntSize(placeable.getWidth(), placeable.getHeight()), IntSizeKt.IntSize(i8, i9), layoutDirection), 0.0f, 2, null);
    }

    @Composable
    public static final MeasurePolicy rememberBoxMeasurePolicy(Alignment alignment, boolean z8, Composer composer, int i8) {
        MeasurePolicy measurePolicy;
        AbstractC3292y.i(alignment, "alignment");
        composer.startReplaceableGroup(56522820);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(56522820, i8, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:79)");
        }
        if (AbstractC3292y.d(alignment, Alignment.Companion.getTopStart()) && !z8) {
            measurePolicy = DefaultBoxMeasurePolicy;
        } else {
            Boolean valueOf = Boolean.valueOf(z8);
            composer.startReplaceableGroup(511388516);
            boolean changed = composer.changed(valueOf) | composer.changed(alignment);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = boxMeasurePolicy(alignment, z8);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            measurePolicy = (MeasurePolicy) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Box(Modifier modifier, Composer composer, int i8) {
        int i9;
        AbstractC3292y.i(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(-211209833);
        if ((i8 & 14) == 0) {
            i9 = (startRestartGroup.changed(modifier) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-211209833, i9, -1, "androidx.compose.foundation.layout.Box (Box.kt:198)");
            }
            MeasurePolicy measurePolicy = EmptyBoxMeasurePolicy;
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
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
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new BoxKt$Box$3(modifier, i8));
    }
}
