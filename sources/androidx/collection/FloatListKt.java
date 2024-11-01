package androidx.collection;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class FloatListKt {
    private static final FloatList EmptyFloatList = new MutableFloatList(0);

    public static final FloatList emptyFloatList() {
        return EmptyFloatList;
    }

    public static final FloatList floatListOf() {
        return EmptyFloatList;
    }

    public static final MutableFloatList mutableFloatListOf() {
        return new MutableFloatList(0, 1, null);
    }

    public static final FloatList floatListOf(float f8) {
        return mutableFloatListOf(f8);
    }

    public static final MutableFloatList mutableFloatListOf(float f8) {
        MutableFloatList mutableFloatList = new MutableFloatList(1);
        mutableFloatList.add(f8);
        return mutableFloatList;
    }

    public static final FloatList floatListOf(float f8, float f9) {
        return mutableFloatListOf(f8, f9);
    }

    public static final FloatList floatListOf(float f8, float f9, float f10) {
        return mutableFloatListOf(f8, f9, f10);
    }

    public static final MutableFloatList mutableFloatListOf(float f8, float f9) {
        MutableFloatList mutableFloatList = new MutableFloatList(2);
        mutableFloatList.add(f8);
        mutableFloatList.add(f9);
        return mutableFloatList;
    }

    public static final FloatList floatListOf(float... elements) {
        AbstractC3292y.i(elements, "elements");
        MutableFloatList mutableFloatList = new MutableFloatList(elements.length);
        mutableFloatList.plusAssign(elements);
        return mutableFloatList;
    }

    public static final MutableFloatList mutableFloatListOf(float f8, float f9, float f10) {
        MutableFloatList mutableFloatList = new MutableFloatList(3);
        mutableFloatList.add(f8);
        mutableFloatList.add(f9);
        mutableFloatList.add(f10);
        return mutableFloatList;
    }

    public static final MutableFloatList mutableFloatListOf(float... elements) {
        AbstractC3292y.i(elements, "elements");
        MutableFloatList mutableFloatList = new MutableFloatList(elements.length);
        mutableFloatList.plusAssign(elements);
        return mutableFloatList;
    }
}
