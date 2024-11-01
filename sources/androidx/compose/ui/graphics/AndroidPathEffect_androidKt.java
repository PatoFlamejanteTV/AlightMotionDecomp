package androidx.compose.ui.graphics;

import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.PathDashPathEffect;
import androidx.compose.ui.graphics.StampedPathEffectStyle;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AndroidPathEffect_androidKt {
    public static final PathEffect actualChainPathEffect(PathEffect pathEffect, PathEffect pathEffect2) {
        AbstractC3292y.g(pathEffect, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        android.graphics.PathEffect nativePathEffect = ((AndroidPathEffect) pathEffect).getNativePathEffect();
        AbstractC3292y.g(pathEffect2, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return new AndroidPathEffect(new ComposePathEffect(nativePathEffect, ((AndroidPathEffect) pathEffect2).getNativePathEffect()));
    }

    public static final PathEffect actualCornerPathEffect(float f8) {
        return new AndroidPathEffect(new CornerPathEffect(f8));
    }

    public static final PathEffect actualDashPathEffect(float[] fArr, float f8) {
        return new AndroidPathEffect(new DashPathEffect(fArr, f8));
    }

    /* renamed from: actualStampedPathEffect-7aD1DOk, reason: not valid java name */
    public static final PathEffect m2850actualStampedPathEffect7aD1DOk(Path path, float f8, float f9, int i8) {
        if (path instanceof AndroidPath) {
            return new AndroidPathEffect(new PathDashPathEffect(((AndroidPath) path).getInternalPath(), f8, f9, m2851toAndroidPathDashPathEffectStyleoQv6xUo(i8)));
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public static final android.graphics.PathEffect asAndroidPathEffect(PathEffect pathEffect) {
        AbstractC3292y.g(pathEffect, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return ((AndroidPathEffect) pathEffect).getNativePathEffect();
    }

    /* renamed from: toAndroidPathDashPathEffectStyle-oQv6xUo, reason: not valid java name */
    public static final PathDashPathEffect.Style m2851toAndroidPathDashPathEffectStyleoQv6xUo(int i8) {
        StampedPathEffectStyle.Companion companion = StampedPathEffectStyle.Companion;
        if (StampedPathEffectStyle.m3264equalsimpl0(i8, companion.m3268getMorphYpspkwk())) {
            return PathDashPathEffect.Style.MORPH;
        }
        if (StampedPathEffectStyle.m3264equalsimpl0(i8, companion.m3269getRotateYpspkwk())) {
            return PathDashPathEffect.Style.ROTATE;
        }
        if (StampedPathEffectStyle.m3264equalsimpl0(i8, companion.m3270getTranslateYpspkwk())) {
            return PathDashPathEffect.Style.TRANSLATE;
        }
        return PathDashPathEffect.Style.TRANSLATE;
    }

    public static final PathEffect toComposePathEffect(android.graphics.PathEffect pathEffect) {
        return new AndroidPathEffect(pathEffect);
    }
}
