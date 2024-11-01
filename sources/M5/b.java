package m5;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import androidx.core.app.ActivityOptionsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.widget.ImageCardView;
import androidx.leanback.widget.Presenter;
import c5.C2043h;
import c5.r;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.tv.ui.activity.TvAppDetailActivity;
import com.uptodown.tv.ui.activity.TvSearchActivity;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3795t;

/* loaded from: classes5.dex */
public abstract class b extends FragmentActivity {

    /* renamed from: a, reason: collision with root package name */
    private UptodownApp f35029a;

    /* renamed from: b, reason: collision with root package name */
    private C3795t f35030b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f35031c;

    /* loaded from: classes5.dex */
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final r f35032a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f35033b;

        public a(b bVar, r download) {
            AbstractC3292y.i(download, "download");
            this.f35033b = bVar;
            this.f35032a = download;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<Fragment> fragments = this.f35033b.getSupportFragmentManager().getFragments();
            AbstractC3292y.h(fragments, "getFragments(...)");
            if (fragments.size() > 0) {
                Fragment fragment = fragments.get(0);
                String string = this.f35033b.getString(R.string.tv_msg_download_complete, this.f35032a.X());
                AbstractC3292y.h(string, "getString(...)");
                Toast.makeText(fragment.getContext(), string, 1).show();
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getSource() == 8194) {
            return true;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean k() {
        return this.f35031c;
    }

    public final void l(C2043h appInfo, Presenter.ViewHolder itemViewHolder) {
        AbstractC3292y.i(appInfo, "appInfo");
        AbstractC3292y.i(itemViewHolder, "itemViewHolder");
        Intent intent = new Intent(this, (Class<?>) TvAppDetailActivity.class);
        intent.putExtra("appInfo", appInfo);
        if (SettingsPreferences.f30529b.M(this)) {
            View view = itemViewHolder.view;
            if (view instanceof ImageCardView) {
                AbstractC3292y.g(view, "null cannot be cast to non-null type androidx.leanback.widget.ImageCardView");
                startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(this, ((ImageCardView) view).getMainImageView(), "transition_name").toBundle());
                return;
            }
        }
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Application application = getApplication();
        AbstractC3292y.g(application, "null cannot be cast to non-null type com.uptodown.UptodownApp");
        this.f35029a = (UptodownApp) application;
        this.f35030b = new C3795t(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f35031c = false;
        UptodownApp uptodownApp = this.f35029a;
        AbstractC3292y.f(uptodownApp);
        uptodownApp.p1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f35031c = true;
        UptodownApp uptodownApp = this.f35029a;
        AbstractC3292y.f(uptodownApp);
        uptodownApp.q1();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        startActivity(new Intent(this, (Class<?>) TvSearchActivity.class));
        return true;
    }
}
