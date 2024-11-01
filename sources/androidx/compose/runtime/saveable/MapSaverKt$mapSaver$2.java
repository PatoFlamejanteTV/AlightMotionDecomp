package androidx.compose.runtime.saveable;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class MapSaverKt$mapSaver$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $restore;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapSaverKt$mapSaver$2(Function1 function1) {
        super(1);
        this.$restore = function1;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final T invoke(List<? extends Object> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.size() % 2 == 0) {
            for (int i8 = 0; i8 < list.size(); i8 += 2) {
                Object obj = list.get(i8);
                AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, list.get(i8 + 1));
            }
            return this.$restore.invoke(linkedHashMap);
        }
        throw new IllegalStateException("non-zero remainder".toString());
    }
}
