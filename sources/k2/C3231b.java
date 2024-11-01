package k2;

import Q5.I;
import Q5.s;
import Q5.t;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k2.C3231b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: k2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3231b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34381a;

    /* renamed from: b, reason: collision with root package name */
    private final List f34382b;

    /* renamed from: c, reason: collision with root package name */
    private C3230a f34383c;

    /* renamed from: d, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f34384d;

    /* renamed from: k2.b$a */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void b();
    }

    /* renamed from: k2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0784b extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f34385a = new Handler(Looper.getMainLooper());

        C0784b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(C3231b this$0) {
            AbstractC3292y.i(this$0, "this$0");
            Iterator it = this$0.d().iterator();
            while (it.hasNext()) {
                ((a) it.next()).a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(C3231b this$0) {
            AbstractC3292y.i(this$0, "this$0");
            Iterator it = this$0.d().iterator();
            while (it.hasNext()) {
                ((a) it.next()).b();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            AbstractC3292y.i(network, "network");
            Handler handler = this.f34385a;
            final C3231b c3231b = C3231b.this;
            handler.post(new Runnable() { // from class: k2.c
                @Override // java.lang.Runnable
                public final void run() {
                    C3231b.C0784b.c(C3231b.this);
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            AbstractC3292y.i(network, "network");
            Handler handler = this.f34385a;
            final C3231b c3231b = C3231b.this;
            handler.post(new Runnable() { // from class: k2.d
                @Override // java.lang.Runnable
                public final void run() {
                    C3231b.C0784b.d(C3231b.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k2.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5555invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5555invoke() {
            Iterator it = C3231b.this.d().iterator();
            while (it.hasNext()) {
                ((a) it.next()).a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k2.b$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5556invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5556invoke() {
            Iterator it = C3231b.this.d().iterator();
            while (it.hasNext()) {
                ((a) it.next()).b();
            }
        }
    }

    public C3231b(Context context) {
        AbstractC3292y.i(context, "context");
        this.f34381a = context;
        this.f34382b = new ArrayList();
    }

    private final void b(Context context) {
        C0784b c0784b = new C0784b();
        this.f34384d = c0784b;
        Object systemService = context.getSystemService("connectivity");
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((ConnectivityManager) systemService).registerDefaultNetworkCallback(c0784b);
    }

    private final void c(Context context) {
        C3230a c3230a = new C3230a(new c(), new d());
        this.f34383c = c3230a;
        context.registerReceiver(c3230a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 24) {
            ConnectivityManager.NetworkCallback networkCallback = this.f34384d;
            if (networkCallback == null) {
                return;
            }
            Object systemService = this.f34381a.getSystemService("connectivity");
            AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ((ConnectivityManager) systemService).unregisterNetworkCallback(networkCallback);
        } else {
            C3230a c3230a = this.f34383c;
            if (c3230a == null) {
                return;
            }
            try {
                s.a aVar = s.f8810b;
                this.f34381a.unregisterReceiver(c3230a);
                s.b(I.f8786a);
            } catch (Throwable th) {
                s.a aVar2 = s.f8810b;
                s.b(t.a(th));
            }
        }
        this.f34382b.clear();
        this.f34384d = null;
        this.f34383c = null;
    }

    public final List d() {
        return this.f34382b;
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 24) {
            b(this.f34381a);
        } else {
            c(this.f34381a);
        }
    }
}
