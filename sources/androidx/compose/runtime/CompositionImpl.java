package androidx.compose.runtime;

import Q5.C1413h;
import Q5.I;
import Q5.r;
import R5.AbstractC1428l;
import R5.AbstractC1435t;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Z;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class CompositionImpl implements ControlledComposition, ReusableComposition, RecomposeScopeOwner, CompositionServices {
    public static final int $stable = 8;
    private final U5.g _recomposeContext;
    private final HashSet<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private final ChangeList changes;
    private InterfaceC2072n composable;
    private final ComposerImpl composer;
    private final HashSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;
    private final ScopeMap<DerivedState<?>> derivedStates;
    private boolean disposed;
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;
    private IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidations;
    private final boolean isRoot;
    private final ChangeList lateChanges;
    private final Object lock;
    private final ScopeMap<RecomposeScopeImpl> observations;
    private final ScopeMap<RecomposeScopeImpl> observationsProcessed;
    private final CompositionObserverHolder observerHolder;
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;
    private final AtomicReference<Object> pendingModifications;
    private final SlotTable slotTable;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class RememberEventDispatcher implements RememberManager {
        private final Set<RememberObserver> abandoning;
        private List<ComposeNodeLifecycleCallback> releasing;
        private final List<RememberObserver> remembering = new ArrayList();
        private final List<Object> forgetting = new ArrayList();
        private final List<Function0> sideEffects = new ArrayList();

        public RememberEventDispatcher(Set<RememberObserver> set) {
            this.abandoning = set;
        }

        @Override // androidx.compose.runtime.RememberManager
        public void deactivating(ComposeNodeLifecycleCallback composeNodeLifecycleCallback) {
            this.forgetting.add(composeNodeLifecycleCallback);
        }

        public final void dispatchAbandons() {
            if (!this.abandoning.isEmpty()) {
                Object beginSection = Trace.INSTANCE.beginSection("Compose:abandons");
                try {
                    Iterator<RememberObserver> it = this.abandoning.iterator();
                    while (it.hasNext()) {
                        RememberObserver next = it.next();
                        it.remove();
                        next.onAbandoned();
                    }
                    I i8 = I.f8786a;
                    Trace.INSTANCE.endSection(beginSection);
                } catch (Throwable th) {
                    Trace.INSTANCE.endSection(beginSection);
                    throw th;
                }
            }
        }

        public final void dispatchRememberObservers() {
            Object beginSection;
            if (!this.forgetting.isEmpty()) {
                beginSection = Trace.INSTANCE.beginSection("Compose:onForgotten");
                try {
                    for (int size = this.forgetting.size() - 1; -1 < size; size--) {
                        Object obj = this.forgetting.get(size);
                        Z.a(this.abandoning).remove(obj);
                        if (obj instanceof RememberObserver) {
                            ((RememberObserver) obj).onForgotten();
                        }
                        if (obj instanceof ComposeNodeLifecycleCallback) {
                            ((ComposeNodeLifecycleCallback) obj).onDeactivate();
                        }
                    }
                    I i8 = I.f8786a;
                    Trace.INSTANCE.endSection(beginSection);
                } finally {
                }
            }
            if (!this.remembering.isEmpty()) {
                Object beginSection2 = Trace.INSTANCE.beginSection("Compose:onRemembered");
                try {
                    List<RememberObserver> list = this.remembering;
                    int size2 = list.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        RememberObserver rememberObserver = list.get(i9);
                        this.abandoning.remove(rememberObserver);
                        rememberObserver.onRemembered();
                    }
                    I i10 = I.f8786a;
                    Trace.INSTANCE.endSection(beginSection2);
                } finally {
                }
            }
            List<ComposeNodeLifecycleCallback> list2 = this.releasing;
            List<ComposeNodeLifecycleCallback> list3 = list2;
            if (list3 != null && !list3.isEmpty()) {
                beginSection = Trace.INSTANCE.beginSection("Compose:releases");
                try {
                    for (int size3 = list2.size() - 1; -1 < size3; size3--) {
                        list2.get(size3).onRelease();
                    }
                    I i11 = I.f8786a;
                    Trace.INSTANCE.endSection(beginSection);
                } finally {
                    Trace.INSTANCE.endSection(beginSection);
                }
            }
        }

        public final void dispatchSideEffects() {
            if (!this.sideEffects.isEmpty()) {
                Object beginSection = Trace.INSTANCE.beginSection("Compose:sideeffects");
                try {
                    List<Function0> list = this.sideEffects;
                    int size = list.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        list.get(i8).invoke();
                    }
                    this.sideEffects.clear();
                    I i9 = I.f8786a;
                    Trace.INSTANCE.endSection(beginSection);
                } catch (Throwable th) {
                    Trace.INSTANCE.endSection(beginSection);
                    throw th;
                }
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void forgetting(RememberObserver rememberObserver) {
            this.forgetting.add(rememberObserver);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void releasing(ComposeNodeLifecycleCallback composeNodeLifecycleCallback) {
            List list = this.releasing;
            if (list == null) {
                list = new ArrayList();
                this.releasing = list;
            }
            list.add(composeNodeLifecycleCallback);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void remembering(RememberObserver rememberObserver) {
            this.remembering.add(rememberObserver);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void sideEffect(Function0 function0) {
            this.sideEffects.add(function0);
        }
    }

    public CompositionImpl(CompositionContext compositionContext, Applier<?> applier, U5.g gVar) {
        this.parent = compositionContext;
        this.applier = applier;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        HashSet<RememberObserver> hashSet = new HashSet<>();
        this.abandonSet = hashSet;
        SlotTable slotTable = new SlotTable();
        this.slotTable = slotTable;
        this.observations = new ScopeMap<>();
        this.conditionallyInvalidatedScopes = new HashSet<>();
        this.derivedStates = new ScopeMap<>();
        ChangeList changeList = new ChangeList();
        this.changes = changeList;
        ChangeList changeList2 = new ChangeList();
        this.lateChanges = changeList2;
        this.observationsProcessed = new ScopeMap<>();
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        this.observerHolder = new CompositionObserverHolder(null, false, 3, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, compositionContext, slotTable, hashSet, changeList, changeList2, this);
        compositionContext.registerComposer$runtime_release(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = gVar;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m2439getLambda1$runtime_release();
    }

    private final void abandonChanges() {
        this.pendingModifications.set(null);
        this.changes.clear();
        this.lateChanges.clear();
        this.abandonSet.clear();
    }

    private final HashSet<RecomposeScopeImpl> addPendingInvalidationsLocked(HashSet<RecomposeScopeImpl> hashSet, Object obj, boolean z8) {
        HashSet<RecomposeScopeImpl> hashSet2;
        Object obj2 = this.observations.getMap().get(obj);
        if (obj2 != null) {
            if (obj2 instanceof MutableScatterSet) {
                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    hashSet2 = hashSet;
                    int i8 = 0;
                    while (true) {
                        long j8 = jArr[i8];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((255 & j8) < 128) {
                                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr[(i8 << 3) + i10];
                                    if (!this.observationsProcessed.remove(obj, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                                        if (recomposeScopeImpl.isConditional() && !z8) {
                                            this.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                                        } else {
                                            if (hashSet2 == null) {
                                                hashSet2 = new HashSet<>();
                                            }
                                            hashSet2.add(recomposeScopeImpl);
                                        }
                                    }
                                }
                                j8 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length) {
                            break;
                        }
                        i8++;
                    }
                } else {
                    hashSet2 = hashSet;
                }
                return hashSet2;
            }
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj2;
            if (!this.observationsProcessed.remove(obj, recomposeScopeImpl2) && recomposeScopeImpl2.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                if (recomposeScopeImpl2.isConditional() && !z8) {
                    this.conditionallyInvalidatedScopes.add(recomposeScopeImpl2);
                } else {
                    HashSet<RecomposeScopeImpl> hashSet3 = hashSet == null ? new HashSet<>() : hashSet;
                    hashSet3.add(recomposeScopeImpl2);
                    return hashSet3;
                }
            }
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void applyChangesInLocked(androidx.compose.runtime.changelist.ChangeList r33) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.applyChangesInLocked(androidx.compose.runtime.changelist.ChangeList):void");
    }

    private final void cleanUpDerivedStateObservations() {
        long[] jArr;
        long[] jArr2;
        int i8;
        int i9;
        long j8;
        boolean z8;
        Object[] objArr;
        Object[] objArr2;
        MutableScatterMap<Object, Object> map = this.derivedStates.getMap();
        long[] jArr3 = map.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr3[i10];
                char c8 = 7;
                long j10 = -9187201950435737472L;
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j9 & 255) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = map.keys[i13];
                            Object obj2 = map.values[i13];
                            if (obj2 instanceof MutableScatterSet) {
                                AbstractC3292y.g(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                Object[] objArr3 = mutableScatterSet.elements;
                                long[] jArr4 = mutableScatterSet.metadata;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                i8 = length;
                                if (length2 >= 0) {
                                    int i14 = 0;
                                    while (true) {
                                        long j11 = jArr4[i14];
                                        i9 = i11;
                                        long[] jArr5 = jArr4;
                                        j8 = -9187201950435737472L;
                                        if ((((~j11) << c8) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                            int i16 = 0;
                                            while (i16 < i15) {
                                                if ((j11 & 255) < 128) {
                                                    int i17 = (i14 << 3) + i16;
                                                    objArr2 = objArr3;
                                                    if (!this.observations.contains((DerivedState) objArr3[i17])) {
                                                        mutableScatterSet.removeElementAt(i17);
                                                    }
                                                } else {
                                                    objArr2 = objArr3;
                                                }
                                                j11 >>= 8;
                                                i16++;
                                                objArr3 = objArr2;
                                            }
                                            objArr = objArr3;
                                            if (i15 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                        }
                                        if (i14 == length2) {
                                            break;
                                        }
                                        i14++;
                                        c8 = 7;
                                        i11 = i9;
                                        jArr4 = jArr5;
                                        objArr3 = objArr;
                                    }
                                } else {
                                    i9 = i11;
                                    j8 = -9187201950435737472L;
                                }
                                z8 = mutableScatterSet.isEmpty();
                            } else {
                                jArr2 = jArr3;
                                i8 = length;
                                i9 = i11;
                                j8 = j10;
                                AbstractC3292y.g(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                if (!this.observations.contains((DerivedState) obj2)) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                            }
                            if (z8) {
                                map.removeValueAt(i13);
                            }
                        } else {
                            jArr2 = jArr3;
                            i8 = length;
                            i9 = i11;
                            j8 = j10;
                        }
                        j9 >>= 8;
                        i12++;
                        j10 = j8;
                        jArr3 = jArr2;
                        length = i8;
                        i11 = i9;
                        c8 = 7;
                    }
                    jArr = jArr3;
                    int i18 = length;
                    if (i11 != 8) {
                        break;
                    } else {
                        length = i18;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                jArr3 = jArr;
            }
        }
        if (!this.conditionallyInvalidatedScopes.isEmpty()) {
            Iterator<RecomposeScopeImpl> it = this.conditionallyInvalidatedScopes.iterator();
            while (it.hasNext()) {
                if (!it.next().isConditional()) {
                    it.remove();
                }
            }
        }
    }

    private final void composeInitial(InterfaceC2072n interfaceC2072n) {
        if (!this.disposed) {
            this.composable = interfaceC2072n;
            this.parent.composeInitial$runtime_release(this, interfaceC2072n);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object obj;
        Object obj2;
        AtomicReference<Object> atomicReference = this.pendingModifications;
        obj = CompositionKt.PendingApplyNoModifications;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            obj2 = CompositionKt.PendingApplyNoModifications;
            if (!AbstractC3292y.d(andSet, obj2)) {
                if (andSet instanceof Set) {
                    addPendingInvalidationsLocked((Set) andSet, true);
                    return;
                }
                if (andSet instanceof Object[]) {
                    for (Set<? extends Object> set : (Set[]) andSet) {
                        addPendingInvalidationsLocked(set, true);
                    }
                    return;
                }
                ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new C1413h();
            }
            ComposerKt.composeRuntimeError("pending composition has not been applied");
            throw new C1413h();
        }
    }

    private final void drainPendingModificationsLocked() {
        Object obj;
        Object andSet = this.pendingModifications.getAndSet(null);
        obj = CompositionKt.PendingApplyNoModifications;
        if (!AbstractC3292y.d(andSet, obj)) {
            if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set) andSet, false);
                return;
            }
            if (andSet instanceof Object[]) {
                for (Set<? extends Object> set : (Set[]) andSet) {
                    addPendingInvalidationsLocked(set, false);
                }
                return;
            }
            if (andSet == null) {
                ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
                throw new C1413h();
            }
            ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new C1413h();
        }
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    public static /* synthetic */ void getPendingInvalidScopes$runtime_release$annotations() {
    }

    public static /* synthetic */ void getSlotTable$runtime_release$annotations() {
    }

    private final <T> T guardChanges(Function0 function0) {
        try {
            try {
                T t8 = (T) function0.invoke();
                AbstractC3290w.b(1);
                AbstractC3290w.a(1);
                return t8;
            } catch (Throwable th) {
                AbstractC3290w.b(1);
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                AbstractC3290w.a(1);
                throw th;
            }
        } catch (Exception e8) {
            abandonChanges();
            throw e8;
        }
    }

    private final <T> T guardInvalidationsLocked(Function1 function1) {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations = takeInvalidations();
        try {
            return (T) function1.invoke(takeInvalidations);
        } catch (Exception e8) {
            this.invalidations = takeInvalidations;
            throw e8;
        }
    }

    private final InvalidationResult invalidateChecked(RecomposeScopeImpl recomposeScopeImpl, Anchor anchor, Object obj) {
        synchronized (this.lock) {
            try {
                CompositionImpl compositionImpl = this.invalidationDelegate;
                if (compositionImpl == null || !this.slotTable.groupContainsAnchor(this.invalidationDelegateGroup, anchor)) {
                    compositionImpl = null;
                }
                if (compositionImpl == null) {
                    if (tryImminentInvalidation(recomposeScopeImpl, obj)) {
                        return InvalidationResult.IMMINENT;
                    }
                    if (obj != null) {
                        CompositionKt.addValue(this.invalidations, recomposeScopeImpl, obj);
                    } else {
                        this.invalidations.set(recomposeScopeImpl, null);
                    }
                }
                if (compositionImpl != null) {
                    return compositionImpl.invalidateChecked(recomposeScopeImpl, anchor, obj);
                }
                this.parent.invalidate$runtime_release(this);
                if (isComposing()) {
                    return InvalidationResult.DEFERRED;
                }
                return InvalidationResult.SCHEDULED;
            } finally {
            }
        }
    }

    private final void invalidateScopeOfLocked(Object obj) {
        Object obj2 = this.observations.getMap().get(obj);
        if (obj2 != null) {
            if (obj2 instanceof MutableScatterSet) {
                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j8 = jArr[i8];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((255 & j8) < 128) {
                                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr[(i8 << 3) + i10];
                                    if (recomposeScopeImpl.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                                        this.observationsProcessed.add(obj, recomposeScopeImpl);
                                    }
                                }
                                j8 >>= 8;
                            }
                            if (i9 != 8) {
                                return;
                            }
                        }
                        if (i8 != length) {
                            i8++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj2;
                if (recomposeScopeImpl2.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                    this.observationsProcessed.add(obj, recomposeScopeImpl2);
                }
            }
        }
    }

    private final CompositionObserver observer() {
        CompositionObserver compositionObserver;
        CompositionObserverHolder compositionObserverHolder = this.observerHolder;
        if (compositionObserverHolder.getRoot()) {
            return compositionObserverHolder.getObserver();
        }
        CompositionObserverHolder observerHolder$runtime_release = this.parent.getObserverHolder$runtime_release();
        if (observerHolder$runtime_release != null) {
            compositionObserver = observerHolder$runtime_release.getObserver();
        } else {
            compositionObserver = null;
        }
        if (!AbstractC3292y.d(compositionObserver, compositionObserverHolder.getObserver())) {
            compositionObserverHolder.setObserver(compositionObserver);
        }
        return compositionObserver;
    }

    private final IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations() {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> identityArrayMap = this.invalidations;
        this.invalidations = new IdentityArrayMap<>(0, 1, null);
        return identityArrayMap;
    }

    private final <T> T trackAbandonedValues(Function0 function0) {
        try {
            T t8 = (T) function0.invoke();
            AbstractC3290w.b(1);
            AbstractC3290w.a(1);
            return t8;
        } catch (Throwable th) {
            AbstractC3290w.b(1);
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            AbstractC3290w.a(1);
            throw th;
        }
    }

    private final boolean tryImminentInvalidation(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        if (isComposing() && this.composer.tryImminentInvalidation$runtime_release(recomposeScopeImpl, obj)) {
            return true;
        }
        return false;
    }

    private final void validateRecomposeScopeAnchors(SlotTable slotTable) {
        RecomposeScopeImpl recomposeScopeImpl;
        Object[] slots = slotTable.getSlots();
        ArrayList arrayList = new ArrayList();
        for (Object obj : slots) {
            if (obj instanceof RecomposeScopeImpl) {
                recomposeScopeImpl = (RecomposeScopeImpl) obj;
            } else {
                recomposeScopeImpl = null;
            }
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i8);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && !slotTable.slotsOf$runtime_release(anchor.toIndexFor(slotTable)).contains(recomposeScopeImpl2)) {
                throw new IllegalStateException(("Misaligned anchor " + anchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + AbstractC1428l.p0(slotTable.getSlots(), recomposeScopeImpl2)).toString());
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
                I i8 = I.f8786a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                        }
                        throw th;
                    } catch (Exception e8) {
                        abandonChanges();
                        throw e8;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.isNotEmpty()) {
                    applyChangesInLocked(this.lateChanges);
                }
                I i8 = I.f8786a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                        }
                        throw th;
                    } catch (Exception e8) {
                        abandonChanges();
                        throw e8;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime_release();
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                I i8 = I.f8786a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                        }
                        throw th;
                    } catch (Exception e8) {
                        abandonChanges();
                        throw e8;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(InterfaceC2072n interfaceC2072n) {
        IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations;
        try {
            synchronized (this.lock) {
                try {
                    drainPendingModificationsForCompositionLocked();
                    takeInvalidations = takeInvalidations();
                    CompositionObserver observer = observer();
                    if (observer != null) {
                        Map<RecomposeScopeImpl, IdentityArraySet<Object>> asMap = takeInvalidations.asMap();
                        AbstractC3292y.g(asMap, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>");
                        observer.onBeginComposition(this, asMap);
                    }
                    this.composer.composeContent$runtime_release(takeInvalidations, interfaceC2072n);
                    if (observer != null) {
                        observer.onEndComposition(this);
                        I i8 = I.f8786a;
                    }
                } catch (Exception e8) {
                    this.invalidations = takeInvalidations;
                    throw e8;
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                throw th;
            } catch (Exception e9) {
                abandonChanges();
                throw e9;
            }
        }
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void deactivate() {
        boolean z8;
        if (this.slotTable.getGroupsSize() > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 || (true ^ this.abandonSet.isEmpty())) {
            Trace trace = Trace.INSTANCE;
            Object beginSection = trace.beginSection("Compose:deactivate");
            try {
                RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                if (z8) {
                    this.applier.onBeginChanges();
                    SlotWriter openWriter = this.slotTable.openWriter();
                    try {
                        ComposerKt.deactivateCurrentGroup(openWriter, rememberEventDispatcher);
                        I i8 = I.f8786a;
                        openWriter.close();
                        this.applier.onEndChanges();
                        rememberEventDispatcher.dispatchRememberObservers();
                    } catch (Throwable th) {
                        openWriter.close();
                        throw th;
                    }
                }
                rememberEventDispatcher.dispatchAbandons();
                I i9 = I.f8786a;
                trace.endSection(beginSection);
            } catch (Throwable th2) {
                Trace.INSTANCE.endSection(beginSection);
                throw th2;
            }
        }
        this.observations.clear();
        this.derivedStates.clear();
        this.invalidations.clear();
        this.changes.clear();
        this.composer.deactivate$runtime_release();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(ControlledComposition controlledComposition, int i8, Function0 function0) {
        if (controlledComposition != null && !AbstractC3292y.d(controlledComposition, this) && i8 >= 0) {
            this.invalidationDelegate = (CompositionImpl) controlledComposition;
            this.invalidationDelegateGroup = i8;
            try {
                return (R) function0.invoke();
            } finally {
                this.invalidationDelegate = null;
                this.invalidationDelegateGroup = 0;
            }
        }
        return (R) function0.invoke();
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        boolean z8;
        synchronized (this.lock) {
            try {
                if (!this.composer.isComposing$runtime_release()) {
                    if (!this.disposed) {
                        this.disposed = true;
                        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m2440getLambda2$runtime_release();
                        ChangeList deferredChanges$runtime_release = this.composer.getDeferredChanges$runtime_release();
                        if (deferredChanges$runtime_release != null) {
                            applyChangesInLocked(deferredChanges$runtime_release);
                        }
                        if (this.slotTable.getGroupsSize() > 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (z8 || (true ^ this.abandonSet.isEmpty())) {
                            RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                            if (z8) {
                                this.applier.onBeginChanges();
                                SlotWriter openWriter = this.slotTable.openWriter();
                                try {
                                    ComposerKt.removeCurrentGroup(openWriter, rememberEventDispatcher);
                                    I i8 = I.f8786a;
                                    openWriter.close();
                                    this.applier.clear();
                                    this.applier.onEndChanges();
                                    rememberEventDispatcher.dispatchRememberObservers();
                                } catch (Throwable th) {
                                    openWriter.close();
                                    throw th;
                                }
                            }
                            rememberEventDispatcher.dispatchAbandons();
                        }
                        this.composer.dispose$runtime_release();
                    }
                    I i9 = I.f8786a;
                } else {
                    throw new IllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.".toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.parent.unregisterComposition$runtime_release(this);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(MovableContentState movableContentState) {
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        SlotWriter openWriter = movableContentState.getSlotTable$runtime_release().openWriter();
        try {
            ComposerKt.removeCurrentGroup(openWriter, rememberEventDispatcher);
            I i8 = I.f8786a;
            openWriter.close();
            rememberEventDispatcher.dispatchRememberObservers();
        } catch (Throwable th) {
            openWriter.close();
            throw th;
        }
    }

    public final InterfaceC2072n getComposable() {
        return this.composable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.CompositionServices
    public <T> T getCompositionService(CompositionServiceKey<T> compositionServiceKey) {
        if (AbstractC3292y.d(compositionServiceKey, CompositionKt.getCompositionImplServiceKey())) {
            return this;
        }
        return null;
    }

    public final List<RecomposeScopeImpl> getConditionalScopes$runtime_release() {
        return AbstractC1435t.W0(this.conditionallyInvalidatedScopes);
    }

    public final Set<Object> getDerivedStateDependencies$runtime_release() {
        return this.derivedStates.getMap().asMap().keySet();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z8;
        synchronized (this.lock) {
            if (this.invalidations.getSize() > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime_release;
        synchronized (this.lock) {
            hasPendingChanges$runtime_release = this.composer.getHasPendingChanges$runtime_release();
        }
        return hasPendingChanges$runtime_release;
    }

    public final Set<Object> getObservedObjects$runtime_release() {
        return this.observations.getMap().asMap().keySet();
    }

    public final CompositionObserverHolder getObserverHolder$runtime_release() {
        return this.observerHolder;
    }

    public final boolean getPendingInvalidScopes$runtime_release() {
        return this.pendingInvalidScopes;
    }

    public final U5.g getRecomposeContext() {
        U5.g gVar = this._recomposeContext;
        if (gVar == null) {
            return this.parent.getRecomposeCoroutineContext$runtime_release();
        }
        return gVar;
    }

    public final SlotTable getSlotTable$runtime_release() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(List<r> list) {
        int size = list.size();
        boolean z8 = false;
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                if (!AbstractC3292y.d(((MovableContentStateReference) list.get(i8).c()).getComposition$runtime_release(), this)) {
                    break;
                } else {
                    i8++;
                }
            } else {
                z8 = true;
                break;
            }
        }
        ComposerKt.runtimeCheck(z8);
        try {
            this.composer.insertMovableContentReferences(list);
            I i9 = I.f8786a;
        } finally {
        }
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public InvalidationResult invalidate(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        CompositionImpl compositionImpl;
        if (recomposeScopeImpl.getDefaultsInScope()) {
            recomposeScopeImpl.setDefaultsInvalid(true);
        }
        Anchor anchor = recomposeScopeImpl.getAnchor();
        if (anchor != null && anchor.getValid()) {
            if (!this.slotTable.ownsAnchor(anchor)) {
                synchronized (this.lock) {
                    compositionImpl = this.invalidationDelegate;
                }
                if (compositionImpl != null && compositionImpl.tryImminentInvalidation(recomposeScopeImpl, obj)) {
                    return InvalidationResult.IMMINENT;
                }
                return InvalidationResult.IGNORED;
            }
            if (!recomposeScopeImpl.getCanRecompose()) {
                return InvalidationResult.IGNORED;
            }
            return invalidateChecked(recomposeScopeImpl, anchor, obj);
        }
        return InvalidationResult.IGNORED;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        RecomposeScopeImpl recomposeScopeImpl;
        synchronized (this.lock) {
            try {
                for (Object obj : this.slotTable.getSlots()) {
                    if (obj instanceof RecomposeScopeImpl) {
                        recomposeScopeImpl = (RecomposeScopeImpl) obj;
                    } else {
                        recomposeScopeImpl = null;
                    }
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.invalidate();
                    }
                }
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void invalidateGroupsWithKey(int i8) {
        List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release;
        synchronized (this.lock) {
            invalidateGroupsWithKey$runtime_release = this.slotTable.invalidateGroupsWithKey$runtime_release(i8);
        }
        if (invalidateGroupsWithKey$runtime_release != null) {
            int size = invalidateGroupsWithKey$runtime_release.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (invalidateGroupsWithKey$runtime_release.get(i9).invalidateForResult(null) != InvalidationResult.IGNORED) {
                }
            }
            return;
        }
        if (this.composer.forceRecomposeScopes$runtime_release()) {
            this.parent.invalidate$runtime_release(this);
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.isComposing$runtime_release();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.disposed;
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    public final CompositionObserverHandle observe$runtime_release(final CompositionObserver compositionObserver) {
        synchronized (this.lock) {
            this.observerHolder.setObserver(compositionObserver);
            this.observerHolder.setRoot(true);
            I i8 = I.f8786a;
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.CompositionImpl$observe$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                Object obj;
                obj = CompositionImpl.this.lock;
                CompositionImpl compositionImpl = CompositionImpl.this;
                CompositionObserver compositionObserver2 = compositionObserver;
                synchronized (obj) {
                    try {
                        if (AbstractC3292y.d(compositionImpl.getObserverHolder$runtime_release().getObserver(), compositionObserver2)) {
                            compositionImpl.getObserverHolder$runtime_release().setObserver(null);
                            compositionImpl.getObserverHolder$runtime_release().setRoot(false);
                        }
                        I i9 = I.f8786a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean observesAnyOf(Set<? extends Object> set) {
        if (set instanceof IdentityArraySet) {
            IdentityArraySet identityArraySet = (IdentityArraySet) set;
            Object[] values = identityArraySet.getValues();
            int size = identityArraySet.size();
            for (int i8 = 0; i8 < size; i8++) {
                Object obj = values[i8];
                AbstractC3292y.g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (this.observations.contains(obj) || this.derivedStates.contains(obj)) {
                    return true;
                }
            }
            return false;
        }
        for (Object obj2 : set) {
            if (this.observations.contains(obj2) || this.derivedStates.contains(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(Function0 function0) {
        this.composer.prepareCompose$runtime_release(function0);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean recompose$runtime_release;
        synchronized (this.lock) {
            try {
                drainPendingModificationsForCompositionLocked();
                try {
                    IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> takeInvalidations = takeInvalidations();
                    try {
                        CompositionObserver observer = observer();
                        if (observer != null) {
                            Map<RecomposeScopeImpl, IdentityArraySet<Object>> asMap = takeInvalidations.asMap();
                            AbstractC3292y.g(asMap, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>");
                            observer.onBeginComposition(this, asMap);
                        }
                        recompose$runtime_release = this.composer.recompose$runtime_release(takeInvalidations);
                        if (!recompose$runtime_release) {
                            drainPendingModificationsLocked();
                        }
                        if (observer != null) {
                            observer.onEndComposition(this);
                        }
                    } catch (Exception e8) {
                        this.invalidations = takeInvalidations;
                        throw e8;
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return recompose$runtime_release;
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public void recomposeScopeReleased(RecomposeScopeImpl recomposeScopeImpl) {
        this.pendingInvalidScopes = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set[]] */
    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(Set<? extends Object> set) {
        Object obj;
        Object obj2;
        boolean d8;
        Set<? extends Object> set2;
        do {
            obj = this.pendingModifications.get();
            if (obj != null) {
                obj2 = CompositionKt.PendingApplyNoModifications;
                d8 = AbstractC3292y.d(obj, obj2);
            } else {
                d8 = true;
            }
            if (d8) {
                set2 = set;
            } else if (obj instanceof Set) {
                set2 = new Set[]{obj, set};
            } else if (obj instanceof Object[]) {
                AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                set2 = AbstractC1428l.D((Set[]) obj, set);
            } else {
                throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
            }
        } while (!androidx.compose.animation.core.d.a(this.pendingModifications, obj, set2));
        if (obj == null) {
            synchronized (this.lock) {
                drainPendingModificationsLocked();
                I i8 = I.f8786a;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public void recordReadOf(Object obj) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        if (!getAreChildrenComposing() && (currentRecomposeScope$runtime_release = this.composer.getCurrentRecomposeScope$runtime_release()) != null) {
            currentRecomposeScope$runtime_release.setUsed(true);
            if (!currentRecomposeScope$runtime_release.recordRead(obj)) {
                if (obj instanceof StateObjectImpl) {
                    ((StateObjectImpl) obj).m2584recordReadInh_f27i8$runtime_release(ReaderKind.m2568constructorimpl(1));
                }
                this.observations.add(obj, currentRecomposeScope$runtime_release);
                if (obj instanceof DerivedState) {
                    this.derivedStates.removeScope(obj);
                    ObjectIntMap<StateObject> dependencies = ((DerivedState) obj).getCurrentRecord().getDependencies();
                    Object[] objArr = dependencies.keys;
                    long[] jArr = dependencies.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j8 = jArr[i8];
                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8 - ((~(i8 - length)) >>> 31);
                                for (int i10 = 0; i10 < i9; i10++) {
                                    if ((255 & j8) < 128) {
                                        StateObject stateObject = (StateObject) objArr[(i8 << 3) + i10];
                                        if (stateObject instanceof StateObjectImpl) {
                                            ((StateObjectImpl) stateObject).m2584recordReadInh_f27i8$runtime_release(ReaderKind.m2568constructorimpl(1));
                                        }
                                        this.derivedStates.add(stateObject, obj);
                                    }
                                    j8 >>= 8;
                                }
                                if (i9 != 8) {
                                    return;
                                }
                            }
                            if (i8 != length) {
                                i8++;
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordWriteOf(Object obj) {
        synchronized (this.lock) {
            try {
                invalidateScopeOfLocked(obj);
                Object obj2 = this.derivedStates.getMap().get(obj);
                if (obj2 != null) {
                    if (obj2 instanceof MutableScatterSet) {
                        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                        Object[] objArr = mutableScatterSet.elements;
                        long[] jArr = mutableScatterSet.metadata;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i8 = 0;
                            while (true) {
                                long j8 = jArr[i8];
                                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                                    for (int i10 = 0; i10 < i9; i10++) {
                                        if ((255 & j8) < 128) {
                                            invalidateScopeOfLocked((DerivedState) objArr[(i8 << 3) + i10]);
                                        }
                                        j8 >>= 8;
                                    }
                                    if (i9 != 8) {
                                        break;
                                    }
                                }
                                if (i8 == length) {
                                    break;
                                } else {
                                    i8++;
                                }
                            }
                        }
                    } else {
                        invalidateScopeOfLocked((DerivedState) obj2);
                    }
                }
                I i11 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void removeDerivedStateObservation$runtime_release(DerivedState<?> derivedState) {
        if (!this.observations.contains(derivedState)) {
            this.derivedStates.removeScope(derivedState);
        }
    }

    public final void removeObservation$runtime_release(Object obj, RecomposeScopeImpl recomposeScopeImpl) {
        this.observations.remove(obj, recomposeScopeImpl);
    }

    public final void setComposable(InterfaceC2072n interfaceC2072n) {
        this.composable = interfaceC2072n;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(InterfaceC2072n interfaceC2072n) {
        composeInitial(interfaceC2072n);
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void setContentWithReuse(InterfaceC2072n interfaceC2072n) {
        this.composer.startReuseFromRoot();
        composeInitial(interfaceC2072n);
        this.composer.endReuseFromRoot();
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z8) {
        this.pendingInvalidScopes = z8;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized (this.lock) {
            try {
                if (!isComposing()) {
                    this.composer.verifyConsistent$runtime_release();
                    this.slotTable.verifyWellFormed();
                    validateRecomposeScopeAnchors(this.slotTable);
                }
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, U5.g gVar, int i8, AbstractC3284p abstractC3284p) {
        this(compositionContext, applier, (i8 & 4) != 0 ? null : gVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f5, code lost:            if (r13 == true) goto L94;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void addPendingInvalidationsLocked(java.util.Set<? extends java.lang.Object> r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.addPendingInvalidationsLocked(java.util.Set, boolean):void");
    }
}
