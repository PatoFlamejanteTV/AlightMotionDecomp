package androidx.work.impl;

import Q5.r;
import Q5.x;
import R5.Q;
import android.content.Context;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import i6.m;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class WorkDatabasePathHelper {
    public static final WorkDatabasePathHelper INSTANCE = new WorkDatabasePathHelper();

    private WorkDatabasePathHelper() {
    }

    @RequiresApi(23)
    private final File getNoBackupPath(Context context) {
        return new File(Api21Impl.INSTANCE.getNoBackupFilesDir(context), WorkDatabasePathHelperKt.WORK_DATABASE_NAME);
    }

    public static final void migrateDatabase(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        AbstractC3292y.i(context, "context");
        WorkDatabasePathHelper workDatabasePathHelper = INSTANCE;
        File defaultDatabasePath = workDatabasePathHelper.getDefaultDatabasePath(context);
        if (Build.VERSION.SDK_INT >= 23 && defaultDatabasePath.exists()) {
            Logger logger = Logger.get();
            str = WorkDatabasePathHelperKt.TAG;
            logger.debug(str, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry<File, File> entry : workDatabasePathHelper.migrationPaths(context).entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    if (value.exists()) {
                        Logger logger2 = Logger.get();
                        str4 = WorkDatabasePathHelperKt.TAG;
                        logger2.warning(str4, "Over-writing contents of " + value);
                    }
                    if (key.renameTo(value)) {
                        str2 = "Migrated " + key + "to " + value;
                    } else {
                        str2 = "Renaming " + key + " to " + value + " failed";
                    }
                    Logger logger3 = Logger.get();
                    str3 = WorkDatabasePathHelperKt.TAG;
                    logger3.debug(str3, str2);
                }
            }
        }
    }

    public final File getDatabasePath(Context context) {
        AbstractC3292y.i(context, "context");
        if (Build.VERSION.SDK_INT < 23) {
            return getDefaultDatabasePath(context);
        }
        return getNoBackupPath(context);
    }

    public final File getDefaultDatabasePath(Context context) {
        AbstractC3292y.i(context, "context");
        File databasePath = context.getDatabasePath(WorkDatabasePathHelperKt.WORK_DATABASE_NAME);
        AbstractC3292y.h(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public final Map<File, File> migrationPaths(Context context) {
        String[] strArr;
        AbstractC3292y.i(context, "context");
        if (Build.VERSION.SDK_INT >= 23) {
            File defaultDatabasePath = getDefaultDatabasePath(context);
            File databasePath = getDatabasePath(context);
            strArr = WorkDatabasePathHelperKt.DATABASE_EXTRA_FILES;
            LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(Q.d(strArr.length), 16));
            for (String str : strArr) {
                r a9 = x.a(new File(defaultDatabasePath.getPath() + str), new File(databasePath.getPath() + str));
                linkedHashMap.put(a9.c(), a9.d());
            }
            return Q.o(linkedHashMap, x.a(defaultDatabasePath, databasePath));
        }
        return Q.h();
    }
}
