package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class BorderModifierNode extends DelegatingNode {
    private BorderCache borderCache;
    private Brush brush;
    private final CacheDrawModifierNode drawWithCacheModifierNode;
    private Shape shape;
    private float width;

    public /* synthetic */ BorderModifierNode(float f8, Brush brush, Shape shape, AbstractC3284p abstractC3284p) {
        this(f8, brush, shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d8, code lost:            if (androidx.compose.ui.graphics.ImageBitmapConfig.m3143equalsimpl(r14, r4) != false) goto L26;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.draw.DrawResult drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope r46, androidx.compose.ui.graphics.Brush r47, androidx.compose.ui.graphics.Outline.Generic r48, boolean r49, float r50) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderModifierNode.drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.graphics.Brush, androidx.compose.ui.graphics.Outline$Generic, boolean, float):androidx.compose.ui.draw.DrawResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRoundRectBorder-JqoCqck, reason: not valid java name */
    public final DrawResult m276drawRoundRectBorderJqoCqck(CacheDrawScope cacheDrawScope, Brush brush, Outline.Rounded rounded, long j8, long j9, boolean z8, float f8) {
        Path createRoundRectPath;
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            return cacheDrawScope.onDrawWithContent(new BorderModifierNode$drawRoundRectBorder$1(z8, brush, rounded.getRoundRect().m2762getTopLeftCornerRadiuskKHJgLs(), f8 / 2, f8, j8, j9, new Stroke(f8, 0.0f, 0, 0, null, 30, null)));
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        AbstractC3292y.f(borderCache);
        createRoundRectPath = BorderKt.createRoundRectPath(borderCache.obtainPath(), rounded.getRoundRect(), f8, z8);
        return cacheDrawScope.onDrawWithContent(new BorderModifierNode$drawRoundRectBorder$2(createRoundRectPath, brush));
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m277getWidthD9Ej5fM() {
        return this.width;
    }

    public final void setBrush(Brush value) {
        AbstractC3292y.i(value, "value");
        if (!AbstractC3292y.d(this.brush, value)) {
            this.brush = value;
            this.drawWithCacheModifierNode.invalidateDrawCache();
        }
    }

    public final void setShape(Shape value) {
        AbstractC3292y.i(value, "value");
        if (!AbstractC3292y.d(this.shape, value)) {
            this.shape = value;
            this.drawWithCacheModifierNode.invalidateDrawCache();
        }
    }

    /* renamed from: setWidth-0680j_4, reason: not valid java name */
    public final void m278setWidth0680j_4(float f8) {
        if (!Dp.m5160equalsimpl0(this.width, f8)) {
            this.width = f8;
            this.drawWithCacheModifierNode.invalidateDrawCache();
        }
    }

    private BorderModifierNode(float f8, Brush brushParameter, Shape shapeParameter) {
        AbstractC3292y.i(brushParameter, "brushParameter");
        AbstractC3292y.i(shapeParameter, "shapeParameter");
        this.width = f8;
        this.brush = brushParameter;
        this.shape = shapeParameter;
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new BorderModifierNode$drawWithCacheModifierNode$1(this)));
    }
}
