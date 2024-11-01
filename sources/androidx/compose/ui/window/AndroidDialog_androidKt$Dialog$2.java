package androidx.compose.ui.window;

import Q5.I;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AndroidDialog_androidKt$Dialog$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ DialogWrapper $dialog;
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ Function0 $onDismissRequest;
    final /* synthetic */ DialogProperties $properties;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDialog_androidKt$Dialog$2(DialogWrapper dialogWrapper, Function0 function0, DialogProperties dialogProperties, LayoutDirection layoutDirection) {
        super(0);
        this.$dialog = dialogWrapper;
        this.$onDismissRequest = function0;
        this.$properties = dialogProperties;
        this.$layoutDirection = layoutDirection;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m5408invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5408invoke() {
        this.$dialog.updateParameters(this.$onDismissRequest, this.$properties, this.$layoutDirection);
    }
}
