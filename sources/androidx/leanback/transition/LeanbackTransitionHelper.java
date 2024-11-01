package androidx.leanback.transition;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.leanback.R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class LeanbackTransitionHelper {
    private LeanbackTransitionHelper() {
    }

    public static Object loadTitleInTransition(Context context) {
        return TransitionHelper.loadTransition(context, R.transition.lb_title_in);
    }

    public static Object loadTitleOutTransition(Context context) {
        return TransitionHelper.loadTransition(context, R.transition.lb_title_out);
    }
}
