package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkManager;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class ProcessUtils {
    private static final String TAG;

    static {
        String tagWithPrefix = Logger.tagWithPrefix("ProcessUtils");
        AbstractC3292y.h(tagWithPrefix, "tagWithPrefix(\"ProcessUtils\")");
        TAG = tagWithPrefix;
    }

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    private static final String getProcessName(Context context) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.INSTANCE.getProcessName();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, WorkManager.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, null);
            AbstractC3292y.f(invoke);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th) {
            Logger.get().debug(TAG, "Unable to check ActivityThread for processName", th);
        }
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        Iterator<T> it = runningAppProcesses.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
        if (runningAppProcessInfo == null) {
            return null;
        }
        return runningAppProcessInfo.processName;
    }

    public static final boolean isDefaultProcess(Context context, Configuration configuration) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(configuration, "configuration");
        String processName = getProcessName(context);
        String defaultProcessName = configuration.getDefaultProcessName();
        if (defaultProcessName != null && defaultProcessName.length() != 0) {
            return AbstractC3292y.d(processName, configuration.getDefaultProcessName());
        }
        return AbstractC3292y.d(processName, context.getApplicationInfo().processName);
    }
}
