package androidx.navigation;

import androidx.collection.SparseArrayCompat;
import d6.InterfaceC2767a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class NavGraph$iterator$1 implements Iterator<NavDestination>, InterfaceC2767a {
    private int index = -1;
    final /* synthetic */ NavGraph this$0;
    private boolean wentToNext;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NavGraph$iterator$1(NavGraph navGraph) {
        this.this$0 = navGraph;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.index + 1 < this.this$0.getNodes().size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.wentToNext) {
            SparseArrayCompat<NavDestination> nodes = this.this$0.getNodes();
            nodes.valueAt(this.index).setParent(null);
            nodes.removeAt(this.index);
            this.index--;
            this.wentToNext = false;
            return;
        }
        throw new IllegalStateException("You must call next() before you can remove an element".toString());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public NavDestination next() {
        if (hasNext()) {
            this.wentToNext = true;
            SparseArrayCompat<NavDestination> nodes = this.this$0.getNodes();
            int i8 = this.index + 1;
            this.index = i8;
            NavDestination valueAt = nodes.valueAt(i8);
            AbstractC3292y.h(valueAt, "nodes.valueAt(++index)");
            return valueAt;
        }
        throw new NoSuchElementException();
    }
}
