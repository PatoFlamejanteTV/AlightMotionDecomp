package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class UnsafeByteOperations {
    private UnsafeByteOperations() {
    }

    public static ByteString unsafeWrap(byte[] bArr) {
        return ByteString.wrap(bArr);
    }

    public static void unsafeWriteTo(ByteString byteString, ByteOutput byteOutput) throws IOException {
        byteString.writeTo(byteOutput);
    }

    public static ByteString unsafeWrap(byte[] bArr, int i8, int i9) {
        return ByteString.wrap(bArr, i8, i9);
    }

    public static ByteString unsafeWrap(ByteBuffer byteBuffer) {
        return ByteString.wrap(byteBuffer);
    }
}
