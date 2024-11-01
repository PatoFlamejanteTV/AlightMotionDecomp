package androidx.room;

import Q5.I;
import androidx.room.AmbiguousColumnResolver;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.T;

/* loaded from: classes3.dex */
final class AmbiguousColumnResolver$resolve$4 extends AbstractC3293z implements Function1 {
    final /* synthetic */ T $bestSolution;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmbiguousColumnResolver$resolve$4(T t8) {
        super(1);
        this.$bestSolution = t8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<AmbiguousColumnResolver.Match>) obj);
        return I.f8786a;
    }

    public final void invoke(List<AmbiguousColumnResolver.Match> it) {
        AbstractC3292y.i(it, "it");
        AmbiguousColumnResolver.Solution build = AmbiguousColumnResolver.Solution.Companion.build(it);
        if (build.compareTo((AmbiguousColumnResolver.Solution) this.$bestSolution.f34573a) < 0) {
            this.$bestSolution.f34573a = build;
        }
    }
}
