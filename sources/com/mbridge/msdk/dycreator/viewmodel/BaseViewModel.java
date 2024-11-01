package com.mbridge.msdk.dycreator.viewmodel;

import com.mbridge.msdk.dycreator.g.c;
import com.mbridge.msdk.dycreator.g.d;
import com.mbridge.msdk.dycreator.g.f;
import com.mbridge.msdk.dycreator.g.h;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;

/* loaded from: classes4.dex */
public interface BaseViewModel {
    void setClickSubject(c cVar);

    void setConcreteSubject(d dVar);

    void setDynamicViewBackListener(DynamicViewBackListener dynamicViewBackListener);

    void setEffectSubject(f fVar);

    void setModelDataAndBind();

    void setReportSubject(h hVar);
}
