package androidx.fragment.app;

import Q5.I;
import R5.AbstractC1435t;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.CallSuper;
import androidx.core.os.CancellationSignal;
import androidx.core.view.ViewCompat;
import androidx.fragment.R;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public abstract class SpecialEffectsController {
    public static final Companion Companion = new Companion(null);
    private final ViewGroup container;
    private boolean isContainerPostponed;
    private boolean operationDirectionIsPop;
    private final List<Operation> pendingOperations;
    private final List<Operation> runningOperations;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final SpecialEffectsController getOrCreateController(ViewGroup container, FragmentManager fragmentManager) {
            AbstractC3292y.i(container, "container");
            AbstractC3292y.i(fragmentManager, "fragmentManager");
            SpecialEffectsControllerFactory specialEffectsControllerFactory = fragmentManager.getSpecialEffectsControllerFactory();
            AbstractC3292y.h(specialEffectsControllerFactory, "fragmentManager.specialEffectsControllerFactory");
            return getOrCreateController(container, specialEffectsControllerFactory);
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }

        public final SpecialEffectsController getOrCreateController(ViewGroup container, SpecialEffectsControllerFactory factory) {
            AbstractC3292y.i(container, "container");
            AbstractC3292y.i(factory, "factory");
            int i8 = R.id.special_effects_controller_view_tag;
            Object tag = container.getTag(i8);
            if (tag instanceof SpecialEffectsController) {
                return (SpecialEffectsController) tag;
            }
            SpecialEffectsController createController = factory.createController(container);
            AbstractC3292y.h(createController, "factory.createController(container)");
            container.setTag(i8, createController);
            return createController;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class FragmentStateManagerOperation extends Operation {
        private final FragmentStateManager fragmentStateManager;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public FragmentStateManagerOperation(androidx.fragment.app.SpecialEffectsController.Operation.State r3, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r4, androidx.fragment.app.FragmentStateManager r5, androidx.core.os.CancellationSignal r6) {
            /*
                r2 = this;
                java.lang.String r0 = "finalState"
                kotlin.jvm.internal.AbstractC3292y.i(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                kotlin.jvm.internal.AbstractC3292y.i(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                kotlin.jvm.internal.AbstractC3292y.i(r5, r0)
                java.lang.String r0 = "cancellationSignal"
                kotlin.jvm.internal.AbstractC3292y.i(r6, r0)
                androidx.fragment.app.Fragment r0 = r5.getFragment()
                java.lang.String r1 = "fragmentStateManager.fragment"
                kotlin.jvm.internal.AbstractC3292y.h(r0, r1)
                r2.<init>(r3, r4, r0, r6)
                r2.fragmentStateManager = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.SpecialEffectsController.FragmentStateManagerOperation.<init>(androidx.fragment.app.SpecialEffectsController$Operation$State, androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact, androidx.fragment.app.FragmentStateManager, androidx.core.os.CancellationSignal):void");
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void complete() {
            super.complete();
            this.fragmentStateManager.moveToExpectedState();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void onStart() {
            if (getLifecycleImpact() == Operation.LifecycleImpact.ADDING) {
                Fragment fragment = this.fragmentStateManager.getFragment();
                AbstractC3292y.h(fragment, "fragmentStateManager.fragment");
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                View requireView = getFragment().requireView();
                AbstractC3292y.h(requireView, "this.fragment.requireView()");
                if (requireView.getParent() == null) {
                    this.fragmentStateManager.addViewToContainer();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
                return;
            }
            if (getLifecycleImpact() == Operation.LifecycleImpact.REMOVING) {
                Fragment fragment2 = this.fragmentStateManager.getFragment();
                AbstractC3292y.h(fragment2, "fragmentStateManager.fragment");
                View requireView2 = fragment2.requireView();
                AbstractC3292y.h(requireView2, "fragment.requireView()");
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + fragment2);
                }
                requireView2.clearFocus();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class Operation {
        private final List<Runnable> completionListeners;
        private State finalState;
        private final Fragment fragment;
        private boolean isCanceled;
        private boolean isComplete;
        private LifecycleImpact lifecycleImpact;
        private final Set<CancellationSignal> specialEffectsSignals;

        /* loaded from: classes3.dex */
        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        /* loaded from: classes3.dex */
        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static final Companion Companion = new Companion(null);

            /* loaded from: classes3.dex */
            public static final class Companion {
                private Companion() {
                }

                public final State asOperationState(View view) {
                    AbstractC3292y.i(view, "<this>");
                    if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                        return State.INVISIBLE;
                    }
                    return from(view.getVisibility());
                }

                public final State from(int i8) {
                    if (i8 != 0) {
                        if (i8 != 4) {
                            if (i8 == 8) {
                                return State.GONE;
                            }
                            throw new IllegalArgumentException("Unknown visibility " + i8);
                        }
                        return State.INVISIBLE;
                    }
                    return State.VISIBLE;
                }

                public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                    this();
                }
            }

            /* loaded from: classes3.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public static final State from(int i8) {
                return Companion.from(i8);
            }

            public final void applyState(View view) {
                ViewGroup viewGroup;
                AbstractC3292y.i(view, "view");
                int i8 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 == 4) {
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                                }
                                view.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        view.setVisibility(8);
                        return;
                    }
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        /* loaded from: classes3.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LifecycleImpact.values().length];
                try {
                    iArr[LifecycleImpact.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LifecycleImpact.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LifecycleImpact.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Operation(State finalState, LifecycleImpact lifecycleImpact, Fragment fragment, CancellationSignal cancellationSignal) {
            AbstractC3292y.i(finalState, "finalState");
            AbstractC3292y.i(lifecycleImpact, "lifecycleImpact");
            AbstractC3292y.i(fragment, "fragment");
            AbstractC3292y.i(cancellationSignal, "cancellationSignal");
            this.finalState = finalState;
            this.lifecycleImpact = lifecycleImpact;
            this.fragment = fragment;
            this.completionListeners = new ArrayList();
            this.specialEffectsSignals = new LinkedHashSet();
            cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.w
                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    SpecialEffectsController.Operation._init_$lambda$0(SpecialEffectsController.Operation.this);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(Operation this$0) {
            AbstractC3292y.i(this$0, "this$0");
            this$0.cancel();
        }

        public final void addCompletionListener(Runnable listener) {
            AbstractC3292y.i(listener, "listener");
            this.completionListeners.add(listener);
        }

        public final void cancel() {
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            if (this.specialEffectsSignals.isEmpty()) {
                complete();
                return;
            }
            Iterator it = AbstractC1435t.a1(this.specialEffectsSignals).iterator();
            while (it.hasNext()) {
                ((CancellationSignal) it.next()).cancel();
            }
        }

        @CallSuper
        public void complete() {
            if (this.isComplete) {
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "SpecialEffectsController: " + this + " has called complete.");
            }
            this.isComplete = true;
            Iterator<T> it = this.completionListeners.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void completeSpecialEffect(CancellationSignal signal) {
            AbstractC3292y.i(signal, "signal");
            if (this.specialEffectsSignals.remove(signal) && this.specialEffectsSignals.isEmpty()) {
                complete();
            }
        }

        public final State getFinalState() {
            return this.finalState;
        }

        public final Fragment getFragment() {
            return this.fragment;
        }

        public final LifecycleImpact getLifecycleImpact() {
            return this.lifecycleImpact;
        }

        public final boolean isCanceled() {
            return this.isCanceled;
        }

        public final boolean isComplete() {
            return this.isComplete;
        }

        public final void markStartedSpecialEffect(CancellationSignal signal) {
            AbstractC3292y.i(signal, "signal");
            onStart();
            this.specialEffectsSignals.add(signal);
        }

        public final void mergeWith(State finalState, LifecycleImpact lifecycleImpact) {
            AbstractC3292y.i(finalState, "finalState");
            AbstractC3292y.i(lifecycleImpact, "lifecycleImpact");
            int i8 = WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3 && this.finalState != State.REMOVED) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> " + finalState + '.');
                        }
                        this.finalState = finalState;
                        return;
                    }
                    return;
                }
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> REMOVED. mLifecycleImpact  = " + this.lifecycleImpact + " to REMOVING.");
                }
                this.finalState = State.REMOVED;
                this.lifecycleImpact = LifecycleImpact.REMOVING;
                return;
            }
            if (this.finalState == State.REMOVED) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.lifecycleImpact + " to ADDING.");
                }
                this.finalState = State.VISIBLE;
                this.lifecycleImpact = LifecycleImpact.ADDING;
            }
        }

        public void onStart() {
        }

        public final void setFinalState(State state) {
            AbstractC3292y.i(state, "<set-?>");
            this.finalState = state;
        }

        public final void setLifecycleImpact(LifecycleImpact lifecycleImpact) {
            AbstractC3292y.i(lifecycleImpact, "<set-?>");
            this.lifecycleImpact = lifecycleImpact;
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.finalState + " lifecycleImpact = " + this.lifecycleImpact + " fragment = " + this.fragment + '}';
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[Operation.LifecycleImpact.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SpecialEffectsController(ViewGroup container) {
        AbstractC3292y.i(container, "container");
        this.container = container;
        this.pendingOperations = new ArrayList();
        this.runningOperations = new ArrayList();
    }

    private final void enqueue(Operation.State state, Operation.LifecycleImpact lifecycleImpact, FragmentStateManager fragmentStateManager) {
        synchronized (this.pendingOperations) {
            CancellationSignal cancellationSignal = new CancellationSignal();
            Fragment fragment = fragmentStateManager.getFragment();
            AbstractC3292y.h(fragment, "fragmentStateManager.fragment");
            Operation findPendingOperation = findPendingOperation(fragment);
            if (findPendingOperation != null) {
                findPendingOperation.mergeWith(state, lifecycleImpact);
                return;
            }
            final FragmentStateManagerOperation fragmentStateManagerOperation = new FragmentStateManagerOperation(state, lifecycleImpact, fragmentStateManager, cancellationSignal);
            this.pendingOperations.add(fragmentStateManagerOperation);
            fragmentStateManagerOperation.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.u
                @Override // java.lang.Runnable
                public final void run() {
                    SpecialEffectsController.enqueue$lambda$4$lambda$2(SpecialEffectsController.this, fragmentStateManagerOperation);
                }
            });
            fragmentStateManagerOperation.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.v
                @Override // java.lang.Runnable
                public final void run() {
                    SpecialEffectsController.enqueue$lambda$4$lambda$3(SpecialEffectsController.this, fragmentStateManagerOperation);
                }
            });
            I i8 = I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$4$lambda$2(SpecialEffectsController this$0, FragmentStateManagerOperation operation) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(operation, "$operation");
        if (this$0.pendingOperations.contains(operation)) {
            Operation.State finalState = operation.getFinalState();
            View view = operation.getFragment().mView;
            AbstractC3292y.h(view, "operation.fragment.mView");
            finalState.applyState(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$4$lambda$3(SpecialEffectsController this$0, FragmentStateManagerOperation operation) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(operation, "$operation");
        this$0.pendingOperations.remove(operation);
        this$0.runningOperations.remove(operation);
    }

    private final Operation findPendingOperation(Fragment fragment) {
        Object obj;
        Iterator<T> it = this.pendingOperations.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Operation operation = (Operation) obj;
                if (AbstractC3292y.d(operation.getFragment(), fragment) && !operation.isCanceled()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Operation) obj;
    }

    private final Operation findRunningOperation(Fragment fragment) {
        Object obj;
        Iterator<T> it = this.runningOperations.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Operation operation = (Operation) obj;
                if (AbstractC3292y.d(operation.getFragment(), fragment) && !operation.isCanceled()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Operation) obj;
    }

    public static final SpecialEffectsController getOrCreateController(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return Companion.getOrCreateController(viewGroup, fragmentManager);
    }

    private final void updateFinalState() {
        for (Operation operation : this.pendingOperations) {
            if (operation.getLifecycleImpact() == Operation.LifecycleImpact.ADDING) {
                View requireView = operation.getFragment().requireView();
                AbstractC3292y.h(requireView, "fragment.requireView()");
                operation.mergeWith(Operation.State.Companion.from(requireView.getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    public final void enqueueAdd(Operation.State finalState, FragmentStateManager fragmentStateManager) {
        AbstractC3292y.i(finalState, "finalState");
        AbstractC3292y.i(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(finalState, Operation.LifecycleImpact.ADDING, fragmentStateManager);
    }

    public final void enqueueHide(FragmentStateManager fragmentStateManager) {
        AbstractC3292y.i(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.GONE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public final void enqueueRemove(FragmentStateManager fragmentStateManager) {
        AbstractC3292y.i(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, fragmentStateManager);
    }

    public final void enqueueShow(FragmentStateManager fragmentStateManager) {
        AbstractC3292y.i(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.getFragment());
        }
        enqueue(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public abstract void executeOperations(List<Operation> list, boolean z8);

    public final void executePendingOperations() {
        if (this.isContainerPostponed) {
            return;
        }
        if (!ViewCompat.isAttachedToWindow(this.container)) {
            forceCompleteAllOperations();
            this.operationDirectionIsPop = false;
            return;
        }
        synchronized (this.pendingOperations) {
            try {
                if (!this.pendingOperations.isEmpty()) {
                    List<Operation> Z02 = AbstractC1435t.Z0(this.runningOperations);
                    this.runningOperations.clear();
                    for (Operation operation : Z02) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "SpecialEffectsController: Cancelling operation " + operation);
                        }
                        operation.cancel();
                        if (!operation.isComplete()) {
                            this.runningOperations.add(operation);
                        }
                    }
                    updateFinalState();
                    List<Operation> Z03 = AbstractC1435t.Z0(this.pendingOperations);
                    this.pendingOperations.clear();
                    this.runningOperations.addAll(Z03);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator<Operation> it = Z03.iterator();
                    while (it.hasNext()) {
                        it.next().onStart();
                    }
                    executeOperations(Z03, this.operationDirectionIsPop);
                    this.operationDirectionIsPop = false;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void forceCompleteAllOperations() {
        String str;
        String str2;
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = ViewCompat.isAttachedToWindow(this.container);
        synchronized (this.pendingOperations) {
            try {
                updateFinalState();
                Iterator<Operation> it = this.pendingOperations.iterator();
                while (it.hasNext()) {
                    it.next().onStart();
                }
                for (Operation operation : AbstractC1435t.Z0(this.runningOperations)) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.container + " is not attached to window. ";
                        }
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: " + str2 + "Cancelling running operation " + operation);
                    }
                    operation.cancel();
                }
                for (Operation operation2 : AbstractC1435t.Z0(this.pendingOperations)) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.container + " is not attached to window. ";
                        }
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: " + str + "Cancelling pending operation " + operation2);
                    }
                    operation2.cancel();
                }
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void forcePostponedExecutePendingOperations() {
        if (this.isContainerPostponed) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "SpecialEffectsController: Forcing postponed operations");
            }
            this.isContainerPostponed = false;
            executePendingOperations();
        }
    }

    public final Operation.LifecycleImpact getAwaitingCompletionLifecycleImpact(FragmentStateManager fragmentStateManager) {
        Operation.LifecycleImpact lifecycleImpact;
        int i8;
        AbstractC3292y.i(fragmentStateManager, "fragmentStateManager");
        Fragment fragment = fragmentStateManager.getFragment();
        AbstractC3292y.h(fragment, "fragmentStateManager.fragment");
        Operation findPendingOperation = findPendingOperation(fragment);
        Operation.LifecycleImpact lifecycleImpact2 = null;
        if (findPendingOperation != null) {
            lifecycleImpact = findPendingOperation.getLifecycleImpact();
        } else {
            lifecycleImpact = null;
        }
        Operation findRunningOperation = findRunningOperation(fragment);
        if (findRunningOperation != null) {
            lifecycleImpact2 = findRunningOperation.getLifecycleImpact();
        }
        if (lifecycleImpact == null) {
            i8 = -1;
        } else {
            i8 = WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
        }
        if (i8 == -1 || i8 == 1) {
            return lifecycleImpact2;
        }
        return lifecycleImpact;
    }

    public final ViewGroup getContainer() {
        return this.container;
    }

    public final void markPostponedState() {
        Fragment fragment;
        Operation operation;
        boolean z8;
        synchronized (this.pendingOperations) {
            try {
                updateFinalState();
                List<Operation> list = this.pendingOperations;
                ListIterator<Operation> listIterator = list.listIterator(list.size());
                while (true) {
                    fragment = null;
                    if (listIterator.hasPrevious()) {
                        operation = listIterator.previous();
                        Operation operation2 = operation;
                        Operation.State.Companion companion = Operation.State.Companion;
                        View view = operation2.getFragment().mView;
                        AbstractC3292y.h(view, "operation.fragment.mView");
                        Operation.State asOperationState = companion.asOperationState(view);
                        Operation.State finalState = operation2.getFinalState();
                        Operation.State state = Operation.State.VISIBLE;
                        if (finalState == state && asOperationState != state) {
                            break;
                        }
                    } else {
                        operation = null;
                        break;
                    }
                }
                Operation operation3 = operation;
                if (operation3 != null) {
                    fragment = operation3.getFragment();
                }
                if (fragment != null) {
                    z8 = fragment.isPostponed();
                } else {
                    z8 = false;
                }
                this.isContainerPostponed = z8;
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void updateOperationDirection(boolean z8) {
        this.operationDirectionIsPop = z8;
    }

    public static final SpecialEffectsController getOrCreateController(ViewGroup viewGroup, SpecialEffectsControllerFactory specialEffectsControllerFactory) {
        return Companion.getOrCreateController(viewGroup, specialEffectsControllerFactory);
    }
}
