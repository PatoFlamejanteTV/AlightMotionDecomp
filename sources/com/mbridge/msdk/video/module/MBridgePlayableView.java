package com.mbridge.msdk.video.module;

import android.content.Context;
import android.util.AttributeSet;
import com.mbridge.msdk.video.signal.factory.b;

/* loaded from: classes4.dex */
public class MBridgePlayableView extends MBridgeH5EndCardView {
    public MBridgePlayableView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public final String a() {
        return super.a();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        super.init(context);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public void onBackPress() {
        super.onBackPress();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public void preLoadData(b bVar) {
        super.preLoadData(bVar);
        super.setLoadPlayable(true);
    }

    public MBridgePlayableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
