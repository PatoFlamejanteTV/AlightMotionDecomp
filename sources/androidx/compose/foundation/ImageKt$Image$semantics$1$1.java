package androidx.compose.foundation;

import Q5.I;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ImageKt$Image$semantics$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ String $contentDescription;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageKt$Image$semantics$1$1(String str) {
        super(1);
        this.$contentDescription = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f8786a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3292y.i(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, this.$contentDescription);
        SemanticsPropertiesKt.m4516setRolekuIjeqM(semantics, Role.Companion.m4503getImageo7Vup1c());
    }
}
