package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class CacheDrawScope implements Density {
    public static final int $stable = 0;
    private BuildDrawCacheParams cacheParams = EmptyBuildDrawCacheParams.INSTANCE;
    private DrawResult drawResult;

    public final BuildDrawCacheParams getCacheParams$ui_release() {
        return this.cacheParams;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.cacheParams.getDensity().getDensity();
    }

    public final DrawResult getDrawResult$ui_release() {
        return this.drawResult;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.cacheParams.getDensity().getFontScale();
    }

    public final LayoutDirection getLayoutDirection() {
        return this.cacheParams.getLayoutDirection();
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m2616getSizeNHjbRc() {
        return this.cacheParams.mo2614getSizeNHjbRc();
    }

    public final DrawResult onDrawBehind(Function1 function1) {
        return onDrawWithContent(new CacheDrawScope$onDrawBehind$1(function1));
    }

    public final DrawResult onDrawWithContent(Function1 function1) {
        DrawResult drawResult = new DrawResult(function1);
        this.drawResult = drawResult;
        return drawResult;
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo418roundToPxR2X_6o(long j8) {
        return androidx.compose.ui.unit.a.a(this, j8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo419roundToPx0680j_4(float f8) {
        return androidx.compose.ui.unit.a.b(this, f8);
    }

    public final void setCacheParams$ui_release(BuildDrawCacheParams buildDrawCacheParams) {
        this.cacheParams = buildDrawCacheParams;
    }

    public final void setDrawResult$ui_release(DrawResult drawResult) {
        this.drawResult = drawResult;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public /* synthetic */ float mo420toDpGaN1DYA(long j8) {
        return androidx.compose.ui.unit.b.a(this, j8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo421toDpu2uoSUM(float f8) {
        return androidx.compose.ui.unit.a.c(this, f8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo423toDpSizekrfVVM(long j8) {
        return androidx.compose.ui.unit.a.e(this, j8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo424toPxR2X_6o(long j8) {
        return androidx.compose.ui.unit.a.f(this, j8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo425toPx0680j_4(float f8) {
        return androidx.compose.ui.unit.a.g(this, f8);
    }

    @Override // androidx.compose.ui.unit.Density
    public /* synthetic */ Rect toRect(DpRect dpRect) {
        return androidx.compose.ui.unit.a.h(this, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo426toSizeXkaWNTQ(long j8) {
        return androidx.compose.ui.unit.a.i(this, j8);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public /* synthetic */ long mo427toSp0xMU5do(float f8) {
        return androidx.compose.ui.unit.b.b(this, f8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo428toSpkPz2Gy4(float f8) {
        return androidx.compose.ui.unit.a.j(this, f8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo422toDpu2uoSUM(int i8) {
        return androidx.compose.ui.unit.a.d(this, i8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo429toSpkPz2Gy4(int i8) {
        return androidx.compose.ui.unit.a.k(this, i8);
    }
}
