package androidx.compose.runtime;

@InternalComposeTracingApi
/* loaded from: classes.dex */
public interface CompositionTracer {
    boolean isTraceInProgress();

    void traceEventEnd();

    void traceEventStart(int i8, int i9, int i10, String str);
}
