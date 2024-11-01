package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* loaded from: classes3.dex */
class BenchmarkOperation {

    @RequiresApi(api = 21)
    /* loaded from: classes3.dex */
    private static class Api21ContextHelper {
        private Api21ContextHelper() {
        }

        static File getCodeCacheDir(Context context) {
            return context.getCodeCacheDir();
        }
    }

    @RequiresApi(api = 24)
    /* loaded from: classes3.dex */
    private static class Api24ContextHelper {
        private Api24ContextHelper() {
        }

        static File getDeviceProtectedCodeCacheDir(Context context) {
            Context createDeviceProtectedStorageContext;
            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            return createDeviceProtectedStorageContext.getCodeCacheDir();
        }
    }

    private BenchmarkOperation() {
    }

    static boolean deleteFilesRecursively(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z8 = true;
            for (File file2 : listFiles) {
                if (deleteFilesRecursively(file2) && z8) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
            return z8;
        }
        file.delete();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void dropShaderCache(@NonNull Context context, @NonNull ProfileInstallReceiver.ResultDiagnostics resultDiagnostics) {
        File cacheDir;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 24) {
            cacheDir = Api24ContextHelper.getDeviceProtectedCodeCacheDir(context);
        } else if (i8 >= 23) {
            cacheDir = Api21ContextHelper.getCodeCacheDir(context);
        } else {
            cacheDir = context.getCacheDir();
        }
        if (deleteFilesRecursively(cacheDir)) {
            resultDiagnostics.onResultReceived(14, null);
        } else {
            resultDiagnostics.onResultReceived(15, null);
        }
    }
}
