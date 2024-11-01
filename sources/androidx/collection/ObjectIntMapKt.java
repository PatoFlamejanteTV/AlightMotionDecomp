package androidx.collection;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ObjectIntMapKt {
    private static final MutableObjectIntMap<Object> EmptyObjectIntMap = new MutableObjectIntMap<>(0);

    public static final <K> ObjectIntMap<K> emptyObjectIntMap() {
        MutableObjectIntMap<Object> mutableObjectIntMap = EmptyObjectIntMap;
        AbstractC3292y.g(mutableObjectIntMap, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        return mutableObjectIntMap;
    }

    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf() {
        return new MutableObjectIntMap<>(0, 1, null);
    }

    public static final <K> ObjectIntMap<K> objectIntMap() {
        MutableObjectIntMap<Object> mutableObjectIntMap = EmptyObjectIntMap;
        AbstractC3292y.g(mutableObjectIntMap, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.objectIntMap>");
        return mutableObjectIntMap;
    }

    public static final <K> ObjectIntMap<K> objectIntMapOf(K k8, int i8) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k8, i8);
        return mutableObjectIntMap;
    }

    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k8, int i8) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k8, i8);
        return mutableObjectIntMap;
    }

    public static final <K> ObjectIntMap<K> objectIntMapOf(K k8, int i8, K k9, int i9) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k8, i8);
        mutableObjectIntMap.set(k9, i9);
        return mutableObjectIntMap;
    }

    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k8, int i8, K k9, int i9) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k8, i8);
        mutableObjectIntMap.set(k9, i9);
        return mutableObjectIntMap;
    }

    public static final <K> ObjectIntMap<K> objectIntMapOf(K k8, int i8, K k9, int i9, K k10, int i10) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k8, i8);
        mutableObjectIntMap.set(k9, i9);
        mutableObjectIntMap.set(k10, i10);
        return mutableObjectIntMap;
    }

    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k8, int i8, K k9, int i9, K k10, int i10) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k8, i8);
        mutableObjectIntMap.set(k9, i9);
        mutableObjectIntMap.set(k10, i10);
        return mutableObjectIntMap;
    }

    public static final <K> ObjectIntMap<K> objectIntMapOf(K k8, int i8, K k9, int i9, K k10, int i10, K k11, int i11) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k8, i8);
        mutableObjectIntMap.set(k9, i9);
        mutableObjectIntMap.set(k10, i10);
        mutableObjectIntMap.set(k11, i11);
        return mutableObjectIntMap;
    }

    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k8, int i8, K k9, int i9, K k10, int i10, K k11, int i11) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k8, i8);
        mutableObjectIntMap.set(k9, i9);
        mutableObjectIntMap.set(k10, i10);
        mutableObjectIntMap.set(k11, i11);
        return mutableObjectIntMap;
    }

    public static final <K> ObjectIntMap<K> objectIntMapOf(K k8, int i8, K k9, int i9, K k10, int i10, K k11, int i11, K k12, int i12) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k8, i8);
        mutableObjectIntMap.set(k9, i9);
        mutableObjectIntMap.set(k10, i10);
        mutableObjectIntMap.set(k11, i11);
        mutableObjectIntMap.set(k12, i12);
        return mutableObjectIntMap;
    }

    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k8, int i8, K k9, int i9, K k10, int i10, K k11, int i11, K k12, int i12) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k8, i8);
        mutableObjectIntMap.set(k9, i9);
        mutableObjectIntMap.set(k10, i10);
        mutableObjectIntMap.set(k11, i11);
        mutableObjectIntMap.set(k12, i12);
        return mutableObjectIntMap;
    }
}
