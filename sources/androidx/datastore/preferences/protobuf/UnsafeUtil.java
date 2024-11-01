package androidx.datastore.preferences.protobuf;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class UnsafeUtil {
    private static final long BOOLEAN_ARRAY_BASE_OFFSET;
    private static final long BOOLEAN_ARRAY_INDEX_SCALE;
    private static final long BUFFER_ADDRESS_OFFSET;
    private static final int BYTE_ARRAY_ALIGNMENT;
    static final long BYTE_ARRAY_BASE_OFFSET;
    private static final long DOUBLE_ARRAY_BASE_OFFSET;
    private static final long DOUBLE_ARRAY_INDEX_SCALE;
    private static final long FLOAT_ARRAY_BASE_OFFSET;
    private static final long FLOAT_ARRAY_INDEX_SCALE;
    private static final long INT_ARRAY_BASE_OFFSET;
    private static final long INT_ARRAY_INDEX_SCALE;
    static final boolean IS_BIG_ENDIAN;
    private static final long LONG_ARRAY_BASE_OFFSET;
    private static final long LONG_ARRAY_INDEX_SCALE;
    private static final long OBJECT_ARRAY_BASE_OFFSET;
    private static final long OBJECT_ARRAY_INDEX_SCALE;
    private static final int STRIDE = 8;
    private static final int STRIDE_ALIGNMENT_MASK = 7;
    private static final Unsafe UNSAFE = getUnsafe();
    private static final Class<?> MEMORY_CLASS = Android.getMemoryClass();
    private static final boolean IS_ANDROID_64 = determineAndroidSupportByAddressSize(Long.TYPE);
    private static final boolean IS_ANDROID_32 = determineAndroidSupportByAddressSize(Integer.TYPE);
    private static final MemoryAccessor MEMORY_ACCESSOR = getMemoryAccessor();
    private static final boolean HAS_UNSAFE_BYTEBUFFER_OPERATIONS = supportsUnsafeByteBufferOperations();
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = supportsUnsafeArrayOperations();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class Android32MemoryAccessor extends MemoryAccessor {
        private static final long SMALL_ADDRESS_MASK = -1;

        Android32MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        private static int smallAddress(long j8) {
            return (int) j8;
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long j8, byte[] bArr, long j9, long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object obj, long j8) {
            return UnsafeUtil.IS_BIG_ENDIAN ? UnsafeUtil.getBooleanBigEndian(obj, j8) : UnsafeUtil.getBooleanLittleEndian(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object obj, long j8) {
            return UnsafeUtil.IS_BIG_ENDIAN ? UnsafeUtil.getByteBigEndian(obj, j8) : UnsafeUtil.getByteLittleEndian(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object obj, long j8) {
            return Double.longBitsToDouble(getLong(obj, j8));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object obj, long j8) {
            return Float.intBitsToFloat(getInt(obj, j8));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long j8) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long j8) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(java.lang.reflect.Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object obj, long j8, boolean z8) {
            if (UnsafeUtil.IS_BIG_ENDIAN) {
                UnsafeUtil.putBooleanBigEndian(obj, j8, z8);
            } else {
                UnsafeUtil.putBooleanLittleEndian(obj, j8, z8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object obj, long j8, byte b9) {
            if (UnsafeUtil.IS_BIG_ENDIAN) {
                UnsafeUtil.putByteBigEndian(obj, j8, b9);
            } else {
                UnsafeUtil.putByteLittleEndian(obj, j8, b9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object obj, long j8, double d8) {
            putLong(obj, j8, Double.doubleToLongBits(d8));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object obj, long j8, float f8) {
            putInt(obj, j8, Float.floatToIntBits(f8));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long j8, int i8) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long j8, long j9) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] bArr, long j8, long j9, long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long j8) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long j8, byte b9) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class Android64MemoryAccessor extends MemoryAccessor {
        Android64MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long j8, byte[] bArr, long j9, long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object obj, long j8) {
            return UnsafeUtil.IS_BIG_ENDIAN ? UnsafeUtil.getBooleanBigEndian(obj, j8) : UnsafeUtil.getBooleanLittleEndian(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object obj, long j8) {
            return UnsafeUtil.IS_BIG_ENDIAN ? UnsafeUtil.getByteBigEndian(obj, j8) : UnsafeUtil.getByteLittleEndian(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object obj, long j8) {
            return Double.longBitsToDouble(getLong(obj, j8));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object obj, long j8) {
            return Float.intBitsToFloat(getInt(obj, j8));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long j8) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long j8) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(java.lang.reflect.Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object obj, long j8, boolean z8) {
            if (UnsafeUtil.IS_BIG_ENDIAN) {
                UnsafeUtil.putBooleanBigEndian(obj, j8, z8);
            } else {
                UnsafeUtil.putBooleanLittleEndian(obj, j8, z8);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object obj, long j8, byte b9) {
            if (UnsafeUtil.IS_BIG_ENDIAN) {
                UnsafeUtil.putByteBigEndian(obj, j8, b9);
            } else {
                UnsafeUtil.putByteLittleEndian(obj, j8, b9);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object obj, long j8, double d8) {
            putLong(obj, j8, Double.doubleToLongBits(d8));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object obj, long j8, float f8) {
            putInt(obj, j8, Float.floatToIntBits(f8));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long j8, int i8) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long j8, long j9) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] bArr, long j8, long j9, long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long j8) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long j8, byte b9) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class JvmMemoryAccessor extends MemoryAccessor {
        JvmMemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long j8, byte[] bArr, long j9, long j10) {
            this.unsafe.copyMemory((Object) null, j8, bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j9, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object obj, long j8) {
            return this.unsafe.getBoolean(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object obj, long j8) {
            return this.unsafe.getByte(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object obj, long j8) {
            return this.unsafe.getDouble(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object obj, long j8) {
            return this.unsafe.getFloat(obj, j8);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long j8) {
            return this.unsafe.getInt(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long j8) {
            return this.unsafe.getLong(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(java.lang.reflect.Field field) {
            return getObject(this.unsafe.staticFieldBase(field), this.unsafe.staticFieldOffset(field));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object obj, long j8, boolean z8) {
            this.unsafe.putBoolean(obj, j8, z8);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object obj, long j8, byte b9) {
            this.unsafe.putByte(obj, j8, b9);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object obj, long j8, double d8) {
            this.unsafe.putDouble(obj, j8, d8);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object obj, long j8, float f8) {
            this.unsafe.putFloat(obj, j8, f8);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long j8, int i8) {
            this.unsafe.putInt(j8, i8);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long j8, long j9) {
            this.unsafe.putLong(j8, j9);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeArrayOperations() {
            if (!super.supportsUnsafeArrayOperations()) {
                return false;
            }
            try {
                Class<?> cls = this.unsafe.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                UnsafeUtil.logMissingMethod(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeByteBufferOperations() {
            if (!super.supportsUnsafeByteBufferOperations()) {
                return false;
            }
            try {
                Class<?> cls = this.unsafe.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                UnsafeUtil.logMissingMethod(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] bArr, long j8, long j9, long j10) {
            this.unsafe.copyMemory(bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j8, (Object) null, j9, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long j8) {
            return this.unsafe.getByte(j8);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long j8, byte b9) {
            this.unsafe.putByte(j8, b9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static abstract class MemoryAccessor {
        Unsafe unsafe;

        MemoryAccessor(Unsafe unsafe) {
            this.unsafe = unsafe;
        }

        public final int arrayBaseOffset(Class<?> cls) {
            return this.unsafe.arrayBaseOffset(cls);
        }

        public final int arrayIndexScale(Class<?> cls) {
            return this.unsafe.arrayIndexScale(cls);
        }

        public abstract void copyMemory(long j8, byte[] bArr, long j9, long j10);

        public abstract void copyMemory(byte[] bArr, long j8, long j9, long j10);

        public abstract boolean getBoolean(Object obj, long j8);

        public abstract byte getByte(long j8);

        public abstract byte getByte(Object obj, long j8);

        public abstract double getDouble(Object obj, long j8);

        public abstract float getFloat(Object obj, long j8);

        public abstract int getInt(long j8);

        public final int getInt(Object obj, long j8) {
            return this.unsafe.getInt(obj, j8);
        }

        public abstract long getLong(long j8);

        public final long getLong(Object obj, long j8) {
            return this.unsafe.getLong(obj, j8);
        }

        public final Object getObject(Object obj, long j8) {
            return this.unsafe.getObject(obj, j8);
        }

        public abstract Object getStaticObject(java.lang.reflect.Field field);

        public final long objectFieldOffset(java.lang.reflect.Field field) {
            return this.unsafe.objectFieldOffset(field);
        }

        public abstract void putBoolean(Object obj, long j8, boolean z8);

        public abstract void putByte(long j8, byte b9);

        public abstract void putByte(Object obj, long j8, byte b9);

        public abstract void putDouble(Object obj, long j8, double d8);

        public abstract void putFloat(Object obj, long j8, float f8);

        public abstract void putInt(long j8, int i8);

        public final void putInt(Object obj, long j8, int i8) {
            this.unsafe.putInt(obj, j8, i8);
        }

        public abstract void putLong(long j8, long j9);

        public final void putLong(Object obj, long j8, long j9) {
            this.unsafe.putLong(obj, j8, j9);
        }

        public final void putObject(Object obj, long j8, Object obj2) {
            this.unsafe.putObject(obj, j8, obj2);
        }

        public boolean supportsUnsafeArrayOperations() {
            Unsafe unsafe = this.unsafe;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                UnsafeUtil.logMissingMethod(th);
                return false;
            }
        }

        public boolean supportsUnsafeByteBufferOperations() {
            Unsafe unsafe = this.unsafe;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                if (UnsafeUtil.access$100() != null) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                UnsafeUtil.logMissingMethod(th);
                return false;
            }
        }
    }

    static {
        boolean z8;
        long arrayBaseOffset = arrayBaseOffset(byte[].class);
        BYTE_ARRAY_BASE_OFFSET = arrayBaseOffset;
        BOOLEAN_ARRAY_BASE_OFFSET = arrayBaseOffset(boolean[].class);
        BOOLEAN_ARRAY_INDEX_SCALE = arrayIndexScale(boolean[].class);
        INT_ARRAY_BASE_OFFSET = arrayBaseOffset(int[].class);
        INT_ARRAY_INDEX_SCALE = arrayIndexScale(int[].class);
        LONG_ARRAY_BASE_OFFSET = arrayBaseOffset(long[].class);
        LONG_ARRAY_INDEX_SCALE = arrayIndexScale(long[].class);
        FLOAT_ARRAY_BASE_OFFSET = arrayBaseOffset(float[].class);
        FLOAT_ARRAY_INDEX_SCALE = arrayIndexScale(float[].class);
        DOUBLE_ARRAY_BASE_OFFSET = arrayBaseOffset(double[].class);
        DOUBLE_ARRAY_INDEX_SCALE = arrayIndexScale(double[].class);
        OBJECT_ARRAY_BASE_OFFSET = arrayBaseOffset(Object[].class);
        OBJECT_ARRAY_INDEX_SCALE = arrayIndexScale(Object[].class);
        BUFFER_ADDRESS_OFFSET = fieldOffset(bufferAddressField());
        BYTE_ARRAY_ALIGNMENT = (int) (arrayBaseOffset & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z8 = true;
        } else {
            z8 = false;
        }
        IS_BIG_ENDIAN = z8;
    }

    private UnsafeUtil() {
    }

    static /* synthetic */ java.lang.reflect.Field access$100() {
        return bufferAddressField();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long addressOffset(ByteBuffer byteBuffer) {
        return MEMORY_ACCESSOR.getLong(byteBuffer, BUFFER_ADDRESS_OFFSET);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T allocateInstance(Class<T> cls) {
        try {
            return (T) UNSAFE.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    private static int arrayBaseOffset(Class<?> cls) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            return MEMORY_ACCESSOR.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int arrayIndexScale(Class<?> cls) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            return MEMORY_ACCESSOR.arrayIndexScale(cls);
        }
        return -1;
    }

    private static java.lang.reflect.Field bufferAddressField() {
        java.lang.reflect.Field field;
        if (Android.isOnAndroidDevice() && (field = field(Buffer.class, "effectiveDirectAddress")) != null) {
            return field;
        }
        java.lang.reflect.Field field2 = field(Buffer.class, "address");
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void copyMemory(byte[] bArr, long j8, long j9, long j10) {
        MEMORY_ACCESSOR.copyMemory(bArr, j8, j9, j10);
    }

    static boolean determineAndroidSupportByAddressSize(Class<?> cls) {
        if (!Android.isOnAndroidDevice()) {
            return false;
        }
        try {
            Class<?> cls2 = MEMORY_CLASS;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static java.lang.reflect.Field field(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long fieldOffset(java.lang.reflect.Field field) {
        MemoryAccessor memoryAccessor;
        if (field != null && (memoryAccessor = MEMORY_ACCESSOR) != null) {
            return memoryAccessor.objectFieldOffset(field);
        }
        return -1L;
    }

    private static int firstDifferingByteIndexNativeEndian(long j8, long j9) {
        int numberOfTrailingZeros;
        if (IS_BIG_ENDIAN) {
            numberOfTrailingZeros = Long.numberOfLeadingZeros(j8 ^ j9);
        } else {
            numberOfTrailingZeros = Long.numberOfTrailingZeros(j8 ^ j9);
        }
        return numberOfTrailingZeros >> 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean getBoolean(Object obj, long j8) {
        return MEMORY_ACCESSOR.getBoolean(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanBigEndian(Object obj, long j8) {
        if (getByteBigEndian(obj, j8) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanLittleEndian(Object obj, long j8) {
        if (getByteLittleEndian(obj, j8) != 0) {
            return true;
        }
        return false;
    }

    static byte getByte(Object obj, long j8) {
        return MEMORY_ACCESSOR.getByte(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteBigEndian(Object obj, long j8) {
        return (byte) ((getInt(obj, (-4) & j8) >>> ((int) (((~j8) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteLittleEndian(Object obj, long j8) {
        return (byte) ((getInt(obj, (-4) & j8) >>> ((int) ((j8 & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double getDouble(Object obj, long j8) {
        return MEMORY_ACCESSOR.getDouble(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float getFloat(Object obj, long j8) {
        return MEMORY_ACCESSOR.getFloat(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getInt(Object obj, long j8) {
        return MEMORY_ACCESSOR.getInt(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long getLong(Object obj, long j8) {
        return MEMORY_ACCESSOR.getLong(obj, j8);
    }

    private static MemoryAccessor getMemoryAccessor() {
        Unsafe unsafe = UNSAFE;
        if (unsafe == null) {
            return null;
        }
        if (Android.isOnAndroidDevice()) {
            if (IS_ANDROID_64) {
                return new Android64MemoryAccessor(unsafe);
            }
            if (!IS_ANDROID_32) {
                return null;
            }
            return new Android32MemoryAccessor(unsafe);
        }
        return new JvmMemoryAccessor(unsafe);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object getObject(Object obj, long j8) {
        return MEMORY_ACCESSOR.getObject(obj, j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object getStaticObject(java.lang.reflect.Field field) {
        return MEMORY_ACCESSOR.getStaticObject(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe getUnsafe() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: androidx.datastore.preferences.protobuf.UnsafeUtil.1
                @Override // java.security.PrivilegedExceptionAction
                public Unsafe run() throws Exception {
                    for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean hasUnsafeArrayOperations() {
        return HAS_UNSAFE_ARRAY_OPERATIONS;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean hasUnsafeByteBufferOperations() {
        return HAS_UNSAFE_BYTEBUFFER_OPERATIONS;
    }

    static boolean isAndroid64() {
        return IS_ANDROID_64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logMissingMethod(Throwable th) {
        Logger.getLogger(UnsafeUtil.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    static int mismatch(byte[] bArr, int i8, byte[] bArr2, int i9, int i10) {
        if (i8 >= 0 && i9 >= 0 && i10 >= 0 && i8 + i10 <= bArr.length && i9 + i10 <= bArr2.length) {
            int i11 = 0;
            if (HAS_UNSAFE_ARRAY_OPERATIONS) {
                for (int i12 = (BYTE_ARRAY_ALIGNMENT + i8) & 7; i11 < i10 && (i12 & 7) != 0; i12++) {
                    if (bArr[i8 + i11] != bArr2[i9 + i11]) {
                        return i11;
                    }
                    i11++;
                }
                int i13 = ((i10 - i11) & (-8)) + i11;
                while (i11 < i13) {
                    long j8 = BYTE_ARRAY_BASE_OFFSET;
                    long j9 = i11;
                    long j10 = getLong((Object) bArr, i8 + j8 + j9);
                    long j11 = getLong((Object) bArr2, j8 + i9 + j9);
                    if (j10 != j11) {
                        return i11 + firstDifferingByteIndexNativeEndian(j10, j11);
                    }
                    i11 += 8;
                }
            }
            while (i11 < i10) {
                if (bArr[i8 + i11] != bArr2[i9 + i11]) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long objectFieldOffset(java.lang.reflect.Field field) {
        return MEMORY_ACCESSOR.objectFieldOffset(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putBoolean(Object obj, long j8, boolean z8) {
        MEMORY_ACCESSOR.putBoolean(obj, j8, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanBigEndian(Object obj, long j8, boolean z8) {
        putByteBigEndian(obj, j8, z8 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanLittleEndian(Object obj, long j8, boolean z8) {
        putByteLittleEndian(obj, j8, z8 ? (byte) 1 : (byte) 0);
    }

    static void putByte(Object obj, long j8, byte b9) {
        MEMORY_ACCESSOR.putByte(obj, j8, b9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteBigEndian(Object obj, long j8, byte b9) {
        long j9 = (-4) & j8;
        int i8 = getInt(obj, j9);
        int i9 = ((~((int) j8)) & 3) << 3;
        putInt(obj, j9, ((255 & b9) << i9) | (i8 & (~(255 << i9))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteLittleEndian(Object obj, long j8, byte b9) {
        long j9 = (-4) & j8;
        int i8 = (((int) j8) & 3) << 3;
        putInt(obj, j9, ((255 & b9) << i8) | (getInt(obj, j9) & (~(255 << i8))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putDouble(Object obj, long j8, double d8) {
        MEMORY_ACCESSOR.putDouble(obj, j8, d8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putFloat(Object obj, long j8, float f8) {
        MEMORY_ACCESSOR.putFloat(obj, j8, f8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putInt(Object obj, long j8, int i8) {
        MEMORY_ACCESSOR.putInt(obj, j8, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putLong(Object obj, long j8, long j9) {
        MEMORY_ACCESSOR.putLong(obj, j8, j9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putObject(Object obj, long j8, Object obj2) {
        MEMORY_ACCESSOR.putObject(obj, j8, obj2);
    }

    private static boolean supportsUnsafeArrayOperations() {
        MemoryAccessor memoryAccessor = MEMORY_ACCESSOR;
        if (memoryAccessor == null) {
            return false;
        }
        return memoryAccessor.supportsUnsafeArrayOperations();
    }

    private static boolean supportsUnsafeByteBufferOperations() {
        MemoryAccessor memoryAccessor = MEMORY_ACCESSOR;
        if (memoryAccessor == null) {
            return false;
        }
        return memoryAccessor.supportsUnsafeByteBufferOperations();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void copyMemory(long j8, byte[] bArr, long j9, long j10) {
        MEMORY_ACCESSOR.copyMemory(j8, bArr, j9, j10);
    }

    static boolean getBoolean(boolean[] zArr, long j8) {
        return MEMORY_ACCESSOR.getBoolean(zArr, BOOLEAN_ARRAY_BASE_OFFSET + (j8 * BOOLEAN_ARRAY_INDEX_SCALE));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte getByte(byte[] bArr, long j8) {
        return MEMORY_ACCESSOR.getByte(bArr, BYTE_ARRAY_BASE_OFFSET + j8);
    }

    static double getDouble(double[] dArr, long j8) {
        return MEMORY_ACCESSOR.getDouble(dArr, DOUBLE_ARRAY_BASE_OFFSET + (j8 * DOUBLE_ARRAY_INDEX_SCALE));
    }

    static float getFloat(float[] fArr, long j8) {
        return MEMORY_ACCESSOR.getFloat(fArr, FLOAT_ARRAY_BASE_OFFSET + (j8 * FLOAT_ARRAY_INDEX_SCALE));
    }

    static int getInt(int[] iArr, long j8) {
        return MEMORY_ACCESSOR.getInt(iArr, INT_ARRAY_BASE_OFFSET + (j8 * INT_ARRAY_INDEX_SCALE));
    }

    static long getLong(long[] jArr, long j8) {
        return MEMORY_ACCESSOR.getLong(jArr, LONG_ARRAY_BASE_OFFSET + (j8 * LONG_ARRAY_INDEX_SCALE));
    }

    static Object getObject(Object[] objArr, long j8) {
        return MEMORY_ACCESSOR.getObject(objArr, OBJECT_ARRAY_BASE_OFFSET + (j8 * OBJECT_ARRAY_INDEX_SCALE));
    }

    static void putBoolean(boolean[] zArr, long j8, boolean z8) {
        MEMORY_ACCESSOR.putBoolean(zArr, BOOLEAN_ARRAY_BASE_OFFSET + (j8 * BOOLEAN_ARRAY_INDEX_SCALE), z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putByte(byte[] bArr, long j8, byte b9) {
        MEMORY_ACCESSOR.putByte(bArr, BYTE_ARRAY_BASE_OFFSET + j8, b9);
    }

    static void putDouble(double[] dArr, long j8, double d8) {
        MEMORY_ACCESSOR.putDouble(dArr, DOUBLE_ARRAY_BASE_OFFSET + (j8 * DOUBLE_ARRAY_INDEX_SCALE), d8);
    }

    static void putFloat(float[] fArr, long j8, float f8) {
        MEMORY_ACCESSOR.putFloat(fArr, FLOAT_ARRAY_BASE_OFFSET + (j8 * FLOAT_ARRAY_INDEX_SCALE), f8);
    }

    static void putInt(int[] iArr, long j8, int i8) {
        MEMORY_ACCESSOR.putInt(iArr, INT_ARRAY_BASE_OFFSET + (j8 * INT_ARRAY_INDEX_SCALE), i8);
    }

    static void putLong(long[] jArr, long j8, long j9) {
        MEMORY_ACCESSOR.putLong(jArr, LONG_ARRAY_BASE_OFFSET + (j8 * LONG_ARRAY_INDEX_SCALE), j9);
    }

    static void putObject(Object[] objArr, long j8, Object obj) {
        MEMORY_ACCESSOR.putObject(objArr, OBJECT_ARRAY_BASE_OFFSET + (j8 * OBJECT_ARRAY_INDEX_SCALE), obj);
    }

    static void copyMemory(byte[] bArr, long j8, byte[] bArr2, long j9, long j10) {
        System.arraycopy(bArr, (int) j8, bArr2, (int) j9, (int) j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte getByte(long j8) {
        return MEMORY_ACCESSOR.getByte(j8);
    }

    static int getInt(long j8) {
        return MEMORY_ACCESSOR.getInt(j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long getLong(long j8) {
        return MEMORY_ACCESSOR.getLong(j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putByte(long j8, byte b9) {
        MEMORY_ACCESSOR.putByte(j8, b9);
    }

    static void putInt(long j8, int i8) {
        MEMORY_ACCESSOR.putInt(j8, i8);
    }

    static void putLong(long j8, long j9) {
        MEMORY_ACCESSOR.putLong(j8, j9);
    }
}
