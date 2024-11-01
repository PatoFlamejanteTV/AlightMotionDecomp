package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import F.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import u.p;
import u.u;

@RequiresApi(api = 21)
/* loaded from: classes3.dex */
public class JobInfoSchedulerService extends JobService {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i8 = jobParameters.getExtras().getInt("priority");
        int i9 = jobParameters.getExtras().getInt("attemptNumber");
        u.f(getApplicationContext());
        p.a d8 = p.a().b(string).d(a.b(i8));
        if (string2 != null) {
            d8.c(Base64.decode(string2, 0));
        }
        u.c().e().v(d8.a(), i9, new Runnable() { // from class: B.e
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.b(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
