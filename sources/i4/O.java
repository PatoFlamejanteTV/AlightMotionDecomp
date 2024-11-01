package I4;

import I4.O;
import Y4.w0;
import Y4.x0;
import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1982f;
import c5.C2044i;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class O extends RecyclerView.Adapter {

    /* renamed from: g, reason: collision with root package name */
    public static final a f3518g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f3519a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1982f f3520b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3521c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3522d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f3523e;

    /* renamed from: f, reason: collision with root package name */
    private int f3524f;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public final class b extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        private x0 f3525a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC1982f f3526b;

        /* renamed from: c, reason: collision with root package name */
        private final Context f3527c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ O f3528d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(O o8, x0 binding, InterfaceC1982f listener, Context context) {
            super(binding.getRoot());
            AbstractC3292y.i(binding, "binding");
            AbstractC3292y.i(listener, "listener");
            AbstractC3292y.i(context, "context");
            this.f3528d = o8;
            this.f3525a = binding;
            this.f3526b = listener;
            this.f3527c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b bVar, C2044i c2044i, int i8, View view) {
            bVar.f3526b.b(c2044i, i8);
        }

        public final void b(final C2044i avatar, final int i8, boolean z8) {
            AbstractC3292y.i(avatar, "avatar");
            com.squareup.picasso.s.h().l(avatar.c()).n(UptodownApp.f29249C.f0(this.f3527c)).l(R.drawable.shape_avatar_item).i(this.f3525a.f13073b);
            this.f3525a.f13073b.setOnClickListener(new View.OnClickListener() { // from class: I4.P
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    O.b.c(O.b.this, avatar, i8, view);
                }
            });
            if (z8) {
                this.f3525a.f13076e.setBackground(ContextCompat.getDrawable(this.f3527c, R.drawable.shape_avatar_selected_turbo_item));
                this.f3525a.f13074c.setVisibility(0);
            } else {
                this.f3525a.f13076e.setBackground(null);
                this.f3525a.f13074c.setVisibility(8);
            }
            if (this.f3528d.f3523e) {
                this.f3525a.f13075d.setVisibility(8);
            } else {
                this.f3525a.f13075d.setVisibility(0);
            }
        }
    }

    /* loaded from: classes5.dex */
    public final class c extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        private w0 f3529a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC1982f f3530b;

        /* renamed from: c, reason: collision with root package name */
        private final Context f3531c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ O f3532d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(O o8, w0 binding, InterfaceC1982f listener, Context context) {
            super(binding.getRoot());
            AbstractC3292y.i(binding, "binding");
            AbstractC3292y.i(listener, "listener");
            AbstractC3292y.i(context, "context");
            this.f3532d = o8;
            this.f3529a = binding;
            this.f3530b = listener;
            this.f3531c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(c cVar, C2044i c2044i, int i8, View view) {
            cVar.f3530b.a(c2044i, i8);
        }

        public final void b(final C2044i avatar, final int i8, int i9, boolean z8) {
            AbstractC3292y.i(avatar, "avatar");
            com.squareup.picasso.s.h().l(avatar.c()).n(UptodownApp.f29249C.f0(this.f3531c)).l(R.drawable.shape_avatar_item).i(this.f3529a.f13053b);
            this.f3529a.f13053b.setOnClickListener(new View.OnClickListener() { // from class: I4.Q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    O.c.c(O.c.this, avatar, i8, view);
                }
            });
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (z8) {
                layoutParams.setMargins(0, 0, 0, 0);
                this.f3529a.getRoot().setLayoutParams(layoutParams);
                this.f3529a.f13054c.setVisibility(0);
                this.f3529a.f13055d.setBackground(ContextCompat.getDrawable(this.f3531c, R.drawable.shape_avatar_selected_item));
                return;
            }
            int applyDimension = (int) TypedValue.applyDimension(1, 5.0f, this.f3531c.getResources().getDisplayMetrics());
            layoutParams.setMargins(applyDimension, applyDimension, applyDimension, applyDimension);
            this.f3529a.getRoot().setLayoutParams(layoutParams);
            this.f3529a.f13055d.setBackground(null);
            this.f3529a.f13054c.setVisibility(8);
        }
    }

    public /* synthetic */ O(ArrayList arrayList, InterfaceC1982f interfaceC1982f, int i8, int i9, boolean z8, int i10, AbstractC3284p abstractC3284p) {
        this(arrayList, interfaceC1982f, i8, (i10 & 8) != 0 ? 0 : i9, (i10 & 16) != 0 ? false : z8);
    }

    public final ArrayList b() {
        return this.f3519a;
    }

    public final int c() {
        return this.f3524f;
    }

    public final void d(int i8) {
        this.f3524f = i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3519a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i8) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        Object obj = this.f3519a.get(i8);
        AbstractC3292y.h(obj, "get(...)");
        C2044i c2044i = (C2044i) obj;
        boolean z8 = false;
        if (viewHolder instanceof c) {
            c cVar = (c) viewHolder;
            int i9 = this.f3522d;
            if (this.f3524f == i8) {
                z8 = true;
            }
            cVar.b(c2044i, i8, i9, z8);
            return;
        }
        if (viewHolder instanceof b) {
            b bVar = (b) viewHolder;
            if (this.f3524f == i8) {
                z8 = true;
            }
            bVar.b(c2044i, i8, z8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i8) {
        AbstractC3292y.i(viewGroup, "viewGroup");
        int i9 = this.f3521c;
        if (i9 != 0) {
            if (i9 == 1) {
                x0 c8 = x0.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                AbstractC3292y.h(c8, "inflate(...)");
                InterfaceC1982f interfaceC1982f = this.f3520b;
                Context context = viewGroup.getContext();
                AbstractC3292y.h(context, "getContext(...)");
                return new b(this, c8, interfaceC1982f, context);
            }
            throw new IllegalArgumentException("ViewHolder unknown!!");
        }
        w0 c9 = w0.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        AbstractC3292y.h(c9, "inflate(...)");
        InterfaceC1982f interfaceC1982f2 = this.f3520b;
        Context context2 = viewGroup.getContext();
        AbstractC3292y.h(context2, "getContext(...)");
        return new c(this, c9, interfaceC1982f2, context2);
    }

    public O(ArrayList avatars, InterfaceC1982f listener, int i8, int i9, boolean z8) {
        AbstractC3292y.i(avatars, "avatars");
        AbstractC3292y.i(listener, "listener");
        this.f3519a = avatars;
        this.f3520b = listener;
        this.f3521c = i8;
        this.f3522d = i9;
        this.f3523e = z8;
        this.f3524f = -1;
    }
}
