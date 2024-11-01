package com.mbridge.msdk.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.video.signal.factory.b;
import com.mbridge.msdk.widget.a;

/* loaded from: classes4.dex */
public class MBridgeVastEndCardView extends MBridgeBaseView {

    /* renamed from: n, reason: collision with root package name */
    private ViewGroup f23665n;

    /* renamed from: o, reason: collision with root package name */
    private View f23666o;

    /* renamed from: p, reason: collision with root package name */
    private View f23667p;

    public MBridgeVastEndCardView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public final void c() {
        super.c();
        if (this.f23498f) {
            this.f23666o.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVastEndCardView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBridgeVastEndCardView.this.f23497e.a(104, "");
                }
            });
            this.f23667p.setOnClickListener(new a() { // from class: com.mbridge.msdk.video.module.MBridgeVastEndCardView.2
                @Override // com.mbridge.msdk.widget.a
                protected final void a(View view) {
                    MBridgeVastEndCardView mBridgeVastEndCardView = MBridgeVastEndCardView.this;
                    mBridgeVastEndCardView.f23497e.a(108, mBridgeVastEndCardView.d());
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_endcard_vast");
        if (findLayout >= 0) {
            this.f23495c.inflate(findLayout, this);
            this.f23665n = (ViewGroup) findViewById(findID("mbridge_rl_content"));
            this.f23666o = findViewById(findID("mbridge_iv_vastclose"));
            View findViewById = findViewById(findID("mbridge_iv_vastok"));
            this.f23667p = findViewById;
            this.f23498f = isNotNULL(this.f23665n, this.f23666o, findViewById);
            c();
            if (this.f23498f) {
                setMatchParent();
                setBackgroundResource(findColor("mbridge_reward_endcard_vast_bg"));
                setClickable(true);
                ((RelativeLayout.LayoutParams) this.f23665n.getLayoutParams()).addRule(13, -1);
            }
        }
    }

    public void notifyShowListener() {
        this.f23497e.a(111, "");
    }

    public void preLoadData(b bVar) {
    }

    public MBridgeVastEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
