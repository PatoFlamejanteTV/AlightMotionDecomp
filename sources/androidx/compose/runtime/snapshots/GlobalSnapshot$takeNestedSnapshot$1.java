package androidx.compose.runtime.snapshots;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class GlobalSnapshot$takeNestedSnapshot$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $readObserver;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshot$takeNestedSnapshot$1(Function1 function1) {
        super(1);
        this.$readObserver = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ReadonlySnapshot invoke(SnapshotIdSet snapshotIdSet) {
        int i8;
        synchronized (SnapshotKt.getLock()) {
            i8 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i8 + 1;
        }
        return new ReadonlySnapshot(i8, snapshotIdSet, this.$readObserver);
    }
}
