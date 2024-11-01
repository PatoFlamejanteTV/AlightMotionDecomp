package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import java.util.List;

@Stable
/* loaded from: classes.dex */
public interface MeasurePolicy {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static int maxIntrinsicHeight(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i8) {
            int a9;
            a9 = g.a(measurePolicy, intrinsicMeasureScope, list, i8);
            return a9;
        }

        @Deprecated
        public static int maxIntrinsicWidth(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i8) {
            int b9;
            b9 = g.b(measurePolicy, intrinsicMeasureScope, list, i8);
            return b9;
        }

        @Deprecated
        public static int minIntrinsicHeight(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i8) {
            int c8;
            c8 = g.c(measurePolicy, intrinsicMeasureScope, list, i8);
            return c8;
        }

        @Deprecated
        public static int minIntrinsicWidth(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i8) {
            int d8;
            d8 = g.d(measurePolicy, intrinsicMeasureScope, list, i8);
            return d8;
        }
    }

    int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i8);

    int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i8);

    /* renamed from: measure-3p2s80s */
    MeasureResult mo109measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j8);

    int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i8);

    int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i8);
}
