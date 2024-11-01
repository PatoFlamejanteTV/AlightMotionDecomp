package H4;

import android.content.Context;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class g extends AppCompatActivity {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (context != null) {
            context = J4.j.f4395g.a(context);
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.fade_in, R.anim.right_to_left_out);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        AbstractC3292y.i(item, "item");
        if (item.getItemId() == 16908332) {
            getOnBackPressedDispatcher().onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
