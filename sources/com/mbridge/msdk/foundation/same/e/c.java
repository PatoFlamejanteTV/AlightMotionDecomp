package com.mbridge.msdk.foundation.same.e;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ThreadPoolExecutor f20800a;

    private static int a(int i8, String str) {
        try {
            int a9 = af.a().a(str, i8);
            return a9 <= 0 ? i8 : a9;
        } catch (Exception e8) {
            if (!MBridgeConstans.DEBUG) {
                return i8;
            }
            ad.b("CommonTaskLoaderThreadPool", e8.getMessage());
            return i8;
        }
    }

    public static ThreadPoolExecutor a() {
        if (f20800a == null) {
            int a9 = a(10, "c_t_l_t_p_c");
            int a10 = a(50, "c_t_l_t_p_m");
            int a11 = a(5, "c_t_l_t_p_t");
            int i8 = a10 < a9 ? a9 : a10;
            try {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonTaskLoaderThreadPool", "create ThreadPoolExecutor for core " + a9 + " max " + i8 + " timeout " + a11);
                }
                f20800a = new ThreadPoolExecutor(a9, i8, a11, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.e.c.1
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        Thread thread = new Thread(runnable);
                        thread.setName("mb-task-loader-thread");
                        return thread;
                    }
                }, new ThreadPoolExecutor.DiscardPolicy());
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonTaskLoaderThreadPool", "create ThreadPoolExecutor failed ", e8);
                }
            }
        }
        if (f20800a == null) {
            int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
            f20800a = new ThreadPoolExecutor(availableProcessors, availableProcessors, 5L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.e.c.1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable);
                    thread.setName("mb-task-loader-thread");
                    return thread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        f20800a.allowCoreThreadTimeOut(true);
        return f20800a;
    }
}
