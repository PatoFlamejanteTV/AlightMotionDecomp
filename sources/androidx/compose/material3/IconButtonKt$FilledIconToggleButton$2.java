package androidx.compose.material3;

import Q5.I;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class IconButtonKt$FilledIconToggleButton$2 extends AbstractC3293z implements Function1 {
    public static final IconButtonKt$FilledIconToggleButton$2 INSTANCE = new IconButtonKt$FilledIconToggleButton$2();

    IconButtonKt$FilledIconToggleButton$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f8786a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3292y.i(semantics, "$this$semantics");
        SemanticsPropertiesKt.m4516setRolekuIjeqM(semantics, Role.Companion.m4501getCheckboxo7Vup1c());
    }
}
