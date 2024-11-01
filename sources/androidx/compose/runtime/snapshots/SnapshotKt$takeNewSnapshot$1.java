package androidx.compose.runtime.snapshots;

import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SnapshotKt$takeNewSnapshot$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $block;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotKt$takeNewSnapshot$1(Function1 function1) {
        super(1);
        this.$block = function1;
    }

    /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)TT; */
    @Override // kotlin.jvm.functions.Function1
    public final Snapshot invoke(SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2;
        Snapshot snapshot = (Snapshot) this.$block.invoke(snapshotIdSet);
        synchronized (SnapshotKt.getLock()) {
            snapshotIdSet2 = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet2.set(snapshot.getId());
            I i8 = I.f8786a;
        }
        return snapshot;
    }
}
