package androidx.compose.ui.node;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface OwnedLayer {
    void destroy();

    void drawLayer(Canvas canvas);

    void invalidate();

    /* renamed from: inverseTransform-58bKbWc, reason: not valid java name */
    void mo4367inverseTransform58bKbWc(float[] fArr);

    /* renamed from: isInLayer-k-4lQ0M, reason: not valid java name */
    boolean mo4368isInLayerk4lQ0M(long j8);

    void mapBounds(MutableRect mutableRect, boolean z8);

    /* renamed from: mapOffset-8S9VItk, reason: not valid java name */
    long mo4369mapOffset8S9VItk(long j8, boolean z8);

    /* renamed from: move--gyyYBs, reason: not valid java name */
    void mo4370movegyyYBs(long j8);

    /* renamed from: resize-ozmzZPI, reason: not valid java name */
    void mo4371resizeozmzZPI(long j8);

    void reuseLayer(Function1 function1, Function0 function0);

    /* renamed from: transform-58bKbWc, reason: not valid java name */
    void mo4372transform58bKbWc(float[] fArr);

    void updateDisplayList();

    void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope, LayoutDirection layoutDirection, Density density);
}
