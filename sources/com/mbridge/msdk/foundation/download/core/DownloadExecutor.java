package com.mbridge.msdk.foundation.download.core;

import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class DownloadExecutor extends ThreadPoolExecutor {
    /* JADX INFO: Access modifiers changed from: package-private */
    public DownloadExecutor(int i8, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i8, i8 * 2, 15L, TimeUnit.MICROSECONDS, new PriorityBlockingQueue(), threadFactory, rejectedExecutionHandler);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        DownloadFutureTask downloadFutureTask = new DownloadFutureTask((Downloader) runnable);
        execute(downloadFutureTask);
        return downloadFutureTask;
    }
}
