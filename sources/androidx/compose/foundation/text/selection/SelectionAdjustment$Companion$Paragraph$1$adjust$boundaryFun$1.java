package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C3289v;

/* loaded from: classes.dex */
/* synthetic */ class SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1 extends C3289v implements Function1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1(Object obj) {
        super(1, obj, StringHelpersKt.class, "getParagraphBoundary", "getParagraphBoundary(Ljava/lang/CharSequence;I)J", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return TextRange.m4657boximpl(m1000invokejx7JFs(((Number) obj).intValue()));
    }

    /* renamed from: invoke--jx7JFs, reason: not valid java name */
    public final long m1000invokejx7JFs(int i8) {
        return StringHelpersKt.getParagraphBoundary((CharSequence) this.receiver, i8);
    }
}
