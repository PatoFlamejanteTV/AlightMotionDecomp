package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
class CanvasUtils {
    private static Method sInorderBarrierMethod;
    private static boolean sOrderMethodsFetched;
    private static Method sReorderBarrierMethod;

    @RequiresApi(29)
    /* loaded from: classes3.dex */
    static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        static void disableZ(Canvas canvas) {
            canvas.disableZ();
        }

        @DoNotInline
        static void enableZ(Canvas canvas) {
            canvas.enableZ();
        }
    }

    private CanvasUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void enableZ(@NonNull Canvas canvas, boolean z8) {
        Method method;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            if (z8) {
                Api29Impl.enableZ(canvas);
                return;
            } else {
                Api29Impl.disableZ(canvas);
                return;
            }
        }
        if (i8 != 28) {
            if (!sOrderMethodsFetched) {
                try {
                    Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    sReorderBarrierMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                    sInorderBarrierMethod = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                sOrderMethodsFetched = true;
            }
            if (z8) {
                try {
                    Method method2 = sReorderBarrierMethod;
                    if (method2 != null) {
                        method2.invoke(canvas, null);
                    }
                } catch (IllegalAccessException unused2) {
                    return;
                } catch (InvocationTargetException e8) {
                    throw new RuntimeException(e8.getCause());
                }
            }
            if (!z8 && (method = sInorderBarrierMethod) != null) {
                method.invoke(canvas, null);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method doesn't work on Pie!");
    }
}
