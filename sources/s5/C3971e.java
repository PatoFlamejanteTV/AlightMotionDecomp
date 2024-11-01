package s5;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import com.uptodown.util.views.CropImageView;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: s5.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3971e {

    /* renamed from: a, reason: collision with root package name */
    private final CropImageView f39133a;

    public C3971e(CropImageView cropImageView) {
        AbstractC3292y.i(cropImageView, "cropImageView");
        this.f39133a = cropImageView;
    }

    private final Matrix b() {
        Matrix imageMatrix = this.f39133a.getImageMatrix();
        AbstractC3292y.h(imageMatrix, "getImageMatrix(...)");
        return imageMatrix;
    }

    private final float c(int i8, int i9, float f8, boolean z8) {
        if (!z8) {
            if (i8 != 3 && i8 != 4 && i8 != 5) {
                if (i8 == 6 || i8 == 7) {
                    return (i9 - f8) / 2.0f;
                }
                return 0.0f;
            }
            return i9 - f8;
        }
        return 0.0f;
    }

    private final float d(int i8, int i9, float f8, boolean z8) {
        if (z8) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 4) {
                        if (i8 != 5 && i8 != 7) {
                            return 0.0f;
                        }
                    }
                }
                return i9 - f8;
            }
            return (i9 - f8) / 2.0f;
        }
        return 0.0f;
    }

    public final void a() {
        boolean z8;
        int width = (this.f39133a.getWidth() - this.f39133a.getPaddingLeft()) - this.f39133a.getPaddingRight();
        int height = (this.f39133a.getHeight() - this.f39133a.getPaddingTop()) - this.f39133a.getPaddingBottom();
        int cropType = this.f39133a.getCropType();
        Drawable drawable = this.f39133a.getDrawable();
        if (cropType != -1 && height > 0 && width > 0 && drawable != null) {
            Matrix b9 = b();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            float f8 = height / intrinsicHeight;
            float f9 = intrinsicWidth;
            float f10 = width / f9;
            if (f10 > f8) {
                f8 = f10;
            }
            b9.setScale(f8, f8);
            if (f10 > f8) {
                z8 = true;
            } else {
                z8 = false;
            }
            b9.postTranslate(c(cropType, width, f9 * f8, z8), d(cropType, height, intrinsicHeight * f8, z8));
            this.f39133a.setImageMatrix(b9);
        }
    }
}
