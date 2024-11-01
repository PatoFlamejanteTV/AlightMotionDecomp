package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import d6.InterfaceC2767a;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class MenuKt$iterator$1 implements Iterator<MenuItem>, InterfaceC2767a {
    final /* synthetic */ Menu $this_iterator;
    private int index;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MenuKt$iterator$1(Menu menu) {
        this.$this_iterator = menu;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.index < this.$this_iterator.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        Q5.I i8;
        Menu menu = this.$this_iterator;
        int i9 = this.index - 1;
        this.index = i9;
        MenuItem item = menu.getItem(i9);
        if (item != null) {
            menu.removeItem(item.getItemId());
            i8 = Q5.I.f8786a;
        } else {
            i8 = null;
        }
        if (i8 != null) {
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public MenuItem next() {
        Menu menu = this.$this_iterator;
        int i8 = this.index;
        this.index = i8 + 1;
        MenuItem item = menu.getItem(i8);
        if (item != null) {
            return item;
        }
        throw new IndexOutOfBoundsException();
    }
}
