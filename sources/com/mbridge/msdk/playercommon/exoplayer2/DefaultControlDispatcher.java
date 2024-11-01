package com.mbridge.msdk.playercommon.exoplayer2;

/* loaded from: classes4.dex */
public class DefaultControlDispatcher implements ControlDispatcher {
    @Override // com.mbridge.msdk.playercommon.exoplayer2.ControlDispatcher
    public boolean dispatchSeekTo(Player player, int i8, long j8) {
        player.seekTo(i8, j8);
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ControlDispatcher
    public boolean dispatchSetPlayWhenReady(Player player, boolean z8) {
        player.setPlayWhenReady(z8);
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ControlDispatcher
    public boolean dispatchSetRepeatMode(Player player, int i8) {
        player.setRepeatMode(i8);
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ControlDispatcher
    public boolean dispatchSetShuffleModeEnabled(Player player, boolean z8) {
        player.setShuffleModeEnabled(z8);
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.ControlDispatcher
    public boolean dispatchStop(Player player, boolean z8) {
        player.stop(z8);
        return true;
    }
}
