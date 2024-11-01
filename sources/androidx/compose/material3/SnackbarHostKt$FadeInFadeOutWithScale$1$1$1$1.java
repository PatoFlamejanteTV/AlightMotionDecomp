package androidx.compose.material3;

import Q5.I;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ SnackbarData $key;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function0 {
        final /* synthetic */ SnackbarData $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SnackbarData snackbarData) {
            super(0);
            this.$key = snackbarData;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.$key.dismiss();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1(SnackbarData snackbarData) {
        super(1);
        this.$key = snackbarData;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f8786a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3292y.i(semantics, "$this$semantics");
        SemanticsPropertiesKt.m4515setLiveRegionhR3wRGc(semantics, LiveRegionMode.Companion.m4492getPolite0phEisY());
        SemanticsPropertiesKt.dismiss$default(semantics, null, new AnonymousClass1(this.$key), 1, null);
    }
}
