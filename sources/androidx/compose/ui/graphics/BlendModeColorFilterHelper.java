package androidx.compose.ui.graphics;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(29)
/* loaded from: classes.dex */
public final class BlendModeColorFilterHelper {
    public static final BlendModeColorFilterHelper INSTANCE = new BlendModeColorFilterHelper();

    private BlendModeColorFilterHelper() {
    }

    @DoNotInline
    /* renamed from: BlendModeColorFilter-xETnrds, reason: not valid java name */
    public final android.graphics.BlendModeColorFilter m2900BlendModeColorFilterxETnrds(long j8, int i8) {
        S.a();
        return Q.a(ColorKt.m3002toArgb8_81llA(j8), AndroidBlendMode_androidKt.m2804toAndroidBlendModes9anfk8(i8));
    }

    @DoNotInline
    public final BlendModeColorFilter createBlendModeColorFilter(android.graphics.BlendModeColorFilter blendModeColorFilter) {
        int color;
        android.graphics.BlendMode mode;
        color = blendModeColorFilter.getColor();
        long Color = ColorKt.Color(color);
        mode = blendModeColorFilter.getMode();
        return new BlendModeColorFilter(Color, AndroidBlendMode_androidKt.toComposeBlendMode(mode), blendModeColorFilter, null);
    }
}
