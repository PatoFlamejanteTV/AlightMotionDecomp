package androidx.compose.material.internal;

import R5.AbstractC1435t;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ExposedDropdownMenuPopupKt$SimpleStack$1 implements MeasurePolicy {
    public static final ExposedDropdownMenuPopupKt$SimpleStack$1 INSTANCE = new ExposedDropdownMenuPopupKt$SimpleStack$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        return g.a(this, intrinsicMeasureScope, list, i8);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        return g.b(this, intrinsicMeasureScope, list, i8);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo109measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j8) {
        int i8;
        int i9;
        AbstractC3292y.i(Layout, "$this$Layout");
        AbstractC3292y.i(measurables, "measurables");
        int size = measurables.size();
        if (size != 0) {
            int i10 = 0;
            if (size != 1) {
                ArrayList arrayList = new ArrayList(measurables.size());
                int size2 = measurables.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    arrayList.add(measurables.get(i11).mo4108measureBRTryo0(j8));
                }
                int o8 = AbstractC1435t.o(arrayList);
                if (o8 >= 0) {
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        Placeable placeable = (Placeable) arrayList.get(i10);
                        i12 = Math.max(i12, placeable.getWidth());
                        i13 = Math.max(i13, placeable.getHeight());
                        if (i10 == o8) {
                            break;
                        }
                        i10++;
                    }
                    i8 = i12;
                    i9 = i13;
                } else {
                    i8 = 0;
                    i9 = 0;
                }
                return MeasureScope.CC.q(Layout, i8, i9, null, new ExposedDropdownMenuPopupKt$SimpleStack$1$measure$3(arrayList), 4, null);
            }
            Placeable mo4108measureBRTryo0 = measurables.get(0).mo4108measureBRTryo0(j8);
            return MeasureScope.CC.q(Layout, mo4108measureBRTryo0.getWidth(), mo4108measureBRTryo0.getHeight(), null, new ExposedDropdownMenuPopupKt$SimpleStack$1$measure$2(mo4108measureBRTryo0), 4, null);
        }
        return MeasureScope.CC.q(Layout, 0, 0, null, ExposedDropdownMenuPopupKt$SimpleStack$1$measure$1.INSTANCE, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        return g.c(this, intrinsicMeasureScope, list, i8);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
        return g.d(this, intrinsicMeasureScope, list, i8);
    }
}
