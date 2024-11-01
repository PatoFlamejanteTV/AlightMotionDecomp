package androidx.collection;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class IntSetKt {
    private static final MutableIntSet EmptyIntSet = new MutableIntSet(0);
    private static final int[] EmptyIntArray = new int[0];

    public static final IntSet emptyIntSet() {
        return EmptyIntSet;
    }

    public static final int[] getEmptyIntArray() {
        return EmptyIntArray;
    }

    public static final int hash(int i8) {
        int i9 = i8 * ScatterMapKt.MurmurHashC1;
        return i9 ^ (i9 << 16);
    }

    public static final IntSet intSetOf() {
        return EmptyIntSet;
    }

    public static final MutableIntSet mutableIntSetOf() {
        return new MutableIntSet(0, 1, null);
    }

    public static final IntSet intSetOf(int i8) {
        return mutableIntSetOf(i8);
    }

    public static final MutableIntSet mutableIntSetOf(int i8) {
        MutableIntSet mutableIntSet = new MutableIntSet(1);
        mutableIntSet.plusAssign(i8);
        return mutableIntSet;
    }

    public static final IntSet intSetOf(int i8, int i9) {
        return mutableIntSetOf(i8, i9);
    }

    public static final IntSet intSetOf(int i8, int i9, int i10) {
        return mutableIntSetOf(i8, i9, i10);
    }

    public static final MutableIntSet mutableIntSetOf(int i8, int i9) {
        MutableIntSet mutableIntSet = new MutableIntSet(2);
        mutableIntSet.plusAssign(i8);
        mutableIntSet.plusAssign(i9);
        return mutableIntSet;
    }

    public static final IntSet intSetOf(int... elements) {
        AbstractC3292y.i(elements, "elements");
        MutableIntSet mutableIntSet = new MutableIntSet(elements.length);
        mutableIntSet.plusAssign(elements);
        return mutableIntSet;
    }

    public static final MutableIntSet mutableIntSetOf(int i8, int i9, int i10) {
        MutableIntSet mutableIntSet = new MutableIntSet(3);
        mutableIntSet.plusAssign(i8);
        mutableIntSet.plusAssign(i9);
        mutableIntSet.plusAssign(i10);
        return mutableIntSet;
    }

    public static final MutableIntSet mutableIntSetOf(int... elements) {
        AbstractC3292y.i(elements, "elements");
        MutableIntSet mutableIntSet = new MutableIntSet(elements.length);
        mutableIntSet.plusAssign(elements);
        return mutableIntSet;
    }
}
