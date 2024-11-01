package androidx.compose.runtime;

/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static Double a(MutableDoubleState mutableDoubleState) {
        return Double.valueOf(mutableDoubleState.getDoubleValue());
    }

    public static void c(MutableDoubleState mutableDoubleState, double d8) {
        mutableDoubleState.setDoubleValue(d8);
    }
}
