package androidx.core.view;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import j$.util.DesugarCollections;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class VelocityTrackerCompat {
    private static Map<VelocityTracker, VelocityTrackerFallback> sFallbackTrackers = DesugarCollections.synchronizedMap(new WeakHashMap());

    @RequiresApi(34)
    /* loaded from: classes3.dex */
    private static class Api34Impl {
        private Api34Impl() {
        }

        @DoNotInline
        static float getAxisVelocity(VelocityTracker velocityTracker, int i8, int i9) {
            return velocityTracker.getAxisVelocity(i8, i9);
        }

        @DoNotInline
        static boolean isAxisSupported(VelocityTracker velocityTracker, int i8) {
            return velocityTracker.isAxisSupported(i8);
        }

        @DoNotInline
        static float getAxisVelocity(VelocityTracker velocityTracker, int i8) {
            return velocityTracker.getAxisVelocity(i8);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes3.dex */
    public @interface VelocityTrackableMotionEventAxis {
    }

    private VelocityTrackerCompat() {
    }

    public static void addMovement(@NonNull VelocityTracker velocityTracker, @NonNull MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!sFallbackTrackers.containsKey(velocityTracker)) {
                sFallbackTrackers.put(velocityTracker, new VelocityTrackerFallback());
            }
            sFallbackTrackers.get(velocityTracker).addMovement(motionEvent);
        }
    }

    public static void clear(@NonNull VelocityTracker velocityTracker) {
        velocityTracker.clear();
        removeFallbackForTracker(velocityTracker);
    }

    public static void computeCurrentVelocity(@NonNull VelocityTracker velocityTracker, int i8, float f8) {
        velocityTracker.computeCurrentVelocity(i8, f8);
        VelocityTrackerFallback fallbackTrackerOrNull = getFallbackTrackerOrNull(velocityTracker);
        if (fallbackTrackerOrNull != null) {
            fallbackTrackerOrNull.computeCurrentVelocity(i8, f8);
        }
    }

    public static float getAxisVelocity(@NonNull VelocityTracker velocityTracker, int i8) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getAxisVelocity(velocityTracker, i8);
        }
        if (i8 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i8 == 1) {
            return velocityTracker.getYVelocity();
        }
        VelocityTrackerFallback fallbackTrackerOrNull = getFallbackTrackerOrNull(velocityTracker);
        if (fallbackTrackerOrNull != null) {
            return fallbackTrackerOrNull.getAxisVelocity(i8);
        }
        return 0.0f;
    }

    @Nullable
    private static VelocityTrackerFallback getFallbackTrackerOrNull(VelocityTracker velocityTracker) {
        return sFallbackTrackers.get(velocityTracker);
    }

    @Deprecated
    public static float getXVelocity(VelocityTracker velocityTracker, int i8) {
        return velocityTracker.getXVelocity(i8);
    }

    @Deprecated
    public static float getYVelocity(VelocityTracker velocityTracker, int i8) {
        return velocityTracker.getYVelocity(i8);
    }

    public static boolean isAxisSupported(@NonNull VelocityTracker velocityTracker, int i8) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.isAxisSupported(velocityTracker, i8);
        }
        if (i8 == 26 || i8 == 0 || i8 == 1) {
            return true;
        }
        return false;
    }

    public static void recycle(@NonNull VelocityTracker velocityTracker) {
        velocityTracker.recycle();
        removeFallbackForTracker(velocityTracker);
    }

    private static void removeFallbackForTracker(VelocityTracker velocityTracker) {
        sFallbackTrackers.remove(velocityTracker);
    }

    public static void computeCurrentVelocity(@NonNull VelocityTracker velocityTracker, int i8) {
        computeCurrentVelocity(velocityTracker, i8, Float.MAX_VALUE);
    }

    public static float getAxisVelocity(@NonNull VelocityTracker velocityTracker, int i8, int i9) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getAxisVelocity(velocityTracker, i8, i9);
        }
        if (i8 == 0) {
            return velocityTracker.getXVelocity(i9);
        }
        if (i8 == 1) {
            return velocityTracker.getYVelocity(i9);
        }
        return 0.0f;
    }
}
