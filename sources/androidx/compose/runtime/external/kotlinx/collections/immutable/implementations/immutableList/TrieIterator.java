package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TrieIterator<E> extends AbstractListIterator<E> {
    public static final int $stable = 8;
    private int height;
    private boolean isInRightEdge;
    private Object[] path;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public TrieIterator(Object[] objArr, int i8, int i9, int i10) {
        super(i8, i9);
        ?? r52;
        this.height = i10;
        Object[] objArr2 = new Object[i10];
        this.path = objArr2;
        if (i8 == i9) {
            r52 = 1;
        } else {
            r52 = 0;
        }
        this.isInRightEdge = r52;
        objArr2[0] = objArr;
        fillPath(i8 - r52, 1);
    }

    private final E elementAtCurrentIndex() {
        int index = getIndex() & 31;
        Object obj = this.path[this.height - 1];
        AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[index];
    }

    private final void fillPath(int i8, int i9) {
        int i10 = (this.height - i9) * 5;
        while (i9 < this.height) {
            Object[] objArr = this.path;
            Object obj = objArr[i9 - 1];
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i9] = ((Object[]) obj)[UtilsKt.indexSegment(i8, i10)];
            i10 -= 5;
            i9++;
        }
    }

    private final void fillPathIfNeeded(int i8) {
        int i9 = 0;
        while (UtilsKt.indexSegment(getIndex(), i9) == i8) {
            i9 += 5;
        }
        if (i9 > 0) {
            fillPath(getIndex(), ((this.height - 1) - (i9 / 5)) + 1);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public E next() {
        if (hasNext()) {
            E elementAtCurrentIndex = elementAtCurrentIndex();
            setIndex(getIndex() + 1);
            if (getIndex() == getSize()) {
                this.isInRightEdge = true;
                return elementAtCurrentIndex;
            }
            fillPathIfNeeded(0);
            return elementAtCurrentIndex;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (hasPrevious()) {
            setIndex(getIndex() - 1);
            if (this.isInRightEdge) {
                this.isInRightEdge = false;
                return elementAtCurrentIndex();
            }
            fillPathIfNeeded(31);
            return elementAtCurrentIndex();
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void reset$runtime_release(Object[] objArr, int i8, int i9, int i10) {
        setIndex(i8);
        setSize(i9);
        this.height = i10;
        if (this.path.length < i10) {
            this.path = new Object[i10];
        }
        ?? r02 = 0;
        this.path[0] = objArr;
        if (i8 == i9) {
            r02 = 1;
        }
        this.isInRightEdge = r02;
        fillPath(i8 - r02, 1);
    }
}
