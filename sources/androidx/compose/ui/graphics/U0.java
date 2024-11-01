package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.ImageBitmap;

/* loaded from: classes.dex */
public abstract /* synthetic */ class U0 {
    static {
        ImageBitmap.Companion companion = ImageBitmap.Companion;
    }

    public static /* synthetic */ void a(ImageBitmap imageBitmap, int[] iArr, int i8, int i9, int i10, int i11, int i12, int i13, int i14, Object obj) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if (obj == null) {
            int i20 = 0;
            if ((i14 & 2) != 0) {
                i15 = 0;
            } else {
                i15 = i8;
            }
            if ((i14 & 4) != 0) {
                i16 = 0;
            } else {
                i16 = i9;
            }
            if ((i14 & 8) != 0) {
                i17 = imageBitmap.getWidth();
            } else {
                i17 = i10;
            }
            if ((i14 & 16) != 0) {
                i18 = imageBitmap.getHeight();
            } else {
                i18 = i11;
            }
            if ((i14 & 32) == 0) {
                i20 = i12;
            }
            if ((i14 & 64) != 0) {
                i19 = i17;
            } else {
                i19 = i13;
            }
            imageBitmap.readPixels(iArr, i15, i16, i17, i18, i20, i19);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readPixels");
    }
}
