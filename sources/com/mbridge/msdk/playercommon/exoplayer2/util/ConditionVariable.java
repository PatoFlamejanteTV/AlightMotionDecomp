package com.mbridge.msdk.playercommon.exoplayer2.util;

/* loaded from: classes4.dex */
public final class ConditionVariable {
    private boolean isOpen;

    public final synchronized void block() throws InterruptedException {
        while (!this.isOpen) {
            wait();
        }
    }

    public final synchronized boolean close() {
        boolean z8;
        z8 = this.isOpen;
        this.isOpen = false;
        return z8;
    }

    public final synchronized boolean open() {
        if (this.isOpen) {
            return false;
        }
        this.isOpen = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean block(long j8) throws InterruptedException {
        boolean z8;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j9 = j8 + elapsedRealtime;
        while (true) {
            z8 = this.isOpen;
            if (z8 || elapsedRealtime >= j9) {
                break;
            }
            wait(j9 - elapsedRealtime);
            elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        }
        return z8;
    }
}
