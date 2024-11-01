package androidx.compose.runtime;

import Q5.InterfaceC1416k;
import android.os.Looper;
import android.util.Log;
import androidx.compose.runtime.snapshots.SnapshotMutableState;

/* loaded from: classes.dex */
public final class ActualAndroid_androidKt {
    private static final InterfaceC1416k DefaultMonotonicFrameClock$delegate = Q5.l.b(ActualAndroid_androidKt$DefaultMonotonicFrameClock$2.INSTANCE);
    private static final boolean DisallowDefaultMonotonicFrameClock = false;
    private static final String LogTag = "ComposeInternal";
    private static final long MainThreadId;

    static {
        long j8;
        try {
            j8 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j8 = -1;
        }
        MainThreadId = j8;
    }

    public static final MutableDoubleState createSnapshotMutableDoubleState(double d8) {
        return new ParcelableSnapshotMutableDoubleState(d8);
    }

    public static final MutableFloatState createSnapshotMutableFloatState(float f8) {
        return new ParcelableSnapshotMutableFloatState(f8);
    }

    public static final MutableIntState createSnapshotMutableIntState(int i8) {
        return new ParcelableSnapshotMutableIntState(i8);
    }

    public static final MutableLongState createSnapshotMutableLongState(long j8) {
        return new ParcelableSnapshotMutableLongState(j8);
    }

    public static final <T> SnapshotMutableState<T> createSnapshotMutableState(T t8, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return new ParcelableSnapshotMutableState(t8, snapshotMutationPolicy);
    }

    public static final MonotonicFrameClock getDefaultMonotonicFrameClock() {
        return (MonotonicFrameClock) DefaultMonotonicFrameClock$delegate.getValue();
    }

    public static /* synthetic */ void getDefaultMonotonicFrameClock$annotations() {
    }

    public static final long getMainThreadId() {
        return MainThreadId;
    }

    public static final void logError(String str, Throwable th) {
        Log.e(LogTag, str, th);
    }
}
