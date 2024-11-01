package com.mbridge.msdk.playercommon.exoplayer2;

/* loaded from: classes4.dex */
public interface ControlDispatcher {
    boolean dispatchSeekTo(Player player, int i8, long j8);

    boolean dispatchSetPlayWhenReady(Player player, boolean z8);

    boolean dispatchSetRepeatMode(Player player, int i8);

    boolean dispatchSetShuffleModeEnabled(Player player, boolean z8);

    boolean dispatchStop(Player player, boolean z8);
}
