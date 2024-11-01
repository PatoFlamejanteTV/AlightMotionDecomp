package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.FastKV;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    static volatile Executor f21334a;

    /* renamed from: b, reason: collision with root package name */
    static FastKV.b f21335b = new FastKV.b() { // from class: com.mbridge.msdk.foundation.tools.q.1
        @Override // com.mbridge.msdk.foundation.tools.FastKV.b
        public final void a(String str, Exception exc) {
            if (MBridgeConstans.DEBUG) {
                ad.a("FastKVConfig", str, exc);
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.FastKV.b
        public final void b(String str, Exception exc) {
            if (MBridgeConstans.DEBUG) {
                ad.b("FastKVConfig", str, exc);
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.FastKV.b
        public final void a(String str, String str2) {
            if (MBridgeConstans.DEBUG) {
                ad.c("FastKVConfig", str + " " + str2);
            }
        }
    };

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor a() {
        if (f21334a == null) {
            synchronized (q.class) {
                try {
                    if (f21334a == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 10, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.tools.q.2
                            @Override // java.util.concurrent.ThreadFactory
                            public final Thread newThread(Runnable runnable) {
                                return new Thread(runnable, "mb-sp-handler");
                            }
                        }, new ThreadPoolExecutor.DiscardPolicy());
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        f21334a = threadPoolExecutor;
                    }
                } finally {
                }
            }
        }
        return f21334a;
    }
}
