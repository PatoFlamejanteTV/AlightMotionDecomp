package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
@CheckReturnValue
/* loaded from: classes3.dex */
public abstract class UnknownFieldSchema<T, B> {
    abstract void addFixed32(B b9, int i8, int i9);

    abstract void addFixed64(B b9, int i8, long j8);

    abstract void addGroup(B b9, int i8, T t8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void addLengthDelimited(B b9, int i8, ByteString byteString);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void addVarint(B b9, int i8, long j8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B getBuilderFromMessage(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T getFromMessage(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getSerializedSize(T t8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getSerializedSizeAsMessageSet(T t8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void makeImmutable(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T merge(T t8, T t9);

    final void mergeFrom(B b9, Reader reader) throws IOException {
        while (reader.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(b9, reader)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean mergeOneFieldFrom(B b9, Reader reader) throws IOException {
        int tag = reader.getTag();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType != 4) {
                            if (tagWireType == 5) {
                                addFixed32(b9, tagFieldNumber, reader.readFixed32());
                                return true;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        return false;
                    }
                    B newBuilder = newBuilder();
                    int makeTag = WireFormat.makeTag(tagFieldNumber, 4);
                    mergeFrom(newBuilder, reader);
                    if (makeTag == reader.getTag()) {
                        addGroup(b9, tagFieldNumber, toImmutable(newBuilder));
                        return true;
                    }
                    throw InvalidProtocolBufferException.invalidEndTag();
                }
                addLengthDelimited(b9, tagFieldNumber, reader.readBytes());
                return true;
            }
            addFixed64(b9, tagFieldNumber, reader.readFixed64());
            return true;
        }
        addVarint(b9, tagFieldNumber, reader.readInt64());
        return true;
    }

    abstract B newBuilder();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void setBuilderToMessage(Object obj, B b9);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void setToMessage(Object obj, T t8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean shouldDiscardUnknownFields(Reader reader);

    abstract T toImmutable(B b9);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void writeAsMessageSetTo(T t8, Writer writer) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void writeTo(T t8, Writer writer) throws IOException;
}
