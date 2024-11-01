package androidx.core.os;

import android.os.Build;
import android.os.UserHandle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class UserHandleCompat {

    @Nullable
    private static Method sGetUserIdMethod;

    @Nullable
    private static Constructor<UserHandle> sUserHandleConstructor;

    @RequiresApi(24)
    /* loaded from: classes3.dex */
    private static class Api24Impl {
        private Api24Impl() {
        }

        @NonNull
        static UserHandle getUserHandleForUid(int i8) {
            return UserHandle.getUserHandleForUid(i8);
        }
    }

    private UserHandleCompat() {
    }

    private static Method getGetUserIdMethod() throws NoSuchMethodException {
        if (sGetUserIdMethod == null) {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("getUserId", Integer.TYPE);
            sGetUserIdMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return sGetUserIdMethod;
    }

    private static Constructor<UserHandle> getUserHandleConstructor() throws NoSuchMethodException {
        if (sUserHandleConstructor == null) {
            Constructor<UserHandle> declaredConstructor = UserHandle.class.getDeclaredConstructor(Integer.TYPE);
            sUserHandleConstructor = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return sUserHandleConstructor;
    }

    @NonNull
    public static UserHandle getUserHandleForUid(int i8) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.getUserHandleForUid(i8);
        }
        try {
            return getUserHandleConstructor().newInstance((Integer) getGetUserIdMethod().invoke(null, Integer.valueOf(i8)));
        } catch (IllegalAccessException e8) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e8);
            throw illegalAccessError;
        } catch (InstantiationException e9) {
            InstantiationError instantiationError = new InstantiationError();
            instantiationError.initCause(e9);
            throw instantiationError;
        } catch (NoSuchMethodException e10) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e10);
            throw noSuchMethodError;
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
