package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class FlexBuffers {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final ReadBuf EMPTY_BB = new ArrayReadWriteBuf(new byte[]{0}, 1);
    public static final int FBT_BLOB = 25;
    public static final int FBT_BOOL = 26;
    public static final int FBT_FLOAT = 3;
    public static final int FBT_INDIRECT_FLOAT = 8;
    public static final int FBT_INDIRECT_INT = 6;
    public static final int FBT_INDIRECT_UINT = 7;
    public static final int FBT_INT = 1;
    public static final int FBT_KEY = 4;
    public static final int FBT_MAP = 9;
    public static final int FBT_NULL = 0;
    public static final int FBT_STRING = 5;
    public static final int FBT_UINT = 2;
    public static final int FBT_VECTOR = 10;
    public static final int FBT_VECTOR_BOOL = 36;
    public static final int FBT_VECTOR_FLOAT = 13;
    public static final int FBT_VECTOR_FLOAT2 = 18;
    public static final int FBT_VECTOR_FLOAT3 = 21;
    public static final int FBT_VECTOR_FLOAT4 = 24;
    public static final int FBT_VECTOR_INT = 11;
    public static final int FBT_VECTOR_INT2 = 16;
    public static final int FBT_VECTOR_INT3 = 19;
    public static final int FBT_VECTOR_INT4 = 22;
    public static final int FBT_VECTOR_KEY = 14;
    public static final int FBT_VECTOR_STRING_DEPRECATED = 15;
    public static final int FBT_VECTOR_UINT = 12;
    public static final int FBT_VECTOR_UINT2 = 17;
    public static final int FBT_VECTOR_UINT3 = 20;
    public static final int FBT_VECTOR_UINT4 = 23;

    /* loaded from: classes3.dex */
    public static class Blob extends Sized {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final Blob EMPTY = new Blob(FlexBuffers.EMPTY_BB, 1, 1);

        Blob(ReadBuf readBuf, int i8, int i9) {
            super(readBuf, i8, i9);
        }

        public static Blob empty() {
            return EMPTY;
        }

        public ByteBuffer data() {
            ByteBuffer wrap = ByteBuffer.wrap(this.bb.data());
            wrap.position(this.end);
            wrap.limit(this.end + size());
            return wrap.asReadOnlyBuffer().slice();
        }

        public byte get(int i8) {
            return this.bb.get(this.end + i8);
        }

        public byte[] getBytes() {
            int size = size();
            byte[] bArr = new byte[size];
            for (int i8 = 0; i8 < size; i8++) {
                bArr[i8] = this.bb.get(this.end + i8);
            }
            return bArr;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            return this.bb.getString(this.end, size());
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append('\"');
            sb.append(this.bb.getString(this.end, size()));
            sb.append('\"');
            return sb;
        }
    }

    /* loaded from: classes3.dex */
    public static class FlexBufferException extends RuntimeException {
        /* JADX INFO: Access modifiers changed from: package-private */
        public FlexBufferException(String str) {
            super(str);
        }
    }

    /* loaded from: classes3.dex */
    public static class Key extends Object {
        private static final Key EMPTY = new Key(FlexBuffers.EMPTY_BB, 0, 0);

        Key(ReadBuf readBuf, int i8, int i9) {
            super(readBuf, i8, i9);
        }

        public static Key empty() {
            return EMPTY;
        }

        int compareTo(byte[] bArr) {
            byte b9;
            byte b10;
            int i8 = this.end;
            int i9 = 0;
            do {
                b9 = this.bb.get(i8);
                b10 = bArr[i9];
                if (b9 == 0) {
                    return b9 - b10;
                }
                i8++;
                i9++;
                if (i9 == bArr.length) {
                    return b9 - b10;
                }
            } while (b9 == b10);
            return b9 - b10;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            if (key.end != this.end || key.byteWidth != this.byteWidth) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.end ^ this.byteWidth;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public String toString() {
            int i8 = this.end;
            while (this.bb.get(i8) != 0) {
                i8++;
            }
            int i9 = this.end;
            return this.bb.getString(i9, i8 - i9);
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyVector {
        private final TypedVector vec;

        KeyVector(TypedVector typedVector) {
            this.vec = typedVector;
        }

        public Key get(int i8) {
            if (i8 >= size()) {
                return Key.EMPTY;
            }
            TypedVector typedVector = this.vec;
            int i9 = typedVector.end + (i8 * typedVector.byteWidth);
            TypedVector typedVector2 = this.vec;
            ReadBuf readBuf = typedVector2.bb;
            return new Key(readBuf, FlexBuffers.indirect(readBuf, i9, typedVector2.byteWidth), 1);
        }

        public int size() {
            return this.vec.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i8 = 0; i8 < this.vec.size(); i8++) {
                this.vec.get(i8).toString(sb);
                if (i8 != this.vec.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static class Map extends Vector {
        private static final Map EMPTY_MAP = new Map(FlexBuffers.EMPTY_BB, 1, 1);

        Map(ReadBuf readBuf, int i8, int i9) {
            super(readBuf, i8, i9);
        }

        private int binarySearch(KeyVector keyVector, byte[] bArr) {
            int size = keyVector.size() - 1;
            int i8 = 0;
            while (i8 <= size) {
                int i9 = (i8 + size) >>> 1;
                int compareTo = keyVector.get(i9).compareTo(bArr);
                if (compareTo < 0) {
                    i8 = i9 + 1;
                } else if (compareTo > 0) {
                    size = i9 - 1;
                } else {
                    return i9;
                }
            }
            return -(i8 + 1);
        }

        public static Map empty() {
            return EMPTY_MAP;
        }

        public Reference get(String str) {
            return get(str.getBytes(StandardCharsets.UTF_8));
        }

        public KeyVector keys() {
            int i8 = this.end - (this.byteWidth * 3);
            ReadBuf readBuf = this.bb;
            int indirect = FlexBuffers.indirect(readBuf, i8, this.byteWidth);
            ReadBuf readBuf2 = this.bb;
            int i9 = this.byteWidth;
            return new KeyVector(new TypedVector(readBuf, indirect, FlexBuffers.readInt(readBuf2, i8 + i9, i9), 4));
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append("{ ");
            KeyVector keys = keys();
            int size = size();
            Vector values = values();
            for (int i8 = 0; i8 < size; i8++) {
                sb.append('\"');
                sb.append(keys.get(i8).toString());
                sb.append("\" : ");
                sb.append(values.get(i8).toString());
                if (i8 != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        public Vector values() {
            return new Vector(this.bb, this.end, this.byteWidth);
        }

        public Reference get(byte[] bArr) {
            KeyVector keys = keys();
            int size = keys.size();
            int binarySearch = binarySearch(keys, bArr);
            if (binarySearch < 0 || binarySearch >= size) {
                return Reference.NULL_REFERENCE;
            }
            return get(binarySearch);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static abstract class Object {
        ReadBuf bb;
        int byteWidth;
        int end;

        Object(ReadBuf readBuf, int i8, int i9) {
            this.bb = readBuf;
            this.end = i8;
            this.byteWidth = i9;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        public abstract StringBuilder toString(StringBuilder sb);
    }

    /* loaded from: classes3.dex */
    public static class Reference {
        private static final Reference NULL_REFERENCE = new Reference(FlexBuffers.EMPTY_BB, 0, 1, 0);
        private ReadBuf bb;
        private int byteWidth;
        private int end;
        private int parentWidth;
        private int type;

        Reference(ReadBuf readBuf, int i8, int i9, int i10) {
            this(readBuf, i8, i9, 1 << (i10 & 3), i10 >> 2);
        }

        public Blob asBlob() {
            if (!isBlob() && !isString()) {
                return Blob.empty();
            }
            ReadBuf readBuf = this.bb;
            return new Blob(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
        }

        public boolean asBoolean() {
            if (isBoolean()) {
                if (this.bb.get(this.end) == 0) {
                    return false;
                }
                return true;
            }
            if (asUInt() == 0) {
                return false;
            }
            return true;
        }

        public double asFloat() {
            int i8 = this.type;
            if (i8 == 3) {
                return FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
            }
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 5) {
                        if (i8 != 6) {
                            if (i8 != 7) {
                                if (i8 != 8) {
                                    if (i8 != 10) {
                                        if (i8 != 26) {
                                            return 0.0d;
                                        }
                                    } else {
                                        return asVector().size();
                                    }
                                } else {
                                    ReadBuf readBuf = this.bb;
                                    return FlexBuffers.readDouble(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
                                }
                            } else {
                                ReadBuf readBuf2 = this.bb;
                                return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
                            }
                        } else {
                            ReadBuf readBuf3 = this.bb;
                            return FlexBuffers.readInt(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
                        }
                    } else {
                        return Double.parseDouble(asString());
                    }
                }
                return FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
            }
            return FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
        }

        public int asInt() {
            long readUInt;
            int i8 = this.type;
            if (i8 == 1) {
                return FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
            }
            if (i8 == 2) {
                readUInt = FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
            } else if (i8 != 3) {
                if (i8 != 5) {
                    if (i8 != 6) {
                        if (i8 != 7) {
                            if (i8 != 8) {
                                if (i8 != 10) {
                                    if (i8 == 26) {
                                        return FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
                                    }
                                    return 0;
                                }
                                return asVector().size();
                            }
                            ReadBuf readBuf = this.bb;
                            return (int) FlexBuffers.readDouble(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
                        }
                        ReadBuf readBuf2 = this.bb;
                        readUInt = FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
                    } else {
                        ReadBuf readBuf3 = this.bb;
                        return FlexBuffers.readInt(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
                    }
                } else {
                    return Integer.parseInt(asString());
                }
            } else {
                return (int) FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
            }
            return (int) readUInt;
        }

        public Key asKey() {
            if (isKey()) {
                ReadBuf readBuf = this.bb;
                return new Key(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            return Key.empty();
        }

        public long asLong() {
            int i8 = this.type;
            if (i8 == 1) {
                return FlexBuffers.readLong(this.bb, this.end, this.parentWidth);
            }
            if (i8 == 2) {
                return FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
            }
            if (i8 != 3) {
                if (i8 != 5) {
                    if (i8 != 6) {
                        if (i8 != 7) {
                            if (i8 != 8) {
                                if (i8 != 10) {
                                    if (i8 != 26) {
                                        return 0L;
                                    }
                                    return FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
                                }
                                return asVector().size();
                            }
                            ReadBuf readBuf = this.bb;
                            return (long) FlexBuffers.readDouble(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
                        }
                        ReadBuf readBuf2 = this.bb;
                        return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.parentWidth);
                    }
                    ReadBuf readBuf3 = this.bb;
                    return FlexBuffers.readLong(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
                }
                try {
                    return Long.parseLong(asString());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            return (long) FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
        }

        public Map asMap() {
            if (isMap()) {
                ReadBuf readBuf = this.bb;
                return new Map(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            return Map.empty();
        }

        public String asString() {
            if (isString()) {
                int indirect = FlexBuffers.indirect(this.bb, this.end, this.parentWidth);
                ReadBuf readBuf = this.bb;
                int i8 = this.byteWidth;
                return this.bb.getString(indirect, (int) FlexBuffers.readUInt(readBuf, indirect - i8, i8));
            }
            if (isKey()) {
                int indirect2 = FlexBuffers.indirect(this.bb, this.end, this.byteWidth);
                int i9 = indirect2;
                while (this.bb.get(i9) != 0) {
                    i9++;
                }
                return this.bb.getString(indirect2, i9 - indirect2);
            }
            return "";
        }

        public long asUInt() {
            int i8 = this.type;
            if (i8 == 2) {
                return FlexBuffers.readUInt(this.bb, this.end, this.parentWidth);
            }
            if (i8 == 1) {
                return FlexBuffers.readLong(this.bb, this.end, this.parentWidth);
            }
            if (i8 != 3) {
                if (i8 != 10) {
                    if (i8 != 26) {
                        if (i8 != 5) {
                            if (i8 != 6) {
                                if (i8 != 7) {
                                    if (i8 != 8) {
                                        return 0L;
                                    }
                                    ReadBuf readBuf = this.bb;
                                    return (long) FlexBuffers.readDouble(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.parentWidth);
                                }
                                ReadBuf readBuf2 = this.bb;
                                return FlexBuffers.readUInt(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth);
                            }
                            ReadBuf readBuf3 = this.bb;
                            return FlexBuffers.readLong(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth);
                        }
                        return Long.parseLong(asString());
                    }
                    return FlexBuffers.readInt(this.bb, this.end, this.parentWidth);
                }
                return asVector().size();
            }
            return (long) FlexBuffers.readDouble(this.bb, this.end, this.parentWidth);
        }

        public Vector asVector() {
            if (isVector()) {
                ReadBuf readBuf = this.bb;
                return new Vector(readBuf, FlexBuffers.indirect(readBuf, this.end, this.parentWidth), this.byteWidth);
            }
            int i8 = this.type;
            if (i8 == 15) {
                ReadBuf readBuf2 = this.bb;
                return new TypedVector(readBuf2, FlexBuffers.indirect(readBuf2, this.end, this.parentWidth), this.byteWidth, 4);
            }
            if (FlexBuffers.isTypedVector(i8)) {
                ReadBuf readBuf3 = this.bb;
                return new TypedVector(readBuf3, FlexBuffers.indirect(readBuf3, this.end, this.parentWidth), this.byteWidth, FlexBuffers.toTypedVectorElementType(this.type));
            }
            return Vector.empty();
        }

        public int getType() {
            return this.type;
        }

        public boolean isBlob() {
            if (this.type == 25) {
                return true;
            }
            return false;
        }

        public boolean isBoolean() {
            if (this.type == 26) {
                return true;
            }
            return false;
        }

        public boolean isFloat() {
            int i8 = this.type;
            if (i8 != 3 && i8 != 8) {
                return false;
            }
            return true;
        }

        public boolean isInt() {
            int i8 = this.type;
            if (i8 == 1 || i8 == 6) {
                return true;
            }
            return false;
        }

        public boolean isIntOrUInt() {
            if (!isInt() && !isUInt()) {
                return false;
            }
            return true;
        }

        public boolean isKey() {
            if (this.type == 4) {
                return true;
            }
            return false;
        }

        public boolean isMap() {
            if (this.type == 9) {
                return true;
            }
            return false;
        }

        public boolean isNull() {
            if (this.type == 0) {
                return true;
            }
            return false;
        }

        public boolean isNumeric() {
            if (!isIntOrUInt() && !isFloat()) {
                return false;
            }
            return true;
        }

        public boolean isString() {
            if (this.type == 5) {
                return true;
            }
            return false;
        }

        public boolean isTypedVector() {
            return FlexBuffers.isTypedVector(this.type);
        }

        public boolean isUInt() {
            int i8 = this.type;
            if (i8 != 2 && i8 != 7) {
                return false;
            }
            return true;
        }

        public boolean isVector() {
            int i8 = this.type;
            if (i8 != 10 && i8 != 9) {
                return false;
            }
            return true;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        Reference(ReadBuf readBuf, int i8, int i9, int i10, int i11) {
            this.bb = readBuf;
            this.end = i8;
            this.parentWidth = i9;
            this.byteWidth = i10;
            this.type = i11;
        }

        StringBuilder toString(StringBuilder sb) {
            int i8 = this.type;
            if (i8 != 36) {
                switch (i8) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        sb.append(asLong());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(asUInt());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(asFloat());
                        return sb;
                    case 4:
                        Key asKey = asKey();
                        sb.append('\"');
                        StringBuilder key = asKey.toString(sb);
                        key.append('\"');
                        return key;
                    case 5:
                        sb.append('\"');
                        sb.append(asString());
                        sb.append('\"');
                        return sb;
                    case 9:
                        return asMap().toString(sb);
                    case 10:
                        return asVector().toString(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new FlexBufferException("not_implemented:" + this.type);
                    case 25:
                        return asBlob().toString(sb);
                    case 26:
                        sb.append(asBoolean());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(asVector());
            return sb;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static abstract class Sized extends Object {
        protected final int size;

        Sized(ReadBuf readBuf, int i8, int i9) {
            super(readBuf, i8, i9);
            this.size = FlexBuffers.readInt(this.bb, i8 - i9, i9);
        }

        public int size() {
            return this.size;
        }
    }

    /* loaded from: classes3.dex */
    public static class TypedVector extends Vector {
        private static final TypedVector EMPTY_VECTOR = new TypedVector(FlexBuffers.EMPTY_BB, 1, 1, 1);
        private final int elemType;

        TypedVector(ReadBuf readBuf, int i8, int i9, int i10) {
            super(readBuf, i8, i9);
            this.elemType = i10;
        }

        public static TypedVector empty() {
            return EMPTY_VECTOR;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        public Reference get(int i8) {
            if (i8 >= size()) {
                return Reference.NULL_REFERENCE;
            }
            return new Reference(this.bb, this.end + (i8 * this.byteWidth), this.byteWidth, 1, this.elemType);
        }

        public int getElemType() {
            return this.elemType;
        }

        public boolean isEmptyVector() {
            if (this == EMPTY_VECTOR) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class Unsigned {
        Unsigned() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static int byteToUnsignedInt(byte b9) {
            return b9 & 255;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static long intToUnsignedLong(int i8) {
            return i8 & 4294967295L;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static int shortToUnsignedInt(short s8) {
            return s8 & 65535;
        }
    }

    /* loaded from: classes3.dex */
    public static class Vector extends Sized {
        private static final Vector EMPTY_VECTOR = new Vector(FlexBuffers.EMPTY_BB, 1, 1);

        Vector(ReadBuf readBuf, int i8, int i9) {
            super(readBuf, i8, i9);
        }

        public static Vector empty() {
            return EMPTY_VECTOR;
        }

        public Reference get(int i8) {
            long size = size();
            long j8 = i8;
            if (j8 >= size) {
                return Reference.NULL_REFERENCE;
            }
            return new Reference(this.bb, this.end + (i8 * this.byteWidth), this.byteWidth, Unsigned.byteToUnsignedInt(this.bb.get((int) (this.end + (size * this.byteWidth) + j8))));
        }

        public boolean isEmpty() {
            if (this == EMPTY_VECTOR) {
                return true;
            }
            return false;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Object
        public StringBuilder toString(StringBuilder sb) {
            sb.append("[ ");
            int size = size();
            for (int i8 = 0; i8 < size; i8++) {
                get(i8).toString(sb);
                if (i8 != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }
    }

    @Deprecated
    public static Reference getRoot(ByteBuffer byteBuffer) {
        return getRoot(byteBuffer.hasArray() ? new ArrayReadWriteBuf(byteBuffer.array(), byteBuffer.limit()) : new ByteBufferReadWriteBuf(byteBuffer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indirect(ReadBuf readBuf, int i8, int i9) {
        return (int) (i8 - readUInt(readBuf, i8, i9));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isTypeInline(int i8) {
        return i8 <= 3 || i8 == 26;
    }

    static boolean isTypedVector(int i8) {
        return (i8 >= 11 && i8 <= 15) || i8 == 36;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isTypedVectorElementType(int i8) {
        return (i8 >= 1 && i8 <= 4) || i8 == 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double readDouble(ReadBuf readBuf, int i8, int i9) {
        if (i9 != 4) {
            if (i9 != 8) {
                return -1.0d;
            }
            return readBuf.getDouble(i8);
        }
        return readBuf.getFloat(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int readInt(ReadBuf readBuf, int i8, int i9) {
        return (int) readLong(readBuf, i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readLong(ReadBuf readBuf, int i8, int i9) {
        int i10;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 4) {
                    if (i9 != 8) {
                        return -1L;
                    }
                    return readBuf.getLong(i8);
                }
                i10 = readBuf.getInt(i8);
            } else {
                i10 = readBuf.getShort(i8);
            }
        } else {
            i10 = readBuf.get(i8);
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long readUInt(ReadBuf readBuf, int i8, int i9) {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 4) {
                    if (i9 != 8) {
                        return -1L;
                    }
                    return readBuf.getLong(i8);
                }
                return Unsigned.intToUnsignedLong(readBuf.getInt(i8));
            }
            return Unsigned.shortToUnsignedInt(readBuf.getShort(i8));
        }
        return Unsigned.byteToUnsignedInt(readBuf.get(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int toTypedVector(int i8, int i9) {
        if (i9 == 0) {
            return i8 + 10;
        }
        if (i9 == 2) {
            return i8 + 15;
        }
        if (i9 == 3) {
            return i8 + 18;
        }
        if (i9 != 4) {
            return 0;
        }
        return i8 + 21;
    }

    static int toTypedVectorElementType(int i8) {
        return i8 - 10;
    }

    public static Reference getRoot(ReadBuf readBuf) {
        int limit = readBuf.limit();
        byte b9 = readBuf.get(limit - 1);
        int i8 = limit - 2;
        return new Reference(readBuf, i8 - b9, b9, Unsigned.byteToUnsignedInt(readBuf.get(i8)));
    }
}
