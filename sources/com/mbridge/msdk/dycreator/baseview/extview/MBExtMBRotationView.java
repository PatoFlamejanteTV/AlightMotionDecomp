package com.mbridge.msdk.dycreator.baseview.extview;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.a.c;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.m;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class MBExtMBRotationView extends MBRotationView implements InterBase {

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f19764b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Boolean> f19765c;

    /* renamed from: d, reason: collision with root package name */
    private String f19766d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.extview.MBExtMBRotationView$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19767a;

        static {
            int[] iArr = new int[c.values().length];
            f19767a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19767a[c.background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19767a[c.contentDescription.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19767a[c.visibility.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19767a[c.layout_width.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19767a[c.layout_height.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19767a[c.layout_gravity.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19767a[c.layout_marginLeft.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19767a[c.layout_margin.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public MBExtMBRotationView(Context context) {
        super(context);
        this.f19766d = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f19764b;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f19764b.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f19764b;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f19764b.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f19764b;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f19764b.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f19764b;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f19764b.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f19764b;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f19764b.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f19765c;
        if (map != null && map.containsKey("mbridgeAttached") && this.f19765c.get("mbridgeAttached").booleanValue()) {
            new m.a("mbridgeAttached").a().a(this.f19766d);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f19765c;
        if (map != null && map.containsKey("mbridgeDetached") && this.f19765c.get("mbridgeDetached").booleanValue()) {
            new m.a("mbridgeDetached").a().a(this.f19766d);
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArr;
        HashMap<String, c> c8 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i8 = 0; i8 < attributeCount; i8++) {
            c cVar = c8.get(attributeSet.getAttributeName(i8));
            if (cVar != null) {
                int i9 = AnonymousClass1.f19767a[cVar.ordinal()];
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 == 4) {
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
                            setContentDescription(attributeSet.getAttributeValue(i8));
                        }
                    } else {
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
                        } else if (attributeValue2.startsWith("@color/")) {
                            setBackgroundColor(b.a().a(attributeSet.getAttributeValue(i8)));
                        } else {
                            if (attributeValue2.startsWith("@drawable/")) {
                                attributeValue2 = attributeValue2.substring(10);
                            }
                            setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeFile(getContext().getFilesDir().toString() + "/" + attributeValue2 + ".png")));
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
        this.f19765c = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f19766d = campaignEx.getCampaignUnitId();
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
                switch (AnonymousClass1.f19767a[cVar.ordinal()]) {
                    case 5:
                        String attributeValue = attributeSet.getAttributeValue(i8);
                        if (!attributeValue.startsWith("f") && !attributeValue.startsWith("m")) {
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
                    case 6:
                        String attributeValue2 = attributeSet.getAttributeValue(i8);
                        if (!attributeValue2.startsWith("f") && !attributeValue2.startsWith("m")) {
                            if (attributeValue2.startsWith("w")) {
                                layoutParams.width = -2;
                                break;
                            } else {
                                layoutParams.height = b.a().b(attributeValue2);
                                break;
                            }
                        } else {
                            layoutParams.width = -1;
                            break;
                        }
                        break;
                    case 7:
                        layoutParams.gravity = b.a().c(attributeSet.getAttributeValue(i8));
                        break;
                    case 8:
                        layoutParams.leftMargin = b.a().b(attributeSet.getAttributeValue(i8));
                        break;
                    case 9:
                        int b10 = b.a().b(attributeSet.getAttributeValue(i8));
                        layoutParams.setMargins(b10, b10, b10, b10);
                        break;
                }
            }
        }
        return layoutParams;
    }

    public MBExtMBRotationView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f19766d = "";
        try {
            this.f19764b = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.e.c.a(this.f19764b, this);
        } catch (Exception e8) {
            ad.b("MBExtMBRotationView", e8.getMessage());
        }
    }

    public MBExtMBRotationView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f19766d = "";
    }
}
