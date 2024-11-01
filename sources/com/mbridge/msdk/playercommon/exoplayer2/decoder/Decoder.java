package com.mbridge.msdk.playercommon.exoplayer2.decoder;

import java.lang.Exception;

/* loaded from: classes4.dex */
public interface Decoder<I, O, E extends Exception> {
    I dequeueInputBuffer() throws Exception;

    O dequeueOutputBuffer() throws Exception;

    void flush();

    String getName();

    void queueInputBuffer(I i8) throws Exception;

    void release();
}
