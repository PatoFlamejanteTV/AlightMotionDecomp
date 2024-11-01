package androidx.compose.runtime;

import Q5.I;
import androidx.collection.MutableObjectIntMap;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.snapshots.StateObject;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class DerivedSnapshotState$currentRecord$result$1$1$result$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ IntRef $calculationLevelRef;
    final /* synthetic */ int $nestedCalculationLevel;
    final /* synthetic */ MutableObjectIntMap<StateObject> $newDependencies;
    final /* synthetic */ DerivedSnapshotState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DerivedSnapshotState$currentRecord$result$1$1$result$1(DerivedSnapshotState<T> derivedSnapshotState, IntRef intRef, MutableObjectIntMap<StateObject> mutableObjectIntMap, int i8) {
        super(1);
        this.this$0 = derivedSnapshotState;
        this.$calculationLevelRef = intRef;
        this.$newDependencies = mutableObjectIntMap;
        this.$nestedCalculationLevel = i8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m2445invoke(obj);
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2445invoke(Object obj) {
        if (obj != this.this$0) {
            if (obj instanceof StateObject) {
                int element = this.$calculationLevelRef.getElement();
                MutableObjectIntMap<StateObject> mutableObjectIntMap = this.$newDependencies;
                mutableObjectIntMap.set(obj, Math.min(element - this.$nestedCalculationLevel, mutableObjectIntMap.getOrDefault(obj, Integer.MAX_VALUE)));
                return;
            }
            return;
        }
        throw new IllegalStateException("A derived state calculation cannot read itself".toString());
    }
}
