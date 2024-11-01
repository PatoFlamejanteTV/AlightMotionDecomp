package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsNode;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2<T> implements Comparator {
    final /* synthetic */ Comparator $this_thenBy;

    public AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2(Comparator comparator) {
        this.$this_thenBy = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t8, T t9) {
        int compare = this.$this_thenBy.compare(t8, t9);
        if (compare == 0) {
            return T5.a.a(Integer.valueOf(((SemanticsNode) t8).getId()), Integer.valueOf(((SemanticsNode) t9).getId()));
        }
        return compare;
    }
}
