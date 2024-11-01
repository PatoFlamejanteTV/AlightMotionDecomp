package com.mbridge.msdk.thrid.okhttp.internal.platform;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
class OptionalMethod<T> {
    private final String methodName;
    private final Class[] methodParams;
    private final Class<?> returnType;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OptionalMethod(Class<?> cls, String str, Class... clsArr) {
        this.returnType = cls;
        this.methodName = str;
        this.methodParams = clsArr;
    }

    private Method getMethod(Class<?> cls) {
        Class<?> cls2;
        String str = this.methodName;
        if (str == null) {
            return null;
        }
        Method publicMethod = getPublicMethod(cls, str, this.methodParams);
        if (publicMethod != null && (cls2 = this.returnType) != null && !cls2.isAssignableFrom(publicMethod.getReturnType())) {
            return null;
        }
        return publicMethod;
    }

    private static Method getPublicMethod(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    public Object invoke(T t8, Object... objArr) throws InvocationTargetException {
        Method method = getMethod(t8.getClass());
        if (method != null) {
            try {
                return method.invoke(t8, objArr);
            } catch (IllegalAccessException e8) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + method);
                assertionError.initCause(e8);
                throw assertionError;
            }
        }
        throw new AssertionError("Method " + this.methodName + " not supported for object " + t8);
    }

    public Object invokeOptional(T t8, Object... objArr) throws InvocationTargetException {
        Method method = getMethod(t8.getClass());
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(t8, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public Object invokeOptionalWithoutCheckedException(T t8, Object... objArr) {
        try {
            return invokeOptional(t8, objArr);
        } catch (InvocationTargetException e8) {
            Throwable targetException = e8.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public Object invokeWithoutCheckedException(T t8, Object... objArr) {
        try {
            return invoke(t8, objArr);
        } catch (InvocationTargetException e8) {
            Throwable targetException = e8.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public boolean isSupported(T t8) {
        if (getMethod(t8.getClass()) != null) {
            return true;
        }
        return false;
    }
}
