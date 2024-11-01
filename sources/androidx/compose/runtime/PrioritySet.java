package androidx.compose.runtime;

import Q5.C1413h;
import R5.AbstractC1435t;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PrioritySet {
    public static final int $stable = 8;
    private final List<Integer> list;

    public PrioritySet() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void add(int i8) {
        if (!this.list.isEmpty()) {
            if (this.list.get(0).intValue() != i8) {
                if (this.list.get(r0.size() - 1).intValue() == i8) {
                    return;
                }
            } else {
                return;
            }
        }
        int size = this.list.size();
        this.list.add(Integer.valueOf(i8));
        while (size > 0) {
            int i9 = ((size + 1) >>> 1) - 1;
            int intValue = this.list.get(i9).intValue();
            if (i8 <= intValue) {
                break;
            }
            this.list.set(size, Integer.valueOf(intValue));
            size = i9;
        }
        this.list.set(size, Integer.valueOf(i8));
    }

    public final boolean isEmpty() {
        return this.list.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this.list.isEmpty();
    }

    public final int peek() {
        return ((Number) AbstractC1435t.m0(this.list)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int takeMax() {
        boolean z8;
        int intValue;
        if (this.list.size() > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            int intValue2 = this.list.get(0).intValue();
            while ((!this.list.isEmpty()) && this.list.get(0).intValue() == intValue2) {
                List<Integer> list = this.list;
                list.set(0, AbstractC1435t.y0(list));
                List<Integer> list2 = this.list;
                list2.remove(list2.size() - 1);
                int size = this.list.size();
                int size2 = this.list.size() >>> 1;
                int i8 = 0;
                while (i8 < size2) {
                    int intValue3 = this.list.get(i8).intValue();
                    int i9 = (i8 + 1) * 2;
                    int i10 = i9 - 1;
                    int intValue4 = this.list.get(i10).intValue();
                    if (i9 < size && (intValue = this.list.get(i9).intValue()) > intValue4) {
                        if (intValue > intValue3) {
                            this.list.set(i8, Integer.valueOf(intValue));
                            this.list.set(i9, Integer.valueOf(intValue3));
                            i8 = i9;
                        }
                    } else if (intValue4 > intValue3) {
                        this.list.set(i8, Integer.valueOf(intValue4));
                        this.list.set(i10, Integer.valueOf(intValue3));
                        i8 = i10;
                    }
                }
            }
            return intValue2;
        }
        ComposerKt.composeRuntimeError("Set is empty".toString());
        throw new C1413h();
    }

    public final void validateHeap() {
        int size = this.list.size();
        int i8 = size / 2;
        int i9 = 0;
        while (i9 < i8) {
            int i10 = i9 + 1;
            int i11 = i10 * 2;
            if (this.list.get(i9).intValue() >= this.list.get(i11 - 1).intValue()) {
                if (i11 < size && this.list.get(i9).intValue() < this.list.get(i11).intValue()) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                i9 = i10;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    public PrioritySet(List<Integer> list) {
        this.list = list;
    }

    public /* synthetic */ PrioritySet(List list, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? new ArrayList() : list);
    }
}
