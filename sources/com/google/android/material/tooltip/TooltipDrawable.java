package com.google.android.material.tooltip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.MarkerEdgeTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OffsetEdgeTreatment;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class TooltipDrawable extends MaterialShapeDrawable implements TextDrawableHelper.TextDrawableDelegate {

    @StyleRes
    private static final int DEFAULT_STYLE = R.style.Widget_MaterialComponents_Tooltip;

    @AttrRes
    private static final int DEFAULT_THEME_ATTR = R.attr.tooltipStyle;
    private int arrowSize;

    @NonNull
    private final View.OnLayoutChangeListener attachedViewLayoutChangeListener;

    @NonNull
    private final Context context;

    @NonNull
    private final Rect displayFrame;

    @Nullable
    private final Paint.FontMetrics fontMetrics;
    private float labelOpacity;
    private int layoutMargin;
    private int locationOnScreenX;
    private int minHeight;
    private int minWidth;
    private int padding;
    private boolean showMarker;

    @Nullable
    private CharSequence text;

    @NonNull
    private final TextDrawableHelper textDrawableHelper;
    private final float tooltipPivotX;
    private float tooltipPivotY;
    private float tooltipScaleX;
    private float tooltipScaleY;

    private TooltipDrawable(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i8, @StyleRes int i9) {
        super(context, attributeSet, i8, i9);
        this.fontMetrics = new Paint.FontMetrics();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper;
        this.attachedViewLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.google.android.material.tooltip.TooltipDrawable.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                TooltipDrawable.this.updateLocationOnScreen(view);
            }
        };
        this.displayFrame = new Rect();
        this.tooltipScaleX = 1.0f;
        this.tooltipScaleY = 1.0f;
        this.tooltipPivotX = 0.5f;
        this.tooltipPivotY = 0.5f;
        this.labelOpacity = 1.0f;
        this.context = context;
        textDrawableHelper.getTextPaint().density = context.getResources().getDisplayMetrics().density;
        textDrawableHelper.getTextPaint().setTextAlign(Paint.Align.CENTER);
    }

    private float calculatePointerOffset() {
        int i8;
        if (((this.displayFrame.right - getBounds().right) - this.locationOnScreenX) - this.layoutMargin < 0) {
            i8 = ((this.displayFrame.right - getBounds().right) - this.locationOnScreenX) - this.layoutMargin;
        } else if (((this.displayFrame.left - getBounds().left) - this.locationOnScreenX) + this.layoutMargin > 0) {
            i8 = ((this.displayFrame.left - getBounds().left) - this.locationOnScreenX) + this.layoutMargin;
        } else {
            return 0.0f;
        }
        return i8;
    }

    private float calculateTextCenterFromBaseline() {
        this.textDrawableHelper.getTextPaint().getFontMetrics(this.fontMetrics);
        Paint.FontMetrics fontMetrics = this.fontMetrics;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private float calculateTextOriginAndAlignment(@NonNull Rect rect) {
        return rect.centerY() - calculateTextCenterFromBaseline();
    }

    @NonNull
    public static TooltipDrawable create(@NonNull Context context) {
        return createFromAttributes(context, null, DEFAULT_THEME_ATTR, DEFAULT_STYLE);
    }

    @NonNull
    public static TooltipDrawable createFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i8, @StyleRes int i9) {
        TooltipDrawable tooltipDrawable = new TooltipDrawable(context, attributeSet, i8, i9);
        tooltipDrawable.loadFromAttributes(attributeSet, i8, i9);
        return tooltipDrawable;
    }

    private EdgeTreatment createMarkerEdge() {
        float f8 = -calculatePointerOffset();
        float width = ((float) (getBounds().width() - (this.arrowSize * Math.sqrt(2.0d)))) / 2.0f;
        return new OffsetEdgeTreatment(new MarkerEdgeTreatment(this.arrowSize), Math.min(Math.max(f8, -width), width));
    }

    private void drawText(@NonNull Canvas canvas) {
        if (this.text == null) {
            return;
        }
        int calculateTextOriginAndAlignment = (int) calculateTextOriginAndAlignment(getBounds());
        if (this.textDrawableHelper.getTextAppearance() != null) {
            this.textDrawableHelper.getTextPaint().drawableState = getState();
            this.textDrawableHelper.updateTextPaintDrawState(this.context);
            this.textDrawableHelper.getTextPaint().setAlpha((int) (this.labelOpacity * 255.0f));
        }
        CharSequence charSequence = this.text;
        canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), calculateTextOriginAndAlignment, this.textDrawableHelper.getTextPaint());
    }

    private float getTextWidth() {
        CharSequence charSequence = this.text;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.textDrawableHelper.getTextWidth(charSequence.toString());
    }

    private void loadFromAttributes(@Nullable AttributeSet attributeSet, @AttrRes int i8, @StyleRes int i9) {
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(this.context, attributeSet, R.styleable.Tooltip, i8, i9, new int[0]);
        this.arrowSize = this.context.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
        boolean z8 = obtainStyledAttributes.getBoolean(R.styleable.Tooltip_showMarker, true);
        this.showMarker = z8;
        if (z8) {
            setShapeAppearanceModel(getShapeAppearanceModel().toBuilder().setBottomEdge(createMarkerEdge()).build());
        } else {
            this.arrowSize = 0;
        }
        setText(obtainStyledAttributes.getText(R.styleable.Tooltip_android_text));
        TextAppearance textAppearance = MaterialResources.getTextAppearance(this.context, obtainStyledAttributes, R.styleable.Tooltip_android_textAppearance);
        if (textAppearance != null) {
            int i10 = R.styleable.Tooltip_android_textColor;
            if (obtainStyledAttributes.hasValue(i10)) {
                textAppearance.setTextColor(MaterialResources.getColorStateList(this.context, obtainStyledAttributes, i10));
            }
        }
        setTextAppearance(textAppearance);
        setFillColor(ColorStateList.valueOf(obtainStyledAttributes.getColor(R.styleable.Tooltip_backgroundTint, MaterialColors.layer(ColorUtils.setAlphaComponent(MaterialColors.getColor(this.context, android.R.attr.colorBackground, TooltipDrawable.class.getCanonicalName()), 229), ColorUtils.setAlphaComponent(MaterialColors.getColor(this.context, R.attr.colorOnBackground, TooltipDrawable.class.getCanonicalName()), 153)))));
        setStrokeColor(ColorStateList.valueOf(MaterialColors.getColor(this.context, R.attr.colorSurface, TooltipDrawable.class.getCanonicalName())));
        this.padding = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_padding, 0);
        this.minWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_minWidth, 0);
        this.minHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_minHeight, 0);
        this.layoutMargin = obtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_layout_margin, 0);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLocationOnScreen(@NonNull View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.locationOnScreenX = iArr[0];
        view.getWindowVisibleDisplayFrame(this.displayFrame);
    }

    public void detachView(@Nullable View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.attachedViewLayoutChangeListener);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        canvas.save();
        float calculatePointerOffset = calculatePointerOffset();
        float f8 = (float) (-((this.arrowSize * Math.sqrt(2.0d)) - this.arrowSize));
        canvas.scale(this.tooltipScaleX, this.tooltipScaleY, getBounds().left + (getBounds().width() * 0.5f), getBounds().top + (getBounds().height() * this.tooltipPivotY));
        canvas.translate(calculatePointerOffset, f8);
        super.draw(canvas);
        drawText(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.textDrawableHelper.getTextPaint().getTextSize(), this.minHeight);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.padding * 2) + getTextWidth(), this.minWidth);
    }

    public int getLayoutMargin() {
        return this.layoutMargin;
    }

    public int getMinHeight() {
        return this.minHeight;
    }

    public int getMinWidth() {
        return this.minWidth;
    }

    @Nullable
    public CharSequence getText() {
        return this.text;
    }

    @Nullable
    public TextAppearance getTextAppearance() {
        return this.textDrawableHelper.getTextAppearance();
    }

    public int getTextPadding() {
        return this.padding;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.showMarker) {
            setShapeAppearanceModel(getShapeAppearanceModel().toBuilder().setBottomEdge(createMarkerEdge()).build());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        invalidateSelf();
    }

    public void setLayoutMargin(@Px int i8) {
        this.layoutMargin = i8;
        invalidateSelf();
    }

    public void setMinHeight(@Px int i8) {
        this.minHeight = i8;
        invalidateSelf();
    }

    public void setMinWidth(@Px int i8) {
        this.minWidth = i8;
        invalidateSelf();
    }

    public void setRelativeToView(@Nullable View view) {
        if (view == null) {
            return;
        }
        updateLocationOnScreen(view);
        view.addOnLayoutChangeListener(this.attachedViewLayoutChangeListener);
    }

    public void setRevealFraction(@FloatRange(from = 0.0d, to = 1.0d) float f8) {
        this.tooltipPivotY = 1.2f;
        this.tooltipScaleX = f8;
        this.tooltipScaleY = f8;
        this.labelOpacity = AnimationUtils.lerp(0.0f, 1.0f, 0.19f, 1.0f, f8);
        invalidateSelf();
    }

    public void setText(@Nullable CharSequence charSequence) {
        if (!TextUtils.equals(this.text, charSequence)) {
            this.text = charSequence;
            this.textDrawableHelper.setTextWidthDirty(true);
            invalidateSelf();
        }
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance) {
        this.textDrawableHelper.setTextAppearance(textAppearance, this.context);
    }

    public void setTextAppearanceResource(@StyleRes int i8) {
        setTextAppearance(new TextAppearance(this.context, i8));
    }

    public void setTextPadding(@Px int i8) {
        this.padding = i8;
        invalidateSelf();
    }

    public void setTextResource(@StringRes int i8) {
        setText(this.context.getResources().getString(i8));
    }

    @NonNull
    public static TooltipDrawable createFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        return createFromAttributes(context, attributeSet, DEFAULT_THEME_ATTR, DEFAULT_STYLE);
    }
}
