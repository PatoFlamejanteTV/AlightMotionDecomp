package androidx.work.impl.constraints.trackers;

import androidx.work.Logger;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class BatteryNotLowTrackerKt {
    public static final float BATTERY_LOW_THRESHOLD = 0.15f;
    private static final String TAG;

    static {
        String tagWithPrefix = Logger.tagWithPrefix("BatteryNotLowTracker");
        AbstractC3292y.h(tagWithPrefix, "tagWithPrefix(\"BatteryNotLowTracker\")");
        TAG = tagWithPrefix;
    }
}
