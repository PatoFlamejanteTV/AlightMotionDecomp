package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.jvm.internal.AbstractC3292y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class BatteryChargingTracker extends BroadcastReceiverConstraintTracker<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryChargingTracker(Context context, TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(taskExecutor, "taskExecutor");
    }

    private final boolean isBatteryChangedIntentCharging(Intent intent) {
        if (Build.VERSION.SDK_INT >= 23) {
            int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            if (intExtra == 2 || intExtra == 5) {
                return true;
            }
        } else if (intent.getIntExtra("plugged", 0) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public IntentFilter getIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public void onBroadcastReceive(Intent intent) {
        String str;
        AbstractC3292y.i(intent, "intent");
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        Logger logger = Logger.get();
        str = BatteryChargingTrackerKt.TAG;
        logger.debug(str, "Received " + action);
        switch (action.hashCode()) {
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    setState(Boolean.FALSE);
                    return;
                }
                return;
            case -54942926:
                if (action.equals("android.os.action.DISCHARGING")) {
                    setState(Boolean.FALSE);
                    return;
                }
                return;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    setState(Boolean.TRUE);
                    return;
                }
                return;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    setState(Boolean.TRUE);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public Boolean readSystemState() {
        String str;
        Intent registerReceiver = getAppContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            Logger logger = Logger.get();
            str = BatteryChargingTrackerKt.TAG;
            logger.error(str, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        return Boolean.valueOf(isBatteryChangedIntentCharging(registerReceiver));
    }
}
