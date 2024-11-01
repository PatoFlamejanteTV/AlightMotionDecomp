package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* loaded from: classes3.dex */
public abstract class R2 {

    /* renamed from: a, reason: collision with root package name */
    private static UserManager f16430a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f16431b = !a();

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    public static boolean b(Context context) {
        if (a() && !d(context)) {
            return true;
        }
        return false;
    }

    public static boolean c(Context context) {
        if (a() && !d(context)) {
            return false;
        }
        return true;
    }

    private static boolean d(Context context) {
        if (f16431b) {
            return true;
        }
        synchronized (R2.class) {
            try {
                if (f16431b) {
                    return true;
                }
                boolean e8 = e(context);
                if (e8) {
                    f16431b = e8;
                }
                return e8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean e(Context context) {
        boolean z8;
        boolean isUserUnlocked;
        Object systemService;
        boolean z9 = true;
        int i8 = 1;
        while (true) {
            z8 = false;
            if (i8 > 2) {
                break;
            }
            if (f16430a == null) {
                systemService = context.getSystemService((Class<Object>) UserManager.class);
                f16430a = (UserManager) systemService;
            }
            UserManager userManager = f16430a;
            if (userManager == null) {
                return true;
            }
            try {
                isUserUnlocked = userManager.isUserUnlocked();
                if (isUserUnlocked) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z9 = false;
                }
            } catch (NullPointerException e8) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e8);
                f16430a = null;
                i8++;
            }
        }
        z8 = z9;
        if (z8) {
            f16430a = null;
        }
        return z8;
    }
}
