package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DensityWithConverter implements Density {
    private final FontScaleConverter converter;
    private final float density;
    private final float fontScale;

    public DensityWithConverter(float f8, float f9, FontScaleConverter fontScaleConverter) {
        this.density = f8;
        this.fontScale = f9;
        this.converter = fontScaleConverter;
    }

    private final FontScaleConverter component3() {
        return this.converter;
    }

    public static /* synthetic */ DensityWithConverter copy$default(DensityWithConverter densityWithConverter, float f8, float f9, FontScaleConverter fontScaleConverter, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = densityWithConverter.density;
        }
        if ((i8 & 2) != 0) {
            f9 = densityWithConverter.fontScale;
        }
        if ((i8 & 4) != 0) {
            fontScaleConverter = densityWithConverter.converter;
        }
        return densityWithConverter.copy(f8, f9, fontScaleConverter);
    }

    public final float component1() {
        return this.density;
    }

    public final float component2() {
        return this.fontScale;
    }

    public final DensityWithConverter copy(float f8, float f9, FontScaleConverter fontScaleConverter) {
        return new DensityWithConverter(f8, f9, fontScaleConverter);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DensityWithConverter)) {
            return false;
        }
        DensityWithConverter densityWithConverter = (DensityWithConverter) obj;
        return Float.compare(this.density, densityWithConverter.density) == 0 && Float.compare(this.fontScale, densityWithConverter.fontScale) == 0 && AbstractC3292y.d(this.converter, densityWithConverter.converter);
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.fontScale;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.density) * 31) + Float.floatToIntBits(this.fontScale)) * 31) + this.converter.hashCode();
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo418roundToPxR2X_6o(long j8) {
        return a.a(this, j8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo419roundToPx0680j_4(float f8) {
        return a.b(this, f8);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo420toDpGaN1DYA(long j8) {
        if (TextUnitType.m5370equalsimpl0(TextUnit.m5341getTypeUIouoOA(j8), TextUnitType.Companion.m5375getSpUIouoOA())) {
            return Dp.m5155constructorimpl(this.converter.convertSpToDp(TextUnit.m5342getValueimpl(j8)));
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo421toDpu2uoSUM(float f8) {
        return a.c(this, f8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo423toDpSizekrfVVM(long j8) {
        return a.e(this, j8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo424toPxR2X_6o(long j8) {
        return a.f(this, j8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo425toPx0680j_4(float f8) {
        return a.g(this, f8);
    }

    @Override // androidx.compose.ui.unit.Density
    public /* synthetic */ Rect toRect(DpRect dpRect) {
        return a.h(this, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo426toSizeXkaWNTQ(long j8) {
        return a.i(this, j8);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo427toSp0xMU5do(float f8) {
        return TextUnitKt.getSp(this.converter.convertDpToSp(f8));
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo428toSpkPz2Gy4(float f8) {
        return a.j(this, f8);
    }

    public String toString() {
        return "DensityWithConverter(density=" + this.density + ", fontScale=" + this.fontScale + ", converter=" + this.converter + ')';
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo422toDpu2uoSUM(int i8) {
        return a.d(this, i8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo429toSpkPz2Gy4(int i8) {
        return a.k(this, i8);
    }
}
