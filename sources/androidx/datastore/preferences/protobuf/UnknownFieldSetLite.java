package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class UnknownFieldSetLite {
    private static final UnknownFieldSetLite DEFAULT_INSTANCE = new UnknownFieldSetLite(0, new int[0], new Object[0], false);
    private static final int MIN_CAPACITY = 8;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private Object[] objects;
    private int[] tags;

    private UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    private void ensureCapacity(int i8) {
        int[] iArr = this.tags;
        if (i8 > iArr.length) {
            int i9 = this.count;
            int i10 = i9 + (i9 / 2);
            if (i10 >= i8) {
                i8 = i10;
            }
            if (i8 < 8) {
                i8 = 8;
            }
            this.tags = Arrays.copyOf(iArr, i8);
            this.objects = Arrays.copyOf(this.objects, i8);
        }
    }

    public static UnknownFieldSetLite getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static int hashCode(int[] iArr, int i8) {
        int i9 = 17;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 = (i9 * 31) + iArr[i10];
        }
        return i9;
    }

    private UnknownFieldSetLite mergeFrom(CodedInputStream codedInputStream) throws IOException {
        int readTag;
        do {
            readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
        } while (mergeFieldFrom(readTag, codedInputStream));
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static UnknownFieldSetLite mutableCopyOf(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        int i8 = unknownFieldSetLite.count + unknownFieldSetLite2.count;
        int[] copyOf = Arrays.copyOf(unknownFieldSetLite.tags, i8);
        System.arraycopy(unknownFieldSetLite2.tags, 0, copyOf, unknownFieldSetLite.count, unknownFieldSetLite2.count);
        Object[] copyOf2 = Arrays.copyOf(unknownFieldSetLite.objects, i8);
        System.arraycopy(unknownFieldSetLite2.objects, 0, copyOf2, unknownFieldSetLite.count, unknownFieldSetLite2.count);
        return new UnknownFieldSetLite(i8, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static UnknownFieldSetLite newInstance() {
        return new UnknownFieldSetLite();
    }

    private static boolean objectsEquals(Object[] objArr, Object[] objArr2, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            if (!objArr[i9].equals(objArr2[i9])) {
                return false;
            }
        }
        return true;
    }

    private static boolean tagsEquals(int[] iArr, int[] iArr2, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            if (iArr[i9] != iArr2[i9]) {
                return false;
            }
        }
        return true;
    }

    private static void writeField(int i8, Object obj, Writer writer) throws IOException {
        int tagFieldNumber = WireFormat.getTagFieldNumber(i8);
        int tagWireType = WireFormat.getTagWireType(i8);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType == 5) {
                            writer.writeFixed32(tagFieldNumber, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
                    }
                    if (writer.fieldOrder() == Writer.FieldOrder.ASCENDING) {
                        writer.writeStartGroup(tagFieldNumber);
                        ((UnknownFieldSetLite) obj).writeTo(writer);
                        writer.writeEndGroup(tagFieldNumber);
                        return;
                    } else {
                        writer.writeEndGroup(tagFieldNumber);
                        ((UnknownFieldSetLite) obj).writeTo(writer);
                        writer.writeStartGroup(tagFieldNumber);
                        return;
                    }
                }
                writer.writeBytes(tagFieldNumber, (ByteString) obj);
                return;
            }
            writer.writeFixed64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        writer.writeInt64(tagFieldNumber, ((Long) obj).longValue());
    }

    void checkMutable() {
        if (this.isMutable) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i8 = this.count;
        if (i8 == unknownFieldSetLite.count && tagsEquals(this.tags, unknownFieldSetLite.tags, i8) && objectsEquals(this.objects, unknownFieldSetLite.objects, this.count)) {
            return true;
        }
        return false;
    }

    public int getSerializedSize() {
        int computeUInt64Size;
        int i8 = this.memoizedSerializedSize;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.count; i10++) {
            int i11 = this.tags[i10];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i11);
            int tagWireType = WireFormat.getTagWireType(i11);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                computeUInt64Size = CodedOutputStream.computeFixed32Size(tagFieldNumber, ((Integer) this.objects[i10]).intValue());
                            } else {
                                throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                            }
                        } else {
                            computeUInt64Size = (CodedOutputStream.computeTagSize(tagFieldNumber) * 2) + ((UnknownFieldSetLite) this.objects[i10]).getSerializedSize();
                        }
                    } else {
                        computeUInt64Size = CodedOutputStream.computeBytesSize(tagFieldNumber, (ByteString) this.objects[i10]);
                    }
                } else {
                    computeUInt64Size = CodedOutputStream.computeFixed64Size(tagFieldNumber, ((Long) this.objects[i10]).longValue());
                }
            } else {
                computeUInt64Size = CodedOutputStream.computeUInt64Size(tagFieldNumber, ((Long) this.objects[i10]).longValue());
            }
            i9 += computeUInt64Size;
        }
        this.memoizedSerializedSize = i9;
        return i9;
    }

    public int getSerializedSizeAsMessageSet() {
        int i8 = this.memoizedSerializedSize;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.count; i10++) {
            i9 += CodedOutputStream.computeRawMessageSetExtensionSize(WireFormat.getTagFieldNumber(this.tags[i10]), (ByteString) this.objects[i10]);
        }
        this.memoizedSerializedSize = i9;
        return i9;
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean mergeFieldFrom(int i8, CodedInputStream codedInputStream) throws IOException {
        checkMutable();
        int tagFieldNumber = WireFormat.getTagFieldNumber(i8);
        int tagWireType = WireFormat.getTagWireType(i8);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType != 4) {
                            if (tagWireType == 5) {
                                storeField(i8, Integer.valueOf(codedInputStream.readFixed32()));
                                return true;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        return false;
                    }
                    UnknownFieldSetLite unknownFieldSetLite = new UnknownFieldSetLite();
                    unknownFieldSetLite.mergeFrom(codedInputStream);
                    codedInputStream.checkLastTagWas(WireFormat.makeTag(tagFieldNumber, 4));
                    storeField(i8, unknownFieldSetLite);
                    return true;
                }
                storeField(i8, codedInputStream.readBytes());
                return true;
            }
            storeField(i8, Long.valueOf(codedInputStream.readFixed64()));
            return true;
        }
        storeField(i8, Long.valueOf(codedInputStream.readInt64()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnknownFieldSetLite mergeLengthDelimitedField(int i8, ByteString byteString) {
        checkMutable();
        if (i8 != 0) {
            storeField(WireFormat.makeTag(i8, 2), byteString);
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnknownFieldSetLite mergeVarintField(int i8, int i9) {
        checkMutable();
        if (i8 != 0) {
            storeField(WireFormat.makeTag(i8, 0), Long.valueOf(i9));
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void printWithIndent(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < this.count; i9++) {
            MessageLiteToString.printField(sb, i8, String.valueOf(WireFormat.getTagFieldNumber(this.tags[i9])), this.objects[i9]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void storeField(int i8, Object obj) {
        checkMutable();
        ensureCapacity(this.count + 1);
        int[] iArr = this.tags;
        int i9 = this.count;
        iArr[i9] = i8;
        this.objects[i9] = obj;
        this.count = i9 + 1;
    }

    public void writeAsMessageSetTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i8 = 0; i8 < this.count; i8++) {
            codedOutputStream.writeRawMessageSetExtension(WireFormat.getTagFieldNumber(this.tags[i8]), (ByteString) this.objects[i8]);
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i8 = 0; i8 < this.count; i8++) {
            int i9 = this.tags[i8];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i9);
            int tagWireType = WireFormat.getTagWireType(i9);
            if (tagWireType == 0) {
                codedOutputStream.writeUInt64(tagFieldNumber, ((Long) this.objects[i8]).longValue());
            } else if (tagWireType == 1) {
                codedOutputStream.writeFixed64(tagFieldNumber, ((Long) this.objects[i8]).longValue());
            } else if (tagWireType == 2) {
                codedOutputStream.writeBytes(tagFieldNumber, (ByteString) this.objects[i8]);
            } else if (tagWireType == 3) {
                codedOutputStream.writeTag(tagFieldNumber, 3);
                ((UnknownFieldSetLite) this.objects[i8]).writeTo(codedOutputStream);
                codedOutputStream.writeTag(tagFieldNumber, 4);
            } else if (tagWireType == 5) {
                codedOutputStream.writeFixed32(tagFieldNumber, ((Integer) this.objects[i8]).intValue());
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    private UnknownFieldSetLite(int i8, int[] iArr, Object[] objArr, boolean z8) {
        this.memoizedSerializedSize = -1;
        this.count = i8;
        this.tags = iArr;
        this.objects = objArr;
        this.isMutable = z8;
    }

    private static int hashCode(Object[] objArr, int i8) {
        int i9 = 17;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 = (i9 * 31) + objArr[i10].hashCode();
        }
        return i9;
    }

    public int hashCode() {
        int i8 = this.count;
        return ((((527 + i8) * 31) + hashCode(this.tags, i8)) * 31) + hashCode(this.objects, this.count);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    public UnknownFieldSetLite mergeFrom(UnknownFieldSetLite unknownFieldSetLite) {
        if (unknownFieldSetLite.equals(getDefaultInstance())) {
            return this;
        }
        checkMutable();
        int i8 = this.count + unknownFieldSetLite.count;
        ensureCapacity(i8);
        System.arraycopy(unknownFieldSetLite.tags, 0, this.tags, this.count, unknownFieldSetLite.count);
        System.arraycopy(unknownFieldSetLite.objects, 0, this.objects, this.count, unknownFieldSetLite.count);
        this.count = i8;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeAsMessageSetTo(Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            for (int i8 = this.count - 1; i8 >= 0; i8--) {
                writer.writeMessageSetItem(WireFormat.getTagFieldNumber(this.tags[i8]), this.objects[i8]);
            }
            return;
        }
        for (int i9 = 0; i9 < this.count; i9++) {
            writer.writeMessageSetItem(WireFormat.getTagFieldNumber(this.tags[i9]), this.objects[i9]);
        }
    }

    public void writeTo(Writer writer) throws IOException {
        if (this.count == 0) {
            return;
        }
        if (writer.fieldOrder() == Writer.FieldOrder.ASCENDING) {
            for (int i8 = 0; i8 < this.count; i8++) {
                writeField(this.tags[i8], this.objects[i8], writer);
            }
            return;
        }
        for (int i9 = this.count - 1; i9 >= 0; i9--) {
            writeField(this.tags[i9], this.objects[i9], writer);
        }
    }
}
