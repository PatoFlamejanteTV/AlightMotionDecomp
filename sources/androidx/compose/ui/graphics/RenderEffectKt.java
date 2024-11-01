package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.OffsetKt;

/* loaded from: classes.dex */
public final class RenderEffectKt {
    @Stable
    /* renamed from: BlurEffect-3YTHUZs, reason: not valid java name */
    public static final BlurEffect m3233BlurEffect3YTHUZs(float f8, float f9, int i8) {
        return new BlurEffect(null, f8, f9, i8, null);
    }

    /* renamed from: BlurEffect-3YTHUZs$default, reason: not valid java name */
    public static /* synthetic */ BlurEffect m3234BlurEffect3YTHUZs$default(float f8, float f9, int i8, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            i8 = TileMode.Companion.m3298getClamp3opZhB0();
        }
        return m3233BlurEffect3YTHUZs(f8, f9, i8);
    }

    @Stable
    public static final OffsetEffect OffsetEffect(float f8, float f9) {
        return new OffsetEffect(null, OffsetKt.Offset(f8, f9), null);
    }
}
