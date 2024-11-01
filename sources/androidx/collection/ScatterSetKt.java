package androidx.collection;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ScatterSetKt {
    private static final MutableScatterSet<Object> EmptyScatterSet = new MutableScatterSet<>(0);

    public static final <E> ScatterSet<E> emptyScatterSet() {
        MutableScatterSet<Object> mutableScatterSet = EmptyScatterSet;
        AbstractC3292y.g(mutableScatterSet, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf() {
        return new MutableScatterSet<>(0, 1, null);
    }

    public static final <E> ScatterSet<E> scatterSetOf() {
        MutableScatterSet<Object> mutableScatterSet = EmptyScatterSet;
        AbstractC3292y.g(mutableScatterSet, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.scatterSetOf>");
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e8) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(1);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e8);
        return mutableScatterSet;
    }

    public static final <E> ScatterSet<E> scatterSetOf(E e8) {
        return mutableScatterSetOf(e8);
    }

    public static final <E> ScatterSet<E> scatterSetOf(E e8, E e9) {
        return mutableScatterSetOf(e8, e9);
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e8, E e9) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(2);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e8);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e9);
        return mutableScatterSet;
    }

    public static final <E> ScatterSet<E> scatterSetOf(E e8, E e9, E e10) {
        return mutableScatterSetOf(e8, e9, e10);
    }

    public static final <E> ScatterSet<E> scatterSetOf(E... elements) {
        AbstractC3292y.i(elements, "elements");
        MutableScatterSet mutableScatterSet = new MutableScatterSet(elements.length);
        mutableScatterSet.plusAssign((Object[]) elements);
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e8, E e9, E e10) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(3);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e8);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e9);
        mutableScatterSet.plusAssign((MutableScatterSet<E>) e10);
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E... elements) {
        AbstractC3292y.i(elements, "elements");
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(elements.length);
        mutableScatterSet.plusAssign((Object[]) elements);
        return mutableScatterSet;
    }
}
