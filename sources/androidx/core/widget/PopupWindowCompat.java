package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class PopupWindowCompat {
    private static final String TAG = "PopupWindowCompatApi21";
    private static Method sGetWindowLayoutTypeMethod;
    private static boolean sGetWindowLayoutTypeMethodAttempted;
    private static Field sOverlapAnchorField;
    private static boolean sOverlapAnchorFieldAttempted;
    private static Method sSetWindowLayoutTypeMethod;
    private static boolean sSetWindowLayoutTypeMethodAttempted;

    @RequiresApi(23)
    /* loaded from: classes3.dex */
    static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        static boolean getOverlapAnchor(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        @DoNotInline
        static int getWindowLayoutType(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        @DoNotInline
        static void setOverlapAnchor(PopupWindow popupWindow, boolean z8) {
            popupWindow.setOverlapAnchor(z8);
        }

        @DoNotInline
        static void setWindowLayoutType(PopupWindow popupWindow, int i8) {
            popupWindow.setWindowLayoutType(i8);
        }
    }

    private PopupWindowCompat() {
    }

    public static boolean getOverlapAnchor(@NonNull PopupWindow popupWindow) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getOverlapAnchor(popupWindow);
        }
        if (!sOverlapAnchorFieldAttempted) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                sOverlapAnchorField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e8) {
                Log.i(TAG, "Could not fetch mOverlapAnchor field from PopupWindow", e8);
            }
            sOverlapAnchorFieldAttempted = true;
        }
        Field field = sOverlapAnchorField;
        if (field != null) {
            try {
                return ((Boolean) field.get(popupWindow)).booleanValue();
            } catch (IllegalAccessException e9) {
                Log.i(TAG, "Could not get overlap anchor field in PopupWindow", e9);
                return false;
            }
        }
        return false;
    }

    public static int getWindowLayoutType(@NonNull PopupWindow popupWindow) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getWindowLayoutType(popupWindow);
        }
        if (!sGetWindowLayoutTypeMethodAttempted) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("getWindowLayoutType", null);
                sGetWindowLayoutTypeMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            sGetWindowLayoutTypeMethodAttempted = true;
        }
        Method method = sGetWindowLayoutTypeMethod;
        if (method != null) {
            try {
                return ((Integer) method.invoke(popupWindow, null)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    public static void setOverlapAnchor(@NonNull PopupWindow popupWindow, boolean z8) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setOverlapAnchor(popupWindow, z8);
            return;
        }
        if (!sOverlapAnchorFieldAttempted) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                sOverlapAnchorField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e8) {
                Log.i(TAG, "Could not fetch mOverlapAnchor field from PopupWindow", e8);
            }
            sOverlapAnchorFieldAttempted = true;
        }
        Field field = sOverlapAnchorField;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z8));
            } catch (IllegalAccessException e9) {
                Log.i(TAG, "Could not set overlap anchor field in PopupWindow", e9);
            }
        }
    }

    public static void setWindowLayoutType(@NonNull PopupWindow popupWindow, int i8) {
        if (Build.VERSION.SDK_INT >= 23) {
            Api23Impl.setWindowLayoutType(popupWindow, i8);
            return;
        }
        if (!sSetWindowLayoutTypeMethodAttempted) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                sSetWindowLayoutTypeMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            sSetWindowLayoutTypeMethodAttempted = true;
        }
        Method method = sSetWindowLayoutTypeMethod;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i8));
            } catch (Exception unused2) {
            }
        }
    }

    public static void showAsDropDown(@NonNull PopupWindow popupWindow, @NonNull View view, int i8, int i9, int i10) {
        popupWindow.showAsDropDown(view, i8, i9, i10);
    }
}
