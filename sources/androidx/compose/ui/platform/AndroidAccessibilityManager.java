package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidAccessibilityManager implements AccessibilityManager {

    @Deprecated
    public static final int FlagContentControls = 4;

    @Deprecated
    public static final int FlagContentIcons = 1;

    @Deprecated
    public static final int FlagContentText = 2;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public AndroidAccessibilityManager(Context context) {
        Object systemService = context.getSystemService("accessibility");
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.AccessibilityManager
    public long calculateRecommendedTimeoutMillis(long j8, boolean z8, boolean z9, boolean z10) {
        int i8 = z8;
        if (j8 >= 2147483647L) {
            return j8;
        }
        if (z9) {
            i8 = (z8 ? 1 : 0) | 2;
        }
        if (z10) {
            i8 = (i8 == true ? 1 : 0) | 4;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int recommendedTimeoutMillis = Api29Impl.INSTANCE.getRecommendedTimeoutMillis(this.accessibilityManager, (int) j8, i8);
            if (recommendedTimeoutMillis != Integer.MAX_VALUE) {
                return recommendedTimeoutMillis;
            }
        } else if (!z10 || !this.accessibilityManager.isTouchExplorationEnabled()) {
            return j8;
        }
        return Long.MAX_VALUE;
    }
}
