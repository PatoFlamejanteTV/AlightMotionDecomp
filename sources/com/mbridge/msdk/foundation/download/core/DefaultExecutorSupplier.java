package com.mbridge.msdk.foundation.download.core;

import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes4.dex */
public class DefaultExecutorSupplier implements ExecutorSupplier {
    private int DEFAULT_MAX_NUM_THREADS;
    private final ExecutorService backgroundExecutor;
    private final ExecutorService downloadResultExecutor;
    private final DownloadExecutor networkExecutor;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DefaultExecutorSupplier() {
        this.DEFAULT_MAX_NUM_THREADS = 10;
        g a9 = h.a().a(c.m().k());
        if (a9 != null) {
            int R8 = a9.R();
            this.DEFAULT_MAX_NUM_THREADS = R8;
            if (R8 <= 0) {
                this.DEFAULT_MAX_NUM_THREADS = 10;
            }
        }
        this.networkExecutor = new DownloadExecutor(this.DEFAULT_MAX_NUM_THREADS, new PriorityThreadFactory(10), new ThreadPoolExecutor.DiscardPolicy());
        this.backgroundExecutor = Executors.newSingleThreadExecutor();
        this.downloadResultExecutor = Executors.newSingleThreadExecutor();
    }

    @Override // com.mbridge.msdk.foundation.download.core.ExecutorSupplier
    public ExecutorService getBackgroundTasks() {
        return this.backgroundExecutor;
    }

    @Override // com.mbridge.msdk.foundation.download.core.ExecutorSupplier
    public ExecutorService getDownloadResultTasks() {
        return this.downloadResultExecutor;
    }

    @Override // com.mbridge.msdk.foundation.download.core.ExecutorSupplier
    public DownloadExecutor getDownloadTasks() {
        return this.networkExecutor;
    }

    @Override // com.mbridge.msdk.foundation.download.core.ExecutorSupplier
    public ExecutorService getLruCacheThreadTasks() {
        return this.backgroundExecutor;
    }
}
