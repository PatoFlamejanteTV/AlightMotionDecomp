package Q;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public final class e0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final int f8236a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC1383c f8237b;

    public e0(AbstractC1383c abstractC1383c, int i8) {
        this.f8237b = abstractC1383c;
        this.f8236a = i8;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        InterfaceC1392l u8;
        AbstractC1383c abstractC1383c = this.f8237b;
        if (iBinder != null) {
            obj = abstractC1383c.f8196n;
            synchronized (obj) {
                try {
                    AbstractC1383c abstractC1383c2 = this.f8237b;
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC1392l)) {
                        u8 = (InterfaceC1392l) queryLocalInterface;
                    } else {
                        u8 = new U(iBinder);
                    }
                    abstractC1383c2.f8197o = u8;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f8237b.e0(0, null, this.f8236a);
            return;
        }
        AbstractC1383c.d0(abstractC1383c, 16);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f8237b.f8196n;
        synchronized (obj) {
            this.f8237b.f8197o = null;
        }
        AbstractC1383c abstractC1383c = this.f8237b;
        int i8 = this.f8236a;
        Handler handler = abstractC1383c.f8194l;
        handler.sendMessage(handler.obtainMessage(6, i8, 1));
    }
}
