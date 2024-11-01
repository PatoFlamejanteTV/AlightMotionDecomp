package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material3.SliderKt", f = "Slider.kt", l = {1048}, m = "awaitSlop-8vUncbI")
/* loaded from: classes.dex */
public final class SliderKt$awaitSlop$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SliderKt$awaitSlop$1(U5.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object m1741awaitSlop8vUncbI;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m1741awaitSlop8vUncbI = SliderKt.m1741awaitSlop8vUncbI(null, 0L, 0, this);
        return m1741awaitSlop8vUncbI;
    }
}
