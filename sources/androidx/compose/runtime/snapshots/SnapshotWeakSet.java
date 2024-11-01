package androidx.compose.runtime.snapshots;

import R5.AbstractC1428l;
import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.WeakReference;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SnapshotWeakSet<T> {
    public static final int $stable = 8;
    private int size;
    private int[] hashes = new int[16];
    private WeakReference<T>[] values = new WeakReference[16];

    private final int find(T t8, int i8) {
        T t9;
        int i9 = this.size - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            int i12 = this.hashes[i11];
            if (i12 < i8) {
                i10 = i11 + 1;
            } else if (i12 > i8) {
                i9 = i11 - 1;
            } else {
                WeakReference<T> weakReference = this.values[i11];
                if (weakReference != null) {
                    t9 = weakReference.get();
                } else {
                    t9 = null;
                }
                if (t8 == t9) {
                    return i11;
                }
                return findExactIndex(i11, t8, i8);
            }
        }
        return -(i10 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x002c, code lost:            return -(r4 + 1);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int findExactIndex(int r4, T r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = 0
            r2 = -1
            if (r2 >= r0) goto L1d
            int[] r2 = r3.hashes
            r2 = r2[r0]
            if (r2 == r6) goto Ld
            goto L1d
        Ld:
            androidx.compose.runtime.WeakReference<T>[] r2 = r3.values
            r2 = r2[r0]
            if (r2 == 0) goto L17
            java.lang.Object r1 = r2.get()
        L17:
            if (r1 != r5) goto L1a
            return r0
        L1a:
            int r0 = r0 + (-1)
            goto L2
        L1d:
            int r4 = r4 + 1
            int r0 = r3.size
        L21:
            if (r4 >= r0) goto L3f
            int[] r2 = r3.hashes
            r2 = r2[r4]
            if (r2 == r6) goto L2d
        L29:
            int r4 = r4 + 1
            int r4 = -r4
            return r4
        L2d:
            androidx.compose.runtime.WeakReference<T>[] r2 = r3.values
            r2 = r2[r4]
            if (r2 == 0) goto L38
            java.lang.Object r2 = r2.get()
            goto L39
        L38:
            r2 = r1
        L39:
            if (r2 != r5) goto L3c
            return r4
        L3c:
            int r4 = r4 + 1
            goto L21
        L3f:
            int r4 = r3.size
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotWeakSet.findExactIndex(int, java.lang.Object, int):int");
    }

    public final boolean add(T t8) {
        int i8;
        int i9 = this.size;
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(t8);
        if (i9 > 0) {
            i8 = find(t8, identityHashCode);
            if (i8 >= 0) {
                return false;
            }
        } else {
            i8 = -1;
        }
        int i10 = -(i8 + 1);
        WeakReference<T>[] weakReferenceArr = this.values;
        int length = weakReferenceArr.length;
        if (i9 == length) {
            int i11 = length * 2;
            WeakReference<T>[] weakReferenceArr2 = new WeakReference[i11];
            int[] iArr = new int[i11];
            int i12 = i10 + 1;
            AbstractC1428l.i(weakReferenceArr, weakReferenceArr2, i12, i10, i9);
            AbstractC1428l.n(this.values, weakReferenceArr2, 0, 0, i10, 6, null);
            AbstractC1428l.g(this.hashes, iArr, i12, i10, i9);
            AbstractC1428l.l(this.hashes, iArr, 0, 0, i10, 6, null);
            this.values = weakReferenceArr2;
            this.hashes = iArr;
        } else {
            int i13 = i10 + 1;
            AbstractC1428l.i(weakReferenceArr, weakReferenceArr, i13, i10, i9);
            int[] iArr2 = this.hashes;
            AbstractC1428l.g(iArr2, iArr2, i13, i10, i9);
        }
        this.values[i10] = new WeakReference<>(t8);
        this.hashes[i10] = identityHashCode;
        this.size++;
        return true;
    }

    public final int[] getHashes$runtime_release() {
        return this.hashes;
    }

    public final int getSize$runtime_release() {
        return this.size;
    }

    public final WeakReference<T>[] getValues$runtime_release() {
        return this.values;
    }

    public final boolean isValid$runtime_release() {
        WeakReference<T> weakReference;
        int i8 = this.size;
        WeakReference<T>[] weakReferenceArr = this.values;
        int[] iArr = this.hashes;
        int length = weakReferenceArr.length;
        if (i8 > length) {
            return false;
        }
        int i9 = Integer.MIN_VALUE;
        int i10 = 0;
        while (i10 < i8) {
            int i11 = iArr[i10];
            if (i11 < i9 || (weakReference = weakReferenceArr[i10]) == null) {
                return false;
            }
            T t8 = weakReference.get();
            if (t8 != null && i11 != ActualJvm_jvmKt.identityHashCode(t8)) {
                return false;
            }
            i10++;
            i9 = i11;
        }
        while (i8 < length) {
            if (iArr[i8] != 0 || weakReferenceArr[i8] != null) {
                return false;
            }
            i8++;
        }
        return true;
    }

    public final void removeIf(Function1 function1) {
        int size$runtime_release = getSize$runtime_release();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            T t8 = null;
            if (i8 >= size$runtime_release) {
                break;
            }
            WeakReference<T> weakReference = getValues$runtime_release()[i8];
            if (weakReference != null) {
                t8 = weakReference.get();
            }
            if (t8 != null && !((Boolean) function1.invoke(t8)).booleanValue()) {
                if (i9 != i8) {
                    getValues$runtime_release()[i9] = weakReference;
                    getHashes$runtime_release()[i9] = getHashes$runtime_release()[i8];
                }
                i9++;
            }
            i8++;
        }
        for (int i10 = i9; i10 < size$runtime_release; i10++) {
            getValues$runtime_release()[i10] = null;
            getHashes$runtime_release()[i10] = 0;
        }
        if (i9 != size$runtime_release) {
            setSize$runtime_release(i9);
        }
    }

    public final void setHashes$runtime_release(int[] iArr) {
        this.hashes = iArr;
    }

    public final void setSize$runtime_release(int i8) {
        this.size = i8;
    }

    public final void setValues$runtime_release(WeakReference<T>[] weakReferenceArr) {
        this.values = weakReferenceArr;
    }
}
