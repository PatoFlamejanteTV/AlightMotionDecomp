package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {R.attr.colorBackground};
    private static final CardViewImpl IMPL;
    private final CardViewDelegate mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    static {
        CardViewApi21Impl cardViewApi21Impl = new CardViewApi21Impl();
        IMPL = cardViewApi21Impl;
        cardViewApi21Impl.initStatic();
    }

    public CardView(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return IMPL.getBackgroundColor(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.getElevation(this.mCardViewDelegate);
    }

    @Px
    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    @Px
    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    @Px
    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    @Px
    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return IMPL.getMaxElevation(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.getRadius(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i8, int i9) {
        if (!(IMPL instanceof CardViewApi21Impl)) {
            int mode = View.MeasureSpec.getMode(i8);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i8 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.getMinWidth(this.mCardViewDelegate)), View.MeasureSpec.getSize(i8)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i9);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i9 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.getMinHeight(this.mCardViewDelegate)), View.MeasureSpec.getSize(i9)), mode2);
            }
            super.onMeasure(i8, i9);
            return;
        }
        super.onMeasure(i8, i9);
    }

    public void setCardBackgroundColor(@ColorInt int i8) {
        IMPL.setBackgroundColor(this.mCardViewDelegate, ColorStateList.valueOf(i8));
    }

    public void setCardElevation(float f8) {
        IMPL.setElevation(this.mCardViewDelegate, f8);
    }

    public void setContentPadding(@Px int i8, @Px int i9, @Px int i10, @Px int i11) {
        this.mContentPadding.set(i8, i9, i10, i11);
        IMPL.updatePadding(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f8) {
        IMPL.setMaxElevation(this.mCardViewDelegate, f8);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i8) {
        this.mUserSetMinHeight = i8;
        super.setMinimumHeight(i8);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i8) {
        this.mUserSetMinWidth = i8;
        super.setMinimumWidth(i8);
    }

    @Override // android.view.View
    public void setPadding(int i8, int i9, int i10, int i11) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i8, int i9, int i10, int i11) {
    }

    public void setPreventCornerOverlap(boolean z8) {
        if (z8 != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z8;
            IMPL.onPreventCornerOverlapChanged(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f8) {
        IMPL.setRadius(this.mCardViewDelegate, f8);
    }

    public void setUseCompatPadding(boolean z8) {
        if (this.mCompatPadding != z8) {
            this.mCompatPadding = z8;
            IMPL.onCompatPaddingChanged(this.mCardViewDelegate);
        }
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.cardview.R.attr.cardViewStyle);
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        IMPL.setBackgroundColor(this.mCardViewDelegate, colorStateList);
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        CardViewDelegate cardViewDelegate = new CardViewDelegate() { // from class: androidx.cardview.widget.CardView.1
            private Drawable mCardBackground;

            @Override // androidx.cardview.widget.CardViewDelegate
            public Drawable getCardBackground() {
                return this.mCardBackground;
            }

            @Override // androidx.cardview.widget.CardViewDelegate
            public View getCardView() {
                return CardView.this;
            }

            @Override // androidx.cardview.widget.CardViewDelegate
            public boolean getPreventCornerOverlap() {
                return CardView.this.getPreventCornerOverlap();
            }

            @Override // androidx.cardview.widget.CardViewDelegate
            public boolean getUseCompatPadding() {
                return CardView.this.getUseCompatPadding();
            }

            @Override // androidx.cardview.widget.CardViewDelegate
            public void setCardBackground(Drawable drawable) {
                this.mCardBackground = drawable;
                CardView.this.setBackgroundDrawable(drawable);
            }

            @Override // androidx.cardview.widget.CardViewDelegate
            public void setMinWidthHeightInternal(int i9, int i10) {
                CardView cardView = CardView.this;
                if (i9 > cardView.mUserSetMinWidth) {
                    CardView.super.setMinimumWidth(i9);
                }
                CardView cardView2 = CardView.this;
                if (i10 > cardView2.mUserSetMinHeight) {
                    CardView.super.setMinimumHeight(i10);
                }
            }

            @Override // androidx.cardview.widget.CardViewDelegate
            public void setShadowPadding(int i9, int i10, int i11, int i12) {
                CardView.this.mShadowBounds.set(i9, i10, i11, i12);
                CardView cardView = CardView.this;
                Rect rect2 = cardView.mContentPadding;
                CardView.super.setPadding(i9 + rect2.left, i10 + rect2.top, i11 + rect2.right, i12 + rect2.bottom);
            }
        };
        this.mCardViewDelegate = cardViewDelegate;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.cardview.R.styleable.CardView, i8, androidx.cardview.R.style.CardView);
        int i9 = androidx.cardview.R.styleable.CardView_cardBackgroundColor;
        if (obtainStyledAttributes.hasValue(i9)) {
            valueOf = obtainStyledAttributes.getColorStateList(i9);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(androidx.cardview.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(androidx.cardview.R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(androidx.cardview.R.styleable.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(androidx.cardview.R.styleable.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(androidx.cardview.R.styleable.CardView_cardMaxElevation, 0.0f);
        this.mCompatPadding = obtainStyledAttributes.getBoolean(androidx.cardview.R.styleable.CardView_cardUseCompatPadding, false);
        this.mPreventCornerOverlap = obtainStyledAttributes.getBoolean(androidx.cardview.R.styleable.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPaddingBottom, dimensionPixelSize);
        float f8 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = obtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_android_minWidth, 0);
        this.mUserSetMinHeight = obtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        IMPL.initialize(cardViewDelegate, context, colorStateList, dimension, dimension2, f8);
    }
}
