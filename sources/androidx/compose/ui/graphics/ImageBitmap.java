package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;

/* loaded from: classes.dex */
public interface ImageBitmap {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    ColorSpace getColorSpace();

    /* renamed from: getConfig-_sVssgQ */
    int mo2821getConfig_sVssgQ();

    boolean getHasAlpha();

    int getHeight();

    int getWidth();

    void prepareToDraw();

    void readPixels(int[] iArr, int i8, int i9, int i10, int i11, int i12, int i13);
}
