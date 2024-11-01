package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class AndroidColorSpace_androidKt {
    @RequiresApi(26)
    public static final ColorSpace toAndroidColorSpace(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        return ColorSpaceVerificationHelper.androidColorSpace(colorSpace);
    }

    @RequiresApi(26)
    public static final androidx.compose.ui.graphics.colorspace.ColorSpace toComposeColorSpace(ColorSpace colorSpace) {
        return ColorSpaceVerificationHelper.composeColorSpace(colorSpace);
    }
}
