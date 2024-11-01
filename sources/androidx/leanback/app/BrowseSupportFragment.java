package androidx.leanback.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.activity.result.ActivityResultCaller;
import androidx.annotation.ColorInt;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.t;
import androidx.leanback.R;
import androidx.leanback.app.HeadersSupportFragment;
import androidx.leanback.transition.TransitionHelper;
import androidx.leanback.transition.TransitionListener;
import androidx.leanback.util.StateMachine;
import androidx.leanback.widget.BrowseFrameLayout;
import androidx.leanback.widget.InvisibleRowPresenter;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ObjectAdapter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.OnItemViewSelectedListener;
import androidx.leanback.widget.PageRow;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.PresenterSelector;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowHeaderPresenter;
import androidx.leanback.widget.RowPresenter;
import androidx.leanback.widget.ScaleFrameLayout;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class BrowseSupportFragment extends BaseSupportFragment {
    private static final String CURRENT_SELECTED_POSITION = "currentSelectedPosition";
    static final boolean DEBUG = false;
    public static final int HEADERS_DISABLED = 3;
    public static final int HEADERS_ENABLED = 1;
    public static final int HEADERS_HIDDEN = 2;
    static final String HEADER_SHOW = "headerShow";
    static final String HEADER_STACK_INDEX = "headerStackIndex";
    private static final String IS_PAGE_ROW = "isPageRow";
    private static final String LB_HEADERS_BACKSTACK = "lbHeadersBackStack_";
    static final String TAG = "BrowseSupportFragment";
    private ObjectAdapter mAdapter;
    private PresenterSelector mAdapterPresenter;
    BackStackListener mBackStackChangedListener;
    private boolean mBrandColorSet;
    BrowseFrameLayout mBrowseFrame;
    BrowseTransitionListener mBrowseTransitionListener;
    private int mContainerListAlignTop;
    private int mContainerListMarginStart;
    OnItemViewSelectedListener mExternalOnItemViewSelectedListener;
    private PresenterSelector mHeaderPresenterSelector;
    HeadersSupportFragment mHeadersSupportFragment;
    Object mHeadersTransition;
    boolean mIsPageRow;
    Fragment mMainFragment;
    MainFragmentAdapter mMainFragmentAdapter;
    ListRowDataAdapter mMainFragmentListRowDataAdapter;
    MainFragmentRowsAdapter mMainFragmentRowsAdapter;
    private OnItemViewClickedListener mOnItemViewClickedListener;
    Object mPageRow;
    private float mScaleFactor;
    private ScaleFrameLayout mScaleFrameLayout;
    private Object mSceneAfterEntranceTransition;
    Object mSceneWithHeaders;
    Object mSceneWithoutHeaders;
    String mWithHeadersBackStackName;
    private static final String ARG_TITLE = BrowseSupportFragment.class.getCanonicalName() + ".title";
    private static final String ARG_HEADERS_STATE = BrowseSupportFragment.class.getCanonicalName() + ".headersState";
    final StateMachine.State STATE_SET_ENTRANCE_START_STATE = new StateMachine.State("SET_ENTRANCE_START_STATE") { // from class: androidx.leanback.app.BrowseSupportFragment.1
        @Override // androidx.leanback.util.StateMachine.State
        public void run() {
            BrowseSupportFragment.this.setEntranceTransitionStartState();
        }
    };
    final StateMachine.Event EVT_HEADER_VIEW_CREATED = new StateMachine.Event("headerFragmentViewCreated");
    final StateMachine.Event EVT_MAIN_FRAGMENT_VIEW_CREATED = new StateMachine.Event("mainFragmentViewCreated");
    final StateMachine.Event EVT_SCREEN_DATA_READY = new StateMachine.Event("screenDataReady");
    private MainFragmentAdapterRegistry mMainFragmentAdapterRegistry = new MainFragmentAdapterRegistry();
    private int mHeadersState = 1;
    private int mBrandColor = 0;
    boolean mHeadersBackStackEnabled = true;
    boolean mShowingHeaders = true;
    boolean mCanShowHeaders = true;
    private boolean mMainFragmentScaleEnabled = true;
    private int mSelectedPosition = -1;
    boolean mStopped = true;
    private final SetSelectionRunnable mSetSelectionRunnable = new SetSelectionRunnable();
    private final BrowseFrameLayout.OnFocusSearchListener mOnFocusSearchListener = new BrowseFrameLayout.OnFocusSearchListener() { // from class: androidx.leanback.app.BrowseSupportFragment.4
        @Override // androidx.leanback.widget.BrowseFrameLayout.OnFocusSearchListener
        public View onFocusSearch(View view, int i8) {
            int i9;
            BrowseSupportFragment browseSupportFragment = BrowseSupportFragment.this;
            if (browseSupportFragment.mCanShowHeaders && browseSupportFragment.isInHeadersTransition()) {
                return view;
            }
            if (BrowseSupportFragment.this.getTitleView() != null && view != BrowseSupportFragment.this.getTitleView() && i8 == 33) {
                return BrowseSupportFragment.this.getTitleView();
            }
            if (BrowseSupportFragment.this.getTitleView() != null && BrowseSupportFragment.this.getTitleView().hasFocus() && i8 == 130) {
                BrowseSupportFragment browseSupportFragment2 = BrowseSupportFragment.this;
                if (browseSupportFragment2.mCanShowHeaders && browseSupportFragment2.mShowingHeaders) {
                    return browseSupportFragment2.mHeadersSupportFragment.getVerticalGridView();
                }
                return browseSupportFragment2.mMainFragment.getView();
            }
            boolean z8 = true;
            if (ViewCompat.getLayoutDirection(view) != 1) {
                z8 = false;
            }
            int i10 = 17;
            if (z8) {
                i9 = 66;
            } else {
                i9 = 17;
            }
            if (!z8) {
                i10 = 66;
            }
            BrowseSupportFragment browseSupportFragment3 = BrowseSupportFragment.this;
            if (browseSupportFragment3.mCanShowHeaders && i8 == i9) {
                if (!browseSupportFragment3.isVerticalScrolling()) {
                    BrowseSupportFragment browseSupportFragment4 = BrowseSupportFragment.this;
                    if (!browseSupportFragment4.mShowingHeaders && browseSupportFragment4.isHeadersDataReady()) {
                        return BrowseSupportFragment.this.mHeadersSupportFragment.getVerticalGridView();
                    }
                    return view;
                }
                return view;
            }
            if (i8 == i10) {
                if (browseSupportFragment3.isVerticalScrolling()) {
                    return view;
                }
                Fragment fragment = BrowseSupportFragment.this.mMainFragment;
                if (fragment != null && fragment.getView() != null) {
                    return BrowseSupportFragment.this.mMainFragment.getView();
                }
                return view;
            }
            if (i8 == 130 && browseSupportFragment3.mShowingHeaders) {
                return view;
            }
            return null;
        }
    };
    private final BrowseFrameLayout.OnChildFocusListener mOnChildFocusListener = new BrowseFrameLayout.OnChildFocusListener() { // from class: androidx.leanback.app.BrowseSupportFragment.5
        @Override // androidx.leanback.widget.BrowseFrameLayout.OnChildFocusListener
        public void onRequestChildFocus(View view, View view2) {
            if (BrowseSupportFragment.this.getChildFragmentManager().isDestroyed()) {
                return;
            }
            BrowseSupportFragment browseSupportFragment = BrowseSupportFragment.this;
            if (browseSupportFragment.mCanShowHeaders && !browseSupportFragment.isInHeadersTransition()) {
                int id = view.getId();
                if (id == R.id.browse_container_dock) {
                    BrowseSupportFragment browseSupportFragment2 = BrowseSupportFragment.this;
                    if (browseSupportFragment2.mShowingHeaders) {
                        browseSupportFragment2.startHeadersTransitionInternal(false);
                        return;
                    }
                }
                if (id == R.id.browse_headers_dock) {
                    BrowseSupportFragment browseSupportFragment3 = BrowseSupportFragment.this;
                    if (!browseSupportFragment3.mShowingHeaders) {
                        browseSupportFragment3.startHeadersTransitionInternal(true);
                    }
                }
            }
        }

        @Override // androidx.leanback.widget.BrowseFrameLayout.OnChildFocusListener
        public boolean onRequestFocusInDescendants(int i8, Rect rect) {
            HeadersSupportFragment headersSupportFragment;
            if (BrowseSupportFragment.this.getChildFragmentManager().isDestroyed()) {
                return true;
            }
            BrowseSupportFragment browseSupportFragment = BrowseSupportFragment.this;
            if (browseSupportFragment.mCanShowHeaders && browseSupportFragment.mShowingHeaders && (headersSupportFragment = browseSupportFragment.mHeadersSupportFragment) != null && headersSupportFragment.getView() != null && BrowseSupportFragment.this.mHeadersSupportFragment.getView().requestFocus(i8, rect)) {
                return true;
            }
            Fragment fragment = BrowseSupportFragment.this.mMainFragment;
            if (fragment != null && fragment.getView() != null && BrowseSupportFragment.this.mMainFragment.getView().requestFocus(i8, rect)) {
                return true;
            }
            if (BrowseSupportFragment.this.getTitleView() != null && BrowseSupportFragment.this.getTitleView().requestFocus(i8, rect)) {
                return true;
            }
            return false;
        }
    };
    private HeadersSupportFragment.OnHeaderClickedListener mHeaderClickedListener = new HeadersSupportFragment.OnHeaderClickedListener() { // from class: androidx.leanback.app.BrowseSupportFragment.10
        @Override // androidx.leanback.app.HeadersSupportFragment.OnHeaderClickedListener
        public void onHeaderClicked(RowHeaderPresenter.ViewHolder viewHolder, Row row) {
            Fragment fragment;
            BrowseSupportFragment browseSupportFragment = BrowseSupportFragment.this;
            if (browseSupportFragment.mCanShowHeaders && browseSupportFragment.mShowingHeaders && !browseSupportFragment.isInHeadersTransition() && (fragment = BrowseSupportFragment.this.mMainFragment) != null && fragment.getView() != null) {
                BrowseSupportFragment.this.startHeadersTransitionInternal(false);
                BrowseSupportFragment.this.mMainFragment.getView().requestFocus();
            }
        }
    };
    private HeadersSupportFragment.OnHeaderViewSelectedListener mHeaderViewSelectedListener = new HeadersSupportFragment.OnHeaderViewSelectedListener() { // from class: androidx.leanback.app.BrowseSupportFragment.11
        @Override // androidx.leanback.app.HeadersSupportFragment.OnHeaderViewSelectedListener
        public void onHeaderSelected(RowHeaderPresenter.ViewHolder viewHolder, Row row) {
            int selectedPosition = BrowseSupportFragment.this.mHeadersSupportFragment.getSelectedPosition();
            BrowseSupportFragment browseSupportFragment = BrowseSupportFragment.this;
            if (browseSupportFragment.mShowingHeaders) {
                browseSupportFragment.onRowSelected(selectedPosition);
            }
        }
    };
    private final RecyclerView.OnScrollListener mWaitScrollFinishAndCommitMainFragment = new RecyclerView.OnScrollListener() { // from class: androidx.leanback.app.BrowseSupportFragment.12
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i8) {
            if (i8 == 0) {
                recyclerView.removeOnScrollListener(this);
                BrowseSupportFragment browseSupportFragment = BrowseSupportFragment.this;
                if (!browseSupportFragment.mStopped) {
                    browseSupportFragment.commitMainFragment();
                }
            }
        }
    };

    /* loaded from: classes3.dex */
    final class BackStackListener implements FragmentManager.OnBackStackChangedListener {
        int mIndexOfHeadersBackStack = -1;
        int mLastEntryCount;

        BackStackListener() {
            this.mLastEntryCount = BrowseSupportFragment.this.getFragmentManager().getBackStackEntryCount();
        }

        void load(Bundle bundle) {
            boolean z8;
            if (bundle != null) {
                int i8 = bundle.getInt(BrowseSupportFragment.HEADER_STACK_INDEX, -1);
                this.mIndexOfHeadersBackStack = i8;
                BrowseSupportFragment browseSupportFragment = BrowseSupportFragment.this;
                if (i8 == -1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                browseSupportFragment.mShowingHeaders = z8;
                return;
            }
            BrowseSupportFragment browseSupportFragment2 = BrowseSupportFragment.this;
            if (!browseSupportFragment2.mShowingHeaders) {
                browseSupportFragment2.getFragmentManager().beginTransaction().addToBackStack(BrowseSupportFragment.this.mWithHeadersBackStackName).commit();
            }
        }

        @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
        public /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z8) {
            t.a(this, fragment, z8);
        }

        @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
        public /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z8) {
            t.b(this, fragment, z8);
        }

        @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
        public void onBackStackChanged() {
            if (BrowseSupportFragment.this.getFragmentManager() == null) {
                Log.w(BrowseSupportFragment.TAG, "getFragmentManager() is null, stack:", new Exception());
                return;
            }
            int backStackEntryCount = BrowseSupportFragment.this.getFragmentManager().getBackStackEntryCount();
            int i8 = this.mLastEntryCount;
            if (backStackEntryCount > i8) {
                int i9 = backStackEntryCount - 1;
                if (BrowseSupportFragment.this.mWithHeadersBackStackName.equals(BrowseSupportFragment.this.getFragmentManager().getBackStackEntryAt(i9).getName())) {
                    this.mIndexOfHeadersBackStack = i9;
                }
            } else if (backStackEntryCount < i8 && this.mIndexOfHeadersBackStack >= backStackEntryCount) {
                if (!BrowseSupportFragment.this.isHeadersDataReady()) {
                    BrowseSupportFragment.this.getFragmentManager().beginTransaction().addToBackStack(BrowseSupportFragment.this.mWithHeadersBackStackName).commit();
                    return;
                }
                this.mIndexOfHeadersBackStack = -1;
                BrowseSupportFragment browseSupportFragment = BrowseSupportFragment.this;
                if (!browseSupportFragment.mShowingHeaders) {
                    browseSupportFragment.startHeadersTransitionInternal(true);
                }
            }
            this.mLastEntryCount = backStackEntryCount;
        }

        void save(Bundle bundle) {
            bundle.putInt(BrowseSupportFragment.HEADER_STACK_INDEX, this.mIndexOfHeadersBackStack);
        }
    }

    /* loaded from: classes3.dex */
    public static class BrowseTransitionListener {
        public void onHeadersTransitionStart(boolean z8) {
        }

        public void onHeadersTransitionStop(boolean z8) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class ExpandPreLayout implements ViewTreeObserver.OnPreDrawListener {
        static final int STATE_FIRST_DRAW = 1;
        static final int STATE_INIT = 0;
        static final int STATE_SECOND_DRAW = 2;
        private final Runnable mCallback;
        private int mState;
        private final View mView;
        private MainFragmentAdapter mainFragmentAdapter;

        ExpandPreLayout(Runnable runnable, MainFragmentAdapter mainFragmentAdapter, View view) {
            this.mView = view;
            this.mCallback = runnable;
            this.mainFragmentAdapter = mainFragmentAdapter;
        }

        void execute() {
            this.mView.getViewTreeObserver().addOnPreDrawListener(this);
            this.mainFragmentAdapter.setExpand(false);
            this.mView.invalidate();
            this.mState = 0;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (BrowseSupportFragment.this.getView() != null && BrowseSupportFragment.this.getContext() != null) {
                int i8 = this.mState;
                if (i8 == 0) {
                    this.mainFragmentAdapter.setExpand(true);
                    this.mView.invalidate();
                    this.mState = 1;
                    return false;
                }
                if (i8 == 1) {
                    this.mCallback.run();
                    this.mView.getViewTreeObserver().removeOnPreDrawListener(this);
                    this.mState = 2;
                    return false;
                }
                return false;
            }
            this.mView.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class FragmentFactory<T extends Fragment> {
        public abstract T createFragment(Object obj);
    }

    /* loaded from: classes3.dex */
    public interface FragmentHost {
        void notifyDataReady(MainFragmentAdapter mainFragmentAdapter);

        void notifyViewCreated(MainFragmentAdapter mainFragmentAdapter);

        void showTitleView(boolean z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class FragmentHostImpl implements FragmentHost {
        boolean mShowTitleView = true;

        FragmentHostImpl() {
        }

        @Override // androidx.leanback.app.BrowseSupportFragment.FragmentHost
        public void notifyDataReady(MainFragmentAdapter mainFragmentAdapter) {
            MainFragmentAdapter mainFragmentAdapter2 = BrowseSupportFragment.this.mMainFragmentAdapter;
            if (mainFragmentAdapter2 != null && mainFragmentAdapter2.getFragmentHost() == this) {
                BrowseSupportFragment browseSupportFragment = BrowseSupportFragment.this;
                if (!browseSupportFragment.mIsPageRow) {
                    return;
                }
                browseSupportFragment.mStateMachine.fireEvent(browseSupportFragment.EVT_SCREEN_DATA_READY);
            }
        }

        @Override // androidx.leanback.app.BrowseSupportFragment.FragmentHost
        public void notifyViewCreated(MainFragmentAdapter mainFragmentAdapter) {
            BrowseSupportFragment browseSupportFragment = BrowseSupportFragment.this;
            browseSupportFragment.mStateMachine.fireEvent(browseSupportFragment.EVT_MAIN_FRAGMENT_VIEW_CREATED);
            BrowseSupportFragment browseSupportFragment2 = BrowseSupportFragment.this;
            if (!browseSupportFragment2.mIsPageRow) {
                browseSupportFragment2.mStateMachine.fireEvent(browseSupportFragment2.EVT_SCREEN_DATA_READY);
            }
        }

        @Override // androidx.leanback.app.BrowseSupportFragment.FragmentHost
        public void showTitleView(boolean z8) {
            this.mShowTitleView = z8;
            MainFragmentAdapter mainFragmentAdapter = BrowseSupportFragment.this.mMainFragmentAdapter;
            if (mainFragmentAdapter != null && mainFragmentAdapter.getFragmentHost() == this) {
                BrowseSupportFragment browseSupportFragment = BrowseSupportFragment.this;
                if (!browseSupportFragment.mIsPageRow) {
                    return;
                }
                browseSupportFragment.updateTitleViewVisibility();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class ListRowFragmentFactory extends FragmentFactory<RowsSupportFragment> {
        @Override // androidx.leanback.app.BrowseSupportFragment.FragmentFactory
        public RowsSupportFragment createFragment(Object obj) {
            return new RowsSupportFragment();
        }
    }

    /* loaded from: classes3.dex */
    public static class MainFragmentAdapter<T extends Fragment> {
        private final T mFragment;
        FragmentHostImpl mFragmentHost;
        private boolean mScalingEnabled;

        public MainFragmentAdapter(T t8) {
            this.mFragment = t8;
        }

        public final T getFragment() {
            return this.mFragment;
        }

        public final FragmentHost getFragmentHost() {
            return this.mFragmentHost;
        }

        public boolean isScalingEnabled() {
            return this.mScalingEnabled;
        }

        public boolean isScrolling() {
            return false;
        }

        public void onTransitionEnd() {
        }

        public boolean onTransitionPrepare() {
            return false;
        }

        public void onTransitionStart() {
        }

        public void setAlignment(int i8) {
        }

        public void setEntranceTransitionState(boolean z8) {
        }

        public void setExpand(boolean z8) {
        }

        void setFragmentHost(FragmentHostImpl fragmentHostImpl) {
            this.mFragmentHost = fragmentHostImpl;
        }

        public void setScalingEnabled(boolean z8) {
            this.mScalingEnabled = z8;
        }
    }

    /* loaded from: classes3.dex */
    public interface MainFragmentAdapterProvider {
        MainFragmentAdapter getMainFragmentAdapter();
    }

    /* loaded from: classes3.dex */
    public static final class MainFragmentAdapterRegistry {
        private static final FragmentFactory sDefaultFragmentFactory = new ListRowFragmentFactory();
        private final Map<Class, FragmentFactory> mItemToFragmentFactoryMapping = new HashMap();

        public MainFragmentAdapterRegistry() {
            registerFragment(ListRow.class, sDefaultFragmentFactory);
        }

        public Fragment createFragment(Object obj) {
            FragmentFactory fragmentFactory;
            if (obj == null) {
                fragmentFactory = sDefaultFragmentFactory;
            } else {
                fragmentFactory = this.mItemToFragmentFactoryMapping.get(obj.getClass());
            }
            if (fragmentFactory == null && !(obj instanceof PageRow)) {
                fragmentFactory = sDefaultFragmentFactory;
            }
            return fragmentFactory.createFragment(obj);
        }

        public void registerFragment(Class cls, FragmentFactory fragmentFactory) {
            this.mItemToFragmentFactoryMapping.put(cls, fragmentFactory);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class MainFragmentItemViewSelectedListener implements OnItemViewSelectedListener {
        MainFragmentRowsAdapter mMainFragmentRowsAdapter;

        public MainFragmentItemViewSelectedListener(MainFragmentRowsAdapter mainFragmentRowsAdapter) {
            this.mMainFragmentRowsAdapter = mainFragmentRowsAdapter;
        }

        @Override // androidx.leanback.widget.BaseOnItemViewSelectedListener
        public void onItemSelected(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
            BrowseSupportFragment.this.onRowSelected(this.mMainFragmentRowsAdapter.getSelectedPosition());
            OnItemViewSelectedListener onItemViewSelectedListener = BrowseSupportFragment.this.mExternalOnItemViewSelectedListener;
            if (onItemViewSelectedListener != null) {
                onItemViewSelectedListener.onItemSelected(viewHolder, obj, viewHolder2, row);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class MainFragmentRowsAdapter<T extends Fragment> {
        private final T mFragment;

        public MainFragmentRowsAdapter(T t8) {
            if (t8 != null) {
                this.mFragment = t8;
                return;
            }
            throw new IllegalArgumentException("Fragment can't be null");
        }

        public RowPresenter.ViewHolder findRowViewHolderByPosition(int i8) {
            return null;
        }

        public final T getFragment() {
            return this.mFragment;
        }

        public int getSelectedPosition() {
            return 0;
        }

        public void setAdapter(ObjectAdapter objectAdapter) {
        }

        public void setOnItemViewClickedListener(OnItemViewClickedListener onItemViewClickedListener) {
        }

        public void setOnItemViewSelectedListener(OnItemViewSelectedListener onItemViewSelectedListener) {
        }

        public void setSelectedPosition(int i8, boolean z8) {
        }

        public void setSelectedPosition(int i8, boolean z8, Presenter.ViewHolderTask viewHolderTask) {
        }
    }

    /* loaded from: classes3.dex */
    public interface MainFragmentRowsAdapterProvider {
        MainFragmentRowsAdapter getMainFragmentRowsAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class SetSelectionRunnable implements Runnable {
        static final int TYPE_INTERNAL_SYNC = 0;
        static final int TYPE_INVALID = -1;
        static final int TYPE_USER_REQUEST = 1;
        private int mPosition;
        private boolean mSmooth;
        private int mType;

        SetSelectionRunnable() {
            reset();
        }

        private void reset() {
            this.mPosition = -1;
            this.mType = -1;
            this.mSmooth = false;
        }

        void post(int i8, int i9, boolean z8) {
            if (i9 >= this.mType) {
                this.mPosition = i8;
                this.mType = i9;
                this.mSmooth = z8;
                BrowseSupportFragment.this.mBrowseFrame.removeCallbacks(this);
                BrowseSupportFragment browseSupportFragment = BrowseSupportFragment.this;
                if (!browseSupportFragment.mStopped) {
                    browseSupportFragment.mBrowseFrame.post(this);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            BrowseSupportFragment.this.setSelection(this.mPosition, this.mSmooth);
            reset();
        }

        public void start() {
            if (this.mType != -1) {
                BrowseSupportFragment.this.mBrowseFrame.post(this);
            }
        }

        public void stop() {
            BrowseSupportFragment.this.mBrowseFrame.removeCallbacks(this);
        }
    }

    public static Bundle createArgs(Bundle bundle, String str, int i8) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString(ARG_TITLE, str);
        bundle.putInt(ARG_HEADERS_STATE, i8);
        return bundle;
    }

    private boolean createMainFragment(ObjectAdapter objectAdapter, int i8) {
        Object obj;
        boolean z8;
        boolean z9 = true;
        Object obj2 = null;
        if (!this.mCanShowHeaders) {
            obj = null;
        } else {
            if (objectAdapter == null || objectAdapter.size() == 0) {
                return false;
            }
            if (i8 < 0) {
                i8 = 0;
            } else if (i8 >= objectAdapter.size()) {
                throw new IllegalArgumentException(String.format("Invalid position %d requested", Integer.valueOf(i8)));
            }
            obj = objectAdapter.get(i8);
        }
        boolean z10 = this.mIsPageRow;
        Object obj3 = this.mPageRow;
        if (this.mCanShowHeaders && (obj instanceof PageRow)) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.mIsPageRow = z8;
        if (z8) {
            obj2 = obj;
        }
        this.mPageRow = obj2;
        if (this.mMainFragment != null) {
            if (z10) {
                if (z8 && (obj3 == null || obj3 == obj2)) {
                    z9 = false;
                }
            } else {
                z9 = z8;
            }
        }
        if (z9) {
            Fragment createFragment = this.mMainFragmentAdapterRegistry.createFragment(obj);
            this.mMainFragment = createFragment;
            if (createFragment instanceof MainFragmentAdapterProvider) {
                setMainFragmentAdapter();
            } else {
                throw new IllegalArgumentException("Fragment must implement MainFragmentAdapterProvider");
            }
        }
        return z9;
    }

    private void expandMainFragment(boolean z8) {
        int i8;
        float f8;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mScaleFrameLayout.getLayoutParams();
        if (!z8) {
            i8 = this.mContainerListMarginStart;
        } else {
            i8 = 0;
        }
        marginLayoutParams.setMarginStart(i8);
        this.mScaleFrameLayout.setLayoutParams(marginLayoutParams);
        this.mMainFragmentAdapter.setExpand(z8);
        setMainFragmentAlignment();
        if (!z8 && this.mMainFragmentScaleEnabled && this.mMainFragmentAdapter.isScalingEnabled()) {
            f8 = this.mScaleFactor;
        } else {
            f8 = 1.0f;
        }
        this.mScaleFrameLayout.setLayoutScaleY(f8);
        this.mScaleFrameLayout.setChildScale(f8);
    }

    private void onExpandTransitionStart(boolean z8, Runnable runnable) {
        if (z8) {
            runnable.run();
        } else {
            new ExpandPreLayout(runnable, this.mMainFragmentAdapter, getView()).execute();
        }
    }

    private void readArguments(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        String str = ARG_TITLE;
        if (bundle.containsKey(str)) {
            setTitle(bundle.getString(str));
        }
        String str2 = ARG_HEADERS_STATE;
        if (bundle.containsKey(str2)) {
            setHeadersState(bundle.getInt(str2));
        }
    }

    private void replaceMainFragment(int i8) {
        boolean z8;
        if (createMainFragment(this.mAdapter, i8)) {
            swapToMainFragment();
            if (this.mCanShowHeaders && this.mShowingHeaders) {
                z8 = false;
            } else {
                z8 = true;
            }
            expandMainFragment(z8);
        }
    }

    private void setHeadersOnScreen(boolean z8) {
        int i8;
        View view = this.mHeadersSupportFragment.getView();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (z8) {
            i8 = 0;
        } else {
            i8 = -this.mContainerListMarginStart;
        }
        marginLayoutParams.setMarginStart(i8);
        view.setLayoutParams(marginLayoutParams);
    }

    private void setMainFragmentAlignment() {
        int i8 = this.mContainerListAlignTop;
        if (this.mMainFragmentScaleEnabled && this.mMainFragmentAdapter.isScalingEnabled() && this.mShowingHeaders) {
            i8 = (int) ((i8 / this.mScaleFactor) + 0.5f);
        }
        this.mMainFragmentAdapter.setAlignment(i8);
    }

    private void swapToMainFragment() {
        if (this.mStopped) {
            return;
        }
        VerticalGridView verticalGridView = this.mHeadersSupportFragment.getVerticalGridView();
        if (isShowingHeaders() && verticalGridView != null && verticalGridView.getScrollState() != 0) {
            getChildFragmentManager().beginTransaction().replace(R.id.scale_frame, new Fragment()).commit();
            verticalGridView.removeOnScrollListener(this.mWaitScrollFinishAndCommitMainFragment);
            verticalGridView.addOnScrollListener(this.mWaitScrollFinishAndCommitMainFragment);
            return;
        }
        commitMainFragment();
    }

    private void updateWrapperPresenter() {
        ObjectAdapter objectAdapter = this.mAdapter;
        if (objectAdapter == null) {
            this.mAdapterPresenter = null;
            return;
        }
        final PresenterSelector presenterSelector = objectAdapter.getPresenterSelector();
        if (presenterSelector != null) {
            if (presenterSelector == this.mAdapterPresenter) {
                return;
            }
            this.mAdapterPresenter = presenterSelector;
            Presenter[] presenters = presenterSelector.getPresenters();
            final InvisibleRowPresenter invisibleRowPresenter = new InvisibleRowPresenter();
            int length = presenters.length;
            final Presenter[] presenterArr = new Presenter[length + 1];
            System.arraycopy(presenterArr, 0, presenters, 0, presenters.length);
            presenterArr[length] = invisibleRowPresenter;
            this.mAdapter.setPresenterSelector(new PresenterSelector() { // from class: androidx.leanback.app.BrowseSupportFragment.2
                @Override // androidx.leanback.widget.PresenterSelector
                public Presenter getPresenter(Object obj) {
                    if (((Row) obj).isRenderedAsRowView()) {
                        return presenterSelector.getPresenter(obj);
                    }
                    return invisibleRowPresenter;
                }

                @Override // androidx.leanback.widget.PresenterSelector
                public Presenter[] getPresenters() {
                    return presenterArr;
                }
            });
            return;
        }
        throw new IllegalArgumentException("Adapter.getPresenterSelector() is null");
    }

    final void commitMainFragment() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        int i8 = R.id.scale_frame;
        if (childFragmentManager.findFragmentById(i8) != this.mMainFragment) {
            childFragmentManager.beginTransaction().replace(i8, this.mMainFragment).commit();
        }
    }

    @Override // androidx.leanback.app.BaseSupportFragment
    protected Object createEntranceTransition() {
        return TransitionHelper.loadTransition(getContext(), R.transition.lb_browse_entrance_transition);
    }

    void createHeadersTransition() {
        int i8;
        Context context = getContext();
        if (this.mShowingHeaders) {
            i8 = R.transition.lb_browse_headers_in;
        } else {
            i8 = R.transition.lb_browse_headers_out;
        }
        Object loadTransition = TransitionHelper.loadTransition(context, i8);
        this.mHeadersTransition = loadTransition;
        TransitionHelper.addTransitionListener(loadTransition, new TransitionListener() { // from class: androidx.leanback.app.BrowseSupportFragment.9
            @Override // androidx.leanback.transition.TransitionListener
            public void onTransitionEnd(Object obj) {
                VerticalGridView verticalGridView;
                Fragment fragment;
                View view;
                BrowseSupportFragment browseSupportFragment = BrowseSupportFragment.this;
                browseSupportFragment.mHeadersTransition = null;
                MainFragmentAdapter mainFragmentAdapter = browseSupportFragment.mMainFragmentAdapter;
                if (mainFragmentAdapter != null) {
                    mainFragmentAdapter.onTransitionEnd();
                    BrowseSupportFragment browseSupportFragment2 = BrowseSupportFragment.this;
                    if (!browseSupportFragment2.mShowingHeaders && (fragment = browseSupportFragment2.mMainFragment) != null && (view = fragment.getView()) != null && !view.hasFocus()) {
                        view.requestFocus();
                    }
                }
                HeadersSupportFragment headersSupportFragment = BrowseSupportFragment.this.mHeadersSupportFragment;
                if (headersSupportFragment != null) {
                    headersSupportFragment.onTransitionEnd();
                    BrowseSupportFragment browseSupportFragment3 = BrowseSupportFragment.this;
                    if (browseSupportFragment3.mShowingHeaders && (verticalGridView = browseSupportFragment3.mHeadersSupportFragment.getVerticalGridView()) != null && !verticalGridView.hasFocus()) {
                        verticalGridView.requestFocus();
                    }
                }
                BrowseSupportFragment.this.updateTitleViewVisibility();
                BrowseSupportFragment browseSupportFragment4 = BrowseSupportFragment.this;
                BrowseTransitionListener browseTransitionListener = browseSupportFragment4.mBrowseTransitionListener;
                if (browseTransitionListener != null) {
                    browseTransitionListener.onHeadersTransitionStop(browseSupportFragment4.mShowingHeaders);
                }
            }

            @Override // androidx.leanback.transition.TransitionListener
            public void onTransitionStart(Object obj) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.leanback.app.BaseSupportFragment
    public void createStateMachineStates() {
        super.createStateMachineStates();
        this.mStateMachine.addState(this.STATE_SET_ENTRANCE_START_STATE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.leanback.app.BaseSupportFragment
    public void createStateMachineTransitions() {
        super.createStateMachineTransitions();
        this.mStateMachine.addTransition(this.STATE_ENTRANCE_ON_PREPARED, this.STATE_SET_ENTRANCE_START_STATE, this.EVT_HEADER_VIEW_CREATED);
        this.mStateMachine.addTransition(this.STATE_ENTRANCE_ON_PREPARED, this.STATE_ENTRANCE_ON_PREPARED_ON_CREATEVIEW, this.EVT_MAIN_FRAGMENT_VIEW_CREATED);
        this.mStateMachine.addTransition(this.STATE_ENTRANCE_ON_PREPARED, this.STATE_ENTRANCE_PERFORM, this.EVT_SCREEN_DATA_READY);
    }

    public void enableMainFragmentScaling(boolean z8) {
        this.mMainFragmentScaleEnabled = z8;
    }

    @Deprecated
    public void enableRowScaling(boolean z8) {
        enableMainFragmentScaling(z8);
    }

    public ObjectAdapter getAdapter() {
        return this.mAdapter;
    }

    @ColorInt
    public int getBrandColor() {
        return this.mBrandColor;
    }

    public int getHeadersState() {
        return this.mHeadersState;
    }

    public HeadersSupportFragment getHeadersSupportFragment() {
        return this.mHeadersSupportFragment;
    }

    public Fragment getMainFragment() {
        return this.mMainFragment;
    }

    public final MainFragmentAdapterRegistry getMainFragmentRegistry() {
        return this.mMainFragmentAdapterRegistry;
    }

    public OnItemViewClickedListener getOnItemViewClickedListener() {
        return this.mOnItemViewClickedListener;
    }

    public OnItemViewSelectedListener getOnItemViewSelectedListener() {
        return this.mExternalOnItemViewSelectedListener;
    }

    public RowsSupportFragment getRowsSupportFragment() {
        Fragment fragment = this.mMainFragment;
        if (fragment instanceof RowsSupportFragment) {
            return (RowsSupportFragment) fragment;
        }
        return null;
    }

    public int getSelectedPosition() {
        return this.mSelectedPosition;
    }

    public RowPresenter.ViewHolder getSelectedRowViewHolder() {
        MainFragmentRowsAdapter mainFragmentRowsAdapter = this.mMainFragmentRowsAdapter;
        if (mainFragmentRowsAdapter != null) {
            return this.mMainFragmentRowsAdapter.findRowViewHolderByPosition(mainFragmentRowsAdapter.getSelectedPosition());
        }
        return null;
    }

    boolean isFirstRowWithContent(int i8) {
        ObjectAdapter objectAdapter = this.mAdapter;
        if (objectAdapter != null && objectAdapter.size() != 0) {
            for (int i9 = 0; i9 < this.mAdapter.size(); i9++) {
                if (((Row) this.mAdapter.get(i9)).isRenderedAsRowView()) {
                    if (i8 == i9) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    boolean isFirstRowWithContentOrPageRow(int i8) {
        ObjectAdapter objectAdapter = this.mAdapter;
        if (objectAdapter == null || objectAdapter.size() == 0) {
            return true;
        }
        for (int i9 = 0; i9 < this.mAdapter.size(); i9++) {
            Row row = (Row) this.mAdapter.get(i9);
            if (row.isRenderedAsRowView() || (row instanceof PageRow)) {
                if (i8 == i9) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    final boolean isHeadersDataReady() {
        ObjectAdapter objectAdapter = this.mAdapter;
        if (objectAdapter != null && objectAdapter.size() != 0) {
            return true;
        }
        return false;
    }

    public final boolean isHeadersTransitionOnBackEnabled() {
        return this.mHeadersBackStackEnabled;
    }

    public boolean isInHeadersTransition() {
        if (this.mHeadersTransition != null) {
            return true;
        }
        return false;
    }

    public boolean isShowingHeaders() {
        return this.mShowingHeaders;
    }

    boolean isVerticalScrolling() {
        if (!this.mHeadersSupportFragment.isScrolling() && !this.mMainFragmentAdapter.isScrolling()) {
            return false;
        }
        return true;
    }

    @Override // androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(R.styleable.LeanbackTheme);
        this.mContainerListMarginStart = (int) obtainStyledAttributes.getDimension(R.styleable.LeanbackTheme_browseRowsMarginStart, r0.getResources().getDimensionPixelSize(R.dimen.lb_browse_rows_margin_start));
        this.mContainerListAlignTop = (int) obtainStyledAttributes.getDimension(R.styleable.LeanbackTheme_browseRowsMarginTop, r0.getResources().getDimensionPixelSize(R.dimen.lb_browse_rows_margin_top));
        obtainStyledAttributes.recycle();
        readArguments(getArguments());
        if (this.mCanShowHeaders) {
            if (this.mHeadersBackStackEnabled) {
                this.mWithHeadersBackStackName = LB_HEADERS_BACKSTACK + this;
                this.mBackStackChangedListener = new BackStackListener();
                getFragmentManager().addOnBackStackChangedListener(this.mBackStackChangedListener);
                this.mBackStackChangedListener.load(bundle);
            } else if (bundle != null) {
                this.mShowingHeaders = bundle.getBoolean(HEADER_SHOW);
            }
        }
        this.mScaleFactor = getResources().getFraction(R.fraction.lb_browse_rows_scale, 1, 1);
    }

    public HeadersSupportFragment onCreateHeadersSupportFragment() {
        return new HeadersSupportFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z8;
        int i8;
        FragmentManager childFragmentManager = getChildFragmentManager();
        int i9 = R.id.scale_frame;
        if (childFragmentManager.findFragmentById(i9) == null) {
            this.mHeadersSupportFragment = onCreateHeadersSupportFragment();
            createMainFragment(this.mAdapter, this.mSelectedPosition);
            FragmentTransaction replace = getChildFragmentManager().beginTransaction().replace(R.id.browse_headers_dock, this.mHeadersSupportFragment);
            Fragment fragment = this.mMainFragment;
            if (fragment != null) {
                replace.replace(i9, fragment);
            } else {
                MainFragmentAdapter mainFragmentAdapter = new MainFragmentAdapter(null);
                this.mMainFragmentAdapter = mainFragmentAdapter;
                mainFragmentAdapter.setFragmentHost(new FragmentHostImpl());
            }
            replace.commit();
        } else {
            this.mHeadersSupportFragment = (HeadersSupportFragment) getChildFragmentManager().findFragmentById(R.id.browse_headers_dock);
            this.mMainFragment = getChildFragmentManager().findFragmentById(i9);
            if (bundle != null && bundle.getBoolean(IS_PAGE_ROW, false)) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.mIsPageRow = z8;
            if (bundle != null) {
                i8 = bundle.getInt(CURRENT_SELECTED_POSITION, 0);
            } else {
                i8 = 0;
            }
            this.mSelectedPosition = i8;
            setMainFragmentAdapter();
        }
        this.mHeadersSupportFragment.setHeadersGone(true ^ this.mCanShowHeaders);
        PresenterSelector presenterSelector = this.mHeaderPresenterSelector;
        if (presenterSelector != null) {
            this.mHeadersSupportFragment.setPresenterSelector(presenterSelector);
        }
        this.mHeadersSupportFragment.setAdapter(this.mAdapter);
        this.mHeadersSupportFragment.setOnHeaderViewSelectedListener(this.mHeaderViewSelectedListener);
        this.mHeadersSupportFragment.setOnHeaderClickedListener(this.mHeaderClickedListener);
        View inflate = layoutInflater.inflate(R.layout.lb_browse_fragment, viewGroup, false);
        getProgressBarManager().setRootView((ViewGroup) inflate);
        BrowseFrameLayout browseFrameLayout = (BrowseFrameLayout) inflate.findViewById(R.id.browse_frame);
        this.mBrowseFrame = browseFrameLayout;
        browseFrameLayout.setOnChildFocusListener(this.mOnChildFocusListener);
        this.mBrowseFrame.setOnFocusSearchListener(this.mOnFocusSearchListener);
        installTitleView(layoutInflater, this.mBrowseFrame, bundle);
        ScaleFrameLayout scaleFrameLayout = (ScaleFrameLayout) inflate.findViewById(i9);
        this.mScaleFrameLayout = scaleFrameLayout;
        scaleFrameLayout.setPivotX(0.0f);
        this.mScaleFrameLayout.setPivotY(this.mContainerListAlignTop);
        if (this.mBrandColorSet) {
            this.mHeadersSupportFragment.setBackgroundColor(this.mBrandColor);
        }
        this.mSceneWithHeaders = TransitionHelper.createScene(this.mBrowseFrame, new Runnable() { // from class: androidx.leanback.app.BrowseSupportFragment.6
            @Override // java.lang.Runnable
            public void run() {
                BrowseSupportFragment.this.showHeaders(true);
            }
        });
        this.mSceneWithoutHeaders = TransitionHelper.createScene(this.mBrowseFrame, new Runnable() { // from class: androidx.leanback.app.BrowseSupportFragment.7
            @Override // java.lang.Runnable
            public void run() {
                BrowseSupportFragment.this.showHeaders(false);
            }
        });
        this.mSceneAfterEntranceTransition = TransitionHelper.createScene(this.mBrowseFrame, new Runnable() { // from class: androidx.leanback.app.BrowseSupportFragment.8
            @Override // java.lang.Runnable
            public void run() {
                BrowseSupportFragment.this.setEntranceTransitionEndState();
            }
        });
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (this.mBackStackChangedListener != null) {
            getFragmentManager().removeOnBackStackChangedListener(this.mBackStackChangedListener);
        }
        super.onDestroy();
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        setMainFragmentRowsAdapter(null);
        this.mPageRow = null;
        this.mMainFragmentAdapter = null;
        this.mMainFragment = null;
        this.mHeadersSupportFragment = null;
        super.onDestroyView();
    }

    @Override // androidx.leanback.app.BaseSupportFragment
    protected void onEntranceTransitionEnd() {
        MainFragmentAdapter mainFragmentAdapter = this.mMainFragmentAdapter;
        if (mainFragmentAdapter != null) {
            mainFragmentAdapter.onTransitionEnd();
        }
        HeadersSupportFragment headersSupportFragment = this.mHeadersSupportFragment;
        if (headersSupportFragment != null) {
            headersSupportFragment.onTransitionEnd();
        }
    }

    @Override // androidx.leanback.app.BaseSupportFragment
    protected void onEntranceTransitionPrepare() {
        this.mHeadersSupportFragment.onTransitionPrepare();
        this.mMainFragmentAdapter.setEntranceTransitionState(false);
        this.mMainFragmentAdapter.onTransitionPrepare();
    }

    @Override // androidx.leanback.app.BaseSupportFragment
    protected void onEntranceTransitionStart() {
        this.mHeadersSupportFragment.onTransitionStart();
        this.mMainFragmentAdapter.onTransitionStart();
    }

    void onRowSelected(int i8) {
        this.mSetSelectionRunnable.post(i8, 0, true);
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(CURRENT_SELECTED_POSITION, this.mSelectedPosition);
        bundle.putBoolean(IS_PAGE_ROW, this.mIsPageRow);
        BackStackListener backStackListener = this.mBackStackChangedListener;
        if (backStackListener != null) {
            backStackListener.save(bundle);
        } else {
            bundle.putBoolean(HEADER_SHOW, this.mShowingHeaders);
        }
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Fragment fragment;
        HeadersSupportFragment headersSupportFragment;
        super.onStart();
        this.mHeadersSupportFragment.setAlignment(this.mContainerListAlignTop);
        setMainFragmentAlignment();
        if (this.mCanShowHeaders && this.mShowingHeaders && (headersSupportFragment = this.mHeadersSupportFragment) != null && headersSupportFragment.getView() != null) {
            this.mHeadersSupportFragment.getView().requestFocus();
        } else if ((!this.mCanShowHeaders || !this.mShowingHeaders) && (fragment = this.mMainFragment) != null && fragment.getView() != null) {
            this.mMainFragment.getView().requestFocus();
        }
        if (this.mCanShowHeaders) {
            showHeaders(this.mShowingHeaders);
        }
        this.mStateMachine.fireEvent(this.EVT_HEADER_VIEW_CREATED);
        this.mStopped = false;
        commitMainFragment();
        this.mSetSelectionRunnable.start();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.mStopped = true;
        this.mSetSelectionRunnable.stop();
        super.onStop();
    }

    @Override // androidx.leanback.app.BaseSupportFragment
    protected void runEntranceTransition(Object obj) {
        TransitionHelper.runTransition(this.mSceneAfterEntranceTransition, obj);
    }

    public void setAdapter(ObjectAdapter objectAdapter) {
        this.mAdapter = objectAdapter;
        updateWrapperPresenter();
        if (getView() == null) {
            return;
        }
        updateMainFragmentRowsAdapter();
        this.mHeadersSupportFragment.setAdapter(this.mAdapter);
    }

    public void setBrandColor(@ColorInt int i8) {
        this.mBrandColor = i8;
        this.mBrandColorSet = true;
        HeadersSupportFragment headersSupportFragment = this.mHeadersSupportFragment;
        if (headersSupportFragment != null) {
            headersSupportFragment.setBackgroundColor(i8);
        }
    }

    public void setBrowseTransitionListener(BrowseTransitionListener browseTransitionListener) {
        this.mBrowseTransitionListener = browseTransitionListener;
    }

    void setEntranceTransitionEndState() {
        setHeadersOnScreen(this.mShowingHeaders);
        setSearchOrbViewOnScreen(true);
        this.mMainFragmentAdapter.setEntranceTransitionState(true);
    }

    void setEntranceTransitionStartState() {
        setHeadersOnScreen(false);
        setSearchOrbViewOnScreen(false);
    }

    public void setHeaderPresenterSelector(PresenterSelector presenterSelector) {
        this.mHeaderPresenterSelector = presenterSelector;
        HeadersSupportFragment headersSupportFragment = this.mHeadersSupportFragment;
        if (headersSupportFragment != null) {
            headersSupportFragment.setPresenterSelector(presenterSelector);
        }
    }

    public void setHeadersState(int i8) {
        if (i8 >= 1 && i8 <= 3) {
            if (i8 != this.mHeadersState) {
                this.mHeadersState = i8;
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            Log.w(TAG, "Unknown headers state: " + i8);
                        } else {
                            this.mCanShowHeaders = false;
                            this.mShowingHeaders = false;
                        }
                    } else {
                        this.mCanShowHeaders = true;
                        this.mShowingHeaders = false;
                    }
                } else {
                    this.mCanShowHeaders = true;
                    this.mShowingHeaders = true;
                }
                HeadersSupportFragment headersSupportFragment = this.mHeadersSupportFragment;
                if (headersSupportFragment != null) {
                    headersSupportFragment.setHeadersGone(true ^ this.mCanShowHeaders);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid headers state: " + i8);
    }

    public final void setHeadersTransitionOnBackEnabled(boolean z8) {
        this.mHeadersBackStackEnabled = z8;
    }

    void setMainFragmentAdapter() {
        boolean z8;
        MainFragmentAdapter mainFragmentAdapter = ((MainFragmentAdapterProvider) this.mMainFragment).getMainFragmentAdapter();
        this.mMainFragmentAdapter = mainFragmentAdapter;
        mainFragmentAdapter.setFragmentHost(new FragmentHostImpl());
        if (!this.mIsPageRow) {
            ActivityResultCaller activityResultCaller = this.mMainFragment;
            if (activityResultCaller instanceof MainFragmentRowsAdapterProvider) {
                setMainFragmentRowsAdapter(((MainFragmentRowsAdapterProvider) activityResultCaller).getMainFragmentRowsAdapter());
            } else {
                setMainFragmentRowsAdapter(null);
            }
            if (this.mMainFragmentRowsAdapter == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.mIsPageRow = z8;
            return;
        }
        setMainFragmentRowsAdapter(null);
    }

    void setMainFragmentRowsAdapter(MainFragmentRowsAdapter mainFragmentRowsAdapter) {
        MainFragmentRowsAdapter mainFragmentRowsAdapter2 = this.mMainFragmentRowsAdapter;
        if (mainFragmentRowsAdapter == mainFragmentRowsAdapter2) {
            return;
        }
        if (mainFragmentRowsAdapter2 != null) {
            mainFragmentRowsAdapter2.setAdapter(null);
        }
        this.mMainFragmentRowsAdapter = mainFragmentRowsAdapter;
        if (mainFragmentRowsAdapter != null) {
            mainFragmentRowsAdapter.setOnItemViewSelectedListener(new MainFragmentItemViewSelectedListener(mainFragmentRowsAdapter));
            this.mMainFragmentRowsAdapter.setOnItemViewClickedListener(this.mOnItemViewClickedListener);
        }
        updateMainFragmentRowsAdapter();
    }

    public void setOnItemViewClickedListener(OnItemViewClickedListener onItemViewClickedListener) {
        this.mOnItemViewClickedListener = onItemViewClickedListener;
        MainFragmentRowsAdapter mainFragmentRowsAdapter = this.mMainFragmentRowsAdapter;
        if (mainFragmentRowsAdapter != null) {
            mainFragmentRowsAdapter.setOnItemViewClickedListener(onItemViewClickedListener);
        }
    }

    public void setOnItemViewSelectedListener(OnItemViewSelectedListener onItemViewSelectedListener) {
        this.mExternalOnItemViewSelectedListener = onItemViewSelectedListener;
    }

    void setSearchOrbViewOnScreen(boolean z8) {
        int i8;
        View searchAffordanceView = getTitleViewAdapter().getSearchAffordanceView();
        if (searchAffordanceView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) searchAffordanceView.getLayoutParams();
            if (z8) {
                i8 = 0;
            } else {
                i8 = -this.mContainerListMarginStart;
            }
            marginLayoutParams.setMarginStart(i8);
            searchAffordanceView.setLayoutParams(marginLayoutParams);
        }
    }

    public void setSelectedPosition(int i8) {
        setSelectedPosition(i8, true);
    }

    void setSelection(int i8, boolean z8) {
        if (i8 == -1) {
            return;
        }
        this.mSelectedPosition = i8;
        HeadersSupportFragment headersSupportFragment = this.mHeadersSupportFragment;
        if (headersSupportFragment != null && this.mMainFragmentAdapter != null) {
            headersSupportFragment.setSelectedPosition(i8, z8);
            replaceMainFragment(i8);
            MainFragmentRowsAdapter mainFragmentRowsAdapter = this.mMainFragmentRowsAdapter;
            if (mainFragmentRowsAdapter != null) {
                mainFragmentRowsAdapter.setSelectedPosition(i8, z8);
            }
            updateTitleViewVisibility();
        }
    }

    void showHeaders(boolean z8) {
        this.mHeadersSupportFragment.setHeadersEnabled(z8);
        setHeadersOnScreen(z8);
        expandMainFragment(!z8);
    }

    public void startHeadersTransition(boolean z8) {
        if (this.mCanShowHeaders) {
            if (!isInHeadersTransition() && this.mShowingHeaders != z8) {
                startHeadersTransitionInternal(z8);
                return;
            }
            return;
        }
        throw new IllegalStateException("Cannot start headers transition");
    }

    void startHeadersTransitionInternal(final boolean z8) {
        if (getFragmentManager().isDestroyed() || !isHeadersDataReady()) {
            return;
        }
        this.mShowingHeaders = z8;
        this.mMainFragmentAdapter.onTransitionPrepare();
        this.mMainFragmentAdapter.onTransitionStart();
        onExpandTransitionStart(!z8, new Runnable() { // from class: androidx.leanback.app.BrowseSupportFragment.3
            @Override // java.lang.Runnable
            public void run() {
                Object obj;
                BrowseSupportFragment.this.mHeadersSupportFragment.onTransitionPrepare();
                BrowseSupportFragment.this.mHeadersSupportFragment.onTransitionStart();
                BrowseSupportFragment.this.createHeadersTransition();
                BrowseTransitionListener browseTransitionListener = BrowseSupportFragment.this.mBrowseTransitionListener;
                if (browseTransitionListener != null) {
                    browseTransitionListener.onHeadersTransitionStart(z8);
                }
                if (z8) {
                    obj = BrowseSupportFragment.this.mSceneWithHeaders;
                } else {
                    obj = BrowseSupportFragment.this.mSceneWithoutHeaders;
                }
                TransitionHelper.runTransition(obj, BrowseSupportFragment.this.mHeadersTransition);
                BrowseSupportFragment browseSupportFragment = BrowseSupportFragment.this;
                if (browseSupportFragment.mHeadersBackStackEnabled) {
                    if (!z8) {
                        browseSupportFragment.getFragmentManager().beginTransaction().addToBackStack(BrowseSupportFragment.this.mWithHeadersBackStackName).commit();
                        return;
                    }
                    int i8 = browseSupportFragment.mBackStackChangedListener.mIndexOfHeadersBackStack;
                    if (i8 >= 0) {
                        BrowseSupportFragment.this.getFragmentManager().popBackStackImmediate(browseSupportFragment.getFragmentManager().getBackStackEntryAt(i8).getId(), 1);
                    }
                }
            }
        });
    }

    void updateMainFragmentRowsAdapter() {
        ListRowDataAdapter listRowDataAdapter = this.mMainFragmentListRowDataAdapter;
        ListRowDataAdapter listRowDataAdapter2 = null;
        if (listRowDataAdapter != null) {
            listRowDataAdapter.detach();
            this.mMainFragmentListRowDataAdapter = null;
        }
        if (this.mMainFragmentRowsAdapter != null) {
            ObjectAdapter objectAdapter = this.mAdapter;
            if (objectAdapter != null) {
                listRowDataAdapter2 = new ListRowDataAdapter(objectAdapter);
            }
            this.mMainFragmentListRowDataAdapter = listRowDataAdapter2;
            this.mMainFragmentRowsAdapter.setAdapter(listRowDataAdapter2);
        }
    }

    void updateTitleViewVisibility() {
        boolean isFirstRowWithContent;
        int i8;
        MainFragmentAdapter mainFragmentAdapter;
        boolean isFirstRowWithContent2;
        MainFragmentAdapter mainFragmentAdapter2;
        if (!this.mShowingHeaders) {
            if (this.mIsPageRow && (mainFragmentAdapter2 = this.mMainFragmentAdapter) != null) {
                isFirstRowWithContent2 = mainFragmentAdapter2.mFragmentHost.mShowTitleView;
            } else {
                isFirstRowWithContent2 = isFirstRowWithContent(this.mSelectedPosition);
            }
            if (isFirstRowWithContent2) {
                showTitle(6);
                return;
            } else {
                showTitle(false);
                return;
            }
        }
        if (this.mIsPageRow && (mainFragmentAdapter = this.mMainFragmentAdapter) != null) {
            isFirstRowWithContent = mainFragmentAdapter.mFragmentHost.mShowTitleView;
        } else {
            isFirstRowWithContent = isFirstRowWithContent(this.mSelectedPosition);
        }
        boolean isFirstRowWithContentOrPageRow = isFirstRowWithContentOrPageRow(this.mSelectedPosition);
        if (isFirstRowWithContent) {
            i8 = 2;
        } else {
            i8 = 0;
        }
        if (isFirstRowWithContentOrPageRow) {
            i8 |= 4;
        }
        if (i8 != 0) {
            showTitle(i8);
        } else {
            showTitle(false);
        }
    }

    public void setSelectedPosition(int i8, boolean z8) {
        this.mSetSelectionRunnable.post(i8, 1, z8);
    }

    public void setSelectedPosition(int i8, boolean z8, Presenter.ViewHolderTask viewHolderTask) {
        if (this.mMainFragmentAdapterRegistry == null) {
            return;
        }
        if (viewHolderTask != null) {
            startHeadersTransition(false);
        }
        MainFragmentRowsAdapter mainFragmentRowsAdapter = this.mMainFragmentRowsAdapter;
        if (mainFragmentRowsAdapter != null) {
            mainFragmentRowsAdapter.setSelectedPosition(i8, z8, viewHolderTask);
        }
    }
}
