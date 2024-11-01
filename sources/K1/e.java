package K1;

import C1.n;
import K1.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class e extends a {
    public e(b.InterfaceC0080b interfaceC0080b, HashSet hashSet, JSONObject jSONObject, long j8) {
        super(interfaceC0080b, hashSet, jSONObject, j8);
    }

    private void e(String str) {
        F1.c e8 = F1.c.e();
        if (e8 != null) {
            for (n nVar : e8.c()) {
                if (this.f4561c.contains(nVar.v())) {
                    nVar.w().j(str, this.f4563e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // K1.b, android.os.AsyncTask
    /* renamed from: b */
    public void onPostExecute(String str) {
        e(str);
        super.onPostExecute(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f4562d.toString();
    }
}
