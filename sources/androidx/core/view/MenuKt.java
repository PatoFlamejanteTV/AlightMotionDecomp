package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import c6.InterfaceC2072n;
import java.util.Iterator;
import k6.InterfaceC3255g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class MenuKt {
    public static final boolean contains(Menu menu, MenuItem menuItem) {
        int size = menu.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (AbstractC3292y.d(menu.getItem(i8), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(Menu menu, Function1 function1) {
        int size = menu.size();
        for (int i8 = 0; i8 < size; i8++) {
            function1.invoke(menu.getItem(i8));
        }
    }

    public static final void forEachIndexed(Menu menu, InterfaceC2072n interfaceC2072n) {
        int size = menu.size();
        for (int i8 = 0; i8 < size; i8++) {
            interfaceC2072n.invoke(Integer.valueOf(i8), menu.getItem(i8));
        }
    }

    public static final MenuItem get(Menu menu, int i8) {
        return menu.getItem(i8);
    }

    public static final InterfaceC3255g getChildren(final Menu menu) {
        return new InterfaceC3255g() { // from class: androidx.core.view.MenuKt$children$1
            @Override // k6.InterfaceC3255g
            public Iterator<MenuItem> iterator() {
                return MenuKt.iterator(menu);
            }
        };
    }

    public static final int getSize(Menu menu) {
        return menu.size();
    }

    public static final boolean isEmpty(Menu menu) {
        if (menu.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNotEmpty(Menu menu) {
        if (menu.size() != 0) {
            return true;
        }
        return false;
    }

    public static final Iterator<MenuItem> iterator(Menu menu) {
        return new MenuKt$iterator$1(menu);
    }

    public static final void minusAssign(Menu menu, MenuItem menuItem) {
        menu.removeItem(menuItem.getItemId());
    }

    public static final void removeItemAt(Menu menu, int i8) {
        Q5.I i9;
        MenuItem item = menu.getItem(i8);
        if (item != null) {
            menu.removeItem(item.getItemId());
            i9 = Q5.I.f8786a;
        } else {
            i9 = null;
        }
        if (i9 != null) {
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
