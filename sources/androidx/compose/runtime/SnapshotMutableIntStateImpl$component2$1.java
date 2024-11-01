package androidx.compose.runtime;

import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SnapshotMutableIntStateImpl$component2$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ SnapshotMutableIntStateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotMutableIntStateImpl$component2$1(SnapshotMutableIntStateImpl snapshotMutableIntStateImpl) {
        super(1);
        this.this$0 = snapshotMutableIntStateImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return I.f8786a;
    }

    public final void invoke(int i8) {
        this.this$0.setIntValue(i8);
    }
}
