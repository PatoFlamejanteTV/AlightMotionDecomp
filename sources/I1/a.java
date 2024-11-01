package I1;

import android.app.UiModeManager;
import android.content.Context;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static UiModeManager f3319a;

    public static C1.g a() {
        int currentModeType = f3319a.getCurrentModeType();
        if (currentModeType != 1) {
            if (currentModeType != 4) {
                return C1.g.OTHER;
            }
            return C1.g.CTV;
        }
        return C1.g.MOBILE;
    }

    public static void b(Context context) {
        if (context != null) {
            f3319a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
