package androidx.compose.runtime.collection;

import R5.AbstractC1428l;
import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.internal.StabilityInferred;
import c6.InterfaceC2072n;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class IdentityArrayMap<Key, Value> {
    public static final int $stable = 8;
    private Object[] keys;
    private int size;
    private Object[] values;

    public IdentityArrayMap() {
        this(0, 1, null);
    }

    private final int find(Object obj) {
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
        int i8 = this.size - 1;
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
                if (obj == obj2) {
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

    public final Map<Key, Value> asMap() {
        return new IdentityArrayMap$asMap$1(this);
    }

    public final void clear() {
        this.size = 0;
        AbstractC1428l.x(this.keys, null, 0, 0, 6, null);
        AbstractC1428l.x(this.values, null, 0, 0, 6, null);
    }

    public final boolean contains(Key key) {
        if (find(key) >= 0) {
            return true;
        }
        return false;
    }

    public final void forEach(InterfaceC2072n interfaceC2072n) {
        int size = getSize();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = getKeys()[i8];
            AbstractC3292y.g(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            interfaceC2072n.invoke(obj, getValues()[i8]);
        }
    }

    public final Value get(Key key) {
        int find = find(key);
        if (find >= 0) {
            return (Value) this.values[find];
        }
        return null;
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    public final int getSize() {
        return this.size;
    }

    public final Object[] getValues() {
        return this.values;
    }

    public final boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    public final boolean isNotEmpty() {
        if (this.size > 0) {
            return true;
        }
        return false;
    }

    public final Value remove(Key key) {
        int find = find(key);
        if (find < 0) {
            return null;
        }
        Object[] objArr = this.values;
        Value value = (Value) objArr[find];
        int i8 = this.size;
        Object[] objArr2 = this.keys;
        int i9 = find + 1;
        AbstractC1428l.i(objArr2, objArr2, find, i9, i8);
        AbstractC1428l.i(objArr, objArr, find, i9, i8);
        int i10 = i8 - 1;
        objArr2[i10] = null;
        objArr[i10] = null;
        this.size = i10;
        return value;
    }

    public final void removeIf(InterfaceC2072n interfaceC2072n) {
        int size = getSize();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = getKeys()[i9];
            AbstractC3292y.g(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            if (!((Boolean) interfaceC2072n.invoke(obj, getValues()[i9])).booleanValue()) {
                if (i8 != i9) {
                    getKeys()[i8] = obj;
                    getValues()[i8] = getValues()[i9];
                }
                i8++;
            }
        }
        if (getSize() > i8) {
            int size2 = getSize();
            for (int i10 = i8; i10 < size2; i10++) {
                getKeys()[i10] = null;
                getValues()[i10] = null;
            }
            this.size = i8;
        }
    }

    public final void removeValueIf(Function1 function1) {
        int size = getSize();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = getKeys()[i9];
            AbstractC3292y.g(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            if (!((Boolean) function1.invoke(getValues()[i9])).booleanValue()) {
                if (i8 != i9) {
                    getKeys()[i8] = obj;
                    getValues()[i8] = getValues()[i9];
                }
                i8++;
            }
        }
        if (getSize() > i8) {
            int size2 = getSize();
            for (int i10 = i8; i10 < size2; i10++) {
                getKeys()[i10] = null;
                getValues()[i10] = null;
            }
            this.size = i8;
        }
    }

    public final void set(Key key, Value value) {
        boolean z8;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3 = this.keys;
        Object[] objArr4 = this.values;
        int i8 = this.size;
        int find = find(key);
        if (find >= 0) {
            objArr4[find] = value;
            return;
        }
        int i9 = -(find + 1);
        if (i8 == objArr3.length) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            objArr = new Object[i8 * 2];
        } else {
            objArr = objArr3;
        }
        int i10 = i9 + 1;
        AbstractC1428l.i(objArr3, objArr, i10, i9, i8);
        if (z8) {
            AbstractC1428l.n(objArr3, objArr, 0, 0, i9, 6, null);
        }
        objArr[i9] = key;
        this.keys = objArr;
        if (z8) {
            objArr2 = new Object[i8 * 2];
        } else {
            objArr2 = objArr4;
        }
        AbstractC1428l.i(objArr4, objArr2, i10, i9, i8);
        if (z8) {
            AbstractC1428l.n(objArr4, objArr2, 0, 0, i9, 6, null);
        }
        objArr2[i9] = value;
        this.values = objArr2;
        this.size++;
    }

    public IdentityArrayMap(int i8) {
        this.keys = new Object[i8];
        this.values = new Object[i8];
    }

    public /* synthetic */ IdentityArrayMap(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 16 : i8);
    }
}
