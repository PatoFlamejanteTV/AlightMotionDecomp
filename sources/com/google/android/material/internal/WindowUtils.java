package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class WindowUtils {
    private static final String TAG = "WindowUtils";

    /* loaded from: classes3.dex */
    private static class Api14Impl {
        private Api14Impl() {
        }

        @NonNull
        static Rect getCurrentWindowBounds(@NonNull WindowManager windowManager) {
            int i8;
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point realSizeForDisplay = getRealSizeForDisplay(defaultDisplay);
            Rect rect = new Rect();
            int i9 = realSizeForDisplay.x;
            if (i9 != 0 && (i8 = realSizeForDisplay.y) != 0) {
                rect.right = i9;
                rect.bottom = i8;
            } else {
                defaultDisplay.getRectSize(rect);
            }
            return rect;
        }

        private static Point getRealSizeForDisplay(Display display) {
            Point point = new Point();
            try {
                Method declaredMethod = Display.class.getDeclaredMethod("getRealSize", Point.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(display, point);
            } catch (IllegalAccessException e8) {
                Log.w(WindowUtils.TAG, e8);
            } catch (NoSuchMethodException e9) {
                Log.w(WindowUtils.TAG, e9);
            } catch (InvocationTargetException e10) {
                Log.w(WindowUtils.TAG, e10);
            }
            return point;
        }
    }

    @RequiresApi(api = 17)
    /* loaded from: classes3.dex */
    private static class Api17Impl {
        private Api17Impl() {
        }

        @NonNull
        static Rect getCurrentWindowBounds(@NonNull WindowManager windowManager) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Rect rect = new Rect();
            rect.right = point.x;
            rect.bottom = point.y;
            return rect;
        }
    }

    @RequiresApi(api = 30)
    /* loaded from: classes3.dex */
    private static class Api30Impl {
        private Api30Impl() {
        }

        @NonNull
        static Rect getCurrentWindowBounds(@NonNull WindowManager windowManager) {
            WindowMetrics currentWindowMetrics;
            Rect bounds;
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            return bounds;
        }
    }

    private WindowUtils() {
    }

    @NonNull
    public static Rect getCurrentWindowBounds(@NonNull Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.getCurrentWindowBounds(windowManager);
        }
        return Api17Impl.getCurrentWindowBounds(windowManager);
    }
}
