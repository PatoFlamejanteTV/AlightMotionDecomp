package com.stripe.android.view;

import R5.AbstractC1435t;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import g3.EnumC2906e;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3390A;
import n2.AbstractC3392C;

/* renamed from: com.stripe.android.view.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2677v extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    private final List f29219a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC2906e f29220b;

    /* renamed from: c, reason: collision with root package name */
    private final LayoutInflater f29221c;

    /* renamed from: d, reason: collision with root package name */
    private final N0 f29222d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2677v(Context context, List brands, EnumC2906e enumC2906e) {
        super(context, 0, brands);
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(brands, "brands");
        this.f29219a = brands;
        this.f29220b = enumC2906e;
        this.f29221c = LayoutInflater.from(context);
        this.f29222d = new N0(context);
    }

    private final void b(View view, int i8) {
        boolean z8 = true;
        EnumC2906e enumC2906e = (EnumC2906e) AbstractC1435t.p0(this.f29219a, i8 - 1);
        if (enumC2906e != null) {
            if (enumC2906e != this.f29220b) {
                z8 = false;
            }
            ImageView imageView = (ImageView) view.findViewById(AbstractC3390A.f35125f);
            if (imageView != null) {
                imageView.setBackgroundResource(enumC2906e.k());
            }
            ImageView imageView2 = (ImageView) view.findViewById(AbstractC3390A.f35123e);
            if (z8) {
                imageView2.setVisibility(0);
                imageView2.setColorFilter(this.f29222d.c());
            } else {
                imageView2.setVisibility(8);
            }
            TextView textView = (TextView) view.findViewById(AbstractC3390A.f35127g);
            if (textView != null) {
                AbstractC3292y.f(textView);
                textView.setText(enumC2906e.h());
                if (z8) {
                    textView.setTextColor(this.f29222d.c());
                    textView.setTypeface(Typeface.DEFAULT_BOLD);
                } else {
                    textView.setTypeface(Typeface.DEFAULT);
                }
            }
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public EnumC2906e getItem(int i8) {
        if (i8 == 0) {
            return null;
        }
        return (EnumC2906e) super.getItem(i8 - 1);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        if (this.f29219a.isEmpty()) {
            return 0;
        }
        return this.f29219a.size() + 1;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i8, View view, ViewGroup parent) {
        View inflate;
        AbstractC3292y.i(parent, "parent");
        if (i8 == 0) {
            inflate = this.f29221c.inflate(AbstractC3392C.f35173t, parent, false);
        } else {
            inflate = this.f29221c.inflate(AbstractC3392C.f35162i, parent, false);
        }
        if (i8 > 0) {
            AbstractC3292y.f(inflate);
            b(inflate, i8);
        }
        AbstractC3292y.f(inflate);
        return inflate;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i8) {
        return i8 != 0;
    }
}
