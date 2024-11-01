package Q;

import N.AbstractC1348k;
import N.AbstractC1351n;
import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.ConfigurationCompat;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    private static final SimpleArrayMap f8145a = new SimpleArrayMap();

    /* renamed from: b, reason: collision with root package name */
    private static Locale f8146b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return X.e.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String b(Context context, int i8) {
        Resources resources = context.getResources();
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return resources.getString(R.string.ok);
                }
                return resources.getString(L.b.f5206a);
            }
            return resources.getString(L.b.f5215j);
        }
        return resources.getString(L.b.f5209d);
    }

    public static String c(Context context, int i8) {
        Resources resources = context.getResources();
        String a9 = a(context);
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 5) {
                        if (i8 != 7) {
                            if (i8 != 9) {
                                if (i8 != 20) {
                                    switch (i8) {
                                        case 16:
                                            return g(context, "common_google_play_services_api_unavailable_text", a9);
                                        case 17:
                                            return g(context, "common_google_play_services_sign_in_failed_text", a9);
                                        case 18:
                                            return resources.getString(L.b.f5218m, a9);
                                        default:
                                            return resources.getString(AbstractC1351n.f6378a, a9);
                                    }
                                }
                                return g(context, "common_google_play_services_restricted_profile_text", a9);
                            }
                            return resources.getString(L.b.f5214i, a9);
                        }
                        return g(context, "common_google_play_services_network_error_text", a9);
                    }
                    return g(context, "common_google_play_services_invalid_account_text", a9);
                }
                return resources.getString(L.b.f5207b, a9);
            }
            if (V.h.d(context)) {
                return resources.getString(L.b.f5219n);
            }
            return resources.getString(L.b.f5216k, a9);
        }
        return resources.getString(L.b.f5210e, a9);
    }

    public static String d(Context context, int i8) {
        if (i8 != 6 && i8 != 19) {
            return c(context, i8);
        }
        return g(context, "common_google_play_services_resolution_required_text", a(context));
    }

    public static String e(Context context, int i8) {
        String f8;
        if (i8 == 6) {
            f8 = h(context, "common_google_play_services_resolution_required_title");
        } else {
            f8 = f(context, i8);
        }
        if (f8 == null) {
            return context.getResources().getString(L.b.f5213h);
        }
        return f8;
    }

    public static String f(Context context, int i8) {
        Resources resources = context.getResources();
        switch (i8) {
            case 1:
                return resources.getString(L.b.f5211f);
            case 2:
                return resources.getString(L.b.f5217l);
            case 3:
                return resources.getString(L.b.f5208c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i8);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String h8 = h(context, str);
        if (h8 == null) {
            h8 = resources.getString(AbstractC1351n.f6378a);
        }
        return String.format(resources.getConfiguration().locale, h8, str2);
    }

    private static String h(Context context, String str) {
        SimpleArrayMap simpleArrayMap = f8145a;
        synchronized (simpleArrayMap) {
            try {
                Locale locale = ConfigurationCompat.getLocales(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(f8146b)) {
                    simpleArrayMap.clear();
                    f8146b = locale;
                }
                String str2 = (String) simpleArrayMap.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources e8 = AbstractC1348k.e(context);
                if (e8 == null) {
                    return null;
                }
                int identifier = e8.getIdentifier(str, TypedValues.Custom.S_STRING, "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = e8.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                    return null;
                }
                simpleArrayMap.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
