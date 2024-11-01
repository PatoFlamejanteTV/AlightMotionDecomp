package com.mbridge.msdk.dycreator.baseview.extview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.RelativeLayout;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.a.c;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.v;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class MBExtAcquireRewardPopView extends MBAcquireRewardPopView implements InterBase {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f19754a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.extview.MBExtAcquireRewardPopView$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19755a;

        static {
            int[] iArr = new int[c.values().length];
            f19755a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19755a[c.background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19755a[c.padding.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19755a[c.gravity.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19755a[c.visibility.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19755a[c.layout_width.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19755a[c.layout_height.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19755a[c.layout_centerHorizontal.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19755a[c.layout_alignParentBottom.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19755a[c.layout_alignParentTop.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19755a[c.layout_centerVertical.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19755a[c.layout_below.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19755a[c.layout_above.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19755a[c.layout_toLeftOf.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19755a[c.layout_toRightOf.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19755a[c.layout_toEndOf.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19755a[c.layout_margin.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f19755a[c.layout_marginLeft.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f19755a[c.layout_marginRight.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f19755a[c.layout_marginTop.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f19755a[c.layout_marginBottom.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f19755a[c.layout_alignParentRight.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f19755a[c.layout_alignParentLeft.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f19755a[c.layout_alignTop.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f19755a[c.layout_alignLeft.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f19755a[c.layout_alignRight.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f19755a[c.layout_alignBottom.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f19755a[c.layout_centerInParent.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f19755a[c.layout_alignParentEnd.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    public MBExtAcquireRewardPopView(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f19754a;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f19754a.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f19754a;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f19754a.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f19754a;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f19754a.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f19754a;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f19754a.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f19754a;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f19754a.get("mbridgeStrategy");
        }
        return "";
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArr;
        HashMap<String, c> c8 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i8 = 0; i8 < attributeCount; i8++) {
            c cVar = c8.get(attributeSet.getAttributeName(i8));
            if (cVar != null) {
                int i9 = AnonymousClass1.f19755a[cVar.ordinal()];
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 != 4) {
                                if (i9 == 5) {
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
                                setGravity(b.a().c(attributeSet.getAttributeValue(i8)));
                            }
                        } else {
                            int b9 = b.a().b(attributeSet.getAttributeValue(i8));
                            setPadding(b9, b9, b9, b9);
                        }
                    } else {
                        Log.i("litongtest", "设置背景颜色");
                        String attributeValue2 = attributeSet.getAttributeValue(i8);
                        if (attributeValue2.startsWith("#")) {
                            try {
                                strArr = attributeValue2.split("-");
                            } catch (Exception unused) {
                                strArr = null;
                            }
                            if (strArr != null && strArr.length <= 2) {
                                setBackgroundColor(b.a().a(attributeSet.getAttributeValue(i8)));
                            } else {
                                if (strArr != null && strArr.length == 3) {
                                    try {
                                        GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArr[2]), new int[]{Color.parseColor(strArr[0]), Color.parseColor(strArr[1])});
                                        gradientDrawable.setGradientType(0);
                                        setBackground(gradientDrawable);
                                    } catch (Exception unused2) {
                                    }
                                }
                                setBackgroundColor(b.a().a(attributeSet.getAttributeValue(i8)));
                            }
                        } else {
                            if (attributeValue2.startsWith("@drawable/")) {
                                attributeValue2 = attributeValue2.substring(10);
                            }
                            setBackgroundResource(v.a(com.mbridge.msdk.foundation.controller.c.m().c(), attributeValue2, "drawable"));
                        }
                    }
                } else {
                    String attributeValue3 = attributeSet.getAttributeValue(i8);
                    if (attributeValue3.startsWith("@+id/")) {
                        setId(attributeValue3.substring(5).hashCode());
                    }
                }
            }
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
    }

    public MBExtAcquireRewardPopView(Context context, AttributeSet attributeSet) {
        super(context);
        try {
            this.f19754a = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.e.c.a(this.f19754a, this);
        } catch (Exception e8) {
            ad.b("MBExtAcquireRewardPopView", e8.getMessage());
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
                switch (AnonymousClass1.f19755a[cVar.ordinal()]) {
                    case 6:
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
                    case 7:
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
                    case 8:
                        if (attributeSet.getAttributeBooleanValue(i8, false)) {
                            layoutParams.addRule(14, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (attributeSet.getAttributeBooleanValue(i8, false)) {
                            layoutParams.addRule(12, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (attributeSet.getAttributeBooleanValue(i8, false)) {
                            layoutParams.addRule(10, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (attributeSet.getAttributeBooleanValue(i8, false)) {
                            layoutParams.addRule(15, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        String attributeValue3 = attributeSet.getAttributeValue(i8);
                        if (attributeValue3.startsWith("@+id")) {
                            layoutParams.addRule(3, attributeValue3.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        String attributeValue4 = attributeSet.getAttributeValue(i8);
                        if (attributeValue4.startsWith("@+id")) {
                            layoutParams.addRule(2, attributeValue4.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        String attributeValue5 = attributeSet.getAttributeValue(i8);
                        if (attributeValue5.startsWith("@+id")) {
                            layoutParams.addRule(0, attributeValue5.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        String attributeValue6 = attributeSet.getAttributeValue(i8);
                        if (attributeValue6.startsWith("@+id")) {
                            layoutParams.addRule(1, attributeValue6.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        String attributeValue7 = attributeSet.getAttributeValue(i8);
                        if (attributeValue7.startsWith("@+id")) {
                            layoutParams.addRule(17, attributeValue7.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int b10 = b.a().b(attributeSet.getAttributeValue(i8));
                        layoutParams.setMargins(b10, b10, b10, b10);
                        break;
                    case 18:
                        layoutParams.leftMargin = b.a().b(attributeSet.getAttributeValue(i8));
                        break;
                    case 19:
                        layoutParams.rightMargin = b.a().b(attributeSet.getAttributeValue(i8));
                        break;
                    case 20:
                        layoutParams.topMargin = b.a().b(attributeSet.getAttributeValue(i8));
                        break;
                    case 21:
                        layoutParams.bottomMargin = b.a().b(attributeSet.getAttributeValue(i8));
                        break;
                    case 22:
                        if (attributeSet.getAttributeBooleanValue(i8, false)) {
                            layoutParams.addRule(11, -1);
                            break;
                        } else {
                            break;
                        }
                    case 23:
                        if (attributeSet.getAttributeBooleanValue(i8, false)) {
                            layoutParams.addRule(9, -1);
                            break;
                        } else {
                            break;
                        }
                    case 24:
                        String attributeValue8 = attributeSet.getAttributeValue(i8);
                        if (attributeValue8.startsWith("@+id")) {
                            layoutParams.addRule(6, attributeValue8.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 25:
                        String attributeValue9 = attributeSet.getAttributeValue(i8);
                        if (attributeValue9.startsWith("@+id")) {
                            layoutParams.addRule(5, attributeValue9.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 26:
                        String attributeValue10 = attributeSet.getAttributeValue(i8);
                        if (attributeValue10.startsWith("@+id")) {
                            layoutParams.addRule(7, attributeValue10.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 27:
                        String attributeValue11 = attributeSet.getAttributeValue(i8);
                        if (attributeValue11.startsWith("@+id")) {
                            layoutParams.addRule(8, attributeValue11.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 28:
                        if (attributeSet.getAttributeBooleanValue(i8, false)) {
                            layoutParams.addRule(13, -1);
                            break;
                        } else {
                            break;
                        }
                    case 29:
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

    public MBExtAcquireRewardPopView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
