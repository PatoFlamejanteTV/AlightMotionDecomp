package androidx.compose.material;

import Q5.I;
import R5.AbstractC1435t;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TabRowKt$TabRow$2$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC2072n $divider;
    final /* synthetic */ InterfaceC2073o $indicator;
    final /* synthetic */ InterfaceC2072n $tabs;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.TabRowKt$TabRow$2$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ long $constraints;
        final /* synthetic */ InterfaceC2072n $divider;
        final /* synthetic */ InterfaceC2073o $indicator;
        final /* synthetic */ List<Placeable> $tabPlaceables;
        final /* synthetic */ List<TabPosition> $tabPositions;
        final /* synthetic */ int $tabRowHeight;
        final /* synthetic */ int $tabRowWidth;
        final /* synthetic */ int $tabWidth;
        final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material.TabRowKt$TabRow$2$1$1$1$3, reason: invalid class name */
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
                    ComposerKt.traceEventStart(-1341594997, i8, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:175)");
                }
                this.$indicator.invoke(this.$tabPositions, composer, Integer.valueOf(((this.$$dirty >> 9) & 112) | 8));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(List<? extends Placeable> list, SubcomposeMeasureScope subcomposeMeasureScope, InterfaceC2072n interfaceC2072n, int i8, long j8, int i9, InterfaceC2073o interfaceC2073o, List<TabPosition> list2, int i10, int i11) {
            super(1);
            this.$tabPlaceables = list;
            this.$this_SubcomposeLayout = subcomposeMeasureScope;
            this.$divider = interfaceC2072n;
            this.$tabWidth = i8;
            this.$constraints = j8;
            this.$tabRowHeight = i9;
            this.$indicator = interfaceC2073o;
            this.$tabPositions = list2;
            this.$$dirty = i10;
            this.$tabRowWidth = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Placeable.PlacementScope) obj);
            return I.f8786a;
        }

        public final void invoke(Placeable.PlacementScope layout) {
            AbstractC3292y.i(layout, "$this$layout");
            List<Placeable> list = this.$tabPlaceables;
            int i8 = this.$tabWidth;
            int i9 = 0;
            for (Object obj : list) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    AbstractC1435t.w();
                }
                Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, i9 * i8, 0, 0.0f, 4, null);
                i9 = i10;
            }
            List<Measurable> subcompose = this.$this_SubcomposeLayout.subcompose(TabSlots.Divider, this.$divider);
            long j8 = this.$constraints;
            int i11 = this.$tabRowHeight;
            Iterator<T> it = subcompose.iterator();
            while (it.hasNext()) {
                Placeable mo4108measureBRTryo0 = ((Measurable) it.next()).mo4108measureBRTryo0(Constraints.m5114copyZbe2FdA$default(j8, 0, 0, 0, 0, 11, null));
                Placeable.PlacementScope.placeRelative$default(layout, mo4108measureBRTryo0, 0, i11 - mo4108measureBRTryo0.getHeight(), 0.0f, 4, null);
                i11 = i11;
                j8 = j8;
            }
            List<Measurable> subcompose2 = this.$this_SubcomposeLayout.subcompose(TabSlots.Indicator, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new AnonymousClass3(this.$indicator, this.$tabPositions, this.$$dirty)));
            int i12 = this.$tabRowWidth;
            int i13 = this.$tabRowHeight;
            Iterator<T> it2 = subcompose2.iterator();
            while (it2.hasNext()) {
                Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo4108measureBRTryo0(Constraints.Companion.m5131fixedJhjzzOo(i12, i13)), 0, 0, 0.0f, 4, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabRow$2$1$1(InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, InterfaceC2073o interfaceC2073o, int i8) {
        super(2);
        this.$tabs = interfaceC2072n;
        this.$divider = interfaceC2072n2;
        this.$indicator = interfaceC2073o;
        this.$$dirty = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1363invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m5129unboximpl());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final MeasureResult m1363invoke0kLqBqw(SubcomposeMeasureScope SubcomposeLayout, long j8) {
        Object next;
        int i8;
        AbstractC3292y.i(SubcomposeLayout, "$this$SubcomposeLayout");
        int m5123getMaxWidthimpl = Constraints.m5123getMaxWidthimpl(j8);
        List<Measurable> subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, this.$tabs);
        int size = subcompose.size();
        int i9 = m5123getMaxWidthimpl / size;
        List<Measurable> list = subcompose;
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Measurable) it.next()).mo4108measureBRTryo0(Constraints.m5114copyZbe2FdA$default(j8, i9, i9, 0, 0, 12, null)));
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            if (it2.hasNext()) {
                int height = ((Placeable) next).getHeight();
                do {
                    Object next2 = it2.next();
                    int height2 = ((Placeable) next2).getHeight();
                    if (height < height2) {
                        next = next2;
                        height = height2;
                    }
                } while (it2.hasNext());
            }
        }
        Placeable placeable = (Placeable) next;
        if (placeable != null) {
            i8 = placeable.getHeight();
        } else {
            i8 = 0;
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(new TabPosition(Dp.m5155constructorimpl(SubcomposeLayout.mo422toDpu2uoSUM(i9) * i10), SubcomposeLayout.mo422toDpu2uoSUM(i9), null));
        }
        return MeasureScope.CC.q(SubcomposeLayout, m5123getMaxWidthimpl, i8, null, new AnonymousClass1(arrayList, SubcomposeLayout, this.$divider, i9, j8, i8, this.$indicator, arrayList2, this.$$dirty, m5123getMaxWidthimpl), 4, null);
    }
}
