package androidx.leanback.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class BaseCardView extends FrameLayout {
    public static final int CARD_REGION_VISIBLE_ACTIVATED = 1;
    public static final int CARD_REGION_VISIBLE_ALWAYS = 0;
    public static final int CARD_REGION_VISIBLE_SELECTED = 2;
    public static final int CARD_TYPE_INFO_OVER = 1;
    public static final int CARD_TYPE_INFO_UNDER = 2;
    public static final int CARD_TYPE_INFO_UNDER_WITH_EXTRA = 3;
    private static final int CARD_TYPE_INVALID = 4;
    public static final int CARD_TYPE_MAIN_ONLY = 0;
    private static final boolean DEBUG = false;
    private static final int[] LB_PRESSED_STATE_SET = {R.attr.state_pressed};
    private static final String TAG = "BaseCardView";
    private final int mActivatedAnimDuration;
    private Animation mAnim;
    private final Runnable mAnimationTrigger;
    private int mCardType;
    private boolean mDelaySelectedAnim;
    ArrayList<View> mExtraViewList;
    private int mExtraVisibility;
    float mInfoAlpha;
    float mInfoOffset;
    ArrayList<View> mInfoViewList;
    float mInfoVisFraction;
    private int mInfoVisibility;
    private ArrayList<View> mMainViewList;
    private int mMeasuredHeight;
    private int mMeasuredWidth;
    private final int mSelectedAnimDuration;
    private int mSelectedAnimationDelay;

    /* loaded from: classes3.dex */
    class AnimationBase extends Animation {
        AnimationBase() {
        }

        @VisibleForTesting
        final void mockEnd() {
            applyTransformation(1.0f, null);
            BaseCardView.this.cancelAnimations();
        }

        @VisibleForTesting
        final void mockStart() {
            getTransformation(0L, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class InfoAlphaAnimation extends AnimationBase {
        private float mDelta;
        private float mStartValue;

        public InfoAlphaAnimation(float f8, float f9) {
            super();
            this.mStartValue = f8;
            this.mDelta = f9 - f8;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f8, Transformation transformation) {
            BaseCardView.this.mInfoAlpha = this.mStartValue + (f8 * this.mDelta);
            for (int i8 = 0; i8 < BaseCardView.this.mInfoViewList.size(); i8++) {
                BaseCardView.this.mInfoViewList.get(i8).setAlpha(BaseCardView.this.mInfoAlpha);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class InfoHeightAnimation extends AnimationBase {
        private float mDelta;
        private float mStartValue;

        public InfoHeightAnimation(float f8, float f9) {
            super();
            this.mStartValue = f8;
            this.mDelta = f9 - f8;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f8, Transformation transformation) {
            BaseCardView baseCardView = BaseCardView.this;
            baseCardView.mInfoVisFraction = this.mStartValue + (f8 * this.mDelta);
            baseCardView.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class InfoOffsetAnimation extends AnimationBase {
        private float mDelta;
        private float mStartValue;

        public InfoOffsetAnimation(float f8, float f9) {
            super();
            this.mStartValue = f8;
            this.mDelta = f9 - f8;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f8, Transformation transformation) {
            BaseCardView baseCardView = BaseCardView.this;
            baseCardView.mInfoOffset = this.mStartValue + (f8 * this.mDelta);
            baseCardView.requestLayout();
        }
    }

    public BaseCardView(Context context) {
        this(context, null);
    }

    private void animateInfoAlpha(boolean z8) {
        float f8;
        cancelAnimations();
        if (z8) {
            for (int i8 = 0; i8 < this.mInfoViewList.size(); i8++) {
                this.mInfoViewList.get(i8).setVisibility(0);
            }
        }
        float f9 = 0.0f;
        if (z8) {
            f8 = 1.0f;
        } else {
            f8 = 0.0f;
        }
        if (f8 == this.mInfoAlpha) {
            return;
        }
        float f10 = this.mInfoAlpha;
        if (z8) {
            f9 = 1.0f;
        }
        InfoAlphaAnimation infoAlphaAnimation = new InfoAlphaAnimation(f10, f9);
        this.mAnim = infoAlphaAnimation;
        infoAlphaAnimation.setDuration(this.mActivatedAnimDuration);
        this.mAnim.setInterpolator(new DecelerateInterpolator());
        this.mAnim.setAnimationListener(new Animation.AnimationListener() { // from class: androidx.leanback.widget.BaseCardView.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (BaseCardView.this.mInfoAlpha == 0.0d) {
                    for (int i9 = 0; i9 < BaseCardView.this.mInfoViewList.size(); i9++) {
                        BaseCardView.this.mInfoViewList.get(i9).setVisibility(8);
                    }
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        startAnimation(this.mAnim);
    }

    private void animateInfoHeight(boolean z8) {
        float f8;
        cancelAnimations();
        if (z8) {
            for (int i8 = 0; i8 < this.mInfoViewList.size(); i8++) {
                this.mInfoViewList.get(i8).setVisibility(0);
            }
        }
        if (z8) {
            f8 = 1.0f;
        } else {
            f8 = 0.0f;
        }
        if (this.mInfoVisFraction == f8) {
            return;
        }
        InfoHeightAnimation infoHeightAnimation = new InfoHeightAnimation(this.mInfoVisFraction, f8);
        this.mAnim = infoHeightAnimation;
        infoHeightAnimation.setDuration(this.mSelectedAnimDuration);
        this.mAnim.setInterpolator(new AccelerateDecelerateInterpolator());
        this.mAnim.setAnimationListener(new Animation.AnimationListener() { // from class: androidx.leanback.widget.BaseCardView.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (BaseCardView.this.mInfoVisFraction == 0.0f) {
                    for (int i9 = 0; i9 < BaseCardView.this.mInfoViewList.size(); i9++) {
                        BaseCardView.this.mInfoViewList.get(i9).setVisibility(8);
                    }
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        startAnimation(this.mAnim);
    }

    private void applyActiveState(boolean z8) {
        int i8;
        if (hasInfoRegion() && (i8 = this.mInfoVisibility) == 1) {
            setInfoViewVisibility(isRegionVisible(i8));
        }
    }

    private void applySelectedState(boolean z8) {
        removeCallbacks(this.mAnimationTrigger);
        if (this.mCardType == 3) {
            if (z8) {
                if (!this.mDelaySelectedAnim) {
                    post(this.mAnimationTrigger);
                    this.mDelaySelectedAnim = true;
                    return;
                } else {
                    postDelayed(this.mAnimationTrigger, this.mSelectedAnimationDelay);
                    return;
                }
            }
            animateInfoOffset(false);
            return;
        }
        if (this.mInfoVisibility == 2) {
            setInfoViewVisibility(z8);
        }
    }

    private void findChildrenViews() {
        boolean z8;
        boolean z9;
        this.mMainViewList.clear();
        this.mInfoViewList.clear();
        this.mExtraViewList.clear();
        int childCount = getChildCount();
        if (hasInfoRegion() && isCurrentRegionVisible(this.mInfoVisibility)) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (hasExtraRegion() && this.mInfoOffset > 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt != null) {
                int i9 = ((LayoutParams) childAt.getLayoutParams()).viewType;
                int i10 = 8;
                if (i9 == 1) {
                    childAt.setAlpha(this.mInfoAlpha);
                    this.mInfoViewList.add(childAt);
                    if (z8) {
                        i10 = 0;
                    }
                    childAt.setVisibility(i10);
                } else if (i9 == 2) {
                    this.mExtraViewList.add(childAt);
                    if (z9) {
                        i10 = 0;
                    }
                    childAt.setVisibility(i10);
                } else {
                    this.mMainViewList.add(childAt);
                    childAt.setVisibility(0);
                }
            }
        }
    }

    private boolean hasExtraRegion() {
        if (this.mCardType == 3) {
            return true;
        }
        return false;
    }

    private boolean hasInfoRegion() {
        if (this.mCardType != 0) {
            return true;
        }
        return false;
    }

    private boolean isCurrentRegionVisible(int i8) {
        if (i8 == 0) {
            return true;
        }
        if (i8 != 1) {
            if (i8 != 2) {
                return false;
            }
            if (this.mCardType == 2) {
                if (this.mInfoVisFraction > 0.0f) {
                    return true;
                }
                return false;
            }
            return isSelected();
        }
        return isActivated();
    }

    private boolean isRegionVisible(int i8) {
        if (i8 == 0) {
            return true;
        }
        if (i8 != 1) {
            if (i8 != 2) {
                return false;
            }
            return isSelected();
        }
        return isActivated();
    }

    private void setInfoViewVisibility(boolean z8) {
        int i8;
        int i9 = this.mCardType;
        if (i9 == 3) {
            if (z8) {
                for (int i10 = 0; i10 < this.mInfoViewList.size(); i10++) {
                    this.mInfoViewList.get(i10).setVisibility(0);
                }
                return;
            }
            for (int i11 = 0; i11 < this.mInfoViewList.size(); i11++) {
                this.mInfoViewList.get(i11).setVisibility(8);
            }
            for (int i12 = 0; i12 < this.mExtraViewList.size(); i12++) {
                this.mExtraViewList.get(i12).setVisibility(8);
            }
            this.mInfoOffset = 0.0f;
            return;
        }
        if (i9 == 2) {
            if (this.mInfoVisibility == 2) {
                animateInfoHeight(z8);
                return;
            }
            for (int i13 = 0; i13 < this.mInfoViewList.size(); i13++) {
                View view = this.mInfoViewList.get(i13);
                if (z8) {
                    i8 = 0;
                } else {
                    i8 = 8;
                }
                view.setVisibility(i8);
            }
            return;
        }
        if (i9 == 1) {
            animateInfoAlpha(z8);
        }
    }

    void animateInfoOffset(boolean z8) {
        cancelAnimations();
        int i8 = 0;
        if (z8) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.mMeasuredWidth, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int i9 = 0;
            for (int i10 = 0; i10 < this.mExtraViewList.size(); i10++) {
                View view = this.mExtraViewList.get(i10);
                view.setVisibility(0);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i9 = Math.max(i9, view.getMeasuredHeight());
            }
            i8 = i9;
        }
        InfoOffsetAnimation infoOffsetAnimation = new InfoOffsetAnimation(this.mInfoOffset, z8 ? i8 : 0.0f);
        this.mAnim = infoOffsetAnimation;
        infoOffsetAnimation.setDuration(this.mSelectedAnimDuration);
        this.mAnim.setInterpolator(new AccelerateDecelerateInterpolator());
        this.mAnim.setAnimationListener(new Animation.AnimationListener() { // from class: androidx.leanback.widget.BaseCardView.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (BaseCardView.this.mInfoOffset == 0.0f) {
                    for (int i11 = 0; i11 < BaseCardView.this.mExtraViewList.size(); i11++) {
                        BaseCardView.this.mExtraViewList.get(i11).setVisibility(8);
                    }
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        startAnimation(this.mAnim);
    }

    void cancelAnimations() {
        Animation animation = this.mAnim;
        if (animation != null) {
            animation.cancel();
            this.mAnim = null;
            clearAnimation();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public int getCardType() {
        return this.mCardType;
    }

    @Deprecated
    public int getExtraVisibility() {
        return this.mExtraVisibility;
    }

    final float getFinalInfoAlpha() {
        if (this.mCardType == 1 && this.mInfoVisibility == 2 && !isSelected()) {
            return 0.0f;
        }
        return 1.0f;
    }

    final float getFinalInfoVisFraction() {
        if (this.mCardType == 2 && this.mInfoVisibility == 2 && !isSelected()) {
            return 0.0f;
        }
        return 1.0f;
    }

    public int getInfoVisibility() {
        return this.mInfoVisibility;
    }

    public boolean isSelectedAnimationDelayed() {
        return this.mDelaySelectedAnim;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i8) {
        boolean z8 = false;
        boolean z9 = false;
        for (int i9 : super.onCreateDrawableState(i8)) {
            if (i9 == 16842919) {
                z8 = true;
            }
            if (i9 == 16842910) {
                z9 = true;
            }
        }
        if (z8 && z9) {
            return View.PRESSED_ENABLED_STATE_SET;
        }
        if (z8) {
            return LB_PRESSED_STATE_SET;
        }
        if (z9) {
            return View.ENABLED_STATE_SET;
        }
        return View.EMPTY_STATE_SET;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mAnimationTrigger);
        cancelAnimations();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        float paddingTop = getPaddingTop();
        for (int i12 = 0; i12 < this.mMainViewList.size(); i12++) {
            View view = this.mMainViewList.get(i12);
            if (view.getVisibility() != 8) {
                view.layout(getPaddingLeft(), (int) paddingTop, this.mMeasuredWidth + getPaddingLeft(), (int) (view.getMeasuredHeight() + paddingTop));
                paddingTop += view.getMeasuredHeight();
            }
        }
        if (hasInfoRegion()) {
            float f8 = 0.0f;
            for (int i13 = 0; i13 < this.mInfoViewList.size(); i13++) {
                f8 += this.mInfoViewList.get(i13).getMeasuredHeight();
            }
            int i14 = this.mCardType;
            if (i14 == 1) {
                paddingTop -= f8;
                if (paddingTop < 0.0f) {
                    paddingTop = 0.0f;
                }
            } else if (i14 == 2) {
                if (this.mInfoVisibility == 2) {
                    f8 *= this.mInfoVisFraction;
                }
            } else {
                paddingTop -= this.mInfoOffset;
            }
            for (int i15 = 0; i15 < this.mInfoViewList.size(); i15++) {
                View view2 = this.mInfoViewList.get(i15);
                if (view2.getVisibility() != 8) {
                    int measuredHeight = view2.getMeasuredHeight();
                    if (measuredHeight > f8) {
                        measuredHeight = (int) f8;
                    }
                    float f9 = measuredHeight;
                    paddingTop += f9;
                    view2.layout(getPaddingLeft(), (int) paddingTop, this.mMeasuredWidth + getPaddingLeft(), (int) paddingTop);
                    f8 -= f9;
                    if (f8 <= 0.0f) {
                        break;
                    }
                }
            }
            if (hasExtraRegion()) {
                for (int i16 = 0; i16 < this.mExtraViewList.size(); i16++) {
                    View view3 = this.mExtraViewList.get(i16);
                    if (view3.getVisibility() != 8) {
                        view3.layout(getPaddingLeft(), (int) paddingTop, this.mMeasuredWidth + getPaddingLeft(), (int) (view3.getMeasuredHeight() + paddingTop));
                        paddingTop += view3.getMeasuredHeight();
                    }
                }
            }
        }
        onSizeChanged(0, 0, i10 - i8, i11 - i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.BaseCardView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void setActivated(boolean z8) {
        if (z8 != isActivated()) {
            super.setActivated(z8);
            applyActiveState(isActivated());
        }
    }

    public void setCardType(int i8) {
        if (this.mCardType != i8) {
            if (i8 >= 0 && i8 < 4) {
                this.mCardType = i8;
            } else {
                Log.e(TAG, "Invalid card type specified: " + i8 + ". Defaulting to type CARD_TYPE_MAIN_ONLY.");
                this.mCardType = 0;
            }
            requestLayout();
        }
    }

    @Deprecated
    public void setExtraVisibility(int i8) {
        if (this.mExtraVisibility != i8) {
            this.mExtraVisibility = i8;
        }
    }

    public void setInfoVisibility(int i8) {
        if (this.mInfoVisibility != i8) {
            cancelAnimations();
            this.mInfoVisibility = i8;
            this.mInfoVisFraction = getFinalInfoVisFraction();
            requestLayout();
            float finalInfoAlpha = getFinalInfoAlpha();
            if (finalInfoAlpha != this.mInfoAlpha) {
                this.mInfoAlpha = finalInfoAlpha;
                for (int i9 = 0; i9 < this.mInfoViewList.size(); i9++) {
                    this.mInfoViewList.get(i9).setAlpha(this.mInfoAlpha);
                }
            }
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z8) {
        if (z8 != isSelected()) {
            super.setSelected(z8);
            applySelectedState(isSelected());
        }
    }

    public void setSelectedAnimationDelayed(boolean z8) {
        this.mDelaySelectedAnim = z8;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View
    public String toString() {
        return super.toString();
    }

    public BaseCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.leanback.R.attr.baseCardViewStyle);
    }

    public BaseCardView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mAnimationTrigger = new Runnable() { // from class: androidx.leanback.widget.BaseCardView.1
            @Override // java.lang.Runnable
            public void run() {
                BaseCardView.this.animateInfoOffset(true);
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.leanback.R.styleable.lbBaseCardView, i8, 0);
        try {
            this.mCardType = obtainStyledAttributes.getInteger(androidx.leanback.R.styleable.lbBaseCardView_cardType, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(androidx.leanback.R.styleable.lbBaseCardView_cardForeground);
            if (drawable != null) {
                setForeground(drawable);
            }
            Drawable drawable2 = obtainStyledAttributes.getDrawable(androidx.leanback.R.styleable.lbBaseCardView_cardBackground);
            if (drawable2 != null) {
                setBackground(drawable2);
            }
            this.mInfoVisibility = obtainStyledAttributes.getInteger(androidx.leanback.R.styleable.lbBaseCardView_infoVisibility, 1);
            int integer = obtainStyledAttributes.getInteger(androidx.leanback.R.styleable.lbBaseCardView_extraVisibility, 2);
            this.mExtraVisibility = integer;
            int i9 = this.mInfoVisibility;
            if (integer < i9) {
                this.mExtraVisibility = i9;
            }
            this.mSelectedAnimationDelay = obtainStyledAttributes.getInteger(androidx.leanback.R.styleable.lbBaseCardView_selectedAnimationDelay, getResources().getInteger(androidx.leanback.R.integer.lb_card_selected_animation_delay));
            this.mSelectedAnimDuration = obtainStyledAttributes.getInteger(androidx.leanback.R.styleable.lbBaseCardView_selectedAnimationDuration, getResources().getInteger(androidx.leanback.R.integer.lb_card_selected_animation_duration));
            this.mActivatedAnimDuration = obtainStyledAttributes.getInteger(androidx.leanback.R.styleable.lbBaseCardView_activatedAnimationDuration, getResources().getInteger(androidx.leanback.R.integer.lb_card_activated_animation_duration));
            obtainStyledAttributes.recycle();
            this.mDelaySelectedAnim = true;
            this.mMainViewList = new ArrayList<>();
            this.mInfoViewList = new ArrayList<>();
            this.mExtraViewList = new ArrayList<>();
            this.mInfoOffset = 0.0f;
            this.mInfoVisFraction = getFinalInfoVisFraction();
            this.mInfoAlpha = getFinalInfoAlpha();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* loaded from: classes3.dex */
    public static class LayoutParams extends FrameLayout.LayoutParams {
        public static final int VIEW_TYPE_EXTRA = 2;
        public static final int VIEW_TYPE_INFO = 1;
        public static final int VIEW_TYPE_MAIN = 0;

        @ViewDebug.ExportedProperty(category = TtmlNode.TAG_LAYOUT, mapping = {@ViewDebug.IntToString(from = 0, to = "MAIN"), @ViewDebug.IntToString(from = 1, to = "INFO"), @ViewDebug.IntToString(from = 2, to = "EXTRA")})
        public int viewType;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.viewType = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.leanback.R.styleable.lbBaseCardView_Layout);
            this.viewType = obtainStyledAttributes.getInt(androidx.leanback.R.styleable.lbBaseCardView_Layout_layout_viewType, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i8, int i9) {
            super(i8, i9);
            this.viewType = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.viewType = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.viewType = 0;
            this.viewType = layoutParams.viewType;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }
}
