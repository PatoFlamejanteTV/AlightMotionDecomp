package U6;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

/* renamed from: U6.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC1451g extends Z, ReadableByteChannel {
    C1449e buffer();

    boolean c(long j8, C1452h c1452h);

    boolean exhausted();

    InputStream inputStream();

    C1449e l();

    byte readByte();

    byte[] readByteArray();

    byte[] readByteArray(long j8);

    C1452h readByteString(long j8);

    long readDecimalLong();

    void readFully(byte[] bArr);

    long readHexadecimalUnsignedLong();

    int readInt();

    int readIntLe();

    long readLongLe();

    short readShort();

    short readShortLe();

    String readUtf8(long j8);

    String readUtf8LineStrict();

    String readUtf8LineStrict(long j8);

    void require(long j8);

    void skip(long j8);
}
