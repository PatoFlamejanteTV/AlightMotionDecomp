package androidx.work.impl;

import androidx.work.Logger;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class WorkDatabasePathHelperKt {
    private static final String[] DATABASE_EXTRA_FILES;
    private static final String TAG;
    public static final String WORK_DATABASE_NAME = "androidx.work.workdb";

    static {
        String tagWithPrefix = Logger.tagWithPrefix("WrkDbPathHelper");
        AbstractC3292y.h(tagWithPrefix, "tagWithPrefix(\"WrkDbPathHelper\")");
        TAG = tagWithPrefix;
        DATABASE_EXTRA_FILES = new String[]{"-journal", "-shm", "-wal"};
    }
}
