package s5;

import android.content.Context;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3797v;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f39141a = new i();

    private i() {
    }

    private final float a(float f8) {
        float f9 = f8 / 2.0f;
        if (f9 < 0.5d) {
            return 0.5f;
        }
        return f9;
    }

    private final float b(float f8) {
        if (f8 <= 2.0f) {
            return f8 + 2;
        }
        return f8;
    }

    public final float c(Context context) {
        AbstractC3292y.i(context, "context");
        float f8 = context.getResources().getDisplayMetrics().density;
        float f9 = 0.5f;
        if (f8 > 4.0f) {
            f8 = 3.0f;
        } else if (f8 > 2.0f) {
            f8--;
        } else if (f8 > 1.0f) {
            f8 -= 0.5f;
        }
        if (f8 >= 0.5d) {
            f9 = f8;
        }
        int k8 = SettingsPreferences.f30529b.k(context);
        if (k8 != 0) {
            if (k8 != 1) {
                if (k8 == 2 && UptodownApp.f29249C.U(context)) {
                    return b(f9);
                }
                return f9;
            }
            if (!C3797v.f37313a.c()) {
                return a(f9);
            }
            if (UptodownApp.f29249C.U(context)) {
                return b(f9);
            }
            return f9;
        }
        return a(f9);
    }
}
