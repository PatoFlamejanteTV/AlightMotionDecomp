package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;

/* loaded from: classes.dex */
public final class AndroidImageBitmap implements ImageBitmap {
    private final Bitmap bitmap;

    public AndroidImageBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public final Bitmap getBitmap$ui_graphics_release() {
        return this.bitmap;
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public ColorSpace getColorSpace() {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Bitmap api26Bitmap = Api26Bitmap.INSTANCE;
            return Api26Bitmap.composeColorSpace$ui_graphics_release(this.bitmap);
        }
        return ColorSpaces.INSTANCE.getSrgb();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    /* renamed from: getConfig-_sVssgQ, reason: not valid java name */
    public int mo2821getConfig_sVssgQ() {
        return AndroidImageBitmap_androidKt.toImageConfig(this.bitmap.getConfig());
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public boolean getHasAlpha() {
        return this.bitmap.hasAlpha();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public int getHeight() {
        return this.bitmap.getHeight();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public int getWidth() {
        return this.bitmap.getWidth();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public void prepareToDraw() {
        this.bitmap.prepareToDraw();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public void readPixels(int[] iArr, int i8, int i9, int i10, int i11, int i12, int i13) {
        Bitmap.Config config;
        Bitmap asAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(this);
        boolean z8 = false;
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config2 = asAndroidBitmap.getConfig();
            config = Bitmap.Config.HARDWARE;
            if (config2 == config) {
                asAndroidBitmap = asAndroidBitmap.copy(Bitmap.Config.ARGB_8888, false);
                z8 = true;
            }
        }
        asAndroidBitmap.getPixels(iArr, i12, i13, i8, i9, i10, i11);
        if (z8) {
            asAndroidBitmap.recycle();
        }
    }
}
