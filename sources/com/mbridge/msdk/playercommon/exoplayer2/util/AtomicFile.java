package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class AtomicFile {
    private static final String TAG = "AtomicFile";
    private final File backupName;
    private final File baseName;

    /* loaded from: classes4.dex */
    private static final class AtomicFileOutputStream extends OutputStream {
        private boolean closed = false;
        private final FileOutputStream fileOutputStream;

        public AtomicFileOutputStream(File file) throws FileNotFoundException {
            this.fileOutputStream = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            flush();
            try {
                this.fileOutputStream.getFD().sync();
            } catch (IOException e8) {
                Log.w(AtomicFile.TAG, "Failed to sync file descriptor:", e8);
            }
            this.fileOutputStream.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.fileOutputStream.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i8) throws IOException {
            this.fileOutputStream.write(i8);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.fileOutputStream.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i8, int i9) throws IOException {
            this.fileOutputStream.write(bArr, i8, i9);
        }
    }

    public AtomicFile(File file) {
        this.baseName = file;
        this.backupName = new File(file.getPath() + ".bak");
    }

    private void restoreBackup() {
        if (this.backupName.exists()) {
            this.baseName.delete();
            this.backupName.renameTo(this.baseName);
        }
    }

    public final void delete() {
        this.baseName.delete();
        this.backupName.delete();
    }

    public final void endWrite(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.backupName.delete();
    }

    public final InputStream openRead() throws FileNotFoundException {
        restoreBackup();
        return new FileInputStream(this.baseName);
    }

    public final OutputStream startWrite() throws IOException {
        if (this.baseName.exists()) {
            if (!this.backupName.exists()) {
                if (!this.baseName.renameTo(this.backupName)) {
                    Log.w(TAG, "Couldn't rename file " + this.baseName + " to backup file " + this.backupName);
                }
            } else {
                this.baseName.delete();
            }
        }
        try {
            return new AtomicFileOutputStream(this.baseName);
        } catch (FileNotFoundException e8) {
            if (this.baseName.getParentFile().mkdirs()) {
                try {
                    return new AtomicFileOutputStream(this.baseName);
                } catch (FileNotFoundException e9) {
                    throw new IOException("Couldn't create " + this.baseName, e9);
                }
            }
            throw new IOException("Couldn't create directory " + this.baseName, e8);
        }
    }
}
