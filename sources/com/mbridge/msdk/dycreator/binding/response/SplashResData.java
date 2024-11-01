package com.mbridge.msdk.dycreator.binding.response;

import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.f.a.a;
import com.mbridge.msdk.dycreator.listener.action.EAction;

/* loaded from: classes4.dex */
public class SplashResData extends BaseRespData {

    /* renamed from: a, reason: collision with root package name */
    private a f19858a;

    /* renamed from: b, reason: collision with root package name */
    private EAction f19859b;

    public a getBaseViewData() {
        return this.f19858a;
    }

    public EAction geteAction() {
        return this.f19859b;
    }

    public void setBaseViewData(a aVar) {
        this.f19858a = aVar;
    }

    public void seteAction(EAction eAction) {
        this.f19859b = eAction;
    }
}
