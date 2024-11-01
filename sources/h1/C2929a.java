package h1;

import Z0.c;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.ContextCompat;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2929a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f32494a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f32495b;

    /* renamed from: c, reason: collision with root package name */
    private final c f32496c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f32497d;

    public C2929a(Context context, String str, c cVar) {
        Context a9 = a(context);
        this.f32494a = a9;
        this.f32495b = a9.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f32496c = cVar;
        this.f32497d = c();
    }

    private static Context a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return context;
        }
        return ContextCompat.createDeviceProtectedStorageContext(context);
    }

    private boolean c() {
        if (this.f32495b.contains("firebase_data_collection_default_enabled")) {
            return this.f32495b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f32494a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.f32494a.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.f32497d;
    }
}
