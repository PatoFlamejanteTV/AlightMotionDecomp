package androidx.compose.animation;

import R5.AbstractC1435t;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k6.AbstractC3258j;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class AnimatedEnterExitMeasurePolicy implements MeasurePolicy {
    private final AnimatedVisibilityScopeImpl scope;

    public AnimatedEnterExitMeasurePolicy(AnimatedVisibilityScopeImpl scope) {
        AbstractC3292y.i(scope, "scope");
        this.scope = scope;
    }

    public final AnimatedVisibilityScopeImpl getScope() {
        return this.scope;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurables, "measurables");
        Integer num = (Integer) AbstractC3258j.A(AbstractC3258j.y(AbstractC1435t.c0(measurables), new AnimatedEnterExitMeasurePolicy$maxIntrinsicHeight$1(i8)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurables, "measurables");
        Integer num = (Integer) AbstractC3258j.A(AbstractC3258j.y(AbstractC1435t.c0(measurables), new AnimatedEnterExitMeasurePolicy$maxIntrinsicWidth$1(i8)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v22 */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo109measure3p2s80s(MeasureScope measure, List<? extends Measurable> measurables, long j8) {
        Object obj;
        int i8;
        int i9;
        AbstractC3292y.i(measure, "$this$measure");
        AbstractC3292y.i(measurables, "measurables");
        List<? extends Measurable> list = measurables;
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Measurable) it.next()).mo4108measureBRTryo0(j8));
        }
        Placeable placeable = null;
        int i10 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int width = ((Placeable) obj).getWidth();
            int o8 = AbstractC1435t.o(arrayList);
            if (1 <= o8) {
                int i11 = 1;
                while (true) {
                    Object obj2 = arrayList.get(i11);
                    int width2 = ((Placeable) obj2).getWidth();
                    if (width < width2) {
                        obj = obj2;
                        width = width2;
                    }
                    if (i11 == o8) {
                        break;
                    }
                    i11++;
                }
            }
        }
        Placeable placeable2 = (Placeable) obj;
        if (placeable2 != null) {
            i8 = placeable2.getWidth();
        } else {
            i8 = 0;
        }
        if (!arrayList.isEmpty()) {
            ?? r11 = arrayList.get(0);
            int height = ((Placeable) r11).getHeight();
            int o9 = AbstractC1435t.o(arrayList);
            boolean z8 = r11;
            if (1 <= o9) {
                while (true) {
                    Object obj3 = arrayList.get(i10);
                    int height2 = ((Placeable) obj3).getHeight();
                    r11 = z8;
                    if (height < height2) {
                        r11 = obj3;
                        height = height2;
                    }
                    if (i10 == o9) {
                        break;
                    }
                    i10++;
                    z8 = r11;
                }
            }
            placeable = r11;
        }
        Placeable placeable3 = placeable;
        if (placeable3 != null) {
            i9 = placeable3.getHeight();
        } else {
            i9 = 0;
        }
        this.scope.getTargetSize$animation_release().setValue(IntSize.m5313boximpl(IntSizeKt.IntSize(i8, i9)));
        return MeasureScope.CC.q(measure, i8, i9, null, new AnimatedEnterExitMeasurePolicy$measure$1(arrayList), 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurables, "measurables");
        Integer num = (Integer) AbstractC3258j.A(AbstractC3258j.y(AbstractC1435t.c0(measurables), new AnimatedEnterExitMeasurePolicy$minIntrinsicHeight$1(i8)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurables, "measurables");
        Integer num = (Integer) AbstractC3258j.A(AbstractC3258j.y(AbstractC1435t.c0(measurables), new AnimatedEnterExitMeasurePolicy$minIntrinsicWidth$1(i8)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
