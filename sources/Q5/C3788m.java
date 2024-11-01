package q5;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import c5.Q;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.CustomWebView;
import com.uptodown.activities.GdprPrivacySettings;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: q5.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3788m {

    /* renamed from: a, reason: collision with root package name */
    public static final a f37279a = new a(null);

    /* renamed from: q5.m$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: q5.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0829a extends CharacterStyle implements UpdateAppearance {

            /* renamed from: a, reason: collision with root package name */
            private final Shader f37280a;

            /* renamed from: b, reason: collision with root package name */
            private final float f37281b;

            public C0829a(Shader shader, float f8) {
                AbstractC3292y.i(shader, "shader");
                this.f37280a = shader;
                this.f37281b = f8;
            }

            @Override // android.text.style.CharacterStyle
            public void updateDrawState(TextPaint tp) {
                AbstractC3292y.i(tp, "tp");
                tp.setShader(this.f37280a);
                tp.setTextSize(this.f37281b);
                tp.setColor(tp.linkColor);
            }
        }

        private a() {
        }

        public final void a(ImageView imageView) {
            AbstractC3292y.i(imageView, "<this>");
            int dimension = (int) imageView.getContext().getResources().getDimension(R.dimen.border_radius_xs);
            imageView.setBackground(ContextCompat.getDrawable(imageView.getContext(), R.drawable.shape_stroke_review_avatar_turbo));
            imageView.setPadding(dimension, dimension, dimension, dimension);
        }

        public final void b(ImageView imageView) {
            AbstractC3292y.i(imageView, "<this>");
            int dimension = (int) imageView.getContext().getResources().getDimension(R.dimen.border_radius_xs);
            imageView.setBackground(ContextCompat.getDrawable(imageView.getContext(), R.drawable.shape_stroke_review_small_avatar_turbo));
            imageView.setPadding(dimension, dimension, dimension, dimension);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Activity activity, DialogInterface dialogInterface, int i8) {
        dialogInterface.dismiss();
        if (activity instanceof AppDetailActivity) {
            ((AppDetailActivity) activity).p3().launch(new Intent(activity, (Class<?>) GdprPrivacySettings.class));
        } else if (activity instanceof MainActivity) {
            ((MainActivity) activity).L5().launch(new Intent(activity, (Class<?>) GdprPrivacySettings.class));
        } else {
            activity.startActivity(new Intent(activity, (Class<?>) GdprPrivacySettings.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(DialogInterface dialogInterface, int i8) {
        AbstractC3292y.i(dialogInterface, "dialogInterface");
        dialogInterface.dismiss();
    }

    public static /* synthetic */ void r(C3788m c3788m, Activity activity, String str, String str2, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str2 = null;
        }
        c3788m.q(activity, str, str2);
    }

    public final String c(String url) {
        String str;
        AbstractC3292y.i(url, "url");
        if (l6.n.G(url, ".uptodown.com/", false, 2, null)) {
            if (l6.n.G(url, "?", false, 2, null)) {
                str = url + '&';
            } else {
                str = url + '?';
            }
            return str + "userAgent=uptodownandroid";
        }
        return url;
    }

    public final SpannableString d(String originalString, String subString, Context context) {
        AbstractC3292y.i(originalString, "originalString");
        AbstractC3292y.i(subString, "subString");
        AbstractC3292y.i(context, "context");
        SpannableString spannableString = new SpannableString(originalString);
        int R8 = l6.n.R(originalString, subString, 0, false, 6, null);
        int length = subString.length() + R8;
        if (R8 != -1) {
            float dimension = context.getResources().getDimension(R.dimen.text_size_m);
            Typeface u8 = J4.j.f4395g.u();
            AbstractC3292y.f(u8);
            spannableString.setSpan(new defpackage.b(dimension, u8, ContextCompat.getColor(context, R.color.text_primary)), R8, length, 33);
        }
        return spannableString;
    }

    public final File e(File fileWithXapkExtension, Context context) {
        PackageInfo packageInfo;
        AbstractC3292y.i(fileWithXapkExtension, "fileWithXapkExtension");
        AbstractC3292y.i(context, "context");
        File file = null;
        if (!new S4.x().f(fileWithXapkExtension)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                AbstractC3292y.f(packageManager);
                String absolutePath = fileWithXapkExtension.getAbsolutePath();
                AbstractC3292y.h(absolutePath, "getAbsolutePath(...)");
                packageInfo = S4.r.c(packageManager, absolutePath, 1);
            } catch (Exception unused) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                String parent = fileWithXapkExtension.getParent();
                StringBuilder sb = new StringBuilder();
                String name = fileWithXapkExtension.getName();
                AbstractC3292y.h(name, "getName(...)");
                String substring = name.substring(0, fileWithXapkExtension.getName().length() - 5);
                AbstractC3292y.h(substring, "substring(...)");
                sb.append(substring);
                sb.append(".apk");
                File file2 = new File(parent, sb.toString());
                boolean renameTo = fileWithXapkExtension.renameTo(file2);
                if (renameTo) {
                    file = file2;
                }
                Bundle bundle = new Bundle();
                bundle.putString("type", String.valueOf(renameTo));
                bundle.putString("packagename", packageInfo.packageName);
                String e8 = S4.d.f9430a.e(fileWithXapkExtension.getAbsolutePath());
                if (e8 != null) {
                    bundle.putString("filehash", e8);
                }
                new C3795t(context).e("rename_apk", bundle);
            }
        }
        return file;
    }

    public final File f(File fileWithApkExtension, Context context) {
        AbstractC3292y.i(fileWithApkExtension, "fileWithApkExtension");
        AbstractC3292y.i(context, "context");
        File file = null;
        if (new S4.x().f(fileWithApkExtension)) {
            String parent = fileWithApkExtension.getParent();
            StringBuilder sb = new StringBuilder();
            String name = fileWithApkExtension.getName();
            AbstractC3292y.h(name, "getName(...)");
            String substring = name.substring(0, fileWithApkExtension.getName().length() - 4);
            AbstractC3292y.h(substring, "substring(...)");
            sb.append(substring);
            sb.append(".xapk");
            File file2 = new File(parent, sb.toString());
            boolean renameTo = fileWithApkExtension.renameTo(file2);
            if (renameTo) {
                file = file2;
            }
            Bundle bundle = new Bundle();
            bundle.putString("type", String.valueOf(renameTo));
            String e8 = S4.d.f9430a.e(fileWithApkExtension.getAbsolutePath());
            if (e8 != null) {
                bundle.putString("filehash", e8);
            }
            new C3795t(context).e("rename_xapk", bundle);
        }
        return file;
    }

    public final AlertDialog g(AlertDialog alertDialog, final Activity activity) {
        AbstractC3292y.i(activity, "activity");
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        if (aVar.V(activity) && !aVar.j0(activity)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setMessage(activity.getString(R.string.tracking_disabled_warning_gdpr));
            builder.setPositiveButton(R.string.gdpr_set_up, new DialogInterface.OnClickListener() { // from class: q5.k
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    C3788m.h(activity, dialogInterface, i8);
                }
            });
            builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: q5.l
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    C3788m.i(dialogInterface, i8);
                }
            });
            builder.setCancelable(true);
            AlertDialog create = builder.create();
            if (!activity.isFinishing()) {
                create.show();
            }
            return create;
        }
        return null;
    }

    public final void j(Context context, String packagenameInstalled, String packageNameDeepLink) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(packagenameInstalled, "packagenameInstalled");
        AbstractC3292y.i(packageNameDeepLink, "packageNameDeepLink");
        try {
            if (l6.n.s(packagenameInstalled, packageNameDeepLink, true)) {
                Iterator it = new C3794s().j(context).iterator();
                AbstractC3292y.h(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC3292y.h(next, "next(...)");
                    File file = (File) next;
                    C3794s c3794s = new C3794s();
                    String name = file.getName();
                    AbstractC3292y.h(name, "getName(...)");
                    String i8 = c3794s.i(name);
                    if (i8 != null && l6.n.s(i8, packageNameDeepLink, true)) {
                        String absolutePath = file.getAbsolutePath();
                        if (file.delete()) {
                            C3791p a9 = C3791p.f37286s.a(context);
                            a9.a();
                            AbstractC3292y.f(absolutePath);
                            a9.v(absolutePath);
                            a9.i();
                            return;
                        }
                        return;
                    }
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final ArrayList k(Context context) {
        AbstractC3292y.i(context, "context");
        ArrayList arrayList = new ArrayList();
        C3791p a9 = C3791p.f37286s.a(context);
        a9.a();
        Iterator it = a9.c0().iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            c5.r rVar = (c5.r) next;
            if (rVar.h0()) {
                arrayList.add(rVar);
            }
        }
        a9.i();
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:            if (l6.n.B(r2, "https://play.google.com", false, 2, null) != false) goto L11;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String l(android.net.Uri r12) {
        /*
            r11 = this;
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.AbstractC3292y.i(r12, r0)
            java.lang.String r0 = r12.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.AbstractC3292y.h(r0, r1)
            java.lang.String r2 = "utd://"
            r7 = 0
            r8 = 2
            r9 = 0
            boolean r2 = l6.n.B(r0, r2, r7, r8, r9)
            java.lang.String r10 = "substring(...)"
            if (r2 == 0) goto L25
            r12 = 6
            java.lang.String r12 = r0.substring(r12)
            kotlin.jvm.internal.AbstractC3292y.h(r12, r10)
            goto L95
        L25:
            java.lang.String r2 = r12.toString()
            kotlin.jvm.internal.AbstractC3292y.h(r2, r1)
            java.lang.String r3 = "market://"
            boolean r2 = l6.n.B(r2, r3, r7, r8, r9)
            if (r2 != 0) goto L52
            java.lang.String r2 = r12.toString()
            kotlin.jvm.internal.AbstractC3292y.h(r2, r1)
            java.lang.String r3 = "http://play.google.com"
            boolean r2 = l6.n.B(r2, r3, r7, r8, r9)
            if (r2 != 0) goto L52
            java.lang.String r2 = r12.toString()
            kotlin.jvm.internal.AbstractC3292y.h(r2, r1)
            java.lang.String r3 = "https://play.google.com"
            boolean r2 = l6.n.B(r2, r3, r7, r8, r9)
            if (r2 == 0) goto L91
        L52:
            java.lang.String r2 = r12.toString()
            kotlin.jvm.internal.AbstractC3292y.h(r2, r1)
            java.lang.String r3 = "details?id="
            boolean r1 = l6.n.G(r2, r3, r7, r8, r9)
            if (r1 == 0) goto L91
            r5 = 6
            r6 = 0
            r12 = 0
            r4 = 0
            r1 = r0
            r2 = r3
            r3 = r12
            int r12 = l6.n.R(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + 11
            java.lang.String r1 = "&"
            boolean r1 = l6.n.G(r0, r1, r7, r8, r9)
            if (r1 == 0) goto L89
            r5 = 6
            r6 = 0
            java.lang.String r2 = "&"
            r3 = 0
            r4 = 0
            r1 = r0
            int r1 = l6.n.R(r1, r2, r3, r4, r5, r6)
            java.lang.String r12 = r0.substring(r12, r1)
            kotlin.jvm.internal.AbstractC3292y.h(r12, r10)
            goto L95
        L89:
            java.lang.String r12 = r0.substring(r12)
            kotlin.jvm.internal.AbstractC3292y.h(r12, r10)
            goto L95
        L91:
            java.lang.String r12 = r12.toString()
        L95:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.C3788m.l(android.net.Uri):java.lang.String");
    }

    public final String m(long j8) {
        if (j8 <= 0) {
            return null;
        }
        return new SimpleDateFormat("dd MMM yyyy HH:mm", Locale.getDefault()).format(new Date(j8));
    }

    public final File n(Context context) {
        String str;
        AbstractC3292y.i(context, "context");
        File file = null;
        try {
            C3791p a9 = C3791p.f37286s.a(context);
            a9.a();
            String packageName = context.getPackageName();
            AbstractC3292y.h(packageName, "getPackageName(...)");
            Q s02 = a9.s0(packageName);
            if (s02 != null) {
                str = s02.l();
            } else {
                str = null;
            }
            if (str != null && s02.u() == 100) {
                File g8 = new C3794s().g(context);
                String l8 = s02.l();
                AbstractC3292y.f(l8);
                File file2 = new File(g8, l8);
                try {
                    if (file2.exists()) {
                        String name = file2.getName();
                        AbstractC3292y.h(name, "getName(...)");
                        if (l6.n.r(name, ".apk", false, 2, null)) {
                            PackageManager packageManager = context.getPackageManager();
                            AbstractC3292y.h(packageManager, "getPackageManager(...)");
                            String absolutePath = file2.getAbsolutePath();
                            AbstractC3292y.h(absolutePath, "getAbsolutePath(...)");
                            PackageInfo c8 = S4.r.c(packageManager, absolutePath, 1);
                            if (c8 != null) {
                                if (633 < new S4.f().m(c8)) {
                                    if (!l6.n.s(c8.packageName, context.getPackageName(), true)) {
                                    }
                                } else {
                                    String packageName2 = context.getPackageName();
                                    AbstractC3292y.h(packageName2, "getPackageName(...)");
                                    a9.M(packageName2);
                                    file2.delete();
                                }
                            }
                        }
                    }
                    file = file2;
                } catch (Exception e8) {
                    e = e8;
                    file = file2;
                    e.printStackTrace();
                    return file;
                }
            }
            a9.i();
        } catch (Exception e9) {
            e = e9;
        }
        return file;
    }

    public final boolean o(Context context) {
        if (context == null || (context.getResources().getConfiguration().uiMode & 48) != 16) {
            return false;
        }
        return true;
    }

    public final boolean p(View view) {
        AccessibilityNodeInfo obtain;
        boolean z8 = false;
        if (view != null && view.isShown()) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            z8 = rect.intersect(new Rect(0, 0, Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels));
        }
        if (z8) {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 33) {
                obtain = AbstractC3785j.a();
            } else {
                obtain = AccessibilityNodeInfo.obtain();
            }
            AbstractC3292y.f(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            boolean isVisibleToUser = obtain.isVisibleToUser();
            if (i8 < 33) {
                obtain.recycle();
            }
            return isVisibleToUser;
        }
        return z8;
    }

    public final void q(Activity activity, String url, String str) {
        AbstractC3292y.i(activity, "activity");
        AbstractC3292y.i(url, "url");
        String c8 = c(url);
        try {
            new CustomTabsIntent.Builder().build().launchUrl(activity, Uri.parse(c8));
        } catch (Exception unused) {
            Intent intent = new Intent(activity, (Class<?>) CustomWebView.class);
            if (str != null) {
                intent.putExtra(CampaignEx.JSON_KEY_TITLE, str);
            }
            intent.putExtra("url", c8);
            activity.startActivity(intent, UptodownApp.f29249C.a(activity));
        }
    }

    public final boolean s(String str, String str2) {
        if (str == null && str2 != null) {
            return false;
        }
        if (str != null && str2 == null) {
            return false;
        }
        return l6.n.s(str, str2, true);
    }

    public final Uri t(File file, Context context) {
        AbstractC3292y.i(context, "context");
        if (Build.VERSION.SDK_INT >= 24) {
            String str = context.getPackageName() + ".provider";
            AbstractC3292y.f(file);
            Uri uriForFile = FileProvider.getUriForFile(context, str, file);
            AbstractC3292y.f(uriForFile);
            return uriForFile;
        }
        Uri fromFile = Uri.fromFile(file);
        AbstractC3292y.f(fromFile);
        return fromFile;
    }
}
