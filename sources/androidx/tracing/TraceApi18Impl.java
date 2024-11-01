package androidx.tracing;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
/* loaded from: classes3.dex */
final class TraceApi18Impl {
    private TraceApi18Impl() {
    }

    public static void beginSection(@NonNull String str) {
        android.os.Trace.beginSection(str);
    }

    public static void endSection() {
        android.os.Trace.endSection();
    }
}
