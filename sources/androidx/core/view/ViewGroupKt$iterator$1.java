package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import d6.InterfaceC2767a;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ViewGroupKt$iterator$1 implements Iterator<View>, InterfaceC2767a {
    final /* synthetic */ ViewGroup $this_iterator;
    private int index;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewGroupKt$iterator$1(ViewGroup viewGroup) {
        this.$this_iterator = viewGroup;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.index < this.$this_iterator.getChildCount()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        ViewGroup viewGroup = this.$this_iterator;
        int i8 = this.index - 1;
        this.index = i8;
        viewGroup.removeViewAt(i8);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public View next() {
        ViewGroup viewGroup = this.$this_iterator;
        int i8 = this.index;
        this.index = i8 + 1;
        View childAt = viewGroup.getChildAt(i8);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }
}
