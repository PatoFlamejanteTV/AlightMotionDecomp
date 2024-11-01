package com.mbridge.msdk.dycreator.f;

import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public final class a implements com.mbridge.msdk.dycreator.f.a.a {

    /* renamed from: a, reason: collision with root package name */
    private DyOption f19927a;

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f19928b;

    public a(DyOption dyOption) {
        this.f19927a = dyOption;
        this.f19928b = dyOption.getCampaignEx();
    }

    @Override // com.mbridge.msdk.dycreator.f.a.a
    public final CampaignEx getBindData() {
        return this.f19928b;
    }

    @Override // com.mbridge.msdk.dycreator.f.a.a
    public final DyOption getEffectData() {
        return this.f19927a;
    }
}
