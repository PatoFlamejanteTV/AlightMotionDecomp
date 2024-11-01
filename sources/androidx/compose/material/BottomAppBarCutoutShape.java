package androidx.compose.material;

import Q5.r;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BottomAppBarCutoutShape implements Shape {
    private final Shape cutoutShape;
    private final FabPlacement fabPlacement;

    public BottomAppBarCutoutShape(Shape cutoutShape, FabPlacement fabPlacement) {
        AbstractC3292y.i(cutoutShape, "cutoutShape");
        AbstractC3292y.i(fabPlacement, "fabPlacement");
        this.cutoutShape = cutoutShape;
        this.fabPlacement = fabPlacement;
    }

    private final void addCutoutShape(Path path, LayoutDirection layoutDirection, Density density) {
        float f8;
        float f9;
        f8 = AppBarKt.BottomAppBarCutoutOffset;
        float mo425toPx0680j_4 = density.mo425toPx0680j_4(f8);
        float f10 = 2 * mo425toPx0680j_4;
        long Size = SizeKt.Size(this.fabPlacement.getWidth() + f10, this.fabPlacement.getHeight() + f10);
        float left = this.fabPlacement.getLeft() - mo425toPx0680j_4;
        float m2781getWidthimpl = left + Size.m2781getWidthimpl(Size);
        float m2778getHeightimpl = Size.m2778getHeightimpl(Size) / 2.0f;
        OutlineKt.addOutline(path, this.cutoutShape.mo308createOutlinePq9zytI(Size, layoutDirection, density));
        path.mo2849translatek4lQ0M(OffsetKt.Offset(left, -m2778getHeightimpl));
        if (AbstractC3292y.d(this.cutoutShape, RoundedCornerShapeKt.getCircleShape())) {
            f9 = AppBarKt.BottomAppBarRoundedEdgeRadius;
            addRoundedEdges(path, left, m2781getWidthimpl, m2778getHeightimpl, density.mo425toPx0680j_4(f9), 0.0f);
        }
    }

    private final void addRoundedEdges(Path path, float f8, float f9, float f10, float f11, float f12) {
        float f13 = -((float) Math.sqrt((f10 * f10) - (f12 * f12)));
        float f14 = f10 + f13;
        float f15 = f8 + f14;
        float f16 = f9 - f14;
        r calculateRoundedEdgeIntercept = AppBarKt.calculateRoundedEdgeIntercept(f13 - 1.0f, f12, f10);
        float floatValue = ((Number) calculateRoundedEdgeIntercept.a()).floatValue() + f10;
        float floatValue2 = ((Number) calculateRoundedEdgeIntercept.b()).floatValue() - f12;
        path.moveTo(f15 - f11, 0.0f);
        path.quadraticBezierTo(f15 - 1.0f, 0.0f, f8 + floatValue, floatValue2);
        path.lineTo(f9 - floatValue, floatValue2);
        path.quadraticBezierTo(f16 + 1.0f, 0.0f, f11 + f16, 0.0f);
        path.close();
    }

    public static /* synthetic */ BottomAppBarCutoutShape copy$default(BottomAppBarCutoutShape bottomAppBarCutoutShape, Shape shape, FabPlacement fabPlacement, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            shape = bottomAppBarCutoutShape.cutoutShape;
        }
        if ((i8 & 2) != 0) {
            fabPlacement = bottomAppBarCutoutShape.fabPlacement;
        }
        return bottomAppBarCutoutShape.copy(shape, fabPlacement);
    }

    public final Shape component1() {
        return this.cutoutShape;
    }

    public final FabPlacement component2() {
        return this.fabPlacement;
    }

    public final BottomAppBarCutoutShape copy(Shape cutoutShape, FabPlacement fabPlacement) {
        AbstractC3292y.i(cutoutShape, "cutoutShape");
        AbstractC3292y.i(fabPlacement, "fabPlacement");
        return new BottomAppBarCutoutShape(cutoutShape, fabPlacement);
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo308createOutlinePq9zytI(long j8, LayoutDirection layoutDirection, Density density) {
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        AbstractC3292y.i(density, "density");
        Path Path = AndroidPath_androidKt.Path();
        Path.addRect(new Rect(0.0f, 0.0f, Size.m2781getWidthimpl(j8), Size.m2778getHeightimpl(j8)));
        Path Path2 = AndroidPath_androidKt.Path();
        addCutoutShape(Path2, layoutDirection, density);
        Path2.mo2846opN5in7k0(Path, Path2, PathOperation.Companion.m3217getDifferenceb3I0S0c());
        return new Outline.Generic(Path2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomAppBarCutoutShape)) {
            return false;
        }
        BottomAppBarCutoutShape bottomAppBarCutoutShape = (BottomAppBarCutoutShape) obj;
        return AbstractC3292y.d(this.cutoutShape, bottomAppBarCutoutShape.cutoutShape) && AbstractC3292y.d(this.fabPlacement, bottomAppBarCutoutShape.fabPlacement);
    }

    public final Shape getCutoutShape() {
        return this.cutoutShape;
    }

    public final FabPlacement getFabPlacement() {
        return this.fabPlacement;
    }

    public int hashCode() {
        return (this.cutoutShape.hashCode() * 31) + this.fabPlacement.hashCode();
    }

    public String toString() {
        return "BottomAppBarCutoutShape(cutoutShape=" + this.cutoutShape + ", fabPlacement=" + this.fabPlacement + ')';
    }
}
