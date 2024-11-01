package androidx.activity.compose;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BackHandlerKt$BackHandler$1$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ BackHandlerKt$BackHandler$backCallback$1$1 $backCallback;
    final /* synthetic */ boolean $enabled;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackHandlerKt$BackHandler$1$1(BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1, boolean z8) {
        super(0);
        this.$backCallback = backHandlerKt$BackHandler$backCallback$1$1;
        this.$enabled = z8;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m76invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m76invoke() {
        setEnabled(this.$enabled);
    }
}
