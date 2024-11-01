package androidx.compose.ui.text.style;

/* loaded from: classes.dex */
public final class LineBreak_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int packBytes(int i8, int i9, int i10) {
        return i8 | (i9 << 8) | (i10 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unpackByte1(int i8) {
        return i8 & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unpackByte2(int i8) {
        return (i8 >> 8) & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unpackByte3(int i8) {
        return (i8 >> 16) & 255;
    }
}
