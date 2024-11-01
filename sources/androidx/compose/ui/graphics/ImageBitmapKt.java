package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;

/* loaded from: classes.dex */
public final class ImageBitmapKt {
    /* renamed from: ImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m3153ImageBitmapx__hDU(int i8, int i9, int i10, boolean z8, ColorSpace colorSpace) {
        return AndroidImageBitmap_androidKt.m2822ActualImageBitmapx__hDU(i8, i9, i10, z8, colorSpace);
    }

    /* renamed from: ImageBitmap-x__-hDU$default, reason: not valid java name */
    public static /* synthetic */ ImageBitmap m3154ImageBitmapx__hDU$default(int i8, int i9, int i10, boolean z8, ColorSpace colorSpace, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = ImageBitmapConfig.Companion.m3149getArgb8888_sVssgQ();
        }
        if ((i11 & 8) != 0) {
            z8 = true;
        }
        if ((i11 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return m3153ImageBitmapx__hDU(i8, i9, i10, z8, colorSpace);
    }

    public static final PixelMap toPixelMap(ImageBitmap imageBitmap, int i8, int i9, int i10, int i11, int[] iArr, int i12, int i13) {
        imageBitmap.readPixels(iArr, i8, i9, i10, i11, i12, i13);
        return new PixelMap(iArr, i10, i11, i12, i13);
    }

    public static /* synthetic */ PixelMap toPixelMap$default(ImageBitmap imageBitmap, int i8, int i9, int i10, int i11, int[] iArr, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i8 = 0;
        }
        if ((i14 & 2) != 0) {
            i9 = 0;
        }
        if ((i14 & 4) != 0) {
            i10 = imageBitmap.getWidth();
        }
        if ((i14 & 8) != 0) {
            i11 = imageBitmap.getHeight();
        }
        if ((i14 & 16) != 0) {
            iArr = new int[i10 * i11];
        }
        if ((i14 & 32) != 0) {
            i12 = 0;
        }
        if ((i14 & 64) != 0) {
            i13 = i10;
        }
        return toPixelMap(imageBitmap, i8, i9, i10, i11, iArr, i12, i13);
    }
}
