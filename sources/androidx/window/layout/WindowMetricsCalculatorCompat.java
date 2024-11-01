package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class WindowMetricsCalculatorCompat implements WindowMetricsCalculator {
    public static final WindowMetricsCalculatorCompat INSTANCE = new WindowMetricsCalculatorCompat();
    private static final String TAG;

    static {
        String simpleName = WindowMetricsCalculatorCompat.class.getSimpleName();
        AbstractC3292y.h(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        TAG = simpleName;
    }

    private WindowMetricsCalculatorCompat() {
    }

    @RequiresApi(28)
    @SuppressLint({"BanUncheckedReflection"})
    private final DisplayCutout getCutoutForDisplay(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, newInstance);
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (!m.a(obj)) {
                return null;
            }
            return n.a(obj);
        } catch (ClassNotFoundException e8) {
            Log.w(TAG, e8);
            return null;
        } catch (IllegalAccessException e9) {
            Log.w(TAG, e9);
            return null;
        } catch (InstantiationException e10) {
            Log.w(TAG, e10);
            return null;
        } catch (NoSuchFieldException e11) {
            Log.w(TAG, e11);
            return null;
        } catch (NoSuchMethodException e12) {
            Log.w(TAG, e12);
            return null;
        } catch (InvocationTargetException e13) {
            Log.w(TAG, e13);
            return null;
        }
    }

    private final int getNavigationBarHeight(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void getRectSizeFromDisplay(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public WindowMetrics computeCurrentWindowMetrics(Activity activity) {
        Rect computeWindowBoundsIceCreamSandwich$window_release;
        AbstractC3292y.i(activity, "activity");
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            computeWindowBoundsIceCreamSandwich$window_release = ActivityCompatHelperApi30.INSTANCE.currentWindowBounds(activity);
        } else if (i8 >= 29) {
            computeWindowBoundsIceCreamSandwich$window_release = computeWindowBoundsQ$window_release(activity);
        } else if (i8 >= 28) {
            computeWindowBoundsIceCreamSandwich$window_release = computeWindowBoundsP$window_release(activity);
        } else if (i8 >= 24) {
            computeWindowBoundsIceCreamSandwich$window_release = computeWindowBoundsN$window_release(activity);
        } else {
            computeWindowBoundsIceCreamSandwich$window_release = computeWindowBoundsIceCreamSandwich$window_release(activity);
        }
        return new WindowMetrics(computeWindowBoundsIceCreamSandwich$window_release);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public WindowMetrics computeMaximumWindowMetrics(Activity activity) {
        Rect rect;
        AbstractC3292y.i(activity, "activity");
        if (Build.VERSION.SDK_INT >= 30) {
            rect = ActivityCompatHelperApi30.INSTANCE.maximumWindowBounds(activity);
        } else {
            Display display = activity.getWindowManager().getDefaultDisplay();
            AbstractC3292y.h(display, "display");
            Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(display);
            rect = new Rect(0, 0, realSizeForDisplay$window_release.x, realSizeForDisplay$window_release.y);
        }
        return new WindowMetrics(rect);
    }

    @RequiresApi(14)
    public final Rect computeWindowBoundsIceCreamSandwich$window_release(Activity activity) {
        int i8;
        AbstractC3292y.i(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        AbstractC3292y.h(defaultDisplay, "defaultDisplay");
        Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
        Rect rect = new Rect();
        int i9 = realSizeForDisplay$window_release.x;
        if (i9 != 0 && (i8 = realSizeForDisplay$window_release.y) != 0) {
            rect.right = i9;
            rect.bottom = i8;
        } else {
            defaultDisplay.getRectSize(rect);
        }
        return rect;
    }

    @RequiresApi(24)
    public final Rect computeWindowBoundsN$window_release(Activity activity) {
        AbstractC3292y.i(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
            AbstractC3292y.h(defaultDisplay, "defaultDisplay");
            Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
            int navigationBarHeight = getNavigationBarHeight(activity);
            int i8 = rect.bottom;
            if (i8 + navigationBarHeight == realSizeForDisplay$window_release.y) {
                rect.bottom = i8 + navigationBarHeight;
            } else {
                int i9 = rect.right;
                if (i9 + navigationBarHeight == realSizeForDisplay$window_release.x) {
                    rect.right = i9 + navigationBarHeight;
                }
            }
        }
        return rect;
    }

    @RequiresApi(28)
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect computeWindowBoundsP$window_release(Activity activity) {
        DisplayCutout cutoutForDisplay;
        AbstractC3292y.i(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                if (invoke != null) {
                    rect.set((Rect) invoke);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                if (invoke2 != null) {
                    rect.set((Rect) invoke2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
            }
        } catch (IllegalAccessException e8) {
            Log.w(TAG, e8);
            getRectSizeFromDisplay(activity, rect);
        } catch (NoSuchFieldException e9) {
            Log.w(TAG, e9);
            getRectSizeFromDisplay(activity, rect);
        } catch (NoSuchMethodException e10) {
            Log.w(TAG, e10);
            getRectSizeFromDisplay(activity, rect);
        } catch (InvocationTargetException e11) {
            Log.w(TAG, e11);
            getRectSizeFromDisplay(activity, rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        DisplayCompatHelperApi17 displayCompatHelperApi17 = DisplayCompatHelperApi17.INSTANCE;
        AbstractC3292y.h(currentDisplay, "currentDisplay");
        displayCompatHelperApi17.getRealSize(currentDisplay, point);
        ActivityCompatHelperApi24 activityCompatHelperApi24 = ActivityCompatHelperApi24.INSTANCE;
        if (!activityCompatHelperApi24.isInMultiWindowMode(activity)) {
            int navigationBarHeight = getNavigationBarHeight(activity);
            int i8 = rect.bottom;
            if (i8 + navigationBarHeight == point.y) {
                rect.bottom = i8 + navigationBarHeight;
            } else {
                int i9 = rect.right;
                if (i9 + navigationBarHeight == point.x) {
                    rect.right = i9 + navigationBarHeight;
                } else if (rect.left == navigationBarHeight) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activityCompatHelperApi24.isInMultiWindowMode(activity) && (cutoutForDisplay = getCutoutForDisplay(currentDisplay)) != null) {
            int i10 = rect.left;
            DisplayCompatHelperApi28 displayCompatHelperApi28 = DisplayCompatHelperApi28.INSTANCE;
            if (i10 == displayCompatHelperApi28.safeInsetLeft(cutoutForDisplay)) {
                rect.left = 0;
            }
            if (point.x - rect.right == displayCompatHelperApi28.safeInsetRight(cutoutForDisplay)) {
                rect.right += displayCompatHelperApi28.safeInsetRight(cutoutForDisplay);
            }
            if (rect.top == displayCompatHelperApi28.safeInsetTop(cutoutForDisplay)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == displayCompatHelperApi28.safeInsetBottom(cutoutForDisplay)) {
                rect.bottom += displayCompatHelperApi28.safeInsetBottom(cutoutForDisplay);
            }
        }
        return rect;
    }

    @RequiresApi(29)
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect computeWindowBoundsQ$window_release(Activity activity) {
        AbstractC3292y.i(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            if (invoke != null) {
                return new Rect((Rect) invoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException e8) {
            Log.w(TAG, e8);
            return computeWindowBoundsP$window_release(activity);
        } catch (NoSuchFieldException e9) {
            Log.w(TAG, e9);
            return computeWindowBoundsP$window_release(activity);
        } catch (NoSuchMethodException e10) {
            Log.w(TAG, e10);
            return computeWindowBoundsP$window_release(activity);
        } catch (InvocationTargetException e11) {
            Log.w(TAG, e11);
            return computeWindowBoundsP$window_release(activity);
        }
    }

    @RequiresApi(14)
    @VisibleForTesting
    public final Point getRealSizeForDisplay$window_release(Display display) {
        AbstractC3292y.i(display, "display");
        Point point = new Point();
        DisplayCompatHelperApi17.INSTANCE.getRealSize(display, point);
        return point;
    }
}
