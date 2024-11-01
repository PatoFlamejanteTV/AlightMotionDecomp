package a8;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class i extends a8.a {

    /* renamed from: A */
    public static int f14182A;

    /* renamed from: B */
    public static b8.e f14183B;

    /* renamed from: y */
    public static final a f14184y = new a();

    /* renamed from: z */
    public static final String f14185z;

    /* renamed from: m */
    public ConstraintLayout f14186m;

    /* renamed from: n */
    public TextView f14187n;

    /* renamed from: o */
    public TextView f14188o;

    /* renamed from: p */
    public TextView f14189p;

    /* renamed from: q */
    public TextView f14190q;

    /* renamed from: r */
    public TextView f14191r;

    /* renamed from: s */
    public NestedScrollView f14192s;

    /* renamed from: t */
    public RecyclerView f14193t;

    /* renamed from: u */
    public x5.k f14194u;

    /* renamed from: v */
    public boolean f14195v;

    /* renamed from: w */
    public boolean f14196w;

    /* renamed from: x */
    public String f14197x;

    /* loaded from: classes5.dex */
    public static final class a {
        public static /* synthetic */ i a(a aVar, String str, String str2, String str3, String str4, String str5, int i8, b8.e eVar, boolean z8, G5.j jVar, int i9) {
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            boolean z9;
            G5.j jVar2;
            if ((i9 & 1) != 0) {
                str6 = "";
            } else {
                str6 = str;
            }
            if ((i9 & 2) != 0) {
                str7 = "";
            } else {
                str7 = str2;
            }
            if ((i9 & 4) != 0) {
                str8 = "";
            } else {
                str8 = str3;
            }
            if ((i9 & 8) != 0) {
                str9 = "";
            } else {
                str9 = str4;
            }
            if ((i9 & 16) != 0) {
                str10 = "";
            } else {
                str10 = str5;
            }
            if ((i9 & 128) != 0) {
                z9 = false;
            } else {
                z9 = z8;
            }
            if ((i9 & 256) != 0) {
                jVar2 = G5.j.ALL_VENDORS;
            } else {
                jVar2 = null;
            }
            return aVar.b(str6, str7, str8, str9, str10, i8, eVar, z9, jVar2);
        }

        public final i b(String title, String description, String legalDescription, String legalDescriptionLabel, String closeLabel, int i8, b8.e switchItemType, boolean z8, G5.j vendorTypeSelected) {
            AbstractC3292y.i(title, "title");
            AbstractC3292y.i(description, "description");
            AbstractC3292y.i(legalDescription, "legalDescription");
            AbstractC3292y.i(legalDescriptionLabel, "legalDescriptionLabel");
            AbstractC3292y.i(closeLabel, "closeLabel");
            AbstractC3292y.i(switchItemType, "switchItemType");
            AbstractC3292y.i(vendorTypeSelected, "vendorTypeSelected");
            i iVar = new i();
            Bundle bundle = new Bundle();
            bundle.putString(CampaignEx.JSON_KEY_TITLE, title);
            bundle.putString("description", description);
            bundle.putString("legal_description", legalDescription);
            bundle.putString("legal_description_label", legalDescriptionLabel);
            bundle.putString("close_button_label", closeLabel);
            bundle.putBoolean("legitimate_interest", z8);
            bundle.putString("vendor_type_selected", vendorTypeSelected.name());
            i.f14182A = i8;
            i.f14183B = switchItemType;
            iVar.setArguments(bundle);
            return iVar;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends Dialog {

        /* renamed from: a */
        public final /* synthetic */ i f14198a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, i iVar, int i8) {
            super(context, i8);
            this.f14198a = iVar;
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            i iVar = this.f14198a;
            a aVar = i.f14184y;
            iVar.n();
        }
    }

    static {
        String simpleName = i.class.getSimpleName();
        AbstractC3292y.h(simpleName, "LegalDetailFragment::class.java.simpleName");
        f14185z = simpleName;
    }

    public static final void k(i this$0, View view) {
        G6.e eVar;
        Map map;
        G6.l lVar;
        Integer num;
        Integer num2;
        b8.d a9;
        Map map2;
        b8.d a10;
        Map map3;
        b8.d a11;
        Map map4;
        AbstractC3292y.i(this$0, "this$0");
        NestedScrollView nestedScrollView = this$0.f14192s;
        if (nestedScrollView != null) {
            nestedScrollView.setVisibility(8);
        }
        RecyclerView recyclerView = this$0.f14193t;
        if (recyclerView != null) {
            x5.k kVar = this$0.f14194u;
            if (kVar == null) {
                AbstractC3292y.y("viewModel");
                kVar = null;
            }
            int i8 = f14182A;
            b8.e itemType = f14183B;
            if (itemType == null) {
                AbstractC3292y.y("localSwitchItemType");
                itemType = null;
            }
            boolean z8 = this$0.f14196w;
            String vendorTypeSelected = this$0.f14197x;
            if (vendorTypeSelected == null) {
                vendorTypeSelected = "";
            }
            kVar.getClass();
            AbstractC3292y.i(itemType, "itemType");
            AbstractC3292y.i(vendorTypeSelected, "vendorTypeSelected");
            ArrayList arrayList = new ArrayList();
            int ordinal = itemType.ordinal();
            if (ordinal != 4) {
                if (ordinal != 5) {
                    if (ordinal != 6) {
                        if (ordinal == 7 && (AbstractC3292y.d(vendorTypeSelected, "ALL_VENDORS") || AbstractC3292y.d(vendorTypeSelected, "IAB_VENDORS"))) {
                            G6.e eVar2 = kVar.f41122a.f1414a;
                            if (eVar2 != null && (map4 = eVar2.f3119i) != null) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (Map.Entry entry : map4.entrySet()) {
                                    if (((G6.l) entry.getValue()).f3137k == null) {
                                        linkedHashMap.put(entry.getKey(), entry.getValue());
                                    }
                                }
                                Iterator it = linkedHashMap.entrySet().iterator();
                                while (it.hasNext()) {
                                    G6.l lVar2 = (G6.l) ((Map.Entry) it.next()).getValue();
                                    Iterator it2 = lVar2.f3135i.iterator();
                                    while (it2.hasNext()) {
                                        if (((Number) it2.next()).intValue() == i8) {
                                            arrayList.add(new b8.d(lVar2, null, b8.f.NON_SWITCH, b8.e.PURPOSE_PARTNER, false, lVar2.f3124b, null, 82));
                                        }
                                    }
                                }
                            }
                            G6.l lVar3 = kVar.f41125d;
                            if (lVar3 != null && (a11 = kVar.a(vendorTypeSelected, lVar3.f3135i, i8)) != null) {
                                arrayList.add(a11);
                            }
                        }
                    } else if (AbstractC3292y.d(vendorTypeSelected, "ALL_VENDORS") || AbstractC3292y.d(vendorTypeSelected, "IAB_VENDORS")) {
                        G6.e eVar3 = kVar.f41122a.f1414a;
                        if (eVar3 != null && (map3 = eVar3.f3119i) != null) {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry2 : map3.entrySet()) {
                                if (((G6.l) entry2.getValue()).f3137k == null) {
                                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                                }
                            }
                            Iterator it3 = linkedHashMap2.entrySet().iterator();
                            while (it3.hasNext()) {
                                G6.l lVar4 = (G6.l) ((Map.Entry) it3.next()).getValue();
                                Iterator it4 = lVar4.f3134h.iterator();
                                while (it4.hasNext()) {
                                    if (((Number) it4.next()).intValue() == i8) {
                                        arrayList.add(new b8.d(lVar4, null, b8.f.NON_SWITCH, b8.e.PURPOSE_PARTNER, false, lVar4.f3124b, null, 82));
                                    }
                                }
                            }
                        }
                        G6.l lVar5 = kVar.f41125d;
                        if (lVar5 != null && (a10 = kVar.a(vendorTypeSelected, lVar5.f3134h, i8)) != null) {
                            arrayList.add(a10);
                        }
                    }
                } else if (AbstractC3292y.d(vendorTypeSelected, "ALL_VENDORS") || AbstractC3292y.d(vendorTypeSelected, "IAB_VENDORS")) {
                    G6.e eVar4 = kVar.f41122a.f1414a;
                    if (eVar4 != null && (map2 = eVar4.f3119i) != null) {
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Map.Entry entry3 : map2.entrySet()) {
                            if (((G6.l) entry3.getValue()).f3137k == null) {
                                linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                            }
                        }
                        Iterator it5 = linkedHashMap3.entrySet().iterator();
                        while (it5.hasNext()) {
                            G6.l lVar6 = (G6.l) ((Map.Entry) it5.next()).getValue();
                            Iterator it6 = lVar6.f3133g.iterator();
                            while (it6.hasNext()) {
                                if (((Number) it6.next()).intValue() == i8) {
                                    arrayList.add(new b8.d(lVar6, null, b8.f.NON_SWITCH, b8.e.PURPOSE_PARTNER, false, lVar6.f3124b, null, 82));
                                }
                            }
                        }
                    }
                    G6.l lVar7 = kVar.f41125d;
                    if (lVar7 != null && (a9 = kVar.a(vendorTypeSelected, lVar7.f3133g, i8)) != null) {
                        arrayList.add(a9);
                    }
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                if ((AbstractC3292y.d(vendorTypeSelected, "ALL_VENDORS") || AbstractC3292y.d(vendorTypeSelected, "IAB_VENDORS")) && (eVar = kVar.f41122a.f1414a) != null && (map = eVar.f3119i) != null) {
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    for (Map.Entry entry4 : map.entrySet()) {
                        if (((G6.l) entry4.getValue()).f3137k == null) {
                            linkedHashMap4.put(entry4.getKey(), entry4.getValue());
                        }
                    }
                    Iterator it7 = linkedHashMap4.entrySet().iterator();
                    while (it7.hasNext()) {
                        G6.l lVar8 = (G6.l) ((Map.Entry) it7.next()).getValue();
                        if (z8) {
                            Iterator it8 = lVar8.f3131e.iterator();
                            while (it8.hasNext()) {
                                if (((Number) it8.next()).intValue() == i8) {
                                    arrayList2.add(new b8.d(lVar8, null, b8.f.NON_SWITCH, b8.e.PURPOSE_PARTNER, false, lVar8.f3124b, null, 82));
                                }
                            }
                        } else {
                            Iterator it9 = lVar8.f3130d.iterator();
                            while (it9.hasNext()) {
                                if (((Number) it9.next()).intValue() == i8) {
                                    arrayList2.add(new b8.d(lVar8, null, b8.f.NON_SWITCH, b8.e.PURPOSE_PARTNER, false, lVar8.f3124b, null, 82));
                                }
                            }
                        }
                    }
                }
                if (AbstractC3292y.d(vendorTypeSelected, "ALL_VENDORS") || AbstractC3292y.d(vendorTypeSelected, "NON_IAB_VENDORS")) {
                    for (J6.d dVar : kVar.f41123b.f4498c.f4493a) {
                        if (z8) {
                            Iterator it10 = dVar.f4492g.iterator();
                            while (it10.hasNext()) {
                                if (((Number) it10.next()).intValue() == i8) {
                                    arrayList2.add(new b8.d(dVar.a(), null, b8.f.NON_SWITCH, b8.e.PURPOSE_PARTNER, false, dVar.f4488c, null, 82));
                                }
                            }
                        } else {
                            Iterator it11 = dVar.f4491f.iterator();
                            while (it11.hasNext()) {
                                if (((Number) it11.next()).intValue() == i8) {
                                    arrayList2.add(new b8.d(dVar.a(), null, b8.f.NON_SWITCH, b8.e.PURPOSE_PARTNER, false, dVar.f4488c, null, 82));
                                }
                            }
                        }
                    }
                    if (AbstractC3292y.d(vendorTypeSelected, "ALL_VENDORS") && (lVar = kVar.f41125d) != null) {
                        if (z8) {
                            Iterator it12 = lVar.f3131e.iterator();
                            while (it12.hasNext()) {
                                if (((Number) it12.next()).intValue() == i8) {
                                    arrayList2.add(new b8.d(lVar, null, b8.f.NON_SWITCH, b8.e.PURPOSE_PARTNER, false, lVar.f3124b, null, 82));
                                }
                            }
                        } else {
                            Iterator it13 = lVar.f3130d.iterator();
                            while (it13.hasNext()) {
                                if (((Number) it13.next()).intValue() == i8) {
                                    arrayList2.add(new b8.d(lVar, null, b8.f.NON_SWITCH, b8.e.PURPOSE_PARTNER, false, lVar.f3124b, null, 82));
                                }
                            }
                        }
                    }
                }
                arrayList.addAll(arrayList2);
            }
            j jVar = new j();
            S7.c cVar = this$0.f14156j;
            if (cVar == null) {
                num = null;
            } else {
                num = cVar.f9794i;
            }
            if (cVar == null) {
                num2 = null;
            } else {
                num2 = cVar.f9786a;
            }
            recyclerView.setAdapter(new b8.a(arrayList, jVar, null, null, num, null, null, num2, null, this$0.f14158l, 364));
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setVisibility(0);
        }
        this$0.f14195v = true;
    }

    public static final void m(i this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.n();
    }

    public final void l(View view) {
        this.f14186m = (ConstraintLayout) view.findViewById(M1.b.f5935H);
        this.f14187n = (TextView) view.findViewById(M1.b.f6035w);
        this.f14188o = (TextView) view.findViewById(M1.b.f6033v);
        this.f14189p = (TextView) view.findViewById(M1.b.f6031u);
        this.f14190q = (TextView) view.findViewById(M1.b.f6037x);
        this.f14191r = (TextView) view.findViewById(M1.b.f5990f1);
        this.f14192s = (NestedScrollView) view.findViewById(M1.b.f5977b0);
        this.f14193t = (RecyclerView) view.findViewById(M1.b.f5961U);
        x5.k kVar = this.f14194u;
        if (kVar == null) {
            AbstractC3292y.y("viewModel");
            kVar = null;
        }
        String str = kVar.f41127f.f().f9907p;
        if (str.length() > 0) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new UnderlineSpan(), 0, str.length(), 0);
            TextView textView = this.f14191r;
            if (textView != null) {
                textView.setText(spannableString);
            }
        }
        TextView textView2 = this.f14191r;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: a8.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    i.k(i.this, view2);
                }
            });
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            TextView textView3 = this.f14190q;
            if (textView3 != null) {
                textView3.setText(arguments.getString(CampaignEx.JSON_KEY_TITLE, ""));
            }
            TextView textView4 = this.f14189p;
            if (textView4 != null) {
                textView4.setText(arguments.getString("description", ""));
            }
            TextView textView5 = this.f14188o;
            if (textView5 != null) {
                textView5.setText(arguments.getString("legal_description", ""));
            }
            TextView textView6 = this.f14187n;
            if (textView6 != null) {
                textView6.setText(arguments.getString("legal_description_label", ""));
            }
            this.f14196w = arguments.getBoolean("legitimate_interest", false);
            this.f14197x = arguments.getString("vendor_type_selected", "");
        }
    }

    public final void n() {
        if (this.f14195v) {
            NestedScrollView nestedScrollView = this.f14192s;
            if (nestedScrollView != null) {
                nestedScrollView.setVisibility(0);
            }
            RecyclerView recyclerView = this.f14193t;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            this.f14195v = false;
            return;
        }
        Q7.m mVar = Q7.m.f9074a;
        StringBuilder sb = new StringBuilder();
        b8.e eVar = f14183B;
        if (eVar == null) {
            AbstractC3292y.y("localSwitchItemType");
            eVar = null;
        }
        int ordinal = eVar.ordinal();
        int i8 = 6;
        if (ordinal != 5) {
            if (ordinal != 6) {
                i8 = 7;
                if (ordinal != 7) {
                    i8 = 3;
                }
            } else {
                i8 = 1;
            }
        }
        sb.append(Q7.b.a(i8));
        sb.append("-id:");
        sb.append(f14182A);
        mVar.f("collapseElement", sb.toString());
        dismiss();
    }

    @Override // a8.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelStore viewModelStore = activity.getViewModelStore();
            AbstractC3292y.h(viewModelStore, "it.viewModelStore");
            this.f14194u = (x5.k) new ViewModelProvider(viewModelStore, new x5.l()).get(x5.k.class);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        b bVar;
        Context context = getContext();
        if (context == null) {
            bVar = null;
        } else {
            bVar = new b(context, this, M1.f.f6085a);
        }
        if (bVar == null) {
            Dialog onCreateDialog = super.onCreateDialog(bundle);
            AbstractC3292y.h(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
            return onCreateDialog;
        }
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3292y.i(inflater, "inflater");
        return inflater.inflate(M1.c.f6046d, viewGroup, false);
    }

    @Override // a8.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        String str;
        AbstractC3292y.i(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView2 = this.f14148b;
        x5.k kVar = null;
        if (textView2 != null) {
            b8.e eVar = f14183B;
            if (eVar == null) {
                AbstractC3292y.y("localSwitchItemType");
                eVar = null;
            }
            int ordinal = eVar.ordinal();
            if (ordinal != 4) {
                if (ordinal != 5) {
                    if (ordinal != 6) {
                        x5.k kVar2 = this.f14194u;
                        if (kVar2 == null) {
                            AbstractC3292y.y("viewModel");
                            kVar2 = null;
                        }
                        str = kVar2.f41127f.f().f9895d;
                    } else {
                        x5.k kVar3 = this.f14194u;
                        if (kVar3 == null) {
                            AbstractC3292y.y("viewModel");
                            kVar3 = null;
                        }
                        str = kVar3.f41127f.f().f9897f;
                    }
                } else {
                    x5.k kVar4 = this.f14194u;
                    if (kVar4 == null) {
                        AbstractC3292y.y("viewModel");
                        kVar4 = null;
                    }
                    str = kVar4.f41127f.f().f9897f;
                }
            } else {
                x5.k kVar5 = this.f14194u;
                if (kVar5 == null) {
                    AbstractC3292y.y("viewModel");
                    kVar5 = null;
                }
                str = kVar5.f41127f.f().f9895d;
            }
            textView2.setText(str);
        }
        ImageView imageView = this.f14149c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: a8.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    i.m(i.this, view2);
                }
            });
            x5.k kVar6 = this.f14194u;
            if (kVar6 == null) {
                AbstractC3292y.y("viewModel");
            } else {
                kVar = kVar6;
            }
            imageView.setContentDescription(kVar.f41127f.f().f9906o);
        }
        l(view);
        S7.c cVar = this.f14156j;
        if (cVar != null) {
            Integer num = cVar.f9794i;
            if (num != null) {
                int intValue = num.intValue();
                TextView textView3 = this.f14190q;
                if (textView3 != null) {
                    textView3.setTextColor(intValue);
                }
                TextView textView4 = this.f14189p;
                if (textView4 != null) {
                    textView4.setTextColor(intValue);
                }
                TextView textView5 = this.f14188o;
                if (textView5 != null) {
                    textView5.setTextColor(intValue);
                }
                TextView textView6 = this.f14187n;
                if (textView6 != null) {
                    textView6.setTextColor(intValue);
                }
            }
            Integer num2 = cVar.f9797l;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                TextView textView7 = this.f14191r;
                if (textView7 != null) {
                    textView7.setTextColor(intValue2);
                }
            }
            Integer num3 = cVar.f9792g;
            if (num3 != null) {
                int intValue3 = num3.intValue();
                ConstraintLayout constraintLayout = this.f14186m;
                if (constraintLayout != null) {
                    constraintLayout.setBackgroundColor(intValue3);
                }
            }
        }
        Typeface typeface = this.f14157k;
        if (typeface != null && (textView = this.f14190q) != null) {
            textView.setTypeface(typeface);
        }
        Typeface typeface2 = this.f14158l;
        if (typeface2 != null) {
            TextView textView8 = this.f14191r;
            if (textView8 != null) {
                textView8.setTypeface(typeface2);
            }
            TextView textView9 = this.f14189p;
            if (textView9 != null) {
                textView9.setTypeface(typeface2);
            }
            TextView textView10 = this.f14188o;
            if (textView10 != null) {
                textView10.setTypeface(typeface2);
            }
            TextView textView11 = this.f14187n;
            if (textView11 != null) {
                textView11.setTypeface(typeface2);
            }
        }
    }
}
