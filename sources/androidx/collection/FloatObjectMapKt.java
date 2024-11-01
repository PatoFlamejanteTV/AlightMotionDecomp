package androidx.collection;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class FloatObjectMapKt {
    private static final MutableFloatObjectMap EmptyFloatObjectMap = new MutableFloatObjectMap(0);

    public static final <V> FloatObjectMap<V> emptyFloatObjectMap() {
        MutableFloatObjectMap mutableFloatObjectMap = EmptyFloatObjectMap;
        AbstractC3292y.g(mutableFloatObjectMap, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.emptyFloatObjectMap>");
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf() {
        MutableFloatObjectMap mutableFloatObjectMap = EmptyFloatObjectMap;
        AbstractC3292y.g(mutableFloatObjectMap, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.floatObjectMapOf>");
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf() {
        return new MutableFloatObjectMap<>(0, 1, null);
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f8, V v8) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f8, v8);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f8, V v8) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f8, v8);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f8, V v8, float f9, V v9) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f8, v8);
        mutableFloatObjectMap.set(f9, v9);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f8, V v8, float f9, V v9) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f8, v8);
        mutableFloatObjectMap.set(f9, v9);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f8, V v8, float f9, V v9, float f10, V v10) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f8, v8);
        mutableFloatObjectMap.set(f9, v9);
        mutableFloatObjectMap.set(f10, v10);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f8, V v8, float f9, V v9, float f10, V v10) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f8, v8);
        mutableFloatObjectMap.set(f9, v9);
        mutableFloatObjectMap.set(f10, v10);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f8, V v8, float f9, V v9, float f10, V v10, float f11, V v11) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f8, v8);
        mutableFloatObjectMap.set(f9, v9);
        mutableFloatObjectMap.set(f10, v10);
        mutableFloatObjectMap.set(f11, v11);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f8, V v8, float f9, V v9, float f10, V v10, float f11, V v11) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f8, v8);
        mutableFloatObjectMap.set(f9, v9);
        mutableFloatObjectMap.set(f10, v10);
        mutableFloatObjectMap.set(f11, v11);
        return mutableFloatObjectMap;
    }

    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f8, V v8, float f9, V v9, float f10, V v10, float f11, V v11, float f12, V v12) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f8, v8);
        mutableFloatObjectMap.set(f9, v9);
        mutableFloatObjectMap.set(f10, v10);
        mutableFloatObjectMap.set(f11, v11);
        mutableFloatObjectMap.set(f12, v12);
        return mutableFloatObjectMap;
    }

    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f8, V v8, float f9, V v9, float f10, V v10, float f11, V v11, float f12, V v12) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f8, v8);
        mutableFloatObjectMap.set(f9, v9);
        mutableFloatObjectMap.set(f10, v10);
        mutableFloatObjectMap.set(f11, v11);
        mutableFloatObjectMap.set(f12, v12);
        return mutableFloatObjectMap;
    }
}
