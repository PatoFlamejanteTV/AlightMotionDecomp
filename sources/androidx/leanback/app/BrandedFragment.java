package androidx.leanback.app;

import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.leanback.R;
import androidx.leanback.widget.SearchOrbView;
import androidx.leanback.widget.TitleHelper;
import androidx.leanback.widget.TitleViewAdapter;

@Deprecated
/* loaded from: classes3.dex */
public class BrandedFragment extends Fragment {
    private static final String TITLE_SHOW = "titleShow";
    private Drawable mBadgeDrawable;
    private View.OnClickListener mExternalOnSearchClickedListener;
    private boolean mSearchAffordanceColorSet;
    private SearchOrbView.Colors mSearchAffordanceColors;
    private boolean mShowingTitle = true;
    private CharSequence mTitle;
    private TitleHelper mTitleHelper;
    private View mTitleView;
    private TitleViewAdapter mTitleViewAdapter;

    public Drawable getBadgeDrawable() {
        return this.mBadgeDrawable;
    }

    public int getSearchAffordanceColor() {
        return getSearchAffordanceColors().color;
    }

    public SearchOrbView.Colors getSearchAffordanceColors() {
        if (this.mSearchAffordanceColorSet) {
            return this.mSearchAffordanceColors;
        }
        TitleViewAdapter titleViewAdapter = this.mTitleViewAdapter;
        if (titleViewAdapter != null) {
            return titleViewAdapter.getSearchAffordanceColors();
        }
        throw new IllegalStateException("Fragment views not yet created");
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TitleHelper getTitleHelper() {
        return this.mTitleHelper;
    }

    public View getTitleView() {
        return this.mTitleView;
    }

    public TitleViewAdapter getTitleViewAdapter() {
        return this.mTitleViewAdapter;
    }

    public void installTitleView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onInflateTitleView = onInflateTitleView(layoutInflater, viewGroup, bundle);
        if (onInflateTitleView != null) {
            viewGroup.addView(onInflateTitleView);
            setTitleView(onInflateTitleView.findViewById(R.id.browse_title_group));
        } else {
            setTitleView(null);
        }
    }

    public final boolean isShowingTitle() {
        return this.mShowingTitle;
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.mTitleHelper = null;
    }

    public View onInflateTitleView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i8;
        TypedValue typedValue = new TypedValue();
        if (viewGroup.getContext().getTheme().resolveAttribute(R.attr.browseTitleViewLayout, typedValue, true)) {
            i8 = typedValue.resourceId;
        } else {
            i8 = R.layout.lb_browse_title;
        }
        return layoutInflater.inflate(i8, viewGroup, false);
    }

    @Override // android.app.Fragment
    public void onPause() {
        TitleViewAdapter titleViewAdapter = this.mTitleViewAdapter;
        if (titleViewAdapter != null) {
            titleViewAdapter.setAnimationEnabled(false);
        }
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        TitleViewAdapter titleViewAdapter = this.mTitleViewAdapter;
        if (titleViewAdapter != null) {
            titleViewAdapter.setAnimationEnabled(true);
        }
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(TITLE_SHOW, this.mShowingTitle);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.mTitleViewAdapter != null) {
            showTitle(this.mShowingTitle);
            this.mTitleViewAdapter.setAnimationEnabled(true);
        }
    }

    @Override // android.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.mShowingTitle = bundle.getBoolean(TITLE_SHOW);
        }
        View view2 = this.mTitleView;
        if (view2 != null && (view instanceof ViewGroup)) {
            TitleHelper titleHelper = new TitleHelper((ViewGroup) view, view2);
            this.mTitleHelper = titleHelper;
            titleHelper.showTitle(this.mShowingTitle);
        }
    }

    public void setBadgeDrawable(Drawable drawable) {
        if (this.mBadgeDrawable != drawable) {
            this.mBadgeDrawable = drawable;
            TitleViewAdapter titleViewAdapter = this.mTitleViewAdapter;
            if (titleViewAdapter != null) {
                titleViewAdapter.setBadgeDrawable(drawable);
            }
        }
    }

    public void setOnSearchClickedListener(View.OnClickListener onClickListener) {
        this.mExternalOnSearchClickedListener = onClickListener;
        TitleViewAdapter titleViewAdapter = this.mTitleViewAdapter;
        if (titleViewAdapter != null) {
            titleViewAdapter.setOnSearchClickedListener(onClickListener);
        }
    }

    public void setSearchAffordanceColor(int i8) {
        setSearchAffordanceColors(new SearchOrbView.Colors(i8));
    }

    public void setSearchAffordanceColors(SearchOrbView.Colors colors) {
        this.mSearchAffordanceColors = colors;
        this.mSearchAffordanceColorSet = true;
        TitleViewAdapter titleViewAdapter = this.mTitleViewAdapter;
        if (titleViewAdapter != null) {
            titleViewAdapter.setSearchAffordanceColors(colors);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        TitleViewAdapter titleViewAdapter = this.mTitleViewAdapter;
        if (titleViewAdapter != null) {
            titleViewAdapter.setTitle(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTitleView(View view) {
        this.mTitleView = view;
        if (view == 0) {
            this.mTitleViewAdapter = null;
            this.mTitleHelper = null;
            return;
        }
        TitleViewAdapter titleViewAdapter = ((TitleViewAdapter.Provider) view).getTitleViewAdapter();
        this.mTitleViewAdapter = titleViewAdapter;
        titleViewAdapter.setTitle(this.mTitle);
        this.mTitleViewAdapter.setBadgeDrawable(this.mBadgeDrawable);
        if (this.mSearchAffordanceColorSet) {
            this.mTitleViewAdapter.setSearchAffordanceColors(this.mSearchAffordanceColors);
        }
        View.OnClickListener onClickListener = this.mExternalOnSearchClickedListener;
        if (onClickListener != null) {
            setOnSearchClickedListener(onClickListener);
        }
        if (getView() instanceof ViewGroup) {
            this.mTitleHelper = new TitleHelper((ViewGroup) getView(), this.mTitleView);
        }
    }

    public void showTitle(boolean z8) {
        if (z8 == this.mShowingTitle) {
            return;
        }
        this.mShowingTitle = z8;
        TitleHelper titleHelper = this.mTitleHelper;
        if (titleHelper != null) {
            titleHelper.showTitle(z8);
        }
    }

    public void showTitle(int i8) {
        TitleViewAdapter titleViewAdapter = this.mTitleViewAdapter;
        if (titleViewAdapter != null) {
            titleViewAdapter.updateComponentsVisibility(i8);
        }
        showTitle(true);
    }
}
