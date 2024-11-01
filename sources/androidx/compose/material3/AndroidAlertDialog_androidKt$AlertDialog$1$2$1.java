package androidx.compose.material3;

import Q5.I;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AndroidAlertDialog_androidKt$AlertDialog$1$2$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ String $dialogPaneDescription;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAlertDialog_androidKt$AlertDialog$1$2$1(String str) {
        super(1);
        this.$dialogPaneDescription = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f8786a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3292y.i(semantics, "$this$semantics");
        SemanticsPropertiesKt.setPaneTitle(semantics, this.$dialogPaneDescription);
    }
}
