package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Utf8;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class CodedOutputStream extends ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    CodedOutputStreamWriter wrapper;
    private static final Logger logger = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = UnsafeUtil.hasUnsafeArrayOperations();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static abstract class AbstractBufferedEncoder extends CodedOutputStream {
        final byte[] buffer;
        final int limit;
        int position;
        int totalBytesWritten;

        AbstractBufferedEncoder(int i8) {
            super();
            if (i8 >= 0) {
                byte[] bArr = new byte[Math.max(i8, 20)];
                this.buffer = bArr;
                this.limit = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        final void buffer(byte b9) {
            byte[] bArr = this.buffer;
            int i8 = this.position;
            this.position = i8 + 1;
            bArr[i8] = b9;
            this.totalBytesWritten++;
        }

        final void bufferFixed32NoTag(int i8) {
            byte[] bArr = this.buffer;
            int i9 = this.position;
            int i10 = i9 + 1;
            this.position = i10;
            bArr[i9] = (byte) (i8 & 255);
            int i11 = i9 + 2;
            this.position = i11;
            bArr[i10] = (byte) ((i8 >> 8) & 255);
            int i12 = i9 + 3;
            this.position = i12;
            bArr[i11] = (byte) ((i8 >> 16) & 255);
            this.position = i9 + 4;
            bArr[i12] = (byte) ((i8 >> 24) & 255);
            this.totalBytesWritten += 4;
        }

        final void bufferFixed64NoTag(long j8) {
            byte[] bArr = this.buffer;
            int i8 = this.position;
            int i9 = i8 + 1;
            this.position = i9;
            bArr[i8] = (byte) (j8 & 255);
            int i10 = i8 + 2;
            this.position = i10;
            bArr[i9] = (byte) ((j8 >> 8) & 255);
            int i11 = i8 + 3;
            this.position = i11;
            bArr[i10] = (byte) ((j8 >> 16) & 255);
            int i12 = i8 + 4;
            this.position = i12;
            bArr[i11] = (byte) (255 & (j8 >> 24));
            int i13 = i8 + 5;
            this.position = i13;
            bArr[i12] = (byte) (((int) (j8 >> 32)) & 255);
            int i14 = i8 + 6;
            this.position = i14;
            bArr[i13] = (byte) (((int) (j8 >> 40)) & 255);
            int i15 = i8 + 7;
            this.position = i15;
            bArr[i14] = (byte) (((int) (j8 >> 48)) & 255);
            this.position = i8 + 8;
            bArr[i15] = (byte) (((int) (j8 >> 56)) & 255);
            this.totalBytesWritten += 8;
        }

        final void bufferInt32NoTag(int i8) {
            if (i8 >= 0) {
                bufferUInt32NoTag(i8);
            } else {
                bufferUInt64NoTag(i8);
            }
        }

        final void bufferTag(int i8, int i9) {
            bufferUInt32NoTag(WireFormat.makeTag(i8, i9));
        }

        final void bufferUInt32NoTag(int i8) {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                long j8 = this.position;
                while ((i8 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i9 = this.position;
                    this.position = i9 + 1;
                    UnsafeUtil.putByte(bArr, i9, (byte) ((i8 & ModuleDescriptor.MODULE_VERSION) | 128));
                    i8 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i10 = this.position;
                this.position = i10 + 1;
                UnsafeUtil.putByte(bArr2, i10, (byte) i8);
                this.totalBytesWritten += (int) (this.position - j8);
                return;
            }
            while ((i8 & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i11 = this.position;
                this.position = i11 + 1;
                bArr3[i11] = (byte) ((i8 & ModuleDescriptor.MODULE_VERSION) | 128);
                this.totalBytesWritten++;
                i8 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i12 = this.position;
            this.position = i12 + 1;
            bArr4[i12] = (byte) i8;
            this.totalBytesWritten++;
        }

        final void bufferUInt64NoTag(long j8) {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                long j9 = this.position;
                while ((j8 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i8 = this.position;
                    this.position = i8 + 1;
                    UnsafeUtil.putByte(bArr, i8, (byte) ((((int) j8) & ModuleDescriptor.MODULE_VERSION) | 128));
                    j8 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i9 = this.position;
                this.position = i9 + 1;
                UnsafeUtil.putByte(bArr2, i9, (byte) j8);
                this.totalBytesWritten += (int) (this.position - j9);
                return;
            }
            while ((j8 & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i10 = this.position;
                this.position = i10 + 1;
                bArr3[i10] = (byte) ((((int) j8) & ModuleDescriptor.MODULE_VERSION) | 128);
                this.totalBytesWritten++;
                j8 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i11 = this.position;
            this.position = i11 + 1;
            bArr4[i11] = (byte) j8;
            this.totalBytesWritten++;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.totalBytesWritten;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class ArrayEncoder extends CodedOutputStream {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        ArrayEncoder(byte[] bArr, int i8, int i9) {
            super();
            if (bArr != null) {
                int i10 = i8 + i9;
                if ((i8 | i9 | (bArr.length - i10)) >= 0) {
                    this.buffer = bArr;
                    this.offset = i8;
                    this.position = i8;
                    this.limit = i10;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)));
            }
            throw new NullPointerException("buffer");
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.position - this.offset;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return this.limit - this.position;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte b9) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i8 = this.position;
                this.position = i8 + 1;
                bArr[i8] = b9;
            } catch (IndexOutOfBoundsException e8) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i8, boolean z8) throws IOException {
            writeTag(i8, 0);
            write(z8 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i8, byte[] bArr) throws IOException {
            writeByteArray(i8, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArrayNoTag(byte[] bArr, int i8, int i9) throws IOException {
            writeUInt32NoTag(i9);
            write(bArr, i8, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i8, ByteBuffer byteBuffer) throws IOException {
            writeTag(i8, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytes(int i8, ByteString byteString) throws IOException {
            writeTag(i8, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i8, int i9) throws IOException {
            writeTag(i8, 5);
            writeFixed32NoTag(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i8) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i9 = this.position;
                int i10 = i9 + 1;
                this.position = i10;
                bArr[i9] = (byte) (i8 & 255);
                int i11 = i9 + 2;
                this.position = i11;
                bArr[i10] = (byte) ((i8 >> 8) & 255);
                int i12 = i9 + 3;
                this.position = i12;
                bArr[i11] = (byte) ((i8 >> 16) & 255);
                this.position = i9 + 4;
                bArr[i12] = (byte) ((i8 >> 24) & 255);
            } catch (IndexOutOfBoundsException e8) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i8, long j8) throws IOException {
            writeTag(i8, 1);
            writeFixed64NoTag(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j8) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i8 = this.position;
                int i9 = i8 + 1;
                this.position = i9;
                bArr[i8] = (byte) (((int) j8) & 255);
                int i10 = i8 + 2;
                this.position = i10;
                bArr[i9] = (byte) (((int) (j8 >> 8)) & 255);
                int i11 = i8 + 3;
                this.position = i11;
                bArr[i10] = (byte) (((int) (j8 >> 16)) & 255);
                int i12 = i8 + 4;
                this.position = i12;
                bArr[i11] = (byte) (((int) (j8 >> 24)) & 255);
                int i13 = i8 + 5;
                this.position = i13;
                bArr[i12] = (byte) (((int) (j8 >> 32)) & 255);
                int i14 = i8 + 6;
                this.position = i14;
                bArr[i13] = (byte) (((int) (j8 >> 40)) & 255);
                int i15 = i8 + 7;
                this.position = i15;
                bArr[i14] = (byte) (((int) (j8 >> 48)) & 255);
                this.position = i8 + 8;
                bArr[i15] = (byte) (((int) (j8 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e8) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i8, int i9) throws IOException {
            writeTag(i8, 0);
            writeInt32NoTag(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i8) throws IOException {
            if (i8 >= 0) {
                writeUInt32NoTag(i8);
            } else {
                writeUInt64NoTag(i8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i8, int i9) throws IOException {
            write(bArr, i8, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessage(int i8, MessageLite messageLite) throws IOException {
            writeTag(i8, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i8, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i8);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(duplicate);
            write(duplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i8, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i8);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i8, String str) throws IOException {
            writeTag(i8, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeStringNoTag(String str) throws IOException {
            int i8 = this.position;
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int i9 = i8 + computeUInt32SizeNoTag2;
                    this.position = i9;
                    int encode = Utf8.encode(str, this.buffer, i9, spaceLeft());
                    this.position = i8;
                    writeUInt32NoTag((encode - i8) - computeUInt32SizeNoTag2);
                    this.position = encode;
                } else {
                    writeUInt32NoTag(Utf8.encodedLength(str));
                    this.position = Utf8.encode(str, this.buffer, this.position, spaceLeft());
                }
            } catch (Utf8.UnpairedSurrogateException e8) {
                this.position = i8;
                inefficientWriteStringNoTag(str, e8);
            } catch (IndexOutOfBoundsException e9) {
                throw new OutOfSpaceException(e9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeTag(int i8, int i9) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i8, i9));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i8, int i9) throws IOException {
            writeTag(i8, 0);
            writeUInt32NoTag(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i8) throws IOException {
            while ((i8 & (-128)) != 0) {
                try {
                    byte[] bArr = this.buffer;
                    int i9 = this.position;
                    this.position = i9 + 1;
                    bArr[i9] = (byte) ((i8 & ModuleDescriptor.MODULE_VERSION) | 128);
                    i8 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e8);
                }
            }
            byte[] bArr2 = this.buffer;
            int i10 = this.position;
            this.position = i10 + 1;
            bArr2[i10] = (byte) i8;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i8, long j8) throws IOException {
            writeTag(i8, 0);
            writeUInt64NoTag(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j8) throws IOException {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS && spaceLeft() >= 10) {
                while ((j8 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i8 = this.position;
                    this.position = i8 + 1;
                    UnsafeUtil.putByte(bArr, i8, (byte) ((((int) j8) & ModuleDescriptor.MODULE_VERSION) | 128));
                    j8 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i9 = this.position;
                this.position = 1 + i9;
                UnsafeUtil.putByte(bArr2, i9, (byte) j8);
                return;
            }
            while ((j8 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i10 = this.position;
                    this.position = i10 + 1;
                    bArr3[i10] = (byte) ((((int) j8) & ModuleDescriptor.MODULE_VERSION) | 128);
                    j8 >>>= 7;
                } catch (IndexOutOfBoundsException e8) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e8);
                }
            }
            byte[] bArr4 = this.buffer;
            int i11 = this.position;
            this.position = i11 + 1;
            bArr4[i11] = (byte) j8;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i8, byte[] bArr, int i9, int i10) throws IOException {
            writeTag(i8, 2);
            writeByteArrayNoTag(bArr, i9, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        final void writeMessage(int i8, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i8, 2);
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        final void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte[] bArr, int i8, int i9) throws IOException {
            try {
                System.arraycopy(bArr, i8, this.buffer, this.position, i9);
                this.position += i9;
            } catch (IndexOutOfBoundsException e8) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i9)), e8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.buffer, this.position, remaining);
                this.position += remaining;
            } catch (IndexOutOfBoundsException e8) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(remaining)), e8);
            }
        }
    }

    /* loaded from: classes3.dex */
    private static final class ByteOutputEncoder extends AbstractBufferedEncoder {
        private final ByteOutput out;

        ByteOutputEncoder(ByteOutput byteOutput, int i8) {
            super(i8);
            if (byteOutput != null) {
                this.out = byteOutput;
                return;
            }
            throw new NullPointerException("out");
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i8) throws IOException {
            if (this.limit - this.position < i8) {
                doFlush();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b9) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i8, boolean z8) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i8, 0);
            buffer(z8 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i8, byte[] bArr) throws IOException {
            writeByteArray(i8, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i8, int i9) throws IOException {
            writeUInt32NoTag(i9);
            write(bArr, i8, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i8, ByteBuffer byteBuffer) throws IOException {
            writeTag(i8, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i8, ByteString byteString) throws IOException {
            writeTag(i8, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i8, int i9) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i8, 5);
            bufferFixed32NoTag(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i8) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i8, long j8) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i8, 1);
            bufferFixed64NoTag(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j8) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i8, int i9) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i8, 0);
            bufferInt32NoTag(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i8) throws IOException {
            if (i8 >= 0) {
                writeUInt32NoTag(i8);
            } else {
                writeUInt64NoTag(i8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i8, int i9) throws IOException {
            flush();
            this.out.writeLazy(bArr, i8, i9);
            this.totalBytesWritten += i9;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i8, MessageLite messageLite) throws IOException {
            writeTag(i8, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i8, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i8);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(duplicate);
            write(duplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i8, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i8);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i8, String str) throws IOException {
            writeTag(i8, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int length = str.length() * 3;
            int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
            int i8 = computeUInt32SizeNoTag + length;
            int i9 = this.limit;
            if (i8 > i9) {
                byte[] bArr = new byte[length];
                int encode = Utf8.encode(str, bArr, 0, length);
                writeUInt32NoTag(encode);
                writeLazy(bArr, 0, encode);
                return;
            }
            if (i8 > i9 - this.position) {
                doFlush();
            }
            int i10 = this.position;
            try {
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int i11 = i10 + computeUInt32SizeNoTag2;
                    this.position = i11;
                    int encode2 = Utf8.encode(str, this.buffer, i11, this.limit - i11);
                    this.position = i10;
                    int i12 = (encode2 - i10) - computeUInt32SizeNoTag2;
                    bufferUInt32NoTag(i12);
                    this.position = encode2;
                    this.totalBytesWritten += i12;
                } else {
                    int encodedLength = Utf8.encodedLength(str);
                    bufferUInt32NoTag(encodedLength);
                    this.position = Utf8.encode(str, this.buffer, this.position, encodedLength);
                    this.totalBytesWritten += encodedLength;
                }
            } catch (Utf8.UnpairedSurrogateException e8) {
                this.totalBytesWritten -= this.position - i10;
                this.position = i10;
                inefficientWriteStringNoTag(str, e8);
            } catch (IndexOutOfBoundsException e9) {
                throw new OutOfSpaceException(e9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i8, int i9) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i8, i9));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i8, int i9) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i8, 0);
            bufferUInt32NoTag(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i8) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i8, long j8) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i8, 0);
            bufferUInt64NoTag(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j8) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i8, byte[] bArr, int i9, int i10) throws IOException {
            writeTag(i8, 2);
            writeByteArrayNoTag(bArr, i9, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void writeMessage(int i8, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i8, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i8, int i9) throws IOException {
            flush();
            this.out.write(bArr, i8, i9);
            this.totalBytesWritten += i9;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            flush();
            int remaining = byteBuffer.remaining();
            this.out.writeLazy(byteBuffer);
            this.totalBytesWritten += remaining;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
            flush();
            int remaining = byteBuffer.remaining();
            this.out.write(byteBuffer);
            this.totalBytesWritten += remaining;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class HeapNioEncoder extends ArrayEncoder {
        private final ByteBuffer byteBuffer;
        private int initialPosition;

        HeapNioEncoder(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.byteBuffer = byteBuffer;
            this.initialPosition = byteBuffer.position();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream.ArrayEncoder, androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
            Java8Compatibility.position(this.byteBuffer, this.initialPosition + getTotalBytesWritten());
        }
    }

    /* loaded from: classes3.dex */
    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super(MESSAGE);
        }

        OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        OutOfSpaceException(Throwable th) {
            super(MESSAGE, th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class OutputStreamEncoder extends AbstractBufferedEncoder {
        private final OutputStream out;

        OutputStreamEncoder(OutputStream outputStream, int i8) {
            super(i8);
            if (outputStream != null) {
                this.out = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i8) throws IOException {
            if (this.limit - this.position < i8) {
                doFlush();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b9) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i8, boolean z8) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i8, 0);
            buffer(z8 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i8, byte[] bArr) throws IOException {
            writeByteArray(i8, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i8, int i9) throws IOException {
            writeUInt32NoTag(i9);
            write(bArr, i8, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i8, ByteBuffer byteBuffer) throws IOException {
            writeTag(i8, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i8, ByteString byteString) throws IOException {
            writeTag(i8, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i8, int i9) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i8, 5);
            bufferFixed32NoTag(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i8) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i8, long j8) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i8, 1);
            bufferFixed64NoTag(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j8) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i8, int i9) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i8, 0);
            bufferInt32NoTag(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i8) throws IOException {
            if (i8 >= 0) {
                writeUInt32NoTag(i8);
            } else {
                writeUInt64NoTag(i8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i8, int i9) throws IOException {
            write(bArr, i8, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i8, MessageLite messageLite) throws IOException {
            writeTag(i8, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i8, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i8);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(duplicate);
            write(duplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i8, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i8);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i8, String str) throws IOException {
            writeTag(i8, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int encodedLength;
            try {
                int length = str.length() * 3;
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
                int i8 = computeUInt32SizeNoTag + length;
                int i9 = this.limit;
                if (i8 > i9) {
                    byte[] bArr = new byte[length];
                    int encode = Utf8.encode(str, bArr, 0, length);
                    writeUInt32NoTag(encode);
                    writeLazy(bArr, 0, encode);
                    return;
                }
                if (i8 > i9 - this.position) {
                    doFlush();
                }
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                int i10 = this.position;
                try {
                    if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                        int i11 = i10 + computeUInt32SizeNoTag2;
                        this.position = i11;
                        int encode2 = Utf8.encode(str, this.buffer, i11, this.limit - i11);
                        this.position = i10;
                        encodedLength = (encode2 - i10) - computeUInt32SizeNoTag2;
                        bufferUInt32NoTag(encodedLength);
                        this.position = encode2;
                    } else {
                        encodedLength = Utf8.encodedLength(str);
                        bufferUInt32NoTag(encodedLength);
                        this.position = Utf8.encode(str, this.buffer, this.position, encodedLength);
                    }
                    this.totalBytesWritten += encodedLength;
                } catch (Utf8.UnpairedSurrogateException e8) {
                    this.totalBytesWritten -= this.position - i10;
                    this.position = i10;
                    throw e8;
                } catch (ArrayIndexOutOfBoundsException e9) {
                    throw new OutOfSpaceException(e9);
                }
            } catch (Utf8.UnpairedSurrogateException e10) {
                inefficientWriteStringNoTag(str, e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i8, int i9) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i8, i9));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i8, int i9) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i8, 0);
            bufferUInt32NoTag(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i8) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i8, long j8) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i8, 0);
            bufferUInt64NoTag(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j8) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i8, byte[] bArr, int i9, int i10) throws IOException {
            writeTag(i8, 2);
            writeByteArrayNoTag(bArr, i9, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void writeMessage(int i8, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i8, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i8, int i9) throws IOException {
            int i10 = this.limit;
            int i11 = this.position;
            if (i10 - i11 >= i9) {
                System.arraycopy(bArr, i8, this.buffer, i11, i9);
                this.position += i9;
                this.totalBytesWritten += i9;
                return;
            }
            int i12 = i10 - i11;
            System.arraycopy(bArr, i8, this.buffer, i11, i12);
            int i13 = i8 + i12;
            int i14 = i9 - i12;
            this.position = this.limit;
            this.totalBytesWritten += i12;
            doFlush();
            if (i14 <= this.limit) {
                System.arraycopy(bArr, i13, this.buffer, 0, i14);
                this.position = i14;
            } else {
                this.out.write(bArr, i13, i14);
            }
            this.totalBytesWritten += i14;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            int i8 = this.limit;
            int i9 = this.position;
            if (i8 - i9 >= remaining) {
                byteBuffer.get(this.buffer, i9, remaining);
                this.position += remaining;
                this.totalBytesWritten += remaining;
                return;
            }
            int i10 = i8 - i9;
            byteBuffer.get(this.buffer, i9, i10);
            int i11 = remaining - i10;
            this.position = this.limit;
            this.totalBytesWritten += i10;
            doFlush();
            while (true) {
                int i12 = this.limit;
                if (i11 > i12) {
                    byteBuffer.get(this.buffer, 0, i12);
                    this.out.write(this.buffer, 0, this.limit);
                    int i13 = this.limit;
                    i11 -= i13;
                    this.totalBytesWritten += i13;
                } else {
                    byteBuffer.get(this.buffer, 0, i11);
                    this.position = i11;
                    this.totalBytesWritten += i11;
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class SafeDirectNioEncoder extends CodedOutputStream {
        private final ByteBuffer buffer;
        private final int initialPosition;
        private final ByteBuffer originalBuffer;

        SafeDirectNioEncoder(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.initialPosition = byteBuffer.position();
        }

        private void encode(String str) throws IOException {
            try {
                Utf8.encodeUtf8(str, this.buffer);
            } catch (IndexOutOfBoundsException e8) {
                throw new OutOfSpaceException(e8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
            Java8Compatibility.position(this.originalBuffer, this.buffer.position());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return this.buffer.position() - this.initialPosition;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int spaceLeft() {
            return this.buffer.remaining();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b9) throws IOException {
            try {
                this.buffer.put(b9);
            } catch (BufferOverflowException e8) {
                throw new OutOfSpaceException(e8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i8, boolean z8) throws IOException {
            writeTag(i8, 0);
            write(z8 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i8, byte[] bArr) throws IOException {
            writeByteArray(i8, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i8, int i9) throws IOException {
            writeUInt32NoTag(i9);
            write(bArr, i8, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i8, ByteBuffer byteBuffer) throws IOException {
            writeTag(i8, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i8, ByteString byteString) throws IOException {
            writeTag(i8, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i8, int i9) throws IOException {
            writeTag(i8, 5);
            writeFixed32NoTag(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i8) throws IOException {
            try {
                this.buffer.putInt(i8);
            } catch (BufferOverflowException e8) {
                throw new OutOfSpaceException(e8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i8, long j8) throws IOException {
            writeTag(i8, 1);
            writeFixed64NoTag(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j8) throws IOException {
            try {
                this.buffer.putLong(j8);
            } catch (BufferOverflowException e8) {
                throw new OutOfSpaceException(e8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i8, int i9) throws IOException {
            writeTag(i8, 0);
            writeInt32NoTag(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i8) throws IOException {
            if (i8 >= 0) {
                writeUInt32NoTag(i8);
            } else {
                writeUInt64NoTag(i8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i8, int i9) throws IOException {
            write(bArr, i8, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i8, MessageLite messageLite) throws IOException {
            writeTag(i8, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i8, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i8);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(duplicate);
            write(duplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i8, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i8);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i8, String str) throws IOException {
            writeTag(i8, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int position = this.buffer.position();
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int position2 = this.buffer.position() + computeUInt32SizeNoTag2;
                    Java8Compatibility.position(this.buffer, position2);
                    encode(str);
                    int position3 = this.buffer.position();
                    Java8Compatibility.position(this.buffer, position);
                    writeUInt32NoTag(position3 - position2);
                    Java8Compatibility.position(this.buffer, position3);
                } else {
                    writeUInt32NoTag(Utf8.encodedLength(str));
                    encode(str);
                }
            } catch (Utf8.UnpairedSurrogateException e8) {
                Java8Compatibility.position(this.buffer, position);
                inefficientWriteStringNoTag(str, e8);
            } catch (IllegalArgumentException e9) {
                throw new OutOfSpaceException(e9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i8, int i9) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i8, i9));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i8, int i9) throws IOException {
            writeTag(i8, 0);
            writeUInt32NoTag(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i8) throws IOException {
            while ((i8 & (-128)) != 0) {
                try {
                    this.buffer.put((byte) ((i8 & ModuleDescriptor.MODULE_VERSION) | 128));
                    i8 >>>= 7;
                } catch (BufferOverflowException e8) {
                    throw new OutOfSpaceException(e8);
                }
            }
            this.buffer.put((byte) i8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i8, long j8) throws IOException {
            writeTag(i8, 0);
            writeUInt64NoTag(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j8) throws IOException {
            while (((-128) & j8) != 0) {
                try {
                    this.buffer.put((byte) ((((int) j8) & ModuleDescriptor.MODULE_VERSION) | 128));
                    j8 >>>= 7;
                } catch (BufferOverflowException e8) {
                    throw new OutOfSpaceException(e8);
                }
            }
            this.buffer.put((byte) j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i8, byte[] bArr, int i9, int i10) throws IOException {
            writeTag(i8, 2);
            writeByteArrayNoTag(bArr, i9, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i8, int i9) throws IOException {
            try {
                this.buffer.put(bArr, i8, i9);
            } catch (IndexOutOfBoundsException e8) {
                throw new OutOfSpaceException(e8);
            } catch (BufferOverflowException e9) {
                throw new OutOfSpaceException(e9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void writeMessage(int i8, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i8, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
            try {
                this.buffer.put(byteBuffer);
            } catch (BufferOverflowException e8) {
                throw new OutOfSpaceException(e8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class UnsafeDirectNioEncoder extends CodedOutputStream {
        private final long address;
        private final ByteBuffer buffer;
        private final long initialPosition;
        private final long limit;
        private final long oneVarintLimit;
        private final ByteBuffer originalBuffer;
        private long position;

        UnsafeDirectNioEncoder(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long addressOffset = UnsafeUtil.addressOffset(byteBuffer);
            this.address = addressOffset;
            long position = byteBuffer.position() + addressOffset;
            this.initialPosition = position;
            long limit = addressOffset + byteBuffer.limit();
            this.limit = limit;
            this.oneVarintLimit = limit - 10;
            this.position = position;
        }

        private int bufferPos(long j8) {
            return (int) (j8 - this.address);
        }

        static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void repositionBuffer(long j8) {
            Java8Compatibility.position(this.buffer, bufferPos(j8));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
            Java8Compatibility.position(this.originalBuffer, bufferPos(this.position));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return (int) (this.position - this.initialPosition);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public int spaceLeft() {
            return (int) (this.limit - this.position);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b9) throws IOException {
            long j8 = this.position;
            if (j8 < this.limit) {
                this.position = 1 + j8;
                UnsafeUtil.putByte(j8, b9);
                return;
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int i8, boolean z8) throws IOException {
            writeTag(i8, 0);
            write(z8 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i8, byte[] bArr) throws IOException {
            writeByteArray(i8, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i8, int i9) throws IOException {
            writeUInt32NoTag(i9);
            write(bArr, i8, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteBuffer(int i8, ByteBuffer byteBuffer) throws IOException {
            writeTag(i8, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int i8, ByteString byteString) throws IOException {
            writeTag(i8, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int i8, int i9) throws IOException {
            writeTag(i8, 5);
            writeFixed32NoTag(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i8) throws IOException {
            this.buffer.putInt(bufferPos(this.position), i8);
            this.position += 4;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int i8, long j8) throws IOException {
            writeTag(i8, 1);
            writeFixed64NoTag(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j8) throws IOException {
            this.buffer.putLong(bufferPos(this.position), j8);
            this.position += 8;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int i8, int i9) throws IOException {
            writeTag(i8, 0);
            writeInt32NoTag(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i8) throws IOException {
            if (i8 >= 0) {
                writeUInt32NoTag(i8);
            } else {
                writeUInt64NoTag(i8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i8, int i9) throws IOException {
            write(bArr, i8, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessage(int i8, MessageLite messageLite) throws IOException {
            writeTag(i8, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i8, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i8);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(duplicate);
            write(duplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i8, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i8);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int i8, String str) throws IOException {
            writeTag(i8, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            long j8 = this.position;
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int bufferPos = bufferPos(this.position) + computeUInt32SizeNoTag2;
                    Java8Compatibility.position(this.buffer, bufferPos);
                    Utf8.encodeUtf8(str, this.buffer);
                    int position = this.buffer.position() - bufferPos;
                    writeUInt32NoTag(position);
                    this.position += position;
                } else {
                    int encodedLength = Utf8.encodedLength(str);
                    writeUInt32NoTag(encodedLength);
                    repositionBuffer(this.position);
                    Utf8.encodeUtf8(str, this.buffer);
                    this.position += encodedLength;
                }
            } catch (Utf8.UnpairedSurrogateException e8) {
                this.position = j8;
                repositionBuffer(j8);
                inefficientWriteStringNoTag(str, e8);
            } catch (IllegalArgumentException e9) {
                throw new OutOfSpaceException(e9);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int i8, int i9) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i8, i9));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int i8, int i9) throws IOException {
            writeTag(i8, 0);
            writeUInt32NoTag(i9);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i8) throws IOException {
            if (this.position <= this.oneVarintLimit) {
                while ((i8 & (-128)) != 0) {
                    long j8 = this.position;
                    this.position = j8 + 1;
                    UnsafeUtil.putByte(j8, (byte) ((i8 & ModuleDescriptor.MODULE_VERSION) | 128));
                    i8 >>>= 7;
                }
                long j9 = this.position;
                this.position = 1 + j9;
                UnsafeUtil.putByte(j9, (byte) i8);
                return;
            }
            while (true) {
                long j10 = this.position;
                if (j10 < this.limit) {
                    if ((i8 & (-128)) == 0) {
                        this.position = 1 + j10;
                        UnsafeUtil.putByte(j10, (byte) i8);
                        return;
                    } else {
                        this.position = j10 + 1;
                        UnsafeUtil.putByte(j10, (byte) ((i8 & ModuleDescriptor.MODULE_VERSION) | 128));
                        i8 >>>= 7;
                    }
                } else {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int i8, long j8) throws IOException {
            writeTag(i8, 0);
            writeUInt64NoTag(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j8) throws IOException {
            if (this.position <= this.oneVarintLimit) {
                while ((j8 & (-128)) != 0) {
                    long j9 = this.position;
                    this.position = j9 + 1;
                    UnsafeUtil.putByte(j9, (byte) ((((int) j8) & ModuleDescriptor.MODULE_VERSION) | 128));
                    j8 >>>= 7;
                }
                long j10 = this.position;
                this.position = 1 + j10;
                UnsafeUtil.putByte(j10, (byte) j8);
                return;
            }
            while (true) {
                long j11 = this.position;
                if (j11 < this.limit) {
                    if ((j8 & (-128)) == 0) {
                        this.position = 1 + j11;
                        UnsafeUtil.putByte(j11, (byte) j8);
                        return;
                    } else {
                        this.position = j11 + 1;
                        UnsafeUtil.putByte(j11, (byte) ((((int) j8) & ModuleDescriptor.MODULE_VERSION) | 128));
                        j8 >>>= 7;
                    }
                } else {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArray(int i8, byte[] bArr, int i9, int i10) throws IOException {
            writeTag(i8, 2);
            writeByteArrayNoTag(bArr, i9, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void writeMessage(int i8, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i8, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i8, int i9) throws IOException {
            if (bArr != null && i8 >= 0 && i9 >= 0 && bArr.length - i9 >= i8) {
                long j8 = i9;
                long j9 = this.limit - j8;
                long j10 = this.position;
                if (j9 >= j10) {
                    UnsafeUtil.copyMemory(bArr, i8, j10, j8);
                    this.position += j8;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), Integer.valueOf(i9)));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
            try {
                int remaining = byteBuffer.remaining();
                repositionBuffer(this.position);
                this.buffer.put(byteBuffer);
                this.position += remaining;
            } catch (BufferOverflowException e8) {
                throw new OutOfSpaceException(e8);
            }
        }
    }

    public static int computeBoolSize(int i8, boolean z8) {
        return computeTagSize(i8) + computeBoolSizeNoTag(z8);
    }

    public static int computeBoolSizeNoTag(boolean z8) {
        return 1;
    }

    public static int computeByteArraySize(int i8, byte[] bArr) {
        return computeTagSize(i8) + computeByteArraySizeNoTag(bArr);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i8, ByteBuffer byteBuffer) {
        return computeTagSize(i8) + computeByteBufferSizeNoTag(byteBuffer);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i8, ByteString byteString) {
        return computeTagSize(i8) + computeBytesSizeNoTag(byteString);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return computeLengthDelimitedFieldSize(byteString.size());
    }

    public static int computeDoubleSize(int i8, double d8) {
        return computeTagSize(i8) + computeDoubleSizeNoTag(d8);
    }

    public static int computeDoubleSizeNoTag(double d8) {
        return 8;
    }

    public static int computeEnumSize(int i8, int i9) {
        return computeTagSize(i8) + computeEnumSizeNoTag(i9);
    }

    public static int computeEnumSizeNoTag(int i8) {
        return computeInt32SizeNoTag(i8);
    }

    public static int computeFixed32Size(int i8, int i9) {
        return computeTagSize(i8) + computeFixed32SizeNoTag(i9);
    }

    public static int computeFixed32SizeNoTag(int i8) {
        return 4;
    }

    public static int computeFixed64Size(int i8, long j8) {
        return computeTagSize(i8) + computeFixed64SizeNoTag(j8);
    }

    public static int computeFixed64SizeNoTag(long j8) {
        return 8;
    }

    public static int computeFloatSize(int i8, float f8) {
        return computeTagSize(i8) + computeFloatSizeNoTag(f8);
    }

    public static int computeFloatSizeNoTag(float f8) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i8, MessageLite messageLite) {
        return (computeTagSize(i8) * 2) + messageLite.getSerializedSize();
    }

    @InlineMe(replacement = "value.getSerializedSize()")
    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i8, int i9) {
        return computeTagSize(i8) + computeInt32SizeNoTag(i9);
    }

    public static int computeInt32SizeNoTag(int i8) {
        if (i8 >= 0) {
            return computeUInt32SizeNoTag(i8);
        }
        return 10;
    }

    public static int computeInt64Size(int i8, long j8) {
        return computeTagSize(i8) + computeInt64SizeNoTag(j8);
    }

    public static int computeInt64SizeNoTag(long j8) {
        return computeUInt64SizeNoTag(j8);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i8, LazyFieldLite lazyFieldLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i8) + computeLazyFieldSize(3, lazyFieldLite);
    }

    public static int computeLazyFieldSize(int i8, LazyFieldLite lazyFieldLite) {
        return computeTagSize(i8) + computeLazyFieldSizeNoTag(lazyFieldLite);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        return computeLengthDelimitedFieldSize(lazyFieldLite.getSerializedSize());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeLengthDelimitedFieldSize(int i8) {
        return computeUInt32SizeNoTag(i8) + i8;
    }

    public static int computeMessageSetExtensionSize(int i8, MessageLite messageLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i8) + computeMessageSize(3, messageLite);
    }

    public static int computeMessageSize(int i8, MessageLite messageLite) {
        return computeTagSize(i8) + computeMessageSizeNoTag(messageLite);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        return computeLengthDelimitedFieldSize(messageLite.getSerializedSize());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computePreferredBufferSize(int i8) {
        if (i8 > 4096) {
            return 4096;
        }
        return i8;
    }

    public static int computeRawMessageSetExtensionSize(int i8, ByteString byteString) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i8) + computeBytesSize(3, byteString);
    }

    @InlineMe(imports = {"androidx.datastore.preferences.protobuf.CodedOutputStream"}, replacement = "CodedOutputStream.computeUInt32SizeNoTag(value)")
    @Deprecated
    public static int computeRawVarint32Size(int i8) {
        return computeUInt32SizeNoTag(i8);
    }

    @InlineMe(imports = {"androidx.datastore.preferences.protobuf.CodedOutputStream"}, replacement = "CodedOutputStream.computeUInt64SizeNoTag(value)")
    @Deprecated
    public static int computeRawVarint64Size(long j8) {
        return computeUInt64SizeNoTag(j8);
    }

    public static int computeSFixed32Size(int i8, int i9) {
        return computeTagSize(i8) + computeSFixed32SizeNoTag(i9);
    }

    public static int computeSFixed32SizeNoTag(int i8) {
        return 4;
    }

    public static int computeSFixed64Size(int i8, long j8) {
        return computeTagSize(i8) + computeSFixed64SizeNoTag(j8);
    }

    public static int computeSFixed64SizeNoTag(long j8) {
        return 8;
    }

    public static int computeSInt32Size(int i8, int i9) {
        return computeTagSize(i8) + computeSInt32SizeNoTag(i9);
    }

    public static int computeSInt32SizeNoTag(int i8) {
        return computeUInt32SizeNoTag(encodeZigZag32(i8));
    }

    public static int computeSInt64Size(int i8, long j8) {
        return computeTagSize(i8) + computeSInt64SizeNoTag(j8);
    }

    public static int computeSInt64SizeNoTag(long j8) {
        return computeUInt64SizeNoTag(encodeZigZag64(j8));
    }

    public static int computeStringSize(int i8, String str) {
        return computeTagSize(i8) + computeStringSizeNoTag(str);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = Utf8.encodedLength(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(Internal.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeTagSize(int i8) {
        return computeUInt32SizeNoTag(WireFormat.makeTag(i8, 0));
    }

    public static int computeUInt32Size(int i8, int i9) {
        return computeTagSize(i8) + computeUInt32SizeNoTag(i9);
    }

    public static int computeUInt32SizeNoTag(int i8) {
        if ((i8 & (-128)) == 0) {
            return 1;
        }
        if ((i8 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i8) == 0) {
            return 3;
        }
        return (i8 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeUInt64Size(int i8, long j8) {
        return computeTagSize(i8) + computeUInt64SizeNoTag(j8);
    }

    public static int computeUInt64SizeNoTag(long j8) {
        int i8;
        if (((-128) & j8) == 0) {
            return 1;
        }
        if (j8 < 0) {
            return 10;
        }
        if (((-34359738368L) & j8) != 0) {
            j8 >>>= 28;
            i8 = 6;
        } else {
            i8 = 2;
        }
        if (((-2097152) & j8) != 0) {
            i8 += 2;
            j8 >>>= 14;
        }
        return (j8 & (-16384)) != 0 ? i8 + 1 : i8;
    }

    public static int encodeZigZag32(int i8) {
        return (i8 >> 31) ^ (i8 << 1);
    }

    public static long encodeZigZag64(long j8) {
        return (j8 >> 63) ^ (j8 << 1);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    static CodedOutputStream newSafeInstance(ByteBuffer byteBuffer) {
        return new SafeDirectNioEncoder(byteBuffer);
    }

    static CodedOutputStream newUnsafeInstance(ByteBuffer byteBuffer) {
        return new UnsafeDirectNioEncoder(byteBuffer);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    final void inefficientWriteStringNoTag(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws IOException {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e8) {
            throw new OutOfSpaceException(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(byte b9) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(byte[] bArr, int i8, int i9) throws IOException;

    public abstract void writeBool(int i8, boolean z8) throws IOException;

    public final void writeBoolNoTag(boolean z8) throws IOException {
        write(z8 ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i8, byte[] bArr) throws IOException;

    public abstract void writeByteArray(int i8, byte[] bArr, int i9, int i10) throws IOException;

    public final void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    abstract void writeByteArrayNoTag(byte[] bArr, int i8, int i9) throws IOException;

    public abstract void writeByteBuffer(int i8, ByteBuffer byteBuffer) throws IOException;

    public abstract void writeBytes(int i8, ByteString byteString) throws IOException;

    public abstract void writeBytesNoTag(ByteString byteString) throws IOException;

    public final void writeDouble(int i8, double d8) throws IOException {
        writeFixed64(i8, Double.doubleToRawLongBits(d8));
    }

    public final void writeDoubleNoTag(double d8) throws IOException {
        writeFixed64NoTag(Double.doubleToRawLongBits(d8));
    }

    public final void writeEnum(int i8, int i9) throws IOException {
        writeInt32(i8, i9);
    }

    public final void writeEnumNoTag(int i8) throws IOException {
        writeInt32NoTag(i8);
    }

    public abstract void writeFixed32(int i8, int i9) throws IOException;

    public abstract void writeFixed32NoTag(int i8) throws IOException;

    public abstract void writeFixed64(int i8, long j8) throws IOException;

    public abstract void writeFixed64NoTag(long j8) throws IOException;

    public final void writeFloat(int i8, float f8) throws IOException {
        writeFixed32(i8, Float.floatToRawIntBits(f8));
    }

    public final void writeFloatNoTag(float f8) throws IOException {
        writeFixed32NoTag(Float.floatToRawIntBits(f8));
    }

    @Deprecated
    public final void writeGroup(int i8, MessageLite messageLite) throws IOException {
        writeTag(i8, 3);
        writeGroupNoTag(messageLite);
        writeTag(i8, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite) throws IOException {
        messageLite.writeTo(this);
    }

    public abstract void writeInt32(int i8, int i9) throws IOException;

    public abstract void writeInt32NoTag(int i8) throws IOException;

    public final void writeInt64(int i8, long j8) throws IOException {
        writeUInt64(i8, j8);
    }

    public final void writeInt64NoTag(long j8) throws IOException {
        writeUInt64NoTag(j8);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void writeLazy(byte[] bArr, int i8, int i9) throws IOException;

    public abstract void writeMessage(int i8, MessageLite messageLite) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void writeMessage(int i8, MessageLite messageLite, Schema schema) throws IOException;

    public abstract void writeMessageNoTag(MessageLite messageLite) throws IOException;

    abstract void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException;

    public abstract void writeMessageSetExtension(int i8, MessageLite messageLite) throws IOException;

    public final void writeRawByte(byte b9) throws IOException {
        write(b9);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer) throws IOException;

    public final void writeRawBytes(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @InlineMe(replacement = "this.writeFixed32NoTag(value)")
    @Deprecated
    public final void writeRawLittleEndian32(int i8) throws IOException {
        writeFixed32NoTag(i8);
    }

    @InlineMe(replacement = "this.writeFixed64NoTag(value)")
    @Deprecated
    public final void writeRawLittleEndian64(long j8) throws IOException {
        writeFixed64NoTag(j8);
    }

    public abstract void writeRawMessageSetExtension(int i8, ByteString byteString) throws IOException;

    @InlineMe(replacement = "this.writeUInt32NoTag(value)")
    @Deprecated
    public final void writeRawVarint32(int i8) throws IOException {
        writeUInt32NoTag(i8);
    }

    @InlineMe(replacement = "this.writeUInt64NoTag(value)")
    @Deprecated
    public final void writeRawVarint64(long j8) throws IOException {
        writeUInt64NoTag(j8);
    }

    public final void writeSFixed32(int i8, int i9) throws IOException {
        writeFixed32(i8, i9);
    }

    public final void writeSFixed32NoTag(int i8) throws IOException {
        writeFixed32NoTag(i8);
    }

    public final void writeSFixed64(int i8, long j8) throws IOException {
        writeFixed64(i8, j8);
    }

    public final void writeSFixed64NoTag(long j8) throws IOException {
        writeFixed64NoTag(j8);
    }

    public final void writeSInt32(int i8, int i9) throws IOException {
        writeUInt32(i8, encodeZigZag32(i9));
    }

    public final void writeSInt32NoTag(int i8) throws IOException {
        writeUInt32NoTag(encodeZigZag32(i8));
    }

    public final void writeSInt64(int i8, long j8) throws IOException {
        writeUInt64(i8, encodeZigZag64(j8));
    }

    public final void writeSInt64NoTag(long j8) throws IOException {
        writeUInt64NoTag(encodeZigZag64(j8));
    }

    public abstract void writeString(int i8, String str) throws IOException;

    public abstract void writeStringNoTag(String str) throws IOException;

    public abstract void writeTag(int i8, int i9) throws IOException;

    public abstract void writeUInt32(int i8, int i9) throws IOException;

    public abstract void writeUInt32NoTag(int i8) throws IOException;

    public abstract void writeUInt64(int i8, long j8) throws IOException;

    public abstract void writeUInt64NoTag(long j8) throws IOException;

    private CodedOutputStream() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int computeGroupSize(int i8, MessageLite messageLite, Schema schema) {
        return (computeTagSize(i8) * 2) + computeGroupSizeNoTag(messageLite, schema);
    }

    @Deprecated
    static int computeGroupSizeNoTag(MessageLite messageLite, Schema schema) {
        return ((AbstractMessageLite) messageLite).getSerializedSize(schema);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeMessageSize(int i8, MessageLite messageLite, Schema schema) {
        return computeTagSize(i8) + computeMessageSizeNoTag(messageLite, schema);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeMessageSizeNoTag(MessageLite messageLite, Schema schema) {
        return computeLengthDelimitedFieldSize(((AbstractMessageLite) messageLite).getSerializedSize(schema));
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i8) {
        return new OutputStreamEncoder(outputStream, i8);
    }

    @Deprecated
    final void writeGroupNoTag(MessageLite messageLite, Schema schema) throws IOException {
        schema.writeTo(messageLite, this.wrapper);
    }

    public final void writeRawByte(int i8) throws IOException {
        write((byte) i8);
    }

    public final void writeRawBytes(byte[] bArr, int i8, int i9) throws IOException {
        write(bArr, i8, i9);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(ByteString byteString) throws IOException {
        byteString.writeTo(this);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i8, int i9) {
        return new ArrayEncoder(bArr, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public final void writeGroup(int i8, MessageLite messageLite, Schema schema) throws IOException {
        writeTag(i8, 3);
        writeGroupNoTag(messageLite, schema);
        writeTag(i8, 4);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new HeapNioEncoder(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (UnsafeDirectNioEncoder.isSupported()) {
                return newUnsafeInstance(byteBuffer);
            }
            return newSafeInstance(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i8) {
        return newInstance(byteBuffer);
    }

    static CodedOutputStream newInstance(ByteOutput byteOutput, int i8) {
        if (i8 >= 0) {
            return new ByteOutputEncoder(byteOutput, i8);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }
}
