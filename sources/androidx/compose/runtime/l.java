package androidx.compose.runtime;

/* loaded from: classes.dex */
public abstract /* synthetic */ class l {
    public static Long a(MutableLongState mutableLongState) {
        return Long.valueOf(mutableLongState.getLongValue());
    }

    public static void c(MutableLongState mutableLongState, long j8) {
        mutableLongState.setLongValue(j8);
    }
}
