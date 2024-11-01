package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidTextToolbar$textActionModeCallback$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ AndroidTextToolbar this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextToolbar$textActionModeCallback$1(AndroidTextToolbar androidTextToolbar) {
        super(0);
        this.this$0 = androidTextToolbar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4419invoke();
        return Q5.I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4419invoke() {
        this.this$0.actionMode = null;
    }
}
