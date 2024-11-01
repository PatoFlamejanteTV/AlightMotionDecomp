package A4;

import android.app.Activity;
import android.os.Build;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class c {
    public static final void a(Activity activity) {
        AbstractC3292y.i(activity, "<this>");
        if (Build.VERSION.SDK_INT >= 34) {
            a aVar = a.f159a;
            activity.overrideActivityTransition(1, aVar.a(), aVar.b());
        } else {
            a aVar2 = a.f159a;
            activity.overridePendingTransition(aVar2.a(), aVar2.b());
        }
    }
}
