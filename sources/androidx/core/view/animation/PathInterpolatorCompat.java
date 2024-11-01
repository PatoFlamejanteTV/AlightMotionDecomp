package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
public final class PathInterpolatorCompat {

    @RequiresApi(21)
    /* loaded from: classes3.dex */
    static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static Interpolator createPathInterpolator(Path path) {
            return new PathInterpolator(path);
        }

        @DoNotInline
        static Interpolator createPathInterpolator(float f8, float f9) {
            return new PathInterpolator(f8, f9);
        }

        @DoNotInline
        static Interpolator createPathInterpolator(float f8, float f9, float f10, float f11) {
            return new PathInterpolator(f8, f9, f10, f11);
        }
    }

    private PathInterpolatorCompat() {
    }

    @NonNull
    public static Interpolator create(@NonNull Path path) {
        return Api21Impl.createPathInterpolator(path);
    }

    @NonNull
    public static Interpolator create(float f8, float f9) {
        return Api21Impl.createPathInterpolator(f8, f9);
    }

    @NonNull
    public static Interpolator create(float f8, float f9, float f10, float f11) {
        return Api21Impl.createPathInterpolator(f8, f9, f10, f11);
    }
}
