package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class FlexBuffersBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int BUILDER_FLAG_NONE = 0;
    public static final int BUILDER_FLAG_SHARE_ALL = 7;
    public static final int BUILDER_FLAG_SHARE_KEYS = 1;
    public static final int BUILDER_FLAG_SHARE_KEYS_AND_STRINGS = 3;
    public static final int BUILDER_FLAG_SHARE_KEY_VECTORS = 4;
    public static final int BUILDER_FLAG_SHARE_STRINGS = 2;
    private static final int WIDTH_16 = 1;
    private static final int WIDTH_32 = 2;
    private static final int WIDTH_64 = 3;
    private static final int WIDTH_8 = 0;
    private final ReadWriteBuf bb;
    private boolean finished;
    private final int flags;
    private Comparator<Value> keyComparator;
    private final HashMap<String, Integer> keyPool;
    private final ArrayList<Value> stack;
    private final HashMap<String, Integer> stringPool;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class Value {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        final double dValue;
        long iValue;
        int key;
        final int minBitWidth;
        final int type;

        Value(int i8, int i9, int i10, long j8) {
            this.key = i8;
            this.type = i9;
            this.minBitWidth = i10;
            this.iValue = j8;
            this.dValue = Double.MIN_VALUE;
        }

        static Value blob(int i8, int i9, int i10, int i11) {
            return new Value(i8, i10, i11, i9);
        }

        static Value bool(int i8, boolean z8) {
            long j8;
            if (z8) {
                j8 = 1;
            } else {
                j8 = 0;
            }
            return new Value(i8, 26, 0, j8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int elemWidth(int i8, int i9) {
            return elemWidth(this.type, this.minBitWidth, this.iValue, i8, i9);
        }

        static Value float32(int i8, float f8) {
            return new Value(i8, 3, 2, f8);
        }

        static Value float64(int i8, double d8) {
            return new Value(i8, 3, 3, d8);
        }

        static Value int16(int i8, int i9) {
            return new Value(i8, 1, 1, i9);
        }

        static Value int32(int i8, int i9) {
            return new Value(i8, 1, 2, i9);
        }

        static Value int64(int i8, long j8) {
            return new Value(i8, 1, 3, j8);
        }

        static Value int8(int i8, int i9) {
            return new Value(i8, 1, 0, i9);
        }

        private static byte packedType(int i8, int i9) {
            return (byte) (i8 | (i9 << 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int paddingBytes(int i8, int i9) {
            return ((~i8) + 1) & (i9 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte storedPackedType() {
            return storedPackedType(0);
        }

        private int storedWidth(int i8) {
            if (FlexBuffers.isTypeInline(this.type)) {
                return Math.max(this.minBitWidth, i8);
            }
            return this.minBitWidth;
        }

        static Value uInt16(int i8, int i9) {
            return new Value(i8, 2, 1, i9);
        }

        static Value uInt32(int i8, int i9) {
            return new Value(i8, 2, 2, i9);
        }

        static Value uInt64(int i8, long j8) {
            return new Value(i8, 2, 3, j8);
        }

        static Value uInt8(int i8, int i9) {
            return new Value(i8, 2, 0, i9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int elemWidth(int i8, int i9, long j8, int i10, int i11) {
            if (FlexBuffers.isTypeInline(i8)) {
                return i9;
            }
            for (int i12 = 1; i12 <= 32; i12 *= 2) {
                int widthUInBits = FlexBuffersBuilder.widthUInBits((int) (((paddingBytes(i10, i12) + i10) + (i11 * i12)) - j8));
                if ((1 << widthUInBits) == i12) {
                    return widthUInBits;
                }
            }
            return 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte storedPackedType(int i8) {
            return packedType(storedWidth(i8), this.type);
        }

        Value(int i8, int i9, int i10, double d8) {
            this.key = i8;
            this.type = i9;
            this.minBitWidth = i10;
            this.dValue = d8;
            this.iValue = Long.MIN_VALUE;
        }
    }

    public FlexBuffersBuilder(int i8) {
        this(new ArrayReadWriteBuf(i8), 1);
    }

    private int align(int i8) {
        int i9 = 1 << i8;
        int paddingBytes = Value.paddingBytes(this.bb.writePosition(), i9);
        while (true) {
            int i10 = paddingBytes - 1;
            if (paddingBytes != 0) {
                this.bb.put((byte) 0);
                paddingBytes = i10;
            } else {
                return i9;
            }
        }
    }

    private Value createKeyVector(int i8, int i9) {
        long j8 = i9;
        int max = Math.max(0, widthUInBits(j8));
        int i10 = i8;
        while (i10 < this.stack.size()) {
            i10++;
            max = Math.max(max, Value.elemWidth(4, 0, this.stack.get(i10).key, this.bb.writePosition(), i10));
        }
        int align = align(max);
        writeInt(j8, align);
        int writePosition = this.bb.writePosition();
        while (i8 < this.stack.size()) {
            int i11 = this.stack.get(i8).key;
            writeOffset(this.stack.get(i8).key, align);
            i8++;
        }
        return new Value(-1, FlexBuffers.toTypedVector(4, 0), max, writePosition);
    }

    private Value createVector(int i8, int i9, int i10, boolean z8, boolean z9, Value value) {
        int i11;
        int i12;
        int i13 = i10;
        long j8 = i13;
        int max = Math.max(0, widthUInBits(j8));
        if (value != null) {
            max = Math.max(max, value.elemWidth(this.bb.writePosition(), 0));
            i11 = 3;
        } else {
            i11 = 1;
        }
        int i14 = 4;
        int i15 = max;
        for (int i16 = i9; i16 < this.stack.size(); i16++) {
            i15 = Math.max(i15, this.stack.get(i16).elemWidth(this.bb.writePosition(), i16 + i11));
            if (z8 && i16 == i9) {
                i14 = this.stack.get(i16).type;
                if (!FlexBuffers.isTypedVectorElementType(i14)) {
                    throw new FlexBuffers.FlexBufferException("TypedVector does not support this element type");
                }
            }
        }
        int i17 = i9;
        int align = align(i15);
        if (value != null) {
            writeOffset(value.iValue, align);
            writeInt(1 << value.minBitWidth, align);
        }
        if (!z9) {
            writeInt(j8, align);
        }
        int writePosition = this.bb.writePosition();
        for (int i18 = i17; i18 < this.stack.size(); i18++) {
            writeAny(this.stack.get(i18), align);
        }
        if (!z8) {
            while (i17 < this.stack.size()) {
                this.bb.put(this.stack.get(i17).storedPackedType(i15));
                i17++;
            }
        }
        if (value != null) {
            i12 = 9;
        } else if (z8) {
            if (!z9) {
                i13 = 0;
            }
            i12 = FlexBuffers.toTypedVector(i14, i13);
        } else {
            i12 = 10;
        }
        return new Value(i8, i12, i15, writePosition);
    }

    private int putKey(String str) {
        if (str == null) {
            return -1;
        }
        int writePosition = this.bb.writePosition();
        if ((this.flags & 1) != 0) {
            Integer num = this.keyPool.get(str);
            if (num == null) {
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                this.bb.put(bytes, 0, bytes.length);
                this.bb.put((byte) 0);
                this.keyPool.put(str, Integer.valueOf(writePosition));
                return writePosition;
            }
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.bb.put(bytes2, 0, bytes2.length);
        this.bb.put((byte) 0);
        this.keyPool.put(str, Integer.valueOf(writePosition));
        return writePosition;
    }

    static int widthUInBits(long j8) {
        if (j8 <= FlexBuffers.Unsigned.byteToUnsignedInt((byte) -1)) {
            return 0;
        }
        if (j8 <= FlexBuffers.Unsigned.shortToUnsignedInt((short) -1)) {
            return 1;
        }
        if (j8 <= FlexBuffers.Unsigned.intToUnsignedLong(-1)) {
            return 2;
        }
        return 3;
    }

    private void writeAny(Value value, int i8) {
        int i9 = value.type;
        if (i9 != 0 && i9 != 1 && i9 != 2) {
            if (i9 != 3) {
                if (i9 != 26) {
                    writeOffset(value.iValue, i8);
                    return;
                }
            } else {
                writeDouble(value.dValue, i8);
                return;
            }
        }
        writeInt(value.iValue, i8);
    }

    private Value writeBlob(int i8, byte[] bArr, int i9, boolean z8) {
        int widthUInBits = widthUInBits(bArr.length);
        writeInt(bArr.length, align(widthUInBits));
        int writePosition = this.bb.writePosition();
        this.bb.put(bArr, 0, bArr.length);
        if (z8) {
            this.bb.put((byte) 0);
        }
        return Value.blob(i8, writePosition, i9, widthUInBits);
    }

    private void writeDouble(double d8, int i8) {
        if (i8 == 4) {
            this.bb.putFloat((float) d8);
        } else if (i8 == 8) {
            this.bb.putDouble(d8);
        }
    }

    private void writeInt(long j8, int i8) {
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 4) {
                    if (i8 == 8) {
                        this.bb.putLong(j8);
                        return;
                    }
                    return;
                }
                this.bb.putInt((int) j8);
                return;
            }
            this.bb.putShort((short) j8);
            return;
        }
        this.bb.put((byte) j8);
    }

    private void writeOffset(long j8, int i8) {
        writeInt((int) (this.bb.writePosition() - j8), i8);
    }

    private Value writeString(int i8, String str) {
        return writeBlob(i8, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    public int endMap(String str, int i8) {
        int putKey = putKey(str);
        ArrayList<Value> arrayList = this.stack;
        Collections.sort(arrayList.subList(i8, arrayList.size()), this.keyComparator);
        Value createVector = createVector(putKey, i8, this.stack.size() - i8, false, false, createKeyVector(i8, this.stack.size() - i8));
        while (this.stack.size() > i8) {
            this.stack.remove(r0.size() - 1);
        }
        this.stack.add(createVector);
        return (int) createVector.iValue;
    }

    public int endVector(String str, int i8, boolean z8, boolean z9) {
        Value createVector = createVector(putKey(str), i8, this.stack.size() - i8, z8, z9, null);
        while (this.stack.size() > i8) {
            this.stack.remove(r10.size() - 1);
        }
        this.stack.add(createVector);
        return (int) createVector.iValue;
    }

    public ByteBuffer finish() {
        int align = align(this.stack.get(0).elemWidth(this.bb.writePosition(), 0));
        writeAny(this.stack.get(0), align);
        this.bb.put(this.stack.get(0).storedPackedType());
        this.bb.put((byte) align);
        this.finished = true;
        return ByteBuffer.wrap(this.bb.data(), 0, this.bb.writePosition());
    }

    public ReadWriteBuf getBuffer() {
        return this.bb;
    }

    public int putBlob(byte[] bArr) {
        return putBlob(null, bArr);
    }

    public void putBoolean(boolean z8) {
        putBoolean(null, z8);
    }

    public void putFloat(float f8) {
        putFloat((String) null, f8);
    }

    public void putInt(int i8) {
        putInt((String) null, i8);
    }

    public int putString(String str) {
        return putString(null, str);
    }

    public void putUInt(int i8) {
        putUInt(null, i8);
    }

    public void putUInt64(BigInteger bigInteger) {
        putUInt64(null, bigInteger.longValue());
    }

    public int startMap() {
        return this.stack.size();
    }

    public int startVector() {
        return this.stack.size();
    }

    public FlexBuffersBuilder() {
        this(256);
    }

    private void putUInt64(String str, long j8) {
        this.stack.add(Value.uInt64(putKey(str), j8));
    }

    public int putBlob(String str, byte[] bArr) {
        Value writeBlob = writeBlob(putKey(str), bArr, 25, false);
        this.stack.add(writeBlob);
        return (int) writeBlob.iValue;
    }

    public void putBoolean(String str, boolean z8) {
        this.stack.add(Value.bool(putKey(str), z8));
    }

    public void putFloat(String str, float f8) {
        this.stack.add(Value.float32(putKey(str), f8));
    }

    public void putInt(String str, int i8) {
        putInt(str, i8);
    }

    public int putString(String str, String str2) {
        long j8;
        int putKey = putKey(str);
        if ((this.flags & 2) != 0) {
            Integer num = this.stringPool.get(str2);
            if (num == null) {
                Value writeString = writeString(putKey, str2);
                this.stringPool.put(str2, Integer.valueOf((int) writeString.iValue));
                this.stack.add(writeString);
                j8 = writeString.iValue;
            } else {
                this.stack.add(Value.blob(putKey, num.intValue(), 5, widthUInBits(str2.length())));
                return num.intValue();
            }
        } else {
            Value writeString2 = writeString(putKey, str2);
            this.stack.add(writeString2);
            j8 = writeString2.iValue;
        }
        return (int) j8;
    }

    public void putUInt(long j8) {
        putUInt(null, j8);
    }

    @Deprecated
    public FlexBuffersBuilder(ByteBuffer byteBuffer, int i8) {
        this(new ArrayReadWriteBuf(byteBuffer.array()), i8);
    }

    private void putUInt(String str, long j8) {
        Value uInt64;
        int putKey = putKey(str);
        int widthUInBits = widthUInBits(j8);
        if (widthUInBits == 0) {
            uInt64 = Value.uInt8(putKey, (int) j8);
        } else if (widthUInBits == 1) {
            uInt64 = Value.uInt16(putKey, (int) j8);
        } else if (widthUInBits == 2) {
            uInt64 = Value.uInt32(putKey, (int) j8);
        } else {
            uInt64 = Value.uInt64(putKey, j8);
        }
        this.stack.add(uInt64);
    }

    public void putFloat(double d8) {
        putFloat((String) null, d8);
    }

    public void putInt(String str, long j8) {
        int putKey = putKey(str);
        if (-128 <= j8 && j8 <= 127) {
            this.stack.add(Value.int8(putKey, (int) j8));
            return;
        }
        if (-32768 <= j8 && j8 <= 32767) {
            this.stack.add(Value.int16(putKey, (int) j8));
        } else if (-2147483648L <= j8 && j8 <= 2147483647L) {
            this.stack.add(Value.int32(putKey, (int) j8));
        } else {
            this.stack.add(Value.int64(putKey, j8));
        }
    }

    public FlexBuffersBuilder(ReadWriteBuf readWriteBuf, int i8) {
        this.stack = new ArrayList<>();
        this.keyPool = new HashMap<>();
        this.stringPool = new HashMap<>();
        this.finished = false;
        this.keyComparator = new Comparator<Value>() { // from class: androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.1
            @Override // java.util.Comparator
            public int compare(Value value, Value value2) {
                byte b9;
                byte b10;
                int i9 = value.key;
                int i10 = value2.key;
                do {
                    b9 = FlexBuffersBuilder.this.bb.get(i9);
                    b10 = FlexBuffersBuilder.this.bb.get(i10);
                    if (b9 == 0) {
                        return b9 - b10;
                    }
                    i9++;
                    i10++;
                } while (b9 == b10);
                return b9 - b10;
            }
        };
        this.bb = readWriteBuf;
        this.flags = i8;
    }

    public void putFloat(String str, double d8) {
        this.stack.add(Value.float64(putKey(str), d8));
    }

    public void putInt(long j8) {
        putInt((String) null, j8);
    }

    public FlexBuffersBuilder(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }
}
