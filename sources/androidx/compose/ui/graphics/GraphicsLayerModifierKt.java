package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class GraphicsLayerModifierKt {
    @Stable
    public static final Modifier graphicsLayer(Modifier modifier, Function1 function1) {
        return modifier.then(new BlockGraphicsLayerElement(function1));
    }

    @Stable
    /* renamed from: graphicsLayer-2Xn7asI, reason: not valid java name */
    public static final /* synthetic */ Modifier m3105graphicsLayer2Xn7asI(Modifier modifier, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, long j8, Shape shape, boolean z8, RenderEffect renderEffect) {
        return m3107graphicsLayerAp8cVGQ(modifier, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, j8, shape, z8, renderEffect, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor(), CompositingStrategy.Companion.m3036getAutoNrFUSI());
    }

    /* renamed from: graphicsLayer-2Xn7asI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3106graphicsLayer2Xn7asI$default(Modifier modifier, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, long j8, Shape shape, boolean z8, RenderEffect renderEffect, int i8, Object obj) {
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        long j9;
        Shape shape2;
        boolean z9;
        RenderEffect renderEffect2;
        float f26 = 1.0f;
        if ((i8 & 1) != 0) {
            f18 = 1.0f;
        } else {
            f18 = f8;
        }
        if ((i8 & 2) != 0) {
            f19 = 1.0f;
        } else {
            f19 = f9;
        }
        if ((i8 & 4) == 0) {
            f26 = f10;
        }
        float f27 = 0.0f;
        if ((i8 & 8) != 0) {
            f20 = 0.0f;
        } else {
            f20 = f11;
        }
        if ((i8 & 16) != 0) {
            f21 = 0.0f;
        } else {
            f21 = f12;
        }
        if ((i8 & 32) != 0) {
            f22 = 0.0f;
        } else {
            f22 = f13;
        }
        if ((i8 & 64) != 0) {
            f23 = 0.0f;
        } else {
            f23 = f14;
        }
        if ((i8 & 128) != 0) {
            f24 = 0.0f;
        } else {
            f24 = f15;
        }
        if ((i8 & 256) == 0) {
            f27 = f16;
        }
        if ((i8 & 512) != 0) {
            f25 = 8.0f;
        } else {
            f25 = f17;
        }
        if ((i8 & 1024) != 0) {
            j9 = TransformOrigin.Companion.m3316getCenterSzJe1aQ();
        } else {
            j9 = j8;
        }
        if ((i8 & 2048) != 0) {
            shape2 = RectangleShapeKt.getRectangleShape();
        } else {
            shape2 = shape;
        }
        if ((i8 & 4096) != 0) {
            z9 = false;
        } else {
            z9 = z8;
        }
        if ((i8 & 8192) != 0) {
            renderEffect2 = null;
        } else {
            renderEffect2 = renderEffect;
        }
        return m3105graphicsLayer2Xn7asI(modifier, f18, f19, f26, f20, f21, f22, f23, f24, f27, f25, j9, shape2, z9, renderEffect2);
    }

    @Stable
    /* renamed from: graphicsLayer-Ap8cVGQ, reason: not valid java name */
    public static final Modifier m3107graphicsLayerAp8cVGQ(Modifier modifier, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, long j8, Shape shape, boolean z8, RenderEffect renderEffect, long j9, long j10, int i8) {
        return modifier.then(new GraphicsLayerElement(f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, j8, shape, z8, renderEffect, j9, j10, i8, null));
    }

    /* renamed from: graphicsLayer-Ap8cVGQ$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3108graphicsLayerAp8cVGQ$default(Modifier modifier, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, long j8, Shape shape, boolean z8, RenderEffect renderEffect, long j9, long j10, int i8, int i9, Object obj) {
        return m3107graphicsLayerAp8cVGQ(modifier, (i9 & 1) != 0 ? 1.0f : f8, (i9 & 2) != 0 ? 1.0f : f9, (i9 & 4) == 0 ? f10 : 1.0f, (i9 & 8) != 0 ? 0.0f : f11, (i9 & 16) != 0 ? 0.0f : f12, (i9 & 32) != 0 ? 0.0f : f13, (i9 & 64) != 0 ? 0.0f : f14, (i9 & 128) != 0 ? 0.0f : f15, (i9 & 256) == 0 ? f16 : 0.0f, (i9 & 512) != 0 ? 8.0f : f17, (i9 & 1024) != 0 ? TransformOrigin.Companion.m3316getCenterSzJe1aQ() : j8, (i9 & 2048) != 0 ? RectangleShapeKt.getRectangleShape() : shape, (i9 & 4096) != 0 ? false : z8, (i9 & 8192) != 0 ? null : renderEffect, (i9 & 16384) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j9, (i9 & 32768) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j10, (i9 & 65536) != 0 ? CompositingStrategy.Companion.m3036getAutoNrFUSI() : i8);
    }

    @Stable
    /* renamed from: graphicsLayer-pANQ8Wg, reason: not valid java name */
    public static final /* synthetic */ Modifier m3109graphicsLayerpANQ8Wg(Modifier modifier, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, long j8, Shape shape, boolean z8, RenderEffect renderEffect, long j9, long j10) {
        return m3107graphicsLayerAp8cVGQ(modifier, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, j8, shape, z8, renderEffect, j9, j10, CompositingStrategy.Companion.m3036getAutoNrFUSI());
    }

    /* renamed from: graphicsLayer-pANQ8Wg$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3110graphicsLayerpANQ8Wg$default(Modifier modifier, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, long j8, Shape shape, boolean z8, RenderEffect renderEffect, long j9, long j10, int i8, Object obj) {
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        long j11;
        Shape shape2;
        boolean z9;
        RenderEffect renderEffect2;
        long j12;
        long j13;
        float f26 = 1.0f;
        if ((i8 & 1) != 0) {
            f18 = 1.0f;
        } else {
            f18 = f8;
        }
        if ((i8 & 2) != 0) {
            f19 = 1.0f;
        } else {
            f19 = f9;
        }
        if ((i8 & 4) == 0) {
            f26 = f10;
        }
        float f27 = 0.0f;
        if ((i8 & 8) != 0) {
            f20 = 0.0f;
        } else {
            f20 = f11;
        }
        if ((i8 & 16) != 0) {
            f21 = 0.0f;
        } else {
            f21 = f12;
        }
        if ((i8 & 32) != 0) {
            f22 = 0.0f;
        } else {
            f22 = f13;
        }
        if ((i8 & 64) != 0) {
            f23 = 0.0f;
        } else {
            f23 = f14;
        }
        if ((i8 & 128) != 0) {
            f24 = 0.0f;
        } else {
            f24 = f15;
        }
        if ((i8 & 256) == 0) {
            f27 = f16;
        }
        if ((i8 & 512) != 0) {
            f25 = 8.0f;
        } else {
            f25 = f17;
        }
        if ((i8 & 1024) != 0) {
            j11 = TransformOrigin.Companion.m3316getCenterSzJe1aQ();
        } else {
            j11 = j8;
        }
        if ((i8 & 2048) != 0) {
            shape2 = RectangleShapeKt.getRectangleShape();
        } else {
            shape2 = shape;
        }
        if ((i8 & 4096) != 0) {
            z9 = false;
        } else {
            z9 = z8;
        }
        if ((i8 & 8192) != 0) {
            renderEffect2 = null;
        } else {
            renderEffect2 = renderEffect;
        }
        RenderEffect renderEffect3 = renderEffect2;
        if ((i8 & 16384) != 0) {
            j12 = GraphicsLayerScopeKt.getDefaultShadowColor();
        } else {
            j12 = j9;
        }
        if ((i8 & 32768) != 0) {
            j13 = GraphicsLayerScopeKt.getDefaultShadowColor();
        } else {
            j13 = j10;
        }
        return m3109graphicsLayerpANQ8Wg(modifier, f18, f19, f26, f20, f21, f22, f23, f24, f27, f25, j11, shape2, z9, renderEffect3, j12, j13);
    }

    /* renamed from: graphicsLayer-sKFY_QE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3112graphicsLayersKFY_QE$default(Modifier modifier, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, long j8, Shape shape, boolean z8, int i8, Object obj) {
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        long j9;
        Shape shape2;
        boolean z9;
        float f26 = 1.0f;
        if ((i8 & 1) != 0) {
            f18 = 1.0f;
        } else {
            f18 = f8;
        }
        if ((i8 & 2) != 0) {
            f19 = 1.0f;
        } else {
            f19 = f9;
        }
        if ((i8 & 4) == 0) {
            f26 = f10;
        }
        float f27 = 0.0f;
        if ((i8 & 8) != 0) {
            f20 = 0.0f;
        } else {
            f20 = f11;
        }
        if ((i8 & 16) != 0) {
            f21 = 0.0f;
        } else {
            f21 = f12;
        }
        if ((i8 & 32) != 0) {
            f22 = 0.0f;
        } else {
            f22 = f13;
        }
        if ((i8 & 64) != 0) {
            f23 = 0.0f;
        } else {
            f23 = f14;
        }
        if ((i8 & 128) != 0) {
            f24 = 0.0f;
        } else {
            f24 = f15;
        }
        if ((i8 & 256) == 0) {
            f27 = f16;
        }
        if ((i8 & 512) != 0) {
            f25 = 8.0f;
        } else {
            f25 = f17;
        }
        if ((i8 & 1024) != 0) {
            j9 = TransformOrigin.Companion.m3316getCenterSzJe1aQ();
        } else {
            j9 = j8;
        }
        if ((i8 & 2048) != 0) {
            shape2 = RectangleShapeKt.getRectangleShape();
        } else {
            shape2 = shape;
        }
        if ((i8 & 4096) != 0) {
            z9 = false;
        } else {
            z9 = z8;
        }
        return m3108graphicsLayerAp8cVGQ$default(modifier, f18, f19, f26, f20, f21, f22, f23, f24, f27, f25, j9, shape2, z9, null, 0L, 0L, 0, 114688, null);
    }

    @Stable
    public static final Modifier toolingGraphicsLayer(Modifier modifier) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            return modifier.then(m3108graphicsLayerAp8cVGQ$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null));
        }
        return modifier;
    }
}
