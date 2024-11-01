package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DeltaCounter {
    public static final int $stable = 8;
    private int count;

    public DeltaCounter() {
        this(0, 1, null);
    }

    public static /* synthetic */ DeltaCounter copy$default(DeltaCounter deltaCounter, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = deltaCounter.count;
        }
        return deltaCounter.copy(i8);
    }

    public final int component1() {
        return this.count;
    }

    public final DeltaCounter copy(int i8) {
        return new DeltaCounter(i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeltaCounter) && this.count == ((DeltaCounter) obj).count;
    }

    public final int getCount() {
        return this.count;
    }

    public int hashCode() {
        return this.count;
    }

    public final void plusAssign(int i8) {
        this.count += i8;
    }

    public final void setCount(int i8) {
        this.count = i8;
    }

    public String toString() {
        return "DeltaCounter(count=" + this.count + ')';
    }

    public DeltaCounter(int i8) {
        this.count = i8;
    }

    public /* synthetic */ DeltaCounter(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 0 : i8);
    }
}
