package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.jvm.internal.AbstractC3292y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class BatteryNotLowTracker extends BroadcastReceiverConstraintTracker<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryNotLowTracker(Context context, TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(taskExecutor, "taskExecutor");
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public IntentFilter getIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public void onBroadcastReceive(Intent intent) {
        String str;
        AbstractC3292y.i(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        Logger logger = Logger.get();
        str = BatteryNotLowTrackerKt.TAG;
        logger.debug(str, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1980154005) {
                if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                    setState(Boolean.FALSE);
                    return;
                }
                return;
            }
            if (action.equals("android.intent.action.BATTERY_OKAY")) {
                setState(Boolean.TRUE);
            }
        }
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public Boolean readSystemState() {
        String str;
        Intent registerReceiver = getAppContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            Logger logger = Logger.get();
            str = BatteryNotLowTrackerKt.TAG;
            logger.error(str, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        float intExtra2 = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
        boolean z8 = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z8 = false;
        }
        return Boolean.valueOf(z8);
    }
}
