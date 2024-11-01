package androidx.compose.ui.platform;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@RequiresApi(29)
/* loaded from: classes.dex */
public final class Api29Impl {
    public static final int $stable = 0;
    public static final Api29Impl INSTANCE = new Api29Impl();

    private Api29Impl() {
    }

    @DoNotInline
    public final int getRecommendedTimeoutMillis(android.view.accessibility.AccessibilityManager accessibilityManager, int i8, int i9) {
        return accessibilityManager.getRecommendedTimeoutMillis(i8, i9);
    }
}
