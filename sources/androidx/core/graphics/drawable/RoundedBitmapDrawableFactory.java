package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.BitmapCompat;
import androidx.core.view.GravityCompat;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class RoundedBitmapDrawableFactory {
    private static final String TAG = "RoundedBitmapDrawableFa";

    /* loaded from: classes3.dex */
    private static class DefaultRoundedBitmapDrawable extends RoundedBitmapDrawable {
        DefaultRoundedBitmapDrawable(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
        void gravityCompatApply(int i8, int i9, int i10, Rect rect, Rect rect2) {
            GravityCompat.apply(i8, i9, i10, rect, rect2, 0);
        }

        @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
        public boolean hasMipMap() {
            Bitmap bitmap = this.mBitmap;
            if (bitmap != null && BitmapCompat.hasMipMap(bitmap)) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
        public void setMipMap(boolean z8) {
            Bitmap bitmap = this.mBitmap;
            if (bitmap != null) {
                BitmapCompat.setHasMipMap(bitmap, z8);
                invalidateSelf();
            }
        }
    }

    private RoundedBitmapDrawableFactory() {
    }

    @NonNull
    public static RoundedBitmapDrawable create(@NonNull Resources resources, @Nullable Bitmap bitmap) {
        return new RoundedBitmapDrawable21(resources, bitmap);
    }

    @NonNull
    public static RoundedBitmapDrawable create(@NonNull Resources resources, @NonNull String str) {
        RoundedBitmapDrawable create = create(resources, BitmapFactory.decodeFile(str));
        if (create.getBitmap() == null) {
            Log.w(TAG, "RoundedBitmapDrawable cannot decode " + str);
        }
        return create;
    }

    @NonNull
    public static RoundedBitmapDrawable create(@NonNull Resources resources, @NonNull InputStream inputStream) {
        RoundedBitmapDrawable create = create(resources, BitmapFactory.decodeStream(inputStream));
        if (create.getBitmap() == null) {
            Log.w(TAG, "RoundedBitmapDrawable cannot decode " + inputStream);
        }
        return create;
    }
}
