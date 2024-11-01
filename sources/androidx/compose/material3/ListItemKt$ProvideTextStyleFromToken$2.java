package androidx.compose.material3;

import Q5.I;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composer;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ListItemKt$ProvideTextStyleFromToken$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $color;
    final /* synthetic */ InterfaceC2072n $content;
    final /* synthetic */ TypographyKeyTokens $textToken;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$ProvideTextStyleFromToken$2(long j8, TypographyKeyTokens typographyKeyTokens, InterfaceC2072n interfaceC2072n, int i8) {
        super(2);
        this.$color = j8;
        this.$textToken = typographyKeyTokens;
        this.$content = interfaceC2072n;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        ListItemKt.m1659ProvideTextStyleFromToken3JVO9M(this.$color, this.$textToken, this.$content, composer, this.$$changed | 1);
    }
}
