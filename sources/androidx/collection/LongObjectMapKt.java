package androidx.collection;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LongObjectMapKt {
    private static final MutableLongObjectMap EmptyLongObjectMap = new MutableLongObjectMap(0);

    public static final <V> LongObjectMap<V> emptyLongObjectMap() {
        MutableLongObjectMap mutableLongObjectMap = EmptyLongObjectMap;
        AbstractC3292y.g(mutableLongObjectMap, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        return mutableLongObjectMap;
    }

    public static final <V> LongObjectMap<V> longObjectMapOf() {
        MutableLongObjectMap mutableLongObjectMap = EmptyLongObjectMap;
        AbstractC3292y.g(mutableLongObjectMap, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.longObjectMapOf>");
        return mutableLongObjectMap;
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf() {
        return new MutableLongObjectMap<>(0, 1, null);
    }

    public static final <V> LongObjectMap<V> longObjectMapOf(long j8, V v8) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j8, v8);
        return mutableLongObjectMap;
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j8, V v8) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j8, v8);
        return mutableLongObjectMap;
    }

    public static final <V> LongObjectMap<V> longObjectMapOf(long j8, V v8, long j9, V v9) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j8, v8);
        mutableLongObjectMap.set(j9, v9);
        return mutableLongObjectMap;
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j8, V v8, long j9, V v9) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j8, v8);
        mutableLongObjectMap.set(j9, v9);
        return mutableLongObjectMap;
    }

    public static final <V> LongObjectMap<V> longObjectMapOf(long j8, V v8, long j9, V v9, long j10, V v10) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j8, v8);
        mutableLongObjectMap.set(j9, v9);
        mutableLongObjectMap.set(j10, v10);
        return mutableLongObjectMap;
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j8, V v8, long j9, V v9, long j10, V v10) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j8, v8);
        mutableLongObjectMap.set(j9, v9);
        mutableLongObjectMap.set(j10, v10);
        return mutableLongObjectMap;
    }

    public static final <V> LongObjectMap<V> longObjectMapOf(long j8, V v8, long j9, V v9, long j10, V v10, long j11, V v11) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j8, v8);
        mutableLongObjectMap.set(j9, v9);
        mutableLongObjectMap.set(j10, v10);
        mutableLongObjectMap.set(j11, v11);
        return mutableLongObjectMap;
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j8, V v8, long j9, V v9, long j10, V v10, long j11, V v11) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j8, v8);
        mutableLongObjectMap.set(j9, v9);
        mutableLongObjectMap.set(j10, v10);
        mutableLongObjectMap.set(j11, v11);
        return mutableLongObjectMap;
    }

    public static final <V> LongObjectMap<V> longObjectMapOf(long j8, V v8, long j9, V v9, long j10, V v10, long j11, V v11, long j12, V v12) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j8, v8);
        mutableLongObjectMap.set(j9, v9);
        mutableLongObjectMap.set(j10, v10);
        mutableLongObjectMap.set(j11, v11);
        mutableLongObjectMap.set(j12, v12);
        return mutableLongObjectMap;
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j8, V v8, long j9, V v9, long j10, V v10, long j11, V v11, long j12, V v12) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j8, v8);
        mutableLongObjectMap.set(j9, v9);
        mutableLongObjectMap.set(j10, v10);
        mutableLongObjectMap.set(j11, v11);
        mutableLongObjectMap.set(j12, v12);
        return mutableLongObjectMap;
    }
}
