package androidx.compose.foundation.text;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.AnnotatedString;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.List;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AnnotatedStringResolveInlineContentKt$InlineChildren$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ List<AnnotatedString.Range<InterfaceC2073o>> $inlineContents;
    final /* synthetic */ AnnotatedString $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotatedStringResolveInlineContentKt$InlineChildren$2(AnnotatedString annotatedString, List<AnnotatedString.Range<InterfaceC2073o>> list, int i8) {
        super(2);
        this.$text = annotatedString;
        this.$inlineContents = list;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        AnnotatedStringResolveInlineContentKt.InlineChildren(this.$text, this.$inlineContents, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
