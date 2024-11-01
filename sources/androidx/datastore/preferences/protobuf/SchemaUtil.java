package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.Internal;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
@CheckReturnValue
/* loaded from: classes3.dex */
public final class SchemaUtil {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class<?> GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    private static final UnknownFieldSchema<?, ?> PROTO2_UNKNOWN_FIELD_SET_SCHEMA = getUnknownFieldSetSchema(false);
    private static final UnknownFieldSchema<?, ?> PROTO3_UNKNOWN_FIELD_SET_SCHEMA = getUnknownFieldSetSchema(true);
    private static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_LITE_SCHEMA = new UnknownFieldSetLiteSchema();

    private SchemaUtil() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeBoolList(int i8, List<?> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z8) {
            return CodedOutputStream.computeTagSize(i8) + CodedOutputStream.computeLengthDelimitedFieldSize(size);
        }
        return size * CodedOutputStream.computeBoolSize(i8, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeBoolListNoTag(List<?> list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeByteStringList(int i8, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = size * CodedOutputStream.computeTagSize(i8);
        for (int i9 = 0; i9 < list.size(); i9++) {
            computeTagSize += CodedOutputStream.computeBytesSizeNoTag(list.get(i9));
        }
        return computeTagSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeEnumList(int i8, List<Integer> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        if (z8) {
            return CodedOutputStream.computeTagSize(i8) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeEnumListNoTag);
        }
        return computeSizeEnumListNoTag + (size * CodedOutputStream.computeTagSize(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeEnumListNoTag(List<Integer> list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i8 = 0;
            while (i9 < size) {
                i8 += CodedOutputStream.computeEnumSizeNoTag(intArrayList.getInt(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += CodedOutputStream.computeEnumSizeNoTag(list.get(i9).intValue());
                i9++;
            }
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeFixed32List(int i8, List<?> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z8) {
            return CodedOutputStream.computeTagSize(i8) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 4);
        }
        return size * CodedOutputStream.computeFixed32Size(i8, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeFixed32ListNoTag(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeFixed64List(int i8, List<?> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z8) {
            return CodedOutputStream.computeTagSize(i8) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 8);
        }
        return size * CodedOutputStream.computeFixed64Size(i8, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeFixed64ListNoTag(List<?> list) {
        return list.size() * 8;
    }

    static int computeSizeGroupList(int i8, List<MessageLite> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += CodedOutputStream.computeGroupSize(i8, list.get(i10));
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeInt32List(int i8, List<Integer> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        if (z8) {
            return CodedOutputStream.computeTagSize(i8) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeInt32ListNoTag);
        }
        return computeSizeInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeInt32ListNoTag(List<Integer> list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i8 = 0;
            while (i9 < size) {
                i8 += CodedOutputStream.computeInt32SizeNoTag(intArrayList.getInt(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += CodedOutputStream.computeInt32SizeNoTag(list.get(i9).intValue());
                i9++;
            }
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeInt64List(int i8, List<Long> list, boolean z8) {
        if (list.size() == 0) {
            return 0;
        }
        int computeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        if (z8) {
            return CodedOutputStream.computeTagSize(i8) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeInt64ListNoTag);
        }
        return computeSizeInt64ListNoTag + (list.size() * CodedOutputStream.computeTagSize(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeInt64ListNoTag(List<Long> list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            i8 = 0;
            while (i9 < size) {
                i8 += CodedOutputStream.computeInt64SizeNoTag(longArrayList.getLong(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += CodedOutputStream.computeInt64SizeNoTag(list.get(i9).longValue());
                i9++;
            }
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeMessage(int i8, Object obj, Schema schema) {
        if (obj instanceof LazyFieldLite) {
            return CodedOutputStream.computeLazyFieldSize(i8, (LazyFieldLite) obj);
        }
        return CodedOutputStream.computeMessageSize(i8, (MessageLite) obj, schema);
    }

    static int computeSizeMessageList(int i8, List<?> list) {
        int computeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = CodedOutputStream.computeTagSize(i8) * size;
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = list.get(i9);
            if (obj instanceof LazyFieldLite) {
                computeMessageSizeNoTag = CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj);
            } else {
                computeMessageSizeNoTag = CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            }
            computeTagSize += computeMessageSizeNoTag;
        }
        return computeTagSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeSInt32List(int i8, List<Integer> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        if (z8) {
            return CodedOutputStream.computeTagSize(i8) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeSInt32ListNoTag);
        }
        return computeSizeSInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeSInt32ListNoTag(List<Integer> list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i8 = 0;
            while (i9 < size) {
                i8 += CodedOutputStream.computeSInt32SizeNoTag(intArrayList.getInt(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += CodedOutputStream.computeSInt32SizeNoTag(list.get(i9).intValue());
                i9++;
            }
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeSInt64List(int i8, List<Long> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        if (z8) {
            return CodedOutputStream.computeTagSize(i8) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeSInt64ListNoTag);
        }
        return computeSizeSInt64ListNoTag + (size * CodedOutputStream.computeTagSize(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeSInt64ListNoTag(List<Long> list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            i8 = 0;
            while (i9 < size) {
                i8 += CodedOutputStream.computeSInt64SizeNoTag(longArrayList.getLong(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += CodedOutputStream.computeSInt64SizeNoTag(list.get(i9).longValue());
                i9++;
            }
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeStringList(int i8, List<?> list) {
        int computeStringSizeNoTag;
        int computeStringSizeNoTag2;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        int computeTagSize = CodedOutputStream.computeTagSize(i8) * size;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i9 < size) {
                Object raw = lazyStringList.getRaw(i9);
                if (raw instanceof ByteString) {
                    computeStringSizeNoTag2 = CodedOutputStream.computeBytesSizeNoTag((ByteString) raw);
                } else {
                    computeStringSizeNoTag2 = CodedOutputStream.computeStringSizeNoTag((String) raw);
                }
                computeTagSize += computeStringSizeNoTag2;
                i9++;
            }
        } else {
            while (i9 < size) {
                Object obj = list.get(i9);
                if (obj instanceof ByteString) {
                    computeStringSizeNoTag = CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
                } else {
                    computeStringSizeNoTag = CodedOutputStream.computeStringSizeNoTag((String) obj);
                }
                computeTagSize += computeStringSizeNoTag;
                i9++;
            }
        }
        return computeTagSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeUInt32List(int i8, List<Integer> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        if (z8) {
            return CodedOutputStream.computeTagSize(i8) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeUInt32ListNoTag);
        }
        return computeSizeUInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeUInt32ListNoTag(List<Integer> list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            i8 = 0;
            while (i9 < size) {
                i8 += CodedOutputStream.computeUInt32SizeNoTag(intArrayList.getInt(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += CodedOutputStream.computeUInt32SizeNoTag(list.get(i9).intValue());
                i9++;
            }
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeUInt64List(int i8, List<Long> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        if (z8) {
            return CodedOutputStream.computeTagSize(i8) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSizeUInt64ListNoTag);
        }
        return computeSizeUInt64ListNoTag + (size * CodedOutputStream.computeTagSize(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeUInt64ListNoTag(List<Long> list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            i8 = 0;
            while (i9 < size) {
                i8 += CodedOutputStream.computeUInt64SizeNoTag(longArrayList.getLong(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += CodedOutputStream.computeUInt64SizeNoTag(list.get(i9).longValue());
                i9++;
            }
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i8, List<Integer> list, Internal.EnumLiteMap<?> enumLiteMap, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumLiteMap == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Integer num = list.get(i10);
                int intValue = num.intValue();
                if (enumLiteMap.findValueByNumber(intValue) != null) {
                    if (i10 != i9) {
                        list.set(i9, num);
                    }
                    i9++;
                } else {
                    ub = (UB) storeUnknownEnum(obj, i8, intValue, ub, unknownFieldSchema);
                }
            }
            if (i9 != size) {
                list.subList(i9, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (enumLiteMap.findValueByNumber(intValue2) == null) {
                    ub = (UB) storeUnknownEnum(obj, i8, intValue2, ub, unknownFieldSchema);
                    it.remove();
                }
            }
        }
        return ub;
    }

    private static Class<?> getGeneratedMessageClass() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    static Object getMapDefaultEntry(Class<?> cls, String str) {
        try {
            java.lang.reflect.Field[] declaredFields = Class.forName(cls.getName() + "$" + toCamelCase(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return UnsafeUtil.getStaticObject(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    private static UnknownFieldSchema<?, ?> getUnknownFieldSetSchema(boolean z8) {
        try {
            Class<?> unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (UnknownFieldSchema) unknownFieldSetSchemaClass.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z8));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> getUnknownFieldSetSchemaClass() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends FieldSet.FieldDescriptorLite<FT>> void mergeExtensions(ExtensionSchema<FT> extensionSchema, T t8, T t9) {
        FieldSet<FT> extensions = extensionSchema.getExtensions(t9);
        if (!extensions.isEmpty()) {
            extensionSchema.getMutableExtensions(t8).mergeFrom(extensions);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void mergeMap(MapFieldSchema mapFieldSchema, T t8, T t9, long j8) {
        UnsafeUtil.putObject(t8, j8, mapFieldSchema.mergeFrom(UnsafeUtil.getObject(t8, j8), UnsafeUtil.getObject(t9, j8)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void mergeUnknownFields(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t8, T t9) {
        unknownFieldSchema.setToMessage(t8, unknownFieldSchema.merge(unknownFieldSchema.getFromMessage(t8), unknownFieldSchema.getFromMessage(t9)));
    }

    public static UnknownFieldSchema<?, ?> proto2UnknownFieldSetSchema() {
        return PROTO2_UNKNOWN_FIELD_SET_SCHEMA;
    }

    public static UnknownFieldSchema<?, ?> proto3UnknownFieldSetSchema() {
        return PROTO3_UNKNOWN_FIELD_SET_SCHEMA;
    }

    public static void requireGeneratedMessage(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = GENERATED_MESSAGE_CLASS) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean safeEquals(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static boolean shouldUseTableSwitch(int i8, int i9, int i10) {
        if (i9 < 40) {
            return true;
        }
        long j8 = i9 - i8;
        long j9 = i10;
        return j8 + 10 <= ((2 * j9) + 3) + ((j9 + 3) * 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    public static <UT, UB> UB storeUnknownEnum(Object obj, int i8, int i9, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (ub == null) {
            ub = unknownFieldSchema.getBuilderFromMessage(obj);
        }
        unknownFieldSchema.addVarint(ub, i8, i9);
        return ub;
    }

    static String toCamelCase(String str, boolean z8) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < str.length(); i8++) {
            char charAt = str.charAt(i8);
            if ('a' <= charAt && charAt <= 'z') {
                if (z8) {
                    sb.append((char) (charAt - ' '));
                } else {
                    sb.append(charAt);
                }
            } else if ('A' <= charAt && charAt <= 'Z') {
                if (i8 == 0 && !z8) {
                    sb.append((char) (charAt + ' '));
                } else {
                    sb.append(charAt);
                }
            } else {
                if ('0' <= charAt && charAt <= '9') {
                    sb.append(charAt);
                }
                z8 = true;
            }
            z8 = false;
        }
        return sb.toString();
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static void writeBool(int i8, boolean z8, Writer writer) throws IOException {
        if (z8) {
            writer.writeBool(i8, true);
        }
    }

    public static void writeBoolList(int i8, List<Boolean> list, Writer writer, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeBoolList(i8, list, z8);
        }
    }

    public static void writeBytes(int i8, ByteString byteString, Writer writer) throws IOException {
        if (byteString != null && !byteString.isEmpty()) {
            writer.writeBytes(i8, byteString);
        }
    }

    public static void writeBytesList(int i8, List<ByteString> list, Writer writer) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeBytesList(i8, list);
        }
    }

    public static void writeDouble(int i8, double d8, Writer writer) throws IOException {
        if (Double.doubleToRawLongBits(d8) != 0) {
            writer.writeDouble(i8, d8);
        }
    }

    public static void writeDoubleList(int i8, List<Double> list, Writer writer, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeDoubleList(i8, list, z8);
        }
    }

    public static void writeEnum(int i8, int i9, Writer writer) throws IOException {
        if (i9 != 0) {
            writer.writeEnum(i8, i9);
        }
    }

    public static void writeEnumList(int i8, List<Integer> list, Writer writer, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeEnumList(i8, list, z8);
        }
    }

    public static void writeFixed32(int i8, int i9, Writer writer) throws IOException {
        if (i9 != 0) {
            writer.writeFixed32(i8, i9);
        }
    }

    public static void writeFixed32List(int i8, List<Integer> list, Writer writer, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeFixed32List(i8, list, z8);
        }
    }

    public static void writeFixed64(int i8, long j8, Writer writer) throws IOException {
        if (j8 != 0) {
            writer.writeFixed64(i8, j8);
        }
    }

    public static void writeFixed64List(int i8, List<Long> list, Writer writer, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeFixed64List(i8, list, z8);
        }
    }

    public static void writeFloat(int i8, float f8, Writer writer) throws IOException {
        if (Float.floatToRawIntBits(f8) != 0) {
            writer.writeFloat(i8, f8);
        }
    }

    public static void writeFloatList(int i8, List<Float> list, Writer writer, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeFloatList(i8, list, z8);
        }
    }

    public static void writeGroupList(int i8, List<?> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeGroupList(i8, list);
    }

    public static void writeInt32(int i8, int i9, Writer writer) throws IOException {
        if (i9 != 0) {
            writer.writeInt32(i8, i9);
        }
    }

    public static void writeInt32List(int i8, List<Integer> list, Writer writer, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeInt32List(i8, list, z8);
        }
    }

    public static void writeInt64(int i8, long j8, Writer writer) throws IOException {
        if (j8 != 0) {
            writer.writeInt64(i8, j8);
        }
    }

    public static void writeInt64List(int i8, List<Long> list, Writer writer, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeInt64List(i8, list, z8);
        }
    }

    public static void writeLazyFieldList(int i8, List<?> list, Writer writer) throws IOException {
        if (list != null && !list.isEmpty()) {
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                ((LazyFieldLite) it.next()).writeTo(writer, i8);
            }
        }
    }

    public static void writeMessage(int i8, Object obj, Writer writer) throws IOException {
        if (obj != null) {
            writer.writeMessage(i8, obj);
        }
    }

    public static void writeMessageList(int i8, List<?> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeMessageList(i8, list);
    }

    public static void writeSFixed32(int i8, int i9, Writer writer) throws IOException {
        if (i9 != 0) {
            writer.writeSFixed32(i8, i9);
        }
    }

    public static void writeSFixed32List(int i8, List<Integer> list, Writer writer, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeSFixed32List(i8, list, z8);
        }
    }

    public static void writeSFixed64(int i8, long j8, Writer writer) throws IOException {
        if (j8 != 0) {
            writer.writeSFixed64(i8, j8);
        }
    }

    public static void writeSFixed64List(int i8, List<Long> list, Writer writer, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeSFixed64List(i8, list, z8);
        }
    }

    public static void writeSInt32(int i8, int i9, Writer writer) throws IOException {
        if (i9 != 0) {
            writer.writeSInt32(i8, i9);
        }
    }

    public static void writeSInt32List(int i8, List<Integer> list, Writer writer, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeSInt32List(i8, list, z8);
        }
    }

    public static void writeSInt64(int i8, long j8, Writer writer) throws IOException {
        if (j8 != 0) {
            writer.writeSInt64(i8, j8);
        }
    }

    public static void writeSInt64List(int i8, List<Long> list, Writer writer, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeSInt64List(i8, list, z8);
        }
    }

    public static void writeString(int i8, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writeStringInternal(i8, (String) obj, writer);
        } else {
            writeBytes(i8, (ByteString) obj, writer);
        }
    }

    private static void writeStringInternal(int i8, String str, Writer writer) throws IOException {
        if (str != null && !str.isEmpty()) {
            writer.writeString(i8, str);
        }
    }

    public static void writeStringList(int i8, List<String> list, Writer writer) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeStringList(i8, list);
        }
    }

    public static void writeUInt32(int i8, int i9, Writer writer) throws IOException {
        if (i9 != 0) {
            writer.writeUInt32(i8, i9);
        }
    }

    public static void writeUInt32List(int i8, List<Integer> list, Writer writer, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeUInt32List(i8, list, z8);
        }
    }

    public static void writeUInt64(int i8, long j8, Writer writer) throws IOException {
        if (j8 != 0) {
            writer.writeUInt64(i8, j8);
        }
    }

    public static void writeUInt64List(int i8, List<Long> list, Writer writer, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            writer.writeUInt64List(i8, list, z8);
        }
    }

    public static boolean shouldUseTableSwitch(FieldInfo[] fieldInfoArr) {
        if (fieldInfoArr.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(fieldInfoArr[0].getFieldNumber(), fieldInfoArr[fieldInfoArr.length - 1].getFieldNumber(), fieldInfoArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeGroupList(int i8, List<MessageLite> list, Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += CodedOutputStream.computeGroupSize(i8, list.get(i10), schema);
        }
        return i9;
    }

    public static void writeGroupList(int i8, List<?> list, Writer writer, Schema schema) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeGroupList(i8, list, schema);
    }

    public static void writeMessageList(int i8, List<?> list, Writer writer, Schema schema) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeMessageList(i8, list, schema);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int computeSizeMessageList(int i8, List<?> list, Schema schema) {
        int computeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int computeTagSize = CodedOutputStream.computeTagSize(i8) * size;
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = list.get(i9);
            if (obj instanceof LazyFieldLite) {
                computeMessageSizeNoTag = CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj);
            } else {
                computeMessageSizeNoTag = CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj, schema);
            }
            computeTagSize += computeMessageSizeNoTag;
        }
        return computeTagSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i8, List<Integer> list, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumVerifier == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Integer num = list.get(i10);
                int intValue = num.intValue();
                if (enumVerifier.isInRange(intValue)) {
                    if (i10 != i9) {
                        list.set(i9, num);
                    }
                    i9++;
                } else {
                    ub = (UB) storeUnknownEnum(obj, i8, intValue, ub, unknownFieldSchema);
                }
            }
            if (i9 != size) {
                list.subList(i9, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!enumVerifier.isInRange(intValue2)) {
                    ub = (UB) storeUnknownEnum(obj, i8, intValue2, ub, unknownFieldSchema);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
