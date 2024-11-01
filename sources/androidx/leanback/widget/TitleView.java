package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.R;
import androidx.leanback.widget.SearchOrbView;
import androidx.leanback.widget.TitleViewAdapter;

/* loaded from: classes3.dex */
public class TitleView extends FrameLayout implements TitleViewAdapter.Provider {
    private int flags;
    private ImageView mBadgeView;
    private boolean mHasSearchListener;
    private SearchOrbView mSearchOrbView;
    private TextView mTextView;
    private final TitleViewAdapter mTitleViewAdapter;

    public TitleView(Context context) {
        this(context, null);
    }

    private void updateBadgeVisibility() {
        if (this.mBadgeView.getDrawable() != null) {
            this.mBadgeView.setVisibility(0);
            this.mTextView.setVisibility(8);
        } else {
            this.mBadgeView.setVisibility(8);
            this.mTextView.setVisibility(0);
        }
    }

    private void updateSearchOrbViewVisiblity() {
        int i8 = 4;
        if (this.mHasSearchListener && (this.flags & 4) == 4) {
            i8 = 0;
        }
        this.mSearchOrbView.setVisibility(i8);
    }

    public void enableAnimation(boolean z8) {
        boolean z9;
        SearchOrbView searchOrbView = this.mSearchOrbView;
        if (z8 && searchOrbView.hasFocus()) {
            z9 = true;
        } else {
            z9 = false;
        }
        searchOrbView.enableOrbColorAnimation(z9);
    }

    public Drawable getBadgeDrawable() {
        return this.mBadgeView.getDrawable();
    }

    public SearchOrbView.Colors getSearchAffordanceColors() {
        return this.mSearchOrbView.getOrbColors();
    }

    public View getSearchAffordanceView() {
        return this.mSearchOrbView;
    }

    public CharSequence getTitle() {
        return this.mTextView.getText();
    }

    @Override // androidx.leanback.widget.TitleViewAdapter.Provider
    public TitleViewAdapter getTitleViewAdapter() {
        return this.mTitleViewAdapter;
    }

    public void setBadgeDrawable(Drawable drawable) {
        this.mBadgeView.setImageDrawable(drawable);
        updateBadgeVisibility();
    }

    public void setOnSearchClickedListener(View.OnClickListener onClickListener) {
        boolean z8;
        if (onClickListener != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.mHasSearchListener = z8;
        this.mSearchOrbView.setOnOrbClickedListener(onClickListener);
        updateSearchOrbViewVisiblity();
    }

    public void setSearchAffordanceColors(SearchOrbView.Colors colors) {
        this.mSearchOrbView.setOrbColors(colors);
    }

    public void setTitle(CharSequence charSequence) {
        this.mTextView.setText(charSequence);
        updateBadgeVisibility();
    }

    public void updateComponentsVisibility(int i8) {
        this.flags = i8;
        if ((i8 & 2) == 2) {
            updateBadgeVisibility();
        } else {
            this.mBadgeView.setVisibility(8);
            this.mTextView.setVisibility(8);
        }
        updateSearchOrbViewVisiblity();
    }

    public TitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.browseTitleViewStyle);
    }

    public TitleView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.flags = 6;
        this.mHasSearchListener = false;
        this.mTitleViewAdapter = new TitleViewAdapter() { // from class: androidx.leanback.widget.TitleView.1
            @Override // androidx.leanback.widget.TitleViewAdapter
            public Drawable getBadgeDrawable() {
                return TitleView.this.getBadgeDrawable();
            }

            @Override // androidx.leanback.widget.TitleViewAdapter
            public SearchOrbView.Colors getSearchAffordanceColors() {
                return TitleView.this.getSearchAffordanceColors();
            }

            @Override // androidx.leanback.widget.TitleViewAdapter
            public View getSearchAffordanceView() {
                return TitleView.this.getSearchAffordanceView();
            }

            @Override // androidx.leanback.widget.TitleViewAdapter
            public CharSequence getTitle() {
                return TitleView.this.getTitle();
            }

            @Override // androidx.leanback.widget.TitleViewAdapter
            public void setAnimationEnabled(boolean z8) {
                TitleView.this.enableAnimation(z8);
            }

            @Override // androidx.leanback.widget.TitleViewAdapter
            public void setBadgeDrawable(Drawable drawable) {
                TitleView.this.setBadgeDrawable(drawable);
            }

            @Override // androidx.leanback.widget.TitleViewAdapter
            public void setOnSearchClickedListener(View.OnClickListener onClickListener) {
                TitleView.this.setOnSearchClickedListener(onClickListener);
            }

            @Override // androidx.leanback.widget.TitleViewAdapter
            public void setSearchAffordanceColors(SearchOrbView.Colors colors) {
                TitleView.this.setSearchAffordanceColors(colors);
            }

            @Override // androidx.leanback.widget.TitleViewAdapter
            public void setTitle(CharSequence charSequence) {
                TitleView.this.setTitle(charSequence);
            }

            @Override // androidx.leanback.widget.TitleViewAdapter
            public void updateComponentsVisibility(int i9) {
                TitleView.this.updateComponentsVisibility(i9);
            }
        };
        View inflate = LayoutInflater.from(context).inflate(R.layout.lb_title_view, this);
        this.mBadgeView = (ImageView) inflate.findViewById(R.id.title_badge);
        this.mTextView = (TextView) inflate.findViewById(R.id.title_text);
        this.mSearchOrbView = (SearchOrbView) inflate.findViewById(R.id.title_orb);
        setClipToPadding(false);
        setClipChildren(false);
    }
}
