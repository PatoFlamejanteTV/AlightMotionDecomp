package T7;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f10001a;

    public a(ConnectivityManager connectivityManager) {
        this.f10001a = connectivityManager;
    }

    public final boolean a() {
        Network activeNetwork;
        ConnectivityManager connectivityManager = this.f10001a;
        if (connectivityManager != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                activeNetwork = connectivityManager.getActiveNetwork();
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
                    return true;
                }
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.isConnected();
                }
            }
        }
        return false;
    }
}
