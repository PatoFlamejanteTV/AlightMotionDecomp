package U6;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* renamed from: U6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC1450f extends X, WritableByteChannel {
    C1449e buffer();

    InterfaceC1450f emitCompleteSegments();

    @Override // U6.X, java.io.Flushable
    void flush();

    OutputStream outputStream();

    InterfaceC1450f write(byte[] bArr);

    InterfaceC1450f write(byte[] bArr, int i8, int i9);

    InterfaceC1450f writeByte(int i8);

    InterfaceC1450f writeDecimalLong(long j8);

    InterfaceC1450f writeHexadecimalUnsignedLong(long j8);

    InterfaceC1450f writeInt(int i8);

    InterfaceC1450f writeShort(int i8);

    InterfaceC1450f writeUtf8(String str);
}
