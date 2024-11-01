package androidx.datastore.core;

/* loaded from: classes3.dex */
public final class NativeSharedCounter {
    public final native long nativeCreateSharedCounter(int i8);

    public final native int nativeGetCounterValue(long j8);

    public final native int nativeIncrementAndGetCounterValue(long j8);

    public final native int nativeTruncateFile(int i8);
}
