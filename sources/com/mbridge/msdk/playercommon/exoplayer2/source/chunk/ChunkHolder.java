package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

/* loaded from: classes4.dex */
public final class ChunkHolder {
    public Chunk chunk;
    public boolean endOfStream;

    public final void clear() {
        this.chunk = null;
        this.endOfStream = false;
    }
}
