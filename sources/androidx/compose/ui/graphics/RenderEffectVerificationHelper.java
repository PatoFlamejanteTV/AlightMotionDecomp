package androidx.compose.ui.graphics;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;

@RequiresApi(31)
/* loaded from: classes.dex */
final class RenderEffectVerificationHelper {
    public static final RenderEffectVerificationHelper INSTANCE = new RenderEffectVerificationHelper();

    private RenderEffectVerificationHelper() {
    }

    @DoNotInline
    /* renamed from: createBlurEffect-8A-3gB4, reason: not valid java name */
    public final android.graphics.RenderEffect m3235createBlurEffect8A3gB4(RenderEffect renderEffect, float f8, float f9, int i8) {
        android.graphics.RenderEffect createBlurEffect;
        android.graphics.RenderEffect createBlurEffect2;
        if (renderEffect == null) {
            createBlurEffect2 = android.graphics.RenderEffect.createBlurEffect(f8, f9, AndroidTileMode_androidKt.m2859toAndroidTileMode0vamqd0(i8));
            return createBlurEffect2;
        }
        createBlurEffect = android.graphics.RenderEffect.createBlurEffect(f8, f9, renderEffect.asAndroidRenderEffect(), AndroidTileMode_androidKt.m2859toAndroidTileMode0vamqd0(i8));
        return createBlurEffect;
    }

    @DoNotInline
    /* renamed from: createOffsetEffect-Uv8p0NA, reason: not valid java name */
    public final android.graphics.RenderEffect m3236createOffsetEffectUv8p0NA(RenderEffect renderEffect, long j8) {
        android.graphics.RenderEffect createOffsetEffect;
        android.graphics.RenderEffect createOffsetEffect2;
        if (renderEffect == null) {
            createOffsetEffect2 = android.graphics.RenderEffect.createOffsetEffect(Offset.m2712getXimpl(j8), Offset.m2713getYimpl(j8));
            return createOffsetEffect2;
        }
        createOffsetEffect = android.graphics.RenderEffect.createOffsetEffect(Offset.m2712getXimpl(j8), Offset.m2713getYimpl(j8), renderEffect.asAndroidRenderEffect());
        return createOffsetEffect;
    }
}
