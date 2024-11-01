package androidx.tracing;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
/* loaded from: classes3.dex */
final class TraceApi29Impl {
    private TraceApi29Impl() {
    }

    public static void beginAsyncSection(@NonNull String str, int i8) {
        android.os.Trace.beginAsyncSection(str, i8);
    }

    public static void endAsyncSection(@NonNull String str, int i8) {
        android.os.Trace.endAsyncSection(str, i8);
    }

    public static void setCounter(@NonNull String str, int i8) {
        android.os.Trace.setCounter(str, i8);
    }
}
