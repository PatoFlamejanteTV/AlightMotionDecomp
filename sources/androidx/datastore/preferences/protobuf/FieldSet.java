package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.LazyField;
import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class FieldSet<T extends FieldDescriptorLite<T>> {
    private static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private static final FieldSet DEFAULT_INSTANCE = new FieldSet(true);
    private final SmallSortedMap<T, Object> fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.FieldSet$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class Builder<T extends FieldDescriptorLite<T>> {
        private SmallSortedMap<T, Object> fields;
        private boolean hasLazyField;
        private boolean hasNestedBuilders;
        private boolean isMutable;

        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private FieldSet<T> buildImpl(boolean z8) {
            if (this.fields.isEmpty()) {
                return FieldSet.emptySet();
            }
            this.isMutable = false;
            SmallSortedMap<T, Object> smallSortedMap = this.fields;
            if (this.hasNestedBuilders) {
                smallSortedMap = FieldSet.cloneAllFieldsMap(smallSortedMap, false);
                replaceBuilders(smallSortedMap, z8);
            }
            FieldSet<T> fieldSet = new FieldSet<>(smallSortedMap, null);
            ((FieldSet) fieldSet).hasLazyField = this.hasLazyField;
            return fieldSet;
        }

        private void ensureIsMutable() {
            if (!this.isMutable) {
                this.fields = FieldSet.cloneAllFieldsMap(this.fields, true);
                this.isMutable = true;
            }
        }

        public static <T extends FieldDescriptorLite<T>> Builder<T> fromFieldSet(FieldSet<T> fieldSet) {
            Builder<T> builder = new Builder<>(FieldSet.cloneAllFieldsMap(((FieldSet) fieldSet).fields, true));
            ((Builder) builder).hasLazyField = ((FieldSet) fieldSet).hasLazyField;
            return builder;
        }

        private void mergeFromField(Map.Entry<T, Object> entry) {
            T key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof LazyField) {
                value = ((LazyField) value).getValue();
            }
            if (key.isRepeated()) {
                List list = (List) getFieldAllowBuilders(key);
                if (list == null) {
                    list = new ArrayList();
                    this.fields.put((SmallSortedMap<T, Object>) key, (T) list);
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    list.add(FieldSet.cloneIfMutable(it.next()));
                }
                return;
            }
            if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
                Object fieldAllowBuilders = getFieldAllowBuilders(key);
                if (fieldAllowBuilders == null) {
                    this.fields.put((SmallSortedMap<T, Object>) key, (T) FieldSet.cloneIfMutable(value));
                    return;
                } else if (fieldAllowBuilders instanceof MessageLite.Builder) {
                    key.internalMergeFrom((MessageLite.Builder) fieldAllowBuilders, (MessageLite) value);
                    return;
                } else {
                    this.fields.put((SmallSortedMap<T, Object>) key, (T) key.internalMergeFrom(((MessageLite) fieldAllowBuilders).toBuilder(), (MessageLite) value).build());
                    return;
                }
            }
            this.fields.put((SmallSortedMap<T, Object>) key, (T) FieldSet.cloneIfMutable(value));
        }

        private static Object replaceBuilder(Object obj, boolean z8) {
            if (!(obj instanceof MessageLite.Builder)) {
                return obj;
            }
            MessageLite.Builder builder = (MessageLite.Builder) obj;
            if (z8) {
                return builder.buildPartial();
            }
            return builder.build();
        }

        private static <T extends FieldDescriptorLite<T>> void replaceBuilders(SmallSortedMap<T, Object> smallSortedMap, boolean z8) {
            for (int i8 = 0; i8 < smallSortedMap.getNumArrayEntries(); i8++) {
                replaceBuilders(smallSortedMap.getArrayEntryAt(i8), z8);
            }
            Iterator<Map.Entry<T, Object>> it = smallSortedMap.getOverflowEntries().iterator();
            while (it.hasNext()) {
                replaceBuilders(it.next(), z8);
            }
        }

        private void verifyType(T t8, Object obj) {
            if (!FieldSet.isValidType(t8.getLiteType(), obj)) {
                if (t8.getLiteType().getJavaType() == WireFormat.JavaType.MESSAGE && (obj instanceof MessageLite.Builder)) {
                } else {
                    throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t8.getNumber()), t8.getLiteType().getJavaType(), obj.getClass().getName()));
                }
            }
        }

        public void addRepeatedField(T t8, Object obj) {
            boolean z8;
            List list;
            ensureIsMutable();
            if (t8.isRepeated()) {
                if (!this.hasNestedBuilders && !(obj instanceof MessageLite.Builder)) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                this.hasNestedBuilders = z8;
                verifyType(t8, obj);
                Object fieldAllowBuilders = getFieldAllowBuilders(t8);
                if (fieldAllowBuilders == null) {
                    list = new ArrayList();
                    this.fields.put((SmallSortedMap<T, Object>) t8, (T) list);
                } else {
                    list = (List) fieldAllowBuilders;
                }
                list.add(obj);
                return;
            }
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }

        public FieldSet<T> build() {
            return buildImpl(false);
        }

        public FieldSet<T> buildPartial() {
            return buildImpl(true);
        }

        public void clearField(T t8) {
            ensureIsMutable();
            this.fields.remove(t8);
            if (this.fields.isEmpty()) {
                this.hasLazyField = false;
            }
        }

        public Map<T, Object> getAllFields() {
            if (this.hasLazyField) {
                SmallSortedMap cloneAllFieldsMap = FieldSet.cloneAllFieldsMap(this.fields, false);
                if (this.fields.isImmutable()) {
                    cloneAllFieldsMap.makeImmutable();
                } else {
                    replaceBuilders(cloneAllFieldsMap, true);
                }
                return cloneAllFieldsMap;
            }
            if (this.fields.isImmutable()) {
                return this.fields;
            }
            return DesugarCollections.unmodifiableMap(this.fields);
        }

        public Object getField(T t8) {
            return replaceBuilders(t8, getFieldAllowBuilders(t8), true);
        }

        Object getFieldAllowBuilders(T t8) {
            Object obj = this.fields.get(t8);
            if (obj instanceof LazyField) {
                return ((LazyField) obj).getValue();
            }
            return obj;
        }

        public Object getRepeatedField(T t8, int i8) {
            if (this.hasNestedBuilders) {
                ensureIsMutable();
            }
            return replaceBuilder(getRepeatedFieldAllowBuilders(t8, i8), true);
        }

        Object getRepeatedFieldAllowBuilders(T t8, int i8) {
            if (t8.isRepeated()) {
                Object fieldAllowBuilders = getFieldAllowBuilders(t8);
                if (fieldAllowBuilders != null) {
                    return ((List) fieldAllowBuilders).get(i8);
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        public int getRepeatedFieldCount(T t8) {
            if (t8.isRepeated()) {
                Object fieldAllowBuilders = getFieldAllowBuilders(t8);
                if (fieldAllowBuilders == null) {
                    return 0;
                }
                return ((List) fieldAllowBuilders).size();
            }
            throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
        }

        public boolean hasField(T t8) {
            if (!t8.isRepeated()) {
                if (this.fields.get(t8) != null) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }

        public boolean isInitialized() {
            for (int i8 = 0; i8 < this.fields.getNumArrayEntries(); i8++) {
                if (!FieldSet.isInitialized(this.fields.getArrayEntryAt(i8))) {
                    return false;
                }
            }
            Iterator<Map.Entry<T, Object>> it = this.fields.getOverflowEntries().iterator();
            while (it.hasNext()) {
                if (!FieldSet.isInitialized(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public void mergeFrom(FieldSet<T> fieldSet) {
            ensureIsMutable();
            for (int i8 = 0; i8 < ((FieldSet) fieldSet).fields.getNumArrayEntries(); i8++) {
                mergeFromField(((FieldSet) fieldSet).fields.getArrayEntryAt(i8));
            }
            Iterator it = ((FieldSet) fieldSet).fields.getOverflowEntries().iterator();
            while (it.hasNext()) {
                mergeFromField((Map.Entry) it.next());
            }
        }

        public void setField(T t8, Object obj) {
            boolean z8;
            ensureIsMutable();
            boolean z9 = false;
            if (t8.isRepeated()) {
                if (obj instanceof List) {
                    ArrayList arrayList = new ArrayList((List) obj);
                    for (Object obj2 : arrayList) {
                        verifyType(t8, obj2);
                        if (!this.hasNestedBuilders && !(obj2 instanceof MessageLite.Builder)) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        this.hasNestedBuilders = z8;
                    }
                    obj = arrayList;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            } else {
                verifyType(t8, obj);
            }
            if (obj instanceof LazyField) {
                this.hasLazyField = true;
            }
            if (this.hasNestedBuilders || (obj instanceof MessageLite.Builder)) {
                z9 = true;
            }
            this.hasNestedBuilders = z9;
            this.fields.put((SmallSortedMap<T, Object>) t8, (T) obj);
        }

        public void setRepeatedField(T t8, int i8, Object obj) {
            boolean z8;
            ensureIsMutable();
            if (t8.isRepeated()) {
                if (!this.hasNestedBuilders && !(obj instanceof MessageLite.Builder)) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                this.hasNestedBuilders = z8;
                Object fieldAllowBuilders = getFieldAllowBuilders(t8);
                if (fieldAllowBuilders != null) {
                    verifyType(t8, obj);
                    ((List) fieldAllowBuilders).set(i8, obj);
                    return;
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        private Builder() {
            this(SmallSortedMap.newFieldMap(16));
        }

        private Builder(SmallSortedMap<T, Object> smallSortedMap) {
            this.fields = smallSortedMap;
            this.isMutable = true;
        }

        private static <T extends FieldDescriptorLite<T>> void replaceBuilders(Map.Entry<T, Object> entry, boolean z8) {
            entry.setValue(replaceBuilders(entry.getKey(), entry.getValue(), z8));
        }

        private static <T extends FieldDescriptorLite<T>> Object replaceBuilders(T t8, Object obj, boolean z8) {
            if (obj == null || t8.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
                return obj;
            }
            if (t8.isRepeated()) {
                if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i8 = 0; i8 < list.size(); i8++) {
                        Object obj2 = list.get(i8);
                        Object replaceBuilder = replaceBuilder(obj2, z8);
                        if (replaceBuilder != obj2) {
                            if (list == obj) {
                                list = new ArrayList(list);
                            }
                            list.set(i8, replaceBuilder);
                        }
                    }
                    return list;
                }
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
            }
            return replaceBuilder(obj, z8);
        }
    }

    /* loaded from: classes3.dex */
    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        Internal.EnumLiteMap<?> getEnumType();

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    /* synthetic */ FieldSet(SmallSortedMap smallSortedMap, AnonymousClass1 anonymousClass1) {
        this(smallSortedMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends FieldDescriptorLite<T>> SmallSortedMap<T, Object> cloneAllFieldsMap(SmallSortedMap<T, Object> smallSortedMap, boolean z8) {
        SmallSortedMap<T, Object> newFieldMap = SmallSortedMap.newFieldMap(16);
        for (int i8 = 0; i8 < smallSortedMap.getNumArrayEntries(); i8++) {
            cloneFieldEntry(newFieldMap, smallSortedMap.getArrayEntryAt(i8), z8);
        }
        Iterator<Map.Entry<T, Object>> it = smallSortedMap.getOverflowEntries().iterator();
        while (it.hasNext()) {
            cloneFieldEntry(newFieldMap, it.next(), z8);
        }
        return newFieldMap;
    }

    private static <T extends FieldDescriptorLite<T>> void cloneFieldEntry(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z8) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            map.put(key, ((LazyField) value).getValue());
        } else if (z8 && (value instanceof List)) {
            map.put(key, new ArrayList((List) value));
        } else {
            map.put(key, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object cloneIfMutable(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeElementSize(WireFormat.FieldType fieldType, int i8, Object obj) {
        int computeTagSize = CodedOutputStream.computeTagSize(i8);
        if (fieldType == WireFormat.FieldType.GROUP) {
            computeTagSize *= 2;
        }
        return computeTagSize + computeElementSizeNoTag(fieldType, obj);
    }

    static int computeElementSizeNoTag(WireFormat.FieldType fieldType, Object obj) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case 10:
                if (obj instanceof LazyField) {
                    return CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj);
                }
                return CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case 11:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                }
                return CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 12:
                if (obj instanceof ByteString) {
                    return CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                }
                return CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                if (obj instanceof Internal.EnumLite) {
                    return CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) obj).getNumber());
                }
                return CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int computeFieldSize(FieldDescriptorLite<?> fieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            List list = (List) obj;
            int i8 = 0;
            if (fieldDescriptorLite.isPacked()) {
                if (list.isEmpty()) {
                    return 0;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i8 += computeElementSizeNoTag(liteType, it.next());
                }
                return CodedOutputStream.computeTagSize(number) + i8 + CodedOutputStream.computeUInt32SizeNoTag(i8);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                i8 += computeElementSize(liteType, number, it2.next());
            }
            return i8;
        }
        return computeElementSize(liteType, number, obj);
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> emptySet() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getWireFormatForFieldType(WireFormat.FieldType fieldType, boolean z8) {
        if (z8) {
            return 2;
        }
        return fieldType.getWireType();
    }

    private static boolean isMessageFieldValueInitialized(Object obj) {
        if (obj instanceof MessageLiteOrBuilder) {
            return ((MessageLiteOrBuilder) obj).isInitialized();
        }
        if (obj instanceof LazyField) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidType(WireFormat.FieldType fieldType, Object obj) {
        Internal.checkNotNull(obj);
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType[fieldType.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                if ((obj instanceof ByteString) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof Internal.EnumLite)) {
                    return true;
                }
                return false;
            case 9:
                if ((obj instanceof MessageLite) || (obj instanceof LazyField)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    private void mergeFromField(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        if (key.isRepeated()) {
            Object field = getField(key);
            if (field == null) {
                field = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) field).add(cloneIfMutable(it.next()));
            }
            this.fields.put((SmallSortedMap<T, Object>) key, (T) field);
            return;
        }
        if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            Object field2 = getField(key);
            if (field2 == null) {
                this.fields.put((SmallSortedMap<T, Object>) key, (T) cloneIfMutable(value));
                return;
            } else {
                this.fields.put((SmallSortedMap<T, Object>) key, (T) key.internalMergeFrom(((MessageLite) field2).toBuilder(), (MessageLite) value).build());
                return;
            }
        }
        this.fields.put((SmallSortedMap<T, Object>) key, (T) cloneIfMutable(value));
    }

    public static <T extends FieldDescriptorLite<T>> Builder<T> newBuilder() {
        return new Builder<>((AnonymousClass1) null);
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> newFieldSet() {
        return new FieldSet<>();
    }

    public static Object readPrimitiveField(CodedInputStream codedInputStream, WireFormat.FieldType fieldType, boolean z8) throws IOException {
        if (z8) {
            return WireFormat.readPrimitiveField(codedInputStream, fieldType, WireFormat.Utf8Validation.STRICT);
        }
        return WireFormat.readPrimitiveField(codedInputStream, fieldType, WireFormat.Utf8Validation.LOOSE);
    }

    private void verifyType(T t8, Object obj) {
        if (isValidType(t8.getLiteType(), obj)) {
        } else {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t8.getNumber()), t8.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void writeElement(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i8, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i8, (MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i8, getWireFormatForFieldType(fieldType, false));
            writeElementNoTag(codedOutputStream, fieldType, obj);
        }
    }

    static void writeElementNoTag(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                return;
            case 10:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                return;
            case 11:
                if (obj instanceof ByteString) {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.writeStringNoTag((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof ByteString) {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                    return;
                }
            case 13:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof Internal.EnumLite) {
                    codedOutputStream.writeEnumNoTag(((Internal.EnumLite) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static void writeField(FieldDescriptorLite<?> fieldDescriptorLite, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            List list = (List) obj;
            if (fieldDescriptorLite.isPacked()) {
                if (list.isEmpty()) {
                    return;
                }
                codedOutputStream.writeTag(number, 2);
                Iterator it = list.iterator();
                int i8 = 0;
                while (it.hasNext()) {
                    i8 += computeElementSizeNoTag(liteType, it.next());
                }
                codedOutputStream.writeUInt32NoTag(i8);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    writeElementNoTag(codedOutputStream, liteType, it2.next());
                }
                return;
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                writeElement(codedOutputStream, liteType, number, it3.next());
            }
            return;
        }
        if (obj instanceof LazyField) {
            writeElement(codedOutputStream, liteType, number, ((LazyField) obj).getValue());
        } else {
            writeElement(codedOutputStream, liteType, number, obj);
        }
    }

    public void addRepeatedField(T t8, Object obj) {
        List list;
        if (t8.isRepeated()) {
            verifyType(t8, obj);
            Object field = getField(t8);
            if (field == null) {
                list = new ArrayList();
                this.fields.put((SmallSortedMap<T, Object>) t8, (T) list);
            } else {
                list = (List) field;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public void clear() {
        this.fields.clear();
        this.hasLazyField = false;
    }

    public void clearField(T t8) {
        this.fields.remove(t8);
        if (this.fields.isEmpty()) {
            this.hasLazyField = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Iterator<Map.Entry<T, Object>> descendingIterator() {
        if (this.hasLazyField) {
            return new LazyField.LazyIterator(this.fields.descendingEntrySet().iterator());
        }
        return this.fields.descendingEntrySet().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldSet)) {
            return false;
        }
        return this.fields.equals(((FieldSet) obj).fields);
    }

    public Map<T, Object> getAllFields() {
        if (this.hasLazyField) {
            SmallSortedMap cloneAllFieldsMap = cloneAllFieldsMap(this.fields, false);
            if (this.fields.isImmutable()) {
                cloneAllFieldsMap.makeImmutable();
            }
            return cloneAllFieldsMap;
        }
        if (this.fields.isImmutable()) {
            return this.fields;
        }
        return DesugarCollections.unmodifiableMap(this.fields);
    }

    public Object getField(T t8) {
        Object obj = this.fields.get(t8);
        if (obj instanceof LazyField) {
            return ((LazyField) obj).getValue();
        }
        return obj;
    }

    public int getMessageSetSerializedSize() {
        int i8 = 0;
        for (int i9 = 0; i9 < this.fields.getNumArrayEntries(); i9++) {
            i8 += getMessageSetSerializedSize(this.fields.getArrayEntryAt(i9));
        }
        Iterator<Map.Entry<T, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            i8 += getMessageSetSerializedSize(it.next());
        }
        return i8;
    }

    public Object getRepeatedField(T t8, int i8) {
        if (t8.isRepeated()) {
            Object field = getField(t8);
            if (field != null) {
                return ((List) field).get(i8);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int getRepeatedFieldCount(T t8) {
        if (t8.isRepeated()) {
            Object field = getField(t8);
            if (field == null) {
                return 0;
            }
            return ((List) field).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int getSerializedSize() {
        int i8 = 0;
        for (int i9 = 0; i9 < this.fields.getNumArrayEntries(); i9++) {
            Map.Entry<T, Object> arrayEntryAt = this.fields.getArrayEntryAt(i9);
            i8 += computeFieldSize(arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry<T, Object> entry : this.fields.getOverflowEntries()) {
            i8 += computeFieldSize(entry.getKey(), entry.getValue());
        }
        return i8;
    }

    public boolean hasField(T t8) {
        if (!t8.isRepeated()) {
            if (this.fields.get(t8) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    public int hashCode() {
        return this.fields.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isEmpty() {
        return this.fields.isEmpty();
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public boolean isInitialized() {
        for (int i8 = 0; i8 < this.fields.getNumArrayEntries(); i8++) {
            if (!isInitialized(this.fields.getArrayEntryAt(i8))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            if (!isInitialized(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> iterator() {
        if (this.hasLazyField) {
            return new LazyField.LazyIterator(this.fields.entrySet().iterator());
        }
        return this.fields.entrySet().iterator();
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        for (int i8 = 0; i8 < this.fields.getNumArrayEntries(); i8++) {
            Map.Entry<T, Object> arrayEntryAt = this.fields.getArrayEntryAt(i8);
            if (arrayEntryAt.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) arrayEntryAt.getValue()).makeImmutable();
            }
        }
        this.fields.makeImmutable();
        this.isImmutable = true;
    }

    public void mergeFrom(FieldSet<T> fieldSet) {
        for (int i8 = 0; i8 < fieldSet.fields.getNumArrayEntries(); i8++) {
            mergeFromField(fieldSet.fields.getArrayEntryAt(i8));
        }
        Iterator<Map.Entry<T, Object>> it = fieldSet.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            mergeFromField(it.next());
        }
    }

    public void setField(T t8, Object obj) {
        if (t8.isRepeated()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    verifyType(t8, it.next());
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            verifyType(t8, obj);
        }
        if (obj instanceof LazyField) {
            this.hasLazyField = true;
        }
        this.fields.put((SmallSortedMap<T, Object>) t8, (T) obj);
    }

    public void setRepeatedField(T t8, int i8, Object obj) {
        if (t8.isRepeated()) {
            Object field = getField(t8);
            if (field != null) {
                verifyType(t8, obj);
                ((List) field).set(i8, obj);
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public void writeMessageSetTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i8 = 0; i8 < this.fields.getNumArrayEntries(); i8++) {
            writeMessageSetTo(this.fields.getArrayEntryAt(i8), codedOutputStream);
        }
        Iterator<Map.Entry<T, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            writeMessageSetTo(it.next(), codedOutputStream);
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i8 = 0; i8 < this.fields.getNumArrayEntries(); i8++) {
            Map.Entry<T, Object> arrayEntryAt = this.fields.getArrayEntryAt(i8);
            writeField(arrayEntryAt.getKey(), arrayEntryAt.getValue(), codedOutputStream);
        }
        for (Map.Entry<T, Object> entry : this.fields.getOverflowEntries()) {
            writeField(entry.getKey(), entry.getValue(), codedOutputStream);
        }
    }

    private FieldSet() {
        this.fields = SmallSortedMap.newFieldMap(16);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public FieldSet<T> m5426clone() {
        FieldSet<T> newFieldSet = newFieldSet();
        for (int i8 = 0; i8 < this.fields.getNumArrayEntries(); i8++) {
            Map.Entry<T, Object> arrayEntryAt = this.fields.getArrayEntryAt(i8);
            newFieldSet.setField(arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry<T, Object> entry : this.fields.getOverflowEntries()) {
            newFieldSet.setField(entry.getKey(), entry.getValue());
        }
        newFieldSet.hasLazyField = this.hasLazyField;
        return newFieldSet;
    }

    private FieldSet(boolean z8) {
        this(SmallSortedMap.newFieldMap(0));
        makeImmutable();
    }

    private int getMessageSetSerializedSize(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            if (value instanceof LazyField) {
                return CodedOutputStream.computeLazyFieldMessageSetExtensionSize(entry.getKey().getNumber(), (LazyField) value);
            }
            return CodedOutputStream.computeMessageSetExtensionSize(entry.getKey().getNumber(), (MessageLite) value);
        }
        return computeFieldSize(key, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends FieldDescriptorLite<T>> boolean isInitialized(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        if (key.isRepeated()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!isMessageFieldValueInitialized(it.next())) {
                    return false;
                }
            }
            return true;
        }
        return isMessageFieldValueInitialized(entry.getValue());
    }

    private void writeMessageSetTo(Map.Entry<T, Object> entry, CodedOutputStream codedOutputStream) throws IOException {
        T key = entry.getKey();
        if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            Object value = entry.getValue();
            if (value instanceof LazyField) {
                value = ((LazyField) value).getValue();
            }
            codedOutputStream.writeMessageSetExtension(entry.getKey().getNumber(), (MessageLite) value);
            return;
        }
        writeField(key, entry.getValue(), codedOutputStream);
    }

    private FieldSet(SmallSortedMap<T, Object> smallSortedMap) {
        this.fields = smallSortedMap;
        makeImmutable();
    }
}
