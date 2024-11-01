package androidx.compose.runtime;

import Q5.I;
import androidx.compose.runtime.collection.IdentityArraySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ IdentityArraySet<Object> $readSet;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1(IdentityArraySet<Object> identityArraySet) {
        super(1);
        this.$readSet = identityArraySet;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m2471invoke(obj);
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2471invoke(Object obj) {
        this.$readSet.add(obj);
    }
}
