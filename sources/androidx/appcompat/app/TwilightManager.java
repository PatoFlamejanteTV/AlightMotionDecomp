package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.PermissionChecker;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.Calendar;

/* loaded from: classes.dex */
class TwilightManager {
    private static final int SUNRISE = 6;
    private static final int SUNSET = 22;
    private static final String TAG = "TwilightManager";
    private static TwilightManager sInstance;
    private final Context mContext;
    private final LocationManager mLocationManager;
    private final TwilightState mTwilightState = new TwilightState();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class TwilightState {
        boolean isNight;
        long nextUpdate;

        TwilightState() {
        }
    }

    @VisibleForTesting
    TwilightManager(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.mContext = context;
        this.mLocationManager = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static TwilightManager getInstance(@NonNull Context context) {
        if (sInstance == null) {
            Context applicationContext = context.getApplicationContext();
            sInstance = new TwilightManager(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return sInstance;
    }

    @SuppressLint({"MissingPermission"})
    private Location getLastKnownLocation() {
        Location location;
        Location location2 = null;
        if (PermissionChecker.checkSelfPermission(this.mContext, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = getLastKnownLocationForProvider("network");
        } else {
            location = null;
        }
        if (PermissionChecker.checkSelfPermission(this.mContext, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = getLastKnownLocationForProvider("gps");
        }
        if (location2 != null && location != null) {
            if (location2.getTime() > location.getTime()) {
                return location2;
            }
            return location;
        }
        if (location2 != null) {
            return location2;
        }
        return location;
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    private Location getLastKnownLocationForProvider(String str) {
        try {
            if (this.mLocationManager.isProviderEnabled(str)) {
                return this.mLocationManager.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e8) {
            Log.d(TAG, "Failed to get last known location", e8);
            return null;
        }
    }

    private boolean isStateValid() {
        if (this.mTwilightState.nextUpdate > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    static void setInstance(TwilightManager twilightManager) {
        sInstance = twilightManager;
    }

    private void updateState(@NonNull Location location) {
        boolean z8;
        long j8;
        TwilightState twilightState = this.mTwilightState;
        long currentTimeMillis = System.currentTimeMillis();
        TwilightCalculator twilightCalculator = TwilightCalculator.getInstance();
        twilightCalculator.calculateTwilight(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        twilightCalculator.calculateTwilight(currentTimeMillis, location.getLatitude(), location.getLongitude());
        if (twilightCalculator.state == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        long j9 = twilightCalculator.sunrise;
        long j10 = twilightCalculator.sunset;
        twilightCalculator.calculateTwilight(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j11 = twilightCalculator.sunrise;
        if (j9 != -1 && j10 != -1) {
            if (currentTimeMillis <= j10) {
                if (currentTimeMillis > j9) {
                    j11 = j10;
                } else {
                    j11 = j9;
                }
            }
            j8 = j11 + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        } else {
            j8 = currentTimeMillis + 43200000;
        }
        twilightState.isNight = z8;
        twilightState.nextUpdate = j8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isNight() {
        TwilightState twilightState = this.mTwilightState;
        if (isStateValid()) {
            return twilightState.isNight;
        }
        Location lastKnownLocation = getLastKnownLocation();
        if (lastKnownLocation != null) {
            updateState(lastKnownLocation);
            return twilightState.isNight;
        }
        Log.i(TAG, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i8 = Calendar.getInstance().get(11);
        if (i8 >= 6 && i8 < 22) {
            return false;
        }
        return true;
    }
}
