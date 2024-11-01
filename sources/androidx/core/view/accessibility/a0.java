package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;
import j$.time.Duration;
import j$.time.TimeConversions;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a0 {
    public static /* synthetic */ Duration a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return TimeConversions.convert(accessibilityNodeInfo.getMinDurationBetweenContentChanges());
    }
}
