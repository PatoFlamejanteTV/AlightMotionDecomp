package androidx.collection;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LongListKt {
    private static final LongList EmptyLongList = new MutableLongList(0);

    public static final LongList emptyLongList() {
        return EmptyLongList;
    }

    public static final LongList longListOf() {
        return EmptyLongList;
    }

    public static final MutableLongList mutableLongListOf() {
        return new MutableLongList(0, 1, null);
    }

    public static final LongList longListOf(long j8) {
        return mutableLongListOf(j8);
    }

    public static final MutableLongList mutableLongListOf(long j8) {
        MutableLongList mutableLongList = new MutableLongList(1);
        mutableLongList.add(j8);
        return mutableLongList;
    }

    public static final LongList longListOf(long j8, long j9) {
        return mutableLongListOf(j8, j9);
    }

    public static final LongList longListOf(long j8, long j9, long j10) {
        return mutableLongListOf(j8, j9, j10);
    }

    public static final MutableLongList mutableLongListOf(long j8, long j9) {
        MutableLongList mutableLongList = new MutableLongList(2);
        mutableLongList.add(j8);
        mutableLongList.add(j9);
        return mutableLongList;
    }

    public static final LongList longListOf(long... elements) {
        AbstractC3292y.i(elements, "elements");
        MutableLongList mutableLongList = new MutableLongList(elements.length);
        mutableLongList.plusAssign(elements);
        return mutableLongList;
    }

    public static final MutableLongList mutableLongListOf(long j8, long j9, long j10) {
        MutableLongList mutableLongList = new MutableLongList(3);
        mutableLongList.add(j8);
        mutableLongList.add(j9);
        mutableLongList.add(j10);
        return mutableLongList;
    }

    public static final MutableLongList mutableLongListOf(long... elements) {
        AbstractC3292y.i(elements, "elements");
        MutableLongList mutableLongList = new MutableLongList(elements.length);
        mutableLongList.plusAssign(elements);
        return mutableLongList;
    }
}
