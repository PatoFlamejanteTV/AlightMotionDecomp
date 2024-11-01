package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class SavedStateHandleSaverKt$mutableStateSaver$1$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Saver<T, Object> $this_with;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedStateHandleSaverKt$mutableStateSaver$1$2(Saver<T, Object> saver) {
        super(1);
        this.$this_with = saver;
    }

    @Override // kotlin.jvm.functions.Function1
    public final MutableState<T> invoke(MutableState<Object> it) {
        Object obj;
        AbstractC3292y.i(it, "it");
        if (it instanceof SnapshotMutableState) {
            if (it.getValue() != null) {
                Saver<T, Object> saver = this.$this_with;
                Object value = it.getValue();
                AbstractC3292y.f(value);
                obj = saver.restore(value);
            } else {
                obj = null;
            }
            SnapshotMutationPolicy policy = ((SnapshotMutableState) it).getPolicy();
            AbstractC3292y.g(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver$lambda$5?>");
            MutableState<T> mutableStateOf = SnapshotStateKt.mutableStateOf(obj, policy);
            AbstractC3292y.g(mutableStateOf, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver$lambda$5>");
            return mutableStateOf;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
