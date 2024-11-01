package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSink;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.FileDataSourceFactory;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;

/* loaded from: classes4.dex */
public final class CacheDataSourceFactory implements DataSource.Factory {
    private final Cache cache;
    private final DataSource.Factory cacheReadDataSourceFactory;
    private final DataSink.Factory cacheWriteDataSinkFactory;
    private final CacheDataSource.EventListener eventListener;
    private final int flags;
    private final DataSource.Factory upstreamFactory;

    public CacheDataSourceFactory(Cache cache, DataSource.Factory factory) {
        this(cache, factory, 0);
    }

    public CacheDataSourceFactory(Cache cache, DataSource.Factory factory, int i8) {
        this(cache, factory, i8, CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource.Factory
    public final CacheDataSource createDataSource() {
        Cache cache = this.cache;
        DataSource createDataSource = this.upstreamFactory.createDataSource();
        DataSource createDataSource2 = this.cacheReadDataSourceFactory.createDataSource();
        DataSink.Factory factory = this.cacheWriteDataSinkFactory;
        return new CacheDataSource(cache, createDataSource, createDataSource2, factory != null ? factory.createDataSink() : null, this.flags, this.eventListener);
    }

    public CacheDataSourceFactory(Cache cache, DataSource.Factory factory, int i8, long j8) {
        this(cache, factory, new FileDataSourceFactory(), new CacheDataSinkFactory(cache, j8), i8, null);
    }

    public CacheDataSourceFactory(Cache cache, DataSource.Factory factory, DataSource.Factory factory2, DataSink.Factory factory3, int i8, CacheDataSource.EventListener eventListener) {
        this.cache = cache;
        this.upstreamFactory = factory;
        this.cacheReadDataSourceFactory = factory2;
        this.cacheWriteDataSinkFactory = factory3;
        this.flags = i8;
        this.eventListener = eventListener;
    }
}
