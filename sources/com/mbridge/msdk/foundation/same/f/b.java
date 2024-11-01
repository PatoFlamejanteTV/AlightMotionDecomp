package com.mbridge.msdk.foundation.same.f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static ThreadPoolExecutor f20804a;

    /* renamed from: b, reason: collision with root package name */
    private static ThreadPoolExecutor f20805b;

    /* renamed from: c, reason: collision with root package name */
    private static ThreadPoolExecutor f20806c;

    /* renamed from: d, reason: collision with root package name */
    private static ThreadPoolExecutor f20807d;

    /* renamed from: e, reason: collision with root package name */
    private static Handler f20808e;

    /* renamed from: f, reason: collision with root package name */
    private static ThreadPoolExecutor f20809f;

    /* renamed from: g, reason: collision with root package name */
    private static ThreadPoolExecutor f20810g;

    /* renamed from: h, reason: collision with root package name */
    private static ThreadPoolExecutor f20811h;

    /* loaded from: classes4.dex */
    private static class a extends Handler {
        public a() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
        }
    }

    public static ThreadPoolExecutor a() {
        if (f20805b == null) {
            f20805b = new ThreadPoolExecutor(2, 5, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(10), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.b.1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("BitmapThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f20805b;
    }

    public static ThreadPoolExecutor b() {
        if (f20804a == null) {
            f20804a = new ThreadPoolExecutor(5, 15, 15L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(100), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.b.2
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("CommonThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f20804a;
    }

    public static ThreadPoolExecutor c() {
        if (f20806c == null) {
            ThreadFactory threadFactory = new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.b.3
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("mb-image-download-tread");
                    return newThread;
                }
            };
            int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
            f20806c = new ThreadPoolExecutor(availableProcessors, availableProcessors, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(30), threadFactory, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f20806c;
    }

    public static ThreadPoolExecutor d() {
        if (f20807d == null) {
            ThreadFactory threadFactory = new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.b.4
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("mb-image-download-tread");
                    return newThread;
                }
            };
            int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
            f20807d = new ThreadPoolExecutor(availableProcessors, availableProcessors, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(30), threadFactory, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f20807d;
    }

    public static Handler e() {
        if (f20808e == null) {
            f20808e = new a();
        }
        return f20808e;
    }

    public static ThreadPoolExecutor f() {
        if (f20809f == null) {
            f20809f = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(1), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.b.5
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("NwtThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f20809f;
    }

    public static ThreadPoolExecutor g() {
        if (f20810g == null) {
            f20810g = new ThreadPoolExecutor(5, 15, 5L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(100), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.b.6
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                    newThread.setName("ReportThreadPool");
                    return newThread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f20810g;
    }

    public static ThreadPoolExecutor h() {
        if (f20811h == null) {
            ThreadFactory threadFactory = new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.f.b.7
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable);
                    thread.setName("rv-load-tread");
                    return thread;
                }
            };
            int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
            f20811h = new ThreadPoolExecutor(availableProcessors, availableProcessors * 2, 5L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(30), threadFactory, new ThreadPoolExecutor.DiscardPolicy());
        }
        return f20811h;
    }
}
