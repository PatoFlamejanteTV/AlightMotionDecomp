package n5;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.leanback.app.BrowseSupportFragment;
import androidx.leanback.app.RowsSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.HeaderItem;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;
import c5.Q;
import com.uptodown.R;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.tv.ui.activity.TvMyAppsActivity;
import com.uptodown.tv.ui.activity.TvMyDownloadsActivity;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3795t;

/* renamed from: n5.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3433t extends RowsSupportFragment {

    /* renamed from: a, reason: collision with root package name */
    private ArrayObjectAdapter f35608a;

    public C3433t() {
        ListRowPresenter listRowPresenter = new ListRowPresenter(4);
        listRowPresenter.setShadowEnabled(false);
        this.f35608a = new ArrayObjectAdapter(listRowPresenter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C3433t c3433t, Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
        if (obj instanceof j5.b) {
            int b9 = ((j5.b) obj).b();
            if (b9 != 0) {
                if (b9 != 1) {
                    if (b9 != 2) {
                        if (b9 != 3) {
                            if (b9 == 4) {
                                c3433t.startActivity(new Intent(c3433t.getContext(), (Class<?>) SettingsPreferences.class));
                                return;
                            }
                            return;
                        }
                        c3433t.startActivity(new Intent(c3433t.getContext(), (Class<?>) TvMyDownloadsActivity.class));
                        return;
                    }
                    Intent intent = new Intent(c3433t.getContext(), (Class<?>) TvMyAppsActivity.class);
                    intent.putExtra("rollback", true);
                    c3433t.startActivity(intent);
                    return;
                }
                c3433t.startActivity(new Intent(c3433t.getContext(), (Class<?>) TvMyAppsActivity.class));
                return;
            }
            Intent intent2 = new Intent(c3433t.getContext(), (Class<?>) TvMyAppsActivity.class);
            intent2.putExtra("updates", true);
            c3433t.startActivity(intent2);
        }
    }

    @Override // androidx.leanback.app.RowsSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String str;
        BrowseSupportFragment.FragmentHost fragmentHost;
        super.onCreate(bundle);
        if (getContext() != null) {
            C3795t c3795t = new C3795t(getContext());
            String simpleName = C3433t.class.getSimpleName();
            AbstractC3292y.h(simpleName, "getSimpleName(...)");
            c3795t.g(simpleName);
            HeaderItem headerItem = new HeaderItem(getString(R.string.manage_apps));
            Q.b bVar = c5.Q.f15674l;
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            int a9 = bVar.a(requireContext);
            if (a9 > 0) {
                str = " (" + a9 + ')';
            } else {
                str = "";
            }
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new l5.l());
            j5.b bVar2 = new j5.b();
            bVar2.e(0);
            bVar2.f(getString(R.string.updates) + str);
            bVar2.d(R.drawable.vector_tv_updates);
            arrayObjectAdapter.add(bVar2);
            j5.b bVar3 = new j5.b();
            bVar3.e(1);
            bVar3.f(getString(R.string.mis_apps_title));
            bVar3.d(R.drawable.vector_tv_installed);
            arrayObjectAdapter.add(bVar3);
            j5.b bVar4 = new j5.b();
            bVar4.e(2);
            bVar4.f(getString(R.string.rollback_title));
            bVar4.d(R.drawable.vector_tv_rollback);
            arrayObjectAdapter.add(bVar4);
            j5.b bVar5 = new j5.b();
            bVar5.e(3);
            bVar5.f(getString(R.string.downloads_title));
            bVar5.d(R.drawable.vector_tv_downloads);
            arrayObjectAdapter.add(bVar5);
            j5.b bVar6 = new j5.b();
            bVar6.e(4);
            bVar6.f(getString(R.string.settings));
            bVar6.d(R.drawable.vector_tv_settings);
            arrayObjectAdapter.add(bVar6);
            this.f35608a.add(new ListRow(headerItem, arrayObjectAdapter));
            setAdapter(this.f35608a);
            BrowseSupportFragment.MainFragmentAdapter mainFragmentAdapter = getMainFragmentAdapter();
            if (mainFragmentAdapter != null && (fragmentHost = mainFragmentAdapter.getFragmentHost()) != null) {
                fragmentHost.notifyDataReady(getMainFragmentAdapter());
            }
        }
    }

    @Override // androidx.leanback.app.RowsSupportFragment, androidx.leanback.app.BaseRowSupportFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC3292y.i(view, "view");
        super.onViewCreated(view, bundle);
        setOnItemViewClickedListener(new OnItemViewClickedListener() { // from class: n5.s
            @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
            public final void onItemClicked(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
                C3433t.i(C3433t.this, viewHolder, obj, viewHolder2, row);
            }
        });
    }
}
