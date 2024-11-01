package com.uptodown.tv.ui.activity;

import J4.i;
import Q5.I;
import R5.AbstractC1435t;
import S4.f;
import S4.x;
import X4.j;
import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.leanback.app.BackgroundManager;
import androidx.lifecycle.LifecycleOwnerKt;
import b5.r;
import c5.C2043h;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.tv.preferences.TvPrivacyPreferences;
import com.uptodown.tv.ui.activity.TvMainActivity;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;
import m5.b;
import n5.C3426l;
import q5.C3784i;
import q5.C3788m;

/* loaded from: classes5.dex */
public final class TvMainActivity extends b implements r {

    /* renamed from: d, reason: collision with root package name */
    private AlertDialog f31031d;

    /* renamed from: e, reason: collision with root package name */
    public Fragment f31032e;

    /* renamed from: f, reason: collision with root package name */
    private final ActivityResultLauncher f31033f;

    public TvMainActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: m5.d
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                TvMainActivity.w(TvMainActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult, "registerForActivityResult(...)");
        this.f31033f = registerForActivityResult;
    }

    private final void q(String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(str);
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: m5.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvMainActivity.r(dialogInterface, i8);
            }
        });
        builder.setCancelable(true);
        AlertDialog create = builder.create();
        if (!isFinishing()) {
            create.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(DialogInterface dialogInterface, int i8) {
        AbstractC3292y.i(dialogInterface, "dialogInterface");
        dialogInterface.dismiss();
    }

    private final void s() {
        AlertDialog alertDialog;
        AlertDialog alertDialog2 = this.f31031d;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        if (aVar.V(this) && !aVar.j0(this)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(getString(com.uptodown.R.string.tracking_disabled_warning_gdpr));
            builder.setPositiveButton(com.uptodown.R.string.gdpr_set_up, new DialogInterface.OnClickListener() { // from class: m5.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    TvMainActivity.t(TvMainActivity.this, dialogInterface, i8);
                }
            });
            builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: m5.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    TvMainActivity.u(dialogInterface, i8);
                }
            });
            builder.setCancelable(true);
            this.f31031d = builder.create();
            if (!isFinishing() && (alertDialog = this.f31031d) != null) {
                alertDialog.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(TvMainActivity tvMainActivity, DialogInterface dialogInterface, int i8) {
        dialogInterface.dismiss();
        tvMainActivity.startActivity(new Intent(tvMainActivity, (Class<?>) TvPrivacyPreferences.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(DialogInterface dialogInterface, int i8) {
        AbstractC3292y.i(dialogInterface, "dialogInterface");
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(TvMainActivity tvMainActivity, ActivityResult activityResult) {
        String str;
        Bundle extras;
        if (activityResult.getResultCode() == 10) {
            Intent data = activityResult.getData();
            if (data != null && (extras = data.getExtras()) != null) {
                str = extras.getString("realPath");
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                new i(tvMainActivity).c(new File(str), null, new C3784i().z(tvMainActivity));
            }
        }
    }

    private final boolean y(Intent intent) {
        if ((intent.getFlags() & 1048576) == 1048576) {
            return true;
        }
        return false;
    }

    @Override // b5.r
    public void b(int i8) {
        q(getString(com.uptodown.R.string.msg_app_not_found));
    }

    @Override // b5.r
    public void c(C2043h appInfo) {
        AbstractC3292y.i(appInfo, "appInfo");
        Intent intent = new Intent(this, (Class<?>) TvAppDetailActivity.class);
        intent.putExtra("appInfo", appInfo);
        startActivity(intent, UptodownApp.f29249C.a(this));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        AbstractC3292y.h(fragments, "getFragments(...)");
        if (AbstractC1435t.y0(fragments) instanceof C3426l) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // m5.b, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Uri data;
        super.onCreate(bundle);
        setContentView(com.uptodown.R.layout.tv_activity_main);
        if (bundle == null) {
            x(new n5.r());
            getSupportFragmentManager().beginTransaction().replace(com.uptodown.R.id.fragmentContainer, v()).commit();
        }
        BackgroundManager backgroundManager = BackgroundManager.getInstance(this);
        Drawable drawable = ContextCompat.getDrawable(this, com.uptodown.R.drawable.tv_default_background);
        if (backgroundManager != null) {
            backgroundManager.setDrawable(drawable);
        }
        Intent intent = getIntent();
        if (intent != null && !y(intent) && (data = intent.getData()) != null) {
            String j8 = new f().j(data, this);
            if (j8 != null && (x.f9510b.a(j8) || n.r(j8, ".apk", false, 2, null))) {
                Intent intent2 = new Intent(getApplicationContext(), (Class<?>) InstallerActivity.class);
                intent2.setData(data);
                this.f31033f.launch(intent2);
                I i8 = I.f8786a;
                return;
            }
            new j(this, new C3788m().l(data), this, LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m5.b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        s();
    }

    public final Fragment v() {
        Fragment fragment = this.f31032e;
        if (fragment != null) {
            return fragment;
        }
        AbstractC3292y.y("tvMainFragment");
        return null;
    }

    public final void x(Fragment fragment) {
        AbstractC3292y.i(fragment, "<set-?>");
        this.f31032e = fragment;
    }
}
