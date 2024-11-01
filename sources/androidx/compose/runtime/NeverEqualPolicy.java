package androidx.compose.runtime;

/* loaded from: classes.dex */
final class NeverEqualPolicy implements SnapshotMutationPolicy<Object> {
    public static final NeverEqualPolicy INSTANCE = new NeverEqualPolicy();

    private NeverEqualPolicy() {
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(Object obj, Object obj2) {
        return false;
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public /* synthetic */ Object merge(Object obj, Object obj2, Object obj3) {
        return m.a(this, obj, obj2, obj3);
    }

    public String toString() {
        return "NeverEqualPolicy";
    }
}
