package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.google.firebase.sessions.c;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import m6.C3374a;
import o1.C3516f;

/* loaded from: classes4.dex */
public final class SessionLifecycleService extends Service {

    /* renamed from: d, reason: collision with root package name */
    public static final a f18736d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final HandlerThread f18737a = new HandlerThread("FirebaseSessions_HandlerThread");

    /* renamed from: b, reason: collision with root package name */
    private b f18738b;

    /* renamed from: c, reason: collision with root package name */
    private Messenger f18739c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private boolean f18740a;

        /* renamed from: b, reason: collision with root package name */
        private long f18741b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f18742c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Looper looper) {
            super(looper);
            AbstractC3292y.i(looper, "looper");
            this.f18742c = new ArrayList();
        }

        private final void a() {
            StringBuilder sb = new StringBuilder();
            sb.append("Broadcasting new session: ");
            c.b bVar = c.f18747f;
            sb.append(bVar.a().c());
            Log.d("SessionLifecycleService", sb.toString());
            com.google.firebase.sessions.b.f18745a.a().a(bVar.a().c());
            for (Messenger it : new ArrayList(this.f18742c)) {
                AbstractC3292y.h(it, "it");
                f(it);
            }
        }

        private final void b(Message message) {
            Log.d("SessionLifecycleService", "Activity backgrounding at " + message.getWhen());
            this.f18741b = message.getWhen();
        }

        private final void c(Message message) {
            this.f18742c.add(message.replyTo);
            Messenger messenger = message.replyTo;
            AbstractC3292y.h(messenger, "msg.replyTo");
            f(messenger);
            Log.d("SessionLifecycleService", "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + this.f18742c.size());
        }

        private final void d(Message message) {
            Log.d("SessionLifecycleService", "Activity foregrounding at " + message.getWhen() + '.');
            if (!this.f18740a) {
                Log.d("SessionLifecycleService", "Cold start detected.");
                this.f18740a = true;
                g();
            } else if (e(message.getWhen())) {
                Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                g();
            }
            this.f18741b = message.getWhen();
        }

        private final boolean e(long j8) {
            if (j8 - this.f18741b > C3374a.o(C3516f.f35874c.c().c())) {
                return true;
            }
            return false;
        }

        private final void f(Messenger messenger) {
            if (this.f18740a) {
                h(messenger, c.f18747f.a().c().b());
                return;
            }
            String a9 = com.google.firebase.sessions.a.f18743a.a().a();
            Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + a9);
            if (a9 != null) {
                h(messenger, a9);
            }
        }

        private final void g() {
            c.b bVar = c.f18747f;
            bVar.a().a();
            Log.d("SessionLifecycleService", "Generated new session " + bVar.a().c().b());
            a();
            com.google.firebase.sessions.a.f18743a.a().b(bVar.a().c().b());
        }

        private final void h(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message obtain = Message.obtain(null, 3, 0, 0);
                obtain.setData(bundle);
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
                Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
                this.f18742c.remove(messenger);
            } catch (Exception e8) {
                Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e8);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            AbstractC3292y.i(msg, "msg");
            if (this.f18741b > msg.getWhen()) {
                Log.d("SessionLifecycleService", "Ignoring old message from " + msg.getWhen() + " which is older than " + this.f18741b + '.');
                return;
            }
            int i8 = msg.what;
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 4) {
                        Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + msg);
                        super.handleMessage(msg);
                        return;
                    }
                    c(msg);
                    return;
                }
                b(msg);
                return;
            }
            d(msg);
        }
    }

    private final Messenger a(Intent intent) {
        Object parcelableExtra;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class);
            return (Messenger) parcelableExtra;
        }
        return (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger a9 = a(intent);
        if (a9 != null) {
            Message obtain = Message.obtain(null, 4, 0, 0);
            obtain.replyTo = a9;
            b bVar = this.f18738b;
            if (bVar != null) {
                bVar.sendMessage(obtain);
            }
        }
        Messenger messenger = this.f18739c;
        if (messenger == null) {
            return null;
        }
        return messenger.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f18737a.start();
        Looper looper = this.f18737a.getLooper();
        AbstractC3292y.h(looper, "handlerThread.looper");
        this.f18738b = new b(looper);
        this.f18739c = new Messenger(this.f18738b);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f18737a.quit();
    }
}
