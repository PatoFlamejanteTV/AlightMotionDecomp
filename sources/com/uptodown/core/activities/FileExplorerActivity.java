package com.uptodown.core.activities;

import J4.e;
import J4.h;
import J4.i;
import J4.j;
import K4.a1;
import M4.b;
import O4.c;
import O4.f;
import O4.g;
import Q5.t;
import R5.AbstractC1435t;
import S4.v;
import S4.y;
import T5.a;
import U5.d;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.view.ViewGroupKt;
import androidx.documentfile.provider.DocumentFile;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c6.InterfaceC2072n;
import com.google.android.material.tabs.TabLayout;
import com.uptodown.core.activities.FileExplorerActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import l6.n;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.InterfaceC3488x0;
import n6.J0;

/* loaded from: classes5.dex */
public final class FileExplorerActivity extends a1 {

    /* renamed from: C0, reason: collision with root package name */
    public static final C2706a f30677C0 = new C2706a(null);

    /* renamed from: A, reason: collision with root package name */
    private LinearLayout f30678A;

    /* renamed from: B, reason: collision with root package name */
    private LinearLayout f30680B;

    /* renamed from: B0, reason: collision with root package name */
    private ActivityResultLauncher f30681B0;

    /* renamed from: C, reason: collision with root package name */
    private LinearLayout f30682C;

    /* renamed from: D, reason: collision with root package name */
    private HorizontalScrollView f30683D;

    /* renamed from: E, reason: collision with root package name */
    private TextView f30684E;

    /* renamed from: F, reason: collision with root package name */
    private TextView f30685F;

    /* renamed from: G, reason: collision with root package name */
    private TextView f30686G;

    /* renamed from: H, reason: collision with root package name */
    private SearchView f30687H;

    /* renamed from: I, reason: collision with root package name */
    private ImageView f30688I;

    /* renamed from: J, reason: collision with root package name */
    private RelativeLayout f30689J;

    /* renamed from: K, reason: collision with root package name */
    private RadioButton f30690K;

    /* renamed from: L, reason: collision with root package name */
    private RadioButton f30691L;

    /* renamed from: M, reason: collision with root package name */
    private RadioButton f30692M;

    /* renamed from: N, reason: collision with root package name */
    private AlertDialog f30693N;

    /* renamed from: O, reason: collision with root package name */
    private Toolbar f30694O;

    /* renamed from: P, reason: collision with root package name */
    private TextView f30695P;

    /* renamed from: Q, reason: collision with root package name */
    private b f30696Q;

    /* renamed from: R, reason: collision with root package name */
    private ArrayList f30697R;

    /* renamed from: S, reason: collision with root package name */
    private ArrayList f30698S;

    /* renamed from: T, reason: collision with root package name */
    private DocumentFile f30699T;

    /* renamed from: U, reason: collision with root package name */
    private ArrayList f30700U;

    /* renamed from: V, reason: collision with root package name */
    private ArrayList f30701V;

    /* renamed from: W, reason: collision with root package name */
    private ArrayList f30702W;

    /* renamed from: X, reason: collision with root package name */
    private File f30703X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f30704Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f30705Z;

    /* renamed from: p0, reason: collision with root package name */
    private Object f30706p0;

    /* renamed from: q0, reason: collision with root package name */
    private ArrayList f30707q0;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f30708r0;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f30709s0;

    /* renamed from: t0, reason: collision with root package name */
    private TabLayout f30710t0;

    /* renamed from: u0, reason: collision with root package name */
    private TextView f30711u0;

    /* renamed from: v0, reason: collision with root package name */
    private Uri f30712v0;

    /* renamed from: w, reason: collision with root package name */
    private TextView f30713w;

    /* renamed from: w0, reason: collision with root package name */
    private String f30714w0;

    /* renamed from: x, reason: collision with root package name */
    private RecyclerView f30715x;

    /* renamed from: y, reason: collision with root package name */
    private RelativeLayout f30717y;

    /* renamed from: z, reason: collision with root package name */
    private RelativeLayout f30719z;

    /* renamed from: x0, reason: collision with root package name */
    private C f30716x0 = new C();

    /* renamed from: y0, reason: collision with root package name */
    private final C2711f f30718y0 = new C2711f();

    /* renamed from: z0, reason: collision with root package name */
    private final G f30720z0 = new G();

    /* renamed from: A0, reason: collision with root package name */
    private final E f30679A0 = new E();

    /* loaded from: classes5.dex */
    public static final class A implements f {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f30722b;

        A(File file) {
            this.f30722b = file;
        }

        @Override // O4.f
        public void a() {
            i.f(new i(FileExplorerActivity.this), this.f30722b, null, false, 6, null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class B implements f {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ DocumentFile f30724b;

        B(DocumentFile documentFile) {
            this.f30724b = documentFile;
        }

        @Override // O4.f
        public void a() {
            i iVar = new i(FileExplorerActivity.this);
            Uri uri = this.f30724b.getUri();
            AbstractC3292y.h(uri, "documentFile.uri");
            i.e(iVar, uri, null, false, false, 14, null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class C implements g {
        C() {
        }

        @Override // O4.g
        public void a(Object item, int i8) {
            AbstractC3292y.i(item, "item");
            b bVar = FileExplorerActivity.this.f30696Q;
            if (bVar != null && bVar.c()) {
                b bVar2 = FileExplorerActivity.this.f30696Q;
                AbstractC3292y.f(bVar2);
                bVar2.h(i8);
                FileExplorerActivity.this.X4();
                return;
            }
            if (item instanceof File) {
                File file = (File) item;
                if (file.isDirectory()) {
                    FileExplorerActivity.this.f30703X = file;
                    FileExplorerActivity.this.f30699T = null;
                    FileExplorerActivity.m4(FileExplorerActivity.this, false, 1, null);
                    return;
                }
                S4.f fVar = new S4.f();
                String name = file.getName();
                AbstractC3292y.h(name, "item.name");
                if (fVar.o(name)) {
                    FileExplorerActivity.this.j4(file);
                    return;
                }
                String name2 = file.getName();
                AbstractC3292y.h(name2, "item.name");
                if (n.r(name2, ".zip", false, 2, null)) {
                    FileExplorerActivity.this.b4(item);
                    return;
                } else {
                    FileExplorerActivity.this.K4(file);
                    return;
                }
            }
            if (item instanceof DocumentFile) {
                DocumentFile documentFile = (DocumentFile) item;
                if (documentFile.isDirectory()) {
                    FileExplorerActivity.this.f30699T = documentFile;
                    FileExplorerActivity.this.f30703X = null;
                    FileExplorerActivity.m4(FileExplorerActivity.this, false, 1, null);
                    return;
                }
                if (documentFile.getName() != null) {
                    S4.f fVar2 = new S4.f();
                    String name3 = documentFile.getName();
                    AbstractC3292y.f(name3);
                    if (fVar2.o(name3)) {
                        FileExplorerActivity.this.i4(documentFile);
                        return;
                    }
                }
                if (documentFile.getName() != null) {
                    String name4 = documentFile.getName();
                    AbstractC3292y.f(name4);
                    if (n.r(name4, ".zip", false, 2, null)) {
                        FileExplorerActivity.this.b4(item);
                        return;
                    }
                }
                FileExplorerActivity.this.J4(documentFile);
            }
        }

        @Override // O4.g
        public void b(Object item, int i8) {
            AbstractC3292y.i(item, "item");
            b bVar = FileExplorerActivity.this.f30696Q;
            AbstractC3292y.f(bVar);
            if (bVar.c()) {
                b bVar2 = FileExplorerActivity.this.f30696Q;
                AbstractC3292y.f(bVar2);
                bVar2.h(i8);
                FileExplorerActivity.this.X4();
                return;
            }
            FileExplorerActivity.this.E3(item, i8);
        }
    }

    /* loaded from: classes5.dex */
    public static final class D implements O4.i {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30727b;

        D(String str) {
            this.f30727b = str;
        }

        @Override // O4.i
        public void a(ArrayList items) {
            AbstractC3292y.i(items, "items");
            FileExplorerActivity.this.f30698S = items;
            FileExplorerActivity.this.f30697R = items;
            FileExplorerActivity.this.f30702W = null;
            FileExplorerActivity.this.f30701V = null;
            FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
            SearchView searchView = fileExplorerActivity.f30687H;
            AbstractC3292y.f(searchView);
            fileExplorerActivity.r3(searchView.getQuery().toString(), this.f30727b);
        }

        @Override // O4.i
        public void b(ArrayList items) {
            AbstractC3292y.i(items, "items");
            FileExplorerActivity.this.f30702W = items;
            FileExplorerActivity.this.f30701V = items;
            FileExplorerActivity.this.f30698S = null;
            FileExplorerActivity.this.f30697R = null;
            if (FileExplorerActivity.this.f30703X != null) {
                File file = FileExplorerActivity.this.f30703X;
                AbstractC3292y.f(file);
                if (!file.canRead()) {
                    ArrayList arrayList = FileExplorerActivity.this.f30702W;
                    AbstractC3292y.f(arrayList);
                    if (arrayList.isEmpty()) {
                        File externalStorageDirectory = Environment.getExternalStorageDirectory();
                        File file2 = FileExplorerActivity.this.f30703X;
                        AbstractC3292y.f(file2);
                        if (file2.getAbsolutePath().equals(externalStorageDirectory.getAbsolutePath() + "/Android/data")) {
                            File file3 = new File(FileExplorerActivity.this.f30703X, FileExplorerActivity.this.getPackageName());
                            if (file3.exists() && file3.canRead()) {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(new File(FileExplorerActivity.this.f30703X, FileExplorerActivity.this.getPackageName()));
                                FileExplorerActivity.this.f30702W = arrayList2;
                                FileExplorerActivity.this.f30701V = arrayList2;
                            }
                        }
                    }
                }
            }
            FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
            SearchView searchView = fileExplorerActivity.f30687H;
            AbstractC3292y.f(searchView);
            fileExplorerActivity.r3(searchView.getQuery().toString(), this.f30727b);
        }
    }

    /* loaded from: classes5.dex */
    public static final class E extends OnBackPressedCallback {
        E() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            b bVar = FileExplorerActivity.this.f30696Q;
            if (bVar != null && bVar.c()) {
                b bVar2 = FileExplorerActivity.this.f30696Q;
                AbstractC3292y.f(bVar2);
                bVar2.i(false);
                FileExplorerActivity.this.h4();
                return;
            }
            if (FileExplorerActivity.this.f30699T != null) {
                DocumentFile documentFile = FileExplorerActivity.this.f30699T;
                AbstractC3292y.f(documentFile);
                String name = documentFile.getName();
                DocumentFile documentFile2 = FileExplorerActivity.this.f30699T;
                AbstractC3292y.f(documentFile2);
                DocumentFile parentFile = documentFile2.getParentFile();
                if (parentFile != null) {
                    FileExplorerActivity.this.f30699T = parentFile;
                    FileExplorerActivity.this.f30703X = null;
                    FileExplorerActivity.this.P4();
                    FileExplorerActivity.this.k4(name);
                    SearchView searchView = FileExplorerActivity.this.f30687H;
                    if (searchView != null) {
                        FileExplorerActivity.this.v3(searchView);
                        return;
                    }
                    return;
                }
                FileExplorerActivity.this.finish();
                return;
            }
            if (FileExplorerActivity.this.f30703X != null && !AbstractC3292y.d(FileExplorerActivity.this.f30703X, Environment.getExternalStorageDirectory())) {
                File file = FileExplorerActivity.this.f30703X;
                AbstractC3292y.f(file);
                String name2 = file.getName();
                File file2 = FileExplorerActivity.this.f30703X;
                AbstractC3292y.f(file2);
                File parentFile2 = file2.getParentFile();
                if (parentFile2 != null) {
                    FileExplorerActivity.this.f30703X = parentFile2;
                    FileExplorerActivity.this.f30699T = null;
                    FileExplorerActivity.this.P4();
                    FileExplorerActivity.this.k4(name2);
                    SearchView searchView2 = FileExplorerActivity.this.f30687H;
                    if (searchView2 != null) {
                        FileExplorerActivity.this.v3(searchView2);
                        return;
                    }
                    return;
                }
                FileExplorerActivity.this.finish();
                return;
            }
            FileExplorerActivity.this.finish();
        }
    }

    /* loaded from: classes5.dex */
    public static final class F implements TabLayout.OnTabSelectedListener {
        F() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab == null || tab.getId() != 0) {
                FileExplorerActivity.this.f30705Z = true;
                ArrayList arrayList = FileExplorerActivity.this.f30700U;
                AbstractC3292y.f(arrayList);
                if (arrayList.size() > 0) {
                    FileExplorerActivity.this.Q4();
                    FileExplorerActivity.this.t3();
                    return;
                }
                return;
            }
            FileExplorerActivity.this.f30705Z = false;
            RecyclerView recyclerView = FileExplorerActivity.this.f30715x;
            if (recyclerView == null) {
                AbstractC3292y.y("rvFiles");
                recyclerView = null;
            }
            recyclerView.setVisibility(0);
            LinearLayout linearLayout = FileExplorerActivity.this.f30678A;
            if (linearLayout == null) {
                AbstractC3292y.y("llPermissionExplanation");
                linearLayout = null;
            }
            linearLayout.setVisibility(8);
            RecyclerView recyclerView2 = FileExplorerActivity.this.f30715x;
            if (recyclerView2 == null) {
                AbstractC3292y.y("rvFiles");
                recyclerView2 = null;
            }
            recyclerView2.setVisibility(0);
            FileExplorerActivity.this.Q4();
            FileExplorerActivity.this.W4();
            FileExplorerActivity.m4(FileExplorerActivity.this, false, 1, null);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* loaded from: classes5.dex */
    public static final class G implements SearchView.OnQueryTextListener {
        G() {
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String newText) {
            AbstractC3292y.i(newText, "newText");
            FileExplorerActivity.this.r3(newText, null);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String query) {
            AbstractC3292y.i(query, "query");
            FileExplorerActivity.this.r3(query, null);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class H extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30731a;

        H(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new H(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30731a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                this.f30731a = 1;
                if (fileExplorerActivity.M4(this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, d dVar) {
            return ((H) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class I extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30733a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f30734b;

        /* renamed from: d, reason: collision with root package name */
        int f30736d;

        I(d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30734b = obj;
            this.f30736d |= Integer.MIN_VALUE;
            return FileExplorerActivity.this.M4(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class J extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30737a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f30738b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30740a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30741b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f30741b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f30741b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f30740a == 0) {
                    t.b(obj);
                    this.f30741b.h5();
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30742a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30743b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f30743b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new b(this.f30743b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f30742a == 0) {
                    t.b(obj);
                    this.f30743b.f5();
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class c extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30744a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30745b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f30745b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new c(this.f30745b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f30744a == 0) {
                    t.b(obj);
                    this.f30745b.g5();
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        J(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            J j8 = new J(dVar);
            j8.f30738b = obj;
            return j8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            n6.U b9;
            n6.U b10;
            n6.U b11;
            Object e8 = V5.b.e();
            int i8 = this.f30737a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2 && i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                n6.M m8 = (n6.M) this.f30738b;
                RadioButton radioButton = FileExplorerActivity.this.f30690K;
                AbstractC3292y.f(radioButton);
                if (radioButton.isChecked()) {
                    b11 = AbstractC3462k.b(m8, null, null, new c(FileExplorerActivity.this, null), 3, null);
                    this.f30737a = 1;
                    if (b11.h(this) == e8) {
                        return e8;
                    }
                } else {
                    RadioButton radioButton2 = FileExplorerActivity.this.f30691L;
                    AbstractC3292y.f(radioButton2);
                    if (radioButton2.isChecked()) {
                        b10 = AbstractC3462k.b(m8, null, null, new a(FileExplorerActivity.this, null), 3, null);
                        this.f30737a = 2;
                        if (b10.h(this) == e8) {
                            return e8;
                        }
                    } else {
                        RadioButton radioButton3 = FileExplorerActivity.this.f30692M;
                        AbstractC3292y.f(radioButton3);
                        if (radioButton3.isChecked()) {
                            b9 = AbstractC3462k.b(m8, null, null, new b(FileExplorerActivity.this, null), 3, null);
                            this.f30737a = 3;
                            if (b9.h(this) == e8) {
                                return e8;
                            }
                        }
                    }
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, d dVar) {
            return ((J) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class K extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30746a;

        K(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new K(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30746a == 0) {
                t.b(obj);
                FileExplorerActivity.this.V4();
                RelativeLayout relativeLayout = FileExplorerActivity.this.f30717y;
                if (relativeLayout == null) {
                    AbstractC3292y.y("rlLoading");
                    relativeLayout = null;
                }
                relativeLayout.setVisibility(8);
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, d dVar) {
            return ((K) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class L implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((DocumentFile) obj).lastModified()), Long.valueOf(((DocumentFile) obj2).lastModified()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class M implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((DocumentFile) obj).isFile()), Boolean.valueOf(((DocumentFile) obj2).isFile()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class N implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class O implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((File) obj).isFile()), Boolean.valueOf(((File) obj2).isFile()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class P implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((DocumentFile) obj2).lastModified()), Long.valueOf(((DocumentFile) obj).lastModified()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class Q implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((DocumentFile) obj2).isDirectory()), Boolean.valueOf(((DocumentFile) obj).isDirectory()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class R implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((File) obj2).lastModified()), Long.valueOf(((File) obj).lastModified()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class S implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((File) obj2).isDirectory()), Boolean.valueOf(((File) obj).isDirectory()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class T implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            String str;
            String name = ((DocumentFile) obj).getName();
            String str2 = null;
            if (name != null) {
                AbstractC3292y.h(name, "name");
                str = name.toUpperCase(Locale.ROOT);
                AbstractC3292y.h(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            } else {
                str = null;
            }
            String name2 = ((DocumentFile) obj2).getName();
            if (name2 != null) {
                AbstractC3292y.h(name2, "name");
                str2 = name2.toUpperCase(Locale.ROOT);
                AbstractC3292y.h(str2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            }
            return a.a(str, str2);
        }
    }

    /* loaded from: classes5.dex */
    public static final class U implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((DocumentFile) obj).isFile()), Boolean.valueOf(((DocumentFile) obj2).isFile()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class V implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            String name = ((File) obj).getName();
            AbstractC3292y.h(name, "it.name");
            Locale locale = Locale.ROOT;
            String upperCase = name.toUpperCase(locale);
            AbstractC3292y.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String name2 = ((File) obj2).getName();
            AbstractC3292y.h(name2, "it.name");
            String upperCase2 = name2.toUpperCase(locale);
            AbstractC3292y.h(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return a.a(upperCase, upperCase2);
        }
    }

    /* loaded from: classes5.dex */
    public static final class W implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((File) obj).isFile()), Boolean.valueOf(((File) obj2).isFile()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class X implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            String str;
            String name = ((DocumentFile) obj2).getName();
            String str2 = null;
            if (name != null) {
                AbstractC3292y.h(name, "name");
                str = name.toUpperCase(Locale.ROOT);
                AbstractC3292y.h(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            } else {
                str = null;
            }
            String name2 = ((DocumentFile) obj).getName();
            if (name2 != null) {
                AbstractC3292y.h(name2, "name");
                str2 = name2.toUpperCase(Locale.ROOT);
                AbstractC3292y.h(str2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            }
            return a.a(str, str2);
        }
    }

    /* loaded from: classes5.dex */
    public static final class Y implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((DocumentFile) obj2).isDirectory()), Boolean.valueOf(((DocumentFile) obj).isDirectory()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class Z implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            String name = ((File) obj2).getName();
            AbstractC3292y.h(name, "it.name");
            Locale locale = Locale.ROOT;
            String upperCase = name.toUpperCase(locale);
            AbstractC3292y.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String name2 = ((File) obj).getName();
            AbstractC3292y.h(name2, "it.name");
            String upperCase2 = name2.toUpperCase(locale);
            AbstractC3292y.h(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return a.a(upperCase, upperCase2);
        }
    }

    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$a, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2706a {
        private C2706a() {
        }

        public /* synthetic */ C2706a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class a0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((File) obj2).isDirectory()), Boolean.valueOf(((File) obj).isDirectory()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$b, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2707b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30748a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30750c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30751d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30752a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30753b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f30754c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f30755d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.uptodown.core.activities.FileExplorerActivity$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0706a extends l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f30756a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ FileExplorerActivity f30757b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f30758c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0706a(FileExplorerActivity fileExplorerActivity, String str, d dVar) {
                    super(2, dVar);
                    this.f30757b = fileExplorerActivity;
                    this.f30758c = str;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final d create(Object obj, d dVar) {
                    return new C0706a(this.f30757b, this.f30758c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    V5.b.e();
                    if (this.f30756a == 0) {
                        t.b(obj);
                        RelativeLayout relativeLayout = this.f30757b.f30717y;
                        if (relativeLayout == null) {
                            AbstractC3292y.y("rlLoading");
                            relativeLayout = null;
                        }
                        relativeLayout.setVisibility(8);
                        this.f30757b.c5(this.f30758c);
                        this.f30757b.s3();
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(n6.M m8, d dVar) {
                    return ((C0706a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, String str, String str2, d dVar) {
                super(2, dVar);
                this.f30753b = fileExplorerActivity;
                this.f30754c = str;
                this.f30755d = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f30753b, this.f30754c, this.f30755d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f30752a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            t.b(obj);
                            return Q5.I.f8786a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                } else {
                    t.b(obj);
                    this.f30753b.U4(this.f30754c);
                    FileExplorerActivity fileExplorerActivity = this.f30753b;
                    this.f30752a = 1;
                    if (fileExplorerActivity.M4(this) == e8) {
                        return e8;
                    }
                }
                J0 c8 = C3445b0.c();
                C0706a c0706a = new C0706a(this.f30753b, this.f30755d, null);
                this.f30752a = 2;
                if (AbstractC3458i.g(c8, c0706a, this) == e8) {
                    return e8;
                }
                return Q5.I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2707b(String str, String str2, d dVar) {
            super(2, dVar);
            this.f30750c = str;
            this.f30751d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2707b(this.f30750c, this.f30751d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30748a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                n6.I b9 = C3445b0.b();
                a aVar = new a(FileExplorerActivity.this, this.f30750c, this.f30751d, null);
                this.f30748a = 1;
                if (AbstractC3458i.g(b9, aVar, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, d dVar) {
            return ((C2707b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((DocumentFile) obj).length()), Long.valueOf(((DocumentFile) obj2).length()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$c, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2708c extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30759a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f30760b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ DocumentFile f30761c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f30762d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f30763e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30764a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30765b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f30765b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f30765b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f30764a == 0) {
                    t.b(obj);
                    this.f30765b.j5();
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2708c(ArrayList arrayList, DocumentFile documentFile, c cVar, FileExplorerActivity fileExplorerActivity, d dVar) {
            super(2, dVar);
            this.f30760b = arrayList;
            this.f30761c = documentFile;
            this.f30762d = cVar;
            this.f30763e = fileExplorerActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2708c(this.f30760b, this.f30761c, this.f30762d, this.f30763e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30759a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                y yVar = new y();
                ArrayList arrayList = this.f30760b;
                DocumentFile documentFile = this.f30761c;
                c cVar = this.f30762d;
                Context applicationContext = this.f30763e.getApplicationContext();
                AbstractC3292y.h(applicationContext, "applicationContext");
                this.f30759a = 1;
                if (yVar.h(arrayList, documentFile, cVar, applicationContext, this) == e8) {
                    return e8;
                }
            }
            J0 c8 = C3445b0.c();
            a aVar = new a(this.f30763e, null);
            this.f30759a = 2;
            if (AbstractC3458i.g(c8, aVar, this) == e8) {
                return e8;
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, d dVar) {
            return ((C2708c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class c0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((DocumentFile) obj).isFile()), Boolean.valueOf(((DocumentFile) obj2).isFile()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$d, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2709d extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30766a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f30767b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f30768c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f30769d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f30770e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30771a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30772b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f30772b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f30772b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f30771a == 0) {
                    t.b(obj);
                    this.f30772b.j5();
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2709d(ArrayList arrayList, File file, c cVar, FileExplorerActivity fileExplorerActivity, d dVar) {
            super(2, dVar);
            this.f30767b = arrayList;
            this.f30768c = file;
            this.f30769d = cVar;
            this.f30770e = fileExplorerActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2709d(this.f30767b, this.f30768c, this.f30769d, this.f30770e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30766a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                y yVar = new y();
                ArrayList arrayList = this.f30767b;
                File file = this.f30768c;
                c cVar = this.f30769d;
                this.f30766a = 1;
                if (yVar.i(arrayList, file, cVar, this) == e8) {
                    return e8;
                }
            }
            J0 c8 = C3445b0.c();
            a aVar = new a(this.f30770e, null);
            this.f30766a = 2;
            if (AbstractC3458i.g(c8, aVar, this) == e8) {
                return e8;
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, d dVar) {
            return ((C2709d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class d0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((File) obj).length()), Long.valueOf(((File) obj2).length()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$e, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2710e extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30773a;

        C2710e(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2710e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30773a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                this.f30773a = 1;
                if (fileExplorerActivity.z3(this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, d dVar) {
            return ((C2710e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class e0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((File) obj).isFile()), Boolean.valueOf(((File) obj2).isFile()));
        }
    }

    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$f, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2711f implements O4.d {
        C2711f() {
        }

        @Override // O4.d
        public void a(DocumentFile docFile) {
            AbstractC3292y.i(docFile, "docFile");
        }

        @Override // O4.d
        public void b(int i8) {
            ((ProgressBar) FileExplorerActivity.this.findViewById(e.f4162G)).setProgress(i8);
        }

        @Override // O4.d
        public void c(File file) {
            AbstractC3292y.i(file, "file");
        }

        @Override // O4.d
        public void d(DocumentFile docFile) {
            AbstractC3292y.i(docFile, "docFile");
        }

        @Override // O4.d
        public void e(File file) {
            AbstractC3292y.i(file, "file");
        }

        @Override // O4.d
        public void f(Object file, int i8) {
            String string;
            AbstractC3292y.i(file, "file");
            RelativeLayout relativeLayout = FileExplorerActivity.this.f30719z;
            if (relativeLayout == null) {
                AbstractC3292y.y("rlLoadingAction");
                relativeLayout = null;
            }
            relativeLayout.setVisibility(0);
            View findViewById = FileExplorerActivity.this.findViewById(e.f4287v1);
            FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
            TextView textView = (TextView) findViewById;
            textView.setTypeface(j.f4395g.v());
            if (file instanceof File) {
                string = fileExplorerActivity.getString(h.f4363h, ((File) file).getName());
            } else if (file instanceof DocumentFile) {
                string = fileExplorerActivity.getString(h.f4363h, ((DocumentFile) file).getName());
            } else {
                string = fileExplorerActivity.getString(h.f4363h);
            }
            textView.setText(string);
        }

        @Override // O4.d
        public void g() {
        }

        @Override // O4.d
        public void h(Object file) {
            AbstractC3292y.i(file, "file");
        }

        @Override // O4.d
        public void i() {
            FileExplorerActivity.this.f30707q0 = null;
            FileExplorerActivity.this.h4();
            RelativeLayout relativeLayout = FileExplorerActivity.this.f30719z;
            if (relativeLayout == null) {
                AbstractC3292y.y("rlLoadingAction");
                relativeLayout = null;
            }
            relativeLayout.setVisibility(8);
            FileExplorerActivity.m4(FileExplorerActivity.this, false, 1, null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class f0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((DocumentFile) obj2).length()), Long.valueOf(((DocumentFile) obj).length()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$g, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2712g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30776a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f30777b;

        /* renamed from: d, reason: collision with root package name */
        int f30779d;

        C2712g(d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30777b = obj;
            this.f30779d |= Integer.MIN_VALUE;
            return FileExplorerActivity.this.z3(this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class g0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((DocumentFile) obj2).isDirectory()), Boolean.valueOf(((DocumentFile) obj).isDirectory()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$h, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2713h extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30780a;

        C2713h(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2713h(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30780a == 0) {
                t.b(obj);
                if (FileExplorerActivity.this.f30696Q != null) {
                    FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                    b bVar = fileExplorerActivity.f30696Q;
                    AbstractC3292y.f(bVar);
                    fileExplorerActivity.f30707q0 = bVar.b();
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, d dVar) {
            return ((C2713h) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class h0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((File) obj2).length()), Long.valueOf(((File) obj).length()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$i, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2714i extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30782a;

        C2714i(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2714i(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            MenuItem menuItem;
            MenuItem menuItem2;
            MenuItem menuItem3;
            MenuItem menuItem4;
            MenuItem menuItem5;
            Menu menu;
            Menu menu2;
            Menu menu3;
            Menu menu4;
            Menu menu5;
            Menu menu6;
            V5.b.e();
            if (this.f30782a == 0) {
                t.b(obj);
                b bVar = FileExplorerActivity.this.f30696Q;
                AbstractC3292y.f(bVar);
                bVar.i(false);
                if (FileExplorerActivity.this.f30707q0 != null) {
                    AbstractC3292y.f(FileExplorerActivity.this.f30707q0);
                    if (!r5.isEmpty()) {
                        Toolbar toolbar = FileExplorerActivity.this.f30694O;
                        MenuItem menuItem6 = null;
                        if (toolbar != null && (menu6 = toolbar.getMenu()) != null) {
                            menuItem = menu6.findItem(e.f4237f);
                        } else {
                            menuItem = null;
                        }
                        if (menuItem != null) {
                            menuItem.setVisible(true);
                        }
                        Toolbar toolbar2 = FileExplorerActivity.this.f30694O;
                        if (toolbar2 != null && (menu5 = toolbar2.getMenu()) != null) {
                            menuItem2 = menu5.findItem(e.f4228c);
                        } else {
                            menuItem2 = null;
                        }
                        if (menuItem2 != null) {
                            menuItem2.setVisible(true);
                        }
                        Toolbar toolbar3 = FileExplorerActivity.this.f30694O;
                        if (toolbar3 != null && (menu4 = toolbar3.getMenu()) != null) {
                            menuItem3 = menu4.findItem(e.f4225b);
                        } else {
                            menuItem3 = null;
                        }
                        if (menuItem3 != null) {
                            menuItem3.setVisible(false);
                        }
                        Toolbar toolbar4 = FileExplorerActivity.this.f30694O;
                        if (toolbar4 != null && (menu3 = toolbar4.getMenu()) != null) {
                            menuItem4 = menu3.findItem(e.f4222a);
                        } else {
                            menuItem4 = null;
                        }
                        if (menuItem4 != null) {
                            menuItem4.setVisible(false);
                        }
                        Toolbar toolbar5 = FileExplorerActivity.this.f30694O;
                        if (toolbar5 != null && (menu2 = toolbar5.getMenu()) != null) {
                            menuItem5 = menu2.findItem(e.f4231d);
                        } else {
                            menuItem5 = null;
                        }
                        if (menuItem5 != null) {
                            menuItem5.setVisible(false);
                        }
                        Toolbar toolbar6 = FileExplorerActivity.this.f30694O;
                        if (toolbar6 != null && (menu = toolbar6.getMenu()) != null) {
                            menuItem6 = menu.findItem(e.f4234e);
                        }
                        if (menuItem6 != null) {
                            menuItem6.setVisible(false);
                        }
                    }
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, d dVar) {
            return ((C2714i) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class i0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((File) obj2).isDirectory()), Boolean.valueOf(((File) obj).isDirectory()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$j, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2715j extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f30784a;

        /* renamed from: b, reason: collision with root package name */
        int f30785b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O f30787d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f30788e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$j$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30789a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity) {
                super(0);
                this.f30789a = fileExplorerActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5538invoke();
                return Q5.I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5538invoke() {
                AlertDialog alertDialog = this.f30789a.f30693N;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$j$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30790a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(FileExplorerActivity fileExplorerActivity) {
                super(0);
                this.f30790a = fileExplorerActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5539invoke();
                return Q5.I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5539invoke() {
                AlertDialog alertDialog = this.f30790a.f30693N;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$j$c */
        /* loaded from: classes5.dex */
        public static final class c extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30791a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30792b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f30792b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new c(this.f30792b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f30791a == 0) {
                    t.b(obj);
                    this.f30792b.l4(false);
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2715j(kotlin.jvm.internal.O o8, String str, d dVar) {
            super(2, dVar);
            this.f30787d = o8;
            this.f30788e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2715j(this.f30787d, this.f30788e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.jvm.internal.O o8;
            kotlin.jvm.internal.O o9;
            Object e8 = V5.b.e();
            int i8 = this.f30785b;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 == 3) {
                            t.b(obj);
                            return Q5.I.f8786a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o8 = (kotlin.jvm.internal.O) this.f30784a;
                    t.b(obj);
                    o8.f34569a = ((Boolean) obj).booleanValue();
                } else {
                    o9 = (kotlin.jvm.internal.O) this.f30784a;
                    t.b(obj);
                    o9.f34569a = ((Boolean) obj).booleanValue();
                }
            } else {
                t.b(obj);
                if (FileExplorerActivity.this.f30703X != null) {
                    o9 = this.f30787d;
                    S4.e eVar = new S4.e();
                    File file = FileExplorerActivity.this.f30703X;
                    AbstractC3292y.f(file);
                    String str = this.f30788e;
                    FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                    a aVar = new a(fileExplorerActivity);
                    this.f30784a = o9;
                    this.f30785b = 1;
                    obj = eVar.d(file, str, fileExplorerActivity, aVar, this);
                    if (obj == e8) {
                        return e8;
                    }
                    o9.f34569a = ((Boolean) obj).booleanValue();
                } else if (FileExplorerActivity.this.f30699T != null) {
                    o8 = this.f30787d;
                    S4.e eVar2 = new S4.e();
                    DocumentFile documentFile = FileExplorerActivity.this.f30699T;
                    AbstractC3292y.f(documentFile);
                    String str2 = this.f30788e;
                    FileExplorerActivity fileExplorerActivity2 = FileExplorerActivity.this;
                    b bVar = new b(fileExplorerActivity2);
                    this.f30784a = o8;
                    this.f30785b = 2;
                    obj = eVar2.d(documentFile, str2, fileExplorerActivity2, bVar, this);
                    if (obj == e8) {
                        return e8;
                    }
                    o8.f34569a = ((Boolean) obj).booleanValue();
                }
            }
            if (this.f30787d.f34569a) {
                J0 c8 = C3445b0.c();
                c cVar = new c(FileExplorerActivity.this, null);
                this.f30784a = null;
                this.f30785b = 3;
                if (AbstractC3458i.g(c8, cVar, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, d dVar) {
            return ((C2715j) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$k, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2716k extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30793a;

        C2716k(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2716k(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30793a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                this.f30793a = 1;
                if (fileExplorerActivity.O3(this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, d dVar) {
            return ((C2716k) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$l, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2717l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30795a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f30796b;

        /* renamed from: d, reason: collision with root package name */
        int f30798d;

        C2717l(d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30796b = obj;
            this.f30798d |= Integer.MIN_VALUE;
            return FileExplorerActivity.this.O3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$m, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2718m extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30799a;

        C2718m(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2718m(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30799a == 0) {
                t.b(obj);
                if (FileExplorerActivity.this.f30696Q != null) {
                    FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                    b bVar = fileExplorerActivity.f30696Q;
                    AbstractC3292y.f(bVar);
                    fileExplorerActivity.f30707q0 = bVar.b();
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, d dVar) {
            return ((C2718m) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$n, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2719n extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30801a;

        C2719n(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2719n(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            MenuItem menuItem;
            MenuItem menuItem2;
            MenuItem menuItem3;
            MenuItem menuItem4;
            MenuItem menuItem5;
            Menu menu;
            Menu menu2;
            Menu menu3;
            Menu menu4;
            Menu menu5;
            Menu menu6;
            V5.b.e();
            if (this.f30801a == 0) {
                t.b(obj);
                b bVar = FileExplorerActivity.this.f30696Q;
                AbstractC3292y.f(bVar);
                bVar.i(false);
                if (FileExplorerActivity.this.f30707q0 != null) {
                    AbstractC3292y.f(FileExplorerActivity.this.f30707q0);
                    if (!r5.isEmpty()) {
                        Toolbar toolbar = FileExplorerActivity.this.f30694O;
                        MenuItem menuItem6 = null;
                        if (toolbar != null && (menu6 = toolbar.getMenu()) != null) {
                            menuItem = menu6.findItem(e.f4237f);
                        } else {
                            menuItem = null;
                        }
                        if (menuItem != null) {
                            menuItem.setVisible(true);
                        }
                        Toolbar toolbar2 = FileExplorerActivity.this.f30694O;
                        if (toolbar2 != null && (menu5 = toolbar2.getMenu()) != null) {
                            menuItem2 = menu5.findItem(e.f4228c);
                        } else {
                            menuItem2 = null;
                        }
                        if (menuItem2 != null) {
                            menuItem2.setVisible(true);
                        }
                        Toolbar toolbar3 = FileExplorerActivity.this.f30694O;
                        if (toolbar3 != null && (menu4 = toolbar3.getMenu()) != null) {
                            menuItem3 = menu4.findItem(e.f4225b);
                        } else {
                            menuItem3 = null;
                        }
                        if (menuItem3 != null) {
                            menuItem3.setVisible(false);
                        }
                        Toolbar toolbar4 = FileExplorerActivity.this.f30694O;
                        if (toolbar4 != null && (menu3 = toolbar4.getMenu()) != null) {
                            menuItem4 = menu3.findItem(e.f4222a);
                        } else {
                            menuItem4 = null;
                        }
                        if (menuItem4 != null) {
                            menuItem4.setVisible(false);
                        }
                        Toolbar toolbar5 = FileExplorerActivity.this.f30694O;
                        if (toolbar5 != null && (menu2 = toolbar5.getMenu()) != null) {
                            menuItem5 = menu2.findItem(e.f4231d);
                        } else {
                            menuItem5 = null;
                        }
                        if (menuItem5 != null) {
                            menuItem5.setVisible(false);
                        }
                        Toolbar toolbar6 = FileExplorerActivity.this.f30694O;
                        if (toolbar6 != null && (menu = toolbar6.getMenu()) != null) {
                            menuItem6 = menu.findItem(e.f4234e);
                        }
                        if (menuItem6 != null) {
                            menuItem6.setVisible(false);
                        }
                    }
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, d dVar) {
            return ((C2719n) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$o, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2720o extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30803a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f30804b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30805c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ O4.e f30806d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f30807e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$o$a */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30808a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30809b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f30809b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f30809b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f30808a == 0) {
                    t.b(obj);
                    this.f30809b.j5();
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2720o(File file, String str, O4.e eVar, FileExplorerActivity fileExplorerActivity, d dVar) {
            super(2, dVar);
            this.f30804b = file;
            this.f30805c = str;
            this.f30806d = eVar;
            this.f30807e = fileExplorerActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2720o(this.f30804b, this.f30805c, this.f30806d, this.f30807e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30803a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                y yVar = new y();
                File file = this.f30804b;
                String str = this.f30805c;
                O4.e eVar = this.f30806d;
                this.f30803a = 1;
                if (yVar.m(file, str, eVar, this) == e8) {
                    return e8;
                }
            }
            J0 c8 = C3445b0.c();
            a aVar = new a(this.f30807e, null);
            this.f30803a = 2;
            if (AbstractC3458i.g(c8, aVar, this) == e8) {
                return e8;
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, d dVar) {
            return ((C2720o) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$p, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2721p extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30810a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f30811b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f30812c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ O4.e f30813d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f30814e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$p$a */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30815a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30816b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f30816b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f30816b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f30815a == 0) {
                    t.b(obj);
                    this.f30816b.j5();
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2721p(File file, Uri uri, O4.e eVar, FileExplorerActivity fileExplorerActivity, d dVar) {
            super(2, dVar);
            this.f30811b = file;
            this.f30812c = uri;
            this.f30813d = eVar;
            this.f30814e = fileExplorerActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2721p(this.f30811b, this.f30812c, this.f30813d, this.f30814e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30810a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                y yVar = new y();
                File file = this.f30811b;
                Uri uri = this.f30812c;
                O4.e eVar = this.f30813d;
                Context applicationContext = this.f30814e.getApplicationContext();
                AbstractC3292y.h(applicationContext, "applicationContext");
                this.f30810a = 1;
                if (yVar.l(file, uri, eVar, applicationContext, this) == e8) {
                    return e8;
                }
            }
            J0 c8 = C3445b0.c();
            a aVar = new a(this.f30814e, null);
            this.f30810a = 2;
            if (AbstractC3458i.g(c8, aVar, this) == e8) {
                return e8;
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, d dVar) {
            return ((C2721p) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$q, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2722q extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30817a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ DocumentFile f30818b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30819c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ O4.e f30820d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f30821e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$q$a */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30822a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30823b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f30823b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f30823b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f30822a == 0) {
                    t.b(obj);
                    this.f30823b.j5();
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2722q(DocumentFile documentFile, String str, O4.e eVar, FileExplorerActivity fileExplorerActivity, d dVar) {
            super(2, dVar);
            this.f30818b = documentFile;
            this.f30819c = str;
            this.f30820d = eVar;
            this.f30821e = fileExplorerActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2722q(this.f30818b, this.f30819c, this.f30820d, this.f30821e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30817a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                y yVar = new y();
                DocumentFile documentFile = this.f30818b;
                String str = this.f30819c;
                O4.e eVar = this.f30820d;
                Context applicationContext = this.f30821e.getApplicationContext();
                AbstractC3292y.h(applicationContext, "applicationContext");
                this.f30817a = 1;
                if (yVar.k(documentFile, str, eVar, applicationContext, this) == e8) {
                    return e8;
                }
            }
            J0 c8 = C3445b0.c();
            a aVar = new a(this.f30821e, null);
            this.f30817a = 2;
            if (AbstractC3458i.g(c8, aVar, this) == e8) {
                return e8;
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, d dVar) {
            return ((C2722q) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$r, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2723r extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30824a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ DocumentFile f30825b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f30826c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ O4.e f30827d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f30828e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$r$a */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30829a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30830b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f30830b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f30830b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f30829a == 0) {
                    t.b(obj);
                    this.f30830b.j5();
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2723r(DocumentFile documentFile, Uri uri, O4.e eVar, FileExplorerActivity fileExplorerActivity, d dVar) {
            super(2, dVar);
            this.f30825b = documentFile;
            this.f30826c = uri;
            this.f30827d = eVar;
            this.f30828e = fileExplorerActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2723r(this.f30825b, this.f30826c, this.f30827d, this.f30828e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30824a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                y yVar = new y();
                DocumentFile documentFile = this.f30825b;
                Uri uri = this.f30826c;
                O4.e eVar = this.f30827d;
                Context applicationContext = this.f30828e.getApplicationContext();
                AbstractC3292y.h(applicationContext, "applicationContext");
                this.f30824a = 1;
                if (yVar.j(documentFile, uri, eVar, applicationContext, this) == e8) {
                    return e8;
                }
            }
            J0 c8 = C3445b0.c();
            a aVar = new a(this.f30828e, null);
            this.f30824a = 2;
            if (AbstractC3458i.g(c8, aVar, this) == e8) {
                return e8;
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, d dVar) {
            return ((C2723r) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$s, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2724s extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30831a;

        C2724s(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2724s(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30831a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                this.f30831a = 1;
                if (fileExplorerActivity.U3(this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, d dVar) {
            return ((C2724s) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$t, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2725t extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30833a;

        /* renamed from: b, reason: collision with root package name */
        Object f30834b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f30835c;

        /* renamed from: e, reason: collision with root package name */
        int f30837e;

        C2725t(d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30835c = obj;
            this.f30837e |= Integer.MIN_VALUE;
            return FileExplorerActivity.this.U3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$u, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2726u extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30838a;

        C2726u(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2726u(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30838a == 0) {
                t.b(obj);
                RelativeLayout relativeLayout = FileExplorerActivity.this.f30717y;
                if (relativeLayout == null) {
                    AbstractC3292y.y("rlLoading");
                    relativeLayout = null;
                }
                relativeLayout.setVisibility(0);
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, d dVar) {
            return ((C2726u) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$v, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2727v extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f30840a;

        /* renamed from: b, reason: collision with root package name */
        int f30841b;

        /* renamed from: c, reason: collision with root package name */
        int f30842c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.Q f30844e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$v$a */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30845a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30846b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f30847c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, int i8, d dVar) {
                super(2, dVar);
                this.f30846b = fileExplorerActivity;
                this.f30847c = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f30846b, this.f30847c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f30845a == 0) {
                    t.b(obj);
                    b bVar = this.f30846b.f30696Q;
                    AbstractC3292y.f(bVar);
                    bVar.notifyItemRemoved(this.f30847c);
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2727v(kotlin.jvm.internal.Q q8, d dVar) {
            super(2, dVar);
            this.f30844e = q8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2727v(this.f30844e, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x006d -> B:5:0x0088). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0085 -> B:5:0x0088). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r9.f30842c
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 != r3) goto L17
                int r1 = r9.f30841b
                java.lang.Object r4 = r9.f30840a
                java.util.Iterator r4 = (java.util.Iterator) r4
                Q5.t.b(r10)
                goto L88
            L17:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1f:
                Q5.t.b(r10)
                com.uptodown.core.activities.FileExplorerActivity r10 = com.uptodown.core.activities.FileExplorerActivity.this
                M4.b r10 = com.uptodown.core.activities.FileExplorerActivity.x2(r10)
                if (r10 == 0) goto L8a
                com.uptodown.core.activities.FileExplorerActivity r10 = com.uptodown.core.activities.FileExplorerActivity.this
                M4.b r10 = com.uptodown.core.activities.FileExplorerActivity.x2(r10)
                kotlin.jvm.internal.AbstractC3292y.f(r10)
                java.util.ArrayList r10 = r10.b()
                kotlin.jvm.internal.Q r1 = r9.f30844e
                int r4 = r10.size()
                r1.f34571a = r4
                java.util.Iterator r10 = r10.iterator()
                r4 = r10
                r10 = 0
            L45:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L8a
                int r1 = r10 + 1
                java.lang.Object r5 = r4.next()
                boolean r6 = r5 instanceof java.io.File
                if (r6 == 0) goto L61
                S4.g r6 = new S4.g
                r6.<init>()
                java.io.File r5 = (java.io.File) r5
                boolean r5 = r6.a(r5)
                goto L6d
            L61:
                boolean r6 = r5 instanceof androidx.documentfile.provider.DocumentFile
                if (r6 == 0) goto L6c
                androidx.documentfile.provider.DocumentFile r5 = (androidx.documentfile.provider.DocumentFile) r5
                boolean r5 = r5.delete()
                goto L6d
            L6c:
                r5 = 0
            L6d:
                if (r5 == 0) goto L88
                n6.J0 r5 = n6.C3445b0.c()
                com.uptodown.core.activities.FileExplorerActivity$v$a r6 = new com.uptodown.core.activities.FileExplorerActivity$v$a
                com.uptodown.core.activities.FileExplorerActivity r7 = com.uptodown.core.activities.FileExplorerActivity.this
                r8 = 0
                r6.<init>(r7, r10, r8)
                r9.f30840a = r4
                r9.f30841b = r1
                r9.f30842c = r3
                java.lang.Object r10 = n6.AbstractC3458i.g(r5, r6, r9)
                if (r10 != r0) goto L88
                return r0
            L88:
                r10 = r1
                goto L45
            L8a:
                Q5.I r10 = Q5.I.f8786a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.FileExplorerActivity.C2727v.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, d dVar) {
            return ((C2727v) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$w, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2728w extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30848a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.Q f30850c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2728w(kotlin.jvm.internal.Q q8, d dVar) {
            super(2, dVar);
            this.f30850c = q8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2728w(this.f30850c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30848a == 0) {
                t.b(obj);
                b bVar = FileExplorerActivity.this.f30696Q;
                AbstractC3292y.f(bVar);
                bVar.i(false);
                RelativeLayout relativeLayout = FileExplorerActivity.this.f30717y;
                if (relativeLayout == null) {
                    AbstractC3292y.y("rlLoading");
                    relativeLayout = null;
                }
                relativeLayout.setVisibility(8);
                FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                Toast.makeText(fileExplorerActivity, fileExplorerActivity.getString(h.f4385s, String.valueOf(this.f30850c.f34571a)), 1).show();
                FileExplorerActivity.this.h4();
                FileExplorerActivity.this.l4(false);
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, d dVar) {
            return ((C2728w) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$x, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2729x implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProgressBar f30851a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f30852b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EditText f30853c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f30854d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextView f30855e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextView f30856f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ RelativeLayout f30857g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TextView f30858h;

        C2729x(ProgressBar progressBar, TextView textView, EditText editText, FileExplorerActivity fileExplorerActivity, TextView textView2, TextView textView3, RelativeLayout relativeLayout, TextView textView4) {
            this.f30851a = progressBar;
            this.f30852b = textView;
            this.f30853c = editText;
            this.f30854d = fileExplorerActivity;
            this.f30855e = textView2;
            this.f30856f = textView3;
            this.f30857g = relativeLayout;
            this.f30858h = textView4;
        }

        @Override // O4.c
        public void a(String fileName) {
            AbstractC3292y.i(fileName, "fileName");
            this.f30856f.setText(fileName);
            this.f30857g.setVisibility(8);
            this.f30855e.setVisibility(8);
            this.f30858h.setText(this.f30854d.getString(h.f4355d));
        }

        @Override // O4.c
        public void b(String filesCount) {
            AbstractC3292y.i(filesCount, "filesCount");
            this.f30853c.setFocusable(false);
            this.f30853c.setFocusableInTouchMode(false);
            this.f30853c.clearFocus();
            this.f30851a.setVisibility(0);
            this.f30852b.setVisibility(0);
            this.f30852b.setText(this.f30854d.getString(h.f4393z, filesCount));
            this.f30855e.setVisibility(8);
        }

        @Override // O4.c
        public void c(int i8, String filesCount) {
            AbstractC3292y.i(filesCount, "filesCount");
            this.f30851a.setProgress(i8);
            this.f30852b.setText(filesCount);
        }

        @Override // O4.c
        public void onError(String str) {
            this.f30856f.setText(str);
            this.f30851a.setVisibility(0);
            this.f30855e.setVisibility(8);
            this.f30858h.setText(this.f30854d.getString(h.f4355d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$y, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2730y extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30859a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EditText f30861c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2730y(EditText editText, d dVar) {
            super(2, dVar);
            this.f30861c = editText;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2730y(this.f30861c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30859a == 0) {
                t.b(obj);
                FileExplorerActivity.this.D3(this.f30861c.getText().toString());
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, d dVar) {
            return ((C2730y) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$z, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2731z implements O4.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f30862a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f30863b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f30864c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ProgressBar f30865d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextView f30866e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextView f30867f;

        C2731z(TextView textView, FileExplorerActivity fileExplorerActivity, View view, ProgressBar progressBar, TextView textView2, TextView textView3) {
            this.f30862a = textView;
            this.f30863b = fileExplorerActivity;
            this.f30864c = view;
            this.f30865d = progressBar;
            this.f30866e = textView2;
            this.f30867f = textView3;
        }

        @Override // O4.e
        public void a() {
            this.f30862a.setText(this.f30863b.getString(h.f4375n));
            this.f30865d.setIndeterminate(false);
            this.f30865d.setProgress(0);
            this.f30867f.setText(this.f30863b.getString(h.f4355d));
        }

        @Override // O4.e
        public void b(int i8) {
            this.f30862a.setText(this.f30863b.getString(h.f4371l, String.valueOf(i8)));
            this.f30865d.setIndeterminate(false);
            this.f30865d.setProgress(100);
            this.f30867f.setText(this.f30863b.getString(h.f4355d));
        }

        @Override // O4.e
        public void c() {
            this.f30862a.setText(this.f30863b.getString(h.f4373m));
            ((RadioGroup) this.f30864c.findViewById(e.f4195R)).setVisibility(8);
            TextView textView = this.f30863b.f30685F;
            if (textView == null) {
                AbstractC3292y.y("tvSelectedPath");
                textView = null;
            }
            textView.setVisibility(8);
            this.f30865d.setVisibility(0);
            this.f30865d.setIndeterminate(true);
            this.f30866e.setVisibility(8);
        }

        @Override // O4.e
        public void d(long j8) {
            this.f30862a.setText(this.f30863b.getString(h.f4373m) + ' ' + new S4.g().c(j8));
        }
    }

    public FileExplorerActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: K4.w
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                FileExplorerActivity.O4(FileExplorerActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult, "registerForActivityResul…        }\n        }\n    }");
        this.f30681B0 = registerForActivityResult;
    }

    private final void A3() {
        AlertDialog alertDialog = this.f30693N;
        if (alertDialog != null) {
            AbstractC3292y.f(alertDialog);
            alertDialog.dismiss();
        }
        Integer num = null;
        View inflate = getLayoutInflater().inflate(J4.f.f4305f, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(e.f4211W0);
        j.a aVar = j.f4395g;
        textView.setTypeface(aVar.v());
        Context context = textView.getContext();
        int i8 = h.f4377o;
        b bVar = this.f30696Q;
        if (bVar != null) {
            num = Integer.valueOf(bVar.a());
        }
        textView.setText(context.getString(i8, String.valueOf(num)));
        TextView textView2 = (TextView) inflate.findViewById(e.f4259m0);
        textView2.setText(getString(h.f4368j0));
        textView2.setTypeface(aVar.u());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: K4.K
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileExplorerActivity.B3(FileExplorerActivity.this, view);
            }
        });
        TextView textView3 = (TextView) inflate.findViewById(e.f4298z0);
        textView3.setText(getString(h.f4366i0));
        textView3.setTypeface(aVar.u());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: K4.L
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileExplorerActivity.C3(FileExplorerActivity.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        AlertDialog create = builder.create();
        this.f30693N = create;
        AbstractC3292y.f(create);
        Window window = create.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        AlertDialog alertDialog2 = this.f30693N;
        AbstractC3292y.f(alertDialog2);
        alertDialog2.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B3(FileExplorerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.T3();
        AlertDialog alertDialog = this$0.f30693N;
        AbstractC3292y.f(alertDialog);
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B4(FileExplorerActivity this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3292y.i(this$0, "this$0");
        new L4.a(this$0).H(z8);
        SearchView searchView = this$0.f30687H;
        AbstractC3292y.f(searchView);
        this$0.r3(searchView.getQuery().toString(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C3(FileExplorerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f30693N;
        AbstractC3292y.f(alertDialog);
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C4(FileExplorerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D3(String str) {
        AbstractC3462k.d(n6.N.a(C3445b0.b()), null, null, new C2715j(new kotlin.jvm.internal.O(), str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0090, code lost:            if (l6.n.r(r15, ".zip", false, 2, null) != false) goto L20;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a6, code lost:            r15 = (android.widget.TextView) r7.findViewById(J4.e.f4154D0);        r15.setVisibility(0);        r15.setTypeface(r10.v());        r15.setOnClickListener(new K4.X(r16, r17));     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d0, code lost:            if (l6.n.r(r4, ".zip", false, 2, null) == false) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e6, code lost:            r4 = (android.widget.TextView) r7.findViewById(J4.e.f4169I0);        r4.setVisibility(0);        r4.setTypeface(r10.v());        r4.setOnClickListener(new K4.Y(r16, r17));     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e4, code lost:            if (l6.n.r(r4, ".zip", false, 2, null) != false) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a4, code lost:            if (l6.n.r(r15, ".zip", false, 2, null) == false) goto L24;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E3(final java.lang.Object r17, final int r18) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.FileExplorerActivity.E3(java.lang.Object, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(Object obj, FileExplorerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        if (obj instanceof File) {
            this$0.K4((File) obj);
        } else if (obj instanceof DocumentFile) {
            this$0.J4((DocumentFile) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F4(FileExplorerActivity this$0, MenuItem item) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(item, "item");
        int itemId = item.getItemId();
        if (itemId == e.f4240g) {
            b bVar = this$0.f30696Q;
            if (bVar != null) {
                AbstractC3292y.f(bVar);
                if (bVar.c()) {
                    this$0.h4();
                } else {
                    this$0.e5();
                }
                b bVar2 = this$0.f30696Q;
                AbstractC3292y.f(bVar2);
                AbstractC3292y.f(this$0.f30696Q);
                bVar2.i(!r2.c());
            }
        } else if (itemId == e.f4228c) {
            this$0.Y3();
        } else if (itemId == e.f4234e) {
            this$0.A3();
        } else if (itemId == e.f4222a) {
            this$0.V3(null);
        } else if (itemId == e.f4225b) {
            this$0.y3();
        } else if (itemId == e.f4231d) {
            this$0.N3();
        } else if (itemId == e.f4237f) {
            this$0.N4();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(FileExplorerActivity this$0, Object obj, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.V3(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G4(FileExplorerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        SearchView searchView = this$0.f30687H;
        if (searchView != null) {
            searchView.setIconified(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H3(FileExplorerActivity this$0, Object obj, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.b4(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H4(FileExplorerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        RelativeLayout relativeLayout = this$0.f30689J;
        AbstractC3292y.f(relativeLayout);
        if (relativeLayout.getVisibility() == 0) {
            view.animate().rotation(0.0f).start();
            RelativeLayout relativeLayout2 = this$0.f30689J;
            AbstractC3292y.f(relativeLayout2);
            relativeLayout2.setVisibility(8);
            return;
        }
        view.animate().rotation(180.0f).start();
        RelativeLayout relativeLayout3 = this$0.f30689J;
        AbstractC3292y.f(relativeLayout3);
        relativeLayout3.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I3(Object obj, FileExplorerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        if (obj instanceof File) {
            File file = (File) obj;
            if (file.exists()) {
                this$0.d5(file.getAbsolutePath());
                return;
            }
            return;
        }
        if (obj instanceof DocumentFile) {
            DocumentFile documentFile = (DocumentFile) obj;
            if (documentFile.exists()) {
                this$0.d5(documentFile.getUri().getPath());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I4(FileExplorerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.f30704Y = !this$0.f30704Y;
        this$0.L4();
        this$0.Z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J3(FileExplorerActivity this$0, int i8, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.f30708r0 = false;
        b bVar = this$0.f30696Q;
        AbstractC3292y.f(bVar);
        bVar.h(i8);
        this$0.e5();
        this$0.y3();
        AlertDialog alertDialog = this$0.f30693N;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J4(DocumentFile documentFile) {
        Uri uri = documentFile.getUri();
        AbstractC3292y.h(uri, "documentFile.uri");
        i5(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K3(FileExplorerActivity this$0, int i8, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.f30708r0 = true;
        b bVar = this$0.f30696Q;
        AbstractC3292y.f(bVar);
        bVar.h(i8);
        this$0.e5();
        this$0.N3();
        AlertDialog alertDialog = this$0.f30693N;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K4(File file) {
        Uri uri = FileProvider.getUriForFile(this, getApplicationContext().getPackageName() + ".provider", file);
        AbstractC3292y.h(uri, "uri");
        i5(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L3(FileExplorerActivity this$0, Object obj, int i8, View view) {
        String name;
        AbstractC3292y.i(this$0, "this$0");
        this$0.f30708r0 = false;
        if (obj instanceof File) {
            File file = (File) obj;
            if (new S4.g().a(file)) {
                b bVar = this$0.f30696Q;
                if (bVar != null) {
                    bVar.f(i8);
                }
                name = file.getName();
            }
            name = "";
        } else {
            if (obj instanceof DocumentFile) {
                DocumentFile documentFile = (DocumentFile) obj;
                if (documentFile.delete()) {
                    b bVar2 = this$0.f30696Q;
                    if (bVar2 != null) {
                        bVar2.f(i8);
                    }
                    name = documentFile.getName();
                }
            }
            name = "";
        }
        if (name != null && name.length() != 0) {
            Toast.makeText(this$0, this$0.getString(h.f4383r, name), 1).show();
        }
        AlertDialog alertDialog = this$0.f30693N;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    private final void L4() {
        AbstractC3462k.d(n6.N.a(C3445b0.b()), null, null, new H(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M3(Object obj, FileExplorerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        Q4.h m8 = j.f4395g.m();
        AbstractC3292y.f(m8);
        if (m8.e() != null) {
            if (obj instanceof File) {
                File file = (File) obj;
                if (!file.isDirectory()) {
                    Application application = this$0.getApplication();
                    AbstractC3292y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
                    ((j) application).T(file);
                }
            } else if (obj instanceof DocumentFile) {
                Application application2 = this$0.getApplication();
                AbstractC3292y.g(application2, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
                ((j) application2).S((DocumentFile) obj);
            }
        } else {
            this$0.f30706p0 = obj;
            this$0.O0();
        }
        AlertDialog alertDialog = this$0.f30693N;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object M4(U5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.uptodown.core.activities.FileExplorerActivity.I
            if (r0 == 0) goto L13
            r0 = r7
            com.uptodown.core.activities.FileExplorerActivity$I r0 = (com.uptodown.core.activities.FileExplorerActivity.I) r0
            int r1 = r0.f30736d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30736d = r1
            goto L18
        L13:
            com.uptodown.core.activities.FileExplorerActivity$I r0 = new com.uptodown.core.activities.FileExplorerActivity$I
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f30734b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f30736d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            Q5.t.b(r7)
            goto L69
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f30733a
            com.uptodown.core.activities.FileExplorerActivity r2 = (com.uptodown.core.activities.FileExplorerActivity) r2
            Q5.t.b(r7)
            goto L55
        L3d:
            Q5.t.b(r7)
            n6.I r7 = n6.C3445b0.b()
            com.uptodown.core.activities.FileExplorerActivity$J r2 = new com.uptodown.core.activities.FileExplorerActivity$J
            r2.<init>(r5)
            r0.f30733a = r6
            r0.f30736d = r4
            java.lang.Object r7 = n6.AbstractC3458i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            n6.J0 r7 = n6.C3445b0.c()
            com.uptodown.core.activities.FileExplorerActivity$K r4 = new com.uptodown.core.activities.FileExplorerActivity$K
            r4.<init>(r5)
            r0.f30733a = r5
            r0.f30736d = r3
            java.lang.Object r7 = n6.AbstractC3458i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            Q5.I r7 = Q5.I.f8786a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.FileExplorerActivity.M4(U5.d):java.lang.Object");
    }

    private final void N3() {
        this.f30708r0 = true;
        AbstractC3462k.d(n6.N.a(C3445b0.b()), null, null, new C2716k(null), 3, null);
    }

    private final void N4() {
        if (this.f30703X != null) {
            ArrayList arrayList = this.f30707q0;
            AbstractC3292y.f(arrayList);
            File file = this.f30703X;
            AbstractC3292y.f(file);
            new N4.b(arrayList, file, this.f30718y0, this.f30708r0, this);
            return;
        }
        if (this.f30699T != null) {
            ArrayList arrayList2 = this.f30707q0;
            AbstractC3292y.f(arrayList2);
            DocumentFile documentFile = this.f30699T;
            AbstractC3292y.f(documentFile);
            new N4.b(arrayList2, documentFile, this.f30718y0, this.f30708r0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object O3(U5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.uptodown.core.activities.FileExplorerActivity.C2717l
            if (r0 == 0) goto L13
            r0 = r7
            com.uptodown.core.activities.FileExplorerActivity$l r0 = (com.uptodown.core.activities.FileExplorerActivity.C2717l) r0
            int r1 = r0.f30798d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30798d = r1
            goto L18
        L13:
            com.uptodown.core.activities.FileExplorerActivity$l r0 = new com.uptodown.core.activities.FileExplorerActivity$l
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f30796b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f30798d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            Q5.t.b(r7)
            goto L69
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f30795a
            com.uptodown.core.activities.FileExplorerActivity r2 = (com.uptodown.core.activities.FileExplorerActivity) r2
            Q5.t.b(r7)
            goto L55
        L3d:
            Q5.t.b(r7)
            n6.I r7 = n6.C3445b0.b()
            com.uptodown.core.activities.FileExplorerActivity$m r2 = new com.uptodown.core.activities.FileExplorerActivity$m
            r2.<init>(r5)
            r0.f30795a = r6
            r0.f30798d = r4
            java.lang.Object r7 = n6.AbstractC3458i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            n6.J0 r7 = n6.C3445b0.c()
            com.uptodown.core.activities.FileExplorerActivity$n r4 = new com.uptodown.core.activities.FileExplorerActivity$n
            r4.<init>(r5)
            r0.f30795a = r5
            r0.f30798d = r3
            java.lang.Object r7 = n6.AbstractC3458i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            Q5.I r7 = Q5.I.f8786a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.FileExplorerActivity.O3(U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O4(FileExplorerActivity this$0, ActivityResult activityResult) {
        String str;
        Uri uri;
        Bundle extras;
        AbstractC3292y.i(this$0, "this$0");
        if (activityResult.getResultCode() == 145) {
            Intent data = activityResult.getData();
            TextView textView = null;
            if (data != null && (extras = data.getExtras()) != null) {
                str = extras.getString("path_selected");
            } else {
                str = null;
            }
            this$0.f30714w0 = str;
            if (str != null) {
                this$0.f30712v0 = null;
                TextView textView2 = this$0.f30685F;
                if (textView2 == null) {
                    AbstractC3292y.y("tvSelectedPath");
                } else {
                    textView = textView2;
                }
                textView.setText(this$0.f30714w0);
                return;
            }
            Intent data2 = activityResult.getData();
            if (data2 != null) {
                uri = data2.getData();
            } else {
                uri = null;
            }
            if (uri != null) {
                this$0.f30712v0 = uri;
                this$0.f30714w0 = null;
                String lastPathSegment = uri.getLastPathSegment();
                AbstractC3292y.f(lastPathSegment);
                String substring = lastPathSegment.substring(n.X(lastPathSegment, ":", 0, false, 6, null) + 1);
                AbstractC3292y.h(substring, "this as java.lang.String).substring(startIndex)");
                TextView textView3 = this$0.f30685F;
                if (textView3 == null) {
                    AbstractC3292y.y("tvSelectedPath");
                } else {
                    textView = textView3;
                }
                textView.setText(this$0.getString(h.f4370k0) + '/' + substring);
            }
        }
    }

    private final InterfaceC3488x0 P3(DocumentFile documentFile, Uri uri, O4.e eVar) {
        InterfaceC3488x0 d8;
        d8 = AbstractC3462k.d(n6.N.a(C3445b0.b()), null, null, new C2723r(documentFile, uri, eVar, this, null), 3, null);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P4() {
        LinearLayout linearLayout = this.f30682C;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            AbstractC3292y.y("llBreadcrumb");
            linearLayout = null;
        }
        if (linearLayout.getChildCount() > 1) {
            LinearLayout linearLayout3 = this.f30682C;
            if (linearLayout3 == null) {
                AbstractC3292y.y("llBreadcrumb");
                linearLayout3 = null;
            }
            LinearLayout linearLayout4 = this.f30682C;
            if (linearLayout4 == null) {
                AbstractC3292y.y("llBreadcrumb");
            } else {
                linearLayout2 = linearLayout4;
            }
            linearLayout3.removeViewAt(linearLayout2.getChildCount() - 1);
        }
    }

    private final InterfaceC3488x0 Q3(DocumentFile documentFile, String str, O4.e eVar) {
        InterfaceC3488x0 d8;
        d8 = AbstractC3462k.d(n6.N.a(C3445b0.b()), null, null, new C2722q(documentFile, str, eVar, this, null), 3, null);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q4() {
        LinearLayout linearLayout = this.f30682C;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            AbstractC3292y.y("llBreadcrumb");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        LayoutInflater layoutInflater = getLayoutInflater();
        int i8 = J4.f.f4301b;
        LinearLayout linearLayout3 = this.f30682C;
        if (linearLayout3 == null) {
            AbstractC3292y.y("llBreadcrumb");
            linearLayout3 = null;
        }
        View inflate = layoutInflater.inflate(i8, (ViewGroup) linearLayout3, false);
        AbstractC3292y.g(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout4 = (LinearLayout) inflate;
        TextView textView = (TextView) linearLayout4.findViewById(e.f4290w1);
        if (this.f30705Z) {
            textView.setText(getString(h.f4370k0));
        } else {
            textView.setText(getString(h.f4343U));
        }
        textView.setTypeface(j.f4395g.v());
        LinearLayout linearLayout5 = this.f30682C;
        if (linearLayout5 == null) {
            AbstractC3292y.y("llBreadcrumb");
        } else {
            linearLayout2 = linearLayout5;
        }
        linearLayout2.addView(linearLayout4);
    }

    private final InterfaceC3488x0 R3(File file, Uri uri, O4.e eVar) {
        InterfaceC3488x0 d8;
        d8 = AbstractC3462k.d(n6.N.a(C3445b0.b()), null, null, new C2721p(file, uri, eVar, this, null), 3, null);
        return d8;
    }

    private final void R4() {
        Intent intent = new Intent();
        DocumentFile documentFile = this.f30699T;
        if (documentFile != null) {
            AbstractC3292y.f(documentFile);
            if (documentFile.canWrite()) {
                DocumentFile documentFile2 = this.f30699T;
                AbstractC3292y.f(documentFile2);
                intent.setData(documentFile2.getUri());
            } else {
                k5();
                return;
            }
        } else {
            File file = this.f30703X;
            AbstractC3292y.f(file);
            if (file.canWrite()) {
                File file2 = this.f30703X;
                AbstractC3292y.f(file2);
                intent.putExtra("path_selected", file2.getAbsolutePath());
            } else {
                k5();
                return;
            }
        }
        intent.putExtra("sdcard_selected", this.f30705Z);
        setResult(145, intent);
        finish();
    }

    private final InterfaceC3488x0 S3(File file, String str, O4.e eVar) {
        InterfaceC3488x0 d8;
        d8 = AbstractC3462k.d(n6.N.a(C3445b0.b()), null, null, new C2720o(file, str, eVar, this, null), 3, null);
        return d8;
    }

    private final void S4() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: K4.C
            @Override // java.lang.Runnable
            public final void run() {
                FileExplorerActivity.T4(FileExplorerActivity.this);
            }
        });
    }

    private final void T3() {
        AbstractC3462k.d(n6.N.a(C3445b0.b()), null, null, new C2724s(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T4(FileExplorerActivity this$0) {
        AbstractC3292y.i(this$0, "this$0");
        HorizontalScrollView horizontalScrollView = this$0.f30683D;
        LinearLayout linearLayout = null;
        if (horizontalScrollView == null) {
            AbstractC3292y.y("svBreadcrumb");
            horizontalScrollView = null;
        }
        LinearLayout linearLayout2 = this$0.f30682C;
        if (linearLayout2 == null) {
            AbstractC3292y.y("llBreadcrumb");
            linearLayout2 = null;
        }
        int right = linearLayout2.getRight();
        LinearLayout linearLayout3 = this$0.f30682C;
        if (linearLayout3 == null) {
            AbstractC3292y.y("llBreadcrumb");
        } else {
            linearLayout = linearLayout3;
        }
        horizontalScrollView.scrollTo(right, linearLayout.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object U3(U5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.uptodown.core.activities.FileExplorerActivity.C2725t
            if (r0 == 0) goto L13
            r0 = r9
            com.uptodown.core.activities.FileExplorerActivity$t r0 = (com.uptodown.core.activities.FileExplorerActivity.C2725t) r0
            int r1 = r0.f30837e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30837e = r1
            goto L18
        L13:
            com.uptodown.core.activities.FileExplorerActivity$t r0 = new com.uptodown.core.activities.FileExplorerActivity$t
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f30835c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f30837e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            Q5.t.b(r9)
            goto L9d
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            java.lang.Object r2 = r0.f30834b
            kotlin.jvm.internal.Q r2 = (kotlin.jvm.internal.Q) r2
            java.lang.Object r4 = r0.f30833a
            com.uptodown.core.activities.FileExplorerActivity r4 = (com.uptodown.core.activities.FileExplorerActivity) r4
            Q5.t.b(r9)
            goto L87
        L44:
            java.lang.Object r2 = r0.f30834b
            kotlin.jvm.internal.Q r2 = (kotlin.jvm.internal.Q) r2
            java.lang.Object r5 = r0.f30833a
            com.uptodown.core.activities.FileExplorerActivity r5 = (com.uptodown.core.activities.FileExplorerActivity) r5
            Q5.t.b(r9)
            goto L70
        L50:
            Q5.t.b(r9)
            kotlin.jvm.internal.Q r9 = new kotlin.jvm.internal.Q
            r9.<init>()
            n6.J0 r2 = n6.C3445b0.c()
            com.uptodown.core.activities.FileExplorerActivity$u r7 = new com.uptodown.core.activities.FileExplorerActivity$u
            r7.<init>(r6)
            r0.f30833a = r8
            r0.f30834b = r9
            r0.f30837e = r5
            java.lang.Object r2 = n6.AbstractC3458i.g(r2, r7, r0)
            if (r2 != r1) goto L6e
            return r1
        L6e:
            r5 = r8
            r2 = r9
        L70:
            n6.I r9 = n6.C3445b0.b()
            com.uptodown.core.activities.FileExplorerActivity$v r7 = new com.uptodown.core.activities.FileExplorerActivity$v
            r7.<init>(r2, r6)
            r0.f30833a = r5
            r0.f30834b = r2
            r0.f30837e = r4
            java.lang.Object r9 = n6.AbstractC3458i.g(r9, r7, r0)
            if (r9 != r1) goto L86
            return r1
        L86:
            r4 = r5
        L87:
            n6.J0 r9 = n6.C3445b0.c()
            com.uptodown.core.activities.FileExplorerActivity$w r5 = new com.uptodown.core.activities.FileExplorerActivity$w
            r5.<init>(r2, r6)
            r0.f30833a = r6
            r0.f30834b = r6
            r0.f30837e = r3
            java.lang.Object r9 = n6.AbstractC3458i.g(r9, r5, r0)
            if (r9 != r1) goto L9d
            return r1
        L9d:
            Q5.I r9 = Q5.I.f8786a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.FileExplorerActivity.U3(U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U4(String str) {
        CharSequence charSequence;
        boolean q8 = new L4.a(this).q();
        if (str == null) {
            SearchView searchView = this.f30687H;
            if (searchView != null) {
                charSequence = searchView.getQuery();
            } else {
                charSequence = null;
            }
            str = String.valueOf(charSequence);
        }
        if (str.length() > 0 || !q8) {
            ArrayList arrayList = this.f30701V;
            if (arrayList != null) {
                AbstractC3292y.f(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    File file = (File) obj;
                    String name = file.getName();
                    AbstractC3292y.h(name, "file.name");
                    if (n.E(name, str, true)) {
                        if (!q8) {
                            String name2 = file.getName();
                            AbstractC3292y.h(name2, "file.name");
                            if (!n.B(name2, ".", false, 2, null)) {
                            }
                        }
                        arrayList2.add(obj);
                    }
                }
                this.f30702W = arrayList2;
                return;
            }
            ArrayList arrayList3 = this.f30697R;
            if (arrayList3 != null) {
                AbstractC3292y.f(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    DocumentFile documentFile = (DocumentFile) obj2;
                    String name3 = documentFile.getName();
                    AbstractC3292y.f(name3);
                    if (n.E(name3, str, true)) {
                        if (!q8) {
                            String name4 = documentFile.getName();
                            AbstractC3292y.f(name4);
                            if (!n.B(name4, ".", false, 2, null)) {
                            }
                        }
                        arrayList4.add(obj2);
                    }
                }
                this.f30698S = arrayList4;
                return;
            }
            return;
        }
        ArrayList arrayList5 = this.f30701V;
        if (arrayList5 != null) {
            this.f30702W = arrayList5;
            return;
        }
        ArrayList arrayList6 = this.f30697R;
        if (arrayList6 != null) {
            this.f30698S = arrayList6;
        }
    }

    private final void V3(Object obj) {
        kotlin.jvm.internal.T t8;
        AlertDialog alertDialog;
        if (!isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            LayoutInflater layoutInflater = getLayoutInflater();
            AbstractC3292y.h(layoutInflater, "layoutInflater");
            View inflate = layoutInflater.inflate(J4.f.f4306g, (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(e.f4224a1);
            j.a aVar = j.f4395g;
            textView.setTypeface(aVar.u());
            TextView textView2 = (TextView) inflate.findViewById(e.f4199S0);
            textView2.setTypeface(aVar.v());
            RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(e.f4204U);
            final EditText editText = (EditText) inflate.findViewById(e.f4261n);
            editText.setTypeface(aVar.v());
            TextView textView3 = (TextView) inflate.findViewById(e.f4208V0);
            textView3.setTypeface(aVar.v());
            textView3.setText(".zip");
            ((TextView) inflate.findViewById(e.f4217Y0)).setTypeface(aVar.v());
            TextView textView4 = (TextView) inflate.findViewById(e.f4214X0);
            textView4.setTypeface(aVar.v());
            TextView textView5 = (TextView) inflate.findViewById(e.f4173J1);
            textView5.setTypeface(aVar.u());
            TextView textView6 = (TextView) inflate.findViewById(e.f4262n0);
            textView6.setTypeface(aVar.u());
            TextView textView7 = (TextView) inflate.findViewById(e.f4145A0);
            textView7.setTypeface(aVar.u());
            ProgressBar progressBar = (ProgressBar) inflate.findViewById(e.f4153D);
            kotlin.jvm.internal.T t9 = new kotlin.jvm.internal.T();
            ArrayList arrayList = new ArrayList();
            t9.f34573a = arrayList;
            if (obj != null) {
                arrayList.add(obj);
            } else {
                b bVar = this.f30696Q;
                AbstractC3292y.f(bVar);
                t9.f34573a = bVar.b();
            }
            final ArrayList arrayList2 = new ArrayList();
            if (!((Collection) t9.f34573a).isEmpty()) {
                Iterator it = ((ArrayList) t9.f34573a).iterator();
                String str = "";
                while (it.hasNext()) {
                    Object next = it.next();
                    Iterator it2 = it;
                    kotlin.jvm.internal.T t10 = t9;
                    if (next instanceof File) {
                        str = str + ((File) next).getName() + '\n';
                        arrayList2.add(next);
                    } else if (next instanceof DocumentFile) {
                        str = str + ((DocumentFile) next).getName() + '\n';
                    }
                    it = it2;
                    t9 = t10;
                }
                t8 = t9;
                textView4.setText(str);
            } else {
                t8 = t9;
            }
            final kotlin.jvm.internal.T t11 = new kotlin.jvm.internal.T();
            final C2729x c2729x = new C2729x(progressBar, textView5, editText, this, textView6, textView2, relativeLayout, textView7);
            final kotlin.jvm.internal.T t12 = t8;
            textView6.setOnClickListener(new View.OnClickListener() { // from class: K4.I
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.W3(editText, t12, this, arrayList2, t11, c2729x, view);
                }
            });
            textView7.setOnClickListener(new View.OnClickListener() { // from class: K4.J
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.X3(kotlin.jvm.internal.T.this, this, view);
                }
            });
            builder.setView(inflate);
            this.f30693N = builder.create();
            if (!isFinishing() && (alertDialog = this.f30693N) != null) {
                AbstractC3292y.f(alertDialog);
                Window window = alertDialog.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog alertDialog2 = this.f30693N;
                AbstractC3292y.f(alertDialog2);
                alertDialog2.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V4() {
        String str;
        DocumentFile documentFile = this.f30699T;
        RecyclerView recyclerView = null;
        if (documentFile != null) {
            AbstractC3292y.f(documentFile);
            String lastPathSegment = documentFile.getUri().getLastPathSegment();
            if (lastPathSegment != null) {
                str = lastPathSegment.substring(n.X(lastPathSegment, ":", 0, false, 6, null) + 1);
                AbstractC3292y.h(str, "this as java.lang.String).substring(startIndex)");
            } else {
                str = "";
            }
            if (this.f30705Z) {
                if (str.length() == 0) {
                    TextView textView = this.f30713w;
                    if (textView == null) {
                        AbstractC3292y.y("tvBreadCrumb");
                        textView = null;
                    }
                    textView.setText(getString(h.f4370k0));
                } else {
                    p3();
                }
            } else {
                TextView textView2 = this.f30713w;
                if (textView2 == null) {
                    AbstractC3292y.y("tvBreadCrumb");
                    textView2 = null;
                }
                textView2.setText(getString(h.f4343U) + '/' + str);
            }
        } else {
            File file = this.f30703X;
            if (file != null) {
                if (AbstractC3292y.d(file, Environment.getExternalStorageDirectory())) {
                    TextView textView3 = this.f30713w;
                    if (textView3 == null) {
                        AbstractC3292y.y("tvBreadCrumb");
                        textView3 = null;
                    }
                    textView3.setText(getString(h.f4343U));
                } else {
                    q3();
                }
            }
        }
        if (this.f30696Q == null) {
            this.f30696Q = new b(this.f30716x0);
            RecyclerView recyclerView2 = this.f30715x;
            if (recyclerView2 == null) {
                AbstractC3292y.y("rvFiles");
            } else {
                recyclerView = recyclerView2;
            }
            recyclerView.setAdapter(this.f30696Q);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f30698S;
        if (arrayList2 != null) {
            AbstractC3292y.f(arrayList2);
            arrayList.addAll(arrayList2);
        } else {
            ArrayList arrayList3 = this.f30702W;
            if (arrayList3 != null) {
                AbstractC3292y.f(arrayList3);
                arrayList.addAll(arrayList3);
            }
        }
        b bVar = this.f30696Q;
        AbstractC3292y.f(bVar);
        bVar.g(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W3(EditText editText, kotlin.jvm.internal.T itemsToCompress, FileExplorerActivity this$0, ArrayList filesPath, kotlin.jvm.internal.T compressFilesJob, C2729x compressListener, View view) {
        int i8;
        String str;
        AbstractC3292y.i(itemsToCompress, "$itemsToCompress");
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(filesPath, "$filesPath");
        AbstractC3292y.i(compressFilesJob, "$compressFilesJob");
        AbstractC3292y.i(compressListener, "$compressListener");
        if (editText.getText().toString().length() > 0) {
            if (!((Collection) itemsToCompress.f34573a).isEmpty()) {
                File file = this$0.f30703X;
                long j8 = 0;
                if (file != null) {
                    AbstractC3292y.f(file);
                    long usableSpace = file.getUsableSpace();
                    Iterator it = filesPath.iterator();
                    while (it.hasNext()) {
                        j8 += ((File) it.next()).length();
                    }
                    if (usableSpace > j8 * 2) {
                        StringBuilder sb = new StringBuilder();
                        File file2 = this$0.f30703X;
                        if (file2 != null) {
                            str = file2.getAbsolutePath();
                        } else {
                            str = null;
                        }
                        sb.append(str);
                        sb.append('/');
                        sb.append((Object) editText.getText());
                        sb.append(".zip");
                        File file3 = new File(sb.toString());
                        if (!file3.exists()) {
                            j.f4395g.d(this$0, editText);
                            compressFilesJob.f34573a = this$0.x3(filesPath, file3, compressListener);
                            return;
                        } else {
                            Toast.makeText(this$0, this$0.getString(h.f4359f, editText.getText()), 0).show();
                            return;
                        }
                    }
                    Toast.makeText(this$0, this$0.getString(h.f4330H), 0).show();
                    return;
                }
                if (this$0.f30699T != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = ((ArrayList) itemsToCompress.f34573a).iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (next instanceof DocumentFile) {
                            arrayList.add(next);
                        }
                    }
                    S4.f fVar = new S4.f();
                    Context applicationContext = this$0.getApplicationContext();
                    AbstractC3292y.h(applicationContext, "applicationContext");
                    DocumentFile documentFile = this$0.f30699T;
                    AbstractC3292y.f(documentFile);
                    long l8 = fVar.l(applicationContext, documentFile);
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        j8 += ((DocumentFile) it3.next()).length();
                    }
                    if (l8 > j8 * 2) {
                        String str2 = ((Object) editText.getText()) + ".zip";
                        DocumentFile documentFile2 = this$0.f30699T;
                        AbstractC3292y.f(documentFile2);
                        DocumentFile[] listFiles = documentFile2.listFiles();
                        AbstractC3292y.h(listFiles, "currentDirectoryDocumentFile!!.listFiles()");
                        int length = listFiles.length;
                        boolean z8 = false;
                        int i9 = 0;
                        while (i9 < length) {
                            if (AbstractC3292y.d(listFiles[i9].getName(), str2)) {
                                i8 = 1;
                                Toast.makeText(this$0, this$0.getString(h.f4359f, editText.getText()), 0).show();
                                z8 = true;
                            } else {
                                i8 = 1;
                            }
                            i9 += i8;
                        }
                        if (!z8) {
                            j.f4395g.d(this$0, editText);
                            DocumentFile documentFile3 = this$0.f30699T;
                            AbstractC3292y.f(documentFile3);
                            DocumentFile createFile = documentFile3.createFile(new S4.f().i(str2), str2);
                            AbstractC3292y.f(createFile);
                            compressFilesJob.f34573a = this$0.w3(arrayList, createFile, compressListener);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        Toast.makeText(this$0, h.f4361g, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W4() {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            this.f30703X = externalStorageDirectory;
            this.f30699T = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X3(kotlin.jvm.internal.T compressFilesJob, FileExplorerActivity this$0, View view) {
        AbstractC3292y.i(compressFilesJob, "$compressFilesJob");
        AbstractC3292y.i(this$0, "this$0");
        InterfaceC3488x0 interfaceC3488x0 = (InterfaceC3488x0) compressFilesJob.f34573a;
        if (interfaceC3488x0 != null) {
            InterfaceC3488x0.a.a(interfaceC3488x0, null, 1, null);
        }
        AlertDialog alertDialog = this$0.f30693N;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X4() {
        int i8;
        MenuItem menuItem;
        MenuItem menuItem2;
        MenuItem menuItem3;
        Menu menu;
        Menu menu2;
        Menu menu3;
        Menu menu4;
        MenuItem menuItem4;
        MenuItem menuItem5;
        MenuItem menuItem6;
        Menu menu5;
        Menu menu6;
        Menu menu7;
        Menu menu8;
        b bVar = this.f30696Q;
        if (bVar != null) {
            AbstractC3292y.f(bVar);
            i8 = bVar.a();
        } else {
            i8 = 0;
        }
        MenuItem menuItem7 = null;
        if (i8 > 0) {
            Toolbar toolbar = this.f30694O;
            if (toolbar != null && (menu8 = toolbar.getMenu()) != null) {
                menuItem4 = menu8.findItem(e.f4234e);
            } else {
                menuItem4 = null;
            }
            if (menuItem4 != null) {
                menuItem4.setEnabled(true);
            }
            Toolbar toolbar2 = this.f30694O;
            if (toolbar2 != null && (menu7 = toolbar2.getMenu()) != null) {
                menuItem5 = menu7.findItem(e.f4225b);
            } else {
                menuItem5 = null;
            }
            if (menuItem5 != null) {
                menuItem5.setEnabled(true);
            }
            Toolbar toolbar3 = this.f30694O;
            if (toolbar3 != null && (menu6 = toolbar3.getMenu()) != null) {
                menuItem6 = menu6.findItem(e.f4231d);
            } else {
                menuItem6 = null;
            }
            if (menuItem6 != null) {
                menuItem6.setEnabled(true);
            }
            Toolbar toolbar4 = this.f30694O;
            if (toolbar4 != null && (menu5 = toolbar4.getMenu()) != null) {
                menuItem7 = menu5.findItem(e.f4222a);
            }
            if (menuItem7 != null) {
                menuItem7.setEnabled(true);
            }
        } else {
            Toolbar toolbar5 = this.f30694O;
            if (toolbar5 != null && (menu4 = toolbar5.getMenu()) != null) {
                menuItem = menu4.findItem(e.f4234e);
            } else {
                menuItem = null;
            }
            if (menuItem != null) {
                menuItem.setEnabled(false);
            }
            Toolbar toolbar6 = this.f30694O;
            if (toolbar6 != null && (menu3 = toolbar6.getMenu()) != null) {
                menuItem2 = menu3.findItem(e.f4225b);
            } else {
                menuItem2 = null;
            }
            if (menuItem2 != null) {
                menuItem2.setEnabled(false);
            }
            Toolbar toolbar7 = this.f30694O;
            if (toolbar7 != null && (menu2 = toolbar7.getMenu()) != null) {
                menuItem3 = menu2.findItem(e.f4231d);
            } else {
                menuItem3 = null;
            }
            if (menuItem3 != null) {
                menuItem3.setEnabled(false);
            }
            Toolbar toolbar8 = this.f30694O;
            if (toolbar8 != null && (menu = toolbar8.getMenu()) != null) {
                menuItem7 = menu.findItem(e.f4222a);
            }
            if (menuItem7 != null) {
                menuItem7.setEnabled(false);
            }
        }
        TextView textView = this.f30695P;
        if (textView != null) {
            textView.setText(getString(h.f4323A, String.valueOf(i8)));
        }
    }

    private final void Y3() {
        AlertDialog alertDialog;
        if (!isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            LayoutInflater layoutInflater = getLayoutInflater();
            AbstractC3292y.h(layoutInflater, "layoutInflater");
            View inflate = layoutInflater.inflate(J4.f.f4308i, (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(e.f4227b1);
            j.a aVar = j.f4395g;
            textView.setTypeface(aVar.u());
            ((TextView) inflate.findViewById(e.f4202T0)).setTypeface(aVar.v());
            final EditText editText = (EditText) inflate.findViewById(e.f4264o);
            editText.setTypeface(aVar.v());
            TextView textView2 = (TextView) inflate.findViewById(e.f4265o0);
            textView2.setTypeface(aVar.u());
            TextView textView3 = (TextView) inflate.findViewById(e.f4148B0);
            textView3.setTypeface(aVar.u());
            textView2.setOnClickListener(new View.OnClickListener() { // from class: K4.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.Z3(editText, this, view);
                }
            });
            textView3.setOnClickListener(new View.OnClickListener() { // from class: K4.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.a4(FileExplorerActivity.this, view);
                }
            });
            builder.setView(inflate);
            this.f30693N = builder.create();
            if (!isFinishing() && (alertDialog = this.f30693N) != null) {
                AbstractC3292y.f(alertDialog);
                Window window = alertDialog.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog alertDialog2 = this.f30693N;
                AbstractC3292y.f(alertDialog2);
                alertDialog2.show();
            }
        }
    }

    private final void Y4() {
        if (!this.f30704Y) {
            RadioButton radioButton = this.f30692M;
            AbstractC3292y.f(radioButton);
            radioButton.setBackground(ContextCompat.getDrawable(this, J4.d.f4133j));
            RadioButton radioButton2 = this.f30691L;
            AbstractC3292y.f(radioButton2);
            radioButton2.setBackground(ContextCompat.getDrawable(this, J4.d.f4136m));
            RadioButton radioButton3 = this.f30690K;
            AbstractC3292y.f(radioButton3);
            radioButton3.setBackground(ContextCompat.getDrawable(this, J4.d.f4128e));
            return;
        }
        RadioButton radioButton4 = this.f30692M;
        AbstractC3292y.f(radioButton4);
        radioButton4.setBackground(ContextCompat.getDrawable(this, J4.d.f4135l));
        RadioButton radioButton5 = this.f30691L;
        AbstractC3292y.f(radioButton5);
        radioButton5.setBackground(ContextCompat.getDrawable(this, J4.d.f4138o));
        RadioButton radioButton6 = this.f30690K;
        AbstractC3292y.f(radioButton6);
        radioButton6.setBackground(ContextCompat.getDrawable(this, J4.d.f4130g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z3(EditText editText, FileExplorerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        if (editText.getText().toString().length() > 0) {
            AbstractC3462k.d(n6.N.a(C3445b0.b()), null, null, new C2730y(editText, null), 3, null);
        } else {
            Toast.makeText(this$0, h.f4361g, 0).show();
        }
    }

    private final void Z4() {
        if (!this.f30704Y) {
            RadioButton radioButton = this.f30690K;
            AbstractC3292y.f(radioButton);
            radioButton.setBackground(ContextCompat.getDrawable(this, J4.d.f4129f));
            RadioButton radioButton2 = this.f30691L;
            AbstractC3292y.f(radioButton2);
            radioButton2.setBackground(ContextCompat.getDrawable(this, J4.d.f4136m));
            RadioButton radioButton3 = this.f30692M;
            AbstractC3292y.f(radioButton3);
            radioButton3.setBackground(ContextCompat.getDrawable(this, J4.d.f4132i));
            return;
        }
        RadioButton radioButton4 = this.f30690K;
        AbstractC3292y.f(radioButton4);
        radioButton4.setBackground(ContextCompat.getDrawable(this, J4.d.f4131h));
        RadioButton radioButton5 = this.f30691L;
        AbstractC3292y.f(radioButton5);
        radioButton5.setBackground(ContextCompat.getDrawable(this, J4.d.f4138o));
        RadioButton radioButton6 = this.f30692M;
        AbstractC3292y.f(radioButton6);
        radioButton6.setBackground(ContextCompat.getDrawable(this, J4.d.f4134k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a4(FileExplorerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f30693N;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    private final void a5() {
        if (!this.f30704Y) {
            RadioButton radioButton = this.f30691L;
            AbstractC3292y.f(radioButton);
            radioButton.setBackground(ContextCompat.getDrawable(this, J4.d.f4137n));
            RadioButton radioButton2 = this.f30690K;
            AbstractC3292y.f(radioButton2);
            radioButton2.setBackground(ContextCompat.getDrawable(this, J4.d.f4128e));
            RadioButton radioButton3 = this.f30692M;
            AbstractC3292y.f(radioButton3);
            radioButton3.setBackground(ContextCompat.getDrawable(this, J4.d.f4132i));
            return;
        }
        RadioButton radioButton4 = this.f30691L;
        AbstractC3292y.f(radioButton4);
        radioButton4.setBackground(ContextCompat.getDrawable(this, J4.d.f4139p));
        RadioButton radioButton5 = this.f30690K;
        AbstractC3292y.f(radioButton5);
        radioButton5.setBackground(ContextCompat.getDrawable(this, J4.d.f4130g));
        RadioButton radioButton6 = this.f30692M;
        AbstractC3292y.f(radioButton6);
        radioButton6.setBackground(ContextCompat.getDrawable(this, J4.d.f4134k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b4(final Object obj) {
        String str;
        AlertDialog alertDialog;
        if (!isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            LayoutInflater layoutInflater = getLayoutInflater();
            AbstractC3292y.h(layoutInflater, "layoutInflater");
            TextView textView = null;
            View inflate = layoutInflater.inflate(J4.f.f4309j, (ViewGroup) null, false);
            TextView textView2 = (TextView) inflate.findViewById(e.f4230c1);
            j.a aVar = j.f4395g;
            textView2.setTypeface(aVar.u());
            TextView textView3 = (TextView) inflate.findViewById(e.f4205U0);
            textView3.setTypeface(aVar.v());
            RadioButton radioButton = (RadioButton) inflate.findViewById(e.f4174K);
            radioButton.setTypeface(aVar.v());
            RadioButton radioButton2 = (RadioButton) inflate.findViewById(e.f4177L);
            radioButton2.setTypeface(aVar.v());
            View findViewById = inflate.findViewById(e.f4196R0);
            AbstractC3292y.h(findViewById, "view.findViewById(R.id.t…decompress_selected_path)");
            TextView textView4 = (TextView) findViewById;
            this.f30685F = textView4;
            if (textView4 == null) {
                AbstractC3292y.y("tvSelectedPath");
                textView4 = null;
            }
            textView4.setTypeface(aVar.v());
            final kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
            if (obj instanceof File) {
                t8.f34573a = ((File) obj).getParent();
            } else if (obj instanceof DocumentFile) {
                DocumentFile documentFile = this.f30699T;
                AbstractC3292y.f(documentFile);
                String lastPathSegment = documentFile.getUri().getLastPathSegment();
                if (lastPathSegment != null) {
                    DocumentFile documentFile2 = this.f30699T;
                    AbstractC3292y.f(documentFile2);
                    String lastPathSegment2 = documentFile2.getUri().getLastPathSegment();
                    AbstractC3292y.f(lastPathSegment2);
                    str = lastPathSegment.substring(n.X(lastPathSegment2, ":", 0, false, 6, null) + 1);
                    AbstractC3292y.h(str, "this as java.lang.String).substring(startIndex)");
                } else {
                    str = null;
                }
                t8.f34573a = getString(h.f4370k0) + '/' + str;
            }
            TextView textView5 = this.f30685F;
            if (textView5 == null) {
                AbstractC3292y.y("tvSelectedPath");
                textView5 = null;
            }
            textView5.setText((CharSequence) t8.f34573a);
            this.f30714w0 = (String) t8.f34573a;
            TextView textView6 = (TextView) inflate.findViewById(e.f4262n0);
            textView6.setTypeface(aVar.u());
            TextView textView7 = (TextView) inflate.findViewById(e.f4151C0);
            textView7.setTypeface(aVar.u());
            ProgressBar progressBar = (ProgressBar) inflate.findViewById(e.f4156E);
            TextView textView8 = this.f30685F;
            if (textView8 == null) {
                AbstractC3292y.y("tvSelectedPath");
            } else {
                textView = textView8;
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: K4.Q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.c4(FileExplorerActivity.this, view);
                }
            });
            radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: K4.S
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                    FileExplorerActivity.d4(FileExplorerActivity.this, t8, compoundButton, z8);
                }
            });
            radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: K4.T
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                    FileExplorerActivity.e4(FileExplorerActivity.this, compoundButton, z8);
                }
            });
            final kotlin.jvm.internal.T t9 = new kotlin.jvm.internal.T();
            final C2731z c2731z = new C2731z(textView3, this, inflate, progressBar, textView6, textView7);
            textView6.setOnClickListener(new View.OnClickListener() { // from class: K4.U
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.f4(obj, this, t9, c2731z, view);
                }
            });
            textView7.setOnClickListener(new View.OnClickListener() { // from class: K4.V
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.g4(kotlin.jvm.internal.T.this, this, view);
                }
            });
            builder.setView(inflate);
            this.f30693N = builder.create();
            if (!isFinishing() && (alertDialog = this.f30693N) != null) {
                AbstractC3292y.f(alertDialog);
                Window window = alertDialog.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog alertDialog2 = this.f30693N;
                AbstractC3292y.f(alertDialog2);
                alertDialog2.show();
            }
        }
    }

    private final void b5(boolean z8) {
        LinearLayout linearLayout = null;
        if (z8) {
            TextView textView = this.f30684E;
            if (textView == null) {
                AbstractC3292y.y("tvEmptyDirectory");
                textView = null;
            }
            textView.setText(getString(h.f4328F));
        } else {
            TextView textView2 = this.f30684E;
            if (textView2 == null) {
                AbstractC3292y.y("tvEmptyDirectory");
                textView2 = null;
            }
            textView2.setText(getString(h.f4356d0));
        }
        LinearLayout linearLayout2 = this.f30680B;
        if (linearLayout2 == null) {
            AbstractC3292y.y("llEmptyDirectory");
        } else {
            linearLayout = linearLayout2;
        }
        linearLayout.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c4(FileExplorerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        Intent intent = new Intent(this$0.getApplicationContext(), (Class<?>) FileExplorerActivity.class);
        intent.putExtra("select_path", 1);
        this$0.f30681B0.launch(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c5(String str) {
        int i8 = 0;
        if (str != null) {
            ArrayList arrayList = this.f30698S;
            if (arrayList != null) {
                AbstractC3292y.f(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    DocumentFile documentFile = (DocumentFile) it.next();
                    if (documentFile.getName() != null && n.s(documentFile.getName(), str, true)) {
                        break;
                    } else {
                        i8++;
                    }
                }
            } else {
                ArrayList arrayList2 = this.f30702W;
                if (arrayList2 != null) {
                    AbstractC3292y.f(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext() && !n.s(((File) it2.next()).getName(), str, true)) {
                        i8++;
                    }
                }
            }
        }
        RecyclerView recyclerView = this.f30715x;
        if (recyclerView == null) {
            AbstractC3292y.y("rvFiles");
            recyclerView = null;
        }
        recyclerView.scrollToPosition(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d4(FileExplorerActivity this$0, kotlin.jvm.internal.T parentPath, CompoundButton compoundButton, boolean z8) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(parentPath, "$parentPath");
        if (z8) {
            TextView textView = this$0.f30685F;
            TextView textView2 = null;
            if (textView == null) {
                AbstractC3292y.y("tvSelectedPath");
                textView = null;
            }
            textView.setVisibility(8);
            TextView textView3 = this$0.f30685F;
            if (textView3 == null) {
                AbstractC3292y.y("tvSelectedPath");
            } else {
                textView2 = textView3;
            }
            textView2.setText((CharSequence) parentPath.f34573a);
        }
    }

    private final void d5(String str) {
        if (str != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            Uri uriForFile = FileProvider.getUriForFile(this, getPackageName() + ".provider", new File(str));
            intent.setType(getContentResolver().getType(uriForFile));
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            startActivity(Intent.createChooser(intent, getString(h.f4342T)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e4(FileExplorerActivity this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3292y.i(this$0, "this$0");
        if (z8) {
            TextView textView = this$0.f30685F;
            if (textView == null) {
                AbstractC3292y.y("tvSelectedPath");
                textView = null;
            }
            textView.setVisibility(0);
        }
    }

    private final void e5() {
        MenuItem menuItem;
        MenuItem menuItem2;
        MenuItem menuItem3;
        MenuItem menuItem4;
        MenuItem menuItem5;
        MenuItem menuItem6;
        Menu menu;
        Menu menu2;
        Menu menu3;
        Menu menu4;
        Menu menu5;
        Menu menu6;
        Menu menu7;
        Toolbar toolbar = this.f30694O;
        MenuItem menuItem7 = null;
        if (toolbar != null && (menu7 = toolbar.getMenu()) != null) {
            menuItem = menu7.findItem(e.f4240g);
        } else {
            menuItem = null;
        }
        if (menuItem != null) {
            menuItem.setVisible(false);
        }
        Toolbar toolbar2 = this.f30694O;
        if (toolbar2 != null && (menu6 = toolbar2.getMenu()) != null) {
            menuItem2 = menu6.findItem(e.f4234e);
        } else {
            menuItem2 = null;
        }
        if (menuItem2 != null) {
            menuItem2.setVisible(true);
        }
        Toolbar toolbar3 = this.f30694O;
        if (toolbar3 != null && (menu5 = toolbar3.getMenu()) != null) {
            menuItem3 = menu5.findItem(e.f4228c);
        } else {
            menuItem3 = null;
        }
        if (menuItem3 != null) {
            menuItem3.setVisible(true);
        }
        Toolbar toolbar4 = this.f30694O;
        if (toolbar4 != null && (menu4 = toolbar4.getMenu()) != null) {
            menuItem4 = menu4.findItem(e.f4225b);
        } else {
            menuItem4 = null;
        }
        if (menuItem4 != null) {
            menuItem4.setVisible(true);
        }
        Toolbar toolbar5 = this.f30694O;
        if (toolbar5 != null && (menu3 = toolbar5.getMenu()) != null) {
            menuItem5 = menu3.findItem(e.f4222a);
        } else {
            menuItem5 = null;
        }
        if (menuItem5 != null) {
            menuItem5.setVisible(true);
        }
        Toolbar toolbar6 = this.f30694O;
        if (toolbar6 != null && (menu2 = toolbar6.getMenu()) != null) {
            menuItem6 = menu2.findItem(e.f4231d);
        } else {
            menuItem6 = null;
        }
        if (menuItem6 != null) {
            menuItem6.setVisible(true);
        }
        X4();
        ArrayList arrayList = this.f30707q0;
        if (arrayList != null) {
            AbstractC3292y.f(arrayList);
            if (!arrayList.isEmpty()) {
                Toolbar toolbar7 = this.f30694O;
                if (toolbar7 != null && (menu = toolbar7.getMenu()) != null) {
                    menuItem7 = menu.findItem(e.f4237f);
                }
                if (menuItem7 != null) {
                    menuItem7.setVisible(true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f4(Object file, FileExplorerActivity this$0, kotlin.jvm.internal.T decompressFilesJob, C2731z decompressFileListener, View view) {
        long usableSpace;
        Long l8;
        AbstractC3292y.i(file, "$file");
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(decompressFilesJob, "$decompressFilesJob");
        AbstractC3292y.i(decompressFileListener, "$decompressFileListener");
        if (file instanceof File) {
            if (this$0.f30714w0 != null) {
                File file2 = this$0.f30703X;
                if (file2 != null) {
                    l8 = Long.valueOf(file2.getUsableSpace());
                } else {
                    l8 = null;
                }
                AbstractC3292y.f(l8);
                File file3 = (File) file;
                if (l8.longValue() > file3.length() * 2) {
                    String str = this$0.f30714w0;
                    AbstractC3292y.f(str);
                    decompressFilesJob.f34573a = this$0.S3(file3, str, decompressFileListener);
                    return;
                }
                return;
            }
            if (this$0.f30712v0 != null) {
                S4.f fVar = new S4.f();
                Context applicationContext = this$0.getApplicationContext();
                AbstractC3292y.h(applicationContext, "applicationContext");
                Uri uri = this$0.f30712v0;
                AbstractC3292y.f(uri);
                File file4 = (File) file;
                if (fVar.k(applicationContext, uri) > file4.length() * 2) {
                    Uri uri2 = this$0.f30712v0;
                    AbstractC3292y.f(uri2);
                    decompressFilesJob.f34573a = this$0.R3(file4, uri2, decompressFileListener);
                    return;
                }
                return;
            }
            return;
        }
        if (file instanceof DocumentFile) {
            if (this$0.f30714w0 != null) {
                File file5 = this$0.f30703X;
                if (file5 == null) {
                    File externalStorageDirectory = Environment.getExternalStorageDirectory();
                    if (externalStorageDirectory != null) {
                        usableSpace = externalStorageDirectory.getUsableSpace();
                    } else {
                        usableSpace = 0;
                    }
                } else {
                    AbstractC3292y.f(file5);
                    usableSpace = file5.getUsableSpace();
                }
                DocumentFile documentFile = (DocumentFile) file;
                if (usableSpace > documentFile.length() * 2) {
                    String str2 = this$0.f30714w0;
                    AbstractC3292y.f(str2);
                    decompressFilesJob.f34573a = this$0.Q3(documentFile, str2, decompressFileListener);
                    return;
                }
                return;
            }
            if (this$0.f30712v0 != null) {
                S4.f fVar2 = new S4.f();
                Context applicationContext2 = this$0.getApplicationContext();
                AbstractC3292y.h(applicationContext2, "applicationContext");
                Uri uri3 = this$0.f30712v0;
                AbstractC3292y.f(uri3);
                DocumentFile documentFile2 = (DocumentFile) file;
                if (fVar2.k(applicationContext2, uri3) > documentFile2.length() * 2) {
                    Uri uri4 = this$0.f30712v0;
                    AbstractC3292y.f(uri4);
                    decompressFilesJob.f34573a = this$0.P3(documentFile2, uri4, decompressFileListener);
                    return;
                }
                return;
            }
            DocumentFile documentFile3 = this$0.f30699T;
            if (documentFile3 != null) {
                AbstractC3292y.f(documentFile3);
                Uri uri5 = documentFile3.getUri();
                AbstractC3292y.h(uri5, "currentDirectoryDocumentFile!!.uri");
                decompressFilesJob.f34573a = this$0.P3((DocumentFile) file, uri5, decompressFileListener);
                return;
            }
            File file6 = this$0.f30703X;
            if (file6 != null) {
                AbstractC3292y.f(file6);
                String absolutePath = file6.getAbsolutePath();
                AbstractC3292y.h(absolutePath, "currentDirFile!!.absolutePath");
                decompressFilesJob.f34573a = this$0.Q3((DocumentFile) file, absolutePath, decompressFileListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f5() {
        if (this.f30704Y) {
            ArrayList arrayList = this.f30698S;
            if (arrayList != null) {
                AbstractC3292y.f(arrayList);
                if (arrayList.size() > 1) {
                    AbstractC1435t.B(arrayList, new P());
                }
                ArrayList arrayList2 = this.f30698S;
                AbstractC3292y.f(arrayList2);
                if (arrayList2.size() > 1) {
                    AbstractC1435t.B(arrayList2, new Q());
                }
            }
            ArrayList arrayList3 = this.f30702W;
            if (arrayList3 != null) {
                AbstractC3292y.f(arrayList3);
                if (arrayList3.size() > 1) {
                    AbstractC1435t.B(arrayList3, new R());
                }
                ArrayList arrayList4 = this.f30702W;
                AbstractC3292y.f(arrayList4);
                if (arrayList4.size() > 1) {
                    AbstractC1435t.B(arrayList4, new S());
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList5 = this.f30698S;
        if (arrayList5 != null) {
            AbstractC3292y.f(arrayList5);
            if (arrayList5.size() > 1) {
                AbstractC1435t.B(arrayList5, new L());
            }
            ArrayList arrayList6 = this.f30698S;
            AbstractC3292y.f(arrayList6);
            if (arrayList6.size() > 1) {
                AbstractC1435t.B(arrayList6, new M());
            }
        }
        ArrayList arrayList7 = this.f30702W;
        if (arrayList7 != null) {
            AbstractC3292y.f(arrayList7);
            if (arrayList7.size() > 1) {
                AbstractC1435t.B(arrayList7, new N());
            }
            ArrayList arrayList8 = this.f30702W;
            AbstractC3292y.f(arrayList8);
            if (arrayList8.size() > 1) {
                AbstractC1435t.B(arrayList8, new O());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g4(kotlin.jvm.internal.T decompressFilesJob, FileExplorerActivity this$0, View view) {
        AbstractC3292y.i(decompressFilesJob, "$decompressFilesJob");
        AbstractC3292y.i(this$0, "this$0");
        InterfaceC3488x0 interfaceC3488x0 = (InterfaceC3488x0) decompressFilesJob.f34573a;
        if (interfaceC3488x0 != null) {
            InterfaceC3488x0.a.a(interfaceC3488x0, null, 1, null);
        }
        AlertDialog alertDialog = this$0.f30693N;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g5() {
        if (this.f30704Y) {
            ArrayList arrayList = this.f30698S;
            if (arrayList != null) {
                AbstractC3292y.f(arrayList);
                if (arrayList.size() > 1) {
                    AbstractC1435t.B(arrayList, new X());
                }
                ArrayList arrayList2 = this.f30698S;
                AbstractC3292y.f(arrayList2);
                if (arrayList2.size() > 1) {
                    AbstractC1435t.B(arrayList2, new Y());
                }
            }
            ArrayList arrayList3 = this.f30702W;
            if (arrayList3 != null) {
                AbstractC3292y.f(arrayList3);
                if (arrayList3.size() > 1) {
                    AbstractC1435t.B(arrayList3, new Z());
                }
                ArrayList arrayList4 = this.f30702W;
                AbstractC3292y.f(arrayList4);
                if (arrayList4.size() > 1) {
                    AbstractC1435t.B(arrayList4, new a0());
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList5 = this.f30698S;
        if (arrayList5 != null) {
            AbstractC3292y.f(arrayList5);
            if (arrayList5.size() > 1) {
                AbstractC1435t.B(arrayList5, new T());
            }
            ArrayList arrayList6 = this.f30698S;
            AbstractC3292y.f(arrayList6);
            if (arrayList6.size() > 1) {
                AbstractC1435t.B(arrayList6, new U());
            }
        }
        ArrayList arrayList7 = this.f30702W;
        if (arrayList7 != null) {
            AbstractC3292y.f(arrayList7);
            if (arrayList7.size() > 1) {
                AbstractC1435t.B(arrayList7, new V());
            }
            ArrayList arrayList8 = this.f30702W;
            AbstractC3292y.f(arrayList8);
            if (arrayList8.size() > 1) {
                AbstractC1435t.B(arrayList8, new W());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h4() {
        MenuItem menuItem;
        MenuItem menuItem2;
        MenuItem menuItem3;
        MenuItem menuItem4;
        MenuItem menuItem5;
        MenuItem menuItem6;
        Menu menu;
        Menu menu2;
        Menu menu3;
        Menu menu4;
        Menu menu5;
        Menu menu6;
        Menu menu7;
        TextView textView = this.f30695P;
        if (textView != null) {
            textView.setText(getString(h.f4349a));
        }
        Toolbar toolbar = this.f30694O;
        MenuItem menuItem7 = null;
        if (toolbar != null && (menu7 = toolbar.getMenu()) != null) {
            menuItem = menu7.findItem(e.f4240g);
        } else {
            menuItem = null;
        }
        if (menuItem != null) {
            menuItem.setVisible(true);
        }
        Toolbar toolbar2 = this.f30694O;
        if (toolbar2 != null && (menu6 = toolbar2.getMenu()) != null) {
            menuItem2 = menu6.findItem(e.f4228c);
        } else {
            menuItem2 = null;
        }
        if (menuItem2 != null) {
            menuItem2.setVisible(true);
        }
        Toolbar toolbar3 = this.f30694O;
        if (toolbar3 != null && (menu5 = toolbar3.getMenu()) != null) {
            menuItem3 = menu5.findItem(e.f4234e);
        } else {
            menuItem3 = null;
        }
        if (menuItem3 != null) {
            menuItem3.setVisible(false);
        }
        Toolbar toolbar4 = this.f30694O;
        if (toolbar4 != null && (menu4 = toolbar4.getMenu()) != null) {
            menuItem4 = menu4.findItem(e.f4225b);
        } else {
            menuItem4 = null;
        }
        if (menuItem4 != null) {
            menuItem4.setVisible(false);
        }
        Toolbar toolbar5 = this.f30694O;
        if (toolbar5 != null && (menu3 = toolbar5.getMenu()) != null) {
            menuItem5 = menu3.findItem(e.f4222a);
        } else {
            menuItem5 = null;
        }
        if (menuItem5 != null) {
            menuItem5.setVisible(false);
        }
        Toolbar toolbar6 = this.f30694O;
        if (toolbar6 != null && (menu2 = toolbar6.getMenu()) != null) {
            menuItem6 = menu2.findItem(e.f4231d);
        } else {
            menuItem6 = null;
        }
        if (menuItem6 != null) {
            menuItem6.setVisible(false);
        }
        Toolbar toolbar7 = this.f30694O;
        if (toolbar7 != null && (menu = toolbar7.getMenu()) != null) {
            menuItem7 = menu.findItem(e.f4237f);
        }
        if (menuItem7 != null) {
            menuItem7.setVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h5() {
        if (this.f30704Y) {
            ArrayList arrayList = this.f30698S;
            if (arrayList != null) {
                AbstractC3292y.f(arrayList);
                if (arrayList.size() > 1) {
                    AbstractC1435t.B(arrayList, new f0());
                }
                ArrayList arrayList2 = this.f30698S;
                AbstractC3292y.f(arrayList2);
                if (arrayList2.size() > 1) {
                    AbstractC1435t.B(arrayList2, new g0());
                }
            }
            ArrayList arrayList3 = this.f30702W;
            if (arrayList3 != null) {
                AbstractC3292y.f(arrayList3);
                if (arrayList3.size() > 1) {
                    AbstractC1435t.B(arrayList3, new h0());
                }
                ArrayList arrayList4 = this.f30702W;
                AbstractC3292y.f(arrayList4);
                if (arrayList4.size() > 1) {
                    AbstractC1435t.B(arrayList4, new i0());
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList5 = this.f30698S;
        if (arrayList5 != null) {
            AbstractC3292y.f(arrayList5);
            if (arrayList5.size() > 1) {
                AbstractC1435t.B(arrayList5, new b0());
            }
            ArrayList arrayList6 = this.f30698S;
            AbstractC3292y.f(arrayList6);
            if (arrayList6.size() > 1) {
                AbstractC1435t.B(arrayList6, new c0());
            }
        }
        ArrayList arrayList7 = this.f30702W;
        if (arrayList7 != null) {
            AbstractC3292y.f(arrayList7);
            if (arrayList7.size() > 1) {
                AbstractC1435t.B(arrayList7, new d0());
            }
            ArrayList arrayList8 = this.f30702W;
            AbstractC3292y.f(arrayList8);
            if (arrayList8.size() > 1) {
                AbstractC1435t.B(arrayList8, new e0());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i4(DocumentFile documentFile) {
        Application application = getApplication();
        AbstractC3292y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
        Uri uri = documentFile.getUri();
        AbstractC3292y.h(uri, "documentFile.uri");
        ((j) application).H(uri, new B(documentFile), this);
    }

    private final void i5(Uri uri) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(uri, getContentResolver().getType(uri));
        intent.addFlags(1);
        startActivity(Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j4(File file) {
        Application application = getApplication();
        AbstractC3292y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
        ((j) application).I(file, new A(file), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j5() {
        b bVar = this.f30696Q;
        AbstractC3292y.f(bVar);
        bVar.i(false);
        h4();
        l4(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k4(String str) {
        RelativeLayout relativeLayout = this.f30717y;
        if (relativeLayout == null) {
            AbstractC3292y.y("rlLoading");
            relativeLayout = null;
        }
        relativeLayout.setVisibility(0);
        if (this.f30699T == null && this.f30703X == null) {
            W4();
        }
        new N4.c(this.f30699T, this.f30703X, this, new D(str));
    }

    private final void k5() {
        Toast.makeText(this, getString(h.f4392y), 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l4(boolean z8) {
        SearchView searchView;
        if (z8 && (searchView = this.f30687H) != null) {
            v3(searchView);
        }
        k4(null);
    }

    static /* synthetic */ void m4(FileExplorerActivity fileExplorerActivity, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        fileExplorerActivity.l4(z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n4(FileExplorerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.R4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o4(FileExplorerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.finish();
    }

    private final void p3() {
        DocumentFile documentFile = this.f30699T;
        AbstractC3292y.f(documentFile);
        String lastPathSegment = documentFile.getUri().getLastPathSegment();
        LinearLayout linearLayout = this.f30682C;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            AbstractC3292y.y("llBreadcrumb");
            linearLayout = null;
        }
        if (linearLayout.findViewWithTag(lastPathSegment) == null) {
            LayoutInflater layoutInflater = getLayoutInflater();
            int i8 = J4.f.f4300a;
            LinearLayout linearLayout3 = this.f30682C;
            if (linearLayout3 == null) {
                AbstractC3292y.y("llBreadcrumb");
                linearLayout3 = null;
            }
            View inflate = layoutInflater.inflate(i8, (ViewGroup) linearLayout3, false);
            AbstractC3292y.g(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout4 = (LinearLayout) inflate;
            linearLayout4.setTag(lastPathSegment);
            TextView textView = (TextView) linearLayout4.findViewById(e.f4280t0);
            AbstractC3292y.f(lastPathSegment);
            String substring = lastPathSegment.substring(n.X(lastPathSegment, ":", 0, false, 6, null) + 1);
            AbstractC3292y.h(substring, "this as java.lang.String).substring(startIndex)");
            if (substring.length() > 0) {
                String substring2 = lastPathSegment.substring(n.X(lastPathSegment, ":", 0, false, 6, null) + 1);
                AbstractC3292y.h(substring2, "this as java.lang.String).substring(startIndex)");
                String substring3 = substring2.substring(n.X(substring2, "/", 0, false, 6, null) + 1);
                AbstractC3292y.h(substring3, "this as java.lang.String).substring(startIndex)");
                if (substring3.length() > 0) {
                    String substring4 = substring2.substring(n.X(substring2, "/", 0, false, 6, null) + 1);
                    AbstractC3292y.h(substring4, "this as java.lang.String).substring(startIndex)");
                    textView.setText(substring4);
                } else {
                    String substring5 = substring2.substring(n.X(substring2, ":", 0, false, 6, null) + 1);
                    AbstractC3292y.h(substring5, "this as java.lang.String).substring(startIndex)");
                    textView.setText(substring5);
                }
            }
            textView.setTypeface(j.f4395g.v());
            LinearLayout linearLayout5 = this.f30682C;
            if (linearLayout5 == null) {
                AbstractC3292y.y("llBreadcrumb");
            } else {
                linearLayout2 = linearLayout5;
            }
            linearLayout2.addView(linearLayout4);
            Q5.I i9 = Q5.I.f8786a;
            S4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p4(final FileExplorerActivity this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3292y.i(this$0, "this$0");
        if (z8) {
            this$0.f30704Y = !this$0.f30704Y;
            RadioButton radioButton = this$0.f30690K;
            AbstractC3292y.f(radioButton);
            radioButton.setOnClickListener(new View.OnClickListener() { // from class: K4.E
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.q4(FileExplorerActivity.this, view);
                }
            });
            RadioButton radioButton2 = this$0.f30691L;
            AbstractC3292y.f(radioButton2);
            radioButton2.setOnClickListener(new View.OnClickListener() { // from class: K4.F
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.r4(view);
                }
            });
            RadioButton radioButton3 = this$0.f30692M;
            AbstractC3292y.f(radioButton3);
            radioButton3.setOnClickListener(new View.OnClickListener() { // from class: K4.G
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.s4(view);
                }
            });
        }
    }

    private final void q3() {
        File file = this.f30703X;
        AbstractC3292y.f(file);
        String absolutePath = file.getAbsolutePath();
        LinearLayout linearLayout = this.f30682C;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            AbstractC3292y.y("llBreadcrumb");
            linearLayout = null;
        }
        if (linearLayout.findViewWithTag(absolutePath) == null) {
            LayoutInflater layoutInflater = getLayoutInflater();
            int i8 = J4.f.f4300a;
            LinearLayout linearLayout3 = this.f30682C;
            if (linearLayout3 == null) {
                AbstractC3292y.y("llBreadcrumb");
                linearLayout3 = null;
            }
            View inflate = layoutInflater.inflate(i8, (ViewGroup) linearLayout3, false);
            AbstractC3292y.g(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout4 = (LinearLayout) inflate;
            linearLayout4.setTag(absolutePath);
            TextView textView = (TextView) linearLayout4.findViewById(e.f4280t0);
            File file2 = this.f30703X;
            AbstractC3292y.f(file2);
            String path = file2.getPath();
            AbstractC3292y.h(path, "currentDirFile!!.path");
            textView.setText(Uri.parse(path).getLastPathSegment());
            textView.setTypeface(j.f4395g.v());
            LinearLayout linearLayout5 = this.f30682C;
            if (linearLayout5 == null) {
                AbstractC3292y.y("llBreadcrumb");
            } else {
                linearLayout2 = linearLayout5;
            }
            linearLayout2.addView(linearLayout4);
            Q5.I i9 = Q5.I.f8786a;
            S4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q4(FileExplorerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.f30704Y = !this$0.f30704Y;
        this$0.L4();
        this$0.Z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r3(String str, String str2) {
        if (!isFinishing()) {
            RelativeLayout relativeLayout = this.f30717y;
            if (relativeLayout == null) {
                AbstractC3292y.y("rlLoading");
                relativeLayout = null;
            }
            relativeLayout.setVisibility(0);
            AbstractC3462k.d(n6.N.a(C3445b0.b()), null, null, new C2707b(str, str2, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s3() {
        b bVar = this.f30696Q;
        AbstractC3292y.f(bVar);
        if (bVar.getItemCount() == 0) {
            DocumentFile documentFile = this.f30699T;
            if (documentFile != null) {
                AbstractC3292y.f(documentFile);
                b5(documentFile.canRead());
                return;
            }
            File file = this.f30703X;
            if (file != null) {
                AbstractC3292y.f(file);
                b5(file.canRead());
                return;
            }
            return;
        }
        LinearLayout linearLayout = this.f30680B;
        if (linearLayout == null) {
            AbstractC3292y.y("llEmptyDirectory");
            linearLayout = null;
        }
        linearLayout.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t3() {
        Uri n8 = new S4.f().n(this);
        LinearLayout linearLayout = null;
        if (n8 != null) {
            this.f30699T = DocumentFile.fromTreeUri(this, n8);
            this.f30703X = null;
            m4(this, false, 1, null);
            return;
        }
        LinearLayout linearLayout2 = this.f30678A;
        if (linearLayout2 == null) {
            AbstractC3292y.y("llPermissionExplanation");
            linearLayout2 = null;
        }
        linearLayout2.setVisibility(0);
        RecyclerView recyclerView = this.f30715x;
        if (recyclerView == null) {
            AbstractC3292y.y("rvFiles");
            recyclerView = null;
        }
        recyclerView.setVisibility(8);
        LinearLayout linearLayout3 = this.f30678A;
        if (linearLayout3 == null) {
            AbstractC3292y.y("llPermissionExplanation");
        } else {
            linearLayout = linearLayout3;
        }
        View findViewById = linearLayout.findViewById(e.f4245h1);
        AbstractC3292y.h(findViewById, "llPermissionExplanation.…(R.id.tv_grant_access_sd)");
        TextView textView = (TextView) findViewById;
        textView.setTypeface(j.f4395g.v());
        textView.setOnClickListener(new View.OnClickListener() { // from class: K4.H
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileExplorerActivity.u3(FileExplorerActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t4(final FileExplorerActivity this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3292y.i(this$0, "this$0");
        if (z8) {
            this$0.f30704Y = !this$0.f30704Y;
            RadioButton radioButton = this$0.f30691L;
            AbstractC3292y.f(radioButton);
            radioButton.setOnClickListener(new View.OnClickListener() { // from class: K4.M
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.u4(FileExplorerActivity.this, view);
                }
            });
            RadioButton radioButton2 = this$0.f30690K;
            AbstractC3292y.f(radioButton2);
            radioButton2.setOnClickListener(new View.OnClickListener() { // from class: K4.N
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.v4(view);
                }
            });
            RadioButton radioButton3 = this$0.f30692M;
            AbstractC3292y.f(radioButton3);
            radioButton3.setOnClickListener(new View.OnClickListener() { // from class: K4.P
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.w4(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(FileExplorerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u4(FileExplorerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.f30704Y = !this$0.f30704Y;
        this$0.L4();
        this$0.a5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v3(SearchView searchView) {
        searchView.setOnQueryTextListener(null);
        searchView.setQuery("", false);
        searchView.setOnQueryTextListener(this.f30720z0);
        Object systemService = getSystemService("input_method");
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(searchView.getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v4(View view) {
    }

    private final InterfaceC3488x0 w3(ArrayList arrayList, DocumentFile documentFile, c cVar) {
        InterfaceC3488x0 d8;
        d8 = AbstractC3462k.d(n6.N.a(C3445b0.b()), null, null, new C2708c(arrayList, documentFile, cVar, this, null), 3, null);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w4(View view) {
    }

    private final InterfaceC3488x0 x3(ArrayList arrayList, File file, c cVar) {
        InterfaceC3488x0 d8;
        d8 = AbstractC3462k.d(n6.N.a(C3445b0.b()), null, null, new C2709d(arrayList, file, cVar, this, null), 3, null);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x4(final FileExplorerActivity this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3292y.i(this$0, "this$0");
        if (z8) {
            this$0.f30704Y = !this$0.f30704Y;
            RadioButton radioButton = this$0.f30692M;
            AbstractC3292y.f(radioButton);
            radioButton.setOnClickListener(new View.OnClickListener() { // from class: K4.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.y4(FileExplorerActivity.this, view);
                }
            });
            RadioButton radioButton2 = this$0.f30690K;
            AbstractC3292y.f(radioButton2);
            radioButton2.setOnClickListener(new View.OnClickListener() { // from class: K4.A
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.z4(view);
                }
            });
            RadioButton radioButton3 = this$0.f30691L;
            AbstractC3292y.f(radioButton3);
            radioButton3.setOnClickListener(new View.OnClickListener() { // from class: K4.B
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.A4(view);
                }
            });
        }
    }

    private final void y3() {
        AbstractC3462k.d(n6.N.a(C3445b0.b()), null, null, new C2710e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y4(FileExplorerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.f30704Y = !this$0.f30704Y;
        this$0.L4();
        this$0.Y4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z3(U5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.uptodown.core.activities.FileExplorerActivity.C2712g
            if (r0 == 0) goto L13
            r0 = r7
            com.uptodown.core.activities.FileExplorerActivity$g r0 = (com.uptodown.core.activities.FileExplorerActivity.C2712g) r0
            int r1 = r0.f30779d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30779d = r1
            goto L18
        L13:
            com.uptodown.core.activities.FileExplorerActivity$g r0 = new com.uptodown.core.activities.FileExplorerActivity$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f30777b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f30779d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            Q5.t.b(r7)
            goto L69
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f30776a
            com.uptodown.core.activities.FileExplorerActivity r2 = (com.uptodown.core.activities.FileExplorerActivity) r2
            Q5.t.b(r7)
            goto L55
        L3d:
            Q5.t.b(r7)
            n6.I r7 = n6.C3445b0.b()
            com.uptodown.core.activities.FileExplorerActivity$h r2 = new com.uptodown.core.activities.FileExplorerActivity$h
            r2.<init>(r5)
            r0.f30776a = r6
            r0.f30779d = r4
            java.lang.Object r7 = n6.AbstractC3458i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            n6.J0 r7 = n6.C3445b0.c()
            com.uptodown.core.activities.FileExplorerActivity$i r4 = new com.uptodown.core.activities.FileExplorerActivity$i
            r4.<init>(r5)
            r0.f30776a = r5
            r0.f30779d = r3
            java.lang.Object r7 = n6.AbstractC3458i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            Q5.I r7 = Q5.I.f8786a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.FileExplorerActivity.z3(U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z4(View view) {
    }

    @Override // K4.a1
    public void W0() {
        Object obj;
        super.W0();
        Q4.h m8 = j.f4395g.m();
        AbstractC3292y.f(m8);
        if (m8.e() != null && (obj = this.f30706p0) != null) {
            AbstractC3292y.f(obj);
            if (obj instanceof File) {
                File file = (File) obj;
                if (!file.isDirectory()) {
                    Application application = getApplication();
                    AbstractC3292y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
                    ((j) application).T(file);
                    return;
                }
                return;
            }
            if (obj instanceof DocumentFile) {
                Application application2 = getApplication();
                AbstractC3292y.g(application2, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
                ((j) application2).S((DocumentFile) obj);
            }
        }
    }

    @Override // K4.r
    public void Y() {
        F(getString(h.f4350a0));
    }

    @Override // K4.r
    public void Z() {
        Uri n8 = new S4.f().n(this);
        if (n8 != null) {
            LinearLayout linearLayout = this.f30678A;
            if (linearLayout == null) {
                AbstractC3292y.y("llPermissionExplanation");
                linearLayout = null;
            }
            linearLayout.setVisibility(8);
            RecyclerView recyclerView = this.f30715x;
            if (recyclerView == null) {
                AbstractC3292y.y("rvFiles");
                recyclerView = null;
            }
            recyclerView.setVisibility(0);
            this.f30699T = DocumentFile.fromTreeUri(this, n8);
            this.f30703X = null;
            m4(this, false, 1, null);
        }
    }

    @Override // K4.a1
    public void Z0() {
    }

    @Override // K4.r
    public void a0() {
        F(getString(h.f4381q));
    }

    @Override // K4.r
    public void b0() {
        F(getString(h.f4350a0));
    }

    @Override // K4.r
    public void d0() {
        m4(this, false, 1, null);
        if (!Q()) {
            m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView(J4.f.f4317r);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("subdir") && (string = extras.getString("subdir")) != null) {
                boolean z8 = extras.getBoolean("subdir_sd");
                this.f30705Z = z8;
                if (z8) {
                    Uri n8 = new S4.f().n(this);
                    if (n8 != null) {
                        DocumentFile fromTreeUri = DocumentFile.fromTreeUri(this, n8);
                        if (fromTreeUri != null && string.length() > 0) {
                            Iterator it = n.s0(string, new String[]{"/"}, false, 0, 6, null).iterator();
                            while (it.hasNext() && (fromTreeUri = fromTreeUri.findFile((String) it.next())) != null) {
                            }
                        }
                        this.f30699T = fromTreeUri;
                        this.f30703X = null;
                    }
                } else {
                    this.f30703X = new File(string);
                    this.f30699T = null;
                }
            }
            if (extras.containsKey("select_path") && extras.getInt("select_path") == 1) {
                this.f30709s0 = true;
                View findViewById = findViewById(e.f4297z);
                AbstractC3292y.h(findViewById, "findViewById(R.id.ll_options)");
                View findViewById2 = findViewById(e.f4221Z1);
                AbstractC3292y.h(findViewById2, "findViewById(R.id.view_options_shadow)");
                ((LinearLayout) findViewById).setVisibility(0);
                findViewById2.setVisibility(0);
                TextView textView = (TextView) findViewById(e.f4185N1);
                this.f30686G = textView;
                if (textView != null) {
                    textView.setTypeface(j.f4395g.u());
                }
                TextView textView2 = this.f30686G;
                if (textView2 != null) {
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: K4.s
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            FileExplorerActivity.n4(FileExplorerActivity.this, view);
                        }
                    });
                }
                TextView textView3 = (TextView) findViewById(e.f4283u0);
                textView3.setTypeface(j.f4395g.u());
                textView3.setOnClickListener(new View.OnClickListener() { // from class: K4.f0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FileExplorerActivity.o4(FileExplorerActivity.this, view);
                    }
                });
            }
        }
        this.f30694O = (Toolbar) findViewById(e.f4256l0);
        TextView textView4 = (TextView) findViewById(e.f4209V1);
        this.f30695P = textView4;
        if (textView4 != null) {
            textView4.setText(getString(h.f4349a));
        }
        TextView textView5 = this.f30695P;
        if (textView5 != null) {
            textView5.setTypeface(j.f4395g.v());
        }
        Toolbar toolbar = this.f30694O;
        if (toolbar != null) {
            toolbar.setNavigationIcon(ContextCompat.getDrawable(this, J4.d.f4125b));
        }
        Toolbar toolbar2 = this.f30694O;
        if (toolbar2 != null) {
            toolbar2.setNavigationOnClickListener(new View.OnClickListener() { // from class: K4.g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.C4(FileExplorerActivity.this, view);
                }
            });
        }
        Toolbar toolbar3 = this.f30694O;
        if (toolbar3 != null) {
            toolbar3.inflateMenu(J4.g.f4322a);
        }
        Toolbar toolbar4 = this.f30694O;
        if (toolbar4 != null) {
            toolbar4.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: K4.h0
                @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    boolean F42;
                    F42 = FileExplorerActivity.F4(FileExplorerActivity.this, menuItem);
                    return F42;
                }
            });
        }
        h4();
        View findViewById3 = findViewById(e.f4288w);
        AbstractC3292y.h(findViewById3, "findViewById(R.id.layout_breadcrumb_main)");
        this.f30682C = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(e.f4250j0);
        AbstractC3292y.h(findViewById4, "findViewById(R.id.sv_breadcumb)");
        this.f30683D = (HorizontalScrollView) findViewById4;
        LinearLayout linearLayout = this.f30682C;
        if (linearLayout == null) {
            AbstractC3292y.y("llBreadcrumb");
            linearLayout = null;
        }
        View findViewById5 = linearLayout.findViewById(e.f4290w1);
        AbstractC3292y.h(findViewById5, "llBreadcrumb.findViewById(R.id.tv_main_path)");
        TextView textView6 = (TextView) findViewById5;
        this.f30713w = textView6;
        if (textView6 == null) {
            AbstractC3292y.y("tvBreadCrumb");
            textView6 = null;
        }
        j.a aVar = j.f4395g;
        textView6.setTypeface(aVar.v());
        View findViewById6 = findViewById(e.f4233d1);
        AbstractC3292y.h(findViewById6, "findViewById(R.id.tv_empty_dir)");
        TextView textView7 = (TextView) findViewById6;
        this.f30684E = textView7;
        if (textView7 == null) {
            AbstractC3292y.y("tvEmptyDirectory");
            textView7 = null;
        }
        textView7.setTypeface(aVar.v());
        SearchView searchView = (SearchView) findViewById(e.f4235e0);
        this.f30687H = searchView;
        if (searchView != null) {
            searchView.setOnQueryTextListener(this.f30720z0);
        }
        SearchView searchView2 = this.f30687H;
        if (searchView2 != null) {
            searchView2.setOnClickListener(new View.OnClickListener() { // from class: K4.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.G4(FileExplorerActivity.this, view);
                }
            });
        }
        ImageView imageView = (ImageView) findViewById(e.f4282u);
        this.f30688I = imageView;
        AbstractC3292y.f(imageView);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: K4.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileExplorerActivity.H4(FileExplorerActivity.this, view);
            }
        });
        this.f30689J = (RelativeLayout) findViewById(e.f4213X);
        RadioButton radioButton = (RadioButton) findViewById(e.f4180M);
        this.f30690K = radioButton;
        AbstractC3292y.f(radioButton);
        radioButton.setTypeface(aVar.v());
        RadioButton radioButton2 = this.f30690K;
        AbstractC3292y.f(radioButton2);
        radioButton2.setOnClickListener(new View.OnClickListener() { // from class: K4.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileExplorerActivity.I4(FileExplorerActivity.this, view);
            }
        });
        RadioButton radioButton3 = this.f30690K;
        AbstractC3292y.f(radioButton3);
        radioButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: K4.t
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                FileExplorerActivity.p4(FileExplorerActivity.this, compoundButton, z9);
            }
        });
        RadioButton radioButton4 = (RadioButton) findViewById(e.f4189P);
        this.f30691L = radioButton4;
        AbstractC3292y.f(radioButton4);
        radioButton4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: K4.u
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                FileExplorerActivity.t4(FileExplorerActivity.this, compoundButton, z9);
            }
        });
        RadioButton radioButton5 = (RadioButton) findViewById(e.f4171J);
        this.f30692M = radioButton5;
        AbstractC3292y.f(radioButton5);
        radioButton5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: K4.v
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                FileExplorerActivity.x4(FileExplorerActivity.this, compoundButton, z9);
            }
        });
        CheckBox checkBox = (CheckBox) findViewById(e.f4252k);
        checkBox.setTypeface(aVar.v());
        checkBox.setChecked(new L4.a(this).q());
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: K4.D
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                FileExplorerActivity.B4(FileExplorerActivity.this, compoundButton, z9);
            }
        });
        Z4();
        View findViewById7 = findViewById(e.f4229c0);
        AbstractC3292y.h(findViewById7, "findViewById(R.id.rv_files)");
        RecyclerView recyclerView = (RecyclerView) findViewById7;
        this.f30715x = recyclerView;
        if (recyclerView == null) {
            AbstractC3292y.y("rvFiles");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView recyclerView2 = this.f30715x;
        if (recyclerView2 == null) {
            AbstractC3292y.y("rvFiles");
            recyclerView2 = null;
        }
        recyclerView2.addItemDecoration(new S4.t((int) getResources().getDimension(J4.c.f4123a)));
        RecyclerView recyclerView3 = this.f30715x;
        if (recyclerView3 == null) {
            AbstractC3292y.y("rvFiles");
            recyclerView3 = null;
        }
        recyclerView3.setItemAnimator(new DefaultItemAnimator());
        View findViewById8 = findViewById(e.f4210W);
        AbstractC3292y.h(findViewById8, "findViewById(R.id.rl_loading_file_explorer)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById8;
        this.f30717y = relativeLayout;
        if (relativeLayout == null) {
            AbstractC3292y.y("rlLoading");
            relativeLayout = null;
        }
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: K4.O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileExplorerActivity.D4(view);
            }
        });
        View findViewById9 = findViewById(e.f4207V);
        AbstractC3292y.h(findViewById9, "findViewById(R.id.rl_loading_action)");
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById9;
        this.f30719z = relativeLayout2;
        if (relativeLayout2 == null) {
            AbstractC3292y.y("rlLoadingAction");
            relativeLayout2 = null;
        }
        relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: K4.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileExplorerActivity.E4(view);
            }
        });
        View findViewById10 = findViewById(e.f4291x);
        AbstractC3292y.h(findViewById10, "findViewById(R.id.ll_empty_dir)");
        this.f30680B = (LinearLayout) findViewById10;
        View findViewById11 = findViewById(e.f4144A);
        AbstractC3292y.h(findViewById11, "findViewById(R.id.ll_sd_permissions_explanation)");
        this.f30678A = (LinearLayout) findViewById11;
        TextView textView8 = (TextView) findViewById(e.f4200S1);
        this.f30711u0 = textView8;
        if (textView8 != null) {
            textView8.setTypeface(aVar.u());
        }
        TabLayout tabLayout = (TabLayout) findViewById(e.f4253k0);
        this.f30710t0 = tabLayout;
        AbstractC3292y.f(tabLayout);
        TabLayout.Tab text = tabLayout.newTab().setText(getString(h.f4343U));
        AbstractC3292y.h(text, "tabsStorage!!.newTab().s…string.internal_storage))");
        text.setId(0);
        TabLayout tabLayout2 = this.f30710t0;
        AbstractC3292y.f(tabLayout2);
        tabLayout2.addTab(text);
        TabLayout tabLayout3 = this.f30710t0;
        AbstractC3292y.f(tabLayout3);
        TabLayout.Tab text2 = tabLayout3.newTab().setText(getString(h.f4370k0));
        AbstractC3292y.h(text2, "tabsStorage!!.newTab().s…String(R.string.sd_card))");
        text2.setId(1);
        TabLayout tabLayout4 = this.f30710t0;
        AbstractC3292y.f(tabLayout4);
        tabLayout4.addTab(text2);
        TabLayout tabLayout5 = this.f30710t0;
        AbstractC3292y.f(tabLayout5);
        ViewGroupKt.get(tabLayout5, 0).setSelected(true);
        TabLayout tabLayout6 = this.f30710t0;
        AbstractC3292y.f(tabLayout6);
        tabLayout6.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new F());
        if (R()) {
            m4(this, false, 1, null);
            ArrayList c8 = new v().c(this);
            this.f30700U = c8;
            if (c8 != null && !c8.isEmpty()) {
                TabLayout tabLayout7 = this.f30710t0;
                if (tabLayout7 != null) {
                    tabLayout7.setVisibility(0);
                }
                TextView textView9 = this.f30711u0;
                if (textView9 != null) {
                    textView9.setVisibility(0);
                }
            } else {
                TabLayout tabLayout8 = this.f30710t0;
                if (tabLayout8 != null) {
                    tabLayout8.setVisibility(8);
                }
                TextView textView10 = this.f30711u0;
                if (textView10 != null) {
                    textView10.setVisibility(8);
                }
            }
        } else {
            H();
        }
        getOnBackPressedDispatcher().addCallback(this, this.f30679A0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent event) {
        AbstractC3292y.i(event, "event");
        if (i8 == 82) {
            Toolbar toolbar = this.f30694O;
            AbstractC3292y.f(toolbar);
            toolbar.showOverflowMenu();
            return true;
        }
        return super.onKeyDown(i8, event);
    }
}
