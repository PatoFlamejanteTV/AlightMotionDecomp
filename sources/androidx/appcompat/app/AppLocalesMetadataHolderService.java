package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.IBinder;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class AppLocalesMetadataHolderService extends Service {

    @RequiresApi(24)
    /* loaded from: classes.dex */
    private static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static int getDisabledComponentFlag() {
            return 512;
        }
    }

    @NonNull
    public static ServiceInfo getServiceInfo(@NonNull Context context) throws PackageManager.NameNotFoundException {
        int i8;
        if (Build.VERSION.SDK_INT >= 24) {
            i8 = Api24Impl.getDisabledComponentFlag() | 128;
        } else {
            i8 = 640;
        }
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), i8);
    }

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@NonNull Intent intent) {
        throw new UnsupportedOperationException();
    }
}
