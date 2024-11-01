package com.mbridge.msdk.video.module;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.video.signal.factory.b;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeClickMiniCardView extends MBridgeH5EndCardView {

    /* renamed from: x, reason: collision with root package name */
    private boolean f23521x;

    public MBridgeClickMiniCardView(Context context) {
        super(context);
        this.f23521x = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public final String a() {
        CampaignEx campaignEx = this.f23494b;
        if (campaignEx == null) {
            return null;
        }
        CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
        String c8 = rewardTemplateMode != null ? rewardTemplateMode.c() : null;
        if (TextUtils.isEmpty(c8) || !c8.contains(".zip")) {
            return c8;
        }
        String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(c8);
        return !TextUtils.isEmpty(h5ResAddress) ? h5ResAddress : c8;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    protected final RelativeLayout.LayoutParams b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public final void e() {
        super.e();
        if (this.f23498f) {
            setBackgroundResource(findColor("mbridge_reward_minicard_bg"));
            a(this.f23579n);
            setClickable(true);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        if (this.f23498f) {
            a(this.f23579n);
        }
        super.onSelfConfigurationChanged(configuration);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public void preLoadData(b bVar) {
        super.preLoadData(bVar);
        setCloseVisible(0);
    }

    public void resizeMiniCard(int i8, int i9) {
        View findViewById = ((Activity) this.f23493a).getWindow().findViewById(R.id.content);
        int width = findViewById.getWidth();
        int height = findViewById.getHeight();
        if (i8 > 0 && i9 > 0 && i8 <= width && i9 <= height) {
            ViewGroup.LayoutParams layoutParams = this.f23579n.getLayoutParams();
            layoutParams.width = i8;
            layoutParams.height = i9;
            this.f23579n.setLayoutParams(layoutParams);
        }
    }

    public void setMBridgeClickMiniCardViewClickable(boolean z8) {
        setClickable(z8);
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        setBackgroundColor(0);
    }

    public void setMiniCardLocation(int i8, int i9, int i10, int i11) {
        this.f23521x = true;
        resizeMiniCard(i10, i11);
    }

    public void setRadius(int i8) {
        if (i8 > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(ai.a(getContext(), i8));
            gradientDrawable.setColor(-1);
            this.f23582q.setBackground(gradientDrawable);
            this.f23582q.setClipToOutline(true);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f23582q;
        if (windVaneWebView != null) {
            windVaneWebView.post(new Runnable() { // from class: com.mbridge.msdk.video.module.MBridgeClickMiniCardView.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ad.a(MBridgeBaseView.TAG, "webviewshow");
                        String str = "";
                        try {
                            int[] iArr = new int[2];
                            MBridgeClickMiniCardView.this.f23582q.getLocationOnScreen(iArr);
                            ad.b(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("startX", ai.b(c.m().c(), (float) iArr[0]));
                            jSONObject.put("startY", ai.b(c.m().c(), (float) iArr[1]));
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            ad.a(MBridgeBaseView.TAG, th.getMessage(), th);
                        }
                        g.a().a((WebView) MBridgeClickMiniCardView.this.f23582q, "webviewshow", Base64.encodeToString(str.toString().getBytes(), 2));
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
            });
            d dVar = new d();
            dVar.a("type", 3);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000133", this.f23494b, dVar);
        }
    }

    public MBridgeClickMiniCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23521x = false;
    }

    private void a(View view) {
        int f8 = ai.f(this.f23493a);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) ((f8 * 0.7f) + 0.5f);
        layoutParams.height = (int) ((ai.e(this.f23493a) * 0.7f) + 0.5f);
        view.setLayoutParams(layoutParams);
    }
}
