package androidx.core.os;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HandlerKt$postDelayed$runnable$1 implements Runnable {
    final /* synthetic */ Function0 $action;

    public HandlerKt$postDelayed$runnable$1(Function0 function0) {
        this.$action = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.$action.invoke();
    }
}
