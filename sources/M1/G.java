package m1;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class G implements InterfaceC3350F {

    /* renamed from: b, reason: collision with root package name */
    private static final a f34858b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final A0.f f34859a;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public G(A0.f firebaseApp) {
        AbstractC3292y.i(firebaseApp, "firebaseApp");
        this.f34859a = firebaseApp;
    }

    private final Object b(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
            return Q5.I.f8786a;
        } catch (IllegalArgumentException e8) {
            return Integer.valueOf(Log.w("LifecycleServiceBinder", "Session lifecycle service binding failed.", e8));
        }
    }

    @Override // m1.InterfaceC3350F
    public void a(Messenger callback, ServiceConnection serviceConnection) {
        boolean z8;
        AbstractC3292y.i(callback, "callback");
        AbstractC3292y.i(serviceConnection, "serviceConnection");
        Context applicationContext = this.f34859a.k().getApplicationContext();
        AbstractC3292y.h(applicationContext, "firebaseApp.applicationContext.applicationContext");
        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
        Log.d("LifecycleServiceBinder", "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", callback);
        intent.setPackage(applicationContext.getPackageName());
        try {
            z8 = applicationContext.bindService(intent, serviceConnection, 65);
        } catch (SecurityException e8) {
            Log.w("LifecycleServiceBinder", "Failed to bind session lifecycle service to application.", e8);
            z8 = false;
        }
        if (!z8) {
            b(applicationContext, serviceConnection);
            Log.i("LifecycleServiceBinder", "Session lifecycle service binding failed.");
        }
    }
}
