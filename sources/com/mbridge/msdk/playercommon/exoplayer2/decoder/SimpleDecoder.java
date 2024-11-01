package com.mbridge.msdk.playercommon.exoplayer2.decoder;

import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.OutputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.lang.Exception;
import java.util.ArrayDeque;

/* loaded from: classes4.dex */
public abstract class SimpleDecoder<I extends DecoderInputBuffer, O extends OutputBuffer, E extends Exception> implements Decoder<I, O, E> {
    private int availableInputBufferCount;
    private final I[] availableInputBuffers;
    private int availableOutputBufferCount;
    private final O[] availableOutputBuffers;
    private final Thread decodeThread;
    private I dequeuedInputBuffer;
    private E exception;
    private boolean flushed;
    private final Object lock = new Object();
    private final ArrayDeque<I> queuedInputBuffers = new ArrayDeque<>();
    private final ArrayDeque<O> queuedOutputBuffers = new ArrayDeque<>();
    private boolean released;
    private int skippedOutputBufferCount;

    /* JADX INFO: Access modifiers changed from: protected */
    public SimpleDecoder(I[] iArr, O[] oArr) {
        this.availableInputBuffers = iArr;
        this.availableInputBufferCount = iArr.length;
        for (int i8 = 0; i8 < this.availableInputBufferCount; i8++) {
            this.availableInputBuffers[i8] = createInputBuffer();
        }
        this.availableOutputBuffers = oArr;
        this.availableOutputBufferCount = oArr.length;
        for (int i9 = 0; i9 < this.availableOutputBufferCount; i9++) {
            this.availableOutputBuffers[i9] = createOutputBuffer();
        }
        Thread thread = new Thread() { // from class: com.mbridge.msdk.playercommon.exoplayer2.decoder.SimpleDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                SimpleDecoder.this.run();
            }
        };
        this.decodeThread = thread;
        thread.start();
    }

    private boolean canDecodeBuffer() {
        if (!this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0) {
            return true;
        }
        return false;
    }

    private boolean decode() throws InterruptedException {
        synchronized (this.lock) {
            while (!this.released && !canDecodeBuffer()) {
                try {
                    this.lock.wait();
                } finally {
                }
            }
            if (this.released) {
                return false;
            }
            I removeFirst = this.queuedInputBuffers.removeFirst();
            O[] oArr = this.availableOutputBuffers;
            int i8 = this.availableOutputBufferCount - 1;
            this.availableOutputBufferCount = i8;
            O o8 = oArr[i8];
            boolean z8 = this.flushed;
            this.flushed = false;
            if (removeFirst.isEndOfStream()) {
                o8.addFlag(4);
            } else {
                if (removeFirst.isDecodeOnly()) {
                    o8.addFlag(Integer.MIN_VALUE);
                }
                try {
                    this.exception = decode(removeFirst, o8, z8);
                } catch (OutOfMemoryError e8) {
                    this.exception = createUnexpectedDecodeException(e8);
                } catch (RuntimeException e9) {
                    this.exception = createUnexpectedDecodeException(e9);
                }
                if (this.exception != null) {
                    synchronized (this.lock) {
                    }
                    return false;
                }
            }
            synchronized (this.lock) {
                try {
                    if (this.flushed) {
                        releaseOutputBufferInternal(o8);
                    } else if (o8.isDecodeOnly()) {
                        this.skippedOutputBufferCount++;
                        releaseOutputBufferInternal(o8);
                    } else {
                        o8.skippedOutputBufferCount = this.skippedOutputBufferCount;
                        this.skippedOutputBufferCount = 0;
                        this.queuedOutputBuffers.addLast(o8);
                    }
                    releaseInputBufferInternal(removeFirst);
                } finally {
                }
            }
            return true;
        }
    }

    private void maybeNotifyDecodeLoop() {
        if (canDecodeBuffer()) {
            this.lock.notify();
        }
    }

    private void maybeThrowException() throws Exception {
        E e8 = this.exception;
        if (e8 == null) {
        } else {
            throw e8;
        }
    }

    private void releaseInputBufferInternal(I i8) {
        i8.clear();
        I[] iArr = this.availableInputBuffers;
        int i9 = this.availableInputBufferCount;
        this.availableInputBufferCount = i9 + 1;
        iArr[i9] = i8;
    }

    private void releaseOutputBufferInternal(O o8) {
        o8.clear();
        O[] oArr = this.availableOutputBuffers;
        int i8 = this.availableOutputBufferCount;
        this.availableOutputBufferCount = i8 + 1;
        oArr[i8] = o8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void run() {
        do {
            try {
            } catch (InterruptedException e8) {
                throw new IllegalStateException(e8);
            }
        } while (decode());
    }

    protected abstract I createInputBuffer();

    protected abstract O createOutputBuffer();

    protected abstract E createUnexpectedDecodeException(Throwable th);

    protected abstract E decode(I i8, O o8, boolean z8);

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final void flush() {
        synchronized (this.lock) {
            try {
                this.flushed = true;
                this.skippedOutputBufferCount = 0;
                I i8 = this.dequeuedInputBuffer;
                if (i8 != null) {
                    releaseInputBufferInternal(i8);
                    this.dequeuedInputBuffer = null;
                }
                while (!this.queuedInputBuffers.isEmpty()) {
                    releaseInputBufferInternal(this.queuedInputBuffers.removeFirst());
                }
                while (!this.queuedOutputBuffers.isEmpty()) {
                    releaseOutputBufferInternal(this.queuedOutputBuffers.removeFirst());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public void release() {
        synchronized (this.lock) {
            this.released = true;
            this.lock.notify();
        }
        try {
            this.decodeThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void releaseOutputBuffer(O o8) {
        synchronized (this.lock) {
            releaseOutputBufferInternal(o8);
            maybeNotifyDecodeLoop();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setInitialInputBufferSize(int i8) {
        boolean z8;
        if (this.availableInputBufferCount == this.availableInputBuffers.length) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        for (I i9 : this.availableInputBuffers) {
            i9.ensureSpaceForWrite(i8);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final I dequeueInputBuffer() throws Exception {
        I i8;
        synchronized (this.lock) {
            maybeThrowException();
            Assertions.checkState(this.dequeuedInputBuffer == null);
            int i9 = this.availableInputBufferCount;
            if (i9 == 0) {
                i8 = null;
            } else {
                I[] iArr = this.availableInputBuffers;
                int i10 = i9 - 1;
                this.availableInputBufferCount = i10;
                i8 = iArr[i10];
            }
            this.dequeuedInputBuffer = i8;
        }
        return i8;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final O dequeueOutputBuffer() throws Exception {
        synchronized (this.lock) {
            try {
                maybeThrowException();
                if (this.queuedOutputBuffers.isEmpty()) {
                    return null;
                }
                return this.queuedOutputBuffers.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final void queueInputBuffer(I i8) throws Exception {
        synchronized (this.lock) {
            maybeThrowException();
            Assertions.checkArgument(i8 == this.dequeuedInputBuffer);
            this.queuedInputBuffers.addLast(i8);
            maybeNotifyDecodeLoop();
            this.dequeuedInputBuffer = null;
        }
    }
}
