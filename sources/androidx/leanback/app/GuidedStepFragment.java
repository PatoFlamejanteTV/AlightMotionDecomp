package androidx.leanback.app;

import android.R;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.transition.Transition;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.app.ActivityCompat;
import androidx.core.view.GravityCompat;
import androidx.leanback.transition.TransitionHelper;
import androidx.leanback.widget.DiffCallback;
import androidx.leanback.widget.GuidanceStylist;
import androidx.leanback.widget.GuidedAction;
import androidx.leanback.widget.GuidedActionAdapter;
import androidx.leanback.widget.GuidedActionAdapterGroup;
import androidx.leanback.widget.GuidedActionsStylist;
import androidx.leanback.widget.NonOverlappingLinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public class GuidedStepFragment extends Fragment implements GuidedActionAdapter.FocusListener {
    private static final boolean DEBUG = false;
    private static final String ENTRY_NAME_ENTRANCE = "GuidedStepEntrance";
    private static final String ENTRY_NAME_REPLACE = "GuidedStepDefault";
    private static final String EXTRA_ACTION_PREFIX = "action_";
    private static final String EXTRA_BUTTON_ACTION_PREFIX = "buttonaction_";
    public static final String EXTRA_UI_STYLE = "uiStyle";
    private static final boolean IS_FRAMEWORK_FRAGMENT = true;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int SLIDE_FROM_BOTTOM = 1;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int SLIDE_FROM_SIDE = 0;
    private static final String TAG = "GuidedStepF";
    private static final String TAG_LEAN_BACK_ACTIONS_FRAGMENT = "leanBackGuidedStepFragment";
    public static final int UI_STYLE_ACTIVITY_ROOT = 2;

    @Deprecated
    public static final int UI_STYLE_DEFAULT = 0;
    public static final int UI_STYLE_ENTRANCE = 1;
    public static final int UI_STYLE_REPLACE = 0;
    private GuidedActionAdapter mAdapter;
    private GuidedActionAdapterGroup mAdapterGroup;
    private GuidedActionAdapter mButtonAdapter;
    private GuidedActionAdapter mSubAdapter;
    private ContextThemeWrapper mThemeWrapper;
    private List<GuidedAction> mActions = new ArrayList();
    private List<GuidedAction> mButtonActions = new ArrayList();
    private int entranceTransitionType = 0;
    private GuidanceStylist mGuidanceStylist = onCreateGuidanceStylist();
    GuidedActionsStylist mActionsStylist = onCreateActionsStylist();
    private GuidedActionsStylist mButtonActionsStylist = onCreateButtonActionsStylist();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public static class DummyFragment extends Fragment {
        @Override // android.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View view = new View(layoutInflater.getContext());
            view.setVisibility(8);
            return view;
        }
    }

    public GuidedStepFragment() {
        onProvideFragmentTransitions();
    }

    public static int add(FragmentManager fragmentManager, GuidedStepFragment guidedStepFragment) {
        return add(fragmentManager, guidedStepFragment, R.id.content);
    }

    public static int addAsRoot(Activity activity, GuidedStepFragment guidedStepFragment, int i8) {
        activity.getWindow().getDecorView();
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag(TAG_LEAN_BACK_ACTIONS_FRAGMENT) != null) {
            Log.w(TAG, "Fragment is already exists, likely calling addAsRoot() when savedInstanceState is not null in Activity.onCreate().");
            return -1;
        }
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        guidedStepFragment.setUiStyle(2);
        return beginTransaction.replace(i8, guidedStepFragment, TAG_LEAN_BACK_ACTIONS_FRAGMENT).commit();
    }

    private static void addNonNullSharedElementTransition(FragmentTransaction fragmentTransaction, View view, String str) {
        if (view != null) {
            fragmentTransaction.addSharedElement(view, str);
        }
    }

    public static GuidedStepFragment getCurrentGuidedStepFragment(FragmentManager fragmentManager) {
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(TAG_LEAN_BACK_ACTIONS_FRAGMENT);
        if (findFragmentByTag instanceof GuidedStepFragment) {
            return (GuidedStepFragment) findFragmentByTag;
        }
        return null;
    }

    private int getFirstCheckedAction() {
        int size = this.mActions.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.mActions.get(i8).isChecked()) {
                return i8;
            }
        }
        return 0;
    }

    static String getGuidedStepFragmentClassName(String str) {
        if (str.startsWith(ENTRY_NAME_REPLACE)) {
            return str.substring(17);
        }
        if (str.startsWith(ENTRY_NAME_ENTRANCE)) {
            return str.substring(18);
        }
        return "";
    }

    private LayoutInflater getThemeInflater(LayoutInflater layoutInflater) {
        ContextThemeWrapper contextThemeWrapper = this.mThemeWrapper;
        if (contextThemeWrapper == null) {
            return layoutInflater;
        }
        return layoutInflater.cloneInContext(contextThemeWrapper);
    }

    private static boolean isGuidedStepTheme(Context context) {
        int i8 = androidx.leanback.R.attr.guidedStepThemeFlag;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i8, typedValue, true) && typedValue.type == 18 && typedValue.data != 0) {
            return true;
        }
        return false;
    }

    static boolean isSaveEnabled(GuidedAction guidedAction) {
        if (guidedAction.isAutoSaveRestoreEnabled() && guidedAction.getId() != -1) {
            return true;
        }
        return false;
    }

    static boolean isStackEntryUiStyleEntrance(String str) {
        if (str != null && str.startsWith(ENTRY_NAME_ENTRANCE)) {
            return true;
        }
        return false;
    }

    private void resolveTheme() {
        Context context = FragmentUtil.getContext(this);
        int onProvideTheme = onProvideTheme();
        if (onProvideTheme == -1 && !isGuidedStepTheme(context)) {
            int i8 = androidx.leanback.R.attr.guidedStepTheme;
            TypedValue typedValue = new TypedValue();
            boolean resolveAttribute = context.getTheme().resolveAttribute(i8, typedValue, true);
            if (resolveAttribute) {
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, typedValue.resourceId);
                if (isGuidedStepTheme(contextThemeWrapper)) {
                    this.mThemeWrapper = contextThemeWrapper;
                } else {
                    this.mThemeWrapper = null;
                    resolveAttribute = false;
                }
            }
            if (!resolveAttribute) {
                Log.e(TAG, "GuidedStepFragment does not have an appropriate theme set.");
                return;
            }
            return;
        }
        if (onProvideTheme != -1) {
            this.mThemeWrapper = new ContextThemeWrapper(context, onProvideTheme);
        }
    }

    public void collapseAction(boolean z8) {
        GuidedActionsStylist guidedActionsStylist = this.mActionsStylist;
        if (guidedActionsStylist != null && guidedActionsStylist.getActionsGridView() != null) {
            this.mActionsStylist.collapseAction(z8);
        }
    }

    public void collapseSubActions() {
        collapseAction(true);
    }

    public void expandAction(GuidedAction guidedAction, boolean z8) {
        this.mActionsStylist.expandAction(guidedAction, z8);
    }

    public void expandSubActions(GuidedAction guidedAction) {
        if (!guidedAction.hasSubActions()) {
            return;
        }
        expandAction(guidedAction, true);
    }

    public GuidedAction findActionById(long j8) {
        int findActionPositionById = findActionPositionById(j8);
        if (findActionPositionById >= 0) {
            return this.mActions.get(findActionPositionById);
        }
        return null;
    }

    public int findActionPositionById(long j8) {
        if (this.mActions != null) {
            for (int i8 = 0; i8 < this.mActions.size(); i8++) {
                this.mActions.get(i8);
                if (this.mActions.get(i8).getId() == j8) {
                    return i8;
                }
            }
            return -1;
        }
        return -1;
    }

    public GuidedAction findButtonActionById(long j8) {
        int findButtonActionPositionById = findButtonActionPositionById(j8);
        if (findButtonActionPositionById >= 0) {
            return this.mButtonActions.get(findButtonActionPositionById);
        }
        return null;
    }

    public int findButtonActionPositionById(long j8) {
        if (this.mButtonActions != null) {
            for (int i8 = 0; i8 < this.mButtonActions.size(); i8++) {
                this.mButtonActions.get(i8);
                if (this.mButtonActions.get(i8).getId() == j8) {
                    return i8;
                }
            }
            return -1;
        }
        return -1;
    }

    public void finishGuidedStepFragments() {
        FragmentManager fragmentManager = getFragmentManager();
        int backStackEntryCount = fragmentManager.getBackStackEntryCount();
        if (backStackEntryCount > 0) {
            for (int i8 = backStackEntryCount - 1; i8 >= 0; i8--) {
                FragmentManager.BackStackEntry backStackEntryAt = fragmentManager.getBackStackEntryAt(i8);
                if (isStackEntryUiStyleEntrance(backStackEntryAt.getName())) {
                    GuidedStepFragment currentGuidedStepFragment = getCurrentGuidedStepFragment(fragmentManager);
                    if (currentGuidedStepFragment != null) {
                        currentGuidedStepFragment.setUiStyle(1);
                    }
                    fragmentManager.popBackStackImmediate(backStackEntryAt.getId(), 1);
                    return;
                }
            }
        }
        ActivityCompat.finishAfterTransition(getActivity());
    }

    final String generateStackEntryName() {
        return generateStackEntryName(getUiStyle(), getClass());
    }

    public View getActionItemView(int i8) {
        RecyclerView.ViewHolder findViewHolderForPosition = this.mActionsStylist.getActionsGridView().findViewHolderForPosition(i8);
        if (findViewHolderForPosition == null) {
            return null;
        }
        return findViewHolderForPosition.itemView;
    }

    public List<GuidedAction> getActions() {
        return this.mActions;
    }

    final String getAutoRestoreKey(GuidedAction guidedAction) {
        return EXTRA_ACTION_PREFIX + guidedAction.getId();
    }

    public View getButtonActionItemView(int i8) {
        RecyclerView.ViewHolder findViewHolderForPosition = this.mButtonActionsStylist.getActionsGridView().findViewHolderForPosition(i8);
        if (findViewHolderForPosition == null) {
            return null;
        }
        return findViewHolderForPosition.itemView;
    }

    public List<GuidedAction> getButtonActions() {
        return this.mButtonActions;
    }

    final String getButtonAutoRestoreKey(GuidedAction guidedAction) {
        return EXTRA_BUTTON_ACTION_PREFIX + guidedAction.getId();
    }

    public GuidanceStylist getGuidanceStylist() {
        return this.mGuidanceStylist;
    }

    public GuidedActionsStylist getGuidedActionsStylist() {
        return this.mActionsStylist;
    }

    public GuidedActionsStylist getGuidedButtonActionsStylist() {
        return this.mButtonActionsStylist;
    }

    public int getSelectedActionPosition() {
        return this.mActionsStylist.getActionsGridView().getSelectedPosition();
    }

    public int getSelectedButtonActionPosition() {
        return this.mButtonActionsStylist.getActionsGridView().getSelectedPosition();
    }

    public int getUiStyle() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return 1;
        }
        return arguments.getInt("uiStyle", 1);
    }

    public boolean isExpanded() {
        return this.mActionsStylist.isExpanded();
    }

    public boolean isFocusOutEndAllowed() {
        return false;
    }

    public boolean isFocusOutStartAllowed() {
        return false;
    }

    public boolean isSubActionsExpanded() {
        return this.mActionsStylist.isSubActionsExpanded();
    }

    public void notifyActionChanged(int i8) {
        GuidedActionAdapter guidedActionAdapter = this.mAdapter;
        if (guidedActionAdapter != null) {
            guidedActionAdapter.notifyItemChanged(i8);
        }
    }

    public void notifyButtonActionChanged(int i8) {
        GuidedActionAdapter guidedActionAdapter = this.mButtonAdapter;
        if (guidedActionAdapter != null) {
            guidedActionAdapter.notifyItemChanged(i8);
        }
    }

    protected void onAddSharedElementTransition(FragmentTransaction fragmentTransaction, GuidedStepFragment guidedStepFragment) {
        View view = guidedStepFragment.getView();
        addNonNullSharedElementTransition(fragmentTransaction, view.findViewById(androidx.leanback.R.id.action_fragment_root), "action_fragment_root");
        addNonNullSharedElementTransition(fragmentTransaction, view.findViewById(androidx.leanback.R.id.action_fragment_background), "action_fragment_background");
        addNonNullSharedElementTransition(fragmentTransaction, view.findViewById(androidx.leanback.R.id.action_fragment), "action_fragment");
        addNonNullSharedElementTransition(fragmentTransaction, view.findViewById(androidx.leanback.R.id.guidedactions_root), "guidedactions_root");
        addNonNullSharedElementTransition(fragmentTransaction, view.findViewById(androidx.leanback.R.id.guidedactions_content), "guidedactions_content");
        addNonNullSharedElementTransition(fragmentTransaction, view.findViewById(androidx.leanback.R.id.guidedactions_list_background), "guidedactions_list_background");
        addNonNullSharedElementTransition(fragmentTransaction, view.findViewById(androidx.leanback.R.id.guidedactions_root2), "guidedactions_root2");
        addNonNullSharedElementTransition(fragmentTransaction, view.findViewById(androidx.leanback.R.id.guidedactions_content2), "guidedactions_content2");
        addNonNullSharedElementTransition(fragmentTransaction, view.findViewById(androidx.leanback.R.id.guidedactions_list_background2), "guidedactions_list_background2");
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        onProvideFragmentTransitions();
        ArrayList arrayList = new ArrayList();
        onCreateActions(arrayList, bundle);
        if (bundle != null) {
            onRestoreActions(arrayList, bundle);
        }
        setActions(arrayList);
        ArrayList arrayList2 = new ArrayList();
        onCreateButtonActions(arrayList2, bundle);
        if (bundle != null) {
            onRestoreButtonActions(arrayList2, bundle);
        }
        setButtonActions(arrayList2);
    }

    public void onCreateActions(@NonNull List<GuidedAction> list, Bundle bundle) {
    }

    public GuidedActionsStylist onCreateActionsStylist() {
        return new GuidedActionsStylist();
    }

    public View onCreateBackgroundView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(androidx.leanback.R.layout.lb_guidedstep_background, viewGroup, false);
    }

    public void onCreateButtonActions(@NonNull List<GuidedAction> list, Bundle bundle) {
    }

    public GuidedActionsStylist onCreateButtonActionsStylist() {
        GuidedActionsStylist guidedActionsStylist = new GuidedActionsStylist();
        guidedActionsStylist.setAsButtonActions();
        return guidedActionsStylist;
    }

    @NonNull
    public GuidanceStylist.Guidance onCreateGuidance(Bundle bundle) {
        return new GuidanceStylist.Guidance("", "", "", null);
    }

    public GuidanceStylist onCreateGuidanceStylist() {
        return new GuidanceStylist();
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        resolveTheme();
        LayoutInflater themeInflater = getThemeInflater(layoutInflater);
        GuidedStepRootLayout guidedStepRootLayout = (GuidedStepRootLayout) themeInflater.inflate(androidx.leanback.R.layout.lb_guidedstep_fragment, viewGroup, false);
        guidedStepRootLayout.setFocusOutStart(isFocusOutStartAllowed());
        guidedStepRootLayout.setFocusOutEnd(isFocusOutEndAllowed());
        ViewGroup viewGroup2 = (ViewGroup) guidedStepRootLayout.findViewById(androidx.leanback.R.id.content_fragment);
        ViewGroup viewGroup3 = (ViewGroup) guidedStepRootLayout.findViewById(androidx.leanback.R.id.action_fragment);
        ((NonOverlappingLinearLayout) viewGroup3).setFocusableViewAvailableFixEnabled(true);
        viewGroup2.addView(this.mGuidanceStylist.onCreateView(themeInflater, viewGroup2, onCreateGuidance(bundle)));
        viewGroup3.addView(this.mActionsStylist.onCreateView(themeInflater, viewGroup3));
        View onCreateView = this.mButtonActionsStylist.onCreateView(themeInflater, viewGroup3);
        viewGroup3.addView(onCreateView);
        GuidedActionAdapter.EditListener editListener = new GuidedActionAdapter.EditListener() { // from class: androidx.leanback.app.GuidedStepFragment.1
            @Override // androidx.leanback.widget.GuidedActionAdapter.EditListener
            public void onGuidedActionEditCanceled(GuidedAction guidedAction) {
                GuidedStepFragment.this.onGuidedActionEditCanceled(guidedAction);
            }

            @Override // androidx.leanback.widget.GuidedActionAdapter.EditListener
            public long onGuidedActionEditedAndProceed(GuidedAction guidedAction) {
                return GuidedStepFragment.this.onGuidedActionEditedAndProceed(guidedAction);
            }

            @Override // androidx.leanback.widget.GuidedActionAdapter.EditListener
            public void onImeClose() {
                GuidedStepFragment.this.runImeAnimations(false);
            }

            @Override // androidx.leanback.widget.GuidedActionAdapter.EditListener
            public void onImeOpen() {
                GuidedStepFragment.this.runImeAnimations(true);
            }
        };
        this.mAdapter = new GuidedActionAdapter(this.mActions, new GuidedActionAdapter.ClickListener() { // from class: androidx.leanback.app.GuidedStepFragment.2
            @Override // androidx.leanback.widget.GuidedActionAdapter.ClickListener
            public void onGuidedActionClicked(GuidedAction guidedAction) {
                GuidedStepFragment.this.onGuidedActionClicked(guidedAction);
                if (GuidedStepFragment.this.isExpanded()) {
                    GuidedStepFragment.this.collapseAction(true);
                } else if (guidedAction.hasSubActions() || guidedAction.hasEditableActivatorView()) {
                    GuidedStepFragment.this.expandAction(guidedAction, true);
                }
            }
        }, this, this.mActionsStylist, false);
        this.mButtonAdapter = new GuidedActionAdapter(this.mButtonActions, new GuidedActionAdapter.ClickListener() { // from class: androidx.leanback.app.GuidedStepFragment.3
            @Override // androidx.leanback.widget.GuidedActionAdapter.ClickListener
            public void onGuidedActionClicked(GuidedAction guidedAction) {
                GuidedStepFragment.this.onGuidedActionClicked(guidedAction);
            }
        }, this, this.mButtonActionsStylist, false);
        this.mSubAdapter = new GuidedActionAdapter(null, new GuidedActionAdapter.ClickListener() { // from class: androidx.leanback.app.GuidedStepFragment.4
            @Override // androidx.leanback.widget.GuidedActionAdapter.ClickListener
            public void onGuidedActionClicked(GuidedAction guidedAction) {
                if (!GuidedStepFragment.this.mActionsStylist.isInExpandTransition() && GuidedStepFragment.this.onSubGuidedActionClicked(guidedAction)) {
                    GuidedStepFragment.this.collapseSubActions();
                }
            }
        }, this, this.mActionsStylist, true);
        GuidedActionAdapterGroup guidedActionAdapterGroup = new GuidedActionAdapterGroup();
        this.mAdapterGroup = guidedActionAdapterGroup;
        guidedActionAdapterGroup.addAdpter(this.mAdapter, this.mButtonAdapter);
        this.mAdapterGroup.addAdpter(this.mSubAdapter, null);
        this.mAdapterGroup.setEditListener(editListener);
        this.mActionsStylist.setEditListener(editListener);
        this.mActionsStylist.getActionsGridView().setAdapter(this.mAdapter);
        if (this.mActionsStylist.getSubActionsGridView() != null) {
            this.mActionsStylist.getSubActionsGridView().setAdapter(this.mSubAdapter);
        }
        this.mButtonActionsStylist.getActionsGridView().setAdapter(this.mButtonAdapter);
        if (this.mButtonActions.size() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) onCreateView.getLayoutParams();
            layoutParams.weight = 0.0f;
            onCreateView.setLayoutParams(layoutParams);
        } else {
            Context context = this.mThemeWrapper;
            if (context == null) {
                context = FragmentUtil.getContext(this);
            }
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(androidx.leanback.R.attr.guidedActionContentWidthWeightTwoPanels, typedValue, true)) {
                View findViewById = guidedStepRootLayout.findViewById(androidx.leanback.R.id.action_fragment_root);
                float f8 = typedValue.getFloat();
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
                layoutParams2.weight = f8;
                findViewById.setLayoutParams(layoutParams2);
            }
        }
        View onCreateBackgroundView = onCreateBackgroundView(themeInflater, guidedStepRootLayout, bundle);
        if (onCreateBackgroundView != null) {
            ((FrameLayout) guidedStepRootLayout.findViewById(androidx.leanback.R.id.guidedstep_background_view_root)).addView(onCreateBackgroundView, 0);
        }
        return guidedStepRootLayout;
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.mGuidanceStylist.onDestroyView();
        this.mActionsStylist.onDestroyView();
        this.mButtonActionsStylist.onDestroyView();
        this.mAdapter = null;
        this.mSubAdapter = null;
        this.mButtonAdapter = null;
        this.mAdapterGroup = null;
        super.onDestroyView();
    }

    public void onGuidedActionClicked(GuidedAction guidedAction) {
    }

    public void onGuidedActionEditCanceled(GuidedAction guidedAction) {
        onGuidedActionEdited(guidedAction);
    }

    @Deprecated
    public void onGuidedActionEdited(GuidedAction guidedAction) {
    }

    public long onGuidedActionEditedAndProceed(GuidedAction guidedAction) {
        onGuidedActionEdited(guidedAction);
        return -2L;
    }

    @Override // androidx.leanback.widget.GuidedActionAdapter.FocusListener
    public void onGuidedActionFocused(GuidedAction guidedAction) {
    }

    protected void onProvideFragmentTransitions() {
        int uiStyle = getUiStyle();
        if (uiStyle == 0) {
            Object createFadeAndShortSlide = TransitionHelper.createFadeAndShortSlide(GravityCompat.END);
            TransitionHelper.exclude(createFadeAndShortSlide, androidx.leanback.R.id.guidedstep_background, true);
            int i8 = androidx.leanback.R.id.guidedactions_sub_list_background;
            TransitionHelper.exclude(createFadeAndShortSlide, i8, true);
            setEnterTransition((Transition) createFadeAndShortSlide);
            Object createFadeTransition = TransitionHelper.createFadeTransition(3);
            TransitionHelper.include(createFadeTransition, i8);
            Object createChangeBounds = TransitionHelper.createChangeBounds(false);
            Object createTransitionSet = TransitionHelper.createTransitionSet(false);
            TransitionHelper.addTransition(createTransitionSet, createFadeTransition);
            TransitionHelper.addTransition(createTransitionSet, createChangeBounds);
            setSharedElementEnterTransition((Transition) createTransitionSet);
        } else if (uiStyle == 1) {
            if (this.entranceTransitionType == 0) {
                Object createFadeTransition2 = TransitionHelper.createFadeTransition(3);
                TransitionHelper.include(createFadeTransition2, androidx.leanback.R.id.guidedstep_background);
                Object createFadeAndShortSlide2 = TransitionHelper.createFadeAndShortSlide(GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK);
                TransitionHelper.include(createFadeAndShortSlide2, androidx.leanback.R.id.content_fragment);
                TransitionHelper.include(createFadeAndShortSlide2, androidx.leanback.R.id.action_fragment_root);
                Object createTransitionSet2 = TransitionHelper.createTransitionSet(false);
                TransitionHelper.addTransition(createTransitionSet2, createFadeTransition2);
                TransitionHelper.addTransition(createTransitionSet2, createFadeAndShortSlide2);
                setEnterTransition((Transition) createTransitionSet2);
            } else {
                Object createFadeAndShortSlide3 = TransitionHelper.createFadeAndShortSlide(80);
                TransitionHelper.include(createFadeAndShortSlide3, androidx.leanback.R.id.guidedstep_background_view_root);
                Object createTransitionSet3 = TransitionHelper.createTransitionSet(false);
                TransitionHelper.addTransition(createTransitionSet3, createFadeAndShortSlide3);
                setEnterTransition((Transition) createTransitionSet3);
            }
            setSharedElementEnterTransition(null);
        } else if (uiStyle == 2) {
            setEnterTransition(null);
            setSharedElementEnterTransition(null);
        }
        Object createFadeAndShortSlide4 = TransitionHelper.createFadeAndShortSlide(GravityCompat.START);
        TransitionHelper.exclude(createFadeAndShortSlide4, androidx.leanback.R.id.guidedstep_background, true);
        TransitionHelper.exclude(createFadeAndShortSlide4, androidx.leanback.R.id.guidedactions_sub_list_background, true);
        setExitTransition((Transition) createFadeAndShortSlide4);
    }

    public int onProvideTheme() {
        return -1;
    }

    final void onRestoreActions(List<GuidedAction> list, Bundle bundle) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            GuidedAction guidedAction = list.get(i8);
            if (isSaveEnabled(guidedAction)) {
                guidedAction.onRestoreInstanceState(bundle, getAutoRestoreKey(guidedAction));
            }
        }
    }

    final void onRestoreButtonActions(List<GuidedAction> list, Bundle bundle) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            GuidedAction guidedAction = list.get(i8);
            if (isSaveEnabled(guidedAction)) {
                guidedAction.onRestoreInstanceState(bundle, getButtonAutoRestoreKey(guidedAction));
            }
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        getView().findViewById(androidx.leanback.R.id.action_fragment).requestFocus();
    }

    final void onSaveActions(List<GuidedAction> list, Bundle bundle) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            GuidedAction guidedAction = list.get(i8);
            if (isSaveEnabled(guidedAction)) {
                guidedAction.onSaveInstanceState(bundle, getAutoRestoreKey(guidedAction));
            }
        }
    }

    final void onSaveButtonActions(List<GuidedAction> list, Bundle bundle) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            GuidedAction guidedAction = list.get(i8);
            if (isSaveEnabled(guidedAction)) {
                guidedAction.onSaveInstanceState(bundle, getButtonAutoRestoreKey(guidedAction));
            }
        }
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        onSaveActions(this.mActions, bundle);
        onSaveButtonActions(this.mButtonActions, bundle);
    }

    public boolean onSubGuidedActionClicked(GuidedAction guidedAction) {
        return true;
    }

    public void openInEditMode(GuidedAction guidedAction) {
        this.mActionsStylist.openInEditMode(guidedAction);
    }

    public void popBackStackToGuidedStepFragment(Class cls, int i8) {
        if (!GuidedStepFragment.class.isAssignableFrom(cls)) {
            return;
        }
        FragmentManager fragmentManager = getFragmentManager();
        int backStackEntryCount = fragmentManager.getBackStackEntryCount();
        String name = cls.getName();
        if (backStackEntryCount > 0) {
            for (int i9 = backStackEntryCount - 1; i9 >= 0; i9--) {
                FragmentManager.BackStackEntry backStackEntryAt = fragmentManager.getBackStackEntryAt(i9);
                if (name.equals(getGuidedStepFragmentClassName(backStackEntryAt.getName()))) {
                    fragmentManager.popBackStackImmediate(backStackEntryAt.getId(), i8);
                    return;
                }
            }
        }
    }

    void runImeAnimations(boolean z8) {
        ArrayList arrayList = new ArrayList();
        if (z8) {
            this.mGuidanceStylist.onImeAppearing(arrayList);
            this.mActionsStylist.onImeAppearing(arrayList);
            this.mButtonActionsStylist.onImeAppearing(arrayList);
        } else {
            this.mGuidanceStylist.onImeDisappearing(arrayList);
            this.mActionsStylist.onImeDisappearing(arrayList);
            this.mButtonActionsStylist.onImeDisappearing(arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
    }

    public void setActions(List<GuidedAction> list) {
        this.mActions = list;
        GuidedActionAdapter guidedActionAdapter = this.mAdapter;
        if (guidedActionAdapter != null) {
            guidedActionAdapter.setActions(list);
        }
    }

    public void setActionsDiffCallback(DiffCallback<GuidedAction> diffCallback) {
        this.mAdapter.setDiffCallback(diffCallback);
    }

    public void setButtonActions(List<GuidedAction> list) {
        this.mButtonActions = list;
        GuidedActionAdapter guidedActionAdapter = this.mButtonAdapter;
        if (guidedActionAdapter != null) {
            guidedActionAdapter.setActions(list);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setEntranceTransitionType(int i8) {
        this.entranceTransitionType = i8;
    }

    public void setSelectedActionPosition(int i8) {
        this.mActionsStylist.getActionsGridView().setSelectedPosition(i8);
    }

    public void setSelectedButtonActionPosition(int i8) {
        this.mButtonActionsStylist.getActionsGridView().setSelectedPosition(i8);
    }

    public void setUiStyle(int i8) {
        boolean z8;
        int uiStyle = getUiStyle();
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            z8 = true;
        } else {
            z8 = false;
        }
        arguments.putInt("uiStyle", i8);
        if (z8) {
            setArguments(arguments);
        }
        if (i8 != uiStyle) {
            onProvideFragmentTransitions();
        }
    }

    public static int add(FragmentManager fragmentManager, GuidedStepFragment guidedStepFragment, int i8) {
        GuidedStepFragment currentGuidedStepFragment = getCurrentGuidedStepFragment(fragmentManager);
        int i9 = currentGuidedStepFragment != null ? 1 : 0;
        if (Build.VERSION.SDK_INT < 23 && i9 == 0) {
            fragmentManager.beginTransaction().replace(i8, new DummyFragment(), TAG_LEAN_BACK_ACTIONS_FRAGMENT).commit();
        }
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        guidedStepFragment.setUiStyle(1 ^ i9);
        beginTransaction.addToBackStack(guidedStepFragment.generateStackEntryName());
        if (currentGuidedStepFragment != null) {
            guidedStepFragment.onAddSharedElementTransition(beginTransaction, currentGuidedStepFragment);
        }
        return beginTransaction.replace(i8, guidedStepFragment, TAG_LEAN_BACK_ACTIONS_FRAGMENT).commit();
    }

    static String generateStackEntryName(int i8, Class cls) {
        if (i8 == 0) {
            return ENTRY_NAME_REPLACE + cls.getName();
        }
        if (i8 != 1) {
            return "";
        }
        return ENTRY_NAME_ENTRANCE + cls.getName();
    }
}
