package q5;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import c5.K;
import c5.T;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.activities.LoginActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* renamed from: q5.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3790o extends AbstractAccountAuthenticator {

    /* renamed from: a, reason: collision with root package name */
    private final Context f37285a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3790o(Context mContext) {
        super(mContext);
        AbstractC3292y.i(mContext, "mContext");
        this.f37285a = mContext;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        Intent intent = new Intent(this.f37285a, (Class<?>) LoginActivity.class);
        intent.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("intent", intent);
        return bundle2;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle confirmCredentials(AccountAuthenticatorResponse response, Account account, Bundle options) {
        AbstractC3292y.i(response, "response");
        AbstractC3292y.i(account, "account");
        AbstractC3292y.i(options, "options");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle editProperties(AccountAuthenticatorResponse response, String accountType) {
        AbstractC3292y.i(response, "response");
        AbstractC3292y.i(accountType, "accountType");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse response, Account account) {
        AbstractC3292y.i(response, "response");
        AbstractC3292y.i(account, "account");
        Bundle accountRemovalAllowed = super.getAccountRemovalAllowed(response, account);
        if (accountRemovalAllowed != null && accountRemovalAllowed.containsKey("booleanResult") && !accountRemovalAllowed.containsKey("intent") && accountRemovalAllowed.getBoolean("booleanResult")) {
            T.f15689k.b(this.f37285a);
        }
        AbstractC3292y.f(accountRemovalAllowed);
        return accountRemovalAllowed;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle getAuthToken(AccountAuthenticatorResponse response, Account account, String authTokenType, Bundle options) {
        String password;
        AbstractC3292y.i(response, "response");
        AbstractC3292y.i(account, "account");
        AbstractC3292y.i(authTokenType, "authTokenType");
        AbstractC3292y.i(options, "options");
        AccountManager accountManager = AccountManager.get(this.f37285a);
        String peekAuthToken = accountManager.peekAuthToken(account, authTokenType);
        if (TextUtils.isEmpty(peekAuthToken) && (password = accountManager.getPassword(account)) != null) {
            String str = account.name;
            C3775H c3775h = new C3775H(this.f37285a);
            AbstractC3292y.f(str);
            K B02 = c3775h.B0(str, password);
            try {
                if (B02.d() != null) {
                    String d8 = B02.d();
                    AbstractC3292y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = B02.d();
                        AbstractC3292y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            T t8 = new T();
                            t8.l(this.f37285a, jSONObject2);
                            if (t8.getId() != null) {
                                String id = t8.getId();
                                AbstractC3292y.f(id);
                                if (id.length() > 0) {
                                    t8.I(this.f37285a);
                                }
                            }
                            String I8 = SettingsPreferences.f30529b.I(this.f37285a);
                            if (I8 == null || I8.length() == 0) {
                                T.f15689k.b(this.f37285a);
                            }
                        }
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(peekAuthToken)) {
            Bundle bundle = new Bundle();
            bundle.putString("authAccount", account.name);
            bundle.putString("accountType", account.type);
            bundle.putString("authtoken", peekAuthToken);
            return bundle;
        }
        Intent intent = new Intent(this.f37285a, (Class<?>) LoginActivity.class);
        intent.putExtra("accountAuthenticatorResponse", response);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("intent", intent);
        return bundle2;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public String getAuthTokenLabel(String authTokenType) {
        AbstractC3292y.i(authTokenType, "authTokenType");
        return "Uptodown login";
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle hasFeatures(AccountAuthenticatorResponse response, Account account, String[] features) {
        AbstractC3292y.i(response, "response");
        AbstractC3292y.i(account, "account");
        AbstractC3292y.i(features, "features");
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle updateCredentials(AccountAuthenticatorResponse response, Account account, String authTokenType, Bundle options) {
        AbstractC3292y.i(response, "response");
        AbstractC3292y.i(account, "account");
        AbstractC3292y.i(authTokenType, "authTokenType");
        AbstractC3292y.i(options, "options");
        return null;
    }
}
