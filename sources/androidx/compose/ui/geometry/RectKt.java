package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;

/* loaded from: classes.dex */
public final class RectKt {
    @Stable
    /* renamed from: Rect-0a9Yr6o, reason: not valid java name */
    public static final Rect m2750Rect0a9Yr6o(long j8, long j9) {
        return new Rect(Offset.m2712getXimpl(j8), Offset.m2713getYimpl(j8), Offset.m2712getXimpl(j9), Offset.m2713getYimpl(j9));
    }

    @Stable
    /* renamed from: Rect-3MmeM6k, reason: not valid java name */
    public static final Rect m2751Rect3MmeM6k(long j8, float f8) {
        return new Rect(Offset.m2712getXimpl(j8) - f8, Offset.m2713getYimpl(j8) - f8, Offset.m2712getXimpl(j8) + f8, Offset.m2713getYimpl(j8) + f8);
    }

    @Stable
    /* renamed from: Rect-tz77jQw, reason: not valid java name */
    public static final Rect m2752Recttz77jQw(long j8, long j9) {
        return new Rect(Offset.m2712getXimpl(j8), Offset.m2713getYimpl(j8), Offset.m2712getXimpl(j8) + Size.m2781getWidthimpl(j9), Offset.m2713getYimpl(j8) + Size.m2778getHeightimpl(j9));
    }

    @Stable
    public static final Rect lerp(Rect rect, Rect rect2, float f8) {
        return new Rect(MathHelpersKt.lerp(rect.getLeft(), rect2.getLeft(), f8), MathHelpersKt.lerp(rect.getTop(), rect2.getTop(), f8), MathHelpersKt.lerp(rect.getRight(), rect2.getRight(), f8), MathHelpersKt.lerp(rect.getBottom(), rect2.getBottom(), f8));
    }
}
