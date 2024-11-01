package com.uptodown.tv.ui.fragment;

import Q5.I;
import Q5.t;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.app.VerticalGridSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.OnItemViewSelectedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;
import androidx.leanback.widget.VerticalGridPresenter;
import androidx.lifecycle.LifecycleOwnerKt;
import c5.C2043h;
import c5.C2046k;
import c5.K;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.squareup.picasso.s;
import com.uptodown.R;
import com.uptodown.tv.ui.fragment.TvAppsListFragment;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.T;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import n6.M;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.C3775H;
import q5.C3795t;

/* loaded from: classes5.dex */
public final class TvAppsListFragment extends VerticalGridSupportFragment {

    /* renamed from: e, reason: collision with root package name */
    public static final a f31091e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayObjectAdapter f31092a;

    /* renamed from: b, reason: collision with root package name */
    private C2046k f31093b;

    /* renamed from: c, reason: collision with root package name */
    private int f31094c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f31095d;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class b implements OnItemViewClickedListener {
        public b() {
        }

        @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onItemClicked(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
            if ((obj instanceof C2043h) && TvAppsListFragment.this.getActivity() != null && viewHolder != null) {
                m5.b bVar = (m5.b) TvAppsListFragment.this.getActivity();
                AbstractC3292y.f(bVar);
                bVar.l((C2043h) obj, viewHolder);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class c implements OnItemViewSelectedListener {
        public c() {
        }

        @Override // androidx.leanback.widget.BaseOnItemViewSelectedListener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onItemSelected(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
            if (obj != null) {
                ArrayObjectAdapter arrayObjectAdapter = TvAppsListFragment.this.f31092a;
                AbstractC3292y.f(arrayObjectAdapter);
                int indexOf = arrayObjectAdapter.indexOf(obj);
                if (indexOf < TvAppsListFragment.this.f31094c && indexOf >= TvAppsListFragment.this.f31094c - 5 && !TvAppsListFragment.this.f31095d) {
                    TvAppsListFragment.this.u();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31098a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f31100a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvAppsListFragment f31101b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f31102c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvAppsListFragment tvAppsListFragment, T t8, U5.d dVar) {
                super(2, dVar);
                this.f31101b = tvAppsListFragment;
                this.f31102c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f31101b, this.f31102c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f31100a == 0) {
                    t.b(obj);
                    try {
                        this.f31101b.v((ArrayList) this.f31102c.f34573a);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    this.f31101b.f31095d = false;
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        d(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            K k8;
            int i8;
            JSONArray jSONArray;
            Integer num;
            Resources resources;
            Object e8 = V5.b.e();
            int i9 = this.f31098a;
            if (i9 != 0) {
                if (i9 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                try {
                    TvAppsListFragment.this.f31095d = true;
                    FragmentActivity requireActivity = TvAppsListFragment.this.requireActivity();
                    AbstractC3292y.h(requireActivity, "requireActivity(...)");
                    C3775H c3775h = new C3775H(requireActivity);
                    if (TvAppsListFragment.this.f31093b != null) {
                        C2046k c2046k = TvAppsListFragment.this.f31093b;
                        AbstractC3292y.f(c2046k);
                        int b9 = c2046k.b();
                        if (b9 != -2) {
                            if (b9 != -1) {
                                C2046k c2046k2 = TvAppsListFragment.this.f31093b;
                                AbstractC3292y.f(c2046k2);
                                if (c2046k2.s()) {
                                    C2046k c2046k3 = TvAppsListFragment.this.f31093b;
                                    AbstractC3292y.f(c2046k3);
                                    k8 = c3775h.g0(c2046k3.b(), 75, TvAppsListFragment.this.f31094c);
                                } else {
                                    C2046k c2046k4 = TvAppsListFragment.this.f31093b;
                                    AbstractC3292y.f(c2046k4);
                                    k8 = c3775h.c0(c2046k4.b(), 75, TvAppsListFragment.this.f31094c);
                                }
                            } else {
                                k8 = c3775h.b0(75, TvAppsListFragment.this.f31094c);
                            }
                        } else {
                            k8 = c3775h.H(75, TvAppsListFragment.this.f31094c);
                        }
                    } else {
                        k8 = null;
                    }
                    if (k8 != null && !k8.b() && k8.d() != null) {
                        String d8 = k8.d();
                        AbstractC3292y.f(d8);
                        JSONObject jSONObject = new JSONObject(d8);
                        if (!jSONObject.isNull("success")) {
                            i8 = jSONObject.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                        } else {
                            jSONArray = null;
                        }
                        if (i8 == 1 && jSONArray != null) {
                            t8.f34573a = new ArrayList();
                            Context context = TvAppsListFragment.this.getContext();
                            if (context != null && (resources = context.getResources()) != null) {
                                num = kotlin.coroutines.jvm.internal.b.c(resources.getDimensionPixelSize(R.dimen.tv_card_height));
                            } else {
                                num = null;
                            }
                            int length = jSONArray.length();
                            for (int i10 = 0; i10 < length; i10++) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                                C2043h.b bVar = C2043h.f15796F0;
                                AbstractC3292y.f(jSONObject2);
                                C2043h a9 = bVar.a(jSONObject2);
                                ((ArrayList) t8.f34573a).add(a9);
                                if (num != null) {
                                    s.h().l(a9.i0(num.intValue())).d();
                                }
                                TvAppsListFragment.this.f31094c++;
                            }
                        }
                    }
                } catch (Error e9) {
                    e9.printStackTrace();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                J0 c8 = C3445b0.c();
                a aVar = new a(TvAppsListFragment.this, t8, null);
                this.f31098a = 1;
                if (AbstractC3458i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31103a;

        e(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f31103a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvAppsListFragment tvAppsListFragment = TvAppsListFragment.this;
                this.f31103a = 1;
                if (tvAppsListFragment.t(this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    private final void r(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setMessage(str);
            builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: n5.j
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    TvAppsListFragment.s(dialogInterface, i8);
                }
            });
            builder.setCancelable(true);
            builder.create().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(DialogInterface dialogInterface, int i8) {
        AbstractC3292y.i(dialogInterface, "dialogInterface");
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new d(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                ArrayObjectAdapter arrayObjectAdapter = this.f31092a;
                AbstractC3292y.f(arrayObjectAdapter);
                arrayObjectAdapter.add(arrayList.get(i8));
            }
            return;
        }
        String string = getString(R.string.no_data_available);
        AbstractC3292y.h(string, "getString(...)");
        r(string);
    }

    private final void w() {
        VerticalGridPresenter verticalGridPresenter = new VerticalGridPresenter();
        verticalGridPresenter.setNumberOfColumns(5);
        setGridPresenter(verticalGridPresenter);
        startEntranceTransition();
        setOnItemViewClickedListener(new b());
        setOnItemViewSelectedListener(new c());
    }

    @Override // androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        CharSequence charSequence;
        Bundle extras;
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        C3795t c3795t = new C3795t(getContext());
        String simpleName = TvAppsListFragment.class.getSimpleName();
        AbstractC3292y.h(simpleName, "getSimpleName(...)");
        c3795t.g(simpleName);
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new l5.e());
        this.f31092a = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
        FragmentActivity activity = getActivity();
        if (activity != null && (extras = activity.getIntent().getExtras()) != null && extras.containsKey("category")) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = extras.getParcelable("category", C2046k.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                parcelable = extras.getParcelable("category");
            }
            this.f31093b = (C2046k) parcelable;
        }
        C2046k c2046k = this.f31093b;
        if (c2046k != null) {
            charSequence = c2046k.h();
        } else {
            charSequence = null;
        }
        setTitle(charSequence);
        if (bundle == null) {
            prepareEntranceTransition();
        }
        w();
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        u();
    }
}
