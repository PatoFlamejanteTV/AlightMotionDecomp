package androidx.compose.material3;

import Q5.I;
import R5.AbstractC1435t;
import androidx.compose.runtime.RecomposeScope;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ SnackbarData $key;
    final /* synthetic */ FadeInFadeOutState<SnackbarData> $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ SnackbarData $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SnackbarData snackbarData) {
            super(1);
            this.$key = snackbarData;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(FadeInFadeOutAnimationItem<SnackbarData> it) {
            AbstractC3292y.i(it, "it");
            return Boolean.valueOf(AbstractC3292y.d(it.getKey(), this.$key));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1(SnackbarData snackbarData, FadeInFadeOutState<SnackbarData> fadeInFadeOutState) {
        super(0);
        this.$key = snackbarData;
        this.$state = fadeInFadeOutState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1745invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1745invoke() {
        if (AbstractC3292y.d(this.$key, this.$state.getCurrent())) {
            return;
        }
        AbstractC1435t.M(this.$state.getItems(), new AnonymousClass1(this.$key));
        RecomposeScope scope = this.$state.getScope();
        if (scope != null) {
            scope.invalidate();
        }
    }
}
