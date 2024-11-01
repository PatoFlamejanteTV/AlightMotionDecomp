package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.DecorView
/* loaded from: classes3.dex */
public class PagerTitleStrip extends ViewGroup {
    private static final float SIDE_ALPHA = 0.6f;
    private static final int TEXT_SPACING = 16;
    TextView mCurrText;
    private int mGravity;
    private int mLastKnownCurrentPage;
    float mLastKnownPositionOffset;
    TextView mNextText;
    private int mNonPrimaryAlpha;
    private final PageListener mPageListener;
    ViewPager mPager;
    TextView mPrevText;
    private int mScaledTextSpacing;
    int mTextColor;
    private boolean mUpdatingPositions;
    private boolean mUpdatingText;
    private WeakReference<PagerAdapter> mWatchingAdapter;
    private static final int[] ATTRS = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};
    private static final int[] TEXT_ATTRS = {R.attr.textAllCaps};

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class PageListener extends DataSetObserver implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener {
        private int mScrollState;

        PageListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            PagerTitleStrip.this.updateAdapter(pagerAdapter, pagerAdapter2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.updateText(pagerTitleStrip.mPager.getCurrentItem(), PagerTitleStrip.this.mPager.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f8 = pagerTitleStrip2.mLastKnownPositionOffset;
            if (f8 < 0.0f) {
                f8 = 0.0f;
            }
            pagerTitleStrip2.updateTextPositions(pagerTitleStrip2.mPager.getCurrentItem(), f8, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i8) {
            this.mScrollState = i8;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i8, float f8, int i9) {
            if (f8 > 0.5f) {
                i8++;
            }
            PagerTitleStrip.this.updateTextPositions(i8, f8, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i8) {
            if (this.mScrollState == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.updateText(pagerTitleStrip.mPager.getCurrentItem(), PagerTitleStrip.this.mPager.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f8 = pagerTitleStrip2.mLastKnownPositionOffset;
                if (f8 < 0.0f) {
                    f8 = 0.0f;
                }
                pagerTitleStrip2.updateTextPositions(pagerTitleStrip2.mPager.getCurrentItem(), f8, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class SingleLineAllCapsTransform extends SingleLineTransformationMethod {
        private Locale mLocale;

        SingleLineAllCapsTransform(Context context) {
            this.mLocale = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.mLocale);
            }
            return null;
        }
    }

    public PagerTitleStrip(@NonNull Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new SingleLineAllCapsTransform(textView.getContext()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.mScaledTextSpacing;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        PagerAdapter pagerAdapter;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            PagerAdapter adapter = viewPager.getAdapter();
            viewPager.setInternalPageChangeListener(this.mPageListener);
            viewPager.addOnAdapterChangeListener(this.mPageListener);
            this.mPager = viewPager;
            WeakReference<PagerAdapter> weakReference = this.mWatchingAdapter;
            if (weakReference != null) {
                pagerAdapter = weakReference.get();
            } else {
                pagerAdapter = null;
            }
            updateAdapter(pagerAdapter, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.mPager;
        if (viewPager != null) {
            updateAdapter(viewPager.getAdapter(), null);
            this.mPager.setInternalPageChangeListener(null);
            this.mPager.removeOnAdapterChangeListener(this.mPageListener);
            this.mPager = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        if (this.mPager != null) {
            float f8 = this.mLastKnownPositionOffset;
            if (f8 < 0.0f) {
                f8 = 0.0f;
            }
            updateTextPositions(this.mLastKnownCurrentPage, f8, true);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        int max;
        if (View.MeasureSpec.getMode(i8) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i9, paddingTop, -2);
            int size = View.MeasureSpec.getSize(i8);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i8, (int) (size * 0.2f), -2);
            this.mPrevText.measure(childMeasureSpec2, childMeasureSpec);
            this.mCurrText.measure(childMeasureSpec2, childMeasureSpec);
            this.mNextText.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i9) == 1073741824) {
                max = View.MeasureSpec.getSize(i9);
            } else {
                max = Math.max(getMinHeight(), this.mCurrText.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(max, i9, this.mCurrText.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.mUpdatingText) {
            super.requestLayout();
        }
    }

    public void setGravity(int i8) {
        this.mGravity = i8;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f8) {
        int i8 = ((int) (f8 * 255.0f)) & 255;
        this.mNonPrimaryAlpha = i8;
        int i9 = (i8 << 24) | (this.mTextColor & ViewCompat.MEASURED_SIZE_MASK);
        this.mPrevText.setTextColor(i9);
        this.mNextText.setTextColor(i9);
    }

    public void setTextColor(@ColorInt int i8) {
        this.mTextColor = i8;
        this.mCurrText.setTextColor(i8);
        int i9 = (this.mNonPrimaryAlpha << 24) | (this.mTextColor & ViewCompat.MEASURED_SIZE_MASK);
        this.mPrevText.setTextColor(i9);
        this.mNextText.setTextColor(i9);
    }

    public void setTextSize(int i8, float f8) {
        this.mPrevText.setTextSize(i8, f8);
        this.mCurrText.setTextSize(i8, f8);
        this.mNextText.setTextSize(i8, f8);
    }

    public void setTextSpacing(int i8) {
        this.mScaledTextSpacing = i8;
        requestLayout();
    }

    void updateAdapter(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(this.mPageListener);
            this.mWatchingAdapter = null;
        }
        if (pagerAdapter2 != null) {
            pagerAdapter2.registerDataSetObserver(this.mPageListener);
            this.mWatchingAdapter = new WeakReference<>(pagerAdapter2);
        }
        ViewPager viewPager = this.mPager;
        if (viewPager != null) {
            this.mLastKnownCurrentPage = -1;
            this.mLastKnownPositionOffset = -1.0f;
            updateText(viewPager.getCurrentItem(), pagerAdapter2);
            requestLayout();
        }
    }

    void updateText(int i8, PagerAdapter pagerAdapter) {
        int i9;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (pagerAdapter != null) {
            i9 = pagerAdapter.getCount();
        } else {
            i9 = 0;
        }
        this.mUpdatingText = true;
        CharSequence charSequence3 = null;
        if (i8 >= 1 && pagerAdapter != null) {
            charSequence = pagerAdapter.getPageTitle(i8 - 1);
        } else {
            charSequence = null;
        }
        this.mPrevText.setText(charSequence);
        TextView textView = this.mCurrText;
        if (pagerAdapter != null && i8 < i9) {
            charSequence2 = pagerAdapter.getPageTitle(i8);
        } else {
            charSequence2 = null;
        }
        textView.setText(charSequence2);
        int i10 = i8 + 1;
        if (i10 < i9 && pagerAdapter != null) {
            charSequence3 = pagerAdapter.getPageTitle(i10);
        }
        this.mNextText.setText(charSequence3);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.mPrevText.measure(makeMeasureSpec, makeMeasureSpec2);
        this.mCurrText.measure(makeMeasureSpec, makeMeasureSpec2);
        this.mNextText.measure(makeMeasureSpec, makeMeasureSpec2);
        this.mLastKnownCurrentPage = i8;
        if (!this.mUpdatingPositions) {
            updateTextPositions(i8, this.mLastKnownPositionOffset, false);
        }
        this.mUpdatingText = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateTextPositions(int i8, float f8, boolean z8) {
        int i9;
        int i10;
        int i11;
        int i12;
        if (i8 != this.mLastKnownCurrentPage) {
            updateText(i8, this.mPager.getAdapter());
        } else if (!z8 && f8 == this.mLastKnownPositionOffset) {
            return;
        }
        this.mUpdatingPositions = true;
        int measuredWidth = this.mPrevText.getMeasuredWidth();
        int measuredWidth2 = this.mCurrText.getMeasuredWidth();
        int measuredWidth3 = this.mNextText.getMeasuredWidth();
        int i13 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i14 = paddingRight + i13;
        int i15 = (width - (paddingLeft + i13)) - i14;
        float f9 = 0.5f + f8;
        if (f9 > 1.0f) {
            f9 -= 1.0f;
        }
        int i16 = ((width - i14) - ((int) (i15 * f9))) - i13;
        int i17 = measuredWidth2 + i16;
        int baseline = this.mPrevText.getBaseline();
        int baseline2 = this.mCurrText.getBaseline();
        int baseline3 = this.mNextText.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i18 = max - baseline;
        int i19 = max - baseline2;
        int i20 = max - baseline3;
        int max2 = Math.max(Math.max(this.mPrevText.getMeasuredHeight() + i18, this.mCurrText.getMeasuredHeight() + i19), this.mNextText.getMeasuredHeight() + i20);
        int i21 = this.mGravity & 112;
        if (i21 != 16) {
            if (i21 != 80) {
                i10 = i18 + paddingTop;
                i11 = i19 + paddingTop;
                i12 = paddingTop + i20;
                TextView textView = this.mCurrText;
                textView.layout(i16, i11, i17, textView.getMeasuredHeight() + i11);
                int min = Math.min(paddingLeft, (i16 - this.mScaledTextSpacing) - measuredWidth);
                TextView textView2 = this.mPrevText;
                textView2.layout(min, i10, measuredWidth + min, textView2.getMeasuredHeight() + i10);
                int max3 = Math.max((width - paddingRight) - measuredWidth3, i17 + this.mScaledTextSpacing);
                TextView textView3 = this.mNextText;
                textView3.layout(max3, i12, max3 + measuredWidth3, textView3.getMeasuredHeight() + i12);
                this.mLastKnownPositionOffset = f8;
                this.mUpdatingPositions = false;
            }
            i9 = (height - paddingBottom) - max2;
        } else {
            i9 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        }
        i10 = i18 + i9;
        i11 = i19 + i9;
        i12 = i9 + i20;
        TextView textView4 = this.mCurrText;
        textView4.layout(i16, i11, i17, textView4.getMeasuredHeight() + i11);
        int min2 = Math.min(paddingLeft, (i16 - this.mScaledTextSpacing) - measuredWidth);
        TextView textView22 = this.mPrevText;
        textView22.layout(min2, i10, measuredWidth + min2, textView22.getMeasuredHeight() + i10);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i17 + this.mScaledTextSpacing);
        TextView textView32 = this.mNextText;
        textView32.layout(max32, i12, max32 + measuredWidth3, textView32.getMeasuredHeight() + i12);
        this.mLastKnownPositionOffset = f8;
        this.mUpdatingPositions = false;
    }

    public PagerTitleStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLastKnownCurrentPage = -1;
        this.mLastKnownPositionOffset = -1.0f;
        this.mPageListener = new PageListener();
        TextView textView = new TextView(context);
        this.mPrevText = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.mCurrText = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.mNextText = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ATTRS);
        boolean z8 = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            TextViewCompat.setTextAppearance(this.mPrevText, resourceId);
            TextViewCompat.setTextAppearance(this.mCurrText, resourceId);
            TextViewCompat.setTextAppearance(this.mNextText, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.mPrevText.setTextColor(color);
            this.mCurrText.setTextColor(color);
            this.mNextText.setTextColor(color);
        }
        this.mGravity = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.mTextColor = this.mCurrText.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        TextView textView4 = this.mPrevText;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.mCurrText.setEllipsize(truncateAt);
        this.mNextText.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, TEXT_ATTRS);
            z8 = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z8) {
            setSingleLineAllCaps(this.mPrevText);
            setSingleLineAllCaps(this.mCurrText);
            setSingleLineAllCaps(this.mNextText);
        } else {
            this.mPrevText.setSingleLine();
            this.mCurrText.setSingleLine();
            this.mNextText.setSingleLine();
        }
        this.mScaledTextSpacing = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
