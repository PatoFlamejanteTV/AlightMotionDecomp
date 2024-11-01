package androidx.compose.runtime.internal;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ThreadMap {
    public static final int $stable = 8;
    private final long[] keys;
    private final int size;
    private final Object[] values;

    public ThreadMap(int i8, long[] jArr, Object[] objArr) {
        this.size = i8;
        this.keys = jArr;
        this.values = objArr;
    }

    private final int find(long j8) {
        int i8 = this.size - 1;
        if (i8 == -1) {
            return -1;
        }
        int i9 = 0;
        if (i8 != 0) {
            while (i9 <= i8) {
                int i10 = (i9 + i8) >>> 1;
                long j9 = this.keys[i10] - j8;
                if (j9 < 0) {
                    i9 = i10 + 1;
                } else if (j9 > 0) {
                    i8 = i10 - 1;
                } else {
                    return i10;
                }
            }
            return -(i9 + 1);
        }
        long j10 = this.keys[0];
        if (j10 == j8) {
            return 0;
        }
        if (j10 <= j8) {
            return -1;
        }
        return -2;
    }

    public final Object get(long j8) {
        int find = find(j8);
        if (find >= 0) {
            return this.values[find];
        }
        return null;
    }

    public final ThreadMap newWith(long j8, Object obj) {
        int i8 = this.size;
        int i9 = 0;
        int i10 = 0;
        for (Object obj2 : this.values) {
            if (obj2 != null) {
                i10++;
            }
        }
        int i11 = i10 + 1;
        long[] jArr = new long[i11];
        Object[] objArr = new Object[i11];
        if (i11 > 1) {
            int i12 = 0;
            while (true) {
                if (i9 >= i11 || i12 >= i8) {
                    break;
                }
                long j9 = this.keys[i12];
                Object obj3 = this.values[i12];
                if (j9 > j8) {
                    jArr[i9] = j8;
                    objArr[i9] = obj;
                    i9++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i9] = j9;
                    objArr[i9] = obj3;
                    i9++;
                }
                i12++;
            }
            if (i12 == i8) {
                jArr[i10] = j8;
                objArr[i10] = obj;
            } else {
                while (i9 < i11) {
                    long j10 = this.keys[i12];
                    Object obj4 = this.values[i12];
                    if (obj4 != null) {
                        jArr[i9] = j10;
                        objArr[i9] = obj4;
                        i9++;
                    }
                    i12++;
                }
            }
        } else {
            jArr[0] = j8;
            objArr[0] = obj;
        }
        return new ThreadMap(i11, jArr, objArr);
    }

    public final boolean trySet(long j8, Object obj) {
        int find = find(j8);
        if (find < 0) {
            return false;
        }
        this.values[find] = obj;
        return true;
    }
}
