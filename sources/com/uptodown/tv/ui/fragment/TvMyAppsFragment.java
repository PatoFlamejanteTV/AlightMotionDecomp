package com.uptodown.tv.ui.fragment;

import J4.i;
import J4.j;
import Q5.I;
import Q5.t;
import R5.AbstractC1435t;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.app.VerticalGridSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;
import androidx.leanback.widget.VerticalGridPresenter;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import b5.InterfaceC1975D;
import b5.r;
import c5.C2041f;
import c5.C2043h;
import c5.Q;
import c6.InterfaceC2072n;
import com.mbridge.msdk.MBridgeConstans;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.tv.ui.activity.TvOldVersionsActivity;
import com.uptodown.tv.ui.fragment.TvMyAppsFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.Y;
import l5.m;
import l6.n;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import n6.M;
import q5.C3776a;
import q5.C3784i;
import q5.C3791p;
import q5.C3794s;
import q5.C3795t;

/* loaded from: classes5.dex */
public final class TvMyAppsFragment extends VerticalGridSupportFragment {

    /* renamed from: b, reason: collision with root package name */
    private ArrayObjectAdapter f31106b;

    /* renamed from: c, reason: collision with root package name */
    private AlertDialog f31107c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f31108d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f31109e;

    /* renamed from: a, reason: collision with root package name */
    private final LifecycleCoroutineScope f31105a = LifecycleOwnerKt.getLifecycleScope(this);

    /* renamed from: f, reason: collision with root package name */
    private final int f31110f = 5;

    /* loaded from: classes5.dex */
    private static final class a extends ArrayObjectAdapter {
        public a(m mVar) {
            super(mVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class b implements OnItemViewClickedListener {
        public b() {
        }

        @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onItemClicked(Presenter.ViewHolder itemViewHolder, Object item, RowPresenter.ViewHolder viewHolder, Row row) {
            Bundle bundle;
            AbstractC3292y.i(itemViewHolder, "itemViewHolder");
            AbstractC3292y.i(item, "item");
            if (item instanceof C2041f) {
                if (!TvMyAppsFragment.this.f31109e) {
                    TvMyAppsFragment.this.H((C2041f) item, itemViewHolder);
                    return;
                }
                Intent intent = new Intent(TvMyAppsFragment.this.getContext(), (Class<?>) TvOldVersionsActivity.class);
                intent.putExtra(MBridgeConstans.DYNAMIC_VIEW_WX_APP, (Parcelable) item);
                TvMyAppsFragment tvMyAppsFragment = TvMyAppsFragment.this;
                FragmentActivity activity = tvMyAppsFragment.getActivity();
                if (activity != null) {
                    bundle = UptodownApp.f29249C.a(activity);
                } else {
                    bundle = null;
                }
                tvMyAppsFragment.startActivity(intent, bundle);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements InterfaceC1975D {
        c() {
        }

        @Override // b5.InterfaceC1975D
        public void a(String appName) {
            AbstractC3292y.i(appName, "appName");
            TvMyAppsFragment.this.E(appName);
        }
    }

    /* loaded from: classes5.dex */
    public static final class d implements r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Presenter.ViewHolder f31114b;

        d(Presenter.ViewHolder viewHolder) {
            this.f31114b = viewHolder;
        }

        @Override // b5.r
        public void b(int i8) {
        }

        @Override // b5.r
        public void c(C2043h appInfo) {
            AbstractC3292y.i(appInfo, "appInfo");
            if (TvMyAppsFragment.this.getActivity() != null) {
                m5.b bVar = (m5.b) TvMyAppsFragment.this.getActivity();
                AbstractC3292y.f(bVar);
                bVar.l(appInfo, this.f31114b);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class e implements O4.b {
        e() {
        }

        @Override // O4.b
        public void a(P4.b app, int i8) {
            AbstractC3292y.i(app, "app");
        }

        @Override // O4.b
        public void b(P4.b app) {
            AbstractC3292y.i(app, "app");
            if (TvMyAppsFragment.this.getContext() != null) {
                TvMyAppsFragment tvMyAppsFragment = TvMyAppsFragment.this;
                tvMyAppsFragment.E(tvMyAppsFragment.getString(R.string.core_msg_cannot_write_path));
            }
        }

        @Override // O4.b
        public void c(ArrayList apps) {
            AbstractC3292y.i(apps, "apps");
            if (TvMyAppsFragment.this.getContext() != null) {
                TvMyAppsFragment tvMyAppsFragment = TvMyAppsFragment.this;
                tvMyAppsFragment.E(tvMyAppsFragment.getString(R.string.backup_finished));
            }
        }

        @Override // O4.b
        public void d(P4.b app) {
            AbstractC3292y.i(app, "app");
            if (TvMyAppsFragment.this.getContext() != null) {
                TvMyAppsFragment tvMyAppsFragment = TvMyAppsFragment.this;
                tvMyAppsFragment.E(tvMyAppsFragment.getString(R.string.core_msg_cannot_write_path));
            }
        }

        @Override // O4.b
        public void e(String appName) {
            AbstractC3292y.i(appName, "appName");
        }

        @Override // O4.b
        public void f(P4.b app) {
            AbstractC3292y.i(app, "app");
        }

        @Override // O4.b
        public void g(int i8) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31116a;

        f(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f31116a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvMyAppsFragment tvMyAppsFragment = TvMyAppsFragment.this;
                this.f31116a = 1;
                if (tvMyAppsFragment.Y(this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class g extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31118a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f31120a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvMyAppsFragment f31121b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f31122c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvMyAppsFragment tvMyAppsFragment, T t8, U5.d dVar) {
                super(2, dVar);
                this.f31121b = tvMyAppsFragment;
                this.f31122c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f31121b, this.f31122c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f31120a == 0) {
                    t.b(obj);
                    this.f31121b.Z((ArrayList) this.f31122c.f34573a);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        g(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f31118a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                if (TvMyAppsFragment.this.getContext() != null) {
                    T t8 = new T();
                    C3784i c3784i = new C3784i();
                    Context requireContext = TvMyAppsFragment.this.requireContext();
                    AbstractC3292y.h(requireContext, "requireContext(...)");
                    t8.f34573a = c3784i.C(requireContext);
                    if (TvMyAppsFragment.this.f31108d) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((ArrayList) t8.f34573a).iterator();
                        AbstractC3292y.h(it, "iterator(...)");
                        while (it.hasNext()) {
                            Object next = it.next();
                            AbstractC3292y.h(next, "next(...)");
                            C2041f c2041f = (C2041f) next;
                            if (c2041f.c0() == C2041f.c.f15790a) {
                                arrayList.add(c2041f);
                            }
                        }
                        t8.f34573a = arrayList;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = ((ArrayList) t8.f34573a).iterator();
                        AbstractC3292y.h(it2, "iterator(...)");
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            AbstractC3292y.h(next2, "next(...)");
                            C2041f c2041f2 = (C2041f) next2;
                            if (n.s(TvMyAppsFragment.this.requireContext().getPackageName(), c2041f2.Q(), true)) {
                                arrayList2.add(c2041f2);
                            } else {
                                Context requireContext2 = TvMyAppsFragment.this.requireContext();
                                AbstractC3292y.h(requireContext2, "requireContext(...)");
                                if (c2041f2.i0(requireContext2)) {
                                    S4.f fVar = new S4.f();
                                    Context requireContext3 = TvMyAppsFragment.this.requireContext();
                                    AbstractC3292y.h(requireContext3, "requireContext(...)");
                                    String Q8 = c2041f2.Q();
                                    AbstractC3292y.f(Q8);
                                    if (!fVar.p(requireContext3, Q8)) {
                                        arrayList2.add(c2041f2);
                                    }
                                }
                            }
                        }
                        t8.f34573a = arrayList2;
                    }
                    TvMyAppsFragment.this.a0((ArrayList) t8.f34573a);
                    J0 c8 = C3445b0.c();
                    a aVar = new a(TvMyAppsFragment.this, t8, null);
                    this.f31118a = 1;
                    if (AbstractC3458i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setMessage(str);
            builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: n5.D
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    TvMyAppsFragment.F(dialogInterface, i8);
                }
            });
            builder.setCancelable(true);
            builder.create().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(DialogInterface dialogInterface, int i8) {
        AbstractC3292y.i(dialogInterface, "dialogInterface");
        dialogInterface.dismiss();
    }

    private final void G(C2041f c2041f, Q q8) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        LayoutInflater layoutInflater = getLayoutInflater();
        AbstractC3292y.h(layoutInflater, "getLayoutInflater(...)");
        View inflate = layoutInflater.inflate(R.layout.version_details_dialog, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_title_vd);
        j.a aVar = j.f4395g;
        textView.setTypeface(aVar.v());
        ((TextView) inflate.findViewById(R.id.tv_label_app_name_vd)).setTypeface(aVar.v());
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_app_name_vd);
        textView2.setTypeface(aVar.v());
        textView2.setText(c2041f.z());
        ((TextView) inflate.findViewById(R.id.tv_label_installed_version_vd)).setTypeface(aVar.v());
        TextView textView3 = (TextView) inflate.findViewById(R.id.tv_installed_version_vd);
        textView3.setTypeface(aVar.v());
        Y y8 = Y.f34578a;
        String format = String.format("%s(%s)", Arrays.copyOf(new Object[]{c2041f.h0(), Long.valueOf(c2041f.f0())}, 2));
        AbstractC3292y.h(format, "format(...)");
        textView3.setText(format);
        ((TextView) inflate.findViewById(R.id.tv_label_update_version_vd)).setTypeface(aVar.v());
        TextView textView4 = (TextView) inflate.findViewById(R.id.tv_update_version_vd);
        textView4.setTypeface(aVar.v());
        String format2 = String.format("%s(%s)", Arrays.copyOf(new Object[]{q8.x(), Long.valueOf(q8.w())}, 2));
        AbstractC3292y.h(format2, "format(...)");
        textView4.setText(format2);
        ((TextView) inflate.findViewById(R.id.tv_label_packagename_vd)).setTypeface(aVar.v());
        TextView textView5 = (TextView) inflate.findViewById(R.id.tv_packagename_vd);
        textView5.setTypeface(aVar.v());
        textView5.setText(c2041f.Q());
        ((TextView) inflate.findViewById(R.id.tv_label_size_vd)).setTypeface(aVar.v());
        TextView textView6 = (TextView) inflate.findViewById(R.id.tv_size_vd);
        textView6.setTypeface(aVar.v());
        textView6.setText(new S4.g().c(q8.v()));
        ((TextView) inflate.findViewById(R.id.tv_label_filename_vd)).setTypeface(aVar.v());
        TextView textView7 = (TextView) inflate.findViewById(R.id.tv_filename_vd);
        textView7.setTypeface(aVar.v());
        textView7.setText(q8.l());
        builder.setView(inflate);
        AlertDialog create = builder.create();
        this.f31107c = create;
        AbstractC3292y.f(create);
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(final C2041f c2041f, final Presenter.ViewHolder viewHolder) {
        boolean z8;
        if (!getParentFragmentManager().isDestroyed() && c2041f != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
            LayoutInflater layoutInflater = getLayoutInflater();
            AbstractC3292y.h(layoutInflater, "getLayoutInflater(...)");
            View inflate = layoutInflater.inflate(R.layout.dialogo_app_selected, (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(R.id.tv_title_das);
            j.a aVar = j.f4395g;
            textView.setTypeface(aVar.u());
            textView.setText(c2041f.z());
            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_see_on_uptodown);
            boolean z9 = true;
            if (c2041f.b() > 0) {
                textView2.setTypeface(aVar.v());
                textView2.setOnClickListener(new View.OnClickListener() { // from class: n5.F
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.P(TvMyAppsFragment.this, c2041f, viewHolder, view);
                    }
                });
                z8 = true;
            } else {
                textView2.setVisibility(8);
                z8 = false;
            }
            ((TextView) inflate.findViewById(R.id.tv_update)).setVisibility(8);
            TextView textView3 = (TextView) inflate.findViewById(R.id.tv_open);
            TextView textView4 = (TextView) inflate.findViewById(R.id.tv_uninstall);
            if (getContext() != null && !n.s(requireContext().getPackageName(), c2041f.Q(), true)) {
                textView3.setTypeface(aVar.v());
                textView3.setOnClickListener(new View.OnClickListener() { // from class: n5.H
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.Q(C2041f.this, this, view);
                    }
                });
                if (!c2041f.l0()) {
                    textView4.setTypeface(aVar.v());
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: n5.I
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            TvMyAppsFragment.R(C2041f.this, this, view);
                        }
                    });
                } else {
                    textView4.setVisibility(8);
                }
                z8 = true;
            } else {
                textView3.setVisibility(8);
                textView4.setVisibility(8);
            }
            if (UptodownApp.f29249C.M()) {
                textView3.setText("Debug Info App");
                textView3.setOnClickListener(new View.OnClickListener() { // from class: n5.J
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.S(C2041f.this, this, view);
                    }
                });
                textView3.setVisibility(0);
                z8 = true;
            }
            TextView textView5 = (TextView) inflate.findViewById(R.id.tv_share);
            if (c2041f.e0() != null) {
                textView5.setTypeface(aVar.v());
                textView5.setOnClickListener(new View.OnClickListener() { // from class: n5.v
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.I(TvMyAppsFragment.this, c2041f, view);
                    }
                });
                z8 = true;
            } else {
                textView5.setVisibility(8);
            }
            TextView textView6 = (TextView) inflate.findViewById(R.id.tv_old_versions);
            if (getContext() != null && !n.s(requireContext().getPackageName(), c2041f.Q(), true)) {
                textView6.setTypeface(aVar.v());
                textView6.setOnClickListener(new View.OnClickListener() { // from class: n5.w
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.J(TvMyAppsFragment.this, c2041f, view);
                    }
                });
            } else {
                textView6.setVisibility(8);
            }
            TextView textView7 = (TextView) inflate.findViewById(R.id.tv_exclude);
            if (c2041f.i() == 0) {
                textView7.setText(getString(R.string.not_offer_updates));
            } else {
                textView7.setText(getString(R.string.offer_updates_again));
            }
            textView7.setTypeface(aVar.v());
            textView7.setOnClickListener(new View.OnClickListener() { // from class: n5.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TvMyAppsFragment.K(TvMyAppsFragment.this, c2041f, view);
                }
            });
            TextView textView8 = (TextView) inflate.findViewById(R.id.tv_check_updates);
            TextView textView9 = (TextView) inflate.findViewById(R.id.tv_version_details);
            if (c2041f.c0() == C2041f.c.f15790a) {
                textView8.setTypeface(aVar.v());
                textView8.setOnClickListener(new View.OnClickListener() { // from class: n5.y
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.L(TvMyAppsFragment.this, c2041f, view);
                    }
                });
                textView9.setTypeface(aVar.v());
                textView9.setOnClickListener(new View.OnClickListener() { // from class: n5.z
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.M(TvMyAppsFragment.this, c2041f, view);
                    }
                });
                TextView textView10 = (TextView) inflate.findViewById(R.id.tv_ignore_version);
                textView10.setVisibility(0);
                textView10.setTypeface(aVar.v());
                C3791p.a aVar2 = C3791p.f37286s;
                Context requireContext = requireContext();
                AbstractC3292y.h(requireContext, "requireContext(...)");
                C3791p a9 = aVar2.a(requireContext);
                a9.a();
                String Q8 = c2041f.Q();
                AbstractC3292y.f(Q8);
                Q s02 = a9.s0(Q8);
                a9.i();
                if (s02 != null && s02.h() == 1) {
                    textView10.setText(R.string.reactivate_skipped_update);
                } else {
                    textView10.setText(R.string.skip_update);
                }
                textView10.setOnClickListener(new View.OnClickListener() { // from class: n5.A
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.N(TvMyAppsFragment.this, c2041f, view);
                    }
                });
                z8 = true;
            } else {
                textView8.setVisibility(8);
                textView9.setVisibility(8);
            }
            if (c2041f.Q() != null) {
                TextView textView11 = (TextView) inflate.findViewById(R.id.tv_backup);
                textView11.setVisibility(0);
                textView11.setTypeface(aVar.v());
                textView11.setOnClickListener(new View.OnClickListener() { // from class: n5.G
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.O(TvMyAppsFragment.this, c2041f, view);
                    }
                });
            } else {
                z9 = z8;
            }
            if (z9) {
                builder.setView(inflate);
                AlertDialog create = builder.create();
                this.f31107c = create;
                AbstractC3292y.f(create);
                create.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(TvMyAppsFragment tvMyAppsFragment, C2041f c2041f, View view) {
        Context requireContext = tvMyAppsFragment.requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        new X4.r(requireContext, null, c2041f, new c(), LifecycleOwnerKt.getLifecycleScope(tvMyAppsFragment));
        AlertDialog alertDialog = tvMyAppsFragment.f31107c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(TvMyAppsFragment tvMyAppsFragment, C2041f c2041f, View view) {
        Bundle bundle;
        Intent intent = new Intent(tvMyAppsFragment.getContext(), (Class<?>) TvOldVersionsActivity.class);
        intent.putExtra(MBridgeConstans.DYNAMIC_VIEW_WX_APP, c2041f);
        FragmentActivity activity = tvMyAppsFragment.getActivity();
        if (activity != null) {
            bundle = UptodownApp.f29249C.a(activity);
        } else {
            bundle = null;
        }
        tvMyAppsFragment.startActivity(intent, bundle);
        AlertDialog alertDialog = tvMyAppsFragment.f31107c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(TvMyAppsFragment tvMyAppsFragment, C2041f c2041f, View view) {
        AlertDialog alertDialog = tvMyAppsFragment.f31107c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        C3791p.a aVar = C3791p.f37286s;
        Context requireContext = tvMyAppsFragment.requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        C3791p a9 = aVar.a(requireContext);
        a9.a();
        if (c2041f.i() == 0) {
            c2041f.t0(1);
            c2041f.J0(C2041f.c.f15791b);
            String Q8 = c2041f.Q();
            AbstractC3292y.f(Q8);
            a9.M(Q8);
            C3794s c3794s = new C3794s();
            Context requireContext2 = tvMyAppsFragment.requireContext();
            AbstractC3292y.h(requireContext2, "requireContext(...)");
            c3794s.c(requireContext2);
        } else {
            c2041f.t0(0);
        }
        a9.h1(c2041f);
        a9.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(TvMyAppsFragment tvMyAppsFragment, C2041f c2041f, View view) {
        C3791p.a aVar = C3791p.f37286s;
        Context requireContext = tvMyAppsFragment.requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        C3791p a9 = aVar.a(requireContext);
        a9.a();
        String Q8 = c2041f.Q();
        AbstractC3292y.f(Q8);
        Q s02 = a9.s0(Q8);
        if (s02 != null) {
            s02.X(0);
            a9.p1(s02);
            C3776a c3776a = new C3776a();
            Context requireContext2 = tvMyAppsFragment.requireContext();
            AbstractC3292y.h(requireContext2, "requireContext(...)");
            c3776a.b(requireContext2, s02.l());
        }
        a9.i();
        tvMyAppsFragment.V();
        AlertDialog alertDialog = tvMyAppsFragment.f31107c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(TvMyAppsFragment tvMyAppsFragment, C2041f c2041f, View view) {
        AlertDialog alertDialog = tvMyAppsFragment.f31107c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        C3791p.a aVar = C3791p.f37286s;
        Context requireContext = tvMyAppsFragment.requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        C3791p a9 = aVar.a(requireContext);
        a9.a();
        String Q8 = c2041f.Q();
        AbstractC3292y.f(Q8);
        Q s02 = a9.s0(Q8);
        if (s02 != null) {
            s02.X(0);
            a9.p1(s02);
        }
        a9.i();
        if (s02 != null) {
            tvMyAppsFragment.G(c2041f, s02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(TvMyAppsFragment tvMyAppsFragment, C2041f c2041f, View view) {
        AlertDialog alertDialog = tvMyAppsFragment.f31107c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        C3791p.a aVar = C3791p.f37286s;
        Context requireContext = tvMyAppsFragment.requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        C3791p a9 = aVar.a(requireContext);
        a9.a();
        String Q8 = c2041f.Q();
        AbstractC3292y.f(Q8);
        Q s02 = a9.s0(Q8);
        if (s02 != null) {
            if (s02.h() == 1) {
                s02.I(0);
            } else {
                s02.I(1);
            }
            a9.p1(s02);
            C3776a c3776a = new C3776a();
            Context requireContext2 = tvMyAppsFragment.requireContext();
            AbstractC3292y.h(requireContext2, "requireContext(...)");
            c3776a.b(requireContext2, s02.l());
        }
        a9.i();
        tvMyAppsFragment.V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(TvMyAppsFragment tvMyAppsFragment, C2041f c2041f, View view) {
        AlertDialog alertDialog = tvMyAppsFragment.f31107c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        tvMyAppsFragment.W(c2041f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(TvMyAppsFragment tvMyAppsFragment, C2041f c2041f, Presenter.ViewHolder viewHolder, View view) {
        tvMyAppsFragment.U(c2041f.b(), viewHolder);
        AlertDialog alertDialog = tvMyAppsFragment.f31107c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(C2041f c2041f, TvMyAppsFragment tvMyAppsFragment, View view) {
        try {
            if (c2041f.Q() != null) {
                PackageManager packageManager = tvMyAppsFragment.requireContext().getPackageManager();
                String Q8 = c2041f.Q();
                AbstractC3292y.f(Q8);
                Intent leanbackLaunchIntentForPackage = packageManager.getLeanbackLaunchIntentForPackage(Q8);
                if (leanbackLaunchIntentForPackage == null) {
                    PackageManager packageManager2 = tvMyAppsFragment.requireContext().getPackageManager();
                    String Q9 = c2041f.Q();
                    AbstractC3292y.f(Q9);
                    leanbackLaunchIntentForPackage = packageManager2.getLaunchIntentForPackage(Q9);
                }
                if (leanbackLaunchIntentForPackage != null) {
                    tvMyAppsFragment.startActivity(leanbackLaunchIntentForPackage);
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        AlertDialog alertDialog = tvMyAppsFragment.f31107c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(C2041f c2041f, TvMyAppsFragment tvMyAppsFragment, View view) {
        if (c2041f.Q() != null) {
            Context requireContext = tvMyAppsFragment.requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            i iVar = new i(requireContext);
            String Q8 = c2041f.Q();
            AbstractC3292y.f(Q8);
            iVar.h(Q8);
        }
        AlertDialog alertDialog = tvMyAppsFragment.f31107c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(C2041f c2041f, TvMyAppsFragment tvMyAppsFragment, View view) {
        Bundle bundle;
        if (c2041f.Q() != null) {
            Intent intent = new Intent(tvMyAppsFragment.getContext(), (Class<?>) G4.b.class);
            intent.putExtra("AppIndex", c2041f.Q());
            FragmentActivity activity = tvMyAppsFragment.getActivity();
            if (activity != null) {
                bundle = UptodownApp.f29249C.a(activity);
            } else {
                bundle = null;
            }
            tvMyAppsFragment.startActivity(intent, bundle);
        }
        AlertDialog alertDialog = tvMyAppsFragment.f31107c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    private final void U(long j8, Presenter.ViewHolder viewHolder) {
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        new X4.i(requireContext, j8, new d(viewHolder), LifecycleOwnerKt.getLifecycleScope(this));
    }

    private final void V() {
        if (getContext() != null) {
            UptodownApp.a aVar = UptodownApp.f29249C;
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            UptodownApp.a.M0(aVar, requireContext, false, 2, null);
        }
    }

    private final void W(C2041f c2041f) {
        if (getContext() != null) {
            ArrayList arrayList = new ArrayList();
            String Q8 = c2041f.Q();
            AbstractC3292y.f(Q8);
            String z8 = c2041f.z();
            AbstractC3292y.f(z8);
            arrayList.add(new P4.b(Q8, z8));
            e eVar = new e();
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            new N4.a(requireContext, eVar).t(arrayList);
        }
    }

    private final void X() {
        AbstractC3462k.d(this.f31105a, null, null, new f(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Y(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new g(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(ArrayList arrayList) {
        ArrayObjectAdapter arrayObjectAdapter = this.f31106b;
        AbstractC3292y.f(arrayObjectAdapter);
        arrayObjectAdapter.clear();
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                ArrayObjectAdapter arrayObjectAdapter2 = this.f31106b;
                AbstractC3292y.f(arrayObjectAdapter2);
                arrayObjectAdapter2.add(arrayList.get(i8));
            }
        }
        ArrayObjectAdapter arrayObjectAdapter3 = this.f31106b;
        AbstractC3292y.f(arrayObjectAdapter3);
        if (arrayObjectAdapter3.size() == 0 && getContext() != null) {
            E(getString(R.string.no_data_available));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList a0(ArrayList arrayList) {
        AbstractC1435t.B(arrayList, new Comparator() { // from class: n5.u
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int b02;
                b02 = TvMyAppsFragment.b0((C2041f) obj, (C2041f) obj2);
                return b02;
            }
        });
        C3791p.a aVar = C3791p.f37286s;
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        C3791p a9 = aVar.a(requireContext);
        a9.a();
        ArrayList t02 = a9.t0();
        a9.i();
        Iterator it = t02.iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            Q q8 = (Q) next;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (n.s(q8.s(), ((C2041f) arrayList.get(i8)).Q(), true) && q8.w() > ((C2041f) arrayList.get(i8)).f0()) {
                    ((C2041f) arrayList.get(i8)).J0(C2041f.c.f15790a);
                }
            }
        }
        final InterfaceC2072n interfaceC2072n = new InterfaceC2072n() { // from class: n5.B
            @Override // c6.InterfaceC2072n
            public final Object invoke(Object obj, Object obj2) {
                int c02;
                c02 = TvMyAppsFragment.c0((C2041f) obj, (C2041f) obj2);
                return Integer.valueOf(c02);
            }
        };
        AbstractC1435t.B(arrayList, new Comparator() { // from class: n5.C
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int d02;
                d02 = TvMyAppsFragment.d0(InterfaceC2072n.this, obj, obj2);
                return d02;
            }
        });
        Context context = getContext();
        if (context != null) {
            String packageName = context.getPackageName();
            int i9 = 0;
            while (i9 < arrayList.size() && (!n.s(packageName, ((C2041f) arrayList.get(i9)).Q(), true) || ((C2041f) arrayList.get(i9)).c0() != C2041f.c.f15790a)) {
                i9++;
            }
            if (i9 < arrayList.size()) {
                Object remove = arrayList.remove(i9);
                AbstractC3292y.h(remove, "removeAt(...)");
                arrayList.add(0, (C2041f) remove);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b0(C2041f app1, C2041f app2) {
        AbstractC3292y.i(app1, "app1");
        AbstractC3292y.i(app2, "app2");
        if (app1.z() == null) {
            return 1;
        }
        if (app2.z() == null) {
            return -1;
        }
        String z8 = app1.z();
        AbstractC3292y.f(z8);
        String z9 = app2.z();
        AbstractC3292y.f(z9);
        return n.m(z8, z9, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c0(C2041f app1, C2041f app2) {
        AbstractC3292y.i(app1, "app1");
        AbstractC3292y.i(app2, "app2");
        return app1.c0().compareTo(app2.c0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d0(InterfaceC2072n interfaceC2072n, Object obj, Object obj2) {
        return ((Number) interfaceC2072n.invoke(obj, obj2)).intValue();
    }

    private final void e0() {
        VerticalGridPresenter verticalGridPresenter = new VerticalGridPresenter();
        verticalGridPresenter.setNumberOfColumns(this.f31110f);
        setGridPresenter(verticalGridPresenter);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: n5.E
            @Override // java.lang.Runnable
            public final void run() {
                TvMyAppsFragment.f0(TvMyAppsFragment.this);
            }
        }, 500L);
        setOnItemViewClickedListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(TvMyAppsFragment tvMyAppsFragment) {
        tvMyAppsFragment.startEntranceTransition();
    }

    public final void T() {
        X();
    }

    @Override // androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        C3795t c3795t = new C3795t(getContext());
        String simpleName = TvMyAppsFragment.class.getSimpleName();
        AbstractC3292y.h(simpleName, "getSimpleName(...)");
        c3795t.g(simpleName);
        a aVar = new a(new m());
        this.f31106b = aVar;
        setAdapter(aVar);
        FragmentActivity activity = getActivity();
        if (activity != null && (extras = activity.getIntent().getExtras()) != null) {
            if (extras.containsKey("updates")) {
                this.f31108d = extras.getBoolean("updates");
            }
            if (extras.containsKey("rollback")) {
                this.f31109e = extras.getBoolean("rollback");
            }
        }
        if (this.f31108d) {
            setTitle(getString(R.string.updates));
        } else if (this.f31109e) {
            setTitle(getString(R.string.rollback_title));
        } else {
            setTitle(getString(R.string.mis_apps_title));
        }
        if (bundle == null) {
            prepareEntranceTransition();
        }
        e0();
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        X();
    }
}
