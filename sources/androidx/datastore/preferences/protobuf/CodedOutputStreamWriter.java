package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
@CheckReturnValue
/* loaded from: classes3.dex */
public final class CodedOutputStreamWriter implements Writer {
    private final CodedOutputStream output;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStreamWriter$1, reason: invalid class name */
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 5;
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private CodedOutputStreamWriter(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.checkNotNull(codedOutputStream, "output");
        this.output = codedOutputStream2;
        codedOutputStream2.wrapper = this;
    }

    public static CodedOutputStreamWriter forCodedOutput(CodedOutputStream codedOutputStream) {
        CodedOutputStreamWriter codedOutputStreamWriter = codedOutputStream.wrapper;
        if (codedOutputStreamWriter != null) {
            return codedOutputStreamWriter;
        }
        return new CodedOutputStreamWriter(codedOutputStream);
    }

    private <V> void writeDeterministicBooleanMapEntry(int i8, boolean z8, V v8, MapEntryLite.Metadata<Boolean, V> metadata) throws IOException {
        this.output.writeTag(i8, 2);
        this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Boolean.valueOf(z8), v8));
        MapEntryLite.writeTo(this.output, metadata, Boolean.valueOf(z8), v8);
    }

    private <V> void writeDeterministicIntegerMap(int i8, MapEntryLite.Metadata<Integer, V> metadata, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i9 = 0;
        while (it.hasNext()) {
            iArr[i9] = it.next().intValue();
            i9++;
        }
        Arrays.sort(iArr);
        for (int i10 = 0; i10 < size; i10++) {
            int i11 = iArr[i10];
            V v8 = map.get(Integer.valueOf(i11));
            this.output.writeTag(i8, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Integer.valueOf(i11), v8));
            MapEntryLite.writeTo(this.output, metadata, Integer.valueOf(i11), v8);
        }
    }

    private <V> void writeDeterministicLongMap(int i8, MapEntryLite.Metadata<Long, V> metadata, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i9 = 0;
        while (it.hasNext()) {
            jArr[i9] = it.next().longValue();
            i9++;
        }
        Arrays.sort(jArr);
        for (int i10 = 0; i10 < size; i10++) {
            long j8 = jArr[i10];
            V v8 = map.get(Long.valueOf(j8));
            this.output.writeTag(i8, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Long.valueOf(j8), v8));
            MapEntryLite.writeTo(this.output, metadata, Long.valueOf(j8), v8);
        }
    }

    private <K, V> void writeDeterministicMap(int i8, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[metadata.keyType.ordinal()]) {
            case 1:
                V v8 = map.get(Boolean.FALSE);
                if (v8 != null) {
                    writeDeterministicBooleanMapEntry(i8, false, v8, metadata);
                }
                V v9 = map.get(Boolean.TRUE);
                if (v9 != null) {
                    writeDeterministicBooleanMapEntry(i8, true, v9, metadata);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                writeDeterministicIntegerMap(i8, metadata, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                writeDeterministicLongMap(i8, metadata, map);
                return;
            case 12:
                writeDeterministicStringMap(i8, metadata, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + metadata.keyType);
        }
    }

    private <V> void writeDeterministicStringMap(int i8, MapEntryLite.Metadata<String, V> metadata, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i9 = 0;
        while (it.hasNext()) {
            strArr[i9] = it.next();
            i9++;
        }
        Arrays.sort(strArr);
        for (int i10 = 0; i10 < size; i10++) {
            String str = strArr[i10];
            V v8 = map.get(str);
            this.output.writeTag(i8, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, str, v8));
            MapEntryLite.writeTo(this.output, metadata, str, v8);
        }
    }

    private void writeLazyString(int i8, Object obj) throws IOException {
        if (obj instanceof String) {
            this.output.writeString(i8, (String) obj);
        } else {
            this.output.writeBytes(i8, (ByteString) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.ASCENDING;
    }

    public int getTotalBytesWritten() {
        return this.output.getTotalBytesWritten();
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBool(int i8, boolean z8) throws IOException {
        this.output.writeBool(i8, z8);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBoolList(int i8, List<Boolean> list, boolean z8) throws IOException {
        int i9 = 0;
        if (z8) {
            this.output.writeTag(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += CodedOutputStream.computeBoolSizeNoTag(list.get(i11).booleanValue());
            }
            this.output.writeUInt32NoTag(i10);
            while (i9 < list.size()) {
                this.output.writeBoolNoTag(list.get(i9).booleanValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.output.writeBool(i8, list.get(i9).booleanValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBytes(int i8, ByteString byteString) throws IOException {
        this.output.writeBytes(i8, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBytesList(int i8, List<ByteString> list) throws IOException {
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.output.writeBytes(i8, list.get(i9));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeDouble(int i8, double d8) throws IOException {
        this.output.writeDouble(i8, d8);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeDoubleList(int i8, List<Double> list, boolean z8) throws IOException {
        int i9 = 0;
        if (z8) {
            this.output.writeTag(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += CodedOutputStream.computeDoubleSizeNoTag(list.get(i11).doubleValue());
            }
            this.output.writeUInt32NoTag(i10);
            while (i9 < list.size()) {
                this.output.writeDoubleNoTag(list.get(i9).doubleValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.output.writeDouble(i8, list.get(i9).doubleValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public void writeEndGroup(int i8) throws IOException {
        this.output.writeTag(i8, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeEnum(int i8, int i9) throws IOException {
        this.output.writeEnum(i8, i9);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeEnumList(int i8, List<Integer> list, boolean z8) throws IOException {
        int i9 = 0;
        if (z8) {
            this.output.writeTag(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += CodedOutputStream.computeEnumSizeNoTag(list.get(i11).intValue());
            }
            this.output.writeUInt32NoTag(i10);
            while (i9 < list.size()) {
                this.output.writeEnumNoTag(list.get(i9).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.output.writeEnum(i8, list.get(i9).intValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed32(int i8, int i9) throws IOException {
        this.output.writeFixed32(i8, i9);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed32List(int i8, List<Integer> list, boolean z8) throws IOException {
        int i9 = 0;
        if (z8) {
            this.output.writeTag(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += CodedOutputStream.computeFixed32SizeNoTag(list.get(i11).intValue());
            }
            this.output.writeUInt32NoTag(i10);
            while (i9 < list.size()) {
                this.output.writeFixed32NoTag(list.get(i9).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.output.writeFixed32(i8, list.get(i9).intValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed64(int i8, long j8) throws IOException {
        this.output.writeFixed64(i8, j8);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed64List(int i8, List<Long> list, boolean z8) throws IOException {
        int i9 = 0;
        if (z8) {
            this.output.writeTag(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += CodedOutputStream.computeFixed64SizeNoTag(list.get(i11).longValue());
            }
            this.output.writeUInt32NoTag(i10);
            while (i9 < list.size()) {
                this.output.writeFixed64NoTag(list.get(i9).longValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.output.writeFixed64(i8, list.get(i9).longValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFloat(int i8, float f8) throws IOException {
        this.output.writeFloat(i8, f8);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFloatList(int i8, List<Float> list, boolean z8) throws IOException {
        int i9 = 0;
        if (z8) {
            this.output.writeTag(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += CodedOutputStream.computeFloatSizeNoTag(list.get(i11).floatValue());
            }
            this.output.writeUInt32NoTag(i10);
            while (i9 < list.size()) {
                this.output.writeFloatNoTag(list.get(i9).floatValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.output.writeFloat(i8, list.get(i9).floatValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public void writeGroup(int i8, Object obj) throws IOException {
        this.output.writeGroup(i8, (MessageLite) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public void writeGroupList(int i8, List<?> list) throws IOException {
        for (int i9 = 0; i9 < list.size(); i9++) {
            writeGroup(i8, list.get(i9));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt32(int i8, int i9) throws IOException {
        this.output.writeInt32(i8, i9);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt32List(int i8, List<Integer> list, boolean z8) throws IOException {
        int i9 = 0;
        if (z8) {
            this.output.writeTag(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += CodedOutputStream.computeInt32SizeNoTag(list.get(i11).intValue());
            }
            this.output.writeUInt32NoTag(i10);
            while (i9 < list.size()) {
                this.output.writeInt32NoTag(list.get(i9).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.output.writeInt32(i8, list.get(i9).intValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt64(int i8, long j8) throws IOException {
        this.output.writeInt64(i8, j8);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt64List(int i8, List<Long> list, boolean z8) throws IOException {
        int i9 = 0;
        if (z8) {
            this.output.writeTag(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += CodedOutputStream.computeInt64SizeNoTag(list.get(i11).longValue());
            }
            this.output.writeUInt32NoTag(i10);
            while (i9 < list.size()) {
                this.output.writeInt64NoTag(list.get(i9).longValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.output.writeInt64(i8, list.get(i9).longValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public <K, V> void writeMap(int i8, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException {
        if (this.output.isSerializationDeterministic()) {
            writeDeterministicMap(i8, metadata, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.output.writeTag(i8, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
            MapEntryLite.writeTo(this.output, metadata, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessage(int i8, Object obj) throws IOException {
        this.output.writeMessage(i8, (MessageLite) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessageList(int i8, List<?> list) throws IOException {
        for (int i9 = 0; i9 < list.size(); i9++) {
            writeMessage(i8, list.get(i9));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageSetItem(int i8, Object obj) throws IOException {
        if (obj instanceof ByteString) {
            this.output.writeRawMessageSetExtension(i8, (ByteString) obj);
        } else {
            this.output.writeMessageSetExtension(i8, (MessageLite) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed32(int i8, int i9) throws IOException {
        this.output.writeSFixed32(i8, i9);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed32List(int i8, List<Integer> list, boolean z8) throws IOException {
        int i9 = 0;
        if (z8) {
            this.output.writeTag(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += CodedOutputStream.computeSFixed32SizeNoTag(list.get(i11).intValue());
            }
            this.output.writeUInt32NoTag(i10);
            while (i9 < list.size()) {
                this.output.writeSFixed32NoTag(list.get(i9).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.output.writeSFixed32(i8, list.get(i9).intValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed64(int i8, long j8) throws IOException {
        this.output.writeSFixed64(i8, j8);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed64List(int i8, List<Long> list, boolean z8) throws IOException {
        int i9 = 0;
        if (z8) {
            this.output.writeTag(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += CodedOutputStream.computeSFixed64SizeNoTag(list.get(i11).longValue());
            }
            this.output.writeUInt32NoTag(i10);
            while (i9 < list.size()) {
                this.output.writeSFixed64NoTag(list.get(i9).longValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.output.writeSFixed64(i8, list.get(i9).longValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt32(int i8, int i9) throws IOException {
        this.output.writeSInt32(i8, i9);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt32List(int i8, List<Integer> list, boolean z8) throws IOException {
        int i9 = 0;
        if (z8) {
            this.output.writeTag(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += CodedOutputStream.computeSInt32SizeNoTag(list.get(i11).intValue());
            }
            this.output.writeUInt32NoTag(i10);
            while (i9 < list.size()) {
                this.output.writeSInt32NoTag(list.get(i9).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.output.writeSInt32(i8, list.get(i9).intValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt64(int i8, long j8) throws IOException {
        this.output.writeSInt64(i8, j8);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt64List(int i8, List<Long> list, boolean z8) throws IOException {
        int i9 = 0;
        if (z8) {
            this.output.writeTag(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += CodedOutputStream.computeSInt64SizeNoTag(list.get(i11).longValue());
            }
            this.output.writeUInt32NoTag(i10);
            while (i9 < list.size()) {
                this.output.writeSInt64NoTag(list.get(i9).longValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.output.writeSInt64(i8, list.get(i9).longValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public void writeStartGroup(int i8) throws IOException {
        this.output.writeTag(i8, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeString(int i8, String str) throws IOException {
        this.output.writeString(i8, str);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeStringList(int i8, List<String> list) throws IOException {
        int i9 = 0;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i9 < list.size()) {
                writeLazyString(i8, lazyStringList.getRaw(i9));
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.output.writeString(i8, list.get(i9));
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt32(int i8, int i9) throws IOException {
        this.output.writeUInt32(i8, i9);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt32List(int i8, List<Integer> list, boolean z8) throws IOException {
        int i9 = 0;
        if (z8) {
            this.output.writeTag(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += CodedOutputStream.computeUInt32SizeNoTag(list.get(i11).intValue());
            }
            this.output.writeUInt32NoTag(i10);
            while (i9 < list.size()) {
                this.output.writeUInt32NoTag(list.get(i9).intValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.output.writeUInt32(i8, list.get(i9).intValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt64(int i8, long j8) throws IOException {
        this.output.writeUInt64(i8, j8);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt64List(int i8, List<Long> list, boolean z8) throws IOException {
        int i9 = 0;
        if (z8) {
            this.output.writeTag(i8, 2);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                i10 += CodedOutputStream.computeUInt64SizeNoTag(list.get(i11).longValue());
            }
            this.output.writeUInt32NoTag(i10);
            while (i9 < list.size()) {
                this.output.writeUInt64NoTag(list.get(i9).longValue());
                i9++;
            }
            return;
        }
        while (i9 < list.size()) {
            this.output.writeUInt64(i8, list.get(i9).longValue());
            i9++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeGroup(int i8, Object obj, Schema schema) throws IOException {
        this.output.writeGroup(i8, (MessageLite) obj, schema);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessage(int i8, Object obj, Schema schema) throws IOException {
        this.output.writeMessage(i8, (MessageLite) obj, schema);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeGroupList(int i8, List<?> list, Schema schema) throws IOException {
        for (int i9 = 0; i9 < list.size(); i9++) {
            writeGroup(i8, list.get(i9), schema);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessageList(int i8, List<?> list, Schema schema) throws IOException {
        for (int i9 = 0; i9 < list.size(); i9++) {
            writeMessage(i8, list.get(i9), schema);
        }
    }
}
