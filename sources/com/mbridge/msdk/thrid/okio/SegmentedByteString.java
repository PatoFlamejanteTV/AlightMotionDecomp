package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SegmentedByteString extends ByteString {
    final transient int[] directory;
    final transient byte[][] segments;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SegmentedByteString(Buffer buffer, int i8) {
        super(null);
        Util.checkOffsetAndCount(buffer.size, 0L, i8);
        Segment segment = buffer.head;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            int i12 = segment.limit;
            int i13 = segment.pos;
            if (i12 != i13) {
                i10 += i12 - i13;
                i11++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.segments = new byte[i11];
        this.directory = new int[i11 * 2];
        Segment segment2 = buffer.head;
        int i14 = 0;
        while (i9 < i8) {
            byte[][] bArr = this.segments;
            bArr[i14] = segment2.data;
            int i15 = segment2.limit;
            int i16 = segment2.pos;
            i9 += i15 - i16;
            if (i9 > i8) {
                i9 = i8;
            }
            int[] iArr = this.directory;
            iArr[i14] = i9;
            iArr[bArr.length + i14] = i16;
            segment2.shared = true;
            i14++;
            segment2 = segment2.next;
        }
    }

    private int segment(int i8) {
        int binarySearch = Arrays.binarySearch(this.directory, 0, this.segments.length, i8 + 1);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        return binarySearch;
    }

    private ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    private Object writeReplace() {
        return toByteString();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public String base64() {
        return toByteString().base64();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public String base64Url() {
        return toByteString().base64Url();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public byte getByte(int i8) {
        int i9;
        Util.checkOffsetAndCount(this.directory[this.segments.length - 1], i8, 1L);
        int segment = segment(i8);
        if (segment == 0) {
            i9 = 0;
        } else {
            i9 = this.directory[segment - 1];
        }
        int[] iArr = this.directory;
        byte[][] bArr = this.segments;
        return bArr[segment][(i8 - i9) + iArr[bArr.length + segment]];
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public int hashCode() {
        int i8 = this.hashCode;
        if (i8 != 0) {
            return i8;
        }
        int length = this.segments.length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1;
        while (i9 < length) {
            byte[] bArr = this.segments[i9];
            int[] iArr = this.directory;
            int i12 = iArr[length + i9];
            int i13 = iArr[i9];
            int i14 = (i13 - i10) + i12;
            while (i12 < i14) {
                i11 = (i11 * 31) + bArr[i12];
                i12++;
            }
            i9++;
            i10 = i13;
        }
        this.hashCode = i11;
        return i11;
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public String hex() {
        return toByteString().hex();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public ByteString hmacSha1(ByteString byteString) {
        return toByteString().hmacSha1(byteString);
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public ByteString hmacSha256(ByteString byteString) {
        return toByteString().hmacSha256(byteString);
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public int indexOf(byte[] bArr, int i8) {
        return toByteString().indexOf(bArr, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public byte[] internalArray() {
        return toByteArray();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public int lastIndexOf(byte[] bArr, int i8) {
        return toByteString().lastIndexOf(bArr, i8);
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public ByteString md5() {
        return toByteString().md5();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public boolean rangeEquals(int i8, ByteString byteString, int i9, int i10) {
        if (i8 < 0 || i8 > size() - i10) {
            return false;
        }
        int segment = segment(i8);
        while (i10 > 0) {
            int i11 = segment == 0 ? 0 : this.directory[segment - 1];
            int min = Math.min(i10, ((this.directory[segment] - i11) + i11) - i8);
            int[] iArr = this.directory;
            byte[][] bArr = this.segments;
            if (!byteString.rangeEquals(i9, bArr[segment], (i8 - i11) + iArr[bArr.length + segment], min)) {
                return false;
            }
            i8 += min;
            i9 += min;
            i10 -= min;
            segment++;
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public ByteString sha1() {
        return toByteString().sha1();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public ByteString sha256() {
        return toByteString().sha256();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public int size() {
        return this.directory[this.segments.length - 1];
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public String string(Charset charset) {
        return toByteString().string(charset);
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public ByteString substring(int i8) {
        return toByteString().substring(i8);
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public byte[] toByteArray() {
        int[] iArr = this.directory;
        byte[][] bArr = this.segments;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int[] iArr2 = this.directory;
            int i10 = iArr2[length + i8];
            int i11 = iArr2[i8];
            System.arraycopy(this.segments[i8], i10, bArr2, i9, i11 - i9);
            i8++;
            i9 = i11;
        }
        return bArr2;
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public String toString() {
        return toByteString().toString();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public String utf8() {
        return toByteString().utf8();
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public void write(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            int length = this.segments.length;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                int[] iArr = this.directory;
                int i10 = iArr[length + i8];
                int i11 = iArr[i8];
                outputStream.write(this.segments[i8], i10, i11 - i9);
                i8++;
                i9 = i11;
            }
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public ByteString substring(int i8, int i9) {
        return toByteString().substring(i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public void write(Buffer buffer) {
        int length = this.segments.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int[] iArr = this.directory;
            int i10 = iArr[length + i8];
            int i11 = iArr[i8];
            Segment segment = new Segment(this.segments[i8], i10, (i10 + i11) - i9, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                segment2.prev.push(segment);
            }
            i8++;
            i9 = i11;
        }
        buffer.size += i9;
    }

    @Override // com.mbridge.msdk.thrid.okio.ByteString
    public boolean rangeEquals(int i8, byte[] bArr, int i9, int i10) {
        if (i8 < 0 || i8 > size() - i10 || i9 < 0 || i9 > bArr.length - i10) {
            return false;
        }
        int segment = segment(i8);
        while (i10 > 0) {
            int i11 = segment == 0 ? 0 : this.directory[segment - 1];
            int min = Math.min(i10, ((this.directory[segment] - i11) + i11) - i8);
            int[] iArr = this.directory;
            byte[][] bArr2 = this.segments;
            if (!Util.arrayRangeEquals(bArr2[segment], (i8 - i11) + iArr[bArr2.length + segment], bArr, i9, min)) {
                return false;
            }
            i8 += min;
            i9 += min;
            i10 -= min;
            segment++;
        }
        return true;
    }
}
