package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3290w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class SnapshotStateKt__DerivedStateKt {
    private static final SnapshotThreadLocal<IntRef> calculationBlockNestedLevel = new SnapshotThreadLocal<>();
    private static final SnapshotThreadLocal<MutableVector<DerivedStateObserver>> derivedStateObservers = new SnapshotThreadLocal<>();

    public static final MutableVector<DerivedStateObserver> derivedStateObservers() {
        SnapshotThreadLocal<MutableVector<DerivedStateObserver>> snapshotThreadLocal = derivedStateObservers;
        MutableVector<DerivedStateObserver> mutableVector = snapshotThreadLocal.get();
        if (mutableVector == null) {
            MutableVector<DerivedStateObserver> mutableVector2 = new MutableVector<>(new DerivedStateObserver[0], 0);
            snapshotThreadLocal.set(mutableVector2);
            return mutableVector2;
        }
        return mutableVector;
    }

    @StateFactoryMarker
    public static final <T> State<T> derivedStateOf(Function0 function0) {
        return new DerivedSnapshotState(function0, null);
    }

    private static final <R> R notifyObservers$SnapshotStateKt__DerivedStateKt(DerivedState<?> derivedState, Function0 function0) {
        MutableVector<DerivedStateObserver> derivedStateObservers2 = SnapshotStateKt.derivedStateObservers();
        int size = derivedStateObservers2.getSize();
        int i8 = 0;
        if (size > 0) {
            DerivedStateObserver[] content = derivedStateObservers2.getContent();
            int i9 = 0;
            do {
                content[i9].start(derivedState);
                i9++;
            } while (i9 < size);
        }
        try {
            R r8 = (R) function0.invoke();
            AbstractC3290w.b(1);
            int size2 = derivedStateObservers2.getSize();
            if (size2 > 0) {
                DerivedStateObserver[] content2 = derivedStateObservers2.getContent();
                do {
                    content2[i8].done(derivedState);
                    i8++;
                } while (i8 < size2);
            }
            AbstractC3290w.a(1);
            return r8;
        } catch (Throwable th) {
            AbstractC3290w.b(1);
            int size3 = derivedStateObservers2.getSize();
            if (size3 > 0) {
                DerivedStateObserver[] content3 = derivedStateObservers2.getContent();
                do {
                    content3[i8].done(derivedState);
                    i8++;
                } while (i8 < size3);
            }
            AbstractC3290w.a(1);
            throw th;
        }
    }

    public static final <R> void observeDerivedStateRecalculations(DerivedStateObserver derivedStateObserver, Function0 function0) {
        MutableVector<DerivedStateObserver> derivedStateObservers2 = SnapshotStateKt.derivedStateObservers();
        try {
            derivedStateObservers2.add(derivedStateObserver);
            function0.invoke();
        } finally {
            AbstractC3290w.b(1);
            derivedStateObservers2.removeAt(derivedStateObservers2.getSize() - 1);
            AbstractC3290w.a(1);
        }
    }

    private static final <T> T withCalculationNestedLevel$SnapshotStateKt__DerivedStateKt(Function1 function1) {
        IntRef intRef = (IntRef) calculationBlockNestedLevel.get();
        if (intRef == null) {
            intRef = new IntRef(0);
            calculationBlockNestedLevel.set(intRef);
        }
        return (T) function1.invoke(intRef);
    }

    @StateFactoryMarker
    public static final <T> State<T> derivedStateOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, Function0 function0) {
        return new DerivedSnapshotState(function0, snapshotMutationPolicy);
    }
}
