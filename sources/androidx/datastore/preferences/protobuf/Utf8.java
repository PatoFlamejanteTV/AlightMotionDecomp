package androidx.datastore.preferences.protobuf;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class DecodeUtil {
        private DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte b9, byte b10, byte b11, byte b12, char[] cArr, int i8) throws InvalidProtocolBufferException {
            if (!isNotTrailingByte(b10) && (((b9 << 28) + (b10 + 112)) >> 30) == 0 && !isNotTrailingByte(b11) && !isNotTrailingByte(b12)) {
                int trailingByteValue = ((b9 & 7) << 18) | (trailingByteValue(b10) << 12) | (trailingByteValue(b11) << 6) | trailingByteValue(b12);
                cArr[i8] = highSurrogate(trailingByteValue);
                cArr[i8 + 1] = lowSurrogate(trailingByteValue);
                return;
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte b9, char[] cArr, int i8) {
            cArr[i8] = (char) b9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte b9, byte b10, byte b11, char[] cArr, int i8) throws InvalidProtocolBufferException {
            if (!isNotTrailingByte(b10) && ((b9 != -32 || b10 >= -96) && ((b9 != -19 || b10 < -96) && !isNotTrailingByte(b11)))) {
                cArr[i8] = (char) (((b9 & 15) << 12) | (trailingByteValue(b10) << 6) | trailingByteValue(b11));
                return;
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte b9, byte b10, char[] cArr, int i8) throws InvalidProtocolBufferException {
            if (b9 >= -62 && !isNotTrailingByte(b10)) {
                cArr[i8] = (char) (((b9 & 31) << 6) | trailingByteValue(b10));
                return;
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        private static char highSurrogate(int i8) {
            return (char) ((i8 >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b9) {
            return b9 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b9) {
            return b9 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b9) {
            return b9 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b9) {
            return b9 < -32;
        }

        private static char lowSurrogate(int i8) {
            return (char) ((i8 & 1023) + 56320);
        }

        private static int trailingByteValue(byte b9) {
            return b9 & 63;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class Processor {
        Processor() {
        }

        final String decodeUtf8(ByteBuffer byteBuffer, int i8, int i9) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i8, i9);
            }
            if (byteBuffer.isDirect()) {
                return decodeUtf8Direct(byteBuffer, i8, i9);
            }
            return decodeUtf8Default(byteBuffer, i8, i9);
        }

        abstract String decodeUtf8(byte[] bArr, int i8, int i9) throws InvalidProtocolBufferException;

        final String decodeUtf8Default(ByteBuffer byteBuffer, int i8, int i9) throws InvalidProtocolBufferException {
            if ((i8 | i9 | ((byteBuffer.limit() - i8) - i9)) >= 0) {
                int i10 = i8 + i9;
                char[] cArr = new char[i9];
                int i11 = 0;
                while (i8 < i10) {
                    byte b9 = byteBuffer.get(i8);
                    if (!DecodeUtil.isOneByte(b9)) {
                        break;
                    }
                    i8++;
                    DecodeUtil.handleOneByte(b9, cArr, i11);
                    i11++;
                }
                int i12 = i11;
                while (i8 < i10) {
                    int i13 = i8 + 1;
                    byte b10 = byteBuffer.get(i8);
                    if (DecodeUtil.isOneByte(b10)) {
                        int i14 = i12 + 1;
                        DecodeUtil.handleOneByte(b10, cArr, i12);
                        while (i13 < i10) {
                            byte b11 = byteBuffer.get(i13);
                            if (!DecodeUtil.isOneByte(b11)) {
                                break;
                            }
                            i13++;
                            DecodeUtil.handleOneByte(b11, cArr, i14);
                            i14++;
                        }
                        i12 = i14;
                        i8 = i13;
                    } else if (DecodeUtil.isTwoBytes(b10)) {
                        if (i13 < i10) {
                            i8 += 2;
                            DecodeUtil.handleTwoBytes(b10, byteBuffer.get(i13), cArr, i12);
                            i12++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (DecodeUtil.isThreeBytes(b10)) {
                        if (i13 < i10 - 1) {
                            int i15 = i8 + 2;
                            i8 += 3;
                            DecodeUtil.handleThreeBytes(b10, byteBuffer.get(i13), byteBuffer.get(i15), cArr, i12);
                            i12++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (i13 < i10 - 2) {
                        byte b12 = byteBuffer.get(i13);
                        int i16 = i8 + 3;
                        byte b13 = byteBuffer.get(i8 + 2);
                        i8 += 4;
                        DecodeUtil.handleFourBytes(b10, b12, b13, byteBuffer.get(i16), cArr, i12);
                        i12 += 2;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                }
                return new String(cArr, 0, i12);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i8), Integer.valueOf(i9)));
        }

        abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i8, int i9) throws InvalidProtocolBufferException;

        abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i8, int i9);

        final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                Java8Compatibility.position(byteBuffer, Utf8.encode(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(charSequence, byteBuffer);
            } else {
                encodeUtf8Default(charSequence, byteBuffer);
            }
        }

        final void encodeUtf8Default(CharSequence charSequence, ByteBuffer byteBuffer) {
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
                Java8Compatibility.position(byteBuffer, position + i8);
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
            Java8Compatibility.position(byteBuffer, position);
        }

        abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

        final boolean isValidUtf8(byte[] bArr, int i8, int i9) {
            return partialIsValidUtf8(0, bArr, i8, i9) == 0;
        }

        final int partialIsValidUtf8(int i8, ByteBuffer byteBuffer, int i9, int i10) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                return partialIsValidUtf8(i8, byteBuffer.array(), i9 + arrayOffset, arrayOffset + i10);
            }
            if (byteBuffer.isDirect()) {
                return partialIsValidUtf8Direct(i8, byteBuffer, i9, i10);
            }
            return partialIsValidUtf8Default(i8, byteBuffer, i9, i10);
        }

        abstract int partialIsValidUtf8(int i8, byte[] bArr, int i9, int i10);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:            if (r8.get(r9) > (-65)) goto L13;     */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:            if (r8.get(r9) > (-65)) goto L32;     */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:            if (r8.get(r7) > (-65)) goto L53;     */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final int partialIsValidUtf8Default(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L92
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L92
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$000(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L64
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L62
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$000(r0, r1)
                return r7
            L62:
                r9 = 0
                goto L6a
            L64:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L6a:
                if (r9 != 0) goto L7c
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L79
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$100(r0, r1, r7)
                return r7
            L79:
                r5 = r9
                r9 = r7
                r7 = r5
            L7c:
                if (r1 > r3) goto L91
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L91
                if (r9 > r3) goto L91
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L92
            L91:
                return r2
            L92:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.Processor.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
        }

        abstract int partialIsValidUtf8Direct(int i8, ByteBuffer byteBuffer, int i9, int i10);

        final boolean isValidUtf8(ByteBuffer byteBuffer, int i8, int i9) {
            return partialIsValidUtf8(0, byteBuffer, i8, i9) == 0;
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i8, int i9) {
            int estimateConsecutiveAscii = i8 + Utf8.estimateConsecutiveAscii(byteBuffer, i8, i9);
            while (estimateConsecutiveAscii < i9) {
                int i10 = estimateConsecutiveAscii + 1;
                byte b9 = byteBuffer.get(estimateConsecutiveAscii);
                if (b9 >= 0) {
                    estimateConsecutiveAscii = i10;
                } else if (b9 < -32) {
                    if (i10 >= i9) {
                        return b9;
                    }
                    if (b9 < -62 || byteBuffer.get(i10) > -65) {
                        return -1;
                    }
                    estimateConsecutiveAscii += 2;
                } else {
                    if (b9 >= -16) {
                        if (i10 >= i9 - 2) {
                            return Utf8.incompleteStateFor(byteBuffer, b9, i10, i9 - i10);
                        }
                        int i11 = estimateConsecutiveAscii + 2;
                        byte b10 = byteBuffer.get(i10);
                        if (b10 <= -65 && (((b9 << 28) + (b10 + 112)) >> 30) == 0) {
                            int i12 = estimateConsecutiveAscii + 3;
                            if (byteBuffer.get(i11) <= -65) {
                                estimateConsecutiveAscii += 4;
                                if (byteBuffer.get(i12) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i10 >= i9 - 1) {
                        return Utf8.incompleteStateFor(byteBuffer, b9, i10, i9 - i10);
                    }
                    int i13 = estimateConsecutiveAscii + 2;
                    byte b11 = byteBuffer.get(i10);
                    if (b11 > -65 || ((b9 == -32 && b11 < -96) || ((b9 == -19 && b11 >= -96) || byteBuffer.get(i13) > -65))) {
                        return -1;
                    }
                    estimateConsecutiveAscii += 3;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
        /* JADX INFO: Access modifiers changed from: package-private */
        public UnpairedSurrogateException(int i8, int i9) {
            super("Unpaired surrogate at index " + i8 + " of " + i9);
        }
    }

    static {
        Processor safeProcessor;
        if (UnsafeProcessor.isAvailable() && !Android.isOnAndroidDevice()) {
            safeProcessor = new UnsafeProcessor();
        } else {
            safeProcessor = new SafeProcessor();
        }
        processor = safeProcessor;
    }

    private Utf8() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String decodeUtf8(ByteBuffer byteBuffer, int i8, int i9) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(byteBuffer, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int encode(CharSequence charSequence, byte[] bArr, int i8, int i9) {
        return processor.encodeUtf8(charSequence, bArr, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        processor.encodeUtf8(charSequence, byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int encodedLength(CharSequence charSequence) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i8, int i9) {
        int i10 = i9 - 7;
        int i11 = i8;
        while (i11 < i10 && (byteBuffer.getLong(i11) & (-9187201950435737472L)) == 0) {
            i11 += 8;
        }
        return i11 - i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i8) {
        if (i8 > -12) {
            return -1;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int partialIsValidUtf8(int i8, byte[] bArr, int i9, int i10) {
        return processor.partialIsValidUtf8(i8, bArr, i9, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String decodeUtf8(byte[] bArr, int i8, int i9) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(bArr, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i8, int i9) {
        if (i8 > -12 || i9 > -65) {
            return -1;
        }
        return i8 ^ (i9 << 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isValidUtf8(byte[] bArr, int i8, int i9) {
        return processor.isValidUtf8(bArr, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int partialIsValidUtf8(int i8, ByteBuffer byteBuffer, int i9, int i10) {
        return processor.partialIsValidUtf8(i8, byteBuffer, i9, i10);
    }

    /* loaded from: classes3.dex */
    static final class UnsafeProcessor extends Processor {
        UnsafeProcessor() {
        }

        static boolean isAvailable() {
            if (UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations()) {
                return true;
            }
            return false;
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j8, int i8) {
            int i9 = 0;
            if (i8 < 16) {
                return 0;
            }
            int i10 = 8 - (((int) j8) & 7);
            while (i9 < i10) {
                long j9 = 1 + j8;
                if (UnsafeUtil.getByte(bArr, j8) < 0) {
                    return i9;
                }
                i9++;
                j8 = j9;
            }
            while (true) {
                int i11 = i9 + 8;
                if (i11 > i8 || (UnsafeUtil.getLong((Object) bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j8) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j8 += 8;
                i9 = i11;
            }
            while (i9 < i8) {
                long j10 = j8 + 1;
                if (UnsafeUtil.getByte(bArr, j8) < 0) {
                    return i9;
                }
                i9++;
                j8 = j10;
            }
            return i8;
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i8, long j8, int i9) {
            if (i9 == 0) {
                return Utf8.incompleteStateFor(i8);
            }
            if (i9 == 1) {
                return Utf8.incompleteStateFor(i8, UnsafeUtil.getByte(bArr, j8));
            }
            if (i9 == 2) {
                return Utf8.incompleteStateFor(i8, UnsafeUtil.getByte(bArr, j8), UnsafeUtil.getByte(bArr, j8 + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        String decodeUtf8(byte[] bArr, int i8, int i9) throws InvalidProtocolBufferException {
            Charset charset = Internal.UTF_8;
            String str = new String(bArr, i8, i9, charset);
            if (!str.contains("�")) {
                return str;
            }
            if (Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i8, i9 + i8))) {
                return str;
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        String decodeUtf8Direct(ByteBuffer byteBuffer, int i8, int i9) throws InvalidProtocolBufferException {
            if ((i8 | i9 | ((byteBuffer.limit() - i8) - i9)) >= 0) {
                long addressOffset = UnsafeUtil.addressOffset(byteBuffer) + i8;
                long j8 = i9 + addressOffset;
                char[] cArr = new char[i9];
                int i10 = 0;
                while (addressOffset < j8) {
                    byte b9 = UnsafeUtil.getByte(addressOffset);
                    if (!DecodeUtil.isOneByte(b9)) {
                        break;
                    }
                    addressOffset++;
                    DecodeUtil.handleOneByte(b9, cArr, i10);
                    i10++;
                }
                while (addressOffset < j8) {
                    long j9 = addressOffset + 1;
                    byte b10 = UnsafeUtil.getByte(addressOffset);
                    if (DecodeUtil.isOneByte(b10)) {
                        int i11 = i10 + 1;
                        DecodeUtil.handleOneByte(b10, cArr, i10);
                        while (j9 < j8) {
                            byte b11 = UnsafeUtil.getByte(j9);
                            if (!DecodeUtil.isOneByte(b11)) {
                                break;
                            }
                            j9++;
                            DecodeUtil.handleOneByte(b11, cArr, i11);
                            i11++;
                        }
                        i10 = i11;
                        addressOffset = j9;
                    } else if (DecodeUtil.isTwoBytes(b10)) {
                        if (j9 < j8) {
                            addressOffset += 2;
                            DecodeUtil.handleTwoBytes(b10, UnsafeUtil.getByte(j9), cArr, i10);
                            i10++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (DecodeUtil.isThreeBytes(b10)) {
                        if (j9 < j8 - 1) {
                            long j10 = 2 + addressOffset;
                            addressOffset += 3;
                            DecodeUtil.handleThreeBytes(b10, UnsafeUtil.getByte(j9), UnsafeUtil.getByte(j10), cArr, i10);
                            i10++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (j9 < j8 - 2) {
                        byte b12 = UnsafeUtil.getByte(j9);
                        long j11 = addressOffset + 3;
                        byte b13 = UnsafeUtil.getByte(2 + addressOffset);
                        addressOffset += 4;
                        DecodeUtil.handleFourBytes(b10, b12, b13, UnsafeUtil.getByte(j11), cArr, i10);
                        i10 += 2;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                }
                return new String(cArr, 0, i10);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i8), Integer.valueOf(i9)));
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        int encodeUtf8(CharSequence charSequence, byte[] bArr, int i8, int i9) {
            long j8;
            String str;
            String str2;
            int i10;
            long j9;
            long j10;
            char charAt;
            long j11 = i8;
            long j12 = i9 + j11;
            int length = charSequence.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length <= i9 && bArr.length - i9 >= i8) {
                int i11 = 0;
                while (true) {
                    j8 = 1;
                    if (i11 >= length || (charAt = charSequence.charAt(i11)) >= 128) {
                        break;
                    }
                    UnsafeUtil.putByte(bArr, j11, (byte) charAt);
                    i11++;
                    j11 = 1 + j11;
                }
                if (i11 == length) {
                    return (int) j11;
                }
                while (i11 < length) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 128 && j11 < j12) {
                        UnsafeUtil.putByte(bArr, j11, (byte) charAt2);
                        j10 = j12;
                        str2 = str4;
                        j9 = j8;
                        j11 += j8;
                        str = str3;
                    } else {
                        if (charAt2 < 2048 && j11 <= j12 - 2) {
                            str = str3;
                            str2 = str4;
                            long j13 = j11 + j8;
                            UnsafeUtil.putByte(bArr, j11, (byte) ((charAt2 >>> 6) | 960));
                            j11 += 2;
                            UnsafeUtil.putByte(bArr, j13, (byte) ((charAt2 & '?') | 128));
                        } else {
                            str = str3;
                            str2 = str4;
                            if ((charAt2 < 55296 || 57343 < charAt2) && j11 <= j12 - 3) {
                                UnsafeUtil.putByte(bArr, j11, (byte) ((charAt2 >>> '\f') | 480));
                                long j14 = j11 + 2;
                                UnsafeUtil.putByte(bArr, j11 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                                j11 += 3;
                                UnsafeUtil.putByte(bArr, j14, (byte) ((charAt2 & '?') | 128));
                            } else {
                                if (j11 <= j12 - 4) {
                                    int i12 = i11 + 1;
                                    if (i12 != length) {
                                        char charAt3 = charSequence.charAt(i12);
                                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                                            j9 = 1;
                                            UnsafeUtil.putByte(bArr, j11, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                            j10 = j12;
                                            UnsafeUtil.putByte(bArr, j11 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                            long j15 = j11 + 3;
                                            UnsafeUtil.putByte(bArr, j11 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                            j11 += 4;
                                            UnsafeUtil.putByte(bArr, j15, (byte) ((codePoint & 63) | 128));
                                            i11 = i12;
                                        } else {
                                            i11 = i12;
                                        }
                                    }
                                    throw new UnpairedSurrogateException(i11 - 1, length);
                                }
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((i10 = i11 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i10)))) {
                                    throw new UnpairedSurrogateException(i11, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str2 + charAt2 + str + j11);
                            }
                        }
                        j10 = j12;
                        j9 = 1;
                    }
                    i11++;
                    str3 = str;
                    str4 = str2;
                    j8 = j9;
                    j12 = j10;
                }
                return (int) j11;
            }
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i8 + i9));
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            long j8;
            char c8;
            long j9;
            long j10;
            int i8;
            long j11;
            int i9;
            char charAt;
            long addressOffset = UnsafeUtil.addressOffset(byteBuffer);
            long position = byteBuffer.position() + addressOffset;
            long limit = byteBuffer.limit() + addressOffset;
            int length = charSequence.length();
            if (length <= limit - position) {
                int i10 = 0;
                while (true) {
                    j8 = 1;
                    c8 = 128;
                    if (i10 >= length || (charAt = charSequence.charAt(i10)) >= 128) {
                        break;
                    }
                    UnsafeUtil.putByte(position, (byte) charAt);
                    i10++;
                    position = 1 + position;
                }
                if (i10 == length) {
                    Java8Compatibility.position(byteBuffer, (int) (position - addressOffset));
                    return;
                }
                while (i10 < length) {
                    char charAt2 = charSequence.charAt(i10);
                    if (charAt2 < c8 && position < limit) {
                        UnsafeUtil.putByte(position, (byte) charAt2);
                        j9 = addressOffset;
                        j10 = limit;
                        i8 = i10;
                        j11 = j8;
                        position += j8;
                    } else if (charAt2 < 2048 && position <= limit - 2) {
                        j9 = addressOffset;
                        long j12 = position + j8;
                        UnsafeUtil.putByte(position, (byte) ((charAt2 >>> 6) | 960));
                        position += 2;
                        UnsafeUtil.putByte(j12, (byte) ((charAt2 & '?') | 128));
                        j10 = limit;
                        i8 = i10;
                        j11 = j8;
                    } else {
                        j9 = addressOffset;
                        if ((charAt2 < 55296 || 57343 < charAt2) && position <= limit - 3) {
                            long j13 = position + j8;
                            UnsafeUtil.putByte(position, (byte) ((charAt2 >>> '\f') | 480));
                            long j14 = position + 2;
                            UnsafeUtil.putByte(j13, (byte) (((charAt2 >>> 6) & 63) | 128));
                            position += 3;
                            UnsafeUtil.putByte(j14, (byte) ((charAt2 & '?') | 128));
                            j10 = limit;
                            i8 = i10;
                            j11 = 1;
                        } else {
                            if (position <= limit - 4) {
                                i8 = i10 + 1;
                                if (i8 != length) {
                                    char charAt3 = charSequence.charAt(i8);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        j11 = 1;
                                        UnsafeUtil.putByte(position, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                        j10 = limit;
                                        UnsafeUtil.putByte(position + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j15 = position + 3;
                                        UnsafeUtil.putByte(position + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                        position += 4;
                                        UnsafeUtil.putByte(j15, (byte) ((codePoint & 63) | 128));
                                    } else {
                                        i10 = i8;
                                    }
                                }
                                throw new UnpairedSurrogateException(i10 - 1, length);
                            }
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i9 = i10 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i9)))) {
                                throw new UnpairedSurrogateException(i10, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + position);
                        }
                        i10 = i8 + 1;
                        addressOffset = j9;
                        j8 = j11;
                        limit = j10;
                        c8 = 128;
                    }
                    i10 = i8 + 1;
                    addressOffset = j9;
                    j8 = j11;
                    limit = j10;
                    c8 = 128;
                }
                Java8Compatibility.position(byteBuffer, (int) (position - addressOffset));
                return;
            }
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r13, r1) > (-65)) goto L38;     */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r13, r1) > (-65)) goto L59;     */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int partialIsValidUtf8(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 204
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r1) > (-65)) goto L17;     */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r1) > (-65)) goto L36;     */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00a3, code lost:            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r1) > (-65)) goto L57;     */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int partialIsValidUtf8Direct(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
            /*
                Method dump skipped, instructions count: 212
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
        }

        private static int unsafeEstimateConsecutiveAscii(long j8, int i8) {
            if (i8 < 16) {
                return 0;
            }
            int i9 = (int) ((-j8) & 7);
            int i10 = i9;
            while (i10 > 0) {
                long j9 = 1 + j8;
                if (UnsafeUtil.getByte(j8) < 0) {
                    return i9 - i10;
                }
                i10--;
                j8 = j9;
            }
            int i11 = i8 - i9;
            while (i11 >= 8 && (UnsafeUtil.getLong(j8) & (-9187201950435737472L)) == 0) {
                j8 += 8;
                i11 -= 8;
            }
            return i8 - i11;
        }

        private static int unsafeIncompleteStateFor(long j8, int i8, int i9) {
            if (i9 == 0) {
                return Utf8.incompleteStateFor(i8);
            }
            if (i9 == 1) {
                return Utf8.incompleteStateFor(i8, UnsafeUtil.getByte(j8));
            }
            if (i9 == 2) {
                return Utf8.incompleteStateFor(i8, UnsafeUtil.getByte(j8), UnsafeUtil.getByte(j8 + 1));
            }
            throw new AssertionError();
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0039, code lost:            return -1;     */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int partialIsValidUtf8(byte[] r10, long r11, int r13) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = 0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r11
                byte r11 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r11 <= r6) goto L37
                goto L39
            L37:
                r11 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
                return r10
            L48:
                int r13 = r13 + (-3)
                long r2 = r2 + r11
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r11 = r11 + r8
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                long r2 = r2 + r11
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(byte[], long, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0039, code lost:            return -1;     */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int partialIsValidUtf8(long r10, int r12) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r10, r12)
                long r1 = (long) r0
                long r10 = r10 + r1
                int r12 = r12 - r0
            L7:
                r0 = 0
                r1 = 0
            L9:
                r2 = 1
                if (r12 <= 0) goto L1a
                long r4 = r10 + r2
                byte r1 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10)
                if (r1 < 0) goto L19
                int r12 = r12 + (-1)
                r10 = r4
                goto L9
            L19:
                r10 = r4
            L1a:
                if (r12 != 0) goto L1d
                return r0
            L1d:
                int r0 = r12 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r12 = r12 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r10
                byte r10 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10)
                if (r10 <= r6) goto L37
                goto L39
            L37:
                r10 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = unsafeIncompleteStateFor(r10, r1, r0)
                return r10
            L48:
                int r12 = r12 + (-3)
                long r2 = r2 + r10
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r10 = r10 + r8
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = unsafeIncompleteStateFor(r10, r1, r0)
                return r10
            L6d:
                int r12 = r12 + (-4)
                long r2 = r2 + r10
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r10
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r10 = r10 + r0
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(long, int):int");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i8, int i9, int i10) {
        if (i8 > -12 || i9 > -65 || i10 > -65) {
            return -1;
        }
        return (i8 ^ (i9 << 8)) ^ (i10 << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bArr, int i8, int i9) {
        byte b9 = bArr[i8 - 1];
        int i10 = i9 - i8;
        if (i10 == 0) {
            return incompleteStateFor(b9);
        }
        if (i10 == 1) {
            return incompleteStateFor(b9, bArr[i8]);
        }
        if (i10 == 2) {
            return incompleteStateFor(b9, bArr[i8], bArr[i8 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(ByteBuffer byteBuffer, int i8, int i9, int i10) {
        if (i10 == 0) {
            return incompleteStateFor(i8);
        }
        if (i10 == 1) {
            return incompleteStateFor(i8, byteBuffer.get(i9));
        }
        if (i10 == 2) {
            return incompleteStateFor(i8, byteBuffer.get(i9), byteBuffer.get(i9 + 1));
        }
        throw new AssertionError();
    }

    /* loaded from: classes3.dex */
    static final class SafeProcessor extends Processor {
        SafeProcessor() {
        }

        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i8, int i9) {
            while (i8 < i9) {
                int i10 = i8 + 1;
                byte b9 = bArr[i8];
                if (b9 < 0) {
                    if (b9 < -32) {
                        if (i10 >= i9) {
                            return b9;
                        }
                        if (b9 >= -62) {
                            i8 += 2;
                            if (bArr[i10] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b9 < -16) {
                        if (i10 >= i9 - 1) {
                            return Utf8.incompleteStateFor(bArr, i10, i9);
                        }
                        int i11 = i8 + 2;
                        byte b10 = bArr[i10];
                        if (b10 <= -65 && ((b9 != -32 || b10 >= -96) && (b9 != -19 || b10 < -96))) {
                            i8 += 3;
                            if (bArr[i11] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i10 >= i9 - 2) {
                        return Utf8.incompleteStateFor(bArr, i10, i9);
                    }
                    int i12 = i8 + 2;
                    byte b11 = bArr[i10];
                    if (b11 <= -65 && (((b9 << 28) + (b11 + 112)) >> 30) == 0) {
                        int i13 = i8 + 3;
                        if (bArr[i12] <= -65) {
                            i8 += 4;
                            if (bArr[i13] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                i8 = i10;
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        String decodeUtf8(byte[] bArr, int i8, int i9) throws InvalidProtocolBufferException {
            if ((i8 | i9 | ((bArr.length - i8) - i9)) >= 0) {
                int i10 = i8 + i9;
                char[] cArr = new char[i9];
                int i11 = 0;
                while (i8 < i10) {
                    byte b9 = bArr[i8];
                    if (!DecodeUtil.isOneByte(b9)) {
                        break;
                    }
                    i8++;
                    DecodeUtil.handleOneByte(b9, cArr, i11);
                    i11++;
                }
                int i12 = i11;
                while (i8 < i10) {
                    int i13 = i8 + 1;
                    byte b10 = bArr[i8];
                    if (DecodeUtil.isOneByte(b10)) {
                        int i14 = i12 + 1;
                        DecodeUtil.handleOneByte(b10, cArr, i12);
                        while (i13 < i10) {
                            byte b11 = bArr[i13];
                            if (!DecodeUtil.isOneByte(b11)) {
                                break;
                            }
                            i13++;
                            DecodeUtil.handleOneByte(b11, cArr, i14);
                            i14++;
                        }
                        i12 = i14;
                        i8 = i13;
                    } else if (DecodeUtil.isTwoBytes(b10)) {
                        if (i13 < i10) {
                            i8 += 2;
                            DecodeUtil.handleTwoBytes(b10, bArr[i13], cArr, i12);
                            i12++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (DecodeUtil.isThreeBytes(b10)) {
                        if (i13 < i10 - 1) {
                            int i15 = i8 + 2;
                            i8 += 3;
                            DecodeUtil.handleThreeBytes(b10, bArr[i13], bArr[i15], cArr, i12);
                            i12++;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    } else if (i13 < i10 - 2) {
                        byte b12 = bArr[i13];
                        int i16 = i8 + 3;
                        byte b13 = bArr[i8 + 2];
                        i8 += 4;
                        DecodeUtil.handleFourBytes(b10, b12, b13, bArr[i16], cArr, i12);
                        i12 += 2;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                }
                return new String(cArr, 0, i12);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)));
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        String decodeUtf8Direct(ByteBuffer byteBuffer, int i8, int i9) throws InvalidProtocolBufferException {
            return decodeUtf8Default(byteBuffer, i8, i9);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:            return r10 + r0;     */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int encodeUtf8(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.SafeProcessor.encodeUtf8(java.lang.CharSequence, byte[], int, int):int");
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            encodeUtf8Default(charSequence, byteBuffer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:            if (r8[r9] > (-65)) goto L13;     */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:            if (r8[r9] > (-65)) goto L32;     */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0083, code lost:            if (r8[r7] > (-65)) goto L53;     */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$000(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$000(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$100(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.SafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        int partialIsValidUtf8Direct(int i8, ByteBuffer byteBuffer, int i9, int i10) {
            return partialIsValidUtf8Default(i8, byteBuffer, i9, i10);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i8, int i9) {
            while (i8 < i9 && bArr[i8] >= 0) {
                i8++;
            }
            if (i8 >= i9) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i8, i9);
        }
    }
}
