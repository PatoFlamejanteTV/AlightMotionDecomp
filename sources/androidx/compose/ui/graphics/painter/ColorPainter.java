package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.c;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class ColorPainter extends Painter {
    private float alpha;
    private final long color;
    private ColorFilter colorFilter;
    private final long intrinsicSize;

    public /* synthetic */ ColorPainter(long j8, AbstractC3284p abstractC3284p) {
        this(j8);
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
        if ((obj instanceof ColorPainter) && Color.m2949equalsimpl0(this.color, ((ColorPainter) obj).color)) {
            return true;
        }
        return false;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m3489getColor0d7_KjU() {
        return this.color;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo3485getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    public int hashCode() {
        return Color.m2955hashCodeimpl(this.color);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        c.K(drawScope, this.color, 0L, 0L, this.alpha, null, this.colorFilter, 0, 86, null);
    }

    public String toString() {
        return "ColorPainter(color=" + ((Object) Color.m2956toStringimpl(this.color)) + ')';
    }

    private ColorPainter(long j8) {
        this.color = j8;
        this.alpha = 1.0f;
        this.intrinsicSize = Size.Companion.m2789getUnspecifiedNHjbRc();
    }
}
