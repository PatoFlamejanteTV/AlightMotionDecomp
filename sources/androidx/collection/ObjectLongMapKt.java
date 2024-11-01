package androidx.collection;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ObjectLongMapKt {
    private static final MutableObjectLongMap<Object> EmptyObjectLongMap = new MutableObjectLongMap<>(0);

    public static final <K> ObjectLongMap<K> emptyObjectLongMap() {
        MutableObjectLongMap<Object> mutableObjectLongMap = EmptyObjectLongMap;
        AbstractC3292y.g(mutableObjectLongMap, "null cannot be cast to non-null type androidx.collection.ObjectLongMap<K of androidx.collection.ObjectLongMapKt.emptyObjectLongMap>");
        return mutableObjectLongMap;
    }

    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf() {
        return new MutableObjectLongMap<>(0, 1, null);
    }

    public static final <K> ObjectLongMap<K> objectLongMap() {
        MutableObjectLongMap<Object> mutableObjectLongMap = EmptyObjectLongMap;
        AbstractC3292y.g(mutableObjectLongMap, "null cannot be cast to non-null type androidx.collection.ObjectLongMap<K of androidx.collection.ObjectLongMapKt.objectLongMap>");
        return mutableObjectLongMap;
    }

    public static final <K> ObjectLongMap<K> objectLongMapOf(K k8, long j8) {
        MutableObjectLongMap mutableObjectLongMap = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap.set(k8, j8);
        return mutableObjectLongMap;
    }

    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf(K k8, long j8) {
        MutableObjectLongMap<K> mutableObjectLongMap = new MutableObjectLongMap<>(0, 1, null);
        mutableObjectLongMap.set(k8, j8);
        return mutableObjectLongMap;
    }

    public static final <K> ObjectLongMap<K> objectLongMapOf(K k8, long j8, K k9, long j9) {
        MutableObjectLongMap mutableObjectLongMap = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap.set(k8, j8);
        mutableObjectLongMap.set(k9, j9);
        return mutableObjectLongMap;
    }

    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf(K k8, long j8, K k9, long j9) {
        MutableObjectLongMap<K> mutableObjectLongMap = new MutableObjectLongMap<>(0, 1, null);
        mutableObjectLongMap.set(k8, j8);
        mutableObjectLongMap.set(k9, j9);
        return mutableObjectLongMap;
    }

    public static final <K> ObjectLongMap<K> objectLongMapOf(K k8, long j8, K k9, long j9, K k10, long j10) {
        MutableObjectLongMap mutableObjectLongMap = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap.set(k8, j8);
        mutableObjectLongMap.set(k9, j9);
        mutableObjectLongMap.set(k10, j10);
        return mutableObjectLongMap;
    }

    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf(K k8, long j8, K k9, long j9, K k10, long j10) {
        MutableObjectLongMap<K> mutableObjectLongMap = new MutableObjectLongMap<>(0, 1, null);
        mutableObjectLongMap.set(k8, j8);
        mutableObjectLongMap.set(k9, j9);
        mutableObjectLongMap.set(k10, j10);
        return mutableObjectLongMap;
    }

    public static final <K> ObjectLongMap<K> objectLongMapOf(K k8, long j8, K k9, long j9, K k10, long j10, K k11, long j11) {
        MutableObjectLongMap mutableObjectLongMap = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap.set(k8, j8);
        mutableObjectLongMap.set(k9, j9);
        mutableObjectLongMap.set(k10, j10);
        mutableObjectLongMap.set(k11, j11);
        return mutableObjectLongMap;
    }

    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf(K k8, long j8, K k9, long j9, K k10, long j10, K k11, long j11) {
        MutableObjectLongMap<K> mutableObjectLongMap = new MutableObjectLongMap<>(0, 1, null);
        mutableObjectLongMap.set(k8, j8);
        mutableObjectLongMap.set(k9, j9);
        mutableObjectLongMap.set(k10, j10);
        mutableObjectLongMap.set(k11, j11);
        return mutableObjectLongMap;
    }

    public static final <K> ObjectLongMap<K> objectLongMapOf(K k8, long j8, K k9, long j9, K k10, long j10, K k11, long j11, K k12, long j12) {
        MutableObjectLongMap mutableObjectLongMap = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap.set(k8, j8);
        mutableObjectLongMap.set(k9, j9);
        mutableObjectLongMap.set(k10, j10);
        mutableObjectLongMap.set(k11, j11);
        mutableObjectLongMap.set(k12, j12);
        return mutableObjectLongMap;
    }

    public static final <K> MutableObjectLongMap<K> mutableObjectLongMapOf(K k8, long j8, K k9, long j9, K k10, long j10, K k11, long j11, K k12, long j12) {
        MutableObjectLongMap<K> mutableObjectLongMap = new MutableObjectLongMap<>(0, 1, null);
        mutableObjectLongMap.set(k8, j8);
        mutableObjectLongMap.set(k9, j9);
        mutableObjectLongMap.set(k10, j10);
        mutableObjectLongMap.set(k11, j11);
        mutableObjectLongMap.set(k12, j12);
        return mutableObjectLongMap;
    }
}
