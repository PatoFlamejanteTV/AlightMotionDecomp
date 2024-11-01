package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AppCompatTextHelper {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int TEXT_FONT_WEIGHT_UNSPECIFIED = -1;
    private boolean mAsyncFontPending;

    @NonNull
    private final AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    private TintInfo mDrawableBottomTint;
    private TintInfo mDrawableEndTint;
    private TintInfo mDrawableLeftTint;
    private TintInfo mDrawableRightTint;
    private TintInfo mDrawableStartTint;
    private TintInfo mDrawableTint;
    private TintInfo mDrawableTopTint;
    private Typeface mFontTypeface;

    @NonNull
    private final TextView mView;
    private int mStyle = 0;
    private int mFontWeight = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static Locale forLanguageTag(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(24)
    /* loaded from: classes.dex */
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static LocaleList forLanguageTags(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @DoNotInline
        static void setTextLocales(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(26)
    /* loaded from: classes.dex */
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        static int getAutoSizeStepGranularity(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @DoNotInline
        static void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i8, int i9, int i10, int i11) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i8, i9, i10, i11);
        }

        @DoNotInline
        static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] iArr, int i8) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i8);
        }

        @DoNotInline
        static boolean setFontVariationSettings(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(28)
    /* loaded from: classes.dex */
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        static Typeface create(Typeface typeface, int i8, boolean z8) {
            return Typeface.create(typeface, i8, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatTextHelper(@NonNull TextView textView) {
        this.mView = textView;
        this.mAutoSizeTextHelper = new AppCompatTextViewAutoSizeHelper(textView);
    }

    private void applyCompoundDrawableTint(Drawable drawable, TintInfo tintInfo) {
        if (drawable != null && tintInfo != null) {
            AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
        }
    }

    private static TintInfo createTintInfo(Context context, AppCompatDrawableManager appCompatDrawableManager, int i8) {
        ColorStateList tintList = appCompatDrawableManager.getTintList(context, i8);
        if (tintList != null) {
            TintInfo tintInfo = new TintInfo();
            tintInfo.mHasTintList = true;
            tintInfo.mTintList = tintList;
            return tintInfo;
        }
        return null;
    }

    private void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] compoundDrawablesRelative = this.mView.getCompoundDrawablesRelative();
                Drawable drawable7 = compoundDrawablesRelative[0];
                if (drawable7 == null && compoundDrawablesRelative[2] == null) {
                    Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
                    TextView textView = this.mView;
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                    return;
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative[1];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative[3];
                }
                this.mView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative[2], drawable4);
                return;
            }
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.mView.getCompoundDrawablesRelative();
        if (drawable5 == null) {
            drawable5 = compoundDrawablesRelative2[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawablesRelative2[1];
        }
        if (drawable6 == null) {
            drawable6 = compoundDrawablesRelative2[2];
        }
        TextView textView2 = this.mView;
        if (drawable4 == null) {
            drawable4 = compoundDrawablesRelative2[3];
        }
        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
    }

    private void setCompoundTints() {
        TintInfo tintInfo = this.mDrawableTint;
        this.mDrawableLeftTint = tintInfo;
        this.mDrawableTopTint = tintInfo;
        this.mDrawableRightTint = tintInfo;
        this.mDrawableBottomTint = tintInfo;
        this.mDrawableStartTint = tintInfo;
        this.mDrawableEndTint = tintInfo;
    }

    private void setTextSizeInternal(int i8, float f8) {
        this.mAutoSizeTextHelper.setTextSizeInternal(i8, f8);
    }

    private void updateTypefaceAndStyle(Context context, TintTypedArray tintTypedArray) {
        String string;
        boolean z8;
        boolean z9;
        this.mStyle = tintTypedArray.getInt(R.styleable.TextAppearance_android_textStyle, this.mStyle);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            int i9 = tintTypedArray.getInt(R.styleable.TextAppearance_android_textFontWeight, -1);
            this.mFontWeight = i9;
            if (i9 != -1) {
                this.mStyle &= 2;
            }
        }
        int i10 = R.styleable.TextAppearance_android_fontFamily;
        boolean z10 = true;
        if (!tintTypedArray.hasValue(i10) && !tintTypedArray.hasValue(R.styleable.TextAppearance_fontFamily)) {
            int i11 = R.styleable.TextAppearance_android_typeface;
            if (tintTypedArray.hasValue(i11)) {
                this.mAsyncFontPending = false;
                int i12 = tintTypedArray.getInt(i11, 1);
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            this.mFontTypeface = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.mFontTypeface = Typeface.SERIF;
                    return;
                }
                this.mFontTypeface = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.mFontTypeface = null;
        int i13 = R.styleable.TextAppearance_fontFamily;
        if (tintTypedArray.hasValue(i13)) {
            i10 = i13;
        }
        final int i14 = this.mFontWeight;
        final int i15 = this.mStyle;
        if (!context.isRestricted()) {
            final WeakReference weakReference = new WeakReference(this.mView);
            try {
                Typeface font = tintTypedArray.getFont(i10, this.mStyle, new ResourcesCompat.FontCallback() { // from class: androidx.appcompat.widget.AppCompatTextHelper.1
                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    /* renamed from: onFontRetrievalFailed */
                    public void lambda$callbackFailAsync$1(int i16) {
                    }

                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    /* renamed from: onFontRetrieved */
                    public void lambda$callbackSuccessAsync$0(@NonNull Typeface typeface) {
                        int i16;
                        boolean z11;
                        if (Build.VERSION.SDK_INT >= 28 && (i16 = i14) != -1) {
                            if ((i15 & 2) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            typeface = Api28Impl.create(typeface, i16, z11);
                        }
                        AppCompatTextHelper.this.onAsyncTypefaceReceived(weakReference, typeface);
                    }
                });
                if (font != null) {
                    if (i8 >= 28 && this.mFontWeight != -1) {
                        Typeface create = Typeface.create(font, 0);
                        int i16 = this.mFontWeight;
                        if ((this.mStyle & 2) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        this.mFontTypeface = Api28Impl.create(create, i16, z9);
                    } else {
                        this.mFontTypeface = font;
                    }
                }
                if (this.mFontTypeface == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.mAsyncFontPending = z8;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.mFontTypeface == null && (string = tintTypedArray.getString(i10)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.mFontWeight != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i17 = this.mFontWeight;
                if ((this.mStyle & 2) == 0) {
                    z10 = false;
                }
                this.mFontTypeface = Api28Impl.create(create2, i17, z10);
                return;
            }
            this.mFontTypeface = Typeface.create(string, this.mStyle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void applyCompoundDrawablesTints() {
        if (this.mDrawableLeftTint != null || this.mDrawableTopTint != null || this.mDrawableRightTint != null || this.mDrawableBottomTint != null) {
            Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
            applyCompoundDrawableTint(compoundDrawables[0], this.mDrawableLeftTint);
            applyCompoundDrawableTint(compoundDrawables[1], this.mDrawableTopTint);
            applyCompoundDrawableTint(compoundDrawables[2], this.mDrawableRightTint);
            applyCompoundDrawableTint(compoundDrawables[3], this.mDrawableBottomTint);
        }
        if (this.mDrawableStartTint != null || this.mDrawableEndTint != null) {
            Drawable[] compoundDrawablesRelative = this.mView.getCompoundDrawablesRelative();
            applyCompoundDrawableTint(compoundDrawablesRelative[0], this.mDrawableStartTint);
            applyCompoundDrawableTint(compoundDrawablesRelative[2], this.mDrawableEndTint);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void autoSizeText() {
        this.mAutoSizeTextHelper.autoSizeText();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getAutoSizeMaxTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMaxTextSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getAutoSizeMinTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMinTextSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getAutoSizeStepGranularity() {
        return this.mAutoSizeTextHelper.getAutoSizeStepGranularity();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] getAutoSizeTextAvailableSizes() {
        return this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getAutoSizeTextType() {
        return this.mAutoSizeTextHelper.getAutoSizeTextType();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public ColorStateList getCompoundDrawableTintList() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public PorterDuff.Mode getCompoundDrawableTintMode() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isAutoSizeEnabled() {
        return this.mAutoSizeTextHelper.isAutoSizeEnabled();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e2  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void loadFromAttributes(@androidx.annotation.Nullable android.util.AttributeSet r23, int r24) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextHelper.loadFromAttributes(android.util.AttributeSet, int):void");
    }

    void onAsyncTypefaceReceived(WeakReference<TextView> weakReference, final Typeface typeface) {
        if (this.mAsyncFontPending) {
            this.mFontTypeface = typeface;
            final TextView textView = weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    final int i8 = this.mStyle;
                    textView.post(new Runnable() { // from class: androidx.appcompat.widget.AppCompatTextHelper.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView.setTypeface(typeface, i8);
                        }
                    });
                } else {
                    textView.setTypeface(typeface, this.mStyle);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        if (!ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            autoSizeText();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onSetCompoundDrawables() {
        applyCompoundDrawablesTints();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onSetTextAppearance(Context context, int i8) {
        String string;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i8, R.styleable.TextAppearance);
        int i9 = R.styleable.TextAppearance_textAllCaps;
        if (obtainStyledAttributes.hasValue(i9)) {
            setAllCaps(obtainStyledAttributes.getBoolean(i9, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23) {
            int i11 = R.styleable.TextAppearance_android_textColor;
            if (obtainStyledAttributes.hasValue(i11) && (colorStateList3 = obtainStyledAttributes.getColorStateList(i11)) != null) {
                this.mView.setTextColor(colorStateList3);
            }
            int i12 = R.styleable.TextAppearance_android_textColorLink;
            if (obtainStyledAttributes.hasValue(i12) && (colorStateList2 = obtainStyledAttributes.getColorStateList(i12)) != null) {
                this.mView.setLinkTextColor(colorStateList2);
            }
            int i13 = R.styleable.TextAppearance_android_textColorHint;
            if (obtainStyledAttributes.hasValue(i13) && (colorStateList = obtainStyledAttributes.getColorStateList(i13)) != null) {
                this.mView.setHintTextColor(colorStateList);
            }
        }
        int i14 = R.styleable.TextAppearance_android_textSize;
        if (obtainStyledAttributes.hasValue(i14) && obtainStyledAttributes.getDimensionPixelSize(i14, -1) == 0) {
            this.mView.setTextSize(0, 0.0f);
        }
        updateTypefaceAndStyle(context, obtainStyledAttributes);
        if (i10 >= 26) {
            int i15 = R.styleable.TextAppearance_fontVariationSettings;
            if (obtainStyledAttributes.hasValue(i15) && (string = obtainStyledAttributes.getString(i15)) != null) {
                Api26Impl.setFontVariationSettings(this.mView, string);
            }
        }
        obtainStyledAttributes.recycle();
        Typeface typeface = this.mFontTypeface;
        if (typeface != null) {
            this.mView.setTypeface(typeface, this.mStyle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void populateSurroundingTextIfNeeded(@NonNull TextView textView, @Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            EditorInfoCompat.setInitialSurroundingText(editorInfo, textView.getText());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAllCaps(boolean z8) {
        this.mView.setAllCaps(z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAutoSizeTextTypeUniformWithConfiguration(int i8, int i9, int i10, int i11) throws IllegalArgumentException {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i8, i9, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i8) throws IllegalArgumentException {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAutoSizeTextTypeWithDefaults(int i8) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCompoundDrawableTintList(@Nullable ColorStateList colorStateList) {
        boolean z8;
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintList = colorStateList;
        if (colorStateList != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        tintInfo.mHasTintList = z8;
        setCompoundTints();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCompoundDrawableTintMode(@Nullable PorterDuff.Mode mode) {
        boolean z8;
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintMode = mode;
        if (mode != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        tintInfo.mHasTintMode = z8;
        setCompoundTints();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setTextSize(int i8, float f8) {
        if (!ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE && !isAutoSizeEnabled()) {
            setTextSizeInternal(i8, f8);
        }
    }
}
