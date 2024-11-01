package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

@Deprecated
/* loaded from: classes3.dex */
public final class TraceCompat {
    private static final String TAG = "TraceCompat";
    private static Method sAsyncTraceBeginMethod;
    private static Method sAsyncTraceEndMethod;
    private static Method sIsTagEnabledMethod;
    private static Method sTraceCounterMethod;
    private static long sTraceTagApp;

    @RequiresApi(29)
    /* loaded from: classes3.dex */
    static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        static void beginAsyncSection(String str, int i8) {
            Trace.beginAsyncSection(str, i8);
        }

        @DoNotInline
        static void endAsyncSection(String str, int i8) {
            Trace.endAsyncSection(str, i8);
        }

        @DoNotInline
        static boolean isEnabled() {
            return Trace.isEnabled();
        }

        @DoNotInline
        static void setCounter(String str, long j8) {
            Trace.setCounter(str, j8);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                sTraceTagApp = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                sIsTagEnabledMethod = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                sAsyncTraceBeginMethod = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                sAsyncTraceEndMethod = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                sTraceCounterMethod = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e8) {
                Log.i(TAG, "Unable to initialize via reflection.", e8);
            }
        }
    }

    private TraceCompat() {
    }

    public static void beginAsyncSection(@NonNull String str, int i8) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.beginAsyncSection(str, i8);
            return;
        }
        try {
            sAsyncTraceBeginMethod.invoke(null, Long.valueOf(sTraceTagApp), str, Integer.valueOf(i8));
        } catch (Exception unused) {
            Log.v(TAG, "Unable to invoke asyncTraceBegin() via reflection.");
        }
    }

    public static void beginSection(@NonNull String str) {
        Trace.beginSection(str);
    }

    public static void endAsyncSection(@NonNull String str, int i8) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.endAsyncSection(str, i8);
            return;
        }
        try {
            sAsyncTraceEndMethod.invoke(null, Long.valueOf(sTraceTagApp), str, Integer.valueOf(i8));
        } catch (Exception unused) {
            Log.v(TAG, "Unable to invoke endAsyncSection() via reflection.");
        }
    }

    public static void endSection() {
        Trace.endSection();
    }

    public static boolean isEnabled() {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.isEnabled();
        }
        try {
            return ((Boolean) sIsTagEnabledMethod.invoke(null, Long.valueOf(sTraceTagApp))).booleanValue();
        } catch (Exception unused) {
            Log.v(TAG, "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }

    public static void setCounter(@NonNull String str, int i8) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.setCounter(str, i8);
            return;
        }
        try {
            sTraceCounterMethod.invoke(null, Long.valueOf(sTraceTagApp), str, Integer.valueOf(i8));
        } catch (Exception unused) {
            Log.v(TAG, "Unable to invoke traceCounter() via reflection.");
        }
    }
}
