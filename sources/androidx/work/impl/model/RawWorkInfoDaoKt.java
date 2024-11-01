package androidx.work.impl.model;

import androidx.sqlite.db.SupportSQLiteQuery;
import kotlin.jvm.internal.AbstractC3292y;
import n6.I;
import q6.InterfaceC3821f;

/* loaded from: classes3.dex */
public final class RawWorkInfoDaoKt {
    public static final InterfaceC3821f getWorkInfoPojosFlow(RawWorkInfoDao rawWorkInfoDao, I dispatcher, SupportSQLiteQuery query) {
        AbstractC3292y.i(rawWorkInfoDao, "<this>");
        AbstractC3292y.i(dispatcher, "dispatcher");
        AbstractC3292y.i(query, "query");
        return WorkSpecDaoKt.dedup(rawWorkInfoDao.getWorkInfoPojosFlow(query), dispatcher);
    }
}
