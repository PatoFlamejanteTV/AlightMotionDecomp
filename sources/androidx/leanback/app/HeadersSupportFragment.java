package androidx.leanback.app;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.leanback.R;
import androidx.leanback.widget.ClassPresenterSelector;
import androidx.leanback.widget.DividerPresenter;
import androidx.leanback.widget.DividerRow;
import androidx.leanback.widget.FocusHighlightHelper;
import androidx.leanback.widget.ItemBridgeAdapter;
import androidx.leanback.widget.PresenterSelector;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowHeaderPresenter;
import androidx.leanback.widget.SectionRow;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class HeadersSupportFragment extends BaseRowSupportFragment {
    private static final PresenterSelector sHeaderPresenter = new ClassPresenterSelector().addClassPresenter(DividerRow.class, new DividerPresenter()).addClassPresenter(SectionRow.class, new RowHeaderPresenter(R.layout.lb_section_header, false)).addClassPresenter(Row.class, new RowHeaderPresenter(R.layout.lb_header));
    static View.OnLayoutChangeListener sLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.leanback.app.HeadersSupportFragment.2
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            float f8;
            if (view.getLayoutDirection() == 1) {
                f8 = view.getWidth();
            } else {
                f8 = 0.0f;
            }
            view.setPivotX(f8);
            view.setPivotY(view.getMeasuredHeight() / 2);
        }
    };
    private int mBackgroundColor;
    private boolean mBackgroundColorSet;
    OnHeaderClickedListener mOnHeaderClickedListener;
    private OnHeaderViewSelectedListener mOnHeaderViewSelectedListener;
    private boolean mHeadersEnabled = true;
    private boolean mHeadersGone = false;
    private final ItemBridgeAdapter.AdapterListener mAdapterListener = new ItemBridgeAdapter.AdapterListener() { // from class: androidx.leanback.app.HeadersSupportFragment.1
        @Override // androidx.leanback.widget.ItemBridgeAdapter.AdapterListener
        public void onCreate(final ItemBridgeAdapter.ViewHolder viewHolder) {
            View view = viewHolder.getViewHolder().view;
            view.setOnClickListener(new View.OnClickListener() { // from class: androidx.leanback.app.HeadersSupportFragment.1.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    OnHeaderClickedListener onHeaderClickedListener = HeadersSupportFragment.this.mOnHeaderClickedListener;
                    if (onHeaderClickedListener != null) {
                        onHeaderClickedListener.onHeaderClicked((RowHeaderPresenter.ViewHolder) viewHolder.getViewHolder(), (Row) viewHolder.getItem());
                    }
                }
            });
            if (HeadersSupportFragment.this.mWrapper != null) {
                viewHolder.itemView.addOnLayoutChangeListener(HeadersSupportFragment.sLayoutChangeListener);
            } else {
                view.addOnLayoutChangeListener(HeadersSupportFragment.sLayoutChangeListener);
            }
        }
    };
    final ItemBridgeAdapter.Wrapper mWrapper = new ItemBridgeAdapter.Wrapper() { // from class: androidx.leanback.app.HeadersSupportFragment.3
        @Override // androidx.leanback.widget.ItemBridgeAdapter.Wrapper
        public View createWrapper(View view) {
            return new NoOverlappingFrameLayout(view.getContext());
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter.Wrapper
        public void wrap(View view, View view2) {
            ((FrameLayout) view).addView(view2);
        }
    };

    /* loaded from: classes3.dex */
    static class NoOverlappingFrameLayout extends FrameLayout {
        public NoOverlappingFrameLayout(Context context) {
            super(context);
        }

        @Override // android.view.View
        public boolean hasOverlappingRendering() {
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public interface OnHeaderClickedListener {
        void onHeaderClicked(RowHeaderPresenter.ViewHolder viewHolder, Row row);
    }

    /* loaded from: classes3.dex */
    public interface OnHeaderViewSelectedListener {
        void onHeaderSelected(RowHeaderPresenter.ViewHolder viewHolder, Row row);
    }

    public HeadersSupportFragment() {
        setPresenterSelector(sHeaderPresenter);
        FocusHighlightHelper.setupHeaderItemFocusHighlight(getBridgeAdapter());
    }

    private void updateFadingEdgeToBrandColor(int i8) {
        Drawable background = getView().findViewById(R.id.fade_out_edge).getBackground();
        if (background instanceof GradientDrawable) {
            background.mutate();
            ((GradientDrawable) background).setColors(new int[]{0, i8});
        }
    }

    private void updateListViewVisibility() {
        int i8;
        VerticalGridView verticalGridView = getVerticalGridView();
        if (verticalGridView != null) {
            View view = getView();
            if (this.mHeadersGone) {
                i8 = 8;
            } else {
                i8 = 0;
            }
            view.setVisibility(i8);
            if (!this.mHeadersGone) {
                if (this.mHeadersEnabled) {
                    verticalGridView.setChildrenVisibility(0);
                } else {
                    verticalGridView.setChildrenVisibility(4);
                }
            }
        }
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment
    VerticalGridView findGridViewFromRoot(View view) {
        return (VerticalGridView) view.findViewById(R.id.browse_headers);
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment
    int getLayoutResourceId() {
        return R.layout.lb_headers_fragment;
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment
    public /* bridge */ /* synthetic */ int getSelectedPosition() {
        return super.getSelectedPosition();
    }

    public boolean isScrolling() {
        if (getVerticalGridView().getScrollState() != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment
    void onRowSelected(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i8, int i9) {
        OnHeaderViewSelectedListener onHeaderViewSelectedListener = this.mOnHeaderViewSelectedListener;
        if (onHeaderViewSelectedListener != null) {
            if (viewHolder != null && i8 >= 0) {
                ItemBridgeAdapter.ViewHolder viewHolder2 = (ItemBridgeAdapter.ViewHolder) viewHolder;
                onHeaderViewSelectedListener.onHeaderSelected((RowHeaderPresenter.ViewHolder) viewHolder2.getViewHolder(), (Row) viewHolder2.getItem());
            } else {
                onHeaderViewSelectedListener.onHeaderSelected(null, null);
            }
        }
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment
    public void onTransitionEnd() {
        VerticalGridView verticalGridView;
        if (this.mHeadersEnabled && (verticalGridView = getVerticalGridView()) != null) {
            verticalGridView.setDescendantFocusability(262144);
            if (verticalGridView.hasFocus()) {
                verticalGridView.requestFocus();
            }
        }
        super.onTransitionEnd();
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment
    public /* bridge */ /* synthetic */ boolean onTransitionPrepare() {
        return super.onTransitionPrepare();
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment
    public void onTransitionStart() {
        VerticalGridView verticalGridView;
        super.onTransitionStart();
        if (!this.mHeadersEnabled && (verticalGridView = getVerticalGridView()) != null) {
            verticalGridView.setDescendantFocusability(131072);
            if (verticalGridView.hasFocus()) {
                verticalGridView.requestFocus();
            }
        }
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        VerticalGridView verticalGridView = getVerticalGridView();
        if (verticalGridView == null) {
            return;
        }
        if (this.mBackgroundColorSet) {
            verticalGridView.setBackgroundColor(this.mBackgroundColor);
            updateFadingEdgeToBrandColor(this.mBackgroundColor);
        } else {
            Drawable background = verticalGridView.getBackground();
            if (background instanceof ColorDrawable) {
                updateFadingEdgeToBrandColor(((ColorDrawable) background).getColor());
            }
        }
        updateListViewVisibility();
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment
    public /* bridge */ /* synthetic */ void setAlignment(int i8) {
        super.setAlignment(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBackgroundColor(int i8) {
        this.mBackgroundColor = i8;
        this.mBackgroundColorSet = true;
        if (getVerticalGridView() != null) {
            getVerticalGridView().setBackgroundColor(this.mBackgroundColor);
            updateFadingEdgeToBrandColor(this.mBackgroundColor);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setHeadersEnabled(boolean z8) {
        this.mHeadersEnabled = z8;
        updateListViewVisibility();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setHeadersGone(boolean z8) {
        this.mHeadersGone = z8;
        updateListViewVisibility();
    }

    public void setOnHeaderClickedListener(OnHeaderClickedListener onHeaderClickedListener) {
        this.mOnHeaderClickedListener = onHeaderClickedListener;
    }

    public void setOnHeaderViewSelectedListener(OnHeaderViewSelectedListener onHeaderViewSelectedListener) {
        this.mOnHeaderViewSelectedListener = onHeaderViewSelectedListener;
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment
    public /* bridge */ /* synthetic */ void setSelectedPosition(int i8) {
        super.setSelectedPosition(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.leanback.app.BaseRowSupportFragment
    public void updateAdapter() {
        super.updateAdapter();
        ItemBridgeAdapter bridgeAdapter = getBridgeAdapter();
        bridgeAdapter.setAdapterListener(this.mAdapterListener);
        bridgeAdapter.setWrapper(this.mWrapper);
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment
    public /* bridge */ /* synthetic */ void setSelectedPosition(int i8, boolean z8) {
        super.setSelectedPosition(i8, z8);
    }
}
