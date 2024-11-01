package com.mbridge.msdk.dycreator.binding.a;

import android.view.View;
import com.mbridge.msdk.dycreator.binding.base.BaseStrategy;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.action.EAction;

/* loaded from: classes4.dex */
public final class b<T extends View, K> implements BaseStrategy {
    @Override // com.mbridge.msdk.dycreator.binding.base.BaseStrategy
    public final void bindClickData(View view, com.mbridge.msdk.dycreator.f.a.a aVar) {
        SplashResData splashResData = new SplashResData();
        splashResData.setBaseViewData(aVar);
        splashResData.seteAction(EAction.DOWNLOAD);
        EventBus.getDefault().post(splashResData);
    }
}
