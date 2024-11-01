package androidx.collection;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class IntListKt {
    private static final IntList EmptyIntList = new MutableIntList(0);

    public static final IntList emptyIntList() {
        return EmptyIntList;
    }

    public static final IntList intListOf() {
        return EmptyIntList;
    }

    public static final MutableIntList mutableIntListOf() {
        return new MutableIntList(0, 1, null);
    }

    public static final IntList intListOf(int i8) {
        return mutableIntListOf(i8);
    }

    public static final MutableIntList mutableIntListOf(int i8) {
        MutableIntList mutableIntList = new MutableIntList(1);
        mutableIntList.add(i8);
        return mutableIntList;
    }

    public static final IntList intListOf(int i8, int i9) {
        return mutableIntListOf(i8, i9);
    }

    public static final IntList intListOf(int i8, int i9, int i10) {
        return mutableIntListOf(i8, i9, i10);
    }

    public static final MutableIntList mutableIntListOf(int i8, int i9) {
        MutableIntList mutableIntList = new MutableIntList(2);
        mutableIntList.add(i8);
        mutableIntList.add(i9);
        return mutableIntList;
    }

    public static final IntList intListOf(int... elements) {
        AbstractC3292y.i(elements, "elements");
        MutableIntList mutableIntList = new MutableIntList(elements.length);
        mutableIntList.plusAssign(elements);
        return mutableIntList;
    }

    public static final MutableIntList mutableIntListOf(int i8, int i9, int i10) {
        MutableIntList mutableIntList = new MutableIntList(3);
        mutableIntList.add(i8);
        mutableIntList.add(i9);
        mutableIntList.add(i10);
        return mutableIntList;
    }

    public static final MutableIntList mutableIntListOf(int... elements) {
        AbstractC3292y.i(elements, "elements");
        MutableIntList mutableIntList = new MutableIntList(elements.length);
        mutableIntList.plusAssign(elements);
        return mutableIntList;
    }
}
