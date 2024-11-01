package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyGridSlots {
    private final int[] positions;
    private final int[] sizes;

    public LazyGridSlots(int[] sizes, int[] positions) {
        AbstractC3292y.i(sizes, "sizes");
        AbstractC3292y.i(positions, "positions");
        this.sizes = sizes;
        this.positions = positions;
    }

    public final int[] getPositions() {
        return this.positions;
    }

    public final int[] getSizes() {
        return this.sizes;
    }
}
