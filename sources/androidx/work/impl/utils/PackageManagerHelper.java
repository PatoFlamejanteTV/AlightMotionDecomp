package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.work.Logger;

/* loaded from: classes3.dex */
public class PackageManagerHelper {
    private static final String TAG = Logger.tagWithPrefix("PackageManagerHelper");

    private PackageManagerHelper() {
    }

    private static int getComponentEnabledSetting(@NonNull Context context, @NonNull String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    private static boolean isComponentEnabled(int i8, boolean z8) {
        return i8 == 0 ? z8 : i8 == 1;
    }

    public static boolean isComponentExplicitlyEnabled(@NonNull Context context, @NonNull Class<?> cls) {
        return isComponentEnabled(getComponentEnabledSetting(context, cls.getName()), false);
    }

    public static void setComponentEnabled(@NonNull Context context, @NonNull Class<?> cls, boolean z8) {
        int i8;
        String str;
        String str2 = "disabled";
        try {
            if (z8 == isComponentEnabled(getComponentEnabledSetting(context, cls.getName()), false)) {
                Logger.get().debug(TAG, "Skipping component enablement for " + cls.getName());
                return;
            }
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z8) {
                i8 = 1;
            } else {
                i8 = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i8, 1);
            Logger logger = Logger.get();
            String str3 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            if (!z8) {
                str = "disabled";
            } else {
                str = "enabled";
            }
            sb.append(str);
            logger.debug(str3, sb.toString());
        } catch (Exception e8) {
            Logger logger2 = Logger.get();
            String str4 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            if (z8) {
                str2 = "enabled";
            }
            sb2.append(str2);
            logger2.debug(str4, sb2.toString(), e8);
        }
    }

    public static boolean isComponentExplicitlyEnabled(@NonNull Context context, @NonNull String str) {
        return getComponentEnabledSetting(context, str) == 1;
    }
}
