package q;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.RecyclerView;
import b8.a;
import c.C1999g;
import c.C2001i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;

/* renamed from: q.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3605l extends a8.a implements a.b {

    /* renamed from: A, reason: collision with root package name */
    public static final a f36574A = new a();

    /* renamed from: B, reason: collision with root package name */
    public static final String f36575B = C3605l.class.getName();

    /* renamed from: m, reason: collision with root package name */
    public TextView f36576m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f36577n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f36578o;

    /* renamed from: p, reason: collision with root package name */
    public Button f36579p;

    /* renamed from: q, reason: collision with root package name */
    public Button f36580q;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f36581r;

    /* renamed from: s, reason: collision with root package name */
    public RecyclerView f36582s;

    /* renamed from: t, reason: collision with root package name */
    public RecyclerView f36583t;

    /* renamed from: u, reason: collision with root package name */
    public FrameLayout f36584u;

    /* renamed from: v, reason: collision with root package name */
    public ConstraintLayout f36585v;

    /* renamed from: w, reason: collision with root package name */
    public View f36586w;

    /* renamed from: x, reason: collision with root package name */
    public View f36587x;

    /* renamed from: y, reason: collision with root package name */
    public View f36588y;

    /* renamed from: z, reason: collision with root package name */
    public C3606m f36589z;

    /* renamed from: q.l$a */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    public static final void l(C3605l this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.dismiss();
    }

    public static final void m(C3605l this$0, String str) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.dismiss();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    public static final void n(final C3605l this$0, View view) {
        RecyclerView.Adapter adapter;
        b8.a aVar;
        ?? r32;
        RecyclerView.Adapter adapter2;
        b8.a aVar2;
        ?? r42;
        RecyclerView.Adapter adapter3;
        b8.a aVar3;
        Q7.a aVar4;
        List list;
        List list2;
        List list3;
        C1999g c1999g;
        AbstractC3292y.i(this$0, "this$0");
        ArrayList arrayList = null;
        arrayList = null;
        if (C2001i.f15173b) {
            Fragment findFragmentByTag = this$0.getChildFragmentManager().findFragmentByTag(C1999g.f15164h);
            if (findFragmentByTag instanceof C1999g) {
                c1999g = (C1999g) findFragmentByTag;
            } else {
                c1999g = null;
            }
            if (c1999g != null) {
                c1999g.h();
            }
        }
        C3606m c3606m = this$0.f36589z;
        if (c3606m == null) {
            AbstractC3292y.y("viewModel");
            c3606m = null;
        }
        RecyclerView recyclerView = this$0.f36581r;
        if (recyclerView == null) {
            adapter = null;
        } else {
            adapter = recyclerView.getAdapter();
        }
        if (adapter instanceof b8.a) {
            aVar = (b8.a) adapter;
        } else {
            aVar = null;
        }
        if (aVar == null || (list3 = aVar.f15084a) == null) {
            r32 = 0;
        } else {
            r32 = new ArrayList(AbstractC1435t.x(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                r32.add(((b8.d) it.next()).f15123b);
            }
        }
        RecyclerView recyclerView2 = this$0.f36582s;
        if (recyclerView2 == null) {
            adapter2 = null;
        } else {
            adapter2 = recyclerView2.getAdapter();
        }
        if (adapter2 instanceof b8.a) {
            aVar2 = (b8.a) adapter2;
        } else {
            aVar2 = null;
        }
        if (aVar2 == null || (list2 = aVar2.f15084a) == null) {
            r42 = 0;
        } else {
            r42 = new ArrayList(AbstractC1435t.x(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                r42.add(((b8.d) it2.next()).f15123b);
            }
        }
        RecyclerView recyclerView3 = this$0.f36583t;
        if (recyclerView3 == null) {
            adapter3 = null;
        } else {
            adapter3 = recyclerView3.getAdapter();
        }
        if (adapter3 instanceof b8.a) {
            aVar3 = (b8.a) adapter3;
        } else {
            aVar3 = null;
        }
        if (aVar3 != null && (list = aVar3.f15084a) != null) {
            arrayList = new ArrayList(AbstractC1435t.x(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(((b8.d) it3.next()).f15123b);
            }
        }
        if (r32 == 0) {
            r32 = AbstractC1435t.m();
        }
        if (r42 == 0) {
            r42 = AbstractC1435t.m();
        }
        List G02 = AbstractC1435t.G0(r32, r42);
        Collection collection = arrayList;
        if (arrayList == null) {
            collection = AbstractC1435t.m();
        }
        List purposeSwitchItemList = AbstractC1435t.G0(G02, collection);
        c3606m.getClass();
        AbstractC3292y.i(purposeSwitchItemList, "purposeSwitchItemList");
        List list4 = c3606m.f36590a.f3253d;
        if (list4 != null) {
            H6.d.f3272a.b(list4, true, new C3607n(c3606m));
        }
        boolean z8 = purposeSwitchItemList instanceof Collection;
        if (!z8 || !purposeSwitchItemList.isEmpty()) {
            Iterator it4 = purposeSwitchItemList.iterator();
            while (it4.hasNext()) {
                if (!AbstractC3292y.d((Boolean) it4.next(), Boolean.FALSE)) {
                    if (!z8 || !purposeSwitchItemList.isEmpty()) {
                        Iterator it5 = purposeSwitchItemList.iterator();
                        while (it5.hasNext()) {
                            if (!AbstractC3292y.d((Boolean) it5.next(), Boolean.TRUE)) {
                                aVar4 = Q7.a.ACCEPT_PARTIAL;
                                break;
                            }
                        }
                    }
                    aVar4 = Q7.a.REJECT;
                    Q7.m.f9074a.a(Q7.n.SAVE_AND_EXIT, aVar4).observe(this$0, new Observer() { // from class: q.k
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj) {
                            C3605l.m(C3605l.this, (String) obj);
                        }
                    });
                }
            }
        }
        aVar4 = Q7.a.ACCEPT_ALL;
        Q7.m.f9074a.a(Q7.n.SAVE_AND_EXIT, aVar4).observe(this$0, new Observer() { // from class: q.k
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C3605l.m(C3605l.this, (String) obj);
            }
        });
    }

    public static final void o(C3605l this$0, String str) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.dismiss();
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void p(final C3605l this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        C3606m c3606m = this$0.f36589z;
        if (c3606m == null) {
            AbstractC3292y.y("viewModel");
            c3606m = null;
        }
        c3606m.a().observe(this$0, new Observer() { // from class: q.j
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C3605l.o(C3605l.this, (String) obj);
            }
        });
    }

    @Override // b8.a.b
    public void b(b8.d itemData) {
        Object obj;
        List list;
        AbstractC3292y.i(itemData, "item");
        C3606m c3606m = this.f36589z;
        H6.e eVar = null;
        Object obj2 = null;
        r1 = null;
        r1 = null;
        H6.f fVar = null;
        Object obj3 = null;
        if (c3606m == null) {
            AbstractC3292y.y("viewModel");
            c3606m = null;
        }
        c3606m.getClass();
        AbstractC3292y.i(itemData, "itemData");
        int ordinal = itemData.f15125d.ordinal();
        if (ordinal != 10) {
            if (ordinal == 11) {
                List list2 = c3606m.f36590a.f3253d;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            Integer num = ((H6.e) obj).f3281a;
                            int b02 = AbstractC1428l.b0(H6.i.f3304c);
                            if (num != null && num.intValue() == b02) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    H6.e eVar2 = (H6.e) obj;
                    if (eVar2 != null && (list = eVar2.f3287g) != null) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            Integer num2 = ((H6.f) next).f3289b;
                            int i8 = itemData.f15122a.f3123a;
                            if (num2 != null && num2.intValue() == i8) {
                                obj2 = next;
                                break;
                            }
                        }
                        fVar = (H6.f) obj2;
                    }
                }
                if (fVar != null) {
                    fVar.f3291d = itemData.f15123b;
                    return;
                }
                return;
            }
            return;
        }
        List list3 = c3606m.f36590a.f3253d;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                Integer num3 = ((H6.e) next2).f3281a;
                int i9 = itemData.f15122a.f3123a;
                if (num3 != null && num3.intValue() == i9) {
                    obj3 = next2;
                    break;
                }
            }
            eVar = (H6.e) obj3;
        }
        if (eVar != null) {
            eVar.f3284d = itemData.f15123b;
        }
    }

    @Override // b8.a.b
    public void e(b8.d item) {
        AbstractC3292y.i(item, "item");
    }

    public final b8.a k(List list) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        S7.c cVar = this.f14156j;
        if (cVar == null) {
            num = null;
        } else {
            num = cVar.f9794i;
        }
        if (cVar == null) {
            num2 = null;
        } else {
            num2 = cVar.f9790e;
        }
        if (cVar == null) {
            num3 = null;
        } else {
            num3 = cVar.f9791f;
        }
        if (cVar == null) {
            num4 = null;
        } else {
            num4 = cVar.f9786a;
        }
        return new b8.a(list, this, null, null, num, num2, num3, num4, null, this.f14158l, 268);
    }

    @Override // a8.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            ViewModelStore viewModelStore = getViewModelStore();
            AbstractC3292y.h(viewModelStore, "viewModelStore");
            C3606m c3606m = (C3606m) new ViewModelProvider(viewModelStore, new C3609p()).get(C3606m.class);
            this.f36589z = c3606m;
            if (c3606m == null) {
                AbstractC3292y.y("viewModel");
                c3606m = null;
            }
            c3606m.b(H6.i.f3303b);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3292y.i(inflater, "inflater");
        View inflate = inflater.inflate(M1.c.f6047e, viewGroup, false);
        AbstractC3292y.h(inflate, "inflater.inflate(R.layou…ptions, container, false)");
        return inflate;
    }

    @Override // a8.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ArrayList arrayList;
        boolean U8;
        Button button;
        AbstractC3292y.i(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = this.f14148b;
        if (textView != null) {
            textView.setText(getString(M1.e.f6071c));
        }
        this.f36576m = (TextView) view.findViewById(M1.b.f5984d1);
        this.f36581r = (RecyclerView) view.findViewById(M1.b.f5963V);
        this.f36577n = (TextView) view.findViewById(M1.b.f5987e1);
        this.f36578o = (TextView) view.findViewById(M1.b.f6025r0);
        this.f36579p = (Button) view.findViewById(M1.b.f6006l);
        this.f36580q = (Button) view.findViewById(M1.b.f5979c);
        this.f36582s = (RecyclerView) view.findViewById(M1.b.f5965W);
        this.f36583t = (RecyclerView) view.findViewById(M1.b.f5951P);
        this.f36584u = (FrameLayout) view.findViewById(M1.b.f6041z);
        this.f36585v = (ConstraintLayout) view.findViewById(M1.b.f5939J);
        this.f36586w = view.findViewById(M1.b.f5949O);
        this.f36587x = view.findViewById(M1.b.f5986e0);
        this.f36588y = view.findViewById(M1.b.f6009m);
        ImageView imageView = this.f14149c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: q.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C3605l.l(C3605l.this, view2);
                }
            });
        }
        C3606m c3606m = this.f36589z;
        if (c3606m == null) {
            AbstractC3292y.y("viewModel");
            c3606m = null;
        }
        List b9 = c3606m.b(H6.i.f3303b);
        if (!((ArrayList) b9).isEmpty()) {
            RecyclerView recyclerView = this.f36581r;
            if (recyclerView != null) {
                recyclerView.setAdapter(k(b9));
            }
            TextView textView2 = this.f36576m;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            RecyclerView recyclerView2 = this.f36581r;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(0);
            }
            View view2 = this.f36586w;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else {
            TextView textView3 = this.f36576m;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            RecyclerView recyclerView3 = this.f36581r;
            if (recyclerView3 != null) {
                recyclerView3.setVisibility(8);
            }
            View view3 = this.f36586w;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        }
        C3606m c3606m2 = this.f36589z;
        if (c3606m2 == null) {
            AbstractC3292y.y("viewModel");
            c3606m2 = null;
        }
        c3606m2.getClass();
        ArrayList arrayList2 = new ArrayList();
        List list = c3606m2.f36590a.f3253d;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : list) {
                Integer num = ((H6.e) obj).f3281a;
                if (num == null) {
                    U8 = false;
                } else {
                    U8 = AbstractC1428l.U(H6.i.f3304c, num.intValue());
                }
                if (U8) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                List<H6.f> list2 = ((H6.e) it.next()).f3287g;
                if (list2 != null) {
                    for (H6.f fVar : list2) {
                        Integer num2 = fVar.f3289b;
                        if (num2 != null) {
                            int intValue = num2.intValue();
                            String str = fVar.f3292e;
                            if (str == null) {
                                str = "";
                            }
                            arrayList2.add(new b8.d(new G6.f(intValue, str), fVar.f3291d, null, b8.e.MSPA_SENSITIVE_PURPOSE, false, null, null, 116));
                        }
                    }
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            RecyclerView recyclerView4 = this.f36582s;
            if (recyclerView4 != null) {
                recyclerView4.setAdapter(k(arrayList2));
            }
            TextView textView4 = this.f36577n;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            RecyclerView recyclerView5 = this.f36582s;
            if (recyclerView5 != null) {
                recyclerView5.setVisibility(0);
            }
            View view4 = this.f36587x;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        } else {
            TextView textView5 = this.f36577n;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            RecyclerView recyclerView6 = this.f36582s;
            if (recyclerView6 != null) {
                recyclerView6.setVisibility(8);
            }
            View view5 = this.f36587x;
            if (view5 != null) {
                view5.setVisibility(8);
            }
        }
        C3606m c3606m3 = this.f36589z;
        if (c3606m3 == null) {
            AbstractC3292y.y("viewModel");
            c3606m3 = null;
        }
        List b10 = c3606m3.b(H6.i.f3305d);
        if (!((ArrayList) b10).isEmpty()) {
            RecyclerView recyclerView7 = this.f36583t;
            if (recyclerView7 != null) {
                recyclerView7.setAdapter(k(b10));
            }
            TextView textView6 = this.f36578o;
            if (textView6 != null) {
                textView6.setVisibility(0);
            }
            RecyclerView recyclerView8 = this.f36583t;
            if (recyclerView8 != null) {
                recyclerView8.setVisibility(0);
            }
            View view6 = this.f36588y;
            if (view6 != null) {
                view6.setVisibility(0);
            }
        } else {
            TextView textView7 = this.f36578o;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            RecyclerView recyclerView9 = this.f36583t;
            if (recyclerView9 != null) {
                recyclerView9.setVisibility(8);
            }
            View view7 = this.f36588y;
            if (view7 != null) {
                view7.setVisibility(8);
            }
        }
        if (C2001i.f15173b) {
            getChildFragmentManager().beginTransaction().add(M1.b.f6041z, new C1999g(), C1999g.f15164h).addToBackStack(null).commit();
            FrameLayout frameLayout = this.f36584u;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else {
            FrameLayout frameLayout2 = this.f36584u;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        q();
        S7.c cVar = this.f14156j;
        if (cVar != null) {
            Integer num3 = cVar.f9792g;
            if (num3 != null) {
                int intValue2 = num3.intValue();
                ConstraintLayout constraintLayout = this.f36585v;
                if (constraintLayout != null) {
                    constraintLayout.setBackgroundColor(intValue2);
                }
            }
            Integer num4 = cVar.f9794i;
            if (num4 != null) {
                int intValue3 = num4.intValue();
                TextView textView8 = this.f36576m;
                if (textView8 != null) {
                    textView8.setTextColor(intValue3);
                }
                TextView textView9 = this.f36577n;
                if (textView9 != null) {
                    textView9.setTextColor(intValue3);
                }
                TextView textView10 = this.f36578o;
                if (textView10 != null) {
                    textView10.setTextColor(intValue3);
                }
            }
            Integer num5 = cVar.f9798m;
            if (num5 != null) {
                int intValue4 = num5.intValue();
                Button button2 = this.f36579p;
                if (button2 != null) {
                    button2.setTextColor(intValue4);
                }
            }
            Integer num6 = cVar.f9800o;
            if (num6 != null) {
                int intValue5 = num6.intValue();
                Button button3 = this.f36579p;
                if (button3 != null) {
                    button3.setBackgroundTintList(ColorStateList.valueOf(intValue5));
                }
            }
        }
        Typeface typeface = this.f14157k;
        if (typeface != null) {
            TextView textView11 = this.f36576m;
            if (textView11 != null) {
                textView11.setTypeface(typeface);
            }
            TextView textView12 = this.f36577n;
            if (textView12 != null) {
                textView12.setTypeface(typeface);
            }
            TextView textView13 = this.f36578o;
            if (textView13 != null) {
                textView13.setTypeface(typeface);
            }
        }
        Typeface typeface2 = this.f14158l;
        if (typeface2 != null && (button = this.f36579p) != null) {
            button.setTypeface(typeface2);
        }
        C3606m c3606m4 = this.f36589z;
        if (c3606m4 == null) {
            AbstractC3292y.y("viewModel");
            c3606m4 = null;
        }
        c3606m4.getClass();
        AbstractC3462k.d(ViewModelKt.getViewModelScope(c3606m4), C3445b0.b(), null, new C3608o(c3606m4, null), 2, null);
    }

    public final void q() {
        Button button = this.f36579p;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: q.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3605l.n(C3605l.this, view);
                }
            });
        }
        Button button2 = this.f36580q;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: q.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3605l.p(C3605l.this, view);
                }
            });
        }
    }
}
