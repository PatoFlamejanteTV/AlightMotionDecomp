package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(21)
@SuppressLint({"SoonBlockedPrivateApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class WeightTypefaceApi21 {
    private static final String NATIVE_CREATE_FROM_TYPEFACE_METHOD = "nativeCreateFromTypeface";
    private static final String NATIVE_CREATE_WEIGHT_ALIAS_METHOD = "nativeCreateWeightAlias";
    private static final String NATIVE_INSTANCE_FIELD = "native_instance";
    private static final String TAG = "WeightTypeface";
    private static final Constructor<Typeface> sConstructor;
    private static final Method sNativeCreateFromTypeface;
    private static final Method sNativeCreateWeightAlias;
    private static final Field sNativeInstance;
    private static final Object sWeightCacheLock;

    @GuardedBy("sWeightCacheLock")
    private static final LongSparseArray<SparseArray<Typeface>> sWeightTypefaceCache;

    static {
        Field field;
        Method method;
        Constructor<Typeface> constructor;
        Method method2;
        try {
            field = Typeface.class.getDeclaredField(NATIVE_INSTANCE_FIELD);
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            method2 = Typeface.class.getDeclaredMethod(NATIVE_CREATE_FROM_TYPEFACE_METHOD, cls, cls2);
            method2.setAccessible(true);
            method = Typeface.class.getDeclaredMethod(NATIVE_CREATE_WEIGHT_ALIAS_METHOD, cls, cls2);
            method.setAccessible(true);
            constructor = Typeface.class.getDeclaredConstructor(cls);
            constructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e8) {
            Log.e(TAG, e8.getClass().getName(), e8);
            field = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        sNativeInstance = field;
        sNativeCreateFromTypeface = method2;
        sNativeCreateWeightAlias = method;
        sConstructor = constructor;
        sWeightTypefaceCache = new LongSparseArray<>(3);
        sWeightCacheLock = new Object();
    }

    private WeightTypefaceApi21() {
    }

    @Nullable
    private static Typeface create(long j8) {
        try {
            return sConstructor.newInstance(Long.valueOf(j8));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static Typeface createWeightStyle(@NonNull Typeface typeface, int i8, boolean z8) {
        Typeface create;
        if (!isPrivateApiAvailable()) {
            return null;
        }
        int i9 = (i8 << 1) | (z8 ? 1 : 0);
        synchronized (sWeightCacheLock) {
            try {
                long nativeInstance = getNativeInstance(typeface);
                LongSparseArray<SparseArray<Typeface>> longSparseArray = sWeightTypefaceCache;
                SparseArray<Typeface> sparseArray = longSparseArray.get(nativeInstance);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>(4);
                    longSparseArray.put(nativeInstance, sparseArray);
                } else {
                    Typeface typeface2 = sparseArray.get(i9);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                if (z8 == typeface.isItalic()) {
                    create = create(nativeCreateWeightAlias(nativeInstance, i8));
                } else {
                    create = create(nativeCreateFromTypefaceWithExactStyle(nativeInstance, i8, z8));
                }
                sparseArray.put(i9, create);
                return create;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static long getNativeInstance(@NonNull Typeface typeface) {
        try {
            return sNativeInstance.getLong(typeface);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        }
    }

    private static boolean isPrivateApiAvailable() {
        if (sNativeInstance != null) {
            return true;
        }
        return false;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static long nativeCreateFromTypefaceWithExactStyle(long j8, int i8, boolean z8) {
        int i9;
        if (z8) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        try {
            Long l8 = (Long) sNativeCreateFromTypeface.invoke(null, Long.valueOf(j8), Integer.valueOf(i9));
            l8.longValue();
            return ((Long) sNativeCreateWeightAlias.invoke(null, l8, Integer.valueOf(i8))).longValue();
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static long nativeCreateWeightAlias(long j8, int i8) {
        try {
            return ((Long) sNativeCreateWeightAlias.invoke(null, Long.valueOf(j8), Integer.valueOf(i8))).longValue();
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }
}
