package com.mbridge.msdk.click;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;

/* loaded from: classes4.dex */
public final class g extends AppletSchemeCallBack {

    /* renamed from: a, reason: collision with root package name */
    private final NativeListener.NativeTrackingListener f19377a;

    /* renamed from: b, reason: collision with root package name */
    private final CampaignEx f19378b;

    /* renamed from: c, reason: collision with root package name */
    private final AppletsModel f19379c;

    /* renamed from: d, reason: collision with root package name */
    private final a f19380d;

    public g(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        this.f19377a = nativeTrackingListener;
        this.f19378b = campaignEx;
        this.f19379c = appletsModel;
        this.f19380d = aVar;
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    protected final void onRequestFailed(int i8, String str, String str2) {
        CampaignEx campaignEx = this.f19378b;
        if (campaignEx != null && this.f19379c != null) {
            try {
                NativeListener.NativeTrackingListener nativeTrackingListener = this.f19377a;
                if (nativeTrackingListener != null) {
                    try {
                        nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("DefaultAppletSchemeCallBack", e8.getMessage());
                        }
                    }
                }
                this.f19379c.setUserClick(false);
                this.f19379c.setRequestingFinish();
                this.f19378b.setClickURL(str2);
                a aVar = this.f19380d;
                if (aVar != null) {
                    try {
                        aVar.a(this.f19378b);
                    } catch (Exception e9) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("DefaultAppletSchemeCallBack", e9.getMessage());
                        }
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("DefaultAppletSchemeCallBack", e10.getMessage());
                }
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    protected final void onRequestStart() {
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    protected final void onRequestSuccess(String str) {
        CampaignEx campaignEx = this.f19378b;
        if (campaignEx != null && this.f19379c != null) {
            try {
                NativeListener.NativeTrackingListener nativeTrackingListener = this.f19377a;
                if (nativeTrackingListener != null) {
                    try {
                        nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("DefaultAppletSchemeCallBack", e8.getMessage());
                        }
                    }
                }
                this.f19379c.setUserClick(false);
                this.f19379c.setRequestingFinish();
                this.f19378b.setDeepLinkUrl(str);
                a aVar = this.f19380d;
                if (aVar != null) {
                    try {
                        aVar.a(this.f19378b);
                    } catch (Exception e9) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("DefaultAppletSchemeCallBack", e9.getMessage());
                        }
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("DefaultAppletSchemeCallBack", e10.getMessage());
                }
            }
        }
    }
}
