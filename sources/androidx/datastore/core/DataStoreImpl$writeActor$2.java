package androidx.datastore.core;

import Q5.I;
import androidx.datastore.core.Message;
import c6.InterfaceC2072n;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.InterfaceC3487x;

/* loaded from: classes3.dex */
final class DataStoreImpl$writeActor$2 extends AbstractC3293z implements InterfaceC2072n {
    public static final DataStoreImpl$writeActor$2 INSTANCE = new DataStoreImpl$writeActor$2();

    DataStoreImpl$writeActor$2() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Message.Update) obj, (Throwable) obj2);
        return I.f8786a;
    }

    public final void invoke(Message.Update<T> msg, Throwable th) {
        AbstractC3292y.i(msg, "msg");
        InterfaceC3487x ack = msg.getAck();
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        ack.a(th);
    }
}
