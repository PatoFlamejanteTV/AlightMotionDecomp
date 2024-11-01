package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.e.a;
import com.mbridge.msdk.dycreator.e.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.m;
import java.util.Map;

/* loaded from: classes4.dex */
public class MBButton extends Button implements InterBase {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f19557a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f19558b;

    /* renamed from: c, reason: collision with root package name */
    private String f19559c;

    public MBButton(Context context) {
        super(context);
        this.f19559c = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f19557a;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f19557a.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f19557a;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f19557a.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f19557a;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f19557a.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f19557a;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f19557a.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f19557a;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f19557a.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f19558b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f19558b.get("mbridgeAttached").booleanValue()) {
            new m.a("mbridgeAttached").a().a(this.f19559c);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f19558b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f19558b.get("mbridgeDetached").booleanValue()) {
            new m.a("mbridgeDetached").a().a(this.f19559c);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f19558b = c.a(str);
        if (campaignEx != null) {
            this.f19559c = campaignEx.getCampaignUnitId();
        }
    }

    public MBButton(Context context, AttributeSet attributeSet) {
        super(context);
        this.f19559c = "";
        this.f19557a = c.a(context, attributeSet);
        a.a(this, attributeSet);
        c.a(this.f19557a, this);
    }

    public MBButton(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f19559c = "";
    }
}
