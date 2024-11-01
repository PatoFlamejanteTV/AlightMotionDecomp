package androidx.datastore.preferences.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ExtensionRegistryFactory {
    static final Class<?> EXTENSION_REGISTRY_CLASS = reflectExtensionRegistry();
    static final String FULL_REGISTRY_CLASS_NAME = "androidx.datastore.preferences.protobuf.ExtensionRegistry";

    ExtensionRegistryFactory() {
    }

    public static ExtensionRegistryLite create() {
        ExtensionRegistryLite invokeSubclassFactory = invokeSubclassFactory("newInstance");
        if (invokeSubclassFactory == null) {
            return new ExtensionRegistryLite();
        }
        return invokeSubclassFactory;
    }

    public static ExtensionRegistryLite createEmpty() {
        ExtensionRegistryLite invokeSubclassFactory = invokeSubclassFactory("getEmptyRegistry");
        if (invokeSubclassFactory == null) {
            return ExtensionRegistryLite.EMPTY_REGISTRY_LITE;
        }
        return invokeSubclassFactory;
    }

    private static final ExtensionRegistryLite invokeSubclassFactory(String str) {
        Class<?> cls = EXTENSION_REGISTRY_CLASS;
        if (cls == null) {
            return null;
        }
        try {
            return (ExtensionRegistryLite) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isFullRegistry(ExtensionRegistryLite extensionRegistryLite) {
        Class<?> cls = EXTENSION_REGISTRY_CLASS;
        if (cls != null && cls.isAssignableFrom(extensionRegistryLite.getClass())) {
            return true;
        }
        return false;
    }

    static Class<?> reflectExtensionRegistry() {
        try {
            return Class.forName(FULL_REGISTRY_CLASS_NAME);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
