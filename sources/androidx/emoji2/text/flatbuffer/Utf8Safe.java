package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.Utf8;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class Utf8Safe extends Utf8 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i8, int i9) {
            super("Unpaired surrogate at index " + i8 + " of " + i9);
        }
    }

    private static int computeEncodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i8 = 0;
        while (i8 < length && charSequence.charAt(i8) < 128) {
            i8++;
        }
        int i9 = length;
        while (true) {
            if (i8 < length) {
                char charAt = charSequence.charAt(i8);
                if (charAt < 2048) {
                    i9 += (127 - charAt) >>> 31;
                    i8++;
                } else {
                    i9 += encodedLengthGeneral(charSequence, i8);
                    break;
                }
            } else {
                break;
            }
        }
        if (i9 >= length) {
            return i9;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i9 + 4294967296L));
    }

    public static String decodeUtf8Array(byte[] bArr, int i8, int i9) {
        if ((i8 | i9 | ((bArr.length - i8) - i9)) >= 0) {
            int i10 = i8 + i9;
            char[] cArr = new char[i9];
            int i11 = 0;
            while (i8 < i10) {
                byte b9 = bArr[i8];
                if (!Utf8.DecodeUtil.isOneByte(b9)) {
                    break;
                }
                i8++;
                Utf8.DecodeUtil.handleOneByte(b9, cArr, i11);
                i11++;
            }
            int i12 = i11;
            while (i8 < i10) {
                int i13 = i8 + 1;
                byte b10 = bArr[i8];
                if (Utf8.DecodeUtil.isOneByte(b10)) {
                    int i14 = i12 + 1;
                    Utf8.DecodeUtil.handleOneByte(b10, cArr, i12);
                    while (i13 < i10) {
                        byte b11 = bArr[i13];
                        if (!Utf8.DecodeUtil.isOneByte(b11)) {
                            break;
                        }
                        i13++;
                        Utf8.DecodeUtil.handleOneByte(b11, cArr, i14);
                        i14++;
                    }
                    i12 = i14;
                    i8 = i13;
                } else if (Utf8.DecodeUtil.isTwoBytes(b10)) {
                    if (i13 < i10) {
                        i8 += 2;
                        Utf8.DecodeUtil.handleTwoBytes(b10, bArr[i13], cArr, i12);
                        i12++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (Utf8.DecodeUtil.isThreeBytes(b10)) {
                    if (i13 < i10 - 1) {
                        int i15 = i8 + 2;
                        i8 += 3;
                        Utf8.DecodeUtil.handleThreeBytes(b10, bArr[i13], bArr[i15], cArr, i12);
                        i12++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (i13 < i10 - 2) {
                    byte b12 = bArr[i13];
                    int i16 = i8 + 3;
                    byte b13 = bArr[i8 + 2];
                    i8 += 4;
                    Utf8.DecodeUtil.handleFourBytes(b10, b12, b13, bArr[i16], cArr, i12);
                    i12 += 2;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
            return new String(cArr, 0, i12);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)));
    }

    public static String decodeUtf8Buffer(ByteBuffer byteBuffer, int i8, int i9) {
        if ((i8 | i9 | ((byteBuffer.limit() - i8) - i9)) >= 0) {
            int i10 = i8 + i9;
            char[] cArr = new char[i9];
            int i11 = 0;
            while (i8 < i10) {
                byte b9 = byteBuffer.get(i8);
                if (!Utf8.DecodeUtil.isOneByte(b9)) {
                    break;
                }
                i8++;
                Utf8.DecodeUtil.handleOneByte(b9, cArr, i11);
                i11++;
            }
            int i12 = i11;
            while (i8 < i10) {
                int i13 = i8 + 1;
                byte b10 = byteBuffer.get(i8);
                if (Utf8.DecodeUtil.isOneByte(b10)) {
                    int i14 = i12 + 1;
                    Utf8.DecodeUtil.handleOneByte(b10, cArr, i12);
                    while (i13 < i10) {
                        byte b11 = byteBuffer.get(i13);
                        if (!Utf8.DecodeUtil.isOneByte(b11)) {
                            break;
                        }
                        i13++;
                        Utf8.DecodeUtil.handleOneByte(b11, cArr, i14);
                        i14++;
                    }
                    i12 = i14;
                    i8 = i13;
                } else if (Utf8.DecodeUtil.isTwoBytes(b10)) {
                    if (i13 < i10) {
                        i8 += 2;
                        Utf8.DecodeUtil.handleTwoBytes(b10, byteBuffer.get(i13), cArr, i12);
                        i12++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (Utf8.DecodeUtil.isThreeBytes(b10)) {
                    if (i13 < i10 - 1) {
                        int i15 = i8 + 2;
                        i8 += 3;
                        Utf8.DecodeUtil.handleThreeBytes(b10, byteBuffer.get(i13), byteBuffer.get(i15), cArr, i12);
                        i12++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (i13 < i10 - 2) {
                    byte b12 = byteBuffer.get(i13);
                    int i16 = i8 + 3;
                    byte b13 = byteBuffer.get(i8 + 2);
                    i8 += 4;
                    Utf8.DecodeUtil.handleFourBytes(b10, b12, b13, byteBuffer.get(i16), cArr, i12);
                    i12 += 2;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
            return new String(cArr, 0, i12);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i8), Integer.valueOf(i9)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:            return r9 + r0;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int encodeUtf8Array(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.flatbuffer.Utf8Safe.encodeUtf8Array(java.lang.CharSequence, byte[], int, int):int");
    }

    private static void encodeUtf8Buffer(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i8 = 0;
        while (i8 < length) {
            try {
                char charAt = charSequence.charAt(i8);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i8, (byte) charAt);
                i8++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i8) + " at index " + (byteBuffer.position() + Math.max(i8, (position - byteBuffer.position()) + 1)));
            }
        }
        if (i8 == length) {
            byteBuffer.position(position + i8);
            return;
        }
        position += i8;
        while (i8 < length) {
            char charAt2 = charSequence.charAt(i8);
            if (charAt2 < 128) {
                byteBuffer.put(position, (byte) charAt2);
            } else if (charAt2 < 2048) {
                int i9 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt2 >>> 6) | PsExtractor.AUDIO_STREAM));
                    byteBuffer.put(i9, (byte) ((charAt2 & '?') | 128));
                    position = i9;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i9;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i8) + " at index " + (byteBuffer.position() + Math.max(i8, (position - byteBuffer.position()) + 1)));
                }
            } else {
                if (charAt2 >= 55296 && 57343 >= charAt2) {
                    int i10 = i8 + 1;
                    if (i10 != length) {
                        try {
                            char charAt3 = charSequence.charAt(i10);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i11 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                    int i12 = position + 2;
                                    try {
                                        byteBuffer.put(i11, (byte) (((codePoint >>> 12) & 63) | 128));
                                        position += 3;
                                        byteBuffer.put(i12, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(position, (byte) ((codePoint & 63) | 128));
                                        i8 = i10;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        i8 = i10;
                                        position = i12;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i8) + " at index " + (byteBuffer.position() + Math.max(i8, (position - byteBuffer.position()) + 1)));
                                    }
                                } catch (IndexOutOfBoundsException unused4) {
                                    position = i11;
                                    i8 = i10;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i8) + " at index " + (byteBuffer.position() + Math.max(i8, (position - byteBuffer.position()) + 1)));
                                }
                            } else {
                                i8 = i10;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new UnpairedSurrogateException(i8, length);
                }
                int i13 = position + 1;
                byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | 224));
                position += 2;
                byteBuffer.put(i13, (byte) (((charAt2 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
            }
            i8++;
            position++;
        }
        byteBuffer.position(position);
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i8) {
        int length = charSequence.length();
        int i9 = 0;
        while (i8 < length) {
            char charAt = charSequence.charAt(i8);
            if (charAt < 2048) {
                i9 += (127 - charAt) >>> 31;
            } else {
                i9 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i8) >= 65536) {
                        i8++;
                    } else {
                        throw new UnpairedSurrogateException(i8, length);
                    }
                }
            }
            i8++;
        }
        return i9;
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public String decodeUtf8(ByteBuffer byteBuffer, int i8, int i9) throws IllegalArgumentException {
        if (byteBuffer.hasArray()) {
            return decodeUtf8Array(byteBuffer.array(), byteBuffer.arrayOffset() + i8, i9);
        }
        return decodeUtf8Buffer(byteBuffer, i8, i9);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(encodeUtf8Array(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else {
            encodeUtf8Buffer(charSequence, byteBuffer);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(CharSequence charSequence) {
        return computeEncodedLength(charSequence);
    }
}
