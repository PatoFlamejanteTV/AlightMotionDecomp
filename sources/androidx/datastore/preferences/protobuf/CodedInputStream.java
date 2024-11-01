package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MessageLite;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class CodedInputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    CodedInputStreamReader wrapper;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class ArrayDecoder extends CodedInputStream {
        private final byte[] buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private int limit;
        private int pos;
        private int startPos;

        private void recomputeBufferSizeAfterLimit() {
            int i8 = this.limit + this.bufferSizeAfterLimit;
            this.limit = i8;
            int i9 = i8 - this.startPos;
            int i10 = this.currentLimit;
            if (i9 > i10) {
                int i11 = i9 - i10;
                this.bufferSizeAfterLimit = i11;
                this.limit = i8 - i11;
                return;
            }
            this.bufferSizeAfterLimit = 0;
        }

        private void skipRawVarint() throws IOException {
            if (this.limit - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            for (int i8 = 0; i8 < 10; i8++) {
                byte[] bArr = this.buffer;
                int i9 = this.pos;
                this.pos = i9 + 1;
                if (bArr[i9] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i8 = 0; i8 < 10; i8++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void checkLastTagWas(int i8) throws InvalidProtocolBufferException {
            if (this.lastTag == i8) {
            } else {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void enableAliasing(boolean z8) {
            this.enableAliasing = z8;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i8 = this.currentLimit;
            if (i8 == Integer.MAX_VALUE) {
                return -1;
            }
            return i8 - getTotalBytesRead();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.pos - this.startPos;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            if (this.pos == this.limit) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void popLimit(int i8) {
            this.currentLimit = i8;
            recomputeBufferSizeAfterLimit();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int pushLimit(int i8) throws InvalidProtocolBufferException {
            if (i8 >= 0) {
                int totalBytesRead = i8 + getTotalBytesRead();
                if (totalBytesRead >= 0) {
                    int i9 = this.currentLimit;
                    if (totalBytesRead <= i9) {
                        this.currentLimit = totalBytesRead;
                        recomputeBufferSizeAfterLimit();
                        return i9;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.parseFailure();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            if (readRawVarint64() != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            ByteBuffer wrap;
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i8 = this.limit;
                int i9 = this.pos;
                if (readRawVarint32 <= i8 - i9) {
                    if (!this.immutable && this.enableAliasing) {
                        wrap = ByteBuffer.wrap(this.buffer, i9, readRawVarint32).slice();
                    } else {
                        wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i9, i9 + readRawVarint32));
                    }
                    this.pos += readRawVarint32;
                    return wrap;
                }
            }
            if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
            ByteString copyFrom;
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i8 = this.limit;
                int i9 = this.pos;
                if (readRawVarint32 <= i8 - i9) {
                    if (this.immutable && this.enableAliasing) {
                        copyFrom = ByteString.wrap(this.buffer, i9, readRawVarint32);
                    } else {
                        copyFrom = ByteString.copyFrom(this.buffer, i9, readRawVarint32);
                    }
                    this.pos += readRawVarint32;
                    return copyFrom;
                }
            }
            if (readRawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            return ByteString.wrap(readRawBytes(readRawVarint32));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readGroup(int i8, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i8, 4));
            this.recursionDepth--;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            int i8 = this.pos;
            if (i8 != this.limit) {
                byte[] bArr = this.buffer;
                this.pos = i8 + 1;
                return bArr[i8];
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readRawBytes(int i8) throws IOException {
            if (i8 > 0) {
                int i9 = this.limit;
                int i10 = this.pos;
                if (i8 <= i9 - i10) {
                    int i11 = i8 + i10;
                    this.pos = i11;
                    return Arrays.copyOfRange(this.buffer, i10, i11);
                }
            }
            if (i8 <= 0) {
                if (i8 == 0) {
                    return Internal.EMPTY_BYTE_ARRAY;
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            int i8 = this.pos;
            if (this.limit - i8 >= 4) {
                byte[] bArr = this.buffer;
                this.pos = i8 + 4;
                return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            int i8 = this.pos;
            if (this.limit - i8 >= 8) {
                byte[] bArr = this.buffer;
                this.pos = i8 + 8;
                return ((bArr[i8 + 7] & 255) << 56) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawVarint32() throws IOException {
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
                if (i10 - i11 >= 9) {
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
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawVarint64() throws IOException {
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
                if (i9 - i10 >= 9) {
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
            }
            return readRawVarint64SlowPath();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
            long j8 = 0;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                j8 |= (r3 & Byte.MAX_VALUE) << i8;
                if ((readRawByte() & 128) == 0) {
                    return j8;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readString() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i8 = this.limit;
                int i9 = this.pos;
                if (readRawVarint32 <= i8 - i9) {
                    String str = new String(this.buffer, i9, readRawVarint32, Internal.UTF_8);
                    this.pos += readRawVarint32;
                    return str;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i8 = this.limit;
                int i9 = this.pos;
                if (readRawVarint32 <= i8 - i9) {
                    String decodeUtf8 = Utf8.decodeUtf8(this.buffer, i9, readRawVarint32);
                    this.pos += readRawVarint32;
                    return decodeUtf8;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.lastTag = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i8, MessageLite.Builder builder) throws IOException {
            readGroup(i8, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i8) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i8);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i8), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage() throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipRawBytes(int i8) throws IOException {
            if (i8 >= 0) {
                int i9 = this.limit;
                int i10 = this.pos;
                if (i8 <= i9 - i10) {
                    this.pos = i10 + i8;
                    return;
                }
            }
            if (i8 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        private ArrayDecoder(byte[] bArr, int i8, int i9, boolean z8) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = bArr;
            this.limit = i9 + i8;
            this.pos = i8;
            this.startPos = i8;
            this.immutable = z8;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i8, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i8, 4));
            this.recursionDepth--;
            return parsePartialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i8, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i8);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i8);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            }
            if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i8);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i8);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i8);
                skipMessage(codedOutputStream);
                int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i8), 4);
                checkLastTagWas(makeTag);
                codedOutputStream.writeUInt32NoTag(makeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i8);
                codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return parsePartialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class IterableDirectByteBufferDecoder extends CodedInputStream {
        private int bufferSizeAfterCurrentLimit;
        private long currentAddress;
        private ByteBuffer currentByteBuffer;
        private long currentByteBufferLimit;
        private long currentByteBufferPos;
        private long currentByteBufferStartPos;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private final Iterable<ByteBuffer> input;
        private final Iterator<ByteBuffer> iterator;
        private int lastTag;
        private int startOffset;
        private int totalBufferSize;
        private int totalBytesRead;

        private long currentRemaining() {
            return this.currentByteBufferLimit - this.currentByteBufferPos;
        }

        private void getNextByteBuffer() throws InvalidProtocolBufferException {
            if (this.iterator.hasNext()) {
                tryGetNextByteBuffer();
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        private void readRawBytesTo(byte[] bArr, int i8, int i9) throws IOException {
            if (i9 >= 0 && i9 <= remaining()) {
                int i10 = i9;
                while (i10 > 0) {
                    if (currentRemaining() == 0) {
                        getNextByteBuffer();
                    }
                    int min = Math.min(i10, (int) currentRemaining());
                    long j8 = min;
                    UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, (i9 - i10) + i8, j8);
                    i10 -= min;
                    this.currentByteBufferPos += j8;
                }
                return;
            }
            if (i9 <= 0) {
                if (i9 == 0) {
                    return;
                } else {
                    throw InvalidProtocolBufferException.negativeSize();
                }
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        private void recomputeBufferSizeAfterLimit() {
            int i8 = this.totalBufferSize + this.bufferSizeAfterCurrentLimit;
            this.totalBufferSize = i8;
            int i9 = i8 - this.startOffset;
            int i10 = this.currentLimit;
            if (i9 > i10) {
                int i11 = i9 - i10;
                this.bufferSizeAfterCurrentLimit = i11;
                this.totalBufferSize = i8 - i11;
                return;
            }
            this.bufferSizeAfterCurrentLimit = 0;
        }

        private int remaining() {
            return (int) (((this.totalBufferSize - this.totalBytesRead) - this.currentByteBufferPos) + this.currentByteBufferStartPos);
        }

        private void skipRawVarint() throws IOException {
            for (int i8 = 0; i8 < 10; i8++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private ByteBuffer slice(int i8, int i9) throws IOException {
            int position = this.currentByteBuffer.position();
            int limit = this.currentByteBuffer.limit();
            ByteBuffer byteBuffer = this.currentByteBuffer;
            try {
                try {
                    byteBuffer.position(i8);
                    byteBuffer.limit(i9);
                    return this.currentByteBuffer.slice();
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } finally {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }

        private void tryGetNextByteBuffer() {
            ByteBuffer next = this.iterator.next();
            this.currentByteBuffer = next;
            this.totalBytesRead += (int) (this.currentByteBufferPos - this.currentByteBufferStartPos);
            long position = next.position();
            this.currentByteBufferPos = position;
            this.currentByteBufferStartPos = position;
            this.currentByteBufferLimit = this.currentByteBuffer.limit();
            long addressOffset = UnsafeUtil.addressOffset(this.currentByteBuffer);
            this.currentAddress = addressOffset;
            this.currentByteBufferPos += addressOffset;
            this.currentByteBufferStartPos += addressOffset;
            this.currentByteBufferLimit += addressOffset;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void checkLastTagWas(int i8) throws InvalidProtocolBufferException {
            if (this.lastTag == i8) {
            } else {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void enableAliasing(boolean z8) {
            this.enableAliasing = z8;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i8 = this.currentLimit;
            if (i8 == Integer.MAX_VALUE) {
                return -1;
            }
            return i8 - getTotalBytesRead();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) (((this.totalBytesRead - this.startOffset) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            if ((this.totalBytesRead + this.currentByteBufferPos) - this.currentByteBufferStartPos == this.totalBufferSize) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void popLimit(int i8) {
            this.currentLimit = i8;
            recomputeBufferSizeAfterLimit();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int pushLimit(int i8) throws InvalidProtocolBufferException {
            if (i8 >= 0) {
                int totalBytesRead = i8 + getTotalBytesRead();
                int i9 = this.currentLimit;
                if (totalBytesRead <= i9) {
                    this.currentLimit = totalBytesRead;
                    recomputeBufferSizeAfterLimit();
                    return i9;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            if (readRawVarint64() != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j8 = readRawVarint32;
                if (j8 <= currentRemaining()) {
                    if (!this.immutable && this.enableAliasing) {
                        long j9 = this.currentByteBufferPos + j8;
                        this.currentByteBufferPos = j9;
                        long j10 = this.currentAddress;
                        return slice((int) ((j9 - j10) - j8), (int) (j9 - j10));
                    }
                    byte[] bArr = new byte[readRawVarint32];
                    UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0L, j8);
                    this.currentByteBufferPos += j8;
                    return ByteBuffer.wrap(bArr);
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[readRawVarint32];
                readRawBytesTo(bArr2, 0, readRawVarint32);
                return ByteBuffer.wrap(bArr2);
            }
            if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j8 = readRawVarint32;
                long j9 = this.currentByteBufferLimit;
                long j10 = this.currentByteBufferPos;
                if (j8 <= j9 - j10) {
                    if (this.immutable && this.enableAliasing) {
                        int i8 = (int) (j10 - this.currentAddress);
                        ByteString wrap = ByteString.wrap(slice(i8, readRawVarint32 + i8));
                        this.currentByteBufferPos += j8;
                        return wrap;
                    }
                    byte[] bArr = new byte[readRawVarint32];
                    UnsafeUtil.copyMemory(j10, bArr, 0L, j8);
                    this.currentByteBufferPos += j8;
                    return ByteString.wrap(bArr);
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
                if (this.immutable && this.enableAliasing) {
                    ArrayList arrayList = new ArrayList();
                    while (readRawVarint32 > 0) {
                        if (currentRemaining() == 0) {
                            getNextByteBuffer();
                        }
                        int min = Math.min(readRawVarint32, (int) currentRemaining());
                        int i9 = (int) (this.currentByteBufferPos - this.currentAddress);
                        arrayList.add(ByteString.wrap(slice(i9, i9 + min)));
                        readRawVarint32 -= min;
                        this.currentByteBufferPos += min;
                    }
                    return ByteString.copyFrom(arrayList);
                }
                byte[] bArr2 = new byte[readRawVarint32];
                readRawBytesTo(bArr2, 0, readRawVarint32);
                return ByteString.wrap(bArr2);
            }
            if (readRawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readGroup(int i8, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i8, 4));
            this.recursionDepth--;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            if (currentRemaining() == 0) {
                getNextByteBuffer();
            }
            long j8 = this.currentByteBufferPos;
            this.currentByteBufferPos = 1 + j8;
            return UnsafeUtil.getByte(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readRawBytes(int i8) throws IOException {
            if (i8 >= 0) {
                long j8 = i8;
                if (j8 <= currentRemaining()) {
                    byte[] bArr = new byte[i8];
                    UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0L, j8);
                    this.currentByteBufferPos += j8;
                    return bArr;
                }
            }
            if (i8 >= 0 && i8 <= remaining()) {
                byte[] bArr2 = new byte[i8];
                readRawBytesTo(bArr2, 0, i8);
                return bArr2;
            }
            if (i8 <= 0) {
                if (i8 == 0) {
                    return Internal.EMPTY_BYTE_ARRAY;
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            if (currentRemaining() >= 4) {
                long j8 = this.currentByteBufferPos;
                this.currentByteBufferPos = 4 + j8;
                return ((UnsafeUtil.getByte(j8 + 3) & 255) << 24) | (UnsafeUtil.getByte(j8) & 255) | ((UnsafeUtil.getByte(1 + j8) & 255) << 8) | ((UnsafeUtil.getByte(2 + j8) & 255) << 16);
            }
            return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            if (currentRemaining() >= 8) {
                this.currentByteBufferPos = 8 + this.currentByteBufferPos;
                return ((UnsafeUtil.getByte(r0 + 7) & 255) << 56) | ((UnsafeUtil.getByte(2 + r0) & 255) << 16) | (UnsafeUtil.getByte(r0) & 255) | ((UnsafeUtil.getByte(1 + r0) & 255) << 8) | ((UnsafeUtil.getByte(3 + r0) & 255) << 24) | ((UnsafeUtil.getByte(4 + r0) & 255) << 32) | ((UnsafeUtil.getByte(5 + r0) & 255) << 40) | ((UnsafeUtil.getByte(6 + r0) & 255) << 48);
            }
            return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48) | ((readRawByte() & 255) << 56);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawVarint32() throws IOException {
            int i8;
            long j8 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j8) {
                long j9 = j8 + 1;
                byte b9 = UnsafeUtil.getByte(j8);
                if (b9 >= 0) {
                    this.currentByteBufferPos++;
                    return b9;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j10 = 2 + j8;
                    int i9 = (UnsafeUtil.getByte(j9) << 7) ^ b9;
                    if (i9 < 0) {
                        i8 = i9 ^ (-128);
                    } else {
                        long j11 = 3 + j8;
                        int i10 = (UnsafeUtil.getByte(j10) << 14) ^ i9;
                        if (i10 >= 0) {
                            i8 = i10 ^ 16256;
                        } else {
                            long j12 = 4 + j8;
                            int i11 = i10 ^ (UnsafeUtil.getByte(j11) << 21);
                            if (i11 < 0) {
                                i8 = (-2080896) ^ i11;
                            } else {
                                j11 = 5 + j8;
                                byte b10 = UnsafeUtil.getByte(j12);
                                int i12 = (i11 ^ (b10 << 28)) ^ 266354560;
                                if (b10 < 0) {
                                    j12 = 6 + j8;
                                    if (UnsafeUtil.getByte(j11) < 0) {
                                        j11 = 7 + j8;
                                        if (UnsafeUtil.getByte(j12) < 0) {
                                            j12 = 8 + j8;
                                            if (UnsafeUtil.getByte(j11) < 0) {
                                                j11 = 9 + j8;
                                                if (UnsafeUtil.getByte(j12) < 0) {
                                                    long j13 = j8 + 10;
                                                    if (UnsafeUtil.getByte(j11) >= 0) {
                                                        i8 = i12;
                                                        j10 = j13;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i8 = i12;
                                }
                                i8 = i12;
                            }
                            j10 = j12;
                        }
                        j10 = j11;
                    }
                    this.currentByteBufferPos = j10;
                    return i8;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawVarint64() throws IOException {
            long j8;
            long j9;
            long j10;
            long j11 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j11) {
                long j12 = j11 + 1;
                byte b9 = UnsafeUtil.getByte(j11);
                if (b9 >= 0) {
                    this.currentByteBufferPos++;
                    return b9;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j13 = 2 + j11;
                    int i8 = (UnsafeUtil.getByte(j12) << 7) ^ b9;
                    if (i8 < 0) {
                        j8 = i8 ^ (-128);
                    } else {
                        long j14 = 3 + j11;
                        int i9 = (UnsafeUtil.getByte(j13) << 14) ^ i8;
                        if (i9 >= 0) {
                            j8 = i9 ^ 16256;
                            j13 = j14;
                        } else {
                            long j15 = 4 + j11;
                            int i10 = i9 ^ (UnsafeUtil.getByte(j14) << 21);
                            if (i10 < 0) {
                                j8 = (-2080896) ^ i10;
                                j13 = j15;
                            } else {
                                long j16 = 5 + j11;
                                long j17 = (UnsafeUtil.getByte(j15) << 28) ^ i10;
                                if (j17 >= 0) {
                                    j10 = 266354560;
                                } else {
                                    long j18 = 6 + j11;
                                    long j19 = j17 ^ (UnsafeUtil.getByte(j16) << 35);
                                    if (j19 < 0) {
                                        j9 = -34093383808L;
                                    } else {
                                        j16 = 7 + j11;
                                        j17 = j19 ^ (UnsafeUtil.getByte(j18) << 42);
                                        if (j17 >= 0) {
                                            j10 = 4363953127296L;
                                        } else {
                                            j18 = 8 + j11;
                                            j19 = j17 ^ (UnsafeUtil.getByte(j16) << 49);
                                            if (j19 < 0) {
                                                j9 = -558586000294016L;
                                            } else {
                                                j16 = 9 + j11;
                                                long j20 = (j19 ^ (UnsafeUtil.getByte(j18) << 56)) ^ 71499008037633920L;
                                                if (j20 < 0) {
                                                    long j21 = j11 + 10;
                                                    if (UnsafeUtil.getByte(j16) >= 0) {
                                                        j8 = j20;
                                                        j13 = j21;
                                                    }
                                                } else {
                                                    j8 = j20;
                                                    j13 = j16;
                                                }
                                            }
                                        }
                                    }
                                    j8 = j9 ^ j19;
                                    j13 = j18;
                                }
                                j8 = j10 ^ j17;
                                j13 = j16;
                            }
                        }
                    }
                    this.currentByteBufferPos = j13;
                    return j8;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
            long j8 = 0;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                j8 |= (r3 & Byte.MAX_VALUE) << i8;
                if ((readRawByte() & 128) == 0) {
                    return j8;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readString() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j8 = readRawVarint32;
                long j9 = this.currentByteBufferLimit;
                long j10 = this.currentByteBufferPos;
                if (j8 <= j9 - j10) {
                    byte[] bArr = new byte[readRawVarint32];
                    UnsafeUtil.copyMemory(j10, bArr, 0L, j8);
                    String str = new String(bArr, Internal.UTF_8);
                    this.currentByteBufferPos += j8;
                    return str;
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[readRawVarint32];
                readRawBytesTo(bArr2, 0, readRawVarint32);
                return new String(bArr2, Internal.UTF_8);
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j8 = readRawVarint32;
                long j9 = this.currentByteBufferLimit;
                long j10 = this.currentByteBufferPos;
                if (j8 <= j9 - j10) {
                    String decodeUtf8 = Utf8.decodeUtf8(this.currentByteBuffer, (int) (j10 - this.currentByteBufferStartPos), readRawVarint32);
                    this.currentByteBufferPos += j8;
                    return decodeUtf8;
                }
            }
            if (readRawVarint32 >= 0 && readRawVarint32 <= remaining()) {
                byte[] bArr = new byte[readRawVarint32];
                readRawBytesTo(bArr, 0, readRawVarint32);
                return Utf8.decodeUtf8(bArr, 0, readRawVarint32);
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.lastTag = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i8, MessageLite.Builder builder) throws IOException {
            readGroup(i8, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startOffset = (int) ((this.totalBytesRead + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i8) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i8);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i8), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage() throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipRawBytes(int i8) throws IOException {
            if (i8 >= 0 && i8 <= ((this.totalBufferSize - this.totalBytesRead) - this.currentByteBufferPos) + this.currentByteBufferStartPos) {
                while (i8 > 0) {
                    if (currentRemaining() == 0) {
                        getNextByteBuffer();
                    }
                    int min = Math.min(i8, (int) currentRemaining());
                    i8 -= min;
                    this.currentByteBufferPos += min;
                }
                return;
            }
            if (i8 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        private IterableDirectByteBufferDecoder(Iterable<ByteBuffer> iterable, int i8, boolean z8) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.totalBufferSize = i8;
            this.input = iterable;
            this.iterator = iterable.iterator();
            this.immutable = z8;
            this.totalBytesRead = 0;
            this.startOffset = 0;
            if (i8 == 0) {
                this.currentByteBuffer = Internal.EMPTY_BYTE_BUFFER;
                this.currentByteBufferPos = 0L;
                this.currentByteBufferStartPos = 0L;
                this.currentByteBufferLimit = 0L;
                this.currentAddress = 0L;
                return;
            }
            tryGetNextByteBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i8, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i8, 4));
            this.recursionDepth--;
            return parsePartialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i8, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i8);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i8);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            }
            if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i8);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i8);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i8);
                skipMessage(codedOutputStream);
                int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i8), 4);
                checkLastTagWas(makeTag);
                codedOutputStream.writeUInt32NoTag(makeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i8);
                codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return parsePartialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class StreamDecoder extends CodedInputStream {
        private final byte[] buffer;
        private int bufferSize;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private final InputStream input;
        private int lastTag;
        private int pos;
        private RefillCallback refillCallback;
        private int totalBytesRetired;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public interface RefillCallback {
            void onRefill();
        }

        /* loaded from: classes3.dex */
        private class SkippedDataSink implements RefillCallback {
            private ByteArrayOutputStream byteArrayStream;
            private int lastPos;

            private SkippedDataSink() {
                this.lastPos = StreamDecoder.this.pos;
            }

            ByteBuffer getSkippedData() {
                ByteArrayOutputStream byteArrayOutputStream = this.byteArrayStream;
                if (byteArrayOutputStream == null) {
                    return ByteBuffer.wrap(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos - this.lastPos);
                }
                byteArrayOutputStream.write(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos);
                return ByteBuffer.wrap(this.byteArrayStream.toByteArray());
            }

            @Override // androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.RefillCallback
            public void onRefill() {
                if (this.byteArrayStream == null) {
                    this.byteArrayStream = new ByteArrayOutputStream();
                }
                this.byteArrayStream.write(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos - this.lastPos);
                this.lastPos = 0;
            }
        }

        private static int available(InputStream inputStream) throws IOException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e8) {
                e8.setThrownFromInputStream();
                throw e8;
            }
        }

        private static int read(InputStream inputStream, byte[] bArr, int i8, int i9) throws IOException {
            try {
                return inputStream.read(bArr, i8, i9);
            } catch (InvalidProtocolBufferException e8) {
                e8.setThrownFromInputStream();
                throw e8;
            }
        }

        private ByteString readBytesSlowPath(int i8) throws IOException {
            byte[] readRawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i8);
            if (readRawBytesSlowPathOneChunk != null) {
                return ByteString.copyFrom(readRawBytesSlowPathOneChunk);
            }
            int i9 = this.pos;
            int i10 = this.bufferSize;
            int i11 = i10 - i9;
            this.totalBytesRetired += i10;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> readRawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i8 - i11);
            byte[] bArr = new byte[i8];
            System.arraycopy(this.buffer, i9, bArr, 0, i11);
            for (byte[] bArr2 : readRawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
                i11 += bArr2.length;
            }
            return ByteString.wrap(bArr);
        }

        private byte[] readRawBytesSlowPath(int i8, boolean z8) throws IOException {
            byte[] readRawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i8);
            if (readRawBytesSlowPathOneChunk != null) {
                if (z8) {
                    return (byte[]) readRawBytesSlowPathOneChunk.clone();
                }
                return readRawBytesSlowPathOneChunk;
            }
            int i9 = this.pos;
            int i10 = this.bufferSize;
            int i11 = i10 - i9;
            this.totalBytesRetired += i10;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> readRawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i8 - i11);
            byte[] bArr = new byte[i8];
            System.arraycopy(this.buffer, i9, bArr, 0, i11);
            for (byte[] bArr2 : readRawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
                i11 += bArr2.length;
            }
            return bArr;
        }

        private byte[] readRawBytesSlowPathOneChunk(int i8) throws IOException {
            if (i8 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            if (i8 >= 0) {
                int i9 = this.totalBytesRetired;
                int i10 = this.pos;
                int i11 = i9 + i10 + i8;
                if (i11 - this.sizeLimit <= 0) {
                    int i12 = this.currentLimit;
                    if (i11 <= i12) {
                        int i13 = this.bufferSize - i10;
                        int i14 = i8 - i13;
                        if (i14 >= 4096 && i14 > available(this.input)) {
                            return null;
                        }
                        byte[] bArr = new byte[i8];
                        System.arraycopy(this.buffer, this.pos, bArr, 0, i13);
                        this.totalBytesRetired += this.bufferSize;
                        this.pos = 0;
                        this.bufferSize = 0;
                        while (i13 < i8) {
                            int read = read(this.input, bArr, i13, i8 - i13);
                            if (read != -1) {
                                this.totalBytesRetired += read;
                                i13 += read;
                            } else {
                                throw InvalidProtocolBufferException.truncatedMessage();
                            }
                        }
                        return bArr;
                    }
                    skipRawBytes((i12 - i9) - i10);
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        private List<byte[]> readRawBytesSlowPathRemainingChunks(int i8) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i8 > 0) {
                int min = Math.min(i8, 4096);
                byte[] bArr = new byte[min];
                int i9 = 0;
                while (i9 < min) {
                    int read = this.input.read(bArr, i9, min - i9);
                    if (read != -1) {
                        this.totalBytesRetired += read;
                        i9 += read;
                    } else {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                }
                i8 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i8 = this.bufferSize + this.bufferSizeAfterLimit;
            this.bufferSize = i8;
            int i9 = this.totalBytesRetired + i8;
            int i10 = this.currentLimit;
            if (i9 > i10) {
                int i11 = i9 - i10;
                this.bufferSizeAfterLimit = i11;
                this.bufferSize = i8 - i11;
                return;
            }
            this.bufferSizeAfterLimit = 0;
        }

        private void refillBuffer(int i8) throws IOException {
            if (!tryRefillBuffer(i8)) {
                if (i8 > (this.sizeLimit - this.totalBytesRetired) - this.pos) {
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        private static long skip(InputStream inputStream, long j8) throws IOException {
            try {
                return inputStream.skip(j8);
            } catch (InvalidProtocolBufferException e8) {
                e8.setThrownFromInputStream();
                throw e8;
            }
        }

        private void skipRawBytesSlowPath(int i8) throws IOException {
            if (i8 >= 0) {
                int i9 = this.totalBytesRetired;
                int i10 = this.pos;
                int i11 = i9 + i10 + i8;
                int i12 = this.currentLimit;
                if (i11 <= i12) {
                    int i13 = 0;
                    if (this.refillCallback == null) {
                        this.totalBytesRetired = i9 + i10;
                        int i14 = this.bufferSize - i10;
                        this.bufferSize = 0;
                        this.pos = 0;
                        i13 = i14;
                        while (i13 < i8) {
                            try {
                                long j8 = i8 - i13;
                                long skip = skip(this.input, j8);
                                if (skip >= 0 && skip <= j8) {
                                    if (skip == 0) {
                                        break;
                                    } else {
                                        i13 += (int) skip;
                                    }
                                } else {
                                    throw new IllegalStateException(this.input.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                                }
                            } finally {
                                this.totalBytesRetired += i13;
                                recomputeBufferSizeAfterLimit();
                            }
                        }
                    }
                    if (i13 < i8) {
                        int i15 = this.bufferSize;
                        int i16 = i15 - this.pos;
                        this.pos = i15;
                        refillBuffer(1);
                        while (true) {
                            int i17 = i8 - i16;
                            int i18 = this.bufferSize;
                            if (i17 > i18) {
                                i16 += i18;
                                this.pos = i18;
                                refillBuffer(1);
                            } else {
                                this.pos = i17;
                                return;
                            }
                        }
                    }
                } else {
                    skipRawBytes((i12 - i9) - i10);
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } else {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        private void skipRawVarint() throws IOException {
            if (this.bufferSize - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            for (int i8 = 0; i8 < 10; i8++) {
                byte[] bArr = this.buffer;
                int i9 = this.pos;
                this.pos = i9 + 1;
                if (bArr[i9] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i8 = 0; i8 < 10; i8++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private boolean tryRefillBuffer(int i8) throws IOException {
            int i9 = this.pos;
            if (i9 + i8 > this.bufferSize) {
                int i10 = this.sizeLimit;
                int i11 = this.totalBytesRetired;
                if (i8 > (i10 - i11) - i9 || i11 + i9 + i8 > this.currentLimit) {
                    return false;
                }
                RefillCallback refillCallback = this.refillCallback;
                if (refillCallback != null) {
                    refillCallback.onRefill();
                }
                int i12 = this.pos;
                if (i12 > 0) {
                    int i13 = this.bufferSize;
                    if (i13 > i12) {
                        byte[] bArr = this.buffer;
                        System.arraycopy(bArr, i12, bArr, 0, i13 - i12);
                    }
                    this.totalBytesRetired += i12;
                    this.bufferSize -= i12;
                    this.pos = 0;
                }
                InputStream inputStream = this.input;
                byte[] bArr2 = this.buffer;
                int i14 = this.bufferSize;
                int read = read(inputStream, bArr2, i14, Math.min(bArr2.length - i14, (this.sizeLimit - this.totalBytesRetired) - i14));
                if (read != 0 && read >= -1 && read <= this.buffer.length) {
                    if (read <= 0) {
                        return false;
                    }
                    this.bufferSize += read;
                    recomputeBufferSizeAfterLimit();
                    if (this.bufferSize >= i8) {
                        return true;
                    }
                    return tryRefillBuffer(i8);
                }
                throw new IllegalStateException(this.input.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            throw new IllegalStateException("refillBuffer() called when " + i8 + " bytes were already available in buffer");
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void checkLastTagWas(int i8) throws InvalidProtocolBufferException {
            if (this.lastTag == i8) {
            } else {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void enableAliasing(boolean z8) {
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i8 = this.currentLimit;
            if (i8 == Integer.MAX_VALUE) {
                return -1;
            }
            return i8 - (this.totalBytesRetired + this.pos);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.totalBytesRetired + this.pos;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            if (this.pos == this.bufferSize && !tryRefillBuffer(1)) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void popLimit(int i8) {
            this.currentLimit = i8;
            recomputeBufferSizeAfterLimit();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int pushLimit(int i8) throws InvalidProtocolBufferException {
            if (i8 >= 0) {
                int i9 = i8 + this.totalBytesRetired + this.pos;
                int i10 = this.currentLimit;
                if (i9 <= i10) {
                    this.currentLimit = i9;
                    recomputeBufferSizeAfterLimit();
                    return i10;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            if (readRawVarint64() != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            int readRawVarint32 = readRawVarint32();
            int i8 = this.bufferSize;
            int i9 = this.pos;
            if (readRawVarint32 <= i8 - i9 && readRawVarint32 > 0) {
                byte[] copyOfRange = Arrays.copyOfRange(this.buffer, i9, i9 + readRawVarint32);
                this.pos += readRawVarint32;
                return copyOfRange;
            }
            return readRawBytesSlowPath(readRawVarint32, false);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            int readRawVarint32 = readRawVarint32();
            int i8 = this.bufferSize;
            int i9 = this.pos;
            if (readRawVarint32 <= i8 - i9 && readRawVarint32 > 0) {
                ByteBuffer wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i9, i9 + readRawVarint32));
                this.pos += readRawVarint32;
                return wrap;
            }
            if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            return ByteBuffer.wrap(readRawBytesSlowPath(readRawVarint32, true));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
            int readRawVarint32 = readRawVarint32();
            int i8 = this.bufferSize;
            int i9 = this.pos;
            if (readRawVarint32 <= i8 - i9 && readRawVarint32 > 0) {
                ByteString copyFrom = ByteString.copyFrom(this.buffer, i9, readRawVarint32);
                this.pos += readRawVarint32;
                return copyFrom;
            }
            if (readRawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            return readBytesSlowPath(readRawVarint32);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readGroup(int i8, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i8, 4));
            this.recursionDepth--;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            if (this.pos == this.bufferSize) {
                refillBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i8 = this.pos;
            this.pos = i8 + 1;
            return bArr[i8];
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readRawBytes(int i8) throws IOException {
            int i9 = this.pos;
            if (i8 <= this.bufferSize - i9 && i8 > 0) {
                int i10 = i8 + i9;
                this.pos = i10;
                return Arrays.copyOfRange(this.buffer, i9, i10);
            }
            return readRawBytesSlowPath(i8, false);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            int i8 = this.pos;
            if (this.bufferSize - i8 < 4) {
                refillBuffer(4);
                i8 = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i8 + 4;
            return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            int i8 = this.pos;
            if (this.bufferSize - i8 < 8) {
                refillBuffer(8);
                i8 = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i8 + 8;
            return ((bArr[i8 + 7] & 255) << 56) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawVarint32() throws IOException {
            int i8;
            int i9 = this.pos;
            int i10 = this.bufferSize;
            if (i10 != i9) {
                byte[] bArr = this.buffer;
                int i11 = i9 + 1;
                byte b9 = bArr[i9];
                if (b9 >= 0) {
                    this.pos = i11;
                    return b9;
                }
                if (i10 - i11 >= 9) {
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
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawVarint64() throws IOException {
            long j8;
            long j9;
            long j10;
            int i8 = this.pos;
            int i9 = this.bufferSize;
            if (i9 != i8) {
                byte[] bArr = this.buffer;
                int i10 = i8 + 1;
                byte b9 = bArr[i8];
                if (b9 >= 0) {
                    this.pos = i10;
                    return b9;
                }
                if (i9 - i10 >= 9) {
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
            }
            return readRawVarint64SlowPath();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
            long j8 = 0;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                j8 |= (r3 & Byte.MAX_VALUE) << i8;
                if ((readRawByte() & 128) == 0) {
                    return j8;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readString() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i8 = this.bufferSize;
                int i9 = this.pos;
                if (readRawVarint32 <= i8 - i9) {
                    String str = new String(this.buffer, i9, readRawVarint32, Internal.UTF_8);
                    this.pos += readRawVarint32;
                    return str;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= this.bufferSize) {
                refillBuffer(readRawVarint32);
                String str2 = new String(this.buffer, this.pos, readRawVarint32, Internal.UTF_8);
                this.pos += readRawVarint32;
                return str2;
            }
            return new String(readRawBytesSlowPath(readRawVarint32, false), Internal.UTF_8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            byte[] readRawBytesSlowPath;
            int readRawVarint32 = readRawVarint32();
            int i8 = this.pos;
            int i9 = this.bufferSize;
            if (readRawVarint32 <= i9 - i8 && readRawVarint32 > 0) {
                readRawBytesSlowPath = this.buffer;
                this.pos = i8 + readRawVarint32;
            } else {
                if (readRawVarint32 == 0) {
                    return "";
                }
                i8 = 0;
                if (readRawVarint32 <= i9) {
                    refillBuffer(readRawVarint32);
                    readRawBytesSlowPath = this.buffer;
                    this.pos = readRawVarint32;
                } else {
                    readRawBytesSlowPath = readRawBytesSlowPath(readRawVarint32, false);
                }
            }
            return Utf8.decodeUtf8(readRawBytesSlowPath, i8, readRawVarint32);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.lastTag = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i8, MessageLite.Builder builder) throws IOException {
            readGroup(i8, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.totalBytesRetired = -this.pos;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i8) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i8);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i8), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage() throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipRawBytes(int i8) throws IOException {
            int i9 = this.bufferSize;
            int i10 = this.pos;
            if (i8 <= i9 - i10 && i8 >= 0) {
                this.pos = i10 + i8;
            } else {
                skipRawBytesSlowPath(i8);
            }
        }

        private StreamDecoder(InputStream inputStream, int i8) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.refillCallback = null;
            Internal.checkNotNull(inputStream, "input");
            this.input = inputStream;
            this.buffer = new byte[i8];
            this.bufferSize = 0;
            this.pos = 0;
            this.totalBytesRetired = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i8, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i8, 4));
            this.recursionDepth--;
            return parsePartialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i8, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i8);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i8);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            }
            if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i8);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i8);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i8);
                skipMessage(codedOutputStream);
                int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i8), 4);
                checkLastTagWas(makeTag);
                codedOutputStream.writeUInt32NoTag(makeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i8);
                codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return parsePartialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class UnsafeDirectNioDecoder extends CodedInputStream {
        private final long address;
        private final ByteBuffer buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private long limit;
        private long pos;
        private long startPos;

        private int bufferPos(long j8) {
            return (int) (j8 - this.address);
        }

        static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void recomputeBufferSizeAfterLimit() {
            long j8 = this.limit + this.bufferSizeAfterLimit;
            this.limit = j8;
            int i8 = (int) (j8 - this.startPos);
            int i9 = this.currentLimit;
            if (i8 > i9) {
                int i10 = i8 - i9;
                this.bufferSizeAfterLimit = i10;
                this.limit = j8 - i10;
                return;
            }
            this.bufferSizeAfterLimit = 0;
        }

        private int remaining() {
            return (int) (this.limit - this.pos);
        }

        private void skipRawVarint() throws IOException {
            if (remaining() >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            for (int i8 = 0; i8 < 10; i8++) {
                long j8 = this.pos;
                this.pos = 1 + j8;
                if (UnsafeUtil.getByte(j8) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i8 = 0; i8 < 10; i8++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private ByteBuffer slice(long j8, long j9) throws IOException {
            int position = this.buffer.position();
            int limit = this.buffer.limit();
            ByteBuffer byteBuffer = this.buffer;
            try {
                try {
                    byteBuffer.position(bufferPos(j8));
                    byteBuffer.limit(bufferPos(j9));
                    return this.buffer.slice();
                } catch (IllegalArgumentException e8) {
                    InvalidProtocolBufferException truncatedMessage = InvalidProtocolBufferException.truncatedMessage();
                    truncatedMessage.initCause(e8);
                    throw truncatedMessage;
                }
            } finally {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void checkLastTagWas(int i8) throws InvalidProtocolBufferException {
            if (this.lastTag == i8) {
            } else {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void enableAliasing(boolean z8) {
            this.enableAliasing = z8;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i8 = this.currentLimit;
            if (i8 == Integer.MAX_VALUE) {
                return -1;
            }
            return i8 - getTotalBytesRead();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) (this.pos - this.startPos);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            if (this.pos == this.limit) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void popLimit(int i8) {
            this.currentLimit = i8;
            recomputeBufferSizeAfterLimit();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int pushLimit(int i8) throws InvalidProtocolBufferException {
            if (i8 >= 0) {
                int totalBytesRead = i8 + getTotalBytesRead();
                int i9 = this.currentLimit;
                if (totalBytesRead <= i9) {
                    this.currentLimit = totalBytesRead;
                    recomputeBufferSizeAfterLimit();
                    return i9;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            if (readRawVarint64() != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
                if (!this.immutable && this.enableAliasing) {
                    long j8 = this.pos;
                    long j9 = readRawVarint32;
                    ByteBuffer slice = slice(j8, j8 + j9);
                    this.pos += j9;
                    return slice;
                }
                byte[] bArr = new byte[readRawVarint32];
                long j10 = readRawVarint32;
                UnsafeUtil.copyMemory(this.pos, bArr, 0L, j10);
                this.pos += j10;
                return ByteBuffer.wrap(bArr);
            }
            if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
                if (this.immutable && this.enableAliasing) {
                    long j8 = this.pos;
                    long j9 = readRawVarint32;
                    ByteBuffer slice = slice(j8, j8 + j9);
                    this.pos += j9;
                    return ByteString.wrap(slice);
                }
                byte[] bArr = new byte[readRawVarint32];
                long j10 = readRawVarint32;
                UnsafeUtil.copyMemory(this.pos, bArr, 0L, j10);
                this.pos += j10;
                return ByteString.wrap(bArr);
            }
            if (readRawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readGroup(int i8, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i8, 4));
            this.recursionDepth--;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            long j8 = this.pos;
            if (j8 != this.limit) {
                this.pos = 1 + j8;
                return UnsafeUtil.getByte(j8);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readRawBytes(int i8) throws IOException {
            if (i8 >= 0 && i8 <= remaining()) {
                byte[] bArr = new byte[i8];
                long j8 = this.pos;
                long j9 = i8;
                slice(j8, j8 + j9).get(bArr);
                this.pos += j9;
                return bArr;
            }
            if (i8 <= 0) {
                if (i8 == 0) {
                    return Internal.EMPTY_BYTE_ARRAY;
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            long j8 = this.pos;
            if (this.limit - j8 >= 4) {
                this.pos = 4 + j8;
                return ((UnsafeUtil.getByte(j8 + 3) & 255) << 24) | (UnsafeUtil.getByte(j8) & 255) | ((UnsafeUtil.getByte(1 + j8) & 255) << 8) | ((UnsafeUtil.getByte(2 + j8) & 255) << 16);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            long j8 = this.pos;
            if (this.limit - j8 >= 8) {
                this.pos = 8 + j8;
                return ((UnsafeUtil.getByte(j8 + 7) & 255) << 56) | (UnsafeUtil.getByte(j8) & 255) | ((UnsafeUtil.getByte(1 + j8) & 255) << 8) | ((UnsafeUtil.getByte(2 + j8) & 255) << 16) | ((UnsafeUtil.getByte(3 + j8) & 255) << 24) | ((UnsafeUtil.getByte(4 + j8) & 255) << 32) | ((UnsafeUtil.getByte(5 + j8) & 255) << 40) | ((UnsafeUtil.getByte(6 + j8) & 255) << 48);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r3) < 0) goto L34;     */
        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int readRawVarint32() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.pos
                long r2 = r10.limit
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r0)
                if (r4 < 0) goto L16
                r10.pos = r2
                return r4
            L16:
                long r5 = r10.limit
                long r5 = r5 - r2
                r7 = 9
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r10.readRawVarint64SlowPath()
                int r1 = (int) r0
                return r1
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r10.pos = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.CodedInputStream.UnsafeDirectNioDecoder.readRawVarint32():int");
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawVarint64() throws IOException {
            long j8;
            long j9;
            long j10;
            int i8;
            long j11 = this.pos;
            if (this.limit != j11) {
                long j12 = 1 + j11;
                byte b9 = UnsafeUtil.getByte(j11);
                if (b9 >= 0) {
                    this.pos = j12;
                    return b9;
                }
                if (this.limit - j12 >= 9) {
                    long j13 = 2 + j11;
                    int i9 = (UnsafeUtil.getByte(j12) << 7) ^ b9;
                    if (i9 < 0) {
                        i8 = i9 ^ (-128);
                    } else {
                        long j14 = 3 + j11;
                        int i10 = i9 ^ (UnsafeUtil.getByte(j13) << 14);
                        if (i10 >= 0) {
                            j8 = i10 ^ 16256;
                            j13 = j14;
                        } else {
                            j13 = 4 + j11;
                            int i11 = i10 ^ (UnsafeUtil.getByte(j14) << 21);
                            if (i11 < 0) {
                                i8 = (-2080896) ^ i11;
                            } else {
                                long j15 = 5 + j11;
                                long j16 = i11 ^ (UnsafeUtil.getByte(j13) << 28);
                                if (j16 >= 0) {
                                    j10 = 266354560;
                                } else {
                                    long j17 = 6 + j11;
                                    long j18 = j16 ^ (UnsafeUtil.getByte(j15) << 35);
                                    if (j18 < 0) {
                                        j9 = -34093383808L;
                                    } else {
                                        j15 = 7 + j11;
                                        j16 = j18 ^ (UnsafeUtil.getByte(j17) << 42);
                                        if (j16 >= 0) {
                                            j10 = 4363953127296L;
                                        } else {
                                            j17 = 8 + j11;
                                            j18 = j16 ^ (UnsafeUtil.getByte(j15) << 49);
                                            if (j18 < 0) {
                                                j9 = -558586000294016L;
                                            } else {
                                                long j19 = j11 + 9;
                                                long j20 = (j18 ^ (UnsafeUtil.getByte(j17) << 56)) ^ 71499008037633920L;
                                                if (j20 < 0) {
                                                    long j21 = j11 + 10;
                                                    if (UnsafeUtil.getByte(j19) >= 0) {
                                                        j13 = j21;
                                                        j8 = j20;
                                                    }
                                                } else {
                                                    j8 = j20;
                                                    j13 = j19;
                                                }
                                            }
                                        }
                                    }
                                    j8 = j9 ^ j18;
                                    j13 = j17;
                                }
                                j8 = j10 ^ j16;
                                j13 = j15;
                            }
                        }
                        this.pos = j13;
                        return j8;
                    }
                    j8 = i8;
                    this.pos = j13;
                    return j8;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
            long j8 = 0;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                j8 |= (r3 & Byte.MAX_VALUE) << i8;
                if ((readRawByte() & 128) == 0) {
                    return j8;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readString() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
                byte[] bArr = new byte[readRawVarint32];
                long j8 = readRawVarint32;
                UnsafeUtil.copyMemory(this.pos, bArr, 0L, j8);
                String str = new String(bArr, Internal.UTF_8);
                this.pos += j8;
                return str;
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
                String decodeUtf8 = Utf8.decodeUtf8(this.buffer, bufferPos(this.pos), readRawVarint32);
                this.pos += readRawVarint32;
                return decodeUtf8;
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.lastTag = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i8, MessageLite.Builder builder) throws IOException {
            readGroup(i8, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i8) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i8);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i8), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage() throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipRawBytes(int i8) throws IOException {
            if (i8 >= 0 && i8 <= remaining()) {
                this.pos += i8;
            } else {
                if (i8 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        private UnsafeDirectNioDecoder(ByteBuffer byteBuffer, boolean z8) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = byteBuffer;
            long addressOffset = UnsafeUtil.addressOffset(byteBuffer);
            this.address = addressOffset;
            this.limit = byteBuffer.limit() + addressOffset;
            long position = addressOffset + byteBuffer.position();
            this.pos = position;
            this.startPos = position;
            this.immutable = z8;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i8, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i8, 4));
            this.recursionDepth--;
            return parsePartialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i8, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i8);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i8);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            }
            if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i8);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i8);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i8);
                skipMessage(codedOutputStream);
                int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i8), 4);
                checkLastTagWas(makeTag);
                codedOutputStream.writeUInt32NoTag(makeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i8);
                codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return parsePartialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public static int decodeZigZag32(int i8) {
        return (-(i8 & 1)) ^ (i8 >>> 1);
    }

    public static long decodeZigZag64(long j8) {
        return (-(j8 & 1)) ^ (j8 >>> 1);
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    public static int readRawVarint32(int i8, InputStream inputStream) throws IOException {
        if ((i8 & 128) == 0) {
            return i8;
        }
        int i9 = i8 & ModuleDescriptor.MODULE_VERSION;
        int i10 = 7;
        while (i10 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i9 |= (read & ModuleDescriptor.MODULE_VERSION) << i10;
            if ((read & 128) == 0) {
                return i9;
            }
            i10 += 7;
        }
        while (i10 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((read2 & 128) == 0) {
                return i9;
            }
            i10 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public abstract void checkLastTagWas(int i8) throws InvalidProtocolBufferException;

    public void checkRecursionLimit() throws InvalidProtocolBufferException {
        if (this.recursionDepth < this.recursionLimit) {
        } else {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    final void discardUnknownFields() {
        this.shouldDiscardUnknownFields = true;
    }

    public abstract void enableAliasing(boolean z8);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws IOException;

    public abstract void popLimit(int i8);

    public abstract int pushLimit(int i8) throws InvalidProtocolBufferException;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract ByteString readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract <T extends MessageLite> T readGroup(int i8, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract void readGroup(int i8, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract byte readRawByte() throws IOException;

    public abstract byte[] readRawBytes(int i8) throws IOException;

    public abstract int readRawLittleEndian32() throws IOException;

    public abstract long readRawLittleEndian64() throws IOException;

    public abstract int readRawVarint32() throws IOException;

    public abstract long readRawVarint64() throws IOException;

    abstract long readRawVarint64SlowPath() throws IOException;

    public abstract int readSFixed32() throws IOException;

    public abstract long readSFixed64() throws IOException;

    public abstract int readSInt32() throws IOException;

    public abstract long readSInt64() throws IOException;

    public abstract String readString() throws IOException;

    public abstract String readStringRequireUtf8() throws IOException;

    public abstract int readTag() throws IOException;

    public abstract int readUInt32() throws IOException;

    public abstract long readUInt64() throws IOException;

    @Deprecated
    public abstract void readUnknownGroup(int i8, MessageLite.Builder builder) throws IOException;

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int i8) {
        if (i8 >= 0) {
            int i9 = this.recursionLimit;
            this.recursionLimit = i8;
            return i9;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i8);
    }

    public final int setSizeLimit(int i8) {
        if (i8 >= 0) {
            int i9 = this.sizeLimit;
            this.sizeLimit = i8;
            return i9;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean shouldDiscardUnknownFields() {
        return this.shouldDiscardUnknownFields;
    }

    public abstract boolean skipField(int i8) throws IOException;

    @Deprecated
    public abstract boolean skipField(int i8, CodedOutputStream codedOutputStream) throws IOException;

    public abstract void skipMessage() throws IOException;

    public abstract void skipMessage(CodedOutputStream codedOutputStream) throws IOException;

    public abstract void skipRawBytes(int i8) throws IOException;

    final void unsetDiscardUnknownFields() {
        this.shouldDiscardUnknownFields = false;
    }

    private CodedInputStream() {
        this.recursionLimit = defaultRecursionLimit;
        this.sizeLimit = Integer.MAX_VALUE;
        this.shouldDiscardUnknownFields = false;
    }

    public static CodedInputStream newInstance(InputStream inputStream, int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        }
        if (inputStream == null) {
            return newInstance(Internal.EMPTY_BYTE_ARRAY);
        }
        return new StreamDecoder(inputStream, i8);
    }

    public static CodedInputStream newInstance(Iterable<ByteBuffer> iterable) {
        if (!UnsafeDirectNioDecoder.isSupported()) {
            return newInstance(new IterableByteBufferInputStream(iterable));
        }
        return newInstance(iterable, false);
    }

    static int readRawVarint32(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return readRawVarint32(read, inputStream);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CodedInputStream newInstance(Iterable<ByteBuffer> iterable, boolean z8) {
        int i8 = 0;
        int i9 = 0;
        for (ByteBuffer byteBuffer : iterable) {
            i9 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i8 |= 1;
            } else {
                i8 = byteBuffer.isDirect() ? i8 | 2 : i8 | 4;
            }
        }
        if (i8 == 2) {
            return new IterableDirectByteBufferDecoder(iterable, i9, z8);
        }
        return newInstance(new IterableByteBufferInputStream(iterable));
    }

    public static CodedInputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedInputStream newInstance(byte[] bArr, int i8, int i9) {
        return newInstance(bArr, i8, i9, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CodedInputStream newInstance(byte[] bArr, int i8, int i9, boolean z8) {
        ArrayDecoder arrayDecoder = new ArrayDecoder(bArr, i8, i9, z8);
        try {
            arrayDecoder.pushLimit(i9);
            return arrayDecoder;
        } catch (InvalidProtocolBufferException e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer) {
        return newInstance(byteBuffer, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CodedInputStream newInstance(ByteBuffer byteBuffer, boolean z8) {
        if (byteBuffer.hasArray()) {
            return newInstance(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z8);
        }
        if (byteBuffer.isDirect() && UnsafeDirectNioDecoder.isSupported()) {
            return new UnsafeDirectNioDecoder(byteBuffer, z8);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return newInstance(bArr, 0, remaining, true);
    }
}
