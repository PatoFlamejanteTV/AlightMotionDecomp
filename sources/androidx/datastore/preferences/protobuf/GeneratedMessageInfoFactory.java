package androidx.datastore.preferences.protobuf;

/* loaded from: classes3.dex */
class GeneratedMessageInfoFactory implements MessageInfoFactory {
    private static final GeneratedMessageInfoFactory instance = new GeneratedMessageInfoFactory();

    private GeneratedMessageInfoFactory() {
    }

    public static GeneratedMessageInfoFactory getInstance() {
        return instance;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public boolean isSupported(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public MessageInfo messageInfoFor(Class<?> cls) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            try {
                return (MessageInfo) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
            } catch (Exception e8) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e8);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }
}
