package androidx.collection;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class IntObjectMapKt {
    private static final MutableIntObjectMap EmptyIntObjectMap = new MutableIntObjectMap(0);

    public static final <V> IntObjectMap<V> emptyIntObjectMap() {
        MutableIntObjectMap mutableIntObjectMap = EmptyIntObjectMap;
        AbstractC3292y.g(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
        return mutableIntObjectMap;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf() {
        MutableIntObjectMap mutableIntObjectMap = EmptyIntObjectMap;
        AbstractC3292y.g(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        return mutableIntObjectMap;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf() {
        return new MutableIntObjectMap<>(0, 1, null);
    }

    public static final <V> IntObjectMap<V> intObjectMapOf(int i8, V v8) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i8, v8);
        return mutableIntObjectMap;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i8, V v8) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i8, v8);
        return mutableIntObjectMap;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf(int i8, V v8, int i9, V v9) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i8, v8);
        mutableIntObjectMap.set(i9, v9);
        return mutableIntObjectMap;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i8, V v8, int i9, V v9) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i8, v8);
        mutableIntObjectMap.set(i9, v9);
        return mutableIntObjectMap;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf(int i8, V v8, int i9, V v9, int i10, V v10) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i8, v8);
        mutableIntObjectMap.set(i9, v9);
        mutableIntObjectMap.set(i10, v10);
        return mutableIntObjectMap;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i8, V v8, int i9, V v9, int i10, V v10) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i8, v8);
        mutableIntObjectMap.set(i9, v9);
        mutableIntObjectMap.set(i10, v10);
        return mutableIntObjectMap;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf(int i8, V v8, int i9, V v9, int i10, V v10, int i11, V v11) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i8, v8);
        mutableIntObjectMap.set(i9, v9);
        mutableIntObjectMap.set(i10, v10);
        mutableIntObjectMap.set(i11, v11);
        return mutableIntObjectMap;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i8, V v8, int i9, V v9, int i10, V v10, int i11, V v11) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i8, v8);
        mutableIntObjectMap.set(i9, v9);
        mutableIntObjectMap.set(i10, v10);
        mutableIntObjectMap.set(i11, v11);
        return mutableIntObjectMap;
    }

    public static final <V> IntObjectMap<V> intObjectMapOf(int i8, V v8, int i9, V v9, int i10, V v10, int i11, V v11, int i12, V v12) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i8, v8);
        mutableIntObjectMap.set(i9, v9);
        mutableIntObjectMap.set(i10, v10);
        mutableIntObjectMap.set(i11, v11);
        mutableIntObjectMap.set(i12, v12);
        return mutableIntObjectMap;
    }

    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i8, V v8, int i9, V v9, int i10, V v10, int i11, V v11, int i12, V v12) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i8, v8);
        mutableIntObjectMap.set(i9, v9);
        mutableIntObjectMap.set(i10, v10);
        mutableIntObjectMap.set(i11, v11);
        mutableIntObjectMap.set(i12, v12);
        return mutableIntObjectMap;
    }
}
