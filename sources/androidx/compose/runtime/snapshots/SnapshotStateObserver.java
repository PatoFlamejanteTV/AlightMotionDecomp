package androidx.compose.runtime.snapshots;

import Q5.C1413h;
import Q5.I;
import R5.AbstractC1428l;
import R5.AbstractC1435t;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.compose.animation.core.d;
import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import c6.InterfaceC2072n;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
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
public final class SnapshotStateObserver {
    public static final int $stable = 8;
    private ObserverHandle applyUnsubscribe;
    private ObservedScopeMap currentMap;
    private boolean isPaused;
    private final Function1 onChangedExecutor;
    private boolean sendingNotifications;
    private final AtomicReference<Object> pendingChanges = new AtomicReference<>(null);
    private final InterfaceC2072n applyObserver = new SnapshotStateObserver$applyObserver$1(this);
    private final Function1 readObserver = new SnapshotStateObserver$readObserver$1(this);
    private final MutableVector<ObservedScopeMap> observedScopeMaps = new MutableVector<>(new ObservedScopeMap[16], 0);
    private long currentMapThreadId = -1;

    public SnapshotStateObserver(Function1 function1) {
        this.onChangedExecutor = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void addChanges(Set<? extends Object> set) {
        Object obj;
        List G02;
        do {
            obj = this.pendingChanges.get();
            if (obj == null) {
                G02 = set;
            } else if (obj instanceof Set) {
                G02 = AbstractC1435t.p(obj, set);
            } else if (obj instanceof List) {
                G02 = AbstractC1435t.G0((Collection) obj, AbstractC1435t.e(set));
            } else {
                report();
                throw new C1413h();
            }
        } while (!d.a(this.pendingChanges, obj, G02));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean drainChanges() {
        boolean z8;
        synchronized (this.observedScopeMaps) {
            z8 = this.sendingNotifications;
        }
        if (z8) {
            return false;
        }
        boolean z9 = false;
        while (true) {
            Set<? extends Object> removeChanges = removeChanges();
            if (removeChanges == null) {
                return z9;
            }
            synchronized (this.observedScopeMaps) {
                try {
                    MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                    int size = mutableVector.getSize();
                    if (size > 0) {
                        ObservedScopeMap[] content = mutableVector.getContent();
                        int i8 = 0;
                        do {
                            if (!content[i8].recordInvalidation(removeChanges) && !z9) {
                                z9 = false;
                                i8++;
                            }
                            z9 = true;
                            i8++;
                        } while (i8 < size);
                    }
                    I i9 = I.f8786a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final <T> ObservedScopeMap ensureMap(Function1 function1) {
        ObservedScopeMap observedScopeMap;
        MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
        int size = mutableVector.getSize();
        if (size > 0) {
            ObservedScopeMap[] content = mutableVector.getContent();
            int i8 = 0;
            do {
                observedScopeMap = content[i8];
                if (observedScopeMap.getOnChanged() == function1) {
                    break;
                }
                i8++;
            } while (i8 < size);
        }
        observedScopeMap = null;
        ObservedScopeMap observedScopeMap2 = observedScopeMap;
        if (observedScopeMap2 == null) {
            AbstractC3292y.g(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
            ObservedScopeMap observedScopeMap3 = new ObservedScopeMap((Function1) Z.d(function1, 1));
            this.observedScopeMaps.add(observedScopeMap3);
            return observedScopeMap3;
        }
        return observedScopeMap2;
    }

    private final void forEachScopeMap(Function1 function1) {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    ObservedScopeMap[] content = mutableVector.getContent();
                    int i8 = 0;
                    do {
                        function1.invoke(content[i8]);
                        i8++;
                    } while (i8 < size);
                }
                I i9 = I.f8786a;
                AbstractC3290w.b(1);
            } catch (Throwable th) {
                AbstractC3290w.b(1);
                AbstractC3290w.a(1);
                throw th;
            }
        }
        AbstractC3290w.a(1);
    }

    private final Set<Object> removeChanges() {
        Object obj;
        Object obj2;
        Set<Object> set;
        do {
            obj = this.pendingChanges.get();
            obj2 = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else if (obj instanceof List) {
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    obj2 = list.get(1);
                } else if (list.size() > 2) {
                    obj2 = list.subList(1, list.size());
                }
                set = set2;
            } else {
                report();
                throw new C1413h();
            }
        } while (!d.a(this.pendingChanges, obj, obj2));
        return set;
    }

    private final void removeScopeMapIf(Function1 function1) {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i8 = 0;
                for (int i9 = 0; i9 < size; i9++) {
                    if (((Boolean) function1.invoke(mutableVector.getContent()[i9])).booleanValue()) {
                        i8++;
                    } else if (i8 > 0) {
                        mutableVector.getContent()[i9 - i8] = mutableVector.getContent()[i9];
                    }
                }
                int i10 = size - i8;
                AbstractC1428l.t(mutableVector.getContent(), null, i10, size);
                mutableVector.setSize(i10);
                I i11 = I.f8786a;
                AbstractC3290w.b(1);
            } catch (Throwable th) {
                AbstractC3290w.b(1);
                AbstractC3290w.a(1);
                throw th;
            }
        }
        AbstractC3290w.a(1);
    }

    private final Void report() {
        ComposerKt.composeRuntimeError("Unexpected notification");
        throw new C1413h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendNotifications() {
        this.onChangedExecutor.invoke(new SnapshotStateObserver$sendNotifications$1(this));
    }

    public final void clear(Object obj) {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i8 = 0;
                for (int i9 = 0; i9 < size; i9++) {
                    mutableVector.getContent()[i9].clearScopeObservations(obj);
                    if (!r5.hasScopeObservations()) {
                        i8++;
                    } else if (i8 > 0) {
                        mutableVector.getContent()[i9 - i8] = mutableVector.getContent()[i9];
                    }
                }
                int i10 = size - i8;
                AbstractC1428l.t(mutableVector.getContent(), null, i10, size);
                mutableVector.setSize(i10);
                I i11 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clearIf(Function1 function1) {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i8 = 0;
                for (int i9 = 0; i9 < size; i9++) {
                    mutableVector.getContent()[i9].removeScopeIf(function1);
                    if (!r5.hasScopeObservations()) {
                        i8++;
                    } else if (i8 > 0) {
                        mutableVector.getContent()[i9 - i8] = mutableVector.getContent()[i9];
                    }
                }
                int i10 = size - i8;
                AbstractC1428l.t(mutableVector.getContent(), null, i10, size);
                mutableVector.setSize(i10);
                I i11 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void notifyChanges(Set<? extends Object> set, Snapshot snapshot) {
        this.applyObserver.invoke(set, snapshot);
    }

    public final <T> void observeReads(T t8, Function1 function1, Function0 function0) {
        ObservedScopeMap ensureMap;
        synchronized (this.observedScopeMaps) {
            ensureMap = ensureMap(function1);
        }
        boolean z8 = this.isPaused;
        ObservedScopeMap observedScopeMap = this.currentMap;
        long j8 = this.currentMapThreadId;
        if (j8 != -1 && j8 != ActualJvm_jvmKt.currentThreadId()) {
            throw new IllegalArgumentException(("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j8 + "), currentThread={id=" + ActualJvm_jvmKt.currentThreadId() + ", name=" + ActualJvm_jvmKt.currentThreadName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.").toString());
        }
        try {
            this.isPaused = false;
            this.currentMap = ensureMap;
            this.currentMapThreadId = Thread.currentThread().getId();
            ensureMap.observe(t8, this.readObserver, function0);
        } finally {
            this.currentMap = observedScopeMap;
            this.isPaused = z8;
            this.currentMapThreadId = j8;
        }
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.Companion.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle != null) {
            observerHandle.dispose();
        }
    }

    public final void withNoObservations(Function0 function0) {
        boolean z8 = this.isPaused;
        this.isPaused = true;
        try {
            function0.invoke();
        } finally {
            this.isPaused = z8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class ObservedScopeMap {
        private Object currentScope;
        private MutableObjectIntMap<Object> currentScopeReads;
        private int deriveStateScopeCount;
        private final MutableScatterSet<Object> invalidated;
        private final Function1 onChanged;
        private final MutableScatterMap<Object, MutableObjectIntMap<Object>> scopeToValues;
        private int currentToken = -1;
        private final ScopeMap<Object> valueToScopes = new ScopeMap<>();
        private final MutableVector<DerivedState<?>> statesToReread = new MutableVector<>(new DerivedState[16], 0);
        private final DerivedStateObserver derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(DerivedState<?> derivedState) {
                int i8;
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = SnapshotStateObserver.ObservedScopeMap.this;
                i8 = observedScopeMap.deriveStateScopeCount;
                observedScopeMap.deriveStateScopeCount = i8 - 1;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(DerivedState<?> derivedState) {
                int i8;
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = SnapshotStateObserver.ObservedScopeMap.this;
                i8 = observedScopeMap.deriveStateScopeCount;
                observedScopeMap.deriveStateScopeCount = i8 + 1;
            }
        };
        private final ScopeMap<DerivedState<?>> dependencyToDerivedStates = new ScopeMap<>();
        private final HashMap<DerivedState<?>, Object> recordedDerivedStateValues = new HashMap<>();

        public ObservedScopeMap(Function1 function1) {
            this.onChanged = function1;
            int i8 = 0;
            int i9 = 1;
            AbstractC3284p abstractC3284p = null;
            this.scopeToValues = new MutableScatterMap<>(i8, i9, abstractC3284p);
            this.invalidated = new MutableScatterSet<>(i8, i9, abstractC3284p);
        }

        private final void clearObsoleteStateReads(Object obj) {
            boolean z8;
            int i8 = this.currentToken;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap != null) {
                long[] jArr = mutableObjectIntMap.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j8 = jArr[i9];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i9 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j8) < 128) {
                                    int i12 = (i9 << 3) + i11;
                                    Object obj2 = mutableObjectIntMap.keys[i12];
                                    if (mutableObjectIntMap.values[i12] != i8) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    if (z8) {
                                        removeObservation(obj, obj2);
                                    }
                                    if (z8) {
                                        mutableObjectIntMap.removeValueAt(i12);
                                    }
                                }
                                j8 >>= 8;
                            }
                            if (i10 != 8) {
                                return;
                            }
                        }
                        if (i9 != length) {
                            i9++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        private final void removeObservation(Object obj, Object obj2) {
            this.valueToScopes.remove(obj2, obj);
            if ((obj2 instanceof DerivedState) && !this.valueToScopes.contains(obj2)) {
                this.dependencyToDerivedStates.removeScope(obj2);
                this.recordedDerivedStateValues.remove(obj2);
            }
        }

        public final void clear() {
            this.valueToScopes.clear();
            this.scopeToValues.clear();
            this.dependencyToDerivedStates.clear();
            this.recordedDerivedStateValues.clear();
        }

        public final void clearScopeObservations(Object obj) {
            MutableObjectIntMap<Object> remove = this.scopeToValues.remove(obj);
            if (remove == null) {
                return;
            }
            Object[] objArr = remove.keys;
            int[] iArr = remove.values;
            long[] jArr = remove.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i8 = 0;
                while (true) {
                    long j8 = jArr[i8];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((255 & j8) < 128) {
                                int i11 = (i8 << 3) + i10;
                                Object obj2 = objArr[i11];
                                int i12 = iArr[i11];
                                removeObservation(obj, obj2);
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

        public final DerivedStateObserver getDerivedStateObserver() {
            return this.derivedStateObserver;
        }

        public final Function1 getOnChanged() {
            return this.onChanged;
        }

        public final boolean hasScopeObservations() {
            return this.scopeToValues.isNotEmpty();
        }

        public final void notifyInvalidatedScopes() {
            MutableScatterSet<Object> mutableScatterSet = this.invalidated;
            Function1 function1 = this.onChanged;
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
                                function1.invoke(objArr[(i8 << 3) + i10]);
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
            mutableScatterSet.clear();
        }

        public final void observe(Object obj, Function1 function1, Function0 function0) {
            Object obj2 = this.currentScope;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            int i8 = this.currentToken;
            this.currentScope = obj;
            this.currentScopeReads = this.scopeToValues.get(obj);
            if (this.currentToken == -1) {
                this.currentToken = SnapshotKt.currentSnapshot().getId();
            }
            DerivedStateObserver derivedStateObserver = this.derivedStateObserver;
            MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
            try {
                derivedStateObservers.add(derivedStateObserver);
                Snapshot.Companion.observe(function1, null, function0);
                derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                Object obj3 = this.currentScope;
                AbstractC3292y.f(obj3);
                clearObsoleteStateReads(obj3);
                this.currentScope = obj2;
                this.currentScopeReads = mutableObjectIntMap;
                this.currentToken = i8;
            } catch (Throwable th) {
                derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:73:0x0277  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x02ce A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean recordInvalidation(java.util.Set<? extends java.lang.Object> r39) {
            /*
                Method dump skipped, instructions count: 1517
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.recordInvalidation(java.util.Set):boolean");
        }

        public final void recordRead(Object obj) {
            Object obj2 = this.currentScope;
            AbstractC3292y.f(obj2);
            int i8 = this.currentToken;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap == null) {
                mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
                this.currentScopeReads = mutableObjectIntMap;
                this.scopeToValues.set(obj2, mutableObjectIntMap);
                I i9 = I.f8786a;
            }
            recordRead(obj, i8, obj2, mutableObjectIntMap);
        }

        public final void removeScopeIf(Function1 function1) {
            long[] jArr;
            int i8;
            long[] jArr2;
            int i9;
            long j8;
            int i10;
            long j9;
            MutableScatterMap<Object, MutableObjectIntMap<Object>> mutableScatterMap = this.scopeToValues;
            long[] jArr3 = mutableScatterMap.metadata;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j10 = jArr3[i11];
                    long j11 = -9187201950435737472L;
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j10 & 255) < 128) {
                                int i14 = (i11 << 3) + i13;
                                Object obj = mutableScatterMap.keys[i14];
                                MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) mutableScatterMap.values[i14];
                                Boolean bool = (Boolean) function1.invoke(obj);
                                if (bool.booleanValue()) {
                                    Object[] objArr = mutableObjectIntMap.keys;
                                    int[] iArr = mutableObjectIntMap.values;
                                    long[] jArr4 = mutableObjectIntMap.metadata;
                                    int length2 = jArr4.length - 2;
                                    jArr2 = jArr3;
                                    if (length2 >= 0) {
                                        i10 = i12;
                                        int i15 = 0;
                                        while (true) {
                                            long j12 = jArr4[i15];
                                            i9 = i11;
                                            j8 = j10;
                                            j9 = -9187201950435737472L;
                                            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                for (int i17 = 0; i17 < i16; i17++) {
                                                    if ((j12 & 255) < 128) {
                                                        int i18 = (i15 << 3) + i17;
                                                        Object obj2 = objArr[i18];
                                                        int i19 = iArr[i18];
                                                        removeObservation(obj, obj2);
                                                    }
                                                    j12 >>= 8;
                                                }
                                                if (i16 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i15 == length2) {
                                                break;
                                            }
                                            i15++;
                                            i11 = i9;
                                            j10 = j8;
                                        }
                                    } else {
                                        i9 = i11;
                                        j8 = j10;
                                        i10 = i12;
                                        j9 = -9187201950435737472L;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i9 = i11;
                                    j8 = j10;
                                    i10 = i12;
                                    j9 = j11;
                                }
                                if (bool.booleanValue()) {
                                    mutableScatterMap.removeValueAt(i14);
                                }
                            } else {
                                jArr2 = jArr3;
                                i9 = i11;
                                j8 = j10;
                                i10 = i12;
                                j9 = j11;
                            }
                            j10 = j8 >> 8;
                            i13++;
                            j11 = j9;
                            jArr3 = jArr2;
                            i12 = i10;
                            i11 = i9;
                        }
                        jArr = jArr3;
                        int i20 = i11;
                        if (i12 == 8) {
                            i8 = i20;
                        } else {
                            return;
                        }
                    } else {
                        jArr = jArr3;
                        i8 = i11;
                    }
                    if (i8 != length) {
                        i11 = i8 + 1;
                        jArr3 = jArr;
                    } else {
                        return;
                    }
                }
            }
        }

        public final void rereadDerivedState(DerivedState<?> derivedState) {
            long[] jArr;
            long[] jArr2;
            MutableObjectIntMap<Object> mutableObjectIntMap;
            int i8 = 1;
            MutableScatterMap<Object, MutableObjectIntMap<Object>> mutableScatterMap = this.scopeToValues;
            int id = SnapshotKt.currentSnapshot().getId();
            Object obj = this.valueToScopes.getMap().get(derivedState);
            if (obj != null) {
                AbstractC3284p abstractC3284p = null;
                int i9 = 0;
                if (obj instanceof MutableScatterSet) {
                    MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
                    Object[] objArr = mutableScatterSet.elements;
                    long[] jArr3 = mutableScatterSet.metadata;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j8 = jArr3[i10];
                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                int i12 = 0;
                                while (i12 < i11) {
                                    if ((j8 & 255) < 128) {
                                        Object obj2 = objArr[(i10 << 3) + i12];
                                        MutableObjectIntMap<Object> mutableObjectIntMap2 = mutableScatterMap.get(obj2);
                                        jArr2 = jArr3;
                                        if (mutableObjectIntMap2 == null) {
                                            mutableObjectIntMap = new MutableObjectIntMap<>(i9, i8, abstractC3284p);
                                            mutableScatterMap.set(obj2, mutableObjectIntMap);
                                            I i13 = I.f8786a;
                                        } else {
                                            mutableObjectIntMap = mutableObjectIntMap2;
                                        }
                                        recordRead(derivedState, id, obj2, mutableObjectIntMap);
                                    } else {
                                        jArr2 = jArr3;
                                    }
                                    j8 >>= 8;
                                    i12++;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                if (i11 != 8) {
                                    return;
                                }
                            } else {
                                jArr = jArr3;
                            }
                            if (i10 != length) {
                                i10++;
                                jArr3 = jArr;
                            } else {
                                return;
                            }
                        }
                    }
                } else {
                    MutableObjectIntMap<Object> mutableObjectIntMap3 = mutableScatterMap.get(obj);
                    if (mutableObjectIntMap3 == null) {
                        mutableObjectIntMap3 = new MutableObjectIntMap<>(i9, i8, abstractC3284p);
                        mutableScatterMap.set(obj, mutableObjectIntMap3);
                        I i14 = I.f8786a;
                    }
                    recordRead(derivedState, id, obj, mutableObjectIntMap3);
                }
            }
        }

        private final void recordRead(Object obj, int i8, Object obj2, MutableObjectIntMap<Object> mutableObjectIntMap) {
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            int put = mutableObjectIntMap.put(obj, i8, -1);
            if ((obj instanceof DerivedState) && put != i8) {
                DerivedState.Record currentRecord = ((DerivedState) obj).getCurrentRecord();
                this.recordedDerivedStateValues.put(obj, currentRecord.getCurrentValue());
                ObjectIntMap<StateObject> dependencies = currentRecord.getDependencies();
                ScopeMap<DerivedState<?>> scopeMap = this.dependencyToDerivedStates;
                scopeMap.removeScope(obj);
                Object[] objArr = dependencies.keys;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j8 = jArr[i9];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i9 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((j8 & 255) < 128) {
                                    StateObject stateObject = (StateObject) objArr[(i9 << 3) + i11];
                                    if (stateObject instanceof StateObjectImpl) {
                                        ((StateObjectImpl) stateObject).m2584recordReadInh_f27i8$runtime_release(ReaderKind.m2568constructorimpl(2));
                                    }
                                    scopeMap.add(stateObject, obj);
                                }
                                j8 >>= 8;
                            }
                            if (i10 != 8) {
                                break;
                            }
                        }
                        if (i9 == length) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                }
            }
            if (put == -1) {
                if (obj instanceof StateObjectImpl) {
                    ((StateObjectImpl) obj).m2584recordReadInh_f27i8$runtime_release(ReaderKind.m2568constructorimpl(2));
                }
                this.valueToScopes.add(obj, obj2);
            }
        }
    }

    public final void clear() {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    ObservedScopeMap[] content = mutableVector.getContent();
                    int i8 = 0;
                    do {
                        content[i8].clear();
                        i8++;
                    } while (i8 < size);
                }
                I i9 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
