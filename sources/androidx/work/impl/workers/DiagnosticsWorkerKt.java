package androidx.work.impl.workers;

import R5.AbstractC1435t;
import android.os.Build;
import androidx.work.Logger;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.model.WorkTagDao;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class DiagnosticsWorkerKt {
    private static final String TAG;

    static {
        String tagWithPrefix = Logger.tagWithPrefix("DiagnosticsWrkr");
        AbstractC3292y.h(tagWithPrefix, "tagWithPrefix(\"DiagnosticsWrkr\")");
        TAG = tagWithPrefix;
    }

    private static final String workSpecRow(WorkSpec workSpec, String str, Integer num, String str2) {
        return '\n' + workSpec.id + "\t " + workSpec.workerClassName + "\t " + num + "\t " + workSpec.state.name() + "\t " + str + "\t " + str2 + '\t';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String workSpecRows(WorkNameDao workNameDao, WorkTagDao workTagDao, SystemIdInfoDao systemIdInfoDao, List<WorkSpec> list) {
        String str;
        Integer num;
        StringBuilder sb = new StringBuilder();
        if (Build.VERSION.SDK_INT >= 23) {
            str = "Job Id";
        } else {
            str = "Alarm Id";
        }
        sb.append("\n Id \t Class Name\t " + str + "\t State\t Unique Name\t Tags\t");
        for (WorkSpec workSpec : list) {
            SystemIdInfo systemIdInfo = systemIdInfoDao.getSystemIdInfo(WorkSpecKt.generationalId(workSpec));
            if (systemIdInfo != null) {
                num = Integer.valueOf(systemIdInfo.systemId);
            } else {
                num = null;
            }
            sb.append(workSpecRow(workSpec, AbstractC1435t.w0(workNameDao.getNamesForWorkSpecId(workSpec.id), ",", null, null, 0, null, null, 62, null), num, AbstractC1435t.w0(workTagDao.getTagsForWorkSpecId(workSpec.id), ",", null, null, 0, null, null, 62, null)));
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
