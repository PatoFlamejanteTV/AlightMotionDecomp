package m1;

import R5.AbstractC1435t;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f34955a = new v();

    private v() {
    }

    private final u a(String str, int i8, int i9, boolean z8) {
        return new u(str, i8, i9, z8);
    }

    static /* synthetic */ u b(v vVar, String str, int i8, int i9, boolean z8, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = 0;
        }
        if ((i10 & 8) != 0) {
            z8 = false;
        }
        return vVar.a(str, i8, i9, z8);
    }

    public final List c(Context context) {
        ActivityManager activityManager;
        AbstractC3292y.i(context, "context");
        int i8 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> list = null;
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager != null) {
            list = activityManager.getRunningAppProcesses();
        }
        if (list == null) {
            list = AbstractC1435t.m();
        }
        List j02 = AbstractC1435t.j0(list);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : j02) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i8) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1435t.x(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            AbstractC3292y.h(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new u(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, AbstractC3292y.d(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public final u d(Context context) {
        Object obj;
        AbstractC3292y.i(context, "context");
        int myPid = Process.myPid();
        Iterator it = c(context).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((u) obj).b() == myPid) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        u uVar = (u) obj;
        if (uVar == null) {
            return b(this, e(), myPid, 0, false, 12, null);
        }
        return uVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:            r0 = android.app.Application.getProcessName();     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String e() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L10
            java.lang.String r0 = G0.i.a()
            java.lang.String r1 = "myProcessName()"
            kotlin.jvm.internal.AbstractC3292y.h(r0, r1)
            return r0
        L10:
            r1 = 28
            if (r0 < r1) goto L1b
            java.lang.String r0 = V.l.a()
            if (r0 == 0) goto L1b
            return r0
        L1b:
            java.lang.String r0 = V.m.a()
            if (r0 == 0) goto L22
            return r0
        L22:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.v.e():java.lang.String");
    }
}
