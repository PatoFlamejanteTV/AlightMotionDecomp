package com.stripe.android.view;

import android.util.AttributeSet;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.model.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.AbstractC3390A;

/* renamed from: com.stripe.android.view.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2656j extends AbstractC2658k {

    /* renamed from: c, reason: collision with root package name */
    public static final a f28989c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f28990d = 8;

    /* renamed from: a, reason: collision with root package name */
    private Integer f28991a;

    /* renamed from: b, reason: collision with root package name */
    private final C2654i f28992b;

    /* renamed from: com.stripe.android.view.j$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ C2656j a(FragmentActivity activity) {
            AbstractC3292y.i(activity, "activity");
            return new C2656j(activity, null, 0, 6, null);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.view.j$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function1 {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Q5.I.f8786a;
        }

        public final void invoke(int i8) {
            C2656j.this.f28991a = Integer.valueOf(i8);
        }
    }

    public /* synthetic */ C2656j(FragmentActivity fragmentActivity, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(fragmentActivity, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    @Override // com.stripe.android.view.AbstractC2658k
    public com.stripe.android.model.p getCreateParams() {
        Integer valueOf = Integer.valueOf(this.f28992b.b());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return p.e.g(com.stripe.android.model.p.f25804u, new p.j(((EnumC2657j0) EnumC2657j0.e().get(this.f28992b.b())).d()), null, null, null, 14, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2656j(FragmentActivity activity, AttributeSet attributeSet, int i8) {
        super(activity, attributeSet, i8);
        AbstractC3292y.i(activity, "activity");
        C2654i c2654i = new C2654i(new S0(activity), EnumC2657j0.e(), new b());
        this.f28992b = c2654i;
        L2.h c8 = L2.h.c(activity.getLayoutInflater(), this, true);
        AbstractC3292y.h(c8, "inflate(...)");
        setId(AbstractC3390A.f35109U);
        RecyclerView recyclerView = c8.f5321b;
        recyclerView.setAdapter(c2654i);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        Integer num = this.f28991a;
        if (num != null) {
            c2654i.g(num.intValue());
        }
    }
}
