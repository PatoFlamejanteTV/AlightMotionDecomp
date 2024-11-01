package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@CheckReturnValue
/* loaded from: classes3.dex */
public interface MessageLite extends MessageLiteOrBuilder {

    /* loaded from: classes3.dex */
    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        MessageLite build();

        MessageLite buildPartial();

        @CanIgnoreReturnValue
        Builder clear();

        /* renamed from: clone */
        Builder mo5425clone();

        boolean mergeDelimitedFrom(InputStream inputStream) throws IOException;

        boolean mergeDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(ByteString byteString) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(CodedInputStream codedInputStream) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(MessageLite messageLite);

        @CanIgnoreReturnValue
        Builder mergeFrom(InputStream inputStream) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] bArr) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] bArr, int i8, int i9) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] bArr, int i8, int i9, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;
    }

    Parser<? extends MessageLite> getParserForType();

    int getSerializedSize();

    Builder newBuilderForType();

    Builder toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeDelimitedTo(OutputStream outputStream) throws IOException;

    void writeTo(CodedOutputStream codedOutputStream) throws IOException;

    void writeTo(OutputStream outputStream) throws IOException;
}
