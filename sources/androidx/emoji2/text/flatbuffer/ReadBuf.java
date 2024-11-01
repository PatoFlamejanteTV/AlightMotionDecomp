package androidx.emoji2.text.flatbuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public interface ReadBuf {
    byte[] data();

    byte get(int i8);

    boolean getBoolean(int i8);

    double getDouble(int i8);

    float getFloat(int i8);

    int getInt(int i8);

    long getLong(int i8);

    short getShort(int i8);

    String getString(int i8, int i9);

    int limit();
}
