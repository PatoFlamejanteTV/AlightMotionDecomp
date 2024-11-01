package androidx.compose.ui.platform;

/* renamed from: androidx.compose.ui.platform.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1761a {
    public static /* synthetic */ long a(AccessibilityManager accessibilityManager, long j8, boolean z8, boolean z9, boolean z10, int i8, Object obj) {
        boolean z11;
        boolean z12;
        boolean z13;
        if (obj == null) {
            if ((i8 & 2) != 0) {
                z11 = false;
            } else {
                z11 = z8;
            }
            if ((i8 & 4) != 0) {
                z12 = false;
            } else {
                z12 = z9;
            }
            if ((i8 & 8) != 0) {
                z13 = false;
            } else {
                z13 = z10;
            }
            return accessibilityManager.calculateRecommendedTimeoutMillis(j8, z11, z12, z13);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateRecommendedTimeoutMillis");
    }
}
