package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.AnyRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class TypedArrayUtils {
    private static final String NAMESPACE = "http://schemas.android.com/apk/res/android";

    private TypedArrayUtils() {
    }

    public static int getAttr(@NonNull Context context, int i8, int i9) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i8, typedValue, true);
        if (typedValue.resourceId != 0) {
            return i8;
        }
        return i9;
    }

    public static boolean getBoolean(@NonNull TypedArray typedArray, @StyleableRes int i8, @StyleableRes int i9, boolean z8) {
        return typedArray.getBoolean(i8, typedArray.getBoolean(i9, z8));
    }

    @Nullable
    public static Drawable getDrawable(@NonNull TypedArray typedArray, @StyleableRes int i8, @StyleableRes int i9) {
        Drawable drawable = typedArray.getDrawable(i8);
        if (drawable == null) {
            return typedArray.getDrawable(i9);
        }
        return drawable;
    }

    public static int getInt(@NonNull TypedArray typedArray, @StyleableRes int i8, @StyleableRes int i9, int i10) {
        return typedArray.getInt(i8, typedArray.getInt(i9, i10));
    }

    public static boolean getNamedBoolean(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i8, boolean z8) {
        if (!hasAttribute(xmlPullParser, str)) {
            return z8;
        }
        return typedArray.getBoolean(i8, z8);
    }

    @ColorInt
    public static int getNamedColor(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i8, @ColorInt int i9) {
        if (!hasAttribute(xmlPullParser, str)) {
            return i9;
        }
        return typedArray.getColor(i8, i9);
    }

    @Nullable
    public static ColorStateList getNamedColorStateList(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme, @NonNull String str, @StyleableRes int i8) {
        if (hasAttribute(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i8, typedValue);
            int i9 = typedValue.type;
            if (i9 != 2) {
                if (i9 >= 28 && i9 <= 31) {
                    return getNamedColorStateListFromInt(typedValue);
                }
                return ColorStateListInflaterCompat.inflate(typedArray.getResources(), typedArray.getResourceId(i8, 0), theme);
            }
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i8 + ": " + typedValue);
        }
        return null;
    }

    @NonNull
    private static ColorStateList getNamedColorStateListFromInt(@NonNull TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static ComplexColorCompat getNamedComplexColor(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme, @NonNull String str, @StyleableRes int i8, @ColorInt int i9) {
        if (hasAttribute(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i8, typedValue);
            int i10 = typedValue.type;
            if (i10 >= 28 && i10 <= 31) {
                return ComplexColorCompat.from(typedValue.data);
            }
            ComplexColorCompat inflate = ComplexColorCompat.inflate(typedArray.getResources(), typedArray.getResourceId(i8, 0), theme);
            if (inflate != null) {
                return inflate;
            }
        }
        return ComplexColorCompat.from(i9);
    }

    public static float getNamedFloat(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i8, float f8) {
        if (!hasAttribute(xmlPullParser, str)) {
            return f8;
        }
        return typedArray.getFloat(i8, f8);
    }

    public static int getNamedInt(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i8, int i9) {
        if (!hasAttribute(xmlPullParser, str)) {
            return i9;
        }
        return typedArray.getInt(i8, i9);
    }

    @AnyRes
    public static int getNamedResourceId(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i8, @AnyRes int i9) {
        if (!hasAttribute(xmlPullParser, str)) {
            return i9;
        }
        return typedArray.getResourceId(i8, i9);
    }

    @Nullable
    public static String getNamedString(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i8) {
        if (!hasAttribute(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i8);
    }

    @AnyRes
    public static int getResourceId(@NonNull TypedArray typedArray, @StyleableRes int i8, @StyleableRes int i9, @AnyRes int i10) {
        return typedArray.getResourceId(i8, typedArray.getResourceId(i9, i10));
    }

    @Nullable
    public static String getString(@NonNull TypedArray typedArray, @StyleableRes int i8, @StyleableRes int i9) {
        String string = typedArray.getString(i8);
        if (string == null) {
            return typedArray.getString(i9);
        }
        return string;
    }

    @Nullable
    public static CharSequence getText(@NonNull TypedArray typedArray, @StyleableRes int i8, @StyleableRes int i9) {
        CharSequence text = typedArray.getText(i8);
        if (text == null) {
            return typedArray.getText(i9);
        }
        return text;
    }

    @Nullable
    public static CharSequence[] getTextArray(@NonNull TypedArray typedArray, @StyleableRes int i8, @StyleableRes int i9) {
        CharSequence[] textArray = typedArray.getTextArray(i8);
        if (textArray == null) {
            return typedArray.getTextArray(i9);
        }
        return textArray;
    }

    public static boolean hasAttribute(@NonNull XmlPullParser xmlPullParser, @NonNull String str) {
        if (xmlPullParser.getAttributeValue(NAMESPACE, str) != null) {
            return true;
        }
        return false;
    }

    @NonNull
    public static TypedArray obtainAttributes(@NonNull Resources resources, @Nullable Resources.Theme theme, @NonNull AttributeSet attributeSet, @NonNull int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @Nullable
    public static TypedValue peekNamedValue(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, int i8) {
        if (!hasAttribute(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i8);
    }
}
