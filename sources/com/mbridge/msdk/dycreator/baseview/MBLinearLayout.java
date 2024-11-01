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
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class MBLinearLayout extends LinearLayout implements InterBase {

    /* renamed from: a, reason: collision with root package name */
    private float f19586a;

    /* renamed from: b, reason: collision with root package name */
    private float f19587b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f19588c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f19589d;

    /* renamed from: e, reason: collision with root package name */
    private String f19590e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBLinearLayout$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19591a;

        static {
            int[] iArr = new int[c.values().length];
            f19591a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19591a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19591a[c.layout_centerHorizontal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19591a[c.layout_centerVertical.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19591a[c.layout_weight.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19591a[c.gravity.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19591a[c.layout_margin.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19591a[c.layout_marginLeft.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19591a[c.layout_marginRight.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19591a[c.layout_marginTop.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19591a[c.layout_marginBottom.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19591a[c.layout_gravity.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public MBLinearLayout(Context context) {
        super(context);
        this.f19590e = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f19588c;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f19588c.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f19588c;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f19588c.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f19588c;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f19588c.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f19588c;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f19588c.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f19588c;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f19588c.get("mbridgeStrategy");
        }
        return "";
    }

    public float getxInScreen() {
        return this.f19586a;
    }

    public float getyInScreen() {
        return this.f19587b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f19589d;
        if (map != null && map.containsKey("mbridgeAttached") && this.f19589d.get("mbridgeAttached").booleanValue()) {
            new m.a("mbridgeAttached").a().a(this.f19590e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f19589d;
        if (map != null && map.containsKey("mbridgeDetached") && this.f19589d.get("mbridgeDetached").booleanValue()) {
            new m.a("mbridgeDetached").a().a(this.f19590e);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f19586a = motionEvent.getRawX();
        this.f19587b = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f19589d = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f19590e = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LinearLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        HashMap b9 = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i8 = 0; i8 < attributeCount; i8++) {
            c cVar = (c) b9.get(attributeSet.getAttributeName(i8));
            if (cVar != null) {
                switch (AnonymousClass1.f19591a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i8);
                        if (!attributeValue.startsWith("f") && !attributeValue.startsWith("m")) {
                            if (attributeValue.startsWith("wrap")) {
                                generateDefaultLayoutParams.width = -2;
                                break;
                            } else {
                                generateDefaultLayoutParams.width = b.a().b(attributeValue);
                                break;
                            }
                        } else {
                            generateDefaultLayoutParams.width = -1;
                            break;
                        }
                    case 2:
                        String attributeValue2 = attributeSet.getAttributeValue(i8);
                        if (!attributeValue2.startsWith("f") && !attributeValue2.startsWith("m")) {
                            if (attributeValue2.startsWith("wrap")) {
                                generateDefaultLayoutParams.height = -2;
                                break;
                            } else {
                                generateDefaultLayoutParams.height = b.a().b(attributeValue2);
                                break;
                            }
                        } else {
                            generateDefaultLayoutParams.height = -1;
                            break;
                        }
                        break;
                    case 3:
                        generateDefaultLayoutParams.gravity = 1;
                        break;
                    case 4:
                        generateDefaultLayoutParams.gravity = 16;
                        break;
                    case 5:
                        generateDefaultLayoutParams.weight = attributeSet.getAttributeFloatValue(i8, 0.0f);
                        break;
                    case 6:
                        setGravity(b.a().c(attributeSet.getAttributeValue(i8)));
                        break;
                    case 7:
                        int b10 = b.a().b(attributeSet.getAttributeValue(i8));
                        generateDefaultLayoutParams.bottomMargin = b10;
                        generateDefaultLayoutParams.leftMargin = b10;
                        generateDefaultLayoutParams.rightMargin = b10;
                        generateDefaultLayoutParams.topMargin = b10;
                        break;
                    case 8:
                        generateDefaultLayoutParams.leftMargin = b.a().b(attributeSet.getAttributeValue(i8));
                        break;
                    case 9:
                        generateDefaultLayoutParams.rightMargin = b.a().b(attributeSet.getAttributeValue(i8));
                        break;
                    case 10:
                        generateDefaultLayoutParams.topMargin = b.a().b(attributeSet.getAttributeValue(i8));
                        break;
                    case 11:
                        generateDefaultLayoutParams.bottomMargin = b.a().b(attributeSet.getAttributeValue(i8));
                        break;
                    case 12:
                        generateDefaultLayoutParams.gravity = b.a().c(attributeSet.getAttributeValue(i8));
                        break;
                }
            }
        }
        return generateDefaultLayoutParams;
    }

    public MBLinearLayout(Context context, AttributeSet attributeSet) {
        super(context);
        this.f19590e = "";
        this.f19588c = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
        a.a(this, attributeSet);
        setLayoutParams(generateLayoutParams(attributeSet));
        com.mbridge.msdk.dycreator.e.c.a(this.f19588c, this);
    }

    public MBLinearLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f19590e = "";
    }
}
