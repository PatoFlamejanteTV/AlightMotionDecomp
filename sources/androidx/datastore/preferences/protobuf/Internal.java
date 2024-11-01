package androidx.datastore.preferences.protobuf;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes3.dex */
public final class Internal {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final ByteBuffer EMPTY_BYTE_BUFFER;
    public static final CodedInputStream EMPTY_CODED_INPUT_STREAM;
    static final Charset US_ASCII = Charset.forName(C.ASCII_NAME);
    static final Charset UTF_8 = Charset.forName(C.UTF8_NAME);
    static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    /* loaded from: classes3.dex */
    public interface BooleanList extends ProtobufList<Boolean> {
        void addBoolean(boolean z8);

        boolean getBoolean(int i8);

        @Override // 
        ProtobufList<Boolean> mutableCopyWithCapacity(int i8);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ ProtobufList<Boolean> mutableCopyWithCapacity2(int i8);

        @CanIgnoreReturnValue
        boolean setBoolean(int i8, boolean z8);
    }

    /* loaded from: classes3.dex */
    public interface DoubleList extends ProtobufList<Double> {
        void addDouble(double d8);

        double getDouble(int i8);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        ProtobufList<Double> mutableCopyWithCapacity(int i8);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ ProtobufList<Double> mutableCopyWithCapacity2(int i8);

        @CanIgnoreReturnValue
        double setDouble(int i8, double d8);
    }

    /* loaded from: classes3.dex */
    public interface EnumLite {
        int getNumber();
    }

    /* loaded from: classes3.dex */
    public interface EnumLiteMap<T extends EnumLite> {
        T findValueByNumber(int i8);
    }

    /* loaded from: classes3.dex */
    public interface EnumVerifier {
        boolean isInRange(int i8);
    }

    /* loaded from: classes3.dex */
    public interface FloatList extends ProtobufList<Float> {
        void addFloat(float f8);

        float getFloat(int i8);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        ProtobufList<Float> mutableCopyWithCapacity(int i8);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ ProtobufList<Float> mutableCopyWithCapacity2(int i8);

        @CanIgnoreReturnValue
        float setFloat(int i8, float f8);
    }

    /* loaded from: classes3.dex */
    public interface IntList extends ProtobufList<Integer> {
        void addInt(int i8);

        int getInt(int i8);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        ProtobufList<Integer> mutableCopyWithCapacity(int i8);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ ProtobufList<Integer> mutableCopyWithCapacity2(int i8);

        @CanIgnoreReturnValue
        int setInt(int i8, int i9);
    }

    /* loaded from: classes3.dex */
    public static class ListAdapter<F, T> extends AbstractList<T> {
        private final Converter<F, T> converter;
        private final List<F> fromList;

        /* loaded from: classes3.dex */
        public interface Converter<F, T> {
            T convert(F f8);
        }

        public ListAdapter(List<F> list, Converter<F, T> converter) {
            this.fromList = list;
            this.converter = converter;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i8) {
            return (T) this.converter.convert(this.fromList.get(i8));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    /* loaded from: classes3.dex */
    public interface LongList extends ProtobufList<Long> {
        void addLong(long j8);

        long getLong(int i8);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        ProtobufList<Long> mutableCopyWithCapacity(int i8);

        @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
        /* renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ ProtobufList<Long> mutableCopyWithCapacity2(int i8);

        @CanIgnoreReturnValue
        long setLong(int i8, long j8);
    }

    /* loaded from: classes3.dex */
    public static class MapAdapter<K, V, RealValue> extends AbstractMap<K, V> {
        private final Map<K, RealValue> realMap;
        private final Converter<RealValue, V> valueConverter;

        /* loaded from: classes3.dex */
        public interface Converter<A, B> {
            A doBackward(B b9);

            B doForward(A a9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public class EntryAdapter implements Map.Entry<K, V> {
            private final Map.Entry<K, RealValue> realEntry;

            public EntryAdapter(Map.Entry<K, RealValue> entry) {
                this.realEntry = entry;
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if ((obj instanceof Map.Entry) && getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue())) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Map.Entry
            public K getKey() {
                return this.realEntry.getKey();
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                return (V) MapAdapter.this.valueConverter.doForward(this.realEntry.getValue());
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.realEntry.hashCode();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Map.Entry
            public V setValue(V v8) {
                Object value = this.realEntry.setValue(MapAdapter.this.valueConverter.doBackward(v8));
                if (value == null) {
                    return null;
                }
                return (V) MapAdapter.this.valueConverter.doForward(value);
            }
        }

        /* loaded from: classes3.dex */
        private class IteratorAdapter implements Iterator<Map.Entry<K, V>> {
            private final Iterator<Map.Entry<K, RealValue>> realIterator;

            public IteratorAdapter(Iterator<Map.Entry<K, RealValue>> it) {
                this.realIterator = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.realIterator.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.realIterator.remove();
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                return new EntryAdapter(this.realIterator.next());
            }
        }

        /* loaded from: classes3.dex */
        private class SetAdapter extends AbstractSet<Map.Entry<K, V>> {
            private final Set<Map.Entry<K, RealValue>> realSet;

            public SetAdapter(Set<Map.Entry<K, RealValue>> set) {
                this.realSet = set;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new IteratorAdapter(this.realSet.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.realSet.size();
            }
        }

        public MapAdapter(Map<K, RealValue> map, Converter<RealValue, V> converter) {
            this.realMap = map;
            this.valueConverter = converter;
        }

        public static <T extends EnumLite> Converter<Integer, T> newEnumConverter(final EnumLiteMap<T> enumLiteMap, final T t8) {
            return (Converter<Integer, T>) new Converter<Integer, T>() { // from class: androidx.datastore.preferences.protobuf.Internal.MapAdapter.1
                /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
                @Override // androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter
                public Integer doBackward(EnumLite enumLite) {
                    return Integer.valueOf(enumLite.getNumber());
                }

                /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TT; */
                @Override // androidx.datastore.preferences.protobuf.Internal.MapAdapter.Converter
                public EnumLite doForward(Integer num) {
                    EnumLite findValueByNumber = EnumLiteMap.this.findValueByNumber(num.intValue());
                    return findValueByNumber == null ? t8 : findValueByNumber;
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new SetAdapter(this.realMap.entrySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            RealValue realvalue = this.realMap.get(obj);
            if (realvalue == null) {
                return null;
            }
            return this.valueConverter.doForward(realvalue);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k8, V v8) {
            Object put = this.realMap.put(k8, this.valueConverter.doBackward(v8));
            if (put == null) {
                return null;
            }
            return (V) this.valueConverter.doForward(put);
        }
    }

    /* loaded from: classes3.dex */
    public interface ProtobufList<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        ProtobufList<E> mutableCopyWithCapacity(int i8);
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_BYTE_BUFFER = ByteBuffer.wrap(bArr);
        EMPTY_CODED_INPUT_STREAM = CodedInputStream.newInstance(bArr);
    }

    private Internal() {
    }

    public static byte[] byteArrayDefaultValue(String str) {
        return str.getBytes(ISO_8859_1);
    }

    public static ByteBuffer byteBufferDefaultValue(String str) {
        return ByteBuffer.wrap(byteArrayDefaultValue(str));
    }

    public static ByteString bytesDefaultValue(String str) {
        return ByteString.copyFrom(str.getBytes(ISO_8859_1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T checkNotNull(T t8) {
        t8.getClass();
        return t8;
    }

    public static ByteBuffer copyByteBuffer(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        ByteBuffer allocate = ByteBuffer.allocate(duplicate.capacity());
        allocate.put(duplicate);
        allocate.clear();
        return allocate;
    }

    public static boolean equals(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (!Arrays.equals(list.get(i8), list2.get(i8))) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer.capacity() != byteBuffer2.capacity()) {
            return false;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        Java8Compatibility.clear(duplicate);
        ByteBuffer duplicate2 = byteBuffer2.duplicate();
        Java8Compatibility.clear(duplicate2);
        return duplicate.equals(duplicate2);
    }

    public static <T extends MessageLite> T getDefaultInstance(Class<T> cls) {
        try {
            java.lang.reflect.Method method = cls.getMethod("getDefaultInstance", null);
            return (T) method.invoke(method, null);
        } catch (Exception e8) {
            throw new RuntimeException("Failed to get default instance for " + cls, e8);
        }
    }

    public static int hashBoolean(boolean z8) {
        return z8 ? 1231 : 1237;
    }

    public static int hashCode(List<byte[]> list) {
        Iterator<byte[]> it = list.iterator();
        int i8 = 1;
        while (it.hasNext()) {
            i8 = (i8 * 31) + hashCode(it.next());
        }
        return i8;
    }

    public static int hashCodeByteBuffer(List<ByteBuffer> list) {
        Iterator<ByteBuffer> it = list.iterator();
        int i8 = 1;
        while (it.hasNext()) {
            i8 = (i8 * 31) + hashCodeByteBuffer(it.next());
        }
        return i8;
    }

    public static int hashEnum(EnumLite enumLite) {
        return enumLite.getNumber();
    }

    public static int hashEnumList(List<? extends EnumLite> list) {
        Iterator<? extends EnumLite> it = list.iterator();
        int i8 = 1;
        while (it.hasNext()) {
            i8 = (i8 * 31) + hashEnum(it.next());
        }
        return i8;
    }

    public static int hashLong(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }

    public static boolean isValidUtf8(ByteString byteString) {
        return byteString.isValidUtf8();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object mergeMessage(Object obj, Object obj2) {
        return ((MessageLite) obj).toBuilder().mergeFrom((MessageLite) obj2).buildPartial();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int partialHash(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = i9; i11 < i9 + i10; i11++) {
            i8 = (i8 * 31) + bArr[i11];
        }
        return i8;
    }

    public static String stringDefaultValue(String str) {
        return new String(str.getBytes(ISO_8859_1), UTF_8);
    }

    public static byte[] toByteArray(String str) {
        return str.getBytes(UTF_8);
    }

    public static String toStringUtf8(byte[] bArr) {
        return new String(bArr, UTF_8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T checkNotNull(T t8, String str) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(str);
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return Utf8.isValidUtf8(bArr);
    }

    public static int hashCode(byte[] bArr) {
        return hashCode(bArr, 0, bArr.length);
    }

    public static int hashCodeByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int partialHash = partialHash(byteBuffer.capacity(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            if (partialHash == 0) {
                return 1;
            }
            return partialHash;
        }
        int capacity = byteBuffer.capacity() <= 4096 ? byteBuffer.capacity() : 4096;
        byte[] bArr = new byte[capacity];
        ByteBuffer duplicate = byteBuffer.duplicate();
        Java8Compatibility.clear(duplicate);
        int capacity2 = byteBuffer.capacity();
        while (duplicate.remaining() > 0) {
            int remaining = duplicate.remaining() <= capacity ? duplicate.remaining() : capacity;
            duplicate.get(bArr, 0, remaining);
            capacity2 = partialHash(capacity2, bArr, 0, remaining);
        }
        if (capacity2 == 0) {
            return 1;
        }
        return capacity2;
    }

    static int hashCode(byte[] bArr, int i8, int i9) {
        int partialHash = partialHash(i9, bArr, i8, i9);
        if (partialHash == 0) {
            return 1;
        }
        return partialHash;
    }

    public static boolean equalsByteBuffer(List<ByteBuffer> list, List<ByteBuffer> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (!equalsByteBuffer(list.get(i8), list2.get(i8))) {
                return false;
            }
        }
        return true;
    }
}
