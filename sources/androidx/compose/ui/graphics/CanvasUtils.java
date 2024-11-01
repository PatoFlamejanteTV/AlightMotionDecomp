package androidx.compose.ui.graphics;

import android.annotation.SuppressLint;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class CanvasUtils {
    public static final CanvasUtils INSTANCE = new CanvasUtils();
    private static Method inorderBarrierMethod;
    private static boolean orderMethodsFetched;
    private static Method reorderBarrierMethod;

    private CanvasUtils() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public final void enableZ(android.graphics.Canvas canvas, boolean z8) {
        Method method;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            CanvasZHelper.INSTANCE.enableZ(canvas, z8);
            return;
        }
        if (!orderMethodsFetched) {
            try {
                if (i8 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    reorderBarrierMethod = (Method) declaredMethod.invoke(android.graphics.Canvas.class, "insertReorderBarrier", new Class[0]);
                    inorderBarrierMethod = (Method) declaredMethod.invoke(android.graphics.Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    reorderBarrierMethod = android.graphics.Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    inorderBarrierMethod = android.graphics.Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = reorderBarrierMethod;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = inorderBarrierMethod;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            orderMethodsFetched = true;
        }
        if (z8) {
            try {
                Method method4 = reorderBarrierMethod;
                if (method4 != null) {
                    AbstractC3292y.f(method4);
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z8 && (method = inorderBarrierMethod) != null) {
            AbstractC3292y.f(method);
            method.invoke(canvas, null);
        }
    }
}
