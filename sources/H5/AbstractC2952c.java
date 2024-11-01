package h5;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: h5.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2952c {
    public static final PackageInfo a(PackageManager packageManager, String packageName, int i8) {
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
