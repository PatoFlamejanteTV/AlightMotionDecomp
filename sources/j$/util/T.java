package j$.util;

import java.util.Comparator;
import java.util.SortedSet;

/* loaded from: classes2.dex */
final class T extends s0 {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ SortedSet f33068f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(SortedSet sortedSet, java.util.Collection collection) {
        super(21, collection);
        this.f33068f = sortedSet;
    }

    @Override // j$.util.s0, j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f33068f.comparator();
    }
}
