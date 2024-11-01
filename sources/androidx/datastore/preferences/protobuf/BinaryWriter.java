package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.Utf8;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
@CheckReturnValue
/* loaded from: classes3.dex */
public abstract class BinaryWriter extends ByteOutput implements Writer {
    public static final int DEFAULT_CHUNK_SIZE = 4096;
    private static final int MAP_KEY_NUMBER = 1;
    private static final int MAP_VALUE_NUMBER = 2;
    private final BufferAllocator alloc;
    final ArrayDeque<AllocatedBuffer> buffers;
    private final int chunkSize;
    int totalDoneBytes;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.BinaryWriter$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class SafeDirectWriter extends BinaryWriter {
        private ByteBuffer buffer;
        private int limitMinusOne;
        private int pos;

        SafeDirectWriter(BufferAllocator bufferAllocator, int i8) {
            super(bufferAllocator, i8, null);
            nextBuffer();
        }

        private int bytesWrittenToCurrentBuffer() {
            return this.limitMinusOne - this.pos;
        }

        private void nextBuffer() {
            nextBuffer(newDirectBuffer());
        }

        private int spaceLeft() {
            return this.pos + 1;
        }

        private void writeVarint32FiveBytes(int i8) {
            ByteBuffer byteBuffer = this.buffer;
            int i9 = this.pos;
            this.pos = i9 - 1;
            byteBuffer.put(i9, (byte) (i8 >>> 28));
            int i10 = this.pos;
            this.pos = i10 - 4;
            this.buffer.putInt(i10 - 3, (i8 & ModuleDescriptor.MODULE_VERSION) | 128 | ((((i8 >>> 21) & ModuleDescriptor.MODULE_VERSION) | 128) << 24) | ((((i8 >>> 14) & ModuleDescriptor.MODULE_VERSION) | 128) << 16) | ((((i8 >>> 7) & ModuleDescriptor.MODULE_VERSION) | 128) << 8));
        }

        private void writeVarint32FourBytes(int i8) {
            int i9 = this.pos;
            this.pos = i9 - 4;
            this.buffer.putInt(i9 - 3, (i8 & ModuleDescriptor.MODULE_VERSION) | 128 | ((266338304 & i8) << 3) | (((2080768 & i8) | 2097152) << 2) | (((i8 & 16256) | 16384) << 1));
        }

        private void writeVarint32OneByte(int i8) {
            ByteBuffer byteBuffer = this.buffer;
            int i9 = this.pos;
            this.pos = i9 - 1;
            byteBuffer.put(i9, (byte) i8);
        }

        private void writeVarint32ThreeBytes(int i8) {
            int i9 = this.pos - 3;
            this.pos = i9;
            this.buffer.putInt(i9, (((i8 & ModuleDescriptor.MODULE_VERSION) | 128) << 8) | ((2080768 & i8) << 10) | (((i8 & 16256) | 16384) << 9));
        }

        private void writeVarint32TwoBytes(int i8) {
            int i9 = this.pos;
            this.pos = i9 - 2;
            this.buffer.putShort(i9 - 1, (short) ((i8 & ModuleDescriptor.MODULE_VERSION) | 128 | ((i8 & 16256) << 1)));
        }

        private void writeVarint64EightBytes(long j8) {
            int i8 = this.pos;
            this.pos = i8 - 8;
            this.buffer.putLong(i8 - 7, (j8 & 127) | 128 | ((71494644084506624L & j8) << 7) | (((558551906910208L & j8) | 562949953421312L) << 6) | (((4363686772736L & j8) | 4398046511104L) << 5) | (((34091302912L & j8) | 34359738368L) << 4) | (((266338304 & j8) | 268435456) << 3) | (((2080768 & j8) | CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE) << 2) | (((16256 & j8) | 16384) << 1));
        }

        private void writeVarint64EightBytesWithSign(long j8) {
            int i8 = this.pos;
            this.pos = i8 - 8;
            this.buffer.putLong(i8 - 7, (j8 & 127) | 128 | (((71494644084506624L & j8) | 72057594037927936L) << 7) | (((558551906910208L & j8) | 562949953421312L) << 6) | (((4363686772736L & j8) | 4398046511104L) << 5) | (((34091302912L & j8) | 34359738368L) << 4) | (((266338304 & j8) | 268435456) << 3) | (((2080768 & j8) | CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE) << 2) | (((16256 & j8) | 16384) << 1));
        }

        private void writeVarint64FiveBytes(long j8) {
            int i8 = this.pos;
            this.pos = i8 - 5;
            this.buffer.putLong(i8 - 7, (((j8 & 127) | 128) << 24) | ((34091302912L & j8) << 28) | (((266338304 & j8) | 268435456) << 27) | (((2080768 & j8) | CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE) << 26) | (((16256 & j8) | 16384) << 25));
        }

        private void writeVarint64FourBytes(long j8) {
            writeVarint32FourBytes((int) j8);
        }

        private void writeVarint64NineBytes(long j8) {
            ByteBuffer byteBuffer = this.buffer;
            int i8 = this.pos;
            this.pos = i8 - 1;
            byteBuffer.put(i8, (byte) (j8 >>> 56));
            writeVarint64EightBytesWithSign(j8 & 72057594037927935L);
        }

        private void writeVarint64OneByte(long j8) {
            writeVarint32OneByte((int) j8);
        }

        private void writeVarint64SevenBytes(long j8) {
            int i8 = this.pos - 7;
            this.pos = i8;
            this.buffer.putLong(i8, (((j8 & 127) | 128) << 8) | ((558551906910208L & j8) << 14) | (((4363686772736L & j8) | 4398046511104L) << 13) | (((34091302912L & j8) | 34359738368L) << 12) | (((266338304 & j8) | 268435456) << 11) | (((2080768 & j8) | CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE) << 10) | (((16256 & j8) | 16384) << 9));
        }

        private void writeVarint64SixBytes(long j8) {
            int i8 = this.pos;
            this.pos = i8 - 6;
            this.buffer.putLong(i8 - 7, (((j8 & 127) | 128) << 16) | ((4363686772736L & j8) << 21) | (((34091302912L & j8) | 34359738368L) << 20) | (((266338304 & j8) | 268435456) << 19) | (((2080768 & j8) | CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE) << 18) | (((16256 & j8) | 16384) << 17));
        }

        private void writeVarint64TenBytes(long j8) {
            ByteBuffer byteBuffer = this.buffer;
            int i8 = this.pos;
            this.pos = i8 - 1;
            byteBuffer.put(i8, (byte) (j8 >>> 63));
            ByteBuffer byteBuffer2 = this.buffer;
            int i9 = this.pos;
            this.pos = i9 - 1;
            byteBuffer2.put(i9, (byte) (((j8 >>> 56) & 127) | 128));
            writeVarint64EightBytesWithSign(j8 & 72057594037927935L);
        }

        private void writeVarint64ThreeBytes(long j8) {
            writeVarint32ThreeBytes((int) j8);
        }

        private void writeVarint64TwoBytes(long j8) {
            writeVarint32TwoBytes((int) j8);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.buffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                Java8Compatibility.position(this.buffer, this.pos + 1);
                this.buffer = null;
                this.pos = 0;
                this.limitMinusOne = 0;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void requireSpace(int i8) {
            if (spaceLeft() < i8) {
                nextBuffer(i8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b9) {
            ByteBuffer byteBuffer = this.buffer;
            int i8 = this.pos;
            this.pos = i8 - 1;
            byteBuffer.put(i8, b9);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBool(int i8, boolean z8) {
            requireSpace(6);
            write(z8 ? (byte) 1 : (byte) 0);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBytes(int i8, ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i8, 2);
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        @Deprecated
        public void writeEndGroup(int i8) {
            writeTag(i8, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed32(int i8, int i9) {
            requireSpace(9);
            writeFixed32(i9);
            writeTag(i8, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed64(int i8, long j8) {
            requireSpace(13);
            writeFixed64(j8);
            writeTag(i8, 1);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        @Deprecated
        public void writeGroup(int i8, Object obj) throws IOException {
            writeTag(i8, 4);
            Protobuf.getInstance().writeTo(obj, this);
            writeTag(i8, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeInt32(int i8, int i9) {
            requireSpace(15);
            writeInt32(i9);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i8, int i9) {
            if (spaceLeft() < i9) {
                this.totalDoneBytes += i9;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i8, i9));
                nextBuffer();
            } else {
                int i10 = this.pos - i9;
                this.pos = i10;
                Java8Compatibility.position(this.buffer, i10 + 1);
                this.buffer.put(bArr, i8, i9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i8, Object obj) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i8, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt32(int i8, int i9) {
            requireSpace(10);
            writeSInt32(i9);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt64(int i8, long j8) {
            requireSpace(15);
            writeSInt64(j8);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        @Deprecated
        public void writeStartGroup(int i8) {
            writeTag(i8, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeString(int i8, String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i8, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeTag(int i8, int i9) {
            writeVarint32(WireFormat.makeTag(i8, i9));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt32(int i8, int i9) {
            requireSpace(10);
            writeVarint32(i9);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt64(int i8, long j8) {
            requireSpace(15);
            writeVarint64(j8);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeVarint32(int i8) {
            if ((i8 & (-128)) == 0) {
                writeVarint32OneByte(i8);
                return;
            }
            if ((i8 & (-16384)) == 0) {
                writeVarint32TwoBytes(i8);
                return;
            }
            if (((-2097152) & i8) == 0) {
                writeVarint32ThreeBytes(i8);
            } else if (((-268435456) & i8) == 0) {
                writeVarint32FourBytes(i8);
            } else {
                writeVarint32FiveBytes(i8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeVarint64(long j8) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j8)) {
                case 1:
                    writeVarint64OneByte(j8);
                    return;
                case 2:
                    writeVarint64TwoBytes(j8);
                    return;
                case 3:
                    writeVarint64ThreeBytes(j8);
                    return;
                case 4:
                    writeVarint64FourBytes(j8);
                    return;
                case 5:
                    writeVarint64FiveBytes(j8);
                    return;
                case 6:
                    writeVarint64SixBytes(j8);
                    return;
                case 7:
                    writeVarint64SevenBytes(j8);
                    return;
                case 8:
                    writeVarint64EightBytes(j8);
                    return;
                case 9:
                    writeVarint64NineBytes(j8);
                    return;
                case 10:
                    writeVarint64TenBytes(j8);
                    return;
                default:
                    return;
            }
        }

        private void nextBuffer(int i8) {
            nextBuffer(newDirectBuffer(i8));
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i8, int i9) {
            if (spaceLeft() < i9) {
                nextBuffer(i9);
            }
            int i10 = this.pos - i9;
            this.pos = i10;
            Java8Compatibility.position(this.buffer, i10 + 1);
            this.buffer.put(bArr, i8, i9);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasNioBuffer()) {
                ByteBuffer nioBuffer = allocatedBuffer.nioBuffer();
                if (nioBuffer.isDirect()) {
                    finishCurrentBuffer();
                    this.buffers.addFirst(allocatedBuffer);
                    this.buffer = nioBuffer;
                    Java8Compatibility.limit(nioBuffer, nioBuffer.capacity());
                    Java8Compatibility.position(this.buffer, 0);
                    this.buffer.order(ByteOrder.LITTLE_ENDIAN);
                    int limit = this.buffer.limit() - 1;
                    this.limitMinusOne = limit;
                    this.pos = limit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeBool(boolean z8) {
            write(z8 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeFixed32(int i8) {
            int i9 = this.pos;
            this.pos = i9 - 4;
            this.buffer.putInt(i9 - 3, i8);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeFixed64(long j8) {
            int i8 = this.pos;
            this.pos = i8 - 8;
            this.buffer.putLong(i8 - 7, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int i8, Object obj, Schema schema) throws IOException {
            writeTag(i8, 4);
            schema.writeTo(obj, this);
            writeTag(i8, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeInt32(int i8) {
            if (i8 >= 0) {
                writeVarint32(i8);
            } else {
                writeVarint64(i8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeSInt32(int i8) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i8));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeSInt64(long j8) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j8));
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (spaceLeft() < remaining) {
                nextBuffer(remaining);
            }
            int i8 = this.pos - remaining;
            this.pos = i8;
            Java8Compatibility.position(this.buffer, i8 + 1);
            this.buffer.put(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i8, Object obj, Schema schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i8, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeString(String str) {
            int i8;
            int i9;
            int i10;
            char charAt;
            requireSpace(str.length());
            int length = str.length() - 1;
            this.pos -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.buffer.put(this.pos + length, (byte) charAt);
                length--;
            }
            if (length == -1) {
                this.pos--;
                return;
            }
            this.pos += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128 && (i10 = this.pos) >= 0) {
                    ByteBuffer byteBuffer = this.buffer;
                    this.pos = i10 - 1;
                    byteBuffer.put(i10, (byte) charAt2);
                } else if (charAt2 < 2048 && (i9 = this.pos) > 0) {
                    ByteBuffer byteBuffer2 = this.buffer;
                    this.pos = i9 - 1;
                    byteBuffer2.put(i9, (byte) ((charAt2 & '?') | 128));
                    ByteBuffer byteBuffer3 = this.buffer;
                    int i11 = this.pos;
                    this.pos = i11 - 1;
                    byteBuffer3.put(i11, (byte) ((charAt2 >>> 6) | 960));
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i8 = this.pos) > 1) {
                    ByteBuffer byteBuffer4 = this.buffer;
                    this.pos = i8 - 1;
                    byteBuffer4.put(i8, (byte) ((charAt2 & '?') | 128));
                    ByteBuffer byteBuffer5 = this.buffer;
                    int i12 = this.pos;
                    this.pos = i12 - 1;
                    byteBuffer5.put(i12, (byte) (((charAt2 >>> 6) & 63) | 128));
                    ByteBuffer byteBuffer6 = this.buffer;
                    int i13 = this.pos;
                    this.pos = i13 - 1;
                    byteBuffer6.put(i13, (byte) ((charAt2 >>> '\f') | 480));
                } else {
                    if (this.pos > 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                ByteBuffer byteBuffer7 = this.buffer;
                                int i14 = this.pos;
                                this.pos = i14 - 1;
                                byteBuffer7.put(i14, (byte) ((codePoint & 63) | 128));
                                ByteBuffer byteBuffer8 = this.buffer;
                                int i15 = this.pos;
                                this.pos = i15 - 1;
                                byteBuffer8.put(i15, (byte) (((codePoint >>> 6) & 63) | 128));
                                ByteBuffer byteBuffer9 = this.buffer;
                                int i16 = this.pos;
                                this.pos = i16 - 1;
                                byteBuffer9.put(i16, (byte) (((codePoint >>> 12) & 63) | 128));
                                ByteBuffer byteBuffer10 = this.buffer;
                                int i17 = this.pos;
                                this.pos = i17 - 1;
                                byteBuffer10.put(i17, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    requireSpace(length);
                    length++;
                }
                length--;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (spaceLeft() < remaining) {
                this.totalDoneBytes += remaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            } else {
                int i8 = this.pos - remaining;
                this.pos = i8;
                Java8Compatibility.position(this.buffer, i8 + 1);
                this.buffer.put(byteBuffer);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class SafeHeapWriter extends BinaryWriter {
        private AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private int limit;
        private int limitMinusOne;
        private int offset;
        private int offsetMinusOne;
        private int pos;

        SafeHeapWriter(BufferAllocator bufferAllocator, int i8) {
            super(bufferAllocator, i8, null);
            nextBuffer();
        }

        private void nextBuffer() {
            nextBuffer(newHeapBuffer());
        }

        private void writeVarint32FiveBytes(int i8) {
            byte[] bArr = this.buffer;
            int i9 = this.pos;
            int i10 = i9 - 1;
            this.pos = i10;
            bArr[i9] = (byte) (i8 >>> 28);
            int i11 = i9 - 2;
            this.pos = i11;
            bArr[i10] = (byte) (((i8 >>> 21) & ModuleDescriptor.MODULE_VERSION) | 128);
            int i12 = i9 - 3;
            this.pos = i12;
            bArr[i11] = (byte) (((i8 >>> 14) & ModuleDescriptor.MODULE_VERSION) | 128);
            int i13 = i9 - 4;
            this.pos = i13;
            bArr[i12] = (byte) (((i8 >>> 7) & ModuleDescriptor.MODULE_VERSION) | 128);
            this.pos = i9 - 5;
            bArr[i13] = (byte) ((i8 & ModuleDescriptor.MODULE_VERSION) | 128);
        }

        private void writeVarint32FourBytes(int i8) {
            byte[] bArr = this.buffer;
            int i9 = this.pos;
            int i10 = i9 - 1;
            this.pos = i10;
            bArr[i9] = (byte) (i8 >>> 21);
            int i11 = i9 - 2;
            this.pos = i11;
            bArr[i10] = (byte) (((i8 >>> 14) & ModuleDescriptor.MODULE_VERSION) | 128);
            int i12 = i9 - 3;
            this.pos = i12;
            bArr[i11] = (byte) (((i8 >>> 7) & ModuleDescriptor.MODULE_VERSION) | 128);
            this.pos = i9 - 4;
            bArr[i12] = (byte) ((i8 & ModuleDescriptor.MODULE_VERSION) | 128);
        }

        private void writeVarint32OneByte(int i8) {
            byte[] bArr = this.buffer;
            int i9 = this.pos;
            this.pos = i9 - 1;
            bArr[i9] = (byte) i8;
        }

        private void writeVarint32ThreeBytes(int i8) {
            byte[] bArr = this.buffer;
            int i9 = this.pos;
            int i10 = i9 - 1;
            this.pos = i10;
            bArr[i9] = (byte) (i8 >>> 14);
            int i11 = i9 - 2;
            this.pos = i11;
            bArr[i10] = (byte) (((i8 >>> 7) & ModuleDescriptor.MODULE_VERSION) | 128);
            this.pos = i9 - 3;
            bArr[i11] = (byte) ((i8 & ModuleDescriptor.MODULE_VERSION) | 128);
        }

        private void writeVarint32TwoBytes(int i8) {
            byte[] bArr = this.buffer;
            int i9 = this.pos;
            int i10 = i9 - 1;
            this.pos = i10;
            bArr[i9] = (byte) (i8 >>> 7);
            this.pos = i9 - 2;
            bArr[i10] = (byte) ((i8 & ModuleDescriptor.MODULE_VERSION) | 128);
        }

        private void writeVarint64EightBytes(long j8) {
            byte[] bArr = this.buffer;
            int i8 = this.pos;
            int i9 = i8 - 1;
            this.pos = i9;
            bArr[i8] = (byte) (j8 >>> 49);
            int i10 = i8 - 2;
            this.pos = i10;
            bArr[i9] = (byte) (((j8 >>> 42) & 127) | 128);
            int i11 = i8 - 3;
            this.pos = i11;
            bArr[i10] = (byte) (((j8 >>> 35) & 127) | 128);
            int i12 = i8 - 4;
            this.pos = i12;
            bArr[i11] = (byte) (((j8 >>> 28) & 127) | 128);
            int i13 = i8 - 5;
            this.pos = i13;
            bArr[i12] = (byte) (((j8 >>> 21) & 127) | 128);
            int i14 = i8 - 6;
            this.pos = i14;
            bArr[i13] = (byte) (((j8 >>> 14) & 127) | 128);
            int i15 = i8 - 7;
            this.pos = i15;
            bArr[i14] = (byte) (((j8 >>> 7) & 127) | 128);
            this.pos = i8 - 8;
            bArr[i15] = (byte) ((j8 & 127) | 128);
        }

        private void writeVarint64FiveBytes(long j8) {
            byte[] bArr = this.buffer;
            int i8 = this.pos;
            int i9 = i8 - 1;
            this.pos = i9;
            bArr[i8] = (byte) (j8 >>> 28);
            int i10 = i8 - 2;
            this.pos = i10;
            bArr[i9] = (byte) (((j8 >>> 21) & 127) | 128);
            int i11 = i8 - 3;
            this.pos = i11;
            bArr[i10] = (byte) (((j8 >>> 14) & 127) | 128);
            int i12 = i8 - 4;
            this.pos = i12;
            bArr[i11] = (byte) (((j8 >>> 7) & 127) | 128);
            this.pos = i8 - 5;
            bArr[i12] = (byte) ((j8 & 127) | 128);
        }

        private void writeVarint64FourBytes(long j8) {
            byte[] bArr = this.buffer;
            int i8 = this.pos;
            int i9 = i8 - 1;
            this.pos = i9;
            bArr[i8] = (byte) (j8 >>> 21);
            int i10 = i8 - 2;
            this.pos = i10;
            bArr[i9] = (byte) (((j8 >>> 14) & 127) | 128);
            int i11 = i8 - 3;
            this.pos = i11;
            bArr[i10] = (byte) (((j8 >>> 7) & 127) | 128);
            this.pos = i8 - 4;
            bArr[i11] = (byte) ((j8 & 127) | 128);
        }

        private void writeVarint64NineBytes(long j8) {
            byte[] bArr = this.buffer;
            int i8 = this.pos;
            int i9 = i8 - 1;
            this.pos = i9;
            bArr[i8] = (byte) (j8 >>> 56);
            int i10 = i8 - 2;
            this.pos = i10;
            bArr[i9] = (byte) (((j8 >>> 49) & 127) | 128);
            int i11 = i8 - 3;
            this.pos = i11;
            bArr[i10] = (byte) (((j8 >>> 42) & 127) | 128);
            int i12 = i8 - 4;
            this.pos = i12;
            bArr[i11] = (byte) (((j8 >>> 35) & 127) | 128);
            int i13 = i8 - 5;
            this.pos = i13;
            bArr[i12] = (byte) (((j8 >>> 28) & 127) | 128);
            int i14 = i8 - 6;
            this.pos = i14;
            bArr[i13] = (byte) (((j8 >>> 21) & 127) | 128);
            int i15 = i8 - 7;
            this.pos = i15;
            bArr[i14] = (byte) (((j8 >>> 14) & 127) | 128);
            int i16 = i8 - 8;
            this.pos = i16;
            bArr[i15] = (byte) (((j8 >>> 7) & 127) | 128);
            this.pos = i8 - 9;
            bArr[i16] = (byte) ((j8 & 127) | 128);
        }

        private void writeVarint64OneByte(long j8) {
            byte[] bArr = this.buffer;
            int i8 = this.pos;
            this.pos = i8 - 1;
            bArr[i8] = (byte) j8;
        }

        private void writeVarint64SevenBytes(long j8) {
            byte[] bArr = this.buffer;
            int i8 = this.pos;
            int i9 = i8 - 1;
            this.pos = i9;
            bArr[i8] = (byte) (j8 >>> 42);
            int i10 = i8 - 2;
            this.pos = i10;
            bArr[i9] = (byte) (((j8 >>> 35) & 127) | 128);
            int i11 = i8 - 3;
            this.pos = i11;
            bArr[i10] = (byte) (((j8 >>> 28) & 127) | 128);
            int i12 = i8 - 4;
            this.pos = i12;
            bArr[i11] = (byte) (((j8 >>> 21) & 127) | 128);
            int i13 = i8 - 5;
            this.pos = i13;
            bArr[i12] = (byte) (((j8 >>> 14) & 127) | 128);
            int i14 = i8 - 6;
            this.pos = i14;
            bArr[i13] = (byte) (((j8 >>> 7) & 127) | 128);
            this.pos = i8 - 7;
            bArr[i14] = (byte) ((j8 & 127) | 128);
        }

        private void writeVarint64SixBytes(long j8) {
            byte[] bArr = this.buffer;
            int i8 = this.pos;
            int i9 = i8 - 1;
            this.pos = i9;
            bArr[i8] = (byte) (j8 >>> 35);
            int i10 = i8 - 2;
            this.pos = i10;
            bArr[i9] = (byte) (((j8 >>> 28) & 127) | 128);
            int i11 = i8 - 3;
            this.pos = i11;
            bArr[i10] = (byte) (((j8 >>> 21) & 127) | 128);
            int i12 = i8 - 4;
            this.pos = i12;
            bArr[i11] = (byte) (((j8 >>> 14) & 127) | 128);
            int i13 = i8 - 5;
            this.pos = i13;
            bArr[i12] = (byte) (((j8 >>> 7) & 127) | 128);
            this.pos = i8 - 6;
            bArr[i13] = (byte) ((j8 & 127) | 128);
        }

        private void writeVarint64TenBytes(long j8) {
            byte[] bArr = this.buffer;
            int i8 = this.pos;
            int i9 = i8 - 1;
            this.pos = i9;
            bArr[i8] = (byte) (j8 >>> 63);
            int i10 = i8 - 2;
            this.pos = i10;
            bArr[i9] = (byte) (((j8 >>> 56) & 127) | 128);
            int i11 = i8 - 3;
            this.pos = i11;
            bArr[i10] = (byte) (((j8 >>> 49) & 127) | 128);
            int i12 = i8 - 4;
            this.pos = i12;
            bArr[i11] = (byte) (((j8 >>> 42) & 127) | 128);
            int i13 = i8 - 5;
            this.pos = i13;
            bArr[i12] = (byte) (((j8 >>> 35) & 127) | 128);
            int i14 = i8 - 6;
            this.pos = i14;
            bArr[i13] = (byte) (((j8 >>> 28) & 127) | 128);
            int i15 = i8 - 7;
            this.pos = i15;
            bArr[i14] = (byte) (((j8 >>> 21) & 127) | 128);
            int i16 = i8 - 8;
            this.pos = i16;
            bArr[i15] = (byte) (((j8 >>> 14) & 127) | 128);
            int i17 = i8 - 9;
            this.pos = i17;
            bArr[i16] = (byte) (((j8 >>> 7) & 127) | 128);
            this.pos = i8 - 10;
            bArr[i17] = (byte) ((j8 & 127) | 128);
        }

        private void writeVarint64ThreeBytes(long j8) {
            byte[] bArr = this.buffer;
            int i8 = this.pos;
            int i9 = i8 - 1;
            this.pos = i9;
            bArr[i8] = (byte) (((int) j8) >>> 14);
            int i10 = i8 - 2;
            this.pos = i10;
            bArr[i9] = (byte) (((j8 >>> 7) & 127) | 128);
            this.pos = i8 - 3;
            bArr[i10] = (byte) ((j8 & 127) | 128);
        }

        private void writeVarint64TwoBytes(long j8) {
            byte[] bArr = this.buffer;
            int i8 = this.pos;
            int i9 = i8 - 1;
            this.pos = i9;
            bArr[i8] = (byte) (j8 >>> 7);
            this.pos = i8 - 2;
            bArr[i9] = (byte) ((((int) j8) & ModuleDescriptor.MODULE_VERSION) | 128);
        }

        int bytesWrittenToCurrentBuffer() {
            return this.limitMinusOne - this.pos;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.allocatedBuffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                AllocatedBuffer allocatedBuffer = this.allocatedBuffer;
                allocatedBuffer.position((this.pos - allocatedBuffer.arrayOffset()) + 1);
                this.allocatedBuffer = null;
                this.pos = 0;
                this.limitMinusOne = 0;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void requireSpace(int i8) {
            if (spaceLeft() < i8) {
                nextBuffer(i8);
            }
        }

        int spaceLeft() {
            return this.pos - this.offsetMinusOne;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b9) {
            byte[] bArr = this.buffer;
            int i8 = this.pos;
            this.pos = i8 - 1;
            bArr[i8] = b9;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBool(int i8, boolean z8) throws IOException {
            requireSpace(6);
            write(z8 ? (byte) 1 : (byte) 0);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBytes(int i8, ByteString byteString) throws IOException {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i8, 2);
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeEndGroup(int i8) {
            writeTag(i8, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed32(int i8, int i9) throws IOException {
            requireSpace(9);
            writeFixed32(i9);
            writeTag(i8, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed64(int i8, long j8) throws IOException {
            requireSpace(13);
            writeFixed64(j8);
            writeTag(i8, 1);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        @Deprecated
        public void writeGroup(int i8, Object obj) throws IOException {
            writeTag(i8, 4);
            Protobuf.getInstance().writeTo(obj, this);
            writeTag(i8, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeInt32(int i8, int i9) throws IOException {
            requireSpace(15);
            writeInt32(i9);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i8, int i9) {
            if (spaceLeft() < i9) {
                this.totalDoneBytes += i9;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i8, i9));
                nextBuffer();
            } else {
                int i10 = this.pos - i9;
                this.pos = i10;
                System.arraycopy(bArr, i8, this.buffer, i10 + 1, i9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i8, Object obj) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i8, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt32(int i8, int i9) throws IOException {
            requireSpace(10);
            writeSInt32(i9);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt64(int i8, long j8) throws IOException {
            requireSpace(15);
            writeSInt64(j8);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeStartGroup(int i8) {
            writeTag(i8, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeString(int i8, String str) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i8, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeTag(int i8, int i9) {
            writeVarint32(WireFormat.makeTag(i8, i9));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt32(int i8, int i9) throws IOException {
            requireSpace(10);
            writeVarint32(i9);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt64(int i8, long j8) throws IOException {
            requireSpace(15);
            writeVarint64(j8);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeVarint32(int i8) {
            if ((i8 & (-128)) == 0) {
                writeVarint32OneByte(i8);
                return;
            }
            if ((i8 & (-16384)) == 0) {
                writeVarint32TwoBytes(i8);
                return;
            }
            if (((-2097152) & i8) == 0) {
                writeVarint32ThreeBytes(i8);
            } else if (((-268435456) & i8) == 0) {
                writeVarint32FourBytes(i8);
            } else {
                writeVarint32FiveBytes(i8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeVarint64(long j8) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j8)) {
                case 1:
                    writeVarint64OneByte(j8);
                    return;
                case 2:
                    writeVarint64TwoBytes(j8);
                    return;
                case 3:
                    writeVarint64ThreeBytes(j8);
                    return;
                case 4:
                    writeVarint64FourBytes(j8);
                    return;
                case 5:
                    writeVarint64FiveBytes(j8);
                    return;
                case 6:
                    writeVarint64SixBytes(j8);
                    return;
                case 7:
                    writeVarint64SevenBytes(j8);
                    return;
                case 8:
                    writeVarint64EightBytes(j8);
                    return;
                case 9:
                    writeVarint64NineBytes(j8);
                    return;
                case 10:
                    writeVarint64TenBytes(j8);
                    return;
                default:
                    return;
            }
        }

        private void nextBuffer(int i8) {
            nextBuffer(newHeapBuffer(i8));
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i8, int i9) {
            if (spaceLeft() < i9) {
                nextBuffer(i9);
            }
            int i10 = this.pos - i9;
            this.pos = i10;
            System.arraycopy(bArr, i8, this.buffer, i10 + 1, i9);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasArray()) {
                finishCurrentBuffer();
                this.buffers.addFirst(allocatedBuffer);
                this.allocatedBuffer = allocatedBuffer;
                this.buffer = allocatedBuffer.array();
                int arrayOffset = allocatedBuffer.arrayOffset();
                this.limit = allocatedBuffer.limit() + arrayOffset;
                int position = arrayOffset + allocatedBuffer.position();
                this.offset = position;
                this.offsetMinusOne = position - 1;
                int i8 = this.limit - 1;
                this.limitMinusOne = i8;
                this.pos = i8;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeBool(boolean z8) {
            write(z8 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeFixed32(int i8) {
            byte[] bArr = this.buffer;
            int i9 = this.pos;
            int i10 = i9 - 1;
            this.pos = i10;
            bArr[i9] = (byte) ((i8 >> 24) & 255);
            int i11 = i9 - 2;
            this.pos = i11;
            bArr[i10] = (byte) ((i8 >> 16) & 255);
            int i12 = i9 - 3;
            this.pos = i12;
            bArr[i11] = (byte) ((i8 >> 8) & 255);
            this.pos = i9 - 4;
            bArr[i12] = (byte) (i8 & 255);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeFixed64(long j8) {
            byte[] bArr = this.buffer;
            int i8 = this.pos;
            int i9 = i8 - 1;
            this.pos = i9;
            bArr[i8] = (byte) (((int) (j8 >> 56)) & 255);
            int i10 = i8 - 2;
            this.pos = i10;
            bArr[i9] = (byte) (((int) (j8 >> 48)) & 255);
            int i11 = i8 - 3;
            this.pos = i11;
            bArr[i10] = (byte) (((int) (j8 >> 40)) & 255);
            int i12 = i8 - 4;
            this.pos = i12;
            bArr[i11] = (byte) (((int) (j8 >> 32)) & 255);
            int i13 = i8 - 5;
            this.pos = i13;
            bArr[i12] = (byte) (((int) (j8 >> 24)) & 255);
            int i14 = i8 - 6;
            this.pos = i14;
            bArr[i13] = (byte) (((int) (j8 >> 16)) & 255);
            int i15 = i8 - 7;
            this.pos = i15;
            bArr[i14] = (byte) (((int) (j8 >> 8)) & 255);
            this.pos = i8 - 8;
            bArr[i15] = (byte) (((int) j8) & 255);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int i8, Object obj, Schema schema) throws IOException {
            writeTag(i8, 4);
            schema.writeTo(obj, this);
            writeTag(i8, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeInt32(int i8) {
            if (i8 >= 0) {
                writeVarint32(i8);
            } else {
                writeVarint64(i8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeSInt32(int i8) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i8));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeSInt64(long j8) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j8));
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (spaceLeft() < remaining) {
                nextBuffer(remaining);
            }
            int i8 = this.pos - remaining;
            this.pos = i8;
            byteBuffer.get(this.buffer, i8 + 1, remaining);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (spaceLeft() < remaining) {
                this.totalDoneBytes += remaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            }
            int i8 = this.pos - remaining;
            this.pos = i8;
            byteBuffer.get(this.buffer, i8 + 1, remaining);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i8, Object obj, Schema schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i8, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeString(String str) {
            int i8;
            int i9;
            int i10;
            char charAt;
            requireSpace(str.length());
            int length = str.length() - 1;
            this.pos -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.buffer[this.pos + length] = (byte) charAt;
                length--;
            }
            if (length == -1) {
                this.pos--;
                return;
            }
            this.pos += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128 && (i10 = this.pos) > this.offsetMinusOne) {
                    byte[] bArr = this.buffer;
                    this.pos = i10 - 1;
                    bArr[i10] = (byte) charAt2;
                } else if (charAt2 < 2048 && (i9 = this.pos) > this.offset) {
                    byte[] bArr2 = this.buffer;
                    int i11 = i9 - 1;
                    this.pos = i11;
                    bArr2[i9] = (byte) ((charAt2 & '?') | 128);
                    this.pos = i9 - 2;
                    bArr2[i11] = (byte) ((charAt2 >>> 6) | 960);
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i8 = this.pos) > this.offset + 1) {
                    byte[] bArr3 = this.buffer;
                    int i12 = i8 - 1;
                    this.pos = i12;
                    bArr3[i8] = (byte) ((charAt2 & '?') | 128);
                    int i13 = i8 - 2;
                    this.pos = i13;
                    bArr3[i12] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    this.pos = i8 - 3;
                    bArr3[i13] = (byte) ((charAt2 >>> '\f') | 480);
                } else {
                    if (this.pos > this.offset + 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                byte[] bArr4 = this.buffer;
                                int i14 = this.pos;
                                int i15 = i14 - 1;
                                this.pos = i15;
                                bArr4[i14] = (byte) ((codePoint & 63) | 128);
                                int i16 = i14 - 2;
                                this.pos = i16;
                                bArr4[i15] = (byte) (((codePoint >>> 6) & 63) | 128);
                                int i17 = i14 - 3;
                                this.pos = i17;
                                bArr4[i16] = (byte) (((codePoint >>> 12) & 63) | 128);
                                this.pos = i14 - 4;
                                bArr4[i17] = (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    requireSpace(length);
                    length++;
                }
                length--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class UnsafeDirectWriter extends BinaryWriter {
        private ByteBuffer buffer;
        private long bufferOffset;
        private long limitMinusOne;
        private long pos;

        UnsafeDirectWriter(BufferAllocator bufferAllocator, int i8) {
            super(bufferAllocator, i8, null);
            nextBuffer();
        }

        static /* synthetic */ boolean access$000() {
            return isSupported();
        }

        private int bufferPos() {
            return (int) (this.pos - this.bufferOffset);
        }

        private int bytesWrittenToCurrentBuffer() {
            return (int) (this.limitMinusOne - this.pos);
        }

        private static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void nextBuffer() {
            nextBuffer(newDirectBuffer());
        }

        private int spaceLeft() {
            return bufferPos() + 1;
        }

        private void writeVarint32FiveBytes(int i8) {
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(j8, (byte) (i8 >>> 28));
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(j9, (byte) (((i8 >>> 21) & ModuleDescriptor.MODULE_VERSION) | 128));
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(j10, (byte) (((i8 >>> 14) & ModuleDescriptor.MODULE_VERSION) | 128));
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (((i8 >>> 7) & ModuleDescriptor.MODULE_VERSION) | 128));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) ((i8 & ModuleDescriptor.MODULE_VERSION) | 128));
        }

        private void writeVarint32FourBytes(int i8) {
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(j8, (byte) (i8 >>> 21));
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(j9, (byte) (((i8 >>> 14) & ModuleDescriptor.MODULE_VERSION) | 128));
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(j10, (byte) (((i8 >>> 7) & ModuleDescriptor.MODULE_VERSION) | 128));
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) ((i8 & ModuleDescriptor.MODULE_VERSION) | 128));
        }

        private void writeVarint32OneByte(int i8) {
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(j8, (byte) i8);
        }

        private void writeVarint32ThreeBytes(int i8) {
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(j8, (byte) (i8 >>> 14));
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(j9, (byte) (((i8 >>> 7) & ModuleDescriptor.MODULE_VERSION) | 128));
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(j10, (byte) ((i8 & ModuleDescriptor.MODULE_VERSION) | 128));
        }

        private void writeVarint32TwoBytes(int i8) {
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(j8, (byte) (i8 >>> 7));
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(j9, (byte) ((i8 & ModuleDescriptor.MODULE_VERSION) | 128));
        }

        private void writeVarint64EightBytes(long j8) {
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(j9, (byte) (j8 >>> 49));
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(j10, (byte) (((j8 >>> 42) & 127) | 128));
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (((j8 >>> 35) & 127) | 128));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((j8 >>> 28) & 127) | 128));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((j8 >>> 21) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((j8 >>> 14) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j8 >>> 7) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) ((j8 & 127) | 128));
        }

        private void writeVarint64FiveBytes(long j8) {
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(j9, (byte) (j8 >>> 28));
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(j10, (byte) (((j8 >>> 21) & 127) | 128));
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (((j8 >>> 14) & 127) | 128));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((j8 >>> 7) & 127) | 128));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) ((j8 & 127) | 128));
        }

        private void writeVarint64FourBytes(long j8) {
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(j9, (byte) (j8 >>> 21));
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(j10, (byte) (((j8 >>> 14) & 127) | 128));
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (((j8 >>> 7) & 127) | 128));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) ((j8 & 127) | 128));
        }

        private void writeVarint64NineBytes(long j8) {
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(j9, (byte) (j8 >>> 56));
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(j10, (byte) (((j8 >>> 49) & 127) | 128));
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (((j8 >>> 42) & 127) | 128));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((j8 >>> 35) & 127) | 128));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((j8 >>> 28) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((j8 >>> 21) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j8 >>> 14) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((j8 >>> 7) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) ((j8 & 127) | 128));
        }

        private void writeVarint64OneByte(long j8) {
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(j9, (byte) j8);
        }

        private void writeVarint64SevenBytes(long j8) {
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(j9, (byte) (j8 >>> 42));
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(j10, (byte) (((j8 >>> 35) & 127) | 128));
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (((j8 >>> 28) & 127) | 128));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((j8 >>> 21) & 127) | 128));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((j8 >>> 14) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((j8 >>> 7) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) ((j8 & 127) | 128));
        }

        private void writeVarint64SixBytes(long j8) {
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(j9, (byte) (j8 >>> 35));
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(j10, (byte) (((j8 >>> 28) & 127) | 128));
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (((j8 >>> 21) & 127) | 128));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((j8 >>> 14) & 127) | 128));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((j8 >>> 7) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) ((j8 & 127) | 128));
        }

        private void writeVarint64TenBytes(long j8) {
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(j9, (byte) (j8 >>> 63));
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(j10, (byte) (((j8 >>> 56) & 127) | 128));
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (((j8 >>> 49) & 127) | 128));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((j8 >>> 42) & 127) | 128));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((j8 >>> 35) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((j8 >>> 28) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j8 >>> 21) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((j8 >>> 14) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((j8 >>> 7) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) ((j8 & 127) | 128));
        }

        private void writeVarint64ThreeBytes(long j8) {
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(j9, (byte) (((int) j8) >>> 14));
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(j10, (byte) (((j8 >>> 7) & 127) | 128));
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) ((j8 & 127) | 128));
        }

        private void writeVarint64TwoBytes(long j8) {
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(j9, (byte) (j8 >>> 7));
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(j10, (byte) ((((int) j8) & ModuleDescriptor.MODULE_VERSION) | 128));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.buffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                Java8Compatibility.position(this.buffer, bufferPos() + 1);
                this.buffer = null;
                this.pos = 0L;
                this.limitMinusOne = 0L;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void requireSpace(int i8) {
            if (spaceLeft() < i8) {
                nextBuffer(i8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b9) {
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(j8, b9);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBool(int i8, boolean z8) {
            requireSpace(6);
            write(z8 ? (byte) 1 : (byte) 0);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBytes(int i8, ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i8, 2);
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        @Deprecated
        public void writeEndGroup(int i8) {
            writeTag(i8, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed32(int i8, int i9) {
            requireSpace(9);
            writeFixed32(i9);
            writeTag(i8, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed64(int i8, long j8) {
            requireSpace(13);
            writeFixed64(j8);
            writeTag(i8, 1);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int i8, Object obj) throws IOException {
            writeTag(i8, 4);
            Protobuf.getInstance().writeTo(obj, this);
            writeTag(i8, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeInt32(int i8, int i9) {
            requireSpace(15);
            writeInt32(i9);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i8, int i9) {
            if (spaceLeft() < i9) {
                this.totalDoneBytes += i9;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i8, i9));
                nextBuffer();
            } else {
                this.pos -= i9;
                Java8Compatibility.position(this.buffer, bufferPos() + 1);
                this.buffer.put(bArr, i8, i9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i8, Object obj) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i8, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt32(int i8, int i9) {
            requireSpace(10);
            writeSInt32(i9);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt64(int i8, long j8) {
            requireSpace(15);
            writeSInt64(j8);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        @Deprecated
        public void writeStartGroup(int i8) {
            writeTag(i8, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeString(int i8, String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i8, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeTag(int i8, int i9) {
            writeVarint32(WireFormat.makeTag(i8, i9));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt32(int i8, int i9) {
            requireSpace(10);
            writeVarint32(i9);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt64(int i8, long j8) {
            requireSpace(15);
            writeVarint64(j8);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeVarint32(int i8) {
            if ((i8 & (-128)) == 0) {
                writeVarint32OneByte(i8);
                return;
            }
            if ((i8 & (-16384)) == 0) {
                writeVarint32TwoBytes(i8);
                return;
            }
            if (((-2097152) & i8) == 0) {
                writeVarint32ThreeBytes(i8);
            } else if (((-268435456) & i8) == 0) {
                writeVarint32FourBytes(i8);
            } else {
                writeVarint32FiveBytes(i8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeVarint64(long j8) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j8)) {
                case 1:
                    writeVarint64OneByte(j8);
                    return;
                case 2:
                    writeVarint64TwoBytes(j8);
                    return;
                case 3:
                    writeVarint64ThreeBytes(j8);
                    return;
                case 4:
                    writeVarint64FourBytes(j8);
                    return;
                case 5:
                    writeVarint64FiveBytes(j8);
                    return;
                case 6:
                    writeVarint64SixBytes(j8);
                    return;
                case 7:
                    writeVarint64SevenBytes(j8);
                    return;
                case 8:
                    writeVarint64EightBytes(j8);
                    return;
                case 9:
                    writeVarint64NineBytes(j8);
                    return;
                case 10:
                    writeVarint64TenBytes(j8);
                    return;
                default:
                    return;
            }
        }

        private void nextBuffer(int i8) {
            nextBuffer(newDirectBuffer(i8));
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i8, int i9) {
            if (spaceLeft() < i9) {
                nextBuffer(i9);
            }
            this.pos -= i9;
            Java8Compatibility.position(this.buffer, bufferPos() + 1);
            this.buffer.put(bArr, i8, i9);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasNioBuffer()) {
                ByteBuffer nioBuffer = allocatedBuffer.nioBuffer();
                if (nioBuffer.isDirect()) {
                    finishCurrentBuffer();
                    this.buffers.addFirst(allocatedBuffer);
                    this.buffer = nioBuffer;
                    Java8Compatibility.limit(nioBuffer, nioBuffer.capacity());
                    Java8Compatibility.position(this.buffer, 0);
                    long addressOffset = UnsafeUtil.addressOffset(this.buffer);
                    this.bufferOffset = addressOffset;
                    long limit = addressOffset + (this.buffer.limit() - 1);
                    this.limitMinusOne = limit;
                    this.pos = limit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeBool(boolean z8) {
            write(z8 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeFixed32(int i8) {
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(j8, (byte) ((i8 >> 24) & 255));
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(j9, (byte) ((i8 >> 16) & 255));
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(j10, (byte) ((i8 >> 8) & 255));
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (i8 & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeFixed64(long j8) {
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(j9, (byte) (((int) (j8 >> 56)) & 255));
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(j10, (byte) (((int) (j8 >> 48)) & 255));
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(j11, (byte) (((int) (j8 >> 40)) & 255));
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (((int) (j8 >> 32)) & 255));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((int) (j8 >> 24)) & 255));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((int) (j8 >> 16)) & 255));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((int) (j8 >> 8)) & 255));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((int) j8) & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int i8, Object obj, Schema schema) throws IOException {
            writeTag(i8, 4);
            schema.writeTo(obj, this);
            writeTag(i8, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeInt32(int i8) {
            if (i8 >= 0) {
                writeVarint32(i8);
            } else {
                writeVarint64(i8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeSInt32(int i8) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i8));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeSInt64(long j8) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j8));
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (spaceLeft() < remaining) {
                nextBuffer(remaining);
            }
            this.pos -= remaining;
            Java8Compatibility.position(this.buffer, bufferPos() + 1);
            this.buffer.put(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i8, Object obj, Schema schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i8, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeString(String str) {
            char charAt;
            requireSpace(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (charAt = str.charAt(length)) >= 128) {
                    break;
                }
                long j8 = this.pos;
                this.pos = j8 - 1;
                UnsafeUtil.putByte(j8, (byte) charAt);
            }
            if (length == -1) {
                return;
            }
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128) {
                    long j9 = this.pos;
                    if (j9 >= this.bufferOffset) {
                        this.pos = j9 - 1;
                        UnsafeUtil.putByte(j9, (byte) charAt2);
                        length--;
                    }
                }
                if (charAt2 < 2048) {
                    long j10 = this.pos;
                    if (j10 > this.bufferOffset) {
                        this.pos = j10 - 1;
                        UnsafeUtil.putByte(j10, (byte) ((charAt2 & '?') | 128));
                        long j11 = this.pos;
                        this.pos = j11 - 1;
                        UnsafeUtil.putByte(j11, (byte) ((charAt2 >>> 6) | 960));
                        length--;
                    }
                }
                if (charAt2 < 55296 || 57343 < charAt2) {
                    long j12 = this.pos;
                    if (j12 > this.bufferOffset + 1) {
                        this.pos = j12 - 1;
                        UnsafeUtil.putByte(j12, (byte) ((charAt2 & '?') | 128));
                        long j13 = this.pos;
                        this.pos = j13 - 1;
                        UnsafeUtil.putByte(j13, (byte) (((charAt2 >>> 6) & 63) | 128));
                        long j14 = this.pos;
                        this.pos = j14 - 1;
                        UnsafeUtil.putByte(j14, (byte) ((charAt2 >>> '\f') | 480));
                        length--;
                    }
                }
                if (this.pos > this.bufferOffset + 2) {
                    if (length != 0) {
                        char charAt3 = str.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            long j15 = this.pos;
                            this.pos = j15 - 1;
                            UnsafeUtil.putByte(j15, (byte) ((codePoint & 63) | 128));
                            long j16 = this.pos;
                            this.pos = j16 - 1;
                            UnsafeUtil.putByte(j16, (byte) (((codePoint >>> 6) & 63) | 128));
                            long j17 = this.pos;
                            this.pos = j17 - 1;
                            UnsafeUtil.putByte(j17, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j18 = this.pos;
                            this.pos = j18 - 1;
                            UnsafeUtil.putByte(j18, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                        }
                    }
                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                }
                requireSpace(length);
                length++;
                length--;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (spaceLeft() < remaining) {
                this.totalDoneBytes += remaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            } else {
                this.pos -= remaining;
                Java8Compatibility.position(this.buffer, bufferPos() + 1);
                this.buffer.put(byteBuffer);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class UnsafeHeapWriter extends BinaryWriter {
        private AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private long limit;
        private long limitMinusOne;
        private long offset;
        private long offsetMinusOne;
        private long pos;

        UnsafeHeapWriter(BufferAllocator bufferAllocator, int i8) {
            super(bufferAllocator, i8, null);
            nextBuffer();
        }

        private int arrayPos() {
            return (int) this.pos;
        }

        static boolean isSupported() {
            return UnsafeUtil.hasUnsafeArrayOperations();
        }

        private void nextBuffer() {
            nextBuffer(newHeapBuffer());
        }

        private void writeVarint32FiveBytes(int i8) {
            byte[] bArr = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(bArr, j8, (byte) (i8 >>> 28));
            byte[] bArr2 = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(bArr2, j9, (byte) (((i8 >>> 21) & ModuleDescriptor.MODULE_VERSION) | 128));
            byte[] bArr3 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(bArr3, j10, (byte) (((i8 >>> 14) & ModuleDescriptor.MODULE_VERSION) | 128));
            byte[] bArr4 = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr4, j11, (byte) (((i8 >>> 7) & ModuleDescriptor.MODULE_VERSION) | 128));
            byte[] bArr5 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr5, j12, (byte) ((i8 & ModuleDescriptor.MODULE_VERSION) | 128));
        }

        private void writeVarint32FourBytes(int i8) {
            byte[] bArr = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(bArr, j8, (byte) (i8 >>> 21));
            byte[] bArr2 = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(bArr2, j9, (byte) (((i8 >>> 14) & ModuleDescriptor.MODULE_VERSION) | 128));
            byte[] bArr3 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(bArr3, j10, (byte) (((i8 >>> 7) & ModuleDescriptor.MODULE_VERSION) | 128));
            byte[] bArr4 = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr4, j11, (byte) ((i8 & ModuleDescriptor.MODULE_VERSION) | 128));
        }

        private void writeVarint32OneByte(int i8) {
            byte[] bArr = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(bArr, j8, (byte) i8);
        }

        private void writeVarint32ThreeBytes(int i8) {
            byte[] bArr = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(bArr, j8, (byte) (i8 >>> 14));
            byte[] bArr2 = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(bArr2, j9, (byte) (((i8 >>> 7) & ModuleDescriptor.MODULE_VERSION) | 128));
            byte[] bArr3 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(bArr3, j10, (byte) ((i8 & ModuleDescriptor.MODULE_VERSION) | 128));
        }

        private void writeVarint32TwoBytes(int i8) {
            byte[] bArr = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(bArr, j8, (byte) (i8 >>> 7));
            byte[] bArr2 = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(bArr2, j9, (byte) ((i8 & ModuleDescriptor.MODULE_VERSION) | 128));
        }

        private void writeVarint64EightBytes(long j8) {
            byte[] bArr = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(bArr, j9, (byte) (j8 >>> 49));
            byte[] bArr2 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(bArr2, j10, (byte) (((j8 >>> 42) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr3, j11, (byte) (((j8 >>> 35) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr4, j12, (byte) (((j8 >>> 28) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr5, j13, (byte) (((j8 >>> 21) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr6, j14, (byte) (((j8 >>> 14) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr7, j15, (byte) (((j8 >>> 7) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr8, j16, (byte) ((j8 & 127) | 128));
        }

        private void writeVarint64FiveBytes(long j8) {
            byte[] bArr = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(bArr, j9, (byte) (j8 >>> 28));
            byte[] bArr2 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(bArr2, j10, (byte) (((j8 >>> 21) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr3, j11, (byte) (((j8 >>> 14) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr4, j12, (byte) (((j8 >>> 7) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr5, j13, (byte) ((j8 & 127) | 128));
        }

        private void writeVarint64FourBytes(long j8) {
            byte[] bArr = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(bArr, j9, (byte) (j8 >>> 21));
            byte[] bArr2 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(bArr2, j10, (byte) (((j8 >>> 14) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr3, j11, (byte) (((j8 >>> 7) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr4, j12, (byte) ((j8 & 127) | 128));
        }

        private void writeVarint64NineBytes(long j8) {
            byte[] bArr = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(bArr, j9, (byte) (j8 >>> 56));
            byte[] bArr2 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(bArr2, j10, (byte) (((j8 >>> 49) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr3, j11, (byte) (((j8 >>> 42) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr4, j12, (byte) (((j8 >>> 35) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr5, j13, (byte) (((j8 >>> 28) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr6, j14, (byte) (((j8 >>> 21) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr7, j15, (byte) (((j8 >>> 14) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr8, j16, (byte) (((j8 >>> 7) & 127) | 128));
            byte[] bArr9 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr9, j17, (byte) ((j8 & 127) | 128));
        }

        private void writeVarint64OneByte(long j8) {
            byte[] bArr = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(bArr, j9, (byte) j8);
        }

        private void writeVarint64SevenBytes(long j8) {
            byte[] bArr = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(bArr, j9, (byte) (j8 >>> 42));
            byte[] bArr2 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(bArr2, j10, (byte) (((j8 >>> 35) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr3, j11, (byte) (((j8 >>> 28) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr4, j12, (byte) (((j8 >>> 21) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr5, j13, (byte) (((j8 >>> 14) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr6, j14, (byte) (((j8 >>> 7) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr7, j15, (byte) ((j8 & 127) | 128));
        }

        private void writeVarint64SixBytes(long j8) {
            byte[] bArr = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(bArr, j9, (byte) (j8 >>> 35));
            byte[] bArr2 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(bArr2, j10, (byte) (((j8 >>> 28) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr3, j11, (byte) (((j8 >>> 21) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr4, j12, (byte) (((j8 >>> 14) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr5, j13, (byte) (((j8 >>> 7) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr6, j14, (byte) ((j8 & 127) | 128));
        }

        private void writeVarint64TenBytes(long j8) {
            byte[] bArr = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(bArr, j9, (byte) (j8 >>> 63));
            byte[] bArr2 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(bArr2, j10, (byte) (((j8 >>> 56) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr3, j11, (byte) (((j8 >>> 49) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr4, j12, (byte) (((j8 >>> 42) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr5, j13, (byte) (((j8 >>> 35) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr6, j14, (byte) (((j8 >>> 28) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr7, j15, (byte) (((j8 >>> 21) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr8, j16, (byte) (((j8 >>> 14) & 127) | 128));
            byte[] bArr9 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr9, j17, (byte) (((j8 >>> 7) & 127) | 128));
            byte[] bArr10 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr10, j18, (byte) ((j8 & 127) | 128));
        }

        private void writeVarint64ThreeBytes(long j8) {
            byte[] bArr = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(bArr, j9, (byte) (((int) j8) >>> 14));
            byte[] bArr2 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(bArr2, j10, (byte) (((j8 >>> 7) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr3, j11, (byte) ((j8 & 127) | 128));
        }

        private void writeVarint64TwoBytes(long j8) {
            byte[] bArr = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(bArr, j9, (byte) (j8 >>> 7));
            byte[] bArr2 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(bArr2, j10, (byte) ((((int) j8) & ModuleDescriptor.MODULE_VERSION) | 128));
        }

        int bytesWrittenToCurrentBuffer() {
            return (int) (this.limitMinusOne - this.pos);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void finishCurrentBuffer() {
            if (this.allocatedBuffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                this.allocatedBuffer.position((arrayPos() - this.allocatedBuffer.arrayOffset()) + 1);
                this.allocatedBuffer = null;
                this.pos = 0L;
                this.limitMinusOne = 0L;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void requireSpace(int i8) {
            if (spaceLeft() < i8) {
                nextBuffer(i8);
            }
        }

        int spaceLeft() {
            return (int) (this.pos - this.offsetMinusOne);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte b9) {
            byte[] bArr = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(bArr, j8, b9);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBool(int i8, boolean z8) {
            requireSpace(6);
            write(z8 ? (byte) 1 : (byte) 0);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeBytes(int i8, ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i8, 2);
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeEndGroup(int i8) {
            writeTag(i8, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed32(int i8, int i9) {
            requireSpace(9);
            writeFixed32(i9);
            writeTag(i8, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeFixed64(int i8, long j8) {
            requireSpace(13);
            writeFixed64(j8);
            writeTag(i8, 1);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int i8, Object obj) throws IOException {
            writeTag(i8, 4);
            Protobuf.getInstance().writeTo(obj, this);
            writeTag(i8, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeInt32(int i8, int i9) {
            requireSpace(15);
            writeInt32(i9);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i8, int i9) {
            if (i8 >= 0 && i8 + i9 <= bArr.length) {
                if (spaceLeft() < i9) {
                    this.totalDoneBytes += i9;
                    this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i8, i9));
                    nextBuffer();
                    return;
                } else {
                    this.pos -= i9;
                    System.arraycopy(bArr, i8, this.buffer, arrayPos() + 1, i9);
                    return;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i8, Object obj) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i8, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt32(int i8, int i9) {
            requireSpace(10);
            writeSInt32(i9);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeSInt64(int i8, long j8) {
            requireSpace(15);
            writeSInt64(j8);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeStartGroup(int i8) {
            writeTag(i8, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeString(int i8, String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i8, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeTag(int i8, int i9) {
            writeVarint32(WireFormat.makeTag(i8, i9));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt32(int i8, int i9) {
            requireSpace(10);
            writeVarint32(i9);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeUInt64(int i8, long j8) {
            requireSpace(15);
            writeVarint64(j8);
            writeTag(i8, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeVarint32(int i8) {
            if ((i8 & (-128)) == 0) {
                writeVarint32OneByte(i8);
                return;
            }
            if ((i8 & (-16384)) == 0) {
                writeVarint32TwoBytes(i8);
                return;
            }
            if (((-2097152) & i8) == 0) {
                writeVarint32ThreeBytes(i8);
            } else if (((-268435456) & i8) == 0) {
                writeVarint32FourBytes(i8);
            } else {
                writeVarint32FiveBytes(i8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeVarint64(long j8) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j8)) {
                case 1:
                    writeVarint64OneByte(j8);
                    return;
                case 2:
                    writeVarint64TwoBytes(j8);
                    return;
                case 3:
                    writeVarint64ThreeBytes(j8);
                    return;
                case 4:
                    writeVarint64FourBytes(j8);
                    return;
                case 5:
                    writeVarint64FiveBytes(j8);
                    return;
                case 6:
                    writeVarint64SixBytes(j8);
                    return;
                case 7:
                    writeVarint64SevenBytes(j8);
                    return;
                case 8:
                    writeVarint64EightBytes(j8);
                    return;
                case 9:
                    writeVarint64NineBytes(j8);
                    return;
                case 10:
                    writeVarint64TenBytes(j8);
                    return;
                default:
                    return;
            }
        }

        private void nextBuffer(int i8) {
            nextBuffer(newHeapBuffer(i8));
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(byte[] bArr, int i8, int i9) {
            if (i8 >= 0 && i8 + i9 <= bArr.length) {
                requireSpace(i9);
                this.pos -= i9;
                System.arraycopy(bArr, i8, this.buffer, arrayPos() + 1, i9);
                return;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)));
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasArray()) {
                finishCurrentBuffer();
                this.buffers.addFirst(allocatedBuffer);
                this.allocatedBuffer = allocatedBuffer;
                this.buffer = allocatedBuffer.array();
                long arrayOffset = allocatedBuffer.arrayOffset();
                this.limit = allocatedBuffer.limit() + arrayOffset;
                long position = arrayOffset + allocatedBuffer.position();
                this.offset = position;
                this.offsetMinusOne = position - 1;
                long j8 = this.limit - 1;
                this.limitMinusOne = j8;
                this.pos = j8;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeBool(boolean z8) {
            write(z8 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeFixed32(int i8) {
            byte[] bArr = this.buffer;
            long j8 = this.pos;
            this.pos = j8 - 1;
            UnsafeUtil.putByte(bArr, j8, (byte) ((i8 >> 24) & 255));
            byte[] bArr2 = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(bArr2, j9, (byte) ((i8 >> 16) & 255));
            byte[] bArr3 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(bArr3, j10, (byte) ((i8 >> 8) & 255));
            byte[] bArr4 = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr4, j11, (byte) (i8 & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeFixed64(long j8) {
            byte[] bArr = this.buffer;
            long j9 = this.pos;
            this.pos = j9 - 1;
            UnsafeUtil.putByte(bArr, j9, (byte) (((int) (j8 >> 56)) & 255));
            byte[] bArr2 = this.buffer;
            long j10 = this.pos;
            this.pos = j10 - 1;
            UnsafeUtil.putByte(bArr2, j10, (byte) (((int) (j8 >> 48)) & 255));
            byte[] bArr3 = this.buffer;
            long j11 = this.pos;
            this.pos = j11 - 1;
            UnsafeUtil.putByte(bArr3, j11, (byte) (((int) (j8 >> 40)) & 255));
            byte[] bArr4 = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr4, j12, (byte) (((int) (j8 >> 32)) & 255));
            byte[] bArr5 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr5, j13, (byte) (((int) (j8 >> 24)) & 255));
            byte[] bArr6 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr6, j14, (byte) (((int) (j8 >> 16)) & 255));
            byte[] bArr7 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr7, j15, (byte) (((int) (j8 >> 8)) & 255));
            byte[] bArr8 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr8, j16, (byte) (((int) j8) & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeGroup(int i8, Object obj, Schema schema) throws IOException {
            writeTag(i8, 4);
            schema.writeTo(obj, this);
            writeTag(i8, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeInt32(int i8) {
            if (i8 >= 0) {
                writeVarint32(i8);
            } else {
                writeVarint64(i8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeSInt32(int i8) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i8));
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeSInt64(long j8) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j8));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public void writeMessage(int i8, Object obj, Schema schema) throws IOException {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i8, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryWriter
        void writeString(String str) {
            char charAt;
            requireSpace(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length < 0 || (charAt = str.charAt(length)) >= 128) {
                    break;
                }
                byte[] bArr = this.buffer;
                long j8 = this.pos;
                this.pos = j8 - 1;
                UnsafeUtil.putByte(bArr, j8, (byte) charAt);
            }
            if (length == -1) {
                return;
            }
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128) {
                    long j9 = this.pos;
                    if (j9 > this.offsetMinusOne) {
                        byte[] bArr2 = this.buffer;
                        this.pos = j9 - 1;
                        UnsafeUtil.putByte(bArr2, j9, (byte) charAt2);
                        length--;
                    }
                }
                if (charAt2 < 2048) {
                    long j10 = this.pos;
                    if (j10 > this.offset) {
                        byte[] bArr3 = this.buffer;
                        this.pos = j10 - 1;
                        UnsafeUtil.putByte(bArr3, j10, (byte) ((charAt2 & '?') | 128));
                        byte[] bArr4 = this.buffer;
                        long j11 = this.pos;
                        this.pos = j11 - 1;
                        UnsafeUtil.putByte(bArr4, j11, (byte) ((charAt2 >>> 6) | 960));
                        length--;
                    }
                }
                if (charAt2 < 55296 || 57343 < charAt2) {
                    long j12 = this.pos;
                    if (j12 > this.offset + 1) {
                        byte[] bArr5 = this.buffer;
                        this.pos = j12 - 1;
                        UnsafeUtil.putByte(bArr5, j12, (byte) ((charAt2 & '?') | 128));
                        byte[] bArr6 = this.buffer;
                        long j13 = this.pos;
                        this.pos = j13 - 1;
                        UnsafeUtil.putByte(bArr6, j13, (byte) (((charAt2 >>> 6) & 63) | 128));
                        byte[] bArr7 = this.buffer;
                        long j14 = this.pos;
                        this.pos = j14 - 1;
                        UnsafeUtil.putByte(bArr7, j14, (byte) ((charAt2 >>> '\f') | 480));
                        length--;
                    }
                }
                if (this.pos > this.offset + 2) {
                    if (length != 0) {
                        char charAt3 = str.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            byte[] bArr8 = this.buffer;
                            long j15 = this.pos;
                            this.pos = j15 - 1;
                            UnsafeUtil.putByte(bArr8, j15, (byte) ((codePoint & 63) | 128));
                            byte[] bArr9 = this.buffer;
                            long j16 = this.pos;
                            this.pos = j16 - 1;
                            UnsafeUtil.putByte(bArr9, j16, (byte) (((codePoint >>> 6) & 63) | 128));
                            byte[] bArr10 = this.buffer;
                            long j17 = this.pos;
                            this.pos = j17 - 1;
                            UnsafeUtil.putByte(bArr10, j17, (byte) (((codePoint >>> 12) & 63) | 128));
                            byte[] bArr11 = this.buffer;
                            long j18 = this.pos;
                            this.pos = j18 - 1;
                            UnsafeUtil.putByte(bArr11, j18, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                        }
                    }
                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                }
                requireSpace(length);
                length++;
                length--;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            requireSpace(remaining);
            this.pos -= remaining;
            byteBuffer.get(this.buffer, arrayPos() + 1, remaining);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (spaceLeft() < remaining) {
                this.totalDoneBytes += remaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            }
            this.pos -= remaining;
            byteBuffer.get(this.buffer, arrayPos() + 1, remaining);
        }
    }

    /* synthetic */ BinaryWriter(BufferAllocator bufferAllocator, int i8, AnonymousClass1 anonymousClass1) {
        this(bufferAllocator, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte computeUInt64SizeNoTag(long j8) {
        byte b9;
        if (((-128) & j8) == 0) {
            return (byte) 1;
        }
        if (j8 < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & j8) != 0) {
            b9 = (byte) 6;
            j8 >>>= 28;
        } else {
            b9 = 2;
        }
        if (((-2097152) & j8) != 0) {
            b9 = (byte) (b9 + 2);
            j8 >>>= 14;
        }
        return (j8 & (-16384)) != 0 ? (byte) (b9 + 1) : b9;
    }

    static boolean isUnsafeDirectSupported() {
        return UnsafeDirectWriter.access$000();
    }

    static boolean isUnsafeHeapSupported() {
        return UnsafeHeapWriter.isSupported();
    }

    public static BinaryWriter newDirectInstance(BufferAllocator bufferAllocator) {
        return newDirectInstance(bufferAllocator, 4096);
    }

    public static BinaryWriter newHeapInstance(BufferAllocator bufferAllocator) {
        return newHeapInstance(bufferAllocator, 4096);
    }

    static BinaryWriter newSafeDirectInstance(BufferAllocator bufferAllocator, int i8) {
        return new SafeDirectWriter(bufferAllocator, i8);
    }

    static BinaryWriter newSafeHeapInstance(BufferAllocator bufferAllocator, int i8) {
        return new SafeHeapWriter(bufferAllocator, i8);
    }

    static BinaryWriter newUnsafeDirectInstance(BufferAllocator bufferAllocator, int i8) {
        if (isUnsafeDirectSupported()) {
            return new UnsafeDirectWriter(bufferAllocator, i8);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    static BinaryWriter newUnsafeHeapInstance(BufferAllocator bufferAllocator, int i8) {
        if (isUnsafeHeapSupported()) {
            return new UnsafeHeapWriter(bufferAllocator, i8);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    private void writeBoolList_Internal(int i8, List<Boolean> list, boolean z8) throws IOException {
        if (z8) {
            requireSpace(list.size() + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeBool(list.get(size).booleanValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i8, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeBool(i8, list.get(size2).booleanValue());
        }
    }

    private void writeDoubleList_Internal(int i8, List<Double> list, boolean z8) throws IOException {
        if (z8) {
            requireSpace((list.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed64(Double.doubleToRawLongBits(list.get(size).doubleValue()));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i8, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeDouble(i8, list.get(size2).doubleValue());
        }
    }

    private void writeFixed32List_Internal(int i8, List<Integer> list, boolean z8) throws IOException {
        if (z8) {
            requireSpace((list.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed32(list.get(size).intValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i8, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed32(i8, list.get(size2).intValue());
        }
    }

    private void writeFixed64List_Internal(int i8, List<Long> list, boolean z8) throws IOException {
        if (z8) {
            requireSpace((list.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed64(list.get(size).longValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i8, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed64(i8, list.get(size2).longValue());
        }
    }

    private void writeFloatList_Internal(int i8, List<Float> list, boolean z8) throws IOException {
        if (z8) {
            requireSpace((list.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed32(Float.floatToRawIntBits(list.get(size).floatValue()));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i8, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFloat(i8, list.get(size2).floatValue());
        }
    }

    private void writeInt32List_Internal(int i8, List<Integer> list, boolean z8) throws IOException {
        if (z8) {
            requireSpace((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeInt32(list.get(size).intValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i8, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeInt32(i8, list.get(size2).intValue());
        }
    }

    private void writeLazyString(int i8, Object obj) throws IOException {
        if (obj instanceof String) {
            writeString(i8, (String) obj);
        } else {
            writeBytes(i8, (ByteString) obj);
        }
    }

    static final void writeMapEntryField(Writer writer, int i8, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                writer.writeBool(i8, ((Boolean) obj).booleanValue());
                return;
            case 2:
                writer.writeFixed32(i8, ((Integer) obj).intValue());
                return;
            case 3:
                writer.writeFixed64(i8, ((Long) obj).longValue());
                return;
            case 4:
                writer.writeInt32(i8, ((Integer) obj).intValue());
                return;
            case 5:
                writer.writeInt64(i8, ((Long) obj).longValue());
                return;
            case 6:
                writer.writeSFixed32(i8, ((Integer) obj).intValue());
                return;
            case 7:
                writer.writeSFixed64(i8, ((Long) obj).longValue());
                return;
            case 8:
                writer.writeSInt32(i8, ((Integer) obj).intValue());
                return;
            case 9:
                writer.writeSInt64(i8, ((Long) obj).longValue());
                return;
            case 10:
                writer.writeString(i8, (String) obj);
                return;
            case 11:
                writer.writeUInt32(i8, ((Integer) obj).intValue());
                return;
            case 12:
                writer.writeUInt64(i8, ((Long) obj).longValue());
                return;
            case 13:
                writer.writeFloat(i8, ((Float) obj).floatValue());
                return;
            case 14:
                writer.writeDouble(i8, ((Double) obj).doubleValue());
                return;
            case 15:
                writer.writeMessage(i8, obj);
                return;
            case 16:
                writer.writeBytes(i8, (ByteString) obj);
                return;
            case 17:
                if (obj instanceof Internal.EnumLite) {
                    writer.writeEnum(i8, ((Internal.EnumLite) obj).getNumber());
                    return;
                } else {
                    if (obj instanceof Integer) {
                        writer.writeEnum(i8, ((Integer) obj).intValue());
                        return;
                    }
                    throw new IllegalArgumentException("Unexpected type for enum in map.");
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + fieldType);
        }
    }

    private void writeSInt32List_Internal(int i8, List<Integer> list, boolean z8) throws IOException {
        if (z8) {
            requireSpace((list.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt32(list.get(size).intValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i8, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt32(i8, list.get(size2).intValue());
        }
    }

    private void writeSInt64List_Internal(int i8, List<Long> list, boolean z8) throws IOException {
        if (z8) {
            requireSpace((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt64(list.get(size).longValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i8, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt64(i8, list.get(size2).longValue());
        }
    }

    private void writeUInt32List_Internal(int i8, List<Integer> list, boolean z8) throws IOException {
        if (z8) {
            requireSpace((list.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeVarint32(list.get(size).intValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i8, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeUInt32(i8, list.get(size2).intValue());
        }
    }

    private void writeUInt64List_Internal(int i8, List<Long> list, boolean z8) throws IOException {
        if (z8) {
            requireSpace((list.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = list.size() - 1; size >= 0; size--) {
                writeVarint64(list.get(size).longValue());
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i8, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeUInt64(i8, list.get(size2).longValue());
        }
    }

    @CanIgnoreReturnValue
    public final Queue<AllocatedBuffer> complete() {
        finishCurrentBuffer();
        return this.buffers;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.DESCENDING;
    }

    abstract void finishCurrentBuffer();

    public abstract int getTotalBytesWritten();

    final AllocatedBuffer newDirectBuffer() {
        return this.alloc.allocateDirectBuffer(this.chunkSize);
    }

    final AllocatedBuffer newHeapBuffer() {
        return this.alloc.allocateHeapBuffer(this.chunkSize);
    }

    abstract void requireSpace(int i8);

    abstract void writeBool(boolean z8);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeBoolList(int i8, List<Boolean> list, boolean z8) throws IOException {
        if (list instanceof BooleanArrayList) {
            writeBoolList_Internal(i8, (BooleanArrayList) list, z8);
        } else {
            writeBoolList_Internal(i8, list, z8);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeBytesList(int i8, List<ByteString> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeBytes(i8, list.get(size));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeDouble(int i8, double d8) throws IOException {
        writeFixed64(i8, Double.doubleToRawLongBits(d8));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeDoubleList(int i8, List<Double> list, boolean z8) throws IOException {
        if (list instanceof DoubleArrayList) {
            writeDoubleList_Internal(i8, (DoubleArrayList) list, z8);
        } else {
            writeDoubleList_Internal(i8, list, z8);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeEnum(int i8, int i9) throws IOException {
        writeInt32(i8, i9);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeEnumList(int i8, List<Integer> list, boolean z8) throws IOException {
        writeInt32List(i8, list, z8);
    }

    abstract void writeFixed32(int i8);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed32List(int i8, List<Integer> list, boolean z8) throws IOException {
        if (list instanceof IntArrayList) {
            writeFixed32List_Internal(i8, (IntArrayList) list, z8);
        } else {
            writeFixed32List_Internal(i8, list, z8);
        }
    }

    abstract void writeFixed64(long j8);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed64List(int i8, List<Long> list, boolean z8) throws IOException {
        if (list instanceof LongArrayList) {
            writeFixed64List_Internal(i8, (LongArrayList) list, z8);
        } else {
            writeFixed64List_Internal(i8, list, z8);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFloat(int i8, float f8) throws IOException {
        writeFixed32(i8, Float.floatToRawIntBits(f8));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFloatList(int i8, List<Float> list, boolean z8) throws IOException {
        if (list instanceof FloatArrayList) {
            writeFloatList_Internal(i8, (FloatArrayList) list, z8);
        } else {
            writeFloatList_Internal(i8, list, z8);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public final void writeGroupList(int i8, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(i8, list.get(size));
        }
    }

    abstract void writeInt32(int i8);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt32List(int i8, List<Integer> list, boolean z8) throws IOException {
        if (list instanceof IntArrayList) {
            writeInt32List_Internal(i8, (IntArrayList) list, z8);
        } else {
            writeInt32List_Internal(i8, list, z8);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt64(int i8, long j8) throws IOException {
        writeUInt64(i8, j8);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt64List(int i8, List<Long> list, boolean z8) throws IOException {
        writeUInt64List(i8, list, z8);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public <K, V> void writeMap(int i8, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int totalBytesWritten = getTotalBytesWritten();
            writeMapEntryField(this, 2, metadata.valueType, entry.getValue());
            writeMapEntryField(this, 1, metadata.keyType, entry.getKey());
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i8, 2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageList(int i8, List<?> list) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(i8, list.get(size));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageSetItem(int i8, Object obj) throws IOException {
        writeTag(1, 4);
        if (obj instanceof ByteString) {
            writeBytes(3, (ByteString) obj);
        } else {
            writeMessage(3, obj);
        }
        writeUInt32(2, i8);
        writeTag(1, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed32(int i8, int i9) throws IOException {
        writeFixed32(i8, i9);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed32List(int i8, List<Integer> list, boolean z8) throws IOException {
        writeFixed32List(i8, list, z8);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed64(int i8, long j8) throws IOException {
        writeFixed64(i8, j8);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed64List(int i8, List<Long> list, boolean z8) throws IOException {
        writeFixed64List(i8, list, z8);
    }

    abstract void writeSInt32(int i8);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt32List(int i8, List<Integer> list, boolean z8) throws IOException {
        if (list instanceof IntArrayList) {
            writeSInt32List_Internal(i8, (IntArrayList) list, z8);
        } else {
            writeSInt32List_Internal(i8, list, z8);
        }
    }

    abstract void writeSInt64(long j8);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt64List(int i8, List<Long> list, boolean z8) throws IOException {
        if (list instanceof LongArrayList) {
            writeSInt64List_Internal(i8, (LongArrayList) list, z8);
        } else {
            writeSInt64List_Internal(i8, list, z8);
        }
    }

    abstract void writeString(String str);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeStringList(int i8, List<String> list) throws IOException {
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            for (int size = list.size() - 1; size >= 0; size--) {
                writeLazyString(i8, lazyStringList.getRaw(size));
            }
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeString(i8, list.get(size2));
        }
    }

    abstract void writeTag(int i8, int i9);

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt32List(int i8, List<Integer> list, boolean z8) throws IOException {
        if (list instanceof IntArrayList) {
            writeUInt32List_Internal(i8, (IntArrayList) list, z8);
        } else {
            writeUInt32List_Internal(i8, list, z8);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt64List(int i8, List<Long> list, boolean z8) throws IOException {
        if (list instanceof LongArrayList) {
            writeUInt64List_Internal(i8, (LongArrayList) list, z8);
        } else {
            writeUInt64List_Internal(i8, list, z8);
        }
    }

    abstract void writeVarint32(int i8);

    abstract void writeVarint64(long j8);

    private BinaryWriter(BufferAllocator bufferAllocator, int i8) {
        this.buffers = new ArrayDeque<>(4);
        if (i8 > 0) {
            this.alloc = (BufferAllocator) Internal.checkNotNull(bufferAllocator, "alloc");
            this.chunkSize = i8;
            return;
        }
        throw new IllegalArgumentException("chunkSize must be > 0");
    }

    public static BinaryWriter newDirectInstance(BufferAllocator bufferAllocator, int i8) {
        if (isUnsafeDirectSupported()) {
            return newUnsafeDirectInstance(bufferAllocator, i8);
        }
        return newSafeDirectInstance(bufferAllocator, i8);
    }

    public static BinaryWriter newHeapInstance(BufferAllocator bufferAllocator, int i8) {
        if (isUnsafeHeapSupported()) {
            return newUnsafeHeapInstance(bufferAllocator, i8);
        }
        return newSafeHeapInstance(bufferAllocator, i8);
    }

    final AllocatedBuffer newDirectBuffer(int i8) {
        return this.alloc.allocateDirectBuffer(Math.max(i8, this.chunkSize));
    }

    final AllocatedBuffer newHeapBuffer(int i8) {
        return this.alloc.allocateHeapBuffer(Math.max(i8, this.chunkSize));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public final void writeGroupList(int i8, List<?> list, Schema schema) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(i8, list.get(size), schema);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageList(int i8, List<?> list, Schema schema) throws IOException {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(i8, list.get(size), schema);
        }
    }

    private void writeBoolList_Internal(int i8, BooleanArrayList booleanArrayList, boolean z8) throws IOException {
        if (z8) {
            requireSpace(booleanArrayList.size() + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = booleanArrayList.size() - 1; size >= 0; size--) {
                writeBool(booleanArrayList.getBoolean(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i8, 2);
            return;
        }
        for (int size2 = booleanArrayList.size() - 1; size2 >= 0; size2--) {
            writeBool(i8, booleanArrayList.getBoolean(size2));
        }
    }

    private void writeDoubleList_Internal(int i8, DoubleArrayList doubleArrayList, boolean z8) throws IOException {
        if (z8) {
            requireSpace((doubleArrayList.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = doubleArrayList.size() - 1; size >= 0; size--) {
                writeFixed64(Double.doubleToRawLongBits(doubleArrayList.getDouble(size)));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i8, 2);
            return;
        }
        for (int size2 = doubleArrayList.size() - 1; size2 >= 0; size2--) {
            writeDouble(i8, doubleArrayList.getDouble(size2));
        }
    }

    private void writeFixed32List_Internal(int i8, IntArrayList intArrayList, boolean z8) throws IOException {
        if (z8) {
            requireSpace((intArrayList.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeFixed32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i8, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeFixed32(i8, intArrayList.getInt(size2));
        }
    }

    private void writeFixed64List_Internal(int i8, LongArrayList longArrayList, boolean z8) throws IOException {
        if (z8) {
            requireSpace((longArrayList.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeFixed64(longArrayList.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i8, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            writeFixed64(i8, longArrayList.getLong(size2));
        }
    }

    private void writeFloatList_Internal(int i8, FloatArrayList floatArrayList, boolean z8) throws IOException {
        if (z8) {
            requireSpace((floatArrayList.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = floatArrayList.size() - 1; size >= 0; size--) {
                writeFixed32(Float.floatToRawIntBits(floatArrayList.getFloat(size)));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i8, 2);
            return;
        }
        for (int size2 = floatArrayList.size() - 1; size2 >= 0; size2--) {
            writeFloat(i8, floatArrayList.getFloat(size2));
        }
    }

    private void writeInt32List_Internal(int i8, IntArrayList intArrayList, boolean z8) throws IOException {
        if (z8) {
            requireSpace((intArrayList.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeInt32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i8, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeInt32(i8, intArrayList.getInt(size2));
        }
    }

    private void writeSInt32List_Internal(int i8, IntArrayList intArrayList, boolean z8) throws IOException {
        if (z8) {
            requireSpace((intArrayList.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeSInt32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i8, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeSInt32(i8, intArrayList.getInt(size2));
        }
    }

    private void writeSInt64List_Internal(int i8, LongArrayList longArrayList, boolean z8) throws IOException {
        if (z8) {
            requireSpace((longArrayList.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeSInt64(longArrayList.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i8, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            writeSInt64(i8, longArrayList.getLong(size2));
        }
    }

    private void writeUInt32List_Internal(int i8, IntArrayList intArrayList, boolean z8) throws IOException {
        if (z8) {
            requireSpace((intArrayList.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeVarint32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i8, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeUInt32(i8, intArrayList.getInt(size2));
        }
    }

    private void writeUInt64List_Internal(int i8, LongArrayList longArrayList, boolean z8) throws IOException {
        if (z8) {
            requireSpace((longArrayList.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeVarint64(longArrayList.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i8, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            writeUInt64(i8, longArrayList.getLong(size2));
        }
    }
}
