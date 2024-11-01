package com.mbridge.msdk.dycreator.viewmodel;

import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.f.a;
import com.mbridge.msdk.dycreator.g.c;
import com.mbridge.msdk.dycreator.g.d;
import com.mbridge.msdk.dycreator.g.f;
import com.mbridge.msdk.dycreator.g.h;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;

/* loaded from: classes4.dex */
public class MBRewardViewVModel implements BaseViewModel {

    /* renamed from: a, reason: collision with root package name */
    private d f19937a;

    /* renamed from: b, reason: collision with root package name */
    private c f19938b;

    /* renamed from: c, reason: collision with root package name */
    private f f19939c;

    /* renamed from: d, reason: collision with root package name */
    private h f19940d;

    /* renamed from: e, reason: collision with root package name */
    private DynamicViewBackListener f19941e;

    /* renamed from: f, reason: collision with root package name */
    private DyOption f19942f;

    public MBRewardViewVModel(DyOption dyOption) {
        this.f19942f = dyOption;
        EventBus.getDefault().register(this);
    }

    public void onEventMainThread(SplashResData splashResData) {
        DynamicViewBackListener dynamicViewBackListener = this.f19941e;
        if (dynamicViewBackListener != null) {
            dynamicViewBackListener.viewClicked(splashResData);
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setClickSubject(c cVar) {
        if (cVar != null) {
            this.f19938b = cVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setConcreteSubject(d dVar) {
        if (dVar != null) {
            this.f19937a = dVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener) {
        if (dynamicViewBackListener != null) {
            this.f19941e = dynamicViewBackListener;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setEffectSubject(f fVar) {
        if (fVar != null) {
            this.f19939c = fVar;
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setModelDataAndBind() {
        a aVar = new a(this.f19942f);
        d dVar = this.f19937a;
        if (dVar != null) {
            dVar.a(aVar);
        }
        c cVar = this.f19938b;
        if (cVar != null) {
            cVar.a(aVar);
        }
        f fVar = this.f19939c;
        if (fVar != null) {
            fVar.a(aVar);
        }
        h hVar = this.f19940d;
        if (hVar != null) {
            hVar.a(aVar);
        }
    }

    @Override // com.mbridge.msdk.dycreator.viewmodel.BaseViewModel
    public void setReportSubject(h hVar) {
        if (hVar != null) {
            this.f19940d = hVar;
        }
    }
}
