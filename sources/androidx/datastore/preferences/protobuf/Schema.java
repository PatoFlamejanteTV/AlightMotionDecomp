package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ArrayDecoders;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
@CheckReturnValue
/* loaded from: classes3.dex */
public interface Schema<T> {
    boolean equals(T t8, T t9);

    int getSerializedSize(T t8);

    int hashCode(T t8);

    boolean isInitialized(T t8);

    void makeImmutable(T t8);

    void mergeFrom(T t8, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    void mergeFrom(T t8, T t9);

    void mergeFrom(T t8, byte[] bArr, int i8, int i9, ArrayDecoders.Registers registers) throws IOException;

    T newInstance();

    void writeTo(T t8, Writer writer) throws IOException;
}
