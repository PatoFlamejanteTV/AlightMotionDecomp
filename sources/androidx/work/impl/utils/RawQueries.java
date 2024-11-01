package androidx.work.impl.utils;

import R5.AbstractC1435t;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class RawQueries {
    private static final void bindings(StringBuilder sb, int i8) {
        if (i8 <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = 0; i9 < i8; i9++) {
            arrayList.add("?");
        }
        sb.append(AbstractC1435t.w0(arrayList, ",", null, null, 0, null, null, 62, null));
    }

    public static final SupportSQLiteQuery toRawQuery(WorkQuery workQuery) {
        AbstractC3292y.i(workQuery, "<this>");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        List<WorkInfo.State> states = workQuery.getStates();
        AbstractC3292y.h(states, "states");
        String str = " AND";
        String str2 = " WHERE";
        if (!states.isEmpty()) {
            List<WorkInfo.State> states2 = workQuery.getStates();
            AbstractC3292y.h(states2, "states");
            List<WorkInfo.State> list = states2;
            ArrayList arrayList2 = new ArrayList(AbstractC1435t.x(list, 10));
            for (WorkInfo.State state : list) {
                AbstractC3292y.f(state);
                arrayList2.add(Integer.valueOf(WorkTypeConverters.stateToInt(state)));
            }
            sb.append(" WHERE state IN (");
            bindings(sb, arrayList2.size());
            sb.append(")");
            arrayList.addAll(arrayList2);
            str2 = " AND";
        }
        List<UUID> ids = workQuery.getIds();
        AbstractC3292y.h(ids, "ids");
        if (!ids.isEmpty()) {
            List<UUID> ids2 = workQuery.getIds();
            AbstractC3292y.h(ids2, "ids");
            List<UUID> list2 = ids2;
            ArrayList arrayList3 = new ArrayList(AbstractC1435t.x(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((UUID) it.next()).toString());
            }
            sb.append(str2 + " id IN (");
            bindings(sb, workQuery.getIds().size());
            sb.append(")");
            arrayList.addAll(arrayList3);
            str2 = " AND";
        }
        List<String> tags = workQuery.getTags();
        AbstractC3292y.h(tags, "tags");
        if (!tags.isEmpty()) {
            sb.append(str2 + " id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            bindings(sb, workQuery.getTags().size());
            sb.append("))");
            List<String> tags2 = workQuery.getTags();
            AbstractC3292y.h(tags2, "tags");
            arrayList.addAll(tags2);
        } else {
            str = str2;
        }
        List<String> uniqueWorkNames = workQuery.getUniqueWorkNames();
        AbstractC3292y.h(uniqueWorkNames, "uniqueWorkNames");
        if (!uniqueWorkNames.isEmpty()) {
            sb.append(str + " id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            bindings(sb, workQuery.getUniqueWorkNames().size());
            sb.append("))");
            List<String> uniqueWorkNames2 = workQuery.getUniqueWorkNames();
            AbstractC3292y.h(uniqueWorkNames2, "uniqueWorkNames");
            arrayList.addAll(uniqueWorkNames2);
        }
        sb.append(";");
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "builder.toString()");
        return new SimpleSQLiteQuery(sb2, arrayList.toArray(new Object[0]));
    }
}
