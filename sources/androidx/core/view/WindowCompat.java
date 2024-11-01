package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
public final class WindowCompat {
    public static final int FEATURE_ACTION_BAR = 8;
    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;

    /* loaded from: classes3.dex */
    static class Api16Impl {
        private Api16Impl() {
        }

        static void setDecorFitsSystemWindows(@NonNull Window window, boolean z8) {
            int i8;
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z8) {
                i8 = systemUiVisibility & (-1793);
            } else {
                i8 = systemUiVisibility | 1792;
            }
            decorView.setSystemUiVisibility(i8);
        }
    }

    @RequiresApi(28)
    /* loaded from: classes3.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        static <T> T requireViewById(Window window, int i8) {
            return (T) window.requireViewById(i8);
        }
    }

    @RequiresApi(30)
    /* loaded from: classes3.dex */
    static class Api30Impl {
        private Api30Impl() {
        }

        @DoNotInline
        static void setDecorFitsSystemWindows(@NonNull Window window, boolean z8) {
            window.setDecorFitsSystemWindows(z8);
        }
    }

    private WindowCompat() {
    }

    @NonNull
    public static WindowInsetsControllerCompat getInsetsController(@NonNull Window window, @NonNull View view) {
        return new WindowInsetsControllerCompat(window, view);
    }

    @NonNull
    public static <T extends View> T requireViewById(@NonNull Window window, @IdRes int i8) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) Api28Impl.requireViewById(window, i8);
        }
        T t8 = (T) window.findViewById(i8);
        if (t8 != null) {
            return t8;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    public static void setDecorFitsSystemWindows(@NonNull Window window, boolean z8) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setDecorFitsSystemWindows(window, z8);
        } else {
            Api16Impl.setDecorFitsSystemWindows(window, z8);
        }
    }
}
