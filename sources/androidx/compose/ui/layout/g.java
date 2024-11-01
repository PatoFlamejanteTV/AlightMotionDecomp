package androidx.compose.ui.layout;

import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract /* synthetic */ class g {
    public static int a(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i9), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return measurePolicy.mo109measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i8, 0, 0, 13, null)).getHeight();
    }

    public static int b(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i9), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return measurePolicy.mo109measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i8, 7, null)).getWidth();
    }

    public static int c(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i9), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return measurePolicy.mo109measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i8, 0, 0, 13, null)).getHeight();
    }

    public static int d(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i9), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return measurePolicy.mo109measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i8, 7, null)).getWidth();
    }
}
