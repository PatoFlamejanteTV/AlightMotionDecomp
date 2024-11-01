package androidx.leanback.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.core.view.ViewCompat;
import androidx.leanback.R;

/* loaded from: classes3.dex */
public class SearchOrbView extends FrameLayout implements View.OnClickListener {
    private boolean mAttachedToWindow;
    private boolean mColorAnimationEnabled;
    private ValueAnimator mColorAnimator;
    private final ArgbEvaluator mColorEvaluator;
    private Colors mColors;
    private final ValueAnimator.AnimatorUpdateListener mFocusUpdateListener;
    private final float mFocusedZ;
    private final float mFocusedZoom;
    private ImageView mIcon;
    private Drawable mIconDrawable;
    private View.OnClickListener mListener;
    private final int mPulseDurationMs;
    private View mRootView;
    private final int mScaleDurationMs;
    private View mSearchOrbView;
    private ValueAnimator mShadowFocusAnimator;
    private final float mUnfocusedZ;
    private final ValueAnimator.AnimatorUpdateListener mUpdateListener;

    /* loaded from: classes3.dex */
    public static class Colors {
        private static final float BRIGHTNESS_ALPHA = 0.15f;

        @ColorInt
        public int brightColor;

        @ColorInt
        public int color;

        @ColorInt
        public int iconColor;

        public Colors(@ColorInt int i8) {
            this(i8, i8);
        }

        public static int getBrightColor(int i8) {
            return Color.argb((int) ((Color.alpha(i8) * 0.85f) + 38.25f), (int) ((Color.red(i8) * 0.85f) + 38.25f), (int) ((Color.green(i8) * 0.85f) + 38.25f), (int) ((Color.blue(i8) * 0.85f) + 38.25f));
        }

        public Colors(@ColorInt int i8, @ColorInt int i9) {
            this(i8, i9, 0);
        }

        public Colors(@ColorInt int i8, @ColorInt int i9, @ColorInt int i10) {
            this.color = i8;
            this.brightColor = i9 == i8 ? getBrightColor(i8) : i9;
            this.iconColor = i10;
        }
    }

    public SearchOrbView(Context context) {
        this(context, null);
    }

    private void startShadowFocusAnimation(boolean z8, int i8) {
        if (this.mShadowFocusAnimator == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.mShadowFocusAnimator = ofFloat;
            ofFloat.addUpdateListener(this.mFocusUpdateListener);
        }
        if (z8) {
            this.mShadowFocusAnimator.start();
        } else {
            this.mShadowFocusAnimator.reverse();
        }
        this.mShadowFocusAnimator.setDuration(i8);
    }

    private void updateColorAnimator() {
        ValueAnimator valueAnimator = this.mColorAnimator;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.mColorAnimator = null;
        }
        if (this.mColorAnimationEnabled && this.mAttachedToWindow) {
            ValueAnimator ofObject = ValueAnimator.ofObject(this.mColorEvaluator, Integer.valueOf(this.mColors.color), Integer.valueOf(this.mColors.brightColor), Integer.valueOf(this.mColors.color));
            this.mColorAnimator = ofObject;
            ofObject.setRepeatCount(-1);
            this.mColorAnimator.setDuration(this.mPulseDurationMs * 2);
            this.mColorAnimator.addUpdateListener(this.mUpdateListener);
            this.mColorAnimator.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void animateOnFocus(boolean z8) {
        float f8;
        if (z8) {
            f8 = this.mFocusedZoom;
        } else {
            f8 = 1.0f;
        }
        this.mRootView.animate().scaleX(f8).scaleY(f8).setDuration(this.mScaleDurationMs).start();
        startShadowFocusAnimation(z8, this.mScaleDurationMs);
        enableOrbColorAnimation(z8);
    }

    public void enableOrbColorAnimation(boolean z8) {
        this.mColorAnimationEnabled = z8;
        updateColorAnimator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getFocusedZoom() {
        return this.mFocusedZoom;
    }

    int getLayoutResourceId() {
        return R.layout.lb_search_orb;
    }

    @ColorInt
    public int getOrbColor() {
        return this.mColors.color;
    }

    public Colors getOrbColors() {
        return this.mColors;
    }

    public Drawable getOrbIcon() {
        return this.mIconDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mAttachedToWindow = true;
        updateColorAnimator();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.mListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.mAttachedToWindow = false;
        updateColorAnimator();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z8, int i8, Rect rect) {
        super.onFocusChanged(z8, i8, rect);
        animateOnFocus(z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void scaleOrbViewOnly(float f8) {
        this.mSearchOrbView.setScaleX(f8);
        this.mSearchOrbView.setScaleY(f8);
    }

    public void setOnOrbClickedListener(View.OnClickListener onClickListener) {
        this.mListener = onClickListener;
    }

    public void setOrbColor(int i8) {
        setOrbColors(new Colors(i8, i8, 0));
    }

    public void setOrbColors(Colors colors) {
        this.mColors = colors;
        this.mIcon.setColorFilter(colors.iconColor);
        if (this.mColorAnimator == null) {
            setOrbViewColor(this.mColors.color);
        } else {
            enableOrbColorAnimation(true);
        }
    }

    public void setOrbIcon(Drawable drawable) {
        this.mIconDrawable = drawable;
        this.mIcon.setImageDrawable(drawable);
    }

    void setOrbViewColor(int i8) {
        if (this.mSearchOrbView.getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) this.mSearchOrbView.getBackground()).setColor(i8);
        }
    }

    void setSearchOrbZ(float f8) {
        View view = this.mSearchOrbView;
        float f9 = this.mUnfocusedZ;
        ViewCompat.setZ(view, f9 + (f8 * (this.mFocusedZ - f9)));
    }

    public SearchOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchOrbViewStyle);
    }

    @Deprecated
    public void setOrbColor(@ColorInt int i8, @ColorInt int i9) {
        setOrbColors(new Colors(i8, i9, 0));
    }

    public SearchOrbView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mColorEvaluator = new ArgbEvaluator();
        this.mUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.leanback.widget.SearchOrbView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SearchOrbView.this.setOrbViewColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        };
        this.mFocusUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.leanback.widget.SearchOrbView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SearchOrbView.this.setSearchOrbZ(valueAnimator.getAnimatedFraction());
            }
        };
        Resources resources = context.getResources();
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResourceId(), (ViewGroup) this, true);
        this.mRootView = inflate;
        this.mSearchOrbView = inflate.findViewById(R.id.search_orb);
        this.mIcon = (ImageView) this.mRootView.findViewById(R.id.icon);
        this.mFocusedZoom = context.getResources().getFraction(R.fraction.lb_search_orb_focused_zoom, 1, 1);
        this.mPulseDurationMs = context.getResources().getInteger(R.integer.lb_search_orb_pulse_duration_ms);
        this.mScaleDurationMs = context.getResources().getInteger(R.integer.lb_search_orb_scale_duration_ms);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.lb_search_orb_focused_z);
        this.mFocusedZ = dimensionPixelSize;
        this.mUnfocusedZ = context.getResources().getDimensionPixelSize(R.dimen.lb_search_orb_unfocused_z);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.lbSearchOrbView, i8, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.lbSearchOrbView_searchOrbIcon);
        setOrbIcon(drawable == null ? resources.getDrawable(R.drawable.lb_ic_in_app_search) : drawable);
        int color = obtainStyledAttributes.getColor(R.styleable.lbSearchOrbView_searchOrbColor, resources.getColor(R.color.lb_default_search_color));
        setOrbColors(new Colors(color, obtainStyledAttributes.getColor(R.styleable.lbSearchOrbView_searchOrbBrightColor, color), obtainStyledAttributes.getColor(R.styleable.lbSearchOrbView_searchOrbIconColor, 0)));
        obtainStyledAttributes.recycle();
        setFocusable(true);
        setClipChildren(false);
        setOnClickListener(this);
        setSoundEffectsEnabled(false);
        setSearchOrbZ(0.0f);
        ViewCompat.setZ(this.mIcon, dimensionPixelSize);
    }
}
