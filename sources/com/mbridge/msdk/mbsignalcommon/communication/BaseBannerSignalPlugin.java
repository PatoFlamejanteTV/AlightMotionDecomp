package com.mbridge.msdk.mbsignalcommon.communication;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;

/* loaded from: classes4.dex */
public abstract class BaseBannerSignalPlugin extends BannerSignalPluginDiff {

    /* renamed from: a, reason: collision with root package name */
    public e f21787a;

    /* renamed from: e, reason: collision with root package name */
    private final String f21788e = "BannerSignalPlugin";

    public void click(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", CampaignEx.JSON_NATIVE_VIDEO_CLICK);
            e eVar = this.f21787a;
            if (eVar != null) {
                eVar.b(obj, str);
            }
        } catch (Throwable th) {
            ad.a("BannerSignalPlugin", CampaignEx.JSON_NATIVE_VIDEO_CLICK, th);
        }
    }

    public void getFileInfo(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "getFileInfo");
            e eVar = this.f21787a;
            if (eVar != null) {
                eVar.j(obj, str);
            }
        } catch (Throwable th) {
            ad.a("BannerSignalPlugin", "getFileInfo", th);
        }
    }

    public void getNetstat(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "getNetstat");
            e eVar = this.f21787a;
            if (eVar != null) {
                eVar.o(obj, str);
            }
        } catch (Throwable th) {
            ad.a("BannerSignalPlugin", "getNetstat", th);
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "handlerH5Exception");
            e eVar = this.f21787a;
            if (eVar != null) {
                eVar.m(obj, str);
            }
        } catch (Throwable th) {
            ad.a("BannerSignalPlugin", "handlerH5Exception", th);
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "increaseOfferFrequence");
            e eVar = this.f21787a;
            if (eVar != null) {
                eVar.l(obj, str);
            }
        } catch (Throwable th) {
            ad.a("BannerSignalPlugin", "increaseOfferFrequence", th);
        }
    }

    public void init(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "init");
            e eVar = this.f21787a;
            if (eVar != null) {
                eVar.a(obj, str);
            }
        } catch (Throwable th) {
            ad.a("BannerSignalPlugin", "init", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.h
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof e) {
                this.f21787a = (e) context;
            } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof e)) {
                this.f21787a = (e) windVaneWebView.getObject();
            }
        } catch (Throwable th) {
            ad.a("BannerSignalPlugin", "initialize", th);
        }
    }

    public void install(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "install");
            e eVar = this.f21787a;
            if (eVar != null) {
                eVar.g(obj, str);
            }
        } catch (Throwable th) {
            ad.a("BannerSignalPlugin", "install", th);
        }
    }

    public void onSignalCommunication(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "onSignalCommunication");
            e eVar = this.f21787a;
            if (eVar != null) {
                eVar.f(obj, str);
            }
        } catch (Throwable th) {
            ad.a("BannerSignalPlugin", "onSignalCommunication", th);
        }
    }

    public void openURL(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "openURL");
            e eVar = this.f21787a;
            if (eVar != null) {
                eVar.n(obj, str);
            }
        } catch (Throwable th) {
            ad.a("BannerSignalPlugin", "openURL", th);
        }
    }

    public void readyStatus(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "readyStatus");
            e eVar = this.f21787a;
            if (eVar != null) {
                eVar.c(obj, str);
            }
        } catch (Throwable th) {
            ad.a("BannerSignalPlugin", "readyStatus", th);
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "reportUrls");
            e eVar = this.f21787a;
            if (eVar != null) {
                eVar.k(obj, str);
            }
        } catch (Throwable th) {
            ad.a("BannerSignalPlugin", "reportUrls", th);
        }
    }

    public void resetCountdown(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "resetCountdown");
            e eVar = this.f21787a;
            if (eVar != null) {
                eVar.h(obj, str);
            }
        } catch (Throwable th) {
            ad.a("BannerSignalPlugin", "resetCountdown", th);
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "sendImpressions");
            e eVar = this.f21787a;
            if (eVar != null) {
                eVar.i(obj, str);
            }
        } catch (Throwable th) {
            ad.a("BannerSignalPlugin", "sendImpressions", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "toggleCloseBtn");
            e eVar = this.f21787a;
            if (eVar != null) {
                eVar.d(obj, str);
            }
        } catch (Throwable th) {
            ad.a("BannerSignalPlugin", "toggleCloseBtn", th);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "triggerCloseBtn");
            e eVar = this.f21787a;
            if (eVar != null) {
                eVar.e(obj, str);
            }
        } catch (Throwable th) {
            ad.a("BannerSignalPlugin", "triggerCloseBtn", th);
        }
    }
}
