package androidx.leanback.app;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.leanback.R;
import androidx.leanback.transition.TransitionHelper;
import androidx.leanback.transition.TransitionListener;
import androidx.leanback.util.StateMachine;
import androidx.leanback.widget.BaseOnItemViewClickedListener;
import androidx.leanback.widget.BaseOnItemViewSelectedListener;
import androidx.leanback.widget.BrowseFrameLayout;
import androidx.leanback.widget.DetailsParallax;
import androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter;
import androidx.leanback.widget.ItemAlignmentFacet;
import androidx.leanback.widget.ItemBridgeAdapter;
import androidx.leanback.widget.ObjectAdapter;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.RowPresenter;
import androidx.leanback.widget.VerticalGridView;
import java.lang.ref.WeakReference;

@Deprecated
/* loaded from: classes3.dex */
public class DetailsFragment extends BaseFragment {
    static final boolean DEBUG = false;
    static final String TAG = "DetailsFragment";
    final StateMachine.State STATE_ENTER_TRANSITION_ADDLISTENER;
    final StateMachine.State STATE_ENTER_TRANSITION_CANCEL;
    final StateMachine.State STATE_ENTER_TRANSITION_PENDING;
    final StateMachine.State STATE_SWITCH_TO_VIDEO_IN_ON_CREATE;
    ObjectAdapter mAdapter;
    Drawable mBackgroundDrawable;
    View mBackgroundView;
    int mContainerListAlignTop;
    DetailsFragmentBackgroundController mDetailsBackgroundController;
    DetailsParallax mDetailsParallax;
    BaseOnItemViewSelectedListener mExternalOnItemViewSelectedListener;
    BaseOnItemViewClickedListener mOnItemViewClickedListener;
    BrowseFrameLayout mRootView;
    RowsFragment mRowsFragment;
    Object mSceneAfterEntranceTransition;
    Fragment mVideoFragment;
    WaitEnterTransitionTimeout mWaitEnterTransitionTimeout;
    final StateMachine.State STATE_SET_ENTRANCE_START_STATE = new StateMachine.State("STATE_SET_ENTRANCE_START_STATE") { // from class: androidx.leanback.app.DetailsFragment.1
        @Override // androidx.leanback.util.StateMachine.State
        public void run() {
            DetailsFragment.this.mRowsFragment.setEntranceTransitionState(false);
        }
    };
    final StateMachine.State STATE_ENTER_TRANSITION_INIT = new StateMachine.State("STATE_ENTER_TRANSIITON_INIT");
    final StateMachine.State STATE_ENTER_TRANSITION_COMPLETE = new StateMachine.State("STATE_ENTER_TRANSIITON_COMPLETE", true, false);
    final StateMachine.State STATE_ON_SAFE_START = new StateMachine.State("STATE_ON_SAFE_START") { // from class: androidx.leanback.app.DetailsFragment.6
        @Override // androidx.leanback.util.StateMachine.State
        public void run() {
            DetailsFragment.this.onSafeStart();
        }
    };
    final StateMachine.Event EVT_ONSTART = new StateMachine.Event("onStart");
    final StateMachine.Event EVT_NO_ENTER_TRANSITION = new StateMachine.Event("EVT_NO_ENTER_TRANSITION");
    final StateMachine.Event EVT_DETAILS_ROW_LOADED = new StateMachine.Event("onFirstRowLoaded");
    final StateMachine.Event EVT_ENTER_TRANSIITON_DONE = new StateMachine.Event("onEnterTransitionDone");
    final StateMachine.Event EVT_SWITCH_TO_VIDEO = new StateMachine.Event("switchToVideo");
    TransitionListener mEnterTransitionListener = new TransitionListener() { // from class: androidx.leanback.app.DetailsFragment.7
        @Override // androidx.leanback.transition.TransitionListener
        public void onTransitionCancel(Object obj) {
            DetailsFragment detailsFragment = DetailsFragment.this;
            detailsFragment.mStateMachine.fireEvent(detailsFragment.EVT_ENTER_TRANSIITON_DONE);
        }

        @Override // androidx.leanback.transition.TransitionListener
        public void onTransitionEnd(Object obj) {
            DetailsFragment detailsFragment = DetailsFragment.this;
            detailsFragment.mStateMachine.fireEvent(detailsFragment.EVT_ENTER_TRANSIITON_DONE);
        }

        @Override // androidx.leanback.transition.TransitionListener
        public void onTransitionStart(Object obj) {
            WaitEnterTransitionTimeout waitEnterTransitionTimeout = DetailsFragment.this.mWaitEnterTransitionTimeout;
            if (waitEnterTransitionTimeout != null) {
                waitEnterTransitionTimeout.mRef.clear();
            }
        }
    };
    TransitionListener mReturnTransitionListener = new TransitionListener() { // from class: androidx.leanback.app.DetailsFragment.8
        @Override // androidx.leanback.transition.TransitionListener
        public void onTransitionStart(Object obj) {
            DetailsFragment.this.onReturnTransitionStart();
        }
    };
    boolean mPendingFocusOnVideo = false;
    final SetSelectionRunnable mSetSelectionRunnable = new SetSelectionRunnable();
    final BaseOnItemViewSelectedListener<Object> mOnItemViewSelectedListener = new BaseOnItemViewSelectedListener<Object>() { // from class: androidx.leanback.app.DetailsFragment.9
        @Override // androidx.leanback.widget.BaseOnItemViewSelectedListener
        public void onItemSelected(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Object obj2) {
            DetailsFragment.this.onRowSelected(DetailsFragment.this.mRowsFragment.getVerticalGridView().getSelectedPosition(), DetailsFragment.this.mRowsFragment.getVerticalGridView().getSelectedSubPosition());
            BaseOnItemViewSelectedListener baseOnItemViewSelectedListener = DetailsFragment.this.mExternalOnItemViewSelectedListener;
            if (baseOnItemViewSelectedListener != null) {
                baseOnItemViewSelectedListener.onItemSelected(viewHolder, obj, viewHolder2, obj2);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class SetSelectionRunnable implements Runnable {
        int mPosition;
        boolean mSmooth = true;

        SetSelectionRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RowsFragment rowsFragment = DetailsFragment.this.mRowsFragment;
            if (rowsFragment == null) {
                return;
            }
            rowsFragment.setSelectedPosition(this.mPosition, this.mSmooth);
        }
    }

    /* loaded from: classes3.dex */
    static class WaitEnterTransitionTimeout implements Runnable {
        static final long WAIT_ENTERTRANSITION_START = 200;
        final WeakReference<DetailsFragment> mRef;

        WaitEnterTransitionTimeout(DetailsFragment detailsFragment) {
            this.mRef = new WeakReference<>(detailsFragment);
            detailsFragment.getView().postDelayed(this, WAIT_ENTERTRANSITION_START);
        }

        @Override // java.lang.Runnable
        public void run() {
            DetailsFragment detailsFragment = this.mRef.get();
            if (detailsFragment != null) {
                detailsFragment.mStateMachine.fireEvent(detailsFragment.EVT_ENTER_TRANSIITON_DONE);
            }
        }
    }

    public DetailsFragment() {
        boolean z8 = false;
        this.STATE_SWITCH_TO_VIDEO_IN_ON_CREATE = new StateMachine.State("STATE_SWITCH_TO_VIDEO_IN_ON_CREATE", z8, z8) { // from class: androidx.leanback.app.DetailsFragment.2
            @Override // androidx.leanback.util.StateMachine.State
            public void run() {
                DetailsFragment.this.switchToVideoBeforeVideoFragmentCreated();
            }
        };
        this.STATE_ENTER_TRANSITION_CANCEL = new StateMachine.State("STATE_ENTER_TRANSITION_CANCEL", z8, z8) { // from class: androidx.leanback.app.DetailsFragment.3
            @Override // androidx.leanback.util.StateMachine.State
            public void run() {
                WaitEnterTransitionTimeout waitEnterTransitionTimeout = DetailsFragment.this.mWaitEnterTransitionTimeout;
                if (waitEnterTransitionTimeout != null) {
                    waitEnterTransitionTimeout.mRef.clear();
                }
                if (DetailsFragment.this.getActivity() != null) {
                    Window window = DetailsFragment.this.getActivity().getWindow();
                    Object returnTransition = TransitionHelper.getReturnTransition(window);
                    Object sharedElementReturnTransition = TransitionHelper.getSharedElementReturnTransition(window);
                    TransitionHelper.setEnterTransition(window, (Object) null);
                    TransitionHelper.setSharedElementEnterTransition(window, (Object) null);
                    TransitionHelper.setReturnTransition(window, returnTransition);
                    TransitionHelper.setSharedElementReturnTransition(window, sharedElementReturnTransition);
                }
            }
        };
        String str = "STATE_ENTER_TRANSITION_PENDING";
        this.STATE_ENTER_TRANSITION_ADDLISTENER = new StateMachine.State(str) { // from class: androidx.leanback.app.DetailsFragment.4
            @Override // androidx.leanback.util.StateMachine.State
            public void run() {
                TransitionHelper.addTransitionListener(TransitionHelper.getEnterTransition(DetailsFragment.this.getActivity().getWindow()), DetailsFragment.this.mEnterTransitionListener);
            }
        };
        this.STATE_ENTER_TRANSITION_PENDING = new StateMachine.State(str) { // from class: androidx.leanback.app.DetailsFragment.5
            @Override // androidx.leanback.util.StateMachine.State
            public void run() {
                DetailsFragment detailsFragment = DetailsFragment.this;
                if (detailsFragment.mWaitEnterTransitionTimeout == null) {
                    new WaitEnterTransitionTimeout(detailsFragment);
                }
            }
        };
    }

    private void setupChildFragmentLayout() {
        setVerticalGridViewLayout(this.mRowsFragment.getVerticalGridView());
    }

    @Override // androidx.leanback.app.BaseFragment
    protected Object createEntranceTransition() {
        return TransitionHelper.loadTransition(FragmentUtil.getContext(this), R.transition.lb_details_enter_transition);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.leanback.app.BaseFragment
    public void createStateMachineStates() {
        super.createStateMachineStates();
        this.mStateMachine.addState(this.STATE_SET_ENTRANCE_START_STATE);
        this.mStateMachine.addState(this.STATE_ON_SAFE_START);
        this.mStateMachine.addState(this.STATE_SWITCH_TO_VIDEO_IN_ON_CREATE);
        this.mStateMachine.addState(this.STATE_ENTER_TRANSITION_INIT);
        this.mStateMachine.addState(this.STATE_ENTER_TRANSITION_ADDLISTENER);
        this.mStateMachine.addState(this.STATE_ENTER_TRANSITION_CANCEL);
        this.mStateMachine.addState(this.STATE_ENTER_TRANSITION_PENDING);
        this.mStateMachine.addState(this.STATE_ENTER_TRANSITION_COMPLETE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.leanback.app.BaseFragment
    public void createStateMachineTransitions() {
        super.createStateMachineTransitions();
        this.mStateMachine.addTransition(this.STATE_START, this.STATE_ENTER_TRANSITION_INIT, this.EVT_ON_CREATE);
        this.mStateMachine.addTransition(this.STATE_ENTER_TRANSITION_INIT, this.STATE_ENTER_TRANSITION_COMPLETE, this.COND_TRANSITION_NOT_SUPPORTED);
        this.mStateMachine.addTransition(this.STATE_ENTER_TRANSITION_INIT, this.STATE_ENTER_TRANSITION_COMPLETE, this.EVT_NO_ENTER_TRANSITION);
        this.mStateMachine.addTransition(this.STATE_ENTER_TRANSITION_INIT, this.STATE_ENTER_TRANSITION_CANCEL, this.EVT_SWITCH_TO_VIDEO);
        this.mStateMachine.addTransition(this.STATE_ENTER_TRANSITION_CANCEL, this.STATE_ENTER_TRANSITION_COMPLETE);
        this.mStateMachine.addTransition(this.STATE_ENTER_TRANSITION_INIT, this.STATE_ENTER_TRANSITION_ADDLISTENER, this.EVT_ON_CREATEVIEW);
        this.mStateMachine.addTransition(this.STATE_ENTER_TRANSITION_ADDLISTENER, this.STATE_ENTER_TRANSITION_COMPLETE, this.EVT_ENTER_TRANSIITON_DONE);
        this.mStateMachine.addTransition(this.STATE_ENTER_TRANSITION_ADDLISTENER, this.STATE_ENTER_TRANSITION_PENDING, this.EVT_DETAILS_ROW_LOADED);
        this.mStateMachine.addTransition(this.STATE_ENTER_TRANSITION_PENDING, this.STATE_ENTER_TRANSITION_COMPLETE, this.EVT_ENTER_TRANSIITON_DONE);
        this.mStateMachine.addTransition(this.STATE_ENTER_TRANSITION_COMPLETE, this.STATE_ENTRANCE_PERFORM);
        this.mStateMachine.addTransition(this.STATE_ENTRANCE_INIT, this.STATE_SWITCH_TO_VIDEO_IN_ON_CREATE, this.EVT_SWITCH_TO_VIDEO);
        this.mStateMachine.addTransition(this.STATE_SWITCH_TO_VIDEO_IN_ON_CREATE, this.STATE_ENTRANCE_COMPLETE);
        this.mStateMachine.addTransition(this.STATE_ENTRANCE_COMPLETE, this.STATE_SWITCH_TO_VIDEO_IN_ON_CREATE, this.EVT_SWITCH_TO_VIDEO);
        this.mStateMachine.addTransition(this.STATE_ENTRANCE_ON_PREPARED, this.STATE_SET_ENTRANCE_START_STATE, this.EVT_ONSTART);
        this.mStateMachine.addTransition(this.STATE_START, this.STATE_ON_SAFE_START, this.EVT_ONSTART);
        this.mStateMachine.addTransition(this.STATE_ENTRANCE_COMPLETE, this.STATE_ON_SAFE_START);
        this.mStateMachine.addTransition(this.STATE_ENTER_TRANSITION_COMPLETE, this.STATE_ON_SAFE_START);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Fragment findOrCreateVideoFragment() {
        Fragment fragment = this.mVideoFragment;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        int i8 = R.id.video_surface_container;
        Fragment findFragmentById = childFragmentManager.findFragmentById(i8);
        if (findFragmentById == null && this.mDetailsBackgroundController != null) {
            FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
            Fragment onCreateVideoFragment = this.mDetailsBackgroundController.onCreateVideoFragment();
            beginTransaction.add(i8, onCreateVideoFragment);
            beginTransaction.commit();
            if (this.mPendingFocusOnVideo) {
                getView().post(new Runnable() { // from class: androidx.leanback.app.DetailsFragment.12
                    @Override // java.lang.Runnable
                    public void run() {
                        if (DetailsFragment.this.getView() != null) {
                            DetailsFragment.this.switchToVideo();
                        }
                        DetailsFragment.this.mPendingFocusOnVideo = false;
                    }
                });
            }
            findFragmentById = onCreateVideoFragment;
        }
        this.mVideoFragment = findFragmentById;
        return findFragmentById;
    }

    public ObjectAdapter getAdapter() {
        return this.mAdapter;
    }

    public BaseOnItemViewClickedListener getOnItemViewClickedListener() {
        return this.mOnItemViewClickedListener;
    }

    public DetailsParallax getParallax() {
        if (this.mDetailsParallax == null) {
            this.mDetailsParallax = new DetailsParallax();
            RowsFragment rowsFragment = this.mRowsFragment;
            if (rowsFragment != null && rowsFragment.getView() != null) {
                this.mDetailsParallax.setRecyclerView(this.mRowsFragment.getVerticalGridView());
            }
        }
        return this.mDetailsParallax;
    }

    public RowsFragment getRowsFragment() {
        return this.mRowsFragment;
    }

    VerticalGridView getVerticalGridView() {
        RowsFragment rowsFragment = this.mRowsFragment;
        if (rowsFragment == null) {
            return null;
        }
        return rowsFragment.getVerticalGridView();
    }

    @Deprecated
    protected View inflateTitle(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onInflateTitleView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.leanback.app.BaseFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mContainerListAlignTop = getResources().getDimensionPixelSize(R.dimen.lb_details_rows_align_top);
        Activity activity = getActivity();
        if (activity != null) {
            if (TransitionHelper.getEnterTransition(activity.getWindow()) == null) {
                this.mStateMachine.fireEvent(this.EVT_NO_ENTER_TRANSITION);
            }
            Object returnTransition = TransitionHelper.getReturnTransition(activity.getWindow());
            if (returnTransition != null) {
                TransitionHelper.addTransitionListener(returnTransition, this.mReturnTransitionListener);
                return;
            }
            return;
        }
        this.mStateMachine.fireEvent(this.EVT_NO_ENTER_TRANSITION);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        BrowseFrameLayout browseFrameLayout = (BrowseFrameLayout) layoutInflater.inflate(R.layout.lb_details_fragment, viewGroup, false);
        this.mRootView = browseFrameLayout;
        View findViewById = browseFrameLayout.findViewById(R.id.details_background_view);
        this.mBackgroundView = findViewById;
        if (findViewById != null) {
            findViewById.setBackground(this.mBackgroundDrawable);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        int i8 = R.id.details_rows_dock;
        RowsFragment rowsFragment = (RowsFragment) childFragmentManager.findFragmentById(i8);
        this.mRowsFragment = rowsFragment;
        if (rowsFragment == null) {
            this.mRowsFragment = new RowsFragment();
            getChildFragmentManager().beginTransaction().replace(i8, this.mRowsFragment).commit();
        }
        installTitleView(layoutInflater, this.mRootView, bundle);
        this.mRowsFragment.setAdapter(this.mAdapter);
        this.mRowsFragment.setOnItemViewSelectedListener(this.mOnItemViewSelectedListener);
        this.mRowsFragment.setOnItemViewClickedListener(this.mOnItemViewClickedListener);
        this.mSceneAfterEntranceTransition = TransitionHelper.createScene(this.mRootView, new Runnable() { // from class: androidx.leanback.app.DetailsFragment.10
            @Override // java.lang.Runnable
            public void run() {
                DetailsFragment.this.mRowsFragment.setEntranceTransitionState(true);
            }
        });
        setupDpadNavigation();
        this.mRowsFragment.setExternalAdapterListener(new ItemBridgeAdapter.AdapterListener() { // from class: androidx.leanback.app.DetailsFragment.11
            @Override // androidx.leanback.widget.ItemBridgeAdapter.AdapterListener
            public void onCreate(ItemBridgeAdapter.ViewHolder viewHolder) {
                if (DetailsFragment.this.mDetailsParallax != null && (viewHolder.getViewHolder() instanceof FullWidthDetailsOverviewRowPresenter.ViewHolder)) {
                    ((FullWidthDetailsOverviewRowPresenter.ViewHolder) viewHolder.getViewHolder()).getOverviewView().setTag(R.id.lb_parallax_source, DetailsFragment.this.mDetailsParallax);
                }
            }
        });
        return this.mRootView;
    }

    @Override // androidx.leanback.app.BaseFragment
    protected void onEntranceTransitionEnd() {
        this.mRowsFragment.onTransitionEnd();
    }

    @Override // androidx.leanback.app.BaseFragment
    protected void onEntranceTransitionPrepare() {
        this.mRowsFragment.onTransitionPrepare();
    }

    @Override // androidx.leanback.app.BaseFragment
    protected void onEntranceTransitionStart() {
        this.mRowsFragment.onTransitionStart();
    }

    @Override // androidx.leanback.app.BrandedFragment
    public View onInflateTitleView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return inflateTitle(layoutInflater, viewGroup, bundle);
    }

    @CallSuper
    void onReturnTransitionStart() {
        DetailsFragmentBackgroundController detailsFragmentBackgroundController = this.mDetailsBackgroundController;
        if (detailsFragmentBackgroundController != null && !detailsFragmentBackgroundController.disableVideoParallax() && this.mVideoFragment != null) {
            FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
            beginTransaction.remove(this.mVideoFragment);
            beginTransaction.commit();
            this.mVideoFragment = null;
        }
    }

    void onRowSelected(int i8, int i9) {
        ObjectAdapter adapter = getAdapter();
        RowsFragment rowsFragment = this.mRowsFragment;
        if (rowsFragment != null && rowsFragment.getView() != null && this.mRowsFragment.getView().hasFocus() && !this.mPendingFocusOnVideo && (adapter == null || adapter.size() == 0 || (getVerticalGridView().getSelectedPosition() == 0 && getVerticalGridView().getSelectedSubPosition() == 0))) {
            showTitle(true);
        } else {
            showTitle(false);
        }
        if (adapter != null && adapter.size() > i8) {
            VerticalGridView verticalGridView = getVerticalGridView();
            int childCount = verticalGridView.getChildCount();
            if (childCount > 0) {
                this.mStateMachine.fireEvent(this.EVT_DETAILS_ROW_LOADED);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                ItemBridgeAdapter.ViewHolder viewHolder = (ItemBridgeAdapter.ViewHolder) verticalGridView.getChildViewHolder(verticalGridView.getChildAt(i10));
                RowPresenter rowPresenter = (RowPresenter) viewHolder.getPresenter();
                onSetRowStatus(rowPresenter, rowPresenter.getRowViewHolder(viewHolder.getViewHolder()), viewHolder.getAdapterPosition(), i8, i9);
            }
        }
    }

    @CallSuper
    void onSafeStart() {
        DetailsFragmentBackgroundController detailsFragmentBackgroundController = this.mDetailsBackgroundController;
        if (detailsFragmentBackgroundController != null) {
            detailsFragmentBackgroundController.onStart();
        }
    }

    protected void onSetDetailsOverviewRowStatus(FullWidthDetailsOverviewRowPresenter fullWidthDetailsOverviewRowPresenter, FullWidthDetailsOverviewRowPresenter.ViewHolder viewHolder, int i8, int i9, int i10) {
        if (i9 > i8) {
            fullWidthDetailsOverviewRowPresenter.setState(viewHolder, 0);
            return;
        }
        if (i9 == i8 && i10 == 1) {
            fullWidthDetailsOverviewRowPresenter.setState(viewHolder, 0);
        } else if (i9 == i8 && i10 == 0) {
            fullWidthDetailsOverviewRowPresenter.setState(viewHolder, 1);
        } else {
            fullWidthDetailsOverviewRowPresenter.setState(viewHolder, 2);
        }
    }

    protected void onSetRowStatus(RowPresenter rowPresenter, RowPresenter.ViewHolder viewHolder, int i8, int i9, int i10) {
        if (rowPresenter instanceof FullWidthDetailsOverviewRowPresenter) {
            onSetDetailsOverviewRowStatus((FullWidthDetailsOverviewRowPresenter) rowPresenter, (FullWidthDetailsOverviewRowPresenter.ViewHolder) viewHolder, i8, i9, i10);
        }
    }

    @Override // androidx.leanback.app.BrandedFragment, android.app.Fragment
    public void onStart() {
        super.onStart();
        setupChildFragmentLayout();
        this.mStateMachine.fireEvent(this.EVT_ONSTART);
        DetailsParallax detailsParallax = this.mDetailsParallax;
        if (detailsParallax != null) {
            detailsParallax.setRecyclerView(this.mRowsFragment.getVerticalGridView());
        }
        if (this.mPendingFocusOnVideo) {
            slideOutGridView();
        } else if (!getView().hasFocus()) {
            this.mRowsFragment.getVerticalGridView().requestFocus();
        }
    }

    @Override // android.app.Fragment
    public void onStop() {
        DetailsFragmentBackgroundController detailsFragmentBackgroundController = this.mDetailsBackgroundController;
        if (detailsFragmentBackgroundController != null) {
            detailsFragmentBackgroundController.onStop();
        }
        super.onStop();
    }

    @Override // androidx.leanback.app.BaseFragment
    protected void runEntranceTransition(Object obj) {
        TransitionHelper.runTransition(this.mSceneAfterEntranceTransition, obj);
    }

    public void setAdapter(ObjectAdapter objectAdapter) {
        this.mAdapter = objectAdapter;
        Presenter[] presenters = objectAdapter.getPresenterSelector().getPresenters();
        if (presenters != null) {
            for (Presenter presenter : presenters) {
                setupPresenter(presenter);
            }
        } else {
            Log.e(TAG, "PresenterSelector.getPresenters() not implemented");
        }
        RowsFragment rowsFragment = this.mRowsFragment;
        if (rowsFragment != null) {
            rowsFragment.setAdapter(objectAdapter);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBackgroundDrawable(Drawable drawable) {
        View view = this.mBackgroundView;
        if (view != null) {
            view.setBackground(drawable);
        }
        this.mBackgroundDrawable = drawable;
    }

    public void setOnItemViewClickedListener(BaseOnItemViewClickedListener baseOnItemViewClickedListener) {
        if (this.mOnItemViewClickedListener != baseOnItemViewClickedListener) {
            this.mOnItemViewClickedListener = baseOnItemViewClickedListener;
            RowsFragment rowsFragment = this.mRowsFragment;
            if (rowsFragment != null) {
                rowsFragment.setOnItemViewClickedListener(baseOnItemViewClickedListener);
            }
        }
    }

    public void setOnItemViewSelectedListener(BaseOnItemViewSelectedListener baseOnItemViewSelectedListener) {
        this.mExternalOnItemViewSelectedListener = baseOnItemViewSelectedListener;
    }

    public void setSelectedPosition(int i8) {
        setSelectedPosition(i8, true);
    }

    void setVerticalGridViewLayout(VerticalGridView verticalGridView) {
        verticalGridView.setItemAlignmentOffset(-this.mContainerListAlignTop);
        verticalGridView.setItemAlignmentOffsetPercent(-1.0f);
        verticalGridView.setWindowAlignmentOffset(0);
        verticalGridView.setWindowAlignmentOffsetPercent(-1.0f);
        verticalGridView.setWindowAlignment(0);
    }

    protected void setupDetailsOverviewRowPresenter(FullWidthDetailsOverviewRowPresenter fullWidthDetailsOverviewRowPresenter) {
        ItemAlignmentFacet itemAlignmentFacet = new ItemAlignmentFacet();
        ItemAlignmentFacet.ItemAlignmentDef itemAlignmentDef = new ItemAlignmentFacet.ItemAlignmentDef();
        int i8 = R.id.details_frame;
        itemAlignmentDef.setItemAlignmentViewId(i8);
        itemAlignmentDef.setItemAlignmentOffset(-getResources().getDimensionPixelSize(R.dimen.lb_details_v2_align_pos_for_actions));
        itemAlignmentDef.setItemAlignmentOffsetPercent(0.0f);
        ItemAlignmentFacet.ItemAlignmentDef itemAlignmentDef2 = new ItemAlignmentFacet.ItemAlignmentDef();
        itemAlignmentDef2.setItemAlignmentViewId(i8);
        itemAlignmentDef2.setItemAlignmentFocusViewId(R.id.details_overview_description);
        itemAlignmentDef2.setItemAlignmentOffset(-getResources().getDimensionPixelSize(R.dimen.lb_details_v2_align_pos_for_description));
        itemAlignmentDef2.setItemAlignmentOffsetPercent(0.0f);
        itemAlignmentFacet.setAlignmentDefs(new ItemAlignmentFacet.ItemAlignmentDef[]{itemAlignmentDef, itemAlignmentDef2});
        fullWidthDetailsOverviewRowPresenter.setFacet(ItemAlignmentFacet.class, itemAlignmentFacet);
    }

    void setupDpadNavigation() {
        this.mRootView.setOnChildFocusListener(new BrowseFrameLayout.OnChildFocusListener() { // from class: androidx.leanback.app.DetailsFragment.13
            @Override // androidx.leanback.widget.BrowseFrameLayout.OnChildFocusListener
            public void onRequestChildFocus(View view, View view2) {
                if (view != DetailsFragment.this.mRootView.getFocusedChild()) {
                    if (view.getId() == R.id.details_fragment_root) {
                        DetailsFragment detailsFragment = DetailsFragment.this;
                        if (!detailsFragment.mPendingFocusOnVideo) {
                            detailsFragment.slideInGridView();
                            DetailsFragment.this.showTitle(true);
                            return;
                        }
                        return;
                    }
                    if (view.getId() == R.id.video_surface_container) {
                        DetailsFragment.this.slideOutGridView();
                        DetailsFragment.this.showTitle(false);
                    } else {
                        DetailsFragment.this.showTitle(true);
                    }
                }
            }

            @Override // androidx.leanback.widget.BrowseFrameLayout.OnChildFocusListener
            public boolean onRequestFocusInDescendants(int i8, Rect rect) {
                return false;
            }
        });
        this.mRootView.setOnFocusSearchListener(new BrowseFrameLayout.OnFocusSearchListener() { // from class: androidx.leanback.app.DetailsFragment.14
            @Override // androidx.leanback.widget.BrowseFrameLayout.OnFocusSearchListener
            public View onFocusSearch(View view, int i8) {
                Fragment fragment;
                if (DetailsFragment.this.mRowsFragment.getVerticalGridView() != null && DetailsFragment.this.mRowsFragment.getVerticalGridView().hasFocus()) {
                    if (i8 == 33) {
                        DetailsFragmentBackgroundController detailsFragmentBackgroundController = DetailsFragment.this.mDetailsBackgroundController;
                        if (detailsFragmentBackgroundController != null && detailsFragmentBackgroundController.canNavigateToVideoFragment() && (fragment = DetailsFragment.this.mVideoFragment) != null && fragment.getView() != null) {
                            return DetailsFragment.this.mVideoFragment.getView();
                        }
                        if (DetailsFragment.this.getTitleView() != null && DetailsFragment.this.getTitleView().hasFocusable()) {
                            return DetailsFragment.this.getTitleView();
                        }
                        return view;
                    }
                    return view;
                }
                if (DetailsFragment.this.getTitleView() != null && DetailsFragment.this.getTitleView().hasFocus() && i8 == 130 && DetailsFragment.this.mRowsFragment.getVerticalGridView() != null) {
                    return DetailsFragment.this.mRowsFragment.getVerticalGridView();
                }
                return view;
            }
        });
        this.mRootView.setOnDispatchKeyListener(new View.OnKeyListener() { // from class: androidx.leanback.app.DetailsFragment.15
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i8, KeyEvent keyEvent) {
                Fragment fragment = DetailsFragment.this.mVideoFragment;
                if (fragment != null && fragment.getView() != null && DetailsFragment.this.mVideoFragment.getView().hasFocus()) {
                    if ((i8 == 4 || i8 == 111) && DetailsFragment.this.getVerticalGridView().getChildCount() > 0) {
                        DetailsFragment.this.getVerticalGridView().requestFocus();
                        return true;
                    }
                    return false;
                }
                return false;
            }
        });
    }

    protected void setupPresenter(Presenter presenter) {
        if (presenter instanceof FullWidthDetailsOverviewRowPresenter) {
            setupDetailsOverviewRowPresenter((FullWidthDetailsOverviewRowPresenter) presenter);
        }
    }

    void slideInGridView() {
        if (getVerticalGridView() != null) {
            getVerticalGridView().animateIn();
        }
    }

    void slideOutGridView() {
        if (getVerticalGridView() != null) {
            getVerticalGridView().animateOut();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void switchToRows() {
        this.mPendingFocusOnVideo = false;
        VerticalGridView verticalGridView = getVerticalGridView();
        if (verticalGridView != null && verticalGridView.getChildCount() > 0) {
            verticalGridView.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void switchToVideo() {
        Fragment fragment = this.mVideoFragment;
        if (fragment != null && fragment.getView() != null) {
            this.mVideoFragment.getView().requestFocus();
        } else {
            this.mStateMachine.fireEvent(this.EVT_SWITCH_TO_VIDEO);
        }
    }

    void switchToVideoBeforeVideoFragmentCreated() {
        this.mDetailsBackgroundController.switchToVideoBeforeCreate();
        showTitle(false);
        this.mPendingFocusOnVideo = true;
        slideOutGridView();
    }

    public void setSelectedPosition(int i8, boolean z8) {
        SetSelectionRunnable setSelectionRunnable = this.mSetSelectionRunnable;
        setSelectionRunnable.mPosition = i8;
        setSelectionRunnable.mSmooth = z8;
        if (getView() == null || getView().getHandler() == null) {
            return;
        }
        getView().getHandler().post(this.mSetSelectionRunnable);
    }
}
