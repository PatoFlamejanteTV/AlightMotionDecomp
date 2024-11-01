package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
@CheckReturnValue
/* loaded from: classes3.dex */
public final class Protobuf {
    private static final Protobuf INSTANCE = new Protobuf();
    private final ConcurrentMap<Class<?>, Schema<?>> schemaCache = new ConcurrentHashMap();
    private final SchemaFactory schemaFactory = new ManifestSchemaFactory();

    private Protobuf() {
    }

    public static Protobuf getInstance() {
        return INSTANCE;
    }

    int getTotalSchemaSize() {
        int i8 = 0;
        for (Schema<?> schema : this.schemaCache.values()) {
            if (schema instanceof MessageSchema) {
                i8 += ((MessageSchema) schema).getSchemaSize();
            }
        }
        return i8;
    }

    <T> boolean isInitialized(T t8) {
        return schemaFor((Protobuf) t8).isInitialized(t8);
    }

    public <T> void makeImmutable(T t8) {
        schemaFor((Protobuf) t8).makeImmutable(t8);
    }

    public <T> void mergeFrom(T t8, Reader reader) throws IOException {
        mergeFrom(t8, reader, ExtensionRegistryLite.getEmptyRegistry());
    }

    public Schema<?> registerSchema(Class<?> cls, Schema<?> schema) {
        Internal.checkNotNull(cls, "messageType");
        Internal.checkNotNull(schema, "schema");
        return this.schemaCache.putIfAbsent(cls, schema);
    }

    @CanIgnoreReturnValue
    public Schema<?> registerSchemaOverride(Class<?> cls, Schema<?> schema) {
        Internal.checkNotNull(cls, "messageType");
        Internal.checkNotNull(schema, "schema");
        return this.schemaCache.put(cls, schema);
    }

    public <T> Schema<T> schemaFor(Class<T> cls) {
        Internal.checkNotNull(cls, "messageType");
        Schema<T> schema = (Schema) this.schemaCache.get(cls);
        if (schema != null) {
            return schema;
        }
        Schema<T> createSchema = this.schemaFactory.createSchema(cls);
        Schema<T> schema2 = (Schema<T>) registerSchema(cls, createSchema);
        return schema2 != null ? schema2 : createSchema;
    }

    public <T> void writeTo(T t8, Writer writer) throws IOException {
        schemaFor((Protobuf) t8).writeTo(t8, writer);
    }

    public <T> void mergeFrom(T t8, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        schemaFor((Protobuf) t8).mergeFrom(t8, reader, extensionRegistryLite);
    }

    public <T> Schema<T> schemaFor(T t8) {
        return schemaFor((Class) t8.getClass());
    }
}
