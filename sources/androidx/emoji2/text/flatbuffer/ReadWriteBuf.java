package androidx.emoji2.text.flatbuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public interface ReadWriteBuf extends ReadBuf {
    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    int limit();

    void put(byte b9);

    void put(byte[] bArr, int i8, int i9);

    void putBoolean(boolean z8);

    void putDouble(double d8);

    void putFloat(float f8);

    void putInt(int i8);

    void putLong(long j8);

    void putShort(short s8);

    boolean requestCapacity(int i8);

    void set(int i8, byte b9);

    void set(int i8, byte[] bArr, int i9, int i10);

    void setBoolean(int i8, boolean z8);

    void setDouble(int i8, double d8);

    void setFloat(int i8, float f8);

    void setInt(int i8, int i9);

    void setLong(int i8, long j8);

    void setShort(int i8, short s8);

    int writePosition();
}
