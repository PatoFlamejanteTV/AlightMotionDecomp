package C6;

/* loaded from: classes5.dex */
public abstract class h0 {
    public static /* synthetic */ void c(h0 h0Var, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 1) != 0) {
                i8 = h0Var.d() + 1;
            }
            h0Var.b(i8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
    }

    public abstract Object a();

    public abstract void b(int i8);

    public abstract int d();
}
