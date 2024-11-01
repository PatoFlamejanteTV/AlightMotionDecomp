package B4;

import android.app.Activity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class a {
    public static final boolean a(Activity activity, Function0 argsProvider) {
        AbstractC3292y.i(activity, "<this>");
        AbstractC3292y.i(argsProvider, "argsProvider");
        try {
            argsProvider.invoke();
            return false;
        } catch (IllegalArgumentException unused) {
            activity.finish();
            return true;
        }
    }
}
