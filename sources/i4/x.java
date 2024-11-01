package I4;

import I4.x;
import R5.AbstractC1435t;
import Y4.X;
import Y4.Y;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1980d;
import c5.C2043h;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3784i;
import t5.AbstractC4026h;
import t5.C4054v0;
import t5.E0;

/* loaded from: classes5.dex */
public final class x extends RecyclerView.Adapter {

    /* renamed from: e, reason: collision with root package name */
    public static final a f3728e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1980d f3729a;

    /* renamed from: b, reason: collision with root package name */
    private String f3730b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f3731c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3732d;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Object f3733a;

        /* renamed from: b, reason: collision with root package name */
        private int f3734b;

        public final Object a() {
            Object obj = this.f3733a;
            if (obj != null) {
                return obj;
            }
            AbstractC3292y.y("item");
            return Q5.I.f8786a;
        }

        public final int b() {
            return this.f3734b;
        }

        public final void c(Object obj) {
            AbstractC3292y.i(obj, "<set-?>");
            this.f3733a = obj;
        }

        public final void d(int i8) {
            this.f3734b = i8;
        }
    }

    /* loaded from: classes5.dex */
    public final class c extends RecyclerView.Adapter {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC1980d f3735a;

        /* renamed from: b, reason: collision with root package name */
        private Context f3736b;

        /* renamed from: c, reason: collision with root package name */
        private ArrayList f3737c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ x f3738d;

        /* loaded from: classes5.dex */
        public final class a extends AbstractC4026h {

            /* renamed from: b, reason: collision with root package name */
            private final Y4.E f3739b;

            /* renamed from: c, reason: collision with root package name */
            private InterfaceC1980d f3740c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f3741d;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public a(I4.x.c r2, Y4.E r3, b5.InterfaceC1980d r4, android.content.Context r5) {
                /*
                    r1 = this;
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.AbstractC3292y.i(r3, r0)
                    java.lang.String r0 = "listener"
                    kotlin.jvm.internal.AbstractC3292y.i(r4, r0)
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.AbstractC3292y.i(r5, r0)
                    r1.f3741d = r2
                    android.widget.RelativeLayout r2 = r3.getRoot()
                    java.lang.String r0 = "getRoot(...)"
                    kotlin.jvm.internal.AbstractC3292y.h(r2, r0)
                    r1.<init>(r2, r5)
                    r1.f3739b = r3
                    r1.f3740c = r4
                    android.widget.TextView r2 = r3.f12134j
                    J4.j$a r4 = J4.j.f4395g
                    android.graphics.Typeface r5 = r4.u()
                    r2.setTypeface(r5)
                    android.widget.TextView r2 = r3.f12132h
                    android.graphics.Typeface r5 = r4.v()
                    r2.setTypeface(r5)
                    android.widget.TextView r2 = r3.f12137m
                    android.graphics.Typeface r3 = r4.v()
                    r2.setTypeface(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: I4.x.c.a.<init>(I4.x$c, Y4.E, b5.d, android.content.Context):void");
            }

            public final void l(C2043h app, boolean z8) {
                AbstractC3292y.i(app, "app");
                int dimension = (int) this.f3741d.f3736b.getResources().getDimension(R.dimen.margin_m);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                if (z8) {
                    layoutParams.setMargins(dimension, 0, dimension, dimension);
                } else {
                    layoutParams.setMargins(dimension, 0, 0, dimension);
                }
                this.itemView.setLayoutParams(layoutParams);
                String c02 = app.c0();
                if (c02 != null && c02.length() != 0) {
                    com.squareup.picasso.s.h().l(app.g0()).n(UptodownApp.f29249C.e0(this.f3741d.f3736b)).a().f().l(R.drawable.shape_bg_placeholder).i(this.f3739b.f12126b);
                }
                View itemView = this.itemView;
                AbstractC3292y.h(itemView, "itemView");
                c(itemView, this.f3740c, app);
                TextView tvNameHomeCardFeaturedItem = this.f3739b.f12134j;
                AbstractC3292y.h(tvNameHomeCardFeaturedItem, "tvNameHomeCardFeaturedItem");
                TextView tvDescHomeCardFeaturedItem = this.f3739b.f12132h;
                AbstractC3292y.h(tvDescHomeCardFeaturedItem, "tvDescHomeCardFeaturedItem");
                i(app, tvNameHomeCardFeaturedItem, tvDescHomeCardFeaturedItem);
                String v02 = app.v0();
                TextView tvStatusHomeCardFeaturedItem = this.f3739b.f12137m;
                AbstractC3292y.h(tvStatusHomeCardFeaturedItem, "tvStatusHomeCardFeaturedItem");
                TextView tvDescHomeCardFeaturedItem2 = this.f3739b.f12132h;
                AbstractC3292y.h(tvDescHomeCardFeaturedItem2, "tvDescHomeCardFeaturedItem");
                g(v02, tvStatusHomeCardFeaturedItem, tvDescHomeCardFeaturedItem2);
                ImageView ivLogoHomeCardFeaturedItem = this.f3739b.f12127c;
                AbstractC3292y.h(ivLogoHomeCardFeaturedItem, "ivLogoHomeCardFeaturedItem");
                h(ivLogoHomeCardFeaturedItem, app.k0());
            }
        }

        public c(x xVar, InterfaceC1980d listener, Context context) {
            AbstractC3292y.i(listener, "listener");
            AbstractC3292y.i(context, "context");
            this.f3738d = xVar;
            this.f3735a = listener;
            this.f3736b = context;
            this.f3737c = new ArrayList();
        }

        public final ArrayList b() {
            return this.f3737c;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(a holder, int i8) {
            AbstractC3292y.i(holder, "holder");
            if (AbstractC3292y.d(this.f3737c.get(i8), AbstractC1435t.y0(this.f3737c))) {
                Object obj = this.f3737c.get(i8);
                AbstractC3292y.h(obj, "get(...)");
                holder.l((C2043h) obj, true);
            } else {
                Object obj2 = this.f3737c.get(i8);
                AbstractC3292y.h(obj2, "get(...)");
                holder.l((C2043h) obj2, false);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(ViewGroup parent, int i8) {
            AbstractC3292y.i(parent, "parent");
            Y4.E c8 = Y4.E.c(LayoutInflater.from(parent.getContext()), parent, false);
            AbstractC3292y.h(c8, "inflate(...)");
            return new a(this, c8, this.f3735a, this.f3736b);
        }

        public final void e(ArrayList carouselApps) {
            AbstractC3292y.i(carouselApps, "carouselApps");
            this.f3737c = carouselApps;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f3737c.size();
        }
    }

    /* loaded from: classes5.dex */
    public final class d extends AbstractC4026h {

        /* renamed from: b, reason: collision with root package name */
        private final c f3742b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f3743c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(I4.x r4, Y4.V r5, b5.InterfaceC1980d r6, android.content.Context r7, java.lang.String r8) {
            /*
                r3 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.AbstractC3292y.i(r5, r0)
                java.lang.String r0 = "listener"
                kotlin.jvm.internal.AbstractC3292y.i(r6, r0)
                java.lang.String r0 = "context"
                kotlin.jvm.internal.AbstractC3292y.i(r7, r0)
                java.lang.String r0 = "organizationName"
                kotlin.jvm.internal.AbstractC3292y.i(r8, r0)
                r3.f3743c = r4
                android.widget.LinearLayout r0 = r5.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.AbstractC3292y.h(r0, r1)
                r3.<init>(r0, r7)
                I4.x$c r0 = new I4.x$c
                r0.<init>(r4, r6, r7)
                r3.f3742b = r0
                androidx.recyclerview.widget.RecyclerView r4 = r5.f12429b
                androidx.recyclerview.widget.LinearLayoutManager r6 = new androidx.recyclerview.widget.LinearLayoutManager
                android.view.View r1 = r3.itemView
                android.content.Context r1 = r1.getContext()
                r2 = 0
                r6.<init>(r1, r2, r2)
                r4.setLayoutManager(r6)
                androidx.recyclerview.widget.RecyclerView r4 = r5.f12429b
                r4.setAdapter(r0)
                android.widget.TextView r4 = r5.f12430c
                J4.j$a r6 = J4.j.f4395g
                android.graphics.Typeface r6 = r6.u()
                r4.setTypeface(r6)
                android.widget.TextView r4 = r5.f12430c
                r5 = 2132017949(0x7f14031d, float:1.967419E38)
                r6 = 1
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r6[r2] = r8
                java.lang.String r5 = r7.getString(r5, r6)
                r4.setText(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: I4.x.d.<init>(I4.x, Y4.V, b5.d, android.content.Context, java.lang.String):void");
        }

        public final void l(ArrayList carouselApps) {
            AbstractC3292y.i(carouselApps, "carouselApps");
            this.f3742b.e(carouselApps);
        }

        public final c m() {
            return this.f3742b;
        }
    }

    /* loaded from: classes5.dex */
    public final class e extends AbstractC4026h {

        /* renamed from: b, reason: collision with root package name */
        private final Y4.W f3744b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC1980d f3745c;

        /* renamed from: d, reason: collision with root package name */
        private Context f3746d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ x f3747e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public e(I4.x r2, Y4.W r3, b5.InterfaceC1980d r4, android.content.Context r5) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.AbstractC3292y.i(r3, r0)
                java.lang.String r0 = "listener"
                kotlin.jvm.internal.AbstractC3292y.i(r4, r0)
                java.lang.String r0 = "context"
                kotlin.jvm.internal.AbstractC3292y.i(r5, r0)
                r1.f3747e = r2
                android.widget.RelativeLayout r2 = r3.getRoot()
                java.lang.String r0 = "getRoot(...)"
                kotlin.jvm.internal.AbstractC3292y.h(r2, r0)
                r1.<init>(r2, r5)
                r1.f3744b = r3
                r1.f3745c = r4
                r1.f3746d = r5
                android.widget.TextView r2 = r3.f12444n
                J4.j$a r4 = J4.j.f4395g
                android.graphics.Typeface r5 = r4.u()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f12442l
                android.graphics.Typeface r5 = r4.u()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f12439i
                android.graphics.Typeface r5 = r4.v()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f12443m
                android.graphics.Typeface r5 = r4.v()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f12445o
                android.graphics.Typeface r5 = r4.v()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f12441k
                android.graphics.Typeface r5 = r4.v()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f12440j
                android.graphics.Typeface r5 = r4.u()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f12438h
                android.graphics.Typeface r5 = r4.v()
                r2.setTypeface(r5)
                android.widget.TextView r2 = r3.f12446p
                android.graphics.Typeface r3 = r4.v()
                r2.setTypeface(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: I4.x.e.<init>(I4.x, Y4.W, b5.d, android.content.Context):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(e eVar, C2043h c2043h, View view) {
            eVar.f3745c.a(c2043h);
        }

        public final void m(final C2043h app) {
            AbstractC3292y.i(app, "app");
            String c02 = app.c0();
            if (c02 != null && c02.length() != 0) {
                com.squareup.picasso.s.h().l(app.c0()).n(UptodownApp.f29249C.e0(this.f3746d)).i(this.f3744b.f12432b);
            } else {
                this.f3744b.f12432b.setImageDrawable(ContextCompat.getDrawable(this.f3746d, R.drawable.shape_bg_placeholder));
            }
            View itemView = this.itemView;
            AbstractC3292y.h(itemView, "itemView");
            c(itemView, this.f3745c, app);
            TextView tvTopAppNameOrganization = this.f3744b.f12442l;
            AbstractC3292y.h(tvTopAppNameOrganization, "tvTopAppNameOrganization");
            TextView tvTopAppDescOrganization = this.f3744b.f12439i;
            AbstractC3292y.h(tvTopAppDescOrganization, "tvTopAppDescOrganization");
            i(app, tvTopAppNameOrganization, tvTopAppDescOrganization);
            this.f3744b.f12445o.setText(String.valueOf(app.B0() / 10.0d));
            this.f3744b.f12441k.setText(this.f3746d.getString(R.string.downloads_counter_multiple, new S4.g().b(app.I())));
            ImageView ivTopAppLogoOrganization = this.f3744b.f12433c;
            AbstractC3292y.h(ivTopAppLogoOrganization, "ivTopAppLogoOrganization");
            h(ivTopAppLogoOrganization, app.k0());
            if (!new C3784i().t(app.v0(), this.f3746d)) {
                this.f3744b.f12440j.setOnClickListener(new View.OnClickListener() { // from class: I4.y
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        x.e.n(x.e.this, app, view);
                    }
                });
            } else {
                this.f3744b.f12440j.setVisibility(8);
            }
            ProgressBar pbProgressLogoOrganization = this.f3744b.f12436f;
            AbstractC3292y.h(pbProgressLogoOrganization, "pbProgressLogoOrganization");
            ImageView ivTopAppLogoOrganization2 = this.f3744b.f12433c;
            AbstractC3292y.h(ivTopAppLogoOrganization2, "ivTopAppLogoOrganization");
            TextView tvTopAppDescOrganization2 = this.f3744b.f12439i;
            AbstractC3292y.h(tvTopAppDescOrganization2, "tvTopAppDescOrganization");
            TextView tvProgressTopOrganization = this.f3744b.f12438h;
            AbstractC3292y.h(tvProgressTopOrganization, "tvProgressTopOrganization");
            Y4.W w8 = this.f3744b;
            TextView textView = w8.f12443m;
            LinearLayout llProgressTopOrganization = w8.f12434d;
            AbstractC3292y.h(llProgressTopOrganization, "llProgressTopOrganization");
            e(app, pbProgressLogoOrganization, ivTopAppLogoOrganization2, tvTopAppDescOrganization2, tvProgressTopOrganization, textView, llProgressTopOrganization);
        }
    }

    /* loaded from: classes5.dex */
    public final class f extends RecyclerView.Adapter {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC1980d f3748a;

        /* renamed from: b, reason: collision with root package name */
        private Context f3749b;

        /* renamed from: c, reason: collision with root package name */
        private ArrayList f3750c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ x f3751d;

        /* loaded from: classes5.dex */
        public final class a extends AbstractC4026h {

            /* renamed from: b, reason: collision with root package name */
            private final Y f3752b;

            /* renamed from: c, reason: collision with root package name */
            private InterfaceC1980d f3753c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ f f3754d;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public a(I4.x.f r2, Y4.Y r3, b5.InterfaceC1980d r4, android.content.Context r5) {
                /*
                    r1 = this;
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.AbstractC3292y.i(r3, r0)
                    java.lang.String r0 = "listener"
                    kotlin.jvm.internal.AbstractC3292y.i(r4, r0)
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.AbstractC3292y.i(r5, r0)
                    r1.f3754d = r2
                    android.widget.RelativeLayout r2 = r3.getRoot()
                    java.lang.String r0 = "getRoot(...)"
                    kotlin.jvm.internal.AbstractC3292y.h(r2, r0)
                    r1.<init>(r2, r5)
                    r1.f3752b = r3
                    r1.f3753c = r4
                    android.widget.TextView r2 = r3.f12454f
                    J4.j$a r4 = J4.j.f4395g
                    android.graphics.Typeface r5 = r4.u()
                    r2.setTypeface(r5)
                    android.widget.TextView r2 = r3.f12452d
                    android.graphics.Typeface r5 = r4.v()
                    r2.setTypeface(r5)
                    android.widget.TextView r2 = r3.f12455g
                    android.graphics.Typeface r5 = r4.u()
                    r2.setTypeface(r5)
                    android.widget.TextView r2 = r3.f12456h
                    android.graphics.Typeface r5 = r4.v()
                    r2.setTypeface(r5)
                    android.widget.TextView r2 = r3.f12453e
                    android.graphics.Typeface r3 = r4.v()
                    r2.setTypeface(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: I4.x.f.a.<init>(I4.x$f, Y4.Y, b5.d, android.content.Context):void");
            }

            public final void l(C2043h app) {
                AbstractC3292y.i(app, "app");
                View itemView = this.itemView;
                AbstractC3292y.h(itemView, "itemView");
                c(itemView, this.f3753c, app);
                TextView tvTopAppNameOrganization = this.f3752b.f12454f;
                AbstractC3292y.h(tvTopAppNameOrganization, "tvTopAppNameOrganization");
                TextView tvTopAppDescOrganization = this.f3752b.f12452d;
                AbstractC3292y.h(tvTopAppDescOrganization, "tvTopAppDescOrganization");
                i(app, tvTopAppNameOrganization, tvTopAppDescOrganization);
                String v02 = app.v0();
                TextView tvTopAppStatusOrganization = this.f3752b.f12455g;
                AbstractC3292y.h(tvTopAppStatusOrganization, "tvTopAppStatusOrganization");
                TextView tvTopAppDescOrganization2 = this.f3752b.f12452d;
                AbstractC3292y.h(tvTopAppDescOrganization2, "tvTopAppDescOrganization");
                g(v02, tvTopAppStatusOrganization, tvTopAppDescOrganization2);
                ImageView ivTopAppLogoOrganization = this.f3752b.f12450b;
                AbstractC3292y.h(ivTopAppLogoOrganization, "ivTopAppLogoOrganization");
                h(ivTopAppLogoOrganization, app.k0());
                this.f3752b.f12456h.setText(String.valueOf(app.B0() / 10.0d));
                this.f3752b.f12453e.setText(this.f3754d.f3749b.getString(R.string.downloads_counter_multiple, new S4.g().b(app.I())));
            }
        }

        public f(x xVar, InterfaceC1980d listener, Context context) {
            AbstractC3292y.i(listener, "listener");
            AbstractC3292y.i(context, "context");
            this.f3751d = xVar;
            this.f3748a = listener;
            this.f3749b = context;
            this.f3750c = new ArrayList();
        }

        public final ArrayList b() {
            return this.f3750c;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(a holder, int i8) {
            AbstractC3292y.i(holder, "holder");
            Object obj = this.f3750c.get(i8);
            AbstractC3292y.h(obj, "get(...)");
            holder.l((C2043h) obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(ViewGroup parent, int i8) {
            AbstractC3292y.i(parent, "parent");
            Y c8 = Y.c(LayoutInflater.from(parent.getContext()), parent, false);
            AbstractC3292y.h(c8, "inflate(...)");
            return new a(this, c8, this.f3748a, this.f3749b);
        }

        public final void e(ArrayList importantApps) {
            AbstractC3292y.i(importantApps, "importantApps");
            this.f3750c = importantApps;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f3750c.size();
        }
    }

    /* loaded from: classes5.dex */
    public final class g extends AbstractC4026h {

        /* renamed from: b, reason: collision with root package name */
        private final f f3755b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f3756c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public g(I4.x r4, Y4.X r5, b5.InterfaceC1980d r6, android.content.Context r7) {
            /*
                r3 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.AbstractC3292y.i(r5, r0)
                java.lang.String r0 = "listener"
                kotlin.jvm.internal.AbstractC3292y.i(r6, r0)
                java.lang.String r0 = "context"
                kotlin.jvm.internal.AbstractC3292y.i(r7, r0)
                r3.f3756c = r4
                android.widget.LinearLayout r0 = r5.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.AbstractC3292y.h(r0, r1)
                r3.<init>(r0, r7)
                I4.x$f r0 = new I4.x$f
                r0.<init>(r4, r6, r7)
                r3.f3755b = r0
                androidx.recyclerview.widget.RecyclerView r4 = r5.f12448b
                androidx.recyclerview.widget.LinearLayoutManager r6 = new androidx.recyclerview.widget.LinearLayoutManager
                android.view.View r7 = r3.itemView
                android.content.Context r7 = r7.getContext()
                r1 = 1
                r2 = 0
                r6.<init>(r7, r1, r2)
                r4.setLayoutManager(r6)
                androidx.recyclerview.widget.RecyclerView r4 = r5.f12448b
                r4.setAdapter(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: I4.x.g.<init>(I4.x, Y4.X, b5.d, android.content.Context):void");
        }

        public final void l(ArrayList importantApps) {
            AbstractC3292y.i(importantApps, "importantApps");
            this.f3755b.e(importantApps);
        }

        public final f m() {
            return this.f3755b;
        }
    }

    public x(InterfaceC1980d listener, String organizationName) {
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(organizationName, "organizationName");
        this.f3729a = listener;
        this.f3730b = organizationName;
        this.f3731c = new ArrayList();
    }

    public final void a(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f3731c.size();
            Iterator it = arrayList.iterator();
            AbstractC3292y.h(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                b bVar = new b();
                bVar.c((C2043h) next);
                bVar.d(5);
                this.f3731c.add(bVar);
                notifyItemInserted(AbstractC1435t.o(this.f3731c));
            }
        }
    }

    public final void b(C2043h c2043h, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f3731c = new ArrayList();
        if (c2043h != null) {
            b bVar = new b();
            bVar.c(c2043h);
            bVar.d(1);
            this.f3731c.add(bVar);
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            b bVar2 = new b();
            bVar2.c(arrayList);
            bVar2.d(2);
            this.f3731c.add(bVar2);
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            b bVar3 = new b();
            bVar3.c(arrayList2);
            bVar3.d(3);
            this.f3731c.add(bVar3);
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            b bVar4 = new b();
            bVar4.c(arrayList3);
            bVar4.d(4);
            this.f3731c.add(bVar4);
            Iterator it = arrayList3.iterator();
            AbstractC3292y.h(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                b bVar5 = new b();
                bVar5.c((C2043h) next);
                bVar5.d(5);
                this.f3731c.add(bVar5);
            }
        }
    }

    public final void c(boolean z8) {
        this.f3732d = z8;
        if (z8) {
            notifyItemInserted(getItemCount());
        } else {
            notifyItemRemoved(getItemCount());
        }
    }

    public final void d(String packageName, RecyclerView recyclerView) {
        AbstractC3292y.i(packageName, "packageName");
        AbstractC3292y.i(recyclerView, "recyclerView");
        int itemCount = getItemCount();
        for (int i8 = 0; i8 < itemCount; i8++) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i8);
            if (findViewHolderForAdapterPosition instanceof e) {
                Iterator it = this.f3731c.iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    int i10 = i9 + 1;
                    if (((b) it.next()).a() instanceof C2043h) {
                        notifyItemChanged(i9);
                    }
                    i9 = i10;
                }
            } else {
                Object obj = null;
                if (findViewHolderForAdapterPosition instanceof g) {
                    g gVar = (g) findViewHolderForAdapterPosition;
                    Iterator it2 = gVar.m().b().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (AbstractC3292y.d(((C2043h) next).v0(), packageName)) {
                            obj = next;
                            break;
                        }
                    }
                    gVar.m().notifyItemChanged(AbstractC1435t.r0(gVar.m().b(), (C2043h) obj));
                } else if (findViewHolderForAdapterPosition instanceof d) {
                    d dVar = (d) findViewHolderForAdapterPosition;
                    Iterator it3 = dVar.m().b().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (AbstractC3292y.d(((C2043h) next2).v0(), packageName)) {
                            obj = next2;
                            break;
                        }
                    }
                    dVar.m().notifyItemChanged(AbstractC1435t.r0(dVar.m().b(), (C2043h) obj));
                } else if (findViewHolderForAdapterPosition instanceof E0) {
                    notifyItemChanged(i8);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3731c.size() + (this.f3732d ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        if (i8 == this.f3731c.size()) {
            return 6;
        }
        return ((b) this.f3731c.get(i8)).b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i8) {
        AbstractC3292y.i(holder, "holder");
        if (holder instanceof e) {
            Object a9 = ((b) this.f3731c.get(i8)).a();
            AbstractC3292y.g(a9, "null cannot be cast to non-null type com.uptodown.models.AppInfo");
            ((e) holder).m((C2043h) a9);
            return;
        }
        if (holder instanceof g) {
            Object a10 = ((b) this.f3731c.get(i8)).a();
            AbstractC3292y.g(a10, "null cannot be cast to non-null type java.util.ArrayList<com.uptodown.models.AppInfo>");
            ((g) holder).l((ArrayList) a10);
        } else if (holder instanceof d) {
            Object a11 = ((b) this.f3731c.get(i8)).a();
            AbstractC3292y.g(a11, "null cannot be cast to non-null type java.util.ArrayList<com.uptodown.models.AppInfo>");
            ((d) holder).l((ArrayList) a11);
        } else if (holder instanceof E0) {
            Object a12 = ((b) this.f3731c.get(i8)).a();
            AbstractC3292y.g(a12, "null cannot be cast to non-null type com.uptodown.models.AppInfo");
            ((E0) holder).m((C2043h) a12, i8);
        } else if (holder instanceof C4054v0) {
            ((C4054v0) holder).b(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3292y.i(parent, "parent");
        switch (i8) {
            case 1:
                Y4.W c8 = Y4.W.c(LayoutInflater.from(parent.getContext()), parent, false);
                AbstractC3292y.h(c8, "inflate(...)");
                InterfaceC1980d interfaceC1980d = this.f3729a;
                Context context = parent.getContext();
                AbstractC3292y.h(context, "getContext(...)");
                return new e(this, c8, interfaceC1980d, context);
            case 2:
                X c9 = X.c(LayoutInflater.from(parent.getContext()), parent, false);
                AbstractC3292y.h(c9, "inflate(...)");
                InterfaceC1980d interfaceC1980d2 = this.f3729a;
                Context context2 = parent.getContext();
                AbstractC3292y.h(context2, "getContext(...)");
                return new g(this, c9, interfaceC1980d2, context2);
            case 3:
                Y4.V c10 = Y4.V.c(LayoutInflater.from(parent.getContext()), parent, false);
                AbstractC3292y.h(c10, "inflate(...)");
                InterfaceC1980d interfaceC1980d3 = this.f3729a;
                Context context3 = parent.getContext();
                AbstractC3292y.h(context3, "getContext(...)");
                return new d(this, c10, interfaceC1980d3, context3, this.f3730b);
            case 4:
                View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.title_organization_apps, parent, false);
                AbstractC3292y.f(inflate);
                String string = parent.getContext().getString(R.string.organization_more_apps_title, this.f3730b);
                AbstractC3292y.h(string, "getString(...)");
                return new C4054v0(inflate, string, null);
            case 5:
                View inflate2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.app_info_vertical_top_item, parent, false);
                AbstractC3292y.f(inflate2);
                InterfaceC1980d interfaceC1980d4 = this.f3729a;
                Context context4 = parent.getContext();
                AbstractC3292y.h(context4, "getContext(...)");
                return new E0(inflate2, interfaceC1980d4, null, context4);
            case 6:
                View inflate3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.pb_loading_more_content, parent, false);
                AbstractC3292y.f(inflate3);
                return new t5.M(inflate3);
            default:
                throw new IllegalArgumentException("viewType unknown");
        }
    }
}
