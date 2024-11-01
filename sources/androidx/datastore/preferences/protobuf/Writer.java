package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@CheckReturnValue
/* loaded from: classes3.dex */
interface Writer {

    /* loaded from: classes3.dex */
    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    FieldOrder fieldOrder();

    void writeBool(int i8, boolean z8) throws IOException;

    void writeBoolList(int i8, List<Boolean> list, boolean z8) throws IOException;

    void writeBytes(int i8, ByteString byteString) throws IOException;

    void writeBytesList(int i8, List<ByteString> list) throws IOException;

    void writeDouble(int i8, double d8) throws IOException;

    void writeDoubleList(int i8, List<Double> list, boolean z8) throws IOException;

    @Deprecated
    void writeEndGroup(int i8) throws IOException;

    void writeEnum(int i8, int i9) throws IOException;

    void writeEnumList(int i8, List<Integer> list, boolean z8) throws IOException;

    void writeFixed32(int i8, int i9) throws IOException;

    void writeFixed32List(int i8, List<Integer> list, boolean z8) throws IOException;

    void writeFixed64(int i8, long j8) throws IOException;

    void writeFixed64List(int i8, List<Long> list, boolean z8) throws IOException;

    void writeFloat(int i8, float f8) throws IOException;

    void writeFloatList(int i8, List<Float> list, boolean z8) throws IOException;

    @Deprecated
    void writeGroup(int i8, Object obj) throws IOException;

    @Deprecated
    void writeGroup(int i8, Object obj, Schema schema) throws IOException;

    @Deprecated
    void writeGroupList(int i8, List<?> list) throws IOException;

    @Deprecated
    void writeGroupList(int i8, List<?> list, Schema schema) throws IOException;

    void writeInt32(int i8, int i9) throws IOException;

    void writeInt32List(int i8, List<Integer> list, boolean z8) throws IOException;

    void writeInt64(int i8, long j8) throws IOException;

    void writeInt64List(int i8, List<Long> list, boolean z8) throws IOException;

    <K, V> void writeMap(int i8, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException;

    void writeMessage(int i8, Object obj) throws IOException;

    void writeMessage(int i8, Object obj, Schema schema) throws IOException;

    void writeMessageList(int i8, List<?> list) throws IOException;

    void writeMessageList(int i8, List<?> list, Schema schema) throws IOException;

    void writeMessageSetItem(int i8, Object obj) throws IOException;

    void writeSFixed32(int i8, int i9) throws IOException;

    void writeSFixed32List(int i8, List<Integer> list, boolean z8) throws IOException;

    void writeSFixed64(int i8, long j8) throws IOException;

    void writeSFixed64List(int i8, List<Long> list, boolean z8) throws IOException;

    void writeSInt32(int i8, int i9) throws IOException;

    void writeSInt32List(int i8, List<Integer> list, boolean z8) throws IOException;

    void writeSInt64(int i8, long j8) throws IOException;

    void writeSInt64List(int i8, List<Long> list, boolean z8) throws IOException;

    @Deprecated
    void writeStartGroup(int i8) throws IOException;

    void writeString(int i8, String str) throws IOException;

    void writeStringList(int i8, List<String> list) throws IOException;

    void writeUInt32(int i8, int i9) throws IOException;

    void writeUInt32List(int i8, List<Integer> list, boolean z8) throws IOException;

    void writeUInt64(int i8, long j8) throws IOException;

    void writeUInt64List(int i8, List<Long> list, boolean z8) throws IOException;
}
