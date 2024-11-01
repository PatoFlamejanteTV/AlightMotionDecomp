package androidx.work.impl.model;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class c {
    public static void a(WorkTagDao workTagDao, String id, Set tags) {
        AbstractC3292y.i(id, "id");
        AbstractC3292y.i(tags, "tags");
        Iterator it = tags.iterator();
        while (it.hasNext()) {
            workTagDao.insert(new WorkTag((String) it.next(), id));
        }
    }
}
