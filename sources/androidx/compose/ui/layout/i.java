package androidx.compose.ui.layout;

import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static int a(MultiContentMeasurePolicy multiContentMeasurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            List list2 = (List) list.get(i9);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                arrayList2.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list2.get(i10), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
            }
            arrayList.add(arrayList2);
        }
        return multiContentMeasurePolicy.m4138measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i8, 0, 0, 13, null)).getHeight();
    }

    public static int b(MultiContentMeasurePolicy multiContentMeasurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            List list2 = (List) list.get(i9);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                arrayList2.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list2.get(i10), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
            }
            arrayList.add(arrayList2);
        }
        return multiContentMeasurePolicy.m4138measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i8, 7, null)).getWidth();
    }

    public static int c(MultiContentMeasurePolicy multiContentMeasurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            List list2 = (List) list.get(i9);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                arrayList2.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list2.get(i10), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
            }
            arrayList.add(arrayList2);
        }
        return multiContentMeasurePolicy.m4138measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i8, 0, 0, 13, null)).getHeight();
    }

    public static int d(MultiContentMeasurePolicy multiContentMeasurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            List list2 = (List) list.get(i9);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                arrayList2.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list2.get(i10), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
            }
            arrayList.add(arrayList2);
        }
        return multiContentMeasurePolicy.m4138measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i8, 7, null)).getWidth();
    }
}
