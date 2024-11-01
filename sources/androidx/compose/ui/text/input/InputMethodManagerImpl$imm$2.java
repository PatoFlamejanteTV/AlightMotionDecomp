package androidx.compose.ui.text.input;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class InputMethodManagerImpl$imm$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ InputMethodManagerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputMethodManagerImpl$imm$2(InputMethodManagerImpl inputMethodManagerImpl) {
        super(0);
        this.this$0 = inputMethodManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final android.view.inputmethod.InputMethodManager invoke() {
        View view;
        view = this.this$0.view;
        Object systemService = view.getContext().getSystemService("input_method");
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (android.view.inputmethod.InputMethodManager) systemService;
    }
}
