package androidx.compose.material.pullrefresh;

import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;

@StabilityInferred(parameters = 0)
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class PullRefreshDefaults {
    public static final int $stable = 0;
    public static final PullRefreshDefaults INSTANCE = new PullRefreshDefaults();
    private static final float RefreshThreshold = Dp.m5155constructorimpl(80);
    private static final float RefreshingOffset = Dp.m5155constructorimpl(56);

    private PullRefreshDefaults() {
    }

    /* renamed from: getRefreshThreshold-D9Ej5fM, reason: not valid java name */
    public final float m1403getRefreshThresholdD9Ej5fM() {
        return RefreshThreshold;
    }

    /* renamed from: getRefreshingOffset-D9Ej5fM, reason: not valid java name */
    public final float m1404getRefreshingOffsetD9Ej5fM() {
        return RefreshingOffset;
    }
}
