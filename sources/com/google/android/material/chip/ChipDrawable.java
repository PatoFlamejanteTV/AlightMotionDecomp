package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.AnimatorRes;
import androidx.annotation.AttrRes;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.internal.view.SupportMenu;
import androidx.core.text.BidiFormatter;
import androidx.core.view.ViewCompat;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class ChipDrawable extends MaterialShapeDrawable implements TintAwareDrawable, Drawable.Callback, TextDrawableHelper.TextDrawableDelegate {
    private static final boolean DEBUG = false;
    private static final int MAX_CHIP_ICON_HEIGHT = 24;
    private static final String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";
    private int alpha;
    private boolean checkable;

    @Nullable
    private Drawable checkedIcon;

    @Nullable
    private ColorStateList checkedIconTint;
    private boolean checkedIconVisible;

    @Nullable
    private ColorStateList chipBackgroundColor;
    private float chipCornerRadius;
    private float chipEndPadding;

    @Nullable
    private Drawable chipIcon;
    private float chipIconSize;

    @Nullable
    private ColorStateList chipIconTint;
    private boolean chipIconVisible;
    private float chipMinHeight;
    private final Paint chipPaint;
    private float chipStartPadding;

    @Nullable
    private ColorStateList chipStrokeColor;
    private float chipStrokeWidth;

    @Nullable
    private ColorStateList chipSurfaceColor;

    @Nullable
    private Drawable closeIcon;

    @Nullable
    private CharSequence closeIconContentDescription;
    private float closeIconEndPadding;

    @Nullable
    private Drawable closeIconRipple;
    private float closeIconSize;
    private float closeIconStartPadding;
    private int[] closeIconStateSet;

    @Nullable
    private ColorStateList closeIconTint;
    private boolean closeIconVisible;

    @Nullable
    private ColorFilter colorFilter;

    @Nullable
    private ColorStateList compatRippleColor;

    @NonNull
    private final Context context;
    private boolean currentChecked;

    @ColorInt
    private int currentChipBackgroundColor;

    @ColorInt
    private int currentChipStrokeColor;

    @ColorInt
    private int currentChipSurfaceColor;

    @ColorInt
    private int currentCompatRippleColor;

    @ColorInt
    private int currentCompositeSurfaceBackgroundColor;

    @ColorInt
    private int currentTextColor;

    @ColorInt
    private int currentTint;

    @Nullable
    private final Paint debugPaint;

    @NonNull
    private WeakReference<Delegate> delegate;
    private final Paint.FontMetrics fontMetrics;
    private boolean hasChipIconTint;

    @Nullable
    private MotionSpec hideMotionSpec;
    private float iconEndPadding;
    private float iconStartPadding;
    private boolean isShapeThemingEnabled;
    private int maxWidth;
    private final PointF pointF;
    private final RectF rectF;

    @Nullable
    private ColorStateList rippleColor;
    private final Path shapePath;
    private boolean shouldDrawText;

    @Nullable
    private MotionSpec showMotionSpec;

    @Nullable
    private CharSequence text;

    @NonNull
    private final TextDrawableHelper textDrawableHelper;
    private float textEndPadding;
    private float textStartPadding;

    @Nullable
    private ColorStateList tint;

    @Nullable
    private PorterDuffColorFilter tintFilter;

    @Nullable
    private PorterDuff.Mode tintMode;
    private TextUtils.TruncateAt truncateAt;
    private boolean useCompatRipple;
    private static final int[] DEFAULT_STATE = {R.attr.state_enabled};
    private static final ShapeDrawable closeIconRippleMask = new ShapeDrawable(new OvalShape());

    /* loaded from: classes3.dex */
    public interface Delegate {
        void onChipDrawableSizeChange();
    }

    private ChipDrawable(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i8, @StyleRes int i9) {
        super(context, attributeSet, i8, i9);
        this.chipCornerRadius = -1.0f;
        this.chipPaint = new Paint(1);
        this.fontMetrics = new Paint.FontMetrics();
        this.rectF = new RectF();
        this.pointF = new PointF();
        this.shapePath = new Path();
        this.alpha = 255;
        this.tintMode = PorterDuff.Mode.SRC_IN;
        this.delegate = new WeakReference<>(null);
        initializeElevationOverlay(context);
        this.context = context;
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper;
        this.text = "";
        textDrawableHelper.getTextPaint().density = context.getResources().getDisplayMetrics().density;
        this.debugPaint = null;
        int[] iArr = DEFAULT_STATE;
        setState(iArr);
        setCloseIconState(iArr);
        this.shouldDrawText = true;
        if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
            closeIconRippleMask.setTint(-1);
        }
    }

    private void applyChildDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.closeIcon) {
            if (drawable.isStateful()) {
                drawable.setState(getCloseIconState());
            }
            DrawableCompat.setTintList(drawable, this.closeIconTint);
            return;
        }
        Drawable drawable2 = this.chipIcon;
        if (drawable == drawable2 && this.hasChipIconTint) {
            DrawableCompat.setTintList(drawable2, this.chipIconTint);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void calculateChipIconBounds(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (showsChipIcon() || showsCheckedIcon()) {
            float f8 = this.chipStartPadding + this.iconStartPadding;
            float currentChipIconWidth = getCurrentChipIconWidth();
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f9 = rect.left + f8;
                rectF.left = f9;
                rectF.right = f9 + currentChipIconWidth;
            } else {
                float f10 = rect.right - f8;
                rectF.right = f10;
                rectF.left = f10 - currentChipIconWidth;
            }
            float currentChipIconHeight = getCurrentChipIconHeight();
            float exactCenterY = rect.exactCenterY() - (currentChipIconHeight / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + currentChipIconHeight;
        }
    }

    private void calculateChipTouchBounds(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.set(rect);
        if (showsCloseIcon()) {
            float f8 = this.chipEndPadding + this.closeIconEndPadding + this.closeIconSize + this.closeIconStartPadding + this.textEndPadding;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF.right = rect.right - f8;
            } else {
                rectF.left = rect.left + f8;
            }
        }
    }

    private void calculateCloseIconBounds(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (showsCloseIcon()) {
            float f8 = this.chipEndPadding + this.closeIconEndPadding;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f9 = rect.right - f8;
                rectF.right = f9;
                rectF.left = f9 - this.closeIconSize;
            } else {
                float f10 = rect.left + f8;
                rectF.left = f10;
                rectF.right = f10 + this.closeIconSize;
            }
            float exactCenterY = rect.exactCenterY();
            float f11 = this.closeIconSize;
            float f12 = exactCenterY - (f11 / 2.0f);
            rectF.top = f12;
            rectF.bottom = f12 + f11;
        }
    }

    private void calculateCloseIconTouchBounds(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (showsCloseIcon()) {
            float f8 = this.chipEndPadding + this.closeIconEndPadding + this.closeIconSize + this.closeIconStartPadding + this.textEndPadding;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f9 = rect.right;
                rectF.right = f9;
                rectF.left = f9 - f8;
            } else {
                int i8 = rect.left;
                rectF.left = i8;
                rectF.right = i8 + f8;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void calculateTextBounds(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (this.text != null) {
            float calculateChipIconWidth = this.chipStartPadding + calculateChipIconWidth() + this.textStartPadding;
            float calculateCloseIconWidth = this.chipEndPadding + calculateCloseIconWidth() + this.textEndPadding;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF.left = rect.left + calculateChipIconWidth;
                rectF.right = rect.right - calculateCloseIconWidth;
            } else {
                rectF.left = rect.left + calculateCloseIconWidth;
                rectF.right = rect.right - calculateChipIconWidth;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private float calculateTextCenterFromBaseline() {
        this.textDrawableHelper.getTextPaint().getFontMetrics(this.fontMetrics);
        Paint.FontMetrics fontMetrics = this.fontMetrics;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private boolean canShowCheckedIcon() {
        if (this.checkedIconVisible && this.checkedIcon != null && this.checkable) {
            return true;
        }
        return false;
    }

    @NonNull
    public static ChipDrawable createFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i8, @StyleRes int i9) {
        ChipDrawable chipDrawable = new ChipDrawable(context, attributeSet, i8, i9);
        chipDrawable.loadFromAttributes(attributeSet, i8, i9);
        return chipDrawable;
    }

    @NonNull
    public static ChipDrawable createFromResource(@NonNull Context context, @XmlRes int i8) {
        AttributeSet parseDrawableXml = DrawableUtils.parseDrawableXml(context, i8, "chip");
        int styleAttribute = parseDrawableXml.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = com.google.android.material.R.style.Widget_MaterialComponents_Chip_Entry;
        }
        return createFromAttributes(context, parseDrawableXml, com.google.android.material.R.attr.chipStandaloneStyle, styleAttribute);
    }

    private void drawCheckedIcon(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (showsCheckedIcon()) {
            calculateChipIconBounds(rect, this.rectF);
            RectF rectF = this.rectF;
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas.translate(f8, f9);
            this.checkedIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            this.checkedIcon.draw(canvas);
            canvas.translate(-f8, -f9);
        }
    }

    private void drawChipBackground(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (!this.isShapeThemingEnabled) {
            this.chipPaint.setColor(this.currentChipBackgroundColor);
            this.chipPaint.setStyle(Paint.Style.FILL);
            this.chipPaint.setColorFilter(getTintColorFilter());
            this.rectF.set(rect);
            canvas.drawRoundRect(this.rectF, getChipCornerRadius(), getChipCornerRadius(), this.chipPaint);
        }
    }

    private void drawChipIcon(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (showsChipIcon()) {
            calculateChipIconBounds(rect, this.rectF);
            RectF rectF = this.rectF;
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas.translate(f8, f9);
            this.chipIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            this.chipIcon.draw(canvas);
            canvas.translate(-f8, -f9);
        }
    }

    private void drawChipStroke(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.chipStrokeWidth > 0.0f && !this.isShapeThemingEnabled) {
            this.chipPaint.setColor(this.currentChipStrokeColor);
            this.chipPaint.setStyle(Paint.Style.STROKE);
            if (!this.isShapeThemingEnabled) {
                this.chipPaint.setColorFilter(getTintColorFilter());
            }
            RectF rectF = this.rectF;
            float f8 = rect.left;
            float f9 = this.chipStrokeWidth;
            rectF.set(f8 + (f9 / 2.0f), rect.top + (f9 / 2.0f), rect.right - (f9 / 2.0f), rect.bottom - (f9 / 2.0f));
            float f10 = this.chipCornerRadius - (this.chipStrokeWidth / 2.0f);
            canvas.drawRoundRect(this.rectF, f10, f10, this.chipPaint);
        }
    }

    private void drawChipSurface(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (!this.isShapeThemingEnabled) {
            this.chipPaint.setColor(this.currentChipSurfaceColor);
            this.chipPaint.setStyle(Paint.Style.FILL);
            this.rectF.set(rect);
            canvas.drawRoundRect(this.rectF, getChipCornerRadius(), getChipCornerRadius(), this.chipPaint);
        }
    }

    private void drawCloseIcon(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (showsCloseIcon()) {
            calculateCloseIconBounds(rect, this.rectF);
            RectF rectF = this.rectF;
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas.translate(f8, f9);
            this.closeIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
                this.closeIconRipple.setBounds(this.closeIcon.getBounds());
                this.closeIconRipple.jumpToCurrentState();
                this.closeIconRipple.draw(canvas);
            } else {
                this.closeIcon.draw(canvas);
            }
            canvas.translate(-f8, -f9);
        }
    }

    private void drawCompatRipple(@NonNull Canvas canvas, @NonNull Rect rect) {
        this.chipPaint.setColor(this.currentCompatRippleColor);
        this.chipPaint.setStyle(Paint.Style.FILL);
        this.rectF.set(rect);
        if (!this.isShapeThemingEnabled) {
            canvas.drawRoundRect(this.rectF, getChipCornerRadius(), getChipCornerRadius(), this.chipPaint);
        } else {
            calculatePathForSize(new RectF(rect), this.shapePath);
            super.drawShape(canvas, this.chipPaint, this.shapePath, getBoundsAsRectF());
        }
    }

    private void drawDebug(@NonNull Canvas canvas, @NonNull Rect rect) {
        Paint paint = this.debugPaint;
        if (paint != null) {
            paint.setColor(ColorUtils.setAlphaComponent(ViewCompat.MEASURED_STATE_MASK, ModuleDescriptor.MODULE_VERSION));
            canvas.drawRect(rect, this.debugPaint);
            if (showsChipIcon() || showsCheckedIcon()) {
                calculateChipIconBounds(rect, this.rectF);
                canvas.drawRect(this.rectF, this.debugPaint);
            }
            if (this.text != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.debugPaint);
            }
            if (showsCloseIcon()) {
                calculateCloseIconBounds(rect, this.rectF);
                canvas.drawRect(this.rectF, this.debugPaint);
            }
            this.debugPaint.setColor(ColorUtils.setAlphaComponent(SupportMenu.CATEGORY_MASK, ModuleDescriptor.MODULE_VERSION));
            calculateChipTouchBounds(rect, this.rectF);
            canvas.drawRect(this.rectF, this.debugPaint);
            this.debugPaint.setColor(ColorUtils.setAlphaComponent(-16711936, ModuleDescriptor.MODULE_VERSION));
            calculateCloseIconTouchBounds(rect, this.rectF);
            canvas.drawRect(this.rectF, this.debugPaint);
        }
    }

    private void drawText(@NonNull Canvas canvas, @NonNull Rect rect) {
        boolean z8;
        if (this.text != null) {
            Paint.Align calculateTextOriginAndAlignment = calculateTextOriginAndAlignment(rect, this.pointF);
            calculateTextBounds(rect, this.rectF);
            if (this.textDrawableHelper.getTextAppearance() != null) {
                this.textDrawableHelper.getTextPaint().drawableState = getState();
                this.textDrawableHelper.updateTextPaintDrawState(this.context);
            }
            this.textDrawableHelper.getTextPaint().setTextAlign(calculateTextOriginAndAlignment);
            int i8 = 0;
            if (Math.round(this.textDrawableHelper.getTextWidth(getText().toString())) > Math.round(this.rectF.width())) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                i8 = canvas.save();
                canvas.clipRect(this.rectF);
            }
            CharSequence charSequence = this.text;
            if (z8 && this.truncateAt != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.textDrawableHelper.getTextPaint(), this.rectF.width(), this.truncateAt);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.pointF;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.textDrawableHelper.getTextPaint());
            if (z8) {
                canvas.restoreToCount(i8);
            }
        }
    }

    private float getCurrentChipIconHeight() {
        Drawable drawable;
        if (this.currentChecked) {
            drawable = this.checkedIcon;
        } else {
            drawable = this.chipIcon;
        }
        float f8 = this.chipIconSize;
        if (f8 <= 0.0f && drawable != null) {
            f8 = (float) Math.ceil(ViewUtils.dpToPx(this.context, 24));
            if (drawable.getIntrinsicHeight() <= f8) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f8;
    }

    private float getCurrentChipIconWidth() {
        Drawable drawable;
        if (this.currentChecked) {
            drawable = this.checkedIcon;
        } else {
            drawable = this.chipIcon;
        }
        float f8 = this.chipIconSize;
        if (f8 <= 0.0f && drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return f8;
    }

    @Nullable
    private ColorFilter getTintColorFilter() {
        ColorFilter colorFilter = this.colorFilter;
        if (colorFilter == null) {
            return this.tintFilter;
        }
        return colorFilter;
    }

    private static boolean hasState(@Nullable int[] iArr, @AttrRes int i8) {
        if (iArr == null) {
            return false;
        }
        for (int i9 : iArr) {
            if (i9 == i8) {
                return true;
            }
        }
        return false;
    }

    private void loadFromAttributes(@Nullable AttributeSet attributeSet, @AttrRes int i8, @StyleRes int i9) {
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(this.context, attributeSet, com.google.android.material.R.styleable.Chip, i8, i9, new int[0]);
        this.isShapeThemingEnabled = obtainStyledAttributes.hasValue(com.google.android.material.R.styleable.Chip_shapeAppearance);
        setChipSurfaceColor(MaterialResources.getColorStateList(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipSurfaceColor));
        setChipBackgroundColor(MaterialResources.getColorStateList(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipBackgroundColor));
        setChipMinHeight(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipMinHeight, 0.0f));
        int i10 = com.google.android.material.R.styleable.Chip_chipCornerRadius;
        if (obtainStyledAttributes.hasValue(i10)) {
            setChipCornerRadius(obtainStyledAttributes.getDimension(i10, 0.0f));
        }
        setChipStrokeColor(MaterialResources.getColorStateList(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipStrokeColor));
        setChipStrokeWidth(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipStrokeWidth, 0.0f));
        setRippleColor(MaterialResources.getColorStateList(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_rippleColor));
        setText(obtainStyledAttributes.getText(com.google.android.material.R.styleable.Chip_android_text));
        TextAppearance textAppearance = MaterialResources.getTextAppearance(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_android_textAppearance);
        textAppearance.setTextSize(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_android_textSize, textAppearance.getTextSize()));
        if (Build.VERSION.SDK_INT < 23) {
            textAppearance.setTextColor(MaterialResources.getColorStateList(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_android_textColor));
        }
        setTextAppearance(textAppearance);
        int i11 = obtainStyledAttributes.getInt(com.google.android.material.R.styleable.Chip_android_ellipsize, 0);
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    setEllipsize(TextUtils.TruncateAt.END);
                }
            } else {
                setEllipsize(TextUtils.TruncateAt.MIDDLE);
            }
        } else {
            setEllipsize(TextUtils.TruncateAt.START);
        }
        setChipIconVisible(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(NAMESPACE_APP, "chipIconEnabled") != null && attributeSet.getAttributeValue(NAMESPACE_APP, "chipIconVisible") == null) {
            setChipIconVisible(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_chipIconEnabled, false));
        }
        setChipIcon(MaterialResources.getDrawable(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipIcon));
        int i12 = com.google.android.material.R.styleable.Chip_chipIconTint;
        if (obtainStyledAttributes.hasValue(i12)) {
            setChipIconTint(MaterialResources.getColorStateList(this.context, obtainStyledAttributes, i12));
        }
        setChipIconSize(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipIconSize, -1.0f));
        setCloseIconVisible(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(NAMESPACE_APP, "closeIconEnabled") != null && attributeSet.getAttributeValue(NAMESPACE_APP, "closeIconVisible") == null) {
            setCloseIconVisible(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_closeIconEnabled, false));
        }
        setCloseIcon(MaterialResources.getDrawable(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_closeIcon));
        setCloseIconTint(MaterialResources.getColorStateList(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_closeIconTint));
        setCloseIconSize(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_closeIconSize, 0.0f));
        setCheckable(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_android_checkable, false));
        setCheckedIconVisible(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(NAMESPACE_APP, "checkedIconEnabled") != null && attributeSet.getAttributeValue(NAMESPACE_APP, "checkedIconVisible") == null) {
            setCheckedIconVisible(obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_checkedIconEnabled, false));
        }
        setCheckedIcon(MaterialResources.getDrawable(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_checkedIcon));
        int i13 = com.google.android.material.R.styleable.Chip_checkedIconTint;
        if (obtainStyledAttributes.hasValue(i13)) {
            setCheckedIconTint(MaterialResources.getColorStateList(this.context, obtainStyledAttributes, i13));
        }
        setShowMotionSpec(MotionSpec.createFromAttribute(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_showMotionSpec));
        setHideMotionSpec(MotionSpec.createFromAttribute(this.context, obtainStyledAttributes, com.google.android.material.R.styleable.Chip_hideMotionSpec));
        setChipStartPadding(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipStartPadding, 0.0f));
        setIconStartPadding(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_iconStartPadding, 0.0f));
        setIconEndPadding(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_iconEndPadding, 0.0f));
        setTextStartPadding(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_textStartPadding, 0.0f));
        setTextEndPadding(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_textEndPadding, 0.0f));
        setCloseIconStartPadding(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_closeIconStartPadding, 0.0f));
        setCloseIconEndPadding(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_closeIconEndPadding, 0.0f));
        setChipEndPadding(obtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipEndPadding, 0.0f));
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.Chip_android_maxWidth, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }

    private void setChipSurfaceColor(@Nullable ColorStateList colorStateList) {
        if (this.chipSurfaceColor != colorStateList) {
            this.chipSurfaceColor = colorStateList;
            onStateChange(getState());
        }
    }

    private boolean showsCheckedIcon() {
        if (this.checkedIconVisible && this.checkedIcon != null && this.currentChecked) {
            return true;
        }
        return false;
    }

    private boolean showsChipIcon() {
        if (this.chipIconVisible && this.chipIcon != null) {
            return true;
        }
        return false;
    }

    private boolean showsCloseIcon() {
        if (this.closeIconVisible && this.closeIcon != null) {
            return true;
        }
        return false;
    }

    private void unapplyChildDrawable(@Nullable Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void updateCompatRippleColor() {
        ColorStateList colorStateList;
        if (this.useCompatRipple) {
            colorStateList = RippleUtils.sanitizeRippleDrawableColor(this.rippleColor);
        } else {
            colorStateList = null;
        }
        this.compatRippleColor = colorStateList;
    }

    @TargetApi(21)
    private void updateFrameworkCloseIconRipple() {
        this.closeIconRipple = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(getRippleColor()), this.closeIcon, closeIconRippleMask);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float calculateChipIconWidth() {
        if (!showsChipIcon() && !showsCheckedIcon()) {
            return 0.0f;
        }
        return this.iconStartPadding + getCurrentChipIconWidth() + this.iconEndPadding;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float calculateCloseIconWidth() {
        if (showsCloseIcon()) {
            return this.closeIconStartPadding + this.closeIconSize + this.closeIconEndPadding;
        }
        return 0.0f;
    }

    @NonNull
    Paint.Align calculateTextOriginAndAlignment(@NonNull Rect rect, @NonNull PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.text != null) {
            float calculateChipIconWidth = this.chipStartPadding + calculateChipIconWidth() + this.textStartPadding;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                pointF.x = rect.left + calculateChipIconWidth;
            } else {
                pointF.x = rect.right - calculateChipIconWidth;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - calculateTextCenterFromBaseline();
        }
        return align;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int i8;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i9 = this.alpha;
            if (i9 < 255) {
                i8 = CanvasCompat.saveLayerAlpha(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i9);
            } else {
                i8 = 0;
            }
            drawChipSurface(canvas, bounds);
            drawChipBackground(canvas, bounds);
            if (this.isShapeThemingEnabled) {
                super.draw(canvas);
            }
            drawChipStroke(canvas, bounds);
            drawCompatRipple(canvas, bounds);
            drawChipIcon(canvas, bounds);
            drawCheckedIcon(canvas, bounds);
            if (this.shouldDrawText) {
                drawText(canvas, bounds);
            }
            drawCloseIcon(canvas, bounds);
            drawDebug(canvas, bounds);
            if (this.alpha < 255) {
                canvas.restoreToCount(i8);
            }
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.alpha;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.checkedIcon;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.checkedIconTint;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        return this.chipBackgroundColor;
    }

    public float getChipCornerRadius() {
        if (this.isShapeThemingEnabled) {
            return getTopLeftCornerResolvedSize();
        }
        return this.chipCornerRadius;
    }

    public float getChipEndPadding() {
        return this.chipEndPadding;
    }

    @Nullable
    public Drawable getChipIcon() {
        Drawable drawable = this.chipIcon;
        if (drawable != null) {
            return DrawableCompat.unwrap(drawable);
        }
        return null;
    }

    public float getChipIconSize() {
        return this.chipIconSize;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        return this.chipIconTint;
    }

    public float getChipMinHeight() {
        return this.chipMinHeight;
    }

    public float getChipStartPadding() {
        return this.chipStartPadding;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        return this.chipStrokeColor;
    }

    public float getChipStrokeWidth() {
        return this.chipStrokeWidth;
    }

    public void getChipTouchBounds(@NonNull RectF rectF) {
        calculateChipTouchBounds(getBounds(), rectF);
    }

    @Nullable
    public Drawable getCloseIcon() {
        Drawable drawable = this.closeIcon;
        if (drawable != null) {
            return DrawableCompat.unwrap(drawable);
        }
        return null;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        return this.closeIconContentDescription;
    }

    public float getCloseIconEndPadding() {
        return this.closeIconEndPadding;
    }

    public float getCloseIconSize() {
        return this.closeIconSize;
    }

    public float getCloseIconStartPadding() {
        return this.closeIconStartPadding;
    }

    @NonNull
    public int[] getCloseIconState() {
        return this.closeIconStateSet;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        return this.closeIconTint;
    }

    public void getCloseIconTouchBounds(@NonNull RectF rectF) {
        calculateCloseIconTouchBounds(getBounds(), rectF);
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public TextUtils.TruncateAt getEllipsize() {
        return this.truncateAt;
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return this.hideMotionSpec;
    }

    public float getIconEndPadding() {
        return this.iconEndPadding;
    }

    public float getIconStartPadding() {
        return this.iconStartPadding;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.chipMinHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.chipStartPadding + calculateChipIconWidth() + this.textStartPadding + this.textDrawableHelper.getTextWidth(getText().toString()) + this.textEndPadding + calculateCloseIconWidth() + this.chipEndPadding), this.maxWidth);
    }

    @Px
    public int getMaxWidth() {
        return this.maxWidth;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.isShapeThemingEnabled) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.chipCornerRadius);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.chipCornerRadius);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    @Nullable
    public ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return this.showMotionSpec;
    }

    @Nullable
    public CharSequence getText() {
        return this.text;
    }

    @Nullable
    public TextAppearance getTextAppearance() {
        return this.textDrawableHelper.getTextAppearance();
    }

    public float getTextEndPadding() {
        return this.textEndPadding;
    }

    public float getTextStartPadding() {
        return this.textStartPadding;
    }

    public boolean getUseCompatRipple() {
        return this.useCompatRipple;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isCheckable() {
        return this.checkable;
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        return isCheckedIconVisible();
    }

    public boolean isCheckedIconVisible() {
        return this.checkedIconVisible;
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        return isChipIconVisible();
    }

    public boolean isChipIconVisible() {
        return this.chipIconVisible;
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        return isCloseIconVisible();
    }

    public boolean isCloseIconStateful() {
        return isStateful(this.closeIcon);
    }

    public boolean isCloseIconVisible() {
        return this.closeIconVisible;
    }

    boolean isShapeThemingEnabled() {
        return this.isShapeThemingEnabled;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return isStateful(this.chipSurfaceColor) || isStateful(this.chipBackgroundColor) || isStateful(this.chipStrokeColor) || (this.useCompatRipple && isStateful(this.compatRippleColor)) || isStateful(this.textDrawableHelper.getTextAppearance()) || canShowCheckedIcon() || isStateful(this.chipIcon) || isStateful(this.checkedIcon) || isStateful(this.tint);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i8) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i8);
        if (showsChipIcon()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.chipIcon, i8);
        }
        if (showsCheckedIcon()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.checkedIcon, i8);
        }
        if (showsCloseIcon()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.closeIcon, i8);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i8) {
        boolean onLevelChange = super.onLevelChange(i8);
        if (showsChipIcon()) {
            onLevelChange |= this.chipIcon.setLevel(i8);
        }
        if (showsCheckedIcon()) {
            onLevelChange |= this.checkedIcon.setLevel(i8);
        }
        if (showsCloseIcon()) {
            onLevelChange |= this.closeIcon.setLevel(i8);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    protected void onSizeChange() {
        Delegate delegate = this.delegate.get();
        if (delegate != null) {
            delegate.onChipDrawableSizeChange();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(@NonNull int[] iArr) {
        if (this.isShapeThemingEnabled) {
            super.onStateChange(iArr);
        }
        return onStateChange(iArr, getCloseIconState());
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        onSizeChange();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j8) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j8);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        if (this.alpha != i8) {
            this.alpha = i8;
            invalidateSelf();
        }
    }

    public void setCheckable(boolean z8) {
        if (this.checkable != z8) {
            this.checkable = z8;
            float calculateChipIconWidth = calculateChipIconWidth();
            if (!z8 && this.currentChecked) {
                this.currentChecked = false;
            }
            float calculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setCheckableResource(@BoolRes int i8) {
        setCheckable(this.context.getResources().getBoolean(i8));
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        if (this.checkedIcon != drawable) {
            float calculateChipIconWidth = calculateChipIconWidth();
            this.checkedIcon = drawable;
            float calculateChipIconWidth2 = calculateChipIconWidth();
            unapplyChildDrawable(this.checkedIcon);
            applyChildDrawable(this.checkedIcon);
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z8) {
        setCheckedIconVisible(z8);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i8) {
        setCheckedIconVisible(this.context.getResources().getBoolean(i8));
    }

    public void setCheckedIconResource(@DrawableRes int i8) {
        setCheckedIcon(AppCompatResources.getDrawable(this.context, i8));
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        if (this.checkedIconTint != colorStateList) {
            this.checkedIconTint = colorStateList;
            if (canShowCheckedIcon()) {
                DrawableCompat.setTintList(this.checkedIcon, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setCheckedIconTintResource(@ColorRes int i8) {
        setCheckedIconTint(AppCompatResources.getColorStateList(this.context, i8));
    }

    public void setCheckedIconVisible(@BoolRes int i8) {
        setCheckedIconVisible(this.context.getResources().getBoolean(i8));
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        if (this.chipBackgroundColor != colorStateList) {
            this.chipBackgroundColor = colorStateList;
            onStateChange(getState());
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int i8) {
        setChipBackgroundColor(AppCompatResources.getColorStateList(this.context, i8));
    }

    @Deprecated
    public void setChipCornerRadius(float f8) {
        if (this.chipCornerRadius != f8) {
            this.chipCornerRadius = f8;
            setShapeAppearanceModel(getShapeAppearanceModel().withCornerSize(f8));
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i8) {
        setChipCornerRadius(this.context.getResources().getDimension(i8));
    }

    public void setChipEndPadding(float f8) {
        if (this.chipEndPadding != f8) {
            this.chipEndPadding = f8;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipEndPaddingResource(@DimenRes int i8) {
        setChipEndPadding(this.context.getResources().getDimension(i8));
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        Drawable drawable2;
        Drawable chipIcon = getChipIcon();
        if (chipIcon != drawable) {
            float calculateChipIconWidth = calculateChipIconWidth();
            if (drawable != null) {
                drawable2 = DrawableCompat.wrap(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.chipIcon = drawable2;
            float calculateChipIconWidth2 = calculateChipIconWidth();
            unapplyChildDrawable(chipIcon);
            if (showsChipIcon()) {
                applyChildDrawable(this.chipIcon);
            }
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z8) {
        setChipIconVisible(z8);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i8) {
        setChipIconVisible(i8);
    }

    public void setChipIconResource(@DrawableRes int i8) {
        setChipIcon(AppCompatResources.getDrawable(this.context, i8));
    }

    public void setChipIconSize(float f8) {
        if (this.chipIconSize != f8) {
            float calculateChipIconWidth = calculateChipIconWidth();
            this.chipIconSize = f8;
            float calculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setChipIconSizeResource(@DimenRes int i8) {
        setChipIconSize(this.context.getResources().getDimension(i8));
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        this.hasChipIconTint = true;
        if (this.chipIconTint != colorStateList) {
            this.chipIconTint = colorStateList;
            if (showsChipIcon()) {
                DrawableCompat.setTintList(this.chipIcon, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipIconTintResource(@ColorRes int i8) {
        setChipIconTint(AppCompatResources.getColorStateList(this.context, i8));
    }

    public void setChipIconVisible(@BoolRes int i8) {
        setChipIconVisible(this.context.getResources().getBoolean(i8));
    }

    public void setChipMinHeight(float f8) {
        if (this.chipMinHeight != f8) {
            this.chipMinHeight = f8;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipMinHeightResource(@DimenRes int i8) {
        setChipMinHeight(this.context.getResources().getDimension(i8));
    }

    public void setChipStartPadding(float f8) {
        if (this.chipStartPadding != f8) {
            this.chipStartPadding = f8;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipStartPaddingResource(@DimenRes int i8) {
        setChipStartPadding(this.context.getResources().getDimension(i8));
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        if (this.chipStrokeColor != colorStateList) {
            this.chipStrokeColor = colorStateList;
            if (this.isShapeThemingEnabled) {
                setStrokeColor(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i8) {
        setChipStrokeColor(AppCompatResources.getColorStateList(this.context, i8));
    }

    public void setChipStrokeWidth(float f8) {
        if (this.chipStrokeWidth != f8) {
            this.chipStrokeWidth = f8;
            this.chipPaint.setStrokeWidth(f8);
            if (this.isShapeThemingEnabled) {
                super.setStrokeWidth(f8);
            }
            invalidateSelf();
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int i8) {
        setChipStrokeWidth(this.context.getResources().getDimension(i8));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        Drawable drawable2;
        Drawable closeIcon = getCloseIcon();
        if (closeIcon != drawable) {
            float calculateCloseIconWidth = calculateCloseIconWidth();
            if (drawable != null) {
                drawable2 = DrawableCompat.wrap(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.closeIcon = drawable2;
            if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
                updateFrameworkCloseIconRipple();
            }
            float calculateCloseIconWidth2 = calculateCloseIconWidth();
            unapplyChildDrawable(closeIcon);
            if (showsCloseIcon()) {
                applyChildDrawable(this.closeIcon);
            }
            invalidateSelf();
            if (calculateCloseIconWidth != calculateCloseIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        if (this.closeIconContentDescription != charSequence) {
            this.closeIconContentDescription = BidiFormatter.getInstance().unicodeWrap(charSequence);
            invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z8) {
        setCloseIconVisible(z8);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i8) {
        setCloseIconVisible(i8);
    }

    public void setCloseIconEndPadding(float f8) {
        if (this.closeIconEndPadding != f8) {
            this.closeIconEndPadding = f8;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i8) {
        setCloseIconEndPadding(this.context.getResources().getDimension(i8));
    }

    public void setCloseIconResource(@DrawableRes int i8) {
        setCloseIcon(AppCompatResources.getDrawable(this.context, i8));
    }

    public void setCloseIconSize(float f8) {
        if (this.closeIconSize != f8) {
            this.closeIconSize = f8;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconSizeResource(@DimenRes int i8) {
        setCloseIconSize(this.context.getResources().getDimension(i8));
    }

    public void setCloseIconStartPadding(float f8) {
        if (this.closeIconStartPadding != f8) {
            this.closeIconStartPadding = f8;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i8) {
        setCloseIconStartPadding(this.context.getResources().getDimension(i8));
    }

    public boolean setCloseIconState(@NonNull int[] iArr) {
        if (!Arrays.equals(this.closeIconStateSet, iArr)) {
            this.closeIconStateSet = iArr;
            if (showsCloseIcon()) {
                return onStateChange(getState(), iArr);
            }
            return false;
        }
        return false;
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        if (this.closeIconTint != colorStateList) {
            this.closeIconTint = colorStateList;
            if (showsCloseIcon()) {
                DrawableCompat.setTintList(this.closeIcon, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setCloseIconTintResource(@ColorRes int i8) {
        setCloseIconTint(AppCompatResources.getColorStateList(this.context, i8));
    }

    public void setCloseIconVisible(@BoolRes int i8) {
        setCloseIconVisible(this.context.getResources().getBoolean(i8));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        if (this.colorFilter != colorFilter) {
            this.colorFilter = colorFilter;
            invalidateSelf();
        }
    }

    public void setDelegate(@Nullable Delegate delegate) {
        this.delegate = new WeakReference<>(delegate);
    }

    public void setEllipsize(@Nullable TextUtils.TruncateAt truncateAt) {
        this.truncateAt = truncateAt;
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        this.hideMotionSpec = motionSpec;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i8) {
        setHideMotionSpec(MotionSpec.createFromResource(this.context, i8));
    }

    public void setIconEndPadding(float f8) {
        if (this.iconEndPadding != f8) {
            float calculateChipIconWidth = calculateChipIconWidth();
            this.iconEndPadding = f8;
            float calculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setIconEndPaddingResource(@DimenRes int i8) {
        setIconEndPadding(this.context.getResources().getDimension(i8));
    }

    public void setIconStartPadding(float f8) {
        if (this.iconStartPadding != f8) {
            float calculateChipIconWidth = calculateChipIconWidth();
            this.iconStartPadding = f8;
            float calculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setIconStartPaddingResource(@DimenRes int i8) {
        setIconStartPadding(this.context.getResources().getDimension(i8));
    }

    public void setMaxWidth(@Px int i8) {
        this.maxWidth = i8;
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.rippleColor != colorStateList) {
            this.rippleColor = colorStateList;
            updateCompatRippleColor();
            onStateChange(getState());
        }
    }

    public void setRippleColorResource(@ColorRes int i8) {
        setRippleColor(AppCompatResources.getColorStateList(this.context, i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setShouldDrawText(boolean z8) {
        this.shouldDrawText = z8;
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        this.showMotionSpec = motionSpec;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i8) {
        setShowMotionSpec(MotionSpec.createFromResource(this.context, i8));
    }

    public void setText(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.text, charSequence)) {
            this.text = charSequence;
            this.textDrawableHelper.setTextWidthDirty(true);
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance) {
        this.textDrawableHelper.setTextAppearance(textAppearance, this.context);
    }

    public void setTextAppearanceResource(@StyleRes int i8) {
        setTextAppearance(new TextAppearance(this.context, i8));
    }

    public void setTextColor(@ColorInt int i8) {
        setTextColor(ColorStateList.valueOf(i8));
    }

    public void setTextEndPadding(float f8) {
        if (this.textEndPadding != f8) {
            this.textEndPadding = f8;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setTextEndPaddingResource(@DimenRes int i8) {
        setTextEndPadding(this.context.getResources().getDimension(i8));
    }

    public void setTextResource(@StringRes int i8) {
        setText(this.context.getResources().getString(i8));
    }

    public void setTextSize(@Dimension float f8) {
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.setTextSize(f8);
            this.textDrawableHelper.getTextPaint().setTextSize(f8);
            onTextSizeChange();
        }
    }

    public void setTextStartPadding(float f8) {
        if (this.textStartPadding != f8) {
            this.textStartPadding = f8;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setTextStartPaddingResource(@DimenRes int i8) {
        setTextStartPadding(this.context.getResources().getDimension(i8));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        if (this.tint != colorStateList) {
            this.tint = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.tintMode != mode) {
            this.tintMode = mode;
            this.tintFilter = DrawableUtils.updateTintFilter(this, this.tint, mode);
            invalidateSelf();
        }
    }

    public void setUseCompatRipple(boolean z8) {
        if (this.useCompatRipple != z8) {
            this.useCompatRipple = z8;
            updateCompatRippleColor();
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z8, boolean z9) {
        boolean visible = super.setVisible(z8, z9);
        if (showsChipIcon()) {
            visible |= this.chipIcon.setVisible(z8, z9);
        }
        if (showsCheckedIcon()) {
            visible |= this.checkedIcon.setVisible(z8, z9);
        }
        if (showsCloseIcon()) {
            visible |= this.closeIcon.setVisible(z8, z9);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean shouldDrawText() {
        return this.shouldDrawText;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void setCheckedIconVisible(boolean z8) {
        if (this.checkedIconVisible != z8) {
            boolean showsCheckedIcon = showsCheckedIcon();
            this.checkedIconVisible = z8;
            boolean showsCheckedIcon2 = showsCheckedIcon();
            if (showsCheckedIcon != showsCheckedIcon2) {
                if (showsCheckedIcon2) {
                    applyChildDrawable(this.checkedIcon);
                } else {
                    unapplyChildDrawable(this.checkedIcon);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public void setChipIconVisible(boolean z8) {
        if (this.chipIconVisible != z8) {
            boolean showsChipIcon = showsChipIcon();
            this.chipIconVisible = z8;
            boolean showsChipIcon2 = showsChipIcon();
            if (showsChipIcon != showsChipIcon2) {
                if (showsChipIcon2) {
                    applyChildDrawable(this.chipIcon);
                } else {
                    unapplyChildDrawable(this.chipIcon);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public void setCloseIconVisible(boolean z8) {
        if (this.closeIconVisible != z8) {
            boolean showsCloseIcon = showsCloseIcon();
            this.closeIconVisible = z8;
            boolean showsCloseIcon2 = showsCloseIcon();
            if (showsCloseIcon != showsCloseIcon2) {
                if (showsCloseIcon2) {
                    applyChildDrawable(this.closeIcon);
                } else {
                    unapplyChildDrawable(this.closeIcon);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.setTextColor(colorStateList);
            invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean onStateChange(@androidx.annotation.NonNull int[] r7, @androidx.annotation.NonNull int[] r8) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipDrawable.onStateChange(int[], int[]):boolean");
    }

    private static boolean isStateful(@Nullable ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private static boolean isStateful(@Nullable Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean isStateful(@Nullable TextAppearance textAppearance) {
        return (textAppearance == null || textAppearance.getTextColor() == null || !textAppearance.getTextColor().isStateful()) ? false : true;
    }
}
