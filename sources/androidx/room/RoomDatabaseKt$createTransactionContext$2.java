package androidx.room;

import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import n6.InterfaceC3435A;
import n6.InterfaceC3488x0;

/* loaded from: classes3.dex */
final class RoomDatabaseKt$createTransactionContext$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ InterfaceC3435A $controlJob;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt$createTransactionContext$2(InterfaceC3435A interfaceC3435A) {
        super(1);
        this.$controlJob = interfaceC3435A;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.f8786a;
    }

    public final void invoke(Throwable th) {
        InterfaceC3488x0.a.a(this.$controlJob, null, 1, null);
    }
}
