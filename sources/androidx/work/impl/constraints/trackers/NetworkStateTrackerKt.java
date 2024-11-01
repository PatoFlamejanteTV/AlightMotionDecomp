package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.core.net.ConnectivityManagerCompat;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.NetworkApi21;
import androidx.work.impl.utils.NetworkApi23;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class NetworkStateTrackerKt {
    private static final String TAG;

    static {
        String tagWithPrefix = Logger.tagWithPrefix("NetworkStateTracker");
        AbstractC3292y.h(tagWithPrefix, "tagWithPrefix(\"NetworkStateTracker\")");
        TAG = tagWithPrefix;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final ConstraintTracker<NetworkState> NetworkStateTracker(Context context, TaskExecutor taskExecutor) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(taskExecutor, "taskExecutor");
        if (Build.VERSION.SDK_INT >= 24) {
            return new NetworkStateTracker24(context, taskExecutor);
        }
        return new NetworkStateTrackerPre24(context, taskExecutor);
    }

    public static final NetworkState getActiveNetworkState(ConnectivityManager connectivityManager) {
        boolean z8;
        AbstractC3292y.i(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z9 = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean isActiveNetworkValidated = isActiveNetworkValidated(connectivityManager);
        boolean isActiveNetworkMetered = ConnectivityManagerCompat.isActiveNetworkMetered(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z9 = true;
        }
        return new NetworkState(z8, isActiveNetworkValidated, isActiveNetworkMetered, z9);
    }

    public static /* synthetic */ void getActiveNetworkState$annotations(ConnectivityManager connectivityManager) {
    }

    public static final boolean isActiveNetworkValidated(ConnectivityManager connectivityManager) {
        AbstractC3292y.i(connectivityManager, "<this>");
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilitiesCompat = NetworkApi21.getNetworkCapabilitiesCompat(connectivityManager, NetworkApi23.getActiveNetworkCompat(connectivityManager));
            if (networkCapabilitiesCompat == null) {
                return false;
            }
            return NetworkApi21.hasCapabilityCompat(networkCapabilitiesCompat, 16);
        } catch (SecurityException e8) {
            Logger.get().error(TAG, "Unable to validate active network", e8);
            return false;
        }
    }
}
