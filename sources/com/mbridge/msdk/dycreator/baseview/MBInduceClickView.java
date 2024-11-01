package com.mbridge.msdk.dycreator.baseview;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.a.c;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.baseview.inter.InterEffect;
import com.mbridge.msdk.dycreator.e.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.m;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class MBInduceClickView extends FrameLayout implements InterBase, InterEffect {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f19582a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f19583b;

    /* renamed from: c, reason: collision with root package name */
    private String f19584c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBInduceClickView$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19585a;

        static {
            int[] iArr = new int[c.values().length];
            f19585a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19585a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19585a[c.layout_gravity.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19585a[c.layout_marginLeft.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19585a[c.layout_margin.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MBInduceClickView(Context context) {
        super(context);
        this.f19584c = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f19582a;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f19582a.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f19582a;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f19582a.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f19582a;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f19582a.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f19582a;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f19582a.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f19582a;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f19582a.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f19583b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f19583b.get("mbridgeAttached").booleanValue()) {
            new m.a("mbridgeAttached").a().a(this.f19584c);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f19583b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f19583b.get("mbridgeDetached").booleanValue()) {
            new m.a("mbridgeDetached").a().a(this.f19584c);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterEffect
    public void setAnimator(Animator animator) {
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f19583b = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f19584c = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        HashMap b9 = b.a().b();
        layoutParams.width = -2;
        layoutParams.height = -2;
        int attributeCount = attributeSet.getAttributeCount();
        for (int i8 = 0; i8 < attributeCount; i8++) {
            c cVar = (c) b9.get(attributeSet.getAttributeName(i8));
            if (cVar != null) {
                int i9 = AnonymousClass1.f19585a[cVar.ordinal()];
                if (i9 == 1) {
                    String attributeValue = attributeSet.getAttributeValue(i8);
                    if (!attributeValue.startsWith("f") && !attributeValue.startsWith("m")) {
                        if (attributeValue.startsWith("w")) {
                            layoutParams.width = -2;
                        } else {
                            layoutParams.width = b.a().b(attributeValue);
                        }
                    } else {
                        layoutParams.width = -1;
                    }
                } else if (i9 == 2) {
                    String attributeValue2 = attributeSet.getAttributeValue(i8);
                    if (!attributeValue2.startsWith("f") && !attributeValue2.startsWith("m")) {
                        if (attributeValue2.startsWith("w")) {
                            layoutParams.width = -2;
                        } else {
                            layoutParams.height = b.a().b(attributeValue2);
                        }
                    } else {
                        layoutParams.width = -1;
                    }
                } else if (i9 == 3) {
                    layoutParams.gravity = b.a().c(attributeSet.getAttributeValue(i8));
                } else if (i9 == 4) {
                    layoutParams.leftMargin = b.a().b(attributeSet.getAttributeValue(i8));
                } else if (i9 == 5) {
                    int b10 = b.a().b(attributeSet.getAttributeValue(i8));
                    layoutParams.setMargins(b10, b10, b10, b10);
                }
            }
        }
        return layoutParams;
    }

    public MBInduceClickView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f19584c = "";
        if (context != null && attributeSet != null) {
            try {
                this.f19582a = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
            } catch (Exception e8) {
                ad.b("MBInduceClickView", e8.getMessage());
                return;
            }
        }
        a.a(this, attributeSet);
        setLayoutParams(generateLayoutParams(attributeSet));
        com.mbridge.msdk.dycreator.e.c.a(this.f19582a, this);
    }

    public MBInduceClickView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f19584c = "";
    }
}
