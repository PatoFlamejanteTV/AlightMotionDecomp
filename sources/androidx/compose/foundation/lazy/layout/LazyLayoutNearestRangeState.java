package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import i6.i;
import i6.m;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class LazyLayoutNearestRangeState implements State<i> {
    private static final Companion Companion = new Companion(null);
    private final int extraItemCount;
    private int lastFirstVisibleItem;
    private final int slidingWindowSize;
    private final MutableState value$delegate;

    /* loaded from: classes.dex */
    private static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final i calculateNearestItemsRange(int i8, int i9, int i10) {
            int i11 = (i8 / i9) * i9;
            return m.s(Math.max(i11 - i10, 0), i11 + i9 + i10);
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public LazyLayoutNearestRangeState(int i8, int i9, int i10) {
        this.slidingWindowSize = i9;
        this.extraItemCount = i10;
        this.value$delegate = SnapshotStateKt.mutableStateOf(Companion.calculateNearestItemsRange(i8, i9, i10), SnapshotStateKt.structuralEqualityPolicy());
        this.lastFirstVisibleItem = i8;
    }

    private void setValue(i iVar) {
        this.value$delegate.setValue(iVar);
    }

    public final void update(int i8) {
        if (i8 != this.lastFirstVisibleItem) {
            this.lastFirstVisibleItem = i8;
            setValue(Companion.calculateNearestItemsRange(i8, this.slidingWindowSize, this.extraItemCount));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.State
    public i getValue() {
        return (i) this.value$delegate.getValue();
    }
}
