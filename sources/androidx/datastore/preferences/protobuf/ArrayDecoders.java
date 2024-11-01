package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.WireFormat;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@CheckReturnValue
/* loaded from: classes3.dex */
public final class ArrayDecoders {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.ArrayDecoders$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    private ArrayDecoders() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeBoolList(int i8, byte[] bArr, int i9, int i10, Internal.ProtobufList<?> protobufList, Registers registers) {
        boolean z8;
        boolean z9;
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int decodeVarint64 = decodeVarint64(bArr, i9, registers);
        if (registers.long1 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        booleanArrayList.addBoolean(z8);
        while (decodeVarint64 < i10) {
            int decodeVarint32 = decodeVarint32(bArr, decodeVarint64, registers);
            if (i8 != registers.int1) {
                break;
            }
            decodeVarint64 = decodeVarint64(bArr, decodeVarint32, registers);
            if (registers.long1 != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            booleanArrayList.addBoolean(z9);
        }
        return decodeVarint64;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeBytes(byte[] bArr, int i8, Registers registers) throws InvalidProtocolBufferException {
        int decodeVarint32 = decodeVarint32(bArr, i8, registers);
        int i9 = registers.int1;
        if (i9 >= 0) {
            if (i9 <= bArr.length - decodeVarint32) {
                if (i9 == 0) {
                    registers.object1 = ByteString.EMPTY;
                    return decodeVarint32;
                }
                registers.object1 = ByteString.copyFrom(bArr, decodeVarint32, i9);
                return decodeVarint32 + i9;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeBytesList(int i8, byte[] bArr, int i9, int i10, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int decodeVarint32 = decodeVarint32(bArr, i9, registers);
        int i11 = registers.int1;
        if (i11 >= 0) {
            if (i11 <= bArr.length - decodeVarint32) {
                if (i11 == 0) {
                    protobufList.add(ByteString.EMPTY);
                } else {
                    protobufList.add(ByteString.copyFrom(bArr, decodeVarint32, i11));
                    decodeVarint32 += i11;
                }
                while (decodeVarint32 < i10) {
                    int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, registers);
                    if (i8 != registers.int1) {
                        break;
                    }
                    decodeVarint32 = decodeVarint32(bArr, decodeVarint322, registers);
                    int i12 = registers.int1;
                    if (i12 >= 0) {
                        if (i12 <= bArr.length - decodeVarint32) {
                            if (i12 == 0) {
                                protobufList.add(ByteString.EMPTY);
                            } else {
                                protobufList.add(ByteString.copyFrom(bArr, decodeVarint32, i12));
                                decodeVarint32 += i12;
                            }
                        } else {
                            throw InvalidProtocolBufferException.truncatedMessage();
                        }
                    } else {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                }
                return decodeVarint32;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double decodeDouble(byte[] bArr, int i8) {
        return Double.longBitsToDouble(decodeFixed64(bArr, i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeDoubleList(int i8, byte[] bArr, int i9, int i10, Internal.ProtobufList<?> protobufList, Registers registers) {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        doubleArrayList.addDouble(decodeDouble(bArr, i9));
        int i11 = i9 + 8;
        while (i11 < i10) {
            int decodeVarint32 = decodeVarint32(bArr, i11, registers);
            if (i8 != registers.int1) {
                break;
            }
            doubleArrayList.addDouble(decodeDouble(bArr, decodeVarint32));
            i11 = decodeVarint32 + 8;
        }
        return i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0122. Please report as an issue. */
    static int decodeExtension(int i8, byte[] bArr, int i9, int i10, GeneratedMessageLite.ExtendableMessage<?, ?> extendableMessage, GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension, UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> unknownFieldSchema, Registers registers) throws IOException {
        boolean z8;
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet = extendableMessage.extensions;
        int i11 = i8 >>> 3;
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    DoubleArrayList doubleArrayList = new DoubleArrayList();
                    int decodePackedDoubleList = decodePackedDoubleList(bArr, i9, doubleArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, doubleArrayList);
                    return decodePackedDoubleList;
                case 2:
                    FloatArrayList floatArrayList = new FloatArrayList();
                    int decodePackedFloatList = decodePackedFloatList(bArr, i9, floatArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, floatArrayList);
                    return decodePackedFloatList;
                case 3:
                case 4:
                    LongArrayList longArrayList = new LongArrayList();
                    int decodePackedVarint64List = decodePackedVarint64List(bArr, i9, longArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList);
                    return decodePackedVarint64List;
                case 5:
                case 6:
                    IntArrayList intArrayList = new IntArrayList();
                    int decodePackedVarint32List = decodePackedVarint32List(bArr, i9, intArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList);
                    return decodePackedVarint32List;
                case 7:
                case 8:
                    LongArrayList longArrayList2 = new LongArrayList();
                    int decodePackedFixed64List = decodePackedFixed64List(bArr, i9, longArrayList2, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList2);
                    return decodePackedFixed64List;
                case 9:
                case 10:
                    IntArrayList intArrayList2 = new IntArrayList();
                    int decodePackedFixed32List = decodePackedFixed32List(bArr, i9, intArrayList2, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList2);
                    return decodePackedFixed32List;
                case 11:
                    BooleanArrayList booleanArrayList = new BooleanArrayList();
                    int decodePackedBoolList = decodePackedBoolList(bArr, i9, booleanArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, booleanArrayList);
                    return decodePackedBoolList;
                case 12:
                    IntArrayList intArrayList3 = new IntArrayList();
                    int decodePackedSInt32List = decodePackedSInt32List(bArr, i9, intArrayList3, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList3);
                    return decodePackedSInt32List;
                case 13:
                    LongArrayList longArrayList3 = new LongArrayList();
                    int decodePackedSInt64List = decodePackedSInt64List(bArr, i9, longArrayList3, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList3);
                    return decodePackedSInt64List;
                case 14:
                    IntArrayList intArrayList4 = new IntArrayList();
                    int decodePackedVarint32List2 = decodePackedVarint32List(bArr, i9, intArrayList4, registers);
                    SchemaUtil.filterUnknownEnumList((Object) extendableMessage, i11, (List<Integer>) intArrayList4, generatedExtension.descriptor.getEnumType(), (Object) null, (UnknownFieldSchema<UT, Object>) unknownFieldSchema);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList4);
                    return decodePackedVarint32List2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
        }
        Object obj = null;
        if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
            i9 = decodeVarint32(bArr, i9, registers);
            if (generatedExtension.descriptor.getEnumType().findValueByNumber(registers.int1) == null) {
                SchemaUtil.storeUnknownEnum(extendableMessage, i11, registers.int1, null, unknownFieldSchema);
                return i9;
            }
            obj = Integer.valueOf(registers.int1);
        } else {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    obj = Double.valueOf(decodeDouble(bArr, i9));
                    i9 += 8;
                    break;
                case 2:
                    obj = Float.valueOf(decodeFloat(bArr, i9));
                    i9 += 4;
                    break;
                case 3:
                case 4:
                    i9 = decodeVarint64(bArr, i9, registers);
                    obj = Long.valueOf(registers.long1);
                    break;
                case 5:
                case 6:
                    i9 = decodeVarint32(bArr, i9, registers);
                    obj = Integer.valueOf(registers.int1);
                    break;
                case 7:
                case 8:
                    obj = Long.valueOf(decodeFixed64(bArr, i9));
                    i9 += 8;
                    break;
                case 9:
                case 10:
                    obj = Integer.valueOf(decodeFixed32(bArr, i9));
                    i9 += 4;
                    break;
                case 11:
                    i9 = decodeVarint64(bArr, i9, registers);
                    if (registers.long1 != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    obj = Boolean.valueOf(z8);
                    break;
                case 12:
                    i9 = decodeVarint32(bArr, i9, registers);
                    obj = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                    break;
                case 13:
                    i9 = decodeVarint64(bArr, i9, registers);
                    obj = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i9 = decodeBytes(bArr, i9, registers);
                    obj = registers.object1;
                    break;
                case 16:
                    i9 = decodeString(bArr, i9, registers);
                    obj = registers.object1;
                    break;
                case 17:
                    int i12 = (i11 << 3) | 4;
                    Schema schemaFor = Protobuf.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int decodeGroupField = decodeGroupField(schemaFor, bArr, i9, i10, i12, registers);
                        fieldSet.addRepeatedField(generatedExtension.descriptor, registers.object1);
                        return decodeGroupField;
                    }
                    Object field = fieldSet.getField(generatedExtension.descriptor);
                    if (field == null) {
                        field = schemaFor.newInstance();
                        fieldSet.setField(generatedExtension.descriptor, field);
                    }
                    return mergeGroupField(field, schemaFor, bArr, i9, i10, i12, registers);
                case 18:
                    Schema schemaFor2 = Protobuf.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int decodeMessageField = decodeMessageField(schemaFor2, bArr, i9, i10, registers);
                        fieldSet.addRepeatedField(generatedExtension.descriptor, registers.object1);
                        return decodeMessageField;
                    }
                    Object field2 = fieldSet.getField(generatedExtension.descriptor);
                    if (field2 == null) {
                        field2 = schemaFor2.newInstance();
                        fieldSet.setField(generatedExtension.descriptor, field2);
                    }
                    return mergeMessageField(field2, schemaFor2, bArr, i9, i10, registers);
            }
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.addRepeatedField(generatedExtension.descriptor, obj);
        } else {
            fieldSet.setField(generatedExtension.descriptor, obj);
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeExtensionOrUnknownField(int i8, byte[] bArr, int i9, int i10, Object obj, MessageLite messageLite, UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> unknownFieldSchema, Registers registers) throws IOException {
        GeneratedMessageLite.GeneratedExtension findLiteExtensionByNumber = registers.extensionRegistry.findLiteExtensionByNumber(messageLite, i8 >>> 3);
        if (findLiteExtensionByNumber == null) {
            return decodeUnknownField(i8, bArr, i9, i10, MessageSchema.getMutableUnknownFields(obj), registers);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.ensureExtensionsAreMutable();
        return decodeExtension(i8, bArr, i9, i10, extendableMessage, findLiteExtensionByNumber, unknownFieldSchema, registers);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeFixed32(byte[] bArr, int i8) {
        return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeFixed32List(int i8, byte[] bArr, int i9, int i10, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        intArrayList.addInt(decodeFixed32(bArr, i9));
        int i11 = i9 + 4;
        while (i11 < i10) {
            int decodeVarint32 = decodeVarint32(bArr, i11, registers);
            if (i8 != registers.int1) {
                break;
            }
            intArrayList.addInt(decodeFixed32(bArr, decodeVarint32));
            i11 = decodeVarint32 + 4;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long decodeFixed64(byte[] bArr, int i8) {
        return ((bArr[i8 + 7] & 255) << 56) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16) | ((bArr[i8 + 3] & 255) << 24) | ((bArr[i8 + 4] & 255) << 32) | ((bArr[i8 + 5] & 255) << 40) | ((bArr[i8 + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeFixed64List(int i8, byte[] bArr, int i9, int i10, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        longArrayList.addLong(decodeFixed64(bArr, i9));
        int i11 = i9 + 8;
        while (i11 < i10) {
            int decodeVarint32 = decodeVarint32(bArr, i11, registers);
            if (i8 != registers.int1) {
                break;
            }
            longArrayList.addLong(decodeFixed64(bArr, decodeVarint32));
            i11 = decodeVarint32 + 8;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float decodeFloat(byte[] bArr, int i8) {
        return Float.intBitsToFloat(decodeFixed32(bArr, i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeFloatList(int i8, byte[] bArr, int i9, int i10, Internal.ProtobufList<?> protobufList, Registers registers) {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        floatArrayList.addFloat(decodeFloat(bArr, i9));
        int i11 = i9 + 4;
        while (i11 < i10) {
            int decodeVarint32 = decodeVarint32(bArr, i11, registers);
            if (i8 != registers.int1) {
                break;
            }
            floatArrayList.addFloat(decodeFloat(bArr, decodeVarint32));
            i11 = decodeVarint32 + 4;
        }
        return i11;
    }

    static int decodeGroupField(Schema schema, byte[] bArr, int i8, int i9, int i10, Registers registers) throws IOException {
        Object newInstance = schema.newInstance();
        int mergeGroupField = mergeGroupField(newInstance, schema, bArr, i8, i9, i10, registers);
        schema.makeImmutable(newInstance);
        registers.object1 = newInstance;
        return mergeGroupField;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeGroupList(Schema schema, int i8, byte[] bArr, int i9, int i10, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        int i11 = (i8 & (-8)) | 4;
        int decodeGroupField = decodeGroupField(schema, bArr, i9, i10, i11, registers);
        protobufList.add(registers.object1);
        while (decodeGroupField < i10) {
            int decodeVarint32 = decodeVarint32(bArr, decodeGroupField, registers);
            if (i8 != registers.int1) {
                break;
            }
            decodeGroupField = decodeGroupField(schema, bArr, decodeVarint32, i10, i11, registers);
            protobufList.add(registers.object1);
        }
        return decodeGroupField;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeMessageField(Schema schema, byte[] bArr, int i8, int i9, Registers registers) throws IOException {
        Object newInstance = schema.newInstance();
        int mergeMessageField = mergeMessageField(newInstance, schema, bArr, i8, i9, registers);
        schema.makeImmutable(newInstance);
        registers.object1 = newInstance;
        return mergeMessageField;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeMessageList(Schema<?> schema, int i8, byte[] bArr, int i9, int i10, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        int decodeMessageField = decodeMessageField(schema, bArr, i9, i10, registers);
        protobufList.add(registers.object1);
        while (decodeMessageField < i10) {
            int decodeVarint32 = decodeVarint32(bArr, decodeMessageField, registers);
            if (i8 != registers.int1) {
                break;
            }
            decodeMessageField = decodeMessageField(schema, bArr, decodeVarint32, i10, registers);
            protobufList.add(registers.object1);
        }
        return decodeMessageField;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodePackedBoolList(byte[] bArr, int i8, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        boolean z8;
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i8, registers);
        int i9 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i9) {
            decodeVarint32 = decodeVarint64(bArr, decodeVarint32, registers);
            if (registers.long1 != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            booleanArrayList.addBoolean(z8);
        }
        if (decodeVarint32 == i9) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodePackedDoubleList(byte[] bArr, int i8, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i8, registers);
        int i9 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i9) {
            doubleArrayList.addDouble(decodeDouble(bArr, decodeVarint32));
            decodeVarint32 += 8;
        }
        if (decodeVarint32 == i9) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodePackedFixed32List(byte[] bArr, int i8, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i8, registers);
        int i9 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i9) {
            intArrayList.addInt(decodeFixed32(bArr, decodeVarint32));
            decodeVarint32 += 4;
        }
        if (decodeVarint32 == i9) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodePackedFixed64List(byte[] bArr, int i8, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i8, registers);
        int i9 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i9) {
            longArrayList.addLong(decodeFixed64(bArr, decodeVarint32));
            decodeVarint32 += 8;
        }
        if (decodeVarint32 == i9) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodePackedFloatList(byte[] bArr, int i8, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i8, registers);
        int i9 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i9) {
            floatArrayList.addFloat(decodeFloat(bArr, decodeVarint32));
            decodeVarint32 += 4;
        }
        if (decodeVarint32 == i9) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodePackedSInt32List(byte[] bArr, int i8, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i8, registers);
        int i9 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i9) {
            decodeVarint32 = decodeVarint32(bArr, decodeVarint32, registers);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        }
        if (decodeVarint32 == i9) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodePackedSInt64List(byte[] bArr, int i8, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i8, registers);
        int i9 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i9) {
            decodeVarint32 = decodeVarint64(bArr, decodeVarint32, registers);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        }
        if (decodeVarint32 == i9) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodePackedVarint32List(byte[] bArr, int i8, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i8, registers);
        int i9 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i9) {
            decodeVarint32 = decodeVarint32(bArr, decodeVarint32, registers);
            intArrayList.addInt(registers.int1);
        }
        if (decodeVarint32 == i9) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodePackedVarint64List(byte[] bArr, int i8, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i8, registers);
        int i9 = registers.int1 + decodeVarint32;
        while (decodeVarint32 < i9) {
            decodeVarint32 = decodeVarint64(bArr, decodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        if (decodeVarint32 == i9) {
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeSInt32List(int i8, byte[] bArr, int i9, int i10, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i9, registers);
        intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        while (decodeVarint32 < i10) {
            int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, registers);
            if (i8 != registers.int1) {
                break;
            }
            decodeVarint32 = decodeVarint32(bArr, decodeVarint322, registers);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        }
        return decodeVarint32;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeSInt64List(int i8, byte[] bArr, int i9, int i10, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int decodeVarint64 = decodeVarint64(bArr, i9, registers);
        longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        while (decodeVarint64 < i10) {
            int decodeVarint32 = decodeVarint32(bArr, decodeVarint64, registers);
            if (i8 != registers.int1) {
                break;
            }
            decodeVarint64 = decodeVarint64(bArr, decodeVarint32, registers);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        }
        return decodeVarint64;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeString(byte[] bArr, int i8, Registers registers) throws InvalidProtocolBufferException {
        int decodeVarint32 = decodeVarint32(bArr, i8, registers);
        int i9 = registers.int1;
        if (i9 >= 0) {
            if (i9 == 0) {
                registers.object1 = "";
                return decodeVarint32;
            }
            registers.object1 = new String(bArr, decodeVarint32, i9, Internal.UTF_8);
            return decodeVarint32 + i9;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeStringList(int i8, byte[] bArr, int i9, int i10, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int decodeVarint32 = decodeVarint32(bArr, i9, registers);
        int i11 = registers.int1;
        if (i11 >= 0) {
            if (i11 == 0) {
                protobufList.add("");
            } else {
                protobufList.add(new String(bArr, decodeVarint32, i11, Internal.UTF_8));
                decodeVarint32 += i11;
            }
            while (decodeVarint32 < i10) {
                int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, registers);
                if (i8 != registers.int1) {
                    break;
                }
                decodeVarint32 = decodeVarint32(bArr, decodeVarint322, registers);
                int i12 = registers.int1;
                if (i12 >= 0) {
                    if (i12 == 0) {
                        protobufList.add("");
                    } else {
                        protobufList.add(new String(bArr, decodeVarint32, i12, Internal.UTF_8));
                        decodeVarint32 += i12;
                    }
                } else {
                    throw InvalidProtocolBufferException.negativeSize();
                }
            }
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeStringListRequireUtf8(int i8, byte[] bArr, int i9, int i10, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int decodeVarint32 = decodeVarint32(bArr, i9, registers);
        int i11 = registers.int1;
        if (i11 >= 0) {
            if (i11 == 0) {
                protobufList.add("");
            } else {
                int i12 = decodeVarint32 + i11;
                if (Utf8.isValidUtf8(bArr, decodeVarint32, i12)) {
                    protobufList.add(new String(bArr, decodeVarint32, i11, Internal.UTF_8));
                    decodeVarint32 = i12;
                } else {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
            }
            while (decodeVarint32 < i10) {
                int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, registers);
                if (i8 != registers.int1) {
                    break;
                }
                decodeVarint32 = decodeVarint32(bArr, decodeVarint322, registers);
                int i13 = registers.int1;
                if (i13 >= 0) {
                    if (i13 == 0) {
                        protobufList.add("");
                    } else {
                        int i14 = decodeVarint32 + i13;
                        if (Utf8.isValidUtf8(bArr, decodeVarint32, i14)) {
                            protobufList.add(new String(bArr, decodeVarint32, i13, Internal.UTF_8));
                            decodeVarint32 = i14;
                        } else {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    }
                } else {
                    throw InvalidProtocolBufferException.negativeSize();
                }
            }
            return decodeVarint32;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeStringRequireUtf8(byte[] bArr, int i8, Registers registers) throws InvalidProtocolBufferException {
        int decodeVarint32 = decodeVarint32(bArr, i8, registers);
        int i9 = registers.int1;
        if (i9 >= 0) {
            if (i9 == 0) {
                registers.object1 = "";
                return decodeVarint32;
            }
            registers.object1 = Utf8.decodeUtf8(bArr, decodeVarint32, i9);
            return decodeVarint32 + i9;
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeUnknownField(int i8, byte[] bArr, int i9, int i10, UnknownFieldSetLite unknownFieldSetLite, Registers registers) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i8) != 0) {
            int tagWireType = WireFormat.getTagWireType(i8);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                unknownFieldSetLite.storeField(i8, Integer.valueOf(decodeFixed32(bArr, i9)));
                                return i9 + 4;
                            }
                            throw InvalidProtocolBufferException.invalidTag();
                        }
                        UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
                        int i11 = (i8 & (-8)) | 4;
                        int i12 = 0;
                        while (true) {
                            if (i9 >= i10) {
                                break;
                            }
                            int decodeVarint32 = decodeVarint32(bArr, i9, registers);
                            int i13 = registers.int1;
                            if (i13 == i11) {
                                i12 = i13;
                                i9 = decodeVarint32;
                                break;
                            }
                            i12 = i13;
                            i9 = decodeUnknownField(i13, bArr, decodeVarint32, i10, newInstance, registers);
                        }
                        if (i9 <= i10 && i12 == i11) {
                            unknownFieldSetLite.storeField(i8, newInstance);
                            return i9;
                        }
                        throw InvalidProtocolBufferException.parseFailure();
                    }
                    int decodeVarint322 = decodeVarint32(bArr, i9, registers);
                    int i14 = registers.int1;
                    if (i14 >= 0) {
                        if (i14 <= bArr.length - decodeVarint322) {
                            if (i14 == 0) {
                                unknownFieldSetLite.storeField(i8, ByteString.EMPTY);
                            } else {
                                unknownFieldSetLite.storeField(i8, ByteString.copyFrom(bArr, decodeVarint322, i14));
                            }
                            return decodeVarint322 + i14;
                        }
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    throw InvalidProtocolBufferException.negativeSize();
                }
                unknownFieldSetLite.storeField(i8, Long.valueOf(decodeFixed64(bArr, i9)));
                return i9 + 8;
            }
            int decodeVarint64 = decodeVarint64(bArr, i9, registers);
            unknownFieldSetLite.storeField(i8, Long.valueOf(registers.long1));
            return decodeVarint64;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeVarint32(byte[] bArr, int i8, Registers registers) {
        int i9 = i8 + 1;
        byte b9 = bArr[i8];
        if (b9 >= 0) {
            registers.int1 = b9;
            return i9;
        }
        return decodeVarint32(b9, bArr, i9, registers);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeVarint32List(int i8, byte[] bArr, int i9, int i10, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int decodeVarint32 = decodeVarint32(bArr, i9, registers);
        intArrayList.addInt(registers.int1);
        while (decodeVarint32 < i10) {
            int decodeVarint322 = decodeVarint32(bArr, decodeVarint32, registers);
            if (i8 != registers.int1) {
                break;
            }
            decodeVarint32 = decodeVarint32(bArr, decodeVarint322, registers);
            intArrayList.addInt(registers.int1);
        }
        return decodeVarint32;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeVarint64(byte[] bArr, int i8, Registers registers) {
        int i9 = i8 + 1;
        long j8 = bArr[i8];
        if (j8 >= 0) {
            registers.long1 = j8;
            return i9;
        }
        return decodeVarint64(j8, bArr, i9, registers);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeVarint64List(int i8, byte[] bArr, int i9, int i10, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int decodeVarint64 = decodeVarint64(bArr, i9, registers);
        longArrayList.addLong(registers.long1);
        while (decodeVarint64 < i10) {
            int decodeVarint32 = decodeVarint32(bArr, decodeVarint64, registers);
            if (i8 != registers.int1) {
                break;
            }
            decodeVarint64 = decodeVarint64(bArr, decodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        return decodeVarint64;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int mergeGroupField(Object obj, Schema schema, byte[] bArr, int i8, int i9, int i10, Registers registers) throws IOException {
        int parseProto2Message = ((MessageSchema) schema).parseProto2Message(obj, bArr, i8, i9, i10, registers);
        registers.object1 = obj;
        return parseProto2Message;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int mergeMessageField(Object obj, Schema schema, byte[] bArr, int i8, int i9, Registers registers) throws IOException {
        int i10 = i8 + 1;
        int i11 = bArr[i8];
        if (i11 < 0) {
            i10 = decodeVarint32(i11, bArr, i10, registers);
            i11 = registers.int1;
        }
        int i12 = i10;
        if (i11 >= 0 && i11 <= i9 - i12) {
            int i13 = i11 + i12;
            schema.mergeFrom(obj, bArr, i12, i13, registers);
            registers.object1 = obj;
            return i13;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int skipField(int i8, byte[] bArr, int i9, int i10, Registers registers) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i8) != 0) {
            int tagWireType = WireFormat.getTagWireType(i8);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                return i9 + 4;
                            }
                            throw InvalidProtocolBufferException.invalidTag();
                        }
                        int i11 = (i8 & (-8)) | 4;
                        int i12 = 0;
                        while (i9 < i10) {
                            i9 = decodeVarint32(bArr, i9, registers);
                            i12 = registers.int1;
                            if (i12 == i11) {
                                break;
                            }
                            i9 = skipField(i12, bArr, i9, i10, registers);
                        }
                        if (i9 <= i10 && i12 == i11) {
                            return i9;
                        }
                        throw InvalidProtocolBufferException.parseFailure();
                    }
                    return decodeVarint32(bArr, i9, registers) + registers.int1;
                }
                return i9 + 8;
            }
            return decodeVarint64(bArr, i9, registers);
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class Registers {
        public final ExtensionRegistryLite extensionRegistry;
        public int int1;
        public long long1;
        public Object object1;

        Registers() {
            this.extensionRegistry = ExtensionRegistryLite.getEmptyRegistry();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Registers(ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            this.extensionRegistry = extensionRegistryLite;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int decodeVarint32(int i8, byte[] bArr, int i9, Registers registers) {
        int i10 = i8 & ModuleDescriptor.MODULE_VERSION;
        int i11 = i9 + 1;
        byte b9 = bArr[i9];
        if (b9 >= 0) {
            registers.int1 = i10 | (b9 << 7);
            return i11;
        }
        int i12 = i10 | ((b9 & Byte.MAX_VALUE) << 7);
        int i13 = i9 + 2;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            registers.int1 = i12 | (b10 << 14);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 14);
        int i15 = i9 + 3;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            registers.int1 = i14 | (b11 << 21);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 21);
        int i17 = i9 + 4;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            registers.int1 = i16 | (b12 << 28);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i19 = i17 + 1;
            if (bArr[i17] >= 0) {
                registers.int1 = i18;
                return i19;
            }
            i17 = i19;
        }
    }

    static int decodeVarint64(long j8, byte[] bArr, int i8, Registers registers) {
        int i9 = i8 + 1;
        byte b9 = bArr[i8];
        long j9 = (j8 & 127) | ((b9 & Byte.MAX_VALUE) << 7);
        int i10 = 7;
        while (b9 < 0) {
            int i11 = i9 + 1;
            byte b10 = bArr[i9];
            i10 += 7;
            j9 |= (b10 & Byte.MAX_VALUE) << i10;
            i9 = i11;
            b9 = b10;
        }
        registers.long1 = j9;
        return i9;
    }
}
