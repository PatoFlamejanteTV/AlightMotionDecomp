package q5;

import J4.j;
import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2691a;
import com.uptodown.activities.MainActivity;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: q5.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3799x {

    /* renamed from: a, reason: collision with root package name */
    private final Context f37327a;

    /* renamed from: b, reason: collision with root package name */
    private final a f37328b;

    /* renamed from: q5.x$a */
    /* loaded from: classes5.dex */
    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            AbstractC3292y.i(network, "network");
            C3797v c3797v = C3797v.f37313a;
            if (!c3797v.d()) {
                c3797v.h(true);
                UptodownApp.a aVar = UptodownApp.f29249C;
                if (aVar.Q()) {
                    aVar.e(C3799x.this.f37327a);
                    j.a aVar2 = J4.j.f4395g;
                    if (aVar2.f() != null) {
                        Activity f8 = aVar2.f();
                        if (f8 instanceof AbstractActivityC2691a) {
                            ((AbstractActivityC2691a) f8).v2();
                        }
                        if (f8 instanceof MainActivity) {
                            MainActivity mainActivity = (MainActivity) f8;
                            if (mainActivity.c6()) {
                                mainActivity.runOnUiThread(new MainActivity.RunnableC2684c());
                            }
                        }
                    }
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            AbstractC3292y.i(network, "network");
            AbstractC3292y.i(networkCapabilities, "networkCapabilities");
            super.onCapabilitiesChanged(network, networkCapabilities);
            C3797v c3797v = C3797v.f37313a;
            if (c3797v.a() != networkCapabilities.getLinkDownstreamBandwidthKbps() || c3797v.b() != networkCapabilities.getLinkUpstreamBandwidthKbps()) {
                c3797v.g(networkCapabilities.getLinkDownstreamBandwidthKbps());
                c3797v.i(networkCapabilities.getLinkUpstreamBandwidthKbps());
                c3797v.j(networkCapabilities.hasTransport(1));
                UptodownApp.f29249C.e(C3799x.this.f37327a);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            AbstractC3292y.i(network, "network");
            C3797v c3797v = C3797v.f37313a;
            c3797v.h(false);
            c3797v.g(0);
            c3797v.i(0);
            c3797v.j(false);
        }
    }

    public C3799x(Context context) {
        AbstractC3292y.i(context, "context");
        this.f37327a = context;
        this.f37328b = new a();
    }

    public final void b() {
        Object systemService = this.f37327a.getSystemService("connectivity");
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        if (Build.VERSION.SDK_INT >= 24) {
            connectivityManager.registerDefaultNetworkCallback(this.f37328b);
        } else {
            connectivityManager.registerNetworkCallback(builder.build(), this.f37328b);
        }
    }

    public final void c() {
        Object systemService = this.f37327a.getSystemService("connectivity");
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((ConnectivityManager) systemService).unregisterNetworkCallback(new ConnectivityManager.NetworkCallback());
    }
}
