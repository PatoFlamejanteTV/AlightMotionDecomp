package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;

/* loaded from: classes4.dex */
public final class FileDataSourceFactory implements DataSource.Factory {
    private final TransferListener<? super FileDataSource> listener;

    public FileDataSourceFactory() {
        this(null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource.Factory
    public final DataSource createDataSource() {
        return new FileDataSource(this.listener);
    }

    public FileDataSourceFactory(TransferListener<? super FileDataSource> transferListener) {
        this.listener = transferListener;
    }
}
