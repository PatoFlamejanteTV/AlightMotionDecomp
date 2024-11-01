package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@CheckReturnValue
/* loaded from: classes3.dex */
public final class CodedInputStreamReader implements Reader {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;
    private static final int NEXT_TAG_UNSET = 0;
    private int endGroupTag;
    private final CodedInputStream input;
    private int nextTag = 0;
    private int tag;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.CodedInputStreamReader$1, reason: invalid class name */
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

    private CodedInputStreamReader(CodedInputStream codedInputStream) {
        CodedInputStream codedInputStream2 = (CodedInputStream) Internal.checkNotNull(codedInputStream, "input");
        this.input = codedInputStream2;
        codedInputStream2.wrapper = this;
    }

    public static CodedInputStreamReader forCodedInput(CodedInputStream codedInputStream) {
        CodedInputStreamReader codedInputStreamReader = codedInputStream.wrapper;
        if (codedInputStreamReader != null) {
            return codedInputStreamReader;
        }
        return new CodedInputStreamReader(codedInputStream);
    }

    private <T> void mergeGroupFieldInternal(T t8, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
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

    private <T> void mergeMessageFieldInternal(T t8, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int readUInt32 = this.input.readUInt32();
        CodedInputStream codedInputStream = this.input;
        if (codedInputStream.recursionDepth < codedInputStream.recursionLimit) {
            int pushLimit = codedInputStream.pushLimit(readUInt32);
            this.input.recursionDepth++;
            schema.mergeFrom(t8, this, extensionRegistryLite);
            this.input.checkLastTagWas(0);
            r5.recursionDepth--;
            this.input.popLimit(pushLimit);
            return;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
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
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private void requirePosition(int i8) throws IOException {
        if (this.input.getTotalBytesRead() == i8) {
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

    private void verifyPackedFixed32Length(int i8) throws IOException {
        if ((i8 & 3) == 0) {
        } else {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    private void verifyPackedFixed64Length(int i8) throws IOException {
        if ((i8 & 7) == 0) {
        } else {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int getFieldNumber() throws IOException {
        int i8 = this.nextTag;
        if (i8 != 0) {
            this.tag = i8;
            this.nextTag = 0;
        } else {
            this.tag = this.input.readTag();
        }
        int i9 = this.tag;
        if (i9 != 0 && i9 != this.endGroupTag) {
            return WireFormat.getTagFieldNumber(i9);
        }
        return Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int getTag() {
        return this.tag;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public <T> void mergeGroupField(T t8, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        requireWireType(3);
        mergeGroupFieldInternal(t8, schema, extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public <T> void mergeMessageField(T t8, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        requireWireType(2);
        mergeMessageFieldInternal(t8, schema, extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public boolean readBool() throws IOException {
        requireWireType(0);
        return this.input.readBool();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readBoolList(List<Boolean> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof BooleanArrayList) {
            BooleanArrayList booleanArrayList = (BooleanArrayList) list;
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        booleanArrayList.addBoolean(this.input.readBool());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                booleanArrayList.addBoolean(this.input.readBool());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Boolean.valueOf(this.input.readBool()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Boolean.valueOf(this.input.readBool()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public ByteString readBytes() throws IOException {
        requireWireType(2);
        return this.input.readBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readBytesList(List<ByteString> list) throws IOException {
        int readTag;
        if (WireFormat.getTagWireType(this.tag) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(readBytes());
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public double readDouble() throws IOException {
        requireWireType(1);
        return this.input.readDouble();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readDoubleList(List<Double> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof DoubleArrayList) {
            DoubleArrayList doubleArrayList = (DoubleArrayList) list;
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.input.readUInt32();
                    verifyPackedFixed64Length(readUInt32);
                    int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
                    do {
                        doubleArrayList.addDouble(this.input.readDouble());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                doubleArrayList.addDouble(this.input.readDouble());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = this.input.readUInt32();
                verifyPackedFixed64Length(readUInt322);
                int totalBytesRead2 = this.input.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Double.valueOf(this.input.readDouble()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Double.valueOf(this.input.readDouble()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readEnum() throws IOException {
        requireWireType(0);
        return this.input.readEnum();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readEnumList(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        intArrayList.addInt(this.input.readEnum());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                intArrayList.addInt(this.input.readEnum());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Integer.valueOf(this.input.readEnum()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.input.readEnum()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readFixed32() throws IOException {
        requireWireType(5);
        return this.input.readFixed32();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readFixed32List(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType != 2) {
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    intArrayList.addInt(this.input.readFixed32());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            int readUInt32 = this.input.readUInt32();
            verifyPackedFixed32Length(readUInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
            do {
                intArrayList.addInt(this.input.readFixed32());
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 != 2) {
            if (tagWireType2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.input.readFixed32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        int readUInt322 = this.input.readUInt32();
        verifyPackedFixed32Length(readUInt322);
        int totalBytesRead2 = this.input.getTotalBytesRead() + readUInt322;
        do {
            list.add(Integer.valueOf(this.input.readFixed32()));
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readFixed64() throws IOException {
        requireWireType(1);
        return this.input.readFixed64();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readFixed64List(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.input.readUInt32();
                    verifyPackedFixed64Length(readUInt32);
                    int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
                    do {
                        longArrayList.addLong(this.input.readFixed64());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                longArrayList.addLong(this.input.readFixed64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = this.input.readUInt32();
                verifyPackedFixed64Length(readUInt322);
                int totalBytesRead2 = this.input.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Long.valueOf(this.input.readFixed64()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.input.readFixed64()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public float readFloat() throws IOException {
        requireWireType(5);
        return this.input.readFloat();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readFloatList(List<Float> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof FloatArrayList) {
            FloatArrayList floatArrayList = (FloatArrayList) list;
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType != 2) {
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    floatArrayList.addFloat(this.input.readFloat());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            int readUInt32 = this.input.readUInt32();
            verifyPackedFixed32Length(readUInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
            do {
                floatArrayList.addFloat(this.input.readFloat());
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 != 2) {
            if (tagWireType2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(this.input.readFloat()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        int readUInt322 = this.input.readUInt32();
        verifyPackedFixed32Length(readUInt322);
        int totalBytesRead2 = this.input.getTotalBytesRead() + readUInt322;
        do {
            list.add(Float.valueOf(this.input.readFloat()));
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
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
        return this.input.readInt32();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readInt32List(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        intArrayList.addInt(this.input.readInt32());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                intArrayList.addInt(this.input.readInt32());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Integer.valueOf(this.input.readInt32()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.input.readInt32()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readInt64() throws IOException {
        requireWireType(0);
        return this.input.readInt64();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readInt64List(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        longArrayList.addLong(this.input.readInt64());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                longArrayList.addLong(this.input.readInt64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Long.valueOf(this.input.readInt64()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.input.readInt64()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:            r8.put(r2, r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:            r7.input.popLimit(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:            return;     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <K, V> void readMap(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> r9, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.requireWireType(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r7.input
            int r1 = r1.readUInt32()
            androidx.datastore.preferences.protobuf.CodedInputStream r2 = r7.input
            int r1 = r2.pushLimit(r1)
            K r2 = r9.defaultKey
            V r3 = r9.defaultValue
        L14:
            int r4 = r7.getFieldNumber()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r7.input     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.isAtEnd()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.skipField()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.valueType     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            V r5 = r9.defaultValue     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r3 = r7.readField(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L49:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.keyType     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r5 = 0
            java.lang.Object r2 = r7.readField(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L51:
            boolean r4 = r7.skipField()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            androidx.datastore.preferences.protobuf.CodedInputStream r8 = r7.input
            r8.popLimit(r1)
            return
        L67:
            androidx.datastore.preferences.protobuf.CodedInputStream r9 = r7.input
            r9.popLimit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.CodedInputStreamReader.readMap(java.util.Map, androidx.datastore.preferences.protobuf.MapEntryLite$Metadata, androidx.datastore.preferences.protobuf.ExtensionRegistryLite):void");
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
        return this.input.readSFixed32();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readSFixed32List(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType != 2) {
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    intArrayList.addInt(this.input.readSFixed32());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            int readUInt32 = this.input.readUInt32();
            verifyPackedFixed32Length(readUInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
            do {
                intArrayList.addInt(this.input.readSFixed32());
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 != 2) {
            if (tagWireType2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.input.readSFixed32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        int readUInt322 = this.input.readUInt32();
        verifyPackedFixed32Length(readUInt322);
        int totalBytesRead2 = this.input.getTotalBytesRead() + readUInt322;
        do {
            list.add(Integer.valueOf(this.input.readSFixed32()));
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readSFixed64() throws IOException {
        requireWireType(1);
        return this.input.readSFixed64();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readSFixed64List(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType != 1) {
                if (tagWireType == 2) {
                    int readUInt32 = this.input.readUInt32();
                    verifyPackedFixed64Length(readUInt32);
                    int totalBytesRead = this.input.getTotalBytesRead() + readUInt32;
                    do {
                        longArrayList.addLong(this.input.readSFixed64());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                longArrayList.addLong(this.input.readSFixed64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 != 1) {
            if (tagWireType2 == 2) {
                int readUInt322 = this.input.readUInt32();
                verifyPackedFixed64Length(readUInt322);
                int totalBytesRead2 = this.input.getTotalBytesRead() + readUInt322;
                do {
                    list.add(Long.valueOf(this.input.readSFixed64()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.input.readSFixed64()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readSInt32() throws IOException {
        requireWireType(0);
        return this.input.readSInt32();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readSInt32List(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        intArrayList.addInt(this.input.readSInt32());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                intArrayList.addInt(this.input.readSInt32());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Integer.valueOf(this.input.readSInt32()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.input.readSInt32()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readSInt64() throws IOException {
        requireWireType(0);
        return this.input.readSInt64();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readSInt64List(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        longArrayList.addLong(this.input.readSInt64());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                longArrayList.addLong(this.input.readSInt64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Long.valueOf(this.input.readSInt64()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.input.readSInt64()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public String readString() throws IOException {
        requireWireType(2);
        return this.input.readString();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readStringList(List<String> list) throws IOException {
        readStringListInternal(list, false);
    }

    public void readStringListInternal(List<String> list, boolean z8) throws IOException {
        String readString;
        int readTag;
        int readTag2;
        if (WireFormat.getTagWireType(this.tag) == 2) {
            if ((list instanceof LazyStringList) && !z8) {
                LazyStringList lazyStringList = (LazyStringList) list;
                do {
                    lazyStringList.add(readBytes());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            do {
                if (z8) {
                    readString = readStringRequireUtf8();
                } else {
                    readString = readString();
                }
                list.add(readString);
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
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
        requireWireType(2);
        return this.input.readStringRequireUtf8();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readUInt32() throws IOException {
        requireWireType(0);
        return this.input.readUInt32();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readUInt32List(List<Integer> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        intArrayList.addInt(this.input.readUInt32());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                intArrayList.addInt(this.input.readUInt32());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Integer.valueOf(this.input.readUInt32()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(this.input.readUInt32()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readUInt64() throws IOException {
        requireWireType(0);
        return this.input.readUInt64();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readUInt64List(List<Long> list) throws IOException {
        int readTag;
        int readTag2;
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int tagWireType = WireFormat.getTagWireType(this.tag);
            if (tagWireType != 0) {
                if (tagWireType == 2) {
                    int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                    do {
                        longArrayList.addLong(this.input.readUInt64());
                    } while (this.input.getTotalBytesRead() < totalBytesRead);
                    requirePosition(totalBytesRead);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                longArrayList.addLong(this.input.readUInt64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        int tagWireType2 = WireFormat.getTagWireType(this.tag);
        if (tagWireType2 != 0) {
            if (tagWireType2 == 2) {
                int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    list.add(Long.valueOf(this.input.readUInt64()));
                } while (this.input.getTotalBytesRead() < totalBytesRead2);
                requirePosition(totalBytesRead2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(this.input.readUInt64()));
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public boolean shouldDiscardUnknownFields() {
        return this.input.shouldDiscardUnknownFields();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public boolean skipField() throws IOException {
        int i8;
        if (!this.input.isAtEnd() && (i8 = this.tag) != this.endGroupTag) {
            return this.input.skipField(i8);
        }
        return false;
    }

    private <T> T readGroup(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        T newInstance = schema.newInstance();
        mergeGroupFieldInternal(newInstance, schema, extensionRegistryLite);
        schema.makeImmutable(newInstance);
        return newInstance;
    }

    private <T> T readMessage(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        T newInstance = schema.newInstance();
        mergeMessageFieldInternal(newInstance, schema, extensionRegistryLite);
        schema.makeImmutable(newInstance);
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.Reader
    @Deprecated
    public <T> void readGroupList(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int readTag;
        if (WireFormat.getTagWireType(this.tag) == 3) {
            int i8 = this.tag;
            do {
                list.add(readGroup(schema, extensionRegistryLite));
                if (this.input.isAtEnd() || this.nextTag != 0) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == i8);
            this.nextTag = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.Reader
    public <T> void readMessageList(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int readTag;
        if (WireFormat.getTagWireType(this.tag) == 2) {
            int i8 = this.tag;
            do {
                list.add(readMessage(schema, extensionRegistryLite));
                if (this.input.isAtEnd() || this.nextTag != 0) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == i8);
            this.nextTag = readTag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }
}
