package S4;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class r {
    public static final ApplicationInfo a(PackageManager packageManager, String packageName, int i8) {
        PackageManager.ApplicationInfoFlags of;
        ApplicationInfo applicationInfo;
        AbstractC3292y.i(packageManager, "<this>");
        AbstractC3292y.i(packageName, "packageName");
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.ApplicationInfoFlags.of(i8);
            applicationInfo = packageManager.getApplicationInfo(packageName, of);
            AbstractC3292y.h(applicationInfo, "{\n        getApplication…of(flags.toLong()))\n    }");
            return applicationInfo;
        }
        ApplicationInfo applicationInfo2 = packageManager.getApplicationInfo(packageName, i8);
        AbstractC3292y.h(applicationInfo2, "{\n        getApplication…packageName, flags)\n    }");
        return applicationInfo2;
    }

    public static final List b(PackageManager packageManager, int i8) {
        PackageManager.ApplicationInfoFlags of;
        List installedApplications;
        AbstractC3292y.i(packageManager, "<this>");
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.ApplicationInfoFlags.of(i8);
            installedApplications = packageManager.getInstalledApplications(of);
            AbstractC3292y.h(installedApplications, "{\n        getInstalledAp…of(flags.toLong()))\n    }");
            return installedApplications;
        }
        List<ApplicationInfo> installedApplications2 = packageManager.getInstalledApplications(i8);
        AbstractC3292y.h(installedApplications2, "{\n        getInstalledApplications(flags)\n    }");
        return installedApplications2;
    }

    public static final PackageInfo c(PackageManager packageManager, String absolutePath, int i8) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageArchiveInfo;
        AbstractC3292y.i(packageManager, "<this>");
        AbstractC3292y.i(absolutePath, "absolutePath");
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.PackageInfoFlags.of(i8);
            packageArchiveInfo = packageManager.getPackageArchiveInfo(absolutePath, of);
            return packageArchiveInfo;
        }
        return packageManager.getPackageArchiveInfo(absolutePath, i8);
    }

    public static final PackageInfo d(PackageManager packageManager, String packageName, int i8) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        AbstractC3292y.i(packageManager, "<this>");
        AbstractC3292y.i(packageName, "packageName");
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.PackageInfoFlags.of(i8);
            packageInfo = packageManager.getPackageInfo(packageName, of);
            AbstractC3292y.h(packageInfo, "{\n        getPackageInfo…of(flags.toLong()))\n    }");
            return packageInfo;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(packageName, i8);
        AbstractC3292y.h(packageInfo2, "{\n        getPackageInfo(packageName, flags)\n    }");
        return packageInfo2;
    }
}
