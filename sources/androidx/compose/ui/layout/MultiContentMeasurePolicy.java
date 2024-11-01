package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import java.util.List;

@Stable
/* loaded from: classes.dex */
public interface MultiContentMeasurePolicy {
    int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i8);

    int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i8);

    /* renamed from: measure-3p2s80s, reason: not valid java name */
    MeasureResult m4138measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j8);

    int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i8);

    int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i8);
}
