package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SegmentPool {
    static final long MAX_SIZE = 65536;
    static long byteCount;

    @Nullable
    static Segment next;

    private SegmentPool() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void recycle(Segment segment) {
        if (segment.next == null && segment.prev == null) {
            if (segment.shared) {
                return;
            }
            synchronized (SegmentPool.class) {
                try {
                    long j8 = byteCount;
                    if (j8 + 8192 > MAX_SIZE) {
                        return;
                    }
                    byteCount = j8 + 8192;
                    segment.next = next;
                    segment.limit = 0;
                    segment.pos = 0;
                    next = segment;
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Segment take() {
        synchronized (SegmentPool.class) {
            try {
                Segment segment = next;
                if (segment != null) {
                    next = segment.next;
                    segment.next = null;
                    byteCount -= 8192;
                    return segment;
                }
                return new Segment();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
