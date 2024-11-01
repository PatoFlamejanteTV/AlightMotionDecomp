package androidx.room;

import Q5.I;
import androidx.room.AmbiguousColumnResolver;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class AmbiguousColumnResolver$resolve$1$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ int $mappingIndex;
    final /* synthetic */ List<List<AmbiguousColumnResolver.Match>> $mappingMatches;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AmbiguousColumnResolver$resolve$1$2(List<? extends List<AmbiguousColumnResolver.Match>> list, int i8) {
        super(1);
        this.$mappingMatches = list;
        this.$mappingIndex = i8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<Integer>) obj);
        return I.f8786a;
    }

    public final void invoke(List<Integer> indices) {
        AbstractC3292y.i(indices, "indices");
        List<Integer> list = indices;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            while (it.hasNext()) {
                int intValue2 = ((Number) it.next()).intValue();
                if (intValue > intValue2) {
                    intValue = intValue2;
                }
            }
            Iterator<T> it2 = list.iterator();
            if (it2.hasNext()) {
                int intValue3 = ((Number) it2.next()).intValue();
                while (it2.hasNext()) {
                    int intValue4 = ((Number) it2.next()).intValue();
                    if (intValue3 < intValue4) {
                        intValue3 = intValue4;
                    }
                }
                this.$mappingMatches.get(this.$mappingIndex).add(new AmbiguousColumnResolver.Match(new i6.i(intValue, intValue3), indices));
                return;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }
}
