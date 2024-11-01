package com.mbridge.msdk.thrid.okhttp.internal.cache;

import com.mbridge.msdk.thrid.okio.Buffer;
import com.mbridge.msdk.thrid.okio.ForwardingSink;
import com.mbridge.msdk.thrid.okio.Sink;
import java.io.IOException;

/* loaded from: classes4.dex */
class FaultHidingSink extends ForwardingSink {
    private boolean hasErrors;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FaultHidingSink(Sink sink) {
        super(sink);
    }

    @Override // com.mbridge.msdk.thrid.okio.ForwardingSink, com.mbridge.msdk.thrid.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e8) {
            this.hasErrors = true;
            onException(e8);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.ForwardingSink, com.mbridge.msdk.thrid.okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e8) {
            this.hasErrors = true;
            onException(e8);
        }
    }

    protected void onException(IOException iOException) {
    }

    @Override // com.mbridge.msdk.thrid.okio.ForwardingSink, com.mbridge.msdk.thrid.okio.Sink
    public void write(Buffer buffer, long j8) throws IOException {
        if (this.hasErrors) {
            buffer.skip(j8);
            return;
        }
        try {
            super.write(buffer, j8);
        } catch (IOException e8) {
            this.hasErrors = true;
            onException(e8);
        }
    }
}
