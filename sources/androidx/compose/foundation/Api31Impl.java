package androidx.compose.foundation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC3292y;

@RequiresApi(31)
/* loaded from: classes.dex */
final class Api31Impl {
    public static final Api31Impl INSTANCE = new Api31Impl();

    private Api31Impl() {
    }

    @DoNotInline
    public final EdgeEffect create(Context context, AttributeSet attributeSet) {
        AbstractC3292y.i(context, "context");
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    @DoNotInline
    public final float getDistance(EdgeEffect edgeEffect) {
        AbstractC3292y.i(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    @DoNotInline
    public final float onPullDistance(EdgeEffect edgeEffect, float f8, float f9) {
        AbstractC3292y.i(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.onPullDistance(f8, f9);
        } catch (Throwable unused) {
            edgeEffect.onPull(f8, f9);
            return 0.0f;
        }
    }
}
