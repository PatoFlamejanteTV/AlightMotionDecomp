package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class ProcessCompat {

    /* loaded from: classes3.dex */
    static class Api19Impl {
        private static Method sMethodUserHandleIsAppMethod;
        private static boolean sResolved;
        private static final Object sResolvedLock = new Object();

        private Api19Impl() {
        }

        @SuppressLint({"DiscouragedPrivateApi"})
        static boolean isApplicationUid(int i8) {
            try {
                synchronized (sResolvedLock) {
                    try {
                        if (!sResolved) {
                            sResolved = true;
                            sMethodUserHandleIsAppMethod = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                        }
                    } finally {
                    }
                }
                Method method = sMethodUserHandleIsAppMethod;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i8));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            return true;
        }
    }

    @RequiresApi(24)
    /* loaded from: classes3.dex */
    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean isApplicationUid(int i8) {
            return Process.isApplicationUid(i8);
        }
    }

    private ProcessCompat() {
    }

    public static boolean isApplicationUid(int i8) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.isApplicationUid(i8);
        }
        return Api19Impl.isApplicationUid(i8);
    }
}
