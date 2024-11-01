package M;

import android.os.Looper;
import android.os.Message;
import e0.HandlerC2782f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class i extends HandlerC2782f {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1325c f5467b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C1325c c1325c, Looper looper) {
        super(looper);
        this.f5467b = c1325c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1325c.g(this.f5467b, message);
    }
}
