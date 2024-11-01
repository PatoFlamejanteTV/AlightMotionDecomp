package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.annotation.AnyRes;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleableRes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TypedArrayKt {
    private static final void checkAttribute(TypedArray typedArray, @StyleableRes int i8) {
        if (typedArray.hasValue(i8)) {
        } else {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final boolean getBooleanOrThrow(TypedArray typedArray, @StyleableRes int i8) {
        checkAttribute(typedArray, i8);
        return typedArray.getBoolean(i8, false);
    }

    @ColorInt
    public static final int getColorOrThrow(TypedArray typedArray, @StyleableRes int i8) {
        checkAttribute(typedArray, i8);
        return typedArray.getColor(i8, 0);
    }

    public static final ColorStateList getColorStateListOrThrow(TypedArray typedArray, @StyleableRes int i8) {
        checkAttribute(typedArray, i8);
        ColorStateList colorStateList = typedArray.getColorStateList(i8);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.".toString());
    }

    public static final float getDimensionOrThrow(TypedArray typedArray, @StyleableRes int i8) {
        checkAttribute(typedArray, i8);
        return typedArray.getDimension(i8, 0.0f);
    }

    @Dimension
    public static final int getDimensionPixelOffsetOrThrow(TypedArray typedArray, @StyleableRes int i8) {
        checkAttribute(typedArray, i8);
        return typedArray.getDimensionPixelOffset(i8, 0);
    }

    @Dimension
    public static final int getDimensionPixelSizeOrThrow(TypedArray typedArray, @StyleableRes int i8) {
        checkAttribute(typedArray, i8);
        return typedArray.getDimensionPixelSize(i8, 0);
    }

    public static final Drawable getDrawableOrThrow(TypedArray typedArray, @StyleableRes int i8) {
        checkAttribute(typedArray, i8);
        Drawable drawable = typedArray.getDrawable(i8);
        AbstractC3292y.f(drawable);
        return drawable;
    }

    public static final float getFloatOrThrow(TypedArray typedArray, @StyleableRes int i8) {
        checkAttribute(typedArray, i8);
        return typedArray.getFloat(i8, 0.0f);
    }

    @RequiresApi(26)
    public static final Typeface getFontOrThrow(TypedArray typedArray, @StyleableRes int i8) {
        checkAttribute(typedArray, i8);
        return TypedArrayApi26ImplKt.getFont(typedArray, i8);
    }

    public static final int getIntOrThrow(TypedArray typedArray, @StyleableRes int i8) {
        checkAttribute(typedArray, i8);
        return typedArray.getInt(i8, 0);
    }

    public static final int getIntegerOrThrow(TypedArray typedArray, @StyleableRes int i8) {
        checkAttribute(typedArray, i8);
        return typedArray.getInteger(i8, 0);
    }

    @AnyRes
    public static final int getResourceIdOrThrow(TypedArray typedArray, @StyleableRes int i8) {
        checkAttribute(typedArray, i8);
        return typedArray.getResourceId(i8, 0);
    }

    public static final String getStringOrThrow(TypedArray typedArray, @StyleableRes int i8) {
        checkAttribute(typedArray, i8);
        String string = typedArray.getString(i8);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.".toString());
    }

    public static final CharSequence[] getTextArrayOrThrow(TypedArray typedArray, @StyleableRes int i8) {
        checkAttribute(typedArray, i8);
        return typedArray.getTextArray(i8);
    }

    public static final CharSequence getTextOrThrow(TypedArray typedArray, @StyleableRes int i8) {
        checkAttribute(typedArray, i8);
        CharSequence text = typedArray.getText(i8);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.".toString());
    }

    public static final <R> R use(TypedArray typedArray, Function1 function1) {
        R r8 = (R) function1.invoke(typedArray);
        typedArray.recycle();
        return r8;
    }
}
