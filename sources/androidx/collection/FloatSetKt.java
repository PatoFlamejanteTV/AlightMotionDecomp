package androidx.collection;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class FloatSetKt {
    private static final MutableFloatSet EmptyFloatSet = new MutableFloatSet(0);
    private static final float[] EmptyFloatArray = new float[0];

    public static final FloatSet emptyFloatSet() {
        return EmptyFloatSet;
    }

    public static final FloatSet floatSetOf() {
        return EmptyFloatSet;
    }

    public static final float[] getEmptyFloatArray() {
        return EmptyFloatArray;
    }

    public static final int hash(float f8) {
        int floatToIntBits = Float.floatToIntBits(f8) * ScatterMapKt.MurmurHashC1;
        return floatToIntBits ^ (floatToIntBits << 16);
    }

    public static final MutableFloatSet mutableFloatSetOf() {
        return new MutableFloatSet(0, 1, null);
    }

    public static final FloatSet floatSetOf(float f8) {
        return mutableFloatSetOf(f8);
    }

    public static final MutableFloatSet mutableFloatSetOf(float f8) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(1);
        mutableFloatSet.plusAssign(f8);
        return mutableFloatSet;
    }

    public static final FloatSet floatSetOf(float f8, float f9) {
        return mutableFloatSetOf(f8, f9);
    }

    public static final FloatSet floatSetOf(float f8, float f9, float f10) {
        return mutableFloatSetOf(f8, f9, f10);
    }

    public static final MutableFloatSet mutableFloatSetOf(float f8, float f9) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(2);
        mutableFloatSet.plusAssign(f8);
        mutableFloatSet.plusAssign(f9);
        return mutableFloatSet;
    }

    public static final FloatSet floatSetOf(float... elements) {
        AbstractC3292y.i(elements, "elements");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(elements.length);
        mutableFloatSet.plusAssign(elements);
        return mutableFloatSet;
    }

    public static final MutableFloatSet mutableFloatSetOf(float f8, float f9, float f10) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(3);
        mutableFloatSet.plusAssign(f8);
        mutableFloatSet.plusAssign(f9);
        mutableFloatSet.plusAssign(f10);
        return mutableFloatSet;
    }

    public static final MutableFloatSet mutableFloatSetOf(float... elements) {
        AbstractC3292y.i(elements, "elements");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(elements.length);
        mutableFloatSet.plusAssign(elements);
        return mutableFloatSet;
    }
}
