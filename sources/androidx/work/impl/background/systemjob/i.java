package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.net.Uri;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class i {
    public static /* synthetic */ JobInfo.TriggerContentUri a(Uri uri, int i8) {
        return new JobInfo.TriggerContentUri(uri, i8);
    }
}
