package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class CutCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutCornerShape(CornerSize topStart, CornerSize topEnd, CornerSize bottomEnd, CornerSize bottomStart) {
        super(topStart, topEnd, bottomEnd, bottomStart);
        AbstractC3292y.i(topStart, "topStart");
        AbstractC3292y.i(topEnd, "topEnd");
        AbstractC3292y.i(bottomEnd, "bottomEnd");
        AbstractC3292y.i(bottomStart, "bottomStart");
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* renamed from: createOutline-LjSzlW0 */
    public Outline mo812createOutlineLjSzlW0(long j8, float f8, float f9, float f10, float f11, LayoutDirection layoutDirection) {
        float f12;
        float f13;
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        if (f8 + f9 + f11 + f10 == 0.0f) {
            return new Outline.Rectangle(SizeKt.m2802toRectuvyYCjk(j8));
        }
        Path Path = AndroidPath_androidKt.Path();
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        if (layoutDirection == layoutDirection2) {
            f12 = f8;
        } else {
            f12 = f9;
        }
        Path.moveTo(0.0f, f12);
        Path.lineTo(f12, 0.0f);
        if (layoutDirection == layoutDirection2) {
            f8 = f9;
        }
        Path.lineTo(Size.m2781getWidthimpl(j8) - f8, 0.0f);
        Path.lineTo(Size.m2781getWidthimpl(j8), f8);
        if (layoutDirection == layoutDirection2) {
            f13 = f10;
        } else {
            f13 = f11;
        }
        Path.lineTo(Size.m2781getWidthimpl(j8), Size.m2778getHeightimpl(j8) - f13);
        Path.lineTo(Size.m2781getWidthimpl(j8) - f13, Size.m2778getHeightimpl(j8));
        if (layoutDirection == layoutDirection2) {
            f10 = f11;
        }
        Path.lineTo(f10, Size.m2778getHeightimpl(j8));
        Path.lineTo(0.0f, Size.m2778getHeightimpl(j8) - f10);
        Path.close();
        return new Outline.Generic(Path);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutCornerShape)) {
            return false;
        }
        CutCornerShape cutCornerShape = (CutCornerShape) obj;
        if (AbstractC3292y.d(getTopStart(), cutCornerShape.getTopStart()) && AbstractC3292y.d(getTopEnd(), cutCornerShape.getTopEnd()) && AbstractC3292y.d(getBottomEnd(), cutCornerShape.getBottomEnd()) && AbstractC3292y.d(getBottomStart(), cutCornerShape.getBottomStart())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    public String toString() {
        return "CutCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public CutCornerShape copy(CornerSize topStart, CornerSize topEnd, CornerSize bottomEnd, CornerSize bottomStart) {
        AbstractC3292y.i(topStart, "topStart");
        AbstractC3292y.i(topEnd, "topEnd");
        AbstractC3292y.i(bottomEnd, "bottomEnd");
        AbstractC3292y.i(bottomStart, "bottomStart");
        return new CutCornerShape(topStart, topEnd, bottomEnd, bottomStart);
    }
}
