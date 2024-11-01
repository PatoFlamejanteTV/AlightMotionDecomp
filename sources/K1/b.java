package K1;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class b extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    private a f4564a;

    /* renamed from: b, reason: collision with root package name */
    protected final InterfaceC0080b f4565b;

    /* loaded from: classes4.dex */
    public interface a {
        void a(b bVar);
    }

    /* renamed from: K1.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0080b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0080b interfaceC0080b) {
        this.f4565b = interfaceC0080b;
    }

    public void a(a aVar) {
        this.f4564a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f4564a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void c(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
