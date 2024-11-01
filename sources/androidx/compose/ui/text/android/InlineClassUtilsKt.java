package androidx.compose.ui.text.android;

/* loaded from: classes.dex */
public final class InlineClassUtilsKt {
    public static final long packInts(int i8, int i9) {
        return (i9 & 4294967295L) | (i8 << 32);
    }

    public static final int unpackInt1(long j8) {
        return (int) (j8 >> 32);
    }

    public static final int unpackInt2(long j8) {
        return (int) (j8 & 4294967295L);
    }
}
