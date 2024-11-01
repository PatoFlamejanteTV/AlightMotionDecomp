package com.mbridge.msdk.video.bt.module;

import C1.b;
import C1.h;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.bt.a.d;
import com.mbridge.msdk.widget.FeedBackButton;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeBTVideoView extends BTBaseView {

    /* renamed from: K, reason: collision with root package name */
    private static boolean f23148K = false;

    /* renamed from: Q, reason: collision with root package name */
    private static long f23149Q;

    /* renamed from: A, reason: collision with root package name */
    private b f23150A;

    /* renamed from: B, reason: collision with root package name */
    private C1.a f23151B;

    /* renamed from: C, reason: collision with root package name */
    private D1.b f23152C;

    /* renamed from: D, reason: collision with root package name */
    private a f23153D;

    /* renamed from: E, reason: collision with root package name */
    private int f23154E;

    /* renamed from: F, reason: collision with root package name */
    private int f23155F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f23156G;

    /* renamed from: H, reason: collision with root package name */
    private int f23157H;

    /* renamed from: I, reason: collision with root package name */
    private int f23158I;

    /* renamed from: J, reason: collision with root package name */
    private String f23159J;

    /* renamed from: L, reason: collision with root package name */
    private boolean f23160L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f23161M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f23162N;

    /* renamed from: O, reason: collision with root package name */
    private RelativeLayout f23163O;

    /* renamed from: P, reason: collision with root package name */
    private ProgressBar f23164P;

    /* renamed from: p, reason: collision with root package name */
    private PlayerView f23165p;

    /* renamed from: q, reason: collision with root package name */
    private SoundImageView f23166q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f23167r;

    /* renamed from: s, reason: collision with root package name */
    private View f23168s;

    /* renamed from: t, reason: collision with root package name */
    private FeedBackButton f23169t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f23170u;

    /* renamed from: v, reason: collision with root package name */
    private WebView f23171v;

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f23172w;

    /* renamed from: x, reason: collision with root package name */
    private int f23173x;

    /* renamed from: y, reason: collision with root package name */
    private int f23174y;

    /* renamed from: z, reason: collision with root package name */
    private int f23175z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a extends DefaultVideoPlayerStatusListener {

        /* renamed from: a, reason: collision with root package name */
        private MBridgeBTVideoView f23179a;

        /* renamed from: b, reason: collision with root package name */
        private WebView f23180b;

        /* renamed from: c, reason: collision with root package name */
        private D1.b f23181c;

        /* renamed from: d, reason: collision with root package name */
        private String f23182d;

        /* renamed from: e, reason: collision with root package name */
        private String f23183e;

        /* renamed from: f, reason: collision with root package name */
        private int f23184f;

        /* renamed from: g, reason: collision with root package name */
        private int f23185g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f23186h;

        /* renamed from: l, reason: collision with root package name */
        private int f23190l;

        /* renamed from: m, reason: collision with root package name */
        private int f23191m;

        /* renamed from: i, reason: collision with root package name */
        private boolean f23187i = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f23188j = false;

        /* renamed from: k, reason: collision with root package name */
        private boolean f23189k = false;

        /* renamed from: n, reason: collision with root package name */
        private boolean f23192n = false;

        public a(MBridgeBTVideoView mBridgeBTVideoView, WebView webView, D1.b bVar) {
            this.f23179a = mBridgeBTVideoView;
            this.f23180b = webView;
            this.f23181c = bVar;
            if (mBridgeBTVideoView != null) {
                this.f23182d = mBridgeBTVideoView.f23023d;
                this.f23183e = mBridgeBTVideoView.f23022c;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00a7 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:15:0x002f, B:17:0x0037, B:20:0x0044, B:21:0x009b, B:23:0x00a7, B:25:0x00b1, B:31:0x0071), top: B:14:0x002f }] */
        /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(int r3, int r4) {
            /*
                r2 = this;
                java.lang.String r0 = "DefaultVideoPlayerStatusListener"
                r2.f23190l = r3
                r2.f23191m = r4
                com.mbridge.msdk.foundation.tools.af r3 = com.mbridge.msdk.foundation.tools.af.a()
                java.lang.String r4 = "h_c_r_w_p_c"
                r1 = 0
                boolean r3 = r3.a(r4, r1)
                if (r3 != 0) goto L15
                goto Lc2
            L15:
                int r3 = r2.f23190l
                r4 = 100
                if (r3 == r4) goto Lc2
                int r4 = r2.f23191m
                if (r4 != 0) goto Lc2
                boolean r4 = r2.f23192n
                if (r4 != 0) goto Lc2
                if (r3 == 0) goto Lc2
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r3 = r2.f23179a
                if (r3 == 0) goto Lc2
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r3.f23021b
                if (r3 != 0) goto L2f
                goto Lc2
            L2f:
                int r3 = r3.getAdType()     // Catch: java.lang.Exception -> L6f
                r4 = 94
                if (r3 == r4) goto L71
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r3 = r2.f23179a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r3.f23021b     // Catch: java.lang.Exception -> L6f
                int r3 = r3.getAdType()     // Catch: java.lang.Exception -> L6f
                r4 = 287(0x11f, float:4.02E-43)
                if (r3 != r4) goto L44
                goto L71
            L44:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6f
                r3.<init>()     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f23179a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f23021b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getId()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f23179a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f23021b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getVideoUrlEncode()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f23179a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f23021b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getBidToken()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L6f
                goto L9b
            L6f:
                r3 = move-exception
                goto Lb7
            L71:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6f
                r3.<init>()     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f23179a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f23021b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getRequestId()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f23179a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f23021b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getId()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r4 = r2.f23179a     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r4.f23021b     // Catch: java.lang.Exception -> L6f
                java.lang.String r4 = r4.getVideoUrlEncode()     // Catch: java.lang.Exception -> L6f
                r3.append(r4)     // Catch: java.lang.Exception -> L6f
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L6f
            L9b:
                com.mbridge.msdk.videocommon.download.b r4 = com.mbridge.msdk.videocommon.download.b.getInstance()     // Catch: java.lang.Exception -> L6f
                java.lang.String r1 = r2.f23183e     // Catch: java.lang.Exception -> L6f
                com.mbridge.msdk.videocommon.download.a r3 = r4.a(r1, r3)     // Catch: java.lang.Exception -> L6f
                if (r3 == 0) goto Lc2
                r3.p()     // Catch: java.lang.Exception -> L6f
                r3 = 1
                r2.f23192n = r3     // Catch: java.lang.Exception -> L6f
                boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Exception -> L6f
                if (r3 == 0) goto Lc2
                java.lang.String r3 = "CDRate is : 0  and start download when player create!"
                com.mbridge.msdk.foundation.tools.ad.b(r0, r3)     // Catch: java.lang.Exception -> L6f
                goto Lc2
            Lb7:
                boolean r4 = com.mbridge.msdk.MBridgeConstans.DEBUG
                if (r4 == 0) goto Lc2
                java.lang.String r3 = r3.getMessage()
                com.mbridge.msdk.foundation.tools.ad.b(r0, r3)
            Lc2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.a.a(int, int):void");
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                D1.b bVar = this.f23181c;
                if (bVar != null) {
                    bVar.b();
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                D1.b bVar = this.f23181c;
                if (bVar != null) {
                    bVar.c();
                }
                if ((str.equals(PlayerErrorConstant.PREPARE_TIMEOUT) || str.equals(PlayerErrorConstant.PLAYERING_TIMEOUT)) && this.f23180b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f23018n);
                        jSONObject.put("id", this.f23182d);
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
                        g.a().a(this.f23180b, "onPlayerTimeout", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e8) {
                        d.c().a(this.f23180b, e8.getMessage());
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayCompleted() {
            super.onPlayCompleted();
            MBridgeBTVideoView mBridgeBTVideoView = this.f23179a;
            CampaignEx campaignEx = mBridgeBTVideoView.f23021b;
            if (campaignEx != null) {
                if (campaignEx.getVideoCompleteTime() > 0) {
                    this.f23179a.f23167r.setText(v.a(c.m().c(), "mbridge_reward_video_view_reward_time_complete", TypedValues.Custom.S_STRING));
                } else {
                    this.f23179a.f23167r.setText(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
            } else {
                mBridgeBTVideoView.f23167r.setText(MBridgeConstans.ENDCARD_URL_TYPE_PL);
            }
            this.f23179a.f23165p.setClickable(false);
            WebView webView = this.f23180b;
            if (webView != null) {
                BTBaseView.a(webView, "onPlayerFinish", this.f23182d);
            }
            D1.b bVar = this.f23181c;
            if (bVar != null) {
                bVar.d();
                ad.a("omsdk", "play:  videoEvents.complete()");
            }
            this.f23184f = this.f23185g;
            boolean unused = MBridgeBTVideoView.f23148K = true;
            this.f23179a.stop();
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayError(String str) {
            super.onPlayError(str);
            if (this.f23180b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f23019o);
                    jSONObject.put("id", this.f23182d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_ERROR, str);
                    jSONObject2.put("id", this.f23182d);
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    g.a().a(this.f23180b, "onPlayerFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e8) {
                    d.c().a(this.f23180b, e8.getMessage());
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:90:0x02c9 A[Catch: Exception -> 0x0291, TRY_LEAVE, TryCatch #1 {Exception -> 0x0291, blocks: (B:70:0x023a, B:72:0x023e, B:78:0x0246, B:80:0x024a, B:82:0x024f, B:84:0x025b, B:87:0x0266, B:88:0x02bd, B:90:0x02c9, B:94:0x0293), top: B:69:0x023a }] */
        /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onPlayProgress(int r11, int r12) {
            /*
                Method dump skipped, instructions count: 752
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.a.onPlayProgress(int, int):void");
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public final void onPlayStarted(int i8) {
            super.onPlayStarted(i8);
            if (!this.f23186h) {
                this.f23179a.f23164P.setMax(i8);
                WebView webView = this.f23180b;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.f23182d);
                }
                this.f23186h = true;
            }
            boolean unused = MBridgeBTVideoView.f23148K = false;
        }
    }

    public MBridgeBTVideoView(Context context) {
        super(context);
        this.f23173x = 0;
        this.f23174y = 0;
        this.f23175z = 0;
        this.f23154E = 2;
        this.f23156G = false;
        this.f23157H = 2;
        this.f23158I = 1;
        this.f23160L = false;
        this.f23161M = false;
        this.f23162N = false;
    }

    public int getMute() {
        return this.f23154E;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_videoview_item");
        if (findLayout > 0) {
            this.f23025f.inflate(findLayout, this);
            boolean c8 = c();
            this.f23027h = c8;
            if (!c8) {
                ad.b(BTBaseView.TAG, "MBridgeVideoView init fail");
            }
            a();
        }
        f23148K = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        View rootView;
        int i8;
        int i9;
        super.onAttachedToWindow();
        if (!this.f23162N) {
            this.f23157H = d.c().e(this.f23022c);
        }
        View view = this.f23168s;
        int i10 = 0;
        if (view != null) {
            if (this.f23174y == 0) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            view.setVisibility(i9);
        }
        SoundImageView soundImageView = this.f23166q;
        if (soundImageView != null) {
            if (this.f23175z == 0) {
                i8 = 8;
            } else {
                i8 = 0;
            }
            soundImageView.setVisibility(i8);
        }
        CampaignEx campaignEx = this.f23021b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f23022c);
            com.mbridge.msdk.foundation.d.b.a().a(this.f23022c + "_1", this.f23021b);
        }
        TextView textView = this.f23167r;
        if (textView != null) {
            if (this.f23173x == 0) {
                i10 = 8;
            }
            textView.setVisibility(i10);
            if (this.f23167r.getVisibility() == 0 && com.mbridge.msdk.foundation.d.b.a().b()) {
                com.mbridge.msdk.foundation.d.b.a().a(this.f23022c + "_1", this.f23169t);
            }
        }
        if (this.f23150A != null && (rootView = getRootView()) != null) {
            this.f23150A.f(rootView);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
        try {
            PlayerView playerView = this.f23165p;
            if (playerView != null) {
                playerView.setOnClickListener(null);
                this.f23165p.release();
                this.f23165p = null;
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a(TypedValues.TransitionType.S_DURATION, Long.valueOf(System.currentTimeMillis() - f23149Q));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000146", this.f23021b, dVar);
            }
            SoundImageView soundImageView = this.f23166q;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(null);
            }
            View view = this.f23168s;
            if (view != null) {
                view.setOnClickListener(null);
            }
            if (this.f23171v != null) {
                this.f23171v = null;
            }
            if (this.f23150A != null) {
                this.f23150A = null;
            }
            if (this.f23152C != null) {
                this.f23152C = null;
            }
            setOnClickListener(null);
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void onPause() {
        PlayerView playerView = this.f23165p;
        if (playerView != null) {
            boolean isPlayIng = playerView.isPlayIng();
            this.f23161M = isPlayIng;
            this.f23165p.setIsBTVideoPlaying(isPlayIng);
            this.f23165p.onPause();
        }
    }

    public void onResume() {
        PlayerView playerView = this.f23165p;
        if (playerView != null) {
            playerView.setDesk(true);
            this.f23165p.setIsCovered(false);
            if (this.f23161M) {
                this.f23165p.start(true);
            }
        }
    }

    public void onStop() {
        PlayerView playerView = this.f23165p;
        if (playerView != null) {
            playerView.setIsCovered(true);
        }
    }

    public void pause() {
        try {
            PlayerView playerView = this.f23165p;
            if (playerView != null) {
                playerView.pause();
                D1.b bVar = this.f23152C;
                if (bVar != null) {
                    bVar.j();
                    ad.a("omsdk", "play:  videoEvents.pause()");
                }
                WebView webView = this.f23171v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPause", this.f23023d);
                }
            }
        } catch (Exception e8) {
            ad.a(BTBaseView.TAG, e8.getMessage(), e8);
        }
    }

    public void play() {
        a aVar;
        CampaignEx campaignEx;
        try {
            if (!this.f23162N) {
                String d8 = d();
                this.f23159J = d8;
                this.f23165p.initVFPData(d8, this.f23021b.getVideoUrlEncode(), this.f23153D);
                if (this.f23157H == 1) {
                    playMute();
                } else {
                    playUnMute();
                }
                try {
                    C1.a aVar2 = this.f23151B;
                    if (aVar2 != null) {
                        aVar2.b();
                    }
                    if (this.f23152C != null) {
                        float duration = this.f23165p.getDuration();
                        float f8 = 0.0f;
                        if (duration == 0.0f && (campaignEx = this.f23021b) != null) {
                            duration = campaignEx.getVideoLength();
                        }
                        D1.b bVar = this.f23152C;
                        if (getMute() == 2) {
                            f8 = 1.0f;
                        }
                        bVar.m(duration, f8);
                        ad.a("omsdk", "play: videoEvents.start()");
                    }
                } catch (IllegalArgumentException e8) {
                    ad.a(BTBaseView.TAG, e8.getMessage());
                }
                if (!this.f23165p.playVideo() && (aVar = this.f23153D) != null) {
                    aVar.onPlayError("play video failed");
                }
                this.f23162N = true;
                return;
            }
            if (this.f23156G) {
                this.f23165p.playVideo(0);
                this.f23156G = false;
            } else {
                this.f23165p.start(false);
            }
            try {
                D1.b bVar2 = this.f23152C;
                if (bVar2 != null) {
                    bVar2.k();
                    ad.a("omsdk", "play:  videoEvents.resume()");
                }
            } catch (IllegalArgumentException e9) {
                ad.a(BTBaseView.TAG, e9.getMessage());
            }
            WebView webView = this.f23171v;
            if (webView != null) {
                BTBaseView.a(webView, "onPlayerPlay", this.f23023d);
                return;
            }
            return;
        } catch (Exception e10) {
            ad.a(BTBaseView.TAG, e10.getMessage(), e10);
        }
        ad.a(BTBaseView.TAG, e10.getMessage(), e10);
    }

    public boolean playMute() {
        try {
            PlayerView playerView = this.f23165p;
            if (playerView != null && this.f23171v != null) {
                playerView.closeSound();
                this.f23166q.setSoundStatus(false);
                this.f23154E = 1;
                try {
                    D1.b bVar = this.f23152C;
                    if (bVar != null) {
                        bVar.o(0.0f);
                    }
                } catch (IllegalArgumentException e8) {
                    ad.a("OMSDK", e8.getMessage());
                }
                BTBaseView.a(this.f23171v, "onPlayerMute", this.f23023d);
                return true;
            }
        } catch (Exception e9) {
            ad.b(BTBaseView.TAG, e9.getMessage());
        }
        return false;
    }

    public boolean playUnMute() {
        try {
            PlayerView playerView = this.f23165p;
            if (playerView != null && this.f23171v != null) {
                playerView.openSound();
                this.f23166q.setSoundStatus(true);
                this.f23154E = 2;
                try {
                    D1.b bVar = this.f23152C;
                    if (bVar != null) {
                        bVar.o(1.0f);
                    }
                } catch (IllegalArgumentException e8) {
                    ad.a("OMSDK", e8.getMessage());
                }
                BTBaseView.a(this.f23171v, "onUnmute", this.f23023d);
                return true;
            }
            return false;
        } catch (Exception e9) {
            ad.b(BTBaseView.TAG, e9.getMessage());
            return false;
        }
    }

    public void preLoadData() {
        String str;
        int r8;
        if (this.f23021b.getAdType() != 94 && this.f23021b.getAdType() != 287) {
            str = this.f23021b.getId() + this.f23021b.getVideoUrlEncode() + this.f23021b.getBidToken();
        } else {
            str = this.f23021b.getRequestId() + this.f23021b.getId() + this.f23021b.getVideoUrlEncode();
        }
        com.mbridge.msdk.videocommon.download.a a9 = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f23022c, str);
        if (a9 != null) {
            this.f23172w = a9;
        }
        this.f23155F = e();
        try {
            CampaignEx campaignEx = this.f23021b;
            if (campaignEx != null && campaignEx.isActiveOm()) {
                this.f23150A = com.mbridge.msdk.a.b.a(getContext(), false, this.f23021b.getOmid(), this.f23021b.getRequestId(), this.f23021b.getId(), this.f23022c, "", this.f23021b.getRequestIdNotice());
            }
            b bVar = this.f23150A;
            if (bVar != null) {
                PlayerView playerView = this.f23165p;
                if (playerView != null) {
                    bVar.d(playerView);
                }
                SoundImageView soundImageView = this.f23166q;
                if (soundImageView != null) {
                    this.f23150A.a(soundImageView, h.OTHER, null);
                }
                TextView textView = this.f23167r;
                if (textView != null) {
                    this.f23150A.a(textView, h.OTHER, null);
                }
                View view = this.f23168s;
                if (view != null) {
                    this.f23150A.a(view, h.VIDEO_CONTROLS, null);
                }
                this.f23151B = C1.a.a(this.f23150A);
                this.f23152C = D1.b.g(this.f23150A);
                this.f23150A.g();
                this.f23151B.c(D1.d.b(true, D1.c.STANDALONE));
            }
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage());
        }
        String d8 = d();
        this.f23159J = d8;
        if (this.f23027h && !TextUtils.isEmpty(d8) && this.f23021b != null) {
            b bVar2 = this.f23150A;
            if (bVar2 != null) {
                bVar2.d(this.f23165p);
                b bVar3 = this.f23150A;
                SoundImageView soundImageView2 = this.f23166q;
                h hVar = h.OTHER;
                bVar3.a(soundImageView2, hVar, null);
                this.f23150A.a(this.f23167r, hVar, null);
                this.f23150A.a(this.f23168s, h.VIDEO_CONTROLS, null);
            }
            a aVar = new a(this, this.f23171v, this.f23152C);
            this.f23153D = aVar;
            CampaignEx campaignEx2 = this.f23021b;
            if (campaignEx2 != null) {
                if (campaignEx2.getReady_rate() != -1) {
                    r8 = campaignEx2.getReady_rate();
                } else {
                    r8 = com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), this.f23022c, false).r();
                }
            } else {
                r8 = com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), this.f23022c, false).r();
            }
            aVar.a(r8, com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), this.f23022c, false).s());
            this.f23165p.setDesk(false);
            this.f23165p.initBufferIngParam(this.f23155F);
            soundOperate(this.f23154E, -1, null);
        }
        f23148K = false;
    }

    public void resume() {
        try {
            PlayerView playerView = this.f23165p;
            if (playerView != null) {
                if (this.f23156G) {
                    playerView.playVideo(0);
                    this.f23156G = false;
                } else {
                    playerView.onResume();
                }
                try {
                    D1.b bVar = this.f23152C;
                    if (bVar != null) {
                        bVar.k();
                        ad.a("omsdk", "play:  videoEvents.resume()");
                    }
                } catch (IllegalArgumentException e8) {
                    ad.a(BTBaseView.TAG, e8.getMessage());
                }
                WebView webView = this.f23171v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerResume", this.f23023d);
                }
            }
        } catch (Exception e9) {
            ad.b(BTBaseView.TAG, e9.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setCampaign(CampaignEx campaignEx) {
        super.setCampaign(campaignEx);
        if (campaignEx != null && campaignEx.getVideoCompleteTime() > 0) {
            this.f23167r.setBackgroundResource(v.a(c.m().c(), "mbridge_reward_video_time_count_num_bg", "drawable"));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, ai.a(c.m().c(), 30.0f));
            int a9 = ai.a(c.m().c(), 5.0f);
            layoutParams.setMargins(a9, 0, 0, 0);
            this.f23167r.setPadding(a9, 0, a9, 0);
            this.f23167r.setLayoutParams(layoutParams);
            return;
        }
        this.f23167r.setBackgroundResource(v.a(c.m().c(), "mbridge_reward_shape_progress", "drawable"));
        this.f23167r.setWidth(ai.a(c.m().c(), 30.0f));
    }

    public void setCloseViewVisable(int i8) {
        int i9;
        View view = this.f23168s;
        if (i8 == 0) {
            i9 = 4;
        } else {
            i9 = 0;
        }
        view.setVisibility(i9);
    }

    public void setCountDownTextViewVisable(int i8) {
        int i9;
        TextView textView = this.f23167r;
        if (i8 == 0) {
            i9 = 4;
        } else {
            i9 = 0;
        }
        textView.setVisibility(i9);
    }

    public void setCreateWebView(WebView webView) {
        this.f23171v = webView;
    }

    public void setNotchPadding(int i8, int i9, int i10, int i11) {
        if (i8 <= 0) {
            i8 = this.f23163O.getPaddingLeft();
        }
        if (i9 <= 0) {
            i9 = this.f23163O.getPaddingRight();
        }
        if (i10 <= 0) {
            i10 = this.f23163O.getPaddingTop();
        }
        if (i11 <= 0) {
            i11 = this.f23163O.getPaddingBottom();
        }
        ad.b(BTBaseView.TAG, "NOTCH BTVideoView " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11)));
        this.f23163O.setPadding(i8, i10, i9, i11);
    }

    public void setOrientation(int i8) {
        this.f23158I = i8;
    }

    public void setPlaybackParams(float f8) {
        PlayerView playerView = this.f23165p;
        if (playerView != null) {
            playerView.setPlaybackParams(f8);
        }
    }

    public void setProgressBarState(int i8) {
        int i9;
        ProgressBar progressBar = this.f23164P;
        if (progressBar != null) {
            if (i8 == 0) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            progressBar.setVisibility(i9);
            CampaignEx campaignEx = this.f23021b;
            if (campaignEx != null && campaignEx.getProgressBarShow() == 1) {
                this.f23164P.setVisibility(0);
            }
        }
    }

    public void setShowClose(int i8) {
        this.f23174y = i8;
    }

    public void setShowMute(int i8) {
        this.f23175z = i8;
    }

    public void setShowTime(int i8) {
        this.f23173x = i8;
    }

    public void setSoundImageViewVisble(int i8) {
        int i9;
        SoundImageView soundImageView = this.f23166q;
        if (i8 == 0) {
            i9 = 4;
        } else {
            i9 = 0;
        }
        soundImageView.setVisibility(i9);
    }

    public void setVolume(float f8, float f9) {
        PlayerView playerView = this.f23165p;
        if (playerView != null) {
            playerView.setVolume(f8, f9);
        }
    }

    public void soundOperate(int i8, int i9, String str) {
        if (this.f23027h) {
            this.f23154E = i8;
            if (i8 == 1) {
                this.f23166q.setSoundStatus(false);
                this.f23165p.closeSound();
            } else if (i8 == 2) {
                this.f23166q.setSoundStatus(true);
                this.f23165p.openSound();
            }
            if (i9 == 1) {
                this.f23166q.setVisibility(8);
            } else if (i9 == 2) {
                this.f23166q.setVisibility(0);
            }
        }
    }

    public void stop() {
        try {
            PlayerView playerView = this.f23165p;
            if (playerView != null) {
                playerView.pause();
                this.f23165p.stop();
                this.f23156G = true;
                WebView webView = this.f23171v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerStop", this.f23023d);
                }
            }
        } catch (Exception e8) {
            ad.a(BTBaseView.TAG, e8.getMessage(), e8);
        }
    }

    private boolean c() {
        try {
            this.f23165p = (PlayerView) findViewById(findID("mbridge_vfpv"));
            this.f23166q = (SoundImageView) findViewById(findID("mbridge_sound_switch"));
            this.f23167r = (TextView) findViewById(findID("mbridge_tv_count"));
            this.f23168s = findViewById(findID("mbridge_rl_playing_close"));
            this.f23163O = (RelativeLayout) findViewById(findID("mbridge_top_control"));
            this.f23164P = (ProgressBar) findViewById(findID("mbridge_video_progress_bar"));
            this.f23165p.setIsBTVideo(true);
            this.f23169t = (FeedBackButton) findViewById(findID("mbridge_native_endcard_feed_btn"));
            this.f23170u = (ImageView) findViewById(findID("mbridge_iv_link"));
            return isNotNULL(this.f23165p, this.f23166q, this.f23167r, this.f23168s);
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    private String d() {
        String str = "";
        try {
            str = this.f23021b.getVideoUrlEncode();
            com.mbridge.msdk.videocommon.download.a aVar = this.f23172w;
            if (aVar == null) {
                return str;
            }
            String h8 = aVar.h();
            return !an.a(h8) ? new File(h8).exists() ? h8 : str : str;
        } catch (Throwable th) {
            ad.a(BTBaseView.TAG, th.getMessage(), th);
            return str;
        }
    }

    private int e() {
        try {
            com.mbridge.msdk.videocommon.d.a b9 = com.mbridge.msdk.videocommon.d.b.a().b();
            if (b9 == null) {
                com.mbridge.msdk.videocommon.d.b.a().c();
            }
            r0 = b9 != null ? (int) b9.h() : 5;
            ad.c(BTBaseView.TAG, "MBridgeBaseView buffetTimeout:" + r0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i8, int i9) {
        if (i9 != 0) {
            try {
                return ai.a(Double.valueOf(i8 / i9)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i9 + "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public final void a() {
        super.a();
        if (this.f23027h) {
            this.f23166q.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean isSilent = MBridgeBTVideoView.this.f23165p.isSilent();
                    if (MBridgeBTVideoView.this.f23171v != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f23018n);
                            jSONObject.put("id", MBridgeBTVideoView.this.f23023d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, MBridgeBTVideoView.this.f23154E);
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            g.a().a(MBridgeBTVideoView.this.f23171v, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                            ad.a("OperateViews", "onPlayerMuteBtnClicked isMute = " + isSilent + " mute = " + MBridgeBTVideoView.this.f23154E);
                        } catch (Exception e8) {
                            d.c().a(MBridgeBTVideoView.this.f23171v, e8.getMessage());
                        }
                    }
                }
            });
            this.f23168s.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeBTVideoView.this.f23171v != null) {
                        BTBaseView.a(MBridgeBTVideoView.this.f23171v, "onPlayerCloseBtnClicked", MBridgeBTVideoView.this.f23023d);
                    }
                }
            });
            setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (MBridgeBTVideoView.this.f23152C != null) {
                        MBridgeBTVideoView.this.f23152C.a(D1.a.CLICK);
                    }
                    if (MBridgeBTVideoView.this.f23171v != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", BTBaseView.f23018n);
                            jSONObject.put("id", MBridgeBTVideoView.this.f23023d);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("x", String.valueOf(view.getX()));
                            jSONObject2.put("y", String.valueOf(view.getY()));
                            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                            g.a().a(MBridgeBTVideoView.this.f23171v, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        } catch (Exception unused) {
                            d.c().a(MBridgeBTVideoView.this.f23171v, "onClicked", MBridgeBTVideoView.this.f23023d);
                        }
                    }
                }
            });
        }
    }

    public MBridgeBTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23173x = 0;
        this.f23174y = 0;
        this.f23175z = 0;
        this.f23154E = 2;
        this.f23156G = false;
        this.f23157H = 2;
        this.f23158I = 1;
        this.f23160L = false;
        this.f23161M = false;
        this.f23162N = false;
    }
}
