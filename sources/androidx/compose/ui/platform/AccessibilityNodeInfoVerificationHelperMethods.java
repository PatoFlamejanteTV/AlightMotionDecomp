package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(26)
/* loaded from: classes.dex */
final class AccessibilityNodeInfoVerificationHelperMethods {
    public static final AccessibilityNodeInfoVerificationHelperMethods INSTANCE = new AccessibilityNodeInfoVerificationHelperMethods();

    private AccessibilityNodeInfoVerificationHelperMethods() {
    }

    @DoNotInline
    @RequiresApi(26)
    public final void setAvailableExtraData(AccessibilityNodeInfo accessibilityNodeInfo, List<String> list) {
        accessibilityNodeInfo.setAvailableExtraData(list);
    }
}
