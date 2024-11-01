package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class MapEntryLite<K, V> {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final K key;
    private final Metadata<K, V> metadata;
    private final V value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.MapEntryLite$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class Metadata<K, V> {
        public final K defaultKey;
        public final V defaultValue;
        public final WireFormat.FieldType keyType;
        public final WireFormat.FieldType valueType;

        public Metadata(WireFormat.FieldType fieldType, K k8, WireFormat.FieldType fieldType2, V v8) {
            this.keyType = fieldType;
            this.defaultKey = k8;
            this.valueType = fieldType2;
            this.defaultValue = v8;
        }
    }

    private MapEntryLite(WireFormat.FieldType fieldType, K k8, WireFormat.FieldType fieldType2, V v8) {
        this.metadata = new Metadata<>(fieldType, k8, fieldType2, v8);
        this.key = k8;
        this.value = v8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int computeSerializedSize(Metadata<K, V> metadata, K k8, V v8) {
        return FieldSet.computeElementSize(metadata.keyType, 1, k8) + FieldSet.computeElementSize(metadata.valueType, 2, v8);
    }

    public static <K, V> MapEntryLite<K, V> newDefaultInstance(WireFormat.FieldType fieldType, K k8, WireFormat.FieldType fieldType2, V v8) {
        return new MapEntryLite<>(fieldType, k8, fieldType2, v8);
    }

    static <T> T parseField(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, WireFormat.FieldType fieldType, T t8) throws IOException {
        int i8 = AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return (T) FieldSet.readPrimitiveField(codedInputStream, fieldType, true);
                }
                throw new RuntimeException("Groups are not allowed in maps.");
            }
            return (T) Integer.valueOf(codedInputStream.readEnum());
        }
        MessageLite.Builder builder = ((MessageLite) t8).toBuilder();
        codedInputStream.readMessage(builder, extensionRegistryLite);
        return (T) builder.buildPartial();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void writeTo(CodedOutputStream codedOutputStream, Metadata<K, V> metadata, K k8, V v8) throws IOException {
        FieldSet.writeElement(codedOutputStream, metadata.keyType, 1, k8);
        FieldSet.writeElement(codedOutputStream, metadata.valueType, 2, v8);
    }

    public int computeMessageSize(int i8, K k8, V v8) {
        return CodedOutputStream.computeTagSize(i8) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, k8, v8));
    }

    public K getKey() {
        return this.key;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Metadata<K, V> getMetadata() {
        return this.metadata;
    }

    public V getValue() {
        return this.value;
    }

    public Map.Entry<K, V> parseEntry(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return parseEntry(byteString.newCodedInput(), this.metadata, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(MapFieldLite<K, V> mapFieldLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
        Metadata<K, V> metadata = this.metadata;
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == WireFormat.makeTag(1, this.metadata.keyType.getWireType())) {
                obj = parseField(codedInputStream, extensionRegistryLite, this.metadata.keyType, obj);
            } else if (readTag == WireFormat.makeTag(2, this.metadata.valueType.getWireType())) {
                obj2 = parseField(codedInputStream, extensionRegistryLite, this.metadata.valueType, obj2);
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        codedInputStream.checkLastTagWas(0);
        codedInputStream.popLimit(pushLimit);
        mapFieldLite.put(obj, obj2);
    }

    public void serializeTo(CodedOutputStream codedOutputStream, int i8, K k8, V v8) throws IOException {
        codedOutputStream.writeTag(i8, 2);
        codedOutputStream.writeUInt32NoTag(computeSerializedSize(this.metadata, k8, v8));
        writeTo(codedOutputStream, this.metadata, k8, v8);
    }

    static <K, V> Map.Entry<K, V> parseEntry(CodedInputStream codedInputStream, Metadata<K, V> metadata, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == WireFormat.makeTag(1, metadata.keyType.getWireType())) {
                obj = parseField(codedInputStream, extensionRegistryLite, metadata.keyType, obj);
            } else if (readTag == WireFormat.makeTag(2, metadata.valueType.getWireType())) {
                obj2 = parseField(codedInputStream, extensionRegistryLite, metadata.valueType, obj2);
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    private MapEntryLite(Metadata<K, V> metadata, K k8, V v8) {
        this.metadata = metadata;
        this.key = k8;
        this.value = v8;
    }
}
