package androidx.compose.runtime.collection;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ScopeMap<T> {
    public static final int $stable = 8;
    private final MutableScatterMap<Object, Object> map = ScatterMapKt.mutableScatterMapOf();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.collection.MutableScatterSet] */
    public final void add(Object obj, T t8) {
        boolean z8;
        T t9;
        MutableScatterMap<Object, Object> mutableScatterMap = this.map;
        int findInsertIndex = mutableScatterMap.findInsertIndex(obj);
        if (findInsertIndex < 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            t9 = null;
        } else {
            t9 = mutableScatterMap.values[findInsertIndex];
        }
        if (t9 != null) {
            if (t9 instanceof MutableScatterSet) {
                AbstractC3292y.g(t9, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.add$lambda$0>");
                ((MutableScatterSet) t9).add(t8);
            } else if (t9 != t8) {
                ?? mutableScatterSet = new MutableScatterSet(0, 1, null);
                AbstractC3292y.g(t9, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.add$lambda$0");
                mutableScatterSet.add(t9);
                mutableScatterSet.add(t8);
                t8 = mutableScatterSet;
            }
            t8 = t9;
        }
        if (z8) {
            int i8 = ~findInsertIndex;
            mutableScatterMap.keys[i8] = obj;
            mutableScatterMap.values[i8] = t8;
            return;
        }
        mutableScatterMap.values[findInsertIndex] = t8;
    }

    public final void clear() {
        this.map.clear();
    }

    public final boolean contains(Object obj) {
        return this.map.containsKey(obj);
    }

    public final void forEachScopeOf(Object obj, Function1 function1) {
        Object obj2 = getMap().get(obj);
        if (obj2 != null) {
            if (obj2 instanceof MutableScatterSet) {
                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j8 = jArr[i8];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((255 & j8) < 128) {
                                    function1.invoke(objArr[(i8 << 3) + i10]);
                                }
                                j8 >>= 8;
                            }
                            if (i9 != 8) {
                                return;
                            }
                        }
                        if (i8 != length) {
                            i8++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                function1.invoke(obj2);
            }
        }
    }

    public final MutableScatterMap<Object, Object> getMap() {
        return this.map;
    }

    public final int getSize() {
        return this.map.getSize();
    }

    public final boolean remove(Object obj, T t8) {
        Object obj2 = this.map.get(obj);
        if (obj2 == null) {
            return false;
        }
        if (obj2 instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
            boolean remove = mutableScatterSet.remove(t8);
            if (remove && mutableScatterSet.isEmpty()) {
                this.map.remove(obj);
            }
            return remove;
        }
        if (!AbstractC3292y.d(obj2, t8)) {
            return false;
        }
        this.map.remove(obj);
        return true;
    }

    public final void removeScope(T t8) {
        long[] jArr;
        int i8;
        long[] jArr2;
        int i9;
        int i10;
        int i11;
        long j8;
        boolean z8;
        int i12;
        MutableScatterMap<Object, Object> map = getMap();
        long[] jArr3 = map.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr3[i13];
                char c8 = 7;
                long j10 = -9187201950435737472L;
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j9 & 255) < 128) {
                            int i16 = (i13 << 3) + i15;
                            Object obj = map.keys[i16];
                            Object obj2 = map.values[i16];
                            if (obj2 instanceof MutableScatterSet) {
                                AbstractC3292y.g(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                Object[] objArr = mutableScatterSet.elements;
                                long[] jArr4 = mutableScatterSet.metadata;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                i9 = length;
                                if (length2 >= 0) {
                                    int i17 = 0;
                                    while (true) {
                                        long j11 = jArr4[i17];
                                        i11 = i14;
                                        long[] jArr5 = jArr4;
                                        j8 = -9187201950435737472L;
                                        if ((((~j11) << c8) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                            int i19 = 0;
                                            while (i19 < i18) {
                                                if ((j11 & 255) < 128) {
                                                    int i20 = (i17 << 3) + i19;
                                                    i12 = i13;
                                                    if (objArr[i20] == t8) {
                                                        mutableScatterSet.removeElementAt(i20);
                                                    }
                                                } else {
                                                    i12 = i13;
                                                }
                                                j11 >>= 8;
                                                i19++;
                                                i13 = i12;
                                            }
                                            i10 = i13;
                                            if (i18 != 8) {
                                                break;
                                            }
                                        } else {
                                            i10 = i13;
                                        }
                                        if (i17 == length2) {
                                            break;
                                        }
                                        i17++;
                                        i14 = i11;
                                        jArr4 = jArr5;
                                        i13 = i10;
                                        c8 = 7;
                                    }
                                } else {
                                    i10 = i13;
                                    i11 = i14;
                                    j8 = -9187201950435737472L;
                                }
                                z8 = mutableScatterSet.isEmpty();
                            } else {
                                jArr2 = jArr3;
                                i9 = length;
                                i10 = i13;
                                i11 = i14;
                                j8 = j10;
                                AbstractC3292y.g(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                if (obj2 == t8) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                            }
                            if (z8) {
                                map.removeValueAt(i16);
                            }
                        } else {
                            jArr2 = jArr3;
                            i9 = length;
                            i10 = i13;
                            i11 = i14;
                            j8 = j10;
                        }
                        j9 >>= 8;
                        i15++;
                        j10 = j8;
                        jArr3 = jArr2;
                        length = i9;
                        i14 = i11;
                        i13 = i10;
                        c8 = 7;
                    }
                    jArr = jArr3;
                    int i21 = length;
                    int i22 = i13;
                    if (i14 == 8) {
                        length = i21;
                        i8 = i22;
                    } else {
                        return;
                    }
                } else {
                    jArr = jArr3;
                    i8 = i13;
                }
                if (i8 != length) {
                    i13 = i8 + 1;
                    jArr3 = jArr;
                } else {
                    return;
                }
            }
        }
    }

    public final void removeScopeIf(Function1 function1) {
        long[] jArr;
        int i8;
        long[] jArr2;
        int i9;
        int i10;
        int i11;
        long j8;
        boolean booleanValue;
        int i12;
        MutableScatterMap<Object, Object> map = getMap();
        long[] jArr3 = map.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr3[i13];
                char c8 = 7;
                long j10 = -9187201950435737472L;
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j9 & 255) < 128) {
                            int i16 = (i13 << 3) + i15;
                            Object obj = map.keys[i16];
                            Object obj2 = map.values[i16];
                            if (obj2 instanceof MutableScatterSet) {
                                AbstractC3292y.g(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                Object[] objArr = mutableScatterSet.elements;
                                long[] jArr4 = mutableScatterSet.metadata;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                i9 = length;
                                if (length2 >= 0) {
                                    int i17 = 0;
                                    while (true) {
                                        long j11 = jArr4[i17];
                                        i11 = i14;
                                        long[] jArr5 = jArr4;
                                        j8 = -9187201950435737472L;
                                        if ((((~j11) << c8) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                            int i19 = 0;
                                            while (i19 < i18) {
                                                if ((j11 & 255) < 128) {
                                                    int i20 = (i17 << 3) + i19;
                                                    i12 = i13;
                                                    if (((Boolean) function1.invoke(objArr[i20])).booleanValue()) {
                                                        mutableScatterSet.removeElementAt(i20);
                                                    }
                                                } else {
                                                    i12 = i13;
                                                }
                                                j11 >>= 8;
                                                i19++;
                                                i13 = i12;
                                            }
                                            i10 = i13;
                                            if (i18 != 8) {
                                                break;
                                            }
                                        } else {
                                            i10 = i13;
                                        }
                                        if (i17 == length2) {
                                            break;
                                        }
                                        i17++;
                                        i14 = i11;
                                        jArr4 = jArr5;
                                        i13 = i10;
                                        c8 = 7;
                                    }
                                } else {
                                    i10 = i13;
                                    i11 = i14;
                                    j8 = -9187201950435737472L;
                                }
                                booleanValue = mutableScatterSet.isEmpty();
                            } else {
                                jArr2 = jArr3;
                                i9 = length;
                                i10 = i13;
                                i11 = i14;
                                j8 = j10;
                                AbstractC3292y.g(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                booleanValue = ((Boolean) function1.invoke(obj2)).booleanValue();
                            }
                            if (booleanValue) {
                                map.removeValueAt(i16);
                            }
                        } else {
                            jArr2 = jArr3;
                            i9 = length;
                            i10 = i13;
                            i11 = i14;
                            j8 = j10;
                        }
                        j9 >>= 8;
                        i15++;
                        j10 = j8;
                        jArr3 = jArr2;
                        length = i9;
                        i14 = i11;
                        i13 = i10;
                        c8 = 7;
                    }
                    jArr = jArr3;
                    int i21 = length;
                    int i22 = i13;
                    if (i14 == 8) {
                        length = i21;
                        i8 = i22;
                    } else {
                        return;
                    }
                } else {
                    jArr = jArr3;
                    i8 = i13;
                }
                if (i8 != length) {
                    i13 = i8 + 1;
                    jArr3 = jArr;
                } else {
                    return;
                }
            }
        }
    }
}
