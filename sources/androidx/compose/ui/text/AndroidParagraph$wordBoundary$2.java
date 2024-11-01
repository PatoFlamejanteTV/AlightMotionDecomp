package androidx.compose.ui.text;

import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidParagraph$wordBoundary$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ AndroidParagraph this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidParagraph$wordBoundary$2(AndroidParagraph androidParagraph) {
        super(0);
        this.this$0 = androidParagraph;
    }

    @Override // kotlin.jvm.functions.Function0
    public final WordBoundary invoke() {
        TextLayout textLayout;
        Locale textLocale$ui_text_release = this.this$0.getTextLocale$ui_text_release();
        textLayout = this.this$0.layout;
        return new WordBoundary(textLocale$ui_text_release, textLayout.getText());
    }
}
