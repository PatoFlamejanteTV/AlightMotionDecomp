package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsNode;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1<T> implements Comparator {
    final /* synthetic */ Comparator $comparator;
    final /* synthetic */ Comparator $this_thenBy;

    public AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1(Comparator comparator, Comparator comparator2) {
        this.$this_thenBy = comparator;
        this.$comparator = comparator2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t8, T t9) {
        int compare = this.$this_thenBy.compare(t8, t9);
        if (compare == 0) {
            return this.$comparator.compare(((SemanticsNode) t8).getLayoutNode$ui_release(), ((SemanticsNode) t9).getLayoutNode$ui_release());
        }
        return compare;
    }
}
