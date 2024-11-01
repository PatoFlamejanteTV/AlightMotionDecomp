package androidx.compose.ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ComposeDragShadowBuilder extends View.DragShadowBuilder {
    public static final int $stable = 0;
    private final long decorationSize;
    private final Density density;
    private final Function1 drawDragDecoration;

    public /* synthetic */ ComposeDragShadowBuilder(Density density, long j8, Function1 function1, AbstractC3284p abstractC3284p) {
        this(density, j8, function1);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(Canvas canvas) {
        CanvasDrawScope canvasDrawScope = new CanvasDrawScope();
        Density density = this.density;
        long j8 = this.decorationSize;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        androidx.compose.ui.graphics.Canvas Canvas = AndroidCanvas_androidKt.Canvas(canvas);
        Function1 function1 = this.drawDragDecoration;
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        androidx.compose.ui.graphics.Canvas component3 = drawParams.component3();
        long m3393component4NHjbRc = drawParams.m3393component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(Canvas);
        drawParams2.m3396setSizeuvyYCjk(j8);
        Canvas.save();
        function1.invoke(canvasDrawScope);
        Canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m3396setSizeuvyYCjk(m3393component4NHjbRc);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(Point point, Point point2) {
        Density density = this.density;
        point.set(density.mo419roundToPx0680j_4(density.mo421toDpu2uoSUM(Size.m2781getWidthimpl(this.decorationSize))), density.mo419roundToPx0680j_4(density.mo421toDpu2uoSUM(Size.m2778getHeightimpl(this.decorationSize))));
        point2.set(point.x / 2, point.y / 2);
    }

    private ComposeDragShadowBuilder(Density density, long j8, Function1 function1) {
        this.density = density;
        this.decorationSize = j8;
        this.drawDragDecoration = function1;
    }
}
