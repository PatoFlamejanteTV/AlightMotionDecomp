package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Comparator;

@StabilityInferred(parameters = 2)
/* loaded from: classes.dex */
public final class TreeSet<E> extends java.util.TreeSet<E> {
    public static final int $stable = 0;

    public TreeSet(Comparator<? super E> comparator) {
        super(comparator);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
