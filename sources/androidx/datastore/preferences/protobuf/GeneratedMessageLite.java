package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.ArrayDecoders;
import androidx.datastore.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected UnknownFieldSetLite unknownFields = UnknownFieldSetLite.getDefaultInstance();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite.Builder<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        protected MessageType instance;

        /* JADX INFO: Access modifiers changed from: protected */
        public Builder(MessageType messagetype) {
            this.defaultInstance = messagetype;
            if (!messagetype.isMutable()) {
                this.instance = newMutableInstance();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private static <MessageType> void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
            Protobuf.getInstance().schemaFor((Protobuf) messagetype).mergeFrom(messagetype, messagetype2);
        }

        private MessageType newMutableInstance() {
            return (MessageType) this.defaultInstance.newMutableInstance();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void copyOnWrite() {
            if (!this.instance.isMutable()) {
                copyOnWriteInternal();
            }
        }

        protected void copyOnWriteInternal() {
            MessageType newMutableInstance = newMutableInstance();
            mergeFromInstance(newMutableInstance, this.instance);
            this.instance = newMutableInstance;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.instance, false);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public final MessageType build() {
            MessageType buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public MessageType buildPartial() {
            if (!this.instance.isMutable()) {
                return this.instance;
            }
            this.instance.makeImmutable();
            return this.instance;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public final BuilderType clear() {
            if (!this.defaultInstance.isMutable()) {
                this.instance = newMutableInstance();
                return this;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        public BuilderType internalMergeFrom(MessageType messagetype) {
            return mergeFrom((Builder<MessageType, BuilderType>) messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public BuilderType mo5425clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.instance = buildPartial();
            return buildertype;
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            if (getDefaultInstanceForType().equals(messagetype)) {
                return this;
            }
            copyOnWrite();
            mergeFromInstance(this.instance, messagetype);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i8, int i9, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            copyOnWrite();
            try {
                Protobuf.getInstance().schemaFor((Protobuf) this.instance).mergeFrom(this.instance, bArr, i8, i8 + i9, new ArrayDecoders.Registers(extensionRegistryLite));
                return this;
            } catch (InvalidProtocolBufferException e8) {
                throw e8;
            } catch (IOException e9) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e9);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i8, int i9) throws InvalidProtocolBufferException {
            return mergeFrom(bArr, i8, i9, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            copyOnWrite();
            try {
                Protobuf.getInstance().schemaFor((Protobuf) this.instance).mergeFrom(this.instance, CodedInputStreamReader.forCodedInput(codedInputStream), extensionRegistryLite);
                return this;
            } catch (RuntimeException e8) {
                if (e8.getCause() instanceof IOException) {
                    throw ((IOException) e8.getCause());
                }
                throw e8;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected ExtendableBuilder(MessageType messagetype) {
            super(messagetype);
        }

        private FieldSet<ExtensionDescriptor> ensureExtensionsAreMutable() {
            FieldSet<ExtensionDescriptor> fieldSet = ((ExtendableMessage) this.instance).extensions;
            if (fieldSet.isImmutable()) {
                FieldSet<ExtensionDescriptor> m5426clone = fieldSet.m5426clone();
                ((ExtendableMessage) this.instance).extensions = m5426clone;
                return m5426clone;
            }
            return fieldSet;
        }

        private void verifyExtensionContainingType(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
            } else {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public final <Type> BuilderType addExtension(ExtensionLite<MessageType, List<Type>> extensionLite, Type type) {
            GeneratedExtension<MessageType, ?> checkIsLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(checkIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().addRepeatedField(checkIsLite.descriptor, checkIsLite.singularToFieldSetType(type));
            return this;
        }

        public final BuilderType clearExtension(ExtensionLite<MessageType, ?> extensionLite) {
            GeneratedExtension<MessageType, ?> checkIsLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(checkIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().clearField(checkIsLite.descriptor);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder
        protected void copyOnWriteInternal() {
            super.copyOnWriteInternal();
            if (((ExtendableMessage) this.instance).extensions != FieldSet.emptySet()) {
                MessageType messagetype = this.instance;
                ((ExtendableMessage) messagetype).extensions = ((ExtendableMessage) messagetype).extensions.m5426clone();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite) {
            return (Type) ((ExtendableMessage) this.instance).getExtension(extensionLite);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite) {
            return ((ExtendableMessage) this.instance).getExtensionCount(extensionLite);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite) {
            return ((ExtendableMessage) this.instance).hasExtension(extensionLite);
        }

        void internalSetExtensionSet(FieldSet<ExtensionDescriptor> fieldSet) {
            copyOnWrite();
            ((ExtendableMessage) this.instance).extensions = fieldSet;
        }

        public final <Type> BuilderType setExtension(ExtensionLite<MessageType, Type> extensionLite, Type type) {
            GeneratedExtension<MessageType, ?> checkIsLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(checkIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().setField(checkIsLite.descriptor, checkIsLite.toFieldSetType(type));
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i8) {
            return (Type) ((ExtendableMessage) this.instance).getExtension(extensionLite, i8);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public final MessageType buildPartial() {
            if (!((ExtendableMessage) this.instance).isMutable()) {
                return (MessageType) this.instance;
            }
            ((ExtendableMessage) this.instance).extensions.makeImmutable();
            return (MessageType) super.buildPartial();
        }

        public final <Type> BuilderType setExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i8, Type type) {
            GeneratedExtension<MessageType, ?> checkIsLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(checkIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().setRepeatedField(checkIsLite.descriptor, i8, checkIsLite.singularToFieldSetType(type));
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends MessageLiteOrBuilder {
        <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite);

        <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i8);

        <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite);

        <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class ExtensionDescriptor implements FieldSet.FieldDescriptorLite<ExtensionDescriptor> {
        final Internal.EnumLiteMap<?> enumTypeMap;
        final boolean isPacked;
        final boolean isRepeated;
        final int number;
        final WireFormat.FieldType type;

        ExtensionDescriptor(Internal.EnumLiteMap<?> enumLiteMap, int i8, WireFormat.FieldType fieldType, boolean z8, boolean z9) {
            this.enumTypeMap = enumLiteMap;
            this.number = i8;
            this.type = fieldType;
            this.isRepeated = z8;
            this.isPacked = z9;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public Internal.EnumLiteMap<?> getEnumType() {
            return this.enumTypeMap;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.JavaType getLiteJavaType() {
            return this.type.getJavaType();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.FieldType getLiteType() {
            return this.type;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public int getNumber() {
            return this.number;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).mergeFrom((Builder) messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public boolean isPacked() {
            return this.isPacked;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public boolean isRepeated() {
            return this.isRepeated;
        }

        @Override // java.lang.Comparable
        public int compareTo(ExtensionDescriptor extensionDescriptor) {
            return this.number - extensionDescriptor.number;
        }
    }

    /* loaded from: classes3.dex */
    public static class GeneratedExtension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {
        final ContainingType containingTypeDefaultInstance;
        final Type defaultValue;
        final ExtensionDescriptor descriptor;
        final MessageLite messageDefaultInstance;

        GeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, ExtensionDescriptor extensionDescriptor, Class cls) {
            if (containingtype != null) {
                if (extensionDescriptor.getLiteType() == WireFormat.FieldType.MESSAGE && messageLite == null) {
                    throw new IllegalArgumentException("Null messageDefaultInstance");
                }
                this.containingTypeDefaultInstance = containingtype;
                this.defaultValue = type;
                this.messageDefaultInstance = messageLite;
                this.descriptor = extensionDescriptor;
                return;
            }
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }

        Object fromFieldSetType(Object obj) {
            if (this.descriptor.isRepeated()) {
                if (this.descriptor.getLiteJavaType() == WireFormat.JavaType.ENUM) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        arrayList.add(singularFromFieldSetType(it.next()));
                    }
                    return arrayList;
                }
                return obj;
            }
            return singularFromFieldSetType(obj);
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return this.containingTypeDefaultInstance;
        }

        @Override // androidx.datastore.preferences.protobuf.ExtensionLite
        public Type getDefaultValue() {
            return this.defaultValue;
        }

        @Override // androidx.datastore.preferences.protobuf.ExtensionLite
        public WireFormat.FieldType getLiteType() {
            return this.descriptor.getLiteType();
        }

        @Override // androidx.datastore.preferences.protobuf.ExtensionLite
        public MessageLite getMessageDefaultInstance() {
            return this.messageDefaultInstance;
        }

        @Override // androidx.datastore.preferences.protobuf.ExtensionLite
        public int getNumber() {
            return this.descriptor.getNumber();
        }

        @Override // androidx.datastore.preferences.protobuf.ExtensionLite
        public boolean isRepeated() {
            return this.descriptor.isRepeated;
        }

        Object singularFromFieldSetType(Object obj) {
            if (this.descriptor.getLiteJavaType() == WireFormat.JavaType.ENUM) {
                return this.descriptor.enumTypeMap.findValueByNumber(((Integer) obj).intValue());
            }
            return obj;
        }

        Object singularToFieldSetType(Object obj) {
            if (this.descriptor.getLiteJavaType() == WireFormat.JavaType.ENUM) {
                return Integer.valueOf(((Internal.EnumLite) obj).getNumber());
            }
            return obj;
        }

        Object toFieldSetType(Object obj) {
            if (this.descriptor.isRepeated()) {
                if (this.descriptor.getLiteJavaType() == WireFormat.JavaType.ENUM) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        arrayList.add(singularToFieldSetType(it.next()));
                    }
                    return arrayList;
                }
                return obj;
            }
            return singularToFieldSetType(obj);
        }
    }

    /* loaded from: classes3.dex */
    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* loaded from: classes3.dex */
    protected static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] asBytes;
        private final Class<?> messageClass;
        private final String messageClassName;

        SerializedForm(MessageLite messageLite) {
            Class<?> cls = messageLite.getClass();
            this.messageClass = cls;
            this.messageClassName = cls.getName();
            this.asBytes = messageLite.toByteArray();
        }

        public static SerializedForm of(MessageLite messageLite) {
            return new SerializedForm(messageLite);
        }

        @Deprecated
        private Object readResolveFallback() throws ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = resolveMessageClass().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (InvalidProtocolBufferException e8) {
                throw new RuntimeException("Unable to understand proto buffer", e8);
            } catch (ClassNotFoundException e9) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e9);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Unable to call parsePartialFrom", e10);
            } catch (NoSuchFieldException e11) {
                throw new RuntimeException("Unable to find defaultInstance in " + this.messageClassName, e11);
            } catch (SecurityException e12) {
                throw new RuntimeException("Unable to call defaultInstance in " + this.messageClassName, e12);
            }
        }

        private Class<?> resolveMessageClass() throws ClassNotFoundException {
            Class<?> cls = this.messageClass;
            if (cls == null) {
                return Class.forName(this.messageClassName);
            }
            return cls;
        }

        protected Object readResolve() throws ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = resolveMessageClass().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (InvalidProtocolBufferException e8) {
                throw new RuntimeException("Unable to understand proto buffer", e8);
            } catch (ClassNotFoundException e9) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e9);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Unable to call parsePartialFrom", e10);
            } catch (NoSuchFieldException unused) {
                return readResolveFallback();
            } catch (SecurityException e11) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.messageClassName, e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>, T> GeneratedExtension<MessageType, T> checkIsLite(ExtensionLite<MessageType, T> extensionLite) {
        if (extensionLite.isLite()) {
            return (GeneratedExtension) extensionLite;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t8) throws InvalidProtocolBufferException {
        if (t8 != null && !t8.isInitialized()) {
            throw t8.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(t8);
        }
        return t8;
    }

    private int computeSerializedSize(Schema<?> schema) {
        if (schema == null) {
            return Protobuf.getInstance().schemaFor((Protobuf) this).getSerializedSize(this);
        }
        return schema.getSerializedSize(this);
    }

    protected static Internal.BooleanList emptyBooleanList() {
        return BooleanArrayList.emptyList();
    }

    protected static Internal.DoubleList emptyDoubleList() {
        return DoubleArrayList.emptyList();
    }

    protected static Internal.FloatList emptyFloatList() {
        return FloatArrayList.emptyList();
    }

    protected static Internal.IntList emptyIntList() {
        return IntArrayList.emptyList();
    }

    protected static Internal.LongList emptyLongList() {
        return LongArrayList.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> Internal.ProtobufList<E> emptyProtobufList() {
        return ProtobufArrayList.emptyList();
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == UnknownFieldSetLite.getDefaultInstance()) {
            this.unknownFields = UnknownFieldSetLite.newInstance();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends GeneratedMessageLite<?, ?>> T getDefaultInstance(Class<T> cls) {
        GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (generatedMessageLite == null) {
            generatedMessageLite = (T) ((GeneratedMessageLite) UnsafeUtil.allocateInstance(cls)).getDefaultInstanceForType();
            if (generatedMessageLite != null) {
                defaultInstanceMap.put(cls, generatedMessageLite);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) generatedMessageLite;
    }

    static java.lang.reflect.Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object invokeOrDie(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e8);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.Internal$IntList] */
    protected static Internal.IntList mutableCopy(Internal.IntList intList) {
        int size = intList.size();
        return intList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object newMessageInfo(MessageLite messageLite, String str, Object[] objArr) {
        return new RawMessageInfo(messageLite, str, objArr);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i8, WireFormat.FieldType fieldType, boolean z8, Class cls) {
        return new GeneratedExtension<>(containingtype, Collections.emptyList(), messageLite, new ExtensionDescriptor(enumLiteMap, i8, fieldType, true, z8), cls);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i8, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension<>(containingtype, type, messageLite, new ExtensionDescriptor(enumLiteMap, i8, fieldType, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t8, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t8, inputStream, ExtensionRegistryLite.getEmptyRegistry()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t8, ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parseFrom(t8, CodedInputStream.newInstance(byteBuffer), extensionRegistryLite));
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T t8, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            CodedInputStream newInstance = CodedInputStream.newInstance(new AbstractMessageLite.Builder.LimitedInputStream(inputStream, CodedInputStream.readRawVarint32(read, inputStream)));
            T t9 = (T) parsePartialFrom(t8, newInstance, extensionRegistryLite);
            try {
                newInstance.checkLastTagWas(0);
                return t9;
            } catch (InvalidProtocolBufferException e8) {
                throw e8.setUnfinishedMessage(t9);
            }
        } catch (InvalidProtocolBufferException e9) {
            if (e9.getThrownFromInputStream()) {
                throw new InvalidProtocolBufferException((IOException) e9);
            }
            throw e9;
        } catch (IOException e10) {
            throw new InvalidProtocolBufferException(e10);
        }
    }

    static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t8, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t9 = (T) t8.newMutableInstance();
        try {
            Schema schemaFor = Protobuf.getInstance().schemaFor((Protobuf) t9);
            schemaFor.mergeFrom(t9, CodedInputStreamReader.forCodedInput(codedInputStream), extensionRegistryLite);
            schemaFor.makeImmutable(t9);
            return t9;
        } catch (InvalidProtocolBufferException e8) {
            e = e8;
            if (e.getThrownFromInputStream()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.setUnfinishedMessage(t9);
        } catch (UninitializedMessageException e9) {
            throw e9.asInvalidProtocolBufferException().setUnfinishedMessage(t9);
        } catch (IOException e10) {
            if (e10.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e10.getCause());
            }
            throw new InvalidProtocolBufferException(e10).setUnfinishedMessage(t9);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e11.getCause());
            }
            throw e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends GeneratedMessageLite<?, ?>> void registerDefaultInstance(Class<T> cls, T t8) {
        t8.markImmutable();
        defaultInstanceMap.put(cls, t8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    int computeHashCode() {
        return Protobuf.getInstance().schemaFor((Protobuf) this).hashCode(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    @CanIgnoreReturnValue
    protected Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj) {
        return dynamicMethod(methodToInvoke, obj, null);
    }

    protected abstract Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Protobuf.getInstance().schemaFor((Protobuf) this).equals(this, (GeneratedMessageLite) obj);
    }

    int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final Parser<MessageType> getParserForType() {
        return (Parser) dynamicMethod(MethodToInvoke.GET_PARSER);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    int getSerializedSize(Schema schema) {
        if (isMutable()) {
            int computeSerializedSize = computeSerializedSize(schema);
            if (computeSerializedSize >= 0) {
                return computeSerializedSize;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + computeSerializedSize);
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int computeSerializedSize2 = computeSerializedSize(schema);
        setMemoizedSerializedSize(computeSerializedSize2);
        return computeSerializedSize2;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    boolean hashCodeIsNotMemoized() {
        if (getMemoizedHashCode() == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isMutable() {
        if ((this.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void makeImmutable() {
        Protobuf.getInstance().schemaFor((Protobuf) this).makeImmutable(this);
        markImmutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    protected void mergeLengthDelimitedField(int i8, ByteString byteString) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeLengthDelimitedField(i8, byteString);
    }

    protected final void mergeUnknownFields(UnknownFieldSetLite unknownFieldSetLite) {
        this.unknownFields = UnknownFieldSetLite.mutableCopyOf(this.unknownFields, unknownFieldSetLite);
    }

    protected void mergeVarintField(int i8, int i9) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeVarintField(i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageType newMutableInstance() {
        return (MessageType) dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    protected boolean parseUnknownField(int i8, CodedInputStream codedInputStream) throws IOException {
        if (WireFormat.getTagWireType(i8) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mergeFieldFrom(i8, codedInputStream);
    }

    void setMemoizedHashCode(int i8) {
        this.memoizedHashCode = i8;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    void setMemoizedSerializedSize(int i8) {
        if (i8 >= 0) {
            this.memoizedSerializedSize = (i8 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i8);
        }
    }

    public String toString() {
        return MessageLiteToString.toString(this, super.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        Protobuf.getInstance().schemaFor((Protobuf) this).writeTo(this, CodedOutputStreamWriter.forCodedOutput(codedOutputStream));
    }

    protected static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t8, boolean z8) {
        byte byteValue = ((Byte) t8.dynamicMethod(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean isInitialized = Protobuf.getInstance().schemaFor((Protobuf) t8).isInitialized(t8);
        if (z8) {
            t8.dynamicMethod(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, isInitialized ? t8 : null);
        }
        return isInitialized;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom(messagetype);
    }

    protected Object dynamicMethod(MethodToInvoke methodToInvoke) {
        return dynamicMethod(methodToInvoke, null, null);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final BuilderType toBuilder() {
        return (BuilderType) ((Builder) dynamicMethod(MethodToInvoke.NEW_BUILDER)).mergeFrom((Builder) this);
    }

    /* loaded from: classes3.dex */
    protected static class DefaultInstanceBasedParser<T extends GeneratedMessageLite<T, ?>> extends AbstractParser<T> {
        private final T defaultInstance;

        public DefaultInstanceBasedParser(T t8) {
            this.defaultInstance = t8;
        }

        @Override // androidx.datastore.preferences.protobuf.Parser
        public T parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.parsePartialFrom(this.defaultInstance, codedInputStream, extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractParser, androidx.datastore.preferences.protobuf.Parser
        public T parsePartialFrom(byte[] bArr, int i8, int i9, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.parsePartialFrom(this.defaultInstance, bArr, i8, i9, extensionRegistryLite);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.Internal$LongList] */
    protected static Internal.LongList mutableCopy(Internal.LongList longList) {
        int size = longList.size();
        return longList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t8, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (T) parseFrom(t8, byteBuffer, ExtensionRegistryLite.getEmptyRegistry());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t8, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t8, inputStream, extensionRegistryLite));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t8, ByteString byteString) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parseFrom(t8, byteString, ExtensionRegistryLite.getEmptyRegistry()));
    }

    /* loaded from: classes3.dex */
    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected FieldSet<ExtensionDescriptor> extensions = FieldSet.emptySet();

        /* loaded from: classes3.dex */
        protected class ExtensionWriter {
            private final Iterator<Map.Entry<ExtensionDescriptor, Object>> iter;
            private final boolean messageSetWireFormat;
            private Map.Entry<ExtensionDescriptor, Object> next;

            /* synthetic */ ExtensionWriter(ExtendableMessage extendableMessage, boolean z8, AnonymousClass1 anonymousClass1) {
                this(z8);
            }

            public void writeUntil(int i8, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<ExtensionDescriptor, Object> entry = this.next;
                    if (entry != null && entry.getKey().getNumber() < i8) {
                        ExtensionDescriptor key = this.next.getKey();
                        if (this.messageSetWireFormat && key.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !key.isRepeated()) {
                            codedOutputStream.writeMessageSetExtension(key.getNumber(), (MessageLite) this.next.getValue());
                        } else {
                            FieldSet.writeField(key, this.next.getValue(), codedOutputStream);
                        }
                        if (this.iter.hasNext()) {
                            this.next = this.iter.next();
                        } else {
                            this.next = null;
                        }
                    } else {
                        return;
                    }
                }
            }

            private ExtensionWriter(boolean z8) {
                Iterator<Map.Entry<ExtensionDescriptor, Object>> it = ExtendableMessage.this.extensions.iterator();
                this.iter = it;
                if (it.hasNext()) {
                    this.next = it.next();
                }
                this.messageSetWireFormat = z8;
            }
        }

        private void eagerlyMergeMessageSetExtension(CodedInputStream codedInputStream, GeneratedExtension<?, ?> generatedExtension, ExtensionRegistryLite extensionRegistryLite, int i8) throws IOException {
            parseExtension(codedInputStream, extensionRegistryLite, generatedExtension, WireFormat.makeTag(i8, 2), i8);
        }

        private void mergeMessageSetExtensionFromBytes(ByteString byteString, ExtensionRegistryLite extensionRegistryLite, GeneratedExtension<?, ?> generatedExtension) throws IOException {
            MessageLite.Builder builder;
            MessageLite messageLite = (MessageLite) this.extensions.getField(generatedExtension.descriptor);
            if (messageLite != null) {
                builder = messageLite.toBuilder();
            } else {
                builder = null;
            }
            if (builder == null) {
                builder = generatedExtension.getMessageDefaultInstance().newBuilderForType();
            }
            builder.mergeFrom(byteString, extensionRegistryLite);
            ensureExtensionsAreMutable().setField(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(builder.build()));
        }

        private <MessageType extends MessageLite> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i8 = 0;
            ByteString byteString = null;
            GeneratedExtension<?, ?> generatedExtension = null;
            while (true) {
                int readTag = codedInputStream.readTag();
                if (readTag == 0) {
                    break;
                }
                if (readTag == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                    i8 = codedInputStream.readUInt32();
                    if (i8 != 0) {
                        generatedExtension = extensionRegistryLite.findLiteExtensionByNumber(messagetype, i8);
                    }
                } else if (readTag == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                    if (i8 != 0 && generatedExtension != null) {
                        eagerlyMergeMessageSetExtension(codedInputStream, generatedExtension, extensionRegistryLite, i8);
                        byteString = null;
                    } else {
                        byteString = codedInputStream.readBytes();
                    }
                } else if (!codedInputStream.skipField(readTag)) {
                    break;
                }
            }
            codedInputStream.checkLastTagWas(WireFormat.MESSAGE_SET_ITEM_END_TAG);
            if (byteString != null && i8 != 0) {
                if (generatedExtension != null) {
                    mergeMessageSetExtensionFromBytes(byteString, extensionRegistryLite, generatedExtension);
                } else {
                    mergeLengthDelimitedField(i8, byteString);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private boolean parseExtension(androidx.datastore.preferences.protobuf.CodedInputStream r6, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r7, androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?> r8, int r9, int r10) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 292
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage.parseExtension(androidx.datastore.preferences.protobuf.CodedInputStream, androidx.datastore.preferences.protobuf.ExtensionRegistryLite, androidx.datastore.preferences.protobuf.GeneratedMessageLite$GeneratedExtension, int, int):boolean");
        }

        private void verifyExtensionContainingType(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
            } else {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @CanIgnoreReturnValue
        public FieldSet<ExtensionDescriptor> ensureExtensionsAreMutable() {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.m5426clone();
            }
            return this.extensions;
        }

        protected boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        protected int extensionsSerializedSize() {
            return this.extensions.getSerializedSize();
        }

        protected int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.getMessageSetSerializedSize();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite) {
            GeneratedExtension<MessageType, ?> checkIsLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(checkIsLite);
            Object field = this.extensions.getField(checkIsLite.descriptor);
            if (field == null) {
                return checkIsLite.defaultValue;
            }
            return (Type) checkIsLite.fromFieldSetType(field);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite) {
            GeneratedExtension<MessageType, ?> checkIsLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(checkIsLite);
            return this.extensions.getRepeatedFieldCount(checkIsLite.descriptor);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite) {
            GeneratedExtension<MessageType, ?> checkIsLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(checkIsLite);
            return this.extensions.hasField(checkIsLite.descriptor);
        }

        protected final void mergeExtensionFields(MessageType messagetype) {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.m5426clone();
            }
            this.extensions.mergeFrom(messagetype.extensions);
        }

        protected ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter(this, false, null);
        }

        protected ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newMessageSetExtensionWriter() {
            return new ExtensionWriter(this, true, null);
        }

        protected <MessageType extends MessageLite> boolean parseUnknownField(MessageType messagetype, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i8) throws IOException {
            int tagFieldNumber = WireFormat.getTagFieldNumber(i8);
            return parseExtension(codedInputStream, extensionRegistryLite, extensionRegistryLite.findLiteExtensionByNumber(messagetype, tagFieldNumber), i8, tagFieldNumber);
        }

        protected <MessageType extends MessageLite> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i8) throws IOException {
            if (i8 == WireFormat.MESSAGE_SET_ITEM_TAG) {
                mergeMessageSetExtensionFromCodedStream(messagetype, codedInputStream, extensionRegistryLite);
                return true;
            }
            if (WireFormat.getTagWireType(i8) == 2) {
                return parseUnknownField(messagetype, codedInputStream, extensionRegistryLite, i8);
            }
            return codedInputStream.skipField(i8);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i8) {
            GeneratedExtension<MessageType, ?> checkIsLite = GeneratedMessageLite.checkIsLite(extensionLite);
            verifyExtensionContainingType(checkIsLite);
            return (Type) checkIsLite.singularFromFieldSetType(this.extensions.getRepeatedField(checkIsLite.descriptor, i8));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.Internal$FloatList] */
    protected static Internal.FloatList mutableCopy(Internal.FloatList floatList) {
        int size = floatList.size();
        return floatList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t8, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t8, byteString, extensionRegistryLite));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.Internal$DoubleList] */
    protected static Internal.DoubleList mutableCopy(Internal.DoubleList doubleList) {
        int size = doubleList.size();
        return doubleList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t8, byte[] bArr) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t8, bArr, 0, bArr.length, ExtensionRegistryLite.getEmptyRegistry()));
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.Internal$BooleanList] */
    protected static Internal.BooleanList mutableCopy(Internal.BooleanList booleanList) {
        int size = booleanList.size();
        return booleanList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t8, byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t8, bArr, 0, bArr.length, extensionRegistryLite));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> Internal.ProtobufList<E> mutableCopy(Internal.ProtobufList<E> protobufList) {
        int size = protobufList.size();
        return protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t8, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t8, CodedInputStream.newInstance(inputStream), ExtensionRegistryLite.getEmptyRegistry()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t8, byte[] bArr, int i8, int i9, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t9 = (T) t8.newMutableInstance();
        try {
            Schema schemaFor = Protobuf.getInstance().schemaFor((Protobuf) t9);
            schemaFor.mergeFrom(t9, bArr, i8, i8 + i9, new ArrayDecoders.Registers(extensionRegistryLite));
            schemaFor.makeImmutable(t9);
            return t9;
        } catch (InvalidProtocolBufferException e8) {
            e = e8;
            if (e.getThrownFromInputStream()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.setUnfinishedMessage(t9);
        } catch (UninitializedMessageException e9) {
            throw e9.asInvalidProtocolBufferException().setUnfinishedMessage(t9);
        } catch (IOException e10) {
            if (e10.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e10.getCause());
            }
            throw new InvalidProtocolBufferException(e10).setUnfinishedMessage(t9);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(t9);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t8, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t8, CodedInputStream.newInstance(inputStream), extensionRegistryLite));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t8, CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return (T) parseFrom(t8, codedInputStream, ExtensionRegistryLite.getEmptyRegistry());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t8, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t8, codedInputStream, extensionRegistryLite));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t8, CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return (T) parsePartialFrom(t8, codedInputStream, ExtensionRegistryLite.getEmptyRegistry());
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t8, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream newCodedInput = byteString.newCodedInput();
        T t9 = (T) parsePartialFrom(t8, newCodedInput, extensionRegistryLite);
        try {
            newCodedInput.checkLastTagWas(0);
            return t9;
        } catch (InvalidProtocolBufferException e8) {
            throw e8.setUnfinishedMessage(t9);
        }
    }
}
