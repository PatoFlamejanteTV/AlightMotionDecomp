package androidx.collection;

import androidx.annotation.IntRange;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import i6.i;
import i6.m;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public abstract class IntList {
    public int _size;
    public int[] content;

    public /* synthetic */ IntList(int i8, AbstractC3284p abstractC3284p) {
        this(i8);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(IntList intList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i9 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i9 & 4) == 0 ? charSequence3 : "";
        int i10 = (i9 & 8) != 0 ? -1 : i8;
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        return intList.joinToString(charSequence, charSequence5, charSequence6, i10, charSequence4);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public final boolean contains(int i8) {
        int[] iArr = this.content;
        int i9 = this._size;
        for (int i10 = 0; i10 < i9; i10++) {
            if (iArr[i10] == i8) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(IntList elements) {
        AbstractC3292y.i(elements, "elements");
        i s8 = m.s(0, elements._size);
        int e8 = s8.e();
        int g8 = s8.g();
        if (e8 <= g8) {
            while (contains(elements.get(e8))) {
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

    public final int count() {
        return this._size;
    }

    public final int elementAt(@IntRange(from = 0) int i8) {
        if (i8 >= 0 && i8 < this._size) {
            return this.content[i8];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i8);
        sb.append(" must be in 0..");
        sb.append(this._size - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int elementAtOrElse(@IntRange(from = 0) int i8, Function1 defaultValue) {
        AbstractC3292y.i(defaultValue, "defaultValue");
        if (i8 >= 0 && i8 < this._size) {
            return this.content[i8];
        }
        return ((Number) defaultValue.invoke(Integer.valueOf(i8))).intValue();
    }

    public boolean equals(Object obj) {
        if (obj instanceof IntList) {
            IntList intList = (IntList) obj;
            int i8 = intList._size;
            int i9 = this._size;
            if (i8 == i9) {
                int[] iArr = this.content;
                int[] iArr2 = intList.content;
                i s8 = m.s(0, i9);
                int e8 = s8.e();
                int g8 = s8.g();
                if (e8 <= g8) {
                    while (iArr[e8] == iArr2[e8]) {
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

    public final int first() {
        if (!isEmpty()) {
            return this.content[0];
        }
        throw new NoSuchElementException("IntList is empty.");
    }

    public final <R> R fold(R r8, InterfaceC2072n operation) {
        AbstractC3292y.i(operation, "operation");
        int[] iArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            r8 = (R) operation.invoke(r8, Integer.valueOf(iArr[i9]));
        }
        return r8;
    }

    public final <R> R foldIndexed(R r8, InterfaceC2073o operation) {
        AbstractC3292y.i(operation, "operation");
        int[] iArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            R r9 = r8;
            r8 = (R) operation.invoke(Integer.valueOf(i9), r9, Integer.valueOf(iArr[i9]));
        }
        return r8;
    }

    public final <R> R foldRight(R r8, InterfaceC2072n operation) {
        AbstractC3292y.i(operation, "operation");
        int[] iArr = this.content;
        int i8 = this._size;
        while (true) {
            i8--;
            if (-1 >= i8) {
                return r8;
            }
            r8 = (R) operation.invoke(Integer.valueOf(iArr[i8]), r8);
        }
    }

    public final <R> R foldRightIndexed(R r8, InterfaceC2073o operation) {
        AbstractC3292y.i(operation, "operation");
        int[] iArr = this.content;
        int i8 = this._size;
        while (true) {
            i8--;
            if (-1 >= i8) {
                return r8;
            }
            r8 = (R) operation.invoke(Integer.valueOf(i8), Integer.valueOf(iArr[i8]), r8);
        }
    }

    public final void forEach(Function1 block) {
        AbstractC3292y.i(block, "block");
        int[] iArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            block.invoke(Integer.valueOf(iArr[i9]));
        }
    }

    public final void forEachIndexed(InterfaceC2072n block) {
        AbstractC3292y.i(block, "block");
        int[] iArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            block.invoke(Integer.valueOf(i9), Integer.valueOf(iArr[i9]));
        }
    }

    public final void forEachReversed(Function1 block) {
        AbstractC3292y.i(block, "block");
        int[] iArr = this.content;
        int i8 = this._size;
        while (true) {
            i8--;
            if (-1 < i8) {
                block.invoke(Integer.valueOf(iArr[i8]));
            } else {
                return;
            }
        }
    }

    public final void forEachReversedIndexed(InterfaceC2072n block) {
        AbstractC3292y.i(block, "block");
        int[] iArr = this.content;
        int i8 = this._size;
        while (true) {
            i8--;
            if (-1 < i8) {
                block.invoke(Integer.valueOf(i8), Integer.valueOf(iArr[i8]));
            } else {
                return;
            }
        }
    }

    public final int get(@IntRange(from = 0) int i8) {
        if (i8 >= 0 && i8 < this._size) {
            return this.content[i8];
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
        int[] iArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 += iArr[i10] * 31;
        }
        return i9;
    }

    public final int indexOf(int i8) {
        int[] iArr = this.content;
        int i9 = this._size;
        for (int i10 = 0; i10 < i9; i10++) {
            if (i8 == iArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public final int indexOfFirst(Function1 predicate) {
        AbstractC3292y.i(predicate, "predicate");
        int[] iArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (((Boolean) predicate.invoke(Integer.valueOf(iArr[i9]))).booleanValue()) {
                return i9;
            }
        }
        return -1;
    }

    public final int indexOfLast(Function1 predicate) {
        AbstractC3292y.i(predicate, "predicate");
        int[] iArr = this.content;
        int i8 = this._size;
        do {
            i8--;
            if (-1 >= i8) {
                return -1;
            }
        } while (!((Boolean) predicate.invoke(Integer.valueOf(iArr[i8]))).booleanValue());
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
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final int last() {
        if (!isEmpty()) {
            return this.content[this._size - 1];
        }
        throw new NoSuchElementException("IntList is empty.");
    }

    public final int lastIndexOf(int i8) {
        int[] iArr = this.content;
        int i9 = this._size;
        do {
            i9--;
            if (-1 >= i9) {
                return -1;
            }
        } while (iArr[i9] != i8);
        return i9;
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(Function1 predicate) {
        AbstractC3292y.i(predicate, "predicate");
        int[] iArr = this.content;
        for (int i8 = this._size - 1; -1 < i8; i8--) {
            if (((Boolean) predicate.invoke(Integer.valueOf(iArr[i8]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private IntList(int i8) {
        int[] iArr;
        if (i8 == 0) {
            iArr = IntSetKt.getEmptyIntArray();
        } else {
            iArr = new int[i8];
        }
        this.content = iArr;
    }

    public final boolean any(Function1 predicate) {
        AbstractC3292y.i(predicate, "predicate");
        int[] iArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (((Boolean) predicate.invoke(Integer.valueOf(iArr[i9]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(Function1 predicate) {
        AbstractC3292y.i(predicate, "predicate");
        int[] iArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            if (((Boolean) predicate.invoke(Integer.valueOf(iArr[i10]))).booleanValue()) {
                i9++;
            }
        }
        return i9;
    }

    public final String joinToString(CharSequence separator) {
        AbstractC3292y.i(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final int first(Function1 predicate) {
        AbstractC3292y.i(predicate, "predicate");
        int[] iArr = this.content;
        int i8 = this._size;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = iArr[i9];
            if (((Boolean) predicate.invoke(Integer.valueOf(i10))).booleanValue()) {
                return i10;
            }
        }
        throw new NoSuchElementException("IntList contains no element matching the predicate.");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(IntList intList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Function1 transform, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 1) != 0) {
                separator = ", ";
            }
            if ((i9 & 2) != 0) {
                prefix = "";
            }
            if ((i9 & 4) != 0) {
                postfix = "";
            }
            if ((i9 & 8) != 0) {
                i8 = -1;
            }
            if ((i9 & 16) != 0) {
                truncated = "...";
            }
            AbstractC3292y.i(separator, "separator");
            AbstractC3292y.i(prefix, "prefix");
            AbstractC3292y.i(postfix, "postfix");
            AbstractC3292y.i(truncated, "truncated");
            AbstractC3292y.i(transform, "transform");
            StringBuilder sb = new StringBuilder();
            sb.append(prefix);
            int[] iArr = intList.content;
            int i10 = intList._size;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    int i12 = iArr[i11];
                    if (i11 == i8) {
                        sb.append(truncated);
                        break;
                    }
                    if (i11 != 0) {
                        sb.append(separator);
                    }
                    sb.append((CharSequence) transform.invoke(Integer.valueOf(i12)));
                    i11++;
                } else {
                    sb.append(postfix);
                    break;
                }
            }
            String sb2 = sb.toString();
            AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i8, null, 16, null);
    }

    public final int last(Function1 predicate) {
        int i8;
        AbstractC3292y.i(predicate, "predicate");
        int[] iArr = this.content;
        int i9 = this._size;
        do {
            i9--;
            if (-1 < i9) {
                i8 = iArr[i9];
            } else {
                throw new NoSuchElementException("IntList contains no element matching the predicate.");
            }
        } while (!((Boolean) predicate.invoke(Integer.valueOf(i8))).booleanValue());
        return i8;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        AbstractC3292y.i(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i9 = this._size;
        int i10 = 0;
        while (true) {
            if (i10 < i9) {
                int i11 = iArr[i10];
                if (i10 == i8) {
                    sb.append(truncated);
                    break;
                }
                if (i10 != 0) {
                    sb.append(separator);
                }
                sb.append(i11);
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

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Function1 transform) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        AbstractC3292y.i(truncated, "truncated");
        AbstractC3292y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i9 = this._size;
        int i10 = 0;
        while (true) {
            if (i10 < i9) {
                int i11 = iArr[i10];
                if (i10 == i8) {
                    sb.append(truncated);
                    break;
                }
                if (i10 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Integer.valueOf(i11)));
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

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, Function1 transform) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        AbstractC3292y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i9 = this._size;
        int i10 = 0;
        while (true) {
            if (i10 < i9) {
                int i11 = iArr[i10];
                if (i10 == i8) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i10 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Integer.valueOf(i11)));
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

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, Function1 transform) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        AbstractC3292y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        while (true) {
            if (i9 < i8) {
                int i10 = iArr[i9];
                if (i9 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i9 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Integer.valueOf(i10)));
                i9++;
            } else {
                sb.append(postfix);
                break;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, Function1 transform) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int[] iArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        while (true) {
            if (i9 < i8) {
                int i10 = iArr[i9];
                if (i9 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i9 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Integer.valueOf(i10)));
                i9++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence separator, Function1 transform) {
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int[] iArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        while (true) {
            if (i9 < i8) {
                int i10 = iArr[i9];
                if (i9 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i9 != 0) {
                    sb.append(separator);
                }
                sb.append((CharSequence) transform.invoke(Integer.valueOf(i10)));
                i9++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(Function1 transform) {
        AbstractC3292y.i(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int[] iArr = this.content;
        int i8 = this._size;
        int i9 = 0;
        while (true) {
            if (i9 < i8) {
                int i10 = iArr[i9];
                if (i9 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i9 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) transform.invoke(Integer.valueOf(i10)));
                i9++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
