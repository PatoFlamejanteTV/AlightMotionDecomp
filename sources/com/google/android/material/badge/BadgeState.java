package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.PluralsRes;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.annotation.XmlRes;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class BadgeState {
    private static final String BADGE_RESOURCE_TAG = "badge";
    final float badgeHeight;
    final float badgeRadius;
    final float badgeWidth;
    final float badgeWithTextHeight;
    final float badgeWithTextRadius;
    final float badgeWithTextWidth;
    private final State currentState;
    final int horizontalInset;
    final int horizontalInsetWithText;
    int offsetAlignmentMode;
    private final State overridingState;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BadgeState(Context context, @XmlRes int i8, @AttrRes int i9, @StyleRes int i10, @Nullable State state) {
        CharSequence charSequence;
        int i11;
        int i12;
        int i13;
        int i14;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        int intValue7;
        int intValue8;
        int intValue9;
        int intValue10;
        int intValue11;
        int intValue12;
        int intValue13;
        int intValue14;
        boolean booleanValue;
        Locale locale;
        Locale.Category category;
        State state2 = new State();
        this.currentState = state2;
        state = state == null ? new State() : state;
        if (i8 != 0) {
            state.badgeResId = i8;
        }
        TypedArray generateTypedArray = generateTypedArray(context, state.badgeResId, i9, i10);
        Resources resources = context.getResources();
        this.badgeRadius = generateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeRadius, -1);
        this.horizontalInset = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.horizontalInsetWithText = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.badgeWithTextRadius = generateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeWithTextRadius, -1);
        int i15 = R.styleable.Badge_badgeWidth;
        int i16 = R.dimen.m3_badge_size;
        this.badgeWidth = generateTypedArray.getDimension(i15, resources.getDimension(i16));
        int i17 = R.styleable.Badge_badgeWithTextWidth;
        int i18 = R.dimen.m3_badge_with_text_size;
        this.badgeWithTextWidth = generateTypedArray.getDimension(i17, resources.getDimension(i18));
        this.badgeHeight = generateTypedArray.getDimension(R.styleable.Badge_badgeHeight, resources.getDimension(i16));
        this.badgeWithTextHeight = generateTypedArray.getDimension(R.styleable.Badge_badgeWithTextHeight, resources.getDimension(i18));
        boolean z8 = true;
        this.offsetAlignmentMode = generateTypedArray.getInt(R.styleable.Badge_offsetAlignmentMode, 1);
        state2.alpha = state.alpha == -2 ? 255 : state.alpha;
        if (state.number != -2) {
            state2.number = state.number;
        } else {
            int i19 = R.styleable.Badge_number;
            if (generateTypedArray.hasValue(i19)) {
                state2.number = generateTypedArray.getInt(i19, 0);
            } else {
                state2.number = -1;
            }
        }
        if (state.text != null) {
            state2.text = state.text;
        } else {
            int i20 = R.styleable.Badge_badgeText;
            if (generateTypedArray.hasValue(i20)) {
                state2.text = generateTypedArray.getString(i20);
            }
        }
        state2.contentDescriptionForText = state.contentDescriptionForText;
        if (state.contentDescriptionNumberless != null) {
            charSequence = state.contentDescriptionNumberless;
        } else {
            charSequence = context.getString(R.string.mtrl_badge_numberless_content_description);
        }
        state2.contentDescriptionNumberless = charSequence;
        if (state.contentDescriptionQuantityStrings != 0) {
            i11 = state.contentDescriptionQuantityStrings;
        } else {
            i11 = R.plurals.mtrl_badge_content_description;
        }
        state2.contentDescriptionQuantityStrings = i11;
        if (state.contentDescriptionExceedsMaxBadgeNumberRes != 0) {
            i12 = state.contentDescriptionExceedsMaxBadgeNumberRes;
        } else {
            i12 = R.string.mtrl_exceed_max_badge_number_content_description;
        }
        state2.contentDescriptionExceedsMaxBadgeNumberRes = i12;
        if (state.isVisible != null && !state.isVisible.booleanValue()) {
            z8 = false;
        }
        state2.isVisible = Boolean.valueOf(z8);
        if (state.maxCharacterCount != -2) {
            i13 = state.maxCharacterCount;
        } else {
            i13 = generateTypedArray.getInt(R.styleable.Badge_maxCharacterCount, -2);
        }
        state2.maxCharacterCount = i13;
        if (state.maxNumber != -2) {
            i14 = state.maxNumber;
        } else {
            i14 = generateTypedArray.getInt(R.styleable.Badge_maxNumber, -2);
        }
        state2.maxNumber = i14;
        if (state.badgeShapeAppearanceResId != null) {
            intValue = state.badgeShapeAppearanceResId.intValue();
        } else {
            intValue = generateTypedArray.getResourceId(R.styleable.Badge_badgeShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        }
        state2.badgeShapeAppearanceResId = Integer.valueOf(intValue);
        if (state.badgeShapeAppearanceOverlayResId != null) {
            intValue2 = state.badgeShapeAppearanceOverlayResId.intValue();
        } else {
            intValue2 = generateTypedArray.getResourceId(R.styleable.Badge_badgeShapeAppearanceOverlay, 0);
        }
        state2.badgeShapeAppearanceOverlayResId = Integer.valueOf(intValue2);
        if (state.badgeWithTextShapeAppearanceResId != null) {
            intValue3 = state.badgeWithTextShapeAppearanceResId.intValue();
        } else {
            intValue3 = generateTypedArray.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        }
        state2.badgeWithTextShapeAppearanceResId = Integer.valueOf(intValue3);
        if (state.badgeWithTextShapeAppearanceOverlayResId != null) {
            intValue4 = state.badgeWithTextShapeAppearanceOverlayResId.intValue();
        } else {
            intValue4 = generateTypedArray.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearanceOverlay, 0);
        }
        state2.badgeWithTextShapeAppearanceOverlayResId = Integer.valueOf(intValue4);
        if (state.backgroundColor != null) {
            intValue5 = state.backgroundColor.intValue();
        } else {
            intValue5 = readColorFromAttributes(context, generateTypedArray, R.styleable.Badge_backgroundColor);
        }
        state2.backgroundColor = Integer.valueOf(intValue5);
        if (state.badgeTextAppearanceResId != null) {
            intValue6 = state.badgeTextAppearanceResId.intValue();
        } else {
            intValue6 = generateTypedArray.getResourceId(R.styleable.Badge_badgeTextAppearance, R.style.TextAppearance_MaterialComponents_Badge);
        }
        state2.badgeTextAppearanceResId = Integer.valueOf(intValue6);
        if (state.badgeTextColor != null) {
            state2.badgeTextColor = state.badgeTextColor;
        } else {
            int i21 = R.styleable.Badge_badgeTextColor;
            if (generateTypedArray.hasValue(i21)) {
                state2.badgeTextColor = Integer.valueOf(readColorFromAttributes(context, generateTypedArray, i21));
            } else {
                state2.badgeTextColor = Integer.valueOf(new TextAppearance(context, state2.badgeTextAppearanceResId.intValue()).getTextColor().getDefaultColor());
            }
        }
        if (state.badgeGravity != null) {
            intValue7 = state.badgeGravity.intValue();
        } else {
            intValue7 = generateTypedArray.getInt(R.styleable.Badge_badgeGravity, 8388661);
        }
        state2.badgeGravity = Integer.valueOf(intValue7);
        if (state.badgeHorizontalPadding != null) {
            intValue8 = state.badgeHorizontalPadding.intValue();
        } else {
            intValue8 = generateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeWidePadding, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        }
        state2.badgeHorizontalPadding = Integer.valueOf(intValue8);
        if (state.badgeVerticalPadding != null) {
            intValue9 = state.badgeVerticalPadding.intValue();
        } else {
            intValue9 = generateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding));
        }
        state2.badgeVerticalPadding = Integer.valueOf(intValue9);
        if (state.horizontalOffsetWithoutText != null) {
            intValue10 = state.horizontalOffsetWithoutText.intValue();
        } else {
            intValue10 = generateTypedArray.getDimensionPixelOffset(R.styleable.Badge_horizontalOffset, 0);
        }
        state2.horizontalOffsetWithoutText = Integer.valueOf(intValue10);
        if (state.verticalOffsetWithoutText != null) {
            intValue11 = state.verticalOffsetWithoutText.intValue();
        } else {
            intValue11 = generateTypedArray.getDimensionPixelOffset(R.styleable.Badge_verticalOffset, 0);
        }
        state2.verticalOffsetWithoutText = Integer.valueOf(intValue11);
        if (state.horizontalOffsetWithText != null) {
            intValue12 = state.horizontalOffsetWithText.intValue();
        } else {
            intValue12 = generateTypedArray.getDimensionPixelOffset(R.styleable.Badge_horizontalOffsetWithText, state2.horizontalOffsetWithoutText.intValue());
        }
        state2.horizontalOffsetWithText = Integer.valueOf(intValue12);
        if (state.verticalOffsetWithText != null) {
            intValue13 = state.verticalOffsetWithText.intValue();
        } else {
            intValue13 = generateTypedArray.getDimensionPixelOffset(R.styleable.Badge_verticalOffsetWithText, state2.verticalOffsetWithoutText.intValue());
        }
        state2.verticalOffsetWithText = Integer.valueOf(intValue13);
        if (state.largeFontVerticalOffsetAdjustment != null) {
            intValue14 = state.largeFontVerticalOffsetAdjustment.intValue();
        } else {
            intValue14 = generateTypedArray.getDimensionPixelOffset(R.styleable.Badge_largeFontVerticalOffsetAdjustment, 0);
        }
        state2.largeFontVerticalOffsetAdjustment = Integer.valueOf(intValue14);
        state2.additionalHorizontalOffset = Integer.valueOf(state.additionalHorizontalOffset == null ? 0 : state.additionalHorizontalOffset.intValue());
        state2.additionalVerticalOffset = Integer.valueOf(state.additionalVerticalOffset == null ? 0 : state.additionalVerticalOffset.intValue());
        if (state.autoAdjustToWithinGrandparentBounds != null) {
            booleanValue = state.autoAdjustToWithinGrandparentBounds.booleanValue();
        } else {
            booleanValue = generateTypedArray.getBoolean(R.styleable.Badge_autoAdjustToWithinGrandparentBounds, false);
        }
        state2.autoAdjustToWithinGrandparentBounds = Boolean.valueOf(booleanValue);
        generateTypedArray.recycle();
        if (state.numberLocale != null) {
            state2.numberLocale = state.numberLocale;
        } else {
            if (Build.VERSION.SDK_INT >= 24) {
                category = Locale.Category.FORMAT;
                locale = Locale.getDefault(category);
            } else {
                locale = Locale.getDefault();
            }
            state2.numberLocale = locale;
        }
        this.overridingState = state;
    }

    private TypedArray generateTypedArray(Context context, @XmlRes int i8, @AttrRes int i9, @StyleRes int i10) {
        AttributeSet attributeSet;
        int i11;
        int i12;
        if (i8 != 0) {
            AttributeSet parseDrawableXml = DrawableUtils.parseDrawableXml(context, i8, BADGE_RESOURCE_TAG);
            i11 = parseDrawableXml.getStyleAttribute();
            attributeSet = parseDrawableXml;
        } else {
            attributeSet = null;
            i11 = 0;
        }
        if (i11 == 0) {
            i12 = i10;
        } else {
            i12 = i11;
        }
        return ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.Badge, i9, i12, new int[0]);
    }

    private static int readColorFromAttributes(Context context, @NonNull TypedArray typedArray, @StyleableRes int i8) {
        return MaterialResources.getColorStateList(context, typedArray, i8).getDefaultColor();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearNumber() {
        setNumber(-1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearText() {
        setText(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Dimension(unit = 1)
    public int getAdditionalHorizontalOffset() {
        return this.currentState.additionalHorizontalOffset.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Dimension(unit = 1)
    public int getAdditionalVerticalOffset() {
        return this.currentState.additionalVerticalOffset.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getAlpha() {
        return this.currentState.alpha;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ColorInt
    public int getBackgroundColor() {
        return this.currentState.backgroundColor.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getBadgeGravity() {
        return this.currentState.badgeGravity.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Px
    public int getBadgeHorizontalPadding() {
        return this.currentState.badgeHorizontalPadding.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getBadgeShapeAppearanceOverlayResId() {
        return this.currentState.badgeShapeAppearanceOverlayResId.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getBadgeShapeAppearanceResId() {
        return this.currentState.badgeShapeAppearanceResId.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ColorInt
    public int getBadgeTextColor() {
        return this.currentState.badgeTextColor.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Px
    public int getBadgeVerticalPadding() {
        return this.currentState.badgeVerticalPadding.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getBadgeWithTextShapeAppearanceOverlayResId() {
        return this.currentState.badgeWithTextShapeAppearanceOverlayResId.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getBadgeWithTextShapeAppearanceResId() {
        return this.currentState.badgeWithTextShapeAppearanceResId.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @StringRes
    public int getContentDescriptionExceedsMaxBadgeNumberStringResource() {
        return this.currentState.contentDescriptionExceedsMaxBadgeNumberRes;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence getContentDescriptionForText() {
        return this.currentState.contentDescriptionForText;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence getContentDescriptionNumberless() {
        return this.currentState.contentDescriptionNumberless;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @PluralsRes
    public int getContentDescriptionQuantityStrings() {
        return this.currentState.contentDescriptionQuantityStrings;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Dimension(unit = 1)
    public int getHorizontalOffsetWithText() {
        return this.currentState.horizontalOffsetWithText.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Dimension(unit = 1)
    public int getHorizontalOffsetWithoutText() {
        return this.currentState.horizontalOffsetWithoutText.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Dimension(unit = 1)
    public int getLargeFontVerticalOffsetAdjustment() {
        return this.currentState.largeFontVerticalOffsetAdjustment.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMaxCharacterCount() {
        return this.currentState.maxCharacterCount;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMaxNumber() {
        return this.currentState.maxNumber;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getNumber() {
        return this.currentState.number;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Locale getNumberLocale() {
        return this.currentState.numberLocale;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public State getOverridingState() {
        return this.overridingState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getText() {
        return this.currentState.text;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @StyleRes
    public int getTextAppearanceResId() {
        return this.currentState.badgeTextAppearanceResId.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Dimension(unit = 1)
    public int getVerticalOffsetWithText() {
        return this.currentState.verticalOffsetWithText.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Dimension(unit = 1)
    public int getVerticalOffsetWithoutText() {
        return this.currentState.verticalOffsetWithoutText.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasNumber() {
        if (this.currentState.number != -1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasText() {
        if (this.currentState.text != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isAutoAdjustedToGrandparentBounds() {
        return this.currentState.autoAdjustToWithinGrandparentBounds.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isVisible() {
        return this.currentState.isVisible.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAdditionalHorizontalOffset(@Dimension(unit = 1) int i8) {
        this.overridingState.additionalHorizontalOffset = Integer.valueOf(i8);
        this.currentState.additionalHorizontalOffset = Integer.valueOf(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAdditionalVerticalOffset(@Dimension(unit = 1) int i8) {
        this.overridingState.additionalVerticalOffset = Integer.valueOf(i8);
        this.currentState.additionalVerticalOffset = Integer.valueOf(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAlpha(int i8) {
        this.overridingState.alpha = i8;
        this.currentState.alpha = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAutoAdjustToGrandparentBounds(boolean z8) {
        this.overridingState.autoAdjustToWithinGrandparentBounds = Boolean.valueOf(z8);
        this.currentState.autoAdjustToWithinGrandparentBounds = Boolean.valueOf(z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBackgroundColor(@ColorInt int i8) {
        this.overridingState.backgroundColor = Integer.valueOf(i8);
        this.currentState.backgroundColor = Integer.valueOf(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBadgeGravity(int i8) {
        this.overridingState.badgeGravity = Integer.valueOf(i8);
        this.currentState.badgeGravity = Integer.valueOf(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBadgeHorizontalPadding(@Px int i8) {
        this.overridingState.badgeHorizontalPadding = Integer.valueOf(i8);
        this.currentState.badgeHorizontalPadding = Integer.valueOf(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBadgeShapeAppearanceOverlayResId(int i8) {
        this.overridingState.badgeShapeAppearanceOverlayResId = Integer.valueOf(i8);
        this.currentState.badgeShapeAppearanceOverlayResId = Integer.valueOf(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBadgeShapeAppearanceResId(int i8) {
        this.overridingState.badgeShapeAppearanceResId = Integer.valueOf(i8);
        this.currentState.badgeShapeAppearanceResId = Integer.valueOf(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBadgeTextColor(@ColorInt int i8) {
        this.overridingState.badgeTextColor = Integer.valueOf(i8);
        this.currentState.badgeTextColor = Integer.valueOf(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBadgeVerticalPadding(@Px int i8) {
        this.overridingState.badgeVerticalPadding = Integer.valueOf(i8);
        this.currentState.badgeVerticalPadding = Integer.valueOf(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBadgeWithTextShapeAppearanceOverlayResId(int i8) {
        this.overridingState.badgeWithTextShapeAppearanceOverlayResId = Integer.valueOf(i8);
        this.currentState.badgeWithTextShapeAppearanceOverlayResId = Integer.valueOf(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBadgeWithTextShapeAppearanceResId(int i8) {
        this.overridingState.badgeWithTextShapeAppearanceResId = Integer.valueOf(i8);
        this.currentState.badgeWithTextShapeAppearanceResId = Integer.valueOf(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(@StringRes int i8) {
        this.overridingState.contentDescriptionExceedsMaxBadgeNumberRes = i8;
        this.currentState.contentDescriptionExceedsMaxBadgeNumberRes = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setContentDescriptionForText(CharSequence charSequence) {
        this.overridingState.contentDescriptionForText = charSequence;
        this.currentState.contentDescriptionForText = charSequence;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setContentDescriptionNumberless(CharSequence charSequence) {
        this.overridingState.contentDescriptionNumberless = charSequence;
        this.currentState.contentDescriptionNumberless = charSequence;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setContentDescriptionQuantityStringsResource(@PluralsRes int i8) {
        this.overridingState.contentDescriptionQuantityStrings = i8;
        this.currentState.contentDescriptionQuantityStrings = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setHorizontalOffsetWithText(@Dimension(unit = 1) int i8) {
        this.overridingState.horizontalOffsetWithText = Integer.valueOf(i8);
        this.currentState.horizontalOffsetWithText = Integer.valueOf(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setHorizontalOffsetWithoutText(@Dimension(unit = 1) int i8) {
        this.overridingState.horizontalOffsetWithoutText = Integer.valueOf(i8);
        this.currentState.horizontalOffsetWithoutText = Integer.valueOf(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setLargeFontVerticalOffsetAdjustment(@Dimension(unit = 1) int i8) {
        this.overridingState.largeFontVerticalOffsetAdjustment = Integer.valueOf(i8);
        this.currentState.largeFontVerticalOffsetAdjustment = Integer.valueOf(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMaxCharacterCount(int i8) {
        this.overridingState.maxCharacterCount = i8;
        this.currentState.maxCharacterCount = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMaxNumber(int i8) {
        this.overridingState.maxNumber = i8;
        this.currentState.maxNumber = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setNumber(int i8) {
        this.overridingState.number = i8;
        this.currentState.number = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setNumberLocale(Locale locale) {
        this.overridingState.numberLocale = locale;
        this.currentState.numberLocale = locale;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setText(String str) {
        this.overridingState.text = str;
        this.currentState.text = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setTextAppearanceResId(@StyleRes int i8) {
        this.overridingState.badgeTextAppearanceResId = Integer.valueOf(i8);
        this.currentState.badgeTextAppearanceResId = Integer.valueOf(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setVerticalOffsetWithText(@Dimension(unit = 1) int i8) {
        this.overridingState.verticalOffsetWithText = Integer.valueOf(i8);
        this.currentState.verticalOffsetWithText = Integer.valueOf(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setVerticalOffsetWithoutText(@Dimension(unit = 1) int i8) {
        this.overridingState.verticalOffsetWithoutText = Integer.valueOf(i8);
        this.currentState.verticalOffsetWithoutText = Integer.valueOf(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setVisible(boolean z8) {
        this.overridingState.isVisible = Boolean.valueOf(z8);
        this.currentState.isVisible = Boolean.valueOf(z8);
    }

    /* loaded from: classes3.dex */
    public static final class State implements Parcelable {
        private static final int BADGE_NUMBER_NONE = -1;
        public static final Parcelable.Creator<State> CREATOR = new Parcelable.Creator<State>() { // from class: com.google.android.material.badge.BadgeState.State.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public State createFromParcel(@NonNull Parcel parcel) {
                return new State(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public State[] newArray(int i8) {
                return new State[i8];
            }
        };
        private static final int NOT_SET = -2;

        @Dimension(unit = 1)
        private Integer additionalHorizontalOffset;

        @Dimension(unit = 1)
        private Integer additionalVerticalOffset;
        private int alpha;
        private Boolean autoAdjustToWithinGrandparentBounds;

        @ColorInt
        private Integer backgroundColor;
        private Integer badgeGravity;

        @Px
        private Integer badgeHorizontalPadding;

        @XmlRes
        private int badgeResId;

        @StyleRes
        private Integer badgeShapeAppearanceOverlayResId;

        @StyleRes
        private Integer badgeShapeAppearanceResId;

        @StyleRes
        private Integer badgeTextAppearanceResId;

        @ColorInt
        private Integer badgeTextColor;

        @Px
        private Integer badgeVerticalPadding;

        @StyleRes
        private Integer badgeWithTextShapeAppearanceOverlayResId;

        @StyleRes
        private Integer badgeWithTextShapeAppearanceResId;

        @StringRes
        private int contentDescriptionExceedsMaxBadgeNumberRes;

        @Nullable
        private CharSequence contentDescriptionForText;

        @Nullable
        private CharSequence contentDescriptionNumberless;

        @PluralsRes
        private int contentDescriptionQuantityStrings;

        @Dimension(unit = 1)
        private Integer horizontalOffsetWithText;

        @Dimension(unit = 1)
        private Integer horizontalOffsetWithoutText;
        private Boolean isVisible;

        @Dimension(unit = 1)
        private Integer largeFontVerticalOffsetAdjustment;
        private int maxCharacterCount;
        private int maxNumber;
        private int number;
        private Locale numberLocale;

        @Nullable
        private String text;

        @Dimension(unit = 1)
        private Integer verticalOffsetWithText;

        @Dimension(unit = 1)
        private Integer verticalOffsetWithoutText;

        public State() {
            this.alpha = 255;
            this.number = -2;
            this.maxCharacterCount = -2;
            this.maxNumber = -2;
            this.isVisible = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i8) {
            String str;
            parcel.writeInt(this.badgeResId);
            parcel.writeSerializable(this.backgroundColor);
            parcel.writeSerializable(this.badgeTextColor);
            parcel.writeSerializable(this.badgeTextAppearanceResId);
            parcel.writeSerializable(this.badgeShapeAppearanceResId);
            parcel.writeSerializable(this.badgeShapeAppearanceOverlayResId);
            parcel.writeSerializable(this.badgeWithTextShapeAppearanceResId);
            parcel.writeSerializable(this.badgeWithTextShapeAppearanceOverlayResId);
            parcel.writeInt(this.alpha);
            parcel.writeString(this.text);
            parcel.writeInt(this.number);
            parcel.writeInt(this.maxCharacterCount);
            parcel.writeInt(this.maxNumber);
            CharSequence charSequence = this.contentDescriptionForText;
            String str2 = null;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            parcel.writeString(str);
            CharSequence charSequence2 = this.contentDescriptionNumberless;
            if (charSequence2 != null) {
                str2 = charSequence2.toString();
            }
            parcel.writeString(str2);
            parcel.writeInt(this.contentDescriptionQuantityStrings);
            parcel.writeSerializable(this.badgeGravity);
            parcel.writeSerializable(this.badgeHorizontalPadding);
            parcel.writeSerializable(this.badgeVerticalPadding);
            parcel.writeSerializable(this.horizontalOffsetWithoutText);
            parcel.writeSerializable(this.verticalOffsetWithoutText);
            parcel.writeSerializable(this.horizontalOffsetWithText);
            parcel.writeSerializable(this.verticalOffsetWithText);
            parcel.writeSerializable(this.largeFontVerticalOffsetAdjustment);
            parcel.writeSerializable(this.additionalHorizontalOffset);
            parcel.writeSerializable(this.additionalVerticalOffset);
            parcel.writeSerializable(this.isVisible);
            parcel.writeSerializable(this.numberLocale);
            parcel.writeSerializable(this.autoAdjustToWithinGrandparentBounds);
        }

        State(@NonNull Parcel parcel) {
            this.alpha = 255;
            this.number = -2;
            this.maxCharacterCount = -2;
            this.maxNumber = -2;
            this.isVisible = Boolean.TRUE;
            this.badgeResId = parcel.readInt();
            this.backgroundColor = (Integer) parcel.readSerializable();
            this.badgeTextColor = (Integer) parcel.readSerializable();
            this.badgeTextAppearanceResId = (Integer) parcel.readSerializable();
            this.badgeShapeAppearanceResId = (Integer) parcel.readSerializable();
            this.badgeShapeAppearanceOverlayResId = (Integer) parcel.readSerializable();
            this.badgeWithTextShapeAppearanceResId = (Integer) parcel.readSerializable();
            this.badgeWithTextShapeAppearanceOverlayResId = (Integer) parcel.readSerializable();
            this.alpha = parcel.readInt();
            this.text = parcel.readString();
            this.number = parcel.readInt();
            this.maxCharacterCount = parcel.readInt();
            this.maxNumber = parcel.readInt();
            this.contentDescriptionForText = parcel.readString();
            this.contentDescriptionNumberless = parcel.readString();
            this.contentDescriptionQuantityStrings = parcel.readInt();
            this.badgeGravity = (Integer) parcel.readSerializable();
            this.badgeHorizontalPadding = (Integer) parcel.readSerializable();
            this.badgeVerticalPadding = (Integer) parcel.readSerializable();
            this.horizontalOffsetWithoutText = (Integer) parcel.readSerializable();
            this.verticalOffsetWithoutText = (Integer) parcel.readSerializable();
            this.horizontalOffsetWithText = (Integer) parcel.readSerializable();
            this.verticalOffsetWithText = (Integer) parcel.readSerializable();
            this.largeFontVerticalOffsetAdjustment = (Integer) parcel.readSerializable();
            this.additionalHorizontalOffset = (Integer) parcel.readSerializable();
            this.additionalVerticalOffset = (Integer) parcel.readSerializable();
            this.isVisible = (Boolean) parcel.readSerializable();
            this.numberLocale = (Locale) parcel.readSerializable();
            this.autoAdjustToWithinGrandparentBounds = (Boolean) parcel.readSerializable();
        }
    }
}
