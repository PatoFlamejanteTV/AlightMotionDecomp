package androidx.datastore.preferences.protobuf;

@CheckReturnValue
/* loaded from: classes3.dex */
final class NewInstanceSchemas {
    private static final NewInstanceSchema FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final NewInstanceSchema LITE_SCHEMA = new NewInstanceSchemaLite();

    NewInstanceSchemas() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static NewInstanceSchema full() {
        return FULL_SCHEMA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static NewInstanceSchema lite() {
        return LITE_SCHEMA;
    }

    private static NewInstanceSchema loadSchemaForFullRuntime() {
        try {
            return (NewInstanceSchema) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
