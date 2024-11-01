package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
public final class EdgeEffectCompat {
    private final EdgeEffect mEdgeEffect;

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(21)
    /* loaded from: classes3.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static void onPull(EdgeEffect edgeEffect, float f8, float f9) {
            edgeEffect.onPull(f8, f9);
        }
    }

    @RequiresApi(31)
    /* loaded from: classes3.dex */
    private static class Api31Impl {
        private Api31Impl() {
        }

        @DoNotInline
        public static EdgeEffect create(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        @DoNotInline
        public static float getDistance(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        @DoNotInline
        public static float onPullDistance(EdgeEffect edgeEffect, float f8, float f9) {
            try {
                return edgeEffect.onPullDistance(f8, f9);
            } catch (Throwable unused) {
                edgeEffect.onPull(f8, f9);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public EdgeEffectCompat(Context context) {
        this.mEdgeEffect = new EdgeEffect(context);
    }

    @NonNull
    public static EdgeEffect create(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.create(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    public static float getDistance(@NonNull EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.getDistance(edgeEffect);
        }
        return 0.0f;
    }

    public static float onPullDistance(@NonNull EdgeEffect edgeEffect, float f8, float f9) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.onPullDistance(edgeEffect, f8, f9);
        }
        onPull(edgeEffect, f8, f9);
        return f8;
    }

    @Deprecated
    public boolean draw(Canvas canvas) {
        return this.mEdgeEffect.draw(canvas);
    }

    @Deprecated
    public void finish() {
        this.mEdgeEffect.finish();
    }

    @Deprecated
    public boolean isFinished() {
        return this.mEdgeEffect.isFinished();
    }

    @Deprecated
    public boolean onAbsorb(int i8) {
        this.mEdgeEffect.onAbsorb(i8);
        return true;
    }

    @Deprecated
    public boolean onPull(float f8) {
        this.mEdgeEffect.onPull(f8);
        return true;
    }

    @Deprecated
    public boolean onRelease() {
        this.mEdgeEffect.onRelease();
        return this.mEdgeEffect.isFinished();
    }

    @Deprecated
    public void setSize(int i8, int i9) {
        this.mEdgeEffect.setSize(i8, i9);
    }

    @Deprecated
    public boolean onPull(float f8, float f9) {
        onPull(this.mEdgeEffect, f8, f9);
        return true;
    }

    public static void onPull(@NonNull EdgeEffect edgeEffect, float f8, float f9) {
        Api21Impl.onPull(edgeEffect, f8, f9);
    }
}
