package com.mbridge.msdk.playercommon.exoplayer2.offline;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSink;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DummyDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.FileDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.PriorityDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSink;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager;

/* loaded from: classes4.dex */
public final class DownloaderConstructorHelper {
    private final Cache cache;
    private final DataSource.Factory cacheReadDataSourceFactory;
    private final DataSink.Factory cacheWriteDataSinkFactory;
    private final PriorityTaskManager priorityTaskManager;
    private final DataSource.Factory upstreamDataSourceFactory;

    public DownloaderConstructorHelper(Cache cache, DataSource.Factory factory) {
        this(cache, factory, null, null, null);
    }

    public final CacheDataSource buildCacheDataSource(boolean z8) {
        DataSource fileDataSource;
        DataSink cacheDataSink;
        DataSource priorityDataSource;
        DataSource.Factory factory = this.cacheReadDataSourceFactory;
        if (factory != null) {
            fileDataSource = factory.createDataSource();
        } else {
            fileDataSource = new FileDataSource();
        }
        DataSource dataSource = fileDataSource;
        if (z8) {
            return new CacheDataSource(this.cache, DummyDataSource.INSTANCE, dataSource, null, 1, null);
        }
        DataSink.Factory factory2 = this.cacheWriteDataSinkFactory;
        if (factory2 != null) {
            cacheDataSink = factory2.createDataSink();
        } else {
            cacheDataSink = new CacheDataSink(this.cache, CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE);
        }
        DataSink dataSink = cacheDataSink;
        DataSource createDataSource = this.upstreamDataSourceFactory.createDataSource();
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager == null) {
            priorityDataSource = createDataSource;
        } else {
            priorityDataSource = new PriorityDataSource(createDataSource, priorityTaskManager, -1000);
        }
        return new CacheDataSource(this.cache, priorityDataSource, dataSource, dataSink, 1, null);
    }

    public final Cache getCache() {
        return this.cache;
    }

    public final PriorityTaskManager getPriorityTaskManager() {
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager == null) {
            return new PriorityTaskManager();
        }
        return priorityTaskManager;
    }

    public DownloaderConstructorHelper(Cache cache, DataSource.Factory factory, DataSource.Factory factory2, DataSink.Factory factory3, PriorityTaskManager priorityTaskManager) {
        Assertions.checkNotNull(factory);
        this.cache = cache;
        this.upstreamDataSourceFactory = factory;
        this.cacheReadDataSourceFactory = factory2;
        this.cacheWriteDataSinkFactory = factory3;
        this.priorityTaskManager = priorityTaskManager;
    }
}
