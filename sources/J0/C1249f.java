package J0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;

/* renamed from: J0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1249f {

    /* renamed from: a, reason: collision with root package name */
    private final Float f3901a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f3902b;

    private C1249f(Float f8, boolean z8) {
        this.f3902b = z8;
        this.f3901a = f8;
    }

    public static C1249f a(Context context) {
        boolean z8 = false;
        Float f8 = null;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z8 = e(registerReceiver);
                f8 = d(registerReceiver);
            }
        } catch (IllegalStateException e8) {
            G0.g.f().e("An error occurred getting battery state.", e8);
        }
        return new C1249f(f8, z8);
    }

    private static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra != -1 && intExtra2 != -1) {
            return Float.valueOf(intExtra / intExtra2);
        }
        return null;
    }

    private static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        if (intExtra == -1) {
            return false;
        }
        if (intExtra != 2 && intExtra != 5) {
            return false;
        }
        return true;
    }

    public Float b() {
        return this.f3901a;
    }

    public int c() {
        Float f8;
        if (this.f3902b && (f8 = this.f3901a) != null) {
            if (f8.floatValue() < 0.99d) {
                return 2;
            }
            return 3;
        }
        return 1;
    }
}
