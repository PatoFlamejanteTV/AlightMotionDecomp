package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class Utf8 {
    private static Utf8 DEFAULT;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class DecodeUtil {
        DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void handleFourBytes(byte b9, byte b10, byte b11, byte b12, char[] cArr, int i8) throws IllegalArgumentException {
            if (!isNotTrailingByte(b10) && (((b9 << 28) + (b10 + 112)) >> 30) == 0 && !isNotTrailingByte(b11) && !isNotTrailingByte(b12)) {
                int trailingByteValue = ((b9 & 7) << 18) | (trailingByteValue(b10) << 12) | (trailingByteValue(b11) << 6) | trailingByteValue(b12);
                cArr[i8] = highSurrogate(trailingByteValue);
                cArr[i8 + 1] = lowSurrogate(trailingByteValue);
                return;
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void handleOneByte(byte b9, char[] cArr, int i8) {
            cArr[i8] = (char) b9;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void handleThreeBytes(byte b9, byte b10, byte b11, char[] cArr, int i8) throws IllegalArgumentException {
            if (!isNotTrailingByte(b10) && ((b9 != -32 || b10 >= -96) && ((b9 != -19 || b10 < -96) && !isNotTrailingByte(b11)))) {
                cArr[i8] = (char) (((b9 & 15) << 12) | (trailingByteValue(b10) << 6) | trailingByteValue(b11));
                return;
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void handleTwoBytes(byte b9, byte b10, char[] cArr, int i8) throws IllegalArgumentException {
            if (b9 >= -62) {
                if (!isNotTrailingByte(b10)) {
                    cArr[i8] = (char) (((b9 & 31) << 6) | trailingByteValue(b10));
                    return;
                }
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }

        private static char highSurrogate(int i8) {
            return (char) ((i8 >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b9) {
            return b9 > -65;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean isOneByte(byte b9) {
            return b9 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean isThreeBytes(byte b9) {
            return b9 < -16;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
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

    /* loaded from: classes3.dex */
    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i8, int i9) {
            super("Unpaired surrogate at index " + i8 + " of " + i9);
        }
    }

    public static Utf8 getDefault() {
        if (DEFAULT == null) {
            DEFAULT = new Utf8Safe();
        }
        return DEFAULT;
    }

    public static void setDefault(Utf8 utf8) {
        DEFAULT = utf8;
    }

    public abstract String decodeUtf8(ByteBuffer byteBuffer, int i8, int i9);

    public abstract void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int encodedLength(CharSequence charSequence);
}
