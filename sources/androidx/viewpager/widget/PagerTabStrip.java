package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;

/* loaded from: classes3.dex */
public class PagerTabStrip extends PagerTitleStrip {
    private static final int FULL_UNDERLINE_HEIGHT = 1;
    private static final int INDICATOR_HEIGHT = 3;
    private static final int MIN_PADDING_BOTTOM = 6;
    private static final int MIN_STRIP_HEIGHT = 32;
    private static final int MIN_TEXT_SPACING = 64;
    private static final int TAB_PADDING = 16;
    private static final int TAB_SPACING = 32;
    private static final String TAG = "PagerTabStrip";
    private boolean mDrawFullUnderline;
    private boolean mDrawFullUnderlineSet;
    private int mFullUnderlineHeight;
    private boolean mIgnoreTap;
    private int mIndicatorColor;
    private int mIndicatorHeight;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private int mMinPaddingBottom;
    private int mMinStripHeight;
    private int mMinTextSpacing;
    private int mTabAlpha;
    private int mTabPadding;
    private final Paint mTabPaint;
    private final Rect mTempRect;
    private int mTouchSlop;

    public PagerTabStrip(@NonNull Context context) {
        this(context, null);
    }

    public boolean getDrawFullUnderline() {
        return this.mDrawFullUnderline;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.mMinStripHeight);
    }

    @ColorInt
    public int getTabIndicatorColor() {
        return this.mIndicatorColor;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.mCurrText.getLeft() - this.mTabPadding;
        int right = this.mCurrText.getRight() + this.mTabPadding;
        int i8 = height - this.mIndicatorHeight;
        this.mTabPaint.setColor((this.mTabAlpha << 24) | (this.mIndicatorColor & ViewCompat.MEASURED_SIZE_MASK));
        float f8 = height;
        canvas.drawRect(left, i8, right, f8, this.mTabPaint);
        if (this.mDrawFullUnderline) {
            this.mTabPaint.setColor((this.mIndicatorColor & ViewCompat.MEASURED_SIZE_MASK) | ViewCompat.MEASURED_STATE_MASK);
            canvas.drawRect(getPaddingLeft(), height - this.mFullUnderlineHeight, getWidth() - getPaddingRight(), f8, this.mTabPaint);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.mIgnoreTap) {
            return false;
        }
        float x8 = motionEvent.getX();
        float y8 = motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && (Math.abs(x8 - this.mInitialMotionX) > this.mTouchSlop || Math.abs(y8 - this.mInitialMotionY) > this.mTouchSlop)) {
                    this.mIgnoreTap = true;
                }
            } else if (x8 < this.mCurrText.getLeft() - this.mTabPadding) {
                ViewPager viewPager = this.mPager;
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
            } else if (x8 > this.mCurrText.getRight() + this.mTabPadding) {
                ViewPager viewPager2 = this.mPager;
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
            }
        } else {
            this.mInitialMotionX = x8;
            this.mInitialMotionY = y8;
            this.mIgnoreTap = false;
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i8) {
        boolean z8;
        super.setBackgroundColor(i8);
        if (!this.mDrawFullUnderlineSet) {
            if ((i8 & ViewCompat.MEASURED_STATE_MASK) == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.mDrawFullUnderline = z8;
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        boolean z8;
        super.setBackgroundDrawable(drawable);
        if (!this.mDrawFullUnderlineSet) {
            if (drawable == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.mDrawFullUnderline = z8;
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i8) {
        boolean z8;
        super.setBackgroundResource(i8);
        if (!this.mDrawFullUnderlineSet) {
            if (i8 == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.mDrawFullUnderline = z8;
        }
    }

    public void setDrawFullUnderline(boolean z8) {
        this.mDrawFullUnderline = z8;
        this.mDrawFullUnderlineSet = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i8, int i9, int i10, int i11) {
        int i12 = this.mMinPaddingBottom;
        if (i11 < i12) {
            i11 = i12;
        }
        super.setPadding(i8, i9, i10, i11);
    }

    public void setTabIndicatorColor(@ColorInt int i8) {
        this.mIndicatorColor = i8;
        this.mTabPaint.setColor(i8);
        invalidate();
    }

    public void setTabIndicatorColorResource(@ColorRes int i8) {
        setTabIndicatorColor(ContextCompat.getColor(getContext(), i8));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i8) {
        int i9 = this.mMinTextSpacing;
        if (i8 < i9) {
            i8 = i9;
        }
        super.setTextSpacing(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void updateTextPositions(int i8, float f8, boolean z8) {
        Rect rect = this.mTempRect;
        int height = getHeight();
        int left = this.mCurrText.getLeft() - this.mTabPadding;
        int right = this.mCurrText.getRight() + this.mTabPadding;
        int i9 = height - this.mIndicatorHeight;
        rect.set(left, i9, right, height);
        super.updateTextPositions(i8, f8, z8);
        this.mTabAlpha = (int) (Math.abs(f8 - 0.5f) * 2.0f * 255.0f);
        rect.union(this.mCurrText.getLeft() - this.mTabPadding, i9, this.mCurrText.getRight() + this.mTabPadding, height);
        invalidate(rect);
    }

    public PagerTabStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.mTabPaint = paint;
        this.mTempRect = new Rect();
        this.mTabAlpha = 255;
        this.mDrawFullUnderline = false;
        this.mDrawFullUnderlineSet = false;
        int i8 = this.mTextColor;
        this.mIndicatorColor = i8;
        paint.setColor(i8);
        float f8 = context.getResources().getDisplayMetrics().density;
        this.mIndicatorHeight = (int) ((3.0f * f8) + 0.5f);
        this.mMinPaddingBottom = (int) ((6.0f * f8) + 0.5f);
        this.mMinTextSpacing = (int) (64.0f * f8);
        this.mTabPadding = (int) ((16.0f * f8) + 0.5f);
        this.mFullUnderlineHeight = (int) ((1.0f * f8) + 0.5f);
        this.mMinStripHeight = (int) ((f8 * 32.0f) + 0.5f);
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.mPrevText.setFocusable(true);
        this.mPrevText.setOnClickListener(new View.OnClickListener() { // from class: androidx.viewpager.widget.PagerTabStrip.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PagerTabStrip.this.mPager.setCurrentItem(r2.getCurrentItem() - 1);
            }
        });
        this.mNextText.setFocusable(true);
        this.mNextText.setOnClickListener(new View.OnClickListener() { // from class: androidx.viewpager.widget.PagerTabStrip.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ViewPager viewPager = PagerTabStrip.this.mPager;
                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
            }
        });
        if (getBackground() == null) {
            this.mDrawFullUnderline = true;
        }
    }
}
