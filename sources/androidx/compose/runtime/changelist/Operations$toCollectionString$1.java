package androidx.compose.runtime.changelist;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Operations$toCollectionString$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ String $linePrefix;
    final /* synthetic */ Operations this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Operations$toCollectionString$1(Operations operations, String str) {
        super(1);
        this.this$0 = operations;
        this.$linePrefix = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((Operations$toCollectionString$1) obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(T t8) {
        String formatOpArgumentToString;
        formatOpArgumentToString = this.this$0.formatOpArgumentToString(t8, this.$linePrefix);
        return formatOpArgumentToString;
    }
}
