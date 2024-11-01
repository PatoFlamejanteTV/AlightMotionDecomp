package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.e.w;
import com.mbridge.msdk.foundation.db.BatchReportDao;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f21115a = "f";

    /* renamed from: b, reason: collision with root package name */
    private static String f21116b = "roas";

    /* renamed from: c, reason: collision with root package name */
    private static volatile f f21117c;

    /* renamed from: d, reason: collision with root package name */
    private AtomicInteger f21118d;

    /* renamed from: e, reason: collision with root package name */
    private BatchReportDao f21119e;

    /* renamed from: f, reason: collision with root package name */
    private int f21120f;

    /* renamed from: g, reason: collision with root package name */
    private long f21121g;

    /* renamed from: h, reason: collision with root package name */
    private String f21122h;

    /* renamed from: i, reason: collision with root package name */
    private volatile int f21123i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f21124j;

    /* renamed from: k, reason: collision with root package name */
    private Executor f21125k = Executors.newSingleThreadExecutor();

    /* renamed from: l, reason: collision with root package name */
    private Handler f21126l;

    /* renamed from: m, reason: collision with root package name */
    private Stack<Long> f21127m;

    /* renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.e.m f21128n;

    private f() {
        com.mbridge.msdk.c.a n8;
        boolean z8;
        com.mbridge.msdk.e.o oVar;
        String str;
        this.f21120f = 1;
        this.f21121g = 0L;
        this.f21122h = com.mbridge.msdk.foundation.same.net.g.d.f().f20912F;
        this.f21123i = 0;
        this.f21124j = false;
        com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (b9 != null && (n8 = b9.n()) != null) {
            this.f21120f = n8.a();
            this.f21121g = n8.c() * 1000;
            this.f21122h = com.mbridge.msdk.foundation.same.net.g.d.f().f20912F;
            this.f21123i = n8.b();
            if (n8.d() == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f21124j = z8;
            if (z8 && this.f21123i != 1) {
                int a9 = af.a().a("bcp", "type", af.a().a("t_r_t", 1));
                if (a9 != 0 && a9 != 1) {
                    a9 = 0;
                }
                w.a a10 = new w.a().a(new d()).a(new o());
                if (a9 == 1) {
                    oVar = new com.mbridge.msdk.e.o(new n((byte) 2), com.mbridge.msdk.foundation.same.net.g.d.f().f20943k, com.mbridge.msdk.foundation.same.net.g.d.f().f20947o);
                } else {
                    oVar = new com.mbridge.msdk.e.o(new com.mbridge.msdk.e.a.a.g(), com.mbridge.msdk.foundation.same.net.g.d.f().f20912F, 0);
                }
                this.f21128n = com.mbridge.msdk.e.m.a(f21116b, com.mbridge.msdk.foundation.controller.c.m().c(), a10.a(a9, oVar).e(af.a().a("t_m_e_t", 604800000)).a(af.a().a("t_m_e_s", 50)).d(af.a().a("t_m_r_c", 50)).b(af.a().a("t_m_t", DefaultLoadControl.DEFAULT_MIN_BUFFER_MS)).c(af.a().a("t_m_r_t_s", 2)).a());
                JSONObject a11 = c.a();
                try {
                    if (z.v(com.mbridge.msdk.foundation.controller.c.m().c())) {
                        str = "pad";
                    } else {
                        str = HintConstants.AUTOFILL_HINT_PHONE;
                    }
                    a11.put("device_type", str);
                    if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
                        a11.put(com.mbridge.msdk.foundation.same.net.h.e.f20971g, z.n());
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                this.f21128n.a(a11);
                this.f21128n.a();
            }
        }
        ad.a(f21115a, "初始化批量上报： " + this.f21122h + " " + this.f21120f + " " + this.f21121g + " " + this.f21123i);
        this.f21118d = new AtomicInteger(0);
        this.f21127m = new Stack<>();
        this.f21119e = BatchReportDao.getInstance(com.mbridge.msdk.foundation.controller.c.m().c());
        HandlerThread handlerThread = new HandlerThread("mb_revenue_batch_report_thread");
        handlerThread.start();
        this.f21126l = new Handler(handlerThread.getLooper()) { // from class: com.mbridge.msdk.foundation.same.report.f.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int i8 = message.what;
                int i9 = 0;
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 == 4) {
                                Bundle data = message.getData();
                                if (f.this.f21126l != null && f.this.f21119e != null && data != null && f.this.f21124j) {
                                    f.this.f21126l.removeMessages(4);
                                    ArrayList<BatchReportMessage> batchReportMessages = f.this.f21119e.getBatchReportMessages(System.currentTimeMillis(), 2);
                                    if (batchReportMessages != null && batchReportMessages.size() > 0) {
                                        for (int i10 = 0; i10 < batchReportMessages.size(); i10++) {
                                            BatchReportMessage batchReportMessage = batchReportMessages.get(i10);
                                            f.a(f.this, batchReportMessage.getReportMessage(), batchReportMessage.getTimestamp());
                                        }
                                    }
                                    String str2 = f.f21115a;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("切换上报lib，需要上报的数据： ");
                                    if (batchReportMessages != null) {
                                        i9 = batchReportMessages.size();
                                    }
                                    sb.append(i9);
                                    ad.a(str2, sb.toString());
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        Bundle data2 = message.getData();
                        if (data2 != null) {
                            f.b(f.this, data2.getParcelableArrayList("report_message"), data2.getLong("last_report_time"));
                            return;
                        }
                        return;
                    }
                    Bundle data3 = message.getData();
                    if (f.this.f21126l != null && f.this.f21119e != null && data3 != null) {
                        f.this.f21126l.removeMessages(1);
                        long j8 = data3.getLong("last_report_time");
                        ArrayList<BatchReportMessage> batchReportMessages2 = f.this.f21119e.getBatchReportMessages(j8, 2);
                        f.a(f.this, batchReportMessages2, j8);
                        String str3 = f.f21115a;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("队列上报触发了，需要上报的数据： ");
                        if (batchReportMessages2 != null) {
                            i9 = batchReportMessages2.size();
                        }
                        sb2.append(i9);
                        ad.a(str3, sb2.toString());
                        return;
                    }
                    return;
                }
                Bundle data4 = message.getData();
                if (f.this.f21126l != null && f.this.f21119e != null && data4 != null) {
                    f.this.f21126l.removeMessages(2);
                    long currentTimeMillis = System.currentTimeMillis();
                    ArrayList<BatchReportMessage> batchReportMessages3 = f.this.f21119e.getBatchReportMessages(currentTimeMillis, 2);
                    f.a(f.this, batchReportMessages3, currentTimeMillis);
                    f.this.f21118d.set(0);
                    String str4 = f.f21115a;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("超时上报触发了，需要上报的数据： ");
                    if (batchReportMessages3 != null) {
                        i9 = batchReportMessages3.size();
                    }
                    sb3.append(i9);
                    ad.a(str4, sb3.toString());
                }
            }
        };
    }

    private JSONObject b(String str) {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            for (String str2 : str.split("&")) {
                String[] split = str2.split("=");
                if (split.length == 2) {
                    jSONObject.put(split[0], split[1]);
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i8, String str) {
        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
        dVar.a("state", Integer.valueOf(i8));
        if (i8 == 2) {
            dVar.a("reason", str);
        }
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        bVar.a("m_ad_rev_s_s", dVar);
        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_ad_rev_s_s", bVar);
    }

    public static synchronized f a() {
        f fVar;
        synchronized (f.class) {
            try {
                if (f21117c == null) {
                    f21117c = new f();
                }
                fVar = f21117c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public final void b() {
        Handler handler = this.f21126l;
        if (handler == null || handler.hasMessages(1) || this.f21123i == 1 || this.f21124j) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        this.f21126l.sendMessageDelayed(obtain, 5000L);
    }

    public final synchronized void a(final String str) {
        try {
            if (this.f21123i == 1) {
                return;
            }
            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.f.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (f.this.f21119e != null) {
                        ad.a(f.f21115a, "接收到上报数据： " + str);
                        if (f.this.f21124j) {
                            f.a(f.this, str, 0L);
                            if (((Integer) al.a(com.mbridge.msdk.foundation.controller.c.m().c(), "roas_use_event", 0)).intValue() == 0) {
                                al.b(com.mbridge.msdk.foundation.controller.c.m().c(), "roas_use_event", 1);
                                f.this.f21126l.sendEmptyMessage(4);
                                return;
                            }
                            return;
                        }
                        if (f.this.f21123i != 1) {
                            f.a(f.this, str);
                        }
                    }
                }
            };
            com.mbridge.msdk.foundation.controller.d.a();
            Executor executor = this.f21125k;
            if (executor != null) {
                executor.execute(runnable);
            } else {
                runnable.run();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    static /* synthetic */ void b(f fVar, final ArrayList arrayList, final long j8) {
        if (arrayList != null && arrayList.size() > 0) {
            ad.a(f21115a, "需要上报的数据条数： " + arrayList.size());
            Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
            if (c8 == null) {
                return;
            }
            com.mbridge.msdk.foundation.same.net.h.e a9 = k.a(c8);
            a9.a(MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.m().k());
            a9.a("m_sdk", "msdk");
            a9.a("lqswt", String.valueOf(1));
            a9.a("device_type", z.v(c8) ? "pad" : HintConstants.AUTOFILL_HINT_PHONE);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
                a9.a(com.mbridge.msdk.foundation.same.net.h.e.f20971g, z.n());
            }
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                try {
                    BatchReportMessage batchReportMessage = (BatchReportMessage) arrayList.get(i8);
                    if (batchReportMessage != null) {
                        sb.append(batchReportMessage.getReportMessage() + "&ts=" + batchReportMessage.getTimestamp());
                        if (i8 >= 0 && i8 < size - 1) {
                            sb.append("\n");
                        }
                    }
                } catch (Throwable th) {
                    ad.b(f21115a, th.getMessage());
                }
            }
            try {
                String encode = URLEncoder.encode(sb.toString(), "utf-8");
                a9.a(DataSchemeDataSource.SCHEME_DATA, encode);
                ad.a(f21115a, "需要批量上报的数据： " + encode);
                com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(com.mbridge.msdk.foundation.controller.c.m().c());
                fVar.a(0, "");
                aVar.post(0, fVar.f21122h, a9, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.f.2
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str) {
                        Stack stack;
                        ad.a(f.f21115a, "批量上报失败： " + str);
                        f.this.a(2, str);
                        synchronized (f.this.f21127m) {
                            try {
                                f.this.f21127m.add(Long.valueOf(j8));
                                if (f.this.f21119e != null) {
                                    f.this.f21119e.updateMessagesReportState(arrayList);
                                }
                                if (f.this.f21127m.size() >= 5) {
                                    ad.a(f.f21115a, "批量上报失败，上报失败的数据超过阈值");
                                    try {
                                        try {
                                            f.this.f21127m.pop();
                                            long longValue = ((Long) f.this.f21127m.pop()).longValue();
                                            f.this.f21127m.clear();
                                            if (f.this.f21119e != null) {
                                                f.this.f21119e.deleteBatchReportMessagesByTimestamp(longValue);
                                            }
                                            stack = f.this.f21127m;
                                        } catch (Exception e8) {
                                            ad.b(f.f21115a, e8.getMessage());
                                            stack = f.this.f21127m;
                                        }
                                        stack.clear();
                                    } catch (Throwable th2) {
                                        f.this.f21127m.clear();
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str) {
                        ad.a(f.f21115a, "批量上报成功");
                        f.this.a(1, "");
                        try {
                            if (f.this.f21119e != null) {
                                f.this.f21119e.deleteBatchReportMessagesByTimestamp(j8);
                            }
                        } catch (Exception e8) {
                            ad.b(f.f21115a, e8.getMessage());
                        }
                        synchronized (f.this.f21127m) {
                            f.this.f21127m.clear();
                        }
                    }
                });
                return;
            } catch (Exception e8) {
                ad.b(f21115a, e8.getMessage());
                return;
            }
        }
        ad.a(f21115a, "需要上报的数据条数： 0");
    }

    static /* synthetic */ void a(f fVar, ArrayList arrayList, long j8) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Message obtain = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("report_message", arrayList);
        bundle.putLong("last_report_time", j8);
        obtain.setData(bundle);
        obtain.what = 3;
        fVar.f21126l.sendMessage(obtain);
    }

    static /* synthetic */ void a(f fVar, String str, long j8) {
        if (fVar.f21128n != null) {
            com.mbridge.msdk.e.e eVar = new com.mbridge.msdk.e.e("roas");
            eVar.a(true);
            if (j8 != 0) {
                eVar.a(j8);
            }
            eVar.b(1);
            try {
                eVar.a(fVar.b(str));
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            fVar.f21128n.a(eVar);
        }
    }

    static /* synthetic */ void a(f fVar, String str) {
        fVar.f21119e.addReportMessage(str, 2);
        Handler handler = fVar.f21126l;
        if (handler != null && !handler.hasMessages(1)) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            fVar.f21126l.sendMessageDelayed(obtain, fVar.f21121g);
        }
        if (fVar.f21118d.incrementAndGet() < fVar.f21120f || fVar.f21126l == null) {
            return;
        }
        Message obtain2 = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putLong("last_report_time", System.currentTimeMillis());
        obtain2.setData(bundle);
        obtain2.what = 2;
        fVar.f21126l.sendMessage(obtain2);
        fVar.f21118d.set(0);
    }
}
