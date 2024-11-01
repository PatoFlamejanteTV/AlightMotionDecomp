package com.mbridge.msdk.video.module.a.a;

import com.mbridge.msdk.video.module.MBridgeClickMiniCardView;

/* loaded from: classes4.dex */
public final class g extends i {

    /* renamed from: a, reason: collision with root package name */
    private MBridgeClickMiniCardView f23777a;

    public g(MBridgeClickMiniCardView mBridgeClickMiniCardView, com.mbridge.msdk.video.module.a.a aVar) {
        super(aVar);
        this.f23777a = mBridgeClickMiniCardView;
    }

    @Override // com.mbridge.msdk.video.module.a.a.i, com.mbridge.msdk.video.module.a.a.f, com.mbridge.msdk.video.module.a.a
    public final void a(int i8, Object obj) {
        boolean z8 = false;
        switch (i8) {
            case 100:
                MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f23777a;
                if (mBridgeClickMiniCardView != null) {
                    mBridgeClickMiniCardView.webviewshow();
                    MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f23777a;
                    mBridgeClickMiniCardView2.onSelfConfigurationChanged(mBridgeClickMiniCardView2.getResources().getConfiguration());
                    break;
                }
                break;
            case 101:
            case 102:
                z8 = true;
                break;
            case 103:
                i8 = 107;
                break;
        }
        if (!z8) {
            super.a(i8, obj);
        }
    }
}
