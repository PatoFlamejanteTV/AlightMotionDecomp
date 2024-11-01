package androidx.compose.material.pullrefresh;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C3289v;

/* loaded from: classes.dex */
/* synthetic */ class PullRefreshKt$pullRefresh$2$1 extends C3289v implements Function1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public PullRefreshKt$pullRefresh$2$1(Object obj) {
        super(1, obj, PullRefreshState.class, "onPull", "onPull$material_release(F)F", 0);
    }

    public final Float invoke(float f8) {
        return Float.valueOf(((PullRefreshState) this.receiver).onPull$material_release(f8));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }
}
