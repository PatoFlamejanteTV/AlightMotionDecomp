package androidx.window.layout;

import android.app.Activity;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC3292y;

@RequiresApi(24)
/* loaded from: classes3.dex */
public final class ActivityCompatHelperApi24 {
    public static final ActivityCompatHelperApi24 INSTANCE = new ActivityCompatHelperApi24();

    private ActivityCompatHelperApi24() {
    }

    public final boolean isInMultiWindowMode(Activity activity) {
        boolean isInMultiWindowMode;
        AbstractC3292y.i(activity, "activity");
        isInMultiWindowMode = activity.isInMultiWindowMode();
        return isInMultiWindowMode;
    }
}
