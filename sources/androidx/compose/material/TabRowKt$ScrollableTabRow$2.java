package androidx.compose.material;

import Q5.I;
import R5.AbstractC1435t;
import U5.h;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.Q;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TabRowKt$ScrollableTabRow$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC2072n $divider;
    final /* synthetic */ float $edgePadding;
    final /* synthetic */ InterfaceC2073o $indicator;
    final /* synthetic */ int $selectedTabIndex;
    final /* synthetic */ InterfaceC2072n $tabs;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ InterfaceC2072n $divider;
        final /* synthetic */ float $edgePadding;
        final /* synthetic */ InterfaceC2073o $indicator;
        final /* synthetic */ ScrollableTabData $scrollableTabData;
        final /* synthetic */ int $selectedTabIndex;
        final /* synthetic */ InterfaceC2072n $tabs;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends AbstractC3293z implements Function1 {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ long $constraints;
            final /* synthetic */ InterfaceC2072n $divider;
            final /* synthetic */ InterfaceC2073o $indicator;
            final /* synthetic */ Q $layoutHeight;
            final /* synthetic */ Q $layoutWidth;
            final /* synthetic */ int $padding;
            final /* synthetic */ ScrollableTabData $scrollableTabData;
            final /* synthetic */ int $selectedTabIndex;
            final /* synthetic */ List<Placeable> $tabPlaceables;
            final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$2$3, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass3 extends AbstractC3293z implements InterfaceC2072n {
                final /* synthetic */ int $$dirty;
                final /* synthetic */ InterfaceC2073o $indicator;
                final /* synthetic */ List<TabPosition> $tabPositions;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(InterfaceC2073o interfaceC2073o, List<TabPosition> list, int i8) {
                    super(2);
                    this.$indicator = interfaceC2073o;
                    this.$tabPositions = list;
                    this.$$dirty = i8;
                }

                @Override // c6.InterfaceC2072n
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return I.f8786a;
                }

                @Composable
                public final void invoke(Composer composer, int i8) {
                    if ((i8 & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(230769237, i8, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:300)");
                    }
                    this.$indicator.invoke(this.$tabPositions, composer, Integer.valueOf(((this.$$dirty >> 12) & 112) | 8));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(int i8, List<? extends Placeable> list, SubcomposeMeasureScope subcomposeMeasureScope, InterfaceC2072n interfaceC2072n, ScrollableTabData scrollableTabData, int i9, long j8, Q q8, Q q9, InterfaceC2073o interfaceC2073o, int i10) {
                super(1);
                this.$padding = i8;
                this.$tabPlaceables = list;
                this.$this_SubcomposeLayout = subcomposeMeasureScope;
                this.$divider = interfaceC2072n;
                this.$scrollableTabData = scrollableTabData;
                this.$selectedTabIndex = i9;
                this.$constraints = j8;
                this.$layoutWidth = q8;
                this.$layoutHeight = q9;
                this.$indicator = interfaceC2073o;
                this.$$dirty = i10;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return I.f8786a;
            }

            public final void invoke(Placeable.PlacementScope layout) {
                AbstractC3292y.i(layout, "$this$layout");
                ArrayList arrayList = new ArrayList();
                int i8 = this.$padding;
                List<Placeable> list = this.$tabPlaceables;
                SubcomposeMeasureScope subcomposeMeasureScope = this.$this_SubcomposeLayout;
                int i9 = i8;
                for (Placeable placeable : list) {
                    Placeable.PlacementScope.placeRelative$default(layout, placeable, i9, 0, 0.0f, 4, null);
                    arrayList.add(new TabPosition(subcomposeMeasureScope.mo422toDpu2uoSUM(i9), subcomposeMeasureScope.mo422toDpu2uoSUM(placeable.getWidth()), null));
                    i9 += placeable.getWidth();
                }
                List<Measurable> subcompose = this.$this_SubcomposeLayout.subcompose(TabSlots.Divider, this.$divider);
                long j8 = this.$constraints;
                Q q8 = this.$layoutWidth;
                Q q9 = this.$layoutHeight;
                for (Measurable measurable : subcompose) {
                    int i10 = q8.f34571a;
                    Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(Constraints.m5114copyZbe2FdA$default(j8, i10, i10, 0, 0, 8, null));
                    Placeable.PlacementScope.placeRelative$default(layout, mo4108measureBRTryo0, 0, q9.f34571a - mo4108measureBRTryo0.getHeight(), 0.0f, 4, null);
                    q8 = q8;
                    q9 = q9;
                    j8 = j8;
                }
                List<Measurable> subcompose2 = this.$this_SubcomposeLayout.subcompose(TabSlots.Indicator, ComposableLambdaKt.composableLambdaInstance(230769237, true, new AnonymousClass3(this.$indicator, arrayList, this.$$dirty)));
                Q q10 = this.$layoutWidth;
                Q q11 = this.$layoutHeight;
                Iterator<T> it = subcompose2.iterator();
                while (it.hasNext()) {
                    Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it.next()).mo4108measureBRTryo0(Constraints.Companion.m5131fixedJhjzzOo(q10.f34571a, q11.f34571a)), 0, 0, 0.0f, 4, null);
                }
                this.$scrollableTabData.onLaidOut(this.$this_SubcomposeLayout, this.$padding, arrayList, this.$selectedTabIndex);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(float f8, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, ScrollableTabData scrollableTabData, int i8, InterfaceC2073o interfaceC2073o, int i9) {
            super(2);
            this.$edgePadding = f8;
            this.$tabs = interfaceC2072n;
            this.$divider = interfaceC2072n2;
            this.$scrollableTabData = scrollableTabData;
            this.$selectedTabIndex = i8;
            this.$indicator = interfaceC2073o;
            this.$$dirty = i9;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m1362invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m5129unboximpl());
        }

        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
        public final MeasureResult m1362invoke0kLqBqw(SubcomposeMeasureScope SubcomposeLayout, long j8) {
            float f8;
            AbstractC3292y.i(SubcomposeLayout, "$this$SubcomposeLayout");
            f8 = TabRowKt.ScrollableTabRowMinimumTabWidth;
            int mo419roundToPx0680j_4 = SubcomposeLayout.mo419roundToPx0680j_4(f8);
            int mo419roundToPx0680j_42 = SubcomposeLayout.mo419roundToPx0680j_4(this.$edgePadding);
            long m5114copyZbe2FdA$default = Constraints.m5114copyZbe2FdA$default(j8, mo419roundToPx0680j_4, 0, 0, 0, 14, null);
            List<Measurable> subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, this.$tabs);
            ArrayList<Placeable> arrayList = new ArrayList(AbstractC1435t.x(subcompose, 10));
            Iterator<T> it = subcompose.iterator();
            while (it.hasNext()) {
                arrayList.add(((Measurable) it.next()).mo4108measureBRTryo0(m5114copyZbe2FdA$default));
            }
            Q q8 = new Q();
            q8.f34571a = mo419roundToPx0680j_42 * 2;
            Q q9 = new Q();
            for (Placeable placeable : arrayList) {
                q8.f34571a += placeable.getWidth();
                q9.f34571a = Math.max(q9.f34571a, placeable.getHeight());
            }
            return MeasureScope.CC.q(SubcomposeLayout, q8.f34571a, q9.f34571a, null, new AnonymousClass2(mo419roundToPx0680j_42, arrayList, SubcomposeLayout, this.$divider, this.$scrollableTabData, this.$selectedTabIndex, j8, q8, q9, this.$indicator, this.$$dirty), 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$ScrollableTabRow$2(float f8, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, int i8, InterfaceC2073o interfaceC2073o, int i9) {
        super(2);
        this.$edgePadding = f8;
        this.$tabs = interfaceC2072n;
        this.$divider = interfaceC2072n2;
        this.$selectedTabIndex = i8;
        this.$indicator = interfaceC2073o;
        this.$$dirty = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1455860572, i8, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:244)");
        }
        ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, composer, 0, 1);
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(h.f10149a, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        M coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(rememberScrollState) | composer.changed(coroutineScope);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new ScrollableTabData(rememberScrollState, coroutineScope);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        SubcomposeLayoutKt.SubcomposeLayout(ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null))), new AnonymousClass1(this.$edgePadding, this.$tabs, this.$divider, (ScrollableTabData) rememberedValue2, this.$selectedTabIndex, this.$indicator, this.$$dirty), composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
