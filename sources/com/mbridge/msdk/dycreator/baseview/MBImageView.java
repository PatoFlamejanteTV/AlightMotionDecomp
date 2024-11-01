package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.a.c;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.e.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.m;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class MBImageView extends ImageView implements InterBase {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Boolean> f19578a;

    /* renamed from: b, reason: collision with root package name */
    private String f19579b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f19580c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBImageView$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19581a;

        static {
            int[] iArr = new int[c.values().length];
            f19581a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19581a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19581a[c.visibility.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public MBImageView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f19579b = "";
        if (context != null && attributeSet != null) {
            try {
                this.f19580c = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
            } catch (Exception e8) {
                ad.b("MBImageView", e8.getMessage());
                return;
            }
        }
        a.a(this, attributeSet);
        setLayoutParams(generateLayoutParams(context, attributeSet));
        com.mbridge.msdk.dycreator.e.c.a(this.f19580c, this);
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        HashMap<String, c> c8 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i8 = 0; i8 < attributeCount; i8++) {
            c cVar = c8.get(attributeSet.getAttributeName(i8));
            if (cVar != null) {
                int i9 = AnonymousClass1.f19581a[cVar.ordinal()];
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 == 3) {
                            String attributeValue = attributeSet.getAttributeValue(i8);
                            if (!TextUtils.isEmpty(attributeValue)) {
                                if (attributeValue.equals("invisible")) {
                                    setVisibility(4);
                                } else if (attributeValue.equalsIgnoreCase("gone")) {
                                    setVisibility(8);
                                }
                            }
                        }
                    } else {
                        String attributeValue2 = attributeSet.getAttributeValue(i8);
                        if (!attributeValue2.startsWith("f") && !attributeValue2.startsWith("m")) {
                            if (attributeValue2.startsWith("wrap")) {
                                layoutParams.height = -2;
                            } else {
                                layoutParams.height = b.a().b(attributeValue2);
                            }
                        } else {
                            layoutParams.height = -1;
                        }
                    }
                } else {
                    String attributeValue3 = attributeSet.getAttributeValue(i8);
                    if (!attributeValue3.startsWith("f") && !attributeValue3.startsWith("m")) {
                        if (attributeValue3.startsWith("wrap")) {
                            layoutParams.width = -2;
                        } else {
                            layoutParams.width = b.a().b(attributeValue3);
                        }
                    } else {
                        layoutParams.width = -1;
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f19580c;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f19580c.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f19580c;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f19580c.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f19580c;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f19580c.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f19580c;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f19580c.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f19580c;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f19580c.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f19578a;
        if (map != null && map.containsKey("mbridgeAttached") && this.f19578a.get("mbridgeAttached").booleanValue()) {
            new m.a("mbridgeAttached").a().a(this.f19579b);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f19578a;
        if (map != null && map.containsKey("mbridgeDetached") && this.f19578a.get("mbridgeDetached").booleanValue()) {
            new m.a("mbridgeDetached").a().a(this.f19579b);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f19578a = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f19579b = campaignEx.getCampaignUnitId();
        }
    }
}
