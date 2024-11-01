package androidx.compose.runtime;

import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SnapshotMutableStateImpl$component2$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ SnapshotMutableStateImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotMutableStateImpl$component2$1(SnapshotMutableStateImpl<T> snapshotMutableStateImpl) {
        super(1);
        this.this$0 = snapshotMutableStateImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m2470invoke((SnapshotMutableStateImpl$component2$1) obj);
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2470invoke(T t8) {
        this.this$0.setValue(t8);
    }
}
