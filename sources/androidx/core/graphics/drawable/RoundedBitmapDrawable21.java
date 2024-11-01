package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes3.dex */
class RoundedBitmapDrawable21 extends RoundedBitmapDrawable {
    /* JADX INFO: Access modifiers changed from: protected */
    public RoundedBitmapDrawable21(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@NonNull Outline outline) {
        updateDstRect();
        outline.setRoundRect(this.mDstRect, getCornerRadius());
    }

    @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
    void gravityCompatApply(int i8, int i9, int i10, Rect rect, Rect rect2) {
        Gravity.apply(i8, i9, i10, rect, rect2, 0);
    }

    @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
    public boolean hasMipMap() {
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null && bitmap.hasMipMap()) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
    public void setMipMap(boolean z8) {
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            bitmap.setHasMipMap(z8);
            invalidateSelf();
        }
    }
}
