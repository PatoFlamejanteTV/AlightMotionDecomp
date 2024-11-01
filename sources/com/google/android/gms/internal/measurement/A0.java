package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class A0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Method f16220b = e();

    /* renamed from: c, reason: collision with root package name */
    private static final Method f16221c = d();

    /* renamed from: a, reason: collision with root package name */
    private final JobScheduler f16222a;

    private A0(JobScheduler jobScheduler) {
        this.f16222a = jobScheduler;
    }

    private static int a() {
        Method method = f16221c;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(UserHandle.class, null);
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            } catch (IllegalAccessException | InvocationTargetException e8) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e8);
                }
            }
        }
        return 0;
    }

    private final int b(JobInfo jobInfo, String str, int i8, String str2) {
        Method method = f16220b;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(this.f16222a, jobInfo, str, Integer.valueOf(i8), str2);
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            } catch (IllegalAccessException | InvocationTargetException e8) {
                Log.e(str2, "error calling scheduleAsPackage", e8);
            }
        }
        return this.f16222a.schedule(jobInfo);
    }

    public static int c(Context context, JobInfo jobInfo, String str, String str2) {
        int checkSelfPermission;
        JobScheduler jobScheduler = (JobScheduler) w0.h.i((JobScheduler) context.getSystemService("jobscheduler"));
        if (f16220b != null) {
            checkSelfPermission = context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS");
            if (checkSelfPermission == 0) {
                return new A0(jobScheduler).b(jobInfo, str, a(), str2);
            }
        }
        return jobScheduler.schedule(jobInfo);
    }

    private static Method d() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No myUserId method available");
                }
            }
        }
        return null;
    }

    private static Method e() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
                    return null;
                }
                return null;
            }
        }
        return null;
    }
}
