package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.internal.FastSafeIterableMap;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import q6.w;

/* loaded from: classes3.dex */
public class LifecycleRegistry extends Lifecycle {
    public static final Companion Companion = new Companion(null);
    private final w _currentStateFlow;
    private int addingObserverCounter;
    private final boolean enforceMainThread;
    private boolean handlingEvent;
    private final WeakReference<LifecycleOwner> lifecycleOwner;
    private boolean newEventOccurred;
    private FastSafeIterableMap<LifecycleObserver, ObserverWithState> observerMap;
    private ArrayList<Lifecycle.State> parentStates;
    private Lifecycle.State state;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        @VisibleForTesting
        public final LifecycleRegistry createUnsafe(LifecycleOwner owner) {
            AbstractC3292y.i(owner, "owner");
            return new LifecycleRegistry(owner, false, null);
        }

        public final Lifecycle.State min$lifecycle_runtime_release(Lifecycle.State state1, Lifecycle.State state) {
            AbstractC3292y.i(state1, "state1");
            if (state != null && state.compareTo(state1) < 0) {
                return state;
            }
            return state1;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class ObserverWithState {
        private LifecycleEventObserver lifecycleObserver;
        private Lifecycle.State state;

        public ObserverWithState(LifecycleObserver lifecycleObserver, Lifecycle.State initialState) {
            AbstractC3292y.i(initialState, "initialState");
            AbstractC3292y.f(lifecycleObserver);
            this.lifecycleObserver = Lifecycling.lifecycleEventObserver(lifecycleObserver);
            this.state = initialState;
        }

        public final void dispatchEvent(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            AbstractC3292y.i(event, "event");
            Lifecycle.State targetState = event.getTargetState();
            this.state = LifecycleRegistry.Companion.min$lifecycle_runtime_release(this.state, targetState);
            LifecycleEventObserver lifecycleEventObserver = this.lifecycleObserver;
            AbstractC3292y.f(lifecycleOwner);
            lifecycleEventObserver.onStateChanged(lifecycleOwner, event);
            this.state = targetState;
        }

        public final LifecycleEventObserver getLifecycleObserver() {
            return this.lifecycleObserver;
        }

        public final Lifecycle.State getState() {
            return this.state;
        }

        public final void setLifecycleObserver(LifecycleEventObserver lifecycleEventObserver) {
            AbstractC3292y.i(lifecycleEventObserver, "<set-?>");
            this.lifecycleObserver = lifecycleEventObserver;
        }

        public final void setState(Lifecycle.State state) {
            AbstractC3292y.i(state, "<set-?>");
            this.state = state;
        }
    }

    public /* synthetic */ LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z8, AbstractC3284p abstractC3284p) {
        this(lifecycleOwner, z8);
    }

    private final void backwardPass(LifecycleOwner lifecycleOwner) {
        Iterator<Map.Entry<LifecycleObserver, ObserverWithState>> descendingIterator = this.observerMap.descendingIterator();
        AbstractC3292y.h(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.newEventOccurred) {
            Map.Entry<LifecycleObserver, ObserverWithState> next = descendingIterator.next();
            AbstractC3292y.h(next, "next()");
            LifecycleObserver key = next.getKey();
            ObserverWithState value = next.getValue();
            while (value.getState().compareTo(this.state) > 0 && !this.newEventOccurred && this.observerMap.contains(key)) {
                Lifecycle.Event downFrom = Lifecycle.Event.Companion.downFrom(value.getState());
                if (downFrom != null) {
                    pushParentState(downFrom.getTargetState());
                    value.dispatchEvent(lifecycleOwner, downFrom);
                    popParentState();
                } else {
                    throw new IllegalStateException("no event down from " + value.getState());
                }
            }
        }
    }

    private final Lifecycle.State calculateTargetState(LifecycleObserver lifecycleObserver) {
        Lifecycle.State state;
        ObserverWithState value;
        Map.Entry<LifecycleObserver, ObserverWithState> ceil = this.observerMap.ceil(lifecycleObserver);
        Lifecycle.State state2 = null;
        if (ceil != null && (value = ceil.getValue()) != null) {
            state = value.getState();
        } else {
            state = null;
        }
        if (!this.parentStates.isEmpty()) {
            state2 = this.parentStates.get(r0.size() - 1);
        }
        Companion companion = Companion;
        return companion.min$lifecycle_runtime_release(companion.min$lifecycle_runtime_release(this.state, state), state2);
    }

    @VisibleForTesting
    public static final LifecycleRegistry createUnsafe(LifecycleOwner lifecycleOwner) {
        return Companion.createUnsafe(lifecycleOwner);
    }

    private final void enforceMainThreadIfNeeded(String str) {
        if (this.enforceMainThread && !LifecycleRegistry_androidKt.isMainThread()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    private final void forwardPass(LifecycleOwner lifecycleOwner) {
        SafeIterableMap<LifecycleObserver, ObserverWithState>.IteratorWithAdditions iteratorWithAdditions = this.observerMap.iteratorWithAdditions();
        AbstractC3292y.h(iteratorWithAdditions, "observerMap.iteratorWithAdditions()");
        while (iteratorWithAdditions.hasNext() && !this.newEventOccurred) {
            Map.Entry next = iteratorWithAdditions.next();
            LifecycleObserver lifecycleObserver = (LifecycleObserver) next.getKey();
            ObserverWithState observerWithState = (ObserverWithState) next.getValue();
            while (observerWithState.getState().compareTo(this.state) < 0 && !this.newEventOccurred && this.observerMap.contains(lifecycleObserver)) {
                pushParentState(observerWithState.getState());
                Lifecycle.Event upFrom = Lifecycle.Event.Companion.upFrom(observerWithState.getState());
                if (upFrom != null) {
                    observerWithState.dispatchEvent(lifecycleOwner, upFrom);
                    popParentState();
                } else {
                    throw new IllegalStateException("no event up from " + observerWithState.getState());
                }
            }
        }
    }

    private final boolean isSynced() {
        if (this.observerMap.size() == 0) {
            return true;
        }
        Map.Entry<LifecycleObserver, ObserverWithState> eldest = this.observerMap.eldest();
        AbstractC3292y.f(eldest);
        Lifecycle.State state = eldest.getValue().getState();
        Map.Entry<LifecycleObserver, ObserverWithState> newest = this.observerMap.newest();
        AbstractC3292y.f(newest);
        Lifecycle.State state2 = newest.getValue().getState();
        if (state == state2 && this.state == state2) {
            return true;
        }
        return false;
    }

    private final void moveToState(Lifecycle.State state) {
        Lifecycle.State state2 = this.state;
        if (state2 == state) {
            return;
        }
        if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + state + ", but was " + this.state + " in component " + this.lifecycleOwner.get()).toString());
        }
        this.state = state;
        if (!this.handlingEvent && this.addingObserverCounter == 0) {
            this.handlingEvent = true;
            sync();
            this.handlingEvent = false;
            if (this.state == Lifecycle.State.DESTROYED) {
                this.observerMap = new FastSafeIterableMap<>();
                return;
            }
            return;
        }
        this.newEventOccurred = true;
    }

    private final void popParentState() {
        this.parentStates.remove(r0.size() - 1);
    }

    private final void pushParentState(Lifecycle.State state) {
        this.parentStates.add(state);
    }

    private final void sync() {
        LifecycleOwner lifecycleOwner = this.lifecycleOwner.get();
        if (lifecycleOwner != null) {
            while (!isSynced()) {
                this.newEventOccurred = false;
                Lifecycle.State state = this.state;
                Map.Entry<LifecycleObserver, ObserverWithState> eldest = this.observerMap.eldest();
                AbstractC3292y.f(eldest);
                if (state.compareTo(eldest.getValue().getState()) < 0) {
                    backwardPass(lifecycleOwner);
                }
                Map.Entry<LifecycleObserver, ObserverWithState> newest = this.observerMap.newest();
                if (!this.newEventOccurred && newest != null && this.state.compareTo(newest.getValue().getState()) > 0) {
                    forwardPass(lifecycleOwner);
                }
            }
            this.newEventOccurred = false;
            this._currentStateFlow.setValue(getCurrentState());
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(LifecycleObserver observer) {
        LifecycleOwner lifecycleOwner;
        boolean z8;
        AbstractC3292y.i(observer, "observer");
        enforceMainThreadIfNeeded("addObserver");
        Lifecycle.State state = this.state;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        ObserverWithState observerWithState = new ObserverWithState(observer, state2);
        if (this.observerMap.putIfAbsent(observer, observerWithState) != null || (lifecycleOwner = this.lifecycleOwner.get()) == null) {
            return;
        }
        if (this.addingObserverCounter == 0 && !this.handlingEvent) {
            z8 = false;
        } else {
            z8 = true;
        }
        Lifecycle.State calculateTargetState = calculateTargetState(observer);
        this.addingObserverCounter++;
        while (observerWithState.getState().compareTo(calculateTargetState) < 0 && this.observerMap.contains(observer)) {
            pushParentState(observerWithState.getState());
            Lifecycle.Event upFrom = Lifecycle.Event.Companion.upFrom(observerWithState.getState());
            if (upFrom != null) {
                observerWithState.dispatchEvent(lifecycleOwner, upFrom);
                popParentState();
                calculateTargetState = calculateTargetState(observer);
            } else {
                throw new IllegalStateException("no event up from " + observerWithState.getState());
            }
        }
        if (!z8) {
            sync();
        }
        this.addingObserverCounter--;
    }

    @Override // androidx.lifecycle.Lifecycle
    public Lifecycle.State getCurrentState() {
        return this.state;
    }

    @Override // androidx.lifecycle.Lifecycle
    public InterfaceC3813L getCurrentStateFlow() {
        return AbstractC3823h.b(this._currentStateFlow);
    }

    public int getObserverCount() {
        enforceMainThreadIfNeeded("getObserverCount");
        return this.observerMap.size();
    }

    public void handleLifecycleEvent(Lifecycle.Event event) {
        AbstractC3292y.i(event, "event");
        enforceMainThreadIfNeeded("handleLifecycleEvent");
        moveToState(event.getTargetState());
    }

    @MainThread
    public void markState(Lifecycle.State state) {
        AbstractC3292y.i(state, "state");
        enforceMainThreadIfNeeded("markState");
        setCurrentState(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(LifecycleObserver observer) {
        AbstractC3292y.i(observer, "observer");
        enforceMainThreadIfNeeded("removeObserver");
        this.observerMap.remove(observer);
    }

    public void setCurrentState(Lifecycle.State state) {
        AbstractC3292y.i(state, "state");
        enforceMainThreadIfNeeded("setCurrentState");
        moveToState(state);
    }

    private LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z8) {
        this.enforceMainThread = z8;
        this.observerMap = new FastSafeIterableMap<>();
        Lifecycle.State state = Lifecycle.State.INITIALIZED;
        this.state = state;
        this.parentStates = new ArrayList<>();
        this.lifecycleOwner = new WeakReference<>(lifecycleOwner);
        this._currentStateFlow = AbstractC3815N.a(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LifecycleRegistry(LifecycleOwner provider) {
        this(provider, true);
        AbstractC3292y.i(provider, "provider");
    }
}
