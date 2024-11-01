package com.stripe.android.stripe3ds2.views;

import R5.N;
import V3.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.DrawableRes;
import androidx.core.widget.CompoundButtonCompat;
import i6.i;
import i6.m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* loaded from: classes4.dex */
public final class ChallengeZoneView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ThreeDS2HeaderTextView f28225a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreeDS2TextView f28226b;

    /* renamed from: c, reason: collision with root package name */
    private final ThreeDS2Button f28227c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreeDS2Button f28228d;

    /* renamed from: e, reason: collision with root package name */
    private final ThreeDS2TextView f28229e;

    /* renamed from: f, reason: collision with root package name */
    private final RadioGroup f28230f;

    /* renamed from: g, reason: collision with root package name */
    private final FrameLayout f28231g;

    /* renamed from: h, reason: collision with root package name */
    private final RadioButton f28232h;

    /* renamed from: i, reason: collision with root package name */
    private final RadioButton f28233i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3292y.i(context, "context");
    }

    public final void a(String str, Y3.d dVar) {
        if (str != null && !n.T(str)) {
            this.f28225a.a(str, dVar);
        } else {
            this.f28225a.setVisibility(8);
        }
    }

    public final void b(String str, Y3.d dVar) {
        if (str != null && !n.T(str)) {
            this.f28226b.a(str, dVar);
        } else {
            this.f28226b.setVisibility(8);
        }
    }

    public final void c(String str, Y3.b bVar) {
        if (str != null && !n.T(str)) {
            this.f28228d.setVisibility(0);
            this.f28228d.setText(str);
            this.f28228d.setButtonCustomization(bVar);
        }
    }

    public final void d(String str, Y3.b bVar) {
        if (str != null && !n.T(str)) {
            this.f28227c.setText(str);
            this.f28227c.setButtonCustomization(bVar);
        } else {
            this.f28227c.setVisibility(8);
        }
    }

    public final void e(String str, Y3.d dVar, Y3.b bVar) {
        RadioButton radioButton;
        if (str != null && !n.T(str)) {
            this.f28229e.a(str, dVar);
            if (bVar != null) {
                i s8 = m.s(0, this.f28230f.getChildCount());
                ArrayList<RadioButton> arrayList = new ArrayList();
                Iterator it = s8.iterator();
                while (it.hasNext()) {
                    View childAt = this.f28230f.getChildAt(((N) it).nextInt());
                    if (childAt instanceof RadioButton) {
                        radioButton = (RadioButton) childAt;
                    } else {
                        radioButton = null;
                    }
                    if (radioButton != null) {
                        arrayList.add(radioButton);
                    }
                }
                for (RadioButton radioButton2 : arrayList) {
                    String f8 = bVar.f();
                    if (f8 != null && !n.T(f8)) {
                        CompoundButtonCompat.setButtonTintList(radioButton2, ColorStateList.valueOf(Color.parseColor(bVar.f())));
                    }
                    String p8 = bVar.p();
                    if (p8 != null && !n.T(p8)) {
                        radioButton2.setTextColor(Color.parseColor(bVar.p()));
                    }
                }
            }
            this.f28229e.setVisibility(0);
            this.f28230f.setVisibility(0);
        }
    }

    public final FrameLayout getChallengeEntryView$3ds2sdk_release() {
        return this.f28231g;
    }

    public final ThreeDS2HeaderTextView getInfoHeader$3ds2sdk_release() {
        return this.f28225a;
    }

    public final ThreeDS2TextView getInfoTextView$3ds2sdk_release() {
        return this.f28226b;
    }

    public final ThreeDS2Button getResendButton$3ds2sdk_release() {
        return this.f28228d;
    }

    public final ThreeDS2Button getSubmitButton$3ds2sdk_release() {
        return this.f28227c;
    }

    public final RadioButton getWhitelistNoRadioButton$3ds2sdk_release() {
        return this.f28233i;
    }

    public final RadioGroup getWhitelistRadioGroup$3ds2sdk_release() {
        return this.f28230f;
    }

    public final RadioButton getWhitelistYesRadioButton$3ds2sdk_release() {
        return this.f28232h;
    }

    public final ThreeDS2TextView getWhitelistingLabel$3ds2sdk_release() {
        return this.f28229e;
    }

    public final boolean getWhitelistingSelection$3ds2sdk_release() {
        if (this.f28230f.getCheckedRadioButtonId() == U3.d.f10106l) {
            return true;
        }
        return false;
    }

    public final void setChallengeEntryView(View challengeEntryView) {
        AbstractC3292y.i(challengeEntryView, "challengeEntryView");
        this.f28231g.addView(challengeEntryView);
    }

    public final void setInfoTextIndicator(@DrawableRes int i8) {
        this.f28226b.setCompoundDrawablesRelativeWithIntrinsicBounds(i8, 0, 0, 0);
    }

    public final void setResendButtonClickListener(View.OnClickListener onClickListener) {
        this.f28228d.setOnClickListener(onClickListener);
    }

    public final void setSubmitButtonClickListener(View.OnClickListener onClickListener) {
        this.f28227c.setOnClickListener(onClickListener);
    }

    public /* synthetic */ ChallengeZoneView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3292y.i(context, "context");
        h b9 = h.b(LayoutInflater.from(context), this);
        AbstractC3292y.h(b9, "inflate(...)");
        ThreeDS2HeaderTextView czvHeader = b9.f10570c;
        AbstractC3292y.h(czvHeader, "czvHeader");
        this.f28225a = czvHeader;
        ThreeDS2TextView czvInfo = b9.f10571d;
        AbstractC3292y.h(czvInfo, "czvInfo");
        this.f28226b = czvInfo;
        ThreeDS2Button czvSubmitButton = b9.f10573f;
        AbstractC3292y.h(czvSubmitButton, "czvSubmitButton");
        this.f28227c = czvSubmitButton;
        ThreeDS2Button czvResendButton = b9.f10572e;
        AbstractC3292y.h(czvResendButton, "czvResendButton");
        this.f28228d = czvResendButton;
        ThreeDS2TextView czvWhitelistingLabel = b9.f10577j;
        AbstractC3292y.h(czvWhitelistingLabel, "czvWhitelistingLabel");
        this.f28229e = czvWhitelistingLabel;
        RadioGroup czvWhitelistRadioGroup = b9.f10575h;
        AbstractC3292y.h(czvWhitelistRadioGroup, "czvWhitelistRadioGroup");
        this.f28230f = czvWhitelistRadioGroup;
        FrameLayout czvEntryView = b9.f10569b;
        AbstractC3292y.h(czvEntryView, "czvEntryView");
        this.f28231g = czvEntryView;
        RadioButton czvWhitelistYesButton = b9.f10576i;
        AbstractC3292y.h(czvWhitelistYesButton, "czvWhitelistYesButton");
        this.f28232h = czvWhitelistYesButton;
        RadioButton czvWhitelistNoButton = b9.f10574g;
        AbstractC3292y.h(czvWhitelistNoButton, "czvWhitelistNoButton");
        this.f28233i = czvWhitelistNoButton;
    }
}
