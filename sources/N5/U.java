package n5;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.app.BrowseSupportFragment;
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
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.C3775H;
import q5.C3795t;

/* loaded from: classes5.dex */
public final class U extends VerticalGridSupportFragment implements BrowseSupportFragment.MainFragmentAdapterProvider {

    /* renamed from: f, reason: collision with root package name */
    public static final a f35560f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayObjectAdapter f35561a;

    /* renamed from: b, reason: collision with root package name */
    private C2046k f35562b;

    /* renamed from: c, reason: collision with root package name */
    private int f35563c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f35564d;

    /* renamed from: e, reason: collision with root package name */
    private final BrowseSupportFragment.MainFragmentAdapter f35565e = new f(this);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final U a(C2046k category) {
            AbstractC3292y.i(category, "category");
            U u8 = new U();
            u8.setArguments(category.z());
            return u8;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    private final class b implements OnItemViewClickedListener {
        public b() {
        }

        @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onItemClicked(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
            if ((obj instanceof C2043h) && U.this.getActivity() != null && viewHolder != null) {
                m5.b bVar = (m5.b) U.this.getActivity();
                AbstractC3292y.f(bVar);
                bVar.l((C2043h) obj, viewHolder);
            }
        }
    }

    /* loaded from: classes5.dex */
    private final class c implements OnItemViewSelectedListener {
        public c() {
        }

        @Override // androidx.leanback.widget.BaseOnItemViewSelectedListener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onItemSelected(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
            if (obj != null) {
                ArrayObjectAdapter arrayObjectAdapter = U.this.f35561a;
                AbstractC3292y.f(arrayObjectAdapter);
                int indexOf = arrayObjectAdapter.indexOf(obj);
                if (indexOf < U.this.f35563c && indexOf >= U.this.f35563c - 5 && !U.this.f35564d) {
                    U.this.u();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f35568a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f35570a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ U f35571b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.T f35572c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(U u8, kotlin.jvm.internal.T t8, U5.d dVar) {
                super(2, dVar);
                this.f35571b = u8;
                this.f35572c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f35571b, this.f35572c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f35570a == 0) {
                    Q5.t.b(obj);
                    try {
                        this.f35571b.v((ArrayList) this.f35572c.f34573a);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    this.f35571b.f35564d = false;
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
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
            c5.K k8;
            int i8;
            JSONArray jSONArray;
            Integer num;
            Resources resources;
            Object e8 = V5.b.e();
            int i9 = this.f35568a;
            if (i9 != 0) {
                if (i9 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
                try {
                    U.this.f35564d = true;
                    FragmentActivity requireActivity = U.this.requireActivity();
                    AbstractC3292y.h(requireActivity, "requireActivity(...)");
                    C3775H c3775h = new C3775H(requireActivity);
                    if (U.this.f35562b != null) {
                        C2046k c2046k = U.this.f35562b;
                        AbstractC3292y.f(c2046k);
                        int b9 = c2046k.b();
                        if (b9 != -2) {
                            if (b9 != -1) {
                                C2046k c2046k2 = U.this.f35562b;
                                AbstractC3292y.f(c2046k2);
                                if (c2046k2.s()) {
                                    C2046k c2046k3 = U.this.f35562b;
                                    AbstractC3292y.f(c2046k3);
                                    k8 = c3775h.g0(c2046k3.b(), 75, U.this.f35563c);
                                } else {
                                    C2046k c2046k4 = U.this.f35562b;
                                    AbstractC3292y.f(c2046k4);
                                    k8 = c3775h.c0(c2046k4.b(), 75, U.this.f35563c);
                                }
                            } else {
                                k8 = c3775h.b0(75, U.this.f35563c);
                            }
                        } else {
                            k8 = c3775h.H(75, U.this.f35563c);
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
                            Context context = U.this.getContext();
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
                                    com.squareup.picasso.s.h().l(a9.i0(num.intValue())).d();
                                }
                                U.this.f35563c++;
                            }
                        }
                    }
                } catch (Error e9) {
                    e9.printStackTrace();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                J0 c8 = C3445b0.c();
                a aVar = new a(U.this, t8, null);
                this.f35568a = 1;
                if (AbstractC3458i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f35573a;

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
            int i8 = this.f35573a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                U u8 = U.this;
                this.f35573a = 1;
                if (u8.t(this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public U() {
        VerticalGridPresenter verticalGridPresenter = new VerticalGridPresenter();
        verticalGridPresenter.setNumberOfColumns(5);
        setGridPresenter(verticalGridPresenter);
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new l5.e());
        this.f35561a = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
    }

    private final void r(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setMessage(str);
            builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: n5.T
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    U.s(dialogInterface, i8);
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
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(ArrayList arrayList) {
        if ((arrayList == null || arrayList.isEmpty()) && getContext() != null) {
            String string = getString(R.string.no_data_available);
            AbstractC3292y.h(string, "getString(...)");
            r(string);
        }
        AbstractC3292y.f(arrayList);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ArrayObjectAdapter arrayObjectAdapter = this.f35561a;
            AbstractC3292y.f(arrayObjectAdapter);
            arrayObjectAdapter.add(arrayList.get(i8));
        }
    }

    @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentAdapterProvider
    public BrowseSupportFragment.MainFragmentAdapter getMainFragmentAdapter() {
        return this.f35565e;
    }

    @Override // androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle arguments;
        super.onCreate(bundle);
        C3795t c3795t = new C3795t(getContext());
        String simpleName = U.class.getSimpleName();
        AbstractC3292y.h(simpleName, "getSimpleName(...)");
        c3795t.g(simpleName);
        if (this.f35562b == null && (arguments = getArguments()) != null) {
            C2046k c2046k = new C2046k(0, null, null, 7, null);
            this.f35562b = c2046k;
            AbstractC3292y.f(c2046k);
            c2046k.y(arguments);
        }
        startEntranceTransition();
        setOnItemViewClickedListener(new b());
        setOnItemViewSelectedListener(new c());
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f35563c == 0) {
            u();
        }
    }

    /* loaded from: classes5.dex */
    public static final class f extends BrowseSupportFragment.MainFragmentAdapter {
        f(U u8) {
            super(u8);
        }

        @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentAdapter
        public void setEntranceTransitionState(boolean z8) {
        }
    }
}
