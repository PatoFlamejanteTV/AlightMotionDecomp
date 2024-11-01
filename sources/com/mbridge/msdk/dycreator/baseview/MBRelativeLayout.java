package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
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
public class MBRelativeLayout extends RelativeLayout implements InterBase {

    /* renamed from: a, reason: collision with root package name */
    private float f19602a;

    /* renamed from: b, reason: collision with root package name */
    private float f19603b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f19604c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f19605d;

    /* renamed from: e, reason: collision with root package name */
    private String f19606e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBRelativeLayout$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19607a;

        static {
            int[] iArr = new int[c.values().length];
            f19607a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19607a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19607a[c.layout_centerHorizontal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19607a[c.layout_alignParentBottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19607a[c.layout_alignParentTop.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19607a[c.layout_centerVertical.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19607a[c.layout_below.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19607a[c.layout_above.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19607a[c.layout_toLeftOf.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19607a[c.layout_toRightOf.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19607a[c.layout_toEndOf.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19607a[c.layout_margin.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19607a[c.layout_marginLeft.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19607a[c.layout_marginRight.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19607a[c.layout_marginTop.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19607a[c.layout_marginBottom.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19607a[c.layout_alignParentRight.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f19607a[c.layout_alignParentLeft.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f19607a[c.layout_alignTop.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f19607a[c.layout_alignLeft.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f19607a[c.layout_alignRight.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f19607a[c.layout_alignBottom.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f19607a[c.layout_centerInParent.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f19607a[c.layout_alignParentEnd.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    public MBRelativeLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f19606e = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f19604c;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f19604c.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f19604c;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f19604c.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f19604c;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f19604c.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f19604c;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f19604c.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f19604c;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f19604c.get("mbridgeStrategy");
        }
        return "";
    }

    public float getxInScreen() {
        return this.f19602a;
    }

    public float getyInScreen() {
        return this.f19603b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f19605d;
        if (map != null && map.containsKey("mbridgeAttached") && this.f19605d.get("mbridgeAttached").booleanValue()) {
            new m.a("mbridgeAttached").a().a(this.f19606e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f19605d;
        if (map != null && map.containsKey("mbridgeDetached") && this.f19605d.get("mbridgeDetached").booleanValue()) {
            new m.a("mbridgeDetached").a().a(this.f19606e);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f19602a = motionEvent.getRawX();
        this.f19603b = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            try {
                View childAt = getChildAt(i12);
                if (childAt instanceof MBLinearLayout) {
                    MBLinearLayout mBLinearLayout = (MBLinearLayout) childAt;
                    for (int i13 = 0; i13 < mBLinearLayout.getChildCount(); i13++) {
                    }
                }
            } catch (Exception e8) {
                ad.b("MBRelativeLayouts", e8.getMessage());
            }
        }
        super.onLayout(z8, i8, i9, i10, i11);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f19605d = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f19606e = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public RelativeLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        HashMap b9 = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i8 = 0; i8 < attributeCount; i8++) {
            c cVar = (c) b9.get(attributeSet.getAttributeName(i8));
            if (cVar != null) {
                switch (AnonymousClass1.f19607a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i8);
                        if (!attributeValue.startsWith("fill") && !attributeValue.startsWith("match")) {
                            if (attributeValue.startsWith("w")) {
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
                        break;
                    case 2:
                        String attributeValue2 = attributeSet.getAttributeValue(i8);
                        if (!attributeValue2.startsWith("fill") && !attributeValue2.startsWith("match")) {
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
                        if (attributeSet.getAttributeBooleanValue(i8, false)) {
                            layoutParams.addRule(14, -1);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (attributeSet.getAttributeBooleanValue(i8, false)) {
                            layoutParams.addRule(12, -1);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (attributeSet.getAttributeBooleanValue(i8, false)) {
                            layoutParams.addRule(10, -1);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (attributeSet.getAttributeBooleanValue(i8, false)) {
                            layoutParams.addRule(15, -1);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        String attributeValue3 = attributeSet.getAttributeValue(i8);
                        if (attributeValue3.startsWith("@+id")) {
                            layoutParams.addRule(3, attributeValue3.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        String attributeValue4 = attributeSet.getAttributeValue(i8);
                        if (attributeValue4.startsWith("@+id")) {
                            layoutParams.addRule(2, attributeValue4.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        String attributeValue5 = attributeSet.getAttributeValue(i8);
                        if (attributeValue5.startsWith("@+id")) {
                            layoutParams.addRule(0, attributeValue5.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        String attributeValue6 = attributeSet.getAttributeValue(i8);
                        if (attributeValue6.startsWith("@+id")) {
                            layoutParams.addRule(1, attributeValue6.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        String attributeValue7 = attributeSet.getAttributeValue(i8);
                        if (attributeValue7.startsWith("@+id")) {
                            layoutParams.addRule(17, attributeValue7.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int b10 = b.a().b(attributeSet.getAttributeValue(i8));
                        layoutParams.setMargins(b10, b10, b10, b10);
                        break;
                    case 13:
                        layoutParams.leftMargin = b.a().b(attributeSet.getAttributeValue(i8));
                        break;
                    case 14:
                        layoutParams.rightMargin = b.a().b(attributeSet.getAttributeValue(i8));
                        break;
                    case 15:
                        layoutParams.topMargin = b.a().b(attributeSet.getAttributeValue(i8));
                        break;
                    case 16:
                        layoutParams.bottomMargin = b.a().b(attributeSet.getAttributeValue(i8));
                        break;
                    case 17:
                        if (attributeSet.getAttributeBooleanValue(i8, false)) {
                            layoutParams.addRule(11, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        if (attributeSet.getAttributeBooleanValue(i8, false)) {
                            layoutParams.addRule(9, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        String attributeValue8 = attributeSet.getAttributeValue(i8);
                        if (attributeValue8.startsWith("@+id")) {
                            layoutParams.addRule(6, attributeValue8.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        String attributeValue9 = attributeSet.getAttributeValue(i8);
                        if (attributeValue9.startsWith("@+id")) {
                            layoutParams.addRule(5, attributeValue9.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        String attributeValue10 = attributeSet.getAttributeValue(i8);
                        if (attributeValue10.startsWith("@+id")) {
                            layoutParams.addRule(7, attributeValue10.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 22:
                        String attributeValue11 = attributeSet.getAttributeValue(i8);
                        if (attributeValue11.startsWith("@+id")) {
                            layoutParams.addRule(8, attributeValue11.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 23:
                        if (attributeSet.getAttributeBooleanValue(i8, false)) {
                            layoutParams.addRule(13, -1);
                            break;
                        } else {
                            break;
                        }
                    case 24:
                        if (attributeSet.getAttributeBooleanValue(i8, false)) {
                            layoutParams.addRule(21, -1);
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        return layoutParams;
    }

    public MBRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context);
        this.f19606e = "";
        try {
            this.f19604c = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
            a.a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.e.c.a(this.f19604c, this);
        } catch (Exception e8) {
            ad.b("MBRelativeLayouts", e8.getMessage());
        }
    }

    public MBRelativeLayout(Context context) {
        super(context);
        this.f19606e = "";
    }
}
