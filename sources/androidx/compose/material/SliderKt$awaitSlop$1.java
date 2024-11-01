package androidx.compose.material;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.SliderKt", f = "Slider.kt", l = {812}, m = "awaitSlop-8vUncbI")
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
        Object m1305awaitSlop8vUncbI;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m1305awaitSlop8vUncbI = SliderKt.m1305awaitSlop8vUncbI(null, 0L, 0, this);
        return m1305awaitSlop8vUncbI;
    }
}
