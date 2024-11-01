package androidx.navigation;

import androidx.core.app.ActivityOptionsCompat;
import androidx.navigation.ActivityNavigator;

/* loaded from: classes3.dex */
public final class ActivityNavigatorExtrasKt {
    public static final ActivityNavigator.Extras ActivityNavigatorExtras(ActivityOptionsCompat activityOptionsCompat, int i8) {
        ActivityNavigator.Extras.Builder builder = new ActivityNavigator.Extras.Builder();
        if (activityOptionsCompat != null) {
            builder.setActivityOptions(activityOptionsCompat);
        }
        builder.addFlags(i8);
        return builder.build();
    }

    public static /* synthetic */ ActivityNavigator.Extras ActivityNavigatorExtras$default(ActivityOptionsCompat activityOptionsCompat, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            activityOptionsCompat = null;
        }
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return ActivityNavigatorExtras(activityOptionsCompat, i8);
    }
}
