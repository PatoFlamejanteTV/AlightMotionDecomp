package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class IterableByteBufferInputStream extends InputStream {
    private long currentAddress;
    private byte[] currentArray;
    private int currentArrayOffset;
    private ByteBuffer currentByteBuffer;
    private int currentByteBufferPos;
    private int currentIndex;
    private int dataSize = 0;
    private boolean hasArray;
    private Iterator<ByteBuffer> iterator;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IterableByteBufferInputStream(Iterable<ByteBuffer> iterable) {
        this.iterator = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.dataSize++;
        }
        this.currentIndex = -1;
        if (!getNextByteBuffer()) {
            this.currentByteBuffer = Internal.EMPTY_BYTE_BUFFER;
            this.currentIndex = 0;
            this.currentByteBufferPos = 0;
            this.currentAddress = 0L;
        }
    }

    private boolean getNextByteBuffer() {
        this.currentIndex++;
        if (!this.iterator.hasNext()) {
            return false;
        }
        ByteBuffer next = this.iterator.next();
        this.currentByteBuffer = next;
        this.currentByteBufferPos = next.position();
        if (this.currentByteBuffer.hasArray()) {
            this.hasArray = true;
            this.currentArray = this.currentByteBuffer.array();
            this.currentArrayOffset = this.currentByteBuffer.arrayOffset();
        } else {
            this.hasArray = false;
            this.currentAddress = UnsafeUtil.addressOffset(this.currentByteBuffer);
            this.currentArray = null;
        }
        return true;
    }

    private void updateCurrentByteBufferPos(int i8) {
        int i9 = this.currentByteBufferPos + i8;
        this.currentByteBufferPos = i9;
        if (i9 == this.currentByteBuffer.limit()) {
            getNextByteBuffer();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.currentIndex == this.dataSize) {
            return -1;
        }
        if (this.hasArray) {
            int i8 = this.currentArray[this.currentByteBufferPos + this.currentArrayOffset] & 255;
            updateCurrentByteBufferPos(1);
            return i8;
        }
        int i9 = UnsafeUtil.getByte(this.currentByteBufferPos + this.currentAddress) & 255;
        updateCurrentByteBufferPos(1);
        return i9;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i8, int i9) throws IOException {
        if (this.currentIndex == this.dataSize) {
            return -1;
        }
        int limit = this.currentByteBuffer.limit();
        int i10 = this.currentByteBufferPos;
        int i11 = limit - i10;
        if (i9 > i11) {
            i9 = i11;
        }
        if (this.hasArray) {
            System.arraycopy(this.currentArray, i10 + this.currentArrayOffset, bArr, i8, i9);
            updateCurrentByteBufferPos(i9);
        } else {
            int position = this.currentByteBuffer.position();
            Java8Compatibility.position(this.currentByteBuffer, this.currentByteBufferPos);
            this.currentByteBuffer.get(bArr, i8, i9);
            Java8Compatibility.position(this.currentByteBuffer, position);
            updateCurrentByteBufferPos(i9);
        }
        return i9;
    }
}
