package androidx.compose.runtime.changelist;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ String a(OperationsDebugStringFormattable operationsDebugStringFormattable, String str, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                str = "  ";
            }
            return operationsDebugStringFormattable.toDebugString(str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toDebugString");
    }
}
