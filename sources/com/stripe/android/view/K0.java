package com.stripe.android.view;

import R5.AbstractC1435t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import g3.C2896F;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes4.dex */
public final class K0 extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private Function1 f28644a = b.f28648a;

    /* renamed from: b, reason: collision with root package name */
    private List f28645b = AbstractC1435t.m();

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ int f28646c;

    /* loaded from: classes4.dex */
    public static final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        private final L0 f28647a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L0 shippingMethodView) {
            super(shippingMethodView);
            AbstractC3292y.i(shippingMethodView, "shippingMethodView");
            this.f28647a = shippingMethodView;
        }

        public final L0 a() {
            return this.f28647a;
        }

        public final void b(boolean z8) {
            this.f28647a.setSelected(z8);
        }

        public final void c(C2896F shippingMethod) {
            AbstractC3292y.i(shippingMethod, "shippingMethod");
            this.f28647a.setShippingMethod(shippingMethod);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f28648a = new b();

        b() {
            super(1);
        }

        public final void a(C2896F it) {
            AbstractC3292y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2896F) obj);
            return Q5.I.f8786a;
        }
    }

    public K0() {
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(K0 this$0, a holder, View view) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(holder, "$holder");
        this$0.h(holder.getBindingAdapterPosition());
    }

    public final C2896F b() {
        return (C2896F) AbstractC1435t.p0(this.f28645b, this.f28646c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final a holder, int i8) {
        boolean z8;
        AbstractC3292y.i(holder, "holder");
        holder.c((C2896F) this.f28645b.get(i8));
        if (i8 == this.f28646c) {
            z8 = true;
        } else {
            z8 = false;
        }
        holder.b(z8);
        holder.a().setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.view.J0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                K0.d(K0.this, holder, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        Context context = viewGroup.getContext();
        AbstractC3292y.h(context, "getContext(...)");
        return new a(new L0(context, null, 0, 6, null));
    }

    public final void f(Function1 function1) {
        AbstractC3292y.i(function1, "<set-?>");
        this.f28644a = function1;
    }

    public final void g(C2896F shippingMethod) {
        AbstractC3292y.i(shippingMethod, "shippingMethod");
        h(this.f28645b.indexOf(shippingMethod));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f28645b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i8) {
        return ((C2896F) this.f28645b.get(i8)).hashCode();
    }

    public final void h(int i8) {
        int i9 = this.f28646c;
        if (i9 != i8) {
            notifyItemChanged(i9);
            notifyItemChanged(i8);
            this.f28646c = i8;
            this.f28644a.invoke(this.f28645b.get(i8));
        }
    }

    public final void i(List value) {
        AbstractC3292y.i(value, "value");
        h(0);
        this.f28645b = value;
        notifyDataSetChanged();
    }
}
