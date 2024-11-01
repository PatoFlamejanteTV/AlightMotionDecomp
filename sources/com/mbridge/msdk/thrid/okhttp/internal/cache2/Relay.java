package com.mbridge.msdk.thrid.okhttp.internal.cache2;

import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okio.Buffer;
import com.mbridge.msdk.thrid.okio.ByteString;
import com.mbridge.msdk.thrid.okio.Source;
import com.mbridge.msdk.thrid.okio.Timeout;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes4.dex */
final class Relay {
    private static final long FILE_HEADER_SIZE = 32;
    static final ByteString PREFIX_CLEAN = ByteString.encodeUtf8("OkHttp cache v1\n");
    static final ByteString PREFIX_DIRTY = ByteString.encodeUtf8("OkHttp DIRTY :(\n");
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    final long bufferMaxSize;
    boolean complete;
    RandomAccessFile file;
    private final ByteString metadata;
    int sourceCount;
    Source upstream;
    long upstreamPos;
    Thread upstreamReader;
    final Buffer upstreamBuffer = new Buffer();
    final Buffer buffer = new Buffer();

    /* loaded from: classes4.dex */
    class RelaySource implements Source {
        private FileOperator fileOperator;
        private long sourcePos;
        private final Timeout timeout = new Timeout();

        RelaySource() {
            this.fileOperator = new FileOperator(Relay.this.file.getChannel());
        }

        @Override // com.mbridge.msdk.thrid.okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            synchronized (Relay.this) {
                try {
                    Relay relay = Relay.this;
                    int i8 = relay.sourceCount - 1;
                    relay.sourceCount = i8;
                    if (i8 == 0) {
                        RandomAccessFile randomAccessFile2 = relay.file;
                        relay.file = null;
                        randomAccessFile = randomAccessFile2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.Source
        public long read(Buffer buffer, long j8) throws IOException {
            Relay relay;
            if (this.fileOperator != null) {
                synchronized (Relay.this) {
                    while (true) {
                        try {
                            long j9 = this.sourcePos;
                            Relay relay2 = Relay.this;
                            long j10 = relay2.upstreamPos;
                            if (j9 == j10) {
                                if (relay2.complete) {
                                    return -1L;
                                }
                                if (relay2.upstreamReader != null) {
                                    this.timeout.waitUntilNotified(relay2);
                                } else {
                                    relay2.upstreamReader = Thread.currentThread();
                                    try {
                                        Relay relay3 = Relay.this;
                                        long read = relay3.upstream.read(relay3.upstreamBuffer, relay3.bufferMaxSize);
                                        if (read == -1) {
                                            Relay.this.commit(j10);
                                            synchronized (Relay.this) {
                                                Relay relay4 = Relay.this;
                                                relay4.upstreamReader = null;
                                                relay4.notifyAll();
                                            }
                                            return -1L;
                                        }
                                        long min = Math.min(read, j8);
                                        Relay.this.upstreamBuffer.copyTo(buffer, 0L, min);
                                        this.sourcePos += min;
                                        this.fileOperator.write(j10 + Relay.FILE_HEADER_SIZE, Relay.this.upstreamBuffer.m5462clone(), read);
                                        synchronized (Relay.this) {
                                            try {
                                                Relay relay5 = Relay.this;
                                                relay5.buffer.write(relay5.upstreamBuffer, read);
                                                long size = Relay.this.buffer.size();
                                                Relay relay6 = Relay.this;
                                                if (size > relay6.bufferMaxSize) {
                                                    Buffer buffer2 = relay6.buffer;
                                                    buffer2.skip(buffer2.size() - Relay.this.bufferMaxSize);
                                                }
                                                relay = Relay.this;
                                                relay.upstreamPos += read;
                                            } finally {
                                            }
                                        }
                                        synchronized (relay) {
                                            Relay relay7 = Relay.this;
                                            relay7.upstreamReader = null;
                                            relay7.notifyAll();
                                        }
                                        return min;
                                    } catch (Throwable th) {
                                        synchronized (Relay.this) {
                                            Relay relay8 = Relay.this;
                                            relay8.upstreamReader = null;
                                            relay8.notifyAll();
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                long size2 = j10 - relay2.buffer.size();
                                long j11 = this.sourcePos;
                                if (j11 < size2) {
                                    long min2 = Math.min(j8, j10 - j11);
                                    this.fileOperator.read(this.sourcePos + Relay.FILE_HEADER_SIZE, buffer, min2);
                                    this.sourcePos += min2;
                                    return min2;
                                }
                                long min3 = Math.min(j8, j10 - j11);
                                Relay.this.buffer.copyTo(buffer, this.sourcePos - size2, min3);
                                this.sourcePos += min3;
                                return min3;
                            }
                        } finally {
                        }
                    }
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.Source
        public Timeout timeout() {
            return this.timeout;
        }
    }

    private Relay(RandomAccessFile randomAccessFile, Source source, long j8, ByteString byteString, long j9) {
        boolean z8;
        this.file = randomAccessFile;
        this.upstream = source;
        if (source == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.complete = z8;
        this.upstreamPos = j8;
        this.metadata = byteString;
        this.bufferMaxSize = j9;
    }

    public static Relay edit(File file, Source source, ByteString byteString, long j8) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        Relay relay = new Relay(randomAccessFile, source, 0L, byteString, j8);
        randomAccessFile.setLength(0L);
        relay.writeHeader(PREFIX_DIRTY, -1L, -1L);
        return relay;
    }

    public static Relay read(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        FileOperator fileOperator = new FileOperator(randomAccessFile.getChannel());
        Buffer buffer = new Buffer();
        fileOperator.read(0L, buffer, FILE_HEADER_SIZE);
        if (buffer.readByteString(r2.size()).equals(PREFIX_CLEAN)) {
            long readLong = buffer.readLong();
            long readLong2 = buffer.readLong();
            Buffer buffer2 = new Buffer();
            fileOperator.read(readLong + FILE_HEADER_SIZE, buffer2, readLong2);
            return new Relay(randomAccessFile, null, readLong, buffer2.readByteString(), 0L);
        }
        throw new IOException("unreadable cache file");
    }

    private void writeHeader(ByteString byteString, long j8, long j9) throws IOException {
        Buffer buffer = new Buffer();
        buffer.write(byteString);
        buffer.writeLong(j8);
        buffer.writeLong(j9);
        if (buffer.size() == FILE_HEADER_SIZE) {
            new FileOperator(this.file.getChannel()).write(0L, buffer, FILE_HEADER_SIZE);
            return;
        }
        throw new IllegalArgumentException();
    }

    private void writeMetadata(long j8) throws IOException {
        Buffer buffer = new Buffer();
        buffer.write(this.metadata);
        new FileOperator(this.file.getChannel()).write(FILE_HEADER_SIZE + j8, buffer, this.metadata.size());
    }

    void commit(long j8) throws IOException {
        writeMetadata(j8);
        this.file.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j8, this.metadata.size());
        this.file.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
        }
        Util.closeQuietly(this.upstream);
        this.upstream = null;
    }

    boolean isClosed() {
        if (this.file == null) {
            return true;
        }
        return false;
    }

    public ByteString metadata() {
        return this.metadata;
    }

    public Source newSource() {
        synchronized (this) {
            try {
                if (this.file == null) {
                    return null;
                }
                this.sourceCount++;
                return new RelaySource();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
