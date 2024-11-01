package androidx.compose.runtime;

import R5.AbstractC1435t;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class AbstractApplier<T> implements Applier<T> {
    public static final int $stable = 8;
    private T current;
    private final T root;
    private final List<T> stack = new ArrayList();

    public AbstractApplier(T t8) {
        this.root = t8;
        this.current = t8;
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        this.stack.clear();
        setCurrent(this.root);
        onClear();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(T t8) {
        this.stack.add(getCurrent());
        setCurrent(t8);
    }

    @Override // androidx.compose.runtime.Applier
    public T getCurrent() {
        return this.current;
    }

    public final T getRoot() {
        return this.root;
    }

    protected final void move(List<T> list, int i8, int i9, int i10) {
        int i11;
        if (i8 > i9) {
            i11 = i9;
        } else {
            i11 = i9 - i10;
        }
        if (i10 == 1) {
            if (i8 != i9 + 1 && i8 != i9 - 1) {
                list.add(i11, list.remove(i8));
                return;
            } else {
                list.set(i8, list.set(i9, list.get(i8)));
                return;
            }
        }
        List<T> subList = list.subList(i8, i10 + i8);
        List Z02 = AbstractC1435t.Z0(subList);
        subList.clear();
        list.addAll(i11, Z02);
    }

    @Override // androidx.compose.runtime.Applier
    public /* synthetic */ void onBeginChanges() {
        a.a(this);
    }

    protected abstract void onClear();

    @Override // androidx.compose.runtime.Applier
    public /* synthetic */ void onEndChanges() {
        a.b(this);
    }

    protected final void remove(List<T> list, int i8, int i9) {
        if (i9 == 1) {
            list.remove(i8);
        } else {
            list.subList(i8, i9 + i8).clear();
        }
    }

    protected void setCurrent(T t8) {
        this.current = t8;
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        if (!this.stack.isEmpty()) {
            setCurrent(this.stack.remove(r0.size() - 1));
            return;
        }
        throw new IllegalStateException("empty stack".toString());
    }
}
