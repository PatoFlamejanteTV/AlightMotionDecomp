package M;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class y {

    /* renamed from: a, reason: collision with root package name */
    private final Messenger f5493a;

    /* renamed from: b, reason: collision with root package name */
    private final l f5494b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f5493a = new Messenger(iBinder);
            this.f5494b = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f5494b = new l(iBinder);
            this.f5493a = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Message message) {
        Messenger messenger = this.f5493a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        l lVar = this.f5494b;
        if (lVar != null) {
            lVar.b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
