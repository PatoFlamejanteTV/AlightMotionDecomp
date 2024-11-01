package com.mbridge.msdk.playercommon.exoplayer2.util;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* loaded from: classes4.dex */
public final class PriorityTaskManager {
    private final Object lock = new Object();
    private final PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder());
    private int highestPriority = Integer.MIN_VALUE;

    /* loaded from: classes4.dex */
    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i8, int i9) {
            super("Priority too low [priority=" + i8 + ", highest=" + i9 + "]");
        }
    }

    public final void add(int i8) {
        synchronized (this.lock) {
            this.queue.add(Integer.valueOf(i8));
            this.highestPriority = Math.max(this.highestPriority, i8);
        }
    }

    public final void proceed(int i8) throws InterruptedException {
        synchronized (this.lock) {
            while (this.highestPriority != i8) {
                try {
                    this.lock.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean proceedNonBlocking(int i8) {
        boolean z8;
        synchronized (this.lock) {
            if (this.highestPriority == i8) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }

    public final void proceedOrThrow(int i8) throws PriorityTooLowException {
        synchronized (this.lock) {
            try {
                if (this.highestPriority != i8) {
                    throw new PriorityTooLowException(i8, this.highestPriority);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void remove(int i8) {
        int intValue;
        synchronized (this.lock) {
            this.queue.remove(Integer.valueOf(i8));
            if (this.queue.isEmpty()) {
                intValue = Integer.MIN_VALUE;
            } else {
                intValue = this.queue.peek().intValue();
            }
            this.highestPriority = intValue;
            this.lock.notifyAll();
        }
    }
}
