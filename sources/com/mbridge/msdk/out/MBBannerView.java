package com.mbridge.msdk.out;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.d.b;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbbanner.a.a;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBBannerView extends RelativeLayout implements BaseExtraInterfaceForHandler {
    private String bidToken;
    private a controller;
    private boolean hadAttached;
    private boolean isVisible;
    private BannerAdListener mBannerAdListener;
    private MBridgeIds mBridgeIds;
    private String unitId;

    public MBBannerView(Context context) {
        this(context, null);
    }

    private void delayedNotify() {
        postDelayed(new Runnable() { // from class: com.mbridge.msdk.out.MBBannerView.1
            @Override // java.lang.Runnable
            public void run() {
                if (MBBannerView.this.controller != null && !b.f20403c) {
                    MBBannerView.this.controller.c(true);
                }
            }
        }, 200L);
    }

    private void updateAttachedState(boolean z8) {
        this.hadAttached = z8;
        a aVar = this.controller;
        if (aVar != null) {
            aVar.b(z8);
        }
    }

    public String getCreativeIdWithUnitId() {
        a aVar = this.controller;
        if (aVar != null) {
            return aVar.b();
        }
        return "";
    }

    public String getRequestId() {
        a aVar = this.controller;
        if (aVar != null) {
            return aVar.a();
        }
        return "";
    }

    public void init(BannerSize bannerSize, String str, String str2) {
        String str3;
        this.unitId = str2;
        if (TextUtils.isEmpty(str)) {
            str3 = "";
        } else {
            str3 = str;
        }
        this.mBridgeIds = new MBridgeIds(str3, str2);
        String e8 = ai.e(str2);
        if (!TextUtils.isEmpty(e8)) {
            ai.b(str2, e8);
        }
        a aVar = new a(this, bannerSize, str, str2);
        this.controller = aVar;
        aVar.c(this.isVisible);
        this.controller.b(this.hadAttached);
    }

    public void load() {
        a aVar = this.controller;
        if (aVar != null) {
            aVar.b(this.hadAttached);
            this.controller.a("");
        } else {
            BannerAdListener bannerAdListener = this.mBannerAdListener;
            if (bannerAdListener != null) {
                bannerAdListener.onLoadFailed(this.mBridgeIds, "banner controler init error，please check it");
            }
        }
    }

    public void loadFromBid(String str) {
        this.bidToken = str;
        if (this.controller != null) {
            if (!TextUtils.isEmpty(str)) {
                this.controller.b(this.hadAttached);
                this.controller.a(0);
                this.controller.a(str);
                return;
            } else {
                BannerAdListener bannerAdListener = this.mBannerAdListener;
                if (bannerAdListener != null) {
                    bannerAdListener.onLoadFailed(this.mBridgeIds, "banner token is null or empty，please check it");
                    return;
                }
                return;
            }
        }
        BannerAdListener bannerAdListener2 = this.mBannerAdListener;
        if (bannerAdListener2 != null) {
            bannerAdListener2.onLoadFailed(this.mBridgeIds, "banner controler init error，please check it");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateAttachedState(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        updateAttachedState(false);
    }

    public void onPause() {
        if (this.controller != null && TextUtils.isEmpty(this.bidToken)) {
            this.controller.e();
        }
    }

    public void onResume() {
        if (this.controller != null && TextUtils.isEmpty(this.bidToken) && !b.f20403c) {
            this.controller.f();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        a aVar = this.controller;
        if (aVar != null) {
            aVar.a(i8, i9, i10, i11);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i8) {
        boolean z8;
        super.onVisibilityChanged(view, i8);
        if (i8 == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.isVisible = z8;
        a aVar = this.controller;
        if (aVar != null) {
            if (i8 == 0) {
                delayedNotify();
            } else {
                aVar.c(false);
            }
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i8) {
        boolean z8;
        super.onWindowVisibilityChanged(i8);
        if (i8 == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.isVisible = z8;
        if (this.controller != null) {
            if (i8 == 0) {
                delayedNotify();
            } else {
                if (b.f20403c) {
                    return;
                }
                this.controller.c(false);
            }
        }
    }

    public void release() {
        if (this.mBannerAdListener != null) {
            this.mBannerAdListener = null;
        }
        a aVar = this.controller;
        if (aVar != null) {
            aVar.a((BannerAdListener) null);
            this.controller.c();
        }
        removeAllViews();
    }

    public void setAllowShowCloseBtn(boolean z8) {
        a aVar = this.controller;
        if (aVar != null) {
            aVar.a(z8);
        }
    }

    public void setBannerAdListener(BannerAdListener bannerAdListener) {
        this.mBannerAdListener = bannerAdListener;
        a aVar = this.controller;
        if (aVar != null) {
            aVar.a(bannerAdListener);
        }
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.m().a(this.unitId, jSONObject);
    }

    public void setRefreshTime(int i8) {
        a aVar = this.controller;
        if (aVar != null && i8 >= 0) {
            aVar.a(i8);
        }
    }

    public void updateBannerSize(BannerSize bannerSize) {
        a aVar = this.controller;
        if (aVar != null) {
            aVar.a(bannerSize);
        }
    }

    public MBBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBBannerView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.hadAttached = false;
        this.isVisible = false;
        c.m().a(context);
    }
}
