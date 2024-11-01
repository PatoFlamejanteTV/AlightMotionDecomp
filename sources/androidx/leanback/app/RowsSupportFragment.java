package androidx.leanback.app;

import android.animation.TimeAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.leanback.R;
import androidx.leanback.app.BrowseSupportFragment;
import androidx.leanback.widget.BaseOnItemViewClickedListener;
import androidx.leanback.widget.BaseOnItemViewSelectedListener;
import androidx.leanback.widget.HorizontalGridView;
import androidx.leanback.widget.ItemBridgeAdapter;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.ObjectAdapter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.OnItemViewSelectedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.RowPresenter;
import androidx.leanback.widget.VerticalGridView;
import androidx.leanback.widget.ViewHolderTask;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class RowsSupportFragment extends BaseRowSupportFragment implements BrowseSupportFragment.MainFragmentRowsAdapterProvider, BrowseSupportFragment.MainFragmentAdapterProvider {
    static final int ALIGN_TOP_NOT_SET = Integer.MIN_VALUE;
    static final boolean DEBUG = false;
    static final String TAG = "RowsSupportFragment";
    ItemBridgeAdapter.AdapterListener mExternalAdapterListener;
    boolean mFreezeRows;
    private MainFragmentAdapter mMainFragmentAdapter;
    private MainFragmentRowsAdapter mMainFragmentRowsAdapter;
    BaseOnItemViewClickedListener mOnItemViewClickedListener;
    BaseOnItemViewSelectedListener mOnItemViewSelectedListener;
    private ArrayList<Presenter> mPresenterMapper;
    private RecyclerView.RecycledViewPool mRecycledViewPool;
    int mSelectAnimatorDuration;
    ItemBridgeAdapter.ViewHolder mSelectedViewHolder;
    private int mSubPosition;
    boolean mViewsCreated;
    boolean mExpand = true;
    private int mAlignedTop = Integer.MIN_VALUE;
    boolean mAfterEntranceTransition = true;
    Interpolator mSelectAnimatorInterpolator = new DecelerateInterpolator(2.0f);
    private final ItemBridgeAdapter.AdapterListener mBridgeAdapterListener = new ItemBridgeAdapter.AdapterListener() { // from class: androidx.leanback.app.RowsSupportFragment.1
        @Override // androidx.leanback.widget.ItemBridgeAdapter.AdapterListener
        public void onAddPresenter(Presenter presenter, int i8) {
            ItemBridgeAdapter.AdapterListener adapterListener = RowsSupportFragment.this.mExternalAdapterListener;
            if (adapterListener != null) {
                adapterListener.onAddPresenter(presenter, i8);
            }
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter.AdapterListener
        public void onAttachedToWindow(ItemBridgeAdapter.ViewHolder viewHolder) {
            RowsSupportFragment.setRowViewExpanded(viewHolder, RowsSupportFragment.this.mExpand);
            RowPresenter rowPresenter = (RowPresenter) viewHolder.getPresenter();
            RowPresenter.ViewHolder rowViewHolder = rowPresenter.getRowViewHolder(viewHolder.getViewHolder());
            rowPresenter.setEntranceTransitionState(rowViewHolder, RowsSupportFragment.this.mAfterEntranceTransition);
            rowPresenter.freeze(rowViewHolder, RowsSupportFragment.this.mFreezeRows);
            ItemBridgeAdapter.AdapterListener adapterListener = RowsSupportFragment.this.mExternalAdapterListener;
            if (adapterListener != null) {
                adapterListener.onAttachedToWindow(viewHolder);
            }
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter.AdapterListener
        public void onBind(ItemBridgeAdapter.ViewHolder viewHolder) {
            ItemBridgeAdapter.AdapterListener adapterListener = RowsSupportFragment.this.mExternalAdapterListener;
            if (adapterListener != null) {
                adapterListener.onBind(viewHolder);
            }
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter.AdapterListener
        public void onCreate(ItemBridgeAdapter.ViewHolder viewHolder) {
            VerticalGridView verticalGridView = RowsSupportFragment.this.getVerticalGridView();
            if (verticalGridView != null) {
                verticalGridView.setClipChildren(false);
            }
            RowsSupportFragment.this.setupSharedViewPool(viewHolder);
            RowsSupportFragment rowsSupportFragment = RowsSupportFragment.this;
            rowsSupportFragment.mViewsCreated = true;
            viewHolder.setExtraObject(new RowViewHolderExtra(viewHolder));
            RowsSupportFragment.setRowViewSelected(viewHolder, false, true);
            ItemBridgeAdapter.AdapterListener adapterListener = RowsSupportFragment.this.mExternalAdapterListener;
            if (adapterListener != null) {
                adapterListener.onCreate(viewHolder);
            }
            RowPresenter.ViewHolder rowViewHolder = ((RowPresenter) viewHolder.getPresenter()).getRowViewHolder(viewHolder.getViewHolder());
            rowViewHolder.setOnItemViewSelectedListener(RowsSupportFragment.this.mOnItemViewSelectedListener);
            rowViewHolder.setOnItemViewClickedListener(RowsSupportFragment.this.mOnItemViewClickedListener);
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter.AdapterListener
        public void onDetachedFromWindow(ItemBridgeAdapter.ViewHolder viewHolder) {
            ItemBridgeAdapter.ViewHolder viewHolder2 = RowsSupportFragment.this.mSelectedViewHolder;
            if (viewHolder2 == viewHolder) {
                RowsSupportFragment.setRowViewSelected(viewHolder2, false, true);
                RowsSupportFragment.this.mSelectedViewHolder = null;
            }
            ItemBridgeAdapter.AdapterListener adapterListener = RowsSupportFragment.this.mExternalAdapterListener;
            if (adapterListener != null) {
                adapterListener.onDetachedFromWindow(viewHolder);
            }
        }

        @Override // androidx.leanback.widget.ItemBridgeAdapter.AdapterListener
        public void onUnbind(ItemBridgeAdapter.ViewHolder viewHolder) {
            RowsSupportFragment.setRowViewSelected(viewHolder, false, true);
            ItemBridgeAdapter.AdapterListener adapterListener = RowsSupportFragment.this.mExternalAdapterListener;
            if (adapterListener != null) {
                adapterListener.onUnbind(viewHolder);
            }
        }
    };

    /* loaded from: classes3.dex */
    public static class MainFragmentAdapter extends BrowseSupportFragment.MainFragmentAdapter<RowsSupportFragment> {
        public MainFragmentAdapter(RowsSupportFragment rowsSupportFragment) {
            super(rowsSupportFragment);
            setScalingEnabled(true);
        }

        @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentAdapter
        public boolean isScrolling() {
            return getFragment().isScrolling();
        }

        @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentAdapter
        public void onTransitionEnd() {
            getFragment().onTransitionEnd();
        }

        @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentAdapter
        public boolean onTransitionPrepare() {
            return getFragment().onTransitionPrepare();
        }

        @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentAdapter
        public void onTransitionStart() {
            getFragment().onTransitionStart();
        }

        @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentAdapter
        public void setAlignment(int i8) {
            getFragment().setAlignment(i8);
        }

        @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentAdapter
        public void setEntranceTransitionState(boolean z8) {
            getFragment().setEntranceTransitionState(z8);
        }

        @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentAdapter
        public void setExpand(boolean z8) {
            getFragment().setExpand(z8);
        }
    }

    /* loaded from: classes3.dex */
    public static class MainFragmentRowsAdapter extends BrowseSupportFragment.MainFragmentRowsAdapter<RowsSupportFragment> {
        public MainFragmentRowsAdapter(RowsSupportFragment rowsSupportFragment) {
            super(rowsSupportFragment);
        }

        @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentRowsAdapter
        public RowPresenter.ViewHolder findRowViewHolderByPosition(int i8) {
            return getFragment().findRowViewHolderByPosition(i8);
        }

        @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentRowsAdapter
        public int getSelectedPosition() {
            return getFragment().getSelectedPosition();
        }

        @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentRowsAdapter
        public void setAdapter(ObjectAdapter objectAdapter) {
            getFragment().setAdapter(objectAdapter);
        }

        @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentRowsAdapter
        public void setOnItemViewClickedListener(OnItemViewClickedListener onItemViewClickedListener) {
            getFragment().setOnItemViewClickedListener(onItemViewClickedListener);
        }

        @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentRowsAdapter
        public void setOnItemViewSelectedListener(OnItemViewSelectedListener onItemViewSelectedListener) {
            getFragment().setOnItemViewSelectedListener(onItemViewSelectedListener);
        }

        @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentRowsAdapter
        public void setSelectedPosition(int i8, boolean z8, Presenter.ViewHolderTask viewHolderTask) {
            getFragment().setSelectedPosition(i8, z8, viewHolderTask);
        }

        @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentRowsAdapter
        public void setSelectedPosition(int i8, boolean z8) {
            getFragment().setSelectedPosition(i8, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class RowViewHolderExtra implements TimeAnimator.TimeListener {
        final RowPresenter mRowPresenter;
        final Presenter.ViewHolder mRowViewHolder;
        final TimeAnimator mSelectAnimator;
        int mSelectAnimatorDurationInUse;
        Interpolator mSelectAnimatorInterpolatorInUse;
        float mSelectLevelAnimDelta;
        float mSelectLevelAnimStart;

        RowViewHolderExtra(ItemBridgeAdapter.ViewHolder viewHolder) {
            TimeAnimator timeAnimator = new TimeAnimator();
            this.mSelectAnimator = timeAnimator;
            this.mRowPresenter = (RowPresenter) viewHolder.getPresenter();
            this.mRowViewHolder = viewHolder.getViewHolder();
            timeAnimator.setTimeListener(this);
        }

        void animateSelect(boolean z8, boolean z9) {
            float f8;
            this.mSelectAnimator.end();
            if (z8) {
                f8 = 1.0f;
            } else {
                f8 = 0.0f;
            }
            if (z9) {
                this.mRowPresenter.setSelectLevel(this.mRowViewHolder, f8);
                return;
            }
            if (this.mRowPresenter.getSelectLevel(this.mRowViewHolder) != f8) {
                RowsSupportFragment rowsSupportFragment = RowsSupportFragment.this;
                this.mSelectAnimatorDurationInUse = rowsSupportFragment.mSelectAnimatorDuration;
                this.mSelectAnimatorInterpolatorInUse = rowsSupportFragment.mSelectAnimatorInterpolator;
                float selectLevel = this.mRowPresenter.getSelectLevel(this.mRowViewHolder);
                this.mSelectLevelAnimStart = selectLevel;
                this.mSelectLevelAnimDelta = f8 - selectLevel;
                this.mSelectAnimator.start();
            }
        }

        @Override // android.animation.TimeAnimator.TimeListener
        public void onTimeUpdate(TimeAnimator timeAnimator, long j8, long j9) {
            if (this.mSelectAnimator.isRunning()) {
                updateSelect(j8, j9);
            }
        }

        void updateSelect(long j8, long j9) {
            float f8;
            int i8 = this.mSelectAnimatorDurationInUse;
            if (j8 >= i8) {
                this.mSelectAnimator.end();
                f8 = 1.0f;
            } else {
                f8 = (float) (j8 / i8);
            }
            Interpolator interpolator = this.mSelectAnimatorInterpolatorInUse;
            if (interpolator != null) {
                f8 = interpolator.getInterpolation(f8);
            }
            this.mRowPresenter.setSelectLevel(this.mRowViewHolder, this.mSelectLevelAnimStart + (f8 * this.mSelectLevelAnimDelta));
        }
    }

    private void freezeRows(boolean z8) {
        this.mFreezeRows = z8;
        VerticalGridView verticalGridView = getVerticalGridView();
        if (verticalGridView != null) {
            int childCount = verticalGridView.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                ItemBridgeAdapter.ViewHolder viewHolder = (ItemBridgeAdapter.ViewHolder) verticalGridView.getChildViewHolder(verticalGridView.getChildAt(i8));
                RowPresenter rowPresenter = (RowPresenter) viewHolder.getPresenter();
                rowPresenter.freeze(rowPresenter.getRowViewHolder(viewHolder.getViewHolder()), z8);
            }
        }
    }

    static void setRowViewExpanded(ItemBridgeAdapter.ViewHolder viewHolder, boolean z8) {
        ((RowPresenter) viewHolder.getPresenter()).setRowViewExpanded(viewHolder.getViewHolder(), z8);
    }

    static void setRowViewSelected(ItemBridgeAdapter.ViewHolder viewHolder, boolean z8, boolean z9) {
        ((RowViewHolderExtra) viewHolder.getExtraObject()).animateSelect(z8, z9);
        ((RowPresenter) viewHolder.getPresenter()).setRowViewSelected(viewHolder.getViewHolder(), z8);
    }

    @Deprecated
    public void enableRowScaling(boolean z8) {
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment
    protected VerticalGridView findGridViewFromRoot(View view) {
        return (VerticalGridView) view.findViewById(R.id.container_list);
    }

    public RowPresenter.ViewHolder findRowViewHolderByPosition(int i8) {
        VerticalGridView verticalGridView = this.mVerticalGridView;
        if (verticalGridView == null) {
            return null;
        }
        return getRowViewHolder((ItemBridgeAdapter.ViewHolder) verticalGridView.findViewHolderForAdapterPosition(i8));
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment
    int getLayoutResourceId() {
        return R.layout.lb_rows_fragment;
    }

    @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentAdapterProvider
    public BrowseSupportFragment.MainFragmentAdapter getMainFragmentAdapter() {
        if (this.mMainFragmentAdapter == null) {
            this.mMainFragmentAdapter = new MainFragmentAdapter(this);
        }
        return this.mMainFragmentAdapter;
    }

    @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentRowsAdapterProvider
    public BrowseSupportFragment.MainFragmentRowsAdapter getMainFragmentRowsAdapter() {
        if (this.mMainFragmentRowsAdapter == null) {
            this.mMainFragmentRowsAdapter = new MainFragmentRowsAdapter(this);
        }
        return this.mMainFragmentRowsAdapter;
    }

    public BaseOnItemViewClickedListener getOnItemViewClickedListener() {
        return this.mOnItemViewClickedListener;
    }

    public BaseOnItemViewSelectedListener getOnItemViewSelectedListener() {
        return this.mOnItemViewSelectedListener;
    }

    public RowPresenter.ViewHolder getRowViewHolder(int i8) {
        VerticalGridView verticalGridView = getVerticalGridView();
        if (verticalGridView == null) {
            return null;
        }
        return getRowViewHolder((ItemBridgeAdapter.ViewHolder) verticalGridView.findViewHolderForAdapterPosition(i8));
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment
    public /* bridge */ /* synthetic */ int getSelectedPosition() {
        return super.getSelectedPosition();
    }

    public boolean isScrolling() {
        if (getVerticalGridView() == null || getVerticalGridView().getScrollState() == 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mSelectAnimatorDuration = getResources().getInteger(R.integer.lb_browse_rows_anim_duration);
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.mViewsCreated = false;
        super.onDestroyView();
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment
    void onRowSelected(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i8, int i9) {
        ItemBridgeAdapter.ViewHolder viewHolder2 = this.mSelectedViewHolder;
        boolean z8 = true;
        if (viewHolder2 != viewHolder || this.mSubPosition != i9) {
            this.mSubPosition = i9;
            if (viewHolder2 != null) {
                setRowViewSelected(viewHolder2, false, false);
            }
            ItemBridgeAdapter.ViewHolder viewHolder3 = (ItemBridgeAdapter.ViewHolder) viewHolder;
            this.mSelectedViewHolder = viewHolder3;
            if (viewHolder3 != null) {
                setRowViewSelected(viewHolder3, true, false);
            }
        }
        MainFragmentAdapter mainFragmentAdapter = this.mMainFragmentAdapter;
        if (mainFragmentAdapter != null) {
            BrowseSupportFragment.FragmentHost fragmentHost = mainFragmentAdapter.getFragmentHost();
            if (i8 > 0) {
                z8 = false;
            }
            fragmentHost.showTitleView(z8);
        }
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment
    public void onTransitionEnd() {
        super.onTransitionEnd();
        freezeRows(false);
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment
    public boolean onTransitionPrepare() {
        boolean onTransitionPrepare = super.onTransitionPrepare();
        if (onTransitionPrepare) {
            freezeRows(true);
        }
        return onTransitionPrepare;
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment
    public /* bridge */ /* synthetic */ void onTransitionStart() {
        super.onTransitionStart();
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        getVerticalGridView().setItemAlignmentViewId(R.id.row_content);
        getVerticalGridView().setSaveChildrenPolicy(2);
        setAlignment(this.mAlignedTop);
        this.mRecycledViewPool = null;
        this.mPresenterMapper = null;
        MainFragmentAdapter mainFragmentAdapter = this.mMainFragmentAdapter;
        if (mainFragmentAdapter != null) {
            mainFragmentAdapter.getFragmentHost().notifyViewCreated(this.mMainFragmentAdapter);
        }
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment
    public void setAlignment(int i8) {
        if (i8 == Integer.MIN_VALUE) {
            return;
        }
        this.mAlignedTop = i8;
        VerticalGridView verticalGridView = getVerticalGridView();
        if (verticalGridView != null) {
            verticalGridView.setItemAlignmentOffset(0);
            verticalGridView.setItemAlignmentOffsetPercent(-1.0f);
            verticalGridView.setItemAlignmentOffsetWithPadding(true);
            verticalGridView.setWindowAlignmentOffset(this.mAlignedTop);
            verticalGridView.setWindowAlignmentOffsetPercent(-1.0f);
            verticalGridView.setWindowAlignment(0);
        }
    }

    public void setEntranceTransitionState(boolean z8) {
        this.mAfterEntranceTransition = z8;
        VerticalGridView verticalGridView = getVerticalGridView();
        if (verticalGridView != null) {
            int childCount = verticalGridView.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                ItemBridgeAdapter.ViewHolder viewHolder = (ItemBridgeAdapter.ViewHolder) verticalGridView.getChildViewHolder(verticalGridView.getChildAt(i8));
                RowPresenter rowPresenter = (RowPresenter) viewHolder.getPresenter();
                rowPresenter.setEntranceTransitionState(rowPresenter.getRowViewHolder(viewHolder.getViewHolder()), this.mAfterEntranceTransition);
            }
        }
    }

    public void setExpand(boolean z8) {
        this.mExpand = z8;
        VerticalGridView verticalGridView = getVerticalGridView();
        if (verticalGridView != null) {
            int childCount = verticalGridView.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                setRowViewExpanded((ItemBridgeAdapter.ViewHolder) verticalGridView.getChildViewHolder(verticalGridView.getChildAt(i8)), this.mExpand);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setExternalAdapterListener(ItemBridgeAdapter.AdapterListener adapterListener) {
        this.mExternalAdapterListener = adapterListener;
    }

    public void setOnItemViewClickedListener(BaseOnItemViewClickedListener baseOnItemViewClickedListener) {
        this.mOnItemViewClickedListener = baseOnItemViewClickedListener;
        if (!this.mViewsCreated) {
        } else {
            throw new IllegalStateException("Item clicked listener must be set before views are created");
        }
    }

    public void setOnItemViewSelectedListener(BaseOnItemViewSelectedListener baseOnItemViewSelectedListener) {
        this.mOnItemViewSelectedListener = baseOnItemViewSelectedListener;
        VerticalGridView verticalGridView = getVerticalGridView();
        if (verticalGridView != null) {
            int childCount = verticalGridView.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                getRowViewHolder((ItemBridgeAdapter.ViewHolder) verticalGridView.getChildViewHolder(verticalGridView.getChildAt(i8))).setOnItemViewSelectedListener(this.mOnItemViewSelectedListener);
            }
        }
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment
    public /* bridge */ /* synthetic */ void setSelectedPosition(int i8) {
        super.setSelectedPosition(i8);
    }

    void setupSharedViewPool(ItemBridgeAdapter.ViewHolder viewHolder) {
        RowPresenter.ViewHolder rowViewHolder = ((RowPresenter) viewHolder.getPresenter()).getRowViewHolder(viewHolder.getViewHolder());
        if (rowViewHolder instanceof ListRowPresenter.ViewHolder) {
            ListRowPresenter.ViewHolder viewHolder2 = (ListRowPresenter.ViewHolder) rowViewHolder;
            HorizontalGridView gridView = viewHolder2.getGridView();
            RecyclerView.RecycledViewPool recycledViewPool = this.mRecycledViewPool;
            if (recycledViewPool == null) {
                this.mRecycledViewPool = gridView.getRecycledViewPool();
            } else {
                gridView.setRecycledViewPool(recycledViewPool);
            }
            ItemBridgeAdapter bridgeAdapter = viewHolder2.getBridgeAdapter();
            ArrayList<Presenter> arrayList = this.mPresenterMapper;
            if (arrayList == null) {
                this.mPresenterMapper = bridgeAdapter.getPresenterMapper();
            } else {
                bridgeAdapter.setPresenterMapper(arrayList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.leanback.app.BaseRowSupportFragment
    public void updateAdapter() {
        super.updateAdapter();
        this.mSelectedViewHolder = null;
        this.mViewsCreated = false;
        ItemBridgeAdapter bridgeAdapter = getBridgeAdapter();
        if (bridgeAdapter != null) {
            bridgeAdapter.setAdapterListener(this.mBridgeAdapterListener);
        }
    }

    @Override // androidx.leanback.app.BaseRowSupportFragment
    public /* bridge */ /* synthetic */ void setSelectedPosition(int i8, boolean z8) {
        super.setSelectedPosition(i8, z8);
    }

    public void setSelectedPosition(int i8, boolean z8, final Presenter.ViewHolderTask viewHolderTask) {
        VerticalGridView verticalGridView = getVerticalGridView();
        if (verticalGridView == null) {
            return;
        }
        ViewHolderTask viewHolderTask2 = viewHolderTask != null ? new ViewHolderTask() { // from class: androidx.leanback.app.RowsSupportFragment.2
            @Override // androidx.leanback.widget.ViewHolderTask
            public void run(final RecyclerView.ViewHolder viewHolder) {
                viewHolder.itemView.post(new Runnable() { // from class: androidx.leanback.app.RowsSupportFragment.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        viewHolderTask.run(RowsSupportFragment.getRowViewHolder((ItemBridgeAdapter.ViewHolder) viewHolder));
                    }
                });
            }
        } : null;
        if (z8) {
            verticalGridView.setSelectedPositionSmooth(i8, viewHolderTask2);
        } else {
            verticalGridView.setSelectedPosition(i8, viewHolderTask2);
        }
    }

    static RowPresenter.ViewHolder getRowViewHolder(ItemBridgeAdapter.ViewHolder viewHolder) {
        if (viewHolder == null) {
            return null;
        }
        return ((RowPresenter) viewHolder.getPresenter()).getRowViewHolder(viewHolder.getViewHolder());
    }
}
