package androidx.work.impl;

import androidx.work.WorkInfo;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class g {
    public static void a(WorkLauncher workLauncher, StartStopToken workSpecId) {
        AbstractC3292y.i(workSpecId, "workSpecId");
        workLauncher.startWork(workSpecId, null);
    }

    public static void b(WorkLauncher workLauncher, StartStopToken workSpecId) {
        AbstractC3292y.i(workSpecId, "workSpecId");
        workLauncher.stopWork(workSpecId, WorkInfo.STOP_REASON_UNKNOWN);
    }

    public static void c(WorkLauncher workLauncher, StartStopToken workSpecId, int i8) {
        AbstractC3292y.i(workSpecId, "workSpecId");
        workLauncher.stopWork(workSpecId, i8);
    }
}
