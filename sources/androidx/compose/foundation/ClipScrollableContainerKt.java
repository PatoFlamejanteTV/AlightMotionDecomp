package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ClipScrollableContainerKt {
    private static final Modifier HorizontalScrollableClipModifier;
    private static final float MaxSupportedElevation = Dp.m5155constructorimpl(30);
    private static final Modifier VerticalScrollableClipModifier;

    static {
        Modifier.Companion companion = Modifier.Companion;
        HorizontalScrollableClipModifier = ClipKt.clip(companion, new Shape() { // from class: androidx.compose.foundation.ClipScrollableContainerKt$HorizontalScrollableClipModifier$1
            @Override // androidx.compose.ui.graphics.Shape
            /* renamed from: createOutline-Pq9zytI, reason: not valid java name */
            public Outline mo308createOutlinePq9zytI(long j8, LayoutDirection layoutDirection, Density density) {
                AbstractC3292y.i(layoutDirection, "layoutDirection");
                AbstractC3292y.i(density, "density");
                float mo419roundToPx0680j_4 = density.mo419roundToPx0680j_4(ClipScrollableContainerKt.getMaxSupportedElevation());
                return new Outline.Rectangle(new Rect(0.0f, -mo419roundToPx0680j_4, Size.m2781getWidthimpl(j8), Size.m2778getHeightimpl(j8) + mo419roundToPx0680j_4));
            }
        });
        VerticalScrollableClipModifier = ClipKt.clip(companion, new Shape() { // from class: androidx.compose.foundation.ClipScrollableContainerKt$VerticalScrollableClipModifier$1
            @Override // androidx.compose.ui.graphics.Shape
            /* renamed from: createOutline-Pq9zytI */
            public Outline mo308createOutlinePq9zytI(long j8, LayoutDirection layoutDirection, Density density) {
                AbstractC3292y.i(layoutDirection, "layoutDirection");
                AbstractC3292y.i(density, "density");
                float mo419roundToPx0680j_4 = density.mo419roundToPx0680j_4(ClipScrollableContainerKt.getMaxSupportedElevation());
                return new Outline.Rectangle(new Rect(-mo419roundToPx0680j_4, 0.0f, Size.m2781getWidthimpl(j8) + mo419roundToPx0680j_4, Size.m2778getHeightimpl(j8)));
            }
        });
    }

    public static final Modifier clipScrollableContainer(Modifier modifier, Orientation orientation) {
        Modifier modifier2;
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(orientation, "orientation");
        if (orientation == Orientation.Vertical) {
            modifier2 = VerticalScrollableClipModifier;
        } else {
            modifier2 = HorizontalScrollableClipModifier;
        }
        return modifier.then(modifier2);
    }

    public static final float getMaxSupportedElevation() {
        return MaxSupportedElevation;
    }
}
