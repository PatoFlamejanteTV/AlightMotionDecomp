package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class GlowEdgeEffectCompat extends EdgeEffect {
    private float oppositeReleaseDelta;
    private final float oppositeReleaseDeltaThreshold;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlowEdgeEffectCompat(Context context) {
        super(context);
        AbstractC3292y.i(context, "context");
        this.oppositeReleaseDeltaThreshold = AndroidDensity_androidKt.Density(context).mo425toPx0680j_4(Dp.m5155constructorimpl(1));
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i8) {
        this.oppositeReleaseDelta = 0.0f;
        super.onAbsorb(i8);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f8, float f9) {
        this.oppositeReleaseDelta = 0.0f;
        super.onPull(f8, f9);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.oppositeReleaseDelta = 0.0f;
        super.onRelease();
    }

    public final void releaseWithOppositeDelta(float f8) {
        float f9 = this.oppositeReleaseDelta + f8;
        this.oppositeReleaseDelta = f9;
        if (Math.abs(f9) > this.oppositeReleaseDeltaThreshold) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f8) {
        this.oppositeReleaseDelta = 0.0f;
        super.onPull(f8);
    }
}
