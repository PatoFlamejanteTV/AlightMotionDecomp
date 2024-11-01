package S4;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class c extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9429a = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final c a(Context newBase, Locale locale) {
            Context createConfigurationContext;
            AbstractC3292y.i(newBase, "newBase");
            Configuration configuration = newBase.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT >= 24) {
                configuration.setLocale(locale);
                b.a();
                LocaleList a9 = androidx.compose.ui.text.platform.extensions.b.a(new Locale[]{locale});
                LocaleList.setDefault(a9);
                configuration.setLocales(a9);
                createConfigurationContext = newBase.createConfigurationContext(configuration);
                AbstractC3292y.h(createConfigurationContext, "newBase.createConfigurationContext(configuration)");
            } else {
                configuration.setLocale(locale);
                createConfigurationContext = newBase.createConfigurationContext(configuration);
                AbstractC3292y.h(createConfigurationContext, "newBase.createConfigurationContext(configuration)");
            }
            return new c(createConfigurationContext);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public c(Context context) {
        super(context);
    }
}
