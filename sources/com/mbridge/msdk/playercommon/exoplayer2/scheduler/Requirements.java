package com.mbridge.msdk.playercommon.exoplayer2.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.PowerManager;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public final class Requirements {
    private static final int DEVICE_CHARGING = 16;
    private static final int DEVICE_IDLE = 8;
    public static final int NETWORK_TYPE_ANY = 1;
    private static final int NETWORK_TYPE_MASK = 7;
    public static final int NETWORK_TYPE_METERED = 4;
    public static final int NETWORK_TYPE_NONE = 0;
    public static final int NETWORK_TYPE_NOT_ROAMING = 3;
    private static final String[] NETWORK_TYPE_STRINGS = null;
    public static final int NETWORK_TYPE_UNMETERED = 2;
    private static final String TAG = "Requirements";
    private final int requirements;

    /* loaded from: classes4.dex */
    public @interface NetworkType {
    }

    public Requirements(int i8, boolean z8, boolean z9) {
        this(i8 | (z8 ? 16 : 0) | (z9 ? 8 : 0));
    }

    private boolean checkChargingRequirement(Context context) {
        if (!isChargingRequired()) {
            return true;
        }
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        if (intExtra == 2 || intExtra == 5) {
            return true;
        }
        return false;
    }

    private boolean checkIdleRequirement(Context context) {
        boolean isDeviceIdleMode;
        if (!isIdleRequired()) {
            return true;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        int i8 = Util.SDK_INT;
        if (i8 >= 23) {
            isDeviceIdleMode = powerManager.isDeviceIdleMode();
            if (!isDeviceIdleMode) {
                return true;
            }
        } else if (i8 >= 20) {
            if (!powerManager.isInteractive()) {
                return true;
            }
        } else if (!powerManager.isScreenOn()) {
            return true;
        }
        return false;
    }

    private static boolean checkInternetConnectivity(ConnectivityManager connectivityManager) {
        Network activeNetwork;
        if (Util.SDK_INT >= 23) {
            activeNetwork = connectivityManager.getActiveNetwork();
            boolean z8 = false;
            if (activeNetwork == null) {
                logd("No active network.");
                return false;
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
                z8 = true;
            }
            logd("Network capability validated: " + z8);
            return !z8;
        }
        return true;
    }

    private boolean checkNetworkRequirements(Context context) {
        int requiredNetworkType = getRequiredNetworkType();
        if (requiredNetworkType == 0) {
            return true;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (!checkInternetConnectivity(connectivityManager)) {
                return false;
            }
            if (requiredNetworkType == 1) {
                return true;
            }
            if (requiredNetworkType == 3) {
                boolean isRoaming = activeNetworkInfo.isRoaming();
                logd("Roaming: " + isRoaming);
                return !isRoaming;
            }
            boolean isActiveNetworkMetered = isActiveNetworkMetered(connectivityManager, activeNetworkInfo);
            logd("Metered network: " + isActiveNetworkMetered);
            if (requiredNetworkType == 2) {
                return !isActiveNetworkMetered;
            }
            if (requiredNetworkType == 4) {
                return isActiveNetworkMetered;
            }
            throw new IllegalStateException();
        }
        logd("No network info or no connection.");
        return false;
    }

    private static boolean isActiveNetworkMetered(ConnectivityManager connectivityManager, NetworkInfo networkInfo) {
        if (Util.SDK_INT >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        int type = networkInfo.getType();
        if (type != 1 && type != 7 && type != 9) {
            return true;
        }
        return false;
    }

    private static void logd(String str) {
    }

    public final boolean checkRequirements(Context context) {
        if (checkNetworkRequirements(context) && checkChargingRequirement(context) && checkIdleRequirement(context)) {
            return true;
        }
        return false;
    }

    public final int getRequiredNetworkType() {
        return this.requirements & 7;
    }

    public final int getRequirementsData() {
        return this.requirements;
    }

    public final boolean isChargingRequired() {
        if ((this.requirements & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isIdleRequired() {
        if ((this.requirements & 8) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return super.toString();
    }

    public Requirements(int i8) {
        this.requirements = i8;
    }
}
