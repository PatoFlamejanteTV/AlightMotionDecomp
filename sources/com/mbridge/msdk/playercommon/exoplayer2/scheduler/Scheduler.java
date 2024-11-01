package com.mbridge.msdk.playercommon.exoplayer2.scheduler;

/* loaded from: classes4.dex */
public interface Scheduler {
    public static final boolean DEBUG = false;

    boolean cancel();

    boolean schedule(Requirements requirements, String str, String str2);
}
