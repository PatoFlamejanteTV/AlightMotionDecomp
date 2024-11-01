package androidx.compose.foundation.shape;

import androidx.compose.runtime.Stable;

/* loaded from: classes.dex */
public final class CornerSizeKt {
    private static final CornerSize ZeroCornerSize = new CornerSizeKt$ZeroCornerSize$1();

    @Stable
    public static final CornerSize CornerSize(float f8) {
        return new PxCornerSize(f8);
    }

    @Stable
    /* renamed from: CornerSize-0680j_4, reason: not valid java name */
    public static final CornerSize m821CornerSize0680j_4(float f8) {
        return new DpCornerSize(f8, null);
    }

    public static final CornerSize getZeroCornerSize() {
        return ZeroCornerSize;
    }

    @Stable
    public static /* synthetic */ void getZeroCornerSize$annotations() {
    }

    @Stable
    public static final CornerSize CornerSize(int i8) {
        return new PercentCornerSize(i8);
    }
}
