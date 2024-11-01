package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class TintTypedArray {
    private final Context mContext;
    private TypedValue mTypedValue;
    private final TypedArray mWrapped;

    @RequiresApi(21)
    /* loaded from: classes.dex */
    static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static int getChangingConfigurations(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @DoNotInline
        static int getType(TypedArray typedArray, int i8) {
            return typedArray.getType(i8);
        }
    }

    private TintTypedArray(Context context, TypedArray typedArray) {
        this.mContext = context;
        this.mWrapped = typedArray;
    }

    public static TintTypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public boolean getBoolean(int i8, boolean z8) {
        return this.mWrapped.getBoolean(i8, z8);
    }

    @RequiresApi(21)
    public int getChangingConfigurations() {
        return Api21Impl.getChangingConfigurations(this.mWrapped);
    }

    public int getColor(int i8, int i9) {
        return this.mWrapped.getColor(i8, i9);
    }

    public ColorStateList getColorStateList(int i8) {
        int resourceId;
        ColorStateList colorStateList;
        if (this.mWrapped.hasValue(i8) && (resourceId = this.mWrapped.getResourceId(i8, 0)) != 0 && (colorStateList = AppCompatResources.getColorStateList(this.mContext, resourceId)) != null) {
            return colorStateList;
        }
        return this.mWrapped.getColorStateList(i8);
    }

    public float getDimension(int i8, float f8) {
        return this.mWrapped.getDimension(i8, f8);
    }

    public int getDimensionPixelOffset(int i8, int i9) {
        return this.mWrapped.getDimensionPixelOffset(i8, i9);
    }

    public int getDimensionPixelSize(int i8, int i9) {
        return this.mWrapped.getDimensionPixelSize(i8, i9);
    }

    public Drawable getDrawable(int i8) {
        int resourceId;
        if (this.mWrapped.hasValue(i8) && (resourceId = this.mWrapped.getResourceId(i8, 0)) != 0) {
            return AppCompatResources.getDrawable(this.mContext, resourceId);
        }
        return this.mWrapped.getDrawable(i8);
    }

    public Drawable getDrawableIfKnown(int i8) {
        int resourceId;
        if (this.mWrapped.hasValue(i8) && (resourceId = this.mWrapped.getResourceId(i8, 0)) != 0) {
            return AppCompatDrawableManager.get().getDrawable(this.mContext, resourceId, true);
        }
        return null;
    }

    public float getFloat(int i8, float f8) {
        return this.mWrapped.getFloat(i8, f8);
    }

    @Nullable
    public Typeface getFont(@StyleableRes int i8, int i9, @Nullable ResourcesCompat.FontCallback fontCallback) {
        int resourceId = this.mWrapped.getResourceId(i8, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        return ResourcesCompat.getFont(this.mContext, resourceId, this.mTypedValue, i9, fontCallback);
    }

    public float getFraction(int i8, int i9, int i10, float f8) {
        return this.mWrapped.getFraction(i8, i9, i10, f8);
    }

    public int getIndex(int i8) {
        return this.mWrapped.getIndex(i8);
    }

    public int getIndexCount() {
        return this.mWrapped.getIndexCount();
    }

    public int getInt(int i8, int i9) {
        return this.mWrapped.getInt(i8, i9);
    }

    public int getInteger(int i8, int i9) {
        return this.mWrapped.getInteger(i8, i9);
    }

    public int getLayoutDimension(int i8, String str) {
        return this.mWrapped.getLayoutDimension(i8, str);
    }

    public String getNonResourceString(int i8) {
        return this.mWrapped.getNonResourceString(i8);
    }

    public String getPositionDescription() {
        return this.mWrapped.getPositionDescription();
    }

    public int getResourceId(int i8, int i9) {
        return this.mWrapped.getResourceId(i8, i9);
    }

    public Resources getResources() {
        return this.mWrapped.getResources();
    }

    public String getString(int i8) {
        return this.mWrapped.getString(i8);
    }

    public CharSequence getText(int i8) {
        return this.mWrapped.getText(i8);
    }

    public CharSequence[] getTextArray(int i8) {
        return this.mWrapped.getTextArray(i8);
    }

    public int getType(int i8) {
        return Api21Impl.getType(this.mWrapped, i8);
    }

    public boolean getValue(int i8, TypedValue typedValue) {
        return this.mWrapped.getValue(i8, typedValue);
    }

    public TypedArray getWrappedTypeArray() {
        return this.mWrapped;
    }

    public boolean hasValue(int i8) {
        return this.mWrapped.hasValue(i8);
    }

    public int length() {
        return this.mWrapped.length();
    }

    public TypedValue peekValue(int i8) {
        return this.mWrapped.peekValue(i8);
    }

    public void recycle() {
        this.mWrapped.recycle();
    }

    public static TintTypedArray obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i8, int i9) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr, i8, i9));
    }

    public int getLayoutDimension(int i8, int i9) {
        return this.mWrapped.getLayoutDimension(i8, i9);
    }

    public static TintTypedArray obtainStyledAttributes(Context context, int i8, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(i8, iArr));
    }
}
