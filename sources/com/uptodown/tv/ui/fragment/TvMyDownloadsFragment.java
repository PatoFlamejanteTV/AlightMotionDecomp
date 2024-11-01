package com.uptodown.tv.ui.fragment;

import Q5.I;
import Q5.t;
import S4.r;
import S4.x;
import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.ComposerKt;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.app.BrowseSupportFragment;
import androidx.leanback.app.VerticalGridSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;
import androidx.leanback.widget.VerticalGridPresenter;
import androidx.lifecycle.LifecycleOwnerKt;
import c6.InterfaceC2072n;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.tv.ui.fragment.TvMyDownloadsFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import n6.M;
import q5.C3791p;
import q5.C3794s;
import q5.C3795t;
import q5.C3800y;

/* loaded from: classes5.dex */
public final class TvMyDownloadsFragment extends VerticalGridSupportFragment implements BrowseSupportFragment.MainFragmentAdapterProvider {

    /* renamed from: e, reason: collision with root package name */
    public static final a f31123e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private ArrayObjectAdapter f31124a;

    /* renamed from: b, reason: collision with root package name */
    private AlertDialog f31125b;

    /* renamed from: c, reason: collision with root package name */
    private final BrowseSupportFragment.MainFragmentAdapter f31126c = new d(this);

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f31127d = new ArrayList();

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
            if (obj instanceof File) {
                TvMyDownloadsFragment.this.o((File) obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31129a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f31131a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvMyDownloadsFragment f31132b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvMyDownloadsFragment tvMyDownloadsFragment, U5.d dVar) {
                super(2, dVar);
                this.f31132b = tvMyDownloadsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f31132b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f31131a == 0) {
                    t.b(obj);
                    if (this.f31132b.f31127d != null) {
                        this.f31132b.r();
                    }
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        c(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f31129a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                try {
                    ArrayList arrayList = new ArrayList();
                    if (TvMyDownloadsFragment.this.getContext() != null) {
                        C3794s c3794s = new C3794s();
                        Context requireContext = TvMyDownloadsFragment.this.requireContext();
                        AbstractC3292y.h(requireContext, "requireContext(...)");
                        ArrayList d8 = c3794s.d(requireContext);
                        C3794s c3794s2 = new C3794s();
                        Context requireContext2 = TvMyDownloadsFragment.this.requireContext();
                        AbstractC3292y.h(requireContext2, "requireContext(...)");
                        d8.addAll(c3794s2.a(requireContext2));
                        PackageManager packageManager = TvMyDownloadsFragment.this.requireContext().getPackageManager();
                        Iterator it = d8.iterator();
                        AbstractC3292y.h(it, "iterator(...)");
                        while (it.hasNext()) {
                            Object next = it.next();
                            AbstractC3292y.h(next, "next(...)");
                            File file = (File) next;
                            String name = file.getName();
                            AbstractC3292y.h(name, "getName(...)");
                            boolean z8 = false;
                            if (n.r(name, ".apk", false, 2, null)) {
                                AbstractC3292y.f(packageManager);
                                String absolutePath = file.getAbsolutePath();
                                AbstractC3292y.h(absolutePath, "getAbsolutePath(...)");
                                PackageInfo c8 = r.c(packageManager, absolutePath, 128);
                                if (c8 != null) {
                                    try {
                                        Bundle bundle = c8.applicationInfo.metaData;
                                        if (bundle != null && bundle.containsKey("com.android.vending.splits.required")) {
                                            Object obj2 = c8.applicationInfo.metaData.get("com.android.vending.splits.required");
                                            AbstractC3292y.g(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                            z8 = ((Boolean) obj2).booleanValue();
                                        }
                                    } catch (Exception e9) {
                                        e9.printStackTrace();
                                    }
                                    if (!z8) {
                                        arrayList.add(file);
                                    }
                                } else {
                                    String name2 = file.getName();
                                    AbstractC3292y.h(name2, "getName(...)");
                                    if (!n.B(name2, "split_config", false, 2, null)) {
                                        arrayList.add(file);
                                    }
                                }
                            } else {
                                x.a aVar = x.f9510b;
                                String name3 = file.getName();
                                AbstractC3292y.h(name3, "getName(...)");
                                if (aVar.a(name3)) {
                                    arrayList.add(file);
                                }
                            }
                        }
                        TvMyDownloadsFragment.this.f31127d = arrayList;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                J0 c9 = C3445b0.c();
                a aVar2 = new a(TvMyDownloadsFragment.this, null);
                this.f31129a = 1;
                if (AbstractC3458i.g(c9, aVar2, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends BrowseSupportFragment.MainFragmentAdapter {
        d(TvMyDownloadsFragment tvMyDownloadsFragment) {
            super(tvMyDownloadsFragment);
        }

        @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentAdapter
        public void setEntranceTransitionState(boolean z8) {
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f31133a;

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
            int i8 = this.f31133a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvMyDownloadsFragment tvMyDownloadsFragment = TvMyDownloadsFragment.this;
                this.f31133a = 1;
                if (tvMyDownloadsFragment.s(this) == e8) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(final File file) {
        AlertDialog alertDialog = this.f31125b;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (getActivity() != null && !requireActivity().isFinishing() && file != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            LayoutInflater layoutInflater = getLayoutInflater();
            AbstractC3292y.h(layoutInflater, "getLayoutInflater(...)");
            View inflate = layoutInflater.inflate(R.layout.tv_apk_clicked_dialog, (ViewGroup) null, false);
            ((TextView) inflate.findViewById(R.id.tv_install)).setOnClickListener(new View.OnClickListener() { // from class: n5.K
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TvMyDownloadsFragment.p(TvMyDownloadsFragment.this, file, view);
                }
            });
            ((TextView) inflate.findViewById(R.id.tv_delete)).setOnClickListener(new View.OnClickListener() { // from class: n5.L
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TvMyDownloadsFragment.q(file, this, view);
                }
            });
            builder.setView(inflate);
            AlertDialog create = builder.create();
            this.f31125b = create;
            if (create != null) {
                create.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(TvMyDownloadsFragment tvMyDownloadsFragment, File file, View view) {
        C3791p.a aVar = C3791p.f37286s;
        Context requireContext = tvMyDownloadsFragment.requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        C3791p a9 = aVar.a(requireContext);
        a9.a();
        String name = file.getName();
        AbstractC3292y.h(name, "getName(...)");
        c5.r Y8 = a9.Y(name);
        a9.i();
        if (Y8 == null || Y8.Z() <= 0 || Y8.Z() >= 100) {
            UptodownApp.a aVar2 = UptodownApp.f29249C;
            FragmentActivity requireActivity = tvMyDownloadsFragment.requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            UptodownApp.a.Z(aVar2, file, requireActivity, null, 4, null);
        }
        AlertDialog alertDialog = tvMyDownloadsFragment.f31125b;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(File file, TvMyDownloadsFragment tvMyDownloadsFragment, View view) {
        if (file.delete()) {
            C3791p.a aVar = C3791p.f37286s;
            Context requireContext = tvMyDownloadsFragment.requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            C3791p a9 = aVar.a(requireContext);
            a9.a();
            String name = file.getName();
            AbstractC3292y.h(name, "getName(...)");
            a9.B(name);
            a9.i();
            ArrayObjectAdapter arrayObjectAdapter = tvMyDownloadsFragment.f31124a;
            AbstractC3292y.f(arrayObjectAdapter);
            arrayObjectAdapter.remove(file);
        }
        AlertDialog alertDialog = tvMyDownloadsFragment.f31125b;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        ArrayObjectAdapter arrayObjectAdapter = this.f31124a;
        AbstractC3292y.f(arrayObjectAdapter);
        arrayObjectAdapter.clear();
        ArrayList arrayList = this.f31127d;
        AbstractC3292y.f(arrayList);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ArrayObjectAdapter arrayObjectAdapter2 = this.f31124a;
            AbstractC3292y.f(arrayObjectAdapter2);
            ArrayList arrayList2 = this.f31127d;
            AbstractC3292y.f(arrayList2);
            arrayObjectAdapter2.add(arrayList2.get(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new c(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    private final void t() {
        VerticalGridPresenter verticalGridPresenter = new VerticalGridPresenter();
        verticalGridPresenter.setNumberOfColumns(2);
        setGridPresenter(verticalGridPresenter);
        startEntranceTransition();
        setOnItemViewClickedListener(new b());
    }

    @Override // androidx.leanback.app.BrowseSupportFragment.MainFragmentAdapterProvider
    public BrowseSupportFragment.MainFragmentAdapter getMainFragmentAdapter() {
        return this.f31126c;
    }

    @Override // androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3795t c3795t = new C3795t(getContext());
        String simpleName = TvMyDownloadsFragment.class.getSimpleName();
        AbstractC3292y.h(simpleName, "getSimpleName(...)");
        c3795t.g(simpleName);
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new l5.n());
        this.f31124a = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
        setTitle(getString(R.string.downloads_title));
        if (bundle == null) {
            prepareEntranceTransition();
        }
        t();
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onPause() {
        try {
            C3791p.a aVar = C3791p.f37286s;
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            C3791p a9 = aVar.a(requireContext);
            a9.a();
            a9.g1();
            a9.i();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        super.onPause();
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Context context = getContext();
        if (context != null) {
            C3800y.f37330a.g(context);
        }
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null), 3, null);
    }

    public final void u(int i8) {
        switch (i8) {
            case ComposerKt.providerKey /* 201 */:
                ArrayObjectAdapter arrayObjectAdapter = this.f31124a;
                AbstractC3292y.f(arrayObjectAdapter);
                ArrayObjectAdapter arrayObjectAdapter2 = this.f31124a;
                AbstractC3292y.f(arrayObjectAdapter2);
                arrayObjectAdapter.notifyArrayItemRangeChanged(0, arrayObjectAdapter2.size());
                return;
            case ComposerKt.compositionLocalMapKey /* 202 */:
            case ComposerKt.providerValuesKey /* 203 */:
                ArrayObjectAdapter arrayObjectAdapter3 = this.f31124a;
                AbstractC3292y.f(arrayObjectAdapter3);
                ArrayObjectAdapter arrayObjectAdapter4 = this.f31124a;
                AbstractC3292y.f(arrayObjectAdapter4);
                arrayObjectAdapter3.notifyArrayItemRangeChanged(0, arrayObjectAdapter4.size());
                return;
            default:
                return;
        }
    }
}
