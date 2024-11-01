package U6;

import R5.AbstractC1428l;
import androidx.work.WorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC3292y;
import l6.C3338d;

/* renamed from: U6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1449e implements InterfaceC1451g, InterfaceC1450f, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public U f10211a;

    /* renamed from: b, reason: collision with root package name */
    private long f10212b;

    /* renamed from: U6.e$a */
    /* loaded from: classes5.dex */
    public static final class a implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        public C1449e f10213a;

        /* renamed from: b, reason: collision with root package name */
        private U f10214b;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f10216d;

        /* renamed from: c, reason: collision with root package name */
        public long f10215c = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f10217e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f10218f = -1;

        public final void a(U u8) {
            this.f10214b = u8;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f10213a != null) {
                this.f10213a = null;
                a(null);
                this.f10215c = -1L;
                this.f10216d = null;
                this.f10217e = -1;
                this.f10218f = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }
    }

    /* renamed from: U6.e$c */
    /* loaded from: classes5.dex */
    public static final class c extends OutputStream {
        c() {
        }

        public String toString() {
            return C1449e.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i8) {
            C1449e.this.writeByte(i8);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i8, int i9) {
            AbstractC3292y.i(data, "data");
            C1449e.this.write(data, i8, i9);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    public final void B(long j8) {
        this.f10212b = j8;
    }

    public final long E() {
        return this.f10212b;
    }

    public final C1452h F() {
        if (E() <= 2147483647L) {
            return G((int) E());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + E()).toString());
    }

    public final C1452h G(int i8) {
        if (i8 == 0) {
            return C1452h.f10222e;
        }
        AbstractC1446b.b(E(), 0L, i8);
        U u8 = this.f10211a;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            AbstractC3292y.f(u8);
            int i12 = u8.f10170c;
            int i13 = u8.f10169b;
            if (i12 != i13) {
                i10 += i12 - i13;
                i11++;
                u8 = u8.f10173f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i11];
        int[] iArr = new int[i11 * 2];
        U u9 = this.f10211a;
        int i14 = 0;
        while (i9 < i8) {
            AbstractC3292y.f(u9);
            bArr[i14] = u9.f10168a;
            i9 += u9.f10170c - u9.f10169b;
            iArr[i14] = Math.min(i9, i8);
            iArr[i14 + i11] = u9.f10169b;
            u9.f10171d = true;
            i14++;
            u9 = u9.f10173f;
        }
        return new W(bArr, iArr);
    }

    public final U H(int i8) {
        if (i8 >= 1 && i8 <= 8192) {
            U u8 = this.f10211a;
            if (u8 == null) {
                U c8 = V.c();
                this.f10211a = c8;
                c8.f10174g = c8;
                c8.f10173f = c8;
                return c8;
            }
            AbstractC3292y.f(u8);
            U u9 = u8.f10174g;
            AbstractC3292y.f(u9);
            if (u9.f10170c + i8 <= 8192 && u9.f10172e) {
                return u9;
            }
            return u9.c(V.c());
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public C1449e I(C1452h byteString) {
        AbstractC3292y.i(byteString, "byteString");
        byteString.R(this, 0, byteString.J());
        return this;
    }

    @Override // U6.InterfaceC1450f
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public C1449e write(byte[] source) {
        AbstractC3292y.i(source, "source");
        return write(source, 0, source.length);
    }

    @Override // U6.InterfaceC1450f
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public C1449e write(byte[] source, int i8, int i9) {
        AbstractC3292y.i(source, "source");
        long j8 = i9;
        AbstractC1446b.b(source.length, i8, j8);
        int i10 = i9 + i8;
        while (i8 < i10) {
            U H8 = H(1);
            int min = Math.min(i10 - i8, 8192 - H8.f10170c);
            int i11 = i8 + min;
            AbstractC1428l.d(source, H8.f10168a, H8.f10170c, i8, i11);
            H8.f10170c += min;
            i8 = i11;
        }
        B(E() + j8);
        return this;
    }

    public long L(Z source) {
        AbstractC3292y.i(source, "source");
        long j8 = 0;
        while (true) {
            long m8 = source.m(this, 8192L);
            if (m8 != -1) {
                j8 += m8;
            } else {
                return j8;
            }
        }
    }

    @Override // U6.InterfaceC1450f
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public C1449e writeByte(int i8) {
        U H8 = H(1);
        byte[] bArr = H8.f10168a;
        int i9 = H8.f10170c;
        H8.f10170c = i9 + 1;
        bArr[i9] = (byte) i8;
        B(E() + 1);
        return this;
    }

    @Override // U6.InterfaceC1450f
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public C1449e writeDecimalLong(long j8) {
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
        if (j8 < 100000000) {
            if (j8 < WorkRequest.MIN_BACKOFF_MILLIS) {
                if (j8 < 100) {
                    if (j8 >= 10) {
                        i8 = 2;
                    }
                } else if (j8 < 1000) {
                    i8 = 3;
                } else {
                    i8 = 4;
                }
            } else if (j8 < 1000000) {
                if (j8 < 100000) {
                    i8 = 5;
                } else {
                    i8 = 6;
                }
            } else if (j8 < 10000000) {
                i8 = 7;
            } else {
                i8 = 8;
            }
        } else if (j8 < 1000000000000L) {
            if (j8 < 10000000000L) {
                if (j8 < com.mbridge.msdk.playercommon.exoplayer2.C.NANOS_PER_SECOND) {
                    i8 = 9;
                } else {
                    i8 = 10;
                }
            } else if (j8 < 100000000000L) {
                i8 = 11;
            } else {
                i8 = 12;
            }
        } else if (j8 < 1000000000000000L) {
            if (j8 < 10000000000000L) {
                i8 = 13;
            } else if (j8 < 100000000000000L) {
                i8 = 14;
            } else {
                i8 = 15;
            }
        } else if (j8 < 100000000000000000L) {
            if (j8 < 10000000000000000L) {
                i8 = 16;
            } else {
                i8 = 17;
            }
        } else if (j8 < 1000000000000000000L) {
            i8 = 18;
        } else {
            i8 = 19;
        }
        if (z8) {
            i8++;
        }
        U H8 = H(i8);
        byte[] bArr = H8.f10168a;
        int i9 = H8.f10170c + i8;
        while (j8 != 0) {
            long j9 = 10;
            i9--;
            bArr[i9] = V6.a.a()[(int) (j8 % j9)];
            j8 /= j9;
        }
        if (z8) {
            bArr[i9 - 1] = 45;
        }
        H8.f10170c += i8;
        B(E() + i8);
        return this;
    }

    @Override // U6.InterfaceC1450f
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public C1449e writeHexadecimalUnsignedLong(long j8) {
        if (j8 == 0) {
            return writeByte(48);
        }
        long j9 = (j8 >>> 1) | j8;
        long j10 = j9 | (j9 >>> 2);
        long j11 = j10 | (j10 >>> 4);
        long j12 = j11 | (j11 >>> 8);
        long j13 = j12 | (j12 >>> 16);
        long j14 = j13 | (j13 >>> 32);
        long j15 = j14 - ((j14 >>> 1) & 6148914691236517205L);
        long j16 = ((j15 >>> 2) & 3689348814741910323L) + (j15 & 3689348814741910323L);
        long j17 = ((j16 >>> 4) + j16) & 1085102592571150095L;
        long j18 = j17 + (j17 >>> 8);
        long j19 = j18 + (j18 >>> 16);
        int i8 = (int) ((((j19 & 63) + ((j19 >>> 32) & 63)) + 3) / 4);
        U H8 = H(i8);
        byte[] bArr = H8.f10168a;
        int i9 = H8.f10170c;
        for (int i10 = (i9 + i8) - 1; i10 >= i9; i10--) {
            bArr[i10] = V6.a.a()[(int) (15 & j8)];
            j8 >>>= 4;
        }
        H8.f10170c += i8;
        B(E() + i8);
        return this;
    }

    @Override // U6.InterfaceC1450f
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public C1449e writeInt(int i8) {
        U H8 = H(4);
        byte[] bArr = H8.f10168a;
        int i9 = H8.f10170c;
        bArr[i9] = (byte) ((i8 >>> 24) & 255);
        bArr[i9 + 1] = (byte) ((i8 >>> 16) & 255);
        bArr[i9 + 2] = (byte) ((i8 >>> 8) & 255);
        bArr[i9 + 3] = (byte) (i8 & 255);
        H8.f10170c = i9 + 4;
        B(E() + 4);
        return this;
    }

    @Override // U6.InterfaceC1450f
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public C1449e writeShort(int i8) {
        U H8 = H(2);
        byte[] bArr = H8.f10168a;
        int i9 = H8.f10170c;
        bArr[i9] = (byte) ((i8 >>> 8) & 255);
        bArr[i9 + 1] = (byte) (i8 & 255);
        H8.f10170c = i9 + 2;
        B(E() + 2);
        return this;
    }

    public C1449e R(String string, int i8, int i9, Charset charset) {
        AbstractC3292y.i(string, "string");
        AbstractC3292y.i(charset, "charset");
        if (i8 >= 0) {
            if (i9 >= i8) {
                if (i9 <= string.length()) {
                    if (AbstractC3292y.d(charset, C3338d.f34755b)) {
                        return T(string, i8, i9);
                    }
                    String substring = string.substring(i8, i9);
                    AbstractC3292y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    byte[] bytes = substring.getBytes(charset);
                    AbstractC3292y.h(bytes, "this as java.lang.String).getBytes(charset)");
                    return write(bytes, 0, bytes.length);
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i9 + " > " + string.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i9 + " < " + i8).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i8).toString());
    }

    @Override // U6.InterfaceC1450f
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public C1449e writeUtf8(String string) {
        AbstractC3292y.i(string, "string");
        return T(string, 0, string.length());
    }

    public C1449e T(String string, int i8, int i9) {
        char charAt;
        char c8;
        AbstractC3292y.i(string, "string");
        if (i8 >= 0) {
            if (i9 >= i8) {
                if (i9 <= string.length()) {
                    while (i8 < i9) {
                        char charAt2 = string.charAt(i8);
                        if (charAt2 < 128) {
                            U H8 = H(1);
                            byte[] bArr = H8.f10168a;
                            int i10 = H8.f10170c - i8;
                            int min = Math.min(i9, 8192 - i10);
                            int i11 = i8 + 1;
                            bArr[i8 + i10] = (byte) charAt2;
                            while (true) {
                                i8 = i11;
                                if (i8 >= min || (charAt = string.charAt(i8)) >= 128) {
                                    break;
                                }
                                i11 = i8 + 1;
                                bArr[i8 + i10] = (byte) charAt;
                            }
                            int i12 = H8.f10170c;
                            int i13 = (i10 + i8) - i12;
                            H8.f10170c = i12 + i13;
                            B(E() + i13);
                        } else {
                            if (charAt2 < 2048) {
                                U H9 = H(2);
                                byte[] bArr2 = H9.f10168a;
                                int i14 = H9.f10170c;
                                bArr2[i14] = (byte) ((charAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                                bArr2[i14 + 1] = (byte) ((charAt2 & '?') | 128);
                                H9.f10170c = i14 + 2;
                                B(E() + 2);
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i15 = i8 + 1;
                                if (i15 < i9) {
                                    c8 = string.charAt(i15);
                                } else {
                                    c8 = 0;
                                }
                                if (charAt2 <= 56319 && 56320 <= c8 && c8 < 57344) {
                                    int i16 = (((charAt2 & 1023) << 10) | (c8 & 1023)) + 65536;
                                    U H10 = H(4);
                                    byte[] bArr3 = H10.f10168a;
                                    int i17 = H10.f10170c;
                                    bArr3[i17] = (byte) ((i16 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                                    bArr3[i17 + 1] = (byte) (((i16 >> 12) & 63) | 128);
                                    bArr3[i17 + 2] = (byte) (((i16 >> 6) & 63) | 128);
                                    bArr3[i17 + 3] = (byte) ((i16 & 63) | 128);
                                    H10.f10170c = i17 + 4;
                                    B(E() + 4);
                                    i8 += 2;
                                } else {
                                    writeByte(63);
                                    i8 = i15;
                                }
                            } else {
                                U H11 = H(3);
                                byte[] bArr4 = H11.f10168a;
                                int i18 = H11.f10170c;
                                bArr4[i18] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i18 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i18 + 2] = (byte) ((charAt2 & '?') | 128);
                                H11.f10170c = i18 + 3;
                                B(E() + 3);
                            }
                            i8++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i9 + " > " + string.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i9 + " < " + i8).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i8).toString());
    }

    public C1449e U(int i8) {
        if (i8 < 128) {
            writeByte(i8);
        } else if (i8 < 2048) {
            U H8 = H(2);
            byte[] bArr = H8.f10168a;
            int i9 = H8.f10170c;
            bArr[i9] = (byte) ((i8 >> 6) | PsExtractor.AUDIO_STREAM);
            bArr[i9 + 1] = (byte) ((i8 & 63) | 128);
            H8.f10170c = i9 + 2;
            B(E() + 2);
        } else if (55296 <= i8 && i8 < 57344) {
            writeByte(63);
        } else if (i8 < 65536) {
            U H9 = H(3);
            byte[] bArr2 = H9.f10168a;
            int i10 = H9.f10170c;
            bArr2[i10] = (byte) ((i8 >> 12) | 224);
            bArr2[i10 + 1] = (byte) (((i8 >> 6) & 63) | 128);
            bArr2[i10 + 2] = (byte) ((i8 & 63) | 128);
            H9.f10170c = i10 + 3;
            B(E() + 3);
        } else if (i8 <= 1114111) {
            U H10 = H(4);
            byte[] bArr3 = H10.f10168a;
            int i11 = H10.f10170c;
            bArr3[i11] = (byte) ((i8 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            bArr3[i11 + 1] = (byte) (((i8 >> 12) & 63) | 128);
            bArr3[i11 + 2] = (byte) (((i8 >> 6) & 63) | 128);
            bArr3[i11 + 3] = (byte) ((i8 & 63) | 128);
            H10.f10170c = i11 + 4;
            B(E() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + AbstractC1446b.i(i8));
        }
        return this;
    }

    public final void a() {
        skip(E());
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1449e clone() {
        return h();
    }

    @Override // U6.InterfaceC1451g
    public boolean c(long j8, C1452h bytes) {
        AbstractC3292y.i(bytes, "bytes");
        return r(j8, bytes, 0, bytes.J());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1449e) {
            C1449e c1449e = (C1449e) obj;
            if (E() == c1449e.E()) {
                if (E() == 0) {
                    return true;
                }
                U u8 = this.f10211a;
                AbstractC3292y.f(u8);
                U u9 = c1449e.f10211a;
                AbstractC3292y.f(u9);
                int i8 = u8.f10169b;
                int i9 = u9.f10169b;
                long j8 = 0;
                while (j8 < E()) {
                    long min = Math.min(u8.f10170c - i8, u9.f10170c - i9);
                    long j9 = 0;
                    while (j9 < min) {
                        int i10 = i8 + 1;
                        int i11 = i9 + 1;
                        if (u8.f10168a[i8] == u9.f10168a[i9]) {
                            j9++;
                            i8 = i10;
                            i9 = i11;
                        }
                    }
                    if (i8 == u8.f10170c) {
                        u8 = u8.f10173f;
                        AbstractC3292y.f(u8);
                        i8 = u8.f10169b;
                    }
                    if (i9 == u9.f10170c) {
                        u9 = u9.f10173f;
                        AbstractC3292y.f(u9);
                        i9 = u9.f10169b;
                    }
                    j8 += min;
                }
                return true;
            }
        }
        return false;
    }

    @Override // U6.InterfaceC1451g
    public boolean exhausted() {
        if (this.f10212b == 0) {
            return true;
        }
        return false;
    }

    @Override // U6.X
    public void f(C1449e source, long j8) {
        U u8;
        int i8;
        AbstractC3292y.i(source, "source");
        if (source != this) {
            AbstractC1446b.b(source.E(), 0L, j8);
            while (j8 > 0) {
                U u9 = source.f10211a;
                AbstractC3292y.f(u9);
                int i9 = u9.f10170c;
                AbstractC3292y.f(source.f10211a);
                if (j8 < i9 - r1.f10169b) {
                    U u10 = this.f10211a;
                    if (u10 != null) {
                        AbstractC3292y.f(u10);
                        u8 = u10.f10174g;
                    } else {
                        u8 = null;
                    }
                    if (u8 != null && u8.f10172e) {
                        long j9 = u8.f10170c + j8;
                        if (u8.f10171d) {
                            i8 = 0;
                        } else {
                            i8 = u8.f10169b;
                        }
                        if (j9 - i8 <= 8192) {
                            U u11 = source.f10211a;
                            AbstractC3292y.f(u11);
                            u11.f(u8, (int) j8);
                            source.B(source.E() - j8);
                            B(E() + j8);
                            return;
                        }
                    }
                    U u12 = source.f10211a;
                    AbstractC3292y.f(u12);
                    source.f10211a = u12.e((int) j8);
                }
                U u13 = source.f10211a;
                AbstractC3292y.f(u13);
                long j10 = u13.f10170c - u13.f10169b;
                source.f10211a = u13.b();
                U u14 = this.f10211a;
                if (u14 == null) {
                    this.f10211a = u13;
                    u13.f10174g = u13;
                    u13.f10173f = u13;
                } else {
                    AbstractC3292y.f(u14);
                    U u15 = u14.f10174g;
                    AbstractC3292y.f(u15);
                    u15.c(u13).a();
                }
                source.B(source.E() - j10);
                B(E() + j10);
                j8 -= j10;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public final long g() {
        long E8 = E();
        if (E8 == 0) {
            return 0L;
        }
        U u8 = this.f10211a;
        AbstractC3292y.f(u8);
        U u9 = u8.f10174g;
        AbstractC3292y.f(u9);
        if (u9.f10170c < 8192 && u9.f10172e) {
            E8 -= r3 - u9.f10169b;
        }
        return E8;
    }

    public final C1449e h() {
        C1449e c1449e = new C1449e();
        if (E() != 0) {
            U u8 = this.f10211a;
            AbstractC3292y.f(u8);
            U d8 = u8.d();
            c1449e.f10211a = d8;
            d8.f10174g = d8;
            d8.f10173f = d8;
            for (U u9 = u8.f10173f; u9 != u8; u9 = u9.f10173f) {
                U u10 = d8.f10174g;
                AbstractC3292y.f(u10);
                AbstractC3292y.f(u9);
                u10.c(u9.d());
            }
            c1449e.B(E());
        }
        return c1449e;
    }

    public int hashCode() {
        U u8 = this.f10211a;
        if (u8 == null) {
            return 0;
        }
        int i8 = 1;
        do {
            int i9 = u8.f10170c;
            for (int i10 = u8.f10169b; i10 < i9; i10++) {
                i8 = (i8 * 31) + u8.f10168a[i10];
            }
            u8 = u8.f10173f;
            AbstractC3292y.f(u8);
        } while (u8 != this.f10211a);
        return i8;
    }

    public final C1449e i(C1449e out, long j8, long j9) {
        AbstractC3292y.i(out, "out");
        AbstractC1446b.b(E(), j8, j9);
        if (j9 != 0) {
            out.B(out.E() + j9);
            U u8 = this.f10211a;
            while (true) {
                AbstractC3292y.f(u8);
                int i8 = u8.f10170c;
                int i9 = u8.f10169b;
                if (j8 < i8 - i9) {
                    break;
                }
                j8 -= i8 - i9;
                u8 = u8.f10173f;
            }
            while (j9 > 0) {
                AbstractC3292y.f(u8);
                U d8 = u8.d();
                int i10 = d8.f10169b + ((int) j8);
                d8.f10169b = i10;
                d8.f10170c = Math.min(i10 + ((int) j9), d8.f10170c);
                U u9 = out.f10211a;
                if (u9 == null) {
                    d8.f10174g = d8;
                    d8.f10173f = d8;
                    out.f10211a = d8;
                } else {
                    AbstractC3292y.f(u9);
                    U u10 = u9.f10174g;
                    AbstractC3292y.f(u10);
                    u10.c(d8);
                }
                j9 -= d8.f10170c - d8.f10169b;
                u8 = u8.f10173f;
                j8 = 0;
            }
        }
        return this;
    }

    public long indexOf(byte b9, long j8, long j9) {
        U u8;
        int i8;
        long j10 = 0;
        if (0 <= j8 && j8 <= j9) {
            if (j9 > E()) {
                j9 = E();
            }
            if (j8 == j9 || (u8 = this.f10211a) == null) {
                return -1L;
            }
            if (E() - j8 < j8) {
                j10 = E();
                while (j10 > j8) {
                    u8 = u8.f10174g;
                    AbstractC3292y.f(u8);
                    j10 -= u8.f10170c - u8.f10169b;
                }
                while (j10 < j9) {
                    byte[] bArr = u8.f10168a;
                    int min = (int) Math.min(u8.f10170c, (u8.f10169b + j9) - j10);
                    i8 = (int) ((u8.f10169b + j8) - j10);
                    while (i8 < min) {
                        if (bArr[i8] != b9) {
                            i8++;
                        }
                    }
                    j10 += u8.f10170c - u8.f10169b;
                    u8 = u8.f10173f;
                    AbstractC3292y.f(u8);
                    j8 = j10;
                }
                return -1L;
            }
            while (true) {
                long j11 = (u8.f10170c - u8.f10169b) + j10;
                if (j11 > j8) {
                    break;
                }
                u8 = u8.f10173f;
                AbstractC3292y.f(u8);
                j10 = j11;
            }
            while (j10 < j9) {
                byte[] bArr2 = u8.f10168a;
                int min2 = (int) Math.min(u8.f10170c, (u8.f10169b + j9) - j10);
                i8 = (int) ((u8.f10169b + j8) - j10);
                while (i8 < min2) {
                    if (bArr2[i8] != b9) {
                        i8++;
                    }
                }
                j10 += u8.f10170c - u8.f10169b;
                u8 = u8.f10173f;
                AbstractC3292y.f(u8);
                j8 = j10;
            }
            return -1L;
            return (i8 - u8.f10169b) + j10;
        }
        throw new IllegalArgumentException(("size=" + E() + " fromIndex=" + j8 + " toIndex=" + j9).toString());
    }

    @Override // U6.InterfaceC1451g
    public InputStream inputStream() {
        return new b();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final byte k(long j8) {
        AbstractC1446b.b(E(), j8, 1L);
        U u8 = this.f10211a;
        if (u8 != null) {
            if (E() - j8 < j8) {
                long E8 = E();
                while (E8 > j8) {
                    u8 = u8.f10174g;
                    AbstractC3292y.f(u8);
                    E8 -= u8.f10170c - u8.f10169b;
                }
                AbstractC3292y.f(u8);
                return u8.f10168a[(int) ((u8.f10169b + j8) - E8)];
            }
            long j9 = 0;
            while (true) {
                long j10 = (u8.f10170c - u8.f10169b) + j9;
                if (j10 <= j8) {
                    u8 = u8.f10173f;
                    AbstractC3292y.f(u8);
                    j9 = j10;
                } else {
                    AbstractC3292y.f(u8);
                    return u8.f10168a[(int) ((u8.f10169b + j8) - j9)];
                }
            }
        } else {
            AbstractC3292y.f(null);
            throw null;
        }
    }

    @Override // U6.Z
    public long m(C1449e sink, long j8) {
        AbstractC3292y.i(sink, "sink");
        if (j8 >= 0) {
            if (E() == 0) {
                return -1L;
            }
            if (j8 > E()) {
                j8 = E();
            }
            sink.f(this, j8);
            return j8;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
    }

    @Override // U6.InterfaceC1450f
    public OutputStream outputStream() {
        return new c();
    }

    public long p(C1452h targetBytes) {
        AbstractC3292y.i(targetBytes, "targetBytes");
        return q(targetBytes, 0L);
    }

    public long q(C1452h targetBytes, long j8) {
        int i8;
        int i9;
        AbstractC3292y.i(targetBytes, "targetBytes");
        long j9 = 0;
        if (j8 >= 0) {
            U u8 = this.f10211a;
            if (u8 == null) {
                return -1L;
            }
            if (E() - j8 < j8) {
                j9 = E();
                while (j9 > j8) {
                    u8 = u8.f10174g;
                    AbstractC3292y.f(u8);
                    j9 -= u8.f10170c - u8.f10169b;
                }
                if (targetBytes.J() == 2) {
                    byte h8 = targetBytes.h(0);
                    byte h9 = targetBytes.h(1);
                    while (j9 < E()) {
                        byte[] bArr = u8.f10168a;
                        i8 = (int) ((u8.f10169b + j8) - j9);
                        int i10 = u8.f10170c;
                        while (i8 < i10) {
                            byte b9 = bArr[i8];
                            if (b9 != h8 && b9 != h9) {
                                i8++;
                            }
                            i9 = u8.f10169b;
                        }
                        j9 += u8.f10170c - u8.f10169b;
                        u8 = u8.f10173f;
                        AbstractC3292y.f(u8);
                        j8 = j9;
                    }
                    return -1L;
                }
                byte[] r8 = targetBytes.r();
                while (j9 < E()) {
                    byte[] bArr2 = u8.f10168a;
                    i8 = (int) ((u8.f10169b + j8) - j9);
                    int i11 = u8.f10170c;
                    while (i8 < i11) {
                        byte b10 = bArr2[i8];
                        for (byte b11 : r8) {
                            if (b10 == b11) {
                                i9 = u8.f10169b;
                            }
                        }
                        i8++;
                    }
                    j9 += u8.f10170c - u8.f10169b;
                    u8 = u8.f10173f;
                    AbstractC3292y.f(u8);
                    j8 = j9;
                }
                return -1L;
            }
            while (true) {
                long j10 = (u8.f10170c - u8.f10169b) + j9;
                if (j10 > j8) {
                    break;
                }
                u8 = u8.f10173f;
                AbstractC3292y.f(u8);
                j9 = j10;
            }
            if (targetBytes.J() == 2) {
                byte h10 = targetBytes.h(0);
                byte h11 = targetBytes.h(1);
                while (j9 < E()) {
                    byte[] bArr3 = u8.f10168a;
                    i8 = (int) ((u8.f10169b + j8) - j9);
                    int i12 = u8.f10170c;
                    while (i8 < i12) {
                        byte b12 = bArr3[i8];
                        if (b12 != h10 && b12 != h11) {
                            i8++;
                        }
                        i9 = u8.f10169b;
                    }
                    j9 += u8.f10170c - u8.f10169b;
                    u8 = u8.f10173f;
                    AbstractC3292y.f(u8);
                    j8 = j9;
                }
                return -1L;
            }
            byte[] r9 = targetBytes.r();
            while (j9 < E()) {
                byte[] bArr4 = u8.f10168a;
                i8 = (int) ((u8.f10169b + j8) - j9);
                int i13 = u8.f10170c;
                while (i8 < i13) {
                    byte b13 = bArr4[i8];
                    for (byte b14 : r9) {
                        if (b13 == b14) {
                            i9 = u8.f10169b;
                        }
                    }
                    i8++;
                }
                j9 += u8.f10170c - u8.f10169b;
                u8 = u8.f10173f;
                AbstractC3292y.f(u8);
                j8 = j9;
            }
            return -1L;
            return (i8 - i9) + j9;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j8).toString());
    }

    public boolean r(long j8, C1452h bytes, int i8, int i9) {
        AbstractC3292y.i(bytes, "bytes");
        if (j8 < 0 || i8 < 0 || i9 < 0 || E() - j8 < i9 || bytes.J() - i8 < i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (k(i10 + j8) != bytes.h(i8 + i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        AbstractC3292y.i(sink, "sink");
        U u8 = this.f10211a;
        if (u8 == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), u8.f10170c - u8.f10169b);
        sink.put(u8.f10168a, u8.f10169b, min);
        int i8 = u8.f10169b + min;
        u8.f10169b = i8;
        this.f10212b -= min;
        if (i8 == u8.f10170c) {
            this.f10211a = u8.b();
            V.b(u8);
        }
        return min;
    }

    @Override // U6.InterfaceC1451g
    public byte readByte() {
        if (E() != 0) {
            U u8 = this.f10211a;
            AbstractC3292y.f(u8);
            int i8 = u8.f10169b;
            int i9 = u8.f10170c;
            int i10 = i8 + 1;
            byte b9 = u8.f10168a[i8];
            B(E() - 1);
            if (i10 == i9) {
                this.f10211a = u8.b();
                V.b(u8);
            } else {
                u8.f10169b = i10;
            }
            return b9;
        }
        throw new EOFException();
    }

    @Override // U6.InterfaceC1451g
    public byte[] readByteArray() {
        return readByteArray(E());
    }

    @Override // U6.InterfaceC1451g
    public C1452h readByteString(long j8) {
        if (j8 >= 0 && j8 <= 2147483647L) {
            if (E() >= j8) {
                if (j8 >= 4096) {
                    C1452h G8 = G((int) j8);
                    skip(j8);
                    return G8;
                }
                return new C1452h(readByteArray(j8));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j8).toString());
    }

    @Override // U6.InterfaceC1451g
    public long readDecimalLong() {
        int i8;
        String str;
        if (E() != 0) {
            int i9 = 0;
            long j8 = 0;
            long j9 = -7;
            boolean z8 = false;
            boolean z9 = false;
            do {
                U u8 = this.f10211a;
                AbstractC3292y.f(u8);
                byte[] bArr = u8.f10168a;
                int i10 = u8.f10169b;
                int i11 = u8.f10170c;
                while (i10 < i11) {
                    byte b9 = bArr[i10];
                    if (b9 >= 48 && b9 <= 57) {
                        int i12 = 48 - b9;
                        if (j8 >= -922337203685477580L && (j8 != -922337203685477580L || i12 >= j9)) {
                            j8 = (j8 * 10) + i12;
                        } else {
                            C1449e writeByte = new C1449e().writeDecimalLong(j8).writeByte(b9);
                            if (!z8) {
                                writeByte.readByte();
                            }
                            throw new NumberFormatException("Number too large: " + writeByte.readUtf8());
                        }
                    } else if (b9 == 45 && i9 == 0) {
                        j9--;
                        z8 = true;
                    } else {
                        z9 = true;
                        break;
                    }
                    i10++;
                    i9++;
                }
                if (i10 == i11) {
                    this.f10211a = u8.b();
                    V.b(u8);
                } else {
                    u8.f10169b = i10;
                }
                if (z9) {
                    break;
                }
            } while (this.f10211a != null);
            B(E() - i9);
            if (z8) {
                i8 = 2;
            } else {
                i8 = 1;
            }
            if (i9 < i8) {
                if (E() != 0) {
                    if (z8) {
                        str = "Expected a digit";
                    } else {
                        str = "Expected a digit or '-'";
                    }
                    throw new NumberFormatException(str + " but was 0x" + AbstractC1446b.h(k(0L)));
                }
                throw new EOFException();
            }
            if (!z8) {
                return -j8;
            }
            return j8;
        }
        throw new EOFException();
    }

    @Override // U6.InterfaceC1451g
    public void readFully(byte[] sink) {
        AbstractC3292y.i(sink, "sink");
        int i8 = 0;
        while (i8 < sink.length) {
            int read = read(sink, i8, sink.length - i8);
            if (read != -1) {
                i8 += read;
            } else {
                throw new EOFException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7 A[EDGE_INSN: B:40:0x00a7->B:37:0x00a7 BREAK  A[LOOP:0: B:4:0x000d->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    @Override // U6.InterfaceC1451g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readHexadecimalUnsignedLong() {
        /*
            r15 = this;
            long r0 = r15.E()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb1
            r0 = 0
            r4 = r2
            r1 = 0
        Ld:
            U6.U r6 = r15.f10211a
            kotlin.jvm.internal.AbstractC3292y.f(r6)
            byte[] r7 = r6.f10168a
            int r8 = r6.f10169b
            int r9 = r6.f10170c
        L18:
            if (r8 >= r9) goto L93
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L74
            r11 = 70
            if (r10 > r11) goto L74
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            U6.e r0 = new U6.e
            r0.<init>()
            U6.e r0 = r0.writeHexadecimalUnsignedLong(r4)
            U6.e r0 = r0.writeByte(r10)
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
        L74:
            if (r0 == 0) goto L78
            r1 = 1
            goto L93
        L78:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = U6.AbstractC1446b.h(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L93:
            if (r8 != r9) goto L9f
            U6.U r7 = r6.b()
            r15.f10211a = r7
            U6.V.b(r6)
            goto La1
        L9f:
            r6.f10169b = r8
        La1:
            if (r1 != 0) goto La7
            U6.U r6 = r15.f10211a
            if (r6 != 0) goto Ld
        La7:
            long r1 = r15.E()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.B(r1)
            return r4
        Lb1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: U6.C1449e.readHexadecimalUnsignedLong():long");
    }

    @Override // U6.InterfaceC1451g
    public int readInt() {
        if (E() >= 4) {
            U u8 = this.f10211a;
            AbstractC3292y.f(u8);
            int i8 = u8.f10169b;
            int i9 = u8.f10170c;
            if (i9 - i8 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = u8.f10168a;
            int i10 = i8 + 3;
            int i11 = ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8] & 255) << 24) | ((bArr[i8 + 2] & 255) << 8);
            int i12 = i8 + 4;
            int i13 = (bArr[i10] & 255) | i11;
            B(E() - 4);
            if (i12 == i9) {
                this.f10211a = u8.b();
                V.b(u8);
            } else {
                u8.f10169b = i12;
            }
            return i13;
        }
        throw new EOFException();
    }

    @Override // U6.InterfaceC1451g
    public int readIntLe() {
        return AbstractC1446b.e(readInt());
    }

    public long readLong() {
        if (E() >= 8) {
            U u8 = this.f10211a;
            AbstractC3292y.f(u8);
            int i8 = u8.f10169b;
            int i9 = u8.f10170c;
            if (i9 - i8 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = u8.f10168a;
            int i10 = i8 + 7;
            long j8 = ((bArr[i8 + 3] & 255) << 32) | ((bArr[i8] & 255) << 56) | ((bArr[i8 + 1] & 255) << 48) | ((bArr[i8 + 2] & 255) << 40) | ((bArr[i8 + 4] & 255) << 24) | ((bArr[i8 + 5] & 255) << 16) | ((bArr[i8 + 6] & 255) << 8);
            int i11 = i8 + 8;
            long j9 = j8 | (bArr[i10] & 255);
            B(E() - 8);
            if (i11 == i9) {
                this.f10211a = u8.b();
                V.b(u8);
            } else {
                u8.f10169b = i11;
            }
            return j9;
        }
        throw new EOFException();
    }

    @Override // U6.InterfaceC1451g
    public long readLongLe() {
        return AbstractC1446b.f(readLong());
    }

    @Override // U6.InterfaceC1451g
    public short readShort() {
        if (E() >= 2) {
            U u8 = this.f10211a;
            AbstractC3292y.f(u8);
            int i8 = u8.f10169b;
            int i9 = u8.f10170c;
            if (i9 - i8 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = u8.f10168a;
            int i10 = i8 + 1;
            int i11 = (bArr[i8] & 255) << 8;
            int i12 = i8 + 2;
            int i13 = (bArr[i10] & 255) | i11;
            B(E() - 2);
            if (i12 == i9) {
                this.f10211a = u8.b();
                V.b(u8);
            } else {
                u8.f10169b = i12;
            }
            return (short) i13;
        }
        throw new EOFException();
    }

    @Override // U6.InterfaceC1451g
    public short readShortLe() {
        return AbstractC1446b.g(readShort());
    }

    public String readString(long j8, Charset charset) {
        AbstractC3292y.i(charset, "charset");
        if (j8 >= 0 && j8 <= 2147483647L) {
            if (this.f10212b >= j8) {
                if (j8 == 0) {
                    return "";
                }
                U u8 = this.f10211a;
                AbstractC3292y.f(u8);
                int i8 = u8.f10169b;
                if (i8 + j8 > u8.f10170c) {
                    return new String(readByteArray(j8), charset);
                }
                int i9 = (int) j8;
                String str = new String(u8.f10168a, i8, i9, charset);
                int i10 = u8.f10169b + i9;
                u8.f10169b = i10;
                this.f10212b -= j8;
                if (i10 == u8.f10170c) {
                    this.f10211a = u8.b();
                    V.b(u8);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j8).toString());
    }

    public String readUtf8() {
        return readString(this.f10212b, C3338d.f34755b);
    }

    @Override // U6.InterfaceC1451g
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // U6.InterfaceC1451g
    public void require(long j8) {
        if (this.f10212b >= j8) {
        } else {
            throw new EOFException();
        }
    }

    @Override // U6.InterfaceC1451g
    public void skip(long j8) {
        while (j8 > 0) {
            U u8 = this.f10211a;
            if (u8 != null) {
                int min = (int) Math.min(j8, u8.f10170c - u8.f10169b);
                long j9 = min;
                B(E() - j9);
                j8 -= j9;
                int i8 = u8.f10169b + min;
                u8.f10169b = i8;
                if (i8 == u8.f10170c) {
                    this.f10211a = u8.b();
                    V.b(u8);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public C1452h t() {
        return readByteString(E());
    }

    @Override // U6.Z
    public a0 timeout() {
        return a0.f10186e;
    }

    public String toString() {
        return F().toString();
    }

    /* renamed from: U6.e$b */
    /* loaded from: classes5.dex */
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C1449e.this.E(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public int read() {
            if (C1449e.this.E() > 0) {
                return C1449e.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C1449e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i8, int i9) {
            AbstractC3292y.i(sink, "sink");
            return C1449e.this.read(sink, i8, i9);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // U6.InterfaceC1451g
    public byte[] readByteArray(long j8) {
        if (j8 < 0 || j8 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j8).toString());
        }
        if (E() >= j8) {
            byte[] bArr = new byte[(int) j8];
            readFully(bArr);
            return bArr;
        }
        throw new EOFException();
    }

    @Override // U6.InterfaceC1451g
    public String readUtf8(long j8) {
        return readString(j8, C3338d.f34755b);
    }

    @Override // U6.InterfaceC1451g
    public String readUtf8LineStrict(long j8) {
        if (j8 >= 0) {
            long j9 = j8 != Long.MAX_VALUE ? j8 + 1 : Long.MAX_VALUE;
            long indexOf = indexOf((byte) 10, 0L, j9);
            if (indexOf != -1) {
                return V6.a.b(this, indexOf);
            }
            if (j9 < E() && k(j9 - 1) == 13 && k(j9) == 10) {
                return V6.a.b(this, j9);
            }
            C1449e c1449e = new C1449e();
            i(c1449e, 0L, Math.min(32, E()));
            throw new EOFException("\\n not found: limit=" + Math.min(E(), j8) + " content=" + c1449e.t().n() + (char) 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j8).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        AbstractC3292y.i(source, "source");
        int remaining = source.remaining();
        int i8 = remaining;
        while (i8 > 0) {
            U H8 = H(1);
            int min = Math.min(i8, 8192 - H8.f10170c);
            source.get(H8.f10168a, H8.f10170c, min);
            i8 -= min;
            H8.f10170c += min;
        }
        this.f10212b += remaining;
        return remaining;
    }

    public int read(byte[] sink, int i8, int i9) {
        AbstractC3292y.i(sink, "sink");
        AbstractC1446b.b(sink.length, i8, i9);
        U u8 = this.f10211a;
        if (u8 == null) {
            return -1;
        }
        int min = Math.min(i9, u8.f10170c - u8.f10169b);
        byte[] bArr = u8.f10168a;
        int i10 = u8.f10169b;
        AbstractC1428l.d(bArr, sink, i8, i10, i10 + min);
        u8.f10169b += min;
        B(E() - min);
        if (u8.f10169b == u8.f10170c) {
            this.f10211a = u8.b();
            V.b(u8);
        }
        return min;
    }

    @Override // U6.InterfaceC1451g
    public C1449e buffer() {
        return this;
    }

    @Override // U6.Z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // U6.InterfaceC1450f, U6.X, java.io.Flushable
    public void flush() {
    }

    @Override // U6.InterfaceC1450f
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C1449e emitCompleteSegments() {
        return this;
    }

    @Override // U6.InterfaceC1451g
    public C1449e l() {
        return this;
    }
}
