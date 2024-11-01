package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.a.c;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.e.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.m;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.playercommon.PlayerView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class MBPlayerView extends PlayerView implements InterBase {

    /* renamed from: a, reason: collision with root package name */
    private float f19596a;

    /* renamed from: b, reason: collision with root package name */
    private float f19597b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f19598c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f19599d;

    /* renamed from: e, reason: collision with root package name */
    private String f19600e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBPlayerView$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19601a;

        static {
            int[] iArr = new int[c.values().length];
            f19601a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19601a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19601a[c.layout_centerHorizontal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19601a[c.layout_centerVertical.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19601a[c.layout_weight.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19601a[c.gravity.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19601a[c.layout_margin.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19601a[c.layout_marginLeft.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19601a[c.layout_marginRight.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19601a[c.layout_marginTop.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19601a[c.layout_marginBottom.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19601a[c.layout_gravity.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public MBPlayerView(Context context) {
        super(context);
        this.f19600e = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f19598c;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f19598c.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f19598c;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f19598c.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f19598c;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f19598c.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f19598c;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f19598c.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f19598c;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f19598c.get("mbridgeStrategy");
        }
        return "";
    }

    public float getxInScreen() {
        return this.f19596a;
    }

    public float getyInScreen() {
        return this.f19597b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f19599d;
        if (map != null && map.containsKey("mbridgeAttached") && this.f19599d.get("mbridgeAttached").booleanValue()) {
            new m.a("mbridgeAttached").a().a(this.f19600e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f19599d;
        if (map != null && map.containsKey("mbridgeDetached") && this.f19599d.get("mbridgeDetached").booleanValue()) {
            new m.a("mbridgeDetached").a().a(this.f19600e);
        }
    }

    @Override // com.mbridge.msdk.playercommon.PlayerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f19596a = motionEvent.getRawX();
        this.f19597b = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f19599d = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f19600e = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        HashMap b9 = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i8 = 0; i8 < attributeCount; i8++) {
            c cVar = (c) b9.get(attributeSet.getAttributeName(i8));
            if (cVar != null) {
                switch (AnonymousClass1.f19601a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i8);
                        if (!attributeValue.startsWith("f") && !attributeValue.startsWith("m")) {
                            if (attributeValue.startsWith("wrap")) {
                                layoutParams.width = -2;
                                break;
                            } else {
                                layoutParams.width = b.a().b(attributeValue);
                                break;
                            }
                        } else {
                            layoutParams.width = -1;
                            break;
                        }
                    case 2:
                        String attributeValue2 = attributeSet.getAttributeValue(i8);
                        if (!attributeValue2.startsWith("f") && !attributeValue2.startsWith("m")) {
                            if (attributeValue2.startsWith("wrap")) {
                                layoutParams.height = -2;
                                break;
                            } else {
                                layoutParams.height = b.a().b(attributeValue2);
                                break;
                            }
                        } else {
                            layoutParams.height = -1;
                            break;
                        }
                        break;
                    case 3:
                        layoutParams.gravity = 1;
                        break;
                    case 4:
                        layoutParams.gravity = 16;
                        break;
                    case 5:
                        layoutParams.weight = attributeSet.getAttributeFloatValue(i8, 0.0f);
                        break;
                    case 6:
                        setGravity(b.a().c(attributeSet.getAttributeValue(i8)));
                        break;
                    case 7:
                        int b10 = b.a().b(attributeSet.getAttributeValue(i8));
                        layoutParams.bottomMargin = b10;
                        layoutParams.leftMargin = b10;
                        layoutParams.rightMargin = b10;
                        layoutParams.topMargin = b10;
                        break;
                    case 8:
                        layoutParams.leftMargin = b.a().b(attributeSet.getAttributeValue(i8));
                        break;
                    case 9:
                        layoutParams.rightMargin = b.a().b(attributeSet.getAttributeValue(i8));
                        break;
                    case 10:
                        layoutParams.topMargin = b.a().b(attributeSet.getAttributeValue(i8));
                        break;
                    case 11:
                        layoutParams.bottomMargin = b.a().b(attributeSet.getAttributeValue(i8));
                        break;
                    case 12:
                        layoutParams.gravity = b.a().c(attributeSet.getAttributeValue(i8));
                        break;
                }
            }
        }
        return layoutParams;
    }

    public MBPlayerView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f19600e = "";
        try {
            this.f19598c = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
            a.a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.e.c.a(this.f19598c, this);
        } catch (Exception e8) {
            ad.b("MBLinearLayout", e8.getMessage());
        }
    }
}
