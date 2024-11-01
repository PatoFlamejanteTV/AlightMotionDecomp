package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class Stack<T> {
    public static final int $stable = 8;
    private final ArrayList<T> backing = new ArrayList<>();

    public final void clear() {
        this.backing.clear();
    }

    public final int getSize() {
        return this.backing.size();
    }

    public final boolean isEmpty() {
        return this.backing.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final T peek() {
        return this.backing.get(getSize() - 1);
    }

    public final T pop() {
        return this.backing.remove(getSize() - 1);
    }

    public final boolean push(T t8) {
        return this.backing.add(t8);
    }

    public final T[] toArray() {
        int size = this.backing.size();
        T[] tArr = (T[]) new Object[size];
        for (int i8 = 0; i8 < size; i8++) {
            tArr[i8] = this.backing.get(i8);
        }
        return tArr;
    }

    public final T peek(int i8) {
        return this.backing.get(i8);
    }
}
