package P7;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes5.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final ConnectivityManager f8136a;

    /* loaded from: classes5.dex */
    public enum a {
        NONE,
        MOBILE,
        WIFI
    }

    public c(Context context) {
        this.f8136a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public a a() {
        NetworkInfo activeNetworkInfo = this.f8136a.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return a.NONE;
        }
        if (activeNetworkInfo.getType() == 1) {
            return a.WIFI;
        }
        return a.MOBILE;
    }

    public boolean b() {
        NetworkInfo activeNetworkInfo = this.f8136a.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}
