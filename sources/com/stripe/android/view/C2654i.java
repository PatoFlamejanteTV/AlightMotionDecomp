package com.stripe.android.view;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.ImageViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import g3.C2903b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n2.AbstractC3394E;

/* renamed from: com.stripe.android.view.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2654i extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private final S0 f28978a;

    /* renamed from: b, reason: collision with root package name */
    private final List f28979b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f28980c;

    /* renamed from: d, reason: collision with root package name */
    private C2903b f28981d;

    /* renamed from: e, reason: collision with root package name */
    private int f28982e;

    /* renamed from: com.stripe.android.view.i$a */
    /* loaded from: classes4.dex */
    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        private final L2.g f28983a;

        /* renamed from: b, reason: collision with root package name */
        private final S0 f28984b;

        /* renamed from: c, reason: collision with root package name */
        private final Resources f28985c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L2.g viewBinding, S0 themeConfig) {
            super(viewBinding.getRoot());
            AbstractC3292y.i(viewBinding, "viewBinding");
            AbstractC3292y.i(themeConfig, "themeConfig");
            this.f28983a = viewBinding;
            this.f28984b = themeConfig;
            Resources resources = this.itemView.getResources();
            AbstractC3292y.h(resources, "getResources(...)");
            this.f28985c = resources;
        }

        public final void a(boolean z8) {
            int i8;
            this.f28983a.f5319d.setTextColor(this.f28984b.c(z8));
            ImageViewCompat.setImageTintList(this.f28983a.f5317b, ColorStateList.valueOf(this.f28984b.d(z8)));
            AppCompatImageView checkIcon = this.f28983a.f5317b;
            AbstractC3292y.h(checkIcon, "checkIcon");
            if (z8) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            checkIcon.setVisibility(i8);
        }

        public final void b(r bank, boolean z8) {
            String string;
            AbstractC3292y.i(bank, "bank");
            AppCompatTextView appCompatTextView = this.f28983a.f5319d;
            if (z8) {
                string = bank.b();
            } else {
                string = this.f28985c.getString(AbstractC3394E.f35251p0, bank.b());
            }
            appCompatTextView.setText(string);
            Integer a9 = bank.a();
            if (a9 != null) {
                this.f28983a.f5318c.setImageResource(a9.intValue());
            }
        }
    }

    public C2654i(S0 themeConfig, List items, Function1 itemSelectedCallback) {
        AbstractC3292y.i(themeConfig, "themeConfig");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(itemSelectedCallback, "itemSelectedCallback");
        this.f28978a = themeConfig;
        this.f28979b = items;
        this.f28980c = itemSelectedCallback;
        this.f28982e = -1;
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C2654i this$0, RecyclerView.ViewHolder holder, View view) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(holder, "$holder");
        this$0.f(holder.getBindingAdapterPosition());
    }

    public final int b() {
        return this.f28982e;
    }

    public final void c(int i8) {
        notifyItemChanged(i8);
    }

    public final void e(C2903b c2903b) {
        this.f28981d = c2903b;
    }

    public final void f(int i8) {
        int i9 = this.f28982e;
        if (i8 != i9) {
            if (i9 != -1) {
                notifyItemChanged(i9);
            }
            notifyItemChanged(i8);
            this.f28980c.invoke(Integer.valueOf(i8));
        }
        this.f28982e = i8;
    }

    public final void g(int i8) {
        f(i8);
        notifyItemChanged(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f28979b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i8) {
        return i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int i8) {
        boolean z8;
        AbstractC3292y.i(holder, "holder");
        r rVar = (r) this.f28979b.get(i8);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2654i.d(C2654i.this, holder, view);
            }
        });
        a aVar = (a) holder;
        boolean z9 = true;
        if (i8 == this.f28982e) {
            z8 = true;
        } else {
            z8 = false;
        }
        aVar.a(z8);
        C2903b c2903b = this.f28981d;
        if (c2903b != null) {
            z9 = c2903b.a(rVar);
        }
        aVar.b(rVar, z9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3292y.i(parent, "parent");
        L2.g c8 = L2.g.c(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC3292y.h(c8, "inflate(...)");
        return new a(c8, this.f28978a);
    }
}
