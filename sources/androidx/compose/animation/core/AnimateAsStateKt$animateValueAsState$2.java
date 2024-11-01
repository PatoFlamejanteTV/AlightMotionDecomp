package androidx.compose.animation.core;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AnimateAsStateKt$animateValueAsState$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ p6.d $channel;
    final /* synthetic */ T $targetValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateAsStateKt$animateValueAsState$2(p6.d dVar, T t8) {
        super(0);
        this.$channel = dVar;
        this.$targetValue = t8;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m186invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m186invoke() {
        this.$channel.x(this.$targetValue);
    }
}
