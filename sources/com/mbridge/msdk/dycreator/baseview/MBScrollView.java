package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.a.c;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.m;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class MBScrollView extends ScrollView implements InterBase {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f19609a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f19610b;

    /* renamed from: c, reason: collision with root package name */
    private String f19611c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBScrollView$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19612a;

        static {
            int[] iArr = new int[c.values().length];
            f19612a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19612a[c.background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19612a[c.contentDescription.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19612a[c.fadingEdge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19612a[c.visibility.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19612a[c.layout_marginBottom.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public MBScrollView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f19611c = "";
        this.f19609a = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
        setAttributeSet(attributeSet);
        setLayoutParams(generateLayoutParams(attributeSet));
        com.mbridge.msdk.dycreator.e.c.a(this.f19609a, this);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f19609a;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f19609a.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f19609a;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f19609a.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f19609a;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f19609a.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f19609a;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f19609a.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f19609a;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f19609a.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f19610b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f19610b.get("mbridgeAttached").booleanValue()) {
            new m.a("mbridgeAttached").a().a(this.f19611c);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f19610b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f19610b.get("mbridgeDetached").booleanValue()) {
            new m.a("mbridgeDetached").a().a(this.f19611c);
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        HashMap<String, c> c8 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i8 = 0; i8 < attributeCount; i8++) {
            c cVar = c8.get(attributeSet.getAttributeName(i8));
            if (cVar != null) {
                int i9 = AnonymousClass1.f19612a[cVar.ordinal()];
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 == 3) {
                            setContentDescription(attributeSet.getAttributeValue(i8));
                        }
                    } else {
                        String attributeValue = attributeSet.getAttributeValue(i8);
                        if (attributeValue.startsWith("#")) {
                            setBackgroundColor(b.a().a(attributeSet.getAttributeValue(i8)));
                        } else {
                            if (attributeValue.startsWith("@drawable/")) {
                                attributeValue = attributeValue.substring(10);
                            }
                            setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeFile(getContext().getFilesDir().toString() + "/" + attributeValue + ".png")));
                        }
                    }
                } else {
                    String attributeValue2 = attributeSet.getAttributeValue(i8);
                    if (attributeValue2.startsWith("@+id/")) {
                        setId(attributeValue2.substring(5).hashCode());
                    }
                }
            }
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f19610b = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f19611c = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        FrameLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        HashMap<String, c> c8 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i8 = 0; i8 < attributeCount; i8++) {
            c cVar = c8.get(attributeSet.getAttributeName(i8));
            if (cVar != null) {
                Log.e("MBscrollviewparam", cVar.toString());
            }
            if (cVar != null) {
                int i9 = AnonymousClass1.f19612a[cVar.ordinal()];
                if (i9 == 4) {
                    setHorizontalFadingEdgeEnabled(attributeSet.getAttributeBooleanValue(i8, false));
                } else if (i9 == 5) {
                    String attributeValue = attributeSet.getAttributeValue(i8);
                    if (!TextUtils.isEmpty(attributeValue)) {
                        if (attributeValue.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                } else if (i9 == 6) {
                    generateDefaultLayoutParams.bottomMargin = b.a().b(attributeSet.getAttributeValue(i8));
                }
            }
        }
        return generateDefaultLayoutParams;
    }
}
