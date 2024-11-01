package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class EdgeEffectCompat {
    public static final EdgeEffectCompat INSTANCE = new EdgeEffectCompat();

    private EdgeEffectCompat() {
    }

    public final EdgeEffect create(Context context, AttributeSet attributeSet) {
        AbstractC3292y.i(context, "context");
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.INSTANCE.create(context, attributeSet);
        }
        return new GlowEdgeEffectCompat(context);
    }

    public final float getDistanceCompat(EdgeEffect edgeEffect) {
        AbstractC3292y.i(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.INSTANCE.getDistance(edgeEffect);
        }
        return 0.0f;
    }

    public final void onAbsorbCompat(EdgeEffect edgeEffect, int i8) {
        AbstractC3292y.i(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i8);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i8);
        }
    }

    public final float onPullDistanceCompat(EdgeEffect edgeEffect, float f8, float f9) {
        AbstractC3292y.i(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.INSTANCE.onPullDistance(edgeEffect, f8, f9);
        }
        edgeEffect.onPull(f8, f9);
        return f8;
    }

    public final void onReleaseWithOppositeDelta(EdgeEffect edgeEffect, float f8) {
        AbstractC3292y.i(edgeEffect, "<this>");
        if (edgeEffect instanceof GlowEdgeEffectCompat) {
            ((GlowEdgeEffectCompat) edgeEffect).releaseWithOppositeDelta(f8);
        } else {
            edgeEffect.onRelease();
        }
    }
}
