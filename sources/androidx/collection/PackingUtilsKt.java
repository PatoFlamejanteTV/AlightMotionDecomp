package androidx.collection;

/* loaded from: classes.dex */
public final class PackingUtilsKt {
    public static final long packFloats(float f8, float f9) {
        return (Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
    }

    public static final long packInts(int i8, int i9) {
        return (i9 & 4294967295L) | (i8 << 32);
    }
}
