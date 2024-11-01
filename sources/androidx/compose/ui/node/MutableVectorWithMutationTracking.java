package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class MutableVectorWithMutationTracking<T> {
    public static final int $stable = MutableVector.$stable;
    private final Function0 onVectorMutated;
    private final MutableVector<T> vector;

    public MutableVectorWithMutationTracking(MutableVector<T> mutableVector, Function0 function0) {
        this.vector = mutableVector;
        this.onVectorMutated = function0;
    }

    public final void add(int i8, T t8) {
        this.vector.add(i8, t8);
        this.onVectorMutated.invoke();
    }

    public final List<T> asList() {
        return this.vector.asMutableList();
    }

    public final void clear() {
        this.vector.clear();
        this.onVectorMutated.invoke();
    }

    public final void forEach(Function1 function1) {
        MutableVector<T> vector = getVector();
        int size = vector.getSize();
        if (size > 0) {
            T[] content = vector.getContent();
            int i8 = 0;
            do {
                function1.invoke(content[i8]);
                i8++;
            } while (i8 < size);
        }
    }

    public final T get(int i8) {
        return this.vector.getContent()[i8];
    }

    public final Function0 getOnVectorMutated() {
        return this.onVectorMutated;
    }

    public final int getSize() {
        return this.vector.getSize();
    }

    public final MutableVector<T> getVector() {
        return this.vector;
    }

    public final T removeAt(int i8) {
        T removeAt = this.vector.removeAt(i8);
        this.onVectorMutated.invoke();
        return removeAt;
    }
}
