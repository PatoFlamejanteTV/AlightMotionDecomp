package androidx.compose.ui.text.input;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class EditProcessor$generateBatchErrorMessage$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ EditCommand $failedCommand;
    final /* synthetic */ EditProcessor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProcessor$generateBatchErrorMessage$1$1(EditCommand editCommand, EditProcessor editProcessor) {
        super(1);
        this.$failedCommand = editCommand;
        this.this$0 = editProcessor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(EditCommand editCommand) {
        String stringForLog;
        String str = this.$failedCommand == editCommand ? " > " : "   ";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        stringForLog = this.this$0.toStringForLog(editCommand);
        sb.append(stringForLog);
        return sb.toString();
    }
}
