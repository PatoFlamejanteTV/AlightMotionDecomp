package androidx.compose.ui.node;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class MergedViewAdapter implements ViewAdapter {
    public static final int $stable = 8;
    private final List<ViewAdapter> adapters = new ArrayList();
    private final int id;

    @Override // androidx.compose.ui.node.ViewAdapter
    public void didInsert(View view, ViewGroup viewGroup) {
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            list.get(i8).didInsert(view, viewGroup);
        }
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public void didUpdate(View view, ViewGroup viewGroup) {
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            list.get(i8).didUpdate(view, viewGroup);
        }
    }

    public final <T extends ViewAdapter> T get(int i8, Function0 function0) {
        T t8;
        ViewAdapter viewAdapter;
        List<ViewAdapter> adapters = getAdapters();
        int size = adapters.size();
        int i9 = 0;
        while (true) {
            t8 = null;
            if (i9 < size) {
                viewAdapter = adapters.get(i9);
                if (viewAdapter.getId() == i8) {
                    break;
                }
                i9++;
            } else {
                viewAdapter = null;
                break;
            }
        }
        if (viewAdapter instanceof ViewAdapter) {
            t8 = (T) viewAdapter;
        }
        if (t8 != null) {
            return t8;
        }
        T t9 = (T) function0.invoke();
        getAdapters().add(t9);
        return t9;
    }

    public final List<ViewAdapter> getAdapters() {
        return this.adapters;
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public int getId() {
        return this.id;
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public void willInsert(View view, ViewGroup viewGroup) {
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            list.get(i8).willInsert(view, viewGroup);
        }
    }
}
