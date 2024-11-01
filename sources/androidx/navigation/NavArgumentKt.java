package androidx.navigation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class NavArgumentKt {
    public static final List<String> missingRequiredArguments(Map<String, NavArgument> map, Function1 isArgumentMissing) {
        AbstractC3292y.i(map, "<this>");
        AbstractC3292y.i(isArgumentMissing, "isArgumentMissing");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, NavArgument> entry : map.entrySet()) {
            NavArgument value = entry.getValue();
            if (value != null && !value.isNullable() && !value.isDefaultValuePresent()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) isArgumentMissing.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
