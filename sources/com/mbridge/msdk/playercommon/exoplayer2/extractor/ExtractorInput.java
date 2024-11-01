package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import java.io.IOException;

/* loaded from: classes4.dex */
public interface ExtractorInput {
    void advancePeekPosition(int i8) throws IOException, InterruptedException;

    boolean advancePeekPosition(int i8, boolean z8) throws IOException, InterruptedException;

    long getLength();

    long getPeekPosition();

    long getPosition();

    void peekFully(byte[] bArr, int i8, int i9) throws IOException, InterruptedException;

    boolean peekFully(byte[] bArr, int i8, int i9, boolean z8) throws IOException, InterruptedException;

    int read(byte[] bArr, int i8, int i9) throws IOException, InterruptedException;

    void readFully(byte[] bArr, int i8, int i9) throws IOException, InterruptedException;

    boolean readFully(byte[] bArr, int i8, int i9, boolean z8) throws IOException, InterruptedException;

    void resetPeekPosition();

    <E extends Throwable> void setRetryPosition(long j8, E e8) throws Throwable;

    int skip(int i8) throws IOException, InterruptedException;

    void skipFully(int i8) throws IOException, InterruptedException;

    boolean skipFully(int i8, boolean z8) throws IOException, InterruptedException;
}
