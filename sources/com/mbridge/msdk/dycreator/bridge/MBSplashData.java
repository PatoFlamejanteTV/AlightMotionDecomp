package com.mbridge.msdk.dycreator.bridge;

import com.mbridge.msdk.dycreator.f.a.a;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public class MBSplashData implements a {

    /* renamed from: a, reason: collision with root package name */
    private DyOption f19860a;

    /* renamed from: b, reason: collision with root package name */
    private String f19861b;

    /* renamed from: c, reason: collision with root package name */
    private String f19862c;

    /* renamed from: d, reason: collision with root package name */
    private String f19863d;

    /* renamed from: e, reason: collision with root package name */
    private String f19864e;

    /* renamed from: f, reason: collision with root package name */
    private CampaignEx f19865f;

    /* renamed from: g, reason: collision with root package name */
    private int f19866g;

    /* renamed from: h, reason: collision with root package name */
    private int f19867h;

    /* renamed from: i, reason: collision with root package name */
    private float f19868i;

    /* renamed from: j, reason: collision with root package name */
    private float f19869j;

    /* renamed from: k, reason: collision with root package name */
    private int f19870k = 0;

    public MBSplashData(DyOption dyOption) {
        this.f19860a = dyOption;
        this.f19865f = dyOption.getCampaignEx();
    }

    public String getAdClickText() {
        return this.f19862c;
    }

    public String getAppInfo() {
        return this.f19861b;
    }

    @Override // com.mbridge.msdk.dycreator.f.a.a
    public CampaignEx getBindData() {
        return this.f19865f;
    }

    public int getClickType() {
        return this.f19870k;
    }

    public String getCountDownText() {
        return this.f19863d;
    }

    public DyOption getDyOption() {
        return this.f19860a;
    }

    @Override // com.mbridge.msdk.dycreator.f.a.a
    public DyOption getEffectData() {
        return this.f19860a;
    }

    public int getLogoImage() {
        return this.f19867h;
    }

    public String getLogoText() {
        return this.f19864e;
    }

    public int getNoticeImage() {
        return this.f19866g;
    }

    public float getxInScreen() {
        return this.f19868i;
    }

    public float getyInScreen() {
        return this.f19869j;
    }

    public void setAdClickText(String str) {
        this.f19862c = str;
    }

    public void setAppInfo(String str) {
        this.f19861b = str;
    }

    public void setClickType(int i8) {
        this.f19870k = i8;
    }

    public void setCountDownText(String str) {
        this.f19863d = str;
    }

    public void setLogoImage(int i8) {
        this.f19867h = i8;
    }

    public void setLogoText(String str) {
        this.f19864e = str;
    }

    public void setNoticeImage(int i8) {
        this.f19866g = i8;
    }

    public void setxInScreen(float f8) {
        this.f19868i = f8;
    }

    public void setyInScreen(float f8) {
        this.f19869j = f8;
    }
}
