package androidx.compose.ui.platform;

import androidx.compose.ui.text.input.TextInputService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AndroidPlatformTextInputSession$startInputMethod$3$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ InputMethodSession $methodSession;
    final /* synthetic */ AndroidPlatformTextInputSession this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$3$1$1(InputMethodSession inputMethodSession, AndroidPlatformTextInputSession androidPlatformTextInputSession) {
        super(1);
        this.$methodSession = inputMethodSession;
        this.this$0 = androidPlatformTextInputSession;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Q5.I.f8786a;
    }

    public final void invoke(Throwable th) {
        TextInputService textInputService;
        this.$methodSession.dispose();
        textInputService = this.this$0.textInputService;
        textInputService.stopInput();
    }
}
