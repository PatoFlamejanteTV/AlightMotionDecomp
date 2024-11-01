package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface LazyLayoutMeasureScope extends MeasureScope {
    /* renamed from: measure-0kLqBqw, reason: not valid java name */
    List<Placeable> mo733measure0kLqBqw(int i8, long j8);

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    float mo420toDpGaN1DYA(long j8);

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    float mo421toDpu2uoSUM(float f8);

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    float mo422toDpu2uoSUM(int i8);

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    long mo423toDpSizekrfVVM(long j8);

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    long mo426toSizeXkaWNTQ(long j8);

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    long mo427toSp0xMU5do(float f8);

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    long mo428toSpkPz2Gy4(float f8);

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    long mo429toSpkPz2Gy4(int i8);
}
