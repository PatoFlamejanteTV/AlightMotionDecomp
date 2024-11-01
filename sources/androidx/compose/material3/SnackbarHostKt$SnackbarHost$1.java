package androidx.compose.material3;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.compose.ui.platform.AccessibilityManager;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;
import n6.X;

@f(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1", f = "SnackbarHost.kt", l = {232}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SnackbarHostKt$SnackbarHost$1 extends l implements InterfaceC2072n {
    final /* synthetic */ AccessibilityManager $accessibilityManager;
    final /* synthetic */ SnackbarData $currentSnackbarData;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$SnackbarHost$1(SnackbarData snackbarData, AccessibilityManager accessibilityManager, d dVar) {
        super(2, dVar);
        this.$currentSnackbarData = snackbarData;
        this.$accessibilityManager = accessibilityManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new SnackbarHostKt$SnackbarHost$1(this.$currentSnackbarData, this.$accessibilityManager, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z8;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            SnackbarData snackbarData = this.$currentSnackbarData;
            if (snackbarData != null) {
                SnackbarDuration duration = snackbarData.getVisuals().getDuration();
                if (this.$currentSnackbarData.getVisuals().getActionLabel() != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                long millis = SnackbarHostKt.toMillis(duration, z8, this.$accessibilityManager);
                this.label = 1;
                if (X.b(millis, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }
        this.$currentSnackbarData.dismiss();
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((SnackbarHostKt$SnackbarHost$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
