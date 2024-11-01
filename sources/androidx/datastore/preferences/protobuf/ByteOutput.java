package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class ByteOutput {
    public abstract void write(byte b9) throws IOException;

    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    public abstract void write(byte[] bArr, int i8, int i9) throws IOException;

    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    public abstract void writeLazy(byte[] bArr, int i8, int i9) throws IOException;
}
