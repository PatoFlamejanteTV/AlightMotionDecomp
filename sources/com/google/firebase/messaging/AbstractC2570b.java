package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: com.google.firebase.messaging.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC2570b {
    private static byte[] a(Queue queue, int i8) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        if (bArr.length == i8) {
            return bArr;
        }
        int length = i8 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i8);
        while (length > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i8 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static InputStream b(InputStream inputStream, long j8) {
        return new a(inputStream, j8);
    }

    private static int c(long j8) {
        if (j8 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j8 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j8;
    }

    public static byte[] d(InputStream inputStream) {
        return e(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] e(InputStream inputStream, Queue queue, int i8) {
        int i9;
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i8) * 2));
        while (i8 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i8);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i10 = 0;
            while (i10 < min2) {
                int read = inputStream.read(bArr, i10, min2 - i10);
                if (read == -1) {
                    return a(queue, i8);
                }
                i10 += read;
                i8 += read;
            }
            long j8 = min;
            if (min < 4096) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            min = c(j8 * i9);
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: com.google.firebase.messaging.b$a */
    /* loaded from: classes4.dex */
    private static final class a extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        private long f18635a;

        /* renamed from: b, reason: collision with root package name */
        private long f18636b;

        a(InputStream inputStream, long j8) {
            super(inputStream);
            this.f18636b = -1L;
            this.f18635a = j8;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f18635a);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i8) {
            ((FilterInputStream) this).in.mark(i8);
            this.f18636b = this.f18635a;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            if (this.f18635a == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f18635a--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (((FilterInputStream) this).in.markSupported()) {
                if (this.f18636b != -1) {
                    ((FilterInputStream) this).in.reset();
                    this.f18635a = this.f18636b;
                } else {
                    throw new IOException("Mark not set");
                }
            } else {
                throw new IOException("Mark not supported");
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j8) {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j8, this.f18635a));
            this.f18635a -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i8, int i9) {
            long j8 = this.f18635a;
            if (j8 == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i8, (int) Math.min(i9, j8));
            if (read != -1) {
                this.f18635a -= read;
            }
            return read;
        }
    }
}
