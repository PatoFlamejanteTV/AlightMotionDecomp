package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import q0.InterfaceC3622h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class Q {
    private static SharedPreferences b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Context context) {
        return b(context).getBoolean("proxy_notification_initialized", false);
    }

    static boolean d(SharedPreferences sharedPreferences, boolean z8) {
        if (!sharedPreferences.contains("proxy_retention") || sharedPreferences.getBoolean("proxy_retention", false) != z8) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(Context context, boolean z8) {
        SharedPreferences.Editor edit = b(context).edit();
        edit.putBoolean("proxy_notification_initialized", z8);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(final Context context, D d8, final boolean z8) {
        if (V.k.j() && !d(b(context), z8)) {
            d8.k(z8).f(new androidx.privacysandbox.ads.adservices.adid.g(), new InterfaceC3622h() { // from class: com.google.firebase.messaging.P
                @Override // q0.InterfaceC3622h
                public final void a(Object obj) {
                    Q.h(context, z8);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(Context context, boolean z8) {
        SharedPreferences.Editor edit = b(context).edit();
        edit.putBoolean("proxy_retention", z8);
        edit.apply();
    }
}
