package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ArrayDecoders;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
@CheckReturnValue
/* loaded from: classes3.dex */
public final class MessageSchema<T> implements Schema<T> {
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int INTS_PER_FIELD = 3;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_MASK = 268435456;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.MessageSchema$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i8, int i9, MessageLite messageLite, boolean z8, boolean z9, int[] iArr2, int i10, int i11, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        boolean z10;
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i8;
        this.maxFieldNumber = i9;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.proto3 = z8;
        if (extensionSchema != null && extensionSchema.hasExtensions(messageLite)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.hasExtensions = z10;
        this.useCachedSizeField = z9;
        this.intArray = iArr2;
        this.checkInitializedCount = i10;
        this.repeatedFieldOffsetStart = i11;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    private boolean arePresentForEquals(T t8, T t9, int i8) {
        if (isFieldPresent(t8, i8) == isFieldPresent(t9, i8)) {
            return true;
        }
        return false;
    }

    private static <T> boolean booleanAt(T t8, long j8) {
        return UnsafeUtil.getBoolean(t8, j8);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.Map, java.util.Map<K, V>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    private <K, V> int decodeMapEntry(byte[] bArr, int i8, int i9, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map, ArrayDecoders.Registers registers) throws IOException {
        int i10;
        int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i8, registers);
        int i11 = registers.int1;
        if (i11 >= 0 && i11 <= i9 - decodeVarint32) {
            int i12 = decodeVarint32 + i11;
            Object obj = metadata.defaultKey;
            Object obj2 = metadata.defaultValue;
            while (decodeVarint32 < i12) {
                int i13 = decodeVarint32 + 1;
                byte b9 = bArr[decodeVarint32];
                if (b9 < 0) {
                    i10 = ArrayDecoders.decodeVarint32(b9, bArr, i13, registers);
                    b9 = registers.int1;
                } else {
                    i10 = i13;
                }
                int i14 = b9 >>> 3;
                int i15 = b9 & 7;
                if (i14 != 1) {
                    if (i14 == 2 && i15 == metadata.valueType.getWireType()) {
                        decodeVarint32 = decodeMapEntryValue(bArr, i10, i9, metadata.valueType, metadata.defaultValue.getClass(), registers);
                        obj2 = registers.object1;
                    }
                    decodeVarint32 = ArrayDecoders.skipField(b9, bArr, i10, i9, registers);
                } else if (i15 == metadata.keyType.getWireType()) {
                    decodeVarint32 = decodeMapEntryValue(bArr, i10, i9, metadata.keyType, null, registers);
                    obj = registers.object1;
                } else {
                    decodeVarint32 = ArrayDecoders.skipField(b9, bArr, i10, i9, registers);
                }
            }
            if (decodeVarint32 == i12) {
                map.put(obj, obj2);
                return i12;
            }
            throw InvalidProtocolBufferException.parseFailure();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    private int decodeMapEntryValue(byte[] bArr, int i8, int i9, WireFormat.FieldType fieldType, Class<?> cls, ArrayDecoders.Registers registers) throws IOException {
        boolean z8;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int decodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i8, registers);
                if (registers.long1 != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                registers.object1 = Boolean.valueOf(z8);
                return decodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(bArr, i8, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(bArr, i8));
                return i8 + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i8));
                return i8 + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i8));
                return i8 + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(bArr, i8));
                return i8 + 4;
            case 9:
            case 10:
            case 11:
                int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i8, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return decodeVarint32;
            case 12:
            case 13:
                int decodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i8, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return decodeVarint642;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) cls), bArr, i8, i9, registers);
            case 15:
                int decodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i8, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return decodeVarint322;
            case 16:
                int decodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i8, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return decodeVarint643;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(bArr, i8, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t8, long j8) {
        return UnsafeUtil.getDouble(t8, j8);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i8, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj2) {
        int numberAt = numberAt(i8);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i8)));
        if (object == null) {
            return ub;
        }
        Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i8);
        if (enumFieldVerifier == null) {
            return ub;
        }
        return (UB) filterUnknownEnumMap(i8, numberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub, unknownFieldSchema, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i8, int i9, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj) {
        MapEntryLite.Metadata<?, ?> forMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i8));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = unknownFieldSchema.getBuilderFromMessage(obj);
                }
                ByteString.CodedBuilder newCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(forMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(newCodedBuilder.getCodedOutput(), forMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub, i9, newCodedBuilder.build());
                    it.remove();
                } catch (IOException e8) {
                    throw new RuntimeException(e8);
                }
            }
        }
        return ub;
    }

    private static <T> float floatAt(T t8, long j8) {
        return UnsafeUtil.getFloat(t8, j8);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i8) {
        return (Internal.EnumVerifier) this.objects[((i8 / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i8) {
        return this.objects[(i8 / 3) * 2];
    }

    private Schema getMessageFieldSchema(int i8) {
        int i9 = (i8 / 3) * 2;
        Schema schema = (Schema) this.objects[i9];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i9 + 1]);
        this.objects[i9] = schemaFor;
        return schemaFor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite == UnknownFieldSetLite.getDefaultInstance()) {
            UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
            generatedMessageLite.unknownFields = newInstance;
            return newInstance;
        }
        return unknownFieldSetLite;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0060. Please report as an issue. */
    private int getSerializedSizeProto2(T t8) {
        int i8;
        int i9;
        int computeDoubleSize;
        int computeBoolSize;
        int computeSFixed32Size;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        int i14 = 0;
        while (i11 < this.buffer.length) {
            int typeAndOffsetAt = typeAndOffsetAt(i11);
            int numberAt = numberAt(i11);
            int type = type(typeAndOffsetAt);
            if (type <= 17) {
                i8 = this.buffer[i11 + 2];
                int i15 = i8 & i10;
                i9 = 1 << (i8 >>> 20);
                if (i15 != i13) {
                    i14 = unsafe.getInt(t8, i15);
                    i13 = i15;
                }
            } else {
                if (this.useCachedSizeField && type >= FieldType.DOUBLE_LIST_PACKED.id() && type <= FieldType.SINT64_LIST_PACKED.id()) {
                    i8 = this.buffer[i11 + 2] & i10;
                } else {
                    i8 = 0;
                }
                i9 = 0;
            }
            long offset = offset(typeAndOffsetAt);
            switch (type) {
                case 0:
                    if ((i14 & i9) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i12 += computeDoubleSize;
                        break;
                    }
                case 1:
                    if ((i14 & i9) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i12 += computeDoubleSize;
                        break;
                    }
                case 2:
                    if ((i14 & i9) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, unsafe.getLong(t8, offset));
                        i12 += computeDoubleSize;
                        break;
                    }
                case 3:
                    if ((i14 & i9) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, unsafe.getLong(t8, offset));
                        i12 += computeDoubleSize;
                        break;
                    }
                case 4:
                    if ((i14 & i9) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, unsafe.getInt(t8, offset));
                        i12 += computeDoubleSize;
                        break;
                    }
                case 5:
                    if ((i14 & i9) == 0) {
                        break;
                    } else {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i12 += computeDoubleSize;
                        break;
                    }
                case 6:
                    if ((i14 & i9) != 0) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i12 += computeDoubleSize;
                        break;
                    }
                    break;
                case 7:
                    if ((i14 & i9) != 0) {
                        computeBoolSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i12 += computeBoolSize;
                    }
                    break;
                case 8:
                    if ((i14 & i9) != 0) {
                        Object object = unsafe.getObject(t8, offset);
                        if (object instanceof ByteString) {
                            computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object);
                        } else {
                            computeBoolSize = CodedOutputStream.computeStringSize(numberAt, (String) object);
                        }
                        i12 += computeBoolSize;
                    }
                    break;
                case 9:
                    if ((i14 & i9) != 0) {
                        computeBoolSize = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(t8, offset), getMessageFieldSchema(i11));
                        i12 += computeBoolSize;
                    }
                    break;
                case 10:
                    if ((i14 & i9) != 0) {
                        computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(t8, offset));
                        i12 += computeBoolSize;
                    }
                    break;
                case 11:
                    if ((i14 & i9) != 0) {
                        computeBoolSize = CodedOutputStream.computeUInt32Size(numberAt, unsafe.getInt(t8, offset));
                        i12 += computeBoolSize;
                    }
                    break;
                case 12:
                    if ((i14 & i9) != 0) {
                        computeBoolSize = CodedOutputStream.computeEnumSize(numberAt, unsafe.getInt(t8, offset));
                        i12 += computeBoolSize;
                    }
                    break;
                case 13:
                    if ((i14 & i9) != 0) {
                        computeSFixed32Size = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i12 += computeSFixed32Size;
                    }
                    break;
                case 14:
                    if ((i14 & i9) != 0) {
                        computeBoolSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i12 += computeBoolSize;
                    }
                    break;
                case 15:
                    if ((i14 & i9) != 0) {
                        computeBoolSize = CodedOutputStream.computeSInt32Size(numberAt, unsafe.getInt(t8, offset));
                        i12 += computeBoolSize;
                    }
                    break;
                case 16:
                    if ((i14 & i9) != 0) {
                        computeBoolSize = CodedOutputStream.computeSInt64Size(numberAt, unsafe.getLong(t8, offset));
                        i12 += computeBoolSize;
                    }
                    break;
                case 17:
                    if ((i14 & i9) != 0) {
                        computeBoolSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(t8, offset), getMessageFieldSchema(i11));
                        i12 += computeBoolSize;
                    }
                    break;
                case 18:
                    computeBoolSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t8, offset), false);
                    i12 += computeBoolSize;
                    break;
                case 19:
                    computeBoolSize = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t8, offset), false);
                    i12 += computeBoolSize;
                    break;
                case 20:
                    computeBoolSize = SchemaUtil.computeSizeInt64List(numberAt, (List) unsafe.getObject(t8, offset), false);
                    i12 += computeBoolSize;
                    break;
                case 21:
                    computeBoolSize = SchemaUtil.computeSizeUInt64List(numberAt, (List) unsafe.getObject(t8, offset), false);
                    i12 += computeBoolSize;
                    break;
                case 22:
                    computeBoolSize = SchemaUtil.computeSizeInt32List(numberAt, (List) unsafe.getObject(t8, offset), false);
                    i12 += computeBoolSize;
                    break;
                case 23:
                    computeBoolSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t8, offset), false);
                    i12 += computeBoolSize;
                    break;
                case 24:
                    computeBoolSize = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t8, offset), false);
                    i12 += computeBoolSize;
                    break;
                case 25:
                    computeBoolSize = SchemaUtil.computeSizeBoolList(numberAt, (List) unsafe.getObject(t8, offset), false);
                    i12 += computeBoolSize;
                    break;
                case 26:
                    computeBoolSize = SchemaUtil.computeSizeStringList(numberAt, (List) unsafe.getObject(t8, offset));
                    i12 += computeBoolSize;
                    break;
                case 27:
                    computeBoolSize = SchemaUtil.computeSizeMessageList(numberAt, (List) unsafe.getObject(t8, offset), getMessageFieldSchema(i11));
                    i12 += computeBoolSize;
                    break;
                case 28:
                    computeBoolSize = SchemaUtil.computeSizeByteStringList(numberAt, (List) unsafe.getObject(t8, offset));
                    i12 += computeBoolSize;
                    break;
                case 29:
                    computeBoolSize = SchemaUtil.computeSizeUInt32List(numberAt, (List) unsafe.getObject(t8, offset), false);
                    i12 += computeBoolSize;
                    break;
                case 30:
                    computeBoolSize = SchemaUtil.computeSizeEnumList(numberAt, (List) unsafe.getObject(t8, offset), false);
                    i12 += computeBoolSize;
                    break;
                case 31:
                    computeBoolSize = SchemaUtil.computeSizeFixed32List(numberAt, (List) unsafe.getObject(t8, offset), false);
                    i12 += computeBoolSize;
                    break;
                case 32:
                    computeBoolSize = SchemaUtil.computeSizeFixed64List(numberAt, (List) unsafe.getObject(t8, offset), false);
                    i12 += computeBoolSize;
                    break;
                case 33:
                    computeBoolSize = SchemaUtil.computeSizeSInt32List(numberAt, (List) unsafe.getObject(t8, offset), false);
                    i12 += computeBoolSize;
                    break;
                case 34:
                    computeBoolSize = SchemaUtil.computeSizeSInt64List(numberAt, (List) unsafe.getObject(t8, offset), false);
                    i12 += computeBoolSize;
                    break;
                case 35:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i12 += computeSFixed32Size;
                    }
                    break;
                case 36:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i12 += computeSFixed32Size;
                    }
                    break;
                case 37:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i12 += computeSFixed32Size;
                    }
                    break;
                case 38:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i12 += computeSFixed32Size;
                    }
                    break;
                case 39:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i12 += computeSFixed32Size;
                    }
                    break;
                case 40:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i12 += computeSFixed32Size;
                    }
                    break;
                case 41:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i12 += computeSFixed32Size;
                    }
                    break;
                case 42:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i12 += computeSFixed32Size;
                    }
                    break;
                case 43:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i12 += computeSFixed32Size;
                    }
                    break;
                case 44:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i12 += computeSFixed32Size;
                    }
                    break;
                case 45:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i12 += computeSFixed32Size;
                    }
                    break;
                case 46:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i12 += computeSFixed32Size;
                    }
                    break;
                case 47:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i12 += computeSFixed32Size;
                    }
                    break;
                case 48:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeSFixed32Size = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i12 += computeSFixed32Size;
                    }
                    break;
                case 49:
                    computeBoolSize = SchemaUtil.computeSizeGroupList(numberAt, (List) unsafe.getObject(t8, offset), getMessageFieldSchema(i11));
                    i12 += computeBoolSize;
                    break;
                case 50:
                    computeBoolSize = this.mapFieldSchema.getSerializedSize(numberAt, unsafe.getObject(t8, offset), getMapFieldDefaultEntry(i11));
                    i12 += computeBoolSize;
                    break;
                case 51:
                    if (isOneofPresent(t8, numberAt, i11)) {
                        computeBoolSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i12 += computeBoolSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t8, numberAt, i11)) {
                        computeBoolSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i12 += computeBoolSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t8, numberAt, i11)) {
                        computeBoolSize = CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(t8, offset));
                        i12 += computeBoolSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t8, numberAt, i11)) {
                        computeBoolSize = CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(t8, offset));
                        i12 += computeBoolSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t8, numberAt, i11)) {
                        computeBoolSize = CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(t8, offset));
                        i12 += computeBoolSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t8, numberAt, i11)) {
                        computeBoolSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i12 += computeBoolSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t8, numberAt, i11)) {
                        computeSFixed32Size = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i12 += computeSFixed32Size;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t8, numberAt, i11)) {
                        computeBoolSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i12 += computeBoolSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t8, numberAt, i11)) {
                        Object object2 = unsafe.getObject(t8, offset);
                        if (object2 instanceof ByteString) {
                            computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object2);
                        } else {
                            computeBoolSize = CodedOutputStream.computeStringSize(numberAt, (String) object2);
                        }
                        i12 += computeBoolSize;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t8, numberAt, i11)) {
                        computeBoolSize = SchemaUtil.computeSizeMessage(numberAt, unsafe.getObject(t8, offset), getMessageFieldSchema(i11));
                        i12 += computeBoolSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t8, numberAt, i11)) {
                        computeBoolSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) unsafe.getObject(t8, offset));
                        i12 += computeBoolSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t8, numberAt, i11)) {
                        computeBoolSize = CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(t8, offset));
                        i12 += computeBoolSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t8, numberAt, i11)) {
                        computeBoolSize = CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(t8, offset));
                        i12 += computeBoolSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t8, numberAt, i11)) {
                        computeSFixed32Size = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i12 += computeSFixed32Size;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t8, numberAt, i11)) {
                        computeBoolSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i12 += computeBoolSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t8, numberAt, i11)) {
                        computeBoolSize = CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(t8, offset));
                        i12 += computeBoolSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t8, numberAt, i11)) {
                        computeBoolSize = CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(t8, offset));
                        i12 += computeBoolSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t8, numberAt, i11)) {
                        computeBoolSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) unsafe.getObject(t8, offset), getMessageFieldSchema(i11));
                        i12 += computeBoolSize;
                    }
                    break;
            }
            i11 += 3;
            i10 = 1048575;
        }
        int unknownFieldsSerializedSize = i12 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t8);
        if (this.hasExtensions) {
            return unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t8).getSerializedSize();
        }
        return unknownFieldsSerializedSize;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003d. Please report as an issue. */
    private int getSerializedSizeProto3(T t8) {
        int i8;
        int computeDoubleSize;
        int computeSizeFixed64ListNoTag;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i9 = 0;
        for (int i10 = 0; i10 < this.buffer.length; i10 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i10);
            int type = type(typeAndOffsetAt);
            int numberAt = numberAt(i10);
            long offset = offset(typeAndOffsetAt);
            if (type >= FieldType.DOUBLE_LIST_PACKED.id() && type <= FieldType.SINT64_LIST_PACKED.id()) {
                i8 = this.buffer[i10 + 2] & 1048575;
            } else {
                i8 = 0;
            }
            switch (type) {
                case 0:
                    if (isFieldPresent(t8, i10)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (isFieldPresent(t8, i10)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (isFieldPresent(t8, i10)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, UnsafeUtil.getLong(t8, offset));
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (isFieldPresent(t8, i10)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, UnsafeUtil.getLong(t8, offset));
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (isFieldPresent(t8, i10)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, UnsafeUtil.getInt(t8, offset));
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (isFieldPresent(t8, i10)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (isFieldPresent(t8, i10)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (isFieldPresent(t8, i10)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (isFieldPresent(t8, i10)) {
                        Object object = UnsafeUtil.getObject(t8, offset);
                        if (object instanceof ByteString) {
                            computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object);
                        } else {
                            computeDoubleSize = CodedOutputStream.computeStringSize(numberAt, (String) object);
                        }
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (isFieldPresent(t8, i10)) {
                        computeDoubleSize = SchemaUtil.computeSizeMessage(numberAt, UnsafeUtil.getObject(t8, offset), getMessageFieldSchema(i10));
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (isFieldPresent(t8, i10)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) UnsafeUtil.getObject(t8, offset));
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (isFieldPresent(t8, i10)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, UnsafeUtil.getInt(t8, offset));
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (isFieldPresent(t8, i10)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, UnsafeUtil.getInt(t8, offset));
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (isFieldPresent(t8, i10)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (isFieldPresent(t8, i10)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (isFieldPresent(t8, i10)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, UnsafeUtil.getInt(t8, offset));
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (isFieldPresent(t8, i10)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, UnsafeUtil.getLong(t8, offset));
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (isFieldPresent(t8, i10)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) UnsafeUtil.getObject(t8, offset), getMessageFieldSchema(i10));
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, listAt(t8, offset), false);
                    i9 += computeDoubleSize;
                    break;
                case 19:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, listAt(t8, offset), false);
                    i9 += computeDoubleSize;
                    break;
                case 20:
                    computeDoubleSize = SchemaUtil.computeSizeInt64List(numberAt, listAt(t8, offset), false);
                    i9 += computeDoubleSize;
                    break;
                case 21:
                    computeDoubleSize = SchemaUtil.computeSizeUInt64List(numberAt, listAt(t8, offset), false);
                    i9 += computeDoubleSize;
                    break;
                case 22:
                    computeDoubleSize = SchemaUtil.computeSizeInt32List(numberAt, listAt(t8, offset), false);
                    i9 += computeDoubleSize;
                    break;
                case 23:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, listAt(t8, offset), false);
                    i9 += computeDoubleSize;
                    break;
                case 24:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, listAt(t8, offset), false);
                    i9 += computeDoubleSize;
                    break;
                case 25:
                    computeDoubleSize = SchemaUtil.computeSizeBoolList(numberAt, listAt(t8, offset), false);
                    i9 += computeDoubleSize;
                    break;
                case 26:
                    computeDoubleSize = SchemaUtil.computeSizeStringList(numberAt, listAt(t8, offset));
                    i9 += computeDoubleSize;
                    break;
                case 27:
                    computeDoubleSize = SchemaUtil.computeSizeMessageList(numberAt, listAt(t8, offset), getMessageFieldSchema(i10));
                    i9 += computeDoubleSize;
                    break;
                case 28:
                    computeDoubleSize = SchemaUtil.computeSizeByteStringList(numberAt, listAt(t8, offset));
                    i9 += computeDoubleSize;
                    break;
                case 29:
                    computeDoubleSize = SchemaUtil.computeSizeUInt32List(numberAt, listAt(t8, offset), false);
                    i9 += computeDoubleSize;
                    break;
                case 30:
                    computeDoubleSize = SchemaUtil.computeSizeEnumList(numberAt, listAt(t8, offset), false);
                    i9 += computeDoubleSize;
                    break;
                case 31:
                    computeDoubleSize = SchemaUtil.computeSizeFixed32List(numberAt, listAt(t8, offset), false);
                    i9 += computeDoubleSize;
                    break;
                case 32:
                    computeDoubleSize = SchemaUtil.computeSizeFixed64List(numberAt, listAt(t8, offset), false);
                    i9 += computeDoubleSize;
                    break;
                case 33:
                    computeDoubleSize = SchemaUtil.computeSizeSInt32List(numberAt, listAt(t8, offset), false);
                    i9 += computeDoubleSize;
                    break;
                case 34:
                    computeDoubleSize = SchemaUtil.computeSizeSInt64List(numberAt, listAt(t8, offset), false);
                    i9 += computeDoubleSize;
                    break;
                case 35:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i9 += computeDoubleSize;
                        break;
                    }
                case 36:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i9 += computeDoubleSize;
                        break;
                    }
                case 37:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i9 += computeDoubleSize;
                        break;
                    }
                case 38:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i9 += computeDoubleSize;
                        break;
                    }
                case 39:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i9 += computeDoubleSize;
                        break;
                    }
                case 40:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i9 += computeDoubleSize;
                        break;
                    }
                case 41:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i9 += computeDoubleSize;
                        break;
                    }
                case 42:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i9 += computeDoubleSize;
                        break;
                    }
                case 43:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i9 += computeDoubleSize;
                        break;
                    }
                case 44:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i9 += computeDoubleSize;
                        break;
                    }
                case 45:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i9 += computeDoubleSize;
                        break;
                    }
                case 46:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i9 += computeDoubleSize;
                        break;
                    }
                case 47:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i9 += computeDoubleSize;
                        break;
                    }
                case 48:
                    computeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t8, offset));
                    if (computeSizeFixed64ListNoTag <= 0) {
                        break;
                    } else {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t8, i8, computeSizeFixed64ListNoTag);
                        }
                        computeTagSize = CodedOutputStream.computeTagSize(numberAt);
                        computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(computeSizeFixed64ListNoTag);
                        computeDoubleSize = computeTagSize + computeUInt32SizeNoTag + computeSizeFixed64ListNoTag;
                        i9 += computeDoubleSize;
                        break;
                    }
                case 49:
                    computeDoubleSize = SchemaUtil.computeSizeGroupList(numberAt, listAt(t8, offset), getMessageFieldSchema(i10));
                    i9 += computeDoubleSize;
                    break;
                case 50:
                    computeDoubleSize = this.mapFieldSchema.getSerializedSize(numberAt, UnsafeUtil.getObject(t8, offset), getMapFieldDefaultEntry(i10));
                    i9 += computeDoubleSize;
                    break;
                case 51:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        computeDoubleSize = CodedOutputStream.computeDoubleSize(numberAt, 0.0d);
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        computeDoubleSize = CodedOutputStream.computeFloatSize(numberAt, 0.0f);
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        computeDoubleSize = CodedOutputStream.computeInt64Size(numberAt, oneofLongAt(t8, offset));
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        computeDoubleSize = CodedOutputStream.computeUInt64Size(numberAt, oneofLongAt(t8, offset));
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        computeDoubleSize = CodedOutputStream.computeInt32Size(numberAt, oneofIntAt(t8, offset));
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        computeDoubleSize = CodedOutputStream.computeFixed64Size(numberAt, 0L);
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        computeDoubleSize = CodedOutputStream.computeFixed32Size(numberAt, 0);
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        computeDoubleSize = CodedOutputStream.computeBoolSize(numberAt, true);
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        Object object2 = UnsafeUtil.getObject(t8, offset);
                        if (object2 instanceof ByteString) {
                            computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) object2);
                        } else {
                            computeDoubleSize = CodedOutputStream.computeStringSize(numberAt, (String) object2);
                        }
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        computeDoubleSize = SchemaUtil.computeSizeMessage(numberAt, UnsafeUtil.getObject(t8, offset), getMessageFieldSchema(i10));
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        computeDoubleSize = CodedOutputStream.computeBytesSize(numberAt, (ByteString) UnsafeUtil.getObject(t8, offset));
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        computeDoubleSize = CodedOutputStream.computeUInt32Size(numberAt, oneofIntAt(t8, offset));
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        computeDoubleSize = CodedOutputStream.computeEnumSize(numberAt, oneofIntAt(t8, offset));
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed32Size(numberAt, 0);
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        computeDoubleSize = CodedOutputStream.computeSFixed64Size(numberAt, 0L);
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        computeDoubleSize = CodedOutputStream.computeSInt32Size(numberAt, oneofIntAt(t8, offset));
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        computeDoubleSize = CodedOutputStream.computeSInt64Size(numberAt, oneofLongAt(t8, offset));
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        computeDoubleSize = CodedOutputStream.computeGroupSize(numberAt, (MessageLite) UnsafeUtil.getObject(t8, offset), getMessageFieldSchema(i10));
                        i9 += computeDoubleSize;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i9 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t8);
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t8) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t8));
    }

    private static <T> int intAt(T t8, long j8) {
        return UnsafeUtil.getInt(t8, j8);
    }

    private static boolean isEnforceUtf8(int i8) {
        return (i8 & ENFORCE_UTF8_MASK) != 0;
    }

    private boolean isFieldPresent(T t8, int i8, int i9, int i10, int i11) {
        if (i9 == 1048575) {
            return isFieldPresent(t8, i8);
        }
        return (i10 & i11) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i8, int i9) {
        List list = (List) UnsafeUtil.getObject(obj, offset(i8));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i9);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!messageFieldSchema.isInitialized(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.datastore.preferences.protobuf.Schema] */
    private boolean isMapInitialized(T t8, int i8, int i9) {
        Map<?, ?> forMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t8, offset(i8)));
        if (forMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i9)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? r52 = 0;
        for (Object obj : forMapData.values()) {
            r52 = r52;
            if (r52 == 0) {
                r52 = Protobuf.getInstance().schemaFor((Class) obj.getClass());
            }
            if (!r52.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t8, T t9, int i8) {
        long presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i8) & 1048575;
        if (UnsafeUtil.getInt(t8, presenceMaskAndOffsetAt) == UnsafeUtil.getInt(t9, presenceMaskAndOffsetAt)) {
            return true;
        }
        return false;
    }

    private boolean isOneofPresent(T t8, int i8, int i9) {
        if (UnsafeUtil.getInt(t8, presenceMaskAndOffsetAt(i9) & 1048575) == i8) {
            return true;
        }
        return false;
    }

    private static boolean isRequired(int i8) {
        return (i8 & REQUIRED_MASK) != 0;
    }

    private static List<?> listAt(Object obj, long j8) {
        return (List) UnsafeUtil.getObject(obj, j8);
    }

    private static <T> long longAt(T t8, long j8) {
        return UnsafeUtil.getLong(t8, j8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x0094, code lost:            r0 = r18.checkInitializedCount;        r4 = r5;     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0099, code lost:            if (r0 >= r18.repeatedFieldOffsetStart) goto L240;     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x009b, code lost:            r4 = filterMapUnknownEnumValues(r21, r18.intArray[r0], r4, r19, r21);        r0 = r0 + 1;        r3 = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x00b1, code lost:            r10 = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x00b2, code lost:            if (r4 == null) goto L243;     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x00b4, code lost:            r7.setBuilderToMessage(r10, r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x00b7, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:219:?, code lost:            return;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x00c6. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x064f A[Catch: all -> 0x0675, TRY_LEAVE, TryCatch #8 {all -> 0x0675, blocks: (B:34:0x0649, B:36:0x064f, B:49:0x0679, B:50:0x067e), top: B:33:0x0649 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x06b5 A[LOOP:4: B:65:0x06b1->B:67:0x06b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x06ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> r19, androidx.datastore.preferences.protobuf.ExtensionSchema<ET> r20, T r21, androidx.datastore.preferences.protobuf.Reader r22, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.mergeFromHelper(androidx.datastore.preferences.protobuf.UnknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema, java.lang.Object, androidx.datastore.preferences.protobuf.Reader, androidx.datastore.preferences.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void mergeMap(Object obj, int i8, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) throws IOException {
        long offset = offset(typeAndOffsetAt(i8));
        Object object = UnsafeUtil.getObject(obj, offset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, offset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object newMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            UnsafeUtil.putObject(obj, offset, newMapField);
            object = newMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t8, T t9, int i8) {
        if (!isFieldPresent(t9, i8)) {
            return;
        }
        long offset = offset(typeAndOffsetAt(i8));
        Unsafe unsafe = UNSAFE;
        Object object = unsafe.getObject(t9, offset);
        if (object != null) {
            Schema messageFieldSchema = getMessageFieldSchema(i8);
            if (!isFieldPresent(t8, i8)) {
                if (!isMutable(object)) {
                    unsafe.putObject(t8, offset, object);
                } else {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(t8, offset, newInstance);
                }
                setFieldPresent(t8, i8);
                return;
            }
            Object object2 = unsafe.getObject(t8, offset);
            if (!isMutable(object2)) {
                Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(t8, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + numberAt(i8) + " is present but null: " + t9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T t8, T t9, int i8) {
        int numberAt = numberAt(i8);
        if (!isOneofPresent(t9, numberAt, i8)) {
            return;
        }
        long offset = offset(typeAndOffsetAt(i8));
        Unsafe unsafe = UNSAFE;
        Object object = unsafe.getObject(t9, offset);
        if (object != null) {
            Schema messageFieldSchema = getMessageFieldSchema(i8);
            if (!isOneofPresent(t8, numberAt, i8)) {
                if (!isMutable(object)) {
                    unsafe.putObject(t8, offset, object);
                } else {
                    Object newInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(newInstance, object);
                    unsafe.putObject(t8, offset, newInstance);
                }
                setOneofPresent(t8, numberAt, i8);
                return;
            }
            Object object2 = unsafe.getObject(t8, offset);
            if (!isMutable(object2)) {
                Object newInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(newInstance2, object2);
                unsafe.putObject(t8, offset, newInstance2);
                object2 = newInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + numberAt(i8) + " is present but null: " + t9);
    }

    private void mergeSingleField(T t8, T t9, int i8) {
        int typeAndOffsetAt = typeAndOffsetAt(i8);
        long offset = offset(typeAndOffsetAt);
        int numberAt = numberAt(i8);
        switch (type(typeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t9, i8)) {
                    UnsafeUtil.putDouble(t8, offset, UnsafeUtil.getDouble(t9, offset));
                    setFieldPresent(t8, i8);
                    return;
                }
                return;
            case 1:
                if (isFieldPresent(t9, i8)) {
                    UnsafeUtil.putFloat(t8, offset, UnsafeUtil.getFloat(t9, offset));
                    setFieldPresent(t8, i8);
                    return;
                }
                return;
            case 2:
                if (isFieldPresent(t9, i8)) {
                    UnsafeUtil.putLong(t8, offset, UnsafeUtil.getLong(t9, offset));
                    setFieldPresent(t8, i8);
                    return;
                }
                return;
            case 3:
                if (isFieldPresent(t9, i8)) {
                    UnsafeUtil.putLong(t8, offset, UnsafeUtil.getLong(t9, offset));
                    setFieldPresent(t8, i8);
                    return;
                }
                return;
            case 4:
                if (isFieldPresent(t9, i8)) {
                    UnsafeUtil.putInt(t8, offset, UnsafeUtil.getInt(t9, offset));
                    setFieldPresent(t8, i8);
                    return;
                }
                return;
            case 5:
                if (isFieldPresent(t9, i8)) {
                    UnsafeUtil.putLong(t8, offset, UnsafeUtil.getLong(t9, offset));
                    setFieldPresent(t8, i8);
                    return;
                }
                return;
            case 6:
                if (isFieldPresent(t9, i8)) {
                    UnsafeUtil.putInt(t8, offset, UnsafeUtil.getInt(t9, offset));
                    setFieldPresent(t8, i8);
                    return;
                }
                return;
            case 7:
                if (isFieldPresent(t9, i8)) {
                    UnsafeUtil.putBoolean(t8, offset, UnsafeUtil.getBoolean(t9, offset));
                    setFieldPresent(t8, i8);
                    return;
                }
                return;
            case 8:
                if (isFieldPresent(t9, i8)) {
                    UnsafeUtil.putObject(t8, offset, UnsafeUtil.getObject(t9, offset));
                    setFieldPresent(t8, i8);
                    return;
                }
                return;
            case 9:
                mergeMessage(t8, t9, i8);
                return;
            case 10:
                if (isFieldPresent(t9, i8)) {
                    UnsafeUtil.putObject(t8, offset, UnsafeUtil.getObject(t9, offset));
                    setFieldPresent(t8, i8);
                    return;
                }
                return;
            case 11:
                if (isFieldPresent(t9, i8)) {
                    UnsafeUtil.putInt(t8, offset, UnsafeUtil.getInt(t9, offset));
                    setFieldPresent(t8, i8);
                    return;
                }
                return;
            case 12:
                if (isFieldPresent(t9, i8)) {
                    UnsafeUtil.putInt(t8, offset, UnsafeUtil.getInt(t9, offset));
                    setFieldPresent(t8, i8);
                    return;
                }
                return;
            case 13:
                if (isFieldPresent(t9, i8)) {
                    UnsafeUtil.putInt(t8, offset, UnsafeUtil.getInt(t9, offset));
                    setFieldPresent(t8, i8);
                    return;
                }
                return;
            case 14:
                if (isFieldPresent(t9, i8)) {
                    UnsafeUtil.putLong(t8, offset, UnsafeUtil.getLong(t9, offset));
                    setFieldPresent(t8, i8);
                    return;
                }
                return;
            case 15:
                if (isFieldPresent(t9, i8)) {
                    UnsafeUtil.putInt(t8, offset, UnsafeUtil.getInt(t9, offset));
                    setFieldPresent(t8, i8);
                    return;
                }
                return;
            case 16:
                if (isFieldPresent(t9, i8)) {
                    UnsafeUtil.putLong(t8, offset, UnsafeUtil.getLong(t9, offset));
                    setFieldPresent(t8, i8);
                    return;
                }
                return;
            case 17:
                mergeMessage(t8, t9, i8);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(t8, t9, offset);
                return;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, t8, t9, offset);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t9, numberAt, i8)) {
                    UnsafeUtil.putObject(t8, offset, UnsafeUtil.getObject(t9, offset));
                    setOneofPresent(t8, numberAt, i8);
                    return;
                }
                return;
            case 60:
                mergeOneofMessage(t8, t9, i8);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t9, numberAt, i8)) {
                    UnsafeUtil.putObject(t8, offset, UnsafeUtil.getObject(t9, offset));
                    setOneofPresent(t8, numberAt, i8);
                    return;
                }
                return;
            case 68:
                mergeOneofMessage(t8, t9, i8);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T t8, int i8) {
        Schema messageFieldSchema = getMessageFieldSchema(i8);
        long offset = offset(typeAndOffsetAt(i8));
        if (!isFieldPresent(t8, i8)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t8, offset);
        if (isMutable(object)) {
            return object;
        }
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T t8, int i8, int i9) {
        Schema messageFieldSchema = getMessageFieldSchema(i9);
        if (!isOneofPresent(t8, i8, i9)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t8, offset(typeAndOffsetAt(i9)));
        if (isMutable(object)) {
            return object;
        }
        Object newInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(newInstance, object);
        }
        return newInstance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        if (messageInfo instanceof RawMessageInfo) {
            return newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        return newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        boolean z8;
        int fieldNumber;
        int fieldNumber2;
        int[] iArr;
        int i8;
        if (structuralMessageInfo.getSyntax() == ProtoSyntax.PROTO3) {
            z8 = true;
        } else {
            z8 = false;
        }
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr2 = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i9 = 0;
        int i10 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i9++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i10++;
            }
        }
        int[] iArr3 = null;
        if (i9 > 0) {
            iArr = new int[i9];
        } else {
            iArr = null;
        }
        if (i10 > 0) {
            iArr3 = new int[i10];
        }
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i11 < fields.length) {
            FieldInfo fieldInfo2 = fields[i11];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr2, i12, objArr);
            if (i13 < checkInitialized.length && checkInitialized[i13] == fieldNumber3) {
                checkInitialized[i13] = i12;
                i13++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr[i14] = i12;
                i14++;
            } else if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                i8 = i12;
                iArr3[i15] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                i15++;
                i11++;
                i12 = i8 + 3;
            }
            i8 = i12;
            i11++;
            i12 = i8 + 3;
        }
        if (iArr == null) {
            iArr = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr, 0, iArr4, checkInitialized.length, iArr.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr.length, iArr3.length);
        return new MessageSchema<>(iArr2, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), z8, true, iArr4, checkInitialized.length, checkInitialized.length + iArr.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <T> androidx.datastore.preferences.protobuf.MessageSchema<T> newSchemaForRawMessageInfo(androidx.datastore.preferences.protobuf.RawMessageInfo r33, androidx.datastore.preferences.protobuf.NewInstanceSchema r34, androidx.datastore.preferences.protobuf.ListFieldSchema r35, androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r36, androidx.datastore.preferences.protobuf.ExtensionSchema<?> r37, androidx.datastore.preferences.protobuf.MapFieldSchema r38) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.newSchemaForRawMessageInfo(androidx.datastore.preferences.protobuf.RawMessageInfo, androidx.datastore.preferences.protobuf.NewInstanceSchema, androidx.datastore.preferences.protobuf.ListFieldSchema, androidx.datastore.preferences.protobuf.UnknownFieldSchema, androidx.datastore.preferences.protobuf.ExtensionSchema, androidx.datastore.preferences.protobuf.MapFieldSchema):androidx.datastore.preferences.protobuf.MessageSchema");
    }

    private int numberAt(int i8) {
        return this.buffer[i8];
    }

    private static long offset(int i8) {
        return i8 & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t8, long j8) {
        return ((Boolean) UnsafeUtil.getObject(t8, j8)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t8, long j8) {
        return ((Double) UnsafeUtil.getObject(t8, j8)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t8, long j8) {
        return ((Float) UnsafeUtil.getObject(t8, j8)).floatValue();
    }

    private static <T> int oneofIntAt(T t8, long j8) {
        return ((Integer) UnsafeUtil.getObject(t8, j8)).intValue();
    }

    private static <T> long oneofLongAt(T t8, long j8) {
        return ((Long) UnsafeUtil.getObject(t8, j8)).longValue();
    }

    private <K, V> int parseMapField(T t8, byte[] bArr, int i8, int i9, int i10, long j8, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i10);
        Object object = unsafe.getObject(t8, j8);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object newMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(newMapField, object);
            unsafe.putObject(t8, j8, newMapField);
            object = newMapField;
        }
        return decodeMapEntry(bArr, i8, i9, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0023. Please report as an issue. */
    private int parseOneofField(T t8, byte[] bArr, int i8, int i9, int i10, int i11, int i12, int i13, int i14, long j8, int i15, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j9 = this.buffer[i15 + 2] & 1048575;
        switch (i14) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(t8, j8, Double.valueOf(ArrayDecoders.decodeDouble(bArr, i8)));
                    int i16 = i8 + 8;
                    unsafe.putInt(t8, j9, i11);
                    return i16;
                }
                return i8;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(t8, j8, Float.valueOf(ArrayDecoders.decodeFloat(bArr, i8)));
                    int i17 = i8 + 4;
                    unsafe.putInt(t8, j9, i11);
                    return i17;
                }
                return i8;
            case 53:
            case 54:
                if (i12 == 0) {
                    int decodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i8, registers);
                    unsafe.putObject(t8, j8, Long.valueOf(registers.long1));
                    unsafe.putInt(t8, j9, i11);
                    return decodeVarint64;
                }
                return i8;
            case 55:
            case 62:
                if (i12 == 0) {
                    int decodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i8, registers);
                    unsafe.putObject(t8, j8, Integer.valueOf(registers.int1));
                    unsafe.putInt(t8, j9, i11);
                    return decodeVarint32;
                }
                return i8;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(t8, j8, Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i8)));
                    int i18 = i8 + 8;
                    unsafe.putInt(t8, j9, i11);
                    return i18;
                }
                return i8;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(t8, j8, Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i8)));
                    int i19 = i8 + 4;
                    unsafe.putInt(t8, j9, i11);
                    return i19;
                }
                return i8;
            case 58:
                if (i12 == 0) {
                    int decodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i8, registers);
                    unsafe.putObject(t8, j8, Boolean.valueOf(registers.long1 != 0));
                    unsafe.putInt(t8, j9, i11);
                    return decodeVarint642;
                }
                return i8;
            case 59:
                if (i12 == 2) {
                    int decodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i8, registers);
                    int i20 = registers.int1;
                    if (i20 == 0) {
                        unsafe.putObject(t8, j8, "");
                    } else {
                        if ((i13 & ENFORCE_UTF8_MASK) != 0 && !Utf8.isValidUtf8(bArr, decodeVarint322, decodeVarint322 + i20)) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        unsafe.putObject(t8, j8, new String(bArr, decodeVarint322, i20, Internal.UTF_8));
                        decodeVarint322 += i20;
                    }
                    unsafe.putInt(t8, j9, i11);
                    return decodeVarint322;
                }
                return i8;
            case 60:
                if (i12 == 2) {
                    Object mutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t8, i11, i15);
                    int mergeMessageField = ArrayDecoders.mergeMessageField(mutableOneofMessageFieldForMerge, getMessageFieldSchema(i15), bArr, i8, i9, registers);
                    storeOneofMessageField(t8, i11, i15, mutableOneofMessageFieldForMerge);
                    return mergeMessageField;
                }
                return i8;
            case 61:
                if (i12 == 2) {
                    int decodeBytes = ArrayDecoders.decodeBytes(bArr, i8, registers);
                    unsafe.putObject(t8, j8, registers.object1);
                    unsafe.putInt(t8, j9, i11);
                    return decodeBytes;
                }
                return i8;
            case 63:
                if (i12 == 0) {
                    int decodeVarint323 = ArrayDecoders.decodeVarint32(bArr, i8, registers);
                    int i21 = registers.int1;
                    Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i15);
                    if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i21)) {
                        getMutableUnknownFields(t8).storeField(i10, Long.valueOf(i21));
                    } else {
                        unsafe.putObject(t8, j8, Integer.valueOf(i21));
                        unsafe.putInt(t8, j9, i11);
                    }
                    return decodeVarint323;
                }
                return i8;
            case 66:
                if (i12 == 0) {
                    int decodeVarint324 = ArrayDecoders.decodeVarint32(bArr, i8, registers);
                    unsafe.putObject(t8, j8, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                    unsafe.putInt(t8, j9, i11);
                    return decodeVarint324;
                }
                return i8;
            case 67:
                if (i12 == 0) {
                    int decodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i8, registers);
                    unsafe.putObject(t8, j8, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                    unsafe.putInt(t8, j9, i11);
                    return decodeVarint643;
                }
                return i8;
            case 68:
                if (i12 == 3) {
                    Object mutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t8, i11, i15);
                    int mergeGroupField = ArrayDecoders.mergeGroupField(mutableOneofMessageFieldForMerge2, getMessageFieldSchema(i15), bArr, i8, i9, (i10 & (-8)) | 4, registers);
                    storeOneofMessageField(t8, i11, i15, mutableOneofMessageFieldForMerge2);
                    return mergeGroupField;
                }
                return i8;
            default:
                return i8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0296, code lost:            if (r0 != r10) goto L100;     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0298, code lost:            r15 = r29;        r14 = r30;        r12 = r31;        r13 = r33;        r11 = r34;        r1 = r18;        r7 = r22;        r6 = r26;     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02ae, code lost:            r2 = r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02e4, code lost:            if (r0 != r15) goto L100;     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0303, code lost:            if (r0 != r15) goto L100;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0088. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @androidx.datastore.preferences.protobuf.CanIgnoreReturnValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int parseProto3Message(T r30, byte[] r31, int r32, int r33, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 870
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.parseProto3Message(java.lang.Object, byte[], int, int, androidx.datastore.preferences.protobuf.ArrayDecoders$Registers):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0030. Please report as an issue. */
    private int parseRepeatedField(T t8, byte[] bArr, int i8, int i9, int i10, int i11, int i12, int i13, long j8, int i14, long j9, ArrayDecoders.Registers registers) throws IOException {
        int decodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe.getObject(t8, j9);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            protobufList = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t8, j9, protobufList);
        }
        switch (i14) {
            case 18:
            case 35:
                if (i12 == 2) {
                    return ArrayDecoders.decodePackedDoubleList(bArr, i8, protobufList, registers);
                }
                if (i12 == 1) {
                    return ArrayDecoders.decodeDoubleList(i10, bArr, i8, i9, protobufList, registers);
                }
                return i8;
            case 19:
            case 36:
                if (i12 == 2) {
                    return ArrayDecoders.decodePackedFloatList(bArr, i8, protobufList, registers);
                }
                if (i12 == 5) {
                    return ArrayDecoders.decodeFloatList(i10, bArr, i8, i9, protobufList, registers);
                }
                return i8;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i12 == 2) {
                    return ArrayDecoders.decodePackedVarint64List(bArr, i8, protobufList, registers);
                }
                if (i12 == 0) {
                    return ArrayDecoders.decodeVarint64List(i10, bArr, i8, i9, protobufList, registers);
                }
                return i8;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i12 == 2) {
                    return ArrayDecoders.decodePackedVarint32List(bArr, i8, protobufList, registers);
                }
                if (i12 == 0) {
                    return ArrayDecoders.decodeVarint32List(i10, bArr, i8, i9, protobufList, registers);
                }
                return i8;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i12 == 2) {
                    return ArrayDecoders.decodePackedFixed64List(bArr, i8, protobufList, registers);
                }
                if (i12 == 1) {
                    return ArrayDecoders.decodeFixed64List(i10, bArr, i8, i9, protobufList, registers);
                }
                return i8;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i12 == 2) {
                    return ArrayDecoders.decodePackedFixed32List(bArr, i8, protobufList, registers);
                }
                if (i12 == 5) {
                    return ArrayDecoders.decodeFixed32List(i10, bArr, i8, i9, protobufList, registers);
                }
                return i8;
            case 25:
            case 42:
                if (i12 == 2) {
                    return ArrayDecoders.decodePackedBoolList(bArr, i8, protobufList, registers);
                }
                if (i12 == 0) {
                    return ArrayDecoders.decodeBoolList(i10, bArr, i8, i9, protobufList, registers);
                }
                return i8;
            case 26:
                if (i12 == 2) {
                    if ((j8 & 536870912) == 0) {
                        return ArrayDecoders.decodeStringList(i10, bArr, i8, i9, protobufList, registers);
                    }
                    return ArrayDecoders.decodeStringListRequireUtf8(i10, bArr, i8, i9, protobufList, registers);
                }
                return i8;
            case 27:
                if (i12 == 2) {
                    return ArrayDecoders.decodeMessageList(getMessageFieldSchema(i13), i10, bArr, i8, i9, protobufList, registers);
                }
                return i8;
            case 28:
                if (i12 == 2) {
                    return ArrayDecoders.decodeBytesList(i10, bArr, i8, i9, protobufList, registers);
                }
                return i8;
            case 30:
            case 44:
                if (i12 != 2) {
                    if (i12 == 0) {
                        decodeVarint32List = ArrayDecoders.decodeVarint32List(i10, bArr, i8, i9, protobufList, registers);
                    }
                    return i8;
                }
                decodeVarint32List = ArrayDecoders.decodePackedVarint32List(bArr, i8, protobufList, registers);
                SchemaUtil.filterUnknownEnumList((Object) t8, i11, (List<Integer>) protobufList, getEnumFieldVerifier(i13), (Object) null, (UnknownFieldSchema<UT, Object>) this.unknownFieldSchema);
                return decodeVarint32List;
            case 33:
            case 47:
                if (i12 == 2) {
                    return ArrayDecoders.decodePackedSInt32List(bArr, i8, protobufList, registers);
                }
                if (i12 == 0) {
                    return ArrayDecoders.decodeSInt32List(i10, bArr, i8, i9, protobufList, registers);
                }
                return i8;
            case 34:
            case 48:
                if (i12 == 2) {
                    return ArrayDecoders.decodePackedSInt64List(bArr, i8, protobufList, registers);
                }
                if (i12 == 0) {
                    return ArrayDecoders.decodeSInt64List(i10, bArr, i8, i9, protobufList, registers);
                }
                return i8;
            case 49:
                if (i12 == 3) {
                    return ArrayDecoders.decodeGroupList(getMessageFieldSchema(i13), i10, bArr, i8, i9, protobufList, registers);
                }
                return i8;
            default:
                return i8;
        }
    }

    private int positionForFieldNumber(int i8) {
        if (i8 < this.minFieldNumber || i8 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i8, 0);
    }

    private int presenceMaskAndOffsetAt(int i8) {
        return this.buffer[i8 + 2];
    }

    private <E> void readGroupList(Object obj, long j8, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j8), schema, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj, int i8, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i8)), schema, extensionRegistryLite);
    }

    private void readString(Object obj, int i8, Reader reader) throws IOException {
        if (isEnforceUtf8(i8)) {
            UnsafeUtil.putObject(obj, offset(i8), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i8), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i8), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i8, Reader reader) throws IOException {
        if (isEnforceUtf8(i8)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i8)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i8)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void setFieldPresent(T t8, int i8) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i8);
        long j8 = 1048575 & presenceMaskAndOffsetAt;
        if (j8 == 1048575) {
            return;
        }
        UnsafeUtil.putInt(t8, j8, (1 << (presenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(t8, j8));
    }

    private void setOneofPresent(T t8, int i8, int i9) {
        UnsafeUtil.putInt(t8, presenceMaskAndOffsetAt(i9) & 1048575, i8);
    }

    private int slowPositionForFieldNumber(int i8, int i9) {
        int length = (this.buffer.length / 3) - 1;
        while (i9 <= length) {
            int i10 = (length + i9) >>> 1;
            int i11 = i10 * 3;
            int numberAt = numberAt(i11);
            if (i8 == numberAt) {
                return i11;
            }
            if (i8 < numberAt) {
                length = i10 - 1;
            } else {
                i9 = i10 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void storeFieldData(androidx.datastore.preferences.protobuf.FieldInfo r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            androidx.datastore.preferences.protobuf.OneofInfo r0 = r8.getOneof()
            r1 = 0
            if (r0 == 0) goto L25
            androidx.datastore.preferences.protobuf.FieldType r2 = r8.getType()
            int r2 = r2.id()
            int r2 = r2 + 51
            java.lang.reflect.Field r3 = r0.getValueField()
            long r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.objectFieldOffset(r3)
            int r4 = (int) r3
            java.lang.reflect.Field r0 = r0.getCaseField()
            long r5 = androidx.datastore.preferences.protobuf.UnsafeUtil.objectFieldOffset(r0)
        L22:
            int r0 = (int) r5
        L23:
            r3 = 0
            goto L6b
        L25:
            androidx.datastore.preferences.protobuf.FieldType r0 = r8.getType()
            java.lang.reflect.Field r2 = r8.getField()
            long r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.objectFieldOffset(r2)
            int r4 = (int) r2
            int r2 = r0.id()
            boolean r3 = r0.isList()
            if (r3 != 0) goto L5a
            boolean r0 = r0.isMap()
            if (r0 != 0) goto L5a
            java.lang.reflect.Field r0 = r8.getPresenceField()
            if (r0 != 0) goto L4c
            r0 = 1048575(0xfffff, float:1.469367E-39)
            goto L51
        L4c:
            long r5 = androidx.datastore.preferences.protobuf.UnsafeUtil.objectFieldOffset(r0)
            int r0 = (int) r5
        L51:
            int r3 = r8.getPresenceMask()
            int r3 = java.lang.Integer.numberOfTrailingZeros(r3)
            goto L6b
        L5a:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            if (r0 != 0) goto L62
            r0 = 0
            goto L23
        L62:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            long r5 = androidx.datastore.preferences.protobuf.UnsafeUtil.objectFieldOffset(r0)
            goto L22
        L6b:
            int r5 = r8.getFieldNumber()
            r9[r10] = r5
            int r5 = r10 + 1
            boolean r6 = r8.isEnforceUtf8()
            if (r6 == 0) goto L7c
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L7d
        L7c:
            r6 = 0
        L7d:
            boolean r7 = r8.isRequired()
            if (r7 == 0) goto L85
            r1 = 268435456(0x10000000, float:2.524355E-29)
        L85:
            r1 = r1 | r6
            int r2 = r2 << 20
            r1 = r1 | r2
            r1 = r1 | r4
            r9[r5] = r1
            int r1 = r10 + 2
            int r2 = r3 << 20
            r0 = r0 | r2
            r9[r1] = r0
            java.lang.Class r9 = r8.getMessageFieldClass()
            java.lang.Object r0 = r8.getMapDefaultEntry()
            if (r0 == 0) goto Lbd
            int r10 = r10 / 3
            int r10 = r10 * 2
            java.lang.Object r0 = r8.getMapDefaultEntry()
            r11[r10] = r0
            if (r9 == 0) goto Lae
            int r10 = r10 + 1
            r11[r10] = r9
            goto Lda
        Lae:
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Lda
            int r10 = r10 + 1
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r8 = r8.getEnumVerifier()
            r11[r10] = r8
            goto Lda
        Lbd:
            if (r9 == 0) goto Lc8
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            r11[r10] = r9
            goto Lda
        Lc8:
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Lda
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r8 = r8.getEnumVerifier()
            r11[r10] = r8
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.storeFieldData(androidx.datastore.preferences.protobuf.FieldInfo, int[], int, java.lang.Object[]):void");
    }

    private void storeMessageField(T t8, int i8, Object obj) {
        UNSAFE.putObject(t8, offset(typeAndOffsetAt(i8)), obj);
        setFieldPresent(t8, i8);
    }

    private void storeOneofMessageField(T t8, int i8, int i9, Object obj) {
        UNSAFE.putObject(t8, offset(typeAndOffsetAt(i9)), obj);
        setOneofPresent(t8, i8, i9);
    }

    private static int type(int i8) {
        return (i8 & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i8) {
        return this.buffer[i8 + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInAscendingOrderProto2(T r18, androidx.datastore.preferences.protobuf.Writer r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.writeFieldsInAscendingOrderProto2(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInAscendingOrderProto3(T r13, androidx.datastore.preferences.protobuf.Writer r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.writeFieldsInAscendingOrderProto3(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void writeFieldsInDescendingOrder(T r11, androidx.datastore.preferences.protobuf.Writer r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageSchema.writeFieldsInDescendingOrder(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    private <K, V> void writeMapHelper(Writer writer, int i8, Object obj, int i9) throws IOException {
        if (obj != null) {
            writer.writeMap(i8, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i9)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i8, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.writeString(i8, (String) obj);
        } else {
            writer.writeBytes(i8, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t8, Writer writer) throws IOException {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t8), writer);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public boolean equals(T t8, T t9) {
        int length = this.buffer.length;
        for (int i8 = 0; i8 < length; i8 += 3) {
            if (!equals(t8, t9, i8)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t8).equals(this.unknownFieldSchema.getFromMessage(t9))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t8).equals(this.extensionSchema.getExtensions(t9));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int getSerializedSize(T t8) {
        if (this.proto3) {
            return getSerializedSizeProto3(t8);
        }
        return getSerializedSizeProto2(t8);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0019. Please report as an issue. */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public int hashCode(T t8) {
        int i8;
        int hashLong;
        int length = this.buffer.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i10);
            int numberAt = numberAt(i10);
            long offset = offset(typeAndOffsetAt);
            int i11 = 37;
            switch (type(typeAndOffsetAt)) {
                case 0:
                    i8 = i9 * 53;
                    hashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(t8, offset)));
                    i9 = i8 + hashLong;
                    break;
                case 1:
                    i8 = i9 * 53;
                    hashLong = Float.floatToIntBits(UnsafeUtil.getFloat(t8, offset));
                    i9 = i8 + hashLong;
                    break;
                case 2:
                    i8 = i9 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t8, offset));
                    i9 = i8 + hashLong;
                    break;
                case 3:
                    i8 = i9 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t8, offset));
                    i9 = i8 + hashLong;
                    break;
                case 4:
                    i8 = i9 * 53;
                    hashLong = UnsafeUtil.getInt(t8, offset);
                    i9 = i8 + hashLong;
                    break;
                case 5:
                    i8 = i9 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t8, offset));
                    i9 = i8 + hashLong;
                    break;
                case 6:
                    i8 = i9 * 53;
                    hashLong = UnsafeUtil.getInt(t8, offset);
                    i9 = i8 + hashLong;
                    break;
                case 7:
                    i8 = i9 * 53;
                    hashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(t8, offset));
                    i9 = i8 + hashLong;
                    break;
                case 8:
                    i8 = i9 * 53;
                    hashLong = ((String) UnsafeUtil.getObject(t8, offset)).hashCode();
                    i9 = i8 + hashLong;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(t8, offset);
                    if (object != null) {
                        i11 = object.hashCode();
                    }
                    i9 = (i9 * 53) + i11;
                    break;
                case 10:
                    i8 = i9 * 53;
                    hashLong = UnsafeUtil.getObject(t8, offset).hashCode();
                    i9 = i8 + hashLong;
                    break;
                case 11:
                    i8 = i9 * 53;
                    hashLong = UnsafeUtil.getInt(t8, offset);
                    i9 = i8 + hashLong;
                    break;
                case 12:
                    i8 = i9 * 53;
                    hashLong = UnsafeUtil.getInt(t8, offset);
                    i9 = i8 + hashLong;
                    break;
                case 13:
                    i8 = i9 * 53;
                    hashLong = UnsafeUtil.getInt(t8, offset);
                    i9 = i8 + hashLong;
                    break;
                case 14:
                    i8 = i9 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t8, offset));
                    i9 = i8 + hashLong;
                    break;
                case 15:
                    i8 = i9 * 53;
                    hashLong = UnsafeUtil.getInt(t8, offset);
                    i9 = i8 + hashLong;
                    break;
                case 16:
                    i8 = i9 * 53;
                    hashLong = Internal.hashLong(UnsafeUtil.getLong(t8, offset));
                    i9 = i8 + hashLong;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(t8, offset);
                    if (object2 != null) {
                        i11 = object2.hashCode();
                    }
                    i9 = (i9 * 53) + i11;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i8 = i9 * 53;
                    hashLong = UnsafeUtil.getObject(t8, offset).hashCode();
                    i9 = i8 + hashLong;
                    break;
                case 50:
                    i8 = i9 * 53;
                    hashLong = UnsafeUtil.getObject(t8, offset).hashCode();
                    i9 = i8 + hashLong;
                    break;
                case 51:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        i8 = i9 * 53;
                        hashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t8, offset)));
                        i9 = i8 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        i8 = i9 * 53;
                        hashLong = Float.floatToIntBits(oneofFloatAt(t8, offset));
                        i9 = i8 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        i8 = i9 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t8, offset));
                        i9 = i8 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        i8 = i9 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t8, offset));
                        i9 = i8 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        i8 = i9 * 53;
                        hashLong = oneofIntAt(t8, offset);
                        i9 = i8 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        i8 = i9 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t8, offset));
                        i9 = i8 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        i8 = i9 * 53;
                        hashLong = oneofIntAt(t8, offset);
                        i9 = i8 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        i8 = i9 * 53;
                        hashLong = Internal.hashBoolean(oneofBooleanAt(t8, offset));
                        i9 = i8 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        i8 = i9 * 53;
                        hashLong = ((String) UnsafeUtil.getObject(t8, offset)).hashCode();
                        i9 = i8 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        i8 = i9 * 53;
                        hashLong = UnsafeUtil.getObject(t8, offset).hashCode();
                        i9 = i8 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        i8 = i9 * 53;
                        hashLong = UnsafeUtil.getObject(t8, offset).hashCode();
                        i9 = i8 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        i8 = i9 * 53;
                        hashLong = oneofIntAt(t8, offset);
                        i9 = i8 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        i8 = i9 * 53;
                        hashLong = oneofIntAt(t8, offset);
                        i9 = i8 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        i8 = i9 * 53;
                        hashLong = oneofIntAt(t8, offset);
                        i9 = i8 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        i8 = i9 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t8, offset));
                        i9 = i8 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        i8 = i9 * 53;
                        hashLong = oneofIntAt(t8, offset);
                        i9 = i8 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        i8 = i9 * 53;
                        hashLong = Internal.hashLong(oneofLongAt(t8, offset));
                        i9 = i8 + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(t8, numberAt, i10)) {
                        i8 = i9 * 53;
                        hashLong = UnsafeUtil.getObject(t8, offset).hashCode();
                        i9 = i8 + hashLong;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i9 * 53) + this.unknownFieldSchema.getFromMessage(t8).hashCode();
        if (this.hasExtensions) {
            return (hashCode * 53) + this.extensionSchema.getExtensions(t8).hashCode();
        }
        return hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean isInitialized(T t8) {
        int i8;
        int i9;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.checkInitializedCount) {
            int i13 = this.intArray[i12];
            int numberAt = numberAt(i13);
            int typeAndOffsetAt = typeAndOffsetAt(i13);
            int i14 = this.buffer[i13 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i10) {
                if (i15 != 1048575) {
                    i11 = UNSAFE.getInt(t8, i15);
                }
                i9 = i11;
                i8 = i15;
            } else {
                i8 = i10;
                i9 = i11;
            }
            if (isRequired(typeAndOffsetAt) && !isFieldPresent(t8, i13, i8, i9, i16)) {
                return false;
            }
            int type = type(typeAndOffsetAt);
            if (type != 9 && type != 17) {
                if (type != 27) {
                    if (type == 60 || type == 68) {
                        if (isOneofPresent(t8, numberAt, i13) && !isInitialized(t8, typeAndOffsetAt, getMessageFieldSchema(i13))) {
                            return false;
                        }
                    } else if (type != 49) {
                        if (type == 50 && !isMapInitialized(t8, typeAndOffsetAt, i13)) {
                            return false;
                        }
                    }
                }
                if (!isListInitialized(t8, typeAndOffsetAt, i13)) {
                    return false;
                }
            } else if (isFieldPresent(t8, i13, i8, i9, i16) && !isInitialized(t8, typeAndOffsetAt, getMessageFieldSchema(i13))) {
                return false;
            }
            i12++;
            i10 = i8;
            i11 = i9;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(t8).isInitialized();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public void makeImmutable(T t8) {
        if (!isMutable(t8)) {
            return;
        }
        if (t8 instanceof GeneratedMessageLite) {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t8;
            generatedMessageLite.clearMemoizedSerializedSize();
            generatedMessageLite.clearMemoizedHashCode();
            generatedMessageLite.markImmutable();
        }
        int length = this.buffer.length;
        for (int i8 = 0; i8 < length; i8 += 3) {
            int typeAndOffsetAt = typeAndOffsetAt(i8);
            long offset = offset(typeAndOffsetAt);
            int type = type(typeAndOffsetAt);
            if (type != 9) {
                if (type != 60 && type != 68) {
                    switch (type) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.listFieldSchema.makeImmutableListAt(t8, offset);
                            break;
                        case 50:
                            Unsafe unsafe = UNSAFE;
                            Object object = unsafe.getObject(t8, offset);
                            if (object != null) {
                                unsafe.putObject(t8, offset, this.mapFieldSchema.toImmutable(object));
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (isOneofPresent(t8, numberAt(i8), i8)) {
                    getMessageFieldSchema(i8).makeImmutable(UNSAFE.getObject(t8, offset));
                }
            }
            if (isFieldPresent(t8, i8)) {
                getMessageFieldSchema(i8).makeImmutable(UNSAFE.getObject(t8, offset));
            }
        }
        this.unknownFieldSchema.makeImmutable(t8);
        if (this.hasExtensions) {
            this.extensionSchema.makeImmutable(t8);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T t8, T t9) {
        checkMutable(t8);
        t9.getClass();
        for (int i8 = 0; i8 < this.buffer.length; i8 += 3) {
            mergeSingleField(t8, t9, i8);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t8, t9);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t8, t9);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:98:0x008f. Please report as an issue. */
    @CanIgnoreReturnValue
    public int parseProto2Message(T t8, byte[] bArr, int i8, int i9, int i10, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe;
        int i11;
        MessageSchema<T> messageSchema;
        int i12;
        int i13;
        int i14;
        int i15;
        T t9;
        int i16;
        int positionForFieldNumber;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        byte[] bArr2;
        int decodeVarint64;
        boolean z8;
        int i27;
        int i28;
        int i29;
        MessageSchema<T> messageSchema2 = this;
        T t10 = t8;
        byte[] bArr3 = bArr;
        int i30 = i9;
        int i31 = i10;
        ArrayDecoders.Registers registers2 = registers;
        checkMutable(t8);
        Unsafe unsafe2 = UNSAFE;
        int i32 = i8;
        int i33 = -1;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 1048575;
        while (true) {
            if (i32 < i30) {
                int i38 = i32 + 1;
                byte b9 = bArr3[i32];
                if (b9 < 0) {
                    int decodeVarint32 = ArrayDecoders.decodeVarint32(b9, bArr3, i38, registers2);
                    i16 = registers2.int1;
                    i38 = decodeVarint32;
                } else {
                    i16 = b9;
                }
                int i39 = i16 >>> 3;
                int i40 = i16 & 7;
                if (i39 > i33) {
                    positionForFieldNumber = messageSchema2.positionForFieldNumber(i39, i34 / 3);
                } else {
                    positionForFieldNumber = messageSchema2.positionForFieldNumber(i39);
                }
                int i41 = positionForFieldNumber;
                if (i41 == -1) {
                    i17 = i39;
                    i18 = i38;
                    i13 = i16;
                    i19 = i36;
                    i20 = i37;
                    unsafe = unsafe2;
                    i11 = i31;
                    i21 = 0;
                } else {
                    int i42 = messageSchema2.buffer[i41 + 1];
                    int type = type(i42);
                    long offset = offset(i42);
                    int i43 = i16;
                    if (type <= 17) {
                        int i44 = messageSchema2.buffer[i41 + 2];
                        int i45 = 1 << (i44 >>> 20);
                        int i46 = i44 & 1048575;
                        if (i46 != i37) {
                            if (i37 != 1048575) {
                                unsafe2.putInt(t10, i37, i36);
                            }
                            i23 = i46;
                            i22 = unsafe2.getInt(t10, i46);
                        } else {
                            i22 = i36;
                            i23 = i37;
                        }
                        switch (type) {
                            case 0:
                                bArr2 = bArr;
                                i17 = i39;
                                i26 = i41;
                                i24 = i23;
                                i25 = i43;
                                if (i40 == 1) {
                                    UnsafeUtil.putDouble(t10, offset, ArrayDecoders.decodeDouble(bArr2, i38));
                                    i32 = i38 + 8;
                                    i36 = i22 | i45;
                                    i31 = i10;
                                    i34 = i26;
                                    i35 = i25;
                                    i33 = i17;
                                    i37 = i24;
                                    bArr3 = bArr2;
                                } else {
                                    i20 = i24;
                                    i11 = i10;
                                    i18 = i38;
                                    i21 = i26;
                                    unsafe = unsafe2;
                                    i19 = i22;
                                    i13 = i25;
                                    break;
                                }
                            case 1:
                                bArr2 = bArr;
                                i17 = i39;
                                i26 = i41;
                                i24 = i23;
                                i25 = i43;
                                if (i40 == 5) {
                                    UnsafeUtil.putFloat(t10, offset, ArrayDecoders.decodeFloat(bArr2, i38));
                                    i32 = i38 + 4;
                                    i36 = i22 | i45;
                                    i31 = i10;
                                    i34 = i26;
                                    i35 = i25;
                                    i33 = i17;
                                    i37 = i24;
                                    bArr3 = bArr2;
                                } else {
                                    i20 = i24;
                                    i11 = i10;
                                    i18 = i38;
                                    i21 = i26;
                                    unsafe = unsafe2;
                                    i19 = i22;
                                    i13 = i25;
                                    break;
                                }
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i17 = i39;
                                i26 = i41;
                                i24 = i23;
                                i25 = i43;
                                if (i40 == 0) {
                                    decodeVarint64 = ArrayDecoders.decodeVarint64(bArr2, i38, registers2);
                                    unsafe2.putLong(t8, offset, registers2.long1);
                                    i36 = i22 | i45;
                                    i31 = i10;
                                    i34 = i26;
                                    i32 = decodeVarint64;
                                    i35 = i25;
                                    i33 = i17;
                                    i37 = i24;
                                    bArr3 = bArr2;
                                } else {
                                    i20 = i24;
                                    i11 = i10;
                                    i18 = i38;
                                    i21 = i26;
                                    unsafe = unsafe2;
                                    i19 = i22;
                                    i13 = i25;
                                    break;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i17 = i39;
                                i26 = i41;
                                i24 = i23;
                                i25 = i43;
                                if (i40 == 0) {
                                    i32 = ArrayDecoders.decodeVarint32(bArr2, i38, registers2);
                                    unsafe2.putInt(t10, offset, registers2.int1);
                                    i36 = i22 | i45;
                                    i31 = i10;
                                    i34 = i26;
                                    i35 = i25;
                                    i33 = i17;
                                    i37 = i24;
                                    bArr3 = bArr2;
                                } else {
                                    i20 = i24;
                                    i11 = i10;
                                    i18 = i38;
                                    i21 = i26;
                                    unsafe = unsafe2;
                                    i19 = i22;
                                    i13 = i25;
                                    break;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i17 = i39;
                                i26 = i41;
                                i24 = i23;
                                i25 = i43;
                                if (i40 == 1) {
                                    unsafe2.putLong(t8, offset, ArrayDecoders.decodeFixed64(bArr2, i38));
                                    i32 = i38 + 8;
                                    i36 = i22 | i45;
                                    i31 = i10;
                                    i34 = i26;
                                    i35 = i25;
                                    i33 = i17;
                                    i37 = i24;
                                    bArr3 = bArr2;
                                } else {
                                    i20 = i24;
                                    i11 = i10;
                                    i18 = i38;
                                    i21 = i26;
                                    unsafe = unsafe2;
                                    i19 = i22;
                                    i13 = i25;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i17 = i39;
                                i26 = i41;
                                i24 = i23;
                                i25 = i43;
                                if (i40 == 5) {
                                    unsafe2.putInt(t10, offset, ArrayDecoders.decodeFixed32(bArr2, i38));
                                    i32 = i38 + 4;
                                    i36 = i22 | i45;
                                    i31 = i10;
                                    i34 = i26;
                                    i35 = i25;
                                    i33 = i17;
                                    i37 = i24;
                                    bArr3 = bArr2;
                                } else {
                                    i20 = i24;
                                    i11 = i10;
                                    i18 = i38;
                                    i21 = i26;
                                    unsafe = unsafe2;
                                    i19 = i22;
                                    i13 = i25;
                                    break;
                                }
                            case 7:
                                bArr2 = bArr;
                                i17 = i39;
                                i26 = i41;
                                i24 = i23;
                                i25 = i43;
                                if (i40 == 0) {
                                    i32 = ArrayDecoders.decodeVarint64(bArr2, i38, registers2);
                                    if (registers2.long1 != 0) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    UnsafeUtil.putBoolean(t10, offset, z8);
                                    i36 = i22 | i45;
                                    i31 = i10;
                                    i34 = i26;
                                    i35 = i25;
                                    i33 = i17;
                                    i37 = i24;
                                    bArr3 = bArr2;
                                } else {
                                    i20 = i24;
                                    i11 = i10;
                                    i18 = i38;
                                    i21 = i26;
                                    unsafe = unsafe2;
                                    i19 = i22;
                                    i13 = i25;
                                    break;
                                }
                            case 8:
                                bArr2 = bArr;
                                i17 = i39;
                                i26 = i41;
                                i24 = i23;
                                i25 = i43;
                                if (i40 == 2) {
                                    if ((ENFORCE_UTF8_MASK & i42) == 0) {
                                        i32 = ArrayDecoders.decodeString(bArr2, i38, registers2);
                                    } else {
                                        i32 = ArrayDecoders.decodeStringRequireUtf8(bArr2, i38, registers2);
                                    }
                                    unsafe2.putObject(t10, offset, registers2.object1);
                                    i36 = i22 | i45;
                                    i31 = i10;
                                    i34 = i26;
                                    i35 = i25;
                                    i33 = i17;
                                    i37 = i24;
                                    bArr3 = bArr2;
                                } else {
                                    i20 = i24;
                                    i11 = i10;
                                    i18 = i38;
                                    i21 = i26;
                                    unsafe = unsafe2;
                                    i19 = i22;
                                    i13 = i25;
                                    break;
                                }
                            case 9:
                                bArr2 = bArr;
                                i17 = i39;
                                i26 = i41;
                                i24 = i23;
                                i25 = i43;
                                if (i40 == 2) {
                                    Object mutableMessageFieldForMerge = messageSchema2.mutableMessageFieldForMerge(t10, i26);
                                    i32 = ArrayDecoders.mergeMessageField(mutableMessageFieldForMerge, messageSchema2.getMessageFieldSchema(i26), bArr, i38, i9, registers);
                                    messageSchema2.storeMessageField(t10, i26, mutableMessageFieldForMerge);
                                    i36 = i22 | i45;
                                    i31 = i10;
                                    i34 = i26;
                                    i35 = i25;
                                    i33 = i17;
                                    i37 = i24;
                                    bArr3 = bArr2;
                                } else {
                                    i20 = i24;
                                    i11 = i10;
                                    i18 = i38;
                                    i21 = i26;
                                    unsafe = unsafe2;
                                    i19 = i22;
                                    i13 = i25;
                                    break;
                                }
                            case 10:
                                bArr2 = bArr;
                                i17 = i39;
                                i26 = i41;
                                i24 = i23;
                                i25 = i43;
                                if (i40 == 2) {
                                    i32 = ArrayDecoders.decodeBytes(bArr2, i38, registers2);
                                    unsafe2.putObject(t10, offset, registers2.object1);
                                    i36 = i22 | i45;
                                    i31 = i10;
                                    i34 = i26;
                                    i35 = i25;
                                    i33 = i17;
                                    i37 = i24;
                                    bArr3 = bArr2;
                                } else {
                                    i20 = i24;
                                    i11 = i10;
                                    i18 = i38;
                                    i21 = i26;
                                    unsafe = unsafe2;
                                    i19 = i22;
                                    i13 = i25;
                                    break;
                                }
                            case 12:
                                bArr2 = bArr;
                                i17 = i39;
                                i26 = i41;
                                i24 = i23;
                                i25 = i43;
                                if (i40 == 0) {
                                    i32 = ArrayDecoders.decodeVarint32(bArr2, i38, registers2);
                                    int i47 = registers2.int1;
                                    Internal.EnumVerifier enumFieldVerifier = messageSchema2.getEnumFieldVerifier(i26);
                                    if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i47)) {
                                        getMutableUnknownFields(t8).storeField(i25, Long.valueOf(i47));
                                        i34 = i26;
                                        i36 = i22;
                                        i35 = i25;
                                        i33 = i17;
                                        i37 = i24;
                                        i31 = i10;
                                        bArr3 = bArr2;
                                    } else {
                                        unsafe2.putInt(t10, offset, i47);
                                        i36 = i22 | i45;
                                        i31 = i10;
                                        i34 = i26;
                                        i35 = i25;
                                        i33 = i17;
                                        i37 = i24;
                                        bArr3 = bArr2;
                                    }
                                } else {
                                    i20 = i24;
                                    i11 = i10;
                                    i18 = i38;
                                    i21 = i26;
                                    unsafe = unsafe2;
                                    i19 = i22;
                                    i13 = i25;
                                    break;
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i17 = i39;
                                i26 = i41;
                                i24 = i23;
                                i25 = i43;
                                if (i40 == 0) {
                                    i32 = ArrayDecoders.decodeVarint32(bArr2, i38, registers2);
                                    unsafe2.putInt(t10, offset, CodedInputStream.decodeZigZag32(registers2.int1));
                                    i36 = i22 | i45;
                                    i31 = i10;
                                    i34 = i26;
                                    i35 = i25;
                                    i33 = i17;
                                    i37 = i24;
                                    bArr3 = bArr2;
                                } else {
                                    i20 = i24;
                                    i11 = i10;
                                    i18 = i38;
                                    i21 = i26;
                                    unsafe = unsafe2;
                                    i19 = i22;
                                    i13 = i25;
                                    break;
                                }
                            case 16:
                                i17 = i39;
                                i26 = i41;
                                i24 = i23;
                                i25 = i43;
                                bArr2 = bArr;
                                if (i40 == 0) {
                                    decodeVarint64 = ArrayDecoders.decodeVarint64(bArr2, i38, registers2);
                                    unsafe2.putLong(t8, offset, CodedInputStream.decodeZigZag64(registers2.long1));
                                    i36 = i22 | i45;
                                    i31 = i10;
                                    i34 = i26;
                                    i32 = decodeVarint64;
                                    i35 = i25;
                                    i33 = i17;
                                    i37 = i24;
                                    bArr3 = bArr2;
                                } else {
                                    i20 = i24;
                                    i11 = i10;
                                    i18 = i38;
                                    i21 = i26;
                                    unsafe = unsafe2;
                                    i19 = i22;
                                    i13 = i25;
                                    break;
                                }
                            case 17:
                                if (i40 == 3) {
                                    Object mutableMessageFieldForMerge2 = messageSchema2.mutableMessageFieldForMerge(t10, i41);
                                    i32 = ArrayDecoders.mergeGroupField(mutableMessageFieldForMerge2, messageSchema2.getMessageFieldSchema(i41), bArr, i38, i9, (i39 << 3) | 4, registers);
                                    messageSchema2.storeMessageField(t10, i41, mutableMessageFieldForMerge2);
                                    i36 = i22 | i45;
                                    i37 = i23;
                                    i31 = i10;
                                    i34 = i41;
                                    i35 = i43;
                                    i33 = i39;
                                    bArr3 = bArr;
                                } else {
                                    i17 = i39;
                                    i24 = i23;
                                    i25 = i43;
                                    i26 = i41;
                                    i20 = i24;
                                    i11 = i10;
                                    i18 = i38;
                                    i21 = i26;
                                    unsafe = unsafe2;
                                    i19 = i22;
                                    i13 = i25;
                                    break;
                                }
                            default:
                                i17 = i39;
                                i26 = i41;
                                i24 = i23;
                                i25 = i43;
                                i20 = i24;
                                i11 = i10;
                                i18 = i38;
                                i21 = i26;
                                unsafe = unsafe2;
                                i19 = i22;
                                i13 = i25;
                                break;
                        }
                    } else {
                        i17 = i39;
                        i20 = i37;
                        i19 = i36;
                        if (type == 27) {
                            if (i40 == 2) {
                                Internal.ProtobufList protobufList = (Internal.ProtobufList) unsafe2.getObject(t10, offset);
                                if (!protobufList.isModifiable()) {
                                    int size = protobufList.size();
                                    if (size == 0) {
                                        i29 = 10;
                                    } else {
                                        i29 = size * 2;
                                    }
                                    protobufList = protobufList.mutableCopyWithCapacity2(i29);
                                    unsafe2.putObject(t10, offset, protobufList);
                                }
                                i32 = ArrayDecoders.decodeMessageList(messageSchema2.getMessageFieldSchema(i41), i43, bArr, i38, i9, protobufList, registers);
                                i34 = i41;
                                i35 = i43;
                                i37 = i20;
                                i36 = i19;
                                i33 = i17;
                                bArr3 = bArr;
                                i31 = i10;
                            } else {
                                i27 = i38;
                                unsafe = unsafe2;
                                i21 = i41;
                                i28 = i43;
                                i11 = i10;
                                i18 = i27;
                            }
                        } else if (type <= 49) {
                            int i48 = i38;
                            unsafe = unsafe2;
                            i21 = i41;
                            i28 = i43;
                            i32 = parseRepeatedField(t8, bArr, i38, i9, i43, i17, i40, i41, i42, type, offset, registers);
                            if (i32 != i48) {
                                messageSchema2 = this;
                                t10 = t8;
                                bArr3 = bArr;
                                i30 = i9;
                                i31 = i10;
                                registers2 = registers;
                                i37 = i20;
                                i36 = i19;
                                i34 = i21;
                                i35 = i28;
                                i33 = i17;
                                unsafe2 = unsafe;
                            } else {
                                i11 = i10;
                                i18 = i32;
                            }
                        } else {
                            i27 = i38;
                            unsafe = unsafe2;
                            i21 = i41;
                            i28 = i43;
                            if (type == 50) {
                                if (i40 == 2) {
                                    i32 = parseMapField(t8, bArr, i27, i9, i21, offset, registers);
                                    if (i32 != i27) {
                                        messageSchema2 = this;
                                        t10 = t8;
                                        bArr3 = bArr;
                                        i30 = i9;
                                        i31 = i10;
                                        registers2 = registers;
                                        i37 = i20;
                                        i36 = i19;
                                        i34 = i21;
                                        i35 = i28;
                                        i33 = i17;
                                        unsafe2 = unsafe;
                                    } else {
                                        i11 = i10;
                                        i18 = i32;
                                    }
                                } else {
                                    i11 = i10;
                                    i18 = i27;
                                }
                            } else {
                                i32 = parseOneofField(t8, bArr, i27, i9, i28, i17, i40, i42, type, offset, i21, registers);
                                if (i32 != i27) {
                                    messageSchema2 = this;
                                    t10 = t8;
                                    bArr3 = bArr;
                                    i30 = i9;
                                    i31 = i10;
                                    registers2 = registers;
                                    i37 = i20;
                                    i36 = i19;
                                    i34 = i21;
                                    i35 = i28;
                                    i33 = i17;
                                    unsafe2 = unsafe;
                                } else {
                                    i11 = i10;
                                    i18 = i32;
                                }
                            }
                        }
                        i13 = i28;
                    }
                }
                if (i13 == i11 && i11 != 0) {
                    i15 = 1048575;
                    messageSchema = this;
                    i12 = i18;
                    i14 = i20;
                    i36 = i19;
                } else {
                    if (this.hasExtensions && registers.extensionRegistry != ExtensionRegistryLite.getEmptyRegistry()) {
                        i32 = ArrayDecoders.decodeExtensionOrUnknownField(i13, bArr, i18, i9, t8, this.defaultInstance, this.unknownFieldSchema, registers);
                    } else {
                        i32 = ArrayDecoders.decodeUnknownField(i13, bArr, i18, i9, getMutableUnknownFields(t8), registers);
                    }
                    t10 = t8;
                    bArr3 = bArr;
                    i30 = i9;
                    i35 = i13;
                    messageSchema2 = this;
                    registers2 = registers;
                    i37 = i20;
                    i36 = i19;
                    i34 = i21;
                    i33 = i17;
                    unsafe2 = unsafe;
                    i31 = i11;
                }
            } else {
                int i49 = i37;
                unsafe = unsafe2;
                i11 = i31;
                messageSchema = messageSchema2;
                i12 = i32;
                i13 = i35;
                i14 = i49;
                i15 = 1048575;
            }
        }
        if (i14 != i15) {
            t9 = t8;
            unsafe.putInt(t9, i14, i36);
        } else {
            t9 = t8;
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i50 = messageSchema.checkInitializedCount; i50 < messageSchema.repeatedFieldOffsetStart; i50++) {
            unknownFieldSetLite = (UnknownFieldSetLite) filterMapUnknownEnumValues(t8, messageSchema.intArray[i50], unknownFieldSetLite, messageSchema.unknownFieldSchema, t8);
        }
        if (unknownFieldSetLite != null) {
            messageSchema.unknownFieldSchema.setBuilderToMessage(t9, unknownFieldSetLite);
        }
        if (i11 == 0) {
            if (i12 != i9) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (i12 > i9 || i13 != i11) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i12;
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void writeTo(T t8, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t8, writer);
        } else if (this.proto3) {
            writeFieldsInAscendingOrderProto3(t8, writer);
        } else {
            writeFieldsInAscendingOrderProto2(t8, writer);
        }
    }

    private boolean isFieldPresent(T t8, int i8) {
        int presenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i8);
        long j8 = 1048575 & presenceMaskAndOffsetAt;
        if (j8 != 1048575) {
            return (UnsafeUtil.getInt(t8, j8) & (1 << (presenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int typeAndOffsetAt = typeAndOffsetAt(i8);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.getDouble(t8, offset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.getFloat(t8, offset)) != 0;
            case 2:
                return UnsafeUtil.getLong(t8, offset) != 0;
            case 3:
                return UnsafeUtil.getLong(t8, offset) != 0;
            case 4:
                return UnsafeUtil.getInt(t8, offset) != 0;
            case 5:
                return UnsafeUtil.getLong(t8, offset) != 0;
            case 6:
                return UnsafeUtil.getInt(t8, offset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(t8, offset);
            case 8:
                Object object = UnsafeUtil.getObject(t8, offset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof ByteString) {
                    return !ByteString.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return UnsafeUtil.getObject(t8, offset) != null;
            case 10:
                return !ByteString.EMPTY.equals(UnsafeUtil.getObject(t8, offset));
            case 11:
                return UnsafeUtil.getInt(t8, offset) != 0;
            case 12:
                return UnsafeUtil.getInt(t8, offset) != 0;
            case 13:
                return UnsafeUtil.getInt(t8, offset) != 0;
            case 14:
                return UnsafeUtil.getLong(t8, offset) != 0;
            case 15:
                return UnsafeUtil.getInt(t8, offset) != 0;
            case 16:
                return UnsafeUtil.getLong(t8, offset) != 0;
            case 17:
                return UnsafeUtil.getObject(t8, offset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private int positionForFieldNumber(int i8, int i9) {
        if (i8 < this.minFieldNumber || i8 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i8, i9);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T t8, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        extensionRegistryLite.getClass();
        checkMutable(t8);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t8, reader, extensionRegistryLite);
    }

    private boolean equals(T t8, T t9, int i8) {
        int typeAndOffsetAt = typeAndOffsetAt(i8);
        long offset = offset(typeAndOffsetAt);
        switch (type(typeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(t8, t9, i8) && Double.doubleToLongBits(UnsafeUtil.getDouble(t8, offset)) == Double.doubleToLongBits(UnsafeUtil.getDouble(t9, offset));
            case 1:
                return arePresentForEquals(t8, t9, i8) && Float.floatToIntBits(UnsafeUtil.getFloat(t8, offset)) == Float.floatToIntBits(UnsafeUtil.getFloat(t9, offset));
            case 2:
                return arePresentForEquals(t8, t9, i8) && UnsafeUtil.getLong(t8, offset) == UnsafeUtil.getLong(t9, offset);
            case 3:
                return arePresentForEquals(t8, t9, i8) && UnsafeUtil.getLong(t8, offset) == UnsafeUtil.getLong(t9, offset);
            case 4:
                return arePresentForEquals(t8, t9, i8) && UnsafeUtil.getInt(t8, offset) == UnsafeUtil.getInt(t9, offset);
            case 5:
                return arePresentForEquals(t8, t9, i8) && UnsafeUtil.getLong(t8, offset) == UnsafeUtil.getLong(t9, offset);
            case 6:
                return arePresentForEquals(t8, t9, i8) && UnsafeUtil.getInt(t8, offset) == UnsafeUtil.getInt(t9, offset);
            case 7:
                return arePresentForEquals(t8, t9, i8) && UnsafeUtil.getBoolean(t8, offset) == UnsafeUtil.getBoolean(t9, offset);
            case 8:
                return arePresentForEquals(t8, t9, i8) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t8, offset), UnsafeUtil.getObject(t9, offset));
            case 9:
                return arePresentForEquals(t8, t9, i8) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t8, offset), UnsafeUtil.getObject(t9, offset));
            case 10:
                return arePresentForEquals(t8, t9, i8) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t8, offset), UnsafeUtil.getObject(t9, offset));
            case 11:
                return arePresentForEquals(t8, t9, i8) && UnsafeUtil.getInt(t8, offset) == UnsafeUtil.getInt(t9, offset);
            case 12:
                return arePresentForEquals(t8, t9, i8) && UnsafeUtil.getInt(t8, offset) == UnsafeUtil.getInt(t9, offset);
            case 13:
                return arePresentForEquals(t8, t9, i8) && UnsafeUtil.getInt(t8, offset) == UnsafeUtil.getInt(t9, offset);
            case 14:
                return arePresentForEquals(t8, t9, i8) && UnsafeUtil.getLong(t8, offset) == UnsafeUtil.getLong(t9, offset);
            case 15:
                return arePresentForEquals(t8, t9, i8) && UnsafeUtil.getInt(t8, offset) == UnsafeUtil.getInt(t9, offset);
            case 16:
                return arePresentForEquals(t8, t9, i8) && UnsafeUtil.getLong(t8, offset) == UnsafeUtil.getLong(t9, offset);
            case 17:
                return arePresentForEquals(t8, t9, i8) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t8, offset), UnsafeUtil.getObject(t9, offset));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t8, offset), UnsafeUtil.getObject(t9, offset));
            case 50:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t8, offset), UnsafeUtil.getObject(t9, offset));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return isOneofCaseEqual(t8, t9, i8) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t8, offset), UnsafeUtil.getObject(t9, offset));
            default:
                return true;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T t8, byte[] bArr, int i8, int i9, ArrayDecoders.Registers registers) throws IOException {
        if (this.proto3) {
            parseProto3Message(t8, bArr, i8, i9, registers);
        } else {
            parseProto2Message(t8, bArr, i8, i9, 0, registers);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i8, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i8)));
    }
}
