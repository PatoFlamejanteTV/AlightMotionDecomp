package androidx.collection;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LongSetKt {
    private static final MutableLongSet EmptyLongSet = new MutableLongSet(0);
    private static final long[] EmptyLongArray = new long[0];

    public static final LongSet emptyLongSet() {
        return EmptyLongSet;
    }

    public static final long[] getEmptyLongArray() {
        return EmptyLongArray;
    }

    public static final int hash(long j8) {
        int a9 = a.a(j8) * ScatterMapKt.MurmurHashC1;
        return a9 ^ (a9 << 16);
    }

    public static final LongSet longSetOf() {
        return EmptyLongSet;
    }

    public static final MutableLongSet mutableLongSetOf() {
        return new MutableLongSet(0, 1, null);
    }

    public static final LongSet longSetOf(long j8) {
        return mutableLongSetOf(j8);
    }

    public static final MutableLongSet mutableLongSetOf(long j8) {
        MutableLongSet mutableLongSet = new MutableLongSet(1);
        mutableLongSet.plusAssign(j8);
        return mutableLongSet;
    }

    public static final LongSet longSetOf(long j8, long j9) {
        return mutableLongSetOf(j8, j9);
    }

    public static final LongSet longSetOf(long j8, long j9, long j10) {
        return mutableLongSetOf(j8, j9, j10);
    }

    public static final MutableLongSet mutableLongSetOf(long j8, long j9) {
        MutableLongSet mutableLongSet = new MutableLongSet(2);
        mutableLongSet.plusAssign(j8);
        mutableLongSet.plusAssign(j9);
        return mutableLongSet;
    }

    public static final LongSet longSetOf(long... elements) {
        AbstractC3292y.i(elements, "elements");
        MutableLongSet mutableLongSet = new MutableLongSet(elements.length);
        mutableLongSet.plusAssign(elements);
        return mutableLongSet;
    }

    public static final MutableLongSet mutableLongSetOf(long j8, long j9, long j10) {
        MutableLongSet mutableLongSet = new MutableLongSet(3);
        mutableLongSet.plusAssign(j8);
        mutableLongSet.plusAssign(j9);
        mutableLongSet.plusAssign(j10);
        return mutableLongSet;
    }

    public static final MutableLongSet mutableLongSetOf(long... elements) {
        AbstractC3292y.i(elements, "elements");
        MutableLongSet mutableLongSet = new MutableLongSet(elements.length);
        mutableLongSet.plusAssign(elements);
        return mutableLongSet;
    }
}
