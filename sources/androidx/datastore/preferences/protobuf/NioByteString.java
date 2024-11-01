package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NioByteString extends ByteString.LeafByteString {
    private final ByteBuffer buffer;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NioByteString(ByteBuffer byteBuffer) {
        Internal.checkNotNull(byteBuffer, "buffer");
        this.buffer = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private ByteBuffer slice(int i8, int i9) {
        if (i8 >= this.buffer.position() && i9 <= this.buffer.limit() && i8 <= i9) {
            ByteBuffer slice = this.buffer.slice();
            Java8Compatibility.position(slice, i8 - this.buffer.position());
            Java8Compatibility.limit(slice, i9 - this.buffer.position());
            return slice;
        }
        throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i8), Integer.valueOf(i9)));
    }

    private Object writeReplace() {
        return ByteString.copyFrom(this.buffer.slice());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return this.buffer.asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public byte byteAt(int i8) {
        try {
            return this.buffer.get(i8);
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw e8;
        } catch (IndexOutOfBoundsException e9) {
            throw new ArrayIndexOutOfBoundsException(e9.getMessage());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.buffer.slice());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i8, int i9, int i10) {
        ByteBuffer slice = this.buffer.slice();
        Java8Compatibility.position(slice, i8);
        slice.get(bArr, i9, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (size() != byteString.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof NioByteString) {
            return this.buffer.equals(((NioByteString) obj).buffer);
        }
        if (obj instanceof RopeByteString) {
            return obj.equals(this);
        }
        return this.buffer.equals(byteString.asReadOnlyByteBuffer());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
    public boolean equalsRange(ByteString byteString, int i8, int i9) {
        return substring(0, i9).equals(byteString.substring(i8, i9 + i8));
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public byte internalByteAt(int i8) {
        return byteAt(i8);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean isValidUtf8() {
        return Utf8.isValidUtf8(this.buffer);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.buffer, true);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public InputStream newInput() {
        return new InputStream() { // from class: androidx.datastore.preferences.protobuf.NioByteString.1
            private final ByteBuffer buf;

            {
                this.buf = NioByteString.this.buffer.slice();
            }

            @Override // java.io.InputStream
            public int available() throws IOException {
                return this.buf.remaining();
            }

            @Override // java.io.InputStream
            public void mark(int i8) {
                Java8Compatibility.mark(this.buf);
            }

            @Override // java.io.InputStream
            public boolean markSupported() {
                return true;
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                if (this.buf.hasRemaining()) {
                    return this.buf.get() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public void reset() throws IOException {
                try {
                    Java8Compatibility.reset(this.buf);
                } catch (InvalidMarkException e8) {
                    throw new IOException(e8);
                }
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i8, int i9) throws IOException {
                if (!this.buf.hasRemaining()) {
                    return -1;
                }
                int min = Math.min(i9, this.buf.remaining());
                this.buf.get(bArr, i8, min);
                return min;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int partialHash(int i8, int i9, int i10) {
        for (int i11 = i9; i11 < i9 + i10; i11++) {
            i8 = (i8 * 31) + this.buffer.get(i11);
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int partialIsValidUtf8(int i8, int i9, int i10) {
        return Utf8.partialIsValidUtf8(i8, this.buffer, i9, i10 + i9);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int size() {
        return this.buffer.remaining();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public ByteString substring(int i8, int i9) {
        try {
            return new NioByteString(slice(i8, i9));
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw e8;
        } catch (IndexOutOfBoundsException e9) {
            throw new ArrayIndexOutOfBoundsException(e9.getMessage());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    protected String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int i8;
        if (this.buffer.hasArray()) {
            byteArray = this.buffer.array();
            i8 = this.buffer.arrayOffset() + this.buffer.position();
            length = this.buffer.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            i8 = 0;
        }
        return new String(byteArray, i8, length, charset);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeToInternal(OutputStream outputStream, int i8, int i9) throws IOException {
        if (this.buffer.hasArray()) {
            outputStream.write(this.buffer.array(), this.buffer.arrayOffset() + this.buffer.position() + i8, i9);
        } else {
            ByteBufferWriter.write(slice(i8, i9 + i8), outputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeTo(ByteOutput byteOutput) throws IOException {
        byteOutput.writeLazy(this.buffer.slice());
    }
}
