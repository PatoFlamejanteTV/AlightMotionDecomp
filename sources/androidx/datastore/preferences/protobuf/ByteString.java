package androidx.datastore.preferences.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

@CheckReturnValue
/* loaded from: classes3.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final ByteString EMPTY = new LiteralByteString(Internal.EMPTY_BYTE_ARRAY);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<ByteString> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final ByteArrayCopier byteArrayCopier;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    /* loaded from: classes3.dex */
    static abstract class AbstractByteIterator implements ByteIterator {
        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    /* loaded from: classes3.dex */
    private static final class ArraysByteArrayCopier implements ByteArrayCopier {
        private ArraysByteArrayCopier() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] bArr, int i8, int i9) {
            return Arrays.copyOfRange(bArr, i8, i9 + i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        BoundedByteString(byte[] bArr, int i8, int i9) {
            super(bArr);
            ByteString.checkRange(i8, i8 + i9, bArr.length);
            this.bytesOffset = i8;
            this.bytesLength = i9;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public byte byteAt(int i8) {
            ByteString.checkIndex(i8, size());
            return this.bytes[this.bytesOffset + i8];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        protected void copyToInternal(byte[] bArr, int i8, int i9, int i10) {
            System.arraycopy(this.bytes, getOffsetIntoBytes() + i8, bArr, i9, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString
        protected int getOffsetIntoBytes() {
            return this.bytesOffset;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        byte internalByteAt(int i8) {
            return this.bytes[this.bytesOffset + i8];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.bytesLength;
        }

        Object writeReplace() {
            return ByteString.wrap(toByteArray());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public interface ByteArrayCopier {
        byte[] copyFrom(byte[] bArr, int i8, int i9);
    }

    /* loaded from: classes3.dex */
    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    /* loaded from: classes3.dex */
    static final class CodedBuilder {
        private final byte[] buffer;
        private final CodedOutputStream output;

        public ByteString build() {
            this.output.checkNoSpaceLeft();
            return new LiteralByteString(this.buffer);
        }

        public CodedOutputStream getCodedOutput() {
            return this.output;
        }

        private CodedBuilder(int i8) {
            byte[] bArr = new byte[i8];
            this.buffer = bArr;
            this.output = CodedOutputStream.newInstance(bArr);
        }
    }

    /* loaded from: classes3.dex */
    static abstract class LeafByteString extends ByteString {
        private static final long serialVersionUID = 1;

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract boolean equalsRange(ByteString byteString, int i8, int i9);

        @Override // androidx.datastore.preferences.protobuf.ByteString
        protected final int getTreeDepth() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        protected final boolean isBalanced() {
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        void writeToReverse(ByteOutput byteOutput) throws IOException {
            writeTo(byteOutput);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte byteAt(int i8) {
            return this.bytes[i8];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        protected void copyToInternal(byte[] bArr, int i8, int i9, int i10) {
            System.arraycopy(this.bytes, i8, bArr, i9, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (obj instanceof LiteralByteString) {
                LiteralByteString literalByteString = (LiteralByteString) obj;
                int peekCachedHashCode = peekCachedHashCode();
                int peekCachedHashCode2 = literalByteString.peekCachedHashCode();
                if (peekCachedHashCode != 0 && peekCachedHashCode2 != 0 && peekCachedHashCode != peekCachedHashCode2) {
                    return false;
                }
                return equalsRange(literalByteString, 0, size());
            }
            return obj.equals(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        public final boolean equalsRange(ByteString byteString, int i8, int i9) {
            if (i9 <= byteString.size()) {
                int i10 = i8 + i9;
                if (i10 <= byteString.size()) {
                    if (byteString instanceof LiteralByteString) {
                        LiteralByteString literalByteString = (LiteralByteString) byteString;
                        byte[] bArr = this.bytes;
                        byte[] bArr2 = literalByteString.bytes;
                        int offsetIntoBytes = getOffsetIntoBytes() + i9;
                        int offsetIntoBytes2 = getOffsetIntoBytes();
                        int offsetIntoBytes3 = literalByteString.getOffsetIntoBytes() + i8;
                        while (offsetIntoBytes2 < offsetIntoBytes) {
                            if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                                return false;
                            }
                            offsetIntoBytes2++;
                            offsetIntoBytes3++;
                        }
                        return true;
                    }
                    return byteString.substring(i8, i10).equals(substring(0, i9));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i8 + ", " + i9 + ", " + byteString.size());
            }
            throw new IllegalArgumentException("Length too large: " + i9 + size());
        }

        protected int getOffsetIntoBytes() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        byte internalByteAt(int i8) {
            return this.bytes[i8];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean isValidUtf8() {
            int offsetIntoBytes = getOffsetIntoBytes();
            return Utf8.isValidUtf8(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final CodedInputStream newCodedInput() {
            return CodedInputStream.newInstance(this.bytes, getOffsetIntoBytes(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final InputStream newInput() {
            return new ByteArrayInputStream(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        protected final int partialHash(int i8, int i9, int i10) {
            return Internal.partialHash(i8, this.bytes, getOffsetIntoBytes() + i9, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        protected final int partialIsValidUtf8(int i8, int i9, int i10) {
            int offsetIntoBytes = getOffsetIntoBytes() + i9;
            return Utf8.partialIsValidUtf8(i8, this.bytes, offsetIntoBytes, i10 + offsetIntoBytes);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteString substring(int i8, int i9) {
            int checkRange = ByteString.checkRange(i8, i9, size());
            if (checkRange == 0) {
                return ByteString.EMPTY;
            }
            return new BoundedByteString(this.bytes, getOffsetIntoBytes() + i8, checkRange);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        protected final String toStringInternal(Charset charset) {
            return new String(this.bytes, getOffsetIntoBytes(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        final void writeToInternal(OutputStream outputStream, int i8, int i9) throws IOException {
            outputStream.write(this.bytes, getOffsetIntoBytes() + i8, i9);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        final void writeTo(ByteOutput byteOutput) throws IOException {
            byteOutput.writeLazy(this.bytes, getOffsetIntoBytes(), size());
        }
    }

    /* loaded from: classes3.dex */
    private static final class SystemByteArrayCopier implements ByteArrayCopier {
        private SystemByteArrayCopier() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] bArr, int i8, int i9) {
            byte[] bArr2 = new byte[i9];
            System.arraycopy(bArr, i8, bArr2, 0, i9);
            return bArr2;
        }
    }

    static {
        ByteArrayCopier arraysByteArrayCopier;
        if (Android.isOnAndroidDevice()) {
            arraysByteArrayCopier = new SystemByteArrayCopier();
        } else {
            arraysByteArrayCopier = new ArraysByteArrayCopier();
        }
        byteArrayCopier = arraysByteArrayCopier;
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new Comparator<ByteString>() { // from class: androidx.datastore.preferences.protobuf.ByteString.2
            /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, androidx.datastore.preferences.protobuf.ByteString$ByteIterator] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Iterator, androidx.datastore.preferences.protobuf.ByteString$ByteIterator] */
            @Override // java.util.Comparator
            public int compare(ByteString byteString, ByteString byteString2) {
                ?? iterator2 = byteString.iterator2();
                ?? iterator22 = byteString2.iterator2();
                while (iterator2.hasNext() && iterator22.hasNext()) {
                    int compareTo = Integer.valueOf(ByteString.toInt(iterator2.nextByte())).compareTo(Integer.valueOf(ByteString.toInt(iterator22.nextByte())));
                    if (compareTo != 0) {
                        return compareTo;
                    }
                }
                return Integer.valueOf(byteString.size()).compareTo(Integer.valueOf(byteString2.size()));
            }
        };
    }

    private static ByteString balancedConcat(Iterator<ByteString> it, int i8) {
        if (i8 >= 1) {
            if (i8 == 1) {
                return it.next();
            }
            int i9 = i8 >>> 1;
            return balancedConcat(it, i9).concat(balancedConcat(it, i8 - i9));
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i8)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void checkIndex(int i8, int i9) {
        if (((i9 - (i8 + 1)) | i8) < 0) {
            if (i8 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i8);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i8 + ", " + i9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    public static int checkRange(int i8, int i9, int i10) {
        int i11 = i9 - i8;
        if ((i8 | i9 | i11 | (i10 - i9)) < 0) {
            if (i8 >= 0) {
                if (i9 < i8) {
                    throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i8 + ", " + i9);
                }
                throw new IndexOutOfBoundsException("End index: " + i9 + " >= " + i10);
            }
            throw new IndexOutOfBoundsException("Beginning index: " + i8 + " < 0");
        }
        return i11;
    }

    public static ByteString copyFrom(byte[] bArr, int i8, int i9) {
        checkRange(i8, i8 + i9, bArr.length);
        return new LiteralByteString(byteArrayCopier.copyFrom(bArr, i8, i9));
    }

    public static ByteString copyFromUtf8(String str) {
        return new LiteralByteString(str.getBytes(Internal.UTF_8));
    }

    public static final ByteString empty() {
        return EMPTY;
    }

    private static int extractHexDigit(String str, int i8) {
        int hexDigit = hexDigit(str.charAt(i8));
        if (hexDigit != -1) {
            return hexDigit;
        }
        throw new NumberFormatException("Invalid hexString " + str + " must only contain [0-9a-fA-F] but contained " + str.charAt(i8) + " at index " + i8);
    }

    public static ByteString fromHex(@CompileTimeConstant String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i8 = 0; i8 < length; i8++) {
                int i9 = i8 * 2;
                bArr[i8] = (byte) (extractHexDigit(str, i9 + 1) | (extractHexDigit(str, i9) << 4));
            }
            return new LiteralByteString(bArr);
        }
        throw new NumberFormatException("Invalid hexString " + str + " of length " + str.length() + " must be even.");
    }

    private static int hexDigit(char c8) {
        if (c8 >= '0' && c8 <= '9') {
            return c8 - '0';
        }
        if (c8 >= 'A' && c8 <= 'F') {
            return c8 - '7';
        }
        if (c8 < 'a' || c8 > 'f') {
            return -1;
        }
        return c8 - 'W';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CodedBuilder newCodedBuilder(int i8) {
        return new CodedBuilder(i8);
    }

    public static Output newOutput(int i8) {
        return new Output(i8);
    }

    private static ByteString readChunk(InputStream inputStream, int i8) throws IOException {
        byte[] bArr = new byte[i8];
        int i9 = 0;
        while (i9 < i8) {
            int read = inputStream.read(bArr, i9, i8 - i9);
            if (read == -1) {
                break;
            }
            i9 += read;
        }
        if (i9 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i9);
    }

    public static ByteString readFrom(InputStream inputStream) throws IOException {
        return readFrom(inputStream, 256, 8192);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte b9) {
        return b9 & 255;
    }

    private String truncateAndEscapeForDisplay() {
        if (size() <= 50) {
            return TextFormatEscaper.escapeBytes(this);
        }
        return TextFormatEscaper.escapeBytes(substring(0, 47)) + "...";
    }

    public static Comparator<ByteString> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteString wrap(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return wrap(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        return new NioByteString(byteBuffer);
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i8);

    public final ByteString concat(ByteString byteString) {
        if (Integer.MAX_VALUE - size() >= byteString.size()) {
            return RopeByteString.concatenate(this, byteString);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + byteString.size());
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i8) {
        copyTo(bArr, 0, i8, size());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void copyToInternal(byte[] bArr, int i8, int i9, int i10);

    public final boolean endsWith(ByteString byteString) {
        if (size() >= byteString.size() && substring(size() - byteString.size()).equals(byteString)) {
            return true;
        }
        return false;
    }

    public abstract boolean equals(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int getTreeDepth();

    public final int hashCode() {
        int i8 = this.hash;
        if (i8 == 0) {
            int size = size();
            i8 = partialHash(size, 0, size);
            if (i8 == 0) {
                i8 = 1;
            }
            this.hash = i8;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte internalByteAt(int i8);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public abstract boolean isValidUtf8();

    public abstract CodedInputStream newCodedInput();

    public abstract InputStream newInput();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int partialHash(int i8, int i9, int i10);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int partialIsValidUtf8(int i8, int i9, int i10);

    /* JADX INFO: Access modifiers changed from: protected */
    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(ByteString byteString) {
        if (size() < byteString.size() || !substring(0, byteString.size()).equals(byteString)) {
            return false;
        }
        return true;
    }

    public final ByteString substring(int i8) {
        return substring(i8, size());
    }

    public abstract ByteString substring(int i8, int i9);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e8) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e8);
            throw unsupportedEncodingException;
        }
    }

    protected abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(Internal.UTF_8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void writeTo(ByteOutput byteOutput) throws IOException;

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    final void writeTo(OutputStream outputStream, int i8, int i9) throws IOException {
        checkRange(i8, i8 + i9, size());
        if (i9 > 0) {
            writeToInternal(outputStream, i8, i9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void writeToInternal(OutputStream outputStream, int i8, int i9) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void writeToReverse(ByteOutput byteOutput) throws IOException;

    public static Output newOutput() {
        return new Output(128);
    }

    public static ByteString readFrom(InputStream inputStream, int i8) throws IOException {
        return readFrom(inputStream, i8, i8);
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i8, int i9, int i10) {
        checkRange(i8, i8 + i10, size());
        checkRange(i9, i9 + i10, bArr.length);
        if (i10 > 0) {
            copyToInternal(bArr, i8, i9, i10);
        }
    }

    @Override // java.lang.Iterable
    /* renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public Iterator<Byte> iterator2() {
        return new AbstractByteIterator() { // from class: androidx.datastore.preferences.protobuf.ByteString.1
            private final int limit;
            private int position = 0;

            {
                this.limit = ByteString.this.size();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.position < this.limit) {
                    return true;
                }
                return false;
            }

            @Override // androidx.datastore.preferences.protobuf.ByteString.ByteIterator
            public byte nextByte() {
                int i8 = this.position;
                if (i8 < this.limit) {
                    this.position = i8 + 1;
                    return ByteString.this.internalByteAt(i8);
                }
                throw new NoSuchElementException();
            }
        };
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString readFrom(InputStream inputStream, int i8, int i9) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteString readChunk = readChunk(inputStream, i8);
            if (readChunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(readChunk);
            i8 = Math.min(i8 * 2, i9);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Output extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList<ByteString> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        Output(int i8) {
            if (i8 >= 0) {
                this.initialCapacity = i8;
                this.flushedBuffers = new ArrayList<>();
                this.buffer = new byte[i8];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        private void flushFullBuffer(int i8) {
            this.flushedBuffers.add(new LiteralByteString(this.buffer));
            int length = this.flushedBuffersTotalBytes + this.buffer.length;
            this.flushedBuffersTotalBytes = length;
            this.buffer = new byte[Math.max(this.initialCapacity, Math.max(i8, length >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            int i8 = this.bufferPos;
            byte[] bArr = this.buffer;
            if (i8 < bArr.length) {
                if (i8 > 0) {
                    this.flushedBuffers.add(new LiteralByteString(Arrays.copyOf(bArr, i8)));
                }
            } else {
                this.flushedBuffers.add(new LiteralByteString(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }

        public synchronized void reset() {
            this.flushedBuffers.clear();
            this.flushedBuffersTotalBytes = 0;
            this.bufferPos = 0;
        }

        public synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public synchronized ByteString toByteString() {
            flushLastBuffer();
            return ByteString.copyFrom(this.flushedBuffers);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i8) {
            try {
                if (this.bufferPos == this.buffer.length) {
                    flushFullBuffer(1);
                }
                byte[] bArr = this.buffer;
                int i9 = this.bufferPos;
                this.bufferPos = i9 + 1;
                bArr[i9] = (byte) i8;
            } catch (Throwable th) {
                throw th;
            }
        }

        public void writeTo(OutputStream outputStream) throws IOException {
            int i8;
            ByteString[] byteStringArr;
            byte[] bArr;
            int i9;
            synchronized (this) {
                byteStringArr = (ByteString[]) this.flushedBuffers.toArray(new ByteString[0]);
                bArr = this.buffer;
                i9 = this.bufferPos;
            }
            for (ByteString byteString : byteStringArr) {
                byteString.writeTo(outputStream);
            }
            outputStream.write(Arrays.copyOf(bArr, i9));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i8, int i9) {
            try {
                byte[] bArr2 = this.buffer;
                int length = bArr2.length;
                int i10 = this.bufferPos;
                if (i9 <= length - i10) {
                    System.arraycopy(bArr, i8, bArr2, i10, i9);
                    this.bufferPos += i9;
                } else {
                    int length2 = bArr2.length - i10;
                    System.arraycopy(bArr, i8, bArr2, i10, length2);
                    int i11 = i9 - length2;
                    flushFullBuffer(i11);
                    System.arraycopy(bArr, i8 + length2, this.buffer, 0, i11);
                    this.bufferPos = i11;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer, int i8) {
        checkRange(0, i8, byteBuffer.remaining());
        byte[] bArr = new byte[i8];
        byteBuffer.get(bArr);
        return new LiteralByteString(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteString wrap(byte[] bArr) {
        return new LiteralByteString(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteString wrap(byte[] bArr, int i8, int i9) {
        return new BoundedByteString(bArr, i8, i9);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), truncateAndEscapeForDisplay());
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static ByteString copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new LiteralByteString(str.getBytes(str2));
    }

    public static ByteString copyFrom(String str, Charset charset) {
        return new LiteralByteString(str.getBytes(charset));
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator<ByteString> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return EMPTY;
        }
        return balancedConcat(iterable.iterator(), size);
    }
}
