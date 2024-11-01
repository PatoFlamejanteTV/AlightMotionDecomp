package androidx.compose.runtime;

/* loaded from: classes.dex */
public abstract /* synthetic */ class k {
    public static Integer a(MutableIntState mutableIntState) {
        return Integer.valueOf(mutableIntState.getIntValue());
    }

    public static void c(MutableIntState mutableIntState, int i8) {
        mutableIntState.setIntValue(i8);
    }
}
