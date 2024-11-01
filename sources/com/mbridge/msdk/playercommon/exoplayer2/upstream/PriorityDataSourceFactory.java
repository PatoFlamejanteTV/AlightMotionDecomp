package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.PriorityTaskManager;

/* loaded from: classes4.dex */
public final class PriorityDataSourceFactory implements DataSource.Factory {
    private final int priority;
    private final PriorityTaskManager priorityTaskManager;
    private final DataSource.Factory upstreamFactory;

    public PriorityDataSourceFactory(DataSource.Factory factory, PriorityTaskManager priorityTaskManager, int i8) {
        this.upstreamFactory = factory;
        this.priorityTaskManager = priorityTaskManager;
        this.priority = i8;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource.Factory
    public final PriorityDataSource createDataSource() {
        return new PriorityDataSource(this.upstreamFactory.createDataSource(), this.priorityTaskManager, this.priority);
    }
}
