package com.google.android.material.drawable;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.XmlRes;
import androidx.core.graphics.drawable.DrawableCompat;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class DrawableUtils {
    public static final int INTRINSIC_SIZE = -1;
    private static final int UNSPECIFIED_HEIGHT = -1;
    private static final int UNSPECIFIED_WIDTH = -1;

    @RequiresApi(21)
    /* loaded from: classes3.dex */
    private static class OutlineCompatL {
        private OutlineCompatL() {
        }

        @DoNotInline
        static void setConvexPath(@NonNull Outline outline, @NonNull Path path) {
            outline.setConvexPath(path);
        }
    }

    @RequiresApi(30)
    /* loaded from: classes3.dex */
    private static class OutlineCompatR {
        private OutlineCompatR() {
        }

        @DoNotInline
        static void setPath(@NonNull Outline outline, @NonNull Path path) {
            outline.setPath(path);
        }
    }

    private DrawableUtils() {
    }

    @Nullable
    public static Drawable compositeTwoLayeredDrawable(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        return compositeTwoLayeredDrawable(drawable, drawable2, -1, -1);
    }

    @Nullable
    public static Drawable createTintableDrawableIfNeeded(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, false);
    }

    @Nullable
    public static Drawable createTintableMutatedDrawableIfNeeded(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, Build.VERSION.SDK_INT < 23);
    }

    @NonNull
    public static int[] getCheckedState(@NonNull int[] iArr) {
        for (int i8 = 0; i8 < iArr.length; i8++) {
            int i9 = iArr[i8];
            if (i9 == 16842912) {
                return iArr;
            }
            if (i9 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i8] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    @Nullable
    public static ColorStateList getColorStateListOrNull(@Nullable Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29 && c.a(drawable)) {
            colorStateList = d.a(drawable).getColorStateList();
            return colorStateList;
        }
        return null;
    }

    private static int getTopLayerIntrinsicHeight(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        if (intrinsicHeight == -1) {
            return drawable.getIntrinsicHeight();
        }
        return intrinsicHeight;
    }

    private static int getTopLayerIntrinsicWidth(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        if (intrinsicWidth == -1) {
            return drawable.getIntrinsicWidth();
        }
        return intrinsicWidth;
    }

    @NonNull
    public static int[] getUncheckedState(@NonNull int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i8 = 0;
        for (int i9 : iArr) {
            if (i9 != 16842912) {
                iArr2[i8] = i9;
                i8++;
            }
        }
        return iArr2;
    }

    @NonNull
    public static AttributeSet parseDrawableXml(@NonNull Context context, @XmlRes int i8, @NonNull CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i8);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                if (TextUtils.equals(xml.getName(), charSequence)) {
                    return Xml.asAttributeSet(xml);
                }
                throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e8) {
            e = e8;
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i8));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (XmlPullParserException e9) {
            e = e9;
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i8));
            notFoundException2.initCause(e);
            throw notFoundException2;
        }
    }

    public static void setOutlineToPath(@NonNull Outline outline, @NonNull Path path) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            OutlineCompatR.setPath(outline, path);
            return;
        }
        if (i8 >= 29) {
            try {
                OutlineCompatL.setConvexPath(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            OutlineCompatL.setConvexPath(outline, path);
        }
    }

    @TargetApi(21)
    public static void setRippleDrawableRadius(@Nullable RippleDrawable rippleDrawable, int i8) {
        if (Build.VERSION.SDK_INT >= 23) {
            rippleDrawable.setRadius(i8);
            return;
        }
        try {
            RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE).invoke(rippleDrawable, Integer.valueOf(i8));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e8) {
            throw new IllegalStateException("Couldn't set RippleDrawable radius", e8);
        }
    }

    public static void setTint(@NonNull Drawable drawable, @ColorInt int i8) {
        boolean z8;
        if (i8 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (Build.VERSION.SDK_INT == 21) {
            if (z8) {
                drawable.setColorFilter(i8, PorterDuff.Mode.SRC_IN);
                return;
            } else {
                drawable.setColorFilter(null);
                return;
            }
        }
        if (z8) {
            DrawableCompat.setTint(drawable, i8);
        } else {
            DrawableCompat.setTintList(drawable, null);
        }
    }

    @Nullable
    public static PorterDuffColorFilter updateTintFilter(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
        }
        return null;
    }

    @Nullable
    public static Drawable compositeTwoLayeredDrawable(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Px int i8, @Px int i9) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        boolean z8 = (i8 == -1 || i9 == -1) ? false : true;
        if (i8 == -1) {
            i8 = getTopLayerIntrinsicWidth(drawable, drawable2);
        }
        if (i9 == -1) {
            i9 = getTopLayerIntrinsicHeight(drawable, drawable2);
        }
        if (i8 > drawable.getIntrinsicWidth() || i9 > drawable.getIntrinsicHeight()) {
            float f8 = i8 / i9;
            if (f8 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i9 = (int) (intrinsicWidth / f8);
                i8 = intrinsicWidth;
            } else {
                i9 = drawable.getIntrinsicHeight();
                i8 = (int) (f8 * i9);
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
            layerDrawable.setLayerSize(1, i8, i9);
            layerDrawable.setLayerGravity(1, 17);
            return layerDrawable;
        }
        if (z8) {
            drawable2 = new ScaledDrawableWrapper(drawable2, i8, i9);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{drawable, drawable2});
        int max = Math.max((drawable.getIntrinsicWidth() - i8) / 2, 0);
        int max2 = Math.max((drawable.getIntrinsicHeight() - i9) / 2, 0);
        layerDrawable2.setLayerInset(1, max, max2, max, max2);
        return layerDrawable2;
    }

    @Nullable
    private static Drawable createTintableMutatedDrawableIfNeeded(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, boolean z8) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (mode != null) {
                DrawableCompat.setTintMode(drawable, mode);
            }
        } else if (z8) {
            drawable.mutate();
        }
        return drawable;
    }
}
