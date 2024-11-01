package androidx.collection;

import androidx.annotation.IntRange;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import i6.i;
import i6.m;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public abstract class ObjectList<E> {
    public int _size;
    public Object[] content;

    public /* synthetic */ ObjectList(int i8, AbstractC3284p abstractC3284p) {
        this(i8);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(ObjectList objectList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, Function1 function1, int i9, Object obj) {
        CharSequence charSequence5;
        int i10;
        if (obj == null) {
            if ((i9 & 1) != 0) {
                charSequence = ", ";
            }
            CharSequence charSequence6 = "";
            if ((i9 & 2) != 0) {
                charSequence5 = "";
            } else {
                charSequence5 = charSequence2;
            }
            if ((i9 & 4) == 0) {
                charSequence6 = charSequence3;
            }
            if ((i9 & 8) != 0) {
                i10 = -1;
            } else {
                i10 = i8;
            }
            if ((i9 & 16) != 0) {
                charSequence4 = "...";
            }
            CharSequence charSequence7 = charSequence4;
            if ((i9 & 32) != 0) {
                function1 = null;
            }
            return objectList.joinToString(charSequence, charSequence5, charSequence6, i10, charSequence7, function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public abstract List<E> asList();

    public final boolean contains(E e8) {
        if (indexOf(e8) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(E[] elements) {
        AbstractC3292y.i(elements, "elements");
        for (E e8 : elements) {
            if (!contains(e8)) {
                return false;
            }
        }
        return true;
    }

    public final int count() {
        return this._size;
    }

    public final E elementAt(@IntRange(from = 0) int i8) {
        if (i8 >= 0 && i8 < this._size) {
            return (E) this.content[i8];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i8);
        sb.append(" must be in 0..");
        sb.append(this._size - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final E elementAtOrElse(@IntRange(from = 0) int i8, Function1 defaultValue) {
        AbstractC3292y.i(defaultValue, "defaultValue");
        if (i8 >= 0 && i8 < this._size) {
            return (E) this.content[i8];
        }
        return (E) defaultValue.invoke(Integer.valueOf(i8));
    }

    public boolean equals(Object obj) {
        if (obj instanceof ObjectList) {
            ObjectList objectList = (ObjectList) obj;
            int i8 = objectList._size;
            int i9 = this._size;
            if (i8 == i9) {
                Object[] objArr = this.content;
                Object[] objArr2 = objectList.content;
                i s8 = m.s(0, i9);
                int e8 = s8.e();
                int g8 = s8.g();
                if (e8 <= g8) {
                    while (AbstractC3292y.d(objArr[e8], objArr2[e8])) {
                        if (e8 != g8) {
                            e8++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final E first() {
        if (!isEmpty()) {
            return (E) this.content[0];
        }
        throw new NoSuchElementException("ObjectList is empty.");
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final <R> R fold(R r8, InterfaceC2072n operation) {
        AbstractC3292y.i(operation, "operation");
        Object[] objArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            r8 = (R) operation.invoke(r8, objArr[i9]);
        }
        return r8;
    }

    public final <R> R foldIndexed(R r8, InterfaceC2073o operation) {
        AbstractC3292y.i(operation, "operation");
        Object[] objArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            r8 = (R) operation.invoke(Integer.valueOf(i9), r8, objArr[i9]);
        }
        return r8;
    }

    public final <R> R foldRight(R r8, InterfaceC2072n operation) {
        AbstractC3292y.i(operation, "operation");
        Object[] objArr = this.content;
        int i8 = this._size;
        while (true) {
            i8--;
            if (-1 >= i8) {
                return r8;
            }
            r8 = (R) operation.invoke(objArr[i8], r8);
        }
    }

    public final <R> R foldRightIndexed(R r8, InterfaceC2073o operation) {
        AbstractC3292y.i(operation, "operation");
        Object[] objArr = this.content;
        int i8 = this._size;
        while (true) {
            i8--;
            if (-1 >= i8) {
                return r8;
            }
            r8 = (R) operation.invoke(Integer.valueOf(i8), objArr[i8], r8);
        }
    }

    public final void forEach(Function1 block) {
        AbstractC3292y.i(block, "block");
        Object[] objArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            block.invoke(objArr[i9]);
        }
    }

    public final void forEachIndexed(InterfaceC2072n block) {
        AbstractC3292y.i(block, "block");
        Object[] objArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            block.invoke(Integer.valueOf(i9), objArr[i9]);
        }
    }

    public final void forEachReversed(Function1 block) {
        AbstractC3292y.i(block, "block");
        Object[] objArr = this.content;
        int i8 = this._size;
        while (true) {
            i8--;
            if (-1 < i8) {
                block.invoke(objArr[i8]);
            } else {
                return;
            }
        }
    }

    public final void forEachReversedIndexed(InterfaceC2072n block) {
        AbstractC3292y.i(block, "block");
        Object[] objArr = this.content;
        int i8 = this._size;
        while (true) {
            i8--;
            if (-1 < i8) {
                block.invoke(Integer.valueOf(i8), objArr[i8]);
            } else {
                return;
            }
        }
    }

    public final E get(@IntRange(from = 0) int i8) {
        if (i8 >= 0 && i8 < this._size) {
            return (E) this.content[i8];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i8);
        sb.append(" must be in 0..");
        sb.append(this._size - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final i getIndices() {
        return m.s(0, this._size);
    }

    @IntRange(from = -1)
    public final int getLastIndex() {
        return this._size - 1;
    }

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        int i8;
        Object[] objArr = this.content;
        int i9 = this._size;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            Object obj = objArr[i11];
            if (obj != null) {
                i8 = obj.hashCode();
            } else {
                i8 = 0;
            }
            i10 += i8 * 31;
        }
        return i10;
    }

    public final int indexOf(E e8) {
        int i8 = 0;
        if (e8 == null) {
            Object[] objArr = this.content;
            int i9 = this._size;
            while (i8 < i9) {
                if (objArr[i8] == null) {
                    return i8;
                }
                i8++;
            }
            return -1;
        }
        Object[] objArr2 = this.content;
        int i10 = this._size;
        while (i8 < i10) {
            if (e8.equals(objArr2[i8])) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public final int indexOfFirst(Function1 predicate) {
        AbstractC3292y.i(predicate, "predicate");
        Object[] objArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (((Boolean) predicate.invoke(objArr[i9])).booleanValue()) {
                return i9;
            }
        }
        return -1;
    }

    public final int indexOfLast(Function1 predicate) {
        AbstractC3292y.i(predicate, "predicate");
        Object[] objArr = this.content;
        int i8 = this._size;
        do {
            i8--;
            if (-1 >= i8) {
                return -1;
            }
        } while (!((Boolean) predicate.invoke(objArr[i8])).booleanValue());
        return i8;
    }

    public final boolean isEmpty() {
        if (this._size == 0) {
            return true;
        }
        return false;
    }

    public final boolean isNotEmpty() {
        if (this._size != 0) {
            return true;
        }
        return false;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final E last() {
        if (!isEmpty()) {
            return (E) this.content[this._size - 1];
        }
        throw new NoSuchElementException("ObjectList is empty.");
    }

    public final int lastIndexOf(E e8) {
        if (e8 == null) {
            Object[] objArr = this.content;
            for (int i8 = this._size - 1; -1 < i8; i8--) {
                if (objArr[i8] == null) {
                    return i8;
                }
            }
        } else {
            Object[] objArr2 = this.content;
            for (int i9 = this._size - 1; -1 < i9; i9--) {
                if (e8.equals(objArr2[i9])) {
                    return i9;
                }
            }
        }
        return -1;
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.content[this._size - 1];
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(Function1 predicate) {
        AbstractC3292y.i(predicate, "predicate");
        Object[] objArr = this.content;
        for (int i8 = this._size - 1; -1 < i8; i8--) {
            if (((Boolean) predicate.invoke(objArr[i8])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new ObjectList$toString$1(this), 25, null);
    }

    private ObjectList(int i8) {
        Object[] objArr;
        if (i8 == 0) {
            objArr = ObjectListKt.EmptyArray;
        } else {
            objArr = new Object[i8];
        }
        this.content = objArr;
    }

    public final boolean any(Function1 predicate) {
        AbstractC3292y.i(predicate, "predicate");
        Object[] objArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (((Boolean) predicate.invoke(objArr[i9])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(Function1 predicate) {
        AbstractC3292y.i(predicate, "predicate");
        Object[] objArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            if (((Boolean) predicate.invoke(objArr[i10])).booleanValue()) {
                i9++;
            }
        }
        return i9;
    }

    public final E firstOrNull(Function1 predicate) {
        AbstractC3292y.i(predicate, "predicate");
        Object[] objArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            E e8 = (E) objArr[i9];
            if (((Boolean) predicate.invoke(e8)).booleanValue()) {
                return e8;
            }
        }
        return null;
    }

    public final String joinToString(CharSequence separator) {
        AbstractC3292y.i(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    public final boolean containsAll(List<? extends E> elements) {
        AbstractC3292y.i(elements, "elements");
        int size = elements.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!contains(elements.get(i8))) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    public final E lastOrNull(Function1 predicate) {
        E e8;
        AbstractC3292y.i(predicate, "predicate");
        Object[] objArr = this.content;
        int i8 = this._size;
        do {
            i8--;
            if (-1 >= i8) {
                return null;
            }
            e8 = (E) objArr[i8];
        } while (!((Boolean) predicate.invoke(e8)).booleanValue());
        return e8;
    }

    public final E first(Function1 predicate) {
        AbstractC3292y.i(predicate, "predicate");
        Object[] objArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            E e8 = (E) objArr[i9];
            if (((Boolean) predicate.invoke(e8)).booleanValue()) {
                return e8;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    public final boolean containsAll(Iterable<? extends E> elements) {
        AbstractC3292y.i(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i8, null, null, 48, null);
    }

    public final E last(Function1 predicate) {
        E e8;
        AbstractC3292y.i(predicate, "predicate");
        Object[] objArr = this.content;
        int i8 = this._size;
        do {
            i8--;
            if (-1 < i8) {
                e8 = (E) objArr[i8];
            } else {
                throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
            }
        } while (!((Boolean) predicate.invoke(e8)).booleanValue());
        return e8;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        AbstractC3292y.i(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, i8, truncated, null, 32, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(ObjectList<E> elements) {
        AbstractC3292y.i(elements, "elements");
        Object[] objArr = elements.content;
        int i8 = elements._size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (!contains(objArr[i9])) {
                return false;
            }
        }
        return true;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Function1 function1) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        AbstractC3292y.i(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr = this.content;
        int i9 = this._size;
        int i10 = 0;
        while (true) {
            if (i10 < i9) {
                Object obj = objArr[i10];
                if (i10 == i8) {
                    sb.append(truncated);
                    break;
                }
                if (i10 != 0) {
                    sb.append(separator);
                }
                if (function1 == null) {
                    sb.append(obj);
                } else {
                    sb.append((CharSequence) function1.invoke(obj));
                }
                i10++;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
