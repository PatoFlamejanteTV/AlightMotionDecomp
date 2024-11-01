package androidx.compose.runtime;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class StructuralEqualityPolicy implements SnapshotMutationPolicy<Object> {
    public static final StructuralEqualityPolicy INSTANCE = new StructuralEqualityPolicy();

    private StructuralEqualityPolicy() {
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(Object obj, Object obj2) {
        return AbstractC3292y.d(obj, obj2);
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public /* synthetic */ Object merge(Object obj, Object obj2, Object obj3) {
        return m.a(this, obj, obj2, obj3);
    }

    public String toString() {
        return "StructuralEqualityPolicy";
    }
}
