package androidx.compose.runtime.snapshots;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class GlobalSnapshot$takeNestedMutableSnapshot$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $readObserver;
    final /* synthetic */ Function1 $writeObserver;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshot$takeNestedMutableSnapshot$1(Function1 function1, Function1 function12) {
        super(1);
        this.$readObserver = function1;
        this.$writeObserver = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final MutableSnapshot invoke(SnapshotIdSet snapshotIdSet) {
        int i8;
        synchronized (SnapshotKt.getLock()) {
            i8 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i8 + 1;
        }
        return new MutableSnapshot(i8, snapshotIdSet, this.$readObserver, this.$writeObserver);
    }
}
