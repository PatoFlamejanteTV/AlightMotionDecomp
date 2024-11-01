package androidx.compose.material3;

import Q5.I;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationDrawerKt$Scrim$dismissDrawer$2$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ String $closeDrawer;
    final /* synthetic */ Function0 $onClose;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function0 {
        final /* synthetic */ Function0 $onClose;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function0 function0) {
            super(0);
            this.$onClose = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.$onClose.invoke();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$Scrim$dismissDrawer$2$1(String str, Function0 function0) {
        super(1);
        this.$closeDrawer = str;
        this.$onClose = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f8786a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3292y.i(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, this.$closeDrawer);
        SemanticsPropertiesKt.onClick$default(semantics, null, new AnonymousClass1(this.$onClose), 1, null);
    }
}
