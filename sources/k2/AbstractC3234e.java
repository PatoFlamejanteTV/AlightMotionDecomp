package k2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: k2.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3234e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(Context context) {
        Network activeNetwork;
        Object systemService = context.getSystemService("connectivity");
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (Build.VERSION.SDK_INT >= 24) {
            activeNetwork = connectivityManager.getActiveNetwork();
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                return false;
            }
            return c(networkCapabilities);
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    private static final boolean c(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3)) {
            return true;
        }
        return false;
    }
}
