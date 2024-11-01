package W6;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: W6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1472b extends AbstractC1492s {

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f10826c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    protected final byte[] f10827a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f10828b;

    public AbstractC1472b(byte[] bArr, int i8) {
        if (bArr != null) {
            if (bArr.length == 0 && i8 != 0) {
                throw new IllegalArgumentException("zero length data with non-zero pad bits");
            }
            if (i8 <= 7 && i8 >= 0) {
                this.f10827a = J7.a.d(bArr);
                this.f10828b = i8;
                return;
            }
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        throw new NullPointerException("'data' cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC1472b u(int i8, InputStream inputStream) {
        if (i8 >= 1) {
            int read = inputStream.read();
            int i9 = i8 - 1;
            byte[] bArr = new byte[i9];
            if (i9 != 0) {
                if (L7.a.c(inputStream, bArr) == i9) {
                    if (read > 0 && read < 8) {
                        byte b9 = bArr[i8 - 2];
                        if (b9 != ((byte) ((255 << read) & b9))) {
                            return new n0(bArr, read);
                        }
                    }
                } else {
                    throw new EOFException("EOF encountered in middle of BIT STRING");
                }
            }
            return new Q(bArr, read);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    @Override // W6.AbstractC1492s, W6.AbstractC1487m
    public int hashCode() {
        byte[] bArr = this.f10827a;
        int length = bArr.length - 1;
        if (length < 0) {
            return 1;
        }
        return ((J7.a.l(bArr, 0, length) * 257) ^ ((byte) (bArr[length] & (255 << this.f10828b)))) ^ this.f10828b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean l(AbstractC1492s abstractC1492s) {
        if (!(abstractC1492s instanceof AbstractC1472b)) {
            return false;
        }
        AbstractC1472b abstractC1472b = (AbstractC1472b) abstractC1492s;
        if (this.f10828b != abstractC1472b.f10828b) {
            return false;
        }
        byte[] bArr = this.f10827a;
        byte[] bArr2 = abstractC1472b.f10827a;
        int length = bArr.length;
        if (length != bArr2.length) {
            return false;
        }
        int i8 = length - 1;
        if (i8 < 0) {
            return true;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (bArr[i9] != bArr2[i9]) {
                return false;
            }
        }
        byte b9 = bArr[i8];
        int i10 = this.f10828b;
        if (((byte) (b9 & (255 << i10))) != ((byte) (bArr2[i8] & (255 << i10)))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public AbstractC1492s s() {
        return new Q(this.f10827a, this.f10828b);
    }

    public String toString() {
        return z();
    }

    public byte[] v() {
        byte[] bArr = this.f10827a;
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] d8 = J7.a.d(bArr);
        int length = this.f10827a.length - 1;
        d8[length] = (byte) (d8[length] & (255 << this.f10828b));
        return d8;
    }

    public byte[] y() {
        if (this.f10828b == 0) {
            return J7.a.d(this.f10827a);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public String z() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] encoded = getEncoded();
            for (int i8 = 0; i8 != encoded.length; i8++) {
                char[] cArr = f10826c;
                stringBuffer.append(cArr[(encoded[i8] >>> 4) & 15]);
                stringBuffer.append(cArr[encoded[i8] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e8) {
            throw new r("Internal error encoding BitString: " + e8.getMessage(), e8);
        }
    }
}
