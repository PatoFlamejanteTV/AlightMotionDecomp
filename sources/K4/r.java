package K4;

import J4.j;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.documentfile.provider.DocumentFile;
import com.uptodown.core.activities.FileExplorerActivity;
import java.io.File;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class r extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private AlertDialog f4763a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f4764b;

    /* renamed from: c, reason: collision with root package name */
    private RadioButton f4765c;

    /* renamed from: d, reason: collision with root package name */
    private RadioButton f4766d;

    /* renamed from: e, reason: collision with root package name */
    private RadioButton f4767e;

    /* renamed from: f, reason: collision with root package name */
    private CheckBox f4768f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f4769g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f4770h;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f4771i;

    /* renamed from: j, reason: collision with root package name */
    private String f4772j;

    /* renamed from: k, reason: collision with root package name */
    private final ActivityResultLauncher f4773k;

    /* renamed from: l, reason: collision with root package name */
    private final ActivityResultLauncher f4774l;

    /* renamed from: m, reason: collision with root package name */
    private final ActivityResultLauncher f4775m;

    /* renamed from: n, reason: collision with root package name */
    private ActivityResultLauncher f4776n;

    public r() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: K4.j
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                r.U(r.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult, "registerForActivityResul…nDenied()\n        }\n    }");
        this.f4773k = registerForActivityResult;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: K4.k
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                r.o0(r.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult2, "registerForActivityResul…        }\n        }\n    }");
        this.f4774l = registerForActivityResult2;
        ActivityResultLauncher registerForActivityResult3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: K4.l
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                r.r0(r.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult3, "registerForActivityResul…nownSourcesResult()\n    }");
        this.f4775m = registerForActivityResult3;
        ActivityResultLauncher registerForActivityResult4 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: K4.m
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                r.M(r.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult4, "registerForActivityResul…        tmp(result)\n    }");
        this.f4776n = registerForActivityResult4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(r this$0, String str, String str2, long j8, boolean z8, CompoundButton compoundButton, boolean z9) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.s0(str, str2, j8, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(r this$0, String str, String str2, long j8, boolean z8, RadioGroup radioGroup, int i8) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.s0(str, str2, j8, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(r this$0, String str, String str2, long j8, boolean z8, RadioGroup radioGroup, int i8) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.s0(str, str2, j8, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(r this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        TextView textView = this$0.f4770h;
        TextView textView2 = null;
        if (textView == null) {
            AbstractC3292y.y("tvErrorPath");
            textView = null;
        }
        if (textView.getVisibility() == 0) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this$0.getApplicationContext(), J4.a.f4120a);
            TextView textView3 = this$0.f4770h;
            if (textView3 == null) {
                AbstractC3292y.y("tvErrorPath");
            } else {
                textView2 = textView3;
            }
            textView2.startAnimation(loadAnimation);
            return;
        }
        if (this$0.f4771i != null) {
            new L4.a(this$0).E(AbstractC3292y.d(this$0.f4771i, Boolean.TRUE));
        }
        if (this$0.f4772j != null) {
            new L4.a(this$0).y(this$0.f4772j);
        }
        this$0.n0();
        AlertDialog alertDialog = this$0.f4763a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this$0.f4763a = null;
        this$0.V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(r this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f4763a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this$0.f4763a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(r this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f4763a;
        AbstractC3292y.f(alertDialog);
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(r this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f4763a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this$0.l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(r this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f4763a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this$0.k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(r this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f4763a;
        AbstractC3292y.f(alertDialog);
        alertDialog.dismiss();
        this$0.f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(r this$0, ActivityResult result) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.h(result, "result");
        this$0.q0(result);
    }

    private final String N() {
        String string = getString(J4.h.f4353c);
        AbstractC3292y.h(string, "getString(R.string.app_name)");
        return string;
    }

    private final long P() {
        try {
            PackageManager packageManager = getPackageManager();
            AbstractC3292y.h(packageManager, "packageManager");
            String packageName = getPackageName();
            AbstractC3292y.h(packageName, "packageName");
            return new S4.f().m(S4.r.d(packageManager, packageName, 0));
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(r this$0, ActivityResult activityResult) {
        AbstractC3292y.i(this$0, "this$0");
        if (this$0.R()) {
            this$0.d0();
        } else {
            this$0.b0();
        }
    }

    private final void n0() {
        String str;
        L4.a aVar = new L4.a(this);
        RadioButton radioButton = this.f4765c;
        RadioButton radioButton2 = null;
        if (radioButton == null) {
            AbstractC3292y.y("rbAppName");
            radioButton = null;
        }
        aVar.u(radioButton.isChecked());
        RadioButton radioButton3 = this.f4766d;
        if (radioButton3 == null) {
            AbstractC3292y.y("rbPackagename");
            radioButton3 = null;
        }
        aVar.v(radioButton3.isChecked());
        CheckBox checkBox = this.f4768f;
        if (checkBox == null) {
            AbstractC3292y.y("cbVersioncode");
            checkBox = null;
        }
        aVar.w(checkBox.isChecked());
        RadioButton radioButton4 = this.f4767e;
        if (radioButton4 == null) {
            AbstractC3292y.y("rbXapkExtension");
        } else {
            radioButton2 = radioButton4;
        }
        if (radioButton2.isChecked()) {
            str = ".xapk";
        } else {
            str = ".apks";
        }
        aVar.x(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(r this$0, ActivityResult activityResult) {
        Uri uri;
        AbstractC3292y.i(this$0, "this$0");
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            Integer num = null;
            if (data != null) {
                uri = data.getData();
            } else {
                uri = null;
            }
            if (uri != null) {
                Intent data2 = activityResult.getData();
                if (data2 != null) {
                    num = Integer.valueOf(data2.getFlags());
                }
                if (num != null) {
                    num = Integer.valueOf(num.intValue() & 3);
                }
                ContentResolver contentResolver = this$0.getContentResolver();
                AbstractC3292y.f(num);
                contentResolver.takePersistableUriPermission(uri, num.intValue());
                if (new S4.f().q(uri)) {
                    this$0.Z();
                    return;
                } else {
                    this$0.a0();
                    return;
                }
            }
            this$0.Y();
        }
    }

    private final void q0(ActivityResult activityResult) {
        String str;
        Boolean bool;
        Uri uri;
        Boolean bool2;
        String str2;
        Bundle extras;
        Bundle extras2;
        Bundle extras3;
        if (activityResult.getResultCode() == 145) {
            Intent data = activityResult.getData();
            TextView textView = null;
            if (data != null && (extras3 = data.getExtras()) != null) {
                str = extras3.getString("path_selected");
            } else {
                str = null;
            }
            this.f4772j = str;
            Intent data2 = activityResult.getData();
            if (data2 != null && (extras2 = data2.getExtras()) != null) {
                bool = Boolean.valueOf(extras2.getBoolean("sdcard_selected"));
            } else {
                bool = null;
            }
            this.f4771i = bool;
            Intent data3 = activityResult.getData();
            if (data3 != null) {
                uri = data3.getData();
            } else {
                uri = null;
            }
            if (this.f4772j != null) {
                String str3 = this.f4772j;
                AbstractC3292y.f(str3);
                File file = new File(str3);
                TextView textView2 = this.f4769g;
                if (textView2 == null) {
                    AbstractC3292y.y("tvPath");
                    textView2 = null;
                }
                textView2.setText(this.f4772j);
                if (file.exists() && file.isDirectory() && file.canWrite()) {
                    TextView textView3 = this.f4770h;
                    if (textView3 == null) {
                        AbstractC3292y.y("tvErrorPath");
                    } else {
                        textView = textView3;
                    }
                    textView.setVisibility(8);
                    return;
                }
                TextView textView4 = this.f4770h;
                if (textView4 == null) {
                    AbstractC3292y.y("tvErrorPath");
                } else {
                    textView = textView4;
                }
                textView.setVisibility(0);
                return;
            }
            if (uri != null) {
                String lastPathSegment = uri.getLastPathSegment();
                Intent data4 = activityResult.getData();
                if (data4 != null && (extras = data4.getExtras()) != null) {
                    bool2 = Boolean.valueOf(extras.getBoolean("sdcard_selected"));
                } else {
                    bool2 = null;
                }
                this.f4771i = bool2;
                if (lastPathSegment != null) {
                    str2 = lastPathSegment.substring(l6.n.X(lastPathSegment, ":", 0, false, 6, null) + 1);
                    AbstractC3292y.h(str2, "this as java.lang.String).substring(startIndex)");
                } else {
                    str2 = null;
                }
                this.f4772j = str2;
                if (AbstractC3292y.d(this.f4771i, Boolean.TRUE)) {
                    TextView textView5 = this.f4769g;
                    if (textView5 == null) {
                        AbstractC3292y.y("tvPath");
                        textView5 = null;
                    }
                    textView5.setText(getString(J4.h.f4370k0) + '/' + this.f4772j);
                } else {
                    TextView textView6 = this.f4769g;
                    if (textView6 == null) {
                        AbstractC3292y.y("tvPath");
                        textView6 = null;
                    }
                    textView6.setText(getString(J4.h.f4343U) + '/' + this.f4772j);
                }
                DocumentFile fromSingleUri = DocumentFile.fromSingleUri(this, uri);
                if (fromSingleUri != null && fromSingleUri.exists() && fromSingleUri.isDirectory() && fromSingleUri.canWrite()) {
                    TextView textView7 = this.f4770h;
                    if (textView7 == null) {
                        AbstractC3292y.y("tvErrorPath");
                    } else {
                        textView = textView7;
                    }
                    textView.setVisibility(8);
                    return;
                }
                TextView textView8 = this.f4770h;
                if (textView8 == null) {
                    AbstractC3292y.y("tvErrorPath");
                } else {
                    textView = textView8;
                }
                textView.setVisibility(0);
                return;
            }
            TextView textView9 = this.f4770h;
            if (textView9 == null) {
                AbstractC3292y.y("tvErrorPath");
            } else {
                textView = textView9;
            }
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(r this$0, ActivityResult activityResult) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.h0();
    }

    private final void s0(String str, String str2, long j8, boolean z8) {
        String str3;
        RadioButton radioButton = this.f4765c;
        TextView textView = null;
        if (radioButton == null) {
            AbstractC3292y.y("rbAppName");
            radioButton = null;
        }
        if (radioButton.isChecked()) {
            if (str == null) {
                str = N();
            }
        } else if (str2 != null) {
            str = str2;
        } else {
            str = getPackageName();
            AbstractC3292y.h(str, "getPackageName()");
        }
        CheckBox checkBox = this.f4768f;
        if (checkBox == null) {
            AbstractC3292y.y("cbVersioncode");
            checkBox = null;
        }
        if (checkBox.isChecked()) {
            if (j8 > -1) {
                str = str + '_' + j8;
            } else {
                str = str + '_' + P();
            }
        }
        if (z8) {
            RadioButton radioButton2 = this.f4767e;
            if (radioButton2 == null) {
                AbstractC3292y.y("rbXapkExtension");
                radioButton2 = null;
            }
            if (radioButton2.isChecked()) {
                str3 = str + ".xapk";
            } else {
                str3 = str + ".apks";
            }
        } else {
            str3 = str + ".apk";
        }
        TextView textView2 = this.f4764b;
        if (textView2 == null) {
            AbstractC3292y.y("tvResult");
        } else {
            textView = textView2;
        }
        textView.setText(str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(r this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        Intent intent = new Intent(this$0.getApplicationContext(), (Class<?>) FileExplorerActivity.class);
        intent.putExtra("select_path", 1);
        this$0.f4776n.launch(intent);
    }

    public final void F(String str) {
        AlertDialog alertDialog = this.f4763a;
        if (alertDialog != null) {
            AbstractC3292y.f(alertDialog);
            alertDialog.dismiss();
        }
        View inflate = getLayoutInflater().inflate(J4.f.f4304e, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(J4.e.f4193Q0);
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.v());
        if (str == null) {
            textView.setText(getString(J4.h.f4332J));
        } else {
            textView.setText(str);
        }
        TextView textView2 = (TextView) inflate.findViewById(J4.e.f4259m0);
        textView2.setTypeface(aVar.u());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: K4.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.G(r.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        builder.setCancelable(false);
        this.f4763a = builder.create();
        if (!isFinishing()) {
            AlertDialog alertDialog2 = this.f4763a;
            AbstractC3292y.f(alertDialog2);
            Window window = alertDialog2.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            AlertDialog alertDialog3 = this.f4763a;
            AbstractC3292y.f(alertDialog3);
            alertDialog3.show();
        }
    }

    public final void H() {
        AlertDialog alertDialog;
        AlertDialog alertDialog2 = this.f4763a;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
        View inflate = getLayoutInflater().inflate(J4.f.f4304e, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(J4.e.f4193Q0);
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.v());
        textView.setText(getString(J4.h.f4354c0));
        TextView textView2 = (TextView) inflate.findViewById(J4.e.f4259m0);
        textView2.setTypeface(aVar.u());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: K4.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.I(r.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        builder.setCancelable(false);
        this.f4763a = builder.create();
        if (!isFinishing() && (alertDialog = this.f4763a) != null) {
            alertDialog.show();
        }
    }

    public final void J() {
        try {
            if (!T()) {
                AlertDialog alertDialog = this.f4763a;
                if (alertDialog != null) {
                    AbstractC3292y.f(alertDialog);
                    alertDialog.dismiss();
                }
                View inflate = getLayoutInflater().inflate(J4.f.f4316q, (ViewGroup) null, false);
                TextView textView = (TextView) inflate.findViewById(J4.e.f4220Z0);
                j.a aVar = J4.j.f4395g;
                textView.setTypeface(aVar.u());
                int i8 = J4.h.f4374m0;
                int i9 = J4.h.f4353c;
                textView.setText(getString(i8, getString(i9)));
                TextView textView2 = (TextView) inflate.findViewById(J4.e.f4211W0);
                textView2.setTypeface(aVar.v());
                textView2.setText(getString(J4.h.f4348Z, getString(i9)));
                TextView textView3 = (TextView) inflate.findViewById(J4.e.f4259m0);
                textView3.setTypeface(aVar.u());
                textView3.setOnClickListener(new View.OnClickListener() { // from class: K4.p
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        r.K(r.this, view);
                    }
                });
                TextView textView4 = (TextView) inflate.findViewById(J4.e.f4298z0);
                textView4.setTypeface(aVar.u());
                textView4.setOnClickListener(new View.OnClickListener() { // from class: K4.q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        r.L(r.this, view);
                    }
                });
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setView(inflate);
                AlertDialog create = builder.create();
                this.f4763a = create;
                AbstractC3292y.f(create);
                Window window = create.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                if (!isFinishing()) {
                    AlertDialog alertDialog2 = this.f4763a;
                    AbstractC3292y.f(alertDialog2);
                    alertDialog2.show();
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final AlertDialog O() {
        return this.f4763a;
    }

    public final boolean Q() {
        if (Build.VERSION.SDK_INT < 33 && ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return false;
        }
        return true;
    }

    public final boolean R() {
        boolean isExternalStorageManager;
        if (Build.VERSION.SDK_INT >= 30) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            return isExternalStorageManager;
        }
        return Q();
    }

    public final boolean S() {
        if (Build.VERSION.SDK_INT < 33 || ContextCompat.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        boolean canRequestPackageInstalls;
        if (Build.VERSION.SDK_INT >= 26) {
            canRequestPackageInstalls = getPackageManager().canRequestPackageInstalls();
            return canRequestPackageInstalls;
        }
        if (Settings.Secure.getInt(getContentResolver(), "install_non_market_apps", 0) != 1) {
            return false;
        }
        return true;
    }

    public abstract void Y();

    public abstract void Z();

    public abstract void a0();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (context != null) {
            context = J4.j.f4395g.a(context);
        }
        super.attachBaseContext(context);
    }

    public abstract void b0();

    public abstract void d0();

    public final void i0() {
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, 646);
        new L4.a(this).D(true);
    }

    public final void j0() {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        intent.addFlags(195);
        intent.putExtra("android.content.extra.SHOW_ADVANCED", true);
        intent.putExtra("android.content.extra.FANCY", true);
        intent.putExtra("android.content.extra.SHOW_FILESIZE", true);
        this.f4774l.launch(intent);
    }

    public final void k0() {
        try {
            if (Build.VERSION.SDK_INT < 26) {
                this.f4775m.launch(new Intent("android.settings.SECURITY_SETTINGS"));
            } else {
                this.f4775m.launch(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + getPackageName())));
            }
        } catch (ActivityNotFoundException e8) {
            e8.printStackTrace();
            g0();
        }
    }

    public final void l0() {
        boolean isExternalStorageManager;
        if (Build.VERSION.SDK_INT >= 30) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (!isExternalStorageManager) {
                try {
                    this.f4773k.launch(new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse("package:" + getPackageName())));
                    return;
                } catch (ActivityNotFoundException e8) {
                    e8.printStackTrace();
                    m0();
                    return;
                }
            }
            if (!Q()) {
                m0();
                return;
            }
            return;
        }
        if (!Q()) {
            m0();
        }
    }

    public final void m0() {
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 645);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i8, String[] permissions, int[] grantResults) {
        boolean z8;
        boolean z9;
        AbstractC3292y.i(permissions, "permissions");
        AbstractC3292y.i(grantResults, "grantResults");
        super.onRequestPermissionsResult(i8, permissions, grantResults);
        if (i8 != 645) {
            if (i8 == 646) {
                if (grantResults.length == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if ((!z9) && grantResults[0] == 0) {
                    X();
                    return;
                } else {
                    W();
                    return;
                }
            }
            return;
        }
        if (grantResults.length == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((!z8) && grantResults[0] == 0) {
            e0();
        } else {
            c0();
        }
    }

    public final void p0(AlertDialog alertDialog) {
        this.f4763a = alertDialog;
    }

    public final void y(final String str, final String str2, final long j8, final boolean z8) {
        CheckBox checkBox;
        Window window;
        AlertDialog alertDialog = this.f4763a;
        if (alertDialog != null && alertDialog != null) {
            alertDialog.dismiss();
        }
        View inflate = getLayoutInflater().inflate(J4.f.f4312m, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(J4.e.f4206U1);
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        View findViewById = inflate.findViewById(J4.e.f4164G1);
        AbstractC3292y.h(findViewById, "view.findViewById(R.id.tv_path_dialog_path)");
        TextView textView2 = (TextView) findViewById;
        this.f4769g = textView2;
        if (textView2 == null) {
            AbstractC3292y.y("tvPath");
            textView2 = null;
        }
        textView2.setTypeface(aVar.v());
        if (new L4.a(this).n()) {
            TextView textView3 = this.f4769g;
            if (textView3 == null) {
                AbstractC3292y.y("tvPath");
                textView3 = null;
            }
            textView3.setText(getString(J4.h.f4370k0) + '/' + new L4.a(this).c());
        } else {
            TextView textView4 = this.f4769g;
            if (textView4 == null) {
                AbstractC3292y.y("tvPath");
                textView4 = null;
            }
            textView4.setText(new L4.a(this).c());
        }
        View findViewById2 = inflate.findViewById(J4.e.f4236e1);
        AbstractC3292y.h(findViewById2, "view.findViewById(R.id.tv_error_path)");
        TextView textView5 = (TextView) findViewById2;
        this.f4770h = textView5;
        if (textView5 == null) {
            AbstractC3292y.y("tvErrorPath");
            textView5 = null;
        }
        textView5.setTypeface(aVar.v());
        ImageView imageView = (ImageView) inflate.findViewById(J4.e.f4270q);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: K4.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r.z(r.this, view);
                }
            });
        }
        ((TextView) inflate.findViewById(J4.e.f4152C1)).setTypeface(aVar.v());
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(J4.e.f4201T);
        View findViewById3 = inflate.findViewById(J4.e.f4183N);
        AbstractC3292y.h(findViewById3, "view.findViewById(R.id.rb_option_appname)");
        RadioButton radioButton = (RadioButton) findViewById3;
        this.f4765c = radioButton;
        if (radioButton == null) {
            AbstractC3292y.y("rbAppName");
            radioButton = null;
        }
        radioButton.setTypeface(aVar.v());
        View findViewById4 = inflate.findViewById(J4.e.f4186O);
        AbstractC3292y.h(findViewById4, "view.findViewById(R.id.rb_option_packagename)");
        RadioButton radioButton2 = (RadioButton) findViewById4;
        this.f4766d = radioButton2;
        if (radioButton2 == null) {
            AbstractC3292y.y("rbPackagename");
            radioButton2 = null;
        }
        radioButton2.setTypeface(aVar.v());
        View findViewById5 = inflate.findViewById(J4.e.f4258m);
        AbstractC3292y.h(findViewById5, "view.findViewById(R.id.cb_versioncode)");
        CheckBox checkBox2 = (CheckBox) findViewById5;
        this.f4768f = checkBox2;
        if (checkBox2 == null) {
            AbstractC3292y.y("cbVersioncode");
            checkBox2 = null;
        }
        checkBox2.setTypeface(aVar.v());
        L4.a aVar2 = new L4.a(this);
        RadioButton radioButton3 = this.f4765c;
        if (radioButton3 == null) {
            AbstractC3292y.y("rbAppName");
            radioButton3 = null;
        }
        radioButton3.setChecked(aVar2.i());
        RadioButton radioButton4 = this.f4766d;
        if (radioButton4 == null) {
            AbstractC3292y.y("rbPackagename");
            radioButton4 = null;
        }
        radioButton4.setChecked(aVar2.j());
        CheckBox checkBox3 = this.f4768f;
        if (checkBox3 == null) {
            AbstractC3292y.y("cbVersioncode");
            checkBox3 = null;
        }
        checkBox3.setChecked(aVar2.k());
        TextView textView6 = (TextView) inflate.findViewById(J4.e.f4239f1);
        RadioGroup radioGroup2 = (RadioGroup) inflate.findViewById(J4.e.f4198S);
        View findViewById6 = inflate.findViewById(J4.e.f4192Q);
        AbstractC3292y.h(findViewById6, "view.findViewById(R.id.rb_xapk_extension)");
        this.f4767e = (RadioButton) findViewById6;
        if (z8) {
            textView6.setTypeface(aVar.v());
            RadioButton radioButton5 = this.f4767e;
            if (radioButton5 == null) {
                AbstractC3292y.y("rbXapkExtension");
                radioButton5 = null;
            }
            radioButton5.setTypeface(aVar.v());
            RadioButton radioButton6 = this.f4767e;
            if (radioButton6 == null) {
                AbstractC3292y.y("rbXapkExtension");
                radioButton6 = null;
            }
            radioButton6.setText(".xapk");
            View findViewById7 = inflate.findViewById(J4.e.f4168I);
            AbstractC3292y.h(findViewById7, "view.findViewById(R.id.rb_apks_extension)");
            RadioButton radioButton7 = (RadioButton) findViewById7;
            radioButton7.setTypeface(aVar.v());
            radioButton7.setText(".apks");
            String a9 = aVar2.a();
            RadioButton radioButton8 = this.f4767e;
            if (radioButton8 == null) {
                AbstractC3292y.y("rbXapkExtension");
                radioButton8 = null;
            }
            radioButton8.setChecked(l6.n.s(a9, ".xapk", true));
            RadioButton radioButton9 = this.f4767e;
            if (radioButton9 == null) {
                AbstractC3292y.y("rbXapkExtension");
                radioButton9 = null;
            }
            radioButton7.setChecked(!radioButton9.isChecked());
        } else {
            textView6.setVisibility(8);
            radioGroup2.setVisibility(8);
        }
        ((TextView) inflate.findViewById(J4.e.f4182M1)).setTypeface(aVar.v());
        View findViewById8 = inflate.findViewById(J4.e.f4179L1);
        AbstractC3292y.h(findViewById8, "view.findViewById(R.id.tv_result_dialog_path)");
        TextView textView7 = (TextView) findViewById8;
        this.f4764b = textView7;
        if (textView7 == null) {
            AbstractC3292y.y("tvResult");
            textView7 = null;
        }
        textView7.setTypeface(aVar.u());
        s0(str, str2, j8, z8);
        CheckBox checkBox4 = this.f4768f;
        if (checkBox4 == null) {
            AbstractC3292y.y("cbVersioncode");
            checkBox = null;
        } else {
            checkBox = checkBox4;
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: K4.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                r.A(r.this, str, str2, j8, z8, compoundButton, z9);
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: K4.f
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup3, int i8) {
                r.B(r.this, str, str2, j8, z8, radioGroup3, i8);
            }
        });
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: K4.g
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup3, int i8) {
                r.C(r.this, str, str2, j8, z8, radioGroup3, i8);
            }
        });
        View findViewById9 = inflate.findViewById(J4.e.f4155D1);
        AbstractC3292y.h(findViewById9, "view.findViewById(R.id.tv_ok_dialog_path)");
        TextView textView8 = (TextView) findViewById9;
        textView8.setTypeface(aVar.u());
        textView8.setOnClickListener(new View.OnClickListener() { // from class: K4.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.D(r.this, view);
            }
        });
        View findViewById10 = inflate.findViewById(J4.e.f4286v0);
        AbstractC3292y.h(findViewById10, "view.findViewById(R.id.tv_cancel_dialog_path)");
        TextView textView9 = (TextView) findViewById10;
        textView9.setTypeface(aVar.u());
        textView9.setOnClickListener(new View.OnClickListener() { // from class: K4.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.E(r.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        AlertDialog create = builder.create();
        this.f4763a = create;
        if (create != null && (window = create.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        AlertDialog alertDialog2 = this.f4763a;
        if (alertDialog2 != null) {
            alertDialog2.show();
        }
    }

    public void V() {
    }

    public void W() {
    }

    public void X() {
    }

    public void c0() {
    }

    public void e0() {
    }

    public void f0() {
    }

    public void g0() {
    }

    public void h0() {
    }
}
