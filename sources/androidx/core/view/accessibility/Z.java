package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;
import j$.time.Duration;
import j$.time.TimeConversions;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class Z {
    public static /* synthetic */ void a(AccessibilityNodeInfo accessibilityNodeInfo, Duration duration) {
        accessibilityNodeInfo.setMinDurationBetweenContentChanges(TimeConversions.convert(duration));
    }
}
