package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    private static final long serialVersionUID = 1;
    final byte[] data;
    transient int hashCode;
    transient String utf8;
    static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final ByteString EMPTY = of(new byte[0]);

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteString(byte[] bArr) {
        this.data = bArr;
    }

    static int codePointIndexToCharIndex(String str, int i8) {
        int length = str.length();
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            if (i10 == i8) {
                return i9;
            }
            int codePointAt = str.codePointAt(i9);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i10++;
            i9 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    @Nullable
    public static ByteString decodeBase64(String str) {
        if (str != null) {
            byte[] decode = Base64.decode(str);
            if (decode != null) {
                return new ByteString(decode);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    public static ByteString decodeHex(String str) {
        if (str != null) {
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i8 = 0; i8 < length; i8++) {
                    int i9 = i8 * 2;
                    bArr[i8] = (byte) ((decodeHexDigit(str.charAt(i9)) << 4) + decodeHexDigit(str.charAt(i9 + 1)));
                }
                return of(bArr);
            }
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
        throw new IllegalArgumentException("hex == null");
    }

    private static int decodeHexDigit(char c8) {
        if (c8 >= '0' && c8 <= '9') {
            return c8 - '0';
        }
        if (c8 >= 'a' && c8 <= 'f') {
            return c8 - 'W';
        }
        if (c8 >= 'A' && c8 <= 'F') {
            return c8 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c8);
    }

    private ByteString digest(String str) {
        try {
            return of(MessageDigest.getInstance(str).digest(this.data));
        } catch (NoSuchAlgorithmException e8) {
            throw new AssertionError(e8);
        }
    }

    public static ByteString encodeString(String str, Charset charset) {
        if (str != null) {
            if (charset != null) {
                return new ByteString(str.getBytes(charset));
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException("s == null");
    }

    public static ByteString encodeUtf8(String str) {
        if (str != null) {
            ByteString byteString = new ByteString(str.getBytes(Util.UTF_8));
            byteString.utf8 = str;
            return byteString;
        }
        throw new IllegalArgumentException("s == null");
    }

    private ByteString hmac(String str, ByteString byteString) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            return of(mac.doFinal(this.data));
        } catch (InvalidKeyException e8) {
            throw new IllegalArgumentException(e8);
        } catch (NoSuchAlgorithmException e9) {
            throw new AssertionError(e9);
        }
    }

    public static ByteString of(byte... bArr) {
        if (bArr != null) {
            return new ByteString((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static ByteString read(InputStream inputStream, int i8) throws IOException {
        if (inputStream != null) {
            if (i8 >= 0) {
                byte[] bArr = new byte[i8];
                int i9 = 0;
                while (i9 < i8) {
                    int read = inputStream.read(bArr, i9, i8 - i9);
                    if (read != -1) {
                        i9 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException("byteCount < 0: " + i8);
        }
        throw new IllegalArgumentException("in == null");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        ByteString read = read(objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = ByteString.class.getDeclaredField(DataSchemeDataSource.SCHEME_DATA);
            declaredField.setAccessible(true);
            declaredField.set(this, read.data);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    public ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(this.data).asReadOnlyBuffer();
    }

    public String base64() {
        return Base64.encode(this.data);
    }

    public String base64Url() {
        return Base64.encodeUrl(this.data);
    }

    public final boolean endsWith(ByteString byteString) {
        return rangeEquals(size() - byteString.size(), byteString, 0, byteString.size());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int size = byteString.size();
            byte[] bArr = this.data;
            if (size == bArr.length && byteString.rangeEquals(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte getByte(int i8) {
        return this.data[i8];
    }

    public int hashCode() {
        int i8 = this.hashCode;
        if (i8 == 0) {
            int hashCode = Arrays.hashCode(this.data);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i8;
    }

    public String hex() {
        byte[] bArr = this.data;
        char[] cArr = new char[bArr.length * 2];
        int i8 = 0;
        for (byte b9 : bArr) {
            int i9 = i8 + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i8] = cArr2[(b9 >> 4) & 15];
            i8 += 2;
            cArr[i9] = cArr2[b9 & 15];
        }
        return new String(cArr);
    }

    public ByteString hmacSha1(ByteString byteString) {
        return hmac("HmacSHA1", byteString);
    }

    public ByteString hmacSha256(ByteString byteString) {
        return hmac("HmacSHA256", byteString);
    }

    public ByteString hmacSha512(ByteString byteString) {
        return hmac("HmacSHA512", byteString);
    }

    public final int indexOf(ByteString byteString) {
        return indexOf(byteString.internalArray(), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] internalArray() {
        return this.data;
    }

    public final int lastIndexOf(ByteString byteString) {
        return lastIndexOf(byteString.internalArray(), size());
    }

    public ByteString md5() {
        return digest(SameMD5.TAG);
    }

    public boolean rangeEquals(int i8, ByteString byteString, int i9, int i10) {
        return byteString.rangeEquals(i9, this.data, i8, i10);
    }

    public ByteString sha1() {
        return digest("SHA-1");
    }

    public ByteString sha256() {
        return digest("SHA-256");
    }

    public ByteString sha512() {
        return digest("SHA-512");
    }

    public int size() {
        return this.data.length;
    }

    public final boolean startsWith(ByteString byteString) {
        return rangeEquals(0, byteString, 0, byteString.size());
    }

    public String string(Charset charset) {
        if (charset != null) {
            return new String(this.data, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public ByteString substring(int i8) {
        return substring(i8, this.data.length);
    }

    public ByteString toAsciiLowercase() {
        int i8 = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i8 < bArr.length) {
                byte b9 = bArr[i8];
                if (b9 >= 65 && b9 <= 90) {
                    byte[] bArr2 = (byte[]) bArr.clone();
                    bArr2[i8] = (byte) (b9 + 32);
                    for (int i9 = i8 + 1; i9 < bArr2.length; i9++) {
                        byte b10 = bArr2[i9];
                        if (b10 >= 65 && b10 <= 90) {
                            bArr2[i9] = (byte) (b10 + 32);
                        }
                    }
                    return new ByteString(bArr2);
                }
                i8++;
            } else {
                return this;
            }
        }
    }

    public ByteString toAsciiUppercase() {
        int i8 = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i8 < bArr.length) {
                byte b9 = bArr[i8];
                if (b9 >= 97 && b9 <= 122) {
                    byte[] bArr2 = (byte[]) bArr.clone();
                    bArr2[i8] = (byte) (b9 - 32);
                    for (int i9 = i8 + 1; i9 < bArr2.length; i9++) {
                        byte b10 = bArr2[i9];
                        if (b10 >= 97 && b10 <= 122) {
                            bArr2[i9] = (byte) (b10 - 32);
                        }
                    }
                    return new ByteString(bArr2);
                }
                i8++;
            } else {
                return this;
            }
        }
    }

    public byte[] toByteArray() {
        return (byte[]) this.data.clone();
    }

    public String toString() {
        StringBuilder sb;
        if (this.data.length == 0) {
            return "[size=0]";
        }
        String utf8 = utf8();
        int codePointIndexToCharIndex = codePointIndexToCharIndex(utf8, 64);
        if (codePointIndexToCharIndex == -1) {
            if (this.data.length <= 64) {
                return "[hex=" + hex() + "]";
            }
            return "[size=" + this.data.length + " hex=" + substring(0, 64).hex() + "…]";
        }
        String replace = utf8.substring(0, codePointIndexToCharIndex).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (codePointIndexToCharIndex < utf8.length()) {
            sb = new StringBuilder();
            sb.append("[size=");
            sb.append(this.data.length);
            sb.append(" text=");
            sb.append(replace);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(replace);
            sb.append("]");
        }
        return sb.toString();
    }

    public String utf8() {
        String str = this.utf8;
        if (str == null) {
            String str2 = new String(this.data, Util.UTF_8);
            this.utf8 = str2;
            return str2;
        }
        return str;
    }

    public void write(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.write(this.data);
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // java.lang.Comparable
    public int compareTo(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        int min = Math.min(size, size2);
        for (int i8 = 0; i8 < min; i8++) {
            int i9 = getByte(i8) & 255;
            int i10 = byteString.getByte(i8) & 255;
            if (i9 != i10) {
                return i9 < i10 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public final boolean endsWith(byte[] bArr) {
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    public final int indexOf(ByteString byteString, int i8) {
        return indexOf(byteString.internalArray(), i8);
    }

    public final int lastIndexOf(ByteString byteString, int i8) {
        return lastIndexOf(byteString.internalArray(), i8);
    }

    public boolean rangeEquals(int i8, byte[] bArr, int i9, int i10) {
        if (i8 >= 0) {
            byte[] bArr2 = this.data;
            if (i8 <= bArr2.length - i10 && i9 >= 0 && i9 <= bArr.length - i10 && Util.arrayRangeEquals(bArr2, i8, bArr, i9, i10)) {
                return true;
            }
        }
        return false;
    }

    public final boolean startsWith(byte[] bArr) {
        return rangeEquals(0, bArr, 0, bArr.length);
    }

    public ByteString substring(int i8, int i9) {
        if (i8 >= 0) {
            byte[] bArr = this.data;
            if (i9 > bArr.length) {
                throw new IllegalArgumentException("endIndex > length(" + this.data.length + ")");
            }
            int i10 = i9 - i8;
            if (i10 >= 0) {
                if (i8 == 0 && i9 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArr, i8, bArr2, 0, i10);
                return new ByteString(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public static ByteString of(byte[] bArr, int i8, int i9) {
        if (bArr != null) {
            Util.checkOffsetAndCount(bArr.length, i8, i9);
            byte[] bArr2 = new byte[i9];
            System.arraycopy(bArr, i8, bArr2, 0, i9);
            return new ByteString(bArr2);
        }
        throw new IllegalArgumentException("data == null");
    }

    public final int indexOf(byte[] bArr) {
        return indexOf(bArr, 0);
    }

    public final int lastIndexOf(byte[] bArr) {
        return lastIndexOf(bArr, size());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void write(Buffer buffer) {
        byte[] bArr = this.data;
        buffer.write(bArr, 0, bArr.length);
    }

    public int indexOf(byte[] bArr, int i8) {
        int length = this.data.length - bArr.length;
        for (int max = Math.max(i8, 0); max <= length; max++) {
            if (Util.arrayRangeEquals(this.data, max, bArr, 0, bArr.length)) {
                return max;
            }
        }
        return -1;
    }

    public int lastIndexOf(byte[] bArr, int i8) {
        for (int min = Math.min(i8, this.data.length - bArr.length); min >= 0; min--) {
            if (Util.arrayRangeEquals(this.data, min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public static ByteString of(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }
        throw new IllegalArgumentException("data == null");
    }
}
