package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import c6.InterfaceC2072n;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {233}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ Recomposer $newRecomposer;
    final /* synthetic */ View $rootView;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(Recomposer recomposer, View view, U5.d dVar) {
        super(2, dVar);
        this.$newRecomposer = recomposer;
        this.$rootView = view;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(this.$newRecomposer, this.$rootView, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        View view;
        Object e8 = V5.b.e();
        int i8 = this.label;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                Recomposer recomposer = this.$newRecomposer;
                this.label = 1;
                if (recomposer.join(this) == e8) {
                    return e8;
                }
            }
            if (WindowRecomposer_androidKt.getCompositionContext(view) == this.$newRecomposer) {
                WindowRecomposer_androidKt.setCompositionContext(this.$rootView, null);
            }
            return Q5.I.f8786a;
        } finally {
            if (WindowRecomposer_androidKt.getCompositionContext(this.$rootView) == this.$newRecomposer) {
                WindowRecomposer_androidKt.setCompositionContext(this.$rootView, null);
            }
        }
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(n6.M m8, U5.d dVar) {
        return ((WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
    }
}
