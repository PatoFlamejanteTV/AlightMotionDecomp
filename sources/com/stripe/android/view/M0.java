package com.stripe.android.view;

import Q5.InterfaceC1416k;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewStub;
import android.widget.ProgressBar;
import androidx.appcompat.R;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.android.view.InterfaceC2664n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.AbstractC3390A;
import n2.AbstractC3393D;

/* loaded from: classes4.dex */
public abstract class M0 extends AppCompatActivity {

    /* renamed from: d, reason: collision with root package name */
    private boolean f28667d;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1416k f28664a = Q5.l.b(new d());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1416k f28665b = Q5.l.b(new b());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1416k f28666c = Q5.l.b(new e());

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1416k f28668e = Q5.l.b(new a());

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1416k f28669f = Q5.l.b(new c());

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2664n.a invoke() {
            return new InterfaceC2664n.a(M0.this);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinearProgressIndicator invoke() {
            return M0.this.o().f5289b;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N0 invoke() {
            return new N0(M0.this);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L2.b invoke() {
            L2.b c8 = L2.b.c(M0.this.getLayoutInflater());
            AbstractC3292y.h(c8, "inflate(...)");
            return c8;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends AbstractC3293z implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewStub invoke() {
            ViewStub viewStub = M0.this.o().f5291d;
            AbstractC3292y.h(viewStub, "viewStub");
            return viewStub;
        }
    }

    private final InterfaceC2664n l() {
        return (InterfaceC2664n) this.f28668e.getValue();
    }

    private final N0 n() {
        return (N0) this.f28669f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final L2.b o() {
        return (L2.b) this.f28664a.getValue();
    }

    public final ProgressBar m() {
        Object value = this.f28665b.getValue();
        AbstractC3292y.h(value, "getValue(...)");
        return (ProgressBar) value;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(o().getRoot());
        setSupportActionBar(o().f5290c);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        AbstractC3292y.i(menu, "menu");
        getMenuInflater().inflate(AbstractC3393D.f35178a, menu);
        menu.findItem(AbstractC3390A.f35117b).setEnabled(!this.f28667d);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        AbstractC3292y.i(item, "item");
        if (item.getItemId() == AbstractC3390A.f35117b) {
            q();
            return true;
        }
        boolean onOptionsItemSelected = super.onOptionsItemSelected(item);
        if (!onOptionsItemSelected) {
            getOnBackPressedDispatcher().onBackPressed();
            return onOptionsItemSelected;
        }
        return onOptionsItemSelected;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        AbstractC3292y.i(menu, "menu");
        MenuItem findItem = menu.findItem(AbstractC3390A.f35117b);
        N0 n8 = n();
        Resources.Theme theme = getTheme();
        AbstractC3292y.h(theme, "getTheme(...)");
        findItem.setIcon(n8.f(theme, R.attr.titleTextColor, n2.z.f35477M));
        return super.onPrepareOptionsMenu(menu);
    }

    public final ViewStub p() {
        return (ViewStub) this.f28666c.getValue();
    }

    protected abstract void q();

    protected void r(boolean z8) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s(boolean z8) {
        int i8;
        ProgressBar m8 = m();
        if (z8) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        m8.setVisibility(i8);
        invalidateOptionsMenu();
        r(z8);
        this.f28667d = z8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(String error) {
        AbstractC3292y.i(error, "error");
        l().show(error);
    }
}
