package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

@CheckReturnValue
/* loaded from: classes3.dex */
abstract class BinaryReader implements Reader {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.BinaryReader$1, reason: invalid class name */
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private BinaryReader() {
    }

    public static BinaryReader newInstance(ByteBuffer byteBuffer, boolean z8) {
        if (byteBuffer.hasArray()) {
            return new SafeHeapReader(byteBuffer, z8);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    public abstract int getTotalBytesRead();

    @Override // androidx.datastore.preferences.protobuf.Reader
    public boolean shouldDiscardUnknownFields() {
        return false;
    }

    /* loaded from: classes3.dex */
    private static final class SafeHeapReader extends BinaryReader {
        private final byte[] buffer;
        private final boolean bufferIsImmutable;
        private int endGroupTag;
        private final int initialPos;
        private int limit;
        private int pos;
        private int tag;

        public SafeHeapReader(ByteBuffer byteBuffer, boolean z8) {
            super(null);
            this.bufferIsImmutable = z8;
            this.buffer = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.pos = arrayOffset;
            this.initialPos = arrayOffset;
            this.limit = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean isAtEnd() {
            if (this.pos == this.limit) {
                return true;
            }
            return false;
        }

        private byte readByte() throws IOException {
            int i8 = this.pos;
            if (i8 != this.limit) {
                byte[] bArr = this.buffer;
                this.pos = i8 + 1;
                return bArr[i8];
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        private Object readField(WireFormat.FieldType fieldType, Class<?> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
                case 1:
                    return Boolean.valueOf(readBool());
                case 2:
                    return readBytes();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(readEnum());
                case 5:
                    return Integer.valueOf(readFixed32());
                case 6:
                    return Long.valueOf(readFixed64());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(readInt32());
                case 9:
                    return Long.valueOf(readInt64());
                case 10:
                    return readMessage(cls, extensionRegistryLite);
                case 11:
                    return Integer.valueOf(readSFixed32());
                case 12:
                    return Long.valueOf(readSFixed64());
                case 13:
                    return Integer.valueOf(readSInt32());
                case 14:
                    return Long.valueOf(readSInt64());
                case 15:
                    return readStringRequireUtf8();
                case 16:
                    return Integer.valueOf(readUInt32());
                case 17:
                    return Long.valueOf(readUInt64());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private int readLittleEndian32() throws IOException {
            requireBytes(4);
            return readLittleEndian32_NoCheck();
        }

        private int readLittleEndian32_NoCheck() {
            int i8 = this.pos;
            byte[] bArr = this.buffer;
            this.pos = i8 + 4;
            return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
        }

        private long readLittleEndian64() throws IOException {
            requireBytes(8);
            return readLittleEndian64_NoCheck();
        }

        private long readLittleEndian64_NoCheck() {
            int i8 = this.pos;
            byte[] bArr = this.buffer;
            this.pos = i8 + 8;
            return ((bArr[i8 + 7] & 255) << 56) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
        }

        private int readVarint32() throws IOException {
            int i8;
            int i9 = this.pos;
            int i10 = this.limit;
            if (i10 != i9) {
                byte[] bArr = this.buffer;
                int i11 = i9 + 1;
                byte b9 = bArr[i9];
                if (b9 >= 0) {
                    this.pos = i11;
                    return b9;
                }
                if (i10 - i11 < 9) {
                    return (int) readVarint64SlowPath();
                }
                int i12 = i9 + 2;
                int i13 = (bArr[i11] << 7) ^ b9;
                if (i13 < 0) {
                    i8 = i13 ^ (-128);
                } else {
                    int i14 = i9 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        i8 = i15 ^ 16256;
                    } else {
                        int i16 = i9 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            i8 = (-2080896) ^ i17;
                        } else {
                            i14 = i9 + 5;
                            byte b10 = bArr[i16];
                            int i18 = (i17 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i16 = i9 + 6;
                                if (bArr[i14] < 0) {
                                    i14 = i9 + 7;
                                    if (bArr[i16] < 0) {
                                        i16 = i9 + 8;
                                        if (bArr[i14] < 0) {
                                            i14 = i9 + 9;
                                            if (bArr[i16] < 0) {
                                                int i19 = i9 + 10;
                                                if (bArr[i14] >= 0) {
                                                    i12 = i19;
                                                    i8 = i18;
                                                } else {
                                                    throw InvalidProtocolBufferException.malformedVarint();
                                                }
                                            }
                                        }
                                    }
                                }
                                i8 = i18;
                            }
                            i8 = i18;
                        }
                        i12 = i16;
                    }
                    i12 = i14;
                }
                this.pos = i12;
                return i8;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        private long readVarint64SlowPath() throws IOException {
            long j8 = 0;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                j8 |= (r3 & Byte.MAX_VALUE) << i8;
                if ((readByte() & 128) == 0) {
                    return j8;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void requireBytes(int i8) throws IOException {
            if (i8 >= 0 && i8 <= this.limit - this.pos) {
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        private void requirePosition(int i8) throws IOException {
            if (this.pos == i8) {
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        private void requireWireType(int i8) throws IOException {
            if (WireFormat.getTagWireType(this.tag) == i8) {
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        private void skipBytes(int i8) throws IOException {
            requireBytes(i8);
            this.pos += i8;
        }

        private void skipGroup() throws IOException {
            int i8 = this.endGroupTag;
            this.endGroupTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(this.tag), 4);
            while (getFieldNumber() != Integer.MAX_VALUE && skipField()) {
            }
            if (this.tag == this.endGroupTag) {
                this.endGroupTag = i8;
                return;
            }
            throw InvalidProtocolBufferException.parseFailure();
        }

        private void skipVarint() throws IOException {
            int i8 = this.limit;
            int i9 = this.pos;
            if (i8 - i9 >= 10) {
                byte[] bArr = this.buffer;
                int i10 = 0;
                while (i10 < 10) {
                    int i11 = i9 + 1;
                    if (bArr[i9] >= 0) {
                        this.pos = i11;
                        return;
                    } else {
                        i10++;
                        i9 = i11;
                    }
                }
            }
            skipVarintSlowPath();
        }

        private void skipVarintSlowPath() throws IOException {
            for (int i8 = 0; i8 < 10; i8++) {
                if (readByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void verifyPackedFixed32Length(int i8) throws IOException {
            requireBytes(i8);
            if ((i8 & 3) == 0) {
            } else {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        private void verifyPackedFixed64Length(int i8) throws IOException {
            requireBytes(i8);
            if ((i8 & 7) == 0) {
            } else {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int getFieldNumber() throws IOException {
            if (isAtEnd()) {
                return Integer.MAX_VALUE;
            }
            int readVarint32 = readVarint32();
            this.tag = readVarint32;
            if (readVarint32 == this.endGroupTag) {
                return Integer.MAX_VALUE;
            }
            return WireFormat.getTagFieldNumber(readVarint32);
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int getTag() {
            return this.tag;
        }

        @Override // androidx.datastore.preferences.protobuf.BinaryReader
        public int getTotalBytesRead() {
            return this.pos - this.initialPos;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public <T> void mergeGroupField(T t8, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i8 = this.endGroupTag;
            this.endGroupTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(this.tag), 4);
            try {
                schema.mergeFrom(t8, this, extensionRegistryLite);
                if (this.tag == this.endGroupTag) {
                } else {
                    throw InvalidProtocolBufferException.parseFailure();
                }
            } finally {
                this.endGroupTag = i8;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public <T> void mergeMessageField(T t8, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readVarint32 = readVarint32();
            requireBytes(readVarint32);
            int i8 = this.limit;
            int i9 = this.pos + readVarint32;
            this.limit = i9;
            try {
                schema.mergeFrom(t8, this, extensionRegistryLite);
                if (this.pos == i9) {
                } else {
                    throw InvalidProtocolBufferException.parseFailure();
                }
            } finally {
                this.limit = i8;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public boolean readBool() throws IOException {
            requireWireType(0);
            if (readVarint32() == 0) {
                return false;
            }
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readBoolList(List<Boolean> list) throws IOException {
            int i8;
            boolean z8;
            int i9;
            boolean z9;
            if (list instanceof BooleanArrayList) {
                BooleanArrayList booleanArrayList = (BooleanArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int readVarint32 = this.pos + readVarint32();
                        while (this.pos < readVarint32) {
                            if (readVarint32() != 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            booleanArrayList.addBoolean(z9);
                        }
                        requirePosition(readVarint32);
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    booleanArrayList.addBoolean(readBool());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i9 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i9;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int readVarint322 = this.pos + readVarint32();
                    while (this.pos < readVarint322) {
                        if (readVarint32() != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        list.add(Boolean.valueOf(z8));
                    }
                    requirePosition(readVarint322);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Boolean.valueOf(readBool()));
                if (isAtEnd()) {
                    return;
                } else {
                    i8 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i8;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public ByteString readBytes() throws IOException {
            ByteString copyFrom;
            requireWireType(2);
            int readVarint32 = readVarint32();
            if (readVarint32 == 0) {
                return ByteString.EMPTY;
            }
            requireBytes(readVarint32);
            if (this.bufferIsImmutable) {
                copyFrom = ByteString.wrap(this.buffer, this.pos, readVarint32);
            } else {
                copyFrom = ByteString.copyFrom(this.buffer, this.pos, readVarint32);
            }
            this.pos += readVarint32;
            return copyFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readBytesList(List<ByteString> list) throws IOException {
            int i8;
            if (WireFormat.getTagWireType(this.tag) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(readBytes());
                if (isAtEnd()) {
                    return;
                } else {
                    i8 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i8;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public double readDouble() throws IOException {
            requireWireType(1);
            return Double.longBitsToDouble(readLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readDoubleList(List<Double> list) throws IOException {
            int i8;
            int i9;
            if (list instanceof DoubleArrayList) {
                DoubleArrayList doubleArrayList = (DoubleArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 1) {
                    if (tagWireType == 2) {
                        int readVarint32 = readVarint32();
                        verifyPackedFixed64Length(readVarint32);
                        int i10 = this.pos + readVarint32;
                        while (this.pos < i10) {
                            doubleArrayList.addDouble(Double.longBitsToDouble(readLittleEndian64_NoCheck()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    doubleArrayList.addDouble(readDouble());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i9 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i9;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 1) {
                if (tagWireType2 == 2) {
                    int readVarint322 = readVarint32();
                    verifyPackedFixed64Length(readVarint322);
                    int i11 = this.pos + readVarint322;
                    while (this.pos < i11) {
                        list.add(Double.valueOf(Double.longBitsToDouble(readLittleEndian64_NoCheck())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Double.valueOf(readDouble()));
                if (isAtEnd()) {
                    return;
                } else {
                    i8 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i8;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int readEnum() throws IOException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readEnumList(List<Integer> list) throws IOException {
            int i8;
            int i9;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int readVarint32 = this.pos + readVarint32();
                        while (this.pos < readVarint32) {
                            intArrayList.addInt(readVarint32());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    intArrayList.addInt(readEnum());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i9 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i9;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int readVarint322 = this.pos + readVarint32();
                    while (this.pos < readVarint322) {
                        list.add(Integer.valueOf(readVarint32()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(readEnum()));
                if (isAtEnd()) {
                    return;
                } else {
                    i8 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i8;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int readFixed32() throws IOException {
            requireWireType(5);
            return readLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readFixed32List(List<Integer> list) throws IOException {
            int i8;
            int i9;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 2) {
                    if (tagWireType != 5) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    do {
                        intArrayList.addInt(readFixed32());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i9 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i9;
                    return;
                }
                int readVarint32 = readVarint32();
                verifyPackedFixed32Length(readVarint32);
                int i10 = this.pos + readVarint32;
                while (this.pos < i10) {
                    intArrayList.addInt(readLittleEndian32_NoCheck());
                }
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 2) {
                if (tagWireType2 != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Integer.valueOf(readFixed32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i8 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i8;
                return;
            }
            int readVarint322 = readVarint32();
            verifyPackedFixed32Length(readVarint322);
            int i11 = this.pos + readVarint322;
            while (this.pos < i11) {
                list.add(Integer.valueOf(readLittleEndian32_NoCheck()));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public long readFixed64() throws IOException {
            requireWireType(1);
            return readLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readFixed64List(List<Long> list) throws IOException {
            int i8;
            int i9;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 1) {
                    if (tagWireType == 2) {
                        int readVarint32 = readVarint32();
                        verifyPackedFixed64Length(readVarint32);
                        int i10 = this.pos + readVarint32;
                        while (this.pos < i10) {
                            longArrayList.addLong(readLittleEndian64_NoCheck());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    longArrayList.addLong(readFixed64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i9 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i9;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 1) {
                if (tagWireType2 == 2) {
                    int readVarint322 = readVarint32();
                    verifyPackedFixed64Length(readVarint322);
                    int i11 = this.pos + readVarint322;
                    while (this.pos < i11) {
                        list.add(Long.valueOf(readLittleEndian64_NoCheck()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Long.valueOf(readFixed64()));
                if (isAtEnd()) {
                    return;
                } else {
                    i8 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i8;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public float readFloat() throws IOException {
            requireWireType(5);
            return Float.intBitsToFloat(readLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readFloatList(List<Float> list) throws IOException {
            int i8;
            int i9;
            if (list instanceof FloatArrayList) {
                FloatArrayList floatArrayList = (FloatArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 2) {
                    if (tagWireType != 5) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    do {
                        floatArrayList.addFloat(readFloat());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i9 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i9;
                    return;
                }
                int readVarint32 = readVarint32();
                verifyPackedFixed32Length(readVarint32);
                int i10 = this.pos + readVarint32;
                while (this.pos < i10) {
                    floatArrayList.addFloat(Float.intBitsToFloat(readLittleEndian32_NoCheck()));
                }
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 2) {
                if (tagWireType2 != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i8 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i8;
                return;
            }
            int readVarint322 = readVarint32();
            verifyPackedFixed32Length(readVarint322);
            int i11 = this.pos + readVarint322;
            while (this.pos < i11) {
                list.add(Float.valueOf(Float.intBitsToFloat(readLittleEndian32_NoCheck())));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        @Deprecated
        public <T> T readGroup(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            requireWireType(3);
            return (T) readGroup(Protobuf.getInstance().schemaFor((Class) cls), extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        @Deprecated
        public <T> T readGroupBySchemaWithCheck(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            requireWireType(3);
            return (T) readGroup(schema, extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        @Deprecated
        public <T> void readGroupList(List<T> list, Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            readGroupList(list, Protobuf.getInstance().schemaFor((Class) cls), extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int readInt32() throws IOException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readInt32List(List<Integer> list) throws IOException {
            int i8;
            int i9;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int readVarint32 = this.pos + readVarint32();
                        while (this.pos < readVarint32) {
                            intArrayList.addInt(readVarint32());
                        }
                        requirePosition(readVarint32);
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    intArrayList.addInt(readInt32());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i9 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i9;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int readVarint322 = this.pos + readVarint32();
                    while (this.pos < readVarint322) {
                        list.add(Integer.valueOf(readVarint32()));
                    }
                    requirePosition(readVarint322);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(readInt32()));
                if (isAtEnd()) {
                    return;
                } else {
                    i8 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i8;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public long readInt64() throws IOException {
            requireWireType(0);
            return readVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readInt64List(List<Long> list) throws IOException {
            int i8;
            int i9;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int readVarint32 = this.pos + readVarint32();
                        while (this.pos < readVarint32) {
                            longArrayList.addLong(readVarint64());
                        }
                        requirePosition(readVarint32);
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    longArrayList.addLong(readInt64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i9 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i9;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int readVarint322 = this.pos + readVarint32();
                    while (this.pos < readVarint322) {
                        list.add(Long.valueOf(readVarint64()));
                    }
                    requirePosition(readVarint322);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Long.valueOf(readInt64()));
                if (isAtEnd()) {
                    return;
                } else {
                    i8 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i8;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.Reader
        public <K, V> void readMap(Map<K, V> map, MapEntryLite.Metadata<K, V> metadata, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            requireWireType(2);
            int readVarint32 = readVarint32();
            requireBytes(readVarint32);
            int i8 = this.limit;
            this.limit = this.pos + readVarint32;
            try {
                Object obj = metadata.defaultKey;
                Object obj2 = metadata.defaultValue;
                while (true) {
                    int fieldNumber = getFieldNumber();
                    if (fieldNumber == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
                    }
                    if (fieldNumber != 1) {
                        if (fieldNumber != 2) {
                            try {
                                if (!skipField()) {
                                    throw new InvalidProtocolBufferException("Unable to parse map entry.");
                                    break;
                                }
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                if (!skipField()) {
                                    throw new InvalidProtocolBufferException("Unable to parse map entry.");
                                }
                            }
                        } else {
                            obj2 = readField(metadata.valueType, metadata.defaultValue.getClass(), extensionRegistryLite);
                        }
                    } else {
                        obj = readField(metadata.keyType, null, null);
                    }
                }
            } finally {
                this.limit = i8;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public <T> T readMessage(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            requireWireType(2);
            return (T) readMessage(Protobuf.getInstance().schemaFor((Class) cls), extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public <T> T readMessageBySchemaWithCheck(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            requireWireType(2);
            return (T) readMessage(schema, extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public <T> void readMessageList(List<T> list, Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            readMessageList(list, Protobuf.getInstance().schemaFor((Class) cls), extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int readSFixed32() throws IOException {
            requireWireType(5);
            return readLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readSFixed32List(List<Integer> list) throws IOException {
            int i8;
            int i9;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 2) {
                    if (tagWireType != 5) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    do {
                        intArrayList.addInt(readSFixed32());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i9 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i9;
                    return;
                }
                int readVarint32 = readVarint32();
                verifyPackedFixed32Length(readVarint32);
                int i10 = this.pos + readVarint32;
                while (this.pos < i10) {
                    intArrayList.addInt(readLittleEndian32_NoCheck());
                }
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 2) {
                if (tagWireType2 != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Integer.valueOf(readSFixed32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i8 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i8;
                return;
            }
            int readVarint322 = readVarint32();
            verifyPackedFixed32Length(readVarint322);
            int i11 = this.pos + readVarint322;
            while (this.pos < i11) {
                list.add(Integer.valueOf(readLittleEndian32_NoCheck()));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public long readSFixed64() throws IOException {
            requireWireType(1);
            return readLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readSFixed64List(List<Long> list) throws IOException {
            int i8;
            int i9;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 1) {
                    if (tagWireType == 2) {
                        int readVarint32 = readVarint32();
                        verifyPackedFixed64Length(readVarint32);
                        int i10 = this.pos + readVarint32;
                        while (this.pos < i10) {
                            longArrayList.addLong(readLittleEndian64_NoCheck());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    longArrayList.addLong(readSFixed64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i9 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i9;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 1) {
                if (tagWireType2 == 2) {
                    int readVarint322 = readVarint32();
                    verifyPackedFixed64Length(readVarint322);
                    int i11 = this.pos + readVarint322;
                    while (this.pos < i11) {
                        list.add(Long.valueOf(readLittleEndian64_NoCheck()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Long.valueOf(readSFixed64()));
                if (isAtEnd()) {
                    return;
                } else {
                    i8 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i8;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int readSInt32() throws IOException {
            requireWireType(0);
            return CodedInputStream.decodeZigZag32(readVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readSInt32List(List<Integer> list) throws IOException {
            int i8;
            int i9;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int readVarint32 = this.pos + readVarint32();
                        while (this.pos < readVarint32) {
                            intArrayList.addInt(CodedInputStream.decodeZigZag32(readVarint32()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    intArrayList.addInt(readSInt32());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i9 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i9;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int readVarint322 = this.pos + readVarint32();
                    while (this.pos < readVarint322) {
                        list.add(Integer.valueOf(CodedInputStream.decodeZigZag32(readVarint32())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(readSInt32()));
                if (isAtEnd()) {
                    return;
                } else {
                    i8 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i8;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public long readSInt64() throws IOException {
            requireWireType(0);
            return CodedInputStream.decodeZigZag64(readVarint64());
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readSInt64List(List<Long> list) throws IOException {
            int i8;
            int i9;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int readVarint32 = this.pos + readVarint32();
                        while (this.pos < readVarint32) {
                            longArrayList.addLong(CodedInputStream.decodeZigZag64(readVarint64()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    longArrayList.addLong(readSInt64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i9 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i9;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int readVarint322 = this.pos + readVarint32();
                    while (this.pos < readVarint322) {
                        list.add(Long.valueOf(CodedInputStream.decodeZigZag64(readVarint64())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Long.valueOf(readSInt64()));
                if (isAtEnd()) {
                    return;
                } else {
                    i8 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i8;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public String readString() throws IOException {
            return readStringInternal(false);
        }

        public String readStringInternal(boolean z8) throws IOException {
            requireWireType(2);
            int readVarint32 = readVarint32();
            if (readVarint32 == 0) {
                return "";
            }
            requireBytes(readVarint32);
            if (z8) {
                byte[] bArr = this.buffer;
                int i8 = this.pos;
                if (!Utf8.isValidUtf8(bArr, i8, i8 + readVarint32)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
            }
            String str = new String(this.buffer, this.pos, readVarint32, Internal.UTF_8);
            this.pos += readVarint32;
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readStringList(List<String> list) throws IOException {
            readStringListInternal(list, false);
        }

        public void readStringListInternal(List<String> list, boolean z8) throws IOException {
            int i8;
            int i9;
            if (WireFormat.getTagWireType(this.tag) == 2) {
                if ((list instanceof LazyStringList) && !z8) {
                    LazyStringList lazyStringList = (LazyStringList) list;
                    do {
                        lazyStringList.add(readBytes());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i9 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i9;
                    return;
                }
                do {
                    list.add(readStringInternal(z8));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i8 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i8;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readStringListRequireUtf8(List<String> list) throws IOException {
            readStringListInternal(list, true);
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public String readStringRequireUtf8() throws IOException {
            return readStringInternal(true);
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int readUInt32() throws IOException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readUInt32List(List<Integer> list) throws IOException {
            int i8;
            int i9;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int readVarint32 = this.pos + readVarint32();
                        while (this.pos < readVarint32) {
                            intArrayList.addInt(readVarint32());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    intArrayList.addInt(readUInt32());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i9 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i9;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int readVarint322 = this.pos + readVarint32();
                    while (this.pos < readVarint322) {
                        list.add(Integer.valueOf(readVarint32()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(readUInt32()));
                if (isAtEnd()) {
                    return;
                } else {
                    i8 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i8;
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public long readUInt64() throws IOException {
            requireWireType(0);
            return readVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readUInt64List(List<Long> list) throws IOException {
            int i8;
            int i9;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int tagWireType = WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int readVarint32 = this.pos + readVarint32();
                        while (this.pos < readVarint32) {
                            longArrayList.addLong(readVarint64());
                        }
                        requirePosition(readVarint32);
                        return;
                    }
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    longArrayList.addLong(readUInt64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i9 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i9;
                return;
            }
            int tagWireType2 = WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int readVarint322 = this.pos + readVarint32();
                    while (this.pos < readVarint322) {
                        list.add(Long.valueOf(readVarint64()));
                    }
                    requirePosition(readVarint322);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Long.valueOf(readUInt64()));
                if (isAtEnd()) {
                    return;
                } else {
                    i8 = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i8;
        }

        public long readVarint64() throws IOException {
            long j8;
            long j9;
            long j10;
            int i8 = this.pos;
            int i9 = this.limit;
            if (i9 != i8) {
                byte[] bArr = this.buffer;
                int i10 = i8 + 1;
                byte b9 = bArr[i8];
                if (b9 >= 0) {
                    this.pos = i10;
                    return b9;
                }
                if (i9 - i10 < 9) {
                    return readVarint64SlowPath();
                }
                int i11 = i8 + 2;
                int i12 = (bArr[i10] << 7) ^ b9;
                if (i12 < 0) {
                    j8 = i12 ^ (-128);
                } else {
                    int i13 = i8 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    if (i14 >= 0) {
                        j8 = i14 ^ 16256;
                        i11 = i13;
                    } else {
                        int i15 = i8 + 4;
                        int i16 = i14 ^ (bArr[i13] << 21);
                        if (i16 < 0) {
                            long j11 = (-2080896) ^ i16;
                            i11 = i15;
                            j8 = j11;
                        } else {
                            long j12 = i16;
                            i11 = i8 + 5;
                            long j13 = j12 ^ (bArr[i15] << 28);
                            if (j13 >= 0) {
                                j10 = 266354560;
                            } else {
                                int i17 = i8 + 6;
                                long j14 = j13 ^ (bArr[i11] << 35);
                                if (j14 < 0) {
                                    j9 = -34093383808L;
                                } else {
                                    i11 = i8 + 7;
                                    j13 = j14 ^ (bArr[i17] << 42);
                                    if (j13 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i17 = i8 + 8;
                                        j14 = j13 ^ (bArr[i11] << 49);
                                        if (j14 < 0) {
                                            j9 = -558586000294016L;
                                        } else {
                                            i11 = i8 + 9;
                                            long j15 = (j14 ^ (bArr[i17] << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                int i18 = i8 + 10;
                                                if (bArr[i11] >= 0) {
                                                    i11 = i18;
                                                } else {
                                                    throw InvalidProtocolBufferException.malformedVarint();
                                                }
                                            }
                                            j8 = j15;
                                        }
                                    }
                                }
                                j8 = j14 ^ j9;
                                i11 = i17;
                            }
                            j8 = j13 ^ j10;
                        }
                    }
                }
                this.pos = i11;
                return j8;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public boolean skipField() throws IOException {
            int i8;
            if (!isAtEnd() && (i8 = this.tag) != this.endGroupTag) {
                int tagWireType = WireFormat.getTagWireType(i8);
                if (tagWireType != 0) {
                    if (tagWireType != 1) {
                        if (tagWireType != 2) {
                            if (tagWireType != 3) {
                                if (tagWireType == 5) {
                                    skipBytes(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.invalidWireType();
                            }
                            skipGroup();
                            return true;
                        }
                        skipBytes(readVarint32());
                        return true;
                    }
                    skipBytes(8);
                    return true;
                }
                skipVarint();
                return true;
            }
            return false;
        }

        private <T> T readGroup(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            T newInstance = schema.newInstance();
            mergeGroupField(newInstance, schema, extensionRegistryLite);
            schema.makeImmutable(newInstance);
            return newInstance;
        }

        private <T> T readMessage(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            T newInstance = schema.newInstance();
            mergeMessageField(newInstance, schema, extensionRegistryLite);
            schema.makeImmutable(newInstance);
            return newInstance;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.Reader
        @Deprecated
        public <T> void readGroupList(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i8;
            if (WireFormat.getTagWireType(this.tag) == 3) {
                int i9 = this.tag;
                do {
                    list.add(readGroup(schema, extensionRegistryLite));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i8 = this.pos;
                    }
                } while (readVarint32() == i9);
                this.pos = i8;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.Reader
        public <T> void readMessageList(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i8;
            if (WireFormat.getTagWireType(this.tag) == 2) {
                int i9 = this.tag;
                do {
                    list.add(readMessage(schema, extensionRegistryLite));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i8 = this.pos;
                    }
                } while (readVarint32() == i9);
                this.pos = i8;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    /* synthetic */ BinaryReader(AnonymousClass1 anonymousClass1) {
        this();
    }
}
