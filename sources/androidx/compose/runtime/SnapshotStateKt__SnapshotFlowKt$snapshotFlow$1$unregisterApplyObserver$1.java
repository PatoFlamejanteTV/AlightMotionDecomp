package androidx.compose.runtime;

import Q5.I;
import androidx.compose.runtime.snapshots.Snapshot;
import c6.InterfaceC2072n;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ p6.d $appliedChanges;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1(p6.d dVar) {
        super(2);
        this.$appliedChanges = dVar;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Set<? extends Object>) obj, (Snapshot) obj2);
        return I.f8786a;
    }

    public final void invoke(Set<? extends Object> set, Snapshot snapshot) {
        this.$appliedChanges.x(set);
    }
}
