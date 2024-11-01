package androidx.leanback.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.R;
import androidx.leanback.transition.TransitionHelper;
import androidx.leanback.util.StateMachine;
import androidx.leanback.widget.BrowseFrameLayout;
import androidx.leanback.widget.ObjectAdapter;
import androidx.leanback.widget.OnChildLaidOutListener;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.OnItemViewSelectedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;
import androidx.leanback.widget.VerticalGridPresenter;

@Deprecated
/* loaded from: classes3.dex */
public class VerticalGridFragment extends BaseFragment {
    static final boolean DEBUG = false;
    static final String TAG = "VerticalGF";
    private ObjectAdapter mAdapter;
    private VerticalGridPresenter mGridPresenter;
    VerticalGridPresenter.ViewHolder mGridViewHolder;
    private OnItemViewClickedListener mOnItemViewClickedListener;
    OnItemViewSelectedListener mOnItemViewSelectedListener;
    private Object mSceneAfterEntranceTransition;
    private int mSelectedPosition = -1;
    final StateMachine.State STATE_SET_ENTRANCE_START_STATE = new StateMachine.State("SET_ENTRANCE_START_STATE") { // from class: androidx.leanback.app.VerticalGridFragment.1
        @Override // androidx.leanback.util.StateMachine.State
        public void run() {
            VerticalGridFragment.this.setEntranceTransitionState(false);
        }
    };
    private final OnItemViewSelectedListener mViewSelectedListener = new OnItemViewSelectedListener() { // from class: androidx.leanback.app.VerticalGridFragment.2
        @Override // androidx.leanback.widget.BaseOnItemViewSelectedListener
        public void onItemSelected(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
            VerticalGridFragment.this.gridOnItemSelected(VerticalGridFragment.this.mGridViewHolder.getGridView().getSelectedPosition());
            OnItemViewSelectedListener onItemViewSelectedListener = VerticalGridFragment.this.mOnItemViewSelectedListener;
            if (onItemViewSelectedListener != null) {
                onItemViewSelectedListener.onItemSelected(viewHolder, obj, viewHolder2, row);
            }
        }
    };
    private final OnChildLaidOutListener mChildLaidOutListener = new OnChildLaidOutListener() { // from class: androidx.leanback.app.VerticalGridFragment.3
        @Override // androidx.leanback.widget.OnChildLaidOutListener
        public void onChildLaidOut(ViewGroup viewGroup, View view, int i8, long j8) {
            if (i8 == 0) {
                VerticalGridFragment.this.showOrHideTitle();
            }
        }
    };

    private void setupFocusSearchListener() {
        ((BrowseFrameLayout) getView().findViewById(R.id.grid_frame)).setOnFocusSearchListener(getTitleHelper().getOnFocusSearchListener());
    }

    private void updateAdapter() {
        VerticalGridPresenter.ViewHolder viewHolder = this.mGridViewHolder;
        if (viewHolder != null) {
            this.mGridPresenter.onBindViewHolder(viewHolder, this.mAdapter);
            if (this.mSelectedPosition != -1) {
                this.mGridViewHolder.getGridView().setSelectedPosition(this.mSelectedPosition);
            }
        }
    }

    @Override // androidx.leanback.app.BaseFragment
    protected Object createEntranceTransition() {
        return TransitionHelper.loadTransition(FragmentUtil.getContext(this), R.transition.lb_vertical_grid_entrance_transition);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.leanback.app.BaseFragment
    public void createStateMachineStates() {
        super.createStateMachineStates();
        this.mStateMachine.addState(this.STATE_SET_ENTRANCE_START_STATE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.leanback.app.BaseFragment
    public void createStateMachineTransitions() {
        super.createStateMachineTransitions();
        this.mStateMachine.addTransition(this.STATE_ENTRANCE_ON_PREPARED, this.STATE_SET_ENTRANCE_START_STATE, this.EVT_ON_CREATEVIEW);
    }

    public ObjectAdapter getAdapter() {
        return this.mAdapter;
    }

    public VerticalGridPresenter getGridPresenter() {
        return this.mGridPresenter;
    }

    public OnItemViewClickedListener getOnItemViewClickedListener() {
        return this.mOnItemViewClickedListener;
    }

    void gridOnItemSelected(int i8) {
        if (i8 != this.mSelectedPosition) {
            this.mSelectedPosition = i8;
            showOrHideTitle();
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.lb_vertical_grid_fragment, viewGroup, false);
        installTitleView(layoutInflater, (ViewGroup) viewGroup2.findViewById(R.id.grid_frame), bundle);
        getProgressBarManager().setRootView(viewGroup2);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.browse_grid_dock);
        VerticalGridPresenter.ViewHolder onCreateViewHolder = this.mGridPresenter.onCreateViewHolder(viewGroup3);
        this.mGridViewHolder = onCreateViewHolder;
        viewGroup3.addView(onCreateViewHolder.view);
        this.mGridViewHolder.getGridView().setOnChildLaidOutListener(this.mChildLaidOutListener);
        this.mSceneAfterEntranceTransition = TransitionHelper.createScene(viewGroup3, new Runnable() { // from class: androidx.leanback.app.VerticalGridFragment.4
            @Override // java.lang.Runnable
            public void run() {
                VerticalGridFragment.this.setEntranceTransitionState(true);
            }
        });
        updateAdapter();
        return viewGroup2;
    }

    @Override // androidx.leanback.app.BrandedFragment, android.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.mGridViewHolder = null;
    }

    @Override // androidx.leanback.app.BrandedFragment, android.app.Fragment
    public void onStart() {
        super.onStart();
        setupFocusSearchListener();
    }

    @Override // androidx.leanback.app.BaseFragment
    protected void runEntranceTransition(Object obj) {
        TransitionHelper.runTransition(this.mSceneAfterEntranceTransition, obj);
    }

    public void setAdapter(ObjectAdapter objectAdapter) {
        this.mAdapter = objectAdapter;
        updateAdapter();
    }

    void setEntranceTransitionState(boolean z8) {
        this.mGridPresenter.setEntranceTransitionState(this.mGridViewHolder, z8);
    }

    public void setGridPresenter(VerticalGridPresenter verticalGridPresenter) {
        if (verticalGridPresenter != null) {
            this.mGridPresenter = verticalGridPresenter;
            verticalGridPresenter.setOnItemViewSelectedListener(this.mViewSelectedListener);
            OnItemViewClickedListener onItemViewClickedListener = this.mOnItemViewClickedListener;
            if (onItemViewClickedListener != null) {
                this.mGridPresenter.setOnItemViewClickedListener(onItemViewClickedListener);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Grid presenter may not be null");
    }

    public void setOnItemViewClickedListener(OnItemViewClickedListener onItemViewClickedListener) {
        this.mOnItemViewClickedListener = onItemViewClickedListener;
        VerticalGridPresenter verticalGridPresenter = this.mGridPresenter;
        if (verticalGridPresenter != null) {
            verticalGridPresenter.setOnItemViewClickedListener(onItemViewClickedListener);
        }
    }

    public void setOnItemViewSelectedListener(OnItemViewSelectedListener onItemViewSelectedListener) {
        this.mOnItemViewSelectedListener = onItemViewSelectedListener;
    }

    public void setSelectedPosition(int i8) {
        this.mSelectedPosition = i8;
        VerticalGridPresenter.ViewHolder viewHolder = this.mGridViewHolder;
        if (viewHolder != null && viewHolder.getGridView().getAdapter() != null) {
            this.mGridViewHolder.getGridView().setSelectedPositionSmooth(i8);
        }
    }

    void showOrHideTitle() {
        if (this.mGridViewHolder.getGridView().findViewHolderForAdapterPosition(this.mSelectedPosition) == null) {
            return;
        }
        if (!this.mGridViewHolder.getGridView().hasPreviousViewInSameRow(this.mSelectedPosition)) {
            showTitle(true);
        } else {
            showTitle(false);
        }
    }
}
