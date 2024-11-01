package androidx.leanback.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.leanback.R;

/* loaded from: classes3.dex */
public class ImageCardView extends BaseCardView {
    private static final String ALPHA = "alpha";
    public static final int CARD_TYPE_FLAG_CONTENT = 2;
    public static final int CARD_TYPE_FLAG_ICON_LEFT = 8;
    public static final int CARD_TYPE_FLAG_ICON_RIGHT = 4;
    public static final int CARD_TYPE_FLAG_IMAGE_ONLY = 0;
    public static final int CARD_TYPE_FLAG_TITLE = 1;
    private boolean mAttachedToWindow;
    private ImageView mBadgeImage;
    private TextView mContentView;
    ObjectAnimator mFadeInAnimator;
    private ImageView mImageView;
    private ViewGroup mInfoArea;
    private TextView mTitleView;

    @Deprecated
    public ImageCardView(Context context, int i8) {
        this(new ContextThemeWrapper(context, i8));
    }

    private void buildImageCardView(AttributeSet attributeSet, int i8, int i9) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        setFocusable(true);
        setFocusableInTouchMode(true);
        LayoutInflater from = LayoutInflater.from(getContext());
        from.inflate(R.layout.lb_image_card_view, this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.lbImageCardView, i8, i9);
        int i10 = obtainStyledAttributes.getInt(R.styleable.lbImageCardView_lbImageCardViewType, 0);
        if (i10 == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((i10 & 1) == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((i10 & 2) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 4) == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && (i10 & 8) == 8) {
            z12 = true;
        } else {
            z12 = false;
        }
        ImageView imageView = (ImageView) findViewById(R.id.main_image);
        this.mImageView = imageView;
        if (imageView.getDrawable() == null) {
            this.mImageView.setVisibility(4);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mImageView, "alpha", 1.0f);
        this.mFadeInAnimator = ofFloat;
        ofFloat.setDuration(this.mImageView.getResources().getInteger(android.R.integer.config_shortAnimTime));
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.info_field);
        this.mInfoArea = viewGroup;
        if (z8) {
            removeView(viewGroup);
            obtainStyledAttributes.recycle();
            return;
        }
        if (z9) {
            TextView textView = (TextView) from.inflate(R.layout.lb_image_card_view_themed_title, viewGroup, false);
            this.mTitleView = textView;
            this.mInfoArea.addView(textView);
        }
        if (z10) {
            TextView textView2 = (TextView) from.inflate(R.layout.lb_image_card_view_themed_content, this.mInfoArea, false);
            this.mContentView = textView2;
            this.mInfoArea.addView(textView2);
        }
        if (z11 || z12) {
            int i11 = R.layout.lb_image_card_view_themed_badge_right;
            if (z12) {
                i11 = R.layout.lb_image_card_view_themed_badge_left;
            }
            ImageView imageView2 = (ImageView) from.inflate(i11, this.mInfoArea, false);
            this.mBadgeImage = imageView2;
            this.mInfoArea.addView(imageView2);
        }
        if (z9 && !z10 && this.mBadgeImage != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mTitleView.getLayoutParams();
            if (z12) {
                layoutParams.addRule(17, this.mBadgeImage.getId());
            } else {
                layoutParams.addRule(16, this.mBadgeImage.getId());
            }
            this.mTitleView.setLayoutParams(layoutParams);
        }
        if (z10) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.mContentView.getLayoutParams();
            if (!z9) {
                layoutParams2.addRule(10);
            }
            if (z12) {
                layoutParams2.removeRule(16);
                layoutParams2.removeRule(20);
                layoutParams2.addRule(17, this.mBadgeImage.getId());
            }
            this.mContentView.setLayoutParams(layoutParams2);
        }
        ImageView imageView3 = this.mBadgeImage;
        if (imageView3 != null) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) imageView3.getLayoutParams();
            if (z10) {
                layoutParams3.addRule(8, this.mContentView.getId());
            } else if (z9) {
                layoutParams3.addRule(8, this.mTitleView.getId());
            }
            this.mBadgeImage.setLayoutParams(layoutParams3);
        }
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.lbImageCardView_infoAreaBackground);
        if (drawable != null) {
            setInfoAreaBackground(drawable);
        }
        ImageView imageView4 = this.mBadgeImage;
        if (imageView4 != null && imageView4.getDrawable() == null) {
            this.mBadgeImage.setVisibility(8);
        }
        obtainStyledAttributes.recycle();
    }

    private void fadeIn() {
        this.mImageView.setAlpha(0.0f);
        if (this.mAttachedToWindow) {
            this.mFadeInAnimator.start();
        }
    }

    public Drawable getBadgeImage() {
        ImageView imageView = this.mBadgeImage;
        if (imageView == null) {
            return null;
        }
        return imageView.getDrawable();
    }

    public CharSequence getContentText() {
        TextView textView = this.mContentView;
        if (textView == null) {
            return null;
        }
        return textView.getText();
    }

    public Drawable getInfoAreaBackground() {
        ViewGroup viewGroup = this.mInfoArea;
        if (viewGroup != null) {
            return viewGroup.getBackground();
        }
        return null;
    }

    public Drawable getMainImage() {
        ImageView imageView = this.mImageView;
        if (imageView == null) {
            return null;
        }
        return imageView.getDrawable();
    }

    public final ImageView getMainImageView() {
        return this.mImageView;
    }

    public CharSequence getTitleText() {
        TextView textView = this.mTitleView;
        if (textView == null) {
            return null;
        }
        return textView.getText();
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mAttachedToWindow = true;
        if (this.mImageView.getAlpha() == 0.0f) {
            fadeIn();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.leanback.widget.BaseCardView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.mAttachedToWindow = false;
        this.mFadeInAnimator.cancel();
        this.mImageView.setAlpha(1.0f);
        super.onDetachedFromWindow();
    }

    public void setBadgeImage(Drawable drawable) {
        ImageView imageView = this.mBadgeImage;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        if (drawable != null) {
            this.mBadgeImage.setVisibility(0);
        } else {
            this.mBadgeImage.setVisibility(8);
        }
    }

    public void setContentText(CharSequence charSequence) {
        TextView textView = this.mContentView;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public void setInfoAreaBackground(Drawable drawable) {
        ViewGroup viewGroup = this.mInfoArea;
        if (viewGroup != null) {
            viewGroup.setBackground(drawable);
        }
    }

    public void setInfoAreaBackgroundColor(@ColorInt int i8) {
        ViewGroup viewGroup = this.mInfoArea;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(i8);
        }
    }

    public void setMainImage(Drawable drawable) {
        setMainImage(drawable, true);
    }

    public void setMainImageAdjustViewBounds(boolean z8) {
        ImageView imageView = this.mImageView;
        if (imageView != null) {
            imageView.setAdjustViewBounds(z8);
        }
    }

    public void setMainImageDimensions(int i8, int i9) {
        ViewGroup.LayoutParams layoutParams = this.mImageView.getLayoutParams();
        layoutParams.width = i8;
        layoutParams.height = i9;
        this.mImageView.setLayoutParams(layoutParams);
    }

    public void setMainImageScaleType(ImageView.ScaleType scaleType) {
        ImageView imageView = this.mImageView;
        if (imageView != null) {
            imageView.setScaleType(scaleType);
        }
    }

    public void setTitleText(CharSequence charSequence) {
        TextView textView = this.mTitleView;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public ImageCardView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        buildImageCardView(attributeSet, i8, R.style.Widget_Leanback_ImageCardView);
    }

    public void setMainImage(Drawable drawable, boolean z8) {
        ImageView imageView = this.mImageView;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            this.mFadeInAnimator.cancel();
            this.mImageView.setAlpha(1.0f);
            this.mImageView.setVisibility(4);
        } else {
            this.mImageView.setVisibility(0);
            if (z8) {
                fadeIn();
            } else {
                this.mFadeInAnimator.cancel();
                this.mImageView.setAlpha(1.0f);
            }
        }
    }

    public ImageCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ImageCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageCardViewStyle);
    }
}
