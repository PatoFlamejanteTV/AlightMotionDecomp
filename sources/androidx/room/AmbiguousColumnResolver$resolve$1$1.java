package androidx.room;

import Q5.I;
import androidx.room.AmbiguousColumnResolver;
import c6.InterfaceC2073o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class AmbiguousColumnResolver$resolve$1$1 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ String[] $mapping;
    final /* synthetic */ int $mappingIndex;
    final /* synthetic */ List<List<AmbiguousColumnResolver.Match>> $mappingMatches;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AmbiguousColumnResolver$resolve$1$1(String[] strArr, List<? extends List<AmbiguousColumnResolver.Match>> list, int i8) {
        super(3);
        this.$mapping = strArr;
        this.$mappingMatches = list;
        this.$mappingIndex = i8;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (List<AmbiguousColumnResolver.ResultColumn>) obj3);
        return I.f8786a;
    }

    public final void invoke(int i8, int i9, List<AmbiguousColumnResolver.ResultColumn> resultColumnsSublist) {
        Object obj;
        AbstractC3292y.i(resultColumnsSublist, "resultColumnsSublist");
        String[] strArr = this.$mapping;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            Iterator<T> it = resultColumnsSublist.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC3292y.d(str, ((AmbiguousColumnResolver.ResultColumn) obj).component1())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            AmbiguousColumnResolver.ResultColumn resultColumn = (AmbiguousColumnResolver.ResultColumn) obj;
            if (resultColumn == null) {
                return;
            }
            arrayList.add(Integer.valueOf(resultColumn.getIndex()));
        }
        this.$mappingMatches.get(this.$mappingIndex).add(new AmbiguousColumnResolver.Match(new i6.i(i8, i9 - 1), arrayList));
    }
}
