package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class I {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18551a;

    /* renamed from: b, reason: collision with root package name */
    private String f18552b;

    /* renamed from: c, reason: collision with root package name */
    private String f18553c;

    /* renamed from: d, reason: collision with root package name */
    private int f18554d;

    /* renamed from: e, reason: collision with root package name */
    private int f18555e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I(Context context) {
        this.f18551a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(A0.f fVar) {
        String d8 = fVar.n().d();
        if (d8 != null) {
            return d8;
        }
        String c8 = fVar.n().c();
        if (!c8.startsWith("1:")) {
            return c8;
        }
        String[] split = c8.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.f18551a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e8) {
            Log.w("FirebaseMessaging", "Failed to find package " + e8);
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f8 = f(this.f18551a.getPackageName());
        if (f8 != null) {
            this.f18552b = Integer.toString(f8.versionCode);
            this.f18553c = f8.versionName;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String a() {
        try {
            if (this.f18552b == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f18552b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String b() {
        try {
            if (this.f18553c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f18553c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized int d() {
        PackageInfo f8;
        try {
            if (this.f18554d == 0 && (f8 = f("com.google.android.gms")) != null) {
                this.f18554d = f8.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f18554d;
    }

    synchronized int e() {
        int i8 = this.f18555e;
        if (i8 != 0) {
            return i8;
        }
        PackageManager packageManager = this.f18551a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!V.k.h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f18555e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f18555e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (V.k.h()) {
            this.f18555e = 2;
        } else {
            this.f18555e = 1;
        }
        return this.f18555e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        if (e() != 0) {
            return true;
        }
        return false;
    }
}
