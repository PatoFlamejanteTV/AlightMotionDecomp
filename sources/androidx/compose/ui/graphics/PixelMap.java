package androidx.compose.ui.graphics;

import androidx.annotation.IntRange;

/* loaded from: classes.dex */
public final class PixelMap {
    private final int[] buffer;
    private final int bufferOffset;
    private final int height;
    private final int stride;
    private final int width;

    public PixelMap(int[] iArr, int i8, int i9, int i10, int i11) {
        this.buffer = iArr;
        this.width = i8;
        this.height = i9;
        this.bufferOffset = i10;
        this.stride = i11;
    }

    /* renamed from: get-WaAFU9c, reason: not valid java name */
    public final long m3222getWaAFU9c(@IntRange(from = 0) int i8, @IntRange(from = 0) int i9) {
        return ColorKt.Color(this.buffer[this.bufferOffset + (i9 * this.stride) + i8]);
    }

    public final int[] getBuffer() {
        return this.buffer;
    }

    public final int getBufferOffset() {
        return this.bufferOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getStride() {
        return this.stride;
    }

    public final int getWidth() {
        return this.width;
    }
}
