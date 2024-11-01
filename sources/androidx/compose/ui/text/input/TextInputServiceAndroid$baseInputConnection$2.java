package androidx.compose.ui.text.input;

import android.view.inputmethod.BaseInputConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TextInputServiceAndroid$baseInputConnection$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ TextInputServiceAndroid this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputServiceAndroid$baseInputConnection$2(TextInputServiceAndroid textInputServiceAndroid) {
        super(0);
        this.this$0 = textInputServiceAndroid;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.this$0.getView(), false);
    }
}
