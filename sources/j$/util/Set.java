package j$.util;

/* loaded from: classes2.dex */
public interface Set<E> extends Collection<E> {

    /* renamed from: j$.util.Set$-CC, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static Spliterator $default$spliterator(java.util.Set set) {
            return new s0(1, (java.util.Collection) Objects.requireNonNull(set));
        }
    }

    @Override // j$.util.Collection, java.lang.Iterable, j$.util.List
    Spliterator<E> spliterator();
}
