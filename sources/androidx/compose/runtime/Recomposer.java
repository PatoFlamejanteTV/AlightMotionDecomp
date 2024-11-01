package androidx.compose.runtime;

import Q5.I;
import Q5.r;
import Q5.s;
import Q5.x;
import R5.AbstractC1435t;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.tooling.CompositionData;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.B0;
import n6.C3472p;
import n6.InterfaceC3435A;
import n6.InterfaceC3470o;
import n6.InterfaceC3488x0;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;
import q6.w;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class Recomposer extends CompositionContext {
    private final List<ControlledComposition> _knownCompositions;
    private List<? extends ControlledComposition> _knownCompositionsCache;
    private final w _state;
    private final BroadcastFrameClock broadcastFrameClock;
    private long changeCount;
    private Throwable closeCause;
    private final List<ControlledComposition> compositionInvalidations;
    private final Map<MovableContentStateReference, MovableContentState> compositionValueStatesAvailable;
    private final List<MovableContentStateReference> compositionValuesAwaitingInsert;
    private final Map<MovableContent<Object>, List<MovableContentStateReference>> compositionValuesRemoved;
    private final List<ControlledComposition> compositionsAwaitingApply;
    private Set<ControlledComposition> compositionsRemoved;
    private int concurrentCompositionsOutstanding;
    private final U5.g effectCoroutineContext;
    private final InterfaceC3435A effectJob;
    private RecomposerErrorState errorState;
    private List<ControlledComposition> failedCompositions;
    private boolean frameClockPaused;
    private boolean isClosed;
    private final RecomposerInfoImpl recomposerInfo;
    private InterfaceC3488x0 runnerJob;
    private IdentityArraySet<Object> snapshotInvalidations;
    private final Object stateLock;
    private InterfaceC3470o workContinuation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final w _runningRecomposers = AbstractC3815N.a(ExtensionsKt.persistentSetOf());
    private static final AtomicReference<Boolean> _hotReloadEnabled = new AtomicReference<>(Boolean.FALSE);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addRunning(RecomposerInfoImpl recomposerInfoImpl) {
            PersistentSet persistentSet;
            PersistentSet add;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                add = persistentSet.add((PersistentSet) recomposerInfoImpl);
                if (persistentSet == add) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.a(persistentSet, add));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeRunning(RecomposerInfoImpl recomposerInfoImpl) {
            PersistentSet persistentSet;
            PersistentSet remove;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                remove = persistentSet.remove((PersistentSet) recomposerInfoImpl);
                if (persistentSet == remove) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.a(persistentSet, remove));
        }

        public final void clearErrors$runtime_release() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorState resetErrorState = ((RecomposerInfoImpl) it.next()).resetErrorState();
                if (resetErrorState != null) {
                    arrayList.add(resetErrorState);
                }
            }
        }

        public final List<RecomposerErrorInfo> getCurrentErrors$runtime_release() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorInfo currentError = ((RecomposerInfoImpl) it.next()).getCurrentError();
                if (currentError != null) {
                    arrayList.add(currentError);
                }
            }
            return arrayList;
        }

        public final InterfaceC3813L getRunningRecomposers() {
            return Recomposer._runningRecomposers;
        }

        public final void invalidateGroupsWithKey$runtime_release(int i8) {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            for (RecomposerInfoImpl recomposerInfoImpl : (Iterable) Recomposer._runningRecomposers.getValue()) {
                RecomposerErrorInfo currentError = recomposerInfoImpl.getCurrentError();
                if (currentError == null || currentError.getRecoverable()) {
                    recomposerInfoImpl.resetErrorState();
                    recomposerInfoImpl.invalidateGroupsWithKey(i8);
                    recomposerInfoImpl.retryFailedCompositions();
                }
            }
        }

        public final void loadStateAndComposeForHotReload$runtime_release(Object obj) {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            Iterator it = ((Iterable) Recomposer._runningRecomposers.getValue()).iterator();
            while (it.hasNext()) {
                ((RecomposerInfoImpl) it.next()).resetErrorState();
            }
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.runtime.Recomposer.HotReloadable>");
            List list = (List) obj;
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((HotReloadable) list.get(i8)).resetContent();
            }
            int size2 = list.size();
            for (int i9 = 0; i9 < size2; i9++) {
                ((HotReloadable) list.get(i9)).recompose();
            }
            Iterator it2 = ((Iterable) Recomposer._runningRecomposers.getValue()).iterator();
            while (it2.hasNext()) {
                ((RecomposerInfoImpl) it2.next()).retryFailedCompositions();
            }
        }

        public final Object saveStateAndDisposeForHotReload$runtime_release() {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                AbstractC1435t.C(arrayList, ((RecomposerInfoImpl) it.next()).saveStateAndDisposeForHotReload());
            }
            return arrayList;
        }

        public final void setHotReloadEnabled$runtime_release(boolean z8) {
            Recomposer._hotReloadEnabled.set(Boolean.valueOf(z8));
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class HotReloadable {
        private InterfaceC2072n composable;
        private final CompositionImpl composition;

        public HotReloadable(CompositionImpl compositionImpl) {
            this.composition = compositionImpl;
            this.composable = compositionImpl.getComposable();
        }

        public final void clearContent() {
            if (this.composition.isRoot()) {
                this.composition.setContent(ComposableSingletons$RecomposerKt.INSTANCE.m2441getLambda1$runtime_release());
            }
        }

        public final void recompose() {
            if (this.composition.isRoot()) {
                this.composition.setContent(this.composable);
            }
        }

        public final void resetContent() {
            this.composition.setComposable(this.composable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class RecomposerErrorState implements RecomposerErrorInfo {
        private final Exception cause;
        private final boolean recoverable;

        public RecomposerErrorState(boolean z8, Exception exc) {
            this.recoverable = z8;
            this.cause = exc;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public Exception getCause() {
            return this.cause;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public boolean getRecoverable() {
            return this.recoverable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class RecomposerInfoImpl implements RecomposerInfo {
        public RecomposerInfoImpl() {
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public long getChangeCount() {
            return Recomposer.this.getChangeCount();
        }

        public final RecomposerErrorInfo getCurrentError() {
            RecomposerErrorState recomposerErrorState;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                recomposerErrorState = recomposer.errorState;
            }
            return recomposerErrorState;
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public boolean getHasPendingWork() {
            return Recomposer.this.getHasPendingWork();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public InterfaceC3821f getState() {
            return Recomposer.this.getCurrentState();
        }

        public final void invalidateGroupsWithKey(int i8) {
            List knownCompositions;
            CompositionImpl compositionImpl;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                knownCompositions = recomposer.getKnownCompositions();
            }
            ArrayList arrayList = new ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i9 = 0; i9 < size; i9++) {
                ControlledComposition controlledComposition = (ControlledComposition) knownCompositions.get(i9);
                if (controlledComposition instanceof CompositionImpl) {
                    compositionImpl = (CompositionImpl) controlledComposition;
                } else {
                    compositionImpl = null;
                }
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            int size2 = arrayList.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((CompositionImpl) arrayList.get(i10)).invalidateGroupsWithKey(i8);
            }
        }

        public final RecomposerErrorState resetErrorState() {
            return Recomposer.this.resetErrorState();
        }

        public final void retryFailedCompositions() {
            Recomposer.this.retryFailedCompositions();
        }

        public final List<HotReloadable> saveStateAndDisposeForHotReload() {
            List knownCompositions;
            CompositionImpl compositionImpl;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                knownCompositions = recomposer.getKnownCompositions();
            }
            ArrayList arrayList = new ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i8 = 0; i8 < size; i8++) {
                ControlledComposition controlledComposition = (ControlledComposition) knownCompositions.get(i8);
                if (controlledComposition instanceof CompositionImpl) {
                    compositionImpl = (CompositionImpl) controlledComposition;
                } else {
                    compositionImpl = null;
                }
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i9 = 0; i9 < size2; i9++) {
                HotReloadable hotReloadable = new HotReloadable((CompositionImpl) arrayList.get(i9));
                hotReloadable.clearContent();
                arrayList2.add(hotReloadable);
            }
            return arrayList2;
        }
    }

    /* loaded from: classes.dex */
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    public Recomposer(U5.g gVar) {
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Recomposer$broadcastFrameClock$1(this));
        this.broadcastFrameClock = broadcastFrameClock;
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new IdentityArraySet<>();
        this.compositionInvalidations = new ArrayList();
        this.compositionsAwaitingApply = new ArrayList();
        this.compositionValuesAwaitingInsert = new ArrayList();
        this.compositionValuesRemoved = new LinkedHashMap();
        this.compositionValueStatesAvailable = new LinkedHashMap();
        this._state = AbstractC3815N.a(State.Inactive);
        InterfaceC3435A a9 = B0.a((InterfaceC3488x0) gVar.get(InterfaceC3488x0.f35757n0));
        a9.u(new Recomposer$effectJob$1$1(this));
        this.effectJob = a9;
        this.effectCoroutineContext = gVar.plus(broadcastFrameClock).plus(a9);
        this.recomposerInfo = new RecomposerInfoImpl();
    }

    private final void addKnownCompositionLocked(ControlledComposition controlledComposition) {
        this._knownCompositions.add(controlledComposition);
        this._knownCompositionsCache = null;
    }

    private final void applyAndCheck(MutableSnapshot mutableSnapshot) {
        try {
            if (!(mutableSnapshot.apply() instanceof SnapshotApplyResult.Failure)) {
            } else {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            mutableSnapshot.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitWorkAvailable(U5.d dVar) {
        C3472p c3472p;
        if (!getHasSchedulingWork()) {
            C3472p c3472p2 = new C3472p(V5.b.c(dVar), 1);
            c3472p2.B();
            synchronized (this.stateLock) {
                if (!getHasSchedulingWork()) {
                    this.workContinuation = c3472p2;
                    c3472p = null;
                } else {
                    c3472p = c3472p2;
                }
            }
            if (c3472p != null) {
                s.a aVar = s.f8810b;
                c3472p.resumeWith(s.b(I.f8786a));
            }
            Object y8 = c3472p2.y();
            if (y8 == V5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (y8 == V5.b.e()) {
                return y8;
            }
            return I.f8786a;
        }
        return I.f8786a;
    }

    private final void clearKnownCompositionsLocked() {
        this._knownCompositions.clear();
        this._knownCompositionsCache = AbstractC1435t.m();
    }

    private final <T> T composing(ControlledComposition controlledComposition, IdentityArraySet<Object> identityArraySet, Function0 function0) {
        MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, identityArraySet));
        try {
            Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
            try {
                return (T) function0.invoke();
            } finally {
                AbstractC3290w.b(1);
                takeMutableSnapshot.restoreCurrent(makeCurrent);
                AbstractC3290w.a(1);
            }
        } finally {
            AbstractC3290w.b(1);
            applyAndCheck(takeMutableSnapshot);
            AbstractC3290w.a(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3470o deriveStateLocked() {
        State state;
        if (((State) this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
            clearKnownCompositionsLocked();
            this.snapshotInvalidations = new IdentityArraySet<>();
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.compositionValuesAwaitingInsert.clear();
            this.failedCompositions = null;
            InterfaceC3470o interfaceC3470o = this.workContinuation;
            if (interfaceC3470o != null) {
                InterfaceC3470o.a.a(interfaceC3470o, null, 1, null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            state = State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new IdentityArraySet<>();
            this.compositionInvalidations.clear();
            if (getHasBroadcastFrameClockAwaitersLocked()) {
                state = State.InactivePendingWork;
            } else {
                state = State.Inactive;
            }
        } else if (!(!this.compositionInvalidations.isEmpty()) && !this.snapshotInvalidations.isNotEmpty() && !(!this.compositionsAwaitingApply.isEmpty()) && !(!this.compositionValuesAwaitingInsert.isEmpty()) && this.concurrentCompositionsOutstanding <= 0 && !getHasBroadcastFrameClockAwaitersLocked()) {
            state = State.Idle;
        } else {
            state = State.PendingWork;
        }
        this._state.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        InterfaceC3470o interfaceC3470o2 = this.workContinuation;
        this.workContinuation = null;
        return interfaceC3470o2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardUnusedValues() {
        int i8;
        List m8;
        synchronized (this.stateLock) {
            try {
                if (!this.compositionValuesRemoved.isEmpty()) {
                    List z8 = AbstractC1435t.z(this.compositionValuesRemoved.values());
                    this.compositionValuesRemoved.clear();
                    m8 = new ArrayList(z8.size());
                    int size = z8.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        MovableContentStateReference movableContentStateReference = (MovableContentStateReference) z8.get(i9);
                        m8.add(x.a(movableContentStateReference, this.compositionValueStatesAvailable.get(movableContentStateReference)));
                    }
                    this.compositionValueStatesAvailable.clear();
                } else {
                    m8 = AbstractC1435t.m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size2 = m8.size();
        for (i8 = 0; i8 < size2; i8++) {
            r rVar = (r) m8.get(i8);
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) rVar.a();
            MovableContentState movableContentState = (MovableContentState) rVar.b();
            if (movableContentState != null) {
                movableContentStateReference2.getComposition$runtime_release().disposeUnusedMovableContent(movableContentState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasBroadcastFrameClockAwaiters() {
        boolean hasBroadcastFrameClockAwaitersLocked;
        synchronized (this.stateLock) {
            hasBroadcastFrameClockAwaitersLocked = getHasBroadcastFrameClockAwaitersLocked();
        }
        return hasBroadcastFrameClockAwaitersLocked;
    }

    private final boolean getHasBroadcastFrameClockAwaitersLocked() {
        if (!this.frameClockPaused && this.broadcastFrameClock.getHasAwaiters()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasConcurrentFrameWorkLocked() {
        if ((!this.compositionsAwaitingApply.isEmpty()) || getHasBroadcastFrameClockAwaitersLocked()) {
            return true;
        }
        return false;
    }

    private final boolean getHasFrameWorkLocked() {
        if ((!this.compositionInvalidations.isEmpty()) || getHasBroadcastFrameClockAwaitersLocked()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasSchedulingWork() {
        boolean z8;
        synchronized (this.stateLock) {
            z8 = true;
            if (!this.snapshotInvalidations.isNotEmpty() && !(!this.compositionInvalidations.isEmpty())) {
                if (!getHasBroadcastFrameClockAwaitersLocked()) {
                    z8 = false;
                }
            }
        }
        return z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<ControlledComposition> getKnownCompositions() {
        List arrayList;
        List list = this._knownCompositionsCache;
        List list2 = list;
        if (list == null) {
            List<ControlledComposition> list3 = this._knownCompositions;
            if (list3.isEmpty()) {
                arrayList = AbstractC1435t.m();
            } else {
                arrayList = new ArrayList(list3);
            }
            this._knownCompositionsCache = arrayList;
            list2 = arrayList;
        }
        return list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldKeepRecomposing() {
        boolean z8;
        synchronized (this.stateLock) {
            z8 = !this.isClosed;
        }
        if (z8) {
            return true;
        }
        Iterator it = this.effectJob.j().iterator();
        while (it.hasNext()) {
            if (((InterfaceC3488x0) it.next()).isActive()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void getState$annotations() {
    }

    private final void performInitialMovableContentInserts(ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            List<MovableContentStateReference> list = this.compositionValuesAwaitingInsert;
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (AbstractC3292y.d(list.get(i8).getComposition$runtime_release(), controlledComposition)) {
                    I i9 = I.f8786a;
                    ArrayList arrayList = new ArrayList();
                    performInitialMovableContentInserts$fillToInsert(arrayList, this, controlledComposition);
                    while (!arrayList.isEmpty()) {
                        performInsertValues(arrayList, null);
                        performInitialMovableContentInserts$fillToInsert(arrayList, this, controlledComposition);
                    }
                    return;
                }
            }
        }
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                Iterator<MovableContentStateReference> it = recomposer.compositionValuesAwaitingInsert.iterator();
                while (it.hasNext()) {
                    MovableContentStateReference next = it.next();
                    if (AbstractC3292y.d(next.getComposition$runtime_release(), controlledComposition)) {
                        list.add(next);
                        it.remove();
                    }
                }
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ControlledComposition> performInsertValues(List<MovableContentStateReference> list, IdentityArraySet<Object> identityArraySet) {
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            MovableContentStateReference movableContentStateReference = list.get(i8);
            ControlledComposition composition$runtime_release = movableContentStateReference.getComposition$runtime_release();
            Object obj = hashMap.get(composition$runtime_release);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(composition$runtime_release, obj);
            }
            ((ArrayList) obj).add(movableContentStateReference);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ControlledComposition controlledComposition = (ControlledComposition) entry.getKey();
            List list2 = (List) entry.getValue();
            ComposerKt.runtimeCheck(!controlledComposition.isComposing());
            MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, identityArraySet));
            try {
                Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
                try {
                    synchronized (this.stateLock) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) list2.get(i9);
                            arrayList.add(x.a(movableContentStateReference2, RecomposerKt.removeLastMultiValue(this.compositionValuesRemoved, movableContentStateReference2.getContent$runtime_release())));
                        }
                    }
                    controlledComposition.insertMovableContent(arrayList);
                    I i10 = I.f8786a;
                } finally {
                    takeMutableSnapshot.restoreCurrent(makeCurrent);
                }
            } finally {
                applyAndCheck(takeMutableSnapshot);
            }
        }
        return AbstractC1435t.W0(hashMap.keySet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ControlledComposition performRecompose(ControlledComposition controlledComposition, IdentityArraySet<Object> identityArraySet) {
        Set<ControlledComposition> set;
        if (controlledComposition.isComposing() || controlledComposition.isDisposed() || ((set = this.compositionsRemoved) != null && set.contains(controlledComposition))) {
            return null;
        }
        MutableSnapshot takeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, identityArraySet));
        try {
            Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
            if (identityArraySet != null) {
                try {
                    if (identityArraySet.isNotEmpty()) {
                        controlledComposition.prepareCompose(new Recomposer$performRecompose$1$1(identityArraySet, controlledComposition));
                    }
                } catch (Throwable th) {
                    takeMutableSnapshot.restoreCurrent(makeCurrent);
                    throw th;
                }
            }
            boolean recompose = controlledComposition.recompose();
            takeMutableSnapshot.restoreCurrent(makeCurrent);
            if (!recompose) {
                return null;
            }
            return controlledComposition;
        } finally {
            applyAndCheck(takeMutableSnapshot);
        }
    }

    private final void processCompositionError(Exception exc, ControlledComposition controlledComposition, boolean z8) {
        if (_hotReloadEnabled.get().booleanValue() && !(exc instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                try {
                    ActualAndroid_androidKt.logError("Error was captured in composition while live edit was enabled.", exc);
                    this.compositionsAwaitingApply.clear();
                    this.compositionInvalidations.clear();
                    this.snapshotInvalidations = new IdentityArraySet<>();
                    this.compositionValuesAwaitingInsert.clear();
                    this.compositionValuesRemoved.clear();
                    this.compositionValueStatesAvailable.clear();
                    this.errorState = new RecomposerErrorState(z8, exc);
                    if (controlledComposition != null) {
                        List list = this.failedCompositions;
                        if (list == null) {
                            list = new ArrayList();
                            this.failedCompositions = list;
                        }
                        if (!list.contains(controlledComposition)) {
                            list.add(controlledComposition);
                        }
                        removeKnownCompositionLocked(controlledComposition);
                    }
                    deriveStateLocked();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        synchronized (this.stateLock) {
            RecomposerErrorState recomposerErrorState = this.errorState;
            if (recomposerErrorState == null) {
                this.errorState = new RecomposerErrorState(false, exc);
                I i8 = I.f8786a;
            } else {
                throw recomposerErrorState.getCause();
            }
        }
        throw exc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void processCompositionError$default(Recomposer recomposer, Exception exc, ControlledComposition controlledComposition, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            controlledComposition = null;
        }
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        recomposer.processCompositionError(exc, controlledComposition, z8);
    }

    private final Function1 readObserverOf(ControlledComposition controlledComposition) {
        return new Recomposer$readObserverOf$1(controlledComposition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object recompositionRunner(InterfaceC2073o interfaceC2073o, U5.d dVar) {
        Object g8 = AbstractC3458i.g(this.broadcastFrameClock, new Recomposer$recompositionRunner$2(this, interfaceC2073o, MonotonicFrameClockKt.getMonotonicFrameClock(dVar.getContext()), null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean recordComposerModifications() {
        List<ControlledComposition> knownCompositions;
        boolean hasFrameWorkLocked;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.isEmpty()) {
                return getHasFrameWorkLocked();
            }
            IdentityArraySet<Object> identityArraySet = this.snapshotInvalidations;
            this.snapshotInvalidations = new IdentityArraySet<>();
            synchronized (this.stateLock) {
                knownCompositions = getKnownCompositions();
            }
            try {
                int size = knownCompositions.size();
                for (int i8 = 0; i8 < size; i8++) {
                    knownCompositions.get(i8).recordModificationsOf(identityArraySet);
                    if (((State) this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                this.snapshotInvalidations = new IdentityArraySet<>();
                synchronized (this.stateLock) {
                    if (deriveStateLocked() == null) {
                        hasFrameWorkLocked = getHasFrameWorkLocked();
                    } else {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                    }
                }
                return hasFrameWorkLocked;
            } catch (Throwable th) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.addAll((Collection<? extends Object>) identityArraySet);
                    I i9 = I.f8786a;
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerRunnerJob(InterfaceC3488x0 interfaceC3488x0) {
        synchronized (this.stateLock) {
            Throwable th = this.closeCause;
            if (th == null) {
                if (((State) this._state.getValue()).compareTo(State.ShuttingDown) > 0) {
                    if (this.runnerJob == null) {
                        this.runnerJob = interfaceC3488x0;
                        deriveStateLocked();
                    } else {
                        throw new IllegalStateException("Recomposer already running".toString());
                    }
                } else {
                    throw new IllegalStateException("Recomposer shut down".toString());
                }
            } else {
                throw th;
            }
        }
    }

    private final void removeKnownCompositionLocked(ControlledComposition controlledComposition) {
        this._knownCompositions.remove(controlledComposition);
        this._knownCompositionsCache = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecomposerErrorState resetErrorState() {
        RecomposerErrorState recomposerErrorState;
        synchronized (this.stateLock) {
            recomposerErrorState = this.errorState;
            if (recomposerErrorState != null) {
                this.errorState = null;
                deriveStateLocked();
            }
        }
        return recomposerErrorState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryFailedCompositions() {
        List<ControlledComposition> list;
        synchronized (this.stateLock) {
            list = this.failedCompositions;
            this.failedCompositions = null;
        }
        if (list == null) {
            return;
        }
        while (!list.isEmpty()) {
            try {
                ControlledComposition controlledComposition = (ControlledComposition) AbstractC1435t.P(list);
                if (controlledComposition instanceof CompositionImpl) {
                    controlledComposition.invalidateAll();
                    controlledComposition.setContent(((CompositionImpl) controlledComposition).getComposable());
                    if (this.errorState != null) {
                        break;
                    }
                }
            } catch (Throwable th) {
                if (!list.isEmpty()) {
                    synchronized (this.stateLock) {
                        try {
                            List<ControlledComposition> list2 = this.failedCompositions;
                            if (list2 != null) {
                                list2.addAll(list);
                                list = list2;
                            }
                            this.failedCompositions = list;
                            I i8 = I.f8786a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                throw th;
            }
        }
        if (!list.isEmpty()) {
            synchronized (this.stateLock) {
                try {
                    List<ControlledComposition> list3 = this.failedCompositions;
                    if (list3 != null) {
                        list3.addAll(list);
                        list = list3;
                    }
                    this.failedCompositions = list;
                    I i9 = I.f8786a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a2 -> B:11:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object runFrameLoop(androidx.compose.runtime.MonotonicFrameClock r8, androidx.compose.runtime.ProduceFrameSignal r9, U5.d r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.runtime.Recomposer$runFrameLoop$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = (androidx.compose.runtime.Recomposer$runFrameLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = new androidx.compose.runtime.Recomposer$runFrameLoop$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L65
            if (r2 == r4) goto L4d
            if (r2 != r3) goto L45
            java.lang.Object r8 = r0.L$4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$2
            androidx.compose.runtime.ProduceFrameSignal r2 = (androidx.compose.runtime.ProduceFrameSignal) r2
            java.lang.Object r5 = r0.L$1
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            Q5.t.b(r10)
        L3f:
            r10 = r9
            r9 = r2
            r2 = r8
            r8 = r5
            r5 = r6
            goto L73
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4d:
            java.lang.Object r8 = r0.L$4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$2
            androidx.compose.runtime.ProduceFrameSignal r2 = (androidx.compose.runtime.ProduceFrameSignal) r2
            java.lang.Object r5 = r0.L$1
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            Q5.t.b(r10)
            goto L8d
        L65:
            Q5.t.b(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5 = r7
        L73:
            java.lang.Object r6 = r5.stateLock
            r0.L$0 = r5
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r10
            r0.L$4 = r2
            r0.label = r4
            java.lang.Object r6 = r9.awaitFrameRequest(r6, r0)
            if (r6 != r1) goto L88
            return r1
        L88:
            r6 = r5
            r5 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L8d:
            androidx.compose.runtime.Recomposer$runFrameLoop$2 r10 = new androidx.compose.runtime.Recomposer$runFrameLoop$2
            r10.<init>(r6, r9, r8, r2)
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r2
            r0.L$3 = r9
            r0.L$4 = r8
            r0.label = r3
            java.lang.Object r10 = r5.withFrameNanos(r10, r0)
            if (r10 != r1) goto L3f
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.runFrameLoop(androidx.compose.runtime.MonotonicFrameClock, androidx.compose.runtime.ProduceFrameSignal, U5.d):java.lang.Object");
    }

    private final Function1 writeObserverOf(ControlledComposition controlledComposition, IdentityArraySet<Object> identityArraySet) {
        return new Recomposer$writeObserverOf$1(controlledComposition, identityArraySet);
    }

    public final RecomposerInfo asRecomposerInfo() {
        return this.recomposerInfo;
    }

    public final Object awaitIdle(U5.d dVar) {
        Object i8 = AbstractC3823h.i(AbstractC3823h.L(getCurrentState(), new Recomposer$awaitIdle$2(null)), dVar);
        if (i8 == V5.b.e()) {
            return i8;
        }
        return I.f8786a;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            try {
                if (((State) this._state.getValue()).compareTo(State.Idle) >= 0) {
                    this._state.setValue(State.ShuttingDown);
                }
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
        InterfaceC3488x0.a.a(this.effectJob, null, 1, null);
    }

    public final void close() {
        if (this.effectJob.complete()) {
            synchronized (this.stateLock) {
                this.isClosed = true;
                I i8 = I.f8786a;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @ComposableInferredTarget(scheme = "[0[0]]")
    public void composeInitial$runtime_release(ControlledComposition controlledComposition, InterfaceC2072n interfaceC2072n) {
        boolean isComposing = controlledComposition.isComposing();
        try {
            Snapshot.Companion companion = Snapshot.Companion;
            MutableSnapshot takeMutableSnapshot = companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, null));
            try {
                Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
                try {
                    controlledComposition.composeContent(interfaceC2072n);
                    I i8 = I.f8786a;
                    if (!isComposing) {
                        companion.notifyObjectsInitialized();
                    }
                    synchronized (this.stateLock) {
                        if (((State) this._state.getValue()).compareTo(State.ShuttingDown) > 0 && !getKnownCompositions().contains(controlledComposition)) {
                            addKnownCompositionLocked(controlledComposition);
                        }
                    }
                    try {
                        performInitialMovableContentInserts(controlledComposition);
                        try {
                            controlledComposition.applyChanges();
                            controlledComposition.applyLateChanges();
                            if (!isComposing) {
                                companion.notifyObjectsInitialized();
                            }
                        } catch (Exception e8) {
                            processCompositionError$default(this, e8, null, false, 6, null);
                        }
                    } catch (Exception e9) {
                        processCompositionError(e9, controlledComposition, true);
                    }
                } finally {
                    takeMutableSnapshot.restoreCurrent(makeCurrent);
                }
            } finally {
                applyAndCheck(takeMutableSnapshot);
            }
        } catch (Exception e10) {
            processCompositionError(e10, controlledComposition, true);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void deletedMovableContent$runtime_release(MovableContentStateReference movableContentStateReference) {
        synchronized (this.stateLock) {
            RecomposerKt.addMultiValue(this.compositionValuesRemoved, movableContentStateReference.getContent$runtime_release(), movableContentStateReference);
        }
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingParameterInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingSourceInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public int getCompoundHashKey$runtime_release() {
        return 1000;
    }

    public final InterfaceC3813L getCurrentState() {
        return this._state;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public U5.g getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    public final boolean getHasPendingWork() {
        boolean z8;
        synchronized (this.stateLock) {
            z8 = true;
            if (!this.snapshotInvalidations.isNotEmpty() && !(!this.compositionInvalidations.isEmpty()) && this.concurrentCompositionsOutstanding <= 0 && !(!this.compositionsAwaitingApply.isEmpty())) {
                if (!getHasBroadcastFrameClockAwaitersLocked()) {
                    z8 = false;
                }
            }
        }
        return z8;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public U5.g getRecomposeCoroutineContext$runtime_release() {
        return U5.h.f10149a;
    }

    public final InterfaceC3821f getState() {
        return getCurrentState();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime_release(MovableContentStateReference movableContentStateReference) {
        InterfaceC3470o deriveStateLocked;
        synchronized (this.stateLock) {
            this.compositionValuesAwaitingInsert.add(movableContentStateReference);
            deriveStateLocked = deriveStateLocked();
        }
        if (deriveStateLocked != null) {
            s.a aVar = s.f8810b;
            deriveStateLocked.resumeWith(s.b(I.f8786a));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime_release(ControlledComposition controlledComposition) {
        InterfaceC3470o interfaceC3470o;
        synchronized (this.stateLock) {
            if (!this.compositionInvalidations.contains(controlledComposition)) {
                this.compositionInvalidations.add(controlledComposition);
                interfaceC3470o = deriveStateLocked();
            } else {
                interfaceC3470o = null;
            }
        }
        if (interfaceC3470o != null) {
            s.a aVar = s.f8810b;
            interfaceC3470o.resumeWith(s.b(I.f8786a));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidateScope$runtime_release(RecomposeScopeImpl recomposeScopeImpl) {
        InterfaceC3470o deriveStateLocked;
        synchronized (this.stateLock) {
            this.snapshotInvalidations.add(recomposeScopeImpl);
            deriveStateLocked = deriveStateLocked();
        }
        if (deriveStateLocked != null) {
            s.a aVar = s.f8810b;
            deriveStateLocked.resumeWith(s.b(I.f8786a));
        }
    }

    public final Object join(U5.d dVar) {
        Object x8 = AbstractC3823h.x(getCurrentState(), new Recomposer$join$2(null), dVar);
        if (x8 == V5.b.e()) {
            return x8;
        }
        return I.f8786a;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void movableContentStateReleased$runtime_release(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState) {
        synchronized (this.stateLock) {
            this.compositionValueStatesAvailable.put(movableContentStateReference, movableContentState);
            I i8 = I.f8786a;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference movableContentStateReference) {
        MovableContentState remove;
        synchronized (this.stateLock) {
            remove = this.compositionValueStatesAvailable.remove(movableContentStateReference);
        }
        return remove;
    }

    public final void pauseCompositionFrameClock() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
            I i8 = I.f8786a;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime_release(Set<CompositionData> set) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void registerComposition$runtime_release(ControlledComposition controlledComposition) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportRemovedComposition$runtime_release(ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            try {
                Set set = this.compositionsRemoved;
                if (set == null) {
                    set = new LinkedHashSet();
                    this.compositionsRemoved = set;
                }
                set.add(controlledComposition);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void resumeCompositionFrameClock() {
        InterfaceC3470o interfaceC3470o;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                interfaceC3470o = deriveStateLocked();
            } else {
                interfaceC3470o = null;
            }
        }
        if (interfaceC3470o != null) {
            s.a aVar = s.f8810b;
            interfaceC3470o.resumeWith(s.b(I.f8786a));
        }
    }

    public final Object runRecomposeAndApplyChanges(U5.d dVar) {
        Object recompositionRunner = recompositionRunner(new Recomposer$runRecomposeAndApplyChanges$2(this, null), dVar);
        if (recompositionRunner == V5.b.e()) {
            return recompositionRunner;
        }
        return I.f8786a;
    }

    @ExperimentalComposeApi
    public final Object runRecomposeConcurrentlyAndApplyChanges(U5.g gVar, U5.d dVar) {
        Object recompositionRunner = recompositionRunner(new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(gVar, this, null), dVar);
        if (recompositionRunner == V5.b.e()) {
            return recompositionRunner;
        }
        return I.f8786a;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime_release(ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            removeKnownCompositionLocked(controlledComposition);
            this.compositionInvalidations.remove(controlledComposition);
            this.compositionsAwaitingApply.remove(controlledComposition);
            I i8 = I.f8786a;
        }
    }

    private final void recordComposerModifications(Function1 function1) {
        IdentityArraySet identityArraySet = this.snapshotInvalidations;
        if (identityArraySet.isNotEmpty()) {
            List knownCompositions = getKnownCompositions();
            int size = knownCompositions.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((ControlledComposition) knownCompositions.get(i8)).recordModificationsOf(identityArraySet);
            }
            this.snapshotInvalidations = new IdentityArraySet();
        }
        List list = this.compositionInvalidations;
        int size2 = list.size();
        for (int i9 = 0; i9 < size2; i9++) {
            function1.invoke(list.get(i9));
        }
        this.compositionInvalidations.clear();
        if (deriveStateLocked() != null) {
            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
        }
    }
}
