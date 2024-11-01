package androidx.compose.material;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ void a(AnchoredDragScope anchoredDragScope, float f8, float f9, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                f9 = 0.0f;
            }
            anchoredDragScope.dragTo(f8, f9);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dragTo");
    }
}
