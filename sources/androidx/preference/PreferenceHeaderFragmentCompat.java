package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.annotation.CallSuper;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.t;
import androidx.lifecycle.LifecycleOwner;
import androidx.preference.PreferenceFragmentCompat;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public abstract class PreferenceHeaderFragmentCompat extends Fragment implements PreferenceFragmentCompat.OnPreferenceStartFragmentCallback {
    private OnBackPressedCallback onBackPressedCallback;

    /* loaded from: classes3.dex */
    private static final class InnerOnBackPressedCallback extends OnBackPressedCallback implements SlidingPaneLayout.PanelSlideListener {
        private final PreferenceHeaderFragmentCompat caller;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InnerOnBackPressedCallback(PreferenceHeaderFragmentCompat caller) {
            super(true);
            AbstractC3292y.i(caller, "caller");
            this.caller = caller;
            caller.getSlidingPaneLayout().addPanelSlideListener(this);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            this.caller.getSlidingPaneLayout().closePane();
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelClosed(View panel) {
            AbstractC3292y.i(panel, "panel");
            setEnabled(false);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelOpened(View panel) {
            AbstractC3292y.i(panel, "panel");
            setEnabled(true);
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public void onPanelSlide(View panel, float f8) {
            AbstractC3292y.i(panel, "panel");
        }
    }

    private final SlidingPaneLayout buildContentView(LayoutInflater layoutInflater) {
        SlidingPaneLayout slidingPaneLayout = new SlidingPaneLayout(layoutInflater.getContext());
        slidingPaneLayout.setId(R.id.preferences_sliding_pane_layout);
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView.setId(R.id.preferences_header);
        SlidingPaneLayout.LayoutParams layoutParams = new SlidingPaneLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.preferences_header_width), -1);
        layoutParams.weight = getResources().getInteger(R.integer.preferences_header_pane_weight);
        slidingPaneLayout.addView(fragmentContainerView, layoutParams);
        FragmentContainerView fragmentContainerView2 = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView2.setId(R.id.preferences_detail);
        SlidingPaneLayout.LayoutParams layoutParams2 = new SlidingPaneLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.preferences_detail_width), -1);
        layoutParams2.weight = getResources().getInteger(R.integer.preferences_detail_pane_weight);
        slidingPaneLayout.addView(fragmentContainerView2, layoutParams2);
        return slidingPaneLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-10, reason: not valid java name */
    public static final void m5447onViewCreated$lambda10(PreferenceHeaderFragmentCompat this$0) {
        boolean z8;
        AbstractC3292y.i(this$0, "this$0");
        OnBackPressedCallback onBackPressedCallback = this$0.onBackPressedCallback;
        AbstractC3292y.f(onBackPressedCallback);
        if (this$0.getChildFragmentManager().getBackStackEntryCount() == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        onBackPressedCallback.setEnabled(z8);
    }

    private final void openPreferenceHeader(Preference preference) {
        if (preference.getFragment() == null) {
            openPreferenceHeader(preference.getIntent());
            return;
        }
        String fragment = preference.getFragment();
        Fragment instantiate = fragment == null ? null : getChildFragmentManager().getFragmentFactory().instantiate(requireContext().getClassLoader(), fragment);
        if (instantiate != null) {
            instantiate.setArguments(preference.getExtras());
        }
        if (getChildFragmentManager().getBackStackEntryCount() > 0) {
            FragmentManager.BackStackEntry backStackEntryAt = getChildFragmentManager().getBackStackEntryAt(0);
            AbstractC3292y.h(backStackEntryAt, "childFragmentManager.getBackStackEntryAt(0)");
            getChildFragmentManager().popBackStack(backStackEntryAt.getId(), 1);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        AbstractC3292y.h(childFragmentManager, "childFragmentManager");
        FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
        AbstractC3292y.h(beginTransaction, "beginTransaction()");
        beginTransaction.setReorderingAllowed(true);
        int i8 = R.id.preferences_detail;
        AbstractC3292y.f(instantiate);
        beginTransaction.replace(i8, instantiate);
        if (getSlidingPaneLayout().isOpen()) {
            beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        }
        getSlidingPaneLayout().openPane();
        beginTransaction.commit();
    }

    public final SlidingPaneLayout getSlidingPaneLayout() {
        return (SlidingPaneLayout) requireView();
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onAttach(Context context) {
        AbstractC3292y.i(context, "context");
        super.onAttach(context);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        AbstractC3292y.h(parentFragmentManager, "parentFragmentManager");
        FragmentTransaction beginTransaction = parentFragmentManager.beginTransaction();
        AbstractC3292y.h(beginTransaction, "beginTransaction()");
        beginTransaction.setPrimaryNavigationFragment(this);
        beginTransaction.commit();
    }

    public Fragment onCreateInitialDetailFragment() {
        Fragment findFragmentById = getChildFragmentManager().findFragmentById(R.id.preferences_header);
        if (findFragmentById != null) {
            PreferenceFragmentCompat preferenceFragmentCompat = (PreferenceFragmentCompat) findFragmentById;
            Fragment fragment = null;
            if (preferenceFragmentCompat.getPreferenceScreen().getPreferenceCount() <= 0) {
                return null;
            }
            int preferenceCount = preferenceFragmentCompat.getPreferenceScreen().getPreferenceCount();
            int i8 = 0;
            while (true) {
                if (i8 >= preferenceCount) {
                    break;
                }
                int i9 = i8 + 1;
                Preference preference = preferenceFragmentCompat.getPreferenceScreen().getPreference(i8);
                AbstractC3292y.h(preference, "headerFragment.preferenc…reen.getPreference(index)");
                if (preference.getFragment() == null) {
                    i8 = i9;
                } else {
                    String fragment2 = preference.getFragment();
                    if (fragment2 != null) {
                        fragment = getChildFragmentManager().getFragmentFactory().instantiate(requireContext().getClassLoader(), fragment2);
                    }
                    if (fragment != null) {
                        fragment.setArguments(preference.getExtras());
                    }
                }
            }
            return fragment;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.preference.PreferenceFragmentCompat");
    }

    public abstract PreferenceFragmentCompat onCreatePreferenceHeader();

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3292y.i(inflater, "inflater");
        SlidingPaneLayout buildContentView = buildContentView(inflater);
        FragmentManager childFragmentManager = getChildFragmentManager();
        int i8 = R.id.preferences_header;
        if (childFragmentManager.findFragmentById(i8) == null) {
            PreferenceFragmentCompat onCreatePreferenceHeader = onCreatePreferenceHeader();
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            AbstractC3292y.h(childFragmentManager2, "childFragmentManager");
            FragmentTransaction beginTransaction = childFragmentManager2.beginTransaction();
            AbstractC3292y.h(beginTransaction, "beginTransaction()");
            beginTransaction.setReorderingAllowed(true);
            beginTransaction.add(i8, onCreatePreferenceHeader);
            beginTransaction.commit();
        }
        buildContentView.setLockMode(3);
        return buildContentView;
    }

    @Override // androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback
    @CallSuper
    public boolean onPreferenceStartFragment(PreferenceFragmentCompat caller, Preference pref) {
        AbstractC3292y.i(caller, "caller");
        AbstractC3292y.i(pref, "pref");
        if (caller.getId() == R.id.preferences_header) {
            openPreferenceHeader(pref);
            return true;
        }
        int id = caller.getId();
        int i8 = R.id.preferences_detail;
        if (id == i8) {
            FragmentFactory fragmentFactory = getChildFragmentManager().getFragmentFactory();
            ClassLoader classLoader = requireContext().getClassLoader();
            String fragment = pref.getFragment();
            AbstractC3292y.f(fragment);
            Fragment instantiate = fragmentFactory.instantiate(classLoader, fragment);
            AbstractC3292y.h(instantiate, "childFragmentManager.fra….fragment!!\n            )");
            instantiate.setArguments(pref.getExtras());
            FragmentManager childFragmentManager = getChildFragmentManager();
            AbstractC3292y.h(childFragmentManager, "childFragmentManager");
            FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
            AbstractC3292y.h(beginTransaction, "beginTransaction()");
            beginTransaction.setReorderingAllowed(true);
            beginTransaction.replace(i8, instantiate);
            beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            beginTransaction.addToBackStack(null);
            beginTransaction.commit();
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onViewCreated(View view, Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        boolean z8;
        AbstractC3292y.i(view, "view");
        super.onViewCreated(view, bundle);
        this.onBackPressedCallback = new InnerOnBackPressedCallback(this);
        SlidingPaneLayout slidingPaneLayout = getSlidingPaneLayout();
        if (ViewCompat.isLaidOut(slidingPaneLayout) && !slidingPaneLayout.isLayoutRequested()) {
            OnBackPressedCallback onBackPressedCallback = this.onBackPressedCallback;
            AbstractC3292y.f(onBackPressedCallback);
            if (getSlidingPaneLayout().isSlideable() && getSlidingPaneLayout().isOpen()) {
                z8 = true;
            } else {
                z8 = false;
            }
            onBackPressedCallback.setEnabled(z8);
        } else {
            slidingPaneLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.preference.PreferenceHeaderFragmentCompat$onViewCreated$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                    boolean z9;
                    AbstractC3292y.j(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    OnBackPressedCallback onBackPressedCallback2 = PreferenceHeaderFragmentCompat.this.onBackPressedCallback;
                    AbstractC3292y.f(onBackPressedCallback2);
                    if (PreferenceHeaderFragmentCompat.this.getSlidingPaneLayout().isSlideable() && PreferenceHeaderFragmentCompat.this.getSlidingPaneLayout().isOpen()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    onBackPressedCallback2.setEnabled(z9);
                }
            });
        }
        getChildFragmentManager().addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() { // from class: androidx.preference.b
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z9) {
                t.a(this, fragment, z9);
            }

            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z9) {
                t.b(this, fragment, z9);
            }

            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void onBackStackChanged() {
                PreferenceHeaderFragmentCompat.m5447onViewCreated$lambda10(PreferenceHeaderFragmentCompat.this);
            }
        });
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = ViewTreeOnBackPressedDispatcherOwner.get(view);
        if (onBackPressedDispatcherOwner != null && (onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher()) != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            OnBackPressedCallback onBackPressedCallback2 = this.onBackPressedCallback;
            AbstractC3292y.f(onBackPressedCallback2);
            onBackPressedDispatcher.addCallback(viewLifecycleOwner, onBackPressedCallback2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Fragment onCreateInitialDetailFragment;
        super.onViewStateRestored(bundle);
        if (bundle == null && (onCreateInitialDetailFragment = onCreateInitialDetailFragment()) != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            AbstractC3292y.h(childFragmentManager, "childFragmentManager");
            FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
            AbstractC3292y.h(beginTransaction, "beginTransaction()");
            beginTransaction.setReorderingAllowed(true);
            beginTransaction.replace(R.id.preferences_detail, onCreateInitialDetailFragment);
            beginTransaction.commit();
        }
    }

    private final void openPreferenceHeader(Intent intent) {
        if (intent == null) {
            return;
        }
        startActivity(intent);
    }
}
