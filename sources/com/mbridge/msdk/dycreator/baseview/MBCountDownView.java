package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.f.a.a;
import com.mbridge.msdk.f.a.b;

/* loaded from: classes4.dex */
public class MBCountDownView extends MBTextView {

    /* renamed from: a, reason: collision with root package name */
    private b f19560a;

    /* renamed from: b, reason: collision with root package name */
    private MBCountDownView f19561b;

    public MBCountDownView(Context context) {
        super(context);
        this.f19561b = this;
    }

    public void initView(final String str, final String str2, int i8) {
        this.f19560a = new b().b(i8 * 1000).a(1000L).a(new a() { // from class: com.mbridge.msdk.dycreator.baseview.MBCountDownView.1
            @Override // com.mbridge.msdk.f.a.a
            public void onFinish() {
                MBCountDownView.this.f19560a.a();
                SplashResData splashResData = new SplashResData();
                splashResData.seteAction(EAction.CLOSE);
                EventBus.getDefault().post(splashResData);
            }

            @Override // com.mbridge.msdk.f.a.a
            public void onTick(long j8) {
                if (str2.startsWith("zh")) {
                    MBCountDownView.this.f19561b.setText((j8 / 1000) + "s" + str);
                    return;
                }
                MBCountDownView.this.f19561b.setText(MBCountDownView.this.f19561b + " " + (j8 / 1000) + "s");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.dycreator.baseview.MBTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f19560a;
        if (bVar != null) {
            bVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.dycreator.baseview.MBTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f19560a;
        if (bVar != null) {
            bVar.a();
        }
    }

    public MBCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19561b = this;
    }

    public MBCountDownView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f19561b = this;
    }
}
