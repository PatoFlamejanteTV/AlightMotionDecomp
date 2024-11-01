package androidx.activity.result;

import Q5.I;
import androidx.core.app.ActivityOptionsCompat;

/* loaded from: classes.dex */
public final class ActivityResultLauncherKt {
    public static final void launch(ActivityResultLauncher<Void> activityResultLauncher, ActivityOptionsCompat activityOptionsCompat) {
        activityResultLauncher.launch(null, activityOptionsCompat);
    }

    public static /* synthetic */ void launch$default(ActivityResultLauncher activityResultLauncher, ActivityOptionsCompat activityOptionsCompat, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            activityOptionsCompat = null;
        }
        launch(activityResultLauncher, activityOptionsCompat);
    }

    public static final void launchUnit(ActivityResultLauncher<I> activityResultLauncher, ActivityOptionsCompat activityOptionsCompat) {
        activityResultLauncher.launch(I.f8786a, activityOptionsCompat);
    }

    public static /* synthetic */ void launchUnit$default(ActivityResultLauncher activityResultLauncher, ActivityOptionsCompat activityOptionsCompat, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            activityOptionsCompat = null;
        }
        launchUnit(activityResultLauncher, activityOptionsCompat);
    }
}
