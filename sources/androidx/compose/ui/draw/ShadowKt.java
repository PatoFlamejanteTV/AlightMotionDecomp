package androidx.compose.ui.draw;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ShadowKt {
    @Stable
    /* renamed from: shadow-s4CzXII, reason: not valid java name */
    public static final Modifier m2621shadows4CzXII(Modifier modifier, float f8, Shape shape, boolean z8, long j8, long j9) {
        Function1 noInspectorInfo;
        if (Dp.m5154compareTo0680j_4(f8, Dp.m5155constructorimpl(0)) <= 0 && !z8) {
            return modifier;
        }
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ShadowKt$shadows4CzXII$$inlined$debugInspectorInfo$1(f8, shape, z8, j8, j9);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return InspectableValueKt.inspectableWrapper(modifier, noInspectorInfo, GraphicsLayerModifierKt.graphicsLayer(Modifier.Companion, new ShadowKt$shadow$2$1(f8, shape, z8, j8, j9)));
    }

    /* renamed from: shadow-s4CzXII$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2622shadows4CzXII$default(Modifier modifier, float f8, Shape shape, boolean z8, long j8, long j9, int i8, Object obj) {
        Shape shape2;
        boolean z9;
        long j10;
        long j11;
        if ((i8 & 2) != 0) {
            shape2 = RectangleShapeKt.getRectangleShape();
        } else {
            shape2 = shape;
        }
        if ((i8 & 4) != 0) {
            z9 = false;
            if (Dp.m5154compareTo0680j_4(f8, Dp.m5155constructorimpl(0)) > 0) {
                z9 = true;
            }
        } else {
            z9 = z8;
        }
        if ((i8 & 8) != 0) {
            j10 = GraphicsLayerScopeKt.getDefaultShadowColor();
        } else {
            j10 = j8;
        }
        if ((i8 & 16) != 0) {
            j11 = GraphicsLayerScopeKt.getDefaultShadowColor();
        } else {
            j11 = j9;
        }
        return m2621shadows4CzXII(modifier, f8, shape2, z9, j10, j11);
    }

    @Stable
    /* renamed from: shadow-ziNgDLE, reason: not valid java name */
    public static final /* synthetic */ Modifier m2623shadowziNgDLE(Modifier modifier, float f8, Shape shape, boolean z8) {
        return m2621shadows4CzXII(modifier, f8, shape, z8, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor());
    }

    /* renamed from: shadow-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2624shadowziNgDLE$default(Modifier modifier, float f8, Shape shape, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i8 & 4) != 0) {
            z8 = false;
            if (Dp.m5154compareTo0680j_4(f8, Dp.m5155constructorimpl(0)) > 0) {
                z8 = true;
            }
        }
        return m2623shadowziNgDLE(modifier, f8, shape, z8);
    }
}
