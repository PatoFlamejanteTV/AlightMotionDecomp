package androidx.datastore.preferences.protobuf;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.datastore.preferences.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class RopeByteString extends ByteString {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    private final ByteString left;
    private final int leftLength;
    private final ByteString right;
    private final int totalLength;
    private final int treeDepth;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class Balancer {
        private final ArrayDeque<ByteString> prefixesStack;

        private Balancer() {
            this.prefixesStack = new ArrayDeque<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ByteString balance(ByteString byteString, ByteString byteString2) {
            doBalance(byteString);
            doBalance(byteString2);
            ByteString pop = this.prefixesStack.pop();
            while (!this.prefixesStack.isEmpty()) {
                pop = new RopeByteString(this.prefixesStack.pop(), pop);
            }
            return pop;
        }

        private void doBalance(ByteString byteString) {
            if (byteString.isBalanced()) {
                insert(byteString);
                return;
            }
            if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                doBalance(ropeByteString.left);
                doBalance(ropeByteString.right);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
        }

        private int getDepthBinForLength(int i8) {
            int binarySearch = Arrays.binarySearch(RopeByteString.minLengthByDepth, i8);
            if (binarySearch < 0) {
                return (-(binarySearch + 1)) - 1;
            }
            return binarySearch;
        }

        private void insert(ByteString byteString) {
            int depthBinForLength = getDepthBinForLength(byteString.size());
            int minLength = RopeByteString.minLength(depthBinForLength + 1);
            if (!this.prefixesStack.isEmpty() && this.prefixesStack.peek().size() < minLength) {
                int minLength2 = RopeByteString.minLength(depthBinForLength);
                ByteString pop = this.prefixesStack.pop();
                while (true) {
                    if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= minLength2) {
                        break;
                    } else {
                        pop = new RopeByteString(this.prefixesStack.pop(), pop);
                    }
                }
                RopeByteString ropeByteString = new RopeByteString(pop, byteString);
                while (!this.prefixesStack.isEmpty()) {
                    if (this.prefixesStack.peek().size() >= RopeByteString.minLength(getDepthBinForLength(ropeByteString.size()) + 1)) {
                        break;
                    } else {
                        ropeByteString = new RopeByteString(this.prefixesStack.pop(), ropeByteString);
                    }
                }
                this.prefixesStack.push(ropeByteString);
                return;
            }
            this.prefixesStack.push(byteString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class PieceIterator implements Iterator<ByteString.LeafByteString> {
        private final ArrayDeque<RopeByteString> breadCrumbs;
        private ByteString.LeafByteString next;

        private ByteString.LeafByteString getLeafByLeft(ByteString byteString) {
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                this.breadCrumbs.push(ropeByteString);
                byteString = ropeByteString.left;
            }
            return (ByteString.LeafByteString) byteString;
        }

        private ByteString.LeafByteString getNextNonEmptyLeaf() {
            ByteString.LeafByteString leafByLeft;
            do {
                ArrayDeque<RopeByteString> arrayDeque = this.breadCrumbs;
                if (arrayDeque != null && !arrayDeque.isEmpty()) {
                    leafByLeft = getLeafByLeft(this.breadCrumbs.pop().right);
                } else {
                    return null;
                }
            } while (leafByLeft.isEmpty());
            return leafByLeft;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.next != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private PieceIterator(ByteString byteString) {
            if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                ArrayDeque<RopeByteString> arrayDeque = new ArrayDeque<>(ropeByteString.getTreeDepth());
                this.breadCrumbs = arrayDeque;
                arrayDeque.push(ropeByteString);
                this.next = getLeafByLeft(ropeByteString.left);
                return;
            }
            this.breadCrumbs = null;
            this.next = (ByteString.LeafByteString) byteString;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString = this.next;
            if (leafByteString != null) {
                this.next = getNextNonEmptyLeaf();
                return leafByteString;
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteString concatenate(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return concatenateBytes(byteString, byteString2);
        }
        if (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            if (ropeByteString.right.size() + byteString2.size() < 128) {
                return new RopeByteString(ropeByteString.left, concatenateBytes(ropeByteString.right, byteString2));
            }
            if (ropeByteString.left.getTreeDepth() > ropeByteString.right.getTreeDepth() && ropeByteString.getTreeDepth() > byteString2.getTreeDepth()) {
                return new RopeByteString(ropeByteString.left, new RopeByteString(ropeByteString.right, byteString2));
            }
        }
        if (size < minLength(Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1)) {
            return new Balancer().balance(byteString, byteString2);
        }
        return new RopeByteString(byteString, byteString2);
    }

    private static ByteString concatenateBytes(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return ByteString.wrap(bArr);
    }

    private boolean equalsFragments(ByteString byteString) {
        boolean equalsRange;
        PieceIterator pieceIterator = new PieceIterator(this);
        ByteString.LeafByteString next = pieceIterator.next();
        PieceIterator pieceIterator2 = new PieceIterator(byteString);
        ByteString.LeafByteString next2 = pieceIterator2.next();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int size = next.size() - i8;
            int size2 = next2.size() - i9;
            int min = Math.min(size, size2);
            if (i8 == 0) {
                equalsRange = next.equalsRange(next2, i9, min);
            } else {
                equalsRange = next2.equalsRange(next, i8, min);
            }
            if (!equalsRange) {
                return false;
            }
            i10 += min;
            int i11 = this.totalLength;
            if (i10 >= i11) {
                if (i10 == i11) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                i8 = 0;
                next = pieceIterator.next();
            } else {
                i8 += min;
                next = next;
            }
            if (min == size2) {
                next2 = pieceIterator2.next();
                i9 = 0;
            } else {
                i9 += min;
            }
        }
    }

    static int minLength(int i8) {
        int[] iArr = minLengthByDepth;
        if (i8 >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i8];
    }

    static RopeByteString newInstanceForTest(ByteString byteString, ByteString byteString2) {
        return new RopeByteString(byteString, byteString2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        PieceIterator pieceIterator = new PieceIterator(this);
        while (pieceIterator.hasNext()) {
            arrayList.add(pieceIterator.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public byte byteAt(int i8) {
        ByteString.checkIndex(i8, this.totalLength);
        return internalByteAt(i8);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i8, int i9, int i10) {
        int i11 = i8 + i10;
        int i12 = this.leftLength;
        if (i11 <= i12) {
            this.left.copyToInternal(bArr, i8, i9, i10);
        } else {
            if (i8 >= i12) {
                this.right.copyToInternal(bArr, i8 - i12, i9, i10);
                return;
            }
            int i13 = i12 - i8;
            this.left.copyToInternal(bArr, i8, i9, i13);
            this.right.copyToInternal(bArr, 0, i9 + i13, i10 - i13);
        }
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
        if (this.totalLength != byteString.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int peekCachedHashCode = peekCachedHashCode();
        int peekCachedHashCode2 = byteString.peekCachedHashCode();
        if (peekCachedHashCode != 0 && peekCachedHashCode2 != 0 && peekCachedHashCode != peekCachedHashCode2) {
            return false;
        }
        return equalsFragments(byteString);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int getTreeDepth() {
        return this.treeDepth;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.ByteString
    public byte internalByteAt(int i8) {
        int i9 = this.leftLength;
        if (i8 < i9) {
            return this.left.internalByteAt(i8);
        }
        return this.right.internalByteAt(i8 - i9);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean isBalanced() {
        if (this.totalLength >= minLength(this.treeDepth)) {
            return true;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public boolean isValidUtf8() {
        int partialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        ByteString byteString = this.right;
        if (byteString.partialIsValidUtf8(partialIsValidUtf8, 0, byteString.size()) != 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance((Iterable<ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public InputStream newInput() {
        return new RopeInputStream();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int partialHash(int i8, int i9, int i10) {
        int i11 = i9 + i10;
        int i12 = this.leftLength;
        if (i11 <= i12) {
            return this.left.partialHash(i8, i9, i10);
        }
        if (i9 >= i12) {
            return this.right.partialHash(i8, i9 - i12, i10);
        }
        int i13 = i12 - i9;
        return this.right.partialHash(this.left.partialHash(i8, i9, i13), 0, i10 - i13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int partialIsValidUtf8(int i8, int i9, int i10) {
        int i11 = i9 + i10;
        int i12 = this.leftLength;
        if (i11 <= i12) {
            return this.left.partialIsValidUtf8(i8, i9, i10);
        }
        if (i9 >= i12) {
            return this.right.partialIsValidUtf8(i8, i9 - i12, i10);
        }
        int i13 = i12 - i9;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i8, i9, i13), 0, i10 - i13);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public int size() {
        return this.totalLength;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public ByteString substring(int i8, int i9) {
        int checkRange = ByteString.checkRange(i8, i9, this.totalLength);
        if (checkRange == 0) {
            return ByteString.EMPTY;
        }
        if (checkRange == this.totalLength) {
            return this;
        }
        int i10 = this.leftLength;
        if (i9 <= i10) {
            return this.left.substring(i8, i9);
        }
        if (i8 >= i10) {
            return this.right.substring(i8 - i10, i9 - i10);
        }
        return new RopeByteString(this.left.substring(i8), this.right.substring(0, i9 - this.leftLength));
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    protected String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeToInternal(OutputStream outputStream, int i8, int i9) throws IOException {
        int i10 = i8 + i9;
        int i11 = this.leftLength;
        if (i10 <= i11) {
            this.left.writeToInternal(outputStream, i8, i9);
        } else {
            if (i8 >= i11) {
                this.right.writeToInternal(outputStream, i8 - i11, i9);
                return;
            }
            int i12 = i11 - i8;
            this.left.writeToInternal(outputStream, i8, i12);
            this.right.writeToInternal(outputStream, 0, i9 - i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeToReverse(ByteOutput byteOutput) throws IOException {
        this.right.writeToReverse(byteOutput);
        this.left.writeToReverse(byteOutput);
    }

    private RopeByteString(ByteString byteString, ByteString byteString2) {
        this.left = byteString;
        this.right = byteString2;
        int size = byteString.size();
        this.leftLength = size;
        this.totalLength = size + byteString2.size();
        this.treeDepth = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new ByteString.AbstractByteIterator() { // from class: androidx.datastore.preferences.protobuf.RopeByteString.1
            ByteString.ByteIterator current = nextPiece();
            final PieceIterator pieces;

            {
                this.pieces = new PieceIterator(RopeByteString.this);
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [androidx.datastore.preferences.protobuf.ByteString$ByteIterator] */
            private ByteString.ByteIterator nextPiece() {
                if (this.pieces.hasNext()) {
                    return this.pieces.next().iterator2();
                }
                return null;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.current != null) {
                    return true;
                }
                return false;
            }

            @Override // androidx.datastore.preferences.protobuf.ByteString.ByteIterator
            public byte nextByte() {
                ByteString.ByteIterator byteIterator = this.current;
                if (byteIterator != null) {
                    byte nextByte = byteIterator.nextByte();
                    if (!this.current.hasNext()) {
                        this.current = nextPiece();
                    }
                    return nextByte;
                }
                throw new NoSuchElementException();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.ByteString
    public void writeTo(ByteOutput byteOutput) throws IOException {
        this.left.writeTo(byteOutput);
        this.right.writeTo(byteOutput);
    }

    /* loaded from: classes3.dex */
    private class RopeInputStream extends InputStream {
        private ByteString.LeafByteString currentPiece;
        private int currentPieceIndex;
        private int currentPieceOffsetInRope;
        private int currentPieceSize;
        private int mark;
        private PieceIterator pieceIterator;

        public RopeInputStream() {
            initialize();
        }

        private void advanceIfCurrentPieceFullyRead() {
            if (this.currentPiece != null) {
                int i8 = this.currentPieceIndex;
                int i9 = this.currentPieceSize;
                if (i8 == i9) {
                    this.currentPieceOffsetInRope += i9;
                    this.currentPieceIndex = 0;
                    if (this.pieceIterator.hasNext()) {
                        ByteString.LeafByteString next = this.pieceIterator.next();
                        this.currentPiece = next;
                        this.currentPieceSize = next.size();
                    } else {
                        this.currentPiece = null;
                        this.currentPieceSize = 0;
                    }
                }
            }
        }

        private int availableInternal() {
            return RopeByteString.this.size() - (this.currentPieceOffsetInRope + this.currentPieceIndex);
        }

        private void initialize() {
            PieceIterator pieceIterator = new PieceIterator(RopeByteString.this);
            this.pieceIterator = pieceIterator;
            ByteString.LeafByteString next = pieceIterator.next();
            this.currentPiece = next;
            this.currentPieceSize = next.size();
            this.currentPieceIndex = 0;
            this.currentPieceOffsetInRope = 0;
        }

        private int readSkipInternal(byte[] bArr, int i8, int i9) {
            int i10 = i9;
            while (i10 > 0) {
                advanceIfCurrentPieceFullyRead();
                if (this.currentPiece == null) {
                    break;
                }
                int min = Math.min(this.currentPieceSize - this.currentPieceIndex, i10);
                if (bArr != null) {
                    this.currentPiece.copyTo(bArr, this.currentPieceIndex, i8, min);
                    i8 += min;
                }
                this.currentPieceIndex += min;
                i10 -= min;
            }
            return i9 - i10;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return availableInternal();
        }

        @Override // java.io.InputStream
        public void mark(int i8) {
            this.mark = this.currentPieceOffsetInRope + this.currentPieceIndex;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i8, int i9) {
            bArr.getClass();
            if (i8 >= 0 && i9 >= 0 && i9 <= bArr.length - i8) {
                int readSkipInternal = readSkipInternal(bArr, i8, i9);
                if (readSkipInternal != 0) {
                    return readSkipInternal;
                }
                if (i9 > 0 || availableInternal() == 0) {
                    return -1;
                }
                return readSkipInternal;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            initialize();
            readSkipInternal(null, 0, this.mark);
        }

        @Override // java.io.InputStream
        public long skip(long j8) {
            if (j8 >= 0) {
                if (j8 > 2147483647L) {
                    j8 = 2147483647L;
                }
                return readSkipInternal(null, 0, (int) j8);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            advanceIfCurrentPieceFullyRead();
            ByteString.LeafByteString leafByteString = this.currentPiece;
            if (leafByteString == null) {
                return -1;
            }
            int i8 = this.currentPieceIndex;
            this.currentPieceIndex = i8 + 1;
            return leafByteString.byteAt(i8) & 255;
        }
    }
}
