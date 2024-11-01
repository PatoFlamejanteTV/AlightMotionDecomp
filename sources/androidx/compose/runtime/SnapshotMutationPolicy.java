package androidx.compose.runtime;

/* loaded from: classes.dex */
public interface SnapshotMutationPolicy<T> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> T merge(SnapshotMutationPolicy<T> snapshotMutationPolicy, T t8, T t9, T t10) {
            Object a9;
            a9 = m.a(snapshotMutationPolicy, t8, t9, t10);
            return (T) a9;
        }
    }

    boolean equivalent(T t8, T t9);

    T merge(T t8, T t9, T t10);
}
