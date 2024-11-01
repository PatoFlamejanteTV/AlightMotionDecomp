package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
public class ImageViewCompat {

    @RequiresApi(21)
    /* loaded from: classes3.dex */
    static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static ColorStateList getImageTintList(ImageView imageView) {
            return imageView.getImageTintList();
        }

        @DoNotInline
        static PorterDuff.Mode getImageTintMode(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        @DoNotInline
        static void setImageTintList(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        @DoNotInline
        static void setImageTintMode(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    private ImageViewCompat() {
    }

    @Nullable
    public static ColorStateList getImageTintList(@NonNull ImageView imageView) {
        return Api21Impl.getImageTintList(imageView);
    }

    @Nullable
    public static PorterDuff.Mode getImageTintMode(@NonNull ImageView imageView) {
        return Api21Impl.getImageTintMode(imageView);
    }

    public static void setImageTintList(@NonNull ImageView imageView, @Nullable ColorStateList colorStateList) {
        Drawable drawable;
        int i8 = Build.VERSION.SDK_INT;
        Api21Impl.setImageTintList(imageView, colorStateList);
        if (i8 == 21 && (drawable = imageView.getDrawable()) != null && Api21Impl.getImageTintList(imageView) != null) {
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public static void setImageTintMode(@NonNull ImageView imageView, @Nullable PorterDuff.Mode mode) {
        Drawable drawable;
        int i8 = Build.VERSION.SDK_INT;
        Api21Impl.setImageTintMode(imageView, mode);
        if (i8 == 21 && (drawable = imageView.getDrawable()) != null && Api21Impl.getImageTintList(imageView) != null) {
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }
}
