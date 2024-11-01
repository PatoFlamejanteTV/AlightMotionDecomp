package M;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import e0.AbstractC2777a;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q0.AbstractC3628n;
import q0.C3626l;
import q0.InterfaceC3617c;
import q0.InterfaceC3620f;
import q0.InterfaceC3625k;

/* renamed from: M.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1325c {

    /* renamed from: h, reason: collision with root package name */
    private static int f5450h;

    /* renamed from: i, reason: collision with root package name */
    private static PendingIntent f5451i;

    /* renamed from: j, reason: collision with root package name */
    private static final Executor f5452j = new Executor() { // from class: M.G
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f5453k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    private final Context f5455b;

    /* renamed from: c, reason: collision with root package name */
    private final E f5456c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f5457d;

    /* renamed from: f, reason: collision with root package name */
    private Messenger f5459f;

    /* renamed from: g, reason: collision with root package name */
    private l f5460g;

    /* renamed from: a, reason: collision with root package name */
    private final SimpleArrayMap f5454a = new SimpleArrayMap();

    /* renamed from: e, reason: collision with root package name */
    private final Messenger f5458e = new Messenger(new i(this, Looper.getMainLooper()));

    public C1325c(Context context) {
        this.f5455b = context;
        this.f5456c = new E(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f5457d = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Task e(Bundle bundle) {
        if (m(bundle)) {
            return AbstractC3628n.e(null);
        }
        return AbstractC3628n.e(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void g(C1325c c1325c, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new k());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof l) {
                        c1325c.f5460g = (l) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c1325c.f5459f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra(CampaignEx.JSON_NATIVE_VIDEO_ERROR);
                    if (stringExtra2 == null) {
                        Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                        return;
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && Objects.equals(split[1], "ID")) {
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            c1325c.l(str, intent2.putExtra(CampaignEx.JSON_NATIVE_VIDEO_ERROR, str2).getExtras());
                            return;
                        }
                        Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                        return;
                    }
                    synchronized (c1325c.f5454a) {
                        for (int i8 = 0; i8 < c1325c.f5454a.size(); i8++) {
                            try {
                                c1325c.l((String) c1325c.f5454a.keyAt(i8), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                Matcher matcher = f5453k.matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                        return;
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    c1325c.l(group, extras);
                    return;
                }
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    private final Task i(Bundle bundle) {
        final String j8 = j();
        final C3626l c3626l = new C3626l();
        synchronized (this.f5454a) {
            this.f5454a.put(j8, c3626l);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f5456c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        k(this.f5455b, intent);
        intent.putExtra("kid", "|ID|" + j8 + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f5458e);
        if (this.f5459f != null || this.f5460g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f5459f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f5460g.b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f5457d.schedule(new Runnable() { // from class: M.g
                @Override // java.lang.Runnable
                public final void run() {
                    if (C3626l.this.d(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            c3626l.a().b(f5452j, new InterfaceC3620f() { // from class: M.h
                @Override // q0.InterfaceC3620f
                public final void a(Task task) {
                    C1325c.this.h(j8, schedule, task);
                }
            });
            return c3626l.a();
        }
        if (this.f5456c.b() == 2) {
            this.f5455b.sendBroadcast(intent);
        } else {
            this.f5455b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f5457d.schedule(new Runnable() { // from class: M.g
            @Override // java.lang.Runnable
            public final void run() {
                if (C3626l.this.d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        c3626l.a().b(f5452j, new InterfaceC3620f() { // from class: M.h
            @Override // q0.InterfaceC3620f
            public final void a(Task task) {
                C1325c.this.h(j8, schedule2, task);
            }
        });
        return c3626l.a();
    }

    private static synchronized String j() {
        String num;
        synchronized (C1325c.class) {
            int i8 = f5450h;
            f5450h = i8 + 1;
            num = Integer.toString(i8);
        }
        return num;
    }

    private static synchronized void k(Context context, Intent intent) {
        synchronized (C1325c.class) {
            try {
                if (f5451i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f5451i = PendingIntent.getBroadcast(context, 0, intent2, AbstractC2777a.f31520a);
                }
                intent.putExtra(MBridgeConstans.DYNAMIC_VIEW_WX_APP, f5451i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void l(String str, Bundle bundle) {
        synchronized (this.f5454a) {
            try {
                C3626l c3626l = (C3626l) this.f5454a.remove(str);
                if (c3626l == null) {
                    Log.w("Rpc", "Missing callback for " + str);
                    return;
                }
                c3626l.c(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean m(Bundle bundle) {
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return true;
        }
        return false;
    }

    public Task a() {
        if (this.f5456c.a() >= 241100000) {
            return D.b(this.f5455b).d(5, Bundle.EMPTY).g(f5452j, new InterfaceC3617c() { // from class: M.f
                @Override // q0.InterfaceC3617c
                public final Object a(Task task) {
                    Intent intent = (Intent) ((Bundle) task.j()).getParcelable("notification_data");
                    if (intent != null) {
                        return new C1323a(intent);
                    }
                    return null;
                }
            });
        }
        return AbstractC3628n.d(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public Task b(C1323a c1323a) {
        if (this.f5456c.a() >= 233700000) {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", c1323a.u());
            Integer v8 = c1323a.v();
            if (v8 != null) {
                bundle.putInt("google.product_id", v8.intValue());
            }
            return D.b(this.f5455b).c(3, bundle);
        }
        return AbstractC3628n.d(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public Task c(final Bundle bundle) {
        if (this.f5456c.a() < 12000000) {
            if (this.f5456c.b() != 0) {
                return i(bundle).h(f5452j, new InterfaceC3617c() { // from class: M.H
                    @Override // q0.InterfaceC3617c
                    public final Object a(Task task) {
                        return C1325c.this.f(bundle, task);
                    }
                });
            }
            return AbstractC3628n.d(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return D.b(this.f5455b).d(1, bundle).g(f5452j, new InterfaceC3617c() { // from class: M.e
            @Override // q0.InterfaceC3617c
            public final Object a(Task task) {
                if (task.n()) {
                    return (Bundle) task.j();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.i())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.i());
            }
        });
    }

    public Task d(boolean z8) {
        if (this.f5456c.a() >= 241100000) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("proxy_retention", z8);
            return D.b(this.f5455b).c(4, bundle);
        }
        return AbstractC3628n.d(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Task f(Bundle bundle, Task task) {
        if (task.n() && m((Bundle) task.j())) {
            return i(bundle).o(f5452j, new InterfaceC3625k() { // from class: M.F
                @Override // q0.InterfaceC3625k
                public final Task a(Object obj) {
                    return C1325c.e((Bundle) obj);
                }
            });
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void h(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f5454a) {
            this.f5454a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
