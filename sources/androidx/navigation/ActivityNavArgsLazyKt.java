package androidx.navigation;

import android.app.Activity;
import androidx.annotation.MainThread;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.U;

/* loaded from: classes3.dex */
public final class ActivityNavArgsLazyKt {
    @MainThread
    public static final /* synthetic */ <Args extends NavArgs> NavArgsLazy<Args> navArgs(Activity activity) {
        AbstractC3292y.i(activity, "<this>");
        AbstractC3292y.n(4, "Args");
        return new NavArgsLazy<>(U.b(NavArgs.class), new ActivityNavArgsLazyKt$navArgs$1(activity));
    }
}
