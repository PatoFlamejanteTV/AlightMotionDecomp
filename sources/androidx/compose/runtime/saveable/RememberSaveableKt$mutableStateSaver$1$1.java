package androidx.compose.runtime.saveable;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class RememberSaveableKt$mutableStateSaver$1$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ Saver<T, Object> $this_with;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$mutableStateSaver$1$1(Saver<T, Object> saver) {
        super(2);
        this.$this_with = saver;
    }

    @Override // c6.InterfaceC2072n
    public final MutableState<Object> invoke(SaverScope saverScope, MutableState<T> mutableState) {
        if (mutableState instanceof SnapshotMutableState) {
            Object save = this.$this_with.save(saverScope, mutableState.getValue());
            if (save == null) {
                return null;
            }
            SnapshotMutationPolicy policy = ((SnapshotMutableState) mutableState).getPolicy();
            AbstractC3292y.g(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
            return SnapshotStateKt.mutableStateOf(save, policy);
        }
        throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
    }
}
