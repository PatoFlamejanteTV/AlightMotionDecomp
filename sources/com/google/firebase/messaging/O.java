package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import q0.AbstractC3628n;
import q0.C3626l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class O {
    private static boolean b(Context context) {
        if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Context context) {
        if (Q.c(context)) {
            return;
        }
        f(new androidx.privacysandbox.ads.adservices.adid.g(), context, g(context));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(Context context) {
        Object systemService;
        String notificationDelegate;
        if (!V.k.j()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            }
            return false;
        }
        if (b(context)) {
            systemService = context.getSystemService((Class<Object>) NotificationManager.class);
            notificationDelegate = ((NotificationManager) systemService).getNotificationDelegate();
            if (!"com.google.android.gms".equals(notificationDelegate)) {
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "GMS core is set for proxying");
                return true;
            }
            return true;
        }
        Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Context context, boolean z8, C3626l c3626l) {
        Object systemService;
        String notificationDelegate;
        try {
            if (!b(context)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            Q.f(context, true);
            systemService = context.getSystemService((Class<Object>) NotificationManager.class);
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (z8) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else {
                notificationDelegate = notificationManager.getNotificationDelegate();
                if ("com.google.android.gms".equals(notificationDelegate)) {
                    notificationManager.setNotificationDelegate(null);
                }
            }
        } finally {
            c3626l.e(null);
        }
    }

    static Task f(Executor executor, final Context context, final boolean z8) {
        if (!V.k.j()) {
            return AbstractC3628n.e(null);
        }
        final C3626l c3626l = new C3626l();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.N
            @Override // java.lang.Runnable
            public final void run() {
                O.e(context, z8, c3626l);
            }
        });
        return c3626l.a();
    }

    private static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
