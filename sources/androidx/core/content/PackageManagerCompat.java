package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.os.UserManagerCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.concurrent.Executors;
import z0.InterfaceFutureC4260d;

/* loaded from: classes.dex */
public final class PackageManagerCompat {

    @SuppressLint({"ActionValue"})
    public static final String ACTION_PERMISSION_REVOCATION_SETTINGS = "android.intent.action.AUTO_REVOKE_PERMISSIONS";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String LOG_TAG = "PackageManagerCompat";

    @RequiresApi(30)
    /* loaded from: classes.dex */
    private static class Api30Impl {
        private Api30Impl() {
        }

        static boolean areUnusedAppRestrictionsEnabled(@NonNull Context context) {
            return !context.getPackageManager().isAutoRevokeWhitelisted();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface UnusedAppRestrictionsStatus {
    }

    private PackageManagerCompat() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean areUnusedAppRestrictionsAvailable(@NonNull PackageManager packageManager) {
        boolean z8;
        boolean z9;
        boolean z10;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (i8 >= 23 && i8 < 30) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getPermissionRevocationVerifierApp(packageManager) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z8 && (!z9 || !z10)) {
            return false;
        }
        return true;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static String getPermissionRevocationVerifierApp(@NonNull PackageManager packageManager) {
        String str = null;
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(new Intent(ACTION_PERMISSION_REVOCATION_SETTINGS).setData(Uri.fromParts("package", "com.example", null)), 0).iterator();
        while (it.hasNext()) {
            String str2 = it.next().activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    @NonNull
    public static InterfaceFutureC4260d getUnusedAppRestrictionsStatus(@NonNull Context context) {
        ResolvableFuture<Integer> create = ResolvableFuture.create();
        if (!UserManagerCompat.isUserUnlocked(context)) {
            create.set(0);
            Log.e(LOG_TAG, "User is in locked direct boot mode");
            return create;
        }
        if (!areUnusedAppRestrictionsAvailable(context.getPackageManager())) {
            create.set(1);
            return create;
        }
        int i8 = context.getApplicationInfo().targetSdkVersion;
        if (i8 < 30) {
            create.set(0);
            Log.e(LOG_TAG, "Target SDK version below API 30");
            return create;
        }
        int i9 = Build.VERSION.SDK_INT;
        int i10 = 2;
        int i11 = 4;
        if (i9 >= 31) {
            if (Api30Impl.areUnusedAppRestrictionsEnabled(context)) {
                if (i8 >= 31) {
                    i11 = 5;
                }
                create.set(Integer.valueOf(i11));
            } else {
                create.set(2);
            }
            return create;
        }
        if (i9 == 30) {
            if (Api30Impl.areUnusedAppRestrictionsEnabled(context)) {
                i10 = 4;
            }
            create.set(Integer.valueOf(i10));
            return create;
        }
        final UnusedAppRestrictionsBackportServiceConnection unusedAppRestrictionsBackportServiceConnection = new UnusedAppRestrictionsBackportServiceConnection(context);
        create.addListener(new Runnable() { // from class: androidx.core.content.w
            @Override // java.lang.Runnable
            public final void run() {
                UnusedAppRestrictionsBackportServiceConnection.this.disconnectFromService();
            }
        }, Executors.newSingleThreadExecutor());
        unusedAppRestrictionsBackportServiceConnection.connectAndFetchResult(create);
        return create;
    }
}
