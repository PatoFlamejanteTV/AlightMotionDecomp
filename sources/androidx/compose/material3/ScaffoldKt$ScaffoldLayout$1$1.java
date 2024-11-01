package androidx.compose.material3;

import Q5.I;
import R5.AbstractC1435t;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
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
public final class ScaffoldKt$ScaffoldLayout$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC2072n $bottomBar;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ InterfaceC2072n $fab;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ InterfaceC2072n $snackbar;
    final /* synthetic */ InterfaceC2072n $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ InterfaceC2072n $bottomBar;
        final /* synthetic */ InterfaceC2073o $content;
        final /* synthetic */ WindowInsets $contentWindowInsets;
        final /* synthetic */ InterfaceC2072n $fab;
        final /* synthetic */ int $fabPosition;
        final /* synthetic */ int $layoutHeight;
        final /* synthetic */ int $layoutWidth;
        final /* synthetic */ long $looseConstraints;
        final /* synthetic */ InterfaceC2072n $snackbar;
        final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;
        final /* synthetic */ InterfaceC2072n $topBar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SubcomposeMeasureScope subcomposeMeasureScope, InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, int i8, int i9, WindowInsets windowInsets, long j8, InterfaceC2072n interfaceC2072n4, int i10, InterfaceC2073o interfaceC2073o, int i11) {
            super(1);
            this.$this_SubcomposeLayout = subcomposeMeasureScope;
            this.$topBar = interfaceC2072n;
            this.$snackbar = interfaceC2072n2;
            this.$fab = interfaceC2072n3;
            this.$fabPosition = i8;
            this.$layoutWidth = i9;
            this.$contentWindowInsets = windowInsets;
            this.$looseConstraints = j8;
            this.$bottomBar = interfaceC2072n4;
            this.$$dirty = i10;
            this.$content = interfaceC2073o;
            this.$layoutHeight = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Placeable.PlacementScope) obj);
            return I.f8786a;
        }

        public final void invoke(Placeable.PlacementScope layout) {
            Object next;
            Object next2;
            Object next3;
            FabPlacement fabPlacement;
            Object next4;
            Integer num;
            int i8;
            int intValue;
            float f8;
            int mo419roundToPx0680j_4;
            float f9;
            Object next5;
            Object next6;
            int i9;
            float f10;
            float f11;
            AbstractC3292y.i(layout, "$this$layout");
            List<Measurable> subcompose = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.TopBar, this.$topBar);
            long j8 = this.$looseConstraints;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(subcompose, 10));
            Iterator<T> it = subcompose.iterator();
            while (it.hasNext()) {
                arrayList.add(((Measurable) it.next()).mo4108measureBRTryo0(j8));
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int height = ((Placeable) next).getHeight();
                    do {
                        Object next7 = it2.next();
                        int height2 = ((Placeable) next7).getHeight();
                        if (height < height2) {
                            next = next7;
                            height = height2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            Placeable placeable = (Placeable) next;
            int height3 = placeable != null ? placeable.getHeight() : 0;
            List<Measurable> subcompose2 = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.Snackbar, this.$snackbar);
            WindowInsets windowInsets = this.$contentWindowInsets;
            SubcomposeMeasureScope subcomposeMeasureScope = this.$this_SubcomposeLayout;
            long j9 = this.$looseConstraints;
            ArrayList arrayList2 = new ArrayList(AbstractC1435t.x(subcompose2, 10));
            Iterator<T> it3 = subcompose2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((Measurable) it3.next()).mo4108measureBRTryo0(ConstraintsKt.m5139offsetNN6EwU(j9, (-windowInsets.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets.getBottom(subcomposeMeasureScope))));
            }
            Iterator it4 = arrayList2.iterator();
            if (it4.hasNext()) {
                next2 = it4.next();
                if (it4.hasNext()) {
                    int height4 = ((Placeable) next2).getHeight();
                    do {
                        Object next8 = it4.next();
                        int height5 = ((Placeable) next8).getHeight();
                        if (height4 < height5) {
                            next2 = next8;
                            height4 = height5;
                        }
                    } while (it4.hasNext());
                }
            } else {
                next2 = null;
            }
            Placeable placeable2 = (Placeable) next2;
            int height6 = placeable2 != null ? placeable2.getHeight() : 0;
            Iterator it5 = arrayList2.iterator();
            if (it5.hasNext()) {
                next3 = it5.next();
                if (it5.hasNext()) {
                    int width = ((Placeable) next3).getWidth();
                    do {
                        Object next9 = it5.next();
                        int width2 = ((Placeable) next9).getWidth();
                        if (width < width2) {
                            next3 = next9;
                            width = width2;
                        }
                    } while (it5.hasNext());
                }
            } else {
                next3 = null;
            }
            Placeable placeable3 = (Placeable) next3;
            int width3 = placeable3 != null ? placeable3.getWidth() : 0;
            List<Measurable> subcompose3 = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.Fab, this.$fab);
            WindowInsets windowInsets2 = this.$contentWindowInsets;
            SubcomposeMeasureScope subcomposeMeasureScope2 = this.$this_SubcomposeLayout;
            long j10 = this.$looseConstraints;
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it6 = subcompose3.iterator();
            while (it6.hasNext()) {
                Placeable mo4108measureBRTryo0 = ((Measurable) it6.next()).mo4108measureBRTryo0(ConstraintsKt.m5139offsetNN6EwU(j10, (-windowInsets2.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection())) - windowInsets2.getRight(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection()), -windowInsets2.getBottom(subcomposeMeasureScope2)));
                if (mo4108measureBRTryo0.getHeight() == 0 || mo4108measureBRTryo0.getWidth() == 0) {
                    mo4108measureBRTryo0 = null;
                }
                if (mo4108measureBRTryo0 != null) {
                    arrayList3.add(mo4108measureBRTryo0);
                }
            }
            if (!arrayList3.isEmpty()) {
                Iterator it7 = arrayList3.iterator();
                if (it7.hasNext()) {
                    next5 = it7.next();
                    if (it7.hasNext()) {
                        int width4 = ((Placeable) next5).getWidth();
                        do {
                            Object next10 = it7.next();
                            int width5 = ((Placeable) next10).getWidth();
                            if (width4 < width5) {
                                next5 = next10;
                                width4 = width5;
                            }
                        } while (it7.hasNext());
                    }
                } else {
                    next5 = null;
                }
                AbstractC3292y.f(next5);
                int width6 = ((Placeable) next5).getWidth();
                Iterator it8 = arrayList3.iterator();
                if (it8.hasNext()) {
                    next6 = it8.next();
                    if (it8.hasNext()) {
                        int height7 = ((Placeable) next6).getHeight();
                        do {
                            Object next11 = it8.next();
                            int height8 = ((Placeable) next11).getHeight();
                            if (height7 < height8) {
                                next6 = next11;
                                height7 = height8;
                            }
                        } while (it8.hasNext());
                    }
                } else {
                    next6 = null;
                }
                AbstractC3292y.f(next6);
                int height9 = ((Placeable) next6).getHeight();
                if (FabPosition.m1611equalsimpl0(this.$fabPosition, FabPosition.Companion.m1616getEndERTFSPs())) {
                    if (this.$this_SubcomposeLayout.getLayoutDirection() == LayoutDirection.Ltr) {
                        int i10 = this.$layoutWidth;
                        SubcomposeMeasureScope subcomposeMeasureScope3 = this.$this_SubcomposeLayout;
                        f11 = ScaffoldKt.FabSpacing;
                        i9 = (i10 - subcomposeMeasureScope3.mo419roundToPx0680j_4(f11)) - width6;
                    } else {
                        SubcomposeMeasureScope subcomposeMeasureScope4 = this.$this_SubcomposeLayout;
                        f10 = ScaffoldKt.FabSpacing;
                        i9 = subcomposeMeasureScope4.mo419roundToPx0680j_4(f10);
                    }
                } else {
                    i9 = (this.$layoutWidth - width6) / 2;
                }
                fabPlacement = new FabPlacement(i9, width6, height9);
            } else {
                fabPlacement = null;
            }
            List<Measurable> subcompose4 = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.BottomBar, ComposableLambdaKt.composableLambdaInstance(-1455477816, true, new ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1(fabPlacement, this.$bottomBar, this.$$dirty)));
            long j11 = this.$looseConstraints;
            ArrayList arrayList4 = new ArrayList(AbstractC1435t.x(subcompose4, 10));
            Iterator<T> it9 = subcompose4.iterator();
            while (it9.hasNext()) {
                arrayList4.add(((Measurable) it9.next()).mo4108measureBRTryo0(j11));
            }
            Iterator it10 = arrayList4.iterator();
            if (it10.hasNext()) {
                next4 = it10.next();
                if (it10.hasNext()) {
                    int height10 = ((Placeable) next4).getHeight();
                    do {
                        Object next12 = it10.next();
                        int height11 = ((Placeable) next12).getHeight();
                        if (height10 < height11) {
                            next4 = next12;
                            height10 = height11;
                        }
                    } while (it10.hasNext());
                }
            } else {
                next4 = null;
            }
            Placeable placeable4 = (Placeable) next4;
            Integer valueOf = placeable4 != null ? Integer.valueOf(placeable4.getHeight()) : null;
            if (fabPlacement != null) {
                SubcomposeMeasureScope subcomposeMeasureScope5 = this.$this_SubcomposeLayout;
                WindowInsets windowInsets3 = this.$contentWindowInsets;
                if (valueOf == null) {
                    int height12 = fabPlacement.getHeight();
                    f9 = ScaffoldKt.FabSpacing;
                    mo419roundToPx0680j_4 = height12 + subcomposeMeasureScope5.mo419roundToPx0680j_4(f9) + windowInsets3.getBottom(subcomposeMeasureScope5);
                } else {
                    int intValue2 = valueOf.intValue() + fabPlacement.getHeight();
                    f8 = ScaffoldKt.FabSpacing;
                    mo419roundToPx0680j_4 = intValue2 + subcomposeMeasureScope5.mo419roundToPx0680j_4(f8);
                }
                num = Integer.valueOf(mo419roundToPx0680j_4);
            } else {
                num = null;
            }
            if (height6 != 0) {
                if (num != null) {
                    intValue = num.intValue();
                } else {
                    intValue = valueOf != null ? valueOf.intValue() : this.$contentWindowInsets.getBottom(this.$this_SubcomposeLayout);
                }
                i8 = height6 + intValue;
            } else {
                i8 = 0;
            }
            SubcomposeMeasureScope subcomposeMeasureScope6 = this.$this_SubcomposeLayout;
            List<Measurable> subcompose5 = subcomposeMeasureScope6.subcompose(ScaffoldLayoutContent.MainContent, ComposableLambdaKt.composableLambdaInstance(1643221465, true, new ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1(this.$contentWindowInsets, subcomposeMeasureScope6, arrayList, height3, arrayList4, valueOf, this.$content, this.$$dirty)));
            long j12 = this.$looseConstraints;
            ArrayList arrayList5 = new ArrayList(AbstractC1435t.x(subcompose5, 10));
            Iterator<T> it11 = subcompose5.iterator();
            while (it11.hasNext()) {
                arrayList5.add(((Measurable) it11.next()).mo4108measureBRTryo0(j12));
            }
            Iterator it12 = arrayList5.iterator();
            while (it12.hasNext()) {
                Placeable.PlacementScope.place$default(layout, (Placeable) it12.next(), 0, 0, 0.0f, 4, null);
                arrayList3 = arrayList3;
                arrayList4 = arrayList4;
                arrayList = arrayList;
            }
            ArrayList arrayList6 = arrayList4;
            ArrayList<Placeable> arrayList7 = arrayList3;
            Iterator it13 = arrayList.iterator();
            while (it13.hasNext()) {
                Placeable.PlacementScope.place$default(layout, (Placeable) it13.next(), 0, 0, 0.0f, 4, null);
            }
            int i11 = this.$layoutWidth;
            WindowInsets windowInsets4 = this.$contentWindowInsets;
            SubcomposeMeasureScope subcomposeMeasureScope7 = this.$this_SubcomposeLayout;
            int i12 = this.$layoutHeight;
            Iterator it14 = arrayList2.iterator();
            while (it14.hasNext()) {
                Placeable.PlacementScope.place$default(layout, (Placeable) it14.next(), windowInsets4.getLeft(subcomposeMeasureScope7, subcomposeMeasureScope7.getLayoutDirection()) + ((i11 - width3) / 2), i12 - i8, 0.0f, 4, null);
            }
            int i13 = this.$layoutHeight;
            Iterator it15 = arrayList6.iterator();
            while (it15.hasNext()) {
                Placeable.PlacementScope.place$default(layout, (Placeable) it15.next(), 0, i13 - (valueOf != null ? valueOf.intValue() : 0), 0.0f, 4, null);
            }
            if (fabPlacement != null) {
                int i14 = this.$layoutHeight;
                for (Placeable placeable5 : arrayList7) {
                    int left = fabPlacement.getLeft();
                    AbstractC3292y.f(num);
                    Placeable.PlacementScope.place$default(layout, placeable5, left, i14 - num.intValue(), 0.0f, 4, null);
                }
                I i15 = I.f8786a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaffoldKt$ScaffoldLayout$1$1(InterfaceC2072n interfaceC2072n, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, int i8, WindowInsets windowInsets, InterfaceC2072n interfaceC2072n4, int i9, InterfaceC2073o interfaceC2073o) {
        super(2);
        this.$topBar = interfaceC2072n;
        this.$snackbar = interfaceC2072n2;
        this.$fab = interfaceC2072n3;
        this.$fabPosition = i8;
        this.$contentWindowInsets = windowInsets;
        this.$bottomBar = interfaceC2072n4;
        this.$$dirty = i9;
        this.$content = interfaceC2073o;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1733invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m5129unboximpl());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final MeasureResult m1733invoke0kLqBqw(SubcomposeMeasureScope SubcomposeLayout, long j8) {
        AbstractC3292y.i(SubcomposeLayout, "$this$SubcomposeLayout");
        int m5123getMaxWidthimpl = Constraints.m5123getMaxWidthimpl(j8);
        int m5122getMaxHeightimpl = Constraints.m5122getMaxHeightimpl(j8);
        return MeasureScope.CC.q(SubcomposeLayout, m5123getMaxWidthimpl, m5122getMaxHeightimpl, null, new AnonymousClass1(SubcomposeLayout, this.$topBar, this.$snackbar, this.$fab, this.$fabPosition, m5123getMaxWidthimpl, this.$contentWindowInsets, Constraints.m5114copyZbe2FdA$default(j8, 0, 0, 0, 0, 10, null), this.$bottomBar, this.$$dirty, this.$content, m5122getMaxHeightimpl), 4, null);
    }
}
