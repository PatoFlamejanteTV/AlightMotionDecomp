package androidx.work.impl;

import R5.AbstractC1435t;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class StartStopTokens {
    private final Object lock = new Object();
    private final Map<WorkGenerationalId, StartStopToken> runs = new LinkedHashMap();

    public final boolean contains(WorkGenerationalId id) {
        boolean containsKey;
        AbstractC3292y.i(id, "id");
        synchronized (this.lock) {
            containsKey = this.runs.containsKey(id);
        }
        return containsKey;
    }

    public final StartStopToken remove(WorkGenerationalId id) {
        StartStopToken remove;
        AbstractC3292y.i(id, "id");
        synchronized (this.lock) {
            remove = this.runs.remove(id);
        }
        return remove;
    }

    public final StartStopToken tokenFor(WorkGenerationalId id) {
        StartStopToken startStopToken;
        AbstractC3292y.i(id, "id");
        synchronized (this.lock) {
            try {
                Map<WorkGenerationalId, StartStopToken> map = this.runs;
                StartStopToken startStopToken2 = map.get(id);
                if (startStopToken2 == null) {
                    startStopToken2 = new StartStopToken(id);
                    map.put(id, startStopToken2);
                }
                startStopToken = startStopToken2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return startStopToken;
    }

    public final List<StartStopToken> remove(String workSpecId) {
        List<StartStopToken> W02;
        AbstractC3292y.i(workSpecId, "workSpecId");
        synchronized (this.lock) {
            try {
                Map<WorkGenerationalId, StartStopToken> map = this.runs;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<WorkGenerationalId, StartStopToken> entry : map.entrySet()) {
                    if (AbstractC3292y.d(entry.getKey().getWorkSpecId(), workSpecId)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.keySet().iterator();
                while (it.hasNext()) {
                    this.runs.remove((WorkGenerationalId) it.next());
                }
                W02 = AbstractC1435t.W0(linkedHashMap.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return W02;
    }

    public final StartStopToken tokenFor(WorkSpec spec) {
        AbstractC3292y.i(spec, "spec");
        return tokenFor(WorkSpecKt.generationalId(spec));
    }

    public final StartStopToken remove(WorkSpec spec) {
        AbstractC3292y.i(spec, "spec");
        return remove(WorkSpecKt.generationalId(spec));
    }
}
