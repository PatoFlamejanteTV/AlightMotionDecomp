package androidx.compose.runtime;

/* loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static Float a(MutableFloatState mutableFloatState) {
        return Float.valueOf(mutableFloatState.getFloatValue());
    }

    public static void c(MutableFloatState mutableFloatState, float f8) {
        mutableFloatState.setFloatValue(f8);
    }
}
