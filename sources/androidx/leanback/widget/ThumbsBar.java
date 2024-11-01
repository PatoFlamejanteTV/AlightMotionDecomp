package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.leanback.R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ThumbsBar extends LinearLayout {
    final SparseArray<Bitmap> mBitmaps;
    int mHeroThumbHeightInPixel;
    int mHeroThumbWidthInPixel;
    private boolean mIsUserSets;
    int mMeasuredMarginInPixel;
    int mNumOfThumbs;
    int mThumbHeightInPixel;
    int mThumbWidthInPixel;

    public ThumbsBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int calculateNumOfThumbs(int i8) {
        int roundUp = roundUp(i8 - this.mHeroThumbWidthInPixel, this.mThumbWidthInPixel + this.mMeasuredMarginInPixel);
        if (roundUp < 2) {
            roundUp = 2;
        } else if ((roundUp & 1) != 0) {
            roundUp++;
        }
        return roundUp + 1;
    }

    private static int roundUp(int i8, int i9) {
        return ((i8 + i9) - 1) / i9;
    }

    private void setNumberOfThumbsInternal() {
        while (getChildCount() > this.mNumOfThumbs) {
            removeView(getChildAt(getChildCount() - 1));
        }
        while (getChildCount() < this.mNumOfThumbs) {
            addView(createThumbView(this), new LinearLayout.LayoutParams(this.mThumbWidthInPixel, this.mThumbHeightInPixel));
        }
        int heroIndex = getHeroIndex();
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (heroIndex == i8) {
                layoutParams.width = this.mHeroThumbWidthInPixel;
                layoutParams.height = this.mHeroThumbHeightInPixel;
            } else {
                layoutParams.width = this.mThumbWidthInPixel;
                layoutParams.height = this.mThumbHeightInPixel;
            }
            childAt.setLayoutParams(layoutParams);
        }
    }

    public void clearThumbBitmaps() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            setThumbBitmap(i8, null);
        }
        this.mBitmaps.clear();
    }

    protected View createThumbView(ViewGroup viewGroup) {
        return new ImageView(viewGroup.getContext());
    }

    public int getHeroIndex() {
        return getChildCount() / 2;
    }

    public Bitmap getThumbBitmap(int i8) {
        return this.mBitmaps.get(i8);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        int heroIndex = getHeroIndex();
        View childAt = getChildAt(heroIndex);
        int width = (getWidth() / 2) - (childAt.getMeasuredWidth() / 2);
        int width2 = (getWidth() / 2) + (childAt.getMeasuredWidth() / 2);
        childAt.layout(width, getPaddingTop(), width2, getPaddingTop() + childAt.getMeasuredHeight());
        int paddingTop = getPaddingTop() + (childAt.getMeasuredHeight() / 2);
        for (int i12 = heroIndex - 1; i12 >= 0; i12--) {
            int i13 = width - this.mMeasuredMarginInPixel;
            View childAt2 = getChildAt(i12);
            childAt2.layout(i13 - childAt2.getMeasuredWidth(), paddingTop - (childAt2.getMeasuredHeight() / 2), i13, (childAt2.getMeasuredHeight() / 2) + paddingTop);
            width = i13 - childAt2.getMeasuredWidth();
        }
        while (true) {
            heroIndex++;
            if (heroIndex < this.mNumOfThumbs) {
                int i14 = width2 + this.mMeasuredMarginInPixel;
                View childAt3 = getChildAt(heroIndex);
                childAt3.layout(i14, paddingTop - (childAt3.getMeasuredHeight() / 2), childAt3.getMeasuredWidth() + i14, (childAt3.getMeasuredHeight() / 2) + paddingTop);
                width2 = i14 + childAt3.getMeasuredWidth();
            } else {
                return;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        int calculateNumOfThumbs;
        super.onMeasure(i8, i9);
        int measuredWidth = getMeasuredWidth();
        if (!this.mIsUserSets && this.mNumOfThumbs != (calculateNumOfThumbs = calculateNumOfThumbs(measuredWidth))) {
            this.mNumOfThumbs = calculateNumOfThumbs;
            setNumberOfThumbsInternal();
        }
    }

    public void setHeroThumbSize(int i8, int i9) {
        boolean z8;
        this.mHeroThumbHeightInPixel = i9;
        this.mHeroThumbWidthInPixel = i8;
        int heroIndex = getHeroIndex();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (heroIndex == i10) {
                View childAt = getChildAt(i10);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                boolean z9 = true;
                if (layoutParams.height != i9) {
                    layoutParams.height = i9;
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (layoutParams.width != i8) {
                    layoutParams.width = i8;
                } else {
                    z9 = z8;
                }
                if (z9) {
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    public void setNumberOfThumbs(int i8) {
        this.mIsUserSets = true;
        this.mNumOfThumbs = i8;
        setNumberOfThumbsInternal();
    }

    public void setThumbBitmap(int i8, Bitmap bitmap) {
        this.mBitmaps.put(i8, bitmap);
        ((ImageView) getChildAt(i8)).setImageBitmap(bitmap);
    }

    public void setThumbSize(int i8, int i9) {
        boolean z8;
        this.mThumbHeightInPixel = i9;
        this.mThumbWidthInPixel = i8;
        int heroIndex = getHeroIndex();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (heroIndex != i10) {
                View childAt = getChildAt(i10);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                boolean z9 = true;
                if (layoutParams.height != i9) {
                    layoutParams.height = i9;
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (layoutParams.width != i8) {
                    layoutParams.width = i8;
                } else {
                    z9 = z8;
                }
                if (z9) {
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    public void setThumbSpace(int i8) {
        this.mMeasuredMarginInPixel = i8;
        requestLayout();
    }

    public ThumbsBar(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mNumOfThumbs = -1;
        this.mBitmaps = new SparseArray<>();
        this.mIsUserSets = false;
        this.mThumbWidthInPixel = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_width);
        this.mThumbHeightInPixel = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_height);
        this.mHeroThumbHeightInPixel = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_hero_thumbs_width);
        this.mHeroThumbWidthInPixel = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_hero_thumbs_height);
        this.mMeasuredMarginInPixel = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_margin);
    }
}
