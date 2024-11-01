package androidx.compose.foundation.lazy.staggeredgrid;

import c6.InterfaceC2072n;
import kotlin.jvm.internal.C3289v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public /* synthetic */ class LazyStaggeredGridState$scrollPosition$1 extends C3289v implements InterfaceC2072n {
    /* JADX INFO: Access modifiers changed from: package-private */
    public LazyStaggeredGridState$scrollPosition$1(Object obj) {
        super(2, obj, LazyStaggeredGridState.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
    }

    public final int[] invoke(int i8, int i9) {
        int[] fillNearestIndices;
        fillNearestIndices = ((LazyStaggeredGridState) this.receiver).fillNearestIndices(i8, i9);
        return fillNearestIndices;
    }
}
