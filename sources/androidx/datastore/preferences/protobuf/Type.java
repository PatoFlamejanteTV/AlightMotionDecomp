package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Field;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.Option;
import androidx.datastore.preferences.protobuf.SourceContext;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class Type extends GeneratedMessageLite<Type, Builder> implements TypeOrBuilder {
    private static final Type DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile Parser<Type> PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = "";
    private Internal.ProtobufList<Field> fields_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> oneofs_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Option> options_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: androidx.datastore.preferences.protobuf.Type$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Type, Builder> implements TypeOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder addAllFields(Iterable<? extends Field> iterable) {
            copyOnWrite();
            ((Type) this.instance).addAllFields(iterable);
            return this;
        }

        public Builder addAllOneofs(Iterable<String> iterable) {
            copyOnWrite();
            ((Type) this.instance).addAllOneofs(iterable);
            return this;
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            copyOnWrite();
            ((Type) this.instance).addAllOptions(iterable);
            return this;
        }

        public Builder addFields(Field field) {
            copyOnWrite();
            ((Type) this.instance).addFields(field);
            return this;
        }

        public Builder addOneofs(String str) {
            copyOnWrite();
            ((Type) this.instance).addOneofs(str);
            return this;
        }

        public Builder addOneofsBytes(ByteString byteString) {
            copyOnWrite();
            ((Type) this.instance).addOneofsBytes(byteString);
            return this;
        }

        public Builder addOptions(Option option) {
            copyOnWrite();
            ((Type) this.instance).addOptions(option);
            return this;
        }

        public Builder clearFields() {
            copyOnWrite();
            ((Type) this.instance).clearFields();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Type) this.instance).clearName();
            return this;
        }

        public Builder clearOneofs() {
            copyOnWrite();
            ((Type) this.instance).clearOneofs();
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((Type) this.instance).clearOptions();
            return this;
        }

        public Builder clearSourceContext() {
            copyOnWrite();
            ((Type) this.instance).clearSourceContext();
            return this;
        }

        public Builder clearSyntax() {
            copyOnWrite();
            ((Type) this.instance).clearSyntax();
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public Field getFields(int i8) {
            return ((Type) this.instance).getFields(i8);
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getFieldsCount() {
            return ((Type) this.instance).getFieldsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public List<Field> getFieldsList() {
            return DesugarCollections.unmodifiableList(((Type) this.instance).getFieldsList());
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public String getName() {
            return ((Type) this.instance).getName();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public ByteString getNameBytes() {
            return ((Type) this.instance).getNameBytes();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public String getOneofs(int i8) {
            return ((Type) this.instance).getOneofs(i8);
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public ByteString getOneofsBytes(int i8) {
            return ((Type) this.instance).getOneofsBytes(i8);
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getOneofsCount() {
            return ((Type) this.instance).getOneofsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public List<String> getOneofsList() {
            return DesugarCollections.unmodifiableList(((Type) this.instance).getOneofsList());
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public Option getOptions(int i8) {
            return ((Type) this.instance).getOptions(i8);
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getOptionsCount() {
            return ((Type) this.instance).getOptionsCount();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public List<Option> getOptionsList() {
            return DesugarCollections.unmodifiableList(((Type) this.instance).getOptionsList());
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public SourceContext getSourceContext() {
            return ((Type) this.instance).getSourceContext();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public Syntax getSyntax() {
            return ((Type) this.instance).getSyntax();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public int getSyntaxValue() {
            return ((Type) this.instance).getSyntaxValue();
        }

        @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
        public boolean hasSourceContext() {
            return ((Type) this.instance).hasSourceContext();
        }

        public Builder mergeSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            ((Type) this.instance).mergeSourceContext(sourceContext);
            return this;
        }

        public Builder removeFields(int i8) {
            copyOnWrite();
            ((Type) this.instance).removeFields(i8);
            return this;
        }

        public Builder removeOptions(int i8) {
            copyOnWrite();
            ((Type) this.instance).removeOptions(i8);
            return this;
        }

        public Builder setFields(int i8, Field field) {
            copyOnWrite();
            ((Type) this.instance).setFields(i8, field);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Type) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Type) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setOneofs(int i8, String str) {
            copyOnWrite();
            ((Type) this.instance).setOneofs(i8, str);
            return this;
        }

        public Builder setOptions(int i8, Option option) {
            copyOnWrite();
            ((Type) this.instance).setOptions(i8, option);
            return this;
        }

        public Builder setSourceContext(SourceContext sourceContext) {
            copyOnWrite();
            ((Type) this.instance).setSourceContext(sourceContext);
            return this;
        }

        public Builder setSyntax(Syntax syntax) {
            copyOnWrite();
            ((Type) this.instance).setSyntax(syntax);
            return this;
        }

        public Builder setSyntaxValue(int i8) {
            copyOnWrite();
            ((Type) this.instance).setSyntaxValue(i8);
            return this;
        }

        private Builder() {
            super(Type.DEFAULT_INSTANCE);
        }

        public Builder addFields(int i8, Field field) {
            copyOnWrite();
            ((Type) this.instance).addFields(i8, field);
            return this;
        }

        public Builder addOptions(int i8, Option option) {
            copyOnWrite();
            ((Type) this.instance).addOptions(i8, option);
            return this;
        }

        public Builder setFields(int i8, Field.Builder builder) {
            copyOnWrite();
            ((Type) this.instance).setFields(i8, builder.build());
            return this;
        }

        public Builder setOptions(int i8, Option.Builder builder) {
            copyOnWrite();
            ((Type) this.instance).setOptions(i8, builder.build());
            return this;
        }

        public Builder setSourceContext(SourceContext.Builder builder) {
            copyOnWrite();
            ((Type) this.instance).setSourceContext(builder.build());
            return this;
        }

        public Builder addFields(Field.Builder builder) {
            copyOnWrite();
            ((Type) this.instance).addFields(builder.build());
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            copyOnWrite();
            ((Type) this.instance).addOptions(builder.build());
            return this;
        }

        public Builder addFields(int i8, Field.Builder builder) {
            copyOnWrite();
            ((Type) this.instance).addFields(i8, builder.build());
            return this;
        }

        public Builder addOptions(int i8, Option.Builder builder) {
            copyOnWrite();
            ((Type) this.instance).addOptions(i8, builder.build());
            return this;
        }
    }

    static {
        Type type = new Type();
        DEFAULT_INSTANCE = type;
        GeneratedMessageLite.registerDefaultInstance(Type.class, type);
    }

    private Type() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFields(Iterable<? extends Field> iterable) {
        ensureFieldsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.fields_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOneofs(Iterable<String> iterable) {
        ensureOneofsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.oneofs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(field);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneofs(String str) {
        str.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneofsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureOneofsIsMutable();
        this.oneofs_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFields() {
        this.fields_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofs() {
        this.oneofs_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceContext() {
        this.sourceContext_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    private void ensureFieldsIsMutable() {
        Internal.ProtobufList<Field> protobufList = this.fields_;
        if (!protobufList.isModifiable()) {
            this.fields_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    private void ensureOneofsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.oneofs_;
        if (!protobufList.isModifiable()) {
            this.oneofs_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    private void ensureOptionsIsMutable() {
        Internal.ProtobufList<Option> protobufList = this.options_;
        if (!protobufList.isModifiable()) {
            this.options_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static Type getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceContext(SourceContext sourceContext) {
        sourceContext.getClass();
        SourceContext sourceContext2 = this.sourceContext_;
        if (sourceContext2 != null && sourceContext2 != SourceContext.getDefaultInstance()) {
            this.sourceContext_ = SourceContext.newBuilder(this.sourceContext_).mergeFrom((SourceContext.Builder) sourceContext).buildPartial();
        } else {
            this.sourceContext_ = sourceContext;
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Type parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Type) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Type parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Type> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFields(int i8) {
        ensureFieldsIsMutable();
        this.fields_.remove(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int i8) {
        ensureOptionsIsMutable();
        this.options_.remove(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFields(int i8, Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.set(i8, field);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneofs(int i8, String str) {
        str.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.set(i8, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int i8, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i8, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceContext(SourceContext sourceContext) {
        sourceContext.getClass();
        this.sourceContext_ = sourceContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(Syntax syntax) {
        this.syntax_ = syntax.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntaxValue(int i8) {
        this.syntax_ = i8;
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        AnonymousClass1 anonymousClass1 = null;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new Type();
            case 2:
                return new Builder(anonymousClass1);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f", new Object[]{"name_", "fields_", Field.class, "oneofs_", "options_", Option.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Type> parser = PARSER;
                if (parser == null) {
                    synchronized (Type.class) {
                        try {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        } finally {
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public Field getFields(int i8) {
        return this.fields_.get(i8);
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public List<Field> getFieldsList() {
        return this.fields_;
    }

    public FieldOrBuilder getFieldsOrBuilder(int i8) {
        return this.fields_.get(i8);
    }

    public List<? extends FieldOrBuilder> getFieldsOrBuilderList() {
        return this.fields_;
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public String getOneofs(int i8) {
        return this.oneofs_.get(i8);
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public ByteString getOneofsBytes(int i8) {
        return ByteString.copyFromUtf8(this.oneofs_.get(i8));
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getOneofsCount() {
        return this.oneofs_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public List<String> getOneofsList() {
        return this.oneofs_;
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public Option getOptions(int i8) {
        return this.options_.get(i8);
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public OptionOrBuilder getOptionsOrBuilder(int i8) {
        return this.options_.get(i8);
    }

    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        if (sourceContext == null) {
            return SourceContext.getDefaultInstance();
        }
        return sourceContext;
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public Syntax getSyntax() {
        Syntax forNumber = Syntax.forNumber(this.syntax_);
        if (forNumber == null) {
            return Syntax.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // androidx.datastore.preferences.protobuf.TypeOrBuilder
    public boolean hasSourceContext() {
        if (this.sourceContext_ != null) {
            return true;
        }
        return false;
    }

    public static Builder newBuilder(Type type) {
        return DEFAULT_INSTANCE.createBuilder(type);
    }

    public static Type parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Type) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Type parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Type parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(int i8, Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(i8, field);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i8, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i8, option);
    }

    public static Type parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Type parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Type parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Type parseFrom(InputStream inputStream) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Type parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Type parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Type parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Type) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
