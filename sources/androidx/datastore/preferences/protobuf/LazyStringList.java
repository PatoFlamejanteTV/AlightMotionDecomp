package androidx.datastore.preferences.protobuf;

import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public interface LazyStringList extends ProtocolStringList {
    void add(ByteString byteString);

    void add(byte[] bArr);

    boolean addAllByteArray(Collection<byte[]> collection);

    boolean addAllByteString(Collection<? extends ByteString> collection);

    List<byte[]> asByteArrayList();

    byte[] getByteArray(int i8);

    ByteString getByteString(int i8);

    Object getRaw(int i8);

    List<?> getUnderlyingElements();

    LazyStringList getUnmodifiableView();

    void mergeFrom(LazyStringList lazyStringList);

    void set(int i8, ByteString byteString);

    void set(int i8, byte[] bArr);
}
