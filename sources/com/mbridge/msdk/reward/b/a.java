package com.mbridge.msdk.reward.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.b.a;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.i;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.f;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.reward.adapter.b;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static String f22786b = "";

    /* renamed from: d, reason: collision with root package name */
    public static String f22787d = null;

    /* renamed from: e, reason: collision with root package name */
    public static String f22788e = "";

    /* renamed from: A, reason: collision with root package name */
    private int f22790A;

    /* renamed from: B, reason: collision with root package name */
    private int f22791B;

    /* renamed from: C, reason: collision with root package name */
    private int f22792C;

    /* renamed from: H, reason: collision with root package name */
    private boolean f22797H;

    /* renamed from: P, reason: collision with root package name */
    private Queue<Integer> f22803P;

    /* renamed from: Q, reason: collision with root package name */
    private String f22804Q;

    /* renamed from: Z, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f22813Z;

    /* renamed from: a, reason: collision with root package name */
    b f22814a;
    private List<CampaignEx> aa;

    /* renamed from: l, reason: collision with root package name */
    private Context f22821l;

    /* renamed from: m, reason: collision with root package name */
    private com.mbridge.msdk.reward.adapter.c f22822m;

    /* renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.c f22823n;

    /* renamed from: o, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.a f22824o;

    /* renamed from: p, reason: collision with root package name */
    private volatile InterVideoOutListener f22825p;

    /* renamed from: q, reason: collision with root package name */
    private volatile c f22826q;

    /* renamed from: r, reason: collision with root package name */
    private String f22827r;

    /* renamed from: s, reason: collision with root package name */
    private String f22828s;

    /* renamed from: t, reason: collision with root package name */
    private MBridgeIds f22829t;

    /* renamed from: u, reason: collision with root package name */
    private String f22830u;

    /* renamed from: v, reason: collision with root package name */
    private volatile String f22831v;

    /* renamed from: w, reason: collision with root package name */
    private String f22832w;

    /* renamed from: N, reason: collision with root package name */
    private static ConcurrentHashMap<String, Integer> f22784N = new ConcurrentHashMap<>();

    /* renamed from: O, reason: collision with root package name */
    private static ConcurrentHashMap<String, String> f22785O = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    public static ConcurrentHashMap<String, d> f22789f = new ConcurrentHashMap<>();

    /* renamed from: x, reason: collision with root package name */
    private int f22833x = 0;

    /* renamed from: z, reason: collision with root package name */
    private int f22835z = 2;

    /* renamed from: D, reason: collision with root package name */
    private boolean f22793D = false;

    /* renamed from: E, reason: collision with root package name */
    private boolean f22794E = false;

    /* renamed from: F, reason: collision with root package name */
    private boolean f22795F = false;

    /* renamed from: G, reason: collision with root package name */
    private boolean f22796G = false;

    /* renamed from: I, reason: collision with root package name */
    private boolean f22798I = false;

    /* renamed from: J, reason: collision with root package name */
    private ArrayList<Integer> f22799J = new ArrayList<>(7);

    /* renamed from: K, reason: collision with root package name */
    private boolean f22800K = false;

    /* renamed from: L, reason: collision with root package name */
    private final Object f22801L = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f22815c = false;

    /* renamed from: M, reason: collision with root package name */
    private List<CampaignEx> f22802M = new ArrayList();

    /* renamed from: R, reason: collision with root package name */
    private h f22805R = null;

    /* renamed from: S, reason: collision with root package name */
    private volatile boolean f22806S = true;

    /* renamed from: T, reason: collision with root package name */
    private volatile boolean f22807T = false;

    /* renamed from: U, reason: collision with root package name */
    private volatile boolean f22808U = false;

    /* renamed from: V, reason: collision with root package name */
    private volatile boolean f22809V = false;

    /* renamed from: W, reason: collision with root package name */
    private volatile boolean f22810W = false;

    /* renamed from: X, reason: collision with root package name */
    private volatile boolean f22811X = false;

    /* renamed from: Y, reason: collision with root package name */
    private volatile boolean f22812Y = false;

    /* renamed from: g, reason: collision with root package name */
    volatile boolean f22816g = false;

    /* renamed from: h, reason: collision with root package name */
    volatile boolean f22817h = false;

    /* renamed from: i, reason: collision with root package name */
    volatile boolean f22818i = false;

    /* renamed from: j, reason: collision with root package name */
    volatile boolean f22819j = false;

    /* renamed from: k, reason: collision with root package name */
    volatile boolean f22820k = false;

    /* renamed from: y, reason: collision with root package name */
    private Handler f22834y = new com.mbridge.msdk.reward.b.b(this);

    /* renamed from: com.mbridge.msdk.reward.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class RunnableC0428a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.reward.adapter.c f22876b;

        /* renamed from: c, reason: collision with root package name */
        private final int f22877c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f22878d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f22879e = false;

        /* renamed from: f, reason: collision with root package name */
        private int f22880f;

        /* renamed from: g, reason: collision with root package name */
        private String f22881g;

        /* renamed from: h, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.report.d.b f22882h;

        public RunnableC0428a(com.mbridge.msdk.reward.adapter.c cVar, int i8, boolean z8, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            this.f22876b = cVar;
            this.f22877c = i8;
            this.f22878d = z8;
            if (cVar != null) {
                cVar.e(false);
            }
            this.f22881g = str;
            this.f22882h = bVar;
        }

        public final void a() {
            this.f22879e = true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f22879e) {
                return;
            }
            com.mbridge.msdk.reward.adapter.c cVar = this.f22876b;
            if (cVar != null) {
                cVar.e(true);
            }
            ad.b("RewardVideoController", "adSource=" + this.f22877c + " CommonCancelTimeTask mIsDevCall：" + this.f22878d);
            a.this.a(com.mbridge.msdk.foundation.c.a.b(880023, "v3 is timeout"), this.f22882h);
        }

        public final void a(int i8) {
            this.f22880f = i8;
        }
    }

    /* loaded from: classes4.dex */
    public class b implements com.mbridge.msdk.reward.adapter.a {

        /* renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.reward.adapter.c f22884b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f22885c;

        /* renamed from: d, reason: collision with root package name */
        private RunnableC0428a f22886d;

        public b(com.mbridge.msdk.reward.adapter.c cVar, boolean z8) {
            this.f22884b = cVar;
            this.f22885c = z8;
        }

        public final void a(RunnableC0428a runnableC0428a) {
            this.f22886d = runnableC0428a;
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public final void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            RunnableC0428a runnableC0428a = this.f22886d;
            if (runnableC0428a != null) {
                runnableC0428a.a();
                a.this.f22834y.removeCallbacks(this.f22886d);
            }
            if (a.this.f22826q != null) {
                c.b(a.this.f22826q, a.this.f22831v, a.this.f22828s, bVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            RunnableC0428a runnableC0428a = this.f22886d;
            if (runnableC0428a != null) {
                runnableC0428a.a();
                a.this.f22834y.removeCallbacks(this.f22886d);
            }
            a.this.a(list);
            if (a.this.f22826q != null) {
                a.this.f22826q.a(a.this.f22831v, a.this.f22828s, bVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
            RunnableC0428a runnableC0428a = this.f22886d;
            if (runnableC0428a != null) {
                runnableC0428a.a();
                a.this.f22834y.removeCallbacks(this.f22886d);
            }
            com.mbridge.msdk.reward.adapter.c cVar = this.f22884b;
            if (cVar != null) {
                cVar.a((com.mbridge.msdk.reward.adapter.a) null);
                this.f22884b = null;
            }
            a.this.a(list);
            if (a.this.f22826q != null) {
                a.this.f22826q.a(bVar, bVar2);
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class c {

        /* renamed from: b, reason: collision with root package name */
        private WeakReference<InterVideoOutListener> f22888b;

        /* renamed from: c, reason: collision with root package name */
        private volatile AtomicInteger f22889c;

        /* renamed from: d, reason: collision with root package name */
        private Handler f22890d;

        /* renamed from: e, reason: collision with root package name */
        private String f22891e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f22892f;

        public final void a(String str, String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            Handler handler = this.f22890d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f22888b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f22889c.get() == 2 || this.f22890d == null) {
                return;
            }
            this.f22889c.set(2);
            if (a.this.f22809V) {
                return;
            }
            a.this.f22809V = true;
            if (bVar == null) {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            bVar.b(a.this.f22802M);
            a.a(a.this, "2000048", bVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putString("metrics_data_lrid", bVar.f());
                obtain.setData(bundle);
                obtain.obj = str2;
                obtain.what = 9;
                this.f22890d.sendMessage(obtain);
            }
        }

        private c(InterVideoOutListener interVideoOutListener, Handler handler, String str) {
            this.f22888b = new WeakReference<>(interVideoOutListener);
            this.f22889c = new AtomicInteger(0);
            this.f22890d = handler;
            this.f22891e = str;
        }

        public final void b(String str, String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            Handler handler = this.f22890d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f22888b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f22889c.get() == 2 || this.f22890d == null) {
                return;
            }
            if (this.f22889c.get() == 1) {
                this.f22889c.set(3);
            }
            if (a.this.f22809V) {
                return;
            }
            a.this.f22809V = true;
            if (bVar == null) {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            bVar.a(true);
            bVar.b(a.this.f22802M);
            a.a(a.this, "2000048", bVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putSerializable("metrics_data_lrid", bVar.f());
                obtain.setData(bundle);
                obtain.obj = str2;
                obtain.what = 9;
                this.f22890d.sendMessage(obtain);
            }
            if (a.this.f22810W) {
                this.f22889c.set(2);
            }
        }

        public final void a(com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
            String str;
            if (bVar != null && bVar2 != null) {
                str = bVar.b();
                bVar2.a(bVar);
            } else {
                str = "";
            }
            if (a.this.f22822m != null) {
                a.this.f22822m.a(a.this.f22814a);
                CopyOnWriteArrayList<CampaignEx> e8 = a.this.f22822m.e();
                CampaignEx campaignEx = (a.this.f22802M == null || a.this.f22802M.size() == 0) ? null : (CampaignEx) a.this.f22802M.get(0);
                if (campaignEx == null) {
                    campaignEx = (e8 == null || e8.size() == 0) ? null : e8.get(0);
                }
                CampaignEx campaignEx2 = campaignEx;
                if (a.this.f22794E && ((campaignEx2 == null || TextUtils.isEmpty(campaignEx2.getNLRid())) && ((e8 == null || e8.size() == 0) && a.this.f22822m.a(campaignEx2, true, bVar, 2, bVar2)))) {
                    return;
                } else {
                    a.this.f22822m.a((com.mbridge.msdk.reward.adapter.a) null);
                }
            }
            Handler handler = this.f22890d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f22888b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f22889c.get() == 2 || this.f22890d == null) {
                return;
            }
            a.this.f22810W = true;
            if (!a.this.f22812Y || str.contains("resource load timeout")) {
                a.this.f22811X = true;
            }
            if (a.this.f22809V) {
                this.f22889c.set(2);
            }
            if (a.this.f22810W && a.this.f22811X && !a.this.f22809V) {
                this.f22889c.set(2);
                a.a(a.this, "2000047", bVar2, interVideoOutListener);
                if (interVideoOutListener != null) {
                    Message obtain = Message.obtain();
                    obtain.obj = str;
                    obtain.what = 16;
                    if (bVar2 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", bVar2.f());
                        obtain.setData(bundle);
                    }
                    this.f22890d.sendMessage(obtain);
                }
            }
        }

        static /* synthetic */ void b(c cVar, String str, String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            WeakReference<InterVideoOutListener> weakReference = cVar.f22888b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if ((cVar.f22889c.get() != 1 && cVar.f22889c.get() != 3) || cVar.f22890d == null || a.this.f22808U) {
                return;
            }
            a.this.f22808U = true;
            a.a(a.this, "2000127", bVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, false);
                if (bVar != null) {
                    bundle.putString("metrics_data_lrid", bVar.f());
                }
                obtain.setData(bundle);
                obtain.obj = str2;
                obtain.what = 17;
                cVar.f22890d.sendMessage(obtain);
                if (af.a().a("l_s_i_l_v_s", false)) {
                    cVar.a(str, str2, bVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f22888b;
            a.a(a.this, "2000047", bVar, weakReference != null ? weakReference.get() : null);
            if (this.f22890d != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 18;
                if (bVar != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", bVar.f());
                    obtain.setData(bundle);
                }
                this.f22890d.sendMessage(obtain);
            }
        }

        public final void a(boolean z8) {
            this.f22892f = z8;
        }

        static /* synthetic */ int a(c cVar) {
            return cVar.f22889c.get();
        }

        static /* synthetic */ void a(c cVar, int i8) {
            cVar.f22889c.set(i8);
        }

        static /* synthetic */ void a(c cVar, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            cVar.f22889c.set(2);
            cVar.a(str, bVar);
        }

        static /* synthetic */ void a(c cVar, String str, String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            WeakReference<InterVideoOutListener> weakReference = cVar.f22888b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (cVar.f22890d == null || a.this.f22808U) {
                return;
            }
            a.this.f22808U = true;
            a.a(a.this, "2000127", bVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, true);
                if (bVar != null) {
                    bundle.putString("metrics_data_lrid", bVar.f());
                }
                obtain.setData(bundle);
                obtain.obj = str2;
                obtain.what = 17;
                cVar.f22890d.sendMessage(obtain);
                if (af.a().a("l_s_i_l_v_s", false)) {
                    cVar.b(str, str2, bVar);
                }
            }
        }

        static /* synthetic */ void a(c cVar, com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
            String str;
            WeakReference<InterVideoOutListener> weakReference = cVar.f22888b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (cVar.f22889c.get() == 2 || cVar.f22890d == null) {
                return;
            }
            a.this.f22811X = true;
            if (bVar != null) {
                str = bVar.b();
            } else {
                str = "";
            }
            if (str.contains("resource load timeout")) {
                a.this.f22810W = true;
            }
            if (a.this.f22811X && a.this.f22810W && !a.this.f22809V) {
                cVar.f22889c.set(2);
                if (interVideoOutListener != null) {
                    Message obtain = Message.obtain();
                    obtain.obj = str;
                    obtain.what = 16;
                    if (bVar2 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", bVar2.f());
                        obtain.setData(bundle);
                    }
                    cVar.f22890d.sendMessage(obtain);
                }
                if (bVar2 == null) {
                    bVar2 = new com.mbridge.msdk.foundation.same.report.d.b();
                }
                bVar2.a(true);
                a.a(a.this, "2000047", bVar2, interVideoOutListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class d extends com.mbridge.msdk.video.bt.module.b.b {

        /* renamed from: d, reason: collision with root package name */
        private a f22894d;

        /* renamed from: e, reason: collision with root package name */
        private Handler f22895e;

        /* renamed from: f, reason: collision with root package name */
        private int f22896f;

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void b(String str, String str2) {
            try {
                a aVar = this.f22894d;
                if (aVar != null && aVar.f22825p != null) {
                    try {
                        this.f22894d.f22825p.onEndcardShow(a.this.f22829t);
                        com.mbridge.msdk.foundation.d.b.a().a(str2 + "_2", 2);
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoController", e8.getMessage());
                        }
                    }
                    this.f22896f = 6;
                }
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e9.getMessage());
                }
            }
        }

        private d(a aVar, Handler handler) {
            this.f22896f = 0;
            this.f22894d = aVar;
            this.f22895e = handler;
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
            a.this.f22815c = false;
            try {
                com.mbridge.msdk.reward.a.a aVar = new com.mbridge.msdk.reward.a.a(a.this.f22828s, a.this.f22793D);
                a aVar2 = this.f22894d;
                aVar.a(bVar.f(), (aVar2 == null || aVar2.f22822m == null) ? "" : this.f22894d.f22822m.f22702c, 3, a.f22786b);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e8.getMessage());
                }
            }
            try {
                a aVar3 = this.f22894d;
                if (aVar3 != null) {
                    aVar3.f22800K = true;
                    if (this.f22894d.f22822m != null) {
                        this.f22894d.f22822m.f22702c = "";
                    }
                    final a aVar4 = this.f22894d;
                    com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                if (a.this.f22805R == null) {
                                    a.this.f22805R = h.a(com.mbridge.msdk.foundation.controller.c.m().c());
                                }
                                i a9 = i.a(a.this.f22805R);
                                if (a9 != null) {
                                    a9.a(a.this.f22828s);
                                }
                            } catch (Throwable unused) {
                                ad.b("RewardVideoController", "can't find DailyPlayCapDao");
                            }
                        }
                    });
                    if (a.this.f22794E) {
                        a.this.c();
                    }
                    a aVar5 = a.this;
                    aVar5.a("2000130", bVar, aVar5.f22825p, "");
                    this.f23209b = true;
                    if (this.f22894d.f22825p != null) {
                        this.f22894d.f22825p.onAdShow(a.this.f22829t);
                        this.f22896f = 2;
                    }
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", th.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, boolean z8, com.mbridge.msdk.videocommon.b.c cVar) {
            try {
                a aVar = this.f22894d;
                if (aVar != null && aVar.f22825p != null) {
                    if (cVar == null) {
                        cVar = com.mbridge.msdk.videocommon.b.c.b(this.f22894d.f22832w);
                    }
                    if (a.this.f22794E) {
                        a.this.c();
                        a.this.b();
                        com.mbridge.msdk.foundation.same.a.d.d(a.this.f22828s, a.this.a());
                    }
                    this.f22894d.f22825p.onAdClose(a.this.f22829t, new RewardInfo(z8, cVar.a(), String.valueOf(cVar.b())));
                    this.f22896f = 7;
                    this.f22894d.f22800K = false;
                    a.this.f22799J.clear();
                    this.f22894d = null;
                }
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e8.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str) {
            try {
                a aVar = a.this;
                aVar.f22815c = false;
                if (this.f22894d != null) {
                    if (aVar.f22794E) {
                        a.this.c();
                    }
                    this.f22894d.f22800K = false;
                    a.this.a("2000131", bVar, this.f22894d.f22825p, str);
                    this.f23210c = true;
                    if (this.f22894d.f22825p != null) {
                        try {
                            this.f22894d.f22825p.onShowFail(bVar, a.this.f22829t, str);
                        } catch (Exception e8) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("RewardVideoController", e8.getMessage());
                            }
                        }
                        this.f22896f = 4;
                    }
                }
            } catch (Exception e9) {
                this.f22896f = 0;
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e9.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(boolean z8, String str, String str2) {
            try {
                a aVar = this.f22894d;
                if (aVar == null || aVar.f22825p == null) {
                    return;
                }
                if (a.this.f22794E) {
                    a.this.c();
                }
                this.f22894d.f22800K = false;
                try {
                    this.f22894d.f22825p.onVideoAdClicked(z8, a.this.f22829t);
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e8.getMessage());
                    }
                }
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e9.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(String str, String str2) {
            try {
                a aVar = this.f22894d;
                if (aVar == null || aVar.f22825p == null) {
                    return;
                }
                try {
                    this.f22894d.f22825p.onVideoComplete(a.this.f22829t);
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e8.getMessage());
                    }
                }
                this.f22896f = 5;
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e9.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(boolean z8, int i8) {
            try {
                a aVar = this.f22894d;
                if (aVar != null && aVar.f22825p != null) {
                    try {
                        this.f22894d.f22825p.onAdCloseWithIVReward(a.this.f22829t, new RewardInfo(z8, i8));
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoController", e8.getMessage());
                        }
                    }
                }
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e9.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(int i8, String str, String str2) {
            this.f22896f = i8;
            a aVar = this.f22894d;
            if (aVar == null || aVar.f22794E || this.f22894d.f22793D || this.f22894d.f22823n == null || !this.f22894d.f22823n.s(this.f22896f) || this.f22894d.f22826q == null || c.a(this.f22894d.f22826q) == 1 || c.a(this.f22894d.f22826q) == 3 || a.this.f22799J.contains(Integer.valueOf(this.f22896f))) {
                return;
            }
            a.this.f22799J.add(Integer.valueOf(this.f22896f));
            int A8 = this.f22894d.f22823n.A() * 1000;
            if (this.f22896f == 4) {
                A8 = PathInterpolatorCompat.MAX_NUM_POINTS;
            }
            Handler handler = this.f22895e;
            if (handler != null) {
                handler.removeMessages(1001001);
                this.f22895e.sendEmptyMessageDelayed(1001001, A8);
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.d.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i9;
                        if (d.this.f22894d != null) {
                            com.mbridge.msdk.foundation.same.report.d.c a9 = com.mbridge.msdk.foundation.same.report.d.c.a();
                            if (a.this.f22793D) {
                                i9 = 287;
                            } else {
                                i9 = 94;
                            }
                            d.this.f22894d.a(false, a9.a(0, i9, a.this.f22828s, true, 1));
                        }
                    }
                }, A8);
            }
        }
    }

    public static void insertExcludeId(String str, CampaignEx campaignEx) {
        if (!TextUtils.isEmpty(str) && campaignEx != null && com.mbridge.msdk.foundation.controller.c.m().c() != null) {
            j a9 = j.a(h.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            f fVar = new f();
            fVar.a(System.currentTimeMillis());
            fVar.b(str);
            fVar.a(campaignEx.getId());
            a9.a(fVar);
        }
    }

    private void p() {
        com.mbridge.msdk.foundation.db.f.a(h.a(this.f22821l)).a(this.f22828s);
    }

    private void q() {
        try {
            List<CampaignEx> b9 = com.mbridge.msdk.foundation.db.f.a(h.a(this.f22821l)).b(this.f22828s);
            if (b9 == null || b9.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : b9) {
                if (!TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                    com.mbridge.msdk.videocommon.a.b(this.f22828s + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl());
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        com.mbridge.msdk.videocommon.a.b(this.f22828s + "_" + campaignEx.getId() + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e());
                    }
                } else {
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getAdType(), campaignEx);
                }
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e8.getMessage());
            }
        }
    }

    private void r() {
        com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(this.f22821l, this.f22831v, this.f22828s);
        this.f22822m = cVar;
        cVar.b(this.f22793D);
        this.f22822m.c(this.f22794E);
        if (this.f22793D) {
            this.f22822m.a(this.f22790A, this.f22791B, this.f22792C);
        }
        this.f22822m.a(this.f22823n);
    }

    private boolean s() {
        try {
            if (this.f22805R == null) {
                this.f22805R = h.a(com.mbridge.msdk.foundation.controller.c.m().c());
            }
            i a9 = i.a(this.f22805R);
            if (this.f22823n == null) {
                this.f22823n = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f22828s, this.f22793D);
            }
            int d8 = this.f22823n.d();
            if (a9 != null) {
                return a9.a(this.f22828s, d8);
            }
            return false;
        } catch (Throwable unused) {
            ad.b("RewardVideoController", "cap check error");
            return false;
        }
    }

    public final List<CampaignEx> f() {
        return this.aa;
    }

    public final com.mbridge.msdk.reward.adapter.c g() {
        return this.f22822m;
    }

    public final boolean h() {
        return this.f22797H;
    }

    public final String i() {
        return this.f22828s;
    }

    public final String j() {
        return this.f22831v;
    }

    public final c k() {
        return this.f22826q;
    }

    public final InterVideoOutListener l() {
        return this.f22825p;
    }

    public final boolean m() {
        return this.f22794E;
    }

    public final MBridgeIds n() {
        return this.f22829t;
    }

    public final boolean o() {
        return this.f22793D;
    }

    private boolean e(boolean z8) {
        if (z8) {
            d("is_ready_start", "");
        }
        if (this.f22822m == null) {
            r();
        }
        List<com.mbridge.msdk.foundation.entity.c> a9 = com.mbridge.msdk.videocommon.a.a.a().a(this.f22828s);
        if (a9 == null || a9.size() <= 0) {
            if (!z8) {
                return false;
            }
            d("is_ready_ctir_false", "no effective campaign list");
            return false;
        }
        String b9 = com.mbridge.msdk.foundation.same.a.d.b(this.f22828s);
        boolean a10 = TextUtils.isEmpty(b9) ? false : a(a9, b9);
        if (z8) {
            d("is_ready_ctir_" + a10, "");
        }
        if (a10) {
            return a10;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : a9) {
            if (cVar != null) {
                this.f22822m.a(cVar.a());
                this.f22822m.f22703d = cVar.d();
                if (this.f22822m.d(z8)) {
                    return true;
                }
            }
        }
        return a10;
    }

    public final void b(boolean z8) {
        this.f22794E = z8;
    }

    public final void c(boolean z8) {
        this.f22798I = z8;
    }

    public final boolean d(boolean z8) {
        try {
            if (s()) {
                if (!z8) {
                    return false;
                }
                d("is_ready_start", "over cap check error");
                return false;
            }
            if (this.f22794E) {
                try {
                    return e(z8);
                } catch (Exception e8) {
                    if (!MBridgeConstans.DEBUG) {
                        return false;
                    }
                    ad.b("RewardVideoController", e8.getMessage());
                    return false;
                }
            }
            if (this.f22822m == null) {
                r();
            }
            com.mbridge.msdk.reward.adapter.c cVar = this.f22822m;
            if (cVar != null) {
                return cVar.b();
            }
            return false;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            ad.b("RewardVideoController", th.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.reward.b.a$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass4 implements b.i {

        /* renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.d.b f22862a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f22863b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f22864c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f22865d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f22866e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f22867f;

        AnonymousClass4(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar, boolean z8, int i8) {
            this.f22863b = campaignEx;
            this.f22864c = copyOnWriteArrayList;
            this.f22865d = cVar;
            this.f22866e = z8;
            this.f22867f = i8;
            this.f22862a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.i
        public final void a(final String str, final String str2, final String str3, String str4) {
            a.this.f22817h = true;
            if (!a.this.f22816g || a.this.f22818i || a.this.f22834y == null) {
                return;
            }
            a.this.f22818i = true;
            a.this.f22834y.post(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.4.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.mbridge.msdk.reward.adapter.b a9 = com.mbridge.msdk.reward.adapter.b.a();
                    boolean z8 = a.this.f22798I;
                    Handler handler = a.this.f22834y;
                    boolean z9 = a.this.f22793D;
                    boolean z10 = a.this.f22794E;
                    String str5 = str3;
                    String requestIdNotice = AnonymousClass4.this.f22863b.getRequestIdNotice();
                    String str6 = str;
                    String str7 = str2;
                    String cMPTEntryUrl = AnonymousClass4.this.f22863b.getCMPTEntryUrl();
                    int i8 = a.this.f22835z;
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    a9.a(z8, handler, z9, z10, str5, requestIdNotice, str6, str7, cMPTEntryUrl, i8, anonymousClass4.f22863b, anonymousClass4.f22864c, H5DownLoadManager.getInstance().getH5ResAddress(AnonymousClass4.this.f22863b.getCMPTEntryUrl()), str2, a.this.f22823n, new b.j() { // from class: com.mbridge.msdk.reward.b.a.4.1.1
                        @Override // com.mbridge.msdk.reward.adapter.b.j
                        public final void a(String str8, String str9, String str10, String str11, String str12, a.C0440a c0440a) {
                            AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                            com.mbridge.msdk.reward.adapter.c cVar = anonymousClass42.f22865d;
                            if (cVar != null && cVar.a(anonymousClass42.f22864c, anonymousClass42.f22866e, anonymousClass42.f22867f)) {
                                if (a.this.f22826q == null || a.this.f22820k) {
                                    return;
                                }
                                a.this.f22820k = true;
                                ad.a("RewardVideoController", "Cache onVideoLoadSuccess");
                                AnonymousClass4 anonymousClass43 = AnonymousClass4.this;
                                a.this.a(anonymousClass43.f22864c);
                                AnonymousClass4 anonymousClass44 = AnonymousClass4.this;
                                com.mbridge.msdk.foundation.same.report.d.b bVar = anonymousClass44.f22862a;
                                if (bVar != null) {
                                    bVar.b(anonymousClass44.f22864c);
                                }
                                a.this.f22826q.b(str9, str10, AnonymousClass4.this.f22862a);
                                return;
                            }
                            a aVar = a.this;
                            a.a(aVar, str10, aVar.aa);
                            if (a.this.f22826q == null || a.this.f22819j) {
                                return;
                            }
                            a.this.f22819j = true;
                            com.mbridge.msdk.foundation.c.b b9 = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                            AnonymousClass4 anonymousClass45 = AnonymousClass4.this;
                            if (anonymousClass45.f22862a == null) {
                                anonymousClass45.f22862a = new com.mbridge.msdk.foundation.same.report.d.b();
                            }
                            AnonymousClass4 anonymousClass46 = AnonymousClass4.this;
                            anonymousClass46.f22862a.b(anonymousClass46.f22864c);
                            AnonymousClass4.this.f22862a.a(b9);
                            c.a(a.this.f22826q, b9, AnonymousClass4.this.f22862a);
                        }

                        @Override // com.mbridge.msdk.reward.adapter.b.j
                        public final void a(String str8, String str9, String str10, a.C0440a c0440a, com.mbridge.msdk.foundation.c.b bVar) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            a aVar = a.this;
                            a.a(aVar, str2, aVar.aa);
                            if (a.this.f22826q == null || a.this.f22819j) {
                                return;
                            }
                            a.this.f22819j = true;
                            if (bVar != null) {
                                bVar.a("errorCode: 3303 errorMessage: tpl temp preload failed");
                            }
                            AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                            if (anonymousClass42.f22862a == null) {
                                anonymousClass42.f22862a = new com.mbridge.msdk.foundation.same.report.d.b();
                            }
                            AnonymousClass4 anonymousClass43 = AnonymousClass4.this;
                            anonymousClass43.f22862a.b(anonymousClass43.f22864c);
                            AnonymousClass4.this.f22862a.a(bVar);
                            c.a(a.this.f22826q, bVar, AnonymousClass4.this.f22862a);
                        }
                    }, true);
                }
            });
        }

        @Override // com.mbridge.msdk.reward.adapter.b.i
        public final void a(String str, String str2, com.mbridge.msdk.foundation.c.b bVar) {
            String str3;
            if (bVar != null) {
                str3 = bVar.d().getUnitId();
                bVar.a("errorCode: 3203 errorMessage: tpl temp resource download failed");
            } else {
                str3 = "";
            }
            a aVar = a.this;
            a.a(aVar, str3, aVar.aa);
            if (this.f22862a == null) {
                this.f22862a = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            this.f22862a.a(bVar);
            this.f22862a.b(this.f22864c);
            a.this.f22817h = false;
            if (a.this.f22826q == null || a.this.f22819j) {
                return;
            }
            a.this.f22819j = true;
            c.a(a.this.f22826q, bVar, this.f22862a);
        }
    }

    public final void b() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (!this.f22800K || (concurrentHashMap = f22785O) == null || concurrentHashMap.containsKey(a())) {
            return;
        }
        f22785O.remove(a());
    }

    public final void c() {
        try {
            String str = "";
            MBridgeIds mBridgeIds = this.f22829t;
            if (mBridgeIds != null) {
                if (!this.f22800K) {
                    mBridgeIds.setBidToken("");
                    return;
                }
                String a9 = a();
                if (TextUtils.isEmpty(a9)) {
                    return;
                }
                ConcurrentHashMap<String, String> concurrentHashMap = f22785O;
                if (concurrentHashMap != null && concurrentHashMap.containsKey(a9) && !TextUtils.isEmpty(f22785O.get(a9))) {
                    str = f22785O.get(a9);
                }
                this.f22829t.setBidToken(str);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final void a(boolean z8) {
        this.f22793D = z8;
        if (z8) {
            this.f22835z = com.mbridge.msdk.foundation.same.a.f20651W;
        } else {
            this.f22835z = com.mbridge.msdk.foundation.same.a.f20650V;
        }
    }

    public final void b(String str, String str2) {
        try {
            this.f22821l = com.mbridge.msdk.foundation.controller.c.m().c();
            this.f22828s = str2;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f22831v = str;
            this.f22829t = new MBridgeIds(this.f22831v, this.f22828s);
            this.f22824o = com.mbridge.msdk.videocommon.d.b.a().b();
            com.mbridge.msdk.foundation.same.f.b.b().execute(new com.mbridge.msdk.reward.b.c(this.f22821l, this.f22828s));
            if (this.f22805R == null) {
                this.f22805R = h.a(com.mbridge.msdk.foundation.controller.c.m().c());
            }
        } catch (Throwable th) {
            ad.a("RewardVideoController", th.getMessage(), th);
        }
    }

    public final void a(int i8) {
        this.f22835z = i8;
    }

    public final String a() {
        com.mbridge.msdk.reward.adapter.c cVar = this.f22822m;
        if (cVar != null) {
            return cVar.a(this.f22800K);
        }
        return "";
    }

    public final void a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            al.b(this.f22821l, "MBridge_ConfirmTitle" + this.f22828s, str.trim());
        }
        if (!TextUtils.isEmpty(str2)) {
            al.b(this.f22821l, "MBridge_ConfirmContent" + this.f22828s, str2.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            al.b(this.f22821l, "MBridge_CancelText" + this.f22828s, str4.trim());
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        al.b(this.f22821l, "MBridge_ConfirmText" + this.f22828s, str3.trim());
    }

    private com.mbridge.msdk.foundation.same.report.d.b b(boolean z8, String str, com.mbridge.msdk.foundation.same.report.d.d dVar) {
        List<String> e8;
        String a9;
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        try {
            if (z8) {
                try {
                    com.mbridge.msdk.foundation.db.f a10 = com.mbridge.msdk.foundation.db.f.a(h.a(this.f22821l));
                    if (a10 != null && (e8 = a10.e(this.f22828s)) != null && e8.size() > 0) {
                        Iterator<String> it = e8.iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.foundation.same.report.d.c.a().c(it.next());
                        }
                    }
                    LinkedHashMap<String, com.mbridge.msdk.foundation.same.report.d.b> b9 = com.mbridge.msdk.foundation.same.report.d.c.a().b();
                    if (b9 != null && b9.size() > 0) {
                        Iterator<Map.Entry<String, com.mbridge.msdk.foundation.same.report.d.b>> it2 = b9.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry<String, com.mbridge.msdk.foundation.same.report.d.b> next = it2.next();
                            if (next != null && next.getValue().s()) {
                                it2.remove();
                            }
                        }
                    }
                } catch (Exception e9) {
                    if (MBridgeConstans.DEBUG) {
                        e9.printStackTrace();
                    }
                }
            }
            if (TextUtils.isEmpty(str)) {
                a9 = SameMD5.getMD5(ai.d());
            } else {
                a9 = a(str);
            }
            bVar = com.mbridge.msdk.foundation.same.report.d.c.a().b(a9);
            if (bVar == null) {
                com.mbridge.msdk.foundation.same.report.d.b bVar2 = new com.mbridge.msdk.foundation.same.report.d.b();
                try {
                    com.mbridge.msdk.foundation.same.report.d.c.a().b().put(a9, bVar2);
                    bVar2.d(true);
                    bVar = bVar2;
                } catch (Exception e10) {
                    e = e10;
                    bVar = bVar2;
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e.getMessage());
                    }
                    return bVar;
                }
            }
            bVar.c(a9);
            bVar.d(this.f22828s);
            String str2 = "1";
            if (dVar != null) {
                if (dVar.a("adtp")) {
                    bVar.b(Integer.parseInt((String) dVar.b("adtp")));
                }
                if (dVar.a(CampaignEx.JSON_KEY_HB)) {
                    String str3 = (String) dVar.b(CampaignEx.JSON_KEY_HB);
                    bVar.i(str3);
                    if (str3.equals("1")) {
                        bVar.e(str);
                    }
                }
            }
            if (z8) {
                str2 = "2";
            }
            bVar.b(str2);
            if (z8) {
                com.mbridge.msdk.reward.c.a.a.a().a("2000123", bVar);
            }
        } catch (Exception e11) {
            e = e11;
        }
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            com.mbridge.msdk.reward.adapter.c r0 = r4.f22822m     // Catch: java.lang.Exception -> Lf
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.a()     // Catch: java.lang.Exception -> Lf
            boolean r0 = r5.equals(r0)     // Catch: java.lang.Exception -> Lf
            if (r0 != 0) goto L28
            goto L11
        Lf:
            r0 = move-exception
            goto L37
        L11:
            com.mbridge.msdk.reward.adapter.c r0 = new com.mbridge.msdk.reward.adapter.c     // Catch: java.lang.Exception -> Lf
            android.content.Context r1 = r4.f22821l     // Catch: java.lang.Exception -> Lf
            java.lang.String r2 = r4.f22831v     // Catch: java.lang.Exception -> Lf
            r0.<init>(r1, r2, r5)     // Catch: java.lang.Exception -> Lf
            r4.f22822m = r0     // Catch: java.lang.Exception -> Lf
            boolean r1 = r4.f22793D     // Catch: java.lang.Exception -> Lf
            r0.b(r1)     // Catch: java.lang.Exception -> Lf
            com.mbridge.msdk.reward.adapter.c r0 = r4.f22822m     // Catch: java.lang.Exception -> Lf
            boolean r1 = r4.f22794E     // Catch: java.lang.Exception -> Lf
            r0.c(r1)     // Catch: java.lang.Exception -> Lf
        L28:
            com.mbridge.msdk.reward.adapter.c r0 = r4.f22822m     // Catch: java.lang.Exception -> Lf
            int r1 = r4.f22835z     // Catch: java.lang.Exception -> Lf
            r0.a(r1)     // Catch: java.lang.Exception -> Lf
            com.mbridge.msdk.reward.adapter.c r0 = r4.f22822m     // Catch: java.lang.Exception -> Lf
            com.mbridge.msdk.videocommon.d.c r1 = r4.f22823n     // Catch: java.lang.Exception -> Lf
            r0.a(r1)     // Catch: java.lang.Exception -> Lf
            goto L44
        L37:
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r1 == 0) goto L44
            java.lang.String r1 = "RewardVideoController"
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r1, r0)
        L44:
            com.mbridge.msdk.videocommon.a.a r0 = com.mbridge.msdk.videocommon.a.a.a()
            boolean r1 = r4.f22794E
            r2 = 1
            java.util.List r0 = r0.a(r5, r2, r1)
            com.mbridge.msdk.videocommon.a.a r1 = com.mbridge.msdk.videocommon.a.a.a()
            boolean r3 = r4.f22794E
            java.util.List r1 = r1.b(r5, r2, r3)
            r4.aa = r1
            if (r0 == 0) goto L98
            int r1 = r0.size()
            if (r1 <= 0) goto L98
            com.mbridge.msdk.videocommon.a.a r1 = com.mbridge.msdk.videocommon.a.a.a()
            r1.a(r5, r0, r6)
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r5 = r4.f22813Z
            if (r5 != 0) goto L76
            java.util.concurrent.CopyOnWriteArrayList r5 = new java.util.concurrent.CopyOnWriteArrayList
            r5.<init>()
            r4.f22813Z = r5
            goto L79
        L76:
            r5.clear()
        L79:
            java.util.Iterator r5 = r0.iterator()
        L7d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r0 = r5.next()
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            r0.setLocalRequestId(r6)
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r4.f22813Z
            r1.add(r0)
            goto L7d
        L92:
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r5 = r4.f22813Z
            r4.a(r5)
            return r2
        L98:
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r5 = r4.f22813Z
            if (r5 == 0) goto L9f
            r5.clear()
        L9f:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.b.a.c(java.lang.String, java.lang.String):boolean");
    }

    public final String d() {
        com.mbridge.msdk.reward.adapter.c cVar = this.f22822m;
        if (cVar != null) {
            return cVar.f();
        }
        return "";
    }

    private void d(String str, String str2) {
        try {
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            bVar.d(this.f22828s);
            bVar.b(this.f22793D ? 287 : 94);
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("event_name", str);
            dVar.a("reason", str2);
            bVar.a("m_temp_is_ready_check", dVar);
            com.mbridge.msdk.reward.c.a.a.a().a("m_temp_is_ready_check", bVar);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final CopyOnWriteArrayList<CampaignEx> e() {
        return this.f22813Z;
    }

    public final void a(int i8, int i9, int i10) {
        this.f22790A = i8;
        this.f22791B = i9;
        if (i9 == com.mbridge.msdk.foundation.same.a.f20638J) {
            this.f22792C = i10 < 0 ? 5 : i10;
        }
        if (i9 == com.mbridge.msdk.foundation.same.a.f20637I) {
            this.f22792C = i10 < 0 ? 80 : i10;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ivRewardEnable", 1);
            jSONObject.put("ivRewardMode", i8 == com.mbridge.msdk.foundation.same.a.f20635G ? 0 : 1);
            jSONObject.put("ivRewardPlayValueMode", i9 == com.mbridge.msdk.foundation.same.a.f20637I ? 0 : 1);
            jSONObject.put("ivRewardPlayValue", i10);
            com.mbridge.msdk.c.h.a().f(this.f22828s, jSONObject.toString());
        } catch (Exception unused) {
            ad.b("RewardVideoController", "setIVRewardEnable to SP was ERROR");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.reward.b.a$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2 implements b.c {

        /* renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.d.b f22837a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f22838b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f22839c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f22840d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f22841e;

        AnonymousClass2(CampaignEx campaignEx, boolean z8, com.mbridge.msdk.reward.adapter.c cVar, int i8) {
            this.f22838b = campaignEx;
            this.f22839c = z8;
            this.f22840d = cVar;
            this.f22841e = i8;
            this.f22837a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.c
        public final void a(final String str, final String str2, final String str3, final CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            a.this.f22816g = true;
            if (!this.f22839c) {
                Iterator<CampaignEx> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    final CampaignEx next = it.next();
                    if (next != null && next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().e()) && !next.getRewardTemplateMode().e().contains(CampaignEx.KEY_IS_CMPT_ENTRY) && a.this.f22834y != null) {
                        a.this.f22834y.post(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.mbridge.msdk.reward.adapter.b.a().a(a.this.f22798I, a.this.f22834y, a.this.f22793D, a.this.f22794E, null, next.getRewardTemplateMode().e(), a.this.f22835z, AnonymousClass2.this.f22838b, copyOnWriteArrayList, H5DownLoadManager.getInstance().getH5ResAddress(next.getRewardTemplateMode().e()), str, str2, str3, next.getRequestIdNotice(), a.this.f22823n, new b.j() { // from class: com.mbridge.msdk.reward.b.a.2.1.1
                                    @Override // com.mbridge.msdk.reward.adapter.b.j
                                    public final void a(String str4, String str5, String str6, String str7, String str8, a.C0440a c0440a) {
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        com.mbridge.msdk.reward.adapter.c cVar = anonymousClass2.f22840d;
                                        if (cVar != null && cVar.a(copyOnWriteArrayList, anonymousClass2.f22839c, anonymousClass2.f22841e)) {
                                            if (a.this.f22826q == null || a.this.f22820k) {
                                                return;
                                            }
                                            a.this.f22820k = true;
                                            AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                            a.this.a(copyOnWriteArrayList);
                                            a.this.f22826q.b(str5, str6, AnonymousClass2.this.f22837a);
                                            return;
                                        }
                                        a aVar = a.this;
                                        a.a(aVar, str6, aVar.aa);
                                        if (a.this.f22826q == null || a.this.f22819j) {
                                            return;
                                        }
                                        a.this.f22819j = true;
                                        com.mbridge.msdk.foundation.c.b b9 = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                                        AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                        if (anonymousClass22.f22837a == null) {
                                            anonymousClass22.f22837a = new com.mbridge.msdk.foundation.same.report.d.b();
                                        }
                                        AnonymousClass1 anonymousClass13 = AnonymousClass1.this;
                                        AnonymousClass2.this.f22837a.b(copyOnWriteArrayList);
                                        AnonymousClass2.this.f22837a.a(b9);
                                        c.a(a.this.f22826q, b9, AnonymousClass2.this.f22837a);
                                    }

                                    @Override // com.mbridge.msdk.reward.adapter.b.j
                                    public final void a(String str4, String str5, String str6, a.C0440a c0440a, com.mbridge.msdk.foundation.c.b bVar) {
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        a aVar = a.this;
                                        a.a(aVar, str2, aVar.aa);
                                        if (a.this.f22826q == null || a.this.f22819j) {
                                            return;
                                        }
                                        a.this.f22819j = true;
                                        bVar.a("errorCode: 3301 errorMessage: temp preload failed");
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        if (anonymousClass2.f22837a == null) {
                                            anonymousClass2.f22837a = new com.mbridge.msdk.foundation.same.report.d.b();
                                        }
                                        AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                        anonymousClass22.f22837a.b(a.this.f22813Z);
                                        AnonymousClass2.this.f22837a.a(bVar);
                                        c.a(a.this.f22826q, bVar, AnonymousClass2.this.f22837a);
                                    }
                                });
                            }
                        });
                    } else {
                        com.mbridge.msdk.reward.adapter.c cVar = this.f22840d;
                        if (cVar != null && cVar.a(copyOnWriteArrayList, this.f22839c, this.f22841e)) {
                            if (a.this.f22826q != null && !a.this.f22820k) {
                                a.this.f22820k = true;
                                ad.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                                a.this.a(copyOnWriteArrayList);
                                com.mbridge.msdk.foundation.same.report.d.b bVar = this.f22837a;
                                if (bVar != null) {
                                    bVar.b(copyOnWriteArrayList);
                                }
                                a.this.f22826q.b(str, str2, this.f22837a);
                            }
                        } else {
                            a aVar = a.this;
                            a.a(aVar, str2, aVar.aa);
                            if (a.this.f22826q != null && !a.this.f22819j) {
                                a.this.f22819j = true;
                                com.mbridge.msdk.foundation.c.b b9 = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                                if (this.f22837a == null) {
                                    this.f22837a = new com.mbridge.msdk.foundation.same.report.d.b();
                                }
                                this.f22837a.b(a.this.f22813Z);
                                this.f22837a.a(b9);
                                c.a(a.this.f22826q, b9, this.f22837a);
                            }
                        }
                    }
                }
                return;
            }
            if (!a.this.f22817h || a.this.f22818i || a.this.f22834y == null) {
                return;
            }
            a.this.f22818i = true;
            a.this.f22834y.post(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.2.2
                @Override // java.lang.Runnable
                public final void run() {
                    com.mbridge.msdk.reward.adapter.b.a().a(a.this.f22798I, a.this.f22834y, a.this.f22793D, a.this.f22794E, str3, AnonymousClass2.this.f22838b.getRequestIdNotice(), str, str2, AnonymousClass2.this.f22838b.getCMPTEntryUrl(), a.this.f22835z, AnonymousClass2.this.f22838b, copyOnWriteArrayList, H5DownLoadManager.getInstance().getH5ResAddress(AnonymousClass2.this.f22838b.getCMPTEntryUrl()), str2, a.this.f22823n, new b.j() { // from class: com.mbridge.msdk.reward.b.a.2.2.1
                        @Override // com.mbridge.msdk.reward.adapter.b.j
                        public final void a(String str4, String str5, String str6, String str7, String str8, a.C0440a c0440a) {
                            RunnableC04262 runnableC04262 = RunnableC04262.this;
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            com.mbridge.msdk.reward.adapter.c cVar2 = anonymousClass2.f22840d;
                            if (cVar2 != null && cVar2.a(copyOnWriteArrayList, anonymousClass2.f22839c, anonymousClass2.f22841e)) {
                                if (a.this.f22826q == null || a.this.f22820k) {
                                    return;
                                }
                                a.this.f22820k = true;
                                ad.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                                RunnableC04262 runnableC042622 = RunnableC04262.this;
                                a.this.a(copyOnWriteArrayList);
                                RunnableC04262 runnableC042623 = RunnableC04262.this;
                                com.mbridge.msdk.foundation.same.report.d.b bVar2 = AnonymousClass2.this.f22837a;
                                if (bVar2 != null) {
                                    bVar2.b(copyOnWriteArrayList);
                                }
                                a.this.f22826q.b(str5, str6, AnonymousClass2.this.f22837a);
                                return;
                            }
                            a aVar2 = a.this;
                            a.a(aVar2, str6, aVar2.aa);
                            if (a.this.f22826q == null || a.this.f22819j) {
                                return;
                            }
                            a.this.f22819j = true;
                            com.mbridge.msdk.foundation.c.b b10 = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3504 errorMessage: tpl temp preload success but isReady false");
                            AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                            if (anonymousClass22.f22837a == null) {
                                anonymousClass22.f22837a = new com.mbridge.msdk.foundation.same.report.d.b();
                            }
                            AnonymousClass2.this.f22837a.a(b10);
                            RunnableC04262 runnableC042624 = RunnableC04262.this;
                            AnonymousClass2.this.f22837a.b(copyOnWriteArrayList);
                            c.a(a.this.f22826q, b10, AnonymousClass2.this.f22837a);
                        }

                        @Override // com.mbridge.msdk.reward.adapter.b.j
                        public final void a(String str4, String str5, String str6, a.C0440a c0440a, com.mbridge.msdk.foundation.c.b bVar2) {
                            RunnableC04262 runnableC04262 = RunnableC04262.this;
                            a aVar2 = a.this;
                            a.a(aVar2, str2, aVar2.aa);
                            if (a.this.f22826q == null || a.this.f22819j) {
                                return;
                            }
                            a.this.f22819j = true;
                            if (bVar2 != null) {
                                bVar2.a("errorCode: 3302 errorMessage: tpl preload failed");
                            }
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            if (anonymousClass2.f22837a == null) {
                                anonymousClass2.f22837a = new com.mbridge.msdk.foundation.same.report.d.b();
                            }
                            RunnableC04262 runnableC042622 = RunnableC04262.this;
                            AnonymousClass2.this.f22837a.b(copyOnWriteArrayList);
                            AnonymousClass2.this.f22837a.a(bVar2);
                            c.a(a.this.f22826q, bVar2, AnonymousClass2.this.f22837a);
                        }
                    }, true);
                }
            });
        }

        @Override // com.mbridge.msdk.reward.adapter.b.c
        public final void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.c.b bVar) {
            a.this.f22816g = false;
            a aVar = a.this;
            a.a(aVar, aVar.f22828s, a.this.aa);
            if (a.this.f22826q == null || a.this.f22819j) {
                return;
            }
            a.this.f22819j = true;
            if (this.f22837a == null) {
                this.f22837a = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            this.f22837a.b(copyOnWriteArrayList);
            if (bVar != null) {
                bVar.a("errorCode: 3201 errorMessage: campaign resource download failed");
            }
            this.f22837a.a(bVar);
            c.a(a.this.f22826q, bVar, this.f22837a);
        }
    }

    public static void a(String str, int i8) {
        try {
            if (f22784N == null || !an.b(str)) {
                return;
            }
            f22784N.put(str, Integer.valueOf(i8));
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e8.getMessage());
            }
        }
    }

    public static void a(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (concurrentHashMap = f22785O) == null || concurrentHashMap.containsKey(str)) {
            return;
        }
        f22785O.put(str, str2);
    }

    public final void a(InterVideoOutListener interVideoOutListener) {
        this.f22825p = interVideoOutListener;
        this.f22826q = new c(interVideoOutListener, this.f22834y, this.f22828s);
    }

    public final void a(boolean z8, com.mbridge.msdk.foundation.same.report.d.d dVar) {
        a(z8, "", dVar);
    }

    public final void a(boolean z8, String str, com.mbridge.msdk.foundation.same.report.d.d dVar) {
        com.mbridge.msdk.foundation.same.report.d.b b9 = b(z8, str, dVar);
        if (this.f22826q == null) {
            this.f22826q = new c(null, this.f22834y, this.f22828s);
        }
        if (this.f22826q != null && c.a(this.f22826q) == 1) {
            a(z8, b9);
            return;
        }
        if (this.f22826q != null && c.a(this.f22826q) == 3) {
            this.f22806S = false;
        } else {
            this.f22806S = true;
            if (this.f22826q != null) {
                c.a(this.f22826q, 1);
            }
        }
        this.f22797H = z8;
        this.f22834y.removeMessages(1001001);
        this.f22809V = false;
        this.f22808U = false;
        this.f22810W = false;
        this.f22811X = false;
        q();
        p();
        com.mbridge.msdk.reward.adapter.b.a();
        try {
            if (TextUtils.isEmpty(str)) {
                if (this.f22793D) {
                    com.mbridge.msdk.d.b.getInstance().addInterstitialList(this.f22831v, this.f22828s);
                } else {
                    com.mbridge.msdk.d.b.getInstance().addRewardList(this.f22831v, this.f22828s);
                }
            }
            if (this.f22794E && TextUtils.isEmpty(str)) {
                b(b9);
                return;
            }
            if (com.mbridge.msdk.system.a.map == null) {
                a(b9);
                return;
            }
            com.mbridge.msdk.videocommon.d.c a9 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f22828s);
            this.f22823n = a9;
            if (a9 == null) {
                this.f22804Q = com.mbridge.msdk.foundation.controller.c.m().k();
                com.mbridge.msdk.videocommon.d.b.a().a(this.f22804Q, com.mbridge.msdk.foundation.controller.c.m().b(), this.f22828s, new com.mbridge.msdk.videocommon.c.c() { // from class: com.mbridge.msdk.reward.b.a.1
                    @Override // com.mbridge.msdk.videocommon.c.c
                    public final void a(String str2) {
                    }

                    @Override // com.mbridge.msdk.videocommon.c.c
                    public final void b(String str2) {
                    }
                });
                this.f22823n = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f22828s, this.f22793D);
            }
            if (!TextUtils.isEmpty(this.f22831v)) {
                this.f22823n.b(this.f22831v);
            }
            int F8 = this.f22823n.F() * 1000;
            if (this.f22834y != null) {
                Message obtain = Message.obtain();
                obtain.what = 1001002;
                if (b9 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", b9.f());
                    obtain.setData(bundle);
                }
                this.f22834y.sendMessageDelayed(obtain, F8);
            }
            this.f22803P = this.f22823n.B();
            try {
                a(z8, str, b9);
            } catch (Exception e8) {
                if (this.f22826q != null) {
                    com.mbridge.msdk.foundation.c.b b10 = com.mbridge.msdk.foundation.c.a.b(880020, "load exception");
                    if (b9 != null) {
                        b9.a(b10);
                        b9.c(true);
                    }
                    this.f22826q.a(b10, b9);
                }
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e8.getMessage());
                }
            }
        } catch (Exception e9) {
            if (this.f22826q != null) {
                com.mbridge.msdk.foundation.c.b b11 = com.mbridge.msdk.foundation.c.a.b(880001, "");
                if (b9 != null) {
                    b9.a(b11);
                    b9.c(true);
                }
                this.f22826q.a(b11, b9);
            }
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e9.getMessage());
            }
        }
    }

    private void b(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.f22826q != null) {
            com.mbridge.msdk.foundation.c.b b9 = com.mbridge.msdk.foundation.c.a.b(880035, "");
            if (bVar != null) {
                bVar.a(b9);
                bVar.c(true);
            }
            c.a(this.f22826q, "bidToken is empty", bVar);
        }
    }

    private void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.f22826q != null) {
            String a9 = com.mbridge.msdk.foundation.c.a.a(880001, "");
            com.mbridge.msdk.foundation.c.b b9 = com.mbridge.msdk.foundation.c.a.b(880001, "");
            if (bVar != null) {
                bVar.a(b9);
                bVar.c(true);
            }
            c.a(this.f22826q, a9, bVar);
        }
    }

    private void a(boolean z8, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (!this.f22797H) {
            if (z8) {
                this.f22797H = z8;
            }
        } else if (z8) {
            String a9 = com.mbridge.msdk.foundation.c.a.a(880016, "errorCode: 3501 errorMessage: current unit is loading");
            com.mbridge.msdk.foundation.c.b b9 = com.mbridge.msdk.foundation.c.a.b(880016, "errorCode: 3501 errorMessage: current unit is loading");
            if (bVar != null) {
                bVar.a(b9);
                bVar.c(true);
            }
            this.f22826q.a(a9, bVar);
        }
    }

    private void a(boolean z8, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        com.mbridge.msdk.reward.a.a aVar;
        com.mbridge.msdk.reward.a.a aVar2;
        if (this.f22826q != null) {
            if (!this.f22794E) {
                this.f22812Y = c(this.f22828s, bVar.f());
                if (this.f22812Y) {
                    if (!s()) {
                        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f22813Z;
                        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                            return;
                        }
                        try {
                            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar.a("cache", 1);
                            bVar.a("2000127", dVar);
                            bVar.a("2000048", dVar);
                            bVar.a(copyOnWriteArrayList);
                        } catch (Exception e8) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("RewardVideoController", e8.getMessage());
                            }
                        }
                        c.a(this.f22826q, this.f22831v, this.f22828s, bVar);
                        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
                        this.f22826q.a(this.f22794E);
                        com.mbridge.msdk.reward.adapter.c cVar = this.f22822m;
                        if (cVar != null && cVar.a(copyOnWriteArrayList, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
                            a(copyOnWriteArrayList);
                            this.f22826q.b(this.f22831v, this.f22828s, bVar);
                        } else {
                            a(copyOnWriteArrayList, this.f22822m);
                        }
                        if (this.f22806S) {
                            com.mbridge.msdk.reward.adapter.c cVar2 = this.f22822m;
                            if (cVar2 != null) {
                                cVar2.a(this.f22813Z);
                            }
                            a(this.f22803P, z8, str, bVar);
                            return;
                        }
                        return;
                    }
                    ad.a("RewardVideoController", "非BID，本地存在可用的缓存，超过上限");
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f22813Z;
                    if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.size() > 0) {
                        Iterator<CampaignEx> it = this.f22813Z.iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.a.a.a().a(it.next(), this.f22828s);
                        }
                    }
                    com.mbridge.msdk.reward.adapter.c cVar3 = this.f22822m;
                    if (cVar3 != null) {
                        cVar3.a(this.f22813Z);
                    }
                    if (z8) {
                        if (this.f22826q != null) {
                            String a9 = com.mbridge.msdk.foundation.c.a.a(880019, "");
                            bVar.a(com.mbridge.msdk.foundation.c.a.b(880019, ""));
                            bVar.c(true);
                            c.a(this.f22826q, a9, bVar);
                            return;
                        }
                        return;
                    }
                    this.f22812Y = false;
                    this.f22826q.a(this.f22794E);
                    a(this.f22803P, z8, str, bVar);
                    return;
                }
                if (!s()) {
                    this.f22812Y = false;
                    com.mbridge.msdk.reward.adapter.c cVar4 = this.f22822m;
                    if (cVar4 != null) {
                        cVar4.a(this.f22813Z);
                    }
                    this.f22826q.a(this.f22794E);
                    a(this.f22803P, z8, str, bVar);
                    return;
                }
                if (z8) {
                    if (this.f22826q != null) {
                        String a10 = com.mbridge.msdk.foundation.c.a.a(880019, "");
                        bVar.a(com.mbridge.msdk.foundation.c.a.b(880019, ""));
                        bVar.c(true);
                        c.a(this.f22826q, a10, bVar);
                        return;
                    }
                    return;
                }
                this.f22812Y = false;
                com.mbridge.msdk.reward.adapter.c cVar5 = this.f22822m;
                if (cVar5 != null) {
                    cVar5.a(this.f22813Z);
                }
                this.f22826q.a(this.f22794E);
                a(this.f22803P, z8, str, bVar);
                return;
            }
            CopyOnWriteArrayList<CampaignEx> a11 = com.mbridge.msdk.videocommon.a.a.a().a(this.f22828s, 1, this.f22794E, "");
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList3 = null;
            if (a11 != null && a11.size() > 0) {
                if (!s()) {
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList4 = new CopyOnWriteArrayList<>();
                    if (a11.size() > 0 && !TextUtils.isEmpty(str)) {
                        for (CampaignEx campaignEx2 : a11) {
                            if (campaignEx2 != null && str.equals(campaignEx2.getBidToken())) {
                                copyOnWriteArrayList4.add(campaignEx2);
                            }
                        }
                    }
                    if (copyOnWriteArrayList4.size() > 0) {
                        a(copyOnWriteArrayList4, str, bVar);
                        return;
                    }
                    try {
                        com.mbridge.msdk.reward.a.a aVar3 = new com.mbridge.msdk.reward.a.a(this.f22828s, this.f22793D);
                        com.mbridge.msdk.foundation.b.c cVar6 = new com.mbridge.msdk.foundation.b.c();
                        if (aVar3.a(str)) {
                            if (this.f22822m == null) {
                                com.mbridge.msdk.reward.adapter.c cVar7 = new com.mbridge.msdk.reward.adapter.c(this.f22821l, this.f22831v, this.f22828s);
                                this.f22822m = cVar7;
                                cVar7.b(this.f22793D);
                                this.f22822m.c(this.f22794E);
                                if (this.f22793D) {
                                    this.f22822m.a(this.f22790A, this.f22791B, this.f22792C);
                                }
                                this.f22822m.a(this.f22835z);
                                this.f22822m.a(this.f22823n);
                            }
                            aVar2 = aVar3;
                            cVar6 = aVar3.a(str, bVar, (CampaignEx) null, new com.mbridge.msdk.foundation.c.b(880038), 1, this.f22822m);
                            if (cVar6 != null && cVar6.g() == com.mbridge.msdk.foundation.b.c.f20263d && cVar6.a() != null && cVar6.a().size() > 0 && this.f22822m != null) {
                                CopyOnWriteArrayList<CampaignEx> a12 = cVar6.a();
                                ArrayList arrayList = new ArrayList();
                                Iterator<CampaignEx> it2 = a11.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    CampaignEx next = it2.next();
                                    if (next != null) {
                                        String requestId = next.getRequestId();
                                        if (!TextUtils.isEmpty(requestId)) {
                                            for (int i8 = 0; i8 < a12.size(); i8++) {
                                                CampaignEx campaignEx3 = a12.get(i8);
                                                if (campaignEx3 != null) {
                                                    if (requestId.equals(campaignEx3.getRequestId())) {
                                                        break;
                                                    } else if (i8 == a12.size() - 1) {
                                                        arrayList.add(next);
                                                    }
                                                }
                                            }
                                            if (a12.size() == 0) {
                                                arrayList.add(next);
                                            }
                                        }
                                    }
                                }
                                this.f22822m.a(arrayList);
                                this.f22822m.a(cVar6.a(), false, true);
                                copyOnWriteArrayList3 = new CopyOnWriteArrayList<>(cVar6.a());
                            }
                        } else {
                            aVar2 = aVar3;
                            copyOnWriteArrayList3 = a(str, a11);
                            if (copyOnWriteArrayList3.size() > 0) {
                                com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(str, copyOnWriteArrayList3);
                            }
                            cVar6.d("cb is closed");
                            cVar6.a(com.mbridge.msdk.foundation.b.c.f20262c);
                        }
                        aVar2.a(bVar, str, cVar6, (List<a.C0396a>) null, (JSONObject) null, 1);
                        if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
                            a(copyOnWriteArrayList3, str, bVar);
                            if (this.f22822m != null && !aVar2.a(str)) {
                                this.f22822m.a(copyOnWriteArrayList3);
                            }
                        }
                    } catch (Exception e9) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoController", e9.getMessage());
                        }
                    }
                    this.f22812Y = false;
                    this.f22826q.a(this.f22794E);
                    a(this.f22803P, z8, str, bVar);
                    return;
                }
                com.mbridge.msdk.videocommon.a.a.a().a(this.f22828s, str);
                if (!z8 || this.f22826q == null) {
                    return;
                }
                String a13 = com.mbridge.msdk.foundation.c.a.a(880019, "");
                com.mbridge.msdk.foundation.c.b b9 = com.mbridge.msdk.foundation.c.a.b(880019, "");
                if (bVar != null) {
                    bVar.a(b9);
                    bVar.c(true);
                }
                c.a(this.f22826q, a13, bVar);
                return;
            }
            if (!s()) {
                try {
                    com.mbridge.msdk.reward.a.a aVar4 = new com.mbridge.msdk.reward.a.a(this.f22828s, this.f22793D);
                    com.mbridge.msdk.foundation.b.c cVar8 = new com.mbridge.msdk.foundation.b.c();
                    if (aVar4.a(str)) {
                        if (this.f22822m == null) {
                            com.mbridge.msdk.reward.adapter.c cVar9 = new com.mbridge.msdk.reward.adapter.c(this.f22821l, this.f22831v, this.f22828s);
                            this.f22822m = cVar9;
                            cVar9.b(this.f22793D);
                            this.f22822m.c(this.f22794E);
                            if (this.f22793D) {
                                this.f22822m.a(this.f22790A, this.f22791B, this.f22792C);
                            }
                            this.f22822m.a(this.f22835z);
                            this.f22822m.a(this.f22823n);
                        }
                        aVar = aVar4;
                        cVar8 = aVar4.a(str, bVar, (CampaignEx) null, new com.mbridge.msdk.foundation.c.b(880038), 1, this.f22822m);
                        if (cVar8 != null && cVar8.g() == com.mbridge.msdk.foundation.b.c.f20263d && cVar8.a() != null && cVar8.a().size() > 0 && this.f22822m != null) {
                            CopyOnWriteArrayList<CampaignEx> a14 = cVar8.a();
                            if (a11 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<CampaignEx> it3 = a11.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    CampaignEx next2 = it3.next();
                                    if (next2 != null) {
                                        String requestId2 = next2.getRequestId();
                                        if (!TextUtils.isEmpty(requestId2)) {
                                            for (int i9 = 0; i9 < a14.size(); i9++) {
                                                CampaignEx campaignEx4 = a14.get(i9);
                                                if (campaignEx4 != null) {
                                                    if (requestId2.equals(campaignEx4.getRequestId())) {
                                                        break;
                                                    } else if (i9 == a14.size() - 1) {
                                                        arrayList2.add(next2);
                                                    }
                                                }
                                            }
                                            if (a14.size() == 0) {
                                                arrayList2.add(next2);
                                            }
                                        }
                                    }
                                }
                                this.f22822m.a(arrayList2);
                            }
                            this.f22822m.a(cVar8.a(), false, true);
                            copyOnWriteArrayList3 = new CopyOnWriteArrayList<>(cVar8.a());
                        }
                    } else {
                        aVar = aVar4;
                        copyOnWriteArrayList3 = a(str, a11);
                        if (copyOnWriteArrayList3.size() > 0) {
                            com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(str, copyOnWriteArrayList3);
                        }
                        cVar8.d("cb is closed 2");
                        cVar8.a(com.mbridge.msdk.foundation.b.c.f20262c);
                    }
                    aVar.a(bVar, str, cVar8, (List<a.C0396a>) null, (JSONObject) null, 1);
                    if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
                        a(copyOnWriteArrayList3, str, bVar);
                        if (this.f22822m != null && !aVar.a(str)) {
                            this.f22822m.a(copyOnWriteArrayList3);
                        }
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e10.getMessage());
                    }
                }
                this.f22812Y = false;
                this.f22826q.a(this.f22794E);
                a(this.f22803P, z8, str, bVar);
                return;
            }
            com.mbridge.msdk.videocommon.a.a.a().a(this.f22828s, str);
            if (!z8 || this.f22826q == null) {
                return;
            }
            String a15 = com.mbridge.msdk.foundation.c.a.a(880019, "");
            com.mbridge.msdk.foundation.c.b b10 = com.mbridge.msdk.foundation.c.a.b(880019, "");
            if (bVar != null) {
                bVar.a(b10);
                bVar.c(true);
            }
            c.a(this.f22826q, a15, bVar);
        }
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("cache", 1);
            bVar.a("2000127", dVar);
            bVar.a("2000048", dVar);
            bVar.a(copyOnWriteArrayList);
        } catch (Exception e8) {
            ad.b("RewardVideoController", e8.getMessage());
        }
        this.f22812Y = true;
        this.f22826q.a(this.f22794E);
        c.a(this.f22826q, this.f22831v, this.f22828s, bVar);
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        a(campaignEx.getRequestId(), str);
        com.mbridge.msdk.reward.adapter.c cVar = this.f22822m;
        if (cVar != null && cVar.a(copyOnWriteArrayList, true ^ TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
            a(copyOnWriteArrayList);
            this.f22826q.b(this.f22831v, this.f22828s, bVar);
        } else {
            a(copyOnWriteArrayList, this.f22822m);
        }
    }

    private CopyOnWriteArrayList<CampaignEx> a(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int i8 = 1;
                    for (CampaignEx campaignEx : list) {
                        if (campaignEx != null) {
                            if (campaignEx.getVcn() > i8) {
                                i8 = campaignEx.getVcn();
                            }
                            if (campaignEx.getTokenRule() == 1) {
                                String requestId = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId)) {
                                    if (linkedHashMap.containsKey(requestId)) {
                                        List list2 = (List) linkedHashMap.get(requestId);
                                        if (list2 != null) {
                                            list2.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(campaignEx);
                                        linkedHashMap.put(requestId, arrayList);
                                    }
                                }
                            } else {
                                String requestId2 = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId2)) {
                                    if (linkedHashMap2.containsKey(requestId2)) {
                                        List list3 = (List) linkedHashMap2.get(requestId2);
                                        if (list3 != null) {
                                            list3.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(campaignEx);
                                        linkedHashMap2.put(requestId2, arrayList2);
                                    }
                                }
                            }
                        }
                    }
                    if (linkedHashMap2.size() + linkedHashMap.size() >= i8 && linkedHashMap.size() > 0 && linkedHashMap.entrySet() != null && linkedHashMap.entrySet().iterator() != null && linkedHashMap.entrySet().iterator().next() != null && ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue() != null) {
                        copyOnWriteArrayList.addAll((Collection) ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue());
                        com.mbridge.msdk.foundation.same.a.d.a(this.f22828s, str, i8);
                    }
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e8.getMessage());
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar) {
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        boolean z8 = !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        int nscpt = campaignEx.getNscpt();
        this.f22816g = false;
        this.f22817h = false;
        this.f22818i = false;
        this.f22819j = false;
        this.f22820k = false;
        com.mbridge.msdk.reward.adapter.b.a().a(this.f22821l, z8, nscpt, this.f22794E, this.f22793D ? 287 : 94, this.f22831v, this.f22828s, campaignEx.getRequestId(), copyOnWriteArrayList, new AnonymousClass2(campaignEx, z8, cVar, nscpt), new b.i(campaignEx, copyOnWriteArrayList, z8, nscpt) { // from class: com.mbridge.msdk.reward.b.a.3

            /* renamed from: a, reason: collision with root package name */
            com.mbridge.msdk.foundation.same.report.d.b f22856a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CampaignEx f22857b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CopyOnWriteArrayList f22858c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f22859d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f22860e;

            {
                this.f22857b = campaignEx;
                this.f22858c = copyOnWriteArrayList;
                this.f22859d = z8;
                this.f22860e = nscpt;
                this.f22856a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
            }

            @Override // com.mbridge.msdk.reward.adapter.b.i
            public final void a(String str, String str2, String str3, String str4) {
            }

            @Override // com.mbridge.msdk.reward.adapter.b.i
            public final void a(String str, String str2, com.mbridge.msdk.foundation.c.b bVar) {
                String unitId = bVar == null ? "" : bVar.d().getUnitId();
                a aVar = a.this;
                a.a(aVar, unitId, aVar.aa);
                if (bVar != null) {
                    bVar.a("errorCode: 3202 errorMessage: temp resource download failed");
                }
                if (this.f22856a == null) {
                    this.f22856a = new com.mbridge.msdk.foundation.same.report.d.b();
                }
                this.f22856a.b(this.f22858c);
                this.f22856a.a(bVar);
                if (!this.f22859d && a.this.f22826q != null) {
                    if (a.this.f22819j) {
                        return;
                    }
                    a.this.f22819j = true;
                    c.a(a.this.f22826q, bVar, this.f22856a);
                    return;
                }
                if (this.f22860e != 1 || a.this.f22819j || a.this.f22826q == null) {
                    return;
                }
                a.this.f22819j = true;
                c.a(a.this.f22826q, bVar, this.f22856a);
            }
        });
        if (z8) {
            com.mbridge.msdk.reward.adapter.b.a().a(this.f22821l, campaignEx, this.f22831v, this.f22828s, campaignEx.getRequestId(), new AnonymousClass4(campaignEx, copyOnWriteArrayList, cVar, z8, nscpt));
        }
    }

    private void a(Queue<Integer> queue, boolean z8, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        Integer poll;
        int intValue;
        try {
            if (queue != null) {
                try {
                    if (queue.size() > 0 && (poll = queue.poll()) != null) {
                        intValue = poll.intValue();
                        a(1, intValue, z8, str, bVar);
                        return;
                    }
                } catch (Exception e8) {
                    com.mbridge.msdk.foundation.c.b b9 = com.mbridge.msdk.foundation.c.a.b(880020, "load mv api error:" + e8.getMessage());
                    if (bVar != null) {
                        bVar.a(b9);
                        bVar.c(true);
                    }
                    a(b9, bVar);
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e8.getMessage());
                        return;
                    }
                    return;
                }
            }
            a(1, intValue, z8, str, bVar);
            return;
        } catch (Exception e9) {
            com.mbridge.msdk.foundation.c.b b10 = com.mbridge.msdk.foundation.c.a.b(880020, "load mv api error:" + e9.getMessage());
            if (bVar != null) {
                bVar.a(b10);
                bVar.c(true);
            }
            a(b10, bVar);
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e9.getMessage());
                return;
            }
            return;
        }
        intValue = 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
        if (this.f22826q != null) {
            this.f22811X = true;
            this.f22826q.a(bVar, bVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x002d, B:9:0x0031, B:10:0x003c, B:14:0x0014), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(int r11, int r12, boolean r13, java.lang.String r14, com.mbridge.msdk.foundation.same.report.d.b r15) {
        /*
            r10 = this;
            com.mbridge.msdk.reward.adapter.c r0 = r10.f22822m     // Catch: java.lang.Exception -> L11
            if (r0 == 0) goto L14
            java.lang.String r1 = r10.f22828s     // Catch: java.lang.Exception -> L11
            java.lang.String r0 = r0.a()     // Catch: java.lang.Exception -> L11
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L11
            if (r0 != 0) goto L2d
            goto L14
        L11:
            r11 = move-exception
            goto L82
        L14:
            com.mbridge.msdk.reward.adapter.c r0 = new com.mbridge.msdk.reward.adapter.c     // Catch: java.lang.Exception -> L11
            android.content.Context r1 = r10.f22821l     // Catch: java.lang.Exception -> L11
            java.lang.String r2 = r10.f22831v     // Catch: java.lang.Exception -> L11
            java.lang.String r3 = r10.f22828s     // Catch: java.lang.Exception -> L11
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Exception -> L11
            r10.f22822m = r0     // Catch: java.lang.Exception -> L11
            boolean r1 = r10.f22793D     // Catch: java.lang.Exception -> L11
            r0.b(r1)     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.adapter.c r0 = r10.f22822m     // Catch: java.lang.Exception -> L11
            boolean r1 = r10.f22794E     // Catch: java.lang.Exception -> L11
            r0.c(r1)     // Catch: java.lang.Exception -> L11
        L2d:
            boolean r0 = r10.f22793D     // Catch: java.lang.Exception -> L11
            if (r0 == 0) goto L3c
            com.mbridge.msdk.reward.adapter.c r0 = r10.f22822m     // Catch: java.lang.Exception -> L11
            int r1 = r10.f22790A     // Catch: java.lang.Exception -> L11
            int r2 = r10.f22791B     // Catch: java.lang.Exception -> L11
            int r3 = r10.f22792C     // Catch: java.lang.Exception -> L11
            r0.a(r1, r2, r3)     // Catch: java.lang.Exception -> L11
        L3c:
            com.mbridge.msdk.reward.adapter.c r0 = r10.f22822m     // Catch: java.lang.Exception -> L11
            int r1 = r10.f22835z     // Catch: java.lang.Exception -> L11
            r0.a(r1)     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.adapter.c r0 = r10.f22822m     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.videocommon.d.c r1 = r10.f22823n     // Catch: java.lang.Exception -> L11
            r0.a(r1)     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.b.a$a r0 = new com.mbridge.msdk.reward.b.a$a     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.adapter.c r4 = r10.f22822m     // Catch: java.lang.Exception -> L11
            r2 = r0
            r3 = r10
            r5 = r11
            r6 = r13
            r7 = r14
            r8 = r15
            r2.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L11
            r0.a(r12)     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.b.a$b r1 = new com.mbridge.msdk.reward.b.a$b     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.adapter.c r2 = r10.f22822m     // Catch: java.lang.Exception -> L11
            r1.<init>(r2, r13)     // Catch: java.lang.Exception -> L11
            r10.f22814a = r1     // Catch: java.lang.Exception -> L11
            r1.a(r0)     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.adapter.c r1 = r10.f22822m     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.b.a$b r2 = r10.f22814a     // Catch: java.lang.Exception -> L11
            r1.a(r2)     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.adapter.c r3 = r10.f22822m     // Catch: java.lang.Exception -> L11
            boolean r8 = r10.f22798I     // Catch: java.lang.Exception -> L11
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r9 = r15
            r3.a(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L11
            android.os.Handler r11 = r10.f22834y     // Catch: java.lang.Exception -> L11
            int r12 = r12 * 1000
            long r12 = (long) r12     // Catch: java.lang.Exception -> L11
            r11.postDelayed(r0, r12)     // Catch: java.lang.Exception -> L11
            goto La6
        L82:
            r12 = 880020(0xd6d94, float:1.23317E-39)
            java.lang.String r13 = r11.getMessage()
            com.mbridge.msdk.foundation.c.b r12 = com.mbridge.msdk.foundation.c.a.b(r12, r13)
            if (r15 == 0) goto L96
            r15.a(r12)
            r13 = 1
            r15.c(r13)
        L96:
            r10.a(r12, r15)
            boolean r12 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r12 == 0) goto La6
            java.lang.String r12 = "RewardVideoController"
            java.lang.String r11 = r11.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r12, r11)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.b.a.a(int, int, boolean, java.lang.String, com.mbridge.msdk.foundation.same.report.d.b):void");
    }

    private void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        com.mbridge.msdk.videocommon.d.c cVar;
        com.mbridge.msdk.videocommon.d.c cVar2;
        boolean b9;
        boolean c8;
        try {
            if (this.f22822m == null) {
                r();
            }
            if (this.f22822m != null) {
                ad.b("RewardVideoController", "controller 819");
                if (this.f22794E) {
                    b9 = e(false);
                } else {
                    b9 = this.f22822m.b();
                }
                if (b9) {
                    ad.c("RewardVideoController", "invoke adapter show isReady");
                    d dVar = new d(this, this.f22834y);
                    f22789f.put(this.f22828s, dVar);
                    this.f22822m.a(dVar, str, this.f22827r, this.f22835z, this.f22830u, bVar);
                    this.f22815c = false;
                    return;
                }
                if (this.f22794E) {
                    if (this.f22822m == null) {
                        r();
                    }
                    List<com.mbridge.msdk.foundation.entity.c> a9 = com.mbridge.msdk.videocommon.a.a.a().a(this.f22828s);
                    if (a9 != null && a9.size() > 0) {
                        for (com.mbridge.msdk.foundation.entity.c cVar3 : a9) {
                            if (cVar3 != null) {
                                this.f22822m.a(cVar3.a());
                                this.f22822m.f22703d = cVar3.d();
                                if (this.f22822m.c()) {
                                    c8 = true;
                                    break;
                                }
                                com.mbridge.msdk.videocommon.a.a.a().c(this.f22828s, cVar3.a());
                            }
                        }
                    }
                    c8 = false;
                } else {
                    c8 = this.f22822m.c();
                }
                if (c8) {
                    ad.c("RewardVideoController", "invoke adapter show isSpareOfferReady");
                    d dVar2 = new d(this, this.f22834y);
                    f22789f.put(this.f22828s, dVar2);
                    this.f22822m.a(dVar2, str, this.f22827r, this.f22835z, this.f22830u, bVar);
                    this.f22815c = false;
                    return;
                }
            }
            this.f22815c = false;
            a("2000131", bVar, this.f22825p, "can't show because load is failed");
            if (this.f22825p != null) {
                try {
                    this.f22825p.onShowFail(bVar, this.f22829t, "can't show because load is failed");
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e8.getMessage());
                    }
                }
            }
            if (this.f22793D || this.f22794E || (cVar2 = this.f22823n) == null || !cVar2.s(4) || this.f22826q == null || c.a(this.f22826q) == 1 || c.a(this.f22826q) == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 94, this.f22828s, true, 1));
        } catch (Exception e9) {
            this.f22815c = false;
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e9.getLocalizedMessage());
            }
            a("2000131", bVar, this.f22825p, "show exception");
            if (this.f22825p != null) {
                try {
                    this.f22825p.onShowFail(bVar, this.f22829t, "show exception");
                } catch (Exception unused) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e9.getMessage());
                    }
                }
            }
            if (this.f22793D || this.f22794E || (cVar = this.f22823n) == null || !cVar.s(4) || this.f22826q == null || c.a(this.f22826q) == 1 || c.a(this.f22826q) == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 94, this.f22828s, true, 1));
        }
    }

    private boolean a(List<com.mbridge.msdk.foundation.entity.c> list, String str) {
        if (list == null) {
            return false;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : list) {
            if (cVar != null && str.equals(cVar.b())) {
                this.f22822m.a(cVar.a());
                this.f22822m.f22703d = cVar.d();
                if (this.f22822m.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r11, java.lang.String r12, java.lang.String r13, com.mbridge.msdk.foundation.same.report.d.d r14) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.b.a.a(java.lang.String, java.lang.String, java.lang.String, com.mbridge.msdk.foundation.same.report.d.d):void");
    }

    private com.mbridge.msdk.foundation.same.report.d.b a(com.mbridge.msdk.foundation.same.report.d.d dVar) {
        CampaignEx campaignEx;
        try {
            CopyOnWriteArrayList<CampaignEx> a9 = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f22828s);
            String str = "";
            if (a9 != null && a9.size() > 0 && (campaignEx = a9.get(0)) != null) {
                str = campaignEx.getCurrentLocalRid();
            }
            r0 = TextUtils.isEmpty(str) ? null : com.mbridge.msdk.foundation.same.report.d.c.a().b().get(str);
            if (r0 != null) {
                r0.b(a9);
                r0.a("2000128", dVar);
                r0.c(str);
                r0.d(this.f22828s);
                com.mbridge.msdk.reward.c.a.a.a().a("2000128", r0);
                return r0;
            }
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            try {
                bVar.d(this.f22828s);
                dVar.a("metrics_data_reason", "未获取到待展示的campaign信息 本地new metricsData");
                bVar.a("2000128", dVar);
                if (TextUtils.isEmpty(str)) {
                    bVar.c(SameMD5.getMD5(ai.d()));
                } else {
                    bVar.c(str);
                    bVar.b(a9);
                    com.mbridge.msdk.foundation.same.report.d.c.a().b().put(str, bVar);
                }
                com.mbridge.msdk.reward.c.a.a.a().a("2000128", bVar);
                return bVar;
            } catch (Exception e8) {
                e = e8;
                r0 = bVar;
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e.getMessage());
                }
                return r0;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public final void a(List<CampaignEx> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f22802M = list;
    }

    private String a(String str) {
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                str2 = SameMD5.getMD5(ai.d());
            }
            String[] split = str.split("_");
            if (split != null && split.length >= 3) {
                str2 = split[2];
            }
            return TextUtils.isEmpty(str2) ? SameMD5.getMD5(ai.d()) : str2;
        } catch (Exception e8) {
            if (!MBridgeConstans.DEBUG) {
                return "";
            }
            e8.printStackTrace();
            return "";
        }
    }

    public final com.mbridge.msdk.foundation.same.report.d.b a(Message message) {
        com.mbridge.msdk.foundation.same.report.d.b bVar = null;
        if (message != null) {
            try {
                Bundle data = message.getData();
                if (data != null) {
                    bVar = com.mbridge.msdk.foundation.same.report.d.c.a().b(data.getString("metrics_data_lrid"));
                }
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                }
            }
        }
        return bVar == null ? new com.mbridge.msdk.foundation.same.report.d.b() : bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar, InterVideoOutListener interVideoOutListener, String str2) {
        if (bVar == null) {
            try {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
                bVar.b(this.f22802M);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                    return;
                }
                return;
            }
        }
        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
        if (!TextUtils.isEmpty(str2)) {
            dVar.a("reason", str2);
        }
        if (interVideoOutListener != null) {
            dVar.a("listener_state", 1);
        } else {
            dVar.a("listener_state", 2);
        }
        bVar.a(str, dVar);
        com.mbridge.msdk.reward.c.a.a.a().a(str, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0040 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:25:0x0009, B:27:0x000f, B:29:0x0016, B:30:0x002f, B:4:0x0039, B:8:0x0040, B:11:0x0075, B:13:0x0088, B:15:0x0096), top: B:24:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.mbridge.msdk.foundation.same.report.d.b a(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r5, com.mbridge.msdk.foundation.same.report.d.b r6) {
        /*
            r4 = this;
            com.mbridge.msdk.foundation.same.report.d.b r0 = new com.mbridge.msdk.foundation.same.report.d.b
            r0.<init>()
            java.lang.String r1 = ""
            if (r5 == 0) goto L38
            int r2 = r5.size()     // Catch: java.lang.Exception -> L2b
            if (r2 <= 0) goto L38
            r2 = 0
            java.lang.Object r3 = r5.get(r2)     // Catch: java.lang.Exception -> L2b
            if (r3 == 0) goto L2e
            java.lang.Object r1 = r5.get(r2)     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = (com.mbridge.msdk.foundation.entity.CampaignEx) r1     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = r1.getLocalRequestId()     // Catch: java.lang.Exception -> L2b
            java.lang.Object r2 = r5.get(r2)     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = r2.getNLRid()     // Catch: java.lang.Exception -> L2b
            goto L2f
        L2b:
            r5 = move-exception
            goto La2
        L2e:
            r2 = r1
        L2f:
            r0.c(r1)     // Catch: java.lang.Exception -> L2b
            r0.b(r5)     // Catch: java.lang.Exception -> L2b
            r5 = r1
            r1 = r2
            goto L39
        L38:
            r5 = r1
        L39:
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto L40
            return r6
        L40:
            com.mbridge.msdk.foundation.same.report.d.d r6 = new com.mbridge.msdk.foundation.same.report.d.d     // Catch: java.lang.Exception -> L2b
            r6.<init>()     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "cache"
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L2b
            r6.a(r1, r3)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "hb"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L2b
            r6.a(r1, r2)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "auto_load"
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L2b
            r6.a(r1, r2)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "2000127"
            r0.a(r1, r6)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "2000048"
            r0.a(r1, r6)     // Catch: java.lang.Exception -> L2b
            boolean r6 = r4.f22793D     // Catch: java.lang.Exception -> L2b
            if (r6 == 0) goto L73
            r6 = 287(0x11f, float:4.02E-43)
            goto L75
        L73:
            r6 = 94
        L75:
            r0.b(r6)     // Catch: java.lang.Exception -> L2b
            java.lang.String r6 = "1"
            r0.i(r6)     // Catch: java.lang.Exception -> L2b
            java.lang.String r6 = "2"
            r0.b(r6)     // Catch: java.lang.Exception -> L2b
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L2b
            if (r6 != 0) goto La9
            com.mbridge.msdk.foundation.same.report.d.c r6 = com.mbridge.msdk.foundation.same.report.d.c.a()     // Catch: java.lang.Exception -> L2b
            java.util.LinkedHashMap r6 = r6.b()     // Catch: java.lang.Exception -> L2b
            boolean r6 = r6.containsKey(r5)     // Catch: java.lang.Exception -> L2b
            if (r6 != 0) goto La9
            com.mbridge.msdk.foundation.same.report.d.c r6 = com.mbridge.msdk.foundation.same.report.d.c.a()     // Catch: java.lang.Exception -> L2b
            java.util.LinkedHashMap r6 = r6.b()     // Catch: java.lang.Exception -> L2b
            r6.put(r5, r0)     // Catch: java.lang.Exception -> L2b
            goto La9
        La2:
            boolean r6 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r6 == 0) goto La9
            r5.printStackTrace()
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.b.a.a(java.util.List, com.mbridge.msdk.foundation.same.report.d.b):com.mbridge.msdk.foundation.same.report.d.b");
    }

    static /* synthetic */ void a(a aVar, String str, List list) {
        if (list != null) {
            try {
                if (list.size() <= 0 || aVar.f22809V) {
                    return;
                }
                com.mbridge.msdk.foundation.db.f.a(h.a(com.mbridge.msdk.foundation.controller.c.m().c())).a((List<CampaignEx>) list, str);
            } catch (Throwable th) {
                ad.b("RewardVideoController", th.getMessage());
            }
        }
    }

    static /* synthetic */ void a(a aVar, String str, com.mbridge.msdk.foundation.same.report.d.b bVar, InterVideoOutListener interVideoOutListener) {
        if (aVar.f22797H) {
            if (bVar == null) {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
                bVar.b(aVar.f22802M);
            }
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                if (interVideoOutListener != null) {
                    dVar.a("listener_state", 1);
                } else {
                    dVar.a("listener_state", 2);
                }
                bVar.a(str, dVar);
                com.mbridge.msdk.reward.c.a.a.a().a(str, bVar);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    e8.printStackTrace();
                }
            }
        }
    }
}
