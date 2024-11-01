package androidx.compose.ui.tooling.preview.datasource;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.Q;

/* loaded from: classes.dex */
final class LoremIpsum$generateLoremIpsum$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ int $loremIpsumMaxSize;
    final /* synthetic */ Q $wordsUsed;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoremIpsum$generateLoremIpsum$1(Q q8, int i8) {
        super(0);
        this.$wordsUsed = q8;
        this.$loremIpsumMaxSize = i8;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        List list;
        list = LoremIpsum_androidKt.LOREM_IPSUM_SOURCE;
        Q q8 = this.$wordsUsed;
        int i8 = q8.f34571a;
        q8.f34571a = i8 + 1;
        return (String) list.get(i8 % this.$loremIpsumMaxSize);
    }
}
