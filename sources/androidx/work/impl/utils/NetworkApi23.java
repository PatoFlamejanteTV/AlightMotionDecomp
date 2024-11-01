package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC3292y;

@RequiresApi(23)
/* loaded from: classes3.dex */
public final class NetworkApi23 {
    @DoNotInline
    public static final Network getActiveNetworkCompat(ConnectivityManager connectivityManager) {
        Network activeNetwork;
        AbstractC3292y.i(connectivityManager, "<this>");
        activeNetwork = connectivityManager.getActiveNetwork();
        return activeNetwork;
    }
}
