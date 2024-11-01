package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.c;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class BrushPainter extends Painter {
    private float alpha = 1.0f;
    private final Brush brush;
    private ColorFilter colorFilter;

    public BrushPainter(Brush brush) {
        this.brush = brush;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float f8) {
        this.alpha = f8;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BrushPainter) && AbstractC3292y.d(this.brush, ((BrushPainter) obj).brush)) {
            return true;
        }
        return false;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo3485getIntrinsicSizeNHjbRc() {
        return this.brush.mo2902getIntrinsicSizeNHjbRc();
    }

    public int hashCode() {
        return this.brush.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        c.J(drawScope, this.brush, 0L, 0L, this.alpha, null, this.colorFilter, 0, 86, null);
    }

    public String toString() {
        return "BrushPainter(brush=" + this.brush + ')';
    }
}
