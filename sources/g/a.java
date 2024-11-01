package G;

import N.AbstractC1349l;
import N.C1345h;
import N.C1346i;
import N.ServiceConnectionC1338a;
import Q.AbstractC1396p;
import a0.AbstractBinderC1646e;
import a0.InterfaceC1647f;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    ServiceConnectionC1338a f2724a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC1647f f2725b;

    /* renamed from: c, reason: collision with root package name */
    boolean f2726c;

    /* renamed from: d, reason: collision with root package name */
    final Object f2727d = new Object();

    /* renamed from: e, reason: collision with root package name */
    c f2728e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f2729f;

    /* renamed from: g, reason: collision with root package name */
    final long f2730g;

    /* renamed from: G.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0040a {

        /* renamed from: a, reason: collision with root package name */
        private final String f2731a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f2732b;

        public C0040a(String str, boolean z8) {
            this.f2731a = str;
            this.f2732b = z8;
        }

        public String a() {
            return this.f2731a;
        }

        public boolean b() {
            return this.f2732b;
        }

        public String toString() {
            String str = this.f2731a;
            boolean z8 = this.f2732b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z8);
            return sb.toString();
        }
    }

    public a(Context context, long j8, boolean z8, boolean z9) {
        Context applicationContext;
        AbstractC1396p.l(context);
        if (z8 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f2729f = context;
        this.f2726c = false;
        this.f2730g = j8;
    }

    public static C0040a a(Context context) {
        a aVar = new a(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.d(false);
            C0040a f8 = aVar.f(-1);
            aVar.e(f8, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return f8;
        } finally {
        }
    }

    private final C0040a f(int i8) {
        C0040a c0040a;
        AbstractC1396p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f2726c) {
                    synchronized (this.f2727d) {
                        c cVar = this.f2728e;
                        if (cVar == null || !cVar.f2737d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f2726c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e8) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e8);
                    }
                }
                AbstractC1396p.l(this.f2724a);
                AbstractC1396p.l(this.f2725b);
                try {
                    c0040a = new C0040a(this.f2725b.b(), this.f2725b.t(true));
                } catch (RemoteException e9) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e9);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return c0040a;
    }

    private final void g() {
        synchronized (this.f2727d) {
            c cVar = this.f2728e;
            if (cVar != null) {
                cVar.f2736c.countDown();
                try {
                    this.f2728e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j8 = this.f2730g;
            if (j8 > 0) {
                this.f2728e = new c(this, j8);
            }
        }
    }

    public final void c() {
        AbstractC1396p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f2729f != null && this.f2724a != null) {
                    try {
                        if (this.f2726c) {
                            U.b.b().c(this.f2729f, this.f2724a);
                        }
                    } catch (Throwable th) {
                        Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                    }
                    this.f2726c = false;
                    this.f2725b = null;
                    this.f2724a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void d(boolean z8) {
        AbstractC1396p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f2726c) {
                    c();
                }
                Context context = this.f2729f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int h8 = C1345h.f().h(context, AbstractC1349l.f6370a);
                    if (h8 != 0 && h8 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC1338a serviceConnectionC1338a = new ServiceConnectionC1338a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (U.b.b().a(context, intent, serviceConnectionC1338a, 1)) {
                            this.f2724a = serviceConnectionC1338a;
                            try {
                                this.f2725b = AbstractBinderC1646e.h(serviceConnectionC1338a.a(WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS));
                                this.f2726c = true;
                                if (z8) {
                                    g();
                                }
                            } catch (InterruptedException unused) {
                                throw new IOException("Interrupted exception");
                            } catch (Throwable th) {
                                throw new IOException(th);
                            }
                        } else {
                            throw new IOException("Connection failure");
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new C1346i(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final boolean e(C0040a c0040a, boolean z8, float f8, long j8, String str, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str2 = "1";
            hashMap.put("app_context", "1");
            if (c0040a != null) {
                if (true != c0040a.b()) {
                    str2 = MBridgeConstans.ENDCARD_URL_TYPE_PL;
                }
                hashMap.put("limit_ad_tracking", str2);
                String a9 = c0040a.a();
                if (a9 != null) {
                    hashMap.put("ad_id_size", Integer.toString(a9.length()));
                }
            }
            if (th != null) {
                hashMap.put(CampaignEx.JSON_NATIVE_VIDEO_ERROR, th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j8));
            new b(this, hashMap).start();
            return true;
        }
        return false;
    }

    protected final void finalize() {
        c();
        super.finalize();
    }

    public static void b(boolean z8) {
    }
}
