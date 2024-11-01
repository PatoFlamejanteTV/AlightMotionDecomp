package androidx.compose.runtime.snapshots;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import androidx.compose.runtime.Immutable;
import d6.InterfaceC2767a;
import java.util.ArrayList;
import java.util.Iterator;
import k6.AbstractC3258j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class SnapshotIdSet implements Iterable<Integer>, InterfaceC2767a {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);
    private final int[] belowBound;
    private final int lowerBound;
    private final long lowerSet;
    private final long upperSet;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private SnapshotIdSet(long j8, long j9, int i8, int[] iArr) {
        this.upperSet = j8;
        this.lowerSet = j9;
        this.lowerBound = i8;
        this.belowBound = iArr;
    }

    public final SnapshotIdSet and(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (AbstractC3292y.d(snapshotIdSet, snapshotIdSet2)) {
            return snapshotIdSet2;
        }
        if (AbstractC3292y.d(this, snapshotIdSet2)) {
            return snapshotIdSet2;
        }
        int i8 = snapshotIdSet.lowerBound;
        int i9 = this.lowerBound;
        if (i8 == i9) {
            int[] iArr = snapshotIdSet.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                long j8 = this.upperSet;
                long j9 = snapshotIdSet.upperSet;
                long j10 = j8 & j9;
                long j11 = this.lowerSet;
                long j12 = snapshotIdSet.lowerSet;
                long j13 = j11 & j12;
                if (j10 != 0 || j13 != 0 || iArr2 != null) {
                    return new SnapshotIdSet(j9 & j8, j11 & j12, i9, iArr2);
                }
                return snapshotIdSet2;
            }
        }
        if (this.belowBound == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (snapshotIdSet.get(intValue)) {
                    snapshotIdSet2 = snapshotIdSet2.set(intValue);
                }
            }
            return snapshotIdSet2;
        }
        Iterator<Integer> it2 = snapshotIdSet.iterator();
        while (it2.hasNext()) {
            int intValue2 = it2.next().intValue();
            if (get(intValue2)) {
                snapshotIdSet2 = snapshotIdSet2.set(intValue2);
            }
        }
        return snapshotIdSet2;
    }

    public final SnapshotIdSet andNot(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        int i8 = snapshotIdSet.lowerBound;
        int i9 = this.lowerBound;
        if (i8 == i9) {
            int[] iArr = snapshotIdSet.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.upperSet & (~snapshotIdSet.upperSet), this.lowerSet & (~snapshotIdSet.lowerSet), i9, iArr2);
            }
        }
        Iterator<Integer> it = snapshotIdSet.iterator();
        SnapshotIdSet snapshotIdSet3 = this;
        while (it.hasNext()) {
            snapshotIdSet3 = snapshotIdSet3.clear(it.next().intValue());
        }
        return snapshotIdSet3;
    }

    public final SnapshotIdSet clear(int i8) {
        int[] iArr;
        int binarySearch;
        int i9 = this.lowerBound;
        int i10 = i8 - i9;
        if (i10 >= 0 && i10 < 64) {
            long j8 = 1 << i10;
            long j9 = this.lowerSet;
            if ((j9 & j8) != 0) {
                return new SnapshotIdSet(this.upperSet, j9 & (~j8), i9, this.belowBound);
            }
        } else if (i10 >= 64 && i10 < 128) {
            long j10 = 1 << (i10 - 64);
            long j11 = this.upperSet;
            if ((j11 & j10) != 0) {
                return new SnapshotIdSet(j11 & (~j10), this.lowerSet, i9, this.belowBound);
            }
        } else if (i10 < 0 && (iArr = this.belowBound) != null && (binarySearch = SnapshotIdSetKt.binarySearch(iArr, i8)) >= 0) {
            int length = iArr.length;
            int i11 = length - 1;
            if (i11 == 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, null);
            }
            int[] iArr2 = new int[i11];
            if (binarySearch > 0) {
                AbstractC1428l.g(iArr, iArr2, 0, 0, binarySearch);
            }
            if (binarySearch < i11) {
                AbstractC1428l.g(iArr, iArr2, binarySearch, binarySearch + 1, length);
            }
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, iArr2);
        }
        return this;
    }

    public final void fastForEach(Function1 function1) {
        int[] iArr = this.belowBound;
        if (iArr != null) {
            for (int i8 : iArr) {
                function1.invoke(Integer.valueOf(i8));
            }
        }
        if (this.lowerSet != 0) {
            for (int i9 = 0; i9 < 64; i9++) {
                if ((this.lowerSet & (1 << i9)) != 0) {
                    function1.invoke(Integer.valueOf(this.lowerBound + i9));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if ((this.upperSet & (1 << i10)) != 0) {
                    function1.invoke(Integer.valueOf(i10 + 64 + this.lowerBound));
                }
            }
        }
    }

    public final boolean get(int i8) {
        int[] iArr;
        int i9 = i8 - this.lowerBound;
        boolean z8 = true;
        if (i9 >= 0 && i9 < 64) {
            if (((1 << i9) & this.lowerSet) != 0) {
                return true;
            }
            return false;
        }
        if (i9 >= 64 && i9 < 128) {
            if (((1 << (i9 - 64)) & this.upperSet) != 0) {
                return true;
            }
            return false;
        }
        if (i9 > 0 || (iArr = this.belowBound) == null) {
            return false;
        }
        if (SnapshotIdSetKt.binarySearch(iArr, i8) < 0) {
            z8 = false;
        }
        return z8;
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return AbstractC3258j.b(new SnapshotIdSet$iterator$1(this, null)).iterator();
    }

    public final int lowest(int i8) {
        int lowestBitOf;
        int lowestBitOf2;
        int[] iArr = this.belowBound;
        if (iArr != null) {
            return iArr[0];
        }
        long j8 = this.lowerSet;
        if (j8 != 0) {
            int i9 = this.lowerBound;
            lowestBitOf2 = SnapshotIdSetKt.lowestBitOf(j8);
            return i9 + lowestBitOf2;
        }
        long j9 = this.upperSet;
        if (j9 != 0) {
            int i10 = this.lowerBound + 64;
            lowestBitOf = SnapshotIdSetKt.lowestBitOf(j9);
            return i10 + lowestBitOf;
        }
        return i8;
    }

    public final SnapshotIdSet or(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet;
        }
        int i8 = snapshotIdSet.lowerBound;
        int i9 = this.lowerBound;
        if (i8 == i9) {
            int[] iArr = snapshotIdSet.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.upperSet | snapshotIdSet.upperSet, this.lowerSet | snapshotIdSet.lowerSet, i9, iArr2);
            }
        }
        if (this.belowBound == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                snapshotIdSet = snapshotIdSet.set(it.next().intValue());
            }
            return snapshotIdSet;
        }
        Iterator<Integer> it2 = snapshotIdSet.iterator();
        SnapshotIdSet snapshotIdSet3 = this;
        while (it2.hasNext()) {
            snapshotIdSet3 = snapshotIdSet3.set(it2.next().intValue());
        }
        return snapshotIdSet3;
    }

    public final SnapshotIdSet set(int i8) {
        int i9;
        int[] iArr;
        int i10 = this.lowerBound;
        int i11 = i8 - i10;
        long j8 = 0;
        if (i11 >= 0 && i11 < 64) {
            long j9 = 1 << i11;
            long j10 = this.lowerSet;
            if ((j10 & j9) == 0) {
                return new SnapshotIdSet(this.upperSet, j10 | j9, i10, this.belowBound);
            }
        } else if (i11 >= 64 && i11 < 128) {
            long j11 = 1 << (i11 - 64);
            long j12 = this.upperSet;
            if ((j12 & j11) == 0) {
                return new SnapshotIdSet(j12 | j11, this.lowerSet, i10, this.belowBound);
            }
        } else if (i11 >= 128) {
            if (!get(i8)) {
                long j13 = this.upperSet;
                long j14 = this.lowerSet;
                int i12 = this.lowerBound;
                int i13 = ((i8 + 1) / 64) * 64;
                ArrayList arrayList = null;
                long j15 = j14;
                long j16 = j13;
                while (true) {
                    if (i12 < i13) {
                        if (j15 != j8) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                int[] iArr2 = this.belowBound;
                                if (iArr2 != null) {
                                    for (int i14 : iArr2) {
                                        arrayList.add(Integer.valueOf(i14));
                                    }
                                }
                            }
                            for (int i15 = 0; i15 < 64; i15++) {
                                if (((1 << i15) & j15) != 0) {
                                    arrayList.add(Integer.valueOf(i15 + i12));
                                }
                            }
                            j8 = 0;
                        }
                        if (j16 == j8) {
                            i9 = i13;
                            j15 = j8;
                            break;
                        }
                        i12 += 64;
                        j15 = j16;
                        j16 = j8;
                    } else {
                        i9 = i12;
                        break;
                    }
                }
                if (arrayList == null || (iArr = AbstractC1435t.V0(arrayList)) == null) {
                    iArr = this.belowBound;
                }
                return new SnapshotIdSet(j16, j15, i9, iArr).set(i8);
            }
        } else {
            int[] iArr3 = this.belowBound;
            if (iArr3 == null) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, i10, new int[]{i8});
            }
            int binarySearch = SnapshotIdSetKt.binarySearch(iArr3, i8);
            if (binarySearch < 0) {
                int i16 = -(binarySearch + 1);
                int length = iArr3.length;
                int[] iArr4 = new int[length + 1];
                AbstractC1428l.g(iArr3, iArr4, 0, 0, i16);
                AbstractC1428l.g(iArr3, iArr4, i16 + 1, i16, length);
                iArr4[i16] = i8;
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, iArr4);
            }
        }
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        sb.append(ListUtilsKt.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(']');
        return sb.toString();
    }
}
