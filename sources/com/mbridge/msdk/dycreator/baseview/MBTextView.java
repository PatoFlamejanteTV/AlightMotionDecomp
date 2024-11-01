package com.mbridge.msdk.dycreator.baseview;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
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
public class MBTextView extends TextView implements InterBase, InterEffect {

    /* renamed from: a, reason: collision with root package name */
    private boolean f19651a;
    public AttributeSet attrs;

    /* renamed from: b, reason: collision with root package name */
    private Animator f19652b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f19653c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f19654d;

    /* renamed from: e, reason: collision with root package name */
    private String f19655e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBTextView$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19656a;

        static {
            int[] iArr = new int[c.values().length];
            f19656a = iArr;
            try {
                iArr[c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19656a[c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MBTextView(Context context) {
        super(context);
        this.f19651a = false;
        this.f19655e = "";
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        HashMap b9 = b.a().b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i8 = 0; i8 < attributeCount; i8++) {
            c cVar = (c) b9.get(attributeSet.getAttributeName(i8));
            if (cVar != null) {
                int i9 = AnonymousClass1.f19656a[cVar.ordinal()];
                if (i9 != 1) {
                    if (i9 == 2) {
                        String attributeValue = attributeSet.getAttributeValue(i8);
                        if (!attributeValue.startsWith("f") && !attributeValue.startsWith("m")) {
                            if (attributeValue.startsWith("wrap")) {
                                layoutParams.height = -2;
                            } else {
                                layoutParams.height = b.a().b(attributeValue);
                            }
                        } else {
                            layoutParams.height = -1;
                        }
                    }
                } else {
                    String attributeValue2 = attributeSet.getAttributeValue(i8);
                    if (!attributeValue2.startsWith("f") && !attributeValue2.startsWith("m")) {
                        if (attributeValue2.startsWith("wrap")) {
                            layoutParams.width = -2;
                        } else {
                            layoutParams.width = b.a().b(attributeValue2);
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
        Map<String, String> map = this.f19653c;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f19653c.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f19653c;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f19653c.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f19653c;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f19653c.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f19653c;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f19653c.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f19653c;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f19653c.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.view.View
    public boolean isFocused() {
        if (this.f19651a) {
            return true;
        }
        return super.isFocused();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Animator animator = this.f19652b;
        if (animator != null) {
            try {
                animator.start();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        Map<String, Boolean> map = this.f19654d;
        if (map != null && map.containsKey("mbridgeAttached") && this.f19654d.get("mbridgeAttached").booleanValue()) {
            new m.a("mbridgeAttached").a().a(this.f19655e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f19652b;
        if (animator != null) {
            try {
                animator.cancel();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        Map<String, Boolean> map = this.f19654d;
        if (map != null && map.containsKey("mbridgeDetached") && this.f19654d.get("mbridgeDetached").booleanValue()) {
            new m.a("mbridgeDetached").a().a(this.f19655e);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterEffect
    public void setAnimator(Animator animator) {
        this.f19652b = animator;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f19654d = com.mbridge.msdk.dycreator.e.c.a(str);
        if (campaignEx != null) {
            this.f19655e = campaignEx.getCampaignUnitId();
        }
    }

    public MBTextView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f19651a = false;
        this.f19655e = "";
        this.attrs = attributeSet;
        try {
            this.f19653c = com.mbridge.msdk.dycreator.e.c.a(context, attributeSet);
            a.a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            com.mbridge.msdk.dycreator.e.c.a(this.f19653c, this);
        } catch (Exception e8) {
            ad.b("TextView", e8.getMessage());
        }
    }

    public MBTextView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f19651a = false;
        this.f19655e = "";
    }
}
