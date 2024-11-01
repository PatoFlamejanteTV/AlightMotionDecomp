package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.EnvironmentCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStoreOwner;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class FragmentStateManager {
    static final String ARGUMENTS_KEY = "arguments";
    static final String CHILD_FRAGMENT_MANAGER_KEY = "childFragmentManager";
    static final String FRAGMENT_STATE_KEY = "state";
    static final String REGISTRY_STATE_KEY = "registryState";
    static final String SAVED_INSTANCE_STATE_KEY = "savedInstanceState";
    private static final String TAG = "FragmentManager";
    static final String VIEW_REGISTRY_STATE_KEY = "viewRegistryState";
    static final String VIEW_STATE_KEY = "viewState";
    private final FragmentLifecycleCallbacksDispatcher mDispatcher;

    @NonNull
    private final Fragment mFragment;
    private final FragmentStore mFragmentStore;
    private boolean mMovingToState = false;
    private int mFragmentManagerState = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentStateManager$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$State;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            $SwitchMap$androidx$lifecycle$Lifecycle$State = iArr;
            try {
                iArr[Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$State[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$State[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$State[Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentStateManager(@NonNull FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, @NonNull FragmentStore fragmentStore, @NonNull Fragment fragment) {
        this.mDispatcher = fragmentLifecycleCallbacksDispatcher;
        this.mFragmentStore = fragmentStore;
        this.mFragment = fragment;
    }

    private boolean isFragmentViewChild(@NonNull View view) {
        if (view == this.mFragment.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.mFragment.mView) {
                return true;
            }
        }
        return false;
    }

    void activityCreated() {
        Bundle bundle;
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.mFragment);
        }
        Bundle bundle2 = this.mFragment.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(SAVED_INSTANCE_STATE_KEY);
        } else {
            bundle = null;
        }
        this.mFragment.performActivityCreated(bundle);
        this.mDispatcher.dispatchOnFragmentActivityCreated(this.mFragment, bundle, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addViewToContainer() {
        Fragment findViewFragment = FragmentManager.findViewFragment(this.mFragment.mContainer);
        Fragment parentFragment = this.mFragment.getParentFragment();
        if (findViewFragment != null && !findViewFragment.equals(parentFragment)) {
            Fragment fragment = this.mFragment;
            FragmentStrictMode.onWrongNestedHierarchy(fragment, findViewFragment, fragment.mContainerId);
        }
        int findFragmentIndexInContainer = this.mFragmentStore.findFragmentIndexInContainer(this.mFragment);
        Fragment fragment2 = this.mFragment;
        fragment2.mContainer.addView(fragment2.mView, findFragmentIndexInContainer);
    }

    void attach() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.mFragment);
        }
        Fragment fragment = this.mFragment;
        Fragment fragment2 = fragment.mTarget;
        FragmentStateManager fragmentStateManager = null;
        if (fragment2 != null) {
            FragmentStateManager fragmentStateManager2 = this.mFragmentStore.getFragmentStateManager(fragment2.mWho);
            if (fragmentStateManager2 != null) {
                Fragment fragment3 = this.mFragment;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                fragmentStateManager = fragmentStateManager2;
            } else {
                throw new IllegalStateException("Fragment " + this.mFragment + " declared target fragment " + this.mFragment.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (fragmentStateManager = this.mFragmentStore.getFragmentStateManager(str)) == null) {
                throw new IllegalStateException("Fragment " + this.mFragment + " declared target fragment " + this.mFragment.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (fragmentStateManager != null) {
            fragmentStateManager.moveToExpectedState();
        }
        Fragment fragment4 = this.mFragment;
        fragment4.mHost = fragment4.mFragmentManager.getHost();
        Fragment fragment5 = this.mFragment;
        fragment5.mParentFragment = fragment5.mFragmentManager.getParent();
        this.mDispatcher.dispatchOnFragmentPreAttached(this.mFragment, false);
        this.mFragment.performAttach();
        this.mDispatcher.dispatchOnFragmentAttached(this.mFragment, false);
    }

    int computeExpectedState() {
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact;
        Fragment fragment = this.mFragment;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i8 = this.mFragmentManagerState;
        int i9 = AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State[fragment.mMaxState.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        i8 = Math.min(i8, -1);
                    } else {
                        i8 = Math.min(i8, 0);
                    }
                } else {
                    i8 = Math.min(i8, 1);
                }
            } else {
                i8 = Math.min(i8, 5);
            }
        }
        Fragment fragment2 = this.mFragment;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i8 = Math.max(this.mFragmentManagerState, 2);
                View view = this.mFragment.mView;
                if (view != null && view.getParent() == null) {
                    i8 = Math.min(i8, 2);
                }
            } else {
                i8 = this.mFragmentManagerState < 4 ? Math.min(i8, fragment2.mState) : Math.min(i8, 1);
            }
        }
        if (!this.mFragment.mAdded) {
            i8 = Math.min(i8, 1);
        }
        Fragment fragment3 = this.mFragment;
        ViewGroup viewGroup = fragment3.mContainer;
        if (viewGroup != null) {
            lifecycleImpact = SpecialEffectsController.getOrCreateController(viewGroup, fragment3.getParentFragmentManager()).getAwaitingCompletionLifecycleImpact(this);
        } else {
            lifecycleImpact = null;
        }
        if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            i8 = Math.min(i8, 6);
        } else if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            i8 = Math.max(i8, 3);
        } else {
            Fragment fragment4 = this.mFragment;
            if (fragment4.mRemoving) {
                if (fragment4.isInBackStack()) {
                    i8 = Math.min(i8, 1);
                } else {
                    i8 = Math.min(i8, -1);
                }
            }
        }
        Fragment fragment5 = this.mFragment;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i8 = Math.min(i8, 4);
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i8 + " for " + this.mFragment);
        }
        return i8;
    }

    void create() {
        Bundle bundle;
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.mFragment);
        }
        Bundle bundle2 = this.mFragment.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(SAVED_INSTANCE_STATE_KEY);
        } else {
            bundle = null;
        }
        Fragment fragment = this.mFragment;
        if (!fragment.mIsCreated) {
            this.mDispatcher.dispatchOnFragmentPreCreated(fragment, bundle, false);
            this.mFragment.performCreate(bundle);
            this.mDispatcher.dispatchOnFragmentCreated(this.mFragment, bundle, false);
        } else {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        }
    }

    void createView() {
        Bundle bundle;
        String str;
        if (this.mFragment.mFromLayout) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.mFragment);
        }
        Bundle bundle2 = this.mFragment.mSavedFragmentState;
        ViewGroup viewGroup = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(SAVED_INSTANCE_STATE_KEY);
        } else {
            bundle = null;
        }
        LayoutInflater performGetLayoutInflater = this.mFragment.performGetLayoutInflater(bundle);
        Fragment fragment = this.mFragment;
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i8 = fragment.mContainerId;
            if (i8 != 0) {
                if (i8 != -1) {
                    viewGroup = (ViewGroup) fragment.mFragmentManager.getContainer().onFindViewById(this.mFragment.mContainerId);
                    if (viewGroup == null) {
                        Fragment fragment2 = this.mFragment;
                        if (!fragment2.mRestored) {
                            try {
                                str = fragment2.getResources().getResourceName(this.mFragment.mContainerId);
                            } catch (Resources.NotFoundException unused) {
                                str = EnvironmentCompat.MEDIA_UNKNOWN;
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.mFragment.mContainerId) + " (" + str + ") for fragment " + this.mFragment);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        FragmentStrictMode.onWrongFragmentContainer(this.mFragment, viewGroup);
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + this.mFragment + " for a container view with no id");
                }
            }
        }
        Fragment fragment3 = this.mFragment;
        fragment3.mContainer = viewGroup;
        fragment3.performCreateView(performGetLayoutInflater, viewGroup, bundle);
        if (this.mFragment.mView != null) {
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.mFragment);
            }
            this.mFragment.mView.setSaveFromParentEnabled(false);
            Fragment fragment4 = this.mFragment;
            fragment4.mView.setTag(R.id.fragment_container_view_tag, fragment4);
            if (viewGroup != null) {
                addViewToContainer();
            }
            Fragment fragment5 = this.mFragment;
            if (fragment5.mHidden) {
                fragment5.mView.setVisibility(8);
            }
            if (ViewCompat.isAttachedToWindow(this.mFragment.mView)) {
                ViewCompat.requestApplyInsets(this.mFragment.mView);
            } else {
                final View view = this.mFragment.mView;
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.fragment.app.FragmentStateManager.1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view2) {
                        view.removeOnAttachStateChangeListener(this);
                        ViewCompat.requestApplyInsets(view);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view2) {
                    }
                });
            }
            this.mFragment.performViewCreated();
            FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.mDispatcher;
            Fragment fragment6 = this.mFragment;
            fragmentLifecycleCallbacksDispatcher.dispatchOnFragmentViewCreated(fragment6, fragment6.mView, bundle, false);
            int visibility = this.mFragment.mView.getVisibility();
            this.mFragment.setPostOnViewCreatedAlpha(this.mFragment.mView.getAlpha());
            Fragment fragment7 = this.mFragment;
            if (fragment7.mContainer != null && visibility == 0) {
                View findFocus = fragment7.mView.findFocus();
                if (findFocus != null) {
                    this.mFragment.setFocusedView(findFocus);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.mFragment);
                    }
                }
                this.mFragment.mView.setAlpha(0.0f);
            }
        }
        this.mFragment.mState = 2;
    }

    void destroy() {
        boolean z8;
        Fragment findActiveFragment;
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.mFragment);
        }
        Fragment fragment = this.mFragment;
        boolean z9 = true;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            Fragment fragment2 = this.mFragment;
            if (!fragment2.mBeingSaved) {
                this.mFragmentStore.setSavedState(fragment2.mWho, null);
            }
        }
        if (!z8 && !this.mFragmentStore.getNonConfig().shouldDestroy(this.mFragment)) {
            String str = this.mFragment.mTargetWho;
            if (str != null && (findActiveFragment = this.mFragmentStore.findActiveFragment(str)) != null && findActiveFragment.mRetainInstance) {
                this.mFragment.mTarget = findActiveFragment;
            }
            this.mFragment.mState = 0;
            return;
        }
        FragmentHostCallback<?> fragmentHostCallback = this.mFragment.mHost;
        if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            z9 = this.mFragmentStore.getNonConfig().isCleared();
        } else if (fragmentHostCallback.getContext() instanceof Activity) {
            z9 = true ^ ((Activity) fragmentHostCallback.getContext()).isChangingConfigurations();
        }
        if ((z8 && !this.mFragment.mBeingSaved) || z9) {
            this.mFragmentStore.getNonConfig().clearNonConfigState(this.mFragment, false);
        }
        this.mFragment.performDestroy();
        this.mDispatcher.dispatchOnFragmentDestroyed(this.mFragment, false);
        for (FragmentStateManager fragmentStateManager : this.mFragmentStore.getActiveFragmentStateManagers()) {
            if (fragmentStateManager != null) {
                Fragment fragment3 = fragmentStateManager.getFragment();
                if (this.mFragment.mWho.equals(fragment3.mTargetWho)) {
                    fragment3.mTarget = this.mFragment;
                    fragment3.mTargetWho = null;
                }
            }
        }
        Fragment fragment4 = this.mFragment;
        String str2 = fragment4.mTargetWho;
        if (str2 != null) {
            fragment4.mTarget = this.mFragmentStore.findActiveFragment(str2);
        }
        this.mFragmentStore.makeInactive(this);
    }

    void destroyFragmentView() {
        View view;
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.mFragment);
        }
        Fragment fragment = this.mFragment;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.mFragment.performDestroyView();
        this.mDispatcher.dispatchOnFragmentViewDestroyed(this.mFragment, false);
        Fragment fragment2 = this.mFragment;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.mFragment.mInLayout = false;
    }

    void detach() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.mFragment);
        }
        this.mFragment.performDetach();
        this.mDispatcher.dispatchOnFragmentDetached(this.mFragment, false);
        Fragment fragment = this.mFragment;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((fragment.mRemoving && !fragment.isInBackStack()) || this.mFragmentStore.getNonConfig().shouldDestroy(this.mFragment)) {
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.mFragment);
            }
            this.mFragment.initState();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ensureInflatedView() {
        Bundle bundle;
        Fragment fragment = this.mFragment;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.mFragment);
            }
            Bundle bundle2 = this.mFragment.mSavedFragmentState;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(SAVED_INSTANCE_STATE_KEY);
            } else {
                bundle = null;
            }
            Fragment fragment2 = this.mFragment;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(bundle), null, bundle);
            View view = this.mFragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.mFragment;
                fragment3.mView.setTag(R.id.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.mFragment;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.mFragment.performViewCreated();
                FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.mDispatcher;
                Fragment fragment5 = this.mFragment;
                fragmentLifecycleCallbacksDispatcher.dispatchOnFragmentViewCreated(fragment5, fragment5.mView, bundle, false);
                this.mFragment.mState = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Fragment getFragment() {
        return this.mFragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void moveToExpectedState() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.mMovingToState) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + getFragment());
                return;
            }
            return;
        }
        try {
            this.mMovingToState = true;
            boolean z8 = false;
            while (true) {
                int computeExpectedState = computeExpectedState();
                Fragment fragment = this.mFragment;
                int i8 = fragment.mState;
                if (computeExpectedState != i8) {
                    if (computeExpectedState > i8) {
                        switch (i8 + 1) {
                            case 0:
                                attach();
                                break;
                            case 1:
                                create();
                                break;
                            case 2:
                                ensureInflatedView();
                                createView();
                                break;
                            case 3:
                                activityCreated();
                                break;
                            case 4:
                                if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                    SpecialEffectsController.getOrCreateController(viewGroup3, fragment.getParentFragmentManager()).enqueueAdd(SpecialEffectsController.Operation.State.from(this.mFragment.mView.getVisibility()), this);
                                }
                                this.mFragment.mState = 4;
                                break;
                            case 5:
                                start();
                                break;
                            case 6:
                                fragment.mState = 6;
                                break;
                            case 7:
                                resume();
                                break;
                        }
                    } else {
                        switch (i8 - 1) {
                            case -1:
                                detach();
                                break;
                            case 0:
                                if (fragment.mBeingSaved && this.mFragmentStore.getSavedState(fragment.mWho) == null) {
                                    this.mFragmentStore.setSavedState(this.mFragment.mWho, saveState());
                                }
                                destroy();
                                break;
                            case 1:
                                destroyFragmentView();
                                this.mFragment.mState = 1;
                                break;
                            case 2:
                                fragment.mInLayout = false;
                                fragment.mState = 2;
                                break;
                            case 3:
                                if (FragmentManager.isLoggingEnabled(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.mFragment);
                                }
                                Fragment fragment2 = this.mFragment;
                                if (fragment2.mBeingSaved) {
                                    this.mFragmentStore.setSavedState(fragment2.mWho, saveState());
                                } else if (fragment2.mView != null && fragment2.mSavedViewState == null) {
                                    saveViewState();
                                }
                                Fragment fragment3 = this.mFragment;
                                if (fragment3.mView != null && (viewGroup2 = fragment3.mContainer) != null) {
                                    SpecialEffectsController.getOrCreateController(viewGroup2, fragment3.getParentFragmentManager()).enqueueRemove(this);
                                }
                                this.mFragment.mState = 3;
                                break;
                            case 4:
                                stop();
                                break;
                            case 5:
                                fragment.mState = 5;
                                break;
                            case 6:
                                pause();
                                break;
                        }
                    }
                    z8 = true;
                } else {
                    if (!z8 && i8 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.mFragment.mBeingSaved) {
                        if (FragmentManager.isLoggingEnabled(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.mFragment);
                        }
                        this.mFragmentStore.getNonConfig().clearNonConfigState(this.mFragment, true);
                        this.mFragmentStore.makeInactive(this);
                        if (FragmentManager.isLoggingEnabled(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.mFragment);
                        }
                        this.mFragment.initState();
                    }
                    Fragment fragment4 = this.mFragment;
                    if (fragment4.mHiddenChanged) {
                        if (fragment4.mView != null && (viewGroup = fragment4.mContainer) != null) {
                            SpecialEffectsController orCreateController = SpecialEffectsController.getOrCreateController(viewGroup, fragment4.getParentFragmentManager());
                            if (this.mFragment.mHidden) {
                                orCreateController.enqueueHide(this);
                            } else {
                                orCreateController.enqueueShow(this);
                            }
                        }
                        Fragment fragment5 = this.mFragment;
                        FragmentManager fragmentManager = fragment5.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.invalidateMenuForFragment(fragment5);
                        }
                        Fragment fragment6 = this.mFragment;
                        fragment6.mHiddenChanged = false;
                        fragment6.onHiddenChanged(fragment6.mHidden);
                        this.mFragment.mChildFragmentManager.dispatchOnHiddenChanged();
                    }
                    this.mMovingToState = false;
                    return;
                }
            }
        } catch (Throwable th) {
            this.mMovingToState = false;
            throw th;
        }
    }

    void pause() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.mFragment);
        }
        this.mFragment.performPause();
        this.mDispatcher.dispatchOnFragmentPaused(this.mFragment, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void restoreState(@NonNull ClassLoader classLoader) {
        Bundle bundle = this.mFragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.mFragment.mSavedFragmentState.getBundle(SAVED_INSTANCE_STATE_KEY) == null) {
            this.mFragment.mSavedFragmentState.putBundle(SAVED_INSTANCE_STATE_KEY, new Bundle());
        }
        Fragment fragment = this.mFragment;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray(VIEW_STATE_KEY);
        Fragment fragment2 = this.mFragment;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle(VIEW_REGISTRY_STATE_KEY);
        FragmentState fragmentState = (FragmentState) this.mFragment.mSavedFragmentState.getParcelable(FRAGMENT_STATE_KEY);
        if (fragmentState != null) {
            Fragment fragment3 = this.mFragment;
            fragment3.mTargetWho = fragmentState.mTargetWho;
            fragment3.mTargetRequestCode = fragmentState.mTargetRequestCode;
            Boolean bool = fragment3.mSavedUserVisibleHint;
            if (bool != null) {
                fragment3.mUserVisibleHint = bool.booleanValue();
                this.mFragment.mSavedUserVisibleHint = null;
            } else {
                fragment3.mUserVisibleHint = fragmentState.mUserVisibleHint;
            }
        }
        Fragment fragment4 = this.mFragment;
        if (!fragment4.mUserVisibleHint) {
            fragment4.mDeferStart = true;
        }
    }

    void resume() {
        String str;
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.mFragment);
        }
        View focusedView = this.mFragment.getFocusedView();
        if (focusedView != null && isFragmentViewChild(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb.append(str);
                sb.append(" on Fragment ");
                sb.append(this.mFragment);
                sb.append(" resulting in focused view ");
                sb.append(this.mFragment.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.mFragment.setFocusedView(null);
        this.mFragment.performResume();
        this.mDispatcher.dispatchOnFragmentResumed(this.mFragment, false);
        this.mFragmentStore.setSavedState(this.mFragment.mWho, null);
        Fragment fragment = this.mFragment;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Fragment.SavedState saveInstanceState() {
        if (this.mFragment.mState > -1) {
            return new Fragment.SavedState(saveState());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Bundle saveState() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.mFragment;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable(FRAGMENT_STATE_KEY, new FragmentState(this.mFragment));
        if (this.mFragment.mState > -1) {
            Bundle bundle3 = new Bundle();
            this.mFragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle(SAVED_INSTANCE_STATE_KEY, bundle3);
            }
            this.mDispatcher.dispatchOnFragmentSaveInstanceState(this.mFragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.mFragment.mSavedStateRegistryController.performSave(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle(REGISTRY_STATE_KEY, bundle4);
            }
            Bundle lambda$attachController$4 = this.mFragment.mChildFragmentManager.lambda$attachController$4();
            if (!lambda$attachController$4.isEmpty()) {
                bundle2.putBundle(CHILD_FRAGMENT_MANAGER_KEY, lambda$attachController$4);
            }
            if (this.mFragment.mView != null) {
                saveViewState();
            }
            SparseArray<Parcelable> sparseArray = this.mFragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray(VIEW_STATE_KEY, sparseArray);
            }
            Bundle bundle5 = this.mFragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle(VIEW_REGISTRY_STATE_KEY, bundle5);
            }
        }
        Bundle bundle6 = this.mFragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle(ARGUMENTS_KEY, bundle6);
        }
        return bundle2;
    }

    void saveViewState() {
        if (this.mFragment.mView == null) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.mFragment + " with view " + this.mFragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.mFragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.mFragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.mFragment.mViewLifecycleOwner.performSave(bundle);
        if (!bundle.isEmpty()) {
            this.mFragment.mSavedViewRegistryState = bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setFragmentManagerState(int i8) {
        this.mFragmentManagerState = i8;
    }

    void start() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.mFragment);
        }
        this.mFragment.performStart();
        this.mDispatcher.dispatchOnFragmentStarted(this.mFragment, false);
    }

    void stop() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.mFragment);
        }
        this.mFragment.performStop();
        this.mDispatcher.dispatchOnFragmentStopped(this.mFragment, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentStateManager(@NonNull FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, @NonNull FragmentStore fragmentStore, @NonNull ClassLoader classLoader, @NonNull FragmentFactory fragmentFactory, @NonNull Bundle bundle) {
        this.mDispatcher = fragmentLifecycleCallbacksDispatcher;
        this.mFragmentStore = fragmentStore;
        Fragment instantiate = ((FragmentState) bundle.getParcelable(FRAGMENT_STATE_KEY)).instantiate(fragmentFactory, classLoader);
        this.mFragment = instantiate;
        instantiate.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle(ARGUMENTS_KEY);
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        instantiate.setArguments(bundle2);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + instantiate);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentStateManager(@NonNull FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, @NonNull FragmentStore fragmentStore, @NonNull Fragment fragment, @NonNull Bundle bundle) {
        this.mDispatcher = fragmentLifecycleCallbacksDispatcher;
        this.mFragmentStore = fragmentStore;
        this.mFragment = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle(ARGUMENTS_KEY);
    }
}
