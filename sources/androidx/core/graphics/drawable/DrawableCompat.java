package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class DrawableCompat {
    private static final String TAG = "DrawableCompat";
    private static Method sGetLayoutDirectionMethod;
    private static boolean sGetLayoutDirectionMethodFetched;
    private static Method sSetLayoutDirectionMethod;
    private static boolean sSetLayoutDirectionMethodFetched;

    @RequiresApi(21)
    /* loaded from: classes3.dex */
    static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static void applyTheme(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @DoNotInline
        static boolean canApplyTheme(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @DoNotInline
        static ColorFilter getColorFilter(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @DoNotInline
        static void inflate(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @DoNotInline
        static void setHotspot(Drawable drawable, float f8, float f9) {
            drawable.setHotspot(f8, f9);
        }

        @DoNotInline
        static void setHotspotBounds(Drawable drawable, int i8, int i9, int i10, int i11) {
            drawable.setHotspotBounds(i8, i9, i10, i11);
        }

        @DoNotInline
        static void setTint(Drawable drawable, int i8) {
            drawable.setTint(i8);
        }

        @DoNotInline
        static void setTintList(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @DoNotInline
        static void setTintMode(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    @RequiresApi(23)
    /* loaded from: classes3.dex */
    static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        static int getLayoutDirection(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @DoNotInline
        static boolean setLayoutDirection(Drawable drawable, int i8) {
            return drawable.setLayoutDirection(i8);
        }
    }

    private DrawableCompat() {
    }

    public static void applyTheme(@NonNull Drawable drawable, @NonNull Resources.Theme theme) {
        Api21Impl.applyTheme(drawable, theme);
    }

    public static boolean canApplyTheme(@NonNull Drawable drawable) {
        return Api21Impl.canApplyTheme(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void clearColorFilter(@NonNull Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            clearColorFilter(((InsetDrawable) drawable).getDrawable());
            return;
        }
        if (drawable instanceof WrappedDrawable) {
            clearColorFilter(((WrappedDrawable) drawable).getWrappedDrawable());
            return;
        }
        if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                Drawable child = drawableContainerState.getChild(i8);
                if (child != null) {
                    clearColorFilter(child);
                }
            }
        }
    }

    public static int getAlpha(@NonNull Drawable drawable) {
        return drawable.getAlpha();
    }

    @Nullable
    public static ColorFilter getColorFilter(@NonNull Drawable drawable) {
        return Api21Impl.getColorFilter(drawable);
    }

    public static int getLayoutDirection(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getLayoutDirection(drawable);
        }
        if (!sGetLayoutDirectionMethodFetched) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                sGetLayoutDirectionMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e8) {
                Log.i(TAG, "Failed to retrieve getLayoutDirection() method", e8);
            }
            sGetLayoutDirectionMethodFetched = true;
        }
        Method method = sGetLayoutDirectionMethod;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, null)).intValue();
            } catch (Exception e9) {
                Log.i(TAG, "Failed to invoke getLayoutDirection() via reflection", e9);
                sGetLayoutDirectionMethod = null;
                return 0;
            }
        }
        return 0;
    }

    public static void inflate(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        Api21Impl.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean isAutoMirrored(@NonNull Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Deprecated
    public static void jumpToCurrentState(@NonNull Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void setAutoMirrored(@NonNull Drawable drawable, boolean z8) {
        drawable.setAutoMirrored(z8);
    }

    public static void setHotspot(@NonNull Drawable drawable, float f8, float f9) {
        Api21Impl.setHotspot(drawable, f8, f9);
    }

    public static void setHotspotBounds(@NonNull Drawable drawable, int i8, int i9, int i10, int i11) {
        Api21Impl.setHotspotBounds(drawable, i8, i9, i10, i11);
    }

    public static boolean setLayoutDirection(@NonNull Drawable drawable, int i8) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.setLayoutDirection(drawable, i8);
        }
        if (!sSetLayoutDirectionMethodFetched) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                sSetLayoutDirectionMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e8) {
                Log.i(TAG, "Failed to retrieve setLayoutDirection(int) method", e8);
            }
            sSetLayoutDirectionMethodFetched = true;
        }
        Method method = sSetLayoutDirectionMethod;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i8));
                return true;
            } catch (Exception e9) {
                Log.i(TAG, "Failed to invoke setLayoutDirection(int) via reflection", e9);
                sSetLayoutDirectionMethod = null;
            }
        }
        return false;
    }

    public static void setTint(@NonNull Drawable drawable, @ColorInt int i8) {
        Api21Impl.setTint(drawable, i8);
    }

    public static void setTintList(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList) {
        Api21Impl.setTintList(drawable, colorStateList);
    }

    public static void setTintMode(@NonNull Drawable drawable, @Nullable PorterDuff.Mode mode) {
        Api21Impl.setTintMode(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T unwrap(@NonNull Drawable drawable) {
        if (drawable instanceof WrappedDrawable) {
            return (T) ((WrappedDrawable) drawable).getWrappedDrawable();
        }
        return drawable;
    }

    @NonNull
    public static Drawable wrap(@NonNull Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable;
        }
        if (!(drawable instanceof TintAwareDrawable)) {
            return new WrappedDrawableApi21(drawable);
        }
        return drawable;
    }
}
