package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC3292y;

@RequiresApi(24)
/* loaded from: classes3.dex */
public final class NetworkApi24 {
    @DoNotInline
    public static final void registerDefaultNetworkCallbackCompat(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        AbstractC3292y.i(connectivityManager, "<this>");
        AbstractC3292y.i(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
