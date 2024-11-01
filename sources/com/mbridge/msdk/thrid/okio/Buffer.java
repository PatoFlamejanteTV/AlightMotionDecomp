package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;
import androidx.work.WorkRequest;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    private static final byte[] DIGITS = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    static final int REPLACEMENT_CHARACTER = 65533;

    @Nullable
    Segment head;
    long size;

    /* loaded from: classes4.dex */
    public static final class UnsafeCursor implements Closeable {
        public Buffer buffer;
        public byte[] data;
        public boolean readWrite;
        private Segment segment;
        public long offset = -1;
        public int start = -1;
        public int end = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer != null) {
                this.buffer = null;
                this.segment = null;
                this.offset = -1L;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        public final long expandBuffer(int i8) {
            if (i8 > 0) {
                if (i8 <= 8192) {
                    Buffer buffer = this.buffer;
                    if (buffer != null) {
                        if (this.readWrite) {
                            long j8 = buffer.size;
                            Segment writableSegment = buffer.writableSegment(i8);
                            int i9 = 8192 - writableSegment.limit;
                            writableSegment.limit = 8192;
                            long j9 = i9;
                            this.buffer.size = j8 + j9;
                            this.segment = writableSegment;
                            this.offset = j8;
                            this.data = writableSegment.data;
                            this.start = 8192 - i9;
                            this.end = 8192;
                            return j9;
                        }
                        throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
                    }
                    throw new IllegalStateException("not attached to a buffer");
                }
                throw new IllegalArgumentException("minByteCount > Segment.SIZE: " + i8);
            }
            throw new IllegalArgumentException("minByteCount <= 0: " + i8);
        }

        public final int next() {
            long j8 = this.offset;
            if (j8 != this.buffer.size) {
                if (j8 == -1) {
                    return seek(0L);
                }
                return seek(j8 + (this.end - this.start));
            }
            throw new IllegalStateException();
        }

        public final long resizeBuffer(long j8) {
            Buffer buffer = this.buffer;
            if (buffer != null) {
                if (this.readWrite) {
                    long j9 = buffer.size;
                    if (j8 <= j9) {
                        if (j8 >= 0) {
                            long j10 = j9 - j8;
                            while (true) {
                                if (j10 <= 0) {
                                    break;
                                }
                                Buffer buffer2 = this.buffer;
                                Segment segment = buffer2.head.prev;
                                int i8 = segment.limit;
                                long j11 = i8 - segment.pos;
                                if (j11 <= j10) {
                                    buffer2.head = segment.pop();
                                    SegmentPool.recycle(segment);
                                    j10 -= j11;
                                } else {
                                    segment.limit = (int) (i8 - j10);
                                    break;
                                }
                            }
                            this.segment = null;
                            this.offset = j8;
                            this.data = null;
                            this.start = -1;
                            this.end = -1;
                        } else {
                            throw new IllegalArgumentException("newSize < 0: " + j8);
                        }
                    } else if (j8 > j9) {
                        long j12 = j8 - j9;
                        boolean z8 = true;
                        while (j12 > 0) {
                            Segment writableSegment = this.buffer.writableSegment(1);
                            int min = (int) Math.min(j12, 8192 - writableSegment.limit);
                            int i9 = writableSegment.limit + min;
                            writableSegment.limit = i9;
                            j12 -= min;
                            if (z8) {
                                this.segment = writableSegment;
                                this.offset = j9;
                                this.data = writableSegment.data;
                                this.start = i9 - min;
                                this.end = i9;
                                z8 = false;
                            }
                        }
                    }
                    this.buffer.size = j8;
                    return j9;
                }
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        public final int seek(long j8) {
            if (j8 >= -1) {
                Buffer buffer = this.buffer;
                long j9 = buffer.size;
                if (j8 <= j9) {
                    if (j8 != -1 && j8 != j9) {
                        Segment segment = buffer.head;
                        Segment segment2 = this.segment;
                        long j10 = 0;
                        if (segment2 != null) {
                            long j11 = this.offset - (this.start - segment2.pos);
                            if (j11 > j8) {
                                j9 = j11;
                                segment2 = segment;
                                segment = segment2;
                            } else {
                                j10 = j11;
                            }
                        } else {
                            segment2 = segment;
                        }
                        if (j9 - j8 > j8 - j10) {
                            while (true) {
                                int i8 = segment2.limit;
                                int i9 = segment2.pos;
                                if (j8 < (i8 - i9) + j10) {
                                    break;
                                }
                                j10 += i8 - i9;
                                segment2 = segment2.next;
                            }
                        } else {
                            while (j9 > j8) {
                                segment = segment.prev;
                                j9 -= segment.limit - segment.pos;
                            }
                            segment2 = segment;
                            j10 = j9;
                        }
                        if (this.readWrite && segment2.shared) {
                            Segment unsharedCopy = segment2.unsharedCopy();
                            Buffer buffer2 = this.buffer;
                            if (buffer2.head == segment2) {
                                buffer2.head = unsharedCopy;
                            }
                            segment2 = segment2.push(unsharedCopy);
                            segment2.prev.pop();
                        }
                        this.segment = segment2;
                        this.offset = j8;
                        this.data = segment2.data;
                        int i10 = segment2.pos + ((int) (j8 - j10));
                        this.start = i10;
                        int i11 = segment2.limit;
                        this.end = i11;
                        return i11 - i10;
                    }
                    this.segment = null;
                    this.offset = j8;
                    this.data = null;
                    this.start = -1;
                    this.end = -1;
                    return -1;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", Long.valueOf(j8), Long.valueOf(this.buffer.size)));
        }
    }

    private ByteString digest(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i8 = segment.pos;
                messageDigest.update(bArr, i8, segment.limit - i8);
                Segment segment2 = this.head;
                while (true) {
                    segment2 = segment2.next;
                    if (segment2 == this.head) {
                        break;
                    }
                    byte[] bArr2 = segment2.data;
                    int i9 = segment2.pos;
                    messageDigest.update(bArr2, i9, segment2.limit - i9);
                }
            }
            return ByteString.of(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    private ByteString hmac(String str, ByteString byteString) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i8 = segment.pos;
                mac.update(bArr, i8, segment.limit - i8);
                Segment segment2 = this.head;
                while (true) {
                    segment2 = segment2.next;
                    if (segment2 == this.head) {
                        break;
                    }
                    byte[] bArr2 = segment2.data;
                    int i9 = segment2.pos;
                    mac.update(bArr2, i9, segment2.limit - i9);
                }
            }
            return ByteString.of(mac.doFinal());
        } catch (InvalidKeyException e8) {
            throw new IllegalArgumentException(e8);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource, com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer buffer() {
        return this;
    }

    public final void clear() {
        try {
            skip(this.size);
        } catch (EOFException e8) {
            throw new AssertionError(e8);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final long completeSegmentByteCount() {
        long j8 = this.size;
        if (j8 == 0) {
            return 0L;
        }
        Segment segment = this.head.prev;
        if (segment.limit < 8192 && segment.owner) {
            return j8 - (r3 - segment.pos);
        }
        return j8;
    }

    public final Buffer copyTo(OutputStream outputStream) throws IOException {
        return copyTo(outputStream, 0L, this.size);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink emit() {
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer emitCompleteSegments() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Buffer)) {
            return false;
        }
        Buffer buffer = (Buffer) obj;
        long j8 = this.size;
        if (j8 != buffer.size) {
            return false;
        }
        long j9 = 0;
        if (j8 == 0) {
            return true;
        }
        Segment segment = this.head;
        Segment segment2 = buffer.head;
        int i8 = segment.pos;
        int i9 = segment2.pos;
        while (j9 < this.size) {
            long min = Math.min(segment.limit - i8, segment2.limit - i9);
            int i10 = 0;
            while (i10 < min) {
                int i11 = i8 + 1;
                int i12 = i9 + 1;
                if (segment.data[i8] != segment2.data[i9]) {
                    return false;
                }
                i10++;
                i8 = i11;
                i9 = i12;
            }
            if (i8 == segment.limit) {
                segment = segment.next;
                i8 = segment.pos;
            }
            if (i9 == segment2.limit) {
                segment2 = segment2.next;
                i9 = segment2.pos;
            }
            j9 += min;
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public boolean exhausted() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink, com.mbridge.msdk.thrid.okio.Sink, java.io.Flushable
    public void flush() {
    }

    public final byte getByte(long j8) {
        int i8;
        Util.checkOffsetAndCount(this.size, j8, 1L);
        long j9 = this.size;
        if (j9 - j8 > j8) {
            Segment segment = this.head;
            while (true) {
                int i9 = segment.limit;
                int i10 = segment.pos;
                long j10 = i9 - i10;
                if (j8 < j10) {
                    return segment.data[i10 + ((int) j8)];
                }
                j8 -= j10;
                segment = segment.next;
            }
        } else {
            long j11 = j8 - j9;
            Segment segment2 = this.head;
            do {
                segment2 = segment2.prev;
                int i11 = segment2.limit;
                i8 = segment2.pos;
                j11 += i11 - i8;
            } while (j11 < 0);
            return segment2.data[i8 + ((int) j11)];
        }
    }

    public int hashCode() {
        Segment segment = this.head;
        if (segment == null) {
            return 0;
        }
        int i8 = 1;
        do {
            int i9 = segment.limit;
            for (int i10 = segment.pos; i10 < i9; i10++) {
                i8 = (i8 * 31) + segment.data[i10];
            }
            segment = segment.next;
        } while (segment != this.head);
        return i8;
    }

    public final ByteString hmacSha1(ByteString byteString) {
        return hmac("HmacSHA1", byteString);
    }

    public final ByteString hmacSha256(ByteString byteString) {
        return hmac("HmacSHA256", byteString);
    }

    public final ByteString hmacSha512(ByteString byteString) {
        return hmac("HmacSHA512", byteString);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(byte b9) {
        return indexOf(b9, 0L, Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOfElement(ByteString byteString) {
        return indexOfElement(byteString, 0L);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public InputStream inputStream() {
        return new InputStream() { // from class: com.mbridge.msdk.thrid.okio.Buffer.2
            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(Buffer.this.size, 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.InputStream
            public int read() {
                Buffer buffer = Buffer.this;
                if (buffer.size > 0) {
                    return buffer.readByte() & 255;
                }
                return -1;
            }

            public String toString() {
                return Buffer.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i8, int i9) {
                return Buffer.this.read(bArr, i8, i9);
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final ByteString md5() {
        return digest(SameMD5.TAG);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public OutputStream outputStream() {
        return new OutputStream() { // from class: com.mbridge.msdk.thrid.okio.Buffer.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }

            public String toString() {
                return Buffer.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i8) {
                Buffer.this.writeByte((int) ((byte) i8));
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i8, int i9) {
                Buffer.this.write(bArr, i8, i9);
            }
        };
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public boolean rangeEquals(long j8, ByteString byteString) {
        return rangeEquals(j8, byteString, 0, byteString.size());
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long readAll(Sink sink) throws IOException {
        long j8 = this.size;
        if (j8 > 0) {
            sink.write(this, j8);
        }
        return j8;
    }

    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe(new UnsafeCursor());
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public byte readByte() {
        long j8 = this.size;
        if (j8 != 0) {
            Segment segment = this.head;
            int i8 = segment.pos;
            int i9 = segment.limit;
            int i10 = i8 + 1;
            byte b9 = segment.data[i8];
            this.size = j8 - 1;
            if (i10 == i9) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i10;
            }
            return b9;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public byte[] readByteArray() {
        try {
            return readByteArray(this.size);
        } catch (EOFException e8) {
            throw new AssertionError(e8);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public ByteString readByteString() {
        return new ByteString(readByteArray());
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af A[EDGE_INSN: B:46:0x00af->B:40:0x00af BREAK  A[LOOP:0: B:4:0x0011->B:45:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readDecimalLong() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.size
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto Lba
            r1 = 0
            r5 = -7
            r6 = r5
            r2 = 0
            r4 = r3
            r3 = 0
        L11:
            com.mbridge.msdk.thrid.okio.Segment r8 = r0.head
            byte[] r9 = r8.data
            int r10 = r8.pos
            int r11 = r8.limit
        L19:
            if (r10 >= r11) goto L9b
            r12 = r9[r10]
            r13 = 48
            if (r12 < r13) goto L6c
            r13 = 57
            if (r12 > r13) goto L6c
            int r13 = 48 - r12
            r14 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r16 < 0) goto L3f
            if (r16 != 0) goto L38
            long r14 = (long) r13
            int r16 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r16 >= 0) goto L38
            goto L3f
        L38:
            r14 = 10
            long r4 = r4 * r14
            long r12 = (long) r13
            long r4 = r4 + r12
            goto L77
        L3f:
            com.mbridge.msdk.thrid.okio.Buffer r1 = new com.mbridge.msdk.thrid.okio.Buffer
            r1.<init>()
            com.mbridge.msdk.thrid.okio.Buffer r1 = r1.writeDecimalLong(r4)
            com.mbridge.msdk.thrid.okio.Buffer r1 = r1.writeByte(r12)
            if (r2 != 0) goto L51
            r1.readByte()
        L51:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.readUtf8()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L6c:
            r13 = 45
            r14 = 1
            if (r12 != r13) goto L7c
            if (r1 != 0) goto L7c
            r12 = 1
            long r6 = r6 - r12
            r2 = 1
        L77:
            int r10 = r10 + 1
            int r1 = r1 + 1
            goto L19
        L7c:
            if (r1 == 0) goto L80
            r3 = 1
            goto L9b
        L80:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r12)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L9b:
            if (r10 != r11) goto La7
            com.mbridge.msdk.thrid.okio.Segment r9 = r8.pop()
            r0.head = r9
            com.mbridge.msdk.thrid.okio.SegmentPool.recycle(r8)
            goto La9
        La7:
            r8.pos = r10
        La9:
            if (r3 != 0) goto Laf
            com.mbridge.msdk.thrid.okio.Segment r8 = r0.head
            if (r8 != 0) goto L11
        Laf:
            long r6 = r0.size
            long r8 = (long) r1
            long r6 = r6 - r8
            r0.size = r6
            if (r2 == 0) goto Lb8
            goto Lb9
        Lb8:
            long r4 = -r4
        Lb9:
            return r4
        Lba:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.Buffer.readDecimalLong():long");
    }

    public final Buffer readFrom(InputStream inputStream) throws IOException {
        readFrom(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public void readFully(Buffer buffer, long j8) throws EOFException {
        long j9 = this.size;
        if (j9 >= j8) {
            buffer.write(this, j8);
        } else {
            buffer.write(this, j9);
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2 A[EDGE_INSN: B:40:0x00a2->B:37:0x00a2 BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readHexadecimalUnsignedLong() {
        /*
            r15 = this;
            long r0 = r15.size
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La9
            r0 = 0
            r4 = r2
            r1 = 0
        Lb:
            com.mbridge.msdk.thrid.okio.Segment r6 = r15.head
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L13:
            if (r8 >= r9) goto L8e
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L37
        L22:
            r11 = 97
            if (r10 < r11) goto L2d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2d
            int r11 = r10 + (-87)
            goto L37
        L2d:
            r11 = 65
            if (r10 < r11) goto L6f
            r11 = 70
            if (r10 > r11) goto L6f
            int r11 = r10 + (-55)
        L37:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L47
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L47:
            com.mbridge.msdk.thrid.okio.Buffer r0 = new com.mbridge.msdk.thrid.okio.Buffer
            r0.<init>()
            com.mbridge.msdk.thrid.okio.Buffer r0 = r0.writeHexadecimalUnsignedLong(r4)
            com.mbridge.msdk.thrid.okio.Buffer r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L6f:
            if (r0 == 0) goto L73
            r1 = 1
            goto L8e
        L73:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8e:
            if (r8 != r9) goto L9a
            com.mbridge.msdk.thrid.okio.Segment r7 = r6.pop()
            r15.head = r7
            com.mbridge.msdk.thrid.okio.SegmentPool.recycle(r6)
            goto L9c
        L9a:
            r6.pos = r8
        L9c:
            if (r1 != 0) goto La2
            com.mbridge.msdk.thrid.okio.Segment r6 = r15.head
            if (r6 != 0) goto Lb
        La2:
            long r1 = r15.size
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.size = r1
            return r4
        La9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.Buffer.readHexadecimalUnsignedLong():long");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int readInt() {
        long j8 = this.size;
        if (j8 >= 4) {
            Segment segment = this.head;
            int i8 = segment.pos;
            int i9 = segment.limit;
            if (i9 - i8 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = segment.data;
            int i10 = i8 + 3;
            int i11 = ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8] & 255) << 24) | ((bArr[i8 + 2] & 255) << 8);
            int i12 = i8 + 4;
            int i13 = (bArr[i10] & 255) | i11;
            this.size = j8 - 4;
            if (i12 == i9) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i12;
            }
            return i13;
        }
        throw new IllegalStateException("size < 4: " + this.size);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int readIntLe() {
        return Util.reverseBytesInt(readInt());
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long readLong() {
        long j8 = this.size;
        if (j8 >= 8) {
            Segment segment = this.head;
            int i8 = segment.pos;
            int i9 = segment.limit;
            if (i9 - i8 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = segment.data;
            int i10 = i8 + 7;
            long j9 = ((bArr[i8 + 1] & 255) << 48) | ((bArr[i8] & 255) << 56) | ((bArr[i8 + 2] & 255) << 40) | ((bArr[i8 + 3] & 255) << 32) | ((bArr[i8 + 4] & 255) << 24) | ((bArr[i8 + 5] & 255) << 16) | ((bArr[i8 + 6] & 255) << 8);
            int i11 = i8 + 8;
            long j10 = j9 | (bArr[i10] & 255);
            this.size = j8 - 8;
            if (i11 == i9) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i11;
            }
            return j10;
        }
        throw new IllegalStateException("size < 8: " + this.size);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long readLongLe() {
        return Util.reverseBytesLong(readLong());
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public short readShort() {
        long j8 = this.size;
        if (j8 >= 2) {
            Segment segment = this.head;
            int i8 = segment.pos;
            int i9 = segment.limit;
            if (i9 - i8 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = segment.data;
            int i10 = i8 + 1;
            int i11 = (bArr[i8] & 255) << 8;
            int i12 = i8 + 2;
            int i13 = (bArr[i10] & 255) | i11;
            this.size = j8 - 2;
            if (i12 == i9) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i12;
            }
            return (short) i13;
        }
        throw new IllegalStateException("size < 2: " + this.size);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public short readShortLe() {
        return Util.reverseBytesShort(readShort());
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readString(Charset charset) {
        try {
            return readString(this.size, charset);
        } catch (EOFException e8) {
            throw new AssertionError(e8);
        }
    }

    public final UnsafeCursor readUnsafe() {
        return readUnsafe(new UnsafeCursor());
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readUtf8() {
        try {
            return readString(this.size, Util.UTF_8);
        } catch (EOFException e8) {
            throw new AssertionError(e8);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        int i8;
        int i9;
        int i10;
        if (this.size != 0) {
            byte b9 = getByte(0L);
            if ((b9 & 128) == 0) {
                i8 = b9 & Byte.MAX_VALUE;
                i9 = 1;
                i10 = 0;
            } else if ((b9 & 224) == 192) {
                i8 = b9 & 31;
                i9 = 2;
                i10 = 128;
            } else if ((b9 & 240) == 224) {
                i8 = b9 & 15;
                i9 = 3;
                i10 = 2048;
            } else if ((b9 & 248) == 240) {
                i8 = b9 & 7;
                i9 = 4;
                i10 = 65536;
            } else {
                skip(1L);
                return REPLACEMENT_CHARACTER;
            }
            long j8 = i9;
            if (this.size >= j8) {
                for (int i11 = 1; i11 < i9; i11++) {
                    long j9 = i11;
                    byte b10 = getByte(j9);
                    if ((b10 & 192) == 128) {
                        i8 = (i8 << 6) | (b10 & 63);
                    } else {
                        skip(j9);
                        return REPLACEMENT_CHARACTER;
                    }
                }
                skip(j8);
                if (i8 > 1114111) {
                    return REPLACEMENT_CHARACTER;
                }
                if ((i8 >= 55296 && i8 <= 57343) || i8 < i10) {
                    return REPLACEMENT_CHARACTER;
                }
                return i8;
            }
            throw new EOFException("size < " + i9 + ": " + this.size + " (to read code point prefixed 0x" + Integer.toHexString(b9) + ")");
        }
        throw new EOFException();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    @Nullable
    public String readUtf8Line() throws EOFException {
        long indexOf = indexOf((byte) 10);
        if (indexOf == -1) {
            long j8 = this.size;
            if (j8 != 0) {
                return readUtf8(j8);
            }
            return null;
        }
        return readUtf8Line(indexOf);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public boolean request(long j8) {
        if (this.size >= j8) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public void require(long j8) throws EOFException {
        if (this.size >= j8) {
        } else {
            throw new EOFException();
        }
    }

    List<Integer> segmentSizes() {
        if (this.head == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Segment segment = this.head;
        arrayList.add(Integer.valueOf(segment.limit - segment.pos));
        Segment segment2 = this.head;
        while (true) {
            segment2 = segment2.next;
            if (segment2 != this.head) {
                arrayList.add(Integer.valueOf(segment2.limit - segment2.pos));
            } else {
                return arrayList;
            }
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int select(Options options) {
        int selectPrefix = selectPrefix(options, false);
        if (selectPrefix == -1) {
            return -1;
        }
        try {
            skip(options.byteStrings[selectPrefix].size());
            return selectPrefix;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0055, code lost:            if (r19 == false) goto L29;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:            return r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0058, code lost:            return r11;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int selectPrefix(com.mbridge.msdk.thrid.okio.Options r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 158
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.Buffer.selectPrefix(com.mbridge.msdk.thrid.okio.Options, boolean):int");
    }

    public final ByteString sha1() {
        return digest("SHA-1");
    }

    public final ByteString sha256() {
        return digest("SHA-256");
    }

    public final ByteString sha512() {
        return digest("SHA-512");
    }

    public final long size() {
        return this.size;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public void skip(long j8) throws EOFException {
        while (j8 > 0) {
            if (this.head != null) {
                int min = (int) Math.min(j8, r0.limit - r0.pos);
                long j9 = min;
                this.size -= j9;
                j8 -= j9;
                Segment segment = this.head;
                int i8 = segment.pos + min;
                segment.pos = i8;
                if (i8 == segment.limit) {
                    this.head = segment.pop();
                    SegmentPool.recycle(segment);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final ByteString snapshot() {
        long j8 = this.size;
        if (j8 <= 2147483647L) {
            return snapshot((int) j8);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.size);
    }

    @Override // com.mbridge.msdk.thrid.okio.Source
    public Timeout timeout() {
        return Timeout.NONE;
    }

    public String toString() {
        return snapshot().toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Segment writableSegment(int i8) {
        if (i8 >= 1 && i8 <= 8192) {
            Segment segment = this.head;
            if (segment == null) {
                Segment take = SegmentPool.take();
                this.head = take;
                take.prev = take;
                take.next = take;
                return take;
            }
            Segment segment2 = segment.prev;
            if (segment2.limit + i8 > 8192 || !segment2.owner) {
                return segment2.push(SegmentPool.take());
            }
            return segment2;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public long writeAll(Source source) throws IOException {
        if (source != null) {
            long j8 = 0;
            while (true) {
                long read = source.read(this, 8192L);
                if (read != -1) {
                    j8 += read;
                } else {
                    return j8;
                }
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public final Buffer writeTo(OutputStream outputStream) throws IOException {
        return writeTo(outputStream, this.size);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Buffer m5462clone() {
        Buffer buffer = new Buffer();
        if (this.size == 0) {
            return buffer;
        }
        Segment sharedCopy = this.head.sharedCopy();
        buffer.head = sharedCopy;
        sharedCopy.prev = sharedCopy;
        sharedCopy.next = sharedCopy;
        Segment segment = this.head;
        while (true) {
            segment = segment.next;
            if (segment != this.head) {
                buffer.head.prev.push(segment.sharedCopy());
            } else {
                buffer.size = this.size;
                return buffer;
            }
        }
    }

    public final Buffer copyTo(OutputStream outputStream, long j8, long j9) throws IOException {
        if (outputStream != null) {
            Util.checkOffsetAndCount(this.size, j8, j9);
            if (j9 == 0) {
                return this;
            }
            Segment segment = this.head;
            while (true) {
                int i8 = segment.limit;
                int i9 = segment.pos;
                if (j8 < i8 - i9) {
                    break;
                }
                j8 -= i8 - i9;
                segment = segment.next;
            }
            while (j9 > 0) {
                int min = (int) Math.min(segment.limit - r10, j9);
                outputStream.write(segment.data, (int) (segment.pos + j8), min);
                j9 -= min;
                segment = segment.next;
                j8 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(byte b9, long j8) {
        return indexOf(b9, j8, Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOfElement(ByteString byteString, long j8) {
        int i8;
        int i9;
        long j9 = 0;
        if (j8 >= 0) {
            Segment segment = this.head;
            if (segment == null) {
                return -1L;
            }
            long j10 = this.size;
            if (j10 - j8 < j8) {
                while (j10 > j8) {
                    segment = segment.prev;
                    j10 -= segment.limit - segment.pos;
                }
            } else {
                while (true) {
                    long j11 = (segment.limit - segment.pos) + j9;
                    if (j11 >= j8) {
                        break;
                    }
                    segment = segment.next;
                    j9 = j11;
                }
                j10 = j9;
            }
            if (byteString.size() == 2) {
                byte b9 = byteString.getByte(0);
                byte b10 = byteString.getByte(1);
                while (j10 < this.size) {
                    byte[] bArr = segment.data;
                    i8 = (int) ((segment.pos + j8) - j10);
                    int i10 = segment.limit;
                    while (i8 < i10) {
                        byte b11 = bArr[i8];
                        if (b11 == b9 || b11 == b10) {
                            i9 = segment.pos;
                            return (i8 - i9) + j10;
                        }
                        i8++;
                    }
                    j10 += segment.limit - segment.pos;
                    segment = segment.next;
                    j8 = j10;
                }
                return -1L;
            }
            byte[] internalArray = byteString.internalArray();
            while (j10 < this.size) {
                byte[] bArr2 = segment.data;
                i8 = (int) ((segment.pos + j8) - j10);
                int i11 = segment.limit;
                while (i8 < i11) {
                    byte b12 = bArr2[i8];
                    for (byte b13 : internalArray) {
                        if (b12 == b13) {
                            i9 = segment.pos;
                            return (i8 - i9) + j10;
                        }
                    }
                    i8++;
                }
                j10 += segment.limit - segment.pos;
                segment = segment.next;
                j8 = j10;
            }
            return -1L;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public boolean rangeEquals(long j8, ByteString byteString, int i8, int i9) {
        if (j8 < 0 || i8 < 0 || i9 < 0 || this.size - j8 < i9 || byteString.size() - i8 < i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (getByte(i10 + j8) != byteString.getByte(i8 + i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public int read(byte[] bArr, int i8, int i9) {
        Util.checkOffsetAndCount(bArr.length, i8, i9);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(i9, segment.limit - segment.pos);
        System.arraycopy(segment.data, segment.pos, bArr, i8, min);
        int i10 = segment.pos + min;
        segment.pos = i10;
        this.size -= min;
        if (i10 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return min;
    }

    public final UnsafeCursor readAndWriteUnsafe(UnsafeCursor unsafeCursor) {
        if (unsafeCursor.buffer == null) {
            unsafeCursor.buffer = this;
            unsafeCursor.readWrite = true;
            return unsafeCursor;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public ByteString readByteString(long j8) throws EOFException {
        return new ByteString(readByteArray(j8));
    }

    public final Buffer readFrom(InputStream inputStream, long j8) throws IOException {
        if (j8 >= 0) {
            readFrom(inputStream, j8, false);
            return this;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j8);
    }

    public final UnsafeCursor readUnsafe(UnsafeCursor unsafeCursor) {
        if (unsafeCursor.buffer == null) {
            unsafeCursor.buffer = this;
            unsafeCursor.readWrite = false;
            return unsafeCursor;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readUtf8LineStrict(long j8) throws EOFException {
        if (j8 >= 0) {
            long j9 = j8 != Long.MAX_VALUE ? j8 + 1 : Long.MAX_VALUE;
            long indexOf = indexOf((byte) 10, 0L, j9);
            if (indexOf != -1) {
                return readUtf8Line(indexOf);
            }
            if (j9 < size() && getByte(j9 - 1) == 13 && getByte(j9) == 10) {
                return readUtf8Line(j9);
            }
            Buffer buffer = new Buffer();
            copyTo(buffer, 0L, Math.min(32L, size()));
            throw new EOFException("\\n not found: limit=" + Math.min(size(), j8) + " content=" + buffer.readByteString().hex() + (char) 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j8);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeByte(int i8) {
        Segment writableSegment = writableSegment(1);
        byte[] bArr = writableSegment.data;
        int i9 = writableSegment.limit;
        writableSegment.limit = i9 + 1;
        bArr[i9] = (byte) i8;
        this.size++;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeDecimalLong(long j8) {
        boolean z8;
        if (j8 == 0) {
            return writeByte(48);
        }
        int i8 = 1;
        if (j8 < 0) {
            j8 = -j8;
            if (j8 < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z8 = true;
        } else {
            z8 = false;
        }
        if (j8 >= 100000000) {
            i8 = j8 < 1000000000000L ? j8 < 10000000000L ? j8 < C.NANOS_PER_SECOND ? 9 : 10 : j8 < 100000000000L ? 11 : 12 : j8 < 1000000000000000L ? j8 < 10000000000000L ? 13 : j8 < 100000000000000L ? 14 : 15 : j8 < 100000000000000000L ? j8 < 10000000000000000L ? 16 : 17 : j8 < 1000000000000000000L ? 18 : 19;
        } else if (j8 >= WorkRequest.MIN_BACKOFF_MILLIS) {
            i8 = j8 < 1000000 ? j8 < 100000 ? 5 : 6 : j8 < 10000000 ? 7 : 8;
        } else if (j8 >= 100) {
            i8 = j8 < 1000 ? 3 : 4;
        } else if (j8 >= 10) {
            i8 = 2;
        }
        if (z8) {
            i8++;
        }
        Segment writableSegment = writableSegment(i8);
        byte[] bArr = writableSegment.data;
        int i9 = writableSegment.limit + i8;
        while (j8 != 0) {
            i9--;
            bArr[i9] = DIGITS[(int) (j8 % 10)];
            j8 /= 10;
        }
        if (z8) {
            bArr[i9 - 1] = 45;
        }
        writableSegment.limit += i8;
        this.size += i8;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeHexadecimalUnsignedLong(long j8) {
        if (j8 == 0) {
            return writeByte(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j8)) / 4) + 1;
        Segment writableSegment = writableSegment(numberOfTrailingZeros);
        byte[] bArr = writableSegment.data;
        int i8 = writableSegment.limit;
        for (int i9 = (i8 + numberOfTrailingZeros) - 1; i9 >= i8; i9--) {
            bArr[i9] = DIGITS[(int) (15 & j8)];
            j8 >>>= 4;
        }
        writableSegment.limit += numberOfTrailingZeros;
        this.size += numberOfTrailingZeros;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeInt(int i8) {
        Segment writableSegment = writableSegment(4);
        byte[] bArr = writableSegment.data;
        int i9 = writableSegment.limit;
        bArr[i9] = (byte) ((i8 >>> 24) & 255);
        bArr[i9 + 1] = (byte) ((i8 >>> 16) & 255);
        bArr[i9 + 2] = (byte) ((i8 >>> 8) & 255);
        bArr[i9 + 3] = (byte) (i8 & 255);
        writableSegment.limit = i9 + 4;
        this.size += 4;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeIntLe(int i8) {
        return writeInt(Util.reverseBytesInt(i8));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeLong(long j8) {
        Segment writableSegment = writableSegment(8);
        byte[] bArr = writableSegment.data;
        int i8 = writableSegment.limit;
        bArr[i8] = (byte) ((j8 >>> 56) & 255);
        bArr[i8 + 1] = (byte) ((j8 >>> 48) & 255);
        bArr[i8 + 2] = (byte) ((j8 >>> 40) & 255);
        bArr[i8 + 3] = (byte) ((j8 >>> 32) & 255);
        bArr[i8 + 4] = (byte) ((j8 >>> 24) & 255);
        bArr[i8 + 5] = (byte) ((j8 >>> 16) & 255);
        bArr[i8 + 6] = (byte) ((j8 >>> 8) & 255);
        bArr[i8 + 7] = (byte) (j8 & 255);
        writableSegment.limit = i8 + 8;
        this.size += 8;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeLongLe(long j8) {
        return writeLong(Util.reverseBytesLong(j8));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeShort(int i8) {
        Segment writableSegment = writableSegment(2);
        byte[] bArr = writableSegment.data;
        int i9 = writableSegment.limit;
        bArr[i9] = (byte) ((i8 >>> 8) & 255);
        bArr[i9 + 1] = (byte) (i8 & 255);
        writableSegment.limit = i9 + 2;
        this.size += 2;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeShortLe(int i8) {
        return writeShort((int) Util.reverseBytesShort((short) i8));
    }

    public final Buffer writeTo(OutputStream outputStream, long j8) throws IOException {
        if (outputStream != null) {
            Util.checkOffsetAndCount(this.size, 0L, j8);
            Segment segment = this.head;
            while (j8 > 0) {
                int min = (int) Math.min(j8, segment.limit - segment.pos);
                outputStream.write(segment.data, segment.pos, min);
                int i8 = segment.pos + min;
                segment.pos = i8;
                long j9 = min;
                this.size -= j9;
                j8 -= j9;
                if (i8 == segment.limit) {
                    Segment pop = segment.pop();
                    this.head = pop;
                    SegmentPool.recycle(segment);
                    segment = pop;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeUtf8CodePoint(int i8) {
        if (i8 < 128) {
            writeByte(i8);
        } else if (i8 < 2048) {
            writeByte((i8 >> 6) | PsExtractor.AUDIO_STREAM);
            writeByte((i8 & 63) | 128);
        } else if (i8 < 65536) {
            if (i8 >= 55296 && i8 <= 57343) {
                writeByte(63);
            } else {
                writeByte((i8 >> 12) | 224);
                writeByte(((i8 >> 6) & 63) | 128);
                writeByte((i8 & 63) | 128);
            }
        } else if (i8 <= 1114111) {
            writeByte((i8 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            writeByte(((i8 >> 12) & 63) | 128);
            writeByte(((i8 >> 6) & 63) | 128);
            writeByte((i8 & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i8));
        }
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(byte b9, long j8, long j9) {
        Segment segment;
        long j10 = 0;
        if (j8 >= 0 && j9 >= j8) {
            long j11 = this.size;
            long j12 = j9 > j11 ? j11 : j9;
            if (j8 == j12 || (segment = this.head) == null) {
                return -1L;
            }
            if (j11 - j8 < j8) {
                while (j11 > j8) {
                    segment = segment.prev;
                    j11 -= segment.limit - segment.pos;
                }
            } else {
                while (true) {
                    long j13 = (segment.limit - segment.pos) + j10;
                    if (j13 >= j8) {
                        break;
                    }
                    segment = segment.next;
                    j10 = j13;
                }
                j11 = j10;
            }
            long j14 = j8;
            while (j11 < j12) {
                byte[] bArr = segment.data;
                int min = (int) Math.min(segment.limit, (segment.pos + j12) - j11);
                for (int i8 = (int) ((segment.pos + j14) - j11); i8 < min; i8++) {
                    if (bArr[i8] == b9) {
                        return (i8 - segment.pos) + j11;
                    }
                }
                j11 += segment.limit - segment.pos;
                segment = segment.next;
                j14 = j11;
            }
            return -1L;
        }
        throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.size), Long.valueOf(j8), Long.valueOf(j9)));
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public byte[] readByteArray(long j8) throws EOFException {
        Util.checkOffsetAndCount(this.size, 0L, j8);
        if (j8 <= 2147483647L) {
            byte[] bArr = new byte[(int) j8];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j8);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readString(long j8, Charset charset) throws EOFException {
        Util.checkOffsetAndCount(this.size, 0L, j8);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j8 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j8);
        }
        if (j8 == 0) {
            return "";
        }
        Segment segment = this.head;
        int i8 = segment.pos;
        if (i8 + j8 > segment.limit) {
            return new String(readByteArray(j8), charset);
        }
        String str = new String(segment.data, i8, (int) j8, charset);
        int i9 = (int) (segment.pos + j8);
        segment.pos = i9;
        this.size -= j8;
        if (i9 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return str;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public String readUtf8(long j8) throws EOFException {
        return readString(j8, Util.UTF_8);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeString(String str, Charset charset) {
        return writeString(str, 0, str.length(), charset);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeUtf8(String str) {
        return writeUtf8(str, 0, str.length());
    }

    private void readFrom(InputStream inputStream, long j8, boolean z8) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        while (true) {
            if (j8 <= 0 && !z8) {
                return;
            }
            Segment writableSegment = writableSegment(1);
            int read = inputStream.read(writableSegment.data, writableSegment.limit, (int) Math.min(j8, 8192 - writableSegment.limit));
            if (read == -1) {
                if (!z8) {
                    throw new EOFException();
                }
                return;
            } else {
                writableSegment.limit += read;
                long j9 = read;
                this.size += j9;
                j8 -= j9;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String readUtf8Line(long j8) throws EOFException {
        if (j8 > 0) {
            long j9 = j8 - 1;
            if (getByte(j9) == 13) {
                String readUtf8 = readUtf8(j9);
                skip(2L);
                return readUtf8;
            }
        }
        String readUtf82 = readUtf8(j8);
        skip(1L);
        return readUtf82;
    }

    public final ByteString snapshot(int i8) {
        if (i8 == 0) {
            return ByteString.EMPTY;
        }
        return new SegmentedByteString(this, i8);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer write(ByteString byteString) {
        if (byteString != null) {
            byteString.write(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeString(String str, int i8, int i9, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i8 < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i8);
        }
        if (i9 >= i8) {
            if (i9 <= str.length()) {
                if (charset != null) {
                    if (charset.equals(Util.UTF_8)) {
                        return writeUtf8(str, i8, i9);
                    }
                    byte[] bytes = str.substring(i8, i9).getBytes(charset);
                    return write(bytes, 0, bytes.length);
                }
                throw new IllegalArgumentException("charset == null");
            }
            throw new IllegalArgumentException("endIndex > string.length: " + i9 + " > " + str.length());
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i9 + " < " + i8);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer writeUtf8(String str, int i8, int i9) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i8 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i8);
        }
        if (i9 >= i8) {
            if (i9 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i9 + " > " + str.length());
            }
            while (i8 < i9) {
                char charAt = str.charAt(i8);
                if (charAt < 128) {
                    Segment writableSegment = writableSegment(1);
                    byte[] bArr = writableSegment.data;
                    int i10 = writableSegment.limit - i8;
                    int min = Math.min(i9, 8192 - i10);
                    int i11 = i8 + 1;
                    bArr[i8 + i10] = (byte) charAt;
                    while (i11 < min) {
                        char charAt2 = str.charAt(i11);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i11 + i10] = (byte) charAt2;
                        i11++;
                    }
                    int i12 = writableSegment.limit;
                    int i13 = (i10 + i11) - i12;
                    writableSegment.limit = i12 + i13;
                    this.size += i13;
                    i8 = i11;
                } else {
                    if (charAt < 2048) {
                        writeByte((charAt >> 6) | PsExtractor.AUDIO_STREAM);
                        writeByte((charAt & '?') | 128);
                    } else if (charAt >= 55296 && charAt <= 57343) {
                        int i14 = i8 + 1;
                        char charAt3 = i14 < i9 ? str.charAt(i14) : (char) 0;
                        if (charAt <= 56319 && charAt3 >= 56320 && charAt3 <= 57343) {
                            int i15 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                            writeByte((i15 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            writeByte(((i15 >> 12) & 63) | 128);
                            writeByte(((i15 >> 6) & 63) | 128);
                            writeByte((i15 & 63) | 128);
                            i8 += 2;
                        } else {
                            writeByte(63);
                            i8 = i14;
                        }
                    } else {
                        writeByte((charAt >> '\f') | 224);
                        writeByte(((charAt >> 6) & 63) | 128);
                        writeByte((charAt & '?') | 128);
                    }
                    i8++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i9 + " < " + i8);
    }

    private boolean rangeEquals(Segment segment, int i8, ByteString byteString, int i9, int i10) {
        int i11 = segment.limit;
        byte[] bArr = segment.data;
        while (i9 < i10) {
            if (i8 == i11) {
                segment = segment.next;
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i8 = segment.pos;
                i11 = segment.limit;
            }
            if (bArr[i8] != byteString.getByte(i9)) {
                return false;
            }
            i8++;
            i9++;
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public void readFully(byte[] bArr) throws EOFException {
        int i8 = 0;
        while (i8 < bArr.length) {
            int read = read(bArr, i8, bArr.length - i8);
            if (read == -1) {
                throw new EOFException();
            }
            i8 += read;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer write(byte[] bArr) {
        if (bArr != null) {
            return write(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public Buffer write(byte[] bArr, int i8, int i9) {
        if (bArr != null) {
            long j8 = i9;
            Util.checkOffsetAndCount(bArr.length, i8, j8);
            int i10 = i9 + i8;
            while (i8 < i10) {
                Segment writableSegment = writableSegment(1);
                int min = Math.min(i10 - i8, 8192 - writableSegment.limit);
                System.arraycopy(bArr, i8, writableSegment.data, writableSegment.limit, min);
                i8 += min;
                writableSegment.limit += min;
            }
            this.size += j8;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final Buffer copyTo(Buffer buffer, long j8, long j9) {
        if (buffer != null) {
            Util.checkOffsetAndCount(this.size, j8, j9);
            if (j9 == 0) {
                return this;
            }
            buffer.size += j9;
            Segment segment = this.head;
            while (true) {
                int i8 = segment.limit;
                int i9 = segment.pos;
                if (j8 < i8 - i9) {
                    break;
                }
                j8 -= i8 - i9;
                segment = segment.next;
            }
            while (j9 > 0) {
                Segment sharedCopy = segment.sharedCopy();
                int i10 = (int) (sharedCopy.pos + j8);
                sharedCopy.pos = i10;
                sharedCopy.limit = Math.min(i10 + ((int) j9), sharedCopy.limit);
                Segment segment2 = buffer.head;
                if (segment2 == null) {
                    sharedCopy.prev = sharedCopy;
                    sharedCopy.next = sharedCopy;
                    buffer.head = sharedCopy;
                } else {
                    segment2.prev.push(sharedCopy);
                }
                j9 -= sharedCopy.limit - sharedCopy.pos;
                segment = segment.next;
                j8 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), segment.limit - segment.pos);
        byteBuffer.put(segment.data, segment.pos, min);
        int i8 = segment.pos + min;
        segment.pos = i8;
        this.size -= min;
        if (i8 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return min;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i8 = remaining;
            while (i8 > 0) {
                Segment writableSegment = writableSegment(1);
                int min = Math.min(i8, 8192 - writableSegment.limit);
                byteBuffer.get(writableSegment.data, writableSegment.limit, min);
                i8 -= min;
                writableSegment.limit += min;
            }
            this.size += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(ByteString byteString) throws IOException {
        return indexOf(byteString, 0L);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSource
    public long indexOf(ByteString byteString, long j8) throws IOException {
        byte[] bArr;
        if (byteString.size() == 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j9 = 0;
        if (j8 >= 0) {
            Segment segment = this.head;
            long j10 = -1;
            if (segment == null) {
                return -1L;
            }
            long j11 = this.size;
            if (j11 - j8 < j8) {
                while (j11 > j8) {
                    segment = segment.prev;
                    j11 -= segment.limit - segment.pos;
                }
            } else {
                while (true) {
                    long j12 = (segment.limit - segment.pos) + j9;
                    if (j12 >= j8) {
                        break;
                    }
                    segment = segment.next;
                    j9 = j12;
                }
                j11 = j9;
            }
            byte b9 = byteString.getByte(0);
            int size = byteString.size();
            long j13 = 1 + (this.size - size);
            long j14 = j8;
            Segment segment2 = segment;
            long j15 = j11;
            while (j15 < j13) {
                byte[] bArr2 = segment2.data;
                int min = (int) Math.min(segment2.limit, (segment2.pos + j13) - j15);
                int i8 = (int) ((segment2.pos + j14) - j15);
                while (i8 < min) {
                    if (bArr2[i8] == b9) {
                        bArr = bArr2;
                        if (rangeEquals(segment2, i8 + 1, byteString, 1, size)) {
                            return (i8 - segment2.pos) + j15;
                        }
                    } else {
                        bArr = bArr2;
                    }
                    i8++;
                    bArr2 = bArr;
                }
                j15 += segment2.limit - segment2.pos;
                segment2 = segment2.next;
                j14 = j15;
                j10 = -1;
            }
            return j10;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    @Override // com.mbridge.msdk.thrid.okio.Source
    public long read(Buffer buffer, long j8) {
        if (buffer == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j8 >= 0) {
            long j9 = this.size;
            if (j9 == 0) {
                return -1L;
            }
            if (j8 > j9) {
                j8 = j9;
            }
            buffer.write(this, j8);
            return j8;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j8);
    }

    @Override // com.mbridge.msdk.thrid.okio.BufferedSink
    public BufferedSink write(Source source, long j8) throws IOException {
        while (j8 > 0) {
            long read = source.read(this, j8);
            if (read == -1) {
                throw new EOFException();
            }
            j8 -= read;
        }
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.Sink
    public void write(Buffer buffer, long j8) {
        if (buffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (buffer != this) {
            Util.checkOffsetAndCount(buffer.size, 0L, j8);
            while (j8 > 0) {
                Segment segment = buffer.head;
                if (j8 < segment.limit - segment.pos) {
                    Segment segment2 = this.head;
                    Segment segment3 = segment2 != null ? segment2.prev : null;
                    if (segment3 != null && segment3.owner) {
                        if ((segment3.limit + j8) - (segment3.shared ? 0 : segment3.pos) <= 8192) {
                            segment.writeTo(segment3, (int) j8);
                            buffer.size -= j8;
                            this.size += j8;
                            return;
                        }
                    }
                    buffer.head = segment.split((int) j8);
                }
                Segment segment4 = buffer.head;
                long j9 = segment4.limit - segment4.pos;
                buffer.head = segment4.pop();
                Segment segment5 = this.head;
                if (segment5 == null) {
                    this.head = segment4;
                    segment4.prev = segment4;
                    segment4.next = segment4;
                } else {
                    segment5.prev.push(segment4).compact();
                }
                buffer.size -= j9;
                this.size += j9;
                j8 -= j9;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }
}
