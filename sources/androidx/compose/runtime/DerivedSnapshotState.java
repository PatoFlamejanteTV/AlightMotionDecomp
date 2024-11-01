package androidx.compose.runtime;

import Q5.I;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DerivedSnapshotState<T> extends StateObjectImpl implements DerivedState<T> {
    private final Function0 calculation;
    private ResultRecord<T> first = new ResultRecord<>();
    private final SnapshotMutationPolicy<T> policy;

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class ResultRecord<T> extends StateRecord implements DerivedState.Record<T> {
        private ObjectIntMap<StateObject> dependencies = ObjectIntMapKt.emptyObjectIntMap();
        private Object result = Unset;
        private int resultHash;
        private int validSnapshotId;
        private int validSnapshotWriteCount;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final Object Unset = new Object();

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public final Object getUnset() {
                return ResultRecord.Unset;
            }

            public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            AbstractC3292y.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            ResultRecord resultRecord = (ResultRecord) stateRecord;
            setDependencies(resultRecord.getDependencies());
            this.result = resultRecord.result;
            this.resultHash = resultRecord.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new ResultRecord();
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public T getCurrentValue() {
            return (T) this.result;
        }

        @Override // androidx.compose.runtime.DerivedState.Record
        public ObjectIntMap<StateObject> getDependencies() {
            return this.dependencies;
        }

        public final Object getResult() {
            return this.result;
        }

        public final int getResultHash() {
            return this.resultHash;
        }

        public final int getValidSnapshotId() {
            return this.validSnapshotId;
        }

        public final int getValidSnapshotWriteCount() {
            return this.validSnapshotWriteCount;
        }

        public final boolean isValid(DerivedState<?> derivedState, Snapshot snapshot) {
            boolean z8;
            boolean z9;
            synchronized (SnapshotKt.getLock()) {
                z8 = true;
                if (this.validSnapshotId == snapshot.getId()) {
                    if (this.validSnapshotWriteCount == snapshot.getWriteCount$runtime_release()) {
                        z9 = false;
                    }
                }
                z9 = true;
            }
            if (this.result == Unset || (z9 && this.resultHash != readableHash(derivedState, snapshot))) {
                z8 = false;
            }
            if (z8 && z9) {
                synchronized (SnapshotKt.getLock()) {
                    this.validSnapshotId = snapshot.getId();
                    this.validSnapshotWriteCount = snapshot.getWriteCount$runtime_release();
                    I i8 = I.f8786a;
                }
            }
            return z8;
        }

        public final int readableHash(DerivedState<?> derivedState, Snapshot snapshot) {
            ObjectIntMap<StateObject> dependencies;
            int i8;
            StateRecord current;
            synchronized (SnapshotKt.getLock()) {
                dependencies = getDependencies();
            }
            char c8 = 7;
            if (dependencies.isNotEmpty()) {
                MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
                int size = derivedStateObservers.getSize();
                if (size > 0) {
                    DerivedStateObserver[] content = derivedStateObservers.getContent();
                    int i9 = 0;
                    do {
                        content[i9].start(derivedState);
                        i9++;
                    } while (i9 < size);
                }
                try {
                    Object[] objArr = dependencies.keys;
                    int[] iArr = dependencies.values;
                    long[] jArr = dependencies.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        int i11 = 7;
                        while (true) {
                            long j8 = jArr[i10];
                            if ((((~j8) << c8) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8 - ((~(i10 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((j8 & 255) < 128) {
                                        int i14 = (i10 << 3) + i13;
                                        StateObject stateObject = (StateObject) objArr[i14];
                                        if (iArr[i14] == 1) {
                                            if (stateObject instanceof DerivedSnapshotState) {
                                                current = ((DerivedSnapshotState) stateObject).current(snapshot);
                                            } else {
                                                current = SnapshotKt.current(stateObject.getFirstStateRecord(), snapshot);
                                            }
                                            i11 = (((i11 * 31) + ActualJvm_jvmKt.identityHashCode(current)) * 31) + current.getSnapshotId$runtime_release();
                                        }
                                    }
                                    j8 >>= 8;
                                }
                                if (i12 != 8) {
                                    break;
                                }
                            }
                            if (i10 == length) {
                                break;
                            }
                            i10++;
                            c8 = 7;
                        }
                        i8 = i11;
                    } else {
                        i8 = 7;
                    }
                    I i15 = I.f8786a;
                    int size2 = derivedStateObservers.getSize();
                    if (size2 > 0) {
                        DerivedStateObserver[] content2 = derivedStateObservers.getContent();
                        int i16 = 0;
                        do {
                            content2[i16].done(derivedState);
                            i16++;
                        } while (i16 < size2);
                        return i8;
                    }
                    return i8;
                } catch (Throwable th) {
                    int size3 = derivedStateObservers.getSize();
                    if (size3 > 0) {
                        DerivedStateObserver[] content3 = derivedStateObservers.getContent();
                        int i17 = 0;
                        do {
                            content3[i17].done(derivedState);
                            i17++;
                        } while (i17 < size3);
                    }
                    throw th;
                }
            }
            return 7;
        }

        public void setDependencies(ObjectIntMap<StateObject> objectIntMap) {
            this.dependencies = objectIntMap;
        }

        public final void setResult(Object obj) {
            this.result = obj;
        }

        public final void setResultHash(int i8) {
            this.resultHash = i8;
        }

        public final void setValidSnapshotId(int i8) {
            this.validSnapshotId = i8;
        }

        public final void setValidSnapshotWriteCount(int i8) {
            this.validSnapshotWriteCount = i8;
        }
    }

    public DerivedSnapshotState(Function0 function0, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        this.calculation = function0;
        this.policy = snapshotMutationPolicy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ResultRecord<T> currentRecord(ResultRecord<T> resultRecord, Snapshot snapshot, boolean z8, Function0 function0) {
        Snapshot.Companion companion;
        SnapshotMutationPolicy<T> policy;
        int i8;
        ResultRecord<T> resultRecord2 = resultRecord;
        if (resultRecord2.isValid(this, snapshot)) {
            if (z8) {
                MutableVector<DerivedStateObserver> derivedStateObservers = SnapshotStateKt.derivedStateObservers();
                int size = derivedStateObservers.getSize();
                if (size > 0) {
                    DerivedStateObserver[] content = derivedStateObservers.getContent();
                    int i9 = 0;
                    do {
                        content[i9].start(this);
                        i9++;
                    } while (i9 < size);
                }
                try {
                    ObjectIntMap<StateObject> dependencies = resultRecord.getDependencies();
                    IntRef intRef = (IntRef) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
                    if (intRef == null) {
                        intRef = new IntRef(0);
                        SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.set(intRef);
                    }
                    int element = intRef.getElement();
                    Object[] objArr = dependencies.keys;
                    int[] iArr = dependencies.values;
                    long[] jArr = dependencies.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j8 = jArr[i10];
                            long[] jArr2 = jArr;
                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((j8 & 255) < 128) {
                                        int i13 = (i10 << 3) + i12;
                                        StateObject stateObject = (StateObject) objArr[i13];
                                        intRef.setElement(element + iArr[i13]);
                                        Function1 readObserver$runtime_release = snapshot.getReadObserver$runtime_release();
                                        if (readObserver$runtime_release != null) {
                                            readObserver$runtime_release.invoke(stateObject);
                                        }
                                    }
                                    j8 >>= 8;
                                }
                                i8 = 1;
                                if (i11 != 8) {
                                    break;
                                }
                            } else {
                                i8 = 1;
                            }
                            if (i10 == length) {
                                break;
                            }
                            i10 += i8;
                            jArr = jArr2;
                        }
                    }
                    intRef.setElement(element);
                    I i14 = I.f8786a;
                    int size2 = derivedStateObservers.getSize();
                    if (size2 > 0) {
                        DerivedStateObserver[] content2 = derivedStateObservers.getContent();
                        int i15 = 0;
                        do {
                            content2[i15].done(this);
                            i15++;
                        } while (i15 < size2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return resultRecord2;
        }
        int i16 = 0;
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        IntRef intRef2 = (IntRef) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
        if (intRef2 == null) {
            intRef2 = new IntRef(0);
            SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.set(intRef2);
        }
        int element2 = intRef2.getElement();
        MutableVector<DerivedStateObserver> derivedStateObservers2 = SnapshotStateKt.derivedStateObservers();
        int size3 = derivedStateObservers2.getSize();
        if (size3 > 0) {
            DerivedStateObserver[] content3 = derivedStateObservers2.getContent();
            int i17 = 0;
            while (true) {
                content3[i17].start(this);
                int i18 = i17 + 1;
                if (i18 >= size3) {
                    break;
                }
                i17 = i18;
            }
        }
        try {
            intRef2.setElement(element2 + 1);
            Object observe = Snapshot.Companion.observe(new DerivedSnapshotState$currentRecord$result$1$1$result$1(this, intRef2, mutableObjectIntMap, element2), null, function0);
            intRef2.setElement(element2);
            int size4 = derivedStateObservers2.getSize();
            if (size4 > 0) {
                DerivedStateObserver[] content4 = derivedStateObservers2.getContent();
                do {
                    content4[i16].done(this);
                    i16++;
                } while (i16 < size4);
            }
            synchronized (SnapshotKt.getLock()) {
                try {
                    companion = Snapshot.Companion;
                    Snapshot current = companion.getCurrent();
                    if (resultRecord.getResult() != ResultRecord.Companion.getUnset() && (policy = getPolicy()) != 0 && policy.equivalent(observe, resultRecord.getResult())) {
                        resultRecord2.setDependencies(mutableObjectIntMap);
                        resultRecord2.setResultHash(resultRecord2.readableHash(this, current));
                        resultRecord2.setValidSnapshotId(snapshot.getId());
                        resultRecord2.setValidSnapshotWriteCount(snapshot.getWriteCount$runtime_release());
                    } else {
                        resultRecord2 = (ResultRecord) SnapshotKt.newWritableRecord(this.first, this, current);
                        resultRecord2.setDependencies(mutableObjectIntMap);
                        resultRecord2.setResultHash(resultRecord2.readableHash(this, current));
                        resultRecord2.setValidSnapshotId(snapshot.getId());
                        resultRecord2.setValidSnapshotWriteCount(snapshot.getWriteCount$runtime_release());
                        resultRecord2.setResult(observe);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            IntRef intRef3 = (IntRef) SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel.get();
            if (intRef3 != null && intRef3.getElement() == 0) {
                companion.notifyObjectsInitialized();
            }
            return resultRecord2;
        } finally {
            int size5 = derivedStateObservers2.getSize();
            if (size5 > 0) {
                DerivedStateObserver[] content5 = derivedStateObservers2.getContent();
                int i19 = 0;
                do {
                    content5[i19].done(this);
                    i19++;
                } while (i19 < size5);
            }
        }
    }

    private final String displayValue() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        if (resultRecord.isValid(this, Snapshot.Companion.getCurrent())) {
            return String.valueOf(resultRecord.getResult());
        }
        return "<Not calculated>";
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public final StateRecord current(Snapshot snapshot) {
        return currentRecord((ResultRecord) SnapshotKt.current(this.first, snapshot), snapshot, false, this.calculation);
    }

    @Override // androidx.compose.runtime.DerivedState
    public DerivedState.Record<T> getCurrentRecord() {
        return currentRecord((ResultRecord) SnapshotKt.current(this.first), Snapshot.Companion.getCurrent(), false, this.calculation);
    }

    public final T getDebuggerDisplayValue() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first);
        if (resultRecord.isValid(this, Snapshot.Companion.getCurrent())) {
            return (T) resultRecord.getResult();
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.first;
    }

    @Override // androidx.compose.runtime.DerivedState
    public SnapshotMutationPolicy<T> getPolicy() {
        return this.policy;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        Snapshot.Companion companion = Snapshot.Companion;
        Function1 readObserver$runtime_release = companion.getCurrent().getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(this);
        }
        return (T) currentRecord((ResultRecord) SnapshotKt.current(this.first), companion.getCurrent(), true, this.calculation).getResult();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        AbstractC3292y.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.first = (ResultRecord) stateRecord;
    }

    public String toString() {
        return "DerivedState(value=" + displayValue() + ")@" + hashCode();
    }
}
