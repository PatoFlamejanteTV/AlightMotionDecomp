package androidx.compose.runtime.collection;

import R5.AbstractC1428l;
import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.internal.StabilityInferred;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class IdentityArrayIntMap {
    public static final int $stable = 8;
    private int size;
    private Object[] keys = new Object[4];
    private int[] values = new int[4];

    private final int find(Object obj) {
        int i8 = this.size - 1;
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
        Object[] objArr = this.keys;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            Object obj2 = objArr[i10];
            int identityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i9 = i10 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i8 = i10 - 1;
            } else {
                if (obj2 == obj) {
                    return i10;
                }
                return findExactIndex(i10, obj, identityHashCode);
            }
        }
        return -(i9 + 1);
    }

    private final int findExactIndex(int i8, Object obj, int i9) {
        Object obj2;
        Object[] objArr = this.keys;
        int i10 = this.size;
        for (int i11 = i8 - 1; -1 < i11; i11--) {
            Object obj3 = objArr[i11];
            if (obj3 == obj) {
                return i11;
            }
            if (ActualJvm_jvmKt.identityHashCode(obj3) != i9) {
                break;
            }
        }
        do {
            i8++;
            if (i8 < i10) {
                obj2 = objArr[i8];
                if (obj2 == obj) {
                    return i8;
                }
            } else {
                return -(i10 + 1);
            }
        } while (ActualJvm_jvmKt.identityHashCode(obj2) == i9);
        return -(i8 + 1);
    }

    public final int add(Object obj, int i8) {
        int i9;
        int i10;
        int[] iArr = this.values;
        if (this.size > 0) {
            i9 = find(obj);
            if (i9 >= 0) {
                int i11 = iArr[i9];
                iArr[i9] = i8;
                return i11;
            }
        } else {
            i9 = -1;
        }
        int i12 = -(i9 + 1);
        Object[] objArr = this.keys;
        int i13 = this.size;
        if (i13 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr2 = new int[objArr.length * 2];
            int i14 = i12 + 1;
            AbstractC1428l.i(objArr, objArr2, i14, i12, i13);
            AbstractC1428l.g(iArr, iArr2, i14, i12, i13);
            i10 = i12;
            AbstractC1428l.n(objArr, objArr2, 0, 0, i10, 6, null);
            AbstractC1428l.l(iArr, iArr2, 0, 0, i12, 6, null);
            this.keys = objArr2;
            this.values = iArr2;
        } else {
            i10 = i12;
            int i15 = i10 + 1;
            AbstractC1428l.i(objArr, objArr, i15, i10, i13);
            AbstractC1428l.g(iArr, iArr, i15, i10, i13);
        }
        this.keys[i10] = obj;
        this.values[i10] = i8;
        this.size++;
        return -1;
    }

    public final boolean any(InterfaceC2072n interfaceC2072n) {
        Object[] keys = getKeys();
        int[] values = getValues();
        int size = getSize();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = keys[i8];
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.Any");
            if (((Boolean) interfaceC2072n.invoke(obj, Integer.valueOf(values[i8]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void forEach(InterfaceC2072n interfaceC2072n) {
        Object[] keys = getKeys();
        int[] values = getValues();
        int size = getSize();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = keys[i8];
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.Any");
            interfaceC2072n.invoke(obj, Integer.valueOf(values[i8]));
        }
    }

    public final int get(Object obj) {
        int find = find(obj);
        if (find >= 0) {
            return this.values[find];
        }
        throw new IllegalStateException("Key not found".toString());
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    public final int getSize() {
        return this.size;
    }

    public final int[] getValues() {
        return this.values;
    }

    public final boolean remove(Object obj) {
        int find = find(obj);
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        int i8 = this.size;
        if (find >= 0) {
            int i9 = i8 - 1;
            if (find < i9) {
                int i10 = find + 1;
                AbstractC1428l.i(objArr, objArr, find, i10, i8);
                AbstractC1428l.g(iArr, iArr, find, i10, i8);
            }
            objArr[i9] = null;
            this.size = i9;
            return true;
        }
        return false;
    }

    public final void removeValueIf(InterfaceC2072n interfaceC2072n) {
        Object[] keys = getKeys();
        int[] values = getValues();
        int size = getSize();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = keys[i9];
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.Any");
            int i10 = values[i9];
            if (!((Boolean) interfaceC2072n.invoke(obj, Integer.valueOf(i10))).booleanValue()) {
                if (i8 != i9) {
                    keys[i8] = obj;
                    values[i8] = i10;
                }
                i8++;
            }
        }
        for (int i11 = i8; i11 < size; i11++) {
            keys[i11] = null;
        }
        this.size = i8;
    }
}
