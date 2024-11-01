package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes3.dex */
final class LogWriter extends Writer {
    private StringBuilder mBuilder = new StringBuilder(128);
    private final String mTag;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LogWriter(String str) {
        this.mTag = str;
    }

    private void flushBuilder() {
        if (this.mBuilder.length() > 0) {
            Log.d(this.mTag, this.mBuilder.toString());
            StringBuilder sb = this.mBuilder;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        flushBuilder();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        flushBuilder();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i8, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            char c8 = cArr[i8 + i10];
            if (c8 == '\n') {
                flushBuilder();
            } else {
                this.mBuilder.append(c8);
            }
        }
    }
}
