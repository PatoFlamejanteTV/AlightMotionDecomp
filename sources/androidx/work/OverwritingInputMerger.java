package androidx.work;

import androidx.work.Data;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class OverwritingInputMerger extends InputMerger {
    @Override // androidx.work.InputMerger
    public Data merge(List<Data> inputs) {
        AbstractC3292y.i(inputs, "inputs");
        Data.Builder builder = new Data.Builder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Data> it = inputs.iterator();
        while (it.hasNext()) {
            Map<String, Object> keyValueMap = it.next().getKeyValueMap();
            AbstractC3292y.h(keyValueMap, "input.keyValueMap");
            linkedHashMap.putAll(keyValueMap);
        }
        builder.putAll(linkedHashMap);
        Data build = builder.build();
        AbstractC3292y.h(build, "output.build()");
        return build;
    }
}
