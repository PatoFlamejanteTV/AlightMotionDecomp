package com.google.android.gms.wallet.button;

import N.C1344g;
import Q.AbstractC1396p;
import V.k;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.wallet.button.ButtonOptions;
import r0.AbstractC3876n;
import r0.AbstractC3877o;
import r0.AbstractC3878p;
import r0.AbstractC3879q;
import r0.AbstractC3880s;
import r0.r;
import s0.C3943e;
import s0.f;
import s0.g;

/* loaded from: classes3.dex */
public final class PayButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private View.OnClickListener f18204a;

    /* renamed from: b, reason: collision with root package name */
    private ButtonOptions.a f18205b;

    /* renamed from: c, reason: collision with root package name */
    private View f18206c;

    /* renamed from: d, reason: collision with root package name */
    private final C3943e f18207d;

    public PayButton(Context context) {
        this(context, null);
    }

    private final void b(ButtonOptions buttonOptions) {
        int i8;
        Drawable drawable;
        removeAllViews();
        if (buttonOptions.u() == 2) {
            i8 = r.f37762b;
        } else {
            i8 = r.f37761a;
        }
        f fVar = new f(new ContextThemeWrapper(getContext(), i8), null);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(fVar.getContext()).inflate(AbstractC3878p.f37759a, (ViewGroup) fVar, true).findViewById(AbstractC3877o.f37758a);
        Context context = fVar.getContext();
        int y8 = buttonOptions.y();
        GradientDrawable gradientDrawable = (GradientDrawable) g.a(context, AbstractC3876n.f37755a).mutate();
        float f8 = y8;
        gradientDrawable.setCornerRadius(f8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{AbstractC3876n.f37756b});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        ColorStateList valueOf = ColorStateList.valueOf(color);
        if (k.f()) {
            drawable = new RippleDrawable(valueOf, gradientDrawable, null);
        } else {
            GradientDrawable gradientDrawable2 = (GradientDrawable) g.a(context, AbstractC3876n.f37757c).mutate();
            gradientDrawable2.setCornerRadius(f8);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, layerDrawable);
            stateListDrawable.addState(new int[0], gradientDrawable);
            drawable = stateListDrawable;
        }
        linearLayout.setBackground(drawable);
        fVar.setContentDescription(fVar.getContext().getString(AbstractC3879q.f37760a));
        this.f18206c = fVar;
        addView(fVar);
        this.f18206c.setOnClickListener(this);
    }

    public void a(ButtonOptions buttonOptions) {
        ButtonOptions.a aVar = this.f18205b;
        if (buttonOptions.v() != 0) {
            ButtonOptions.this.f18198a = buttonOptions.v();
        }
        if (buttonOptions.u() != 0) {
            ButtonOptions.this.f18199b = buttonOptions.u();
        }
        if (buttonOptions.f18202e) {
            aVar.e(buttonOptions.y());
        }
        if (buttonOptions.s() != null) {
            ButtonOptions.this.f18201d = buttonOptions.s();
        }
        if (!isInEditMode()) {
            removeAllViews();
            ButtonOptions a9 = this.f18205b.a();
            if (C1344g.n().h(getContext(), 232100000) != 0) {
                b(a9);
                Log.e("PayButton", "Failed to create latest buttonView: Google Play Services version is outdated.");
                return;
            } else {
                if (TextUtils.isEmpty(a9.s())) {
                    Log.e("PayButton", "Failed to create buttonView: allowedPaymentMethods cannot be empty.");
                    return;
                }
                View a10 = C3943e.a((Context) AbstractC1396p.l(getContext()), a9);
                this.f18206c = a10;
                if (a10 == null) {
                    Log.e("PayButton", "Failed to create buttonView");
                    return;
                } else {
                    addView(a10);
                    this.f18206c.setOnClickListener(this);
                    return;
                }
            }
        }
        b(this.f18205b.a());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f18204a;
        if (onClickListener != null && view == this.f18206c) {
            onClickListener.onClick(this);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f18204a = onClickListener;
    }

    public PayButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PayButton(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        ButtonOptions.a z8 = ButtonOptions.z();
        this.f18205b = z8;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3880s.f37764b);
        int i9 = obtainStyledAttributes.getInt(AbstractC3880s.f37765c, 1);
        int applyDimension = (int) TypedValue.applyDimension(1, 100.0f, Resources.getSystem().getDisplayMetrics());
        int i10 = AbstractC3880s.f37766d;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(i10, applyDimension);
        ButtonOptions buttonOptions = ButtonOptions.this;
        buttonOptions.f18199b = i9;
        buttonOptions.f18200c = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(i10)) {
            ButtonOptions.this.f18202e = true;
        }
        obtainStyledAttributes.recycle();
        z8.d(1);
        this.f18207d = new C3943e();
        if (isInEditMode()) {
            b(this.f18205b.a());
        }
    }
}
