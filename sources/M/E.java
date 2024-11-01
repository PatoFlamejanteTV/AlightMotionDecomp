package M;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* loaded from: classes3.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5440a;

    /* renamed from: b, reason: collision with root package name */
    private int f5441b;

    /* renamed from: c, reason: collision with root package name */
    private int f5442c = 0;

    public E(Context context) {
        this.f5440a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfo;
        if (this.f5441b == 0) {
            try {
                packageInfo = X.e.a(this.f5440a).e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e8) {
                Log.w("Metadata", "Failed to find package ".concat(e8.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f5441b = packageInfo.versionCode;
            }
        }
        return this.f5441b;
    }

    public final synchronized int b() {
        int i8 = this.f5442c;
        if (i8 != 0) {
            return i8;
        }
        Context context = this.f5440a;
        PackageManager packageManager = context.getPackageManager();
        if (X.e.a(context).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i9 = 1;
        if (!V.k.h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f5442c = i9;
                return i9;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i9 = 2;
            this.f5442c = i9;
            return i9;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == V.k.h()) {
            i9 = 2;
        }
        this.f5442c = i9;
        return i9;
    }
}
