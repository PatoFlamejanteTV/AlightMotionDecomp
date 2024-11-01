package com.stripe.android.stripe3ds2.views;

import V3.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import c4.q;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class ChallengeProgressFragment extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private final String f28222a;

    /* renamed from: b, reason: collision with root package name */
    private final q f28223b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f28224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeProgressFragment(String directoryServerName, q sdkTransactionId, Integer num) {
        super(U3.e.f10131k);
        AbstractC3292y.i(directoryServerName, "directoryServerName");
        AbstractC3292y.i(sdkTransactionId, "sdkTransactionId");
        this.f28222a = directoryServerName;
        this.f28223b = sdkTransactionId;
        this.f28224c = num;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Drawable drawable;
        AbstractC3292y.i(view, "view");
        super.onViewCreated(view, bundle);
        k a9 = k.a(view);
        AbstractC3292y.h(a9, "bind(...)");
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        a a10 = a.f28247e.a(this.f28222a, new Z3.a(requireContext, new Z3.e(this.f28223b), null, null, null, null, null, 0, 252, null));
        ImageView imageView = a9.f10590b;
        FragmentActivity activity = getActivity();
        String str = null;
        if (activity != null) {
            drawable = ContextCompat.getDrawable(activity, a10.c());
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        Integer e8 = a10.e();
        if (e8 != null) {
            str = getString(e8.intValue());
        }
        imageView.setContentDescription(str);
        if (a10.f()) {
            AbstractC3292y.f(imageView);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                layoutParams.height = -2;
                imageView.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        AbstractC3292y.f(imageView);
        imageView.setVisibility(0);
        Integer num = this.f28224c;
        if (num != null) {
            a9.f10591c.setIndicatorColor(num.intValue());
        }
    }
}
