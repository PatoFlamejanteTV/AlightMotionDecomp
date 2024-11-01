package androidx.compose.ui.text;

import Q5.I;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.V0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MultiParagraph$getPathForRange$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ int $end;
    final /* synthetic */ Path $path;
    final /* synthetic */ int $start;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiParagraph$getPathForRange$2(Path path, int i8, int i9) {
        super(1);
        this.$path = path;
        this.$start = i8;
        this.$end = i9;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ParagraphInfo) obj);
        return I.f8786a;
    }

    public final void invoke(ParagraphInfo paragraphInfo) {
        V0.g(this.$path, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(this.$start), paragraphInfo.toLocalIndex(this.$end))), 0L, 2, null);
    }
}
