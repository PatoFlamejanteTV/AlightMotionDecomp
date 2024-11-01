package androidx.navigation;

import Q5.InterfaceC1416k;
import Q5.l;
import Q5.x;
import R5.AbstractC1428l;
import R5.AbstractC1435t;
import R5.C1427k;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.NavDeepLinkRequest;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k6.AbstractC3258j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3274f;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.Z;
import p6.EnumC3588a;
import q6.AbstractC3804C;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.v;
import q6.w;

/* loaded from: classes3.dex */
public class NavController {
    private static final String KEY_BACK_STACK = "android-support-nav:controller:backStack";
    private static final String KEY_BACK_STACK_DEST_IDS = "android-support-nav:controller:backStackDestIds";
    private static final String KEY_BACK_STACK_IDS = "android-support-nav:controller:backStackIds";
    private static final String KEY_BACK_STACK_STATES_IDS = "android-support-nav:controller:backStackStates";
    private static final String KEY_BACK_STACK_STATES_PREFIX = "android-support-nav:controller:backStackStates:";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_ARGS = "android-support-nav:controller:deepLinkArgs";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_EXTRAS = "android-support-nav:controller:deepLinkExtras";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_HANDLED = "android-support-nav:controller:deepLinkHandled";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_DEEP_LINK_IDS = "android-support-nav:controller:deepLinkIds";
    public static final String KEY_DEEP_LINK_INTENT = "android-support-nav:controller:deepLinkIntent";
    private static final String KEY_NAVIGATOR_STATE = "android-support-nav:controller:navigatorState";
    private static final String KEY_NAVIGATOR_STATE_NAMES = "android-support-nav:controller:navigatorState:names";
    private static final String TAG = "NavController";
    private final w _currentBackStack;
    private final v _currentBackStackEntryFlow;
    private NavGraph _graph;
    private NavigatorProvider _navigatorProvider;
    private final w _visibleEntries;
    private Activity activity;
    private Function1 addToBackStackHandler;
    private final C1427k backQueue;
    private final List<NavBackStackEntry> backStackEntriesToDispatch;
    private final Map<Integer, String> backStackMap;
    private final Map<String, C1427k> backStackStates;
    private Parcelable[] backStackToRestore;
    private final Map<NavBackStackEntry, NavBackStackEntry> childToParentEntries;
    private final Context context;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private final InterfaceC3813L currentBackStack;
    private final InterfaceC3821f currentBackStackEntryFlow;
    private boolean deepLinkHandled;
    private int dispatchReentrantCount;
    private boolean enableOnBackPressedCallback;
    private final Map<NavBackStackEntry, Boolean> entrySavedState;
    private Lifecycle.State hostLifecycleState;
    private NavInflater inflater;
    private final LifecycleObserver lifecycleObserver;
    private LifecycleOwner lifecycleOwner;
    private final InterfaceC1416k navInflater$delegate;
    private final Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> navigatorState;
    private Bundle navigatorStateToRestore;
    private final OnBackPressedCallback onBackPressedCallback;
    private OnBackPressedDispatcher onBackPressedDispatcher;
    private final CopyOnWriteArrayList<OnDestinationChangedListener> onDestinationChangedListeners;
    private final Map<NavBackStackEntry, AtomicInteger> parentToChildCount;
    private Function1 popFromBackStackHandler;
    private NavControllerViewModel viewModel;
    private final InterfaceC3813L visibleEntries;
    public static final Companion Companion = new Companion(null);
    private static boolean deepLinkSaveState = true;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getKEY_DEEP_LINK_EXTRAS$annotations() {
        }

        @NavDeepLinkSaveStateControl
        public final void enableDeepLinkSaveState(boolean z8) {
            NavController.deepLinkSaveState = z8;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class NavControllerNavigatorState extends NavigatorState {
        private final Navigator<? extends NavDestination> navigator;
        final /* synthetic */ NavController this$0;

        public NavControllerNavigatorState(NavController navController, Navigator<? extends NavDestination> navigator) {
            AbstractC3292y.i(navigator, "navigator");
            this.this$0 = navController;
            this.navigator = navigator;
        }

        public final void addInternal(NavBackStackEntry backStackEntry) {
            AbstractC3292y.i(backStackEntry, "backStackEntry");
            super.push(backStackEntry);
        }

        @Override // androidx.navigation.NavigatorState
        public NavBackStackEntry createBackStackEntry(NavDestination destination, Bundle bundle) {
            AbstractC3292y.i(destination, "destination");
            return NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, this.this$0.getContext(), destination, bundle, this.this$0.getHostLifecycleState$navigation_runtime_release(), this.this$0.viewModel, null, null, 96, null);
        }

        public final Navigator<? extends NavDestination> getNavigator() {
            return this.navigator;
        }

        @Override // androidx.navigation.NavigatorState
        public void markTransitionComplete(NavBackStackEntry entry) {
            NavControllerViewModel navControllerViewModel;
            AbstractC3292y.i(entry, "entry");
            boolean d8 = AbstractC3292y.d(this.this$0.entrySavedState.get(entry), Boolean.TRUE);
            super.markTransitionComplete(entry);
            this.this$0.entrySavedState.remove(entry);
            if (!this.this$0.backQueue.contains(entry)) {
                this.this$0.unlinkChildFromParent$navigation_runtime_release(entry);
                if (entry.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                    entry.setMaxLifecycle(Lifecycle.State.DESTROYED);
                }
                C1427k c1427k = this.this$0.backQueue;
                if (!(c1427k instanceof Collection) || !c1427k.isEmpty()) {
                    Iterator<E> it = c1427k.iterator();
                    while (it.hasNext()) {
                        if (AbstractC3292y.d(((NavBackStackEntry) it.next()).getId(), entry.getId())) {
                            break;
                        }
                    }
                }
                if (!d8 && (navControllerViewModel = this.this$0.viewModel) != null) {
                    navControllerViewModel.clear(entry.getId());
                }
                this.this$0.updateBackStackLifecycle$navigation_runtime_release();
                this.this$0._visibleEntries.d(this.this$0.populateVisibleEntries$navigation_runtime_release());
                return;
            }
            if (!isNavigating()) {
                this.this$0.updateBackStackLifecycle$navigation_runtime_release();
                this.this$0._currentBackStack.d(AbstractC1435t.Z0(this.this$0.backQueue));
                this.this$0._visibleEntries.d(this.this$0.populateVisibleEntries$navigation_runtime_release());
            }
        }

        @Override // androidx.navigation.NavigatorState
        public void pop(NavBackStackEntry popUpTo, boolean z8) {
            AbstractC3292y.i(popUpTo, "popUpTo");
            Navigator navigator = this.this$0._navigatorProvider.getNavigator(popUpTo.getDestination().getNavigatorName());
            if (AbstractC3292y.d(navigator, this.navigator)) {
                Function1 function1 = this.this$0.popFromBackStackHandler;
                if (function1 != null) {
                    function1.invoke(popUpTo);
                    super.pop(popUpTo, z8);
                    return;
                } else {
                    this.this$0.popBackStackFromNavigator$navigation_runtime_release(popUpTo, new NavController$NavControllerNavigatorState$pop$1(this, popUpTo, z8));
                    return;
                }
            }
            Object obj = this.this$0.navigatorState.get(navigator);
            AbstractC3292y.f(obj);
            ((NavControllerNavigatorState) obj).pop(popUpTo, z8);
        }

        @Override // androidx.navigation.NavigatorState
        public void popWithTransition(NavBackStackEntry popUpTo, boolean z8) {
            AbstractC3292y.i(popUpTo, "popUpTo");
            super.popWithTransition(popUpTo, z8);
            this.this$0.entrySavedState.put(popUpTo, Boolean.valueOf(z8));
        }

        @Override // androidx.navigation.NavigatorState
        public void prepareForTransition(NavBackStackEntry entry) {
            AbstractC3292y.i(entry, "entry");
            super.prepareForTransition(entry);
            if (this.this$0.backQueue.contains(entry)) {
                entry.setMaxLifecycle(Lifecycle.State.STARTED);
                return;
            }
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }

        @Override // androidx.navigation.NavigatorState
        public void push(NavBackStackEntry backStackEntry) {
            AbstractC3292y.i(backStackEntry, "backStackEntry");
            Navigator navigator = this.this$0._navigatorProvider.getNavigator(backStackEntry.getDestination().getNavigatorName());
            if (AbstractC3292y.d(navigator, this.navigator)) {
                Function1 function1 = this.this$0.addToBackStackHandler;
                if (function1 != null) {
                    function1.invoke(backStackEntry);
                    addInternal(backStackEntry);
                    return;
                }
                Log.i(NavController.TAG, "Ignoring add of destination " + backStackEntry.getDestination() + " outside of the call to navigate(). ");
                return;
            }
            Object obj = this.this$0.navigatorState.get(navigator);
            if (obj != null) {
                ((NavControllerNavigatorState) obj).push(backStackEntry);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.getDestination().getNavigatorName() + " should already be created").toString());
        }
    }

    /* loaded from: classes3.dex */
    public interface OnDestinationChangedListener {
        void onDestinationChanged(NavController navController, NavDestination navDestination, Bundle bundle);
    }

    public NavController(Context context) {
        Object obj;
        AbstractC3292y.i(context, "context");
        this.context = context;
        Iterator it = AbstractC3258j.h(context, NavController$activity$1.INSTANCE).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.activity = (Activity) obj;
        this.backQueue = new C1427k();
        w a9 = AbstractC3815N.a(AbstractC1435t.m());
        this._currentBackStack = a9;
        this.currentBackStack = AbstractC3823h.b(a9);
        w a10 = AbstractC3815N.a(AbstractC1435t.m());
        this._visibleEntries = a10;
        this.visibleEntries = AbstractC3823h.b(a10);
        this.childToParentEntries = new LinkedHashMap();
        this.parentToChildCount = new LinkedHashMap();
        this.backStackMap = new LinkedHashMap();
        this.backStackStates = new LinkedHashMap();
        this.onDestinationChangedListeners = new CopyOnWriteArrayList<>();
        this.hostLifecycleState = Lifecycle.State.INITIALIZED;
        this.lifecycleObserver = new LifecycleEventObserver() { // from class: androidx.navigation.a
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                NavController.lifecycleObserver$lambda$2(NavController.this, lifecycleOwner, event);
            }
        };
        this.onBackPressedCallback = new OnBackPressedCallback() { // from class: androidx.navigation.NavController$onBackPressedCallback$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(false);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                NavController.this.popBackStack();
            }
        };
        this.enableOnBackPressedCallback = true;
        this._navigatorProvider = new NavigatorProvider();
        this.navigatorState = new LinkedHashMap();
        this.entrySavedState = new LinkedHashMap();
        NavigatorProvider navigatorProvider = this._navigatorProvider;
        navigatorProvider.addNavigator(new NavGraphNavigator(navigatorProvider));
        this._navigatorProvider.addNavigator(new ActivityNavigator(this.context));
        this.backStackEntriesToDispatch = new ArrayList();
        this.navInflater$delegate = l.b(new NavController$navInflater$2(this));
        v b9 = AbstractC3804C.b(1, 0, EnumC3588a.DROP_OLDEST, 2, null);
        this._currentBackStackEntryFlow = b9;
        this.currentBackStackEntryFlow = AbstractC3823h.a(b9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0256, code lost:            r0 = r9.iterator();     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x025e, code lost:            if (r0.hasNext() == false) goto L135;     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0260, code lost:            r1 = (androidx.navigation.NavBackStackEntry) r0.next();        r2 = r32.navigatorState.get(r32._navigatorProvider.getNavigator(r1.getDestination().getNavigatorName()));     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x027a, code lost:            if (r2 == null) goto L134;     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x027c, code lost:            r2.addInternal(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02a5, code lost:            throw new java.lang.IllegalStateException(("NavigatorBackStack for " + r33.getNavigatorName() + " should already be created").toString());     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02a6, code lost:            r32.backQueue.addAll(r9);        r32.backQueue.add(r8);        r0 = R5.AbstractC1435t.H0(r9, r8).iterator();     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02be, code lost:            if (r0.hasNext() == false) goto L137;     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02c0, code lost:            r1 = (androidx.navigation.NavBackStackEntry) r0.next();        r2 = r1.getDestination().getParent();     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02ce, code lost:            if (r2 == null) goto L139;     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02d0, code lost:            linkChildToParent(r1, getBackStackEntry(r2.getId()));     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02dc, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01f3, code lost:            r0 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0189, code lost:            r12 = ((androidx.navigation.NavBackStackEntry) r9.first()).getDestination();     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x010e, code lost:            r0 = ((androidx.navigation.NavBackStackEntry) r9.first()).getDestination();     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00e4, code lost:            r13 = r0;        r14 = r2;        r11 = r3;        r9 = r5;     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00e8, code lost:            r12 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00aa, code lost:            r20 = r12;        r0 = r13;        r8 = r14;        r2 = r15;     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x007c, code lost:            r1 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00ea, code lost:            r11 = r3;        r9 = r5;        r20 = r12;        r8 = r14;        r14 = r15;     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x00ff, code lost:            r9 = r5;        r20 = r12;        r8 = r14;        r14 = r15;        r12 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:            r5 = new R5.C1427k();        r4 = true;        r18 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:            if ((r33 instanceof androidx.navigation.NavGraph) == false) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:            r0 = r12;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:            kotlin.jvm.internal.AbstractC3292y.f(r0);        r3 = r0.getParent();     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:            if (r3 == null) goto L33;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:            r0 = r13.listIterator(r36.size());     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:            if (r0.hasPrevious() == false) goto L114;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:            r1 = r0.previous();     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:            if (kotlin.jvm.internal.AbstractC3292y.d(r1.getDestination(), r3) == false) goto L116;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:            r1 = r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:            if (r1 != null) goto L25;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:            r20 = r12;        r0 = r13;        r2 = r15;        r8 = r14;        r1 = androidx.navigation.NavBackStackEntry.Companion.create$default(androidx.navigation.NavBackStackEntry.Companion, r32.context, r3, r34, getHostLifecycleState$navigation_runtime_release(), r32.viewModel, null, null, 96, null);     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00af, code lost:            r5.c(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:            if ((r32.backQueue.isEmpty() ^ r4) == false) goto L31;     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0010, code lost:            if ((r12 instanceof androidx.navigation.FloatingWindow) == false) goto L4;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:            if (((androidx.navigation.NavBackStackEntry) r32.backQueue.last()).getDestination() != r3) goto L31;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c9, code lost:            r13 = r0;        r14 = r2;        r11 = r3;        r12 = true;        r9 = r5;        popEntryFromBackStack$default(r32, (androidx.navigation.NavBackStackEntry) r32.backQueue.last(), false, null, 6, null);     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f1, code lost:            if (r11 == null) goto L112;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f3, code lost:            if (r11 != r33) goto L37;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f6, code lost:            r5 = r9;        r0 = r11;        r15 = r14;        r12 = r20;        r4 = true;        r14 = r8;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0109, code lost:            if (r9.isEmpty() == false) goto L42;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010b, code lost:            r0 = r20;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0118, code lost:            if (r0 == null) goto L118;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0122, code lost:            if (findDestination(r0.getId()) == r0) goto L117;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0124, code lost:            r0 = r0.getParent();     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0128, code lost:            if (r0 == null) goto L121;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012a, code lost:            if (r14 == null) goto L52;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0130, code lost:            if (r34.isEmpty() != r12) goto L52;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0132, code lost:            r15 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:            if (r32.backQueue.isEmpty() != false) goto L110;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0136, code lost:            r1 = r13.listIterator(r36.size());     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0142, code lost:            if (r1.hasPrevious() == false) goto L124;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0144, code lost:            r2 = r1.previous();     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0153, code lost:            if (kotlin.jvm.internal.AbstractC3292y.d(r2.getDestination(), r0) == false) goto L126;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0158, code lost:            r2 = r2;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015a, code lost:            if (r2 != null) goto L63;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015c, code lost:            r2 = androidx.navigation.NavBackStackEntry.Companion.create$default(androidx.navigation.NavBackStackEntry.Companion, r32.context, r0, r0.addInDefaultArgs(r15), getHostLifecycleState$navigation_runtime_release(), r32.viewModel, null, null, 96, null);     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017c, code lost:            r9.c(r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0156, code lost:            r2 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0135, code lost:            r15 = r14;     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0184, code lost:            if (r9.isEmpty() == false) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:            if ((((androidx.navigation.NavBackStackEntry) r32.backQueue.last()).getDestination() instanceof androidx.navigation.FloatingWindow) == false) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0186, code lost:            r12 = r20;     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0199, code lost:            if (r32.backQueue.isEmpty() != false) goto L129;     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a9, code lost:            if ((((androidx.navigation.NavBackStackEntry) r32.backQueue.last()).getDestination() instanceof androidx.navigation.NavGraph) == false) goto L128;     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ab, code lost:            r0 = ((androidx.navigation.NavBackStackEntry) r32.backQueue.last()).getDestination();        kotlin.jvm.internal.AbstractC3292y.g(r0, "null cannot be cast to non-null type androidx.navigation.NavGraph");     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c7, code lost:            if (((androidx.navigation.NavGraph) r0).findNode(r12.getId(), false) != null) goto L127;     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c9, code lost:            popEntryFromBackStack$default(r32, (androidx.navigation.NavBackStackEntry) r32.backQueue.last(), false, null, 6, null);     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01dc, code lost:            r0 = (androidx.navigation.NavBackStackEntry) r32.backQueue.n();     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e4, code lost:            if (r0 != null) goto L78;     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01e6, code lost:            r0 = (androidx.navigation.NavBackStackEntry) r9.n();     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ec, code lost:            if (r0 == null) goto L80;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ee, code lost:            r0 = r0.getDestination();     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01fb, code lost:            if (kotlin.jvm.internal.AbstractC3292y.d(r0, r32._graph) != false) goto L93;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01fd, code lost:            r0 = r13.listIterator(r36.size());     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0209, code lost:            if (r0.hasPrevious() == false) goto L131;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:            if (popBackStackInternal$default(r32, ((androidx.navigation.NavBackStackEntry) r32.backQueue.last()).getDestination().getId(), true, false, 4, null) != false) goto L111;     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x020b, code lost:            r1 = r0.previous();        r2 = r1.getDestination();        r3 = r32._graph;        kotlin.jvm.internal.AbstractC3292y.f(r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x021f, code lost:            if (kotlin.jvm.internal.AbstractC3292y.d(r2, r3) == false) goto L133;     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0221, code lost:            r18 = r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0223, code lost:            r18 = r18;     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0225, code lost:            if (r18 != null) goto L92;     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0227, code lost:            r19 = androidx.navigation.NavBackStackEntry.Companion;        r0 = r32.context;        r1 = r32._graph;        kotlin.jvm.internal.AbstractC3292y.f(r1);        r2 = r32._graph;        kotlin.jvm.internal.AbstractC3292y.f(r2);        r18 = androidx.navigation.NavBackStackEntry.Companion.create$default(r19, r0, r1, r2.addInDefaultArgs(r14), getHostLifecycleState$navigation_runtime_release(), r32.viewModel, null, null, 96, null);     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0251, code lost:            r9.c(r18);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void addEntryToBackStack(androidx.navigation.NavDestination r33, android.os.Bundle r34, androidx.navigation.NavBackStackEntry r35, java.util.List<androidx.navigation.NavBackStackEntry> r36) {
        /*
            Method dump skipped, instructions count: 733
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.addEntryToBackStack(androidx.navigation.NavDestination, android.os.Bundle, androidx.navigation.NavBackStackEntry, java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addEntryToBackStack$default(NavController navController, NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 8) != 0) {
                list = AbstractC1435t.m();
            }
            navController.addEntryToBackStack(navDestination, bundle, navBackStackEntry, list);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
    }

    @MainThread
    private final boolean clearBackStackInternal(@IdRes int i8) {
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavControllerNavigatorState) it.next()).setNavigating(true);
        }
        boolean restoreStateInternal = restoreStateInternal(i8, null, NavOptionsBuilderKt.navOptions(NavController$clearBackStackInternal$restored$1.INSTANCE), null);
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((NavControllerNavigatorState) it2.next()).setNavigating(false);
        }
        return restoreStateInternal && popBackStackInternal(i8, true, false);
    }

    private final boolean dispatchOnDestinationChanged() {
        while (!this.backQueue.isEmpty() && (((NavBackStackEntry) this.backQueue.last()).getDestination() instanceof NavGraph)) {
            popEntryFromBackStack$default(this, (NavBackStackEntry) this.backQueue.last(), false, null, 6, null);
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.q();
        if (navBackStackEntry != null) {
            this.backStackEntriesToDispatch.add(navBackStackEntry);
        }
        this.dispatchReentrantCount++;
        updateBackStackLifecycle$navigation_runtime_release();
        int i8 = this.dispatchReentrantCount - 1;
        this.dispatchReentrantCount = i8;
        if (i8 == 0) {
            List<NavBackStackEntry> Z02 = AbstractC1435t.Z0(this.backStackEntriesToDispatch);
            this.backStackEntriesToDispatch.clear();
            for (NavBackStackEntry navBackStackEntry2 : Z02) {
                Iterator<OnDestinationChangedListener> it = this.onDestinationChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next().onDestinationChanged(this, navBackStackEntry2.getDestination(), navBackStackEntry2.getArguments());
                }
                this._currentBackStackEntryFlow.d(navBackStackEntry2);
            }
            this._currentBackStack.d(AbstractC1435t.Z0(this.backQueue));
            this._visibleEntries.d(populateVisibleEntries$navigation_runtime_release());
        }
        if (navBackStackEntry != null) {
            return true;
        }
        return false;
    }

    @NavDeepLinkSaveStateControl
    public static final void enableDeepLinkSaveState(boolean z8) {
        Companion.enableDeepLinkSaveState(z8);
    }

    private final boolean executePopOperations(List<? extends Navigator<?>> list, NavDestination navDestination, boolean z8, boolean z9) {
        String str;
        O o8 = new O();
        C1427k c1427k = new C1427k();
        Iterator<? extends Navigator<?>> it = list.iterator();
        while (it.hasNext()) {
            Navigator<? extends NavDestination> navigator = (Navigator) it.next();
            O o9 = new O();
            popBackStackInternal(navigator, (NavBackStackEntry) this.backQueue.last(), z9, new NavController$executePopOperations$1(o9, o8, this, z9, c1427k));
            if (!o9.f34569a) {
                break;
            }
        }
        if (z9) {
            if (!z8) {
                for (NavDestination navDestination2 : AbstractC3258j.C(AbstractC3258j.h(navDestination, NavController$executePopOperations$2.INSTANCE), new NavController$executePopOperations$3(this))) {
                    Map<Integer, String> map = this.backStackMap;
                    Integer valueOf = Integer.valueOf(navDestination2.getId());
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) c1427k.n();
                    if (navBackStackEntryState != null) {
                        str = navBackStackEntryState.getId();
                    } else {
                        str = null;
                    }
                    map.put(valueOf, str);
                }
            }
            if (!c1427k.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) c1427k.first();
                Iterator it2 = AbstractC3258j.C(AbstractC3258j.h(findDestination(navBackStackEntryState2.getDestinationId()), NavController$executePopOperations$5.INSTANCE), new NavController$executePopOperations$6(this)).iterator();
                while (it2.hasNext()) {
                    this.backStackMap.put(Integer.valueOf(((NavDestination) it2.next()).getId()), navBackStackEntryState2.getId());
                }
                this.backStackStates.put(navBackStackEntryState2.getId(), c1427k);
            }
        }
        updateOnBackPressedCallbackEnabled();
        return o8.f34569a;
    }

    private final boolean executeRestoreState(List<NavBackStackEntry> list, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        String str;
        NavBackStackEntry navBackStackEntry;
        NavDestination destination;
        ArrayList<List<NavBackStackEntry>> arrayList = new ArrayList();
        ArrayList<NavBackStackEntry> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!(((NavBackStackEntry) obj).getDestination() instanceof NavGraph)) {
                arrayList2.add(obj);
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : arrayList2) {
            List list2 = (List) AbstractC1435t.z0(arrayList);
            if (list2 != null && (navBackStackEntry = (NavBackStackEntry) AbstractC1435t.y0(list2)) != null && (destination = navBackStackEntry.getDestination()) != null) {
                str = destination.getNavigatorName();
            } else {
                str = null;
            }
            if (AbstractC3292y.d(str, navBackStackEntry2.getDestination().getNavigatorName())) {
                list2.add(navBackStackEntry2);
            } else {
                arrayList.add(AbstractC1435t.s(navBackStackEntry2));
            }
        }
        O o8 = new O();
        for (List<NavBackStackEntry> list3 : arrayList) {
            navigateInternal(this._navigatorProvider.getNavigator(((NavBackStackEntry) AbstractC1435t.m0(list3)).getDestination().getNavigatorName()), list3, navOptions, extras, new NavController$executeRestoreState$3(o8, list, new Q(), this, bundle));
        }
        return o8.f34569a;
    }

    private final String findInvalidDestinationDisplayNameInDeepLink(int[] iArr) {
        NavGraph navGraph;
        NavGraph navGraph2 = this._graph;
        int length = iArr.length;
        int i8 = 0;
        while (true) {
            NavDestination navDestination = null;
            if (i8 >= length) {
                return null;
            }
            int i9 = iArr[i8];
            if (i8 == 0) {
                NavGraph navGraph3 = this._graph;
                AbstractC3292y.f(navGraph3);
                if (navGraph3.getId() == i9) {
                    navDestination = this._graph;
                }
            } else {
                AbstractC3292y.f(navGraph2);
                navDestination = navGraph2.findNode(i9);
            }
            if (navDestination == null) {
                return NavDestination.Companion.getDisplayName(this.context, i9);
            }
            if (i8 != iArr.length - 1 && (navDestination instanceof NavGraph)) {
                while (true) {
                    navGraph = (NavGraph) navDestination;
                    AbstractC3292y.f(navGraph);
                    if (!(navGraph.findNode(navGraph.getStartDestinationId()) instanceof NavGraph)) {
                        break;
                    }
                    navDestination = navGraph.findNode(navGraph.getStartDestinationId());
                }
                navGraph2 = navGraph;
            }
            i8++;
        }
    }

    private final int getDestinationCountOnBackStack() {
        C1427k c1427k = this.backQueue;
        int i8 = 0;
        if (!(c1427k instanceof Collection) || !c1427k.isEmpty()) {
            Iterator<E> it = c1427k.iterator();
            while (it.hasNext()) {
                if ((!(((NavBackStackEntry) it.next()).getDestination() instanceof NavGraph)) && (i8 = i8 + 1) < 0) {
                    AbstractC1435t.v();
                }
            }
        }
        return i8;
    }

    private final List<NavBackStackEntry> instantiateBackStack(C1427k c1427k) {
        NavDestination graph;
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.q();
        if (navBackStackEntry == null || (graph = navBackStackEntry.getDestination()) == null) {
            graph = getGraph();
        }
        if (c1427k != null) {
            Iterator<E> it = c1427k.iterator();
            while (it.hasNext()) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) it.next();
                NavDestination findDestination = findDestination(graph, navBackStackEntryState.getDestinationId());
                if (findDestination != null) {
                    arrayList.add(navBackStackEntryState.instantiate(this.context, findDestination, getHostLifecycleState$navigation_runtime_release(), this.viewModel));
                    graph = findDestination;
                } else {
                    throw new IllegalStateException(("Restore State failed: destination " + NavDestination.Companion.getDisplayName(this.context, navBackStackEntryState.getDestinationId()) + " cannot be found from the current destination " + graph).toString());
                }
            }
        }
        return arrayList;
    }

    private final boolean launchSingleTopInternal(NavDestination navDestination, Bundle bundle) {
        int id;
        NavDestination destination;
        int i8;
        NavBackStackEntry currentBackStackEntry = getCurrentBackStackEntry();
        if (navDestination instanceof NavGraph) {
            id = NavGraph.Companion.findStartDestination((NavGraph) navDestination).getId();
        } else {
            id = navDestination.getId();
        }
        if (currentBackStackEntry != null && (destination = currentBackStackEntry.getDestination()) != null && id == destination.getId()) {
            C1427k<NavBackStackEntry> c1427k = new C1427k();
            C1427k c1427k2 = this.backQueue;
            ListIterator<E> listIterator = c1427k2.listIterator(c1427k2.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (((NavBackStackEntry) listIterator.previous()).getDestination() == navDestination) {
                        i8 = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i8 = -1;
                    break;
                }
            }
            while (AbstractC1435t.o(this.backQueue) >= i8) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.A();
                unlinkChildFromParent$navigation_runtime_release(navBackStackEntry);
                c1427k.c(new NavBackStackEntry(navBackStackEntry, navBackStackEntry.getDestination().addInDefaultArgs(bundle)));
            }
            for (NavBackStackEntry navBackStackEntry2 : c1427k) {
                NavGraph parent = navBackStackEntry2.getDestination().getParent();
                if (parent != null) {
                    linkChildToParent(navBackStackEntry2, getBackStackEntry(parent.getId()));
                }
                this.backQueue.add(navBackStackEntry2);
            }
            for (NavBackStackEntry navBackStackEntry3 : c1427k) {
                this._navigatorProvider.getNavigator(navBackStackEntry3.getDestination().getNavigatorName()).onLaunchSingleTop(navBackStackEntry3);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$2(NavController this$0, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(lifecycleOwner, "<anonymous parameter 0>");
        AbstractC3292y.i(event, "event");
        this$0.hostLifecycleState = event.getTargetState();
        if (this$0._graph != null) {
            Iterator<E> it = this$0.backQueue.iterator();
            while (it.hasNext()) {
                ((NavBackStackEntry) it.next()).handleLifecycleEvent(event);
            }
        }
    }

    private final void linkChildToParent(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.childToParentEntries.put(navBackStackEntry, navBackStackEntry2);
        if (this.parentToChildCount.get(navBackStackEntry2) == null) {
            this.parentToChildCount.put(navBackStackEntry2, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(navBackStackEntry2);
        AbstractC3292y.f(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    public static /* synthetic */ void navigate$default(NavController navController, String str, NavOptions navOptions, Navigator.Extras extras, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                navOptions = null;
            }
            if ((i8 & 4) != 0) {
                extras = null;
            }
            navController.navigate(str, navOptions, extras);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
    }

    private final void navigateInternal(Navigator<? extends NavDestination> navigator, List<NavBackStackEntry> list, NavOptions navOptions, Navigator.Extras extras, Function1 function1) {
        this.addToBackStackHandler = function1;
        navigator.navigate(list, navOptions, extras);
        this.addToBackStackHandler = null;
    }

    static /* synthetic */ void navigateInternal$default(NavController navController, Navigator navigator, List list, NavOptions navOptions, Navigator.Extras extras, Function1 function1, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 8) != 0) {
                function1 = NavController$navigateInternal$1.INSTANCE;
            }
            navController.navigateInternal(navigator, list, navOptions, extras, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateInternal");
    }

    @MainThread
    private final void onGraphCreated(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.navigatorStateToRestore;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList(KEY_NAVIGATOR_STATE_NAMES)) != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String name = it.next();
                NavigatorProvider navigatorProvider = this._navigatorProvider;
                AbstractC3292y.h(name, "name");
                Navigator navigator = navigatorProvider.getNavigator(name);
                Bundle bundle3 = bundle2.getBundle(name);
                if (bundle3 != null) {
                    navigator.onRestoreState(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.backStackToRestore;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                AbstractC3292y.g(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                NavDestination findDestination = findDestination(navBackStackEntryState.getDestinationId());
                if (findDestination != null) {
                    NavBackStackEntry instantiate = navBackStackEntryState.instantiate(this.context, findDestination, getHostLifecycleState$navigation_runtime_release(), this.viewModel);
                    Navigator<? extends NavDestination> navigator2 = this._navigatorProvider.getNavigator(findDestination.getNavigatorName());
                    Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> map = this.navigatorState;
                    NavControllerNavigatorState navControllerNavigatorState = map.get(navigator2);
                    if (navControllerNavigatorState == null) {
                        navControllerNavigatorState = new NavControllerNavigatorState(this, navigator2);
                        map.put(navigator2, navControllerNavigatorState);
                    }
                    this.backQueue.add(instantiate);
                    navControllerNavigatorState.addInternal(instantiate);
                    NavGraph parent = instantiate.getDestination().getParent();
                    if (parent != null) {
                        linkChildToParent(instantiate, getBackStackEntry(parent.getId()));
                    }
                } else {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + NavDestination.Companion.getDisplayName(this.context, navBackStackEntryState.getDestinationId()) + " cannot be found from the current destination " + getCurrentDestination());
                }
            }
            updateOnBackPressedCallbackEnabled();
            this.backStackToRestore = null;
        }
        Collection<Navigator<? extends NavDestination>> values = this._navigatorProvider.getNavigators().values();
        ArrayList<Navigator<? extends NavDestination>> arrayList = new ArrayList();
        for (Object obj : values) {
            if (!((Navigator) obj).isAttached()) {
                arrayList.add(obj);
            }
        }
        for (Navigator<? extends NavDestination> navigator3 : arrayList) {
            Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> map2 = this.navigatorState;
            NavControllerNavigatorState navControllerNavigatorState2 = map2.get(navigator3);
            if (navControllerNavigatorState2 == null) {
                navControllerNavigatorState2 = new NavControllerNavigatorState(this, navigator3);
                map2.put(navigator3, navControllerNavigatorState2);
            }
            navigator3.onAttach(navControllerNavigatorState2);
        }
        if (this._graph != null && this.backQueue.isEmpty()) {
            if (!this.deepLinkHandled && (activity = this.activity) != null) {
                AbstractC3292y.f(activity);
                if (handleDeepLink(activity.getIntent())) {
                    return;
                }
            }
            NavGraph navGraph = this._graph;
            AbstractC3292y.f(navGraph);
            navigate(navGraph, bundle, (NavOptions) null, (Navigator.Extras) null);
            return;
        }
        dispatchOnDestinationChanged();
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, String str, boolean z8, boolean z9, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 4) != 0) {
                z9 = false;
            }
            return navController.popBackStack(str, z8, z9);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
    }

    private final void popBackStackInternal(Navigator<? extends NavDestination> navigator, NavBackStackEntry navBackStackEntry, boolean z8, Function1 function1) {
        this.popFromBackStackHandler = function1;
        navigator.popBackStack(navBackStackEntry, z8);
        this.popFromBackStackHandler = null;
    }

    static /* synthetic */ void popBackStackInternal$default(NavController navController, Navigator navigator, NavBackStackEntry navBackStackEntry, boolean z8, Function1 function1, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i8 & 4) != 0) {
            function1 = NavController$popBackStackInternal$1.INSTANCE;
        }
        navController.popBackStackInternal(navigator, navBackStackEntry, z8, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void popEntryFromBackStack(NavBackStackEntry navBackStackEntry, boolean z8, C1427k c1427k) {
        NavControllerViewModel navControllerViewModel;
        InterfaceC3813L transitionsInProgress;
        Set set;
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) this.backQueue.last();
        if (AbstractC3292y.d(navBackStackEntry2, navBackStackEntry)) {
            this.backQueue.A();
            NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(getNavigatorProvider().getNavigator(navBackStackEntry2.getDestination().getNavigatorName()));
            boolean z9 = true;
            if ((navControllerNavigatorState == null || (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) == null || (set = (Set) transitionsInProgress.getValue()) == null || !set.contains(navBackStackEntry2)) && !this.parentToChildCount.containsKey(navBackStackEntry2)) {
                z9 = false;
            }
            Lifecycle.State currentState = navBackStackEntry2.getLifecycle().getCurrentState();
            Lifecycle.State state = Lifecycle.State.CREATED;
            if (currentState.isAtLeast(state)) {
                if (z8) {
                    navBackStackEntry2.setMaxLifecycle(state);
                    c1427k.c(new NavBackStackEntryState(navBackStackEntry2));
                }
                if (!z9) {
                    navBackStackEntry2.setMaxLifecycle(Lifecycle.State.DESTROYED);
                    unlinkChildFromParent$navigation_runtime_release(navBackStackEntry2);
                } else {
                    navBackStackEntry2.setMaxLifecycle(state);
                }
            }
            if (!z8 && !z9 && (navControllerViewModel = this.viewModel) != null) {
                navControllerViewModel.clear(navBackStackEntry2.getId());
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + navBackStackEntry.getDestination() + ", which is not the top of the back stack (" + navBackStackEntry2.getDestination() + ')').toString());
    }

    static /* synthetic */ void popEntryFromBackStack$default(NavController navController, NavBackStackEntry navBackStackEntry, boolean z8, C1427k c1427k, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                z8 = false;
            }
            if ((i8 & 4) != 0) {
                c1427k = new C1427k();
            }
            navController.popEntryFromBackStack(navBackStackEntry, z8, c1427k);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
    }

    private final boolean restoreStateInternal(int i8, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        if (!this.backStackMap.containsKey(Integer.valueOf(i8))) {
            return false;
        }
        String str = this.backStackMap.get(Integer.valueOf(i8));
        AbstractC1435t.I(this.backStackMap.values(), new NavController$restoreStateInternal$1(str));
        return executeRestoreState(instantiateBackStack((C1427k) Z.c(this.backStackStates).remove(str)), bundle, navOptions, extras);
    }

    private final boolean tryRelaunchUpToExplicitStack() {
        Bundle bundle;
        int i8 = 0;
        if (!this.deepLinkHandled) {
            return false;
        }
        Activity activity = this.activity;
        AbstractC3292y.f(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        AbstractC3292y.f(extras);
        int[] intArray = extras.getIntArray(KEY_DEEP_LINK_IDS);
        AbstractC3292y.f(intArray);
        List X02 = AbstractC1428l.X0(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList(KEY_DEEP_LINK_ARGS);
        int intValue = ((Number) AbstractC1435t.P(X02)).intValue();
        if (parcelableArrayList != null) {
        }
        if (X02.isEmpty()) {
            return false;
        }
        NavDestination findDestination = findDestination(getGraph(), intValue);
        if (findDestination instanceof NavGraph) {
            intValue = NavGraph.Companion.findStartDestination((NavGraph) findDestination).getId();
        }
        NavDestination currentDestination = getCurrentDestination();
        if (currentDestination == null || intValue != currentDestination.getId()) {
            return false;
        }
        NavDeepLinkBuilder createDeepLink = createDeepLink();
        Bundle bundleOf = BundleKt.bundleOf(x.a(KEY_DEEP_LINK_INTENT, intent));
        Bundle bundle2 = extras.getBundle(KEY_DEEP_LINK_EXTRAS);
        if (bundle2 != null) {
            bundleOf.putAll(bundle2);
        }
        createDeepLink.setArguments(bundleOf);
        for (Object obj : X02) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC1435t.w();
            }
            int intValue2 = ((Number) obj).intValue();
            if (parcelableArrayList != null) {
                bundle = (Bundle) parcelableArrayList.get(i8);
            } else {
                bundle = null;
            }
            createDeepLink.addDestination(intValue2, bundle);
            i8 = i9;
        }
        createDeepLink.createTaskStackBuilder().startActivities();
        Activity activity2 = this.activity;
        if (activity2 != null) {
            activity2.finish();
        }
        return true;
    }

    private final boolean tryRelaunchUpToGeneratedStack() {
        Bundle bundle;
        NavDestination currentDestination = getCurrentDestination();
        AbstractC3292y.f(currentDestination);
        int id = currentDestination.getId();
        for (NavGraph parent = currentDestination.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getStartDestinationId() != id) {
                Bundle bundle2 = new Bundle();
                Activity activity = this.activity;
                if (activity != null) {
                    AbstractC3292y.f(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.activity;
                        AbstractC3292y.f(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.activity;
                            AbstractC3292y.f(activity3);
                            bundle2.putParcelable(KEY_DEEP_LINK_INTENT, activity3.getIntent());
                            NavGraph navGraph = this._graph;
                            AbstractC3292y.f(navGraph);
                            Activity activity4 = this.activity;
                            AbstractC3292y.f(activity4);
                            Intent intent = activity4.getIntent();
                            AbstractC3292y.h(intent, "activity!!.intent");
                            NavDestination.DeepLinkMatch matchDeepLink = navGraph.matchDeepLink(new NavDeepLinkRequest(intent));
                            if (matchDeepLink != null) {
                                bundle = matchDeepLink.getMatchingArgs();
                            } else {
                                bundle = null;
                            }
                            if (bundle != null) {
                                bundle2.putAll(matchDeepLink.getDestination().addInDefaultArgs(matchDeepLink.getMatchingArgs()));
                            }
                        }
                    }
                }
                NavDeepLinkBuilder.setDestination$default(new NavDeepLinkBuilder(this), parent.getId(), (Bundle) null, 2, (Object) null).setArguments(bundle2).createTaskStackBuilder().startActivities();
                Activity activity5 = this.activity;
                if (activity5 != null) {
                    activity5.finish();
                    return true;
                }
                return true;
            }
            id = parent.getId();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:            if (getDestinationCountOnBackStack() > 1) goto L8;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void updateOnBackPressedCallbackEnabled() {
        /*
            r3 = this;
            androidx.activity.OnBackPressedCallback r0 = r3.onBackPressedCallback
            boolean r1 = r3.enableOnBackPressedCallback
            if (r1 == 0) goto Le
            int r1 = r3.getDestinationCountOnBackStack()
            r2 = 1
            if (r1 <= r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.updateOnBackPressedCallbackEnabled():void");
    }

    public void addOnDestinationChangedListener(OnDestinationChangedListener listener) {
        AbstractC3292y.i(listener, "listener");
        this.onDestinationChangedListeners.add(listener);
        if (!this.backQueue.isEmpty()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.last();
            listener.onDestinationChanged(this, navBackStackEntry.getDestination(), navBackStackEntry.getArguments());
        }
    }

    @MainThread
    public final boolean clearBackStack(String route) {
        AbstractC3292y.i(route, "route");
        return clearBackStackInternal(route) && dispatchOnDestinationChanged();
    }

    public NavDeepLinkBuilder createDeepLink() {
        return new NavDeepLinkBuilder(this);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void enableOnBackPressed(boolean z8) {
        this.enableOnBackPressedCallback = z8;
        updateOnBackPressedCallbackEnabled();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findDestination(@IdRes int i8) {
        NavDestination navDestination;
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            return null;
        }
        AbstractC3292y.f(navGraph);
        if (navGraph.getId() == i8) {
            return this._graph;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.q();
        if (navBackStackEntry == null || (navDestination = navBackStackEntry.getDestination()) == null) {
            navDestination = this._graph;
            AbstractC3292y.f(navDestination);
        }
        return findDestination(navDestination, i8);
    }

    public NavBackStackEntry getBackStackEntry(@IdRes int i8) {
        Object obj;
        C1427k c1427k = this.backQueue;
        ListIterator<E> listIterator = c1427k.listIterator(c1427k.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((NavBackStackEntry) obj).getDestination().getId() == i8) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        throw new IllegalArgumentException(("No destination with ID " + i8 + " is on the NavController's back stack. The current destination is " + getCurrentDestination()).toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Context getContext() {
        return this.context;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final InterfaceC3813L getCurrentBackStack() {
        return this.currentBackStack;
    }

    public NavBackStackEntry getCurrentBackStackEntry() {
        return (NavBackStackEntry) this.backQueue.q();
    }

    public final InterfaceC3821f getCurrentBackStackEntryFlow() {
        return this.currentBackStackEntryFlow;
    }

    public NavDestination getCurrentDestination() {
        NavBackStackEntry currentBackStackEntry = getCurrentBackStackEntry();
        if (currentBackStackEntry != null) {
            return currentBackStackEntry.getDestination();
        }
        return null;
    }

    @MainThread
    public NavGraph getGraph() {
        NavGraph navGraph = this._graph;
        if (navGraph != null) {
            AbstractC3292y.g(navGraph, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            return navGraph;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
    }

    public final Lifecycle.State getHostLifecycleState$navigation_runtime_release() {
        if (this.lifecycleOwner == null) {
            return Lifecycle.State.CREATED;
        }
        return this.hostLifecycleState;
    }

    public NavInflater getNavInflater() {
        return (NavInflater) this.navInflater$delegate.getValue();
    }

    public NavigatorProvider getNavigatorProvider() {
        return this._navigatorProvider;
    }

    public NavBackStackEntry getPreviousBackStackEntry() {
        Object obj;
        Iterator it = AbstractC1435t.I0(this.backQueue).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = AbstractC3258j.c(it).iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (!(((NavBackStackEntry) obj).getDestination() instanceof NavGraph)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (NavBackStackEntry) obj;
    }

    public ViewModelStoreOwner getViewModelStoreOwner(@IdRes int i8) {
        if (this.viewModel != null) {
            NavBackStackEntry backStackEntry = getBackStackEntry(i8);
            if (backStackEntry.getDestination() instanceof NavGraph) {
                return backStackEntry;
            }
            throw new IllegalArgumentException(("No NavGraph with ID " + i8 + " is on the NavController's back stack").toString());
        }
        throw new IllegalStateException("You must call setViewModelStore() before calling getViewModelStoreOwner().".toString());
    }

    public final InterfaceC3813L getVisibleEntries() {
        return this.visibleEntries;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean handleDeepLink(android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.handleDeepLink(android.content.Intent):boolean");
    }

    @MainThread
    public final void navigate(String route) {
        AbstractC3292y.i(route, "route");
        navigate$default(this, route, null, null, 6, null);
    }

    @MainThread
    public boolean navigateUp() {
        Bundle bundle;
        Intent intent;
        if (getDestinationCountOnBackStack() == 1) {
            Activity activity = this.activity;
            int[] iArr = null;
            if (activity != null && (intent = activity.getIntent()) != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null) {
                iArr = bundle.getIntArray(KEY_DEEP_LINK_IDS);
            }
            if (iArr != null) {
                return tryRelaunchUpToExplicitStack();
            }
            return tryRelaunchUpToGeneratedStack();
        }
        return popBackStack();
    }

    @MainThread
    public final boolean popBackStack(String route, boolean z8) {
        AbstractC3292y.i(route, "route");
        return popBackStack$default(this, route, z8, false, 4, null);
    }

    public final void popBackStackFromNavigator$navigation_runtime_release(NavBackStackEntry popUpTo, Function0 onComplete) {
        AbstractC3292y.i(popUpTo, "popUpTo");
        AbstractC3292y.i(onComplete, "onComplete");
        int indexOf = this.backQueue.indexOf(popUpTo);
        if (indexOf < 0) {
            Log.i(TAG, "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i8 = indexOf + 1;
        if (i8 != this.backQueue.size()) {
            popBackStackInternal(((NavBackStackEntry) this.backQueue.get(i8)).getDestination().getId(), true, false);
        }
        popEntryFromBackStack$default(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        updateOnBackPressedCallbackEnabled();
        dispatchOnDestinationChanged();
    }

    public final List<NavBackStackEntry> populateVisibleEntries$navigation_runtime_release() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((NavControllerNavigatorState) it.next()).getTransitionsInProgress().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if (!arrayList.contains(navBackStackEntry) && !navBackStackEntry.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            AbstractC1435t.C(arrayList, arrayList2);
        }
        C1427k c1427k = this.backQueue;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : c1427k) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj2;
            if (!arrayList.contains(navBackStackEntry2) && navBackStackEntry2.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                arrayList3.add(obj2);
            }
        }
        AbstractC1435t.C(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((NavBackStackEntry) obj3).getDestination() instanceof NavGraph)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public void removeOnDestinationChangedListener(OnDestinationChangedListener listener) {
        AbstractC3292y.i(listener, "listener");
        this.onDestinationChangedListeners.remove(listener);
    }

    @CallSuper
    public void restoreState(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.context.getClassLoader());
        this.navigatorStateToRestore = bundle.getBundle(KEY_NAVIGATOR_STATE);
        this.backStackToRestore = bundle.getParcelableArray(KEY_BACK_STACK);
        this.backStackStates.clear();
        int[] intArray = bundle.getIntArray(KEY_BACK_STACK_DEST_IDS);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(KEY_BACK_STACK_IDS);
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                this.backStackMap.put(Integer.valueOf(intArray[i8]), stringArrayList.get(i9));
                i8++;
                i9++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList(KEY_BACK_STACK_STATES_IDS);
        if (stringArrayList2 != null) {
            for (String id : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray(KEY_BACK_STACK_STATES_PREFIX + id);
                if (parcelableArray != null) {
                    Map<String, C1427k> map = this.backStackStates;
                    AbstractC3292y.h(id, "id");
                    C1427k c1427k = new C1427k(parcelableArray.length);
                    Iterator a9 = AbstractC3274f.a(parcelableArray);
                    while (a9.hasNext()) {
                        Parcelable parcelable = (Parcelable) a9.next();
                        AbstractC3292y.g(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        c1427k.add((NavBackStackEntryState) parcelable);
                    }
                    map.put(id, c1427k);
                }
            }
        }
        this.deepLinkHandled = bundle.getBoolean(KEY_DEEP_LINK_HANDLED);
    }

    @CallSuper
    public Bundle saveState() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, Navigator<? extends NavDestination>> entry : this._navigatorProvider.getNavigators().entrySet()) {
            String key = entry.getKey();
            Bundle onSaveState = entry.getValue().onSaveState();
            if (onSaveState != null) {
                arrayList.add(key);
                bundle2.putBundle(key, onSaveState);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList(KEY_NAVIGATOR_STATE_NAMES, arrayList);
            bundle.putBundle(KEY_NAVIGATOR_STATE, bundle2);
        } else {
            bundle = null;
        }
        if (!this.backQueue.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.backQueue.size()];
            Iterator<E> it = this.backQueue.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                parcelableArr[i8] = new NavBackStackEntryState((NavBackStackEntry) it.next());
                i8++;
            }
            bundle.putParcelableArray(KEY_BACK_STACK, parcelableArr);
        }
        if (!this.backStackMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.backStackMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i9 = 0;
            for (Map.Entry<Integer, String> entry2 : this.backStackMap.entrySet()) {
                int intValue = entry2.getKey().intValue();
                String value = entry2.getValue();
                iArr[i9] = intValue;
                arrayList2.add(value);
                i9++;
            }
            bundle.putIntArray(KEY_BACK_STACK_DEST_IDS, iArr);
            bundle.putStringArrayList(KEY_BACK_STACK_IDS, arrayList2);
        }
        if (!this.backStackStates.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry<String, C1427k> entry3 : this.backStackStates.entrySet()) {
                String key2 = entry3.getKey();
                C1427k value2 = entry3.getValue();
                arrayList3.add(key2);
                Parcelable[] parcelableArr2 = new Parcelable[value2.size()];
                int i10 = 0;
                for (Object obj : value2) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        AbstractC1435t.w();
                    }
                    parcelableArr2[i10] = (NavBackStackEntryState) obj;
                    i10 = i11;
                }
                bundle.putParcelableArray(KEY_BACK_STACK_STATES_PREFIX + key2, parcelableArr2);
            }
            bundle.putStringArrayList(KEY_BACK_STACK_STATES_IDS, arrayList3);
        }
        if (this.deepLinkHandled) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(KEY_DEEP_LINK_HANDLED, this.deepLinkHandled);
        }
        return bundle;
    }

    @CallSuper
    @MainThread
    public void setGraph(NavGraph graph) {
        AbstractC3292y.i(graph, "graph");
        setGraph(graph, (Bundle) null);
    }

    public final void setHostLifecycleState$navigation_runtime_release(Lifecycle.State state) {
        AbstractC3292y.i(state, "<set-?>");
        this.hostLifecycleState = state;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLifecycleOwner(LifecycleOwner owner) {
        Lifecycle lifecycle;
        AbstractC3292y.i(owner, "owner");
        if (AbstractC3292y.d(owner, this.lifecycleOwner)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this.lifecycleObserver);
        }
        this.lifecycleOwner = owner;
        owner.getLifecycle().addObserver(this.lifecycleObserver);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setNavigatorProvider(NavigatorProvider navigatorProvider) {
        AbstractC3292y.i(navigatorProvider, "navigatorProvider");
        if (this.backQueue.isEmpty()) {
            this._navigatorProvider = navigatorProvider;
            return;
        }
        throw new IllegalStateException("NavigatorProvider must be set before setGraph call".toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setOnBackPressedDispatcher(OnBackPressedDispatcher dispatcher) {
        AbstractC3292y.i(dispatcher, "dispatcher");
        if (AbstractC3292y.d(dispatcher, this.onBackPressedDispatcher)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner != null) {
            this.onBackPressedCallback.remove();
            this.onBackPressedDispatcher = dispatcher;
            dispatcher.addCallback(lifecycleOwner, this.onBackPressedCallback);
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            lifecycle.removeObserver(this.lifecycleObserver);
            lifecycle.addObserver(this.lifecycleObserver);
            return;
        }
        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setViewModelStore(ViewModelStore viewModelStore) {
        AbstractC3292y.i(viewModelStore, "viewModelStore");
        NavControllerViewModel navControllerViewModel = this.viewModel;
        NavControllerViewModel.Companion companion = NavControllerViewModel.Companion;
        if (AbstractC3292y.d(navControllerViewModel, companion.getInstance(viewModelStore))) {
            return;
        }
        if (this.backQueue.isEmpty()) {
            this.viewModel = companion.getInstance(viewModelStore);
            return;
        }
        throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
    }

    public final NavBackStackEntry unlinkChildFromParent$navigation_runtime_release(NavBackStackEntry child) {
        AbstractC3292y.i(child, "child");
        NavBackStackEntry remove = this.childToParentEntries.remove(child);
        Integer num = null;
        if (remove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(remove);
        if (atomicInteger != null) {
            num = Integer.valueOf(atomicInteger.decrementAndGet());
        }
        if (num != null && num.intValue() == 0) {
            NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(this._navigatorProvider.getNavigator(remove.getDestination().getNavigatorName()));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.markTransitionComplete(remove);
            }
            this.parentToChildCount.remove(remove);
        }
        return remove;
    }

    public final void updateBackStackLifecycle$navigation_runtime_release() {
        Boolean bool;
        AtomicInteger atomicInteger;
        InterfaceC3813L transitionsInProgress;
        Set set;
        List<NavBackStackEntry> Z02 = AbstractC1435t.Z0(this.backQueue);
        if (Z02.isEmpty()) {
            return;
        }
        NavDestination destination = ((NavBackStackEntry) AbstractC1435t.y0(Z02)).getDestination();
        ArrayList arrayList = new ArrayList();
        if (destination instanceof FloatingWindow) {
            Iterator it = AbstractC1435t.I0(Z02).iterator();
            while (it.hasNext()) {
                NavDestination destination2 = ((NavBackStackEntry) it.next()).getDestination();
                arrayList.add(destination2);
                if (!(destination2 instanceof FloatingWindow) && !(destination2 instanceof NavGraph)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (NavBackStackEntry navBackStackEntry : AbstractC1435t.I0(Z02)) {
            Lifecycle.State maxLifecycle = navBackStackEntry.getMaxLifecycle();
            NavDestination destination3 = navBackStackEntry.getDestination();
            if (destination != null && destination3.getId() == destination.getId()) {
                Lifecycle.State state = Lifecycle.State.RESUMED;
                if (maxLifecycle != state) {
                    NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(getNavigatorProvider().getNavigator(navBackStackEntry.getDestination().getNavigatorName()));
                    if (navControllerNavigatorState != null && (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) != null && (set = (Set) transitionsInProgress.getValue()) != null) {
                        bool = Boolean.valueOf(set.contains(navBackStackEntry));
                    } else {
                        bool = null;
                    }
                    if (!AbstractC3292y.d(bool, Boolean.TRUE) && ((atomicInteger = this.parentToChildCount.get(navBackStackEntry)) == null || atomicInteger.get() != 0)) {
                        hashMap.put(navBackStackEntry, state);
                    } else {
                        hashMap.put(navBackStackEntry, Lifecycle.State.STARTED);
                    }
                }
                NavDestination navDestination = (NavDestination) AbstractC1435t.o0(arrayList);
                if (navDestination != null && navDestination.getId() == destination3.getId()) {
                    AbstractC1435t.N(arrayList);
                }
                destination = destination.getParent();
            } else if ((!arrayList.isEmpty()) && destination3.getId() == ((NavDestination) AbstractC1435t.m0(arrayList)).getId()) {
                NavDestination navDestination2 = (NavDestination) AbstractC1435t.N(arrayList);
                if (maxLifecycle == Lifecycle.State.RESUMED) {
                    navBackStackEntry.setMaxLifecycle(Lifecycle.State.STARTED);
                } else {
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    if (maxLifecycle != state2) {
                        hashMap.put(navBackStackEntry, state2);
                    }
                }
                NavGraph parent = navDestination2.getParent();
                if (parent != null && !arrayList.contains(parent)) {
                    arrayList.add(parent);
                }
            } else {
                navBackStackEntry.setMaxLifecycle(Lifecycle.State.CREATED);
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : Z02) {
            Lifecycle.State state3 = (Lifecycle.State) hashMap.get(navBackStackEntry2);
            if (state3 != null) {
                navBackStackEntry2.setMaxLifecycle(state3);
            } else {
                navBackStackEntry2.updateState();
            }
        }
    }

    @MainThread
    public final void navigate(String route, NavOptions navOptions) {
        AbstractC3292y.i(route, "route");
        navigate$default(this, route, navOptions, null, 4, null);
    }

    @MainThread
    public boolean popBackStack() {
        if (this.backQueue.isEmpty()) {
            return false;
        }
        NavDestination currentDestination = getCurrentDestination();
        AbstractC3292y.f(currentDestination);
        return popBackStack(currentDestination.getId(), true);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int i8) {
        setGraph(getNavInflater().inflate(i8), (Bundle) null);
    }

    static /* synthetic */ boolean popBackStackInternal$default(NavController navController, int i8, boolean z8, boolean z9, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i9 & 4) != 0) {
            z9 = false;
        }
        return navController.popBackStackInternal(i8, z8, z9);
    }

    @MainThread
    public final boolean clearBackStack(@IdRes int i8) {
        return clearBackStackInternal(i8) && dispatchOnDestinationChanged();
    }

    @MainThread
    public void navigate(@IdRes int i8) {
        navigate(i8, (Bundle) null);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int i8, Bundle bundle) {
        setGraph(getNavInflater().inflate(i8), bundle);
    }

    @MainThread
    private final boolean popBackStackInternal(@IdRes int i8, boolean z8, boolean z9) {
        NavDestination navDestination;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = AbstractC1435t.I0(this.backQueue).iterator();
        while (true) {
            if (!it.hasNext()) {
                navDestination = null;
                break;
            }
            navDestination = ((NavBackStackEntry) it.next()).getDestination();
            Navigator navigator = this._navigatorProvider.getNavigator(navDestination.getNavigatorName());
            if (z8 || navDestination.getId() != i8) {
                arrayList.add(navigator);
            }
            if (navDestination.getId() == i8) {
                break;
            }
        }
        if (navDestination == null) {
            Log.i(TAG, "Ignoring popBackStack to destination " + NavDestination.Companion.getDisplayName(this.context, i8) + " as it was not found on the current back stack");
            return false;
        }
        return executePopOperations(arrayList, navDestination, z8, z9);
    }

    @MainThread
    public void navigate(@IdRes int i8, Bundle bundle) {
        navigate(i8, bundle, (NavOptions) null);
    }

    @MainThread
    public boolean popBackStack(@IdRes int i8, boolean z8) {
        return popBackStack(i8, z8, false);
    }

    @CallSuper
    @MainThread
    public void setGraph(NavGraph graph, Bundle bundle) {
        AbstractC3292y.i(graph, "graph");
        if (!AbstractC3292y.d(this._graph, graph)) {
            NavGraph navGraph = this._graph;
            if (navGraph != null) {
                for (Integer id : new ArrayList(this.backStackMap.keySet())) {
                    AbstractC3292y.h(id, "id");
                    clearBackStackInternal(id.intValue());
                }
                popBackStackInternal$default(this, navGraph.getId(), true, false, 4, null);
            }
            this._graph = graph;
            onGraphCreated(bundle);
            return;
        }
        int size = graph.getNodes().size();
        for (int i8 = 0; i8 < size; i8++) {
            NavDestination valueAt = graph.getNodes().valueAt(i8);
            NavGraph navGraph2 = this._graph;
            AbstractC3292y.f(navGraph2);
            int keyAt = navGraph2.getNodes().keyAt(i8);
            NavGraph navGraph3 = this._graph;
            AbstractC3292y.f(navGraph3);
            navGraph3.getNodes().replace(keyAt, valueAt);
        }
        for (NavBackStackEntry navBackStackEntry : this.backQueue) {
            List<NavDestination> W8 = AbstractC1435t.W(AbstractC3258j.D(NavDestination.Companion.getHierarchy(navBackStackEntry.getDestination())));
            NavDestination navDestination = this._graph;
            AbstractC3292y.f(navDestination);
            for (NavDestination navDestination2 : W8) {
                if (!AbstractC3292y.d(navDestination2, this._graph) || !AbstractC3292y.d(navDestination, graph)) {
                    if (navDestination instanceof NavGraph) {
                        navDestination = ((NavGraph) navDestination).findNode(navDestination2.getId());
                        AbstractC3292y.f(navDestination);
                    }
                }
            }
            navBackStackEntry.setDestination(navDestination);
        }
    }

    @MainThread
    public void navigate(@IdRes int i8, Bundle bundle, NavOptions navOptions) {
        navigate(i8, bundle, navOptions, (Navigator.Extras) null);
    }

    @MainThread
    public boolean popBackStack(@IdRes int i8, boolean z8, boolean z9) {
        return popBackStackInternal(i8, z8, z9) && dispatchOnDestinationChanged();
    }

    private final NavDestination findDestination(NavDestination navDestination, @IdRes int i8) {
        NavGraph parent;
        if (navDestination.getId() == i8) {
            return navDestination;
        }
        if (navDestination instanceof NavGraph) {
            parent = (NavGraph) navDestination;
        } else {
            parent = navDestination.getParent();
            AbstractC3292y.f(parent);
        }
        return parent.findNode(i8);
    }

    @MainThread
    public void navigate(@IdRes int i8, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        NavDestination destination;
        int i9;
        if (this.backQueue.isEmpty()) {
            destination = this._graph;
        } else {
            destination = ((NavBackStackEntry) this.backQueue.last()).getDestination();
        }
        if (destination != null) {
            NavAction action = destination.getAction(i8);
            Bundle bundle2 = null;
            if (action != null) {
                if (navOptions == null) {
                    navOptions = action.getNavOptions();
                }
                i9 = action.getDestinationId();
                Bundle defaultArguments = action.getDefaultArguments();
                if (defaultArguments != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(defaultArguments);
                }
            } else {
                i9 = i8;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i9 == 0 && navOptions != null && (navOptions.getPopUpToId() != -1 || navOptions.getPopUpToRoute() != null)) {
                if (navOptions.getPopUpToRoute() != null) {
                    String popUpToRoute = navOptions.getPopUpToRoute();
                    AbstractC3292y.f(popUpToRoute);
                    popBackStack$default(this, popUpToRoute, navOptions.isPopUpToInclusive(), false, 4, null);
                    return;
                } else {
                    if (navOptions.getPopUpToId() != -1) {
                        popBackStack(navOptions.getPopUpToId(), navOptions.isPopUpToInclusive());
                        return;
                    }
                    return;
                }
            }
            if (i9 != 0) {
                NavDestination findDestination = findDestination(i9);
                if (findDestination == null) {
                    NavDestination.Companion companion = NavDestination.Companion;
                    String displayName = companion.getDisplayName(this.context, i9);
                    if (action == null) {
                        throw new IllegalArgumentException("Navigation action/destination " + displayName + " cannot be found from the current destination " + destination);
                    }
                    throw new IllegalArgumentException(("Navigation destination " + displayName + " referenced from action " + companion.getDisplayName(this.context, i8) + " cannot be found from the current destination " + destination).toString());
                }
                navigate(findDestination, bundle2, navOptions, extras);
                return;
            }
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
        }
        throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
    }

    private final boolean restoreStateInternal(String str) {
        NavBackStackEntryState navBackStackEntryState;
        int hashCode = NavDestination.Companion.createRoute(str).hashCode();
        if (this.backStackMap.containsKey(Integer.valueOf(hashCode))) {
            return restoreStateInternal(hashCode, null, null, null);
        }
        NavDestination findDestination = findDestination(str);
        if (findDestination != null) {
            String str2 = this.backStackMap.get(Integer.valueOf(findDestination.getId()));
            AbstractC1435t.I(this.backStackMap.values(), new NavController$restoreStateInternal$3(str2));
            C1427k c1427k = (C1427k) Z.c(this.backStackStates).remove(str2);
            NavDestination.DeepLinkMatch matchDeepLink = findDestination.matchDeepLink(str);
            AbstractC3292y.f(matchDeepLink);
            if (matchDeepLink.hasMatchingArgs((c1427k == null || (navBackStackEntryState = (NavBackStackEntryState) c1427k.n()) == null) ? null : navBackStackEntryState.getArgs())) {
                return executeRestoreState(instantiateBackStack(c1427k), null, null, null);
            }
            return false;
        }
        throw new IllegalStateException(("Restore State failed: route " + str + " cannot be found from the current destination " + getCurrentDestination()).toString());
    }

    @MainThread
    public final boolean popBackStack(String route, boolean z8, boolean z9) {
        AbstractC3292y.i(route, "route");
        return popBackStackInternal(route, z8, z9) && dispatchOnDestinationChanged();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findDestination(String route) {
        NavGraph navGraph;
        NavGraph parent;
        AbstractC3292y.i(route, "route");
        NavGraph navGraph2 = this._graph;
        if (navGraph2 == null) {
            return null;
        }
        AbstractC3292y.f(navGraph2);
        if (!AbstractC3292y.d(navGraph2.getRoute(), route)) {
            NavGraph navGraph3 = this._graph;
            AbstractC3292y.f(navGraph3);
            if (navGraph3.matchDeepLink(route) == null) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.q();
                if (navBackStackEntry == null || (navGraph = navBackStackEntry.getDestination()) == null) {
                    navGraph = this._graph;
                    AbstractC3292y.f(navGraph);
                }
                if (navGraph instanceof NavGraph) {
                    parent = navGraph;
                } else {
                    parent = navGraph.getParent();
                    AbstractC3292y.f(parent);
                }
                return parent.findNode(route);
            }
        }
        return this._graph;
    }

    @MainThread
    private final boolean clearBackStackInternal(String str) {
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavControllerNavigatorState) it.next()).setNavigating(true);
        }
        boolean restoreStateInternal = restoreStateInternal(str);
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((NavControllerNavigatorState) it2.next()).setNavigating(false);
        }
        return restoreStateInternal && popBackStackInternal(str, true, false);
    }

    public final NavBackStackEntry getBackStackEntry(String route) {
        Object obj;
        AbstractC3292y.i(route, "route");
        C1427k c1427k = this.backQueue;
        ListIterator<E> listIterator = c1427k.listIterator(c1427k.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            if (navBackStackEntry.getDestination().hasRoute(route, navBackStackEntry.getArguments())) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
        if (navBackStackEntry2 != null) {
            return navBackStackEntry2;
        }
        throw new IllegalArgumentException(("No destination with route " + route + " is on the NavController's back stack. The current destination is " + getCurrentDestination()).toString());
    }

    private final boolean popBackStackInternal(String str, boolean z8, boolean z9) {
        Object obj;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        C1427k c1427k = this.backQueue;
        ListIterator<E> listIterator = c1427k.listIterator(c1427k.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            boolean hasRoute = navBackStackEntry.getDestination().hasRoute(str, navBackStackEntry.getArguments());
            if (z8 || !hasRoute) {
                arrayList.add(this._navigatorProvider.getNavigator(navBackStackEntry.getDestination().getNavigatorName()));
            }
            if (hasRoute) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
        NavDestination destination = navBackStackEntry2 != null ? navBackStackEntry2.getDestination() : null;
        if (destination == null) {
            Log.i(TAG, "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
            return false;
        }
        return executePopOperations(arrayList, destination, z8, z9);
    }

    @MainThread
    public void navigate(Uri deepLink) {
        AbstractC3292y.i(deepLink, "deepLink");
        navigate(new NavDeepLinkRequest(deepLink, null, null));
    }

    @MainThread
    public void navigate(Uri deepLink, NavOptions navOptions) {
        AbstractC3292y.i(deepLink, "deepLink");
        navigate(new NavDeepLinkRequest(deepLink, null, null), navOptions, (Navigator.Extras) null);
    }

    @MainThread
    public void navigate(Uri deepLink, NavOptions navOptions, Navigator.Extras extras) {
        AbstractC3292y.i(deepLink, "deepLink");
        navigate(new NavDeepLinkRequest(deepLink, null, null), navOptions, extras);
    }

    @MainThread
    public void navigate(NavDeepLinkRequest request) {
        AbstractC3292y.i(request, "request");
        navigate(request, (NavOptions) null);
    }

    @MainThread
    public void navigate(NavDeepLinkRequest request, NavOptions navOptions) {
        AbstractC3292y.i(request, "request");
        navigate(request, navOptions, (Navigator.Extras) null);
    }

    @MainThread
    public void navigate(NavDeepLinkRequest request, NavOptions navOptions, Navigator.Extras extras) {
        AbstractC3292y.i(request, "request");
        NavGraph navGraph = this._graph;
        if (navGraph != null) {
            AbstractC3292y.f(navGraph);
            NavDestination.DeepLinkMatch matchDeepLink = navGraph.matchDeepLink(request);
            if (matchDeepLink != null) {
                Bundle addInDefaultArgs = matchDeepLink.getDestination().addInDefaultArgs(matchDeepLink.getMatchingArgs());
                if (addInDefaultArgs == null) {
                    addInDefaultArgs = new Bundle();
                }
                NavDestination destination = matchDeepLink.getDestination();
                Intent intent = new Intent();
                intent.setDataAndType(request.getUri(), request.getMimeType());
                intent.setAction(request.getAction());
                addInDefaultArgs.putParcelable(KEY_DEEP_LINK_INTENT, intent);
                navigate(destination, addInDefaultArgs, navOptions, extras);
                return;
            }
            throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + this._graph);
        }
        throw new IllegalArgumentException(("Cannot navigate to " + request + ". Navigation graph has not been set for NavController " + this + '.').toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ee A[LOOP:1: B:20:0x00e8->B:22:0x00ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void navigate(androidx.navigation.NavDestination r22, android.os.Bundle r23, androidx.navigation.NavOptions r24, androidx.navigation.Navigator.Extras r25) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.navigate(androidx.navigation.NavDestination, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):void");
    }

    @MainThread
    public void navigate(NavDirections directions) {
        AbstractC3292y.i(directions, "directions");
        navigate(directions.getActionId(), directions.getArguments(), (NavOptions) null);
    }

    @MainThread
    public void navigate(NavDirections directions, NavOptions navOptions) {
        AbstractC3292y.i(directions, "directions");
        navigate(directions.getActionId(), directions.getArguments(), navOptions);
    }

    @MainThread
    public void navigate(NavDirections directions, Navigator.Extras navigatorExtras) {
        AbstractC3292y.i(directions, "directions");
        AbstractC3292y.i(navigatorExtras, "navigatorExtras");
        navigate(directions.getActionId(), directions.getArguments(), (NavOptions) null, navigatorExtras);
    }

    @MainThread
    public final void navigate(String route, Function1 builder) {
        AbstractC3292y.i(route, "route");
        AbstractC3292y.i(builder, "builder");
        navigate$default(this, route, NavOptionsBuilderKt.navOptions(builder), null, 4, null);
    }

    @MainThread
    public final void navigate(String route, NavOptions navOptions, Navigator.Extras extras) {
        AbstractC3292y.i(route, "route");
        NavDeepLinkRequest.Builder.Companion companion = NavDeepLinkRequest.Builder.Companion;
        Uri parse = Uri.parse(NavDestination.Companion.createRoute(route));
        AbstractC3292y.e(parse, "Uri.parse(this)");
        navigate(companion.fromUri(parse).build(), navOptions, extras);
    }
}
